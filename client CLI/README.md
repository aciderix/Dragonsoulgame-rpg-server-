# DragonSoul Headless CLI Engine

Moteur headless du jeu DragonSoul (Android), converti en application Java CLI
exécutable sous Linux, sans dépendance Android.

## Fichiers

| Fichier | Description |
|---------|-------------|
| `dragonsoul-headless.jar` | Fat JAR autonome (tout-en-un) |
| `game-bytecode.jar` | 15,444 classes de jeu (bytecode dex2jar) |
| `dragonsoul-cli.jar` | CLI wrapper (Main + GameEngine) |
| `runtime-stubs.jar` | Stubs Android/commons-logging |
| `src/cli/Main.java` | Point d'entrée CLI |
| `src/cli/GameEngine.java` | Moteur de jeu headless |
| `src/stubs/` | Stubs pour dépendances Android |
| `assets/` | 902 fichiers d'assets du jeu |
| `build.sh` | Script de compilation |
| `run.sh` | Script de lancement |

## Prérequis

- Java 11+ (JDK pour compiler, JRE pour exécuter)

## Compilation

```bash
./build.sh
```

## Exécution

### Mode interactif
```bash
java -jar dragonsoul-headless.jar
# ou
./run.sh
```

### Mode pipe (pour IA externe)
```bash
echo -e "boot\nstatus\nunits\nquit" | java -jar dragonsoul-headless.jar --pipe --seed 42
```

### Mode batch
```bash
java -jar dragonsoul-headless.jar --batch commands.txt --seed 42
```

### Auto-boot
```bash
java -jar dragonsoul-headless.jar --autoboot --seed 42
```

## Commandes disponibles

### Séquence de démarrage
| Commande | Description |
|----------|-------------|
| `boot` | Initialise le moteur, charge les enums |
| `connect` | Simule la connexion au serveur |
| `handshake` | Simule le handshake protocolaire |
| `load_assets` | Charge les assets du jeu |

### Données de jeu
| Commande | Description |
|----------|-------------|
| `units [filtre]` | Liste les types d'unités |
| `unit <nom>` | Détails d'une unité |
| `rarities` | Niveaux de rareté |
| `commands` | Types de commandes |
| `resources` | Types de ressources |
| `items [filtre]` | Types d'items (1232!) |
| `enums` | Liste tous les enums connus |
| `enum <nom>` | Valeurs d'un enum |

### État du jeu
| Commande | Description |
|----------|-------------|
| `state [key=val]` | Voir/modifier le state |
| `status` | Statut du moteur |
| `set_seed <n>` | Fixer la seed RNG |
| `random [max]` | Générer un nombre aléatoire |

### Introspection (Reflection)
| Commande | Description |
|----------|-------------|
| `class <nom>` | Inspecter une classe |
| `methods <nom>` | Méthodes d'une classe |
| `fields <nom>` | Champs d'une classe |
| `call <class.method>` | Appeler une méthode statique |
| `packages` | Lister les packages de jeu |

### Fichiers de données
| Commande | Description |
|----------|-------------|
| `load_tab <fichier>` | Charger un fichier .tab |
| `tab <fichier> [clé]` | Requêter les données |
| `tabs` | Lister les tabs chargés |

### Info
| Commande | Description |
|----------|-------------|
| `build` | Configuration de build |
| `version` | Version du moteur |
| `help` | Aide |
| `quit` | Quitter |

## Architecture

```
dragonsoul-headless/
├── src/
│   ├── cli/
│   │   ├── Main.java          # Point d'entrée (stdin/stdout)
│   │   └── GameEngine.java    # Moteur principal + handleCommand()
│   └── stubs/                 # Stubs Android minimaux
│       ├── android/           # Context, Handler, Looper, Log...
│       └── org/apache/        # commons-logging
├── game-bytecode.jar          # 15,444 classes originales du jeu
├── assets/                    # Fichiers de données du jeu
├── dragonsoul-headless.jar    # Fat JAR exécutable
├── build.sh
├── run.sh
└── README.md
```

## Utilisation par IA

Le moteur est conçu pour être piloté par une IA externe :

```python
import subprocess

proc = subprocess.Popen(
    ['java', '-jar', 'dragonsoul-headless.jar', '--pipe', '--seed', '42'],
    stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE,
    text=True
)

def send_command(cmd):
    proc.stdin.write(cmd + '\n')
    proc.stdin.flush()
    # Lire la réponse...

send_command('boot')
send_command('units DRAGON')
send_command('status')
```

## Données du jeu exposées

- **145 unités** (héros, dragons, NPCs, boss)
- **1232 items** (armes, armures, consommables, skins)
- **676 skills** (compétences de chaque héros)
- **121 commandes** (actions réseau du jeu)
- **24 types de ressources** (or, diamants, stamina...)
- **27 niveaux de rareté** (WHITE → RED)
- **RPGMain** : 142 champs, 241 méthodes
- **GameStateManager** : gestion des actions
- **ClientActionHelper** : 110 méthodes d'action

## Notes

- Fonctionne en mode **offline** (pas de serveur requis)
- Comportement **déterministe** avec `--seed`
- Toutes les dépendances Android remplacées par des stubs minimaux
- La logique métier originale est préservée intégralement dans le bytecode
