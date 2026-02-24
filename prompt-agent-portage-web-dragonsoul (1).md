# Prompt — Portage Web de Dragon Soul RPG (sans réécriture)

## Contexte du projet

Tu travailles sur le projet **Dragon Soul RPG**, un jeu mobile Android (APK) développé par PerBlue (`com.perblue.dragonsoul` v2.22.0). Le code source complet décompilé est disponible dans le repo GitHub :

**https://github.com/aciderix/Dragonsoulgame-rpg-server-/tree/claude/ccr-e72f1478-aWJSI**

Le repo contient :
- `jeu decompilé/` → Le code Java décompilé du client Android, les assets, les bibliothèques natives (.so), et le manifeste Android
- `Dragonsoul-server v2/` → Le serveur Python du jeu (protocole TCP binaire custom)
- `client jar/` → Un client Java headless pour tester le serveur

### Architecture technique identifiée

| Composant | Technologie |
|---|---|
| **Framework de jeu** | **libGDX** (confirmé par `libgdx.so`, `libgdx-opensl.so` dans `lib/armeabi-v7a/`) |
| **Rendu graphique** | OpenGL ES 2.0 via libGDX (sprites 2D, shaders custom, particules) |
| **Animations** | **Spine** (squelettes, atlas, `SkeletonDataLoader`) |
| **Code métier** | Java — packages `com.perblue.rpg.*` (combat, héros, guildes, inventaire, chat, PvP…) |
| **Réseau client** | Protocole TCP binaire custom (messages sérialisés, handlers dédiés) |
| **Serveur** | Python avec protocole TCP binaire, base de données pour les comptes/progression |
| **SDKs tiers** | Firebase, Facebook SDK, Tapjoy, HelpShift (analytics, social, pubs) |

---

## Ta mission

Explorer et planifier le **portage du jeu en version web jouable dans un navigateur**, en conservant le code existant tel quel autant que possible, **sans réécriture majeure**.

---

## La stratégie recommandée : libGDX Backend HTML5 (GWT)

libGDX est un framework cross-platform qui inclut **nativement** un backend HTML5. Il utilise **GWT (Google Web Toolkit)** pour transpiler le code Java en JavaScript, et le rendu OpenGL ES est automatiquement traduit en **WebGL**. Cela signifie que le jeu peut tourner dans un navigateur sans réécrire la logique, le rendu, ni les animations.

### Ce que tu dois faire — Plan en 5 étapes

#### Étape 1 — Restructurer en projet Gradle libGDX

Le code décompilé doit être réorganisé dans la structure standard d'un projet libGDX multi-plateforme :

```
dragonsoul/
├── build.gradle              # Config Gradle racine
├── settings.gradle
├── core/                     # Module principal (toute la logique du jeu)
│   └── src/com/perblue/rpg/  # ← le code décompilé va ici
├── android/                  # Module Android (launcher existant)
│   └── src/
├── html/                     # ← NOUVEAU : module web
│   ├── src/
│   │   └── HtmlLauncher.java
│   └── webapp/
│       └── index.html
└── assets/                   # Textures, atlas Spine, sons, données
```

Le module `core` contient tout le code partagé. Le module `html` ne contient qu'un petit launcher :

```java
public class HtmlLauncher extends GwtApplication {
    @Override
    public GwtApplicationConfiguration getConfig() {
        return new GwtApplicationConfiguration(960, 540);
    }
    @Override
    public ApplicationListener createApplicationListener() {
        return new DragonSoulGame(); // Identifier la classe principale dans le code décompilé
    }
}
```

**Action** : Explore le code dans `com/perblue/rpg/` pour identifier la classe qui implémente `ApplicationListener` ou `Game` de libGDX — c'est le point d'entrée du jeu.

#### Étape 2 — Nettoyer les incompatibilités GWT

GWT transpile du Java en JS mais ne supporte **pas tout Java**. Tu dois identifier et adapter :

| Ce qui ne marche pas en GWT | Remplacement |
|---|---|
| `java.io.File` | `Gdx.files.internal()` (déjà utilisé par libGDX normalement) |
| Threads (`new Thread()`) | `Gdx.app.postRunnable()` ou `Timer` |
| Reflection (`Class.forName()`) | Enregistrement explicite des classes |
| `java.net.Socket` (TCP) | `WebSocket` (voir étape 3) |
| SDKs natifs Android (Firebase, Facebook, Tapjoy, HelpShift) | **Supprimer ou stubber** — ces SDKs ne sont pas nécessaires pour le jeu lui-même |

**Action** : Scanne le code pour lister toutes les utilisations de ces APIs. Les SDKs tiers (Firebase, Tapjoy, Facebook, HelpShift) dans `com/perblue/rpg/` doivent être isolés derrière des interfaces, avec des implémentations vides pour le web.

#### Étape 3 — Adapter le réseau (TCP → WebSocket)

C'est le changement le plus important. Les navigateurs ne supportent pas TCP, seulement WebSocket et HTTP.

**Option A — Proxy transparent (le plus rapide, zéro modif serveur) :**

Crée un petit serveur proxy qui convertit WebSocket ↔ TCP :

```python
import asyncio
import websockets

async def proxy(ws):
    reader, writer = await asyncio.open_connection('127.0.0.1', 9000)  # port du serveur Dragon Soul
    
    async def ws_to_tcp():
        async for msg in ws:
            writer.write(msg if isinstance(msg, bytes) else msg.encode())
            await writer.drain()
    
    async def tcp_to_ws():
        while True:
            data = await reader.read(4096)
            if not data:
                break
            await ws.send(data)
    
    await asyncio.gather(ws_to_tcp(), tcp_to_ws())

async def main():
    async with websockets.serve(proxy, '0.0.0.0', 8080):
        await asyncio.Future()

asyncio.run(main())
```

**Option B — Support WebSocket natif dans le serveur Python :**

Modifier le serveur dans `Dragonsoul-server v2/` pour accepter aussi les connexions WebSocket en parallèle des connexions TCP.

**Côté client Java (module html)** : Remplacer les appels `Socket`/`InputStream`/`OutputStream` par l'API WebSocket de GWT :

```java
// Dans le module html, créer une implémentation web du client réseau
WebSocket ws = new WebSocket("wss://ton-serveur:8080");
ws.setListener(new WebSocketListener() {
    @Override
    public void onMessage(String msg) { /* traiter le message */ }
});
```

**Action** : Explore les classes réseau dans `com/perblue/rpg/` (probablement dans un package `net`, `network`, `protocol` ou `connection`) pour comprendre le protocole binaire utilisé et identifier où abstraire la couche transport.

#### Étape 4 — Préparer les assets pour le web

- Tous les assets (textures, atlas Spine, fichiers `.tab`, sons) doivent être servis par HTTP
- GWT utilise un mécanisme de **preloading** : les assets sont listés dans un fichier et téléchargés avant le démarrage du jeu
- Les fichiers audio `.ogg` doivent possiblement être convertis en `.mp3` (compatibilité navigateur)
- Le fichier `content.1.tab` (données tabulées du jeu) doit être inclus dans les assets web

#### Étape 5 — Builder et déployer

```bash
./gradlew html:dist
```

Cela produit un dossier `html/build/dist/` contenant :
- `index.html`
- Les fichiers JS compilés par GWT
- Les assets

Ce dossier est déployable sur **n'importe quel serveur web** (Nginx, Apache, GitHub Pages, Netlify, etc.)

---

## Ce que le portage web t'offre pour tester le serveur

Aujourd'hui, tester le serveur Dragon Soul est compliqué : le seul client est un **APK Android**, inutilisable par un agent IA. Le `client jar/` du repo est un client headless limité. Un **client web change complètement la donne** :

### 🤖 Testabilité par un agent IA

- **Automatisation navigateur** — Avec un client web, tu peux utiliser **Playwright, Puppeteer ou Selenium** pour interagir avec le jeu de manière programmatique. Tu peux cliquer, naviguer dans les menus, lancer des combats, ouvrir l'inventaire — tout ça de façon scriptée et reproductible.
- **Inspection du trafic réseau** — Les DevTools du navigateur (ou l'interception via le proxy WebSocket) te permettent de **capturer, lire et rejouer** tous les messages échangés entre le client et le serveur. Tu peux ainsi comprendre le protocole binaire en observant les échanges réels.
- **Tests end-to-end automatisés** — Tu peux écrire des scénarios complets : créer un compte → se connecter → équiper un héros → lancer un combat → vérifier le résultat côté serveur. Tout ça dans un pipeline automatisé.
- **Pas besoin d'émulateur Android** — Plus besoin d'ADB, de Genymotion ou d'un appareil physique. Un simple navigateur headless (Chromium) suffit.

### 🔍 Compréhension du protocole serveur

- **Reverse-engineering assisté** — En jouant dans le navigateur et en loggant les WebSocket frames, tu peux **mapper chaque action du jeu à son message réseau**. Cela te permet de documenter le protocole sans lire tout le code.
- **Proxy instrumenté** — Le proxy WebSocket ↔ TCP est un point d'observation idéal. Tu peux y ajouter du logging, du filtrage, ou même de l'injection de messages pour tester les réactions du serveur.
- **Comparaison client/serveur** — Tu peux observer l'état du jeu côté navigateur (via le DOM/Canvas/JS) et le comparer à l'état côté serveur (via la DB ou les logs Python) pour détecter des incohérences.

### 🧪 Scénarios de test rendus possibles

| Scénario | Comment le client web aide |
|---|---|
| **Test de charge** | Ouvre N onglets navigateur ou N instances Playwright → N connexions simultanées au serveur |
| **Test de combat PvP** | Deux instances navigateur s'affrontent, tu observes les deux côtés |
| **Test de persistance** | Joue → ferme le navigateur → rouvre → vérifie que la progression est sauvée |
| **Fuzzing du protocole** | Intercepte les messages WebSocket et envoie des variantes malformées pour tester la robustesse |
| **Test de régression** | Après chaque modif serveur, rejoue un scénario enregistré et compare les résultats |
| **Exploration des features** | Navigue dans tous les menus du jeu visuellement pour découvrir les fonctionnalités |

### 🛠️ Workflow de développement amélioré

- **Boucle de feedback rapide** — Modifie le serveur Python → recharge le navigateur → teste immédiatement
- **Screenshots et vidéos** — Playwright peut capturer des screenshots/vidéos des sessions de test pour documentation
- **État observable** — La console JS du navigateur expose l'état interne du client libGDX, utile pour le debug
- **CI/CD possible** — Les tests navigateur s'intègrent facilement dans GitHub Actions ou tout autre pipeline

---

## Par où commencer — Actions immédiates

1. **Clone le repo** et explore la structure du code décompilé
2. **Identifie la classe principale** du jeu (celle qui étend `Game` ou `ApplicationListener` de libGDX)
3. **Liste les dépendances problématiques** (SDKs Android, appels réseau TCP, APIs Java non-GWT)
4. **Crée la structure Gradle** avec les modules `core` et `html`
5. **Tente un premier build GWT** même partiel pour voir ce qui compile et ce qui bloque

Le premier objectif concret : **afficher l'écran titre du jeu dans un navigateur**. Une fois que ça marche, le reste est de l'itération.

---

*Bonne exploration ! 🐉✨*
