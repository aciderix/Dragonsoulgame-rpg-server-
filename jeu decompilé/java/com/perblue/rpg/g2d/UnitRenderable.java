package com.perblue.rpg.g2d;

import a.a.a;
import a.a.c;
import a.a.d;
import a.a.f;
import com.badlogic.gdx.graphics.b;
import com.badlogic.gdx.graphics.g2d.k;
import com.badlogic.gdx.graphics.glutils.t;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.h;
import com.badlogic.gdx.math.p;
import com.badlogic.gdx.math.q;
import com.esotericsoftware.spine.AnimationState;
import com.esotericsoftware.spine.AnimationState.AnimationStateListener;
import com.esotericsoftware.spine.AnimationStateData;
import com.esotericsoftware.spine.BlendMode;
import com.esotericsoftware.spine.Bone;
import com.esotericsoftware.spine.Skeleton;
import com.esotericsoftware.spine.SkeletonData;
import com.esotericsoftware.spine.SkeletonMeshRenderer;
import com.esotericsoftware.spine.Skin;
import com.perblue.rpg.PerfStats;
import com.perblue.rpg.animation.BurntOneAnimMapping;
import com.perblue.rpg.animation.DemonTotemAnimMapping;
import com.perblue.rpg.animation.DoppelgangerAnimMapping;
import com.perblue.rpg.animation.DragonLadyAnimMapping;
import com.perblue.rpg.animation.DragonSlayerAnimMapping;
import com.perblue.rpg.animation.DruidinatrixAnimMapping;
import com.perblue.rpg.animation.GroovyDruidAnimMapping;
import com.perblue.rpg.animation.KrakenKingAnimMapping;
import com.perblue.rpg.animation.LastDefenderAnimMapping;
import com.perblue.rpg.animation.NpcKingImpAnimMapping;
import com.perblue.rpg.animation.ShadowAssassinAnimMapping;
import com.perblue.rpg.animation.TombAngelAnimMapping;
import com.perblue.rpg.animation.UnripeMythologyAnimMapping;
import com.perblue.rpg.animation.WeredragonAnimMapping;
import com.perblue.rpg.animation.ZombieSquireAnimMapping;
import com.perblue.rpg.assets.RPGAssetManager;
import com.perblue.rpg.assets.Sounds;
import com.perblue.rpg.game.buff.CastingFreeze;
import com.perblue.rpg.game.buff.DruidinatrixCloneBuff;
import com.perblue.rpg.game.buff.DungeonManTrappedBuff;
import com.perblue.rpg.game.buff.GhostBuff;
import com.perblue.rpg.game.buff.IBuff;
import com.perblue.rpg.game.buff.InvisibleBuff;
import com.perblue.rpg.game.buff.LastDefenderHammerBuff;
import com.perblue.rpg.game.buff.StoneBuff;
import com.perblue.rpg.game.buff.WeredragonBuff;
import com.perblue.rpg.game.data.display.DisplayDataUtil;
import com.perblue.rpg.game.data.display.VFXUtil;
import com.perblue.rpg.game.data.sound.SoundUtil;
import com.perblue.rpg.game.data.unit.UnitStats;
import com.perblue.rpg.game.event.BuffAddedEvent;
import com.perblue.rpg.game.event.BuffUpdatedEvent;
import com.perblue.rpg.game.event.EntityHitEvent;
import com.perblue.rpg.game.event.EntityScaleChangedEvent;
import com.perblue.rpg.game.event.EventHelper;
import com.perblue.rpg.game.event.EventListener;
import com.perblue.rpg.game.event.EventPool;
import com.perblue.rpg.game.event.SkillStatusChangeEvent;
import com.perblue.rpg.game.event.SkillStatusChangeEvent.SkillStatusChangeType;
import com.perblue.rpg.game.event.TempleUpdateEvent;
import com.perblue.rpg.game.logic.CombatHelper;
import com.perblue.rpg.game.objects.AnimationElement;
import com.perblue.rpg.game.objects.Entity;
import com.perblue.rpg.game.objects.EnvEntity;
import com.perblue.rpg.game.objects.EnvEntityType;
import com.perblue.rpg.game.objects.SceneFlag;
import com.perblue.rpg.game.objects.Unit;
import com.perblue.rpg.network.messages.ItemType;
import com.perblue.rpg.network.messages.SkillType;
import com.perblue.rpg.network.messages.UnitType;
import com.perblue.rpg.simulation.ActionPool;
import com.perblue.rpg.simulation.AnimationType;
import com.perblue.rpg.simulation.DamageSource.DamageSourceType;
import com.perblue.rpg.simulation.SimAction;
import com.perblue.rpg.simulation.ai.AIHelper;
import com.perblue.rpg.simulation.ai.Direction;
import com.perblue.rpg.simulation.skills.DemonTotemSkill1;
import com.perblue.rpg.simulation.skills.DoppelgangerSkill3;
import com.perblue.rpg.simulation.skills.MedusaSkill1.MedusaPetrify;
import com.perblue.rpg.simulation.skills.NpcHeadCrabSkill0;
import com.perblue.rpg.simulation.skills.NpcKingImpSkill1;
import com.perblue.rpg.simulation.skills.SniperWolfSkill1.SniperWolfMesmerize;
import com.perblue.rpg.simulation.skills.UnripeMythologySkill0.UnripeMythologyDragonBuff;
import com.perblue.rpg.simulation.skills.UnstableUnderstudySkill3.UnstableUnderstudyPolymorph;
import com.perblue.rpg.simulation.skills.generic.CombatSkill;
import com.perblue.rpg.util.TeamHelper;
import com.perblue.rpg.util.TempVars;

public class UnitRenderable extends EntityRenderable {
    public static final float DEATH_FADE_LENGTH = 1.0f;
    private static final b DRACUL_GREEN_EYE_COLOR = new b(0.0f, 1.0f, 0.0f, 1.0f);
    private static final b DRACUL_PURPLE_EYE_COLOR = new b(0.25f, 0.25f, 1.0f, 1.0f);
    private static final b LIGHT_GREEN_EYE_COLOR = new b(0.5f, 1.0f, 0.5f, 1.0f);
    private static final b LIGHT_PURPLE_EYE_COLOR = new b(0.75f, 0.5f, 1.0f, 1.0f);
    private AnimationElement animElement;
    private c currentSkillEventTimeline;
    protected boolean isEntityRemoved;
    protected p scale;
    private Unit unit;

    public UnitRenderable(Unit unit, SkeletonData skeletonData, RepresentationManager representationManager, boolean z) {
        this(unit, skeletonData, representationManager, z, z);
    }

    public UnitRenderable(final Unit unit, SkeletonData skeletonData, RepresentationManager representationManager, boolean z, boolean z2) {
        super(representationManager, unit, z, z2);
        this.isEntityRemoved = false;
        this.scale = new p(1.0f, 1.0f);
        this.unit = unit;
        unit.setRenderable(this);
        this.scale.b(unit.getScale(), unit.getScale());
        if (unit.getAnimationElement() == null) {
            Skeleton skeleton = new Skeleton(skeletonData);
            skeleton.setToSetupPose();
            skeleton.updateWorldTransform();
            AnimationStateData animationStateData = new AnimationStateData(skeletonData);
            DisplayDataUtil.initMixData(unit, animationStateData);
            AnimationState animationState = new AnimationState(animationStateData);
            skeleton.setSkin((Skin) skeletonData.getSkins().a(skeletonData.getSkins().b - 1));
            unit.setAnimationElement(new AnimationElement(skeleton, animationState));
            DisplayDataUtil.initAnimMapping(unit.getData().getType(), unit.getAnimationElement());
            AnimationStateListener baseVFX = VFXUtil.getBaseVFX(unit);
            if (baseVFX != null) {
                animationState.addListener(baseVFX);
            }
            baseVFX = SoundUtil.getBaseSound(unit);
            if (baseVFX != null) {
                animationState.addListener(baseVFX);
            }
        }
        this.animElement = unit.getAnimationElement();
        if (this.animElement != null) {
            String sectionType;
            Object obj;
            switch (unit.getData().getType()) {
                case NPC_GIANT_PLANT_ROOT:
                    this.animElement.setAnimation((Entity) unit, "growth", false);
                    break;
                case NPC_SKELETON_DEER:
                    this.animElement.getSkeleton().getColor().L = 0.0f;
                    this.repManager.getTweenManager().a((d) d.a(this.animElement.getSkeleton().getColor(), 1, 0.5f).d(1.0f).a(0.25f));
                    break;
                case DEMON_TOTEM:
                    if (unit.getParent() != null) {
                        DemonTotemSkill1 demonTotemSkill1 = (DemonTotemSkill1) unit.getParent().getCombatSkill(SkillType.DEMON_TOTEM_1);
                        if (demonTotemSkill1 != null && demonTotemSkill1.wasActivated()) {
                            sectionType = demonTotemSkill1.getSectionType(unit);
                            DemonTotemAnimMapping demonTotemAnimMapping = (DemonTotemAnimMapping) unit.getAnimationElement().getAnimMapping();
                            if (demonTotemAnimMapping != null) {
                                demonTotemAnimMapping.setMappingState(sectionType);
                            }
                            this.animElement.setAnimationImmediately(unit, AnimationType.skill1.name(), false);
                            break;
                        }
                    }
                    break;
                case DOPPELGANGER:
                    if (!(unit.getParent() == null || ((DoppelgangerSkill3) unit.getCombatSkill(SkillType.DOPPELGANGER_3)) == null)) {
                        DoppelgangerAnimMapping doppelgangerAnimMapping = (DoppelgangerAnimMapping) unit.getAnimationElement().getAnimMapping();
                        if (doppelgangerAnimMapping != null) {
                            doppelgangerAnimMapping.setMappingState(DoppelgangerAnimMapping.MINI_STATE);
                        }
                        this.animElement.setAnimationImmediately(unit, "skill3_mimi_start", false);
                        break;
                    }
                case NPC_ANGELIC_AVENGER:
                    if (unit.getParent() != null) {
                        this.animElement.setAnimationImmediately(unit, "idle_start", false);
                        break;
                    }
                    break;
                case UNRIPE_MYTHOLOGY:
                    if (((UnripeMythologyDragonBuff) unit.getBuff(UnripeMythologyDragonBuff.class)) == null) {
                        this.animElement.setAnimationImmediately(unit, "idle_egg", false);
                        break;
                    }
                    UnripeMythologyAnimMapping unripeMythologyAnimMapping = (UnripeMythologyAnimMapping) unit.getAnimationElement().getAnimMapping();
                    if (unripeMythologyAnimMapping != null) {
                        unripeMythologyAnimMapping.setMappingState("DRAGON_STATE");
                    }
                    this.animElement.setAnimationImmediately(unit, AnimationType.skill1.name(), false);
                    break;
                case DRAGON_LADY:
                    DragonLadyAnimMapping dragonLadyAnimMapping = (DragonLadyAnimMapping) unit.getAnimationElement().getAnimMapping();
                    if (dragonLadyAnimMapping != null) {
                        obj = "DEFAULT";
                        switch (unit.getData().getSkinType()) {
                            case SKIN_DRAGON_LADY_SPACE_KNIGHT:
                                obj = DragonLadyAnimMapping.SKIN_SPACE_KNIGHT_STATE;
                                break;
                        }
                        dragonLadyAnimMapping.setMappingState(obj);
                        break;
                    }
                    break;
                case SHADOW_ASSASSIN:
                    ShadowAssassinAnimMapping shadowAssassinAnimMapping = (ShadowAssassinAnimMapping) unit.getAnimationElement().getAnimMapping();
                    if (shadowAssassinAnimMapping != null) {
                        obj = "DEFAULT";
                        switch (unit.getData().getSkinType()) {
                            case SKIN_SHADOW_ASSASSIN_WATCH:
                                obj = ShadowAssassinAnimMapping.SKIN_WATCH_STATE;
                                break;
                        }
                        shadowAssassinAnimMapping.setMappingState(obj);
                        break;
                    }
                    break;
                case ZOMBIE_SQUIRE:
                    ZombieSquireAnimMapping zombieSquireAnimMapping = (ZombieSquireAnimMapping) unit.getAnimationElement().getAnimMapping();
                    if (zombieSquireAnimMapping != null) {
                        obj = "DEFAULT";
                        switch (unit.getData().getSkinType()) {
                            case SKIN_ZOMBIE_SQUIRE_DIGITAL:
                                obj = ZombieSquireAnimMapping.SKIN_DIGITAL_STATE;
                                break;
                        }
                        zombieSquireAnimMapping.setMappingState(obj);
                        break;
                    }
                    break;
                case NPC_KING_IMP:
                    NpcKingImpAnimMapping npcKingImpAnimMapping = (NpcKingImpAnimMapping) unit.getAnimationElement().getAnimMapping();
                    if (npcKingImpAnimMapping != null) {
                        String str = NpcKingImpAnimMapping.GOLD_STATE;
                        NpcKingImpSkill1 npcKingImpSkill1 = (NpcKingImpSkill1) unit.getCombatSkill(SkillType.NPC_KING_IMP_1);
                        if (npcKingImpSkill1 == null || npcKingImpSkill1.getDamageSourceType() != DamageSourceType.PHYSICAL) {
                            sectionType = str;
                        } else {
                            obj = NpcKingImpAnimMapping.SILVER_STATE;
                        }
                        npcKingImpAnimMapping.setMappingState(obj);
                        break;
                    }
                    break;
                case BURNT_ONE:
                    BurntOneAnimMapping burntOneAnimMapping = (BurntOneAnimMapping) unit.getAnimationElement().getAnimMapping();
                    if (burntOneAnimMapping != null) {
                        obj = "DEFAULT";
                        switch (unit.getData().getSkinType()) {
                            case SKIN_BURNT_ONE_VOODOO:
                                obj = BurntOneAnimMapping.DEFAULT_STATE_VOODOO;
                                break;
                        }
                        burntOneAnimMapping.setMappingState(obj);
                        break;
                    }
                    break;
                case DRAGON_SLAYER:
                    DragonSlayerAnimMapping dragonSlayerAnimMapping = (DragonSlayerAnimMapping) unit.getAnimationElement().getAnimMapping();
                    if (dragonSlayerAnimMapping != null) {
                        obj = "DEFAULT";
                        switch (unit.getData().getSkinType()) {
                            case SKIN_DRAGON_SLAYER_UNICORN:
                                obj = DragonSlayerAnimMapping.DEFAULT_STATE_UNICORN;
                                break;
                        }
                        dragonSlayerAnimMapping.setMappingState(obj);
                        break;
                    }
                    break;
                case GROOVY_DRUID:
                    GroovyDruidAnimMapping groovyDruidAnimMapping = (GroovyDruidAnimMapping) unit.getAnimationElement().getAnimMapping();
                    if (groovyDruidAnimMapping != null) {
                        obj = "DEFAULT";
                        switch (unit.getData().getSkinType()) {
                            case SKIN_GROOVY_DRUID_DISCO:
                                obj = GroovyDruidAnimMapping.DEFAULT_STATE_DISCO;
                                break;
                        }
                        groovyDruidAnimMapping.setMappingState(obj);
                        break;
                    }
                    break;
                case KRAKEN_KING:
                    KrakenKingAnimMapping krakenKingAnimMapping = (KrakenKingAnimMapping) unit.getAnimationElement().getAnimMapping();
                    if (krakenKingAnimMapping != null) {
                        obj = "DEFAULT";
                        switch (unit.getData().getSkinType()) {
                            case SKIN_KRAKEN_KING_MECHALORD:
                                obj = KrakenKingAnimMapping.DEFAULT_STATE_MECHALORD;
                                break;
                        }
                        krakenKingAnimMapping.setMappingState(obj);
                        break;
                    }
                    break;
                case DRUIDINATRIX:
                    DruidinatrixAnimMapping druidinatrixAnimMapping = (DruidinatrixAnimMapping) unit.getAnimationElement().getAnimMapping();
                    if (druidinatrixAnimMapping != null) {
                        obj = "DEFAULT";
                        switch (unit.getData().getSkinType()) {
                            case SKIN_DRUIDINATRIX_MASTERY:
                                obj = DruidinatrixAnimMapping.DEFAULT_STATE_MASTERY;
                                break;
                        }
                        druidinatrixAnimMapping.setMappingState(obj);
                        break;
                    }
                    break;
                case TOMB_ANGEL:
                    TombAngelAnimMapping tombAngelAnimMapping = (TombAngelAnimMapping) unit.getAnimationElement().getAnimMapping();
                    if (tombAngelAnimMapping != null) {
                        obj = "DEFAULT";
                        switch (unit.getData().getSkinType()) {
                            case SKIN_TOMB_ANGEL_USERCONTEST:
                                obj = TombAngelAnimMapping.SKIN_USERCONTEST_STATE;
                                break;
                        }
                        tombAngelAnimMapping.setMappingState(obj);
                        break;
                    }
                    break;
                case WEREDRAGON:
                    WeredragonAnimMapping weredragonAnimMapping = (WeredragonAnimMapping) unit.getAnimationElement().getAnimMapping();
                    if (weredragonAnimMapping != null) {
                        obj = "DEFAULT";
                        if (unit.hasBuff(WeredragonBuff.class)) {
                            obj = "DRAGON_STATE";
                        }
                        weredragonAnimMapping.setMappingState(obj);
                        break;
                    }
                    break;
                case LAST_DEFENDER:
                    LastDefenderAnimMapping lastDefenderAnimMapping = (LastDefenderAnimMapping) unit.getAnimationElement().getAnimMapping();
                    if (lastDefenderAnimMapping != null) {
                        obj = "DEFAULT";
                        if (unit.hasBuff(LastDefenderHammerBuff.class)) {
                            obj = LastDefenderAnimMapping.HAMMER_STATE;
                        }
                        lastDefenderAnimMapping.setMappingState(obj);
                        break;
                    }
                    break;
            }
        }
        addEntityEventListener(SkillStatusChangeEvent.class, new EventListener<SkillStatusChangeEvent>() {
            public void onEvent(SkillStatusChangeEvent skillStatusChangeEvent) {
                if (skillStatusChangeEvent.getStatusChangeType() == SkillStatusChangeType.ANIMATION_EVENT && !skillStatusChangeEvent.getSkill().hasTriggered()) {
                    skillStatusChangeEvent.getSkill().setTriggered(true);
                    CombatHelper.doEnergyChange(skillStatusChangeEvent.getSource(), skillStatusChangeEvent.getSource(), (float) skillStatusChangeEvent.getSkill().getEnergyGain(), false);
                }
                if (skillStatusChangeEvent.getSkill().getVisualDuration() > 0.0f && unit.getTeam() == 1) {
                    switch (skillStatusChangeEvent.getStatusChangeType()) {
                        case ACTIVATED:
                            UnitRenderable.this.grow(skillStatusChangeEvent);
                            return;
                        case COMPLETED:
                            if (skillStatusChangeEvent.getSkill().getSkillType() == SkillType.DOPPELGANGER_1) {
                                UnitRenderable.this.setScale(unit.getScale(), unit.getScale());
                                return;
                            }
                            return;
                        case CANCELLED:
                            if (skillStatusChangeEvent.getSkill().getSkillType() == SkillType.ELECTROYETI_1) {
                                UnitRenderable.this.removeParticleEffect(ParticleType.HeroElectroYeti_cloudlightning);
                            }
                            UnitRenderable.this.shrink();
                            return;
                        default:
                            return;
                    }
                }
            }
        });
        addEntityEventListener(BuffAddedEvent.class, new EventListener<BuffAddedEvent>() {
            public void onEvent(BuffAddedEvent buffAddedEvent) {
                if (buffAddedEvent.getBuff() instanceof UnstableUnderstudyPolymorph) {
                    UnitRenderable.this.repManager.getTweenManager().a(d.a(UnitRenderable.this.scale, 4, 0.15f).a(0.0f, 0.0f));
                }
            }
        });
        addEntityEventListener(EntityScaleChangedEvent.class, new EventListener<EntityScaleChangedEvent>() {
            public void onEvent(EntityScaleChangedEvent entityScaleChangedEvent) {
                UnitRenderable.this.scale.b(unit.getScale(), unit.getScale());
            }
        });
        addEntityEventListener(TempleUpdateEvent.class, new EventListener<TempleUpdateEvent>() {
            public void onEvent(TempleUpdateEvent templeUpdateEvent) {
                if (templeUpdateEvent != null && UnitRenderable.this.scale != null && UnitRenderable.this.entity != null) {
                    UnitRenderable.this.scale.b = UnitRenderable.this.entity.getScale() * templeUpdateEvent.getScale();
                    UnitRenderable.this.scale.c = UnitRenderable.this.entity.getScale() * templeUpdateEvent.getScale();
                    AnimationElement animationElement = unit.getAnimationElement();
                    if (animationElement != null) {
                        Skeleton skeleton = animationElement.getSkeleton();
                        if (skeleton != null) {
                            b color = skeleton.getColor();
                            if (color != null) {
                                color.a(templeUpdateEvent.getColorAmount(), templeUpdateEvent.getColorAmount(), templeUpdateEvent.getColorAmount(), 1.0f);
                            }
                        }
                    }
                }
            }
        });
        addEntityEventListener(BuffUpdatedEvent.class, new EventListener<BuffUpdatedEvent>() {
            public void onEvent(BuffUpdatedEvent buffUpdatedEvent) {
                IBuff buff = buffUpdatedEvent.getBuff();
                if (!(buff instanceof UnstableUnderstudyPolymorph)) {
                    return;
                }
                if (((UnstableUnderstudyPolymorph) buff).getTimeLeft() <= 0 || buffUpdatedEvent.wasRemoved() || UnitRenderable.this.entity.getHP() <= 0.0f) {
                    UnitRenderable.this.repManager.getTweenManager().a(d.a(UnitRenderable.this.scale, 4, 0.15f).a(UnitRenderable.this.entity.getScale(), UnitRenderable.this.entity.getScale()));
                }
            }
        });
        if (unit.getData().getType() == UnitType.ZOMBIE_SQUIRE) {
            addEntityEventListener(EntityHitEvent.class, new EventListener<EntityHitEvent>() {
                public void onEvent(EntityHitEvent entityHitEvent) {
                    Entity envEntity;
                    SimAction createAnimateAction;
                    if (unit.getData().getSkinType() == ItemType.SKIN_ZOMBIE_SQUIRE_DIGITAL) {
                        envEntity = new EnvEntity(EnvEntityType.ZOMBIE_ORGAN_SKIN_DIGITAL);
                    } else {
                        envEntity = new EnvEntity(EnvEntityType.ZOMBIE_ORGAN);
                    }
                    switch (h.a(0, 2)) {
                        case 0:
                            createAnimateAction = ActionPool.createAnimateAction(envEntity, "hit_heart", 1, false);
                            break;
                        case 1:
                            createAnimateAction = ActionPool.createAnimateAction(envEntity, "hit_kidney", 1, false);
                            break;
                        default:
                            createAnimateAction = ActionPool.createAnimateAction(envEntity, "hit_lungs", 1, false);
                            break;
                    }
                    envEntity.setPosition(unit.getPosition());
                    envEntity.addSimAction(createAnimateAction);
                    envEntity.addSimAction(ActionPool.createPauseAction(envEntity, 2000));
                    envEntity.addSimAction(ActionPool.createTweenAction(envEntity, d.b(new f() {
                        public void onEvent(int i, a<?> aVar) {
                            AnimationElement animationElement = envEntity.getAnimationElement();
                            if (animationElement != null) {
                                UnitRenderable.this.repManager.getTweenManager().a(d.a(animationElement.getSkeleton(), 2, 0.4f).d(0.0f));
                            }
                        }
                    })));
                    envEntity.addSimAction(ActionPool.createPauseAction(envEntity, 500));
                    envEntity.addSimAction(ActionPool.createRemoveAction(envEntity));
                    unit.getScene().addEnvEntity(envEntity);
                    EventHelper.dispatchEvent(EventPool.createEntityPlaySoundEvent(envEntity, Sounds.hero_zombie_squire_hit_organs.getAsset()));
                }
            });
        }
    }

    private void killSkillEventTimeline() {
        if (this.currentSkillEventTimeline != null) {
            this.currentSkillEventTimeline.d();
            this.currentSkillEventTimeline = null;
        }
    }

    private void grow(SkillStatusChangeEvent skillStatusChangeEvent) {
        killSkillEventTimeline();
        this.scale.b(this.entity.getScale(), this.entity.getScale());
        final float castingScaleMultiplier = DisplayDataUtil.getCastingScaleMultiplier(this.unit.getData().getType());
        final float scale = this.unit.getScale();
        this.currentSkillEventTimeline = (c) ((c) ((c) ((c) c.p().a(d.a(this.scale, 4, 0.15f).a(getScale().b * castingScaleMultiplier, getScale().c * castingScaleMultiplier)).a(d.b(new f() {
            public void onEvent(int i, a<?> aVar) {
                UnitRenderable.this.unit.setScale(castingScaleMultiplier);
            }
        })).r().a(256)).a(8)).a(new f() {
            public void onEvent(int i, a<?> aVar) {
                if (i == 256 || i == 8) {
                    UnitRenderable.this.scale.b(scale, scale);
                    if (UnitRenderable.this.unit != null) {
                        UnitRenderable.this.unit.setScale(scale);
                    }
                }
            }
        })).b(1, skillStatusChangeEvent.getSkill().getVisualDuration() / 1000.0f);
        this.repManager.getTweenManager().a(this.currentSkillEventTimeline);
    }

    private void shrink() {
        this.scale.b(this.entity.getScale(), this.entity.getScale());
    }

    protected void renderLayers(RenderContext2D renderContext2D) {
        this.animElement.updateWorldTransform();
        PerfStats.start("UnitRenderable.renderLayers");
        PerfStats.start("UnitRenderable.renderLayers 1");
        k polyBatch = renderContext2D.getPolyBatch();
        Matrix4 a = TempVars.obtainMat4().a(polyBatch.f());
        Matrix4 f = polyBatch.f();
        p obtainVec2 = TempVars.obtainVec2();
        renderContext2D.transformWorldToIso(this.unit.getPosition(), obtainVec2);
        f.a(obtainVec2.b, obtainVec2.c, 0.0f);
        f.b(this.scale.b, this.scale.c, 1.0f);
        if (AIHelper.getDirection(this.unit) == Direction.LEFT) {
            f.b(-1.0f, 1.0f, 1.0f);
        }
        polyBatch.a(f);
        boolean handleScissorStart = handleScissorStart(renderContext2D, obtainVec2);
        PerfStats.end("UnitRenderable.renderLayers 1");
        PerfStats.start("UnitRenderable.renderLayers 2");
        switch (this.unit.getData().getType()) {
            case DRUIDINATRIX:
                if (this.unit.hasBuff(DruidinatrixCloneBuff.class)) {
                    this.animElement.getSkeleton().setColor(new b(0.75f, 1.0f, 0.75f, 1.0f));
                    break;
                }
                break;
            case NPC_HEAD_CRAB:
                CombatSkill combatSkill = this.unit.getCombatSkill(SkillType.NPC_HEAD_CRAB_0);
                if (combatSkill != null) {
                    NpcHeadCrabSkill0 npcHeadCrabSkill0 = (NpcHeadCrabSkill0) combatSkill;
                    Skeleton skeleton = this.animElement.getSkeleton();
                    if (skeleton != null) {
                        float worldRotationX;
                        if (npcHeadCrabSkill0.isAttached()) {
                            worldRotationX = npcHeadCrabSkill0.getAttachedBone().getWorldRotationX() - 90.0f;
                        } else {
                            worldRotationX = 0.0f;
                        }
                        Bone rootBone = skeleton.getRootBone();
                        if (rootBone != null) {
                            rootBone.setRotation(worldRotationX);
                            skeleton.updateWorldTransform();
                            break;
                        }
                    }
                }
                break;
        }
        GhostBuff ghostBuff = (GhostBuff) this.unit.getBuff(GhostBuff.class);
        if (ghostBuff != null) {
            this.animElement.getSkeleton().setColor(ghostBuff.getTintColor());
        }
        setEyeState(renderContext2D.getSkeletonRenderer());
        renderContext2D.getSkeletonRenderer().draw$4b67c5a8(renderContext2D.getPolyBatch(), this.animElement.getSkeleton());
        renderContext2D.getSkeletonRenderer().resetEyeState();
        PerfStats.end("UnitRenderable.renderLayers 2");
        PerfStats.start("UnitRenderable.renderLayers 3");
        if (handleScissorStart) {
            renderContext2D.getPolyBatch().e();
            com.badlogic.gdx.utils.b.a.g.glDisable(3089);
        }
        polyBatch.a(a);
        TempVars.free(obtainVec2);
        TempVars.free(a);
        PerfStats.end("UnitRenderable.renderLayers 3");
        PerfStats.end("UnitRenderable.renderLayers");
    }

    private boolean handleScissorStart(RenderContext2D renderContext2D, p pVar) {
        float f;
        boolean z;
        switch (this.unit.getData().getType()) {
            case NPC_GIANT_PLANT_ROOT:
                f = -45.0f;
                z = true;
                break;
            case GROOVY_DRUID:
            case HYDRA:
                z = this.animElement.getPrimaryAnimation().equals(AnimationType.death.name());
                f = 0.0f;
                break;
            case NPC_ANT:
                z = this.animElement.getPrimaryAnimation().equals("skill1_start");
                f = -70.0f;
                break;
            default:
                f = 0.0f;
                z = false;
                break;
        }
        if (z) {
            renderContext2D.getPolyBatch().e();
            q a = TempVars.obtainVec3().a(pVar.b, f + pVar.c, 0.0f);
            a.a(this.repManager.getBackgroundSkew());
            renderContext2D.getCamera().project(a);
            com.badlogic.gdx.utils.b.a.g.glEnable(3089);
            com.badlogic.gdx.utils.b.a.g.glScissor(0, (int) a.b, com.badlogic.gdx.utils.b.a.b.getWidth(), com.badlogic.gdx.utils.b.a.b.getHeight());
            TempVars.free(a);
            return z;
        } else if (!this.unit.hasBuff(DungeonManTrappedBuff.class)) {
            return z;
        } else {
            renderContext2D.getPolyBatch().e();
            q obtainVec3 = TempVars.obtainVec3();
            renderContext2D.transformWorldToIso(this.unit.getDoorScissorPosition(), obtainVec3);
            obtainVec3.a(this.repManager.getBackgroundSkew());
            renderContext2D.getCamera().project(obtainVec3);
            com.badlogic.gdx.utils.b.a.g.glEnable(3089);
            com.badlogic.gdx.utils.b.a.g.glScissor(0, (int) obtainVec3.b, com.badlogic.gdx.utils.b.a.b.getWidth(), com.badlogic.gdx.utils.b.a.b.getHeight());
            TempVars.free(obtainVec3);
            return true;
        }
    }

    private void setEyeState(SkeletonMeshRenderer skeletonMeshRenderer) {
        switch (this.unit.getData().getType()) {
            case BONE_DRAGON:
            case SKELETON_KING:
                if (showPurpleEyes()) {
                    skeletonMeshRenderer.setEyeState(LIGHT_PURPLE_EYE_COLOR, BlendMode.normal);
                    return;
                } else if (showEvilEyes()) {
                    skeletonMeshRenderer.setEyeState(LIGHT_GREEN_EYE_COLOR, BlendMode.normal);
                    return;
                } else if (this.unit.getData().getSkinType() != ItemType.SKIN_SKELETON_KING_ASCENDANT) {
                    skeletonMeshRenderer.setEyeState(null, null);
                    return;
                } else {
                    return;
                }
            case DARK_DRACUL:
            case SPIDER_QUEEN:
                if (showPurpleEyes()) {
                    skeletonMeshRenderer.setEyeState(DRACUL_PURPLE_EYE_COLOR, BlendMode.additive);
                    return;
                } else if (showEvilEyes()) {
                    skeletonMeshRenderer.setEyeState(DRACUL_GREEN_EYE_COLOR, BlendMode.additive);
                    return;
                } else {
                    return;
                }
            case WHITE_TIGRESS:
            case DIGGER_MOLE:
            case SHADOW_OF_SVEN:
                if (showPurpleEyes()) {
                    skeletonMeshRenderer.setEyeState(LIGHT_PURPLE_EYE_COLOR, BlendMode.additive);
                    return;
                }
                return;
            default:
                if (showPurpleEyes()) {
                    skeletonMeshRenderer.setEyeState(LIGHT_PURPLE_EYE_COLOR, BlendMode.additive);
                    return;
                } else if (showEvilEyes()) {
                    skeletonMeshRenderer.setEyeState(LIGHT_GREEN_EYE_COLOR, BlendMode.additive);
                    return;
                } else {
                    return;
                }
        }
    }

    private boolean showPurpleEyes() {
        return this.unit.hasBuff(SniperWolfMesmerize.class);
    }

    private boolean showEvilEyes() {
        return UnitStats.isHero(this.unit.getData().getType()) && this.unit.getScene().isFlagSet(SceneFlag.DEFENDERS_GREEN_EYES) && TeamHelper.isDefendingTeam(this.unit);
    }

    public void render(RenderContext2D renderContext2D) {
        if (this.unit.isVisible() && !this.unit.hasBuff(InvisibleBuff.class)) {
            PerfStats.start("UnitRenderable.render");
            t tVar = null;
            if (!this.entity.hasBuff(CastingFreeze.class) && this.entity.getScene().isCastingFreeze()) {
                tVar = renderContext2D.getDarkDecalShader();
                renderContext2D.getPolyBatch().a(renderContext2D.getDecalShader());
            } else if (this.entity.hasBuff(MedusaPetrify.class) || this.entity.hasBuff(StoneBuff.class)) {
                tVar = renderContext2D.getDecalShader();
                renderContext2D.getPolyBatch().a(renderContext2D.getDesaturateShader());
            }
            renderBackgroundParticles(renderContext2D);
            renderLayers(renderContext2D);
            renderEntityLayerParticles(renderContext2D);
            renderForegroundParticles(renderContext2D);
            if (tVar != null) {
                renderContext2D.getPolyBatch().a(tVar);
            }
            PerfStats.end("UnitRenderable.render");
        }
    }

    public void onEntityRemoved() {
        super.onEntityRemoved();
        this.isEntityRemoved = true;
        transitionLifeAndDeathRendering(false);
    }

    public void unitDeath() {
        transitionLifeAndDeathRendering(false);
    }

    public void unitRevive() {
        transitionLifeAndDeathRendering(true);
    }

    /* DevToolsApp WARNING: Removed duplicated region for block: B:13:0x0075  */
    private void transitionLifeAndDeathRendering(final boolean r9) {
        /*
        r8 = this;
        r7 = 1;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = 0;
        r1 = 0;
        if (r9 == 0) goto L_0x0034;
    L_0x0007:
        r0 = r8.unit;
        r0.clearParallelSimActions(r6);
        r0 = r8.unit;
        r3 = r8.unit;
        r3 = r3.getPosition();
        r3 = r3.a;
        r4 = r8.unit;
        r4 = r4.getPosition();
        r4 = r4.b;
        r5 = r8.unit;
        r5 = r5.getData();
        r5 = r5.getType();
        r5 = com.perblue.rpg.game.data.display.DisplayDataUtil.getFlyingHeight(r5);
        r0.setPosition(r3, r4, r5);
        r0 = r8.unit;
        r0.setVisible(r7);
    L_0x0034:
        r0 = r8.unit;
        r0 = r0.getScene();
        r3 = com.perblue.rpg.game.objects.SceneFlag.DONT_FADE_ON_REMOVE;
        r0 = r0.isFlagSet(r3);
        if (r0 != 0) goto L_0x00a2;
    L_0x0042:
        r0 = r8.unit;
        r4 = r0.getAnimationElement();
        if (r9 == 0) goto L_0x008e;
    L_0x004a:
        r3 = r2;
    L_0x004b:
        if (r4 == 0) goto L_0x00a0;
    L_0x004d:
        if (r9 != 0) goto L_0x0096;
    L_0x004f:
        r0 = com.perblue.rpg.simulation.AnimationType.death;
        r0 = r4.getAnimationLength(r0);
        r0 = r0 - r3;
        r0 = java.lang.Math.max(r1, r0);
    L_0x005a:
        r5 = new com.perblue.rpg.g2d.UnitRenderable$9;
        r5.<init>(r9);
        r6 = a.a.c.p();
        r6 = r6.d(r0);
        r0 = r4.getSkeleton();
        r0 = r0.getColor();
        r0 = a.a.d.a(r0, r7, r3);
        if (r9 == 0) goto L_0x0076;
    L_0x0075:
        r1 = r2;
    L_0x0076:
        r0 = r0.d(r1);
        r0 = r0.a(r5);
        r0 = (a.a.d) r0;
        r0 = r6.a(r0);
        r1 = r8.repManager;
        r1 = r1.getTweenManager();
        r1.a(r0);
    L_0x008d:
        return;
    L_0x008e:
        r0 = r8.unit;
        r0 = r0.getDeathFadeLength();
        r3 = r0;
        goto L_0x004b;
    L_0x0096:
        r4.reset();
        r0 = r8.unit;
        r5 = "idle";
        r4.setAnimationImmediately(r0, r5, r6);
    L_0x00a0:
        r0 = r1;
        goto L_0x005a;
    L_0x00a2:
        if (r9 != 0) goto L_0x008d;
    L_0x00a4:
        r0 = r8.unit;
        r0.setVisible(r6);
        goto L_0x008d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.perblue.rpg.g2d.UnitRenderable.transitionLifeAndDeathRendering(boolean):void");
    }

    public void onRoundTransition() {
        if (this.isEntityRemoved) {
            this.isAlive = false;
        }
    }

    public void update(RenderContext2D renderContext2D, float f, float f2) {
        super.update(renderContext2D, f, f2);
        if (this.isEntityRemoved && this.isAlive && this.unit.getData().getType() == UnitType.CRIMSON_WITCH) {
            this.animElement.update(f2);
        }
    }

    public void dispose(RPGAssetManager rPGAssetManager) {
        super.dispose(rPGAssetManager);
        rPGAssetManager.unloadAsset(this.animElement.getSkeleton().getData());
        this.entity.dispose();
    }

    protected float getHeight() {
        return this.animElement.getHeightFromOrigin();
    }

    protected float getWidth() {
        return this.animElement.getPosedBounds().d;
    }

    public p getScale() {
        return this.scale;
    }

    public void setScale(float f, float f2) {
        this.scale.b = f;
        this.scale.c = f2;
    }

    public float getBaseScale() {
        return this.entity.getScale();
    }
}
