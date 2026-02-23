# DragonSoul - Simulation & Combat System

## Package: com.perblue.rpg.simulation (622 classes)

### ActionPool (class)
`com.perblue.rpg.simulation.ActionPool`

**Fields (1):**
- `private static long nextActionID`

**Methods (33):**
- `AnimateAction createAnimateAction(Entity, AnimationType, int, boolean)`
- `AnimateAction createAnimateAction(Entity, AnimationType, int, float)`
- `AnimateAction createAnimateAction(Entity, AnimationType, int)`
- `AnimateAction createAnimateAction(Entity, String, int, boolean)`
- `AnimateAction createAnimateForDurationAction(Entity, AnimationType, long)`
- `AnimateAction createAnimateForDurationAction(Entity, String, long)`
- `InterpolationMoveAction createInterpolationMoveAction(Entity, q, float)`
- `InterpolationMoveAction createInterpolationMoveAction(Entity, float)`
- `InterpolationMoveAction createInterpolationMoveAction(Entity, float, float, float, float)`
- `PathMoveAction createPathMoveAction(Entity, j, long)`
- `ProjectileAction createProjectileAction(Projectile, float, float, float, float, float, q)`
- `ProjectileAction createProjectileAction(Projectile, q)`
- `MoveAction createMoveAction(Unit, q)`
- `MoveAction createMoveAction(Unit, q, float)`
- `MoveAction createMoveAction(Unit, float, float, float, float)`
- `MoveAction createMoveAction(Unit, float, float, float)`
- `PauseAction createPauseAction(Entity, long, boolean)`
- `PauseAction createPauseAction(Entity, long)`
- `SimAction obtain(Class)`
- `RemoveAction createRemoveAction(Entity)`
- `MoveAction createSlideAction(Unit, float, float, float, float, String)`
- `MoveAction createSlideAction(Unit, float, float, float, float)`
- `TweenAction createTweenAction(Entity, a)`
- `WaitAction createWaitAction(Unit, IWaiting)`
- `ProjectileCollisionAction createProjectileCollisionAction(Projectile, Unit, float, boolean)`
- `ProjectileCollisionAction createProjectileCollisionAction(Projectile, float)`
- `RotateAroundCenterAction createRotateAroundCenterAction(Entity, float, float, float, float, float, String)`
- `RotateAroundCenterAction createRotateAroundCenterAction(Entity, float, float, float)`
- `RunnableAction createRunnableAction(Entity, Runnable)`
- `TriggerSkillAction createTriggerSkillAction(Unit, CombatSkill, Unit)`
- `ProjectileMultiCollisionAction createProjectileMultiCollisionAction(Projectile, float)`
- `ProjectileMultiCollisionAction createProjectileMultiCollisionAction(Projectile, float, boolean)`
- `ProjectileMultiCollisionAction createProjectileMultiCollisionAction(Projectile, float, long, boolean, TargetFinder)`

### ActionSequence (class)
`com.perblue.rpg.simulation.ActionSequence`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (1):**
- `private a sequence`

**Methods (6):**
- `a getSequence()`
- `boolean canBeCleared()`
- `void onReset()`
- `void setSequence(a)`
- `void update(long)`
- `void insert(SimAction)`

### AnimateAction (class)
`com.perblue.rpg.simulation.AnimateAction`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (9):**
- `protected AnimationStateListener additionalListener`
- `private AnimationElement animElement`
- `private AnimationStateAdapter animListener`
- `protected String animType`
- `protected long duration`
- `protected int loopCount`
- `protected float offset`
- `protected float playSpeed`
- `protected boolean shouldLoop`

**Methods (16):**
- `AnimateAction setShouldLoop(boolean)`
- `void initDuration(Entity, AnimationType, long)`
- `void initDuration(Entity, String, long)`
- `void initLoopCount(Entity, String, int)`
- `void initLoopCount(Entity, AnimationType, int)`
- `AnimateAction setPlaySpeed(float)`
- `boolean canBeCleared()`
- `boolean stopsOnStun()`
- `AnimateAction setAdditionalListener(AnimationStateListener)`
- `void markCompleted(long)`
- `String getAnimType()`
- `long getDuration()`
- `void onReset()`
- `void update(long)`
- `void begin()`
- `AnimateAction setOffset(float)`

### AnimationConstants (class)
`com.perblue.rpg.simulation.AnimationConstants`

**Fields (7):**
- `public static final String BUBBLE_LOCATION_BONE = bubble_location_bone`
- `public static final String BUFF_LOCATION_BONE = buff_location_bone`
- `public static final String HEAD_LOCATION_BONE = head_location_bone`
- `public static final String HIT_LOCATION_BONE = hit_location_bone`
- `public static final String MOTION_BLUR = motion_blur`
- `public static final String ROOT = root`
- `public static final String TRIGGER_EFFECT = trigger_effect`

### AnimationHelper (class)
`com.perblue.rpg.simulation.AnimationHelper`

**Methods (2):**
- `void setAnimationMapping(Entity, String)`
- `Bone getBone(Entity, String)`

### AnimationType (enum)
`com.perblue.rpg.simulation.AnimationType`
extends `java.lang.Enum`

**Fields (25):**
- `private static final AnimationType[] $VALUES`
- `public static final AnimationType active`
- `public static final AnimationType attack`
- `public static final AnimationType attack_special`
- `public static final AnimationType death`
- `public static final AnimationType death_special`
- `public static final AnimationType disabled`
- `public static final AnimationType hit`
- `public static final AnimationType hit_special`
- `public static final AnimationType idle`
- `public static final AnimationType idle_special`
- `public static final AnimationType jump`
- `public static final AnimationType kick`
- `public static final AnimationType new_death`
- `public static final AnimationType on_tap`
- `public static final AnimationType skill1`
- `public static final AnimationType skill1_special`
- `public static final AnimationType skill2`
- `public static final AnimationType skill3`
- `public static final AnimationType skill4`
- `private static AnimationType[] values`
- `public static final AnimationType victory`
- `public static final AnimationType victory_special`
- `public static final AnimationType walk`
- `public static final AnimationType walk_special`

**Methods (3):**
- `AnimationType[] valuesCached()`
- `AnimationType[] values()`
- `AnimationType valueOf(String)`

**Constants (23):**
- idle
- walk
- attack
- hit
- victory
- death
- jump
- kick
- skill1
- skill2
- skill3
- skill4
- new_death
- idle_special
- walk_special
- hit_special
- victory_special
- death_special
- attack_special
- skill1_special
- on_tap
- disabled
- active

### AttackAction (class)
`com.perblue.rpg.simulation.AttackAction`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (14):**
- `private static final ProjectileType DEFAULT_PROJECTILE_TYPE`
- `private AnimationElement animElement`
- `private AnimationStateAdapter animListener`
- `private IProjectileEffect customEffect`
- `protected IDamageProvider damageProvider`
- `private boolean isLaunched`
- `private q launchPoint`
- `private ProjectileType projectileType`
- `private boolean shouldComplete`
- `private boolean shouldLaunch`
- `private CombatSkill skill`
- `private float splashRadius`
- `private q targetLocOverride`
- `private Unit targetObj`

**Methods (24):**
- `q getTargetLocOverride()`
- `void launchProjectile()`
- `void setSplashRadius(float)`
- `float getSplashRadius()`
- `Entity getTargetObj()`
- `void setProjectileType(ProjectileType)`
- `void doActionMissedEffect(Projectile, Unit, q)`
- `void releaseActionEffect()`
- `ProjectileType getProjectileType()`
- `Entity getActionSource()`
- `void retainActionEffect()`
- `void markCompleted(long)`
- `void onReset()`
- `void setTargetObj(Unit)`
- `void doActionEffect(Projectile, Unit, q)`
- `void doStepEffect(Projectile, float, float)`
- `void update(long)`
- `void begin()`
- `void init(Entity, Unit, q, ProjectileType, IProjectileEffect, IDamageProvider, CombatSkill)`
- `Entity getTarget()`

### AudioOnHit (class)
`com.perblue.rpg.simulation.AudioOnHit`

**Fields (2):**
- `private boolean requireDamage`
- `private Sounds type`

**Methods (4):**
- `AudioOnHit setRequireDamage(boolean)`
- `boolean getRequireDamage()`
- `void trigger(Entity, Entity, DamageSource)`

### BaseOnHit (class)
`com.perblue.rpg.simulation.BaseOnHit`

**Methods (1):**
- `void trigger(Entity, Entity, DamageSource)`

### BaseProjectileEffect (class)
`com.perblue.rpg.simulation.BaseProjectileEffect`

**Fields (2):**
- `private Entity source`
- `protected float splashRadius`

**Methods (8):**
- `void setSplashRadius(float)`
- `float getSplashRadius()`
- `void doActionMissedEffect(Projectile, Unit, q)`
- `void releaseActionEffect()`
- `Entity getActionSource()`
- `void retainActionEffect()`
- `void doActionEffect(Projectile, Unit, q)`
- `void doStepEffect(Projectile, float, float)`

### BuffAddOnHit (class)
`com.perblue.rpg.simulation.BuffAddOnHit`

**Fields (2):**
- `protected ICopyableBuff buffTemplate`
- `protected boolean requireDamage`

**Methods (4):**
- `BuffAddOnHit setRequireDamage(boolean)`
- `boolean getRequireDamage()`
- `void trigger(Entity, Entity, DamageSource)`

### BuffTargetTest (class)
`com.perblue.rpg.simulation.BuffTargetTest`
extends `com.perblue.rpg.simulation.TargetingHelper$PoolableTest`

**Fields (2):**
- `private boolean hasBuff`
- `private Class type`

**Methods (3):**
- `boolean canTarget(Entity, Entity)`
- `BuffTargetTest doesNotHaveBuff(Class)`
- `BuffTargetTest hasBuff(Class)`

### BuffTryOnHit (class)
`com.perblue.rpg.simulation.BuffTryOnHit`
extends `com.perblue.rpg.simulation.BuffAddOnHit`

**Fields (1):**
- `private CombatSkill skill`

**Methods (1):**
- `void trigger(Entity, Entity, DamageSource)`

### BuffsTargetTest (class)
`com.perblue.rpg.simulation.BuffsTargetTest`
extends `com.perblue.rpg.simulation.TargetingHelper$PoolableTest`

**Fields (2):**
- `private boolean hasBuff`
- `private final a types`

**Methods (3):**
- `BuffsTargetTest doesNotHaveAnyBuffs(a)`
- `BuffsTargetTest hasAllBuffs(a)`
- `boolean canTarget(Entity, Entity)`

### DOTDamageProvider (class)
`com.perblue.rpg.simulation.DOTDamageProvider`

**Fields (3):**
- `private DamageSource damageSource`
- `private CombatSkill skillSource`
- `private int stacks`

**Methods (6):**
- `void incrementStackCount()`
- `int getStackCount()`
- `void setDamageSource(DamageSource)`
- `void setSkillSource(CombatSkill)`
- `DamageSource getDamageSource()`
- `CombatSkill getSkillSource()`

### DamageSource (class)
`com.perblue.rpg.simulation.DamageSource`

**Fields (22):**
- `private static final ac POOL`
- `private boolean allowsLifeSteal`
- `private boolean canBeDodged`
- `private boolean canCauseHits`
- `private boolean canGiveTargetEnergy`
### com.perblue.rpg.simulation.DamageSource [LOAD ERROR: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$CritBehaviorType disagree on InnerClasses attribute]

### com.perblue.rpg.simulation.DebugLog [LOAD ERROR: org/apache/commons/logging/impl/SimpleLog]

### DelayedOnHit (class)
`com.perblue.rpg.simulation.DelayedOnHit`

**Fields (3):**
- `private float delay`
- `private IOnHit onHit`
- `private boolean requireDamage`

**Methods (5):**
- `DelayedOnHit setRequireDamage(boolean)`
- `boolean getRequireDamage()`
- `void trigger(Entity, Entity, DamageSource)`

### DistTargetTest (class)
`com.perblue.rpg.simulation.DistTargetTest`

**Fields (4):**
- `public q center`
- `public float dst`
- `private boolean useTargetPos`
- `private boolean useX`

**Methods (4):**
- `boolean canTarget(Entity, Entity)`
- `void free()`
- `DistTargetTest create(float, boolean, boolean)`
- `DistTargetTest create(q, float, boolean, boolean)`

### EmptyProjectileEffect (class)
`com.perblue.rpg.simulation.EmptyProjectileEffect`

**Fields (2):**
- `private Entity source`
- `private float splashRadius`

**Methods (8):**
- `void setSplashRadius(float)`
- `float getSplashRadius()`
- `void doActionMissedEffect(Projectile, Unit, q)`
- `void releaseActionEffect()`
- `Entity getActionSource()`
- `void retainActionEffect()`
- `void doActionEffect(Projectile, Unit, q)`
- `void doStepEffect(Projectile, float, float)`

### FacingDirectionTargetTest (class)
`com.perblue.rpg.simulation.FacingDirectionTargetTest`
extends `com.perblue.rpg.simulation.TargetingHelper$PoolableTest`

**Fields (2):**
- `private Direction dir`
- `private Direction myDir`

**Methods (5):**
- `boolean canTarget(Entity, Entity)`
- `FacingDirectionTargetTest createBehindTest(Direction)`
- `FacingDirectionTargetTest createBehindTest()`
- `FacingDirectionTargetTest createInFrontTest(Direction)`
- `FacingDirectionTargetTest createInFrontTest()`

### HPTargetTest (class)
`com.perblue.rpg.simulation.HPTargetTest`
extends `com.perblue.rpg.simulation.TargetingHelper$PoolableTest`

**Fields (2):**
- `public boolean findBelow`
- `public float hp`

**Methods (4):**
- `HPTargetTest createBelowTest(float)`
- `boolean canTarget(Entity, Entity)`
- `HPTargetTest createAboveTest(float)`
- `void free()`

### HeroSectionTargetTest (class)
`com.perblue.rpg.simulation.HeroSectionTargetTest`
extends `com.perblue.rpg.simulation.TargetingHelper$PoolableTest`

**Fields (1):**
- `public SectionType section`

**Methods (2):**
- `boolean canTarget(Entity, Entity)`
- `HeroSectionTargetTest create(SectionType)`

### HeroTagTargetTest (class)
`com.perblue.rpg.simulation.HeroTagTargetTest`
extends `com.perblue.rpg.simulation.TargetingHelper$PoolableTest`

**Fields (2):**
- `public boolean isReverse`
- `public HeroTag tag`

**Methods (4):**
- `HeroTagTargetTest HasTag(HeroTag)`
- `HeroTagTargetTest notHasTag(HeroTag)`
- `boolean canTarget(Entity, Entity)`
- `HeroTagTargetTest create(HeroTag)`

### IDamageProvider (interface)
`com.perblue.rpg.simulation.IDamageProvider`

**Methods (2):**
- `DamageSource getDamageSource()`
- `CombatSkill getSkillSource()`

### IOnHit (interface)
`com.perblue.rpg.simulation.IOnHit`

**Methods (1):**
- `void trigger(Entity, Entity, DamageSource)`

### IOnHitRequireDamage (interface)
`com.perblue.rpg.simulation.IOnHitRequireDamage`

**Methods (2):**
- `IOnHit setRequireDamage(boolean)`
- `boolean getRequireDamage()`

### IProjectileEffect (interface)
`com.perblue.rpg.simulation.IProjectileEffect`

**Methods (8):**
- `void setSplashRadius(float)`
- `float getSplashRadius()`
- `void doActionMissedEffect(Projectile, Unit, q)`
- `void releaseActionEffect()`
- `Entity getActionSource()`
- `void retainActionEffect()`
- `void doActionEffect(Projectile, Unit, q)`
- `void doStepEffect(Projectile, float, float)`

### IdentityTest (class)
`com.perblue.rpg.simulation.IdentityTest`
extends `com.perblue.rpg.simulation.TargetingHelper$PoolableTest`

**Fields (2):**
- `private boolean exclude`
- `public a units`

**Methods (7):**
- `boolean canTarget(Entity, Entity)`
- `IdentityTest exclude(Collection)`
- `IdentityTest exclude(Unit)`
- `IdentityTest include(Collection)`
- `IdentityTest include(Unit)`
- `IdentityTest also(Collection)`
- `IdentityTest also(Unit)`

### InterpolationMoveAction (class)
`com.perblue.rpg.simulation.InterpolationMoveAction`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (11):**
- `protected float animLength`
- `private boolean canBeCleared`
- `protected long currTimeElapsed`
- `protected q endPos`
- `protected boolean interpX`
- `protected boolean interpY`
- `protected boolean interpZ`
- `protected g interpolator`
- `protected boolean playMoveAction`
- `protected q startPos`
- `private p tmp2`

**Methods (17):**
- `boolean canBeCleared()`
- `InterpolationMoveAction setEndPos(q)`
- `InterpolationMoveAction setCanBeCleared(boolean)`
- `void onReset()`
- `InterpolationMoveAction setEndX(float)`
- `InterpolationMoveAction setEndY(float)`
- `InterpolationMoveAction setEndZ(float)`
- `InterpolationMoveAction setInterpX(boolean)`
- `InterpolationMoveAction setInterpY(boolean)`
- `float getAnimationLength()`
- `InterpolationMoveAction setAnimLength(float)`
- `InterpolationMoveAction setInterpZ(boolean)`
- `InterpolationMoveAction setInterpolator(g)`
- `InterpolationMoveAction setPlayMoveAction(boolean)`
- `InterpolationMoveAction setStartPos(q)`
- `void update(long)`
- `void begin()`

### KnockbackOnHit (class)
`com.perblue.rpg.simulation.KnockbackOnHit`

**Fields (3):**
- `private float knockbackDist`
- `private boolean requireDamage`
- `private float time`

**Methods (5):**
- `KnockbackOnHit setRequireDamage(boolean)`
- `boolean getRequireDamage()`
- `void setKnockbackDist(float)`
- `void trigger(Entity, Entity, DamageSource)`

### MoveAction (class)
`com.perblue.rpg.simulation.MoveAction`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (11):**
- `private AnimationElement animElement`
- `protected String animationType`
- `protected q lastPos`
- `protected float moveMultiplier`
- `protected float rangeCheck`
- `protected boolean slide`
- `protected float speed`
- `protected q targetPos`
- `private p tmp2`
- `private q tmp3`
- `protected q vel`

**Methods (11):**
- `void updateVel()`
- `String getAnimationType()`
- `float getMoveMultiplier()`
- `MoveAction setAnimationType(AnimationType)`
- `MoveAction setMoveMultiplier(float)`
- `float getYaw()`
- `q getTargetPos()`
- `void markCompleted(long)`
- `void onReset()`
- `void update(long)`
- `void begin()`

### ParticleOnHit (class)
`com.perblue.rpg.simulation.ParticleOnHit`

**Fields (6):**
- `private long duration`
- `private HIT_LOCATION location`
- `private float offsetX`
- `private float offsetZ`
- `private boolean requireDamage`
- `private ParticleType type`

**Methods (4):**
- `ParticleOnHit setRequireDamage(boolean)`
- `boolean getRequireDamage()`
- `void trigger(Entity, Entity, DamageSource)`

### PathMoveAction (class)
`com.perblue.rpg.simulation.PathMoveAction`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (5):**
- `protected long animationLength`
- `protected j path`
- `private p tmp2`
- `private q tmp3`
- `private long totalTimeElapsed`

**Methods (3):**
- `void onReset()`
- `void update(long)`
- `void begin()`

### PauseAction (class)
`com.perblue.rpg.simulation.PauseAction`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (4):**
- `private AnimationElement animElement`
- `protected boolean clearable`
- `private long duration`
- `private boolean shouldUpdateAnim`

**Methods (7):**
- `void setShouldUpdateAnim(boolean)`
- `void setDuration(long)`
- `boolean canBeCleared()`
- `long getDuration()`
- `void onReset()`
- `void update(long)`
- `void begin()`

### ProjectileAction (class)
`com.perblue.rpg.simulation.ProjectileAction`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (20):**
- `private static final float ANGLE_STEP = 0.0052359877`
- `public static float FUDGE_FACTOR`
- `public static final float GRAVITY_CONSTANT = 980.0`
- `private static final float HALF_PI = 1.5707964`
- `private float HIT_RADIUS`
- `protected float additionalPitch`
- `protected float distTraveled`
- `protected long duration`
- `protected boolean endOnOutOfBounds`
- `protected float gravity`
- `private c hitCircle`
- `protected float horiztonalVelocity`
- `protected float moveSpeed`
- `protected float pitchRotSpeed`
- `protected float proximityRange`
- `protected Unit targetObj`
- `protected q targetPos`
- `private p tmp2`
- `private q tmp3`
- `protected q vel`

**Methods (19):**
- `ProjectileAction setEndOnOutOfBounds(boolean)`
- `void lookTowardsLoc(Entity, q)`
- `q getTargetPos()`
- `long getDuration()`
- `void onReset()`
- `boolean isOutOfBounds()`
- `boolean isTargetObjHit(float)`
- `void lookTowardsTarget(Entity, Entity)`
- `ProjectileAction makeDirectedAttack(Projectile, Unit, q)`
- `ProjectileAction makeDirectedAttack(Projectile, Unit, q, float, float)`
- `ProjectileAction setTargetObj(Unit)`
- `void completeAction(boolean)`
- `float getMoveSpeed()`
- `q getVelocity()`
- `void setFudgeFactor(float)`
- `void setMoveSpeed(float)`
- `void free()`
- `void update(long)`
- `void begin()`

### ProjectileCollisionAction (class)
`com.perblue.rpg.simulation.ProjectileCollisionAction`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (4):**
- `protected float radius`
- `private ProjectileRadiusTargetTest radiusTest`
- `protected boolean removeOnCollision`
- `protected Unit target`

**Methods (4):**
- `Unit checkForCollision()`
- `void onReset()`
- `void update(long)`
- `void begin()`

### ProjectileHelper (class)
`com.perblue.rpg.simulation.ProjectileHelper`

**Methods (14):**
- `void adjustLaunchPosition(Entity, Projectile)`
- `void adjustLaunchPosition(Entity, ProjectileType, q)`
- `boolean calculateHomingVelocity(q, q, q, float, float, float, float)`
- `Projectile createBeamProjectile(Entity, Unit, ProjectileType, long)`
- `void adjustByBone(AnimationElement, q, String, boolean, float)`
- `float entityUnits(Unit, float)`
- `Projectile createProjectile(Entity, q, IProjectileEffect, ProjectileType, Entity, q, IDamageProvider)`
- `Projectile createProjectile(Entity, q, IProjectileEffect, ProjectileType, Entity, q, IDamageProvider, boolean)`
- `float getTurnSpeed(ProjectileType)`
- `boolean isArrow(ProjectileType)`
- `Projectile launchProjectile(Entity, q, IProjectileEffect, ProjectileType, Unit, q, IDamageProvider)`
- `Projectile launchProjectile(Entity, q, IProjectileEffect, ProjectileType, Unit, q, IDamageProvider, boolean)`
- `void calculateTargetPosition(Entity, ProjectileType, q)`
- `void calculateTargetPosition(Entity, ProjectileType, q, String)`

### ProjectileMultiCollisionAction (class)
`com.perblue.rpg.simulation.ProjectileMultiCollisionAction`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (7):**
- `protected TargetTest alreadyHitTest`
- `protected boolean checkBounds`
- `protected long duration`
- `protected float radius`
- `private RadiusTargetTest radiusTest`
- `protected TargetFinder targetFinder`
- `protected a targetsHit`

**Methods (4):**
- `a getTargets()`
- `void onReset()`
- `void update(long)`
- `void begin()`

### ProjectileRadiusTargetTest (class)
`com.perblue.rpg.simulation.ProjectileRadiusTargetTest`
extends `com.perblue.rpg.simulation.TargetingHelper$PoolableTest`

**Fields (2):**
- `public q center`
- `public float radius`

**Methods (3):**
- `boolean canTarget(Entity, Entity)`
- `ProjectileRadiusTargetTest create(float)`
- `ProjectileRadiusTargetTest create(q, float)`

### RadiusTargetTest (class)
`com.perblue.rpg.simulation.RadiusTargetTest`
extends `com.perblue.rpg.simulation.TargetingHelper$PoolableTest`

**Fields (2):**
- `public q center`
- `public float radius`

**Methods (3):**
- `boolean canTarget(Entity, Entity)`
- `RadiusTargetTest create(float)`
- `RadiusTargetTest create(q, float)`

### ReferenceCounted (interface)
`com.perblue.rpg.simulation.ReferenceCounted`

**Methods (2):**
- `void retain()`
- `void release()`

### RemoveAction (class)
`com.perblue.rpg.simulation.RemoveAction`
extends `com.perblue.rpg.simulation.SimAction`

**Methods (4):**
- `boolean canBeCleared()`
- `boolean stopsOnStun()`
- `void onReset()`
- `void update(long)`

### RotateAroundCenterAction (class)
`com.perblue.rpg.simulation.RotateAroundCenterAction`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (5):**
- `protected float angle`
- `protected String followBoneName`
- `protected p offset`
- `protected float radius`
- `protected float speed`

**Methods (12):**
- `float getAngle()`
- `String getFollowBoneName()`
- `float getRadius()`
- `float getSpeed()`
- `void setAngle(float)`
- `void setFollowBoneName(String)`
- `void setRadius(float)`
- `void setSpeed(float)`
- `void onReset()`
- `void update(long)`
- `p getOffset()`
- `void setOffset(p)`

### RunnableAction (class)
`com.perblue.rpg.simulation.RunnableAction`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (1):**
- `private Runnable runnable`

**Methods (3):**
- `void onReset()`
- `void update(long)`
- `void init(Entity, Runnable)`

### SimAction (class)
`com.perblue.rpg.simulation.SimAction`

**Fields (11):**
- `public static int freeCount`
- `private long id`
- `protected boolean isClearable`
- `protected boolean isComplete`
- `protected boolean isRunning`
- `protected long leftoverTime`
- `protected IEntity obj`
- `private ac pool`
- `private int refCount`
- `protected boolean stopsOnHit`
- `protected boolean stopsOnStun`

**Methods (21):**
- `void setPool(ac)`
- `void retain()`
- `void setId(long)`
- `boolean canBeCleared()`
- `void setClearable(boolean)`
- `boolean stopsOnHit()`
- `boolean isRunning()`
- `boolean isComplete()`
- `long getLeftoverTime()`
- `boolean stopsOnStun()`
- `void markCompleted(long)`
- `void onReset()`
- `void setStopsOnHit(boolean)`
- `SimAction setStopsOnStun(boolean)`
- `void free()`
- `void update(long)`
- `void begin()`
- `long getId()`
- `IEntity getTarget()`
- `void reset()`
- `void release()`

### SummonTargetTest (class)
`com.perblue.rpg.simulation.SummonTargetTest`
extends `com.perblue.rpg.simulation.TargetingHelper$PoolableTest`

**Fields (1):**
- `private boolean isSummon`

**Methods (4):**
- `SummonTargetTest isSummon()`
- `SummonTargetTest isNotSummon()`
- `boolean isSummonUnitType(Entity)`
- `boolean canTarget(Entity, Entity)`

### TagTest (class)
`com.perblue.rpg.simulation.TagTest`

**Fields (2):**
- `private boolean isEqual`
- `private HeroTag matchedTag`

**Methods (4):**
- `boolean canTarget(Entity, Entity)`
- `void free()`
- `TagTest create(HeroTag)`
- `TagTest create(HeroTag, boolean)`

### TargetingHelper (class)
`com.perblue.rpg.simulation.TargetingHelper`

**Fields (17):**
- `public static final TargetTest ALLY_EXCLUDE_ENEMY_CONSPIRATOR`
- `private static final TargetTest ALLY_TEST`
- `public static final TargetTest ANY_ENEMY_TEST`
- `public static final TargetTest BEHIND`
- `public static final TargetTest DOPPELGANGER_BLACKLIST`
- `private static final TargetTest ENEMY_TEST`
- `public static final TargetTest IN_FRONT`
- `public static final TargetTest NOT_BOSS`
- `public static final TargetTest NOT_NPC`
- `public static final TargetTest NOT_SELF`
- `public static final TargetTest OTHER_TEAM_NUMBER_TEST`
- `public static final TargetTest PROJECTILE_ALLY_TEST`
- `public static final TargetTest PROJECTILE_ENEMY_TEST`
- `private static final TargetTest SAME_TEAM_NUMBER_TEST`
- `public static final TargetTest SELF`
- `public static final TargetTest TARGET_IN_BOUNDS_TEST`
- `private static final TargetTest UNTARGETABLE_ENEMY_TEST`

**Methods (59):**
- `a getProjectiles(Entity, TargetTest)`
- `a getProjectiles(Entity, TargetTest, TargetTest)`
- `Unit getSingleEnemyTarget(Entity, TargetReducer, TargetTest, TargetTest)`
- `Unit getSingleEnemyTarget(Entity, TargetReducer, TargetTest, TargetTest, TargetTest)`
- `Unit getSingleEnemyTarget(Entity, TargetReducer, TargetTest)`
- `Unit getSingleEnemyTarget(Entity, TargetReducer)`
- `Unit getSingleEnemyTarget(Entity, TargetReducer, TargetTest, TargetTest, TargetTest, TargetTest)`
- `a getEnemyTargets(Entity, TargetTest, TargetTest, TargetTest, TargetTest)`
- `a getEnemyTargets(Entity)`
- `a getEnemyTargets(Entity, TargetTest, TargetTest, TargetTest)`
- `a getEnemyTargets(Entity, TargetTest, TargetTest)`
- `a getEnemyTargets(Entity, TargetTest)`
- `boolean areEnemies(Entity, Entity)`
- `a getAllEnemyTargets(Entity, TargetTest)`
- `a getAllEnemyTargets(Entity, TargetTest, TargetTest)`
- `a getAllEnemyTargets(Entity, TargetTest, TargetTest, TargetTest)`
- `a getAllEnemyTargets(Entity, TargetTest, TargetTest, TargetTest, TargetTest)`
- `a getAllEnemyTargets(Entity)`
- `a getTargets(Entity, TargetTest)`
- `a getTargets(Entity)`
- `a getTargetsCore(Entity, boolean, TargetTest, TargetTest, TargetTest, TargetTest, TargetTest, TargetTest, TargetTest)`
- `a getUnitTargets(Unit, int)`
- `boolean hasAlly(Entity, TargetTest)`
- `boolean hasTarget(Entity, TargetTest, TargetTest, TargetTest, TargetTest, TargetTest)`
- `boolean hasEnemy(Entity, TargetTest)`
- `boolean hasSameTeamTarget(Entity, TargetTest, TargetTest, TargetTest)`
- `boolean hasSameTeamTarget(Entity, TargetTest)`
- `boolean isAlly(Unit, Unit)`
- `boolean passesTest(Entity, Entity, TargetTest)`
- `boolean passesTestCore(Entity, Entity, TargetTest)`
- `a getSameTeamTargets(Entity)`
- `a getSameTeamTargets(Entity, TargetTest)`
- `a getSameTeamTargets(Entity, TargetTest, TargetTest)`
- `Unit getSingleTarget(Entity, a, TargetReducer)`
- `Unit getSingleTarget(Entity, TargetReducer, TargetTest)`
- `Unit getSingleTarget(Entity, TargetReducer)`
- `boolean areAllies(Entity, Entity)`
- `void freeTargets(a)`
- `a getTargetsWrapper(Entity, boolean, TargetTest, TargetTest, TargetTest, TargetTest, TargetTest, boolean)`
- `a getTargetsWrapper(Entity, boolean, TargetTest, TargetTest, TargetTest, TargetTest, TargetTest)`
- `a getAllyTargets(Entity, TargetTest, TargetTest, TargetTest, boolean)`
- `a getAllyTargets(Entity, TargetTest, TargetTest, TargetTest, TargetTest, boolean)`
- `a getAllyTargets(Entity, TargetTest, TargetTest, TargetTest)`
- `a getAllyTargets(Entity)`
- `a getAllyTargets(Entity, TargetTest)`
- `a getAllyTargets(Entity, TargetTest, TargetTest)`
- `a getProjectilesCore(Entity, boolean, TargetTest, TargetTest, TargetTest, TargetTest, TargetTest, TargetTest)`
- `boolean passesTests(Entity, Entity, TargetTest, TargetTest, TargetTest, TargetTest, TargetTest, TargetTest, TargetTest)`
- `a getProjectilesWrapper(Entity, boolean, TargetTest, TargetTest, TargetTest, TargetTest, TargetTest)`
- `Unit getRandomAllyTarget(Unit)`
- `Unit getSingleAllyTarget(Entity, TargetReducer)`
- `Unit getSingleAllyTarget(Entity, TargetReducer, TargetTest)`
- `Unit getRandomCombatTarget(Unit)`
- `Unit getSingleSameTeamTarget(Entity, TargetReducer)`
- `Unit getSingleSameTeamTarget(Entity, TargetReducer, TargetTest)`
- `Unit getSingleSameTeamTarget(Entity, TargetReducer, TargetTest, TargetTest)`
- `Unit getSingleSameTeamTarget(Entity, TargetReducer, TargetTest, TargetTest, TargetTest)`
- `a getUntargetableEnemies(Entity, TargetTest, TargetTest, TargetTest)`
- `boolean isAllyNotConspirator(Unit, Unit)`

### TriggerSkillAction (class)
`com.perblue.rpg.simulation.TriggerSkillAction`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (3):**
- `private boolean activated`
- `private CombatSkill skillToTrigger`
- `private Unit target`

**Methods (7):**
- `CombatSkill getSkill()`
- `void onReset()`
- `void update(long)`
- `void begin()`
- `void init(Unit, CombatSkill, Unit)`
- `Entity getTarget()`

### TweenAction (class)
`com.perblue.rpg.simulation.TweenAction`
extends `com.perblue.rpg.simulation.SimAction`

**Fields (5):**
- `private boolean enableAnimateSpeed`
- `private boolean hasReset`
- `protected boolean stepProjectile`
- `private h tweenManager`
- `protected boolean updateAnimElement`

**Methods (6):**
- `TweenAction setEnableAnimateSpeed(boolean)`
- `TweenAction setUpdateAnimElement(boolean)`
- `TweenAction setStepProjectile(boolean)`
- `TweenAction addTween(a)`
- `void onReset()`
- `void update(long)`

### WaitAction (class)
`com.perblue.rpg.simulation.WaitAction`
extends `com.perblue.rpg.simulation.AnimateAction`

**Fields (1):**
- `private IWaiting waitingTrigger`

**Methods (4):**
- `void onReset()`
- `void update(long)`
- `void init(Unit, IWaiting, AnimationType)`
- `void init(Unit, IWaiting, String)`

### WithinBoundsTargetTest (class)
`com.perblue.rpg.simulation.WithinBoundsTargetTest`
extends `com.perblue.rpg.simulation.TargetingHelper$PoolableTest`

**Fields (1):**
- `public float fudge`

**Methods (3):**
- `boolean canTarget(Entity, Entity)`
- `WithinBoundsTargetTest create()`
- `WithinBoundsTargetTest create(float)`

### AIHelper (class)
`com.perblue.rpg.simulation.ai.AIHelper`

**Fields (8):**
- `private static UnitAI ENTRANCED_UNIT_AI`
- `private static UnitAI IDLE_UNIT_AI`
- `private static final UnitAI NULL_UNIT_AI`
- `private static final Map UNIT_AI`
### com.perblue.rpg.simulation.ai.AIHelper [LOAD ERROR: com.perblue.rpg.simulation.ai.AIHelper and com.perblue.rpg.simulation.ai.AIHelper$AIMode disagree on InnerClasses attribute]

### AbyssDragonAI (class)
`com.perblue.rpg.simulation.ai.AbyssDragonAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (2):**
- `void doCheer(Unit)`
- `void onInit(Unit)`

### AngelicHeraldAI (class)
`com.perblue.rpg.simulation.ai.AngelicHeraldAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `Unit getDefaultTarget(Unit)`

### AnubisDragonAI (class)
`com.perblue.rpg.simulation.ai.AnubisDragonAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (2):**
- `void doCheer(Unit)`
- `void onInit(Unit)`

### BasicCombatUnitAI (class)
`com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Fields (9):**
- `private static final float COLUMN_DIST = 212.5`
- `private static final long DELAY_VICTORY_ANIMATION_MILLIS = 1000`
- `protected static final float FUDGE_DST = 40.0`
- `private static final float MAX_MOVE_STEP = 100.0`
- `protected static final float OVERLAPPED_DST = 116.666664`
- `protected static final float OVERLAPPED_DST2 = 13611.11`
- `private static final long SPACING_VICTORY_ANIMATION_MILLIS = 750`
- `private static final float X_AXIS_THRESHOLD = 400.0`
- `private Comparator ySorter`

**Methods (17):**
- `boolean canAttack(Unit)`
- `float checkForSpreadOut(Unit)`
- `CombatSkill getAutoAttack(Unit)`
- `boolean spreadOut(Unit)`
- `void doMoveAction(Unit, float, float, float)`
- `boolean canMove(Unit)`
- `boolean checkMoveInBounds(Unit)`
- `void doCheer(Unit)`
- `Unit getDefaultTarget(Unit)`
- `void moveTowardsTarget(Unit, Unit, CombatSkill, float)`
- `void onVictory(Unit, boolean)`
- `boolean handleRenderingActions(Unit, CombatSkill)`
- `boolean checkForOutOfBoundsTargets(Unit)`
- `CombatSkill getAvailableSkillToTrigger(Unit)`
- `void onInit(Unit)`
- `void onMoveEnd(Unit, MoveAction)`
- `void onIdle(Unit)`

### BasicIdleUnitAI (class)
`com.perblue.rpg.simulation.ai.BasicIdleUnitAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void onIdle(Unit)`

### BlackWingAI (class)
`com.perblue.rpg.simulation.ai.BlackWingAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void onInit(Unit)`

### BulwarkAngelAI (class)
`com.perblue.rpg.simulation.ai.BulwarkAngelAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `Unit getDefaultTarget(Unit)`

### CatapultKnightAI (class)
`com.perblue.rpg.simulation.ai.CatapultKnightAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### CauldronMonsterAI (class)
`com.perblue.rpg.simulation.ai.CauldronMonsterAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (3):**
- `void doMoveAction(Unit, float, float, float)`
- `void onInit(Unit)`
- `void onMoveEnd(Unit, MoveAction)`

### DarkHeroAI (class)
`com.perblue.rpg.simulation.ai.DarkHeroAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (2):**
- `void doCheer(Unit)`
- `Unit getDefaultTarget(Unit)`

### DemonTotemAI (class)
`com.perblue.rpg.simulation.ai.DemonTotemAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void onIdle(Unit)`

### DiggerMoleAI (class)
`com.perblue.rpg.simulation.ai.DiggerMoleAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### Direction (enum)
`com.perblue.rpg.simulation.ai.Direction`
extends `java.lang.Enum`

**Fields (3):**
- `private static final Direction[] $VALUES`
- `public static final Direction LEFT`
- `public static final Direction RIGHT`

**Methods (2):**
- `Direction[] values()`
- `Direction valueOf(String)`

**Constants (2):**
- LEFT
- RIGHT

### DragonSlayerAI (class)
`com.perblue.rpg.simulation.ai.DragonSlayerAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void onInit(Unit)`

### EntrancedUnitAI (class)
`com.perblue.rpg.simulation.ai.EntrancedUnitAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Fields (1):**
- `private static final int RANGE_TO_PIXELS = 10`

**Methods (2):**
- `MoveAction getMoveTowardsLanternAction(Unit, Unit, float)`
- `void onIdle(Unit)`

### GiantPlantAI (class)
`com.perblue.rpg.simulation.ai.GiantPlantAI`
extends `com.perblue.rpg.simulation.ai.ImmobileUnitAI`

**Methods (2):**
- `CombatSkill getAvailableSkillToTrigger(Unit)`
- `void onInit(Unit)`

### GiantPlantRootAI (class)
`com.perblue.rpg.simulation.ai.GiantPlantRootAI`

**Fields (2):**
- `public static final float KNOCKBACK_DIST = 300.0`
- `public static final float KNOCKBACK_RANGE = 300.0`

**Methods (3):**
- `void onInit(Unit)`
- `void onMoveEnd(Unit, MoveAction)`
- `void onIdle(Unit)`

### GrandHuntressAI (class)
`com.perblue.rpg.simulation.ai.GrandHuntressAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `CombatSkill getAvailableSkillToTrigger(Unit)`

### GreedyDragonAI (class)
`com.perblue.rpg.simulation.ai.GreedyDragonAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void onInit(Unit)`

### HeadCrabAI (class)
`com.perblue.rpg.simulation.ai.HeadCrabAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void onIdle(Unit)`

### ImmobileUnitAI (class)
`com.perblue.rpg.simulation.ai.ImmobileUnitAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (3):**
- `boolean checkMoveInBounds(Unit)`
- `void moveTowardsTarget(Unit, Unit, CombatSkill, float)`
- `boolean checkForOutOfBoundsTargets(Unit)`

### KamizakeGnomeAI (class)
`com.perblue.rpg.simulation.ai.KamizakeGnomeAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### KaraokeKingAI (class)
`com.perblue.rpg.simulation.ai.KaraokeKingAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### LastDefenderAI (class)
`com.perblue.rpg.simulation.ai.LastDefenderAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### MagicDragonAI (class)
`com.perblue.rpg.simulation.ai.MagicDragonAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### MushroomAI (class)
`com.perblue.rpg.simulation.ai.MushroomAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### NpcAbyssDragonAI (class)
`com.perblue.rpg.simulation.ai.NpcAbyssDragonAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### NpcAntAI (class)
`com.perblue.rpg.simulation.ai.NpcAntAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void onInit(Unit)`

### NpcAnubisDragonAI (class)
`com.perblue.rpg.simulation.ai.NpcAnubisDragonAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### NpcBossAbyssDragonAI (class)
`com.perblue.rpg.simulation.ai.NpcBossAbyssDragonAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### NpcBossAndragonusTheFirstAI (class)
`com.perblue.rpg.simulation.ai.NpcBossAndragonusTheFirstAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### NpcBossAnubisDragonAI (class)
`com.perblue.rpg.simulation.ai.NpcBossAnubisDragonAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### NpcBossUmlautthefifthFirstAI (class)
`com.perblue.rpg.simulation.ai.NpcBossUmlautthefifthFirstAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void onInit(Unit)`

### NpcBreakerMkiiAI (class)
`com.perblue.rpg.simulation.ai.NpcBreakerMkiiAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### NpcFleaDemonAI (class)
`com.perblue.rpg.simulation.ai.NpcFleaDemonAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (2):**
- `void doMoveAction(Unit, float, float, float)`
- `Unit getDefaultTarget(Unit)`

### NpcSinisterAssailantAI (class)
`com.perblue.rpg.simulation.ai.NpcSinisterAssailantAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (3):**
- `void doCheer(Unit)`
- `void onInit(Unit)`
- `void onIdle(Unit)`

### NpcUmlautthefifthFirstAI (class)
`com.perblue.rpg.simulation.ai.NpcUmlautthefifthFirstAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void onInit(Unit)`

### PlagueSkulkerAI (class)
`com.perblue.rpg.simulation.ai.PlagueSkulkerAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void onInit(Unit)`

### PlantSoulAI (class)
`com.perblue.rpg.simulation.ai.PlantSoulAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

### ShadowofSvenAI (class)
`com.perblue.rpg.simulation.ai.ShadowofSvenAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### SkeletonDeerAI (class)
`com.perblue.rpg.simulation.ai.SkeletonDeerAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Fields (2):**
- ` boolean hasCharged`
- ` boolean willCharge`

**Methods (2):**
- `void onInit(Unit)`
- `void onIdle(Unit)`

### SnapperBoneAI (class)
`com.perblue.rpg.simulation.ai.SnapperBoneAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### SniperWolfAI (class)
`com.perblue.rpg.simulation.ai.SniperWolfAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### SojournerSorceressAI (class)
`com.perblue.rpg.simulation.ai.SojournerSorceressAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### SpiderQueenAI (class)
`com.perblue.rpg.simulation.ai.SpiderQueenAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `Unit getDefaultTarget(Unit)`

### StepladderBrothersAI (class)
`com.perblue.rpg.simulation.ai.StepladderBrothersAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### SunSeekerAI (class)
`com.perblue.rpg.simulation.ai.SunSeekerAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### TitanBuffUnitAI (class)
`com.perblue.rpg.simulation.ai.TitanBuffUnitAI`

**Methods (3):**
- `void onInit(Unit)`
- `void onMoveEnd(Unit, MoveAction)`
- `void onIdle(Unit)`

### TrollBlobAI (class)
`com.perblue.rpg.simulation.ai.TrollBlobAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### UmlautTheFirstAI (class)
`com.perblue.rpg.simulation.ai.UmlautTheFirstAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### UnitAI (interface)
`com.perblue.rpg.simulation.ai.UnitAI`

**Methods (3):**
- `void onInit(Unit)`
- `void onMoveEnd(Unit, MoveAction)`
- `void onIdle(Unit)`

### UnripeMythologyAI (class)
`com.perblue.rpg.simulation.ai.UnripeMythologyAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### VultureDragonAI (class)
`com.perblue.rpg.simulation.ai.VultureDragonAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (2):**
- `void onInit(Unit)`
- `void onIdle(Unit)`

### WhiteTigerAI (class)
`com.perblue.rpg.simulation.ai.WhiteTigerAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void doCheer(Unit)`

### ZombieSquireAI (class)
`com.perblue.rpg.simulation.ai.ZombieSquireAI`
extends `com.perblue.rpg.simulation.ai.BasicCombatUnitAI`

**Methods (1):**
- `void onIdle(Unit)`

### AbyssDragonSkill0 (class)
`com.perblue.rpg.simulation.skills.AbyssDragonSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `protected static final long BEAM_DURATION = 300`
- `private static final int PARTICLE_DURATION = 500`
- `protected BaseProjectileEffect projectileEffect`
- `private a targets`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void createProjectile(Entity)`
- `void onEvent(Event)`
- `void onInitialize()`

### AbyssDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.AbyssDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private static final float OFFSET = 800.0`
- `private EnvEntity rainGround`
- `private q rainLeft`
- `private q rainRight`

**Methods (12):**
- `String getCastAnimation()`
- `void onCast()`
- `AnimationStateAdapter createRainGroundAnimationListener()`
- `void onInitialize()`

### AbyssDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.AbyssDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `void onInitialize()`
- `void onDeath()`

### AbyssDragonSkill4 (class)
`com.perblue.rpg.simulation.skills.AbyssDragonSkill4`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private static final int PARTICLE_DURATION = 500`
- `protected Bone bone`
- `private a targets`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### AncientDwarfSkill0 (class)
`com.perblue.rpg.simulation.skills.AncientDwarfSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (1):**
- `void onCast()`

### AncientDwarfSkill1 (class)
`com.perblue.rpg.simulation.skills.AncientDwarfSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private SkillDamageProvider healProvider`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void onEvent(Event)`
- `void onInitialize()`

### AncientDwarfSkill2 (class)
`com.perblue.rpg.simulation.skills.AncientDwarfSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private EventSkills eventSkill`
- `private Unit lockonTarget`
- `private SoundData sound`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onEvent(Event)`

### AncientDwarfSkill3 (class)
`com.perblue.rpg.simulation.skills.AncientDwarfSkill3`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private SkillDamageProvider healProvider`

**Methods (1):**
- `void onInitialize()`

### AncientDwarfSkill4 (class)
`com.perblue.rpg.simulation.skills.AncientDwarfSkill4`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### AngelDragonSkill0 (class)
`com.perblue.rpg.simulation.skills.AngelDragonSkill0`
extends `com.perblue.rpg.simulation.skills.HealSkill`

**Methods (2):**
- `void onInitialize()`
- `void playHealSound()`

### AngelDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.AngelDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.MultiAnimationSkill`

**Fields (4):**
- `private static a ANIMATIONS`
- `private static ParticleType particle`
- `private z buffBoosts`
- `private Unit deadAllyTarget`

**Methods (8):**
- `void onTriggerEffect(Event)`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `void setParticleType()`
- `void targetDeadAlly()`
- `a getCastAnimations()`

### AngelDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.AngelDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.MultiAnimationSkill`

**Fields (1):**
- `private static a ANIMATIONS`

**Methods (3):**
- `void onTriggerEffect(Event)`
- `void onInitialize()`
- `a getCastAnimations()`

### AngelDragonSkill3 (class)
`com.perblue.rpg.simulation.skills.AngelDragonSkill3`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onInitialize()`

### AngelDragonSkill4 (class)
`com.perblue.rpg.simulation.skills.AngelDragonSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (4):**
- `private static long gongSoundIntervalMilliseconds`
- `private String eventListenerId`
- `private EventListener healListener`
- `private long lastGongSoundTimeMilliseconds`

**Methods (4):**
- `void onInitialize()`
- `void onUnitHeal()`
- `void onRemove()`

### AngelicHeraldSkill0 (class)
`com.perblue.rpg.simulation.skills.AngelicHeraldSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Fields (2):**
- `private int attackCount`
- `private AngelicHeraldSkill2 skill2`

**Methods (5):**
- `void onCast()`
- `void onEvent(Event)`
- `boolean onActivate()`
- `boolean shouldAutoTarget()`
- `void onInitialize()`

### AngelicHeraldSkill1 (class)
`com.perblue.rpg.simulation.skills.AngelicHeraldSkill1`
extends `com.perblue.rpg.simulation.skills.generic.MinionSummoningSkill`

**Fields (2):**
- `private int avengerLevel`
- `private int maxAvengers`

**Methods (12):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `boolean shouldCheckIfAllTargetsInBound()`
- `void acquireTarget()`
- `void onInitialize()`
- `int getMinionLevel()`
- `boolean canSummonMoreMinions()`
- `void queueMinionEntranceActions(Unit)`
- `UnitData getMinionData(UnitType)`

### AngelicHeraldSkill2 (class)
`com.perblue.rpg.simulation.skills.AngelicHeraldSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void onEvent(Event)`
- `boolean shouldAutoActivate()`
- `void onInitialize()`

### AngelicHeraldSkill4 (class)
`com.perblue.rpg.simulation.skills.AngelicHeraldSkill4`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (1):**
- `protected SkillDamageProvider damageProvider`

**Methods (5):**
- `boolean onActivate()`
- `float getTriggerRange()`
- `boolean isTargetAvailable()`
- `boolean shouldAutoActivate()`
- `void onInitialize()`

### AngelicHeraldSkill5 (class)
`com.perblue.rpg.simulation.skills.AngelicHeraldSkill5`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (6):**
- `private static final String ANIM_SKILL_END = skill5_end`
- `private static final String ANIM_SKILL_LOOP = skill5_loop`
- `private static final String ANIM_SKILL_START = skill5_start`
- `private a allies`
- `private boolean onSkill`
- `private int targetNum`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void allySearch()`
- `void enemySearch()`

### AquaticManSkill1 (class)
`com.perblue.rpg.simulation.skills.AquaticManSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `public static final float KNOCK_BACK_KRAKEN_KING = 0.1`
- `public static final float KNOCK_BACK_TIME = 0.3`
- `private UntargetedDirectionalProjectileHandler wave`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### AquaticManSkill2 (class)
`com.perblue.rpg.simulation.skills.AquaticManSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `public static final int NUMBER_OF_HITS = 4`
- `private int damageTicksLeft`
- `private long damageTimeLeft`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void onComplete()`
- `void onUpdate(long)`
- `boolean shouldStillUpdate()`
- `void doDamage()`

### AquaticManSkill3 (class)
`com.perblue.rpg.simulation.skills.AquaticManSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private a allEnemies`
- `private a debuffedEnemies`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`

### AquaticManSkill5 (class)
`com.perblue.rpg.simulation.skills.AquaticManSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onInitialize()`

### BansheeSkill1 (class)
`com.perblue.rpg.simulation.skills.BansheeSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (12):**
- `private static final int ACTIVATION_ENERGY = 100`
- `private static final String ANIM_SKILL1_END = skill1_end`
- `private static final String ANIM_SKILL1_LOOP = skill1_loop`
- `private static final String ANIM_SKILL1_START = skill1_start`
- `private final Runnable addDebuffs`
- `private EnvEntity breathEntity`
- `private boolean canFreeze`
- `private boolean canManuallyCancel`
- `private final IDamageProvider healProvider`
- `private boolean isScreaming`
- `private EventListener listener`
- `private String listenerID`

**Methods (30):**
- `void onEndStage()`
- `boolean onActivate()`
- `void reduceEnergy()`
- `void activateSecondary()`
- `void acquireTarget()`
- `boolean canFreeze()`
- `boolean energyBaselineCheck()`
- `void onInitialize()`
- `void onCancel()`
- `void stopScreaming()`
- `void startScreaming()`

### BansheeSkill3 (class)
`com.perblue.rpg.simulation.skills.BansheeSkill3`
extends `com.perblue.rpg.simulation.skills.generic.MultiAnimationSkill`

**Fields (8):**
- `private static a ANIMATIONS`
- `protected static final String EVENT_BANSHEE_FADE_IN_SHADOW = shadow_fadein_trigger_effect`
- `protected static final String EVENT_BANSHEE_FADE_OUT_SHADOW = shadow_fadeout_trigger_effect`
- `protected static final String EVENT_BANSHEE_TELEPORT = teleport_trigger_effect`
- `protected static final String EVENT_BANSHEE_TELEPORT_BACK = teleport_back_trigger_effect`
- `private IDamageProvider healProvider`
- `private IBuff selfBuff`
- `private q startingPosition`

**Methods (10):**
- `void onTriggerEffect(Event)`
- `boolean onActivate()`
- `void acquireTarget()`
- `boolean canActivate()`
- `void onComplete()`
- `a getCastAnimations()`

### BardbarianSkill0 (class)
`com.perblue.rpg.simulation.skills.BardbarianSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Fields (2):**
- `private RaidInstance scene`
- `private BardbarianSkill3 skill3`

**Methods (2):**
- `boolean canActivate()`
- `void onPostInitialize()`

### BardbarianSkill1 (class)
`com.perblue.rpg.simulation.skills.BardbarianSkill1`
extends `com.perblue.rpg.simulation.skills.generic.MultiAnimationSkill`

**Fields (2):**
- `private static a ANIMATIONS`
- `private z buffBoosts`

**Methods (4):**
- `void onTriggerEffect(Event)`
- `boolean onActivate()`
- `void onInitialize()`
- `a getCastAnimations()`

### BardbarianSkill2 (class)
`com.perblue.rpg.simulation.skills.BardbarianSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### BardbarianSkill3 (class)
`com.perblue.rpg.simulation.skills.BardbarianSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private RaidInstance scene`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onPostInitialize()`

### BardbarianSkill5 (class)
`com.perblue.rpg.simulation.skills.BardbarianSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private BardbarianLegendaryWatcher buff`

**Methods (8):**
- `void restorePersistentState(HeroBattleData)`
- `void savePersistentState(HeroBattleData)`
- `void updateFromPreviousStage(CombatSkill)`
- `void onInitialize()`

### BlackWingSkill1 (class)
`com.perblue.rpg.simulation.skills.BlackWingSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private SkillDamageProvider DOTProvider`
- `private z debuffSubtractions`
- `private BaseProjectileEffect projectileEffect`

**Methods (24):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void acquireTarget()`
- `boolean canActivate()`
- `void onInitialize()`

### BlackWingSkill2 (class)
`com.perblue.rpg.simulation.skills.BlackWingSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- `public boolean hasBeenActivated`
- `private z revivedBuffBoosts`

**Methods (11):**
- `void revive()`
- `void restorePersistentState(HeroBattleData)`
- `void savePersistentState(HeroBattleData)`
- `void updateFromPreviousStage(CombatSkill)`
- `void onInitialize()`
- `void onRemove()`

### BlackWingSkill4 (class)
`com.perblue.rpg.simulation.skills.BlackWingSkill4`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- ` boolean hasBeenActivated`
- `private EventListener listener`
- `private String listenerID`
- ` boolean wasAllyDead`

**Methods (7):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onRemove()`

### BoneDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.BoneDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private final int RANGE`
- `private boolean hasLaunchedProjectile`
- `private BaseProjectileEffect projectileEffect`

**Methods (8):**
- `String getCastAnimation()`
- `void onCast()`
- `void damageSelf()`
- `void onInitialize()`
- `void onComplete()`

### BoneDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.BoneDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private static final int TICK_INTERVAL = 1000`
- `private SkillDamageProvider dotProvider`
- `private BaseProjectileEffect projectileEffect`
- `private z statDebuff`

**Methods (10):**
- `String getCastAnimation()`
- `void onCast()`
- `CombatSkill getSkillSource()`
- `void onInitialize()`

### BoneDragonSkill3 (class)
`com.perblue.rpg.simulation.skills.BoneDragonSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private static final int TICK_INTERVAL = 1000`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `CombatSkill getSkillSource()`
- `void onInitialize()`

### BoneDragonSkill5 (class)
`com.perblue.rpg.simulation.skills.BoneDragonSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onFinalInit()`

### BossBattleFieldBuffSkill (class)
`com.perblue.rpg.simulation.skills.BossBattleFieldBuffSkill`
extends `com.perblue.rpg.simulation.skills.generic.MinionSummoningSkill`

**Fields (6):**
- `private static final Long LOOP_END_TIME = 1000000000`
- `private static final q NPC_POP_POS`
- ` List fieldBuffList`
- ` Map loopTimerList`
- ` BossBattleFieldBuffNpcPop nowNpcPopData`
- ` Long worldTimer`

**Methods (21):**
- `String getCastAnimation()`
- `void onCast()`
- `Long getResetBuffTime(BossBattleFieldBuff, boolean)`
- `void updateBuff(BossBattleFieldBuff)`
- `void updateBuffNpcPop(BossBattleFieldBuffNpcPop)`
- `void updateBuffStatType(BossBattleFieldBuffStatType)`
- `void updateBuffDamageType(BossBattleFieldBuffDamageType)`
- `void updateBuffBattleStatus(BossBattleFieldBuffBattleStatus)`
- `void initializeOnUnit(Unit, BossBattleFieldBuffStatType)`
- `a getTargetUnits(BossBattleFieldBuff)`
- `void createVFX(BossBattleFieldBuff, a)`
- `void setFieldBuff(List)`
- `int getMinionLevel()`
- `boolean canSummonMoreMinions()`
- `void queueMinionEntranceActions(Unit)`
- `UnitData getMinionData(UnitType)`
- `void update(long)`

### BrozerkerSkill1 (class)
`com.perblue.rpg.simulation.skills.BrozerkerSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`

### BrozerkerSkill2 (class)
`com.perblue.rpg.simulation.skills.BrozerkerSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private SkillDamageProvider healProvider`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void acquireTarget()`
- `boolean shouldAutoTarget()`
- `void initialize(Unit, SkillType, int)`

### BrozerkerSkill3 (class)
`com.perblue.rpg.simulation.skills.BrozerkerSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void initialize(Unit, SkillType, int)`

### BrozerkerSkill6 (class)
`com.perblue.rpg.simulation.skills.BrozerkerSkill6`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private boolean chkDeath`

**Methods (1):**
- `void onDeath()`

### BulwarkAngelSkill0 (class)
`com.perblue.rpg.simulation.skills.BulwarkAngelSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (2):**
- `boolean shouldAutoTarget()`
- `void onInitialize()`

### BulwarkAngelSkill1 (class)
`com.perblue.rpg.simulation.skills.BulwarkAngelSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private static final float LOOP_ANIMATION_DURATION_OFFSET_IN_SECONDS = -0.05`
- `private static final float TARGET_LANDING_POSITION_OFFSET = 350.0`
- `private SkillDamageProvider holyDamageProvider`
- `private float scaledVisualDurationInMilliseconds`

**Methods (7):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `boolean shouldCheckIfAllTargetsInBound()`
- `boolean canActivate()`
- `float getVisualDuration()`
- `void onInitialize()`

### BulwarkAngelSkill2 (class)
`com.perblue.rpg.simulation.skills.BulwarkAngelSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (4):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### BulwarkAngelSkill3 (class)
`com.perblue.rpg.simulation.skills.BulwarkAngelSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (4):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### BulwarkAngelSkill4 (class)
`com.perblue.rpg.simulation.skills.BulwarkAngelSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onFinalInit()`

### BurntOneSkill0 (class)
`com.perblue.rpg.simulation.skills.BurntOneSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `public static final String PASSIVE_ATTACK_ANIMATION_LOOP = skill1_passive_loop`
- `private BurntOneSkill1 skill1`
- `private SkillDamageProvider splashDamageProvider`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void doSplashDamage()`
- `void onPostInitialize()`

### BurntOneSkill1 (class)
`com.perblue.rpg.simulation.skills.BurntOneSkill1`
extends `com.perblue.rpg.simulation.skills.generic.AnimationSkill`

**Fields (13):**
- `public static final String ANIM_SKILL1_ACTIVE_END = skill1_active_end`
- `public static final String ANIM_SKILL1_ACTIVE_START = skill1_active_start`
- `public static final String IDLE_SPECIAL_END = idle_special_end`
- `public static final String IDLE_SPECIAL_START = idle_special_start`
- `private static float PORTAL_OFFSET`
- `private SimpleDurationBuff attackSpeedBuff`
- `private float durationCooldown`
- `private SkillDamageProvider hitDamageProvider`
- `public boolean isPassiveActivated`
- `private SkillDamageProvider lavaDamageProvider`
- `private final a listeners`
- `private float passiveSkillAutoDuration`
- `private UntargetableBuff untargetableBuff`

**Methods (13):**
- `void addActivationActions()`
- `float calculateOffset()`
- `void deactivatePassive()`
- `void toggleSkill2Activation()`
- `void resetPassiveCooldown()`
- `void activatePassive()`
- `void onEvent(Event)`
- `boolean shouldCheckIfAllTargetsInBound()`
- `boolean shouldAutoActivate()`
- `void onPostInitialize()`
- `void onRemove()`
- `void update(long)`

### CatapultKnightSkill1 (class)
`com.perblue.rpg.simulation.skills.CatapultKnightSkill1`
extends `com.perblue.rpg.simulation.skills.generic.MultiAnimationSkill`

**Fields (8):**
- `private static a ANIMATIONS`
- `public static final int MAX_TARGETS = 3`
- `public static final int PROJECTILES_PER_SHOT = 5`
- `protected Comparator compare`
- `protected EmptyProjectileEffect noDamageEffect`
- `protected BaseProjectileEffect projectileEffect`
- `protected int projectileNum`
- `private a targets`

**Methods (10):**
- `void onTriggerEffect(Event)`
- `int getProjectileNum()`
- `boolean onActivate()`
- `void onInitialize()`
- `void onComplete()`
- `a getCastAnimations()`

### CatapultKnightSkill2 (class)
`com.perblue.rpg.simulation.skills.CatapultKnightSkill2`
extends `com.perblue.rpg.simulation.skills.generic.MultiAnimationSkill`

**Fields (2):**
- `private static a ANIMATIONS`
- `private BaseProjectileEffect projectileEffect`

**Methods (6):**
- `void onTriggerEffect(Event)`
- `boolean onActivate()`
- `void onInitialize()`
- `a getCastAnimations()`

### CatapultKnightSkill3 (class)
`com.perblue.rpg.simulation.skills.CatapultKnightSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### CatapultKnightSkill5 (class)
`com.perblue.rpg.simulation.skills.CatapultKnightSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onInitialize()`

### CentaurOfAttentionSkill1 (class)
`com.perblue.rpg.simulation.skills.CentaurOfAttentionSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (11):**
- `public static final int TOTAL_PROJECTILES = 10`
- `private final int LAST_CYCLE`
- `private final int TOTAL_CYCLES`
- `private int cycleCount`
- `private int extraArrows`
- `private SkillDamageAndEngergyProvider legendaryDamageProvider`
- `private int projectileCount`
- `private BaseProjectileEffect projectileEffect`
- `private CentaurOfAttentionSkill5 skill5`
- `private int totalProjectiles`
- `private int totalProjectilesFired`

**Methods (5):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`
- `void onPostInitialize()`

### CentaurOfAttentionSkill2 (class)
`com.perblue.rpg.simulation.skills.CentaurOfAttentionSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private z debuffReductions`
- `private BaseProjectileEffect projectileEffect`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### CentaurOfAttentionSkill3 (class)
`com.perblue.rpg.simulation.skills.CentaurOfAttentionSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### CentaurOfAttentionSkill5 (class)
`com.perblue.rpg.simulation.skills.CentaurOfAttentionSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (3):**
- `private int arrowCount`
- `private EventListener listener`
- `private String listenerID`

**Methods (9):**
- `int getArrowCount()`
- `void setArrowCount(int)`
- `void restorePersistentState(HeroBattleData)`
- `void savePersistentState(HeroBattleData)`
- `void updateFromPreviousStage(CombatSkill)`
- `void onInitialize()`
- `void onRemove()`

### CentaurOfAttentionSkill6 (class)
`com.perblue.rpg.simulation.skills.CentaurOfAttentionSkill6`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- ` SkillDamageProvider noDamageProvider`
- `private BaseProjectileEffect projectileEffect`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### ClawManSkill0 (class)
`com.perblue.rpg.simulation.skills.ClawManSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `protected BaseProjectileEffect projectileEffect`
- `private ClawManPoisonBuff skill3PoisonBuff`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### ClawManSkill1 (class)
`com.perblue.rpg.simulation.skills.ClawManSkill1`
extends `com.perblue.rpg.simulation.skills.generic.AnimationSkill`

**Fields (9):**
- `private final int ATTACK_TEAM`
- `private final int DEFENSE_TEAM`
- `private float activeDelay`
- `private float activeDuration`
- `private ClawManSlowDebuff clawManSlowDebuff`
- `protected SkillDamageProvider damageProvider`
- `private float endDelay`
- `private float endDuration`
- `private ClawManPoisonBuff skill3PoisonBuff`

**Methods (4):**
- `void addActivationActions()`
- `void onTriggerEffect(Event)`
- `void onInitialize()`
- `void onComplete()`

### ClawManSkill2 (class)
`com.perblue.rpg.simulation.skills.ClawManSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `protected static final int TICK_INTERVAL = 1000`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onTriggerEffect(Event)`

### ClawManSkill3 (class)
`com.perblue.rpg.simulation.skills.ClawManSkill3`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (5):**
- `void onInitialize()`
- `void onDeath()`

### ClawManSkill4 (class)
`com.perblue.rpg.simulation.skills.ClawManSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `boolean onActivate()`
- `void onInitialize()`

### CosmicElfSkill0 (class)
`com.perblue.rpg.simulation.skills.CosmicElfSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `public static final long BEAM_DURATION = 199`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`
- `void onPostInitialize()`

### CosmicElfSkill1 (class)
`com.perblue.rpg.simulation.skills.CosmicElfSkill1`
extends `com.perblue.rpg.simulation.skills.generic.MultiAnimationSkill`

**Fields (1):**
- `private static final a CAST_ANIMATIONS`

**Methods (3):**
- `void onTriggerEffect(Event)`
- `boolean onActivate()`
- `a getCastAnimations()`

### CosmicElfSkill2 (class)
`com.perblue.rpg.simulation.skills.CosmicElfSkill2`
extends `com.perblue.rpg.simulation.skills.generic.MultiAnimationSkill`

**Fields (1):**
- `private static final a CAST_ANIMATIONS`

**Methods (4):**
- `void onTriggerEffect(Event)`
- `boolean onActivate()`
- `void acquireTarget()`
- `a getCastAnimations()`

### CosmicElfSkill3 (class)
`com.perblue.rpg.simulation.skills.CosmicElfSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### CosmicElfSkill5 (class)
`com.perblue.rpg.simulation.skills.CosmicElfSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private SkillDamageProvider damageProvider`

**Methods (4):**
- `void doDamageTo(Entity)`
- `int popShieldsAndGetExtraDamage(Entity, Entity)`
- `void onInitialize()`

### CosmicElfSkill6 (class)
`com.perblue.rpg.simulation.skills.CosmicElfSkill6`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- `private int alliesCount`
- `public boolean onActivate`

**Methods (5):**
- `void checkStats(Unit, float, float, int)`
- `int getAlliesCount(a, a)`
- `boolean onActivate()`
- `boolean canActivate()`
- `void skill()`

### CrimsonWitchSkill0 (class)
`com.perblue.rpg.simulation.skills.CrimsonWitchSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `protected boolean hasHit`
- `protected EmptyProjectileEffect projectileEffect`

**Methods (10):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void onInitialize()`

### CrimsonWitchSkill1 (class)
`com.perblue.rpg.simulation.skills.CrimsonWitchSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private BaseProjectileEffect effect`
- `private CombatSkill skill5`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `Projectile createProjectile(int)`
- `boolean canBeDodged()`
- `void onInitialize()`
- `void onPostInitialize()`

### CrimsonWitchSkill2 (class)
`com.perblue.rpg.simulation.skills.CrimsonWitchSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (1):**
- `private z buffBoosts`

**Methods (3):**
- `boolean onActivate()`
- `void onInitialize()`
- `void onTeamInit()`

### CrimsonWitchSkill3 (class)
`com.perblue.rpg.simulation.skills.CrimsonWitchSkill3`
extends `com.perblue.rpg.simulation.skills.CrimsonWitchSkill0`

**Fields (3):**
- `private static final float DAMAGE_SUBTRACTION_RATE = 0.2`
- `private static final String FEEL_MY_WRAITH_STUN = FEEL_MY_WRAITH_STUN`
- `private CombatSkill skill5`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canBeDodged()`
- `void onInitialize()`
- `void onPostInitialize()`

### CursedStatueSkill0 (class)
`com.perblue.rpg.simulation.skills.CursedStatueSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (1):**
- `void onCast()`

### CursedStatueSkill1 (class)
`com.perblue.rpg.simulation.skills.CursedStatueSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (6):**
- `private a deleteList`
- `private a enemyList`
- `private EventListener listener`
- `private String listenerID`
- `private BaseProjectileEffect projectileEffect`
- `private SkillDamageProvider specialDamageProvider`

**Methods (24):**
- `String getCastAnimation()`
- `void onCast()`
- `void acquireTarget()`
- `void onInitialize()`
- `void onRemove()`

### CursedStatueSkill2 (class)
`com.perblue.rpg.simulation.skills.CursedStatueSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- ` Entity target2`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### CursedStatueSkill3 (class)
`com.perblue.rpg.simulation.skills.CursedStatueSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### CursedStatueSkill4 (class)
`com.perblue.rpg.simulation.skills.CursedStatueSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- ` SkillDamageProvider skill0DOTProvider`
- ` SkillDamageProvider skill1Provider`

**Methods (2):**
- `void onPostInitialize()`

### CyclopsWizardSkill0 (class)
`com.perblue.rpg.simulation.skills.CyclopsWizardSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `protected static final long BEAM_DURATION = 299`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### CyclopsWizardSkill1 (class)
`com.perblue.rpg.simulation.skills.CyclopsWizardSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `protected static final int TICK_INTERVAL = 1000`
- `private a hitEnemies`
- `private EmptyProjectileEffect projectileEffect`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### CyclopsWizardSkill2 (class)
`com.perblue.rpg.simulation.skills.CyclopsWizardSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### CyclopsWizardSkill3 (class)
`com.perblue.rpg.simulation.skills.CyclopsWizardSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `protected static final long BEAM_DURATION = 299`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void createProjectile(Entity, Entity)`
- `void onInitialize()`

### CyclopsWizardSkill4 (class)
`com.perblue.rpg.simulation.skills.CyclopsWizardSkill4`
extends `com.perblue.rpg.simulation.skills.generic.AllyBuffBoostSkill`

**Methods (2):**
- `IBuff makeBuff()`
- `void setData(Object)`

### DarkDraculSkill1 (class)
`com.perblue.rpg.simulation.skills.DarkDraculSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (6):**
- `private static final long MAX_EFFECT_DELAY = 300`
- `private static final float STARTX_OFF = 400.0`
- `private static final float STARTY_OFF = 800.0`
- `private static final int TICK_INTERVAL = 500`
- `private int numberOfHits`
- `private EmptyProjectileEffect projectileEffect`

**Methods (16):**
- `String getCastAnimation()`
- `void onCast()`
- `void gatherHealth(Entity, float)`
- `void onInitialize()`
- `void onDeath()`

### DarkDraculSkill2 (class)
`com.perblue.rpg.simulation.skills.DarkDraculSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### DarkDraculSkill3 (class)
`com.perblue.rpg.simulation.skills.DarkDraculSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### DarkDraculSkill5 (class)
`com.perblue.rpg.simulation.skills.DarkDraculSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onInitialize()`

### DarkHeroSkill0 (class)
`com.perblue.rpg.simulation.skills.DarkHeroSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (7):**
- `void onEvent(Event)`
- `float getTriggerRange()`
- `boolean shouldAutoTarget()`
- `void onInitialize()`

### DarkHeroSkill1 (class)
`com.perblue.rpg.simulation.skills.DarkHeroSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (9):**
- `private static final String SKILL1END = skill1_end`
- `private static final String SKILL1LOOP = skill1_loop`
- `private static final String SKILL1START = skill1_start`
- `private static final int SKILL4_TICK_INTERVAL = 1500`
- `private AnimationStateAdapter castingEventListener`
- `private SkillDamageProvider damageProvider`
- `private float damageScalar`
- `private BaseProjectileEffect effect`
- `private boolean wasCastOrCancelled`

**Methods (26):**
- `void onCast()`
- `void removeCharge(boolean)`
- `void startCharging()`
- `boolean onActivate()`
- `void activateSecondary()`
- `void onInitialize()`
- `void onComplete()`
- `void onDeath()`

### DarkHeroSkill2 (class)
`com.perblue.rpg.simulation.skills.DarkHeroSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private BaseProjectileEffect effect`
- `private RaidInstance scene`
- `private Unit skillTarget`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `Unit getSkillTarget()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onPostInitialize()`

### DarkHeroSkill3 (class)
`com.perblue.rpg.simulation.skills.DarkHeroSkill3`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

### DarkHeroSkill4 (class)
`com.perblue.rpg.simulation.skills.DarkHeroSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private static CombatSkill skill`

**Methods (2):**
- `void onInitialize()`

### DarkHorseSkill1 (class)
`com.perblue.rpg.simulation.skills.DarkHorseSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean withinBounds(Entity)`
- `void onInitialize()`

### DarkHorseSkill2 (class)
`com.perblue.rpg.simulation.skills.DarkHorseSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### DarkHorseSkill3 (class)
`com.perblue.rpg.simulation.skills.DarkHorseSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `int getSkillLevel()`
- `float getOffset(Entity)`

### DeepDragonSkill0 (class)
`com.perblue.rpg.simulation.skills.DeepDragonSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (1):**
- `void onInitialize()`

### DeepDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.DeepDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Methods (9):**
- `boolean onActivate()`
- `void reduceEnergy()`
- `void activateSecondary()`
- `boolean energyBaselineCheck()`
- `void onInitialize()`
- `void onCancel()`

### DeepDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.DeepDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private final long DURATION`
- `private SkillDamageProvider fallDamage`

**Methods (16):**
- `String getCastAnimation()`
- `void onCast()`
- `void activateGeyser()`
- `void onInitialize()`
- `void onCancel()`

### DeepDragonSkill3 (class)
`com.perblue.rpg.simulation.skills.DeepDragonSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private a hitEnemies`
- `private EmptyProjectileEffect projectileEffect`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### DeepDragonSkill6 (class)
`com.perblue.rpg.simulation.skills.DeepDragonSkill6`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void addBuffToTargets(Unit)`
- `void onInitialize()`

### DemonTotemSkill1 (class)
`com.perblue.rpg.simulation.skills.DemonTotemSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (6):**
- `private q furthestEnemyPosition`
- `private float maxTotalHp`
- `private long parentID`
- `protected z sections`
- `private HashSet sectionsCompletedInitialAttack`
- `private boolean wasActivated`

**Methods (29):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean wasActivated()`
- `int getSectionsHP()`
- `void onSectionInitialAttack(Unit)`
- `float getNormalisedSectionsEnergy()`
- `void makeSection(String, q)`
- `void successionBuff(Unit)`
- `float getMaxTotalHp()`
- `long getParentID()`
- `void onEndStage()`
- `String getSectionType(Unit)`
- `boolean isUnitInPlayableBounds(Entity)`
- `boolean onActivate()`
- `void reduceEnergy()`
- `boolean areTargetsInRange()`
- `boolean hasStunBuffs(Entity)`
- `boolean canActivate()`
- `void onInitialize()`
- `void onTeamInit()`
- `float getMaxHP()`
- `void onRemove()`

### DemonTotemSkill2 (class)
`com.perblue.rpg.simulation.skills.DemonTotemSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Methods (3):**
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`

### DemonTotemSkill3 (class)
`com.perblue.rpg.simulation.skills.DemonTotemSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### DemonTotemSkill5 (class)
`com.perblue.rpg.simulation.skills.DemonTotemSkill5`
extends `com.perblue.rpg.simulation.skills.generic.AnimationSkill`

**Fields (5):**
- `private static final float MAX_PERCENT_HEALTH_TO_EXECUTE = 0.33`
- `private SkillDamageProvider damageProvider`
- `private z sections`
- `private z sectionsActionMap`
- `private boolean shouldExecute`

**Methods (21):**
- `void addActivationActions()`
- `void onTriggerEffect(Event)`
- `void addSectionAction(Unit, SimAction)`
- `void playAnimation(Unit)`
- `void setSections(z)`
- `String getSectionType(Unit)`
- `boolean isUnitInPlayableBounds(Entity)`
- `boolean hasStunBuffs(Entity)`
- `boolean canActivate()`
- `void onInitialize()`
- `void onComplete()`
- `boolean shouldStillUpdate()`
- `boolean isBoss(Unit)`

### DemonTotemSkill6 (class)
`com.perblue.rpg.simulation.skills.DemonTotemSkill6`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private static CombatSkill skill`

**Methods (2):**
- `void onPostInitialize()`

### DiggerMoleSkill1 (class)
`com.perblue.rpg.simulation.skills.DiggerMoleSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private int damageCount`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void onInitialize()`

### DiggerMoleSkill2 (class)
`com.perblue.rpg.simulation.skills.DiggerMoleSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (7):**
- `private a hitEnemies`
- `private int molakNum`
- `private a molaks`
- `private float moveTime`
- `private float[] offsets`
- `private boolean pauseEnd`
- `private float pauseTime`

**Methods (15):**
- `String getCastAnimation()`
- `void onCast()`
- `AnimationStateAdapter createAnimationListener(EnvEntity)`
- `void addMolakBuff()`
- `EnvEntity createMolak(float)`
- `void createMolakAction(EnvEntity, float)`
- `boolean onActivate()`
- `void onInitialize()`
- `void onRemove()`

### DiggerMoleSkill3 (class)
`com.perblue.rpg.simulation.skills.DiggerMoleSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- ` EnvEntity molak`

**Methods (9):**
- `String getCastAnimation()`
- `void onCast()`
- `AnimationStateAdapter createAnimationListener()`
- `void createMolak()`
- `void createMolakAction()`
- `void addBlindBuff()`
- `boolean onActivate()`
- `void onInitialize()`

### DiggerMoleSkill4 (class)
`com.perblue.rpg.simulation.skills.DiggerMoleSkill4`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private final a listeners`
- `private final Runnable removeBuffRunnable`

**Methods (10):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void addBuffEvent()`
- `boolean onActivate()`
- `void onInitialize()`
- `void onCancel()`
- `void onRemove()`

### DoppelgangerSkill1 (class)
`com.perblue.rpg.simulation.skills.DoppelgangerSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (5):**
- `private static final String SKILL1CYCLE = skill1_idle`
- `private static final String SKILL1START = skill1`
- `private Unit chosenUnit`
- `private Unit clone`
- `private boolean useSkill`

**Methods (14):**
- `void onCast()`
- `Unit getClone()`
- `Unit getRandomEnemy()`
- `boolean hasMultipleEnemies()`
- `void setUseSkill(boolean)`
- `void setChosenUnit(Unit)`
- `boolean getIsSkill()`
- `void onEndStage()`
- `boolean onActivate()`
- `void activateSecondary()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onRemove()`
- `void reset()`

### DoppelgangerSkill2 (class)
`com.perblue.rpg.simulation.skills.DoppelgangerSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private z buffBoosts`
- `private BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### DoppelgangerSkill3 (class)
`com.perblue.rpg.simulation.skills.DoppelgangerSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (10):**
- `String getCastAnimation()`
- `void onCast()`
- `float getTriggerRange()`

### DoppelgangerSkill4 (class)
`com.perblue.rpg.simulation.skills.DoppelgangerSkill4`
extends `com.perblue.rpg.simulation.skills.generic.StatBoostSkill`

**Methods (1):**
- `boolean shouldUpdateLevel()`

### DragonLadySkill1 (class)
`com.perblue.rpg.simulation.skills.DragonLadySkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (7):**
- `private static final float PROJECTILE_RADIUS = 50.0`
- `private q endPos`
- `private q p1`
- `private q p2`
- `private q p3`
- `private BaseProjectileEffect projectileEffect`
- `private q startPos`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `BaseProjectileEffect createProjectileEffect(CombatSkill, IDamageProvider)`
- `b createBSpline(q, q)`
- `void launchDragon(Unit, BaseProjectileEffect, IDamageProvider, q, q, SkillType)`
- `void onInitialize()`
- `void onRemove()`

### DragonLadySkill2 (class)
`com.perblue.rpg.simulation.skills.DragonLadySkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### DragonLadySkill3 (class)
`com.perblue.rpg.simulation.skills.DragonLadySkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### DragonLadySkill5 (class)
`com.perblue.rpg.simulation.skills.DragonLadySkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (3):**
- `private SkillDamageProvider healProvider`
- `private EventListener listener`
- `private String listenerID`

**Methods (6):**
- `void onInitialize()`
- `void onRemove()`

### DragonLadySkill6 (class)
`com.perblue.rpg.simulation.skills.DragonLadySkill6`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- `private EventListener listener`
- `private String listenerID`

**Methods (6):**
- `void onInitialize()`
- `void onDeath()`
- `void onRemove()`

### DragonSlayerSkill1 (class)
`com.perblue.rpg.simulation.skills.DragonSlayerSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void onTriggerEffect(Event)`
- `void onInitialize()`

### DragonSlayerSkill2 (class)
`com.perblue.rpg.simulation.skills.DragonSlayerSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (4):**
- `void refreshMythicalMight()`
- `void onEndStage()`
- `void onInitialize()`
- `void update(long)`

### DragonSlayerSkill3 (class)
`com.perblue.rpg.simulation.skills.DragonSlayerSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (7):**
- `private static final int bannerSizeOffset = 195`
- `private static final float flyingHeight = 1300.0`
- `private EnvEntity banner`
- `private z buffStats`
- `private BannerOfCourageEnergyShield energyShield`
- `private final q environmentZero`
- `private boolean hasActivated`

**Methods (23):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void removeBanner()`
- `void onEndStage()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onDeath()`
- `void onRemove()`

### DragonSlayerSkill4 (class)
`com.perblue.rpg.simulation.skills.DragonSlayerSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- `private SkillDamageProvider damageProvider`
- ` EventListener healthChangeListener`

**Methods (5):**
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onRemove()`

### DragzillaSkill0 (class)
`com.perblue.rpg.simulation.skills.DragzillaSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `public static final long BEAM_DURATION = 299`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### DragzillaSkill1 (class)
`com.perblue.rpg.simulation.skills.DragzillaSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (7):**
- `private static final String END_ANIM = skill1_end`
- `private static final String LOOP_ANIM = skill1_loop`
- `public static final int MAJOR_TICK_INTERVAL = 1000`
- `public static final int MINOR_TICK_INTERVAL = 250`
- `private static final String START_ANIM = skill1_start`
- `private EventListener listener`
- `private String listenerID`

**Methods (14):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void stopEnergyDrain(Entity, boolean)`
- `void reduceEnergy()`
- `boolean canActivate()`
- `boolean energyBaselineCheck()`
- `void onInitialize()`
- `void onDeath()`
- `void onRemove()`

### DragzillaSkill2 (class)
`com.perblue.rpg.simulation.skills.DragzillaSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `protected static final int TICK_INTERVAL = 1000`
- `private SkillDamageProvider dotDamageProvider`
- `private BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### DragzillaSkill4 (class)
`com.perblue.rpg.simulation.skills.DragzillaSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onInitialize()`

### DragzillaSkill5 (class)
`com.perblue.rpg.simulation.skills.DragzillaSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onInitialize()`

### DruidinatrixSkill0 (class)
`com.perblue.rpg.simulation.skills.DruidinatrixSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- ` SkillDamageProvider projectileDamage`
- ` BaseProjectileEffect projectileEffect`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean isRanged()`
- `float getTriggerRange()`
- `void onPostInitialize()`

### DruidinatrixSkill1 (class)
`com.perblue.rpg.simulation.skills.DruidinatrixSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void reduceEnergy()`
- `boolean canActivate()`
- `boolean energyBaselineCheck()`
- `void onInitialize()`

### DruidinatrixSkill2 (class)
`com.perblue.rpg.simulation.skills.DruidinatrixSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private Unit clone`

**Methods (9):**
- `String getCastAnimation()`
- `void onCast()`
- `void removeClone()`
- `void cloneUnit(Unit)`
- `void onEndStage()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onDeath()`
- `void onRemove()`

### DruidinatrixSkill3 (class)
`com.perblue.rpg.simulation.skills.DruidinatrixSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- ` SkillDamageProvider healProvider`
- ` SkillDamageProvider noDamageProvider`
- ` BaseProjectileEffect projectileEffect`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onInitialize()`
- `CombatSkill getSkill()`

### DruidinatrixSkill5 (class)
`com.perblue.rpg.simulation.skills.DruidinatrixSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private SkillDamageProvider healProvider`

**Methods (1):**
- `void onInitialize()`

### DungeonManSkill1 (class)
`com.perblue.rpg.simulation.skills.DungeonManSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (7):**
- `public static final float KNOCK_BACK_TIME = 0.3`
- `private a allEnemies`
- `private BaseProjectileEffect fallToTheGroundEffect`
- `private a hitEnemies`
- `private q originalEnemyPositionForTargetPositionOverride`
- `private Projectile p`
- `private EmptyProjectileEffect projectileEffect`

**Methods (15):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`
- `void onRemove()`

### DungeonManSkill2 (class)
`com.perblue.rpg.simulation.skills.DungeonManSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (3):**
- `boolean onActivate()`
- `void onInitialize()`
- `void onFinalInit()`

### DungeonManSkill3 (class)
`com.perblue.rpg.simulation.skills.DungeonManSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (5):**
- `private static final int sortingOffset = 1`
- `private EnvEntity doorForeground`
- `private Unit specialTarget`
- `private EnvEntity swingingDoor`
- `private final IBuff trapBuff`

**Methods (15):**
- `String getCastAnimation()`
- `void onCast()`
- `void moveTargetOffScreen()`
- `void moveUnitToSpawnArea(Unit)`
- `void onEndStage()`
- `boolean canActivate()`
- `void onCancel()`
- `void onUpdate(long)`
- `void removeDoors()`

### DungeonManSkill4 (class)
`com.perblue.rpg.simulation.skills.DungeonManSkill4`
extends `com.perblue.rpg.simulation.skills.generic.MinionSummoningSkill`

**Fields (9):**
- `private static final int MOVE_FORWARD = 450`
- `private static int totalSpawnableMinions`
- `private static int totalSummonedMinions`
- `private static HashMap unitSkillMap`
- `private static UnitType[][] waveArray`
- `private int currentGroup`
- `private int currentMinion`
- `private int maxMinionsOnScreen`
- `private int minionLevel`

**Methods (9):**
- `String getCastAnimation()`
- `void onCast()`
- `int getRandomGroup()`
- `boolean onActivate()`
- `void onInitialize()`
- `int getMinionLevel()`
- `boolean canSummonMoreMinions()`
- `void queueMinionEntranceActions(Unit)`
- `UnitData getMinionData(UnitType)`

### DustDevilSkill1 (class)
`com.perblue.rpg.simulation.skills.DustDevilSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private a hitEnemies`
- `private BaseProjectileEffect projectileEffect`

**Methods (8):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### DustDevilSkill2 (class)
`com.perblue.rpg.simulation.skills.DustDevilSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### DustDevilSkill3 (class)
`com.perblue.rpg.simulation.skills.DustDevilSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private static final int TICK_INTERVAL = 1000`
- `private SkillDamageProvider dotDamageProvider`
- `private BaseProjectileEffect projectileEffect`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### DustDevilSkill4 (class)
`com.perblue.rpg.simulation.skills.DustDevilSkill4`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private a allEnemies`
- `private a hitEnemies`
- `private BaseProjectileEffect projectileEffect`

**Methods (9):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void onInitialize()`
- `void onRemove()`

### DustDevilSkill5 (class)
`com.perblue.rpg.simulation.skills.DustDevilSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `boolean onActivate()`
- `void onInitialize()`

### DwarvenArcherSkill0 (class)
`com.perblue.rpg.simulation.skills.DwarvenArcherSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`
- `SkillDamageProvider getDamageProvider()`

### DwarvenArcherSkill1 (class)
`com.perblue.rpg.simulation.skills.DwarvenArcherSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private z buffBoosts`
- `private SkillDamageProvider healProvider`

**Methods (6):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void addBuffStrength()`
- `void onInitialize()`

### DwarvenArcherSkill2 (class)
`com.perblue.rpg.simulation.skills.DwarvenArcherSkill2`
extends `com.perblue.rpg.simulation.skills.DwarvenArcherSkill0`

**Methods (2):**
- `String getCastAnimation()`
- `SkillDamageProvider getDamageProvider()`

### DwarvenArcherSkill3 (class)
`com.perblue.rpg.simulation.skills.DwarvenArcherSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private z buffBoosts`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### ElectroyetiSkill0 (class)
`com.perblue.rpg.simulation.skills.ElectroyetiSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private static final long LIGHTNING_DURATION = 440`
- `protected SkillDamageProvider damageSource`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### ElectroyetiSkill1 (class)
`com.perblue.rpg.simulation.skills.ElectroyetiSkill1`
extends `com.perblue.rpg.simulation.skills.generic.MultiAnimationSkill`

**Fields (1):**
- `private static final a ANIMATIONS`

**Methods (4):**
- `void onTriggerEffect(Event)`
- `void onEvent(Event)`
- `boolean onActivate()`
- `a getCastAnimations()`

### ElectroyetiSkill2 (class)
`com.perblue.rpg.simulation.skills.ElectroyetiSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `protected static final int MAX_BOUNCES = 2`

**Methods (8):**
- `String getCastAnimation()`
- `void onCast()`

### ElectroyetiSkill3 (class)
`com.perblue.rpg.simulation.skills.ElectroyetiSkill3`
extends `com.perblue.rpg.simulation.skills.generic.MultiAnimationSkill`

**Fields (1):**
- `private static final a ANIMATIONS`

**Methods (3):**
- `void onTriggerEffect(Event)`
- `boolean onActivate()`
- `a getCastAnimations()`

### ElectroyetiSkill5 (class)
`com.perblue.rpg.simulation.skills.ElectroyetiSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `void addDebuff(Entity)`
- `void onInitialize()`

### EternalEnchanterSkill1 (class)
`com.perblue.rpg.simulation.skills.EternalEnchanterSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (13):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void onEvent(Event)`
- `boolean canActivate()`
- `void onCancel()`
- `void onDeath()`

### EternalEnchanterSkill2 (class)
`com.perblue.rpg.simulation.skills.EternalEnchanterSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private static final int PARTICLE_DURATION = 1000`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### EternalEnchanterSkill3 (class)
`com.perblue.rpg.simulation.skills.EternalEnchanterSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (10):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void onEvent(Event)`
- `void onDeath()`

### EternalEnchanterSkill5 (class)
`com.perblue.rpg.simulation.skills.EternalEnchanterSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `boolean canActivate()`
- `void onInitialize()`

### FaithHealerSkill1 (class)
`com.perblue.rpg.simulation.skills.FaithHealerSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (6):**
- `private static final String ANIM_SKILL1END = skill1end`
- `private static final String ANIM_SKILL1LOOP = skill1cycle`
- `private static final String ANIM_SKILL1START = skill1start`
- `public static final int HEAL_COUNT = 4`
- `private AnimationStateAdapter castingEventListener`
- `private SkillDamageProvider healProvider`

**Methods (7):**
- `void doHeal()`
- `boolean onActivate()`
- `void onInitialize()`
- `void onComplete()`

### FaithHealerSkill2 (class)
`com.perblue.rpg.simulation.skills.FaithHealerSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### FaithHealerSkill3 (class)
`com.perblue.rpg.simulation.skills.FaithHealerSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### FaithHealerSkill5 (class)
`com.perblue.rpg.simulation.skills.FaithHealerSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onInitialize()`

### ForgottenDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.ForgottenDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private SkillDamageProvider healProvider`
- `private final a listeners`
- `private a untargetAllys`

**Methods (23):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void finishEnergyDrainBuff(Entity)`
- `void initArray()`
- `void addAllyBuff()`
- `void addEnergyDrainBuff()`
- `void addEvent()`
- `void addHealBuff()`
- `void removeHealBuff()`
- `void removeAlly(Entity)`
- `void removeAllyBuff()`
- `boolean canTarget(Entity, Entity)`
- `void reduceEnergy()`
- `boolean canActivate()`
- `void onPostInitialize()`
- `void onRemove()`
- `void update(long)`

### ForgottenDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.ForgottenDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (3):**
- `private a attachedAllys`
- `private boolean endStage`
- `private final a listeners`

**Methods (15):**
- `void initArray()`
- `void addAllyBuff()`
- `void addEvent()`
- `void removeAlly(Entity)`
- `void removeAllyBuff()`
- `void onEndStage()`
- `boolean canTarget(Entity, Entity)`
- `void onInitialize()`
- `void onDeath()`
- `void onRemove()`
- `void onPassiveUpdate(long)`

### ForgottenDragonSkill4 (class)
`com.perblue.rpg.simulation.skills.ForgottenDragonSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (3):**
- `private a attachedAllys`
- `private boolean endStage`
- `private final a listeners`

**Methods (14):**
- `void initArray()`
- `void addAllyBuff()`
- `void addEvent()`
- `void removeAlly(Entity)`
- `void removeAllyBuff()`
- `void onEndStage()`
- `boolean canTarget(Entity, Entity)`
- `void onInitialize()`
- `void onDeath()`
- `void onRemove()`
- `void onPassiveUpdate(long)`

### FrostGiantSkill0 (class)
`com.perblue.rpg.simulation.skills.FrostGiantSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (2):**
- `void onPostInitialize()`

### FrostGiantSkill1 (class)
`com.perblue.rpg.simulation.skills.FrostGiantSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- ` SkillDamageProvider noDamageProvider`
- ` BaseProjectileEffect projectileEffect`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void launchProjectiles()`
- `void onEvent(Event)`
- `void onInitialize()`

### FrostGiantSkill2 (class)
`com.perblue.rpg.simulation.skills.FrostGiantSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private static final int TICK_INTERVAL = 1000`
- `private SkillDamageProvider dotProvider`
- `private BaseProjectileEffect projectileEffect`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### FrostGiantSkill3 (class)
`com.perblue.rpg.simulation.skills.FrostGiantSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### FrostGiantSkill5 (class)
`com.perblue.rpg.simulation.skills.FrostGiantSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- ` z debuffSubtractions`

**Methods (2):**
- `void addDebuff(Entity)`
- `void onInitialize()`

### GenieSkill0 (class)
`com.perblue.rpg.simulation.skills.GenieSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Fields (6):**
- `private static final long ANIM_DURATION = 1200`
- `private static final float COW_FALL_DURATION = 0.2`
- `private static final float X_OFFSET = -150.0`
- `private static final float Z_OFFSET = 200.0`
- ` BaseProjectileEffect effect`
- ` BaseProjectileEffect splashEffect`

**Methods (3):**
- `void onCast()`
- `void createCow(Entity, Unit, float, BaseProjectileEffect, IDamageProvider)`
- `void onInitialize()`

### GenieSkill1 (class)
`com.perblue.rpg.simulation.skills.GenieSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (5):**
- `private static final String END_ANIM = skill1_end`
- `private static final String LOOP_ANIM = skill1_loop`
- `private static final String START_ANIM = skill1_start`
- ` SkillDamageProvider selfDamageProvider`
- ` float stopAtHp`

**Methods (7):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `boolean canBeDodged()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onComplete()`

### GenieSkill2 (class)
`com.perblue.rpg.simulation.skills.GenieSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (9):**
- `private static final String END_ANIM = skill2_end`
- `private static final String LOOP_ANIM = skill2_loop`
- `private static final String START_ANIM = skill2_start`
- `private boolean canActivate`
- `private int hitsToKillOnNextRevive`
- `private float hpPercentOnRevive`
- `private GenieRevivableBuff revivable`
- `private int revivesRemaining`
- `private long stunDuration`

**Methods (10):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void revive()`
- `void startReviving()`
- `boolean canActivate()`
- `void restorePersistentState(HeroBattleData)`
- `void savePersistentState(HeroBattleData)`
- `void updateFromPreviousStage(CombatSkill)`
- `void onInitialize()`

### GenieSkill3 (class)
`com.perblue.rpg.simulation.skills.GenieSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (7):**
- `private static final float FALL_DURATION = 0.3`
- `private static final float PAUSE_DURATION = 1.2`
- `private static final float X_OFFSET = 400.0`
- `private static final float Z_OFFSET = 300.0`
- `private a allEnemies`
- `private boolean canDoDamage`
- `private a hitEnemies`

**Methods (10):**
- `String getCastAnimation()`
- `void onCast()`

### GenieSkill4 (class)
`com.perblue.rpg.simulation.skills.GenieSkill4`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private z buffStats`
- `private boolean removeBuffs`
- `private boolean removeBuffsOverride`
- `private CombatSkill skill6`

**Methods (8):**
- `String getCastAnimation()`
- `void onCast()`
- `void setSkill6Buff()`
- `boolean activate()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `void reset()`

### GenieSkill5 (class)
`com.perblue.rpg.simulation.skills.GenieSkill5`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (8):**
- `private static final ArrayList genieAnimalTypes`
- `private z buffBoosts`
- `private long effectDuration`
- `private final q environmentCenter`
- `private int numberOfTransforms`
- `private boolean shouldBlockActiveSkill`
- `private long transformDuration`
- `private int transformFrequency`

**Methods (21):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `boolean getShouldBlockActiveSkill()`
- `void setShouldBlockActiveSkill(boolean)`
- `void doTransformSmoke(Unit)`
- `void doTransformShimmer(Unit)`
- `void transformRandomEnemy()`
- `void onEndStage()`
- `void onInitialize()`
- `void onCancel()`
- `void onComplete()`
- `void onPostInitialize()`

### GenieSkill6 (class)
`com.perblue.rpg.simulation.skills.GenieSkill6`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `boolean onActivate()`
- `void onInitialize()`

### GrandHuntressSkill0 (class)
`com.perblue.rpg.simulation.skills.GrandHuntressSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (1):**
- `void onInitialize()`

### GrandHuntressSkill1 (class)
`com.perblue.rpg.simulation.skills.GrandHuntressSkill1`
extends `com.perblue.rpg.simulation.skills.generic.AnimationSkill`

**Fields (1):**
- `protected SkillDamageProvider damageProvider`

**Methods (6):**
- `void addActivationActions()`
- `void onTriggerEffect(Event)`
- `void doDamageToEnemies()`
- `boolean isLastWave()`
- `void onInitialize()`

### GrandHuntressSkill2 (class)
`com.perblue.rpg.simulation.skills.GrandHuntressSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`

### GrandHuntressSkill3 (class)
`com.perblue.rpg.simulation.skills.GrandHuntressSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private BaseProjectileEffect projectileEffect`
- `private q targetPosition`

**Methods (9):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onPostInitialize()`

### GreedyDragonSkill0 (class)
`com.perblue.rpg.simulation.skills.GreedyDragonSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (2):**
- `void onCast()`
- `SkillDamageProvider addTastyDamage(Entity, SkillDamageProvider)`

### GreedyDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.GreedyDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (9):**
- `private static final String END_ANIM = skill1_end`
- `private static final String LOOP_ANIM = skill1_loop`
- `public static final int MAJOR_TICK_INTERVAL = 1000`
- `public static final int MINOR_TICK_INTERVAL = 250`
- `private static final String START_ANIM = skill1_start`
- `private EventListener listener`
- `private String listenerID`
- `private final a listeners`
- `private final Runnable removeBuffRunnable`

**Methods (17):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void stopEnergyDrain(Entity, boolean)`
- `void reduceEnergy()`
- `boolean canActivate()`
- `boolean energyBaselineCheck()`
- `void onInitialize()`
- `void onDeath()`
- `void onRemove()`

### GreedyDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.GreedyDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void popShields(Entity)`
- `boolean onActivate()`
- `void onInitialize()`

### GreedyDragonSkill3 (class)
`com.perblue.rpg.simulation.skills.GreedyDragonSkill3`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onInitialize()`

### GreedyDragonSkill4 (class)
`com.perblue.rpg.simulation.skills.GreedyDragonSkill4`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `Unit getSingleEnemyTastyTarget()`
- `void onEvent(Event)`
- `boolean onActivate()`
- `boolean canActivate()`

### GroovyDruidSkill1 (class)
`com.perblue.rpg.simulation.skills.GroovyDruidSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `protected static final int MAX_BOUNCES = 3`
- `protected DamageSource damage`
- `private BouncingProjectileEffect effect`

**Methods (14):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### GroovyDruidSkill2 (class)
`com.perblue.rpg.simulation.skills.GroovyDruidSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### GroovyDruidSkill3 (class)
`com.perblue.rpg.simulation.skills.GroovyDruidSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private z buffBoosts`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### HealSkill (class)
`com.perblue.rpg.simulation.skills.HealSkill`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `protected boolean allowSelfHeal`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void acquireTarget()`
- `void onInitialize()`
- `void playHealSound()`

### HydraSkill0 (class)
`com.perblue.rpg.simulation.skills.HydraSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (1):**
- `boolean canActivate()`

### HydraSkill1 (class)
`com.perblue.rpg.simulation.skills.HydraSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private static final String MINION_ANIMATION_NAME = minionattack`
- `private int index`
- `private a targets`

**Methods (9):**
- `String getCastAnimation()`
- `void onCast()`
- `void checkForTargets()`
- `void spawnMinion(Entity)`
- `Entity getNextLivingTarget()`
- `AnimationStateAdapter createMinionAnimationListener(Entity)`
- `void onComplete()`

### HydraSkill2 (class)
`com.perblue.rpg.simulation.skills.HydraSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- `protected static final int TICK_INTERVAL = 1000`
- `private SkillDamageProvider damageProvider`

**Methods (2):**
- `void onInitialize()`

### HydraSkill3 (class)
`com.perblue.rpg.simulation.skills.HydraSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `protected static final int MAX_BOUNCES = 3`
- `private a targetsHit`

**Methods (9):**
- `String getCastAnimation()`
- `void onCast()`
- `void onComplete()`

### HydraSkill5 (class)
`com.perblue.rpg.simulation.skills.HydraSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onTeamInit()`

### KaraokeKingSkill0 (class)
`com.perblue.rpg.simulation.skills.KaraokeKingSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private BaseProjectileEffect projectileEffect`
- `private SkillDamageProvider skill2DamageProvider`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void createSkill2Projectile()`
- `void onInitialize()`
- `SkillDamageProvider getDamageProvider()`

### KaraokeKingSkill1 (class)
`com.perblue.rpg.simulation.skills.KaraokeKingSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (2):**
- ` long freezeDuration`
- ` long protectDuration`

**Methods (8):**
- `void finishAction()`
- `void addShieldBuff()`
- `void finishAnimation()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onComplete()`

### KaraokeKingSkill2 (class)
`com.perblue.rpg.simulation.skills.KaraokeKingSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canChange()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`

### KaraokeKingSkill3 (class)
`com.perblue.rpg.simulation.skills.KaraokeKingSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private static final String EVENT_TRIGGER = vfx_skill3_2`
- ` IDamageProvider sacrificialDamageProvider`

**Methods (10):**
- `String getCastAnimation()`
- `void onCast()`
- `DamageSource obtainSacrificalDamageSource()`
- `void createBuff()`
- `void onEvent(Event)`
- `boolean canActivate()`

### KaraokeKingSkill4 (class)
`com.perblue.rpg.simulation.skills.KaraokeKingSkill4`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private static final String EVENT_TRIGGER = vfx_skill4_4`
- ` z debuffSubtractions`
- `private SkillDamageProvider hitDamageProvider`
- `private DamageSource selfHeal`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `void addSlowDebuff()`
- `void attackAllEnemy()`
- `void onEvent(Event)`
- `boolean canActivate()`
- `void onInitialize()`

### KrakenKingSkill1 (class)
`com.perblue.rpg.simulation.skills.KrakenKingSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (7):**
- `private int DROP_AHEAD_OFFSET`
- `private int TENTACLE_VERTICAL_OFFSET`
- `private KrakenKingActiveBuff activeBuff`
- `private SkillDamageProvider damageProvider2`
- `private EnvEntity envEntity`
- `private KrakenKingMoveStopBuff moveStopBuff`
- `private KrakenKingTargetBuff targetBuff`

**Methods (79):**
- `String getCastAnimation()`
- `void onCast()`
- `AnimationStateAdapter createAnimationListener()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onCancel()`

### KrakenKingSkill2 (class)
`com.perblue.rpg.simulation.skills.KrakenKingSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onInitialize()`

### KrakenKingSkill3 (class)
`com.perblue.rpg.simulation.skills.KrakenKingSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (2):**
- ` SkillDamageProvider damageProvider`
- ` EnvEntity envEntity`

**Methods (8):**
- `AnimationStateAdapter createAnimationListener()`
- `boolean onActivate()`
- `void onInitialize()`
- `void onCancel()`

### KrakenKingSkill4 (class)
`com.perblue.rpg.simulation.skills.KrakenKingSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `void addBuff()`
- `void onPassiveUpdate(long)`

### LastDefenderSkill0 (class)
`com.perblue.rpg.simulation.skills.LastDefenderSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- ` SkillDamageProvider hammerDamageProvider`
- ` SkillDamageProvider healProvider`
- ` SkillDamageProvider skill3DamageProvider`
- ` CombatSkill skill5`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean isHammmerMode()`
- `void onPostInitialize()`

### LastDefenderSkill1 (class)
`com.perblue.rpg.simulation.skills.LastDefenderSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (9):**
- `private static final String ANIM_SKILL1_ACTIVE = skill1_loop`
- `private static final String ANIM_SKILL1_ACTIVE_START = skill1_start`
- `private final z buffBoosts`
- `private SkillDamageProvider hitDamageProvider`
- `public boolean isPassiveActivated`
- `private final a listeners`
- `private final z shieldBuff`
- `private final z shieldBuff2`
- `private SkillDamageProvider skill3DamageProvider`

**Methods (14):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void addBuffEvent()`
- `void updateBuffs(boolean)`
- `boolean onActivate()`
- `void reduceEnergy()`
- `boolean canActivate()`
- `void onPostInitialize()`
- `boolean addBuff(Entity, StatAdditionBuff, z)`
- `void onRemove()`
- `void update(long)`
- `p getOffset(Entity)`

### LastDefenderSkill3 (class)
`com.perblue.rpg.simulation.skills.LastDefenderSkill3`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- `private EventListener listener`
- `private String listenerID`

**Methods (4):**
- `void onInitialize()`

### MagicDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.MagicDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private a hitEnemies`
- `private EmptyProjectileEffect projectileEffect`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### MagicDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.MagicDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### MagicDragonSkill3 (class)
`com.perblue.rpg.simulation.skills.MagicDragonSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private final int RANGE`
- `private BaseProjectileEffect projectileEffect`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### MagicDragonSkill5 (class)
`com.perblue.rpg.simulation.skills.MagicDragonSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onInitialize()`

### MedusaSkill0 (class)
`com.perblue.rpg.simulation.skills.MedusaSkill0`
extends `com.perblue.rpg.simulation.skills.CosmicElfSkill0`

**Methods (1):**
- `boolean canActivate()`

### MedusaSkill1 (class)
`com.perblue.rpg.simulation.skills.MedusaSkill1`
extends `com.perblue.rpg.simulation.skills.generic.MultiAnimationSkill`

**Fields (3):**
- `private static a ANIMATIONS`
- `protected BaseProjectileEffect projectileEffect`
- `protected int projectileNum`

**Methods (5):**
- `void onTriggerEffect(Event)`
- `int getProjectileNum()`
- `boolean onActivate()`
- `void onInitialize()`
- `a getCastAnimations()`

### MedusaSkill2 (class)
`com.perblue.rpg.simulation.skills.MedusaSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `public static final long BEAM_DURATION = 199`
- `protected int projectileNum`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `int getProjectileNum()`
- `void launchProjectile(Entity)`

### MedusaSkill3 (class)
`com.perblue.rpg.simulation.skills.MedusaSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `protected BaseProjectileEffect projectileEffect`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### MedusaSkill5 (class)
`com.perblue.rpg.simulation.skills.MedusaSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onTeamInit()`

### MedusaSkill6 (class)
`com.perblue.rpg.simulation.skills.MedusaSkill6`
extends `com.perblue.rpg.simulation.skills.generic.StatBoostSkill`

### MinotaurSkill1 (class)
`com.perblue.rpg.simulation.skills.MinotaurSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- ` SkillDamageProvider selfDamageProvider`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean shouldAutoActivate()`
- `boolean canBeDodged()`
- `void onInitialize()`

### MinotaurSkill2 (class)
`com.perblue.rpg.simulation.skills.MinotaurSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private z buffBoosts`
- `private boolean hasBeenActivated`

**Methods (5):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onUpdate(long)`

### MinotaurSkill3 (class)
`com.perblue.rpg.simulation.skills.MinotaurSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (6):**
- `private static final int ENERGY_GAIN_TICK_INTERVAL = 1000`
- `private static final int HEAL_TICK_INTERVAL = 1000`
- `private z buffBoosts`
- `private CastType chosenType`
- `private int overrideRandom`
- `private Random rnd`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `int getNumberOfOutcomes()`
- `CastType getCastType()`
- `void overrideOutcome(int)`
- `boolean onActivate()`
- `void onInitialize()`

### MinotaurSkill5 (class)
`com.perblue.rpg.simulation.skills.MinotaurSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onInitialize()`

### MistressManicureSkill0 (class)
`com.perblue.rpg.simulation.skills.MistressManicureSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`

### MistressManicureSkill1 (class)
`com.perblue.rpg.simulation.skills.MistressManicureSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (4):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`

### MistressManicureSkill2 (class)
`com.perblue.rpg.simulation.skills.MistressManicureSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private final SteadfastBuff steadfastBuff`
- `private final UntargetableBuff untargetableBuff`

**Methods (9):**
- `String getCastAnimation()`
- `void onCast()`
- `void doPuddleClawEffect(c, a, ParticleType, boolean)`
- `q getPuddlePosition(a)`
- `boolean onActivate()`
- `void onCancel()`
- `void onComplete()`

### MistressManicureSkill3 (class)
`com.perblue.rpg.simulation.skills.MistressManicureSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `public static final float KNOCK_BACK_TIME = 0.3`
- `private BaseProjectileEffect projectileEffect`

**Methods (8):**
- `String getCastAnimation()`
- `void onCast()`
- `BaseProjectileEffect createProjectileEffect()`
- `void onInitialize()`

### MistressManicureSkill4 (class)
`com.perblue.rpg.simulation.skills.MistressManicureSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (5):**
- `private long cooldown`
- `private int currentStack`
- `private long lastStackTime`
- `private int maxStack`
- `private float statIncreaseAmount`

**Methods (6):**
- `void updateStack()`
- `void addIntellectBuff()`
- `void restorePersistentState(HeroBattleData)`
- `void savePersistentState(HeroBattleData)`
- `void updateFromPreviousStage(CombatSkill)`
- `void onInitialize()`

### MoonDrakeSkill1 (class)
`com.perblue.rpg.simulation.skills.MoonDrakeSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (8):**
- `private static final String SKILL1CYCLE = skill1cycle`
- `private static final String SKILL1END = skill1end`
- `private static final String SKILL1START = skill1start`
- `private AnimationStateAdapter castingEventListener`
- `private IDamageProvider damageProvider`
- `private float damageScalar`
- `private BaseProjectileEffect effect`
- `private boolean wasCastOrCancelled`

**Methods (11):**
- `void onCast()`
- `void removeCharge(boolean)`
- `void startCharging()`
- `boolean onActivate()`
- `void activateSecondary()`
- `void onInitialize()`
- `void onComplete()`
- `void onDeath()`

### MoonDrakeSkill2 (class)
`com.perblue.rpg.simulation.skills.MoonDrakeSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `boolean isTargetAvailable()`

### MoonDrakeSkill3 (class)
`com.perblue.rpg.simulation.skills.MoonDrakeSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect effect`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### NPCAoeSkill0 (class)
`com.perblue.rpg.simulation.skills.NPCAoeSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (5):**
- `private static final String[] LAUNCH_BONES`
- `private static final float TARGET_OFFSET = 40.0`
- `private IDamageProvider noDamageProvider`
- `private SkillDamageProvider primaryDamageProvider`
- `private BaseProjectileEffect projectileEffect`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void calculateLaunchPos(q)`
- `void onInitialize()`

### NinjaDwarfSkill1 (class)
`com.perblue.rpg.simulation.skills.NinjaDwarfSkill1`
extends `com.perblue.rpg.simulation.skills.NinjaDwarfTeleportBaseSkill`

**Methods (4):**
- `String getAnimationPart1()`
- `String getAnimationPart2()`
- `void setShouldTeleport()`
- `p getTeleportPosition()`

### NinjaDwarfSkill2 (class)
`com.perblue.rpg.simulation.skills.NinjaDwarfSkill2`
extends `com.perblue.rpg.simulation.skills.NinjaDwarfTeleportBaseSkill`

**Fields (1):**
- `private a hitUnits`

**Methods (6):**
- `String getAnimationPart1()`
- `String getAnimationPart2()`
- `void setShouldTeleport()`
- `p getTeleportPosition()`
- `void damageEntity(Entity)`
- `boolean onActivate()`

### NinjaDwarfSkill5 (class)
`com.perblue.rpg.simulation.skills.NinjaDwarfSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onInitialize()`

### NinjaDwarfSkill6 (class)
`com.perblue.rpg.simulation.skills.NinjaDwarfSkill6`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `final q SMOKE_OFFSET`
- ` boolean usedKemuridama`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void UsingKemuridama()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`

### NinjaDwarfTeleportBaseSkill (class)
`com.perblue.rpg.simulation.skills.NinjaDwarfTeleportBaseSkill`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (8):**
- `private static final float REVOLUTION_SPEED = 1542.8572`
- `protected AnimationStateAdapter castingEventListener`
- `protected int damageCount`
- `protected SkillDamageProvider damageProvider`
- `protected a damageTimes`
- `protected int eventCount`
- `protected boolean shouldTeleport`
- `protected float triggerRange`

**Methods (17):**
- `String getAnimationPart1()`
- `String getAnimationPart2()`
- `void setShouldTeleport()`
- `p getTeleportPosition()`
- `long getTimeTillHit(float, Direction)`
- `void damageEntity(Entity)`
- `void teleport()`
- `boolean onActivate()`
- `void onInitialize()`
- `void onComplete()`
- `void onUpdate(long)`
- `void doDamage()`
- `void onDeath()`
- `void setTarget()`

### NpcAbyssDragonSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcAbyssDragonSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `protected static final long BEAM_DURATION = 300`
- `private static final int PARTICLE_DURATION = 500`
- `protected BaseProjectileEffect projectileEffect`
- `private a targets`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void createProjectile(Entity)`
- `void onInitialize()`

### NpcAbyssDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcAbyssDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private static final float OFFSET = 800.0`
- `private EnvEntity rainGround`
- `private q rainRight`
- `private q rainleft`

**Methods (12):**
- `String getCastAnimation()`
- `void onCast()`
- `AnimationStateAdapter createRainGroundAnimationListener()`
- `void onInitialize()`

### NpcAbyssDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.NpcAbyssDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `void onInitialize()`
- `void onDeath()`

### NpcAngelicAvengerSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcAngelicAvengerSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (4):**
- `private boolean activated`
- `private TriggerEffectListener attackTriggerListener`
- `private SkillDamageProvider damageProvider`
- `private final AngelicAvengerGuardBuff guardBuff`

**Methods (18):**
- `boolean isBuffActive()`
- `boolean onActivate()`
- `boolean shouldAutoTarget()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onRemove()`

### NpcAntSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcAntSkill1`
extends `com.perblue.rpg.simulation.skills.generic.AnimationSkill`

**Fields (5):**
- `public static final String ANIM_SKILL1_ATTACK = skill1_attack`
- `public static final String ANIM_SKILL1_IDLE = skill1_idle`
- `public static final String ANIM_SKILL1_START = skill1_start`
- `private static final float MAX_AMBUSH_ATTACK_DIST = 300.0`
- `protected SkillDamageProvider damageProvider`

**Methods (3):**
- `void addActivationActions()`
- `void onTriggerEffect(Event)`
- `void onInitialize()`

### NpcAnubisDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcAnubisDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private float offset`
- `private EnvEntity sandBackground`
- `private EnvEntity sandForeground`

**Methods (13):**
- `String getCastAnimation()`
- `void onCast()`
- `AnimationStateAdapter createForeGroundAnimationListener()`
- `AnimationStateAdapter createBackGroundAnimationListener()`
- `void createEntity()`
- `boolean onActivate()`
- `void onInitialize()`

### NpcAnubisDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.NpcAnubisDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `void onInitialize()`
- `void onDeath()`

### NpcBossAbyssDragonSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcBossAbyssDragonSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `protected static final long BEAM_DURATION = 300`
- `private static final int PARTICLE_DURATION = 500`
- `protected BaseProjectileEffect projectileEffect`
- `private a targets`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void createProjectile(Entity)`
- `void onInitialize()`

### NpcBossAbyssDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcBossAbyssDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private static final float OFFSET = 800.0`
- `private EnvEntity rainGround`
- `private q rainRight`
- `private q rainleft`

**Methods (12):**
- `String getCastAnimation()`
- `void onCast()`
- `AnimationStateAdapter createRainGroundAnimationListener()`
- `void onInitialize()`

### NpcBossAbyssDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.NpcBossAbyssDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `void onInitialize()`
- `void onDeath()`

### NpcBossAndragonusTheFirstSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcBossAndragonusTheFirstSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### NpcBossAndragonusTheFirstSkill2 (class)
`com.perblue.rpg.simulation.skills.NpcBossAndragonusTheFirstSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `void onInitialize()`
- `void onDeath()`

### NpcBossAnubisDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcBossAnubisDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private float offset`
- `private EnvEntity sandBackground`
- `private EnvEntity sandForeground`

**Methods (13):**
- `String getCastAnimation()`
- `void onCast()`
- `AnimationStateAdapter createForeGroundAnimationListener()`
- `AnimationStateAdapter createBackGroundAnimationListener()`
- `void createEntity()`
- `boolean onActivate()`
- `void onInitialize()`

### NpcBossAnubisDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.NpcBossAnubisDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `void onInitialize()`
- `void onDeath()`

### NpcBreakerMkiiSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcBreakerMkiiSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (2):**
- `void onCast()`
- `void onInitialize()`

### NpcBreakerMkiiSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcBreakerMkiiSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `public static final String ANIM_TYPE_SKILL1_BODY = skill1_attack`
- `public static final String ANIM_TYPE_SKILL1_END = skill1_end`
- `public static final String ANIM_TYPE_SKILL1_START = skill1_start`
- `private final a attackInProgressGuardBuffs`

**Methods (14):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void addMyAttackInProgressActions()`
- `void addMyAttackInProgressBuffs()`
- `void removeMyAttackInProgressBuffs()`
- `void popShields(Entity)`
- `void onEvent(Event)`
- `void onInitialize()`
- `void onCancel()`
- `void onComplete()`
- `void onDeath()`

### NpcBuffSkill (class)
`com.perblue.rpg.simulation.skills.NpcBuffSkill`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private z buffBoosts`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### NpcCauldronMonsterSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcCauldronMonsterSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private boolean allowActivation`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `boolean onHit(float)`

### NpcCloudMonsterSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcCloudMonsterSkill1`
extends `com.perblue.rpg.simulation.skills.generic.AnimationSkill`

**Methods (5):**
- `void addActivationActions()`
- `void onInitialize()`
- `void onComplete()`
- `void finish()`

### NpcCrystalLizardSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcCrystalLizardSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (1):**
- `void onCast()`

### NpcCrystalLizardSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcCrystalLizardSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private static final String ANIM_TYPE_SKILL1_END = skill1_end`
- `private static final String ANIM_TYPE_SKILL1_LOOP = skill1_loop`
- `private static final String ANIM_TYPE_SKILL1_START = skill1_start`
- `private boolean alreadySkillWasQueuedOrActivatedFlag`

**Methods (14):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void scaleCrystalAtSkill1Loop()`
- `boolean isConditionSatisfiedToStartSkill()`
- `void addMyActions()`
- `void addMyBuff()`
- `void removeMyBuff()`
- `void onCancel()`
- `void onComplete()`
- `void onUpdate(long)`
- `void onDeath()`
- `void update(long)`

### NpcEyeballSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcEyeballSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Fields (3):**
- `private final int NUM_PROJECTILES`
- `private String[] eyes`
- `private BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### NpcFleaDemonSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcFleaDemonSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (2):**
- `void onCast()`
- `boolean shouldAutoTarget()`

### NpcHeadCrabSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcHeadCrabSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (8):**
- `private static final float JUMP_DURATION = 0.4`
- `private boolean attached`
- `private Unit extraTarget`
- `private float minHpPercent`
- `private float minTargetHpPercent`
- `private Bone targetBone`
- `private boolean targetLocked`
- `private q targetPos`

**Methods (16):**
- `void addActivationActions()`
- `Bone getAttachedBone()`
- `Unit getAttachedTarget()`
- `String getCastAnimation()`
- `boolean isAttached()`
- `void onCast()`
- `void setDeath()`
- `void adjustByBone(AnimationElement, q, Bone, boolean, float)`
- `boolean canTarget(Entity, Entity)`
- `boolean onActivate()`
- `boolean areTargetsInRange()`
- `boolean isTargetAvailable()`
- `void acquireTarget(boolean)`
- `void onInitialize()`
- `void onComplete()`
- `void onUpdate(long)`

### NpcHealSkill (class)
`com.perblue.rpg.simulation.skills.NpcHealSkill`
extends `com.perblue.rpg.simulation.skills.HealSkill`

**Methods (1):**
- `void playHealSound()`

### NpcInfernoSpiderSkill (class)
`com.perblue.rpg.simulation.skills.NpcInfernoSpiderSkill`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### NpcKamikazeGnomeSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcKamikazeGnomeSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `public boolean hasBeenActivated`
- `private SkillDamageProvider reducedDamageProvider`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `float getTriggerRange()`
- `boolean canActivate()`
- `void onInitialize()`

### NpcKingImpSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcKingImpSkill1`
extends `com.perblue.rpg.simulation.skills.generic.DamageTypeSkill`

**Fields (2):**
- `public static final String SKILL1 = skill_1`
- `private AnimationStateAdapter animationEventListener`

**Methods (13):**
### com.perblue.rpg.simulation.skills.NpcKingImpSkill1 [LOAD ERROR: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$DamageSourceType disagree on InnerClasses attribute]

### NpcLyingLanternSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcLyingLanternSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean shouldAutoTarget()`
- `void onPostInitialize()`

### NpcLyingLanternSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcLyingLanternSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private IProjectileEffect projectileEffect`

**Methods (11):**
- `String getCastAnimation()`
- `void onCast()`
- `Unit getRandomTarget()`
- `boolean shouldAutoTarget()`
- `boolean canActivate()`
- `void onInitialize()`

### NpcLyingLanternSkill2 (class)
`com.perblue.rpg.simulation.skills.NpcLyingLanternSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private final a listeners`

**Methods (4):**
- `void onInitialize()`
- `void onRemove()`

### NpcMrSmashySkill0 (class)
`com.perblue.rpg.simulation.skills.NpcMrSmashySkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### NpcMushroomSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcMushroomSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- ` BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### NpcPlagueSkulkerSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcPlagueSkulkerSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (7):**
- `private static final int CENTER_SCREEN = 600`
- `private static final int NUM_PROJECTILES = 3`
- `protected SkillDamageProvider damageProvider`
- `private EnvEntity envEntity`
- `private boolean hasBeenActivated`
- `protected AnimationStateAdapter listener`
- `private int projectileCounter`

**Methods (9):**
- `void launchRatProjectile(ProjectileType, Float)`
- `void removeEnvEntity()`
- `boolean onActivate()`
- `void onInitialize()`

### NpcPottedPlantSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcPottedPlantSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### NpcRedtigerSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcRedtigerSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (2):**
- `void onCast()`
- `void onInitialize()`

### NpcRedtigerSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcRedtigerSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (4):**
- `private static final String SKILL1_END = skill1_end`
- `private static final String SKILL1_LOOP = skill1_loop`
- `private static final String SKILL1_START = skill1_start`
- `private boolean chkFemale`

**Methods (5):**
- `void charm()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`

### NpcSharkSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcSharkSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Methods (3):**
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`

### NpcSinisterAssailantSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcSinisterAssailantSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (5):**
- `void onCast()`
- `void onInitialize()`

### NpcSinisterAssailantSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcSinisterAssailantSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void onInitialize()`

### NpcSkeletonDeerSkill1 (class)
`com.perblue.rpg.simulation.skills.NpcSkeletonDeerSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private Unit skeletonKing`

**Methods (7):**
- `Unit getSummoner()`
- `void charge(float)`
- `String getCastAnimation()`
- `void onCast()`
### com.perblue.rpg.simulation.skills.NpcSkeletonDeerSkill1 [LOAD ERROR: com.perblue.rpg.simulation.skills.generic.SkillDamageProvider and com.perblue.rpg.simulation.skills.generic.SkillDamageProvider$DamageFunction disagree on InnerClasses attribute]

### NpcSkeletonDeerSkill2 (class)
`com.perblue.rpg.simulation.skills.NpcSkeletonDeerSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private SkillDamageProvider damageProvider`

**Methods (2):**
### com.perblue.rpg.simulation.skills.NpcSkeletonDeerSkill2 [LOAD ERROR: com.perblue.rpg.simulation.skills.generic.SkillDamageProvider and com.perblue.rpg.simulation.skills.generic.SkillDamageProvider$DamageFunction disagree on InnerClasses attribute]

### NpcSquidSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcSquidSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private SkillDamageProvider dotDamageProvider`
- `private BaseProjectileEffect projectileEffect`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### NpcSquirrelSkill0 (class)
`com.perblue.rpg.simulation.skills.NpcSquirrelSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private static final String LOOP_ANIM = attack_loop`
- `private static final String START_ANIM = attack_start`
- `private BaseProjectileEffect projectileEffect`
- ` SkillDamageProvider skillDamageProvider`

**Methods (4):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### NpcUmlautthefifthFirst1 (class)
`com.perblue.rpg.simulation.skills.NpcUmlautthefifthFirst1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### NpcUmlautthefifthFirst2 (class)
`com.perblue.rpg.simulation.skills.NpcUmlautthefifthFirst2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private final long ACTION_COUNT_MAX`
- `private long action_count`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`

### NpcUmlautthefifthFirst3 (class)
`com.perblue.rpg.simulation.skills.NpcUmlautthefifthFirst3`
extends `com.perblue.rpg.simulation.skills.generic.MultiHitCastingSkill`

**Methods (8):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### OrcMonkSkill1 (class)
`com.perblue.rpg.simulation.skills.OrcMonkSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private DamageTypeData shieldDamageFilter`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void initialize(Unit, SkillType, int)`

### OrcMonkSkill2 (class)
`com.perblue.rpg.simulation.skills.OrcMonkSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private SkillDamageProvider healProvider`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### OrcMonkSkill3 (class)
`com.perblue.rpg.simulation.skills.OrcMonkSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private static final int MAX_TARGETING_ITERATIONS = 5`
- `private DamageTypeData shieldDamageFilter`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `Unit findAllyTarget()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void initialize(Unit, SkillType, int)`

### OrcMonkSkill6 (class)
`com.perblue.rpg.simulation.skills.OrcMonkSkill6`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

### PchAnubisDragonSkill0 (class)
`com.perblue.rpg.simulation.skills.PchAnubisDragonSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

### PchAnubisDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.PchAnubisDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### PchAnubisDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.PchAnubisDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `void onInitialize()`
- `void onDeath()`

### PchAnubisDragonSkill3 (class)
`com.perblue.rpg.simulation.skills.PchAnubisDragonSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### PchAnubisDragonSkill4 (class)
`com.perblue.rpg.simulation.skills.PchAnubisDragonSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private long revive_count`

**Methods (5):**
- `void reviveUnit(Unit, float)`
- `boolean ResurrectREVERENT()`
- `void restorePersistentState(HeroBattleData)`
- `void savePersistentState(HeroBattleData)`
- `void onInitialize()`

### PirateSkill0 (class)
`com.perblue.rpg.simulation.skills.PirateSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (2):**
- `boolean onActivate()`
- `void onComplete()`

### PirateSkill1 (class)
`com.perblue.rpg.simulation.skills.PirateSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- ` BaseProjectileEffect projectileEffect`
- ` SkillDamageProvider splashDamageProvider`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### PirateSkill2 (class)
`com.perblue.rpg.simulation.skills.PirateSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- `private EventListener listener`
- `private String listenerID`

**Methods (10):**
- `void onInitialize()`
- `void onRemove()`

### PirateSkill3 (class)
`com.perblue.rpg.simulation.skills.PirateSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- ` BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### PirateSkill4 (class)
`com.perblue.rpg.simulation.skills.PirateSkill4`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- ` BaseProjectileEffect projectileEffect`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`
- `void onComplete()`

### PirateSkill5 (class)
`com.perblue.rpg.simulation.skills.PirateSkill5`
extends `com.perblue.rpg.simulation.skills.generic.AnimationSkill`

**Fields (4):**
- `private static final float BALL_DEGREES = 125.0`
- `private static final float BALL_DIST = 2500.0`
- `private SkillDamageProvider damageProvider`
- `private BaseProjectileEffect projectileEffect`

**Methods (4):**
- `void addActivationActions()`
- `void fireCannon(Unit)`
- `void bonVoyage()`
- `void onInitialize()`

### PlagueEntrepreneurSkill0 (class)
`com.perblue.rpg.simulation.skills.PlagueEntrepreneurSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private static final int TICK_INTERVAL = 1000`
- `private SkillDamageProvider dotDamageProvider`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean hasSkill3()`
- `void onInitialize()`
- `void onPostInitialize()`

### PlagueEntrepreneurSkill1 (class)
`com.perblue.rpg.simulation.skills.PlagueEntrepreneurSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private SkillDamageProvider dotDamageProvider`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onPostInitialize()`

### PlagueEntrepreneurSkill2 (class)
`com.perblue.rpg.simulation.skills.PlagueEntrepreneurSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### PlantSoulSkill1 (class)
`com.perblue.rpg.simulation.skills.PlantSoulSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (14):**
- `private static final String ANIM_SKILL1_ATTACK = skill1_loop`
- `private static final String ANIM_SKILL1_END = skill1_end`
- `private static final String ANIM_SKILL1_IDLE = skill1_idle`
- `private static final String ANIM_SKILL1_START = skill1_start`
- `private static final long DAMAGE_COOLDOWN = 250`
- `private static final int GUARD_OFFSET = 450`
- `private boolean bCrossCounter`
- `private boolean canFreeze`
- `private IDamageProvider damageProvider`
- `private Unit guardedAlly`
- `private IDamageProvider healProvider`
- `private final AnimationStateListener parryTrigger`
- `private BaseProjectileEffect projectileEffect`
- `private final Runnable setCanFreeze`

**Methods (18):**
- `void endDefensiveStance()`
- `void triggerParry(Entity, DamageSource)`
- `void fireParryProjectile()`
- `boolean onActivate()`
- `void acquireTarget()`
- `boolean canActivate()`
- `boolean canFreeze()`
- `void onInitialize()`
- `void onComplete()`

### PlantSoulSkill3 (class)
`com.perblue.rpg.simulation.skills.PlantSoulSkill3`
extends `com.perblue.rpg.simulation.skills.generic.AllyBuffBoostSkill`

**Methods (2):**
- `void onInitialize()`
- `void onTeamInit()`

### PolemasterSkill1 (class)
`com.perblue.rpg.simulation.skills.PolemasterSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `protected int damageCount`
- `protected int eventCount`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void moveAndDamage()`
- `boolean onActivate()`
- `void onInitialize()`
- `void onComplete()`

### PolemasterSkill2 (class)
`com.perblue.rpg.simulation.skills.PolemasterSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`

### PolemasterSkill3 (class)
`com.perblue.rpg.simulation.skills.PolemasterSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (4):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### RabidDragonSkill0 (class)
`com.perblue.rpg.simulation.skills.RabidDragonSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private boolean meleeAttackIsCrit`
- `private SkillDamageProvider meleeDamageProvider`
- `private BaseProjectileEffect projectileEffect`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean isRanged()`
- `boolean onActivate()`
- `float getTriggerRange()`
- `void onInitialize()`
- `void onPostInitialize()`

### RabidDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.RabidDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.AnimationSkill`

**Fields (9):**
- `private static final String END_ANIM = skill1_3rd_segment`
- `private static final String LOOP_ANIM = skill1_2nd_segment`
- `private static final String START_ANIM = skill1_1st_segment`
- `private static final float TELEPORT_SPEED = 4000.0`
- `private z buffBoosts`
- `private float minRangeToTarget`
- `private boolean shouldTeleport`
- `private p targetPosition`
- `private float teleportDuration`

**Methods (12):**
- `void addActivationActions()`
- `void onTriggerEffect(Event)`
- `p getTeleportPosition()`
- `void teleport()`
- `void activateBuffs()`
- `boolean onActivate()`
- `void reduceEnergy()`
- `boolean canActivate()`
- `void onInitialize()`
- `void setTarget()`

### RabidDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.RabidDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private final int RANGE`
- `private BaseProjectileEffect projectileEffect`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onInitialize()`

### RabidDragonSkill3 (class)
`com.perblue.rpg.simulation.skills.RabidDragonSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private z buffStats`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onInitialize()`

### RagingRevenantSkill1 (class)
`com.perblue.rpg.simulation.skills.RagingRevenantSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- ` IDamageProvider sacrificialDamageProvider`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `DamageSource obtainSacrificalDamageSource()`
- `void acquireTarget()`

### RagingRevenantSkill2 (class)
`com.perblue.rpg.simulation.skills.RagingRevenantSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private final BaseProjectileEffect projectileEffect`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `void acquireTarget()`

### RagingRevenantSkill3 (class)
`com.perblue.rpg.simulation.skills.RagingRevenantSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void acquireTarget()`
- `boolean canActivate()`

### RagingRevenantSkill5 (class)
`com.perblue.rpg.simulation.skills.RagingRevenantSkill5`
extends `com.perblue.rpg.simulation.skills.generic.StatBoostSkill`

**Methods (1):**
- `void onInitialize()`

### RollerWarriorSkill1 (class)
`com.perblue.rpg.simulation.skills.RollerWarriorSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (6):**
- `private static float BOUNDS_BUFFER`
- `private static float MOVE_DIST`
- `private static float MOVE_LENGTH`
- `private static float PAUSE_LENGTH`
- `private CannonballOnHit knockbackBuff`
- `private float knockbackDist`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void onInitialize()`

### RollerWarriorSkill2 (class)
`com.perblue.rpg.simulation.skills.RollerWarriorSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### RollerWarriorSkill5 (class)
`com.perblue.rpg.simulation.skills.RollerWarriorSkill5`
extends `com.perblue.rpg.simulation.skills.generic.StatBoostSkill`

### RollerWarriorSkill6 (class)
`com.perblue.rpg.simulation.skills.RollerWarriorSkill6`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private Unit targeting`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`

### SadisticDancerSkill0 (class)
`com.perblue.rpg.simulation.skills.SadisticDancerSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (1):**
- `void onCast()`

### SadisticDancerSkill1 (class)
`com.perblue.rpg.simulation.skills.SadisticDancerSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private static final String ANIM_SKILL1_ACTIVE = skill1_loop`
- `private static final String ANIM_SKILL1_ACTIVE_END = skill1_end`
- `private static final String ANIM_SKILL1_ACTIVE_START = skill1_start`
- `private z buffBoosts`

**Methods (4):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`

### SadisticDancerSkill2 (class)
`com.perblue.rpg.simulation.skills.SadisticDancerSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private static final String ANIM_SKILL1_ACTIVE = skill2_loop`
- `private static final String ANIM_SKILL1_ACTIVE_END = skill2_end`
- `private static final String ANIM_SKILL1_ACTIVE_START = skill2_start`
- `private SkillDamageProvider healProvider`

**Methods (8):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onRemove()`
- `void initialize(Unit, SkillType, int)`
- `p getOffset(Entity, boolean)`

### SadisticDancerSkill3 (class)
`com.perblue.rpg.simulation.skills.SadisticDancerSkill3`
extends `com.perblue.rpg.simulation.skills.generic.TeamStatBoostSkill`

**Methods (2):**
- `void addBuffs()`
- `void onInitialize()`

### SadisticDancerSkill4 (class)
`com.perblue.rpg.simulation.skills.SadisticDancerSkill4`
extends `com.perblue.rpg.simulation.skills.generic.TeamStatBoostSkill`

**Methods (2):**
- `void addBuffs()`
- `void onInitialize()`

### SatyrSkill0 (class)
`com.perblue.rpg.simulation.skills.SatyrSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Fields (4):**
- ` SkillDamageProvider healProvider`
- ` DamageSource healSource`
- ` CombatSkill skill5`
- ` CombatSkill skill6`

**Methods (2):**
- `void onCast()`
- `void onPostInitialize()`

### SatyrSkill1 (class)
`com.perblue.rpg.simulation.skills.SatyrSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `final int LAUNCH_VARIATION`
- `final int NUM_PROJECTILES`
- `private SkillDamageProvider bonusDamageProvider`
- ` BaseProjectileEffect projectileEffect`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void varyLaunchPosition(q, String)`
- `void onInitialize()`

### SatyrSkill2 (class)
`com.perblue.rpg.simulation.skills.SatyrSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private SkillDamageProvider baseHealProvider`
- `private SkillDamageProvider extraHealProvider`
- `private BaseProjectileEffect projectileEffect`
- `private a targeted`

**Methods (11):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void onInitialize()`

### SatyrSkill6 (class)
`com.perblue.rpg.simulation.skills.SatyrSkill6`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private z buffBoosts`

**Methods (1):**
- `void onTeamInit()`

### SavageCutieSkill0 (class)
`com.perblue.rpg.simulation.skills.SavageCutieSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Fields (2):**
- `private SkillDamageProvider legendaryDamageProvider`
- `private SavageCutieStaggerBuff staggerBuff`

**Methods (2):**
- `void onCast()`
- `void onPostInitialize()`

### SavageCutieSkill1 (class)
`com.perblue.rpg.simulation.skills.SavageCutieSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### SavageCutieSkill2 (class)
`com.perblue.rpg.simulation.skills.SavageCutieSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### SavageCutieSkill3 (class)
`com.perblue.rpg.simulation.skills.SavageCutieSkill3`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `void onPostInitialize()`

### SavageCutieStaggerBuff (class)
`com.perblue.rpg.simulation.skills.SavageCutieStaggerBuff`
extends `com.perblue.rpg.game.buff.SteadfastBuff`

**Fields (1):**
- `public int queuedStaggeredAttacks`

**Methods (4):**
- `StackingEffect getStackingEffect(IBuff)`
- `void onStaggered()`
- `String getBuffName()`
- `IBuff newInstance()`

### ShadowAssassinSkill1 (class)
`com.perblue.rpg.simulation.skills.ShadowAssassinSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private EnvEntity assassinShadow`
- `private boolean onActivate`

**Methods (37):**
- `String getCastAnimation()`
- `void onCast()`
- `void removeShadow()`
- `AnimationStateAdapter createAnimationListener()`
- `void onEndStage()`
- `void acquireTarget()`
- `void onInitialize()`
- `void onDeath()`
- `void onRemove()`

### ShadowAssassinSkill2 (class)
`com.perblue.rpg.simulation.skills.ShadowAssassinSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private boolean onActivate`
- `private BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### ShadowAssassinSkill3 (class)
`com.perblue.rpg.simulation.skills.ShadowAssassinSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void onInitialize()`

### ShadowAssassinSkill5 (class)
`com.perblue.rpg.simulation.skills.ShadowAssassinSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private static ShadowAssassinSkill5 skill`

**Methods (3):**
- `void onInitialize()`
- `void onPassiveUpdate(long)`

### ShadowAssassinSkill6 (class)
`com.perblue.rpg.simulation.skills.ShadowAssassinSkill6`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

### ShadowofSvenSkill1 (class)
`com.perblue.rpg.simulation.skills.ShadowofSvenSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (10):**
- `private static final String ANIM_SKILL1_END = skill1_end`
- `private static final String ANIM_SKILL1_LOOP = skill1_loop`
- `private static final String ANIM_SKILL1_START = skill1_start`
- `private static final String EVENT_TRIGGER = vfx_skill1_start_03`
- `private long actionID`
- `private EventListener listener`
- `private String listenerID`
- `private float orbCreateDelay`
- `private EnvEntity orbEntity`
- `private final Runnable removeDefenseBuffRunnable`

**Methods (32):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void addOrb()`
- `void finishEnergyDrainBuff(Entity)`
- `void addEnergyDrainBuff()`
- `void onEndStage()`
- `void onEvent(Event)`
- `boolean onActivate()`
- `void reduceEnergy()`
- `void onInitialize()`
- `void onDeath()`
- `void onRemove()`
- `void update(long)`

### ShadowofSvenSkill2 (class)
`com.perblue.rpg.simulation.skills.ShadowofSvenSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (7):**
- `private long actionID`
- `private float delay`
- `private float duration`
- `private a enemiesHit`
- `private boolean hasBeenActivated`
- `private boolean hasBeenCompleted`
- `private final Runnable removeDefenseBuffRunnable`

**Methods (13):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void hitEnemy()`
- `boolean canTarget(Entity, Entity)`
- `boolean canActivate()`
- `void onCancel()`
- `void onUpdate(long)`
- `void onRemove()`
- `void clear()`

### ShadowofSvenSkill3 (class)
`com.perblue.rpg.simulation.skills.ShadowofSvenSkill3`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private final z buffs`

**Methods (1):**
- `void onInitialize()`

### SilentSpiritSkill0 (class)
`com.perblue.rpg.simulation.skills.SilentSpiritSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (1):**
- `void onInitialize()`

### SilentSpiritSkill1 (class)
`com.perblue.rpg.simulation.skills.SilentSpiritSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private static final b DAMAGE_REDUCED_COLOR`
- `private final float MIME_HUSH_REDUCTION`
- `private a processedProjectiles`
- `private EnvEntity wall`

**Methods (12):**
- `String getCastAnimation()`
- `void onCast()`
- `void removeWall()`
- `void onEndStage()`
- `boolean canActivate()`
- `void onDeath()`
- `void onRemove()`

### SilentSpiritSkill2 (class)
`com.perblue.rpg.simulation.skills.SilentSpiritSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### SilentSpiritSkill3 (class)
`com.perblue.rpg.simulation.skills.SilentSpiritSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private z buffStats`

**Methods (9):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`
- `void onRemove()`

### SilentSpiritSkill4 (class)
`com.perblue.rpg.simulation.skills.SilentSpiritSkill4`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private final float HUSH_END_OFFSET`
- `private z buffStats`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`
- `void onDeath()`
- `void onRemove()`

### SkeletonKingSkill1 (class)
`com.perblue.rpg.simulation.skills.SkeletonKingSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (5):**
- `private static final int MOVE_FORWARD = 450`
- `private Unit deer`
- `public boolean didCast`
- `private SkillDamageProvider healProvider`
- ` CombatSkill skill5`

**Methods (12):**
- `String getCastAnimation()`
- `void onCast()`
- `Unit summonDeer(Unit, CombatSkill, q)`
- `void doCast()`
- `void removeDeer()`
- `void onEndStage()`
- `long getCooldown()`
- `boolean canActivate()`
- `long getInitialCooldown()`
- `void onInitialize()`
- `void onPostInitialize()`
- `void onRemove()`

### SkeletonKingSkill2 (class)
`com.perblue.rpg.simulation.skills.SkeletonKingSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private SkillDamageProvider healProvider`
- `private Unit minHPEntity`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void onInitialize()`

### SnapDragonSkill0 (class)
`com.perblue.rpg.simulation.skills.SnapDragonSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Fields (1):**
- `private final float energy_limit`

**Methods (4):**
- `void onInitialize()`

### SnapDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.SnapDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (5):**
- `private z buffBoosts`
- `private boolean executionDamage`
- `private SkillDamageProvider healProvider`
- `private BaseProjectileEffect projectileEffect`
- `private float skill6Damage`

**Methods (25):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean isExecutionDamage()`
- `boolean isExecution(Entity)`
- `float getShieldHP(Entity)`
- `boolean shouldAutoActivate()`
- `void onInitialize()`
- `void onPostInitialize()`

### SnapDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.SnapDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `protected static final int TICK_INTERVAL = 1000`
- `private BaseProjectileEffect projectileEffect`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### SnapDragonSkill3 (class)
`com.perblue.rpg.simulation.skills.SnapDragonSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### SnapDragonSkill6 (class)
`com.perblue.rpg.simulation.skills.SnapDragonSkill6`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private float alliesCount`

**Methods (2):**
- `float getAlliesCount()`
- `void onInitialize()`

### SnapperBoneSkill1 (class)
`com.perblue.rpg.simulation.skills.SnapperBoneSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (5):**
- `private final String SKILL1_END`
- `private final String SKILL1_LOOP`
- `private final String SKILL1_START`
- `private IDamageProvider damageProvider`
- `private long loopTime`

**Methods (6):**
- `AnimationStateAdapter createAnimationListener()`
- `boolean onActivate()`
- `void onInitialize()`
- `void attack()`

### SnapperBoneSkill2 (class)
`com.perblue.rpg.simulation.skills.SnapperBoneSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (1):**
- `private boolean isActivate`

**Methods (3):**
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`

### SnapperBoneSkill3 (class)
`com.perblue.rpg.simulation.skills.SnapperBoneSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onEvent(Event)`

### SnapperBoneSkill4 (class)
`com.perblue.rpg.simulation.skills.SnapperBoneSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (3):**
- `boolean onActivate()`
- `void onInitialize()`
- `void onTeamInit()`

### SniperWolfSkill0 (class)
`com.perblue.rpg.simulation.skills.SniperWolfSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Fields (2):**
- `private static final float X_OFFSET = 500.0`
- `private static final float Z_OFFSET = 10.0`

**Methods (1):**
- `void onCast()`

### SniperWolfSkill1 (class)
`com.perblue.rpg.simulation.skills.SniperWolfSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### SniperWolfSkill2 (class)
`com.perblue.rpg.simulation.skills.SniperWolfSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private z buffStats`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onInitialize()`

### SniperWolfSkill3 (class)
`com.perblue.rpg.simulation.skills.SniperWolfSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private static final float HIT_X_OFFSET = -100.0`
- `private static final float MOVE_DURATION = 0.53333336`
- `private static final float SPAWN_X_OFFSET = -500.0`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`

### SniperWolfSkill5 (class)
`com.perblue.rpg.simulation.skills.SniperWolfSkill5`
extends `com.perblue.rpg.simulation.skills.generic.TeamStatBoostSkill`

**Methods (2):**
- `void addBuffs()`
- `void onTeamInit()`

### SojournerSorceressSkill1 (class)
`com.perblue.rpg.simulation.skills.SojournerSorceressSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `protected BaseProjectileEffect projectileEffect`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### SojournerSorceressSkill2 (class)
`com.perblue.rpg.simulation.skills.SojournerSorceressSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private SkillDamageProvider healProvider`

**Methods (9):**
- `String getCastAnimation()`
- `void onCast()`
- `Entity getMinimumHPFriend()`
- `boolean canActivate()`
- `void onInitialize()`

### SojournerSorceressSkill3 (class)
`com.perblue.rpg.simulation.skills.SojournerSorceressSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `protected static final int TICK_INTERVAL = 1000`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### SojournerSorceressSkill4 (class)
`com.perblue.rpg.simulation.skills.SojournerSorceressSkill4`
extends `com.perblue.rpg.simulation.skills.generic.TeamStatBoostSkill`

**Methods (5):**
- `float getModifyTakenDamagePriority()`
- `String getBuffName()`
- `void onInitialize()`
- `float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)`
- `void onDeath()`

### SojournerSorceressSkill5 (class)
`com.perblue.rpg.simulation.skills.SojournerSorceressSkill5`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (5):**
- `private static final int TICK_INTERVAL = 1000`
- `private float METEO_DYLAY_DURATION`
- `private z deBuffBoosts`
- `private Unit mainTarget`
- ` float mainX`

**Methods (8):**
- `String getCastAnimation()`
- `void onCast()`
- `void addBuffEnemiesToMeteoDOT()`
- `void onEvent(Event)`
- `void acquireTarget(boolean)`
- `void onInitialize()`

### SpectralDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.SpectralDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private Unit possessed`
- `private Projectile projectile`
- `private EmptyProjectileEffect projectileEffect`
- `private Unit targetToPossess`

**Methods (25):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onCancel()`
- `void onDeath()`

### SpectralDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.SpectralDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (8):**
- `private SkillDamageProvider damageProvider`
- `private ProjectileType[] easterProjectileTypes`
- `private final int numTalismans`
- `private BaseProjectileEffect projectileEffect`
- `private ProjectileType[] projectileTypes`
- `private a projectiles`
- `private ProjectileType[] reddragonProjectileTypes`
- `private SkillDamageProvider zeroProvider`

**Methods (13):**
- `void createProjectiles()`
- `void clearProjectiles()`
- `void onInitialize()`
- `void onDeath()`
- `void onRemove()`
- `void update(long)`

### SpectralDragonSkill3 (class)
`com.perblue.rpg.simulation.skills.SpectralDragonSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- ` SkillDamageProvider healProvider`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean isTargetAvailable()`
- `void acquireTarget()`
- `void onInitialize()`

### SpectralDragonSkill4 (class)
`com.perblue.rpg.simulation.skills.SpectralDragonSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- `private SkillDamageProvider damageProvider`
- `private boolean hasBegun`

**Methods (3):**
- `void spawnParticles()`
- `void onInitialize()`
- `void update(long)`

### SpiderQueenSkill0 (class)
`com.perblue.rpg.simulation.skills.SpiderQueenSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Fields (1):**
- ` SpiderQueenSkill1 skill1`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void onPostInitialize()`

### SpiderQueenSkill1 (class)
`com.perblue.rpg.simulation.skills.SpiderQueenSkill1`
extends `com.perblue.rpg.simulation.skills.generic.AnimationSkill`

**Fields (4):**
- `private CombatSkill skill3`
- `private SkillDamageProvider skill3Heal`
- `private EnvEntity spider_string1`
- `private EnvEntity spider_string2`

**Methods (16):**
- `void addActivationActions()`
- `void onTriggerEffect(Event)`
- `Unit getRandomEnemy()`
- `void onEndStage()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onPostInitialize()`
- `void onDeath()`
- `void onRemove()`
- `void update(long)`

### SpiderQueenSkill2 (class)
`com.perblue.rpg.simulation.skills.SpiderQueenSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- ` SkillDamageProvider dotDamageProvider`
- ` SpiderQueenSkill1 skill1`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onPostInitialize()`

### SpiderQueenSkill4 (class)
`com.perblue.rpg.simulation.skills.SpiderQueenSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- `private int currentTastyHeroes`
- `private int previousTastyHeroes`

**Methods (5):**
- `void updateHP(int)`
- `void onEndStage()`
- `void restorePersistentState(HeroBattleData)`
- `void savePersistentState(HeroBattleData)`
- `void onFinalInit()`

### SpikeyDragonSkill0 (class)
`com.perblue.rpg.simulation.skills.SpikeyDragonSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (5):**
- `private SkillDamageProvider damageProvider`
- `private SkillDamageProvider noDamageProvider`
- `private EmptyProjectileEffect noProjectileEffect`
- `private BaseProjectileEffect projectileEffect`
- `private float variation`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### SpikeyDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.SpikeyDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean shouldAutoActivate()`
- `void onInitialize()`
- `void onPostInitialize()`

### SpikeyDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.SpikeyDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private static final String LQ_NIGHT_QUILL_STUN = NIGHT_QUILL_STUN`
- `private BaseProjectileEffect projectileEffect`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`
- `void onPostInitialize()`

### SpikeyDragonSkill3 (class)
`com.perblue.rpg.simulation.skills.SpikeyDragonSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `static final int NUM_PROJECTILES = 12`
- `static final float RADIUS = 4000.0`
- `private BaseProjectileEffect projectileEffect`
- `private Map projectiles`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void launchSpikes(Unit, q, IProjectileEffect, IDamageProvider, SkillType)`
- `boolean onActivate()`
- `void onInitialize()`

### SpikeyDragonSkill5 (class)
`com.perblue.rpg.simulation.skills.SpikeyDragonSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (5):**
- `void addForSkill2()`
- `void addForSkill1()`
- `void addForSkill3(Entity)`
- `boolean popShields(Entity, Entity)`

### StepladderBrothersSkill0 (class)
`com.perblue.rpg.simulation.skills.StepladderBrothersSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (2):**
- `void onCast()`
- `void onInitialize()`

### StepladderBrothersSkill1 (class)
`com.perblue.rpg.simulation.skills.StepladderBrothersSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### StepladderBrothersSkill2 (class)
`com.perblue.rpg.simulation.skills.StepladderBrothersSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void onEvent(Event)`
- `void onInitialize()`

### StepladderBrothersSkill3 (class)
`com.perblue.rpg.simulation.skills.StepladderBrothersSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void onEvent(Event)`
- `boolean canActivate()`
- `void onInitialize()`

### StepladderBrothersSkill4 (class)
`com.perblue.rpg.simulation.skills.StepladderBrothersSkill4`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (9):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### StormDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.StormDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private a allEnemies`
- `private a hitEnemies`
- `private EmptyProjectileEffect projectileEffect`

**Methods (9):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`
- `void onPostInitialize()`

### StormDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.StormDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `public EnvEntity envEntity`

**Methods (8):**
- `String getCastAnimation()`
- `void onCast()`
- `AnimationStateAdapter createAnimationListener(Entity)`
- `void onInitialize()`
- `void trigger()`

### StormDragonSkill3 (class)
`com.perblue.rpg.simulation.skills.StormDragonSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private BaseProjectileEffect projectileEffect`
- `private CombatSkill skill5`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`
- `void onPostInitialize()`

### StormDragonSkill5 (class)
`com.perblue.rpg.simulation.skills.StormDragonSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

### StowawaySkill1 (class)
`com.perblue.rpg.simulation.skills.StowawaySkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (7):**
- `private AnimationStateListener animListener`
- `private EmptyProjectileEffect boomerangEffect`
- `private a hitEnemies`
- `private int overrideRandom`
- `private ParticleType[] particleTypes`
- `private BaseProjectileEffect projectileEffect`
- `private int typeIndex`

**Methods (17):**
- `String getCastAnimation()`
- `void onCast()`
- `int getNumberOfOutcomes()`
- `void overrideOutcome(int)`
- `AnimationStateAdapter createAnimationListener()`
- `boolean onActivate()`
- `void onInitialize()`
- `void onComplete()`

### StowawaySkill2 (class)
`com.perblue.rpg.simulation.skills.StowawaySkill2`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (4):**
- ` SkillDamageProvider damageProvider`
- ` SkillDamageProvider healProvider`
- ` q thiefPosition`
- ` q victimPosition`

**Methods (4):**
- `void stealItem()`
- `boolean onActivate()`
- `void onInitialize()`

### StowawaySkill3 (class)
`com.perblue.rpg.simulation.skills.StowawaySkill3`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onInitialize()`

### StowawaySkill4 (class)
`com.perblue.rpg.simulation.skills.StowawaySkill4`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (4):**
- `private float damageCollected`
- `private SkillDamageProvider damageProvider`
- `private a hitEnemies`
- `private EmptyProjectileEffect projectileEffect`

**Methods (15):**
- `void addDamageCollected(float)`
- `AnimationStateAdapter createAnimationListener()`
- `boolean onActivate()`
- `void onInitialize()`
- `void onComplete()`

### SunSeekerSkill0 (class)
`com.perblue.rpg.simulation.skills.SunSeekerSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (1):**
- `void onInitialize()`

### SunSeekerSkill1 (class)
`com.perblue.rpg.simulation.skills.SunSeekerSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `protected static final int TICK_INTERVAL = 1000`
- `protected SkillDamageProvider magicDamageProvider`
- `protected BaseProjectileEffect projectileEffect`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### SunSeekerSkill2 (class)
`com.perblue.rpg.simulation.skills.SunSeekerSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private boolean flgOnceStageEnd`
- `private final a listeners`
- `private SunSeekerSkill3 skill3`
- `private List sunEntitys`

**Methods (16):**
- `String getCastAnimation()`
- `void onCast()`
- `void addNecroDeBuff(Entity)`
- `void buffEventDeleteSunEffect()`
- `void addSun()`
- `void removeSun(Entity, boolean)`
- `void allRemoveBuff(Entity, boolean)`
- `void allRemoveSuns()`
- `void onEndStage()`
- `void onEvent(Event)`
- `void onPostInitialize()`
- `void onDeath()`
- `void onRemove()`
- `void update(long)`

### SunSeekerSkill3 (class)
`com.perblue.rpg.simulation.skills.SunSeekerSkill3`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void addStatusUpBuff(Entity)`

### SunSeekerSkill4 (class)
`com.perblue.rpg.simulation.skills.SunSeekerSkill4`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `protected static final int TICK_INTERVAL = 1000`
- `protected SkillDamageProvider magicDamageProvider`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### TombAngelSkill1 (class)
`com.perblue.rpg.simulation.skills.TombAngelSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private static ItemType skinType`
- `private boolean entombActive`

**Methods (11):**
- `String getCastAnimation()`
- `void onCast()`
- `Unit getTombableTarget()`
- `boolean isTargetAvailable()`
- `boolean canActivate()`

### TombAngelSkill2 (class)
`com.perblue.rpg.simulation.skills.TombAngelSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (5):**
- `protected TargetTest alreadyHitTest`
- `private SkillDamageProvider entombedDamageProvider`
- `private BaseProjectileEffect projectileEffect`
- `private a projectileSkill2`
- `protected a targetsHit`

**Methods (10):**
- `String getCastAnimation()`
- `void onCast()`
- `void spawnProjectile(q)`
- `void onInitialize()`
- `void onDeath()`

### TombAngelSkill3 (class)
`com.perblue.rpg.simulation.skills.TombAngelSkill3`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `protected SkillDamageProvider damageProvider`

**Methods (2):**
- `void onInitialize()`
- `void trigger(Entity)`

### TripleThreatSkill1 (class)
`com.perblue.rpg.simulation.skills.TripleThreatSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### TripleThreatSkill2 (class)
`com.perblue.rpg.simulation.skills.TripleThreatSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private SkillDamageProvider bite2DamageProvider`
- `private SkillDamageProvider bite3DamageProvider`
- `private Unit skillTarget`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### TripleThreatSkill3 (class)
`com.perblue.rpg.simulation.skills.TripleThreatSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private float frontTargetPos`
- `private BaseProjectileEffect projectileEffect`

**Methods (7):**
- `String getCastAnimation()`
- `void onCast()`
- `void updateStartPos(q)`
- `void updateEndPos(q)`
- `boolean onActivate()`
- `void onInitialize()`

### UmlautTheFirstSkill1 (class)
`com.perblue.rpg.simulation.skills.UmlautTheFirstSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onInitialize()`

### UmlautTheFirstSkill2 (class)
`com.perblue.rpg.simulation.skills.UmlautTheFirstSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `void onInitialize()`
- `void onDeath()`

### UmlautTheFirstSkill3 (class)
`com.perblue.rpg.simulation.skills.UmlautTheFirstSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (6):**
- `private static final String SKILL3_END = skill3_end`
- `private static final String SKILL3_LOOP = skill3_loop`
- `private static final String SKILL3_START = skill3_start`
- `private static float absorbedAmount`
- `private DamageSource healDamageSource`
- `private long loopTime`

**Methods (8):**
- `void heal()`
- `boolean onActivate()`
- `void onInitialize()`
- `void onDeath()`

### UmlautTheFirstSkill4 (class)
`com.perblue.rpg.simulation.skills.UmlautTheFirstSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `void onInitialize()`
- `void onDeath()`

### UnicorgiSkill1 (class)
`com.perblue.rpg.simulation.skills.UnicorgiSkill1`
extends `com.perblue.rpg.simulation.skills.generic.AnimationSkill`

**Fields (10):**
- `private static final String ATTACK_LOOP_ANIM = skill1_part1`
- `private static final float ATTACK_SPEED = 2800.0`
- `private static final float LEFT_SIDE = -2600.0`
- `private static final String RETURN_END_ANIM = skill1_part2_end`
- `private static final String RETURN_LOOP_ANIM = skill1_part2`
- `private static final float RETURN_SPEED = 2400.0`
- `private static final float RIGHT_SIDE = 2600.0`
- `private long attackDurationRemaining`
- `protected SkillDamageProvider damageProvider`
- `private aa enemiesHit`

**Methods (13):**
- `void addActivationActions()`
- `float getFacingSideX(Entity)`
- `float getSpawnSideX(Entity)`
- `boolean canTarget(Entity, Entity)`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onComplete()`
- `void onUpdate(long)`
- `void doDamage()`

### UnicorgiSkill2 (class)
`com.perblue.rpg.simulation.skills.UnicorgiSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (5):**
- `private static final String END_ANIM = skill2_end`
- `private static final String LOOP_ANIM = skill2_loop`
- `private static final String START_ANIM = skill2_start`
- `private Set damagedUnitIds`
- `private UnicorgiSkill5 legendarySkill`

**Methods (9):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void onEndStage()`
- `boolean onActivate()`
- `void onInitialize()`
- `void onComplete()`
- `void onPostInitialize()`
- `AnimateAction createAnimateAction(Entity, String, int, boolean)`

### UnicorgiSkill3 (class)
`com.perblue.rpg.simulation.skills.UnicorgiSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (6):**
- `private static final long BUBBLE_DURATION = 1200`
- `private static final String LQ_NYANDOG_HEALING = NYANDOG_HEALING`
- `private static final long RAINBOW_DURATION = 2500`
- `private static final float x = 600.0`
- `private static final float z = 500.0`
- `private SkillDamageProvider healProvider`

**Methods (8):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void doHeal(Unit, int, DamageSource, CombatSkill)`
- `void addRainbow(Unit, q)`
- `boolean canTarget(Entity, Entity)`
- `boolean canActivate()`
- `void onInitialize()`

### UnicorgiSkill5 (class)
`com.perblue.rpg.simulation.skills.UnicorgiSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (2):**
- `void setGrabThatTailCompleted(Set)`
- `void onInitialize()`

### UnripeMythologySkill0 (class)
`com.perblue.rpg.simulation.skills.UnripeMythologySkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (7):**
- `public static final TargetTest NPC_HEAD_CRAB_TEST`
- `private float incubationAnimationFrame`
- `private boolean isIncubation`
- `private boolean isOnceUpdate`
- `private float moveSpeed`
- `private BaseProjectileEffect projectileEffect`
- `private SkillDamageProvider skill2DamageProvider`

**Methods (32):**
- `String getCastAnimation()`
- `void onCast()`
- `AnimationStateAdapter createAnimationListener()`
- `void incubationMoveAction()`
- `void skill2Attack()`
- `void headCrabRemove()`
- `void restoreState()`
- `void incubation()`
- `float getTriggerRange()`
- `boolean canActivate()`
- `void restorePersistentState(HeroBattleData)`
- `void savePersistentState(HeroBattleData)`
- `void onInitialize()`
- `void update(long)`

### UnripeMythologySkill1 (class)
`com.perblue.rpg.simulation.skills.UnripeMythologySkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private BaseProjectileEffect projectileEffect`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onInitialize()`

### UnripeMythologySkill3 (class)
`com.perblue.rpg.simulation.skills.UnripeMythologySkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (10):**
- `private static final String ANIM_SKILL3_END = skill3_end`
- `private static final String ANIM_SKILL3_END02 = skill3_end02`
- `private static final String ANIM_SKILL3_LOOP = skill3_loop`
- `private static final String ANIM_SKILL3_START = skill3_start`
- `private boolean cancelAction`
- `private SkillDamageProvider healProvider`
- `private EventListener listener`
- `private String listenerID`
- `private BaseProjectileEffect projectileEffect`
- `private final Runnable removeDefenseBuffRunnable`

**Methods (21):**
- `String getCastAnimation()`
- `void onCast()`
- `void createProjectile()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onRemove()`
- `void addListener()`

### UnripeMythologySkill4 (class)
`com.perblue.rpg.simulation.skills.UnripeMythologySkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (3):**
- `private a attachedAllys`
- `private final z buffBoosts`
- `private final a listeners`

**Methods (10):**
- `void addAllyBuff()`
- `void addEvent()`
- `void removeAllyBuff()`
- `boolean canTarget(Entity, Entity)`
- `void onInitialize()`
- `void onDeath()`
- `void onRemove()`
- `void onPassiveUpdate(long)`

### UnstableUnderstudySkill0 (class)
`com.perblue.rpg.simulation.skills.UnstableUnderstudySkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (6):**
- `private static final float BACKSWING_X_OFFSET = 160.0`
- `private static final float END_X_OFFSET = 40.0`
- `private static final float INITIAL_PAUSE = 0.5`
- `private static final float OBJECT_HEIGHT = 40.0`
- `private static final float START_X_OFFSET = 480.0`
- `private BaseProjectileEffect effect`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void createBeam(q)`
- `void onInitialize()`

### UnstableUnderstudySkill1 (class)
`com.perblue.rpg.simulation.skills.UnstableUnderstudySkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (5):**
- `protected static final long HAND_ANIM_DOWN_LENGTH = 700`
- `protected static final long HAND_ANIM_UP_LENGTH = 300`
- `private static final float HAND_SIZE = 750.0`
- `private BaseProjectileEffect groundProjectileEffect`
- `private BaseProjectileEffect projectileEffect`

**Methods (13):**
- `String getCastAnimation()`
- `void onCast()`
- `void createAttackHand(Entity, Unit, BaseProjectileEffect, IDamageProvider)`
- `boolean canActivate()`
- `void onInitialize()`

### UnstableUnderstudySkill2 (class)
`com.perblue.rpg.simulation.skills.UnstableUnderstudySkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private static final float START_DIST = 2500.0`
- `private BaseProjectileEffect effect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### UnstableUnderstudySkill3 (class)
`com.perblue.rpg.simulation.skills.UnstableUnderstudySkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (3):**
- `private static final EnvEntityType[] TYPES`
- `private static final UnitType[] doNotTransform`
- `private EnvEntity envEntity`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`

### UnstableUnderstudySkill4 (class)
`com.perblue.rpg.simulation.skills.UnstableUnderstudySkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void triggerEnergyAdd()`

### UnstableUnderstudySkill5 (class)
`com.perblue.rpg.simulation.skills.UnstableUnderstudySkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onFinalInit()`

### UnstableUnderstudySkill6 (class)
`com.perblue.rpg.simulation.skills.UnstableUnderstudySkill6`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (4):**
- `float getAddPolymorphDuration()`
- `void recoverEnergyToTarget(Unit, Unit, float)`
- `void doSpoilEnergy(Unit)`

### UntargetedDirectionalProjectileHandler (class)
`com.perblue.rpg.simulation.skills.UntargetedDirectionalProjectileHandler`

**Fields (6):**
- `private a allEnemies`
- `private IDamageProvider damageProvider`
- `private a hitEnemies`
- `private EmptyProjectileEffect projectileEffect`
- `private CombatSkill sourceSkill`
- `private Unit unit`

**Methods (6):**
- `Unit getFirstEnemyHit()`
- `void fire(q, Direction)`

### VermilionPriestessSkill0 (class)
`com.perblue.rpg.simulation.skills.VermilionPriestessSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (1):**
- `void onCast()`

### VermilionPriestessSkill1 (class)
`com.perblue.rpg.simulation.skills.VermilionPriestessSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private static final String ANIM_SKILL1_END = skill1_end`
- `private static final int TICK_INTERVAL = 1000`
- `private SkillDamageProvider dotDamageProvider`
- `private BaseProjectileEffect projectileEffect`

**Methods (9):**
- `String getCastAnimation()`
- `void onCast()`
- `void endAction()`
- `boolean onActivate()`
- `void onInitialize()`
- `void onComplete()`

### VermilionPriestessSkill2 (class)
`com.perblue.rpg.simulation.skills.VermilionPriestessSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private z buffBoosts`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### VermilionPriestessSkill3 (class)
`com.perblue.rpg.simulation.skills.VermilionPriestessSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private static final float SCALE_DAMAGE = 0.04`
- `private static final int TICK_INTERVAL = 1000`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void onEvent(Event)`
- `boolean onActivate()`
- `void onInitialize()`

### VermilionPriestessSkill4 (class)
`com.perblue.rpg.simulation.skills.VermilionPriestessSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onTeamInit()`

### VileBileSkill0 (class)
`com.perblue.rpg.simulation.skills.VileBileSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (1):**
- `void onCast()`

### VileBileSkill1 (class)
`com.perblue.rpg.simulation.skills.VileBileSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private z buffStats`
- `private final Runnable removeDefenseBuffRunnable`

**Methods (6):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onInitialize()`

### VileBileSkill2 (class)
`com.perblue.rpg.simulation.skills.VileBileSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- `private EnvEntity envEntity`
- `private final a listeners`

**Methods (12):**
- `void onInitialize()`
- `void onRemove()`

### VileBileSkill4 (class)
`com.perblue.rpg.simulation.skills.VileBileSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (3):**
- `private float damageTakenDuringBuff1CurrentUse`
- `private float damageTakenDuringBuff1Total`
- `private final a listeners`

**Methods (15):**
- `void updateTotalDamageFromCurrent()`
- `void restorePersistentState(HeroBattleData)`
- `void savePersistentState(HeroBattleData)`
- `void onInitialize()`
- `void onRemove()`

### VoidWyvernSkill0 (class)
`com.perblue.rpg.simulation.skills.VoidWyvernSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `protected static final long BEAM_DURATION = 300`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `void createProjectile(Entity, Entity)`
- `void onInitialize()`

### VoidWyvernSkill1 (class)
`com.perblue.rpg.simulation.skills.VoidWyvernSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (4):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void onEvent(Event)`

### VoidWyvernSkill2 (class)
`com.perblue.rpg.simulation.skills.VoidWyvernSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (7):**
- `private static final float X_OFFSET = 400.0`
- `private static final float Y_OFFSET = 800.0`
- `private static final float Z_OFFSET = 1000.0`
- `private SkillDamageProvider damageProvider1`
- `private SkillDamageProvider damageProvider2`
- `private SkillDamageProvider damageProvider3`
- `protected BaseProjectileEffect projectileEffect`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### VoidWyvernSkill3 (class)
`com.perblue.rpg.simulation.skills.VoidWyvernSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### VoidWyvernSkill4 (class)
`com.perblue.rpg.simulation.skills.VoidWyvernSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (1):**
- `void onFinalInit()`

### VultureDragonSkill0 (class)
`com.perblue.rpg.simulation.skills.VultureDragonSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Methods (1):**
- `void onCast()`

### VultureDragonSkill1 (class)
`com.perblue.rpg.simulation.skills.VultureDragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (6):**
- `private EventListener buffListener`
- `private String buffListenerID`
- `private EventListener deathListener`
- `private String deathListenerID`
- `private boolean hasBeenActivated`
- `private SkillDamageProvider swoopDamage`

**Methods (22):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `boolean isHasBeenActivated()`
- `void initDeathListener()`
- `void initBuffListener()`
- `Entity getFrontmostEnemy()`
- `void flyDown()`
- `void onEndStage()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onComplete()`
- `void onDeath()`
- `void onRemove()`

### VultureDragonSkill2 (class)
`com.perblue.rpg.simulation.skills.VultureDragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- ` SkillDamageProvider dotDamageProvider`
- ` BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### VultureDragonSkill3 (class)
`com.perblue.rpg.simulation.skills.VultureDragonSkill3`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (3):**
- `private SkillDamageProvider healProvider`
- `private EventListener listener`
- `private String listenerID`

**Methods (8):**
- `void onInitialize()`
- `void onRemove()`

### VultureDragonSkill4 (class)
`com.perblue.rpg.simulation.skills.VultureDragonSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (3):**
- `private Unit ally`
- `private EventListener listener`
- `private String listenerID`

**Methods (8):**
- `void onInitialize()`
- `void onRemove()`

### WeeWitchSkill1 (class)
`com.perblue.rpg.simulation.skills.WeeWitchSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `protected BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### WeeWitchSkill2 (class)
`com.perblue.rpg.simulation.skills.WeeWitchSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### WeeWitchSkill3 (class)
`com.perblue.rpg.simulation.skills.WeeWitchSkill3`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private float percentage`

**Methods (4):**
- `void onInitialize()`

### WeredragonSkill0 (class)
`com.perblue.rpg.simulation.skills.WeredragonSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- ` SkillDamageProvider projectileDamage`
- ` BaseProjectileEffect projectileEffect`

**Methods (5):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean isRanged()`
- `float getTriggerRange()`
- `void onPostInitialize()`

### WeredragonSkill1 (class)
`com.perblue.rpg.simulation.skills.WeredragonSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `private final z buffBoosts`

**Methods (12):**
- `String getCastAnimation()`
- `void onCast()`
- `void explosionDamage(CombatSkill)`
- `void playSkillSound(boolean, Entity)`
- `void recoveryForHp(Entity)`
- `void onEvent(Event)`
- `boolean onActivate()`
- `void reduceEnergy()`
- `boolean canActivate()`
- `boolean energyBaselineCheck()`
- `void onDeath()`
- `void jump(Entity, float)`

### WeredragonSkill2 (class)
`com.perblue.rpg.simulation.skills.WeredragonSkill2`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `private SkillDamageProvider damageProvider`

**Methods (12):**
- `void onInitialize()`

### WeredragonSkill3 (class)
`com.perblue.rpg.simulation.skills.WeredragonSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (2):**
- `String getCastAnimation()`
- `void onCast()`

### WeredragonSkill4 (class)
`com.perblue.rpg.simulation.skills.WeredragonSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (3):**
- `private final z dragonBuffMap`
- `private final z humanBuffMap`
- `private final a listeners`

**Methods (6):**
- `boolean isDragonForm()`
- `void updateBuffs(boolean)`
- `void onInitialize()`
- `void addBuff(StatAdditionBuff, z)`
- `void onRemove()`

### WeredragonSkill5 (class)
`com.perblue.rpg.simulation.skills.WeredragonSkill5`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

### WhiteTigerSkill0 (class)
`com.perblue.rpg.simulation.skills.WhiteTigerSkill0`
extends `com.perblue.rpg.simulation.skills.generic.AttackSkill`

**Fields (3):**
- ` ProjectileType[] Types`
- `private BaseProjectileEffect projectileEffect`
- `private int triggerCount`

**Methods (3):**
- `void onCast()`
- `boolean onActivate()`
- `void onInitialize()`

### WhiteTigerSkill1 (class)
`com.perblue.rpg.simulation.skills.WhiteTigerSkill1`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private boolean canAction`
- `private float damageScale`
- `private a hitEnemies`
- `private EmptyProjectileEffect projectileEffect`

**Methods (11):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onInitialize()`

### WhiteTigerSkill2 (class)
`com.perblue.rpg.simulation.skills.WhiteTigerSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Methods (2):**
- `boolean onActivate()`
- `void onInitialize()`

### WhiteTigerSkill3 (class)
`com.perblue.rpg.simulation.skills.WhiteTigerSkill3`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (4):**
- `private boolean canAction`
- `private float damageScale`
- `private a hitEnemies`
- `private EmptyProjectileEffect projectileEffect`

**Methods (13):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean canActivate()`
- `void onInitialize()`

### WhiteTigerSkill4 (class)
`com.perblue.rpg.simulation.skills.WhiteTigerSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Methods (3):**
- `boolean onActivate()`
- `void onInitialize()`
- `void onTeamInit()`

### ZombieSquireSkill1 (class)
`com.perblue.rpg.simulation.skills.ZombieSquireSkill1`
extends `com.perblue.rpg.simulation.skills.generic.MultiAnimationSkill`

**Fields (1):**
- `private static a ANIMATIONS`

**Methods (5):**
- `void onTriggerEffect(Event)`
- `void scaleDamage(float)`
- `boolean onActivate()`
- `void onInitialize()`
- `a getCastAnimations()`

### ZombieSquireSkill2 (class)
`com.perblue.rpg.simulation.skills.ZombieSquireSkill2`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void scaleDamage(float)`

### ZombieSquireSkill4 (class)
`com.perblue.rpg.simulation.skills.ZombieSquireSkill4`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `public boolean hasBeenActivated`

**Methods (15):**
- `void checkLegendarySkill()`
- `void revive()`
- `void restorePersistentState(HeroBattleData)`
- `void savePersistentState(HeroBattleData)`
- `void updateFromPreviousStage(CombatSkill)`
- `void onInitialize()`
- `void onRemove()`

### EvilWizardBomb (class)
`com.perblue.rpg.simulation.skills.bosses.EvilWizardBomb`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- ` BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### EvilWizardSummon (class)
`com.perblue.rpg.simulation.skills.bosses.EvilWizardSummon`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (11):**
- `private static Comparator VERT_UNIT_COMPARATOR`
- `private static a allTypes`
- `private static a dps`
- `private static a excludedUnitTypes`
- `private static a random`
- `public static Random rnd`
- `private static UnitType[] stage2Types`
- `private static a tanks`
- ` Set summonedTypes`
- `private a temp`
- `private a units`

**Methods (12):**
- `String getCastAnimation()`
- `void onCast()`
- `void applyStage1(Unit)`
- `void giveFullGear(UnitData)`
- `void giveMaxEnchant(UnitData)`
- `a initGhostTypes(int)`
- `UnitType pickSkipExisting(a)`
- `void positionGhosts(a)`
- `Unit summonGhost(UnitType)`
- `boolean areTargetsInRange()`
- `boolean canActivate()`
- `void onInitialize()`

### GiantPlantBiteSkill (class)
`com.perblue.rpg.simulation.skills.bosses.GiantPlantBiteSkill`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (8):**
- `private BiteSkillState currState`
- `protected SkillDamageProvider damageProvider`
- `protected AnimationStateAdapter eventListener`
- `private float hpAtStart`
- `protected EnvEntity placeholderEntity`
- `private BossPlantAnimMapping plantAnimMapping`
- `private TagTest tastyTest`
- `protected int triggerCount`

**Methods (49):**
- `void onTriggerEffect()`
- `EnvEntity spawnPlaceholder()`
- `float addAnimateAction(String)`
- `void endSkill(boolean, boolean)`
- `void endSkillEarly()`
- `void cancel()`
- `boolean onActivate()`
- `boolean isTargetAvailable()`
- `void acquireTarget(boolean)`
- `void onInitialize()`
- `void onComplete()`
- `void onUpdate(long)`
- `boolean shouldStillUpdate()`

### GiantPlantHopSkill (class)
`com.perblue.rpg.simulation.skills.bosses.GiantPlantHopSkill`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (2):**
- `private static final float HOP_BUFFER = 800.0`
- `private SkillDamageProvider damageProvider`

**Methods (6):**
- `String getCastAnimation()`
- `void onCast()`
- `float getNewHopX()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`

### GiantPlantRootSkill0 (class)
`com.perblue.rpg.simulation.skills.bosses.GiantPlantRootSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `public static final float HIT_OFFSET = 700.0`

**Methods (7):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `boolean isTargetAvailable()`
- `void acquireTarget()`
- `void onInitialize()`
- `SkillDamageProvider getDamageProvider()`

### GiantPlantSpawnerSkill (class)
`com.perblue.rpg.simulation.skills.bosses.GiantPlantSpawnerSkill`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (3):**
- `public static final float FAR_RIGHT_MINION_X = 800.0`
- `public static final long spawnOffset = 500`
- `private MinionData[] minions`

**Methods (5):**
- `void handleSpawningMinion(MinionData, long)`
- `void handleLivingMinion(MinionData, long)`
- `Unit spawnMinion(q)`
- `void onInitialize()`
- `void onPassiveUpdate(long)`

### GiantPlantSpewPoisonSkill (class)
`com.perblue.rpg.simulation.skills.bosses.GiantPlantSpewPoisonSkill`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (5):**
- `private final int NUM_PROJECTILES`
- `private final float RADIUS`
- `protected AnimationStateAdapter eventListener`
- `private BaseProjectileEffect projectileEffect`
- `private a projectiles`

**Methods (15):**
- `String getCastAnimation()`
- `void onCast()`
- `boolean onActivate()`
- `void acquireTarget()`
- `void onInitialize()`
- `void onComplete()`

### GoldColossusEatGold (class)
`com.perblue.rpg.simulation.skills.bosses.GoldColossusEatGold`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (4):**
- `private EnvEntity gold`
- `private EnvEntity gold1`
- `private EnvEntity gold2`
- `private DamageTypeData shieldDamageFilter`

**Methods (12):**
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`

### GoldColossusJump (class)
`com.perblue.rpg.simulation.skills.bosses.GoldColossusJump`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (1):**
- ` float lastHP`

**Methods (12):**
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `void jump()`

### GoldColossusMelee (class)
`com.perblue.rpg.simulation.skills.bosses.GoldColossusMelee`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### GoldColossusSpewGold (class)
`com.perblue.rpg.simulation.skills.bosses.GoldColossusSpewGold`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- ` BaseProjectileEffect projectileEffect`

**Methods (4):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### GoldColossusSpikes (class)
`com.perblue.rpg.simulation.skills.bosses.GoldColossusSpikes`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- `private SkillDamageProvider damageProvider`
- `private Map positions`

**Methods (5):**
- `void checkPositions()`
- `void spikes()`
- `void onInitialize()`
- `void update(long)`
- `void updatePositions()`

### GoldColossusWind (class)
`com.perblue.rpg.simulation.skills.bosses.GoldColossusWind`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- ` EnvEntity flag1`
- ` EnvEntity flag2`

**Methods (7):**
- `void wind()`
- `void onInitialize()`
- `void update(long)`

### ActionSkill (class)
`com.perblue.rpg.simulation.skills.generic.ActionSkill`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (2):**
- `private long duration`
- `private AnimationType type`

**Methods (6):**
- `boolean onActivate()`
- `void onInitialize()`
- `void setDuration(long)`
- `void setType(AnimationType)`
- `long getDuration()`
- `AnimationType getType()`

### AllyBuffBoostSkill (class)
`com.perblue.rpg.simulation.skills.generic.AllyBuffBoostSkill`
extends `com.perblue.rpg.simulation.skills.generic.BuffBoostSkill`

**Methods (3):**
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`

### AnimationSkill (class)
`com.perblue.rpg.simulation.skills.generic.AnimationSkill`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (2):**
- `protected AnimationStateAdapter animationEventListener`
- `protected int triggerCount`

**Methods (13):**
- `void addActivationActions()`
- `void onTriggerEffect(Event)`
- `Animation getCurrentAnimation()`
- `float getInGameAnimationLength(String)`
- `int getTriggerCount()`
- `void onEvent(Event)`
- `boolean onActivate()`
- `void onInitialize()`
- `void onComplete()`
- `float getAnimationLength(String)`
- `float getAnimationLength(String, boolean)`
- `float getAnimationLength(AnimationType, boolean)`
- `float getAnimationLength(AnimationType)`

### AttackSkill (class)
`com.perblue.rpg.simulation.skills.generic.AttackSkill`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `protected BaseProjectileEffect projectileEffect`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### BuffBoostSkill (class)
`com.perblue.rpg.simulation.skills.generic.BuffBoostSkill`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (1):**
- `protected BuffBoostData data`

**Methods (3):**
- `IBuff makeBuff()`
- `void setData(Object)`
- `void onInitialize()`

### CastingSkill (class)
`com.perblue.rpg.simulation.skills.generic.CastingSkill`
extends `com.perblue.rpg.simulation.skills.generic.AnimationSkill`

**Fields (1):**
- `protected SkillDamageProvider damageProvider`

**Methods (6):**
- `void addActivationActions()`
- `String getCastAnimation()`
- `void onCast()`
- `void addOnHit(IOnHit)`
- `void onTriggerEffect(Event)`
- `void onInitialize()`

### CombatSkill (class)
`com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (21):**
- `public static final Log LOG`
- `protected int activations`
- `private boolean autoCast`
- `private Runnable cancelRunnable`
- `private boolean castWhenReady`
- `protected int completions`
- `protected long cooldown`
- `private long lastPlayedAudio`
- `protected int level`
- `protected int originalLevel`
- `protected Random rnd`
- `protected IScene scene`
- `protected SkillType skill`
- `protected w skillActions`
- `private boolean started`
- `protected Unit target`
- `protected q targetLoc`
- `protected boolean targetLocInvalid`
- `protected a tempBuffArray`
- `private boolean triggered`
- `protected Unit unit`

**Methods (89):**
- `boolean isUpdating()`
- `void cancel()`
- `Unit getHero()`
- `void onEndStage()`
- `SkillType getSkillType()`
- `void clearCooldown()`
- `boolean activate()`
- `void setData(Object)`
- `void updateLevel()`
- `boolean shouldCheckIfAllTargetsInBound()`
- `boolean isUnitInPlayableBounds(Entity)`
- `boolean onActivate()`
- `long getCooldown()`
- `void reduceEnergy()`
- `void activateSecondary()`
- `boolean activeAvailable()`
- `void addAction(SimAction)`
- `void addAction(SimAction, boolean)`
- `IBuff addBuffTo(Entity, IBuff)`
- `void addParallelAction(SimAction, boolean)`
- `void addParallelAction(SimAction)`
- `IBuff addSelfBuff(IBuff)`
- `boolean areTargetsInRange()`
- `float getTriggerRange()`
- `boolean hasStunBuffs(Entity)`
### com.perblue.rpg.simulation.skills.generic.CombatSkill [LOAD ERROR: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$DamageSourceType disagree on InnerClasses attribute]

### CombatSkillHelper (class)
`com.perblue.rpg.simulation.skills.generic.CombatSkillHelper`

**Fields (3):**
- `private static CombatSkillHelper INSTANCE`
- `private static final Log LOG`
- `protected EnumMap mappings`

**Methods (6):**
- `boolean isStatBoost(SkillType)`
- `CombatSkill getCombatSkill(Unit, SkillType, int)`
- `float getStat(SkillType, IHero, StatType)`
- `void createCombatSkills(Unit)`
- `void addMapping(SkillType, Class, Object)`
- `void addMapping(SkillType, Class)`

### DamageProviderWrapper (class)
`com.perblue.rpg.simulation.skills.generic.DamageProviderWrapper`

**Fields (1):**
- `private final IDamageProvider inner`

**Methods (2):**
- `DamageSource getDamageSource()`
- `CombatSkill getSkillSource()`

### DamageTypeSkill (class)
`com.perblue.rpg.simulation.skills.generic.DamageTypeSkill`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (1):**
- `protected DamageTypeData data`

**Methods (4):**
- `void setData(Object)`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`

### EnemyBuffBoostSkill (class)
`com.perblue.rpg.simulation.skills.generic.EnemyBuffBoostSkill`
extends `com.perblue.rpg.simulation.skills.generic.BuffBoostSkill`

**Methods (3):**
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`

### EnemyTeamStatBoostSkill (class)
`com.perblue.rpg.simulation.skills.generic.EnemyTeamStatBoostSkill`
extends `com.perblue.rpg.simulation.skills.generic.TeamStatBoostSkill`

**Methods (1):**
- `void addBuffs()`

### IRandomSkill (interface)
`com.perblue.rpg.simulation.skills.generic.IRandomSkill`

**Methods (2):**
- `int getNumberOfOutcomes()`
- `void overrideOutcome(int)`

### IStatBoostSkill (interface)
`com.perblue.rpg.simulation.skills.generic.IStatBoostSkill`

**Methods (1):**
- `z getBoosts()`

### IStatDebuff (interface)
`com.perblue.rpg.simulation.skills.generic.IStatDebuff`

**Methods (1):**
- `z getReductions()`

### KrakenKingSkill0 (class)
`com.perblue.rpg.simulation.skills.generic.KrakenKingSkill0`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onInitialize()`

### MinionSummoningSkill (class)
`com.perblue.rpg.simulation.skills.generic.MinionSummoningSkill`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `protected ArrayList summonedMinions`

**Methods (10):**
- `void onEndStage()`
- `boolean canActivate()`
- `int getMinionLevel()`
- `Unit summonMinion(q, UnitType)`
- `boolean canSummonMoreMinions()`
- `void queueMinionEntranceActions(Unit)`
- `UnitData getMinionData(UnitType)`
- `void removeMinions()`
- `void updateMinions()`
- `void onRemove()`

### MultiAnimationSkill (class)
`com.perblue.rpg.simulation.skills.generic.MultiAnimationSkill`
extends `com.perblue.rpg.simulation.skills.generic.AnimationSkill`

**Fields (1):**
- `protected SkillDamageProvider damageProvider`

**Methods (3):**
- `void addActivationActions()`
- `void onInitialize()`
- `a getCastAnimations()`

### MultiHitCastingSkill (class)
`com.perblue.rpg.simulation.skills.generic.MultiHitCastingSkill`
extends `com.perblue.rpg.simulation.skills.generic.CastingSkill`

**Fields (1):**
- `public static final HashMap damageProviderList`

**Methods (3):**
- `String getCastAnimation()`
- `void onCast()`
- `void onEvent(Event)`

### OppositionStatBoostSkill (class)
`com.perblue.rpg.simulation.skills.generic.OppositionStatBoostSkill`
extends `com.perblue.rpg.simulation.skills.generic.EnemyTeamStatBoostSkill`

**Methods (1):**
- `void addBuffs()`

### PassiveCombatSkill (class)
`com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Methods (5):**
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onPassiveUpdate(long)`
- `void update(long)`

### SkillCategory (enum)
`com.perblue.rpg.simulation.skills.generic.SkillCategory`
extends `java.lang.Enum`

**Fields (5):**
- `private static final SkillCategory[] $VALUES`
- `public static final SkillCategory ACTIVE`
- `public static final SkillCategory AUTO_ATTACK`
- `public static final SkillCategory OTHER`
- `public static final SkillCategory TITAN`

**Methods (2):**
- `SkillCategory[] values()`
- `SkillCategory valueOf(String)`

**Constants (4):**
- OTHER
- AUTO_ATTACK
- ACTIVE
- TITAN

### SkillDamageAndEngergyProvider (class)
`com.perblue.rpg.simulation.skills.generic.SkillDamageAndEngergyProvider`
extends `com.perblue.rpg.simulation.skills.generic.SkillDamageProvider`

**Fields (1):**
- `private float energy`

**Methods (2):**
### com.perblue.rpg.simulation.skills.generic.SkillDamageAndEngergyProvider [LOAD ERROR: com.perblue.rpg.simulation.skills.generic.SkillDamageProvider and com.perblue.rpg.simulation.skills.generic.SkillDamageProvider$DamageFunction disagree on InnerClasses attribute]

### SkillDamageProvider (class)
`com.perblue.rpg.simulation.skills.generic.SkillDamageProvider`

**Fields (7):**
- `private boolean applyImprovedHealing`
### com.perblue.rpg.simulation.skills.generic.SkillDamageProvider [LOAD ERROR: com.perblue.rpg.simulation.skills.generic.SkillDamageProvider and com.perblue.rpg.simulation.skills.generic.SkillDamageProvider$CustomDamageFunction disagree on InnerClasses attribute]

### StatBoostSkill (class)
`com.perblue.rpg.simulation.skills.generic.StatBoostSkill`
extends `com.perblue.rpg.simulation.skills.generic.PassiveCombatSkill`

**Fields (2):**
- `private z boosts`
- `private StatBoostData mapping`

**Methods (4):**
- `z getBoosts()`
- `float getStat(SkillType, IHero, StatType, Object)`
- `void setData(Object)`
- `void onInitialize()`

### StatBoostWithBuffSkill (class)
`com.perblue.rpg.simulation.skills.generic.StatBoostWithBuffSkill`
extends `com.perblue.rpg.simulation.skills.generic.StatBoostSkill`

**Fields (1):**
- `protected StatBoostWithBuffData data`

**Methods (3):**
- `IBuff makeBuff()`
- `void setData(Object)`
- `void onInitialize()`

### TeamStatBoostSkill (class)
`com.perblue.rpg.simulation.skills.generic.TeamStatBoostSkill`
extends `com.perblue.rpg.simulation.skills.generic.StatBoostSkill`

**Methods (3):**
- `void addBuffs()`
- `void onTeamInit()`
- `long getDuration()`

### AquaticManSkillTitan (class)
`com.perblue.rpg.simulation.skills.titan.AquaticManSkillTitan`
extends `com.perblue.rpg.simulation.skills.titan.MultiTriggerSkill`

**Fields (3):**
- `private SkillDamageProvider damageProvider`
- `private q sourcePos`
- `private UntargetedDirectionalProjectileHandler wave`

**Methods (3):**
- `int getTotalTriggers()`
- `void onTrigger()`
- `void onInitialize()`

### BrozerkerSkillTitan (class)
`com.perblue.rpg.simulation.skills.titan.BrozerkerSkillTitan`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (1):**
- `private a alliesToShield`

**Methods (7):**
- `void addShield(Unit)`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onComplete()`
- `void onUpdate(long)`
- `boolean shouldStillUpdate()`

### CentaurOfAttentionSkillTitan (class)
`com.perblue.rpg.simulation.skills.titan.CentaurOfAttentionSkillTitan`
extends `com.perblue.rpg.simulation.skills.titan.MultiTriggerSkill`

**Fields (2):**
- `private SkillDamageProvider damageProvider`
- `private BaseProjectileEffect projectileEffect`

**Methods (3):**
- `int getTotalTriggers()`
- `void onTrigger()`
- `void onInitialize()`

### DragonLadySkillTitan (class)
`com.perblue.rpg.simulation.skills.titan.DragonLadySkillTitan`
extends `com.perblue.rpg.simulation.skills.titan.MultiTriggerSkill`

**Fields (9):**
- `private static final float PROJECTILE_RADIUS = 50.0`
- `private SkillDamageProvider damageProvider`
- `private q endPos`
- `private q p1`
- `private q p2`
- `private q p3`
- `private BaseProjectileEffect projectileEffect`
- `private q sourceLoc`
- `private q startPos`

**Methods (7):**
- `BaseProjectileEffect createProjectileEffect(CombatSkill, IDamageProvider)`
- `b createBSpline(q, q)`
- `void launchDragon(Unit, BaseProjectileEffect, IDamageProvider, q, q, SkillType)`
- `int getTotalTriggers()`
- `void onTrigger()`
- `void onInitialize()`
- `void onRemove()`

### FaithHealerSkillTitan (class)
`com.perblue.rpg.simulation.skills.titan.FaithHealerSkillTitan`
extends `com.perblue.rpg.simulation.skills.titan.MultiTriggerSkill`

**Fields (1):**
- `private SkillDamageProvider healProvider`

**Methods (3):**
- `int getTotalTriggers()`
- `void onTrigger()`
- `void onInitialize()`

### GenieSkillTitan (class)
`com.perblue.rpg.simulation.skills.titan.GenieSkillTitan`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (1):**
- `private IDamageProvider damageProvider`

**Methods (2):**
- `boolean onActivate()`
- `void onInitialize()`

### MultiTriggerSkill (class)
`com.perblue.rpg.simulation.skills.titan.MultiTriggerSkill`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (3):**
- `protected boolean shouldUpdate`
- `private long timeLeft`
- `private int totalTriggers`

**Methods (7):**
- `int getTotalTriggers()`
- `void onTrigger()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onComplete()`
- `void onUpdate(long)`
- `boolean shouldStillUpdate()`

### SkeletonKingSkillTitan (class)
`com.perblue.rpg.simulation.skills.titan.SkeletonKingSkillTitan`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (1):**
- `private Unit deer`

**Methods (7):**
- `void removeDeer()`
- `void onEndStage()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onRemove()`
- `void update(long)`

### SnapDragonSkillTitan (class)
`com.perblue.rpg.simulation.skills.titan.SnapDragonSkillTitan`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (2):**
- `private Unit titan`
- `private x unitsHP`

**Methods (7):**
- `void giveTitanEnergy()`
- `boolean onActivate()`
- `boolean canActivate()`
- `void onInitialize()`
- `void onComplete()`
- `void onUpdate(long)`
- `boolean shouldStillUpdate()`

### SpikeyDragonSkillTitan (class)
`com.perblue.rpg.simulation.skills.titan.SpikeyDragonSkillTitan`
extends `com.perblue.rpg.simulation.skills.generic.CombatSkill`

**Fields (2):**
- `private IDamageProvider damageProvider`
- `private IProjectileEffect projectileEffect`

**Methods (4):**
- `boolean onActivate()`
- `void acquireTarget()`
- `boolean canActivate()`
- `void onInitialize()`

### UnstableUnderstudySkillTitan (class)
`com.perblue.rpg.simulation.skills.titan.UnstableUnderstudySkillTitan`
extends `com.perblue.rpg.simulation.skills.titan.MultiTriggerSkill`

**Fields (3):**
- `private SkillDamageProvider damageProvider`
- `private BaseProjectileEffect groundProjectileEffect`
- `private BaseProjectileEffect projectileEffect`

**Methods (7):**
- `int getTotalTriggers()`
- `void onTrigger()`
- `void onInitialize()`

### BossTargetTest (class)
`com.perblue.rpg.simulation.targettests.BossTargetTest`
extends `com.perblue.rpg.simulation.TargetingHelper$PoolableTest`

**Fields (1):**
- `private boolean isBoss`

**Methods (4):**
- `BossTargetTest isNotBoss()`
- `boolean canTarget(Entity, Entity)`
- `boolean isBoss(Entity)`
- `BossTargetTest isBoss()`

### HPTargetReducers (class)
`com.perblue.rpg.simulation.targettests.HPTargetReducers`

**Fields (4):**
- `public static final TargetReducer HIGHEST_HP`
- `public static final TargetReducer HIGHEST_PERCENT_HP`
- `public static final TargetReducer LOWEST_HP`
- `public static final TargetReducer LOWEST_PERCENT_HP`

### PoolableReducer (class)
`com.perblue.rpg.simulation.targettests.PoolableReducer`

**Fields (1):**
- `private boolean autoFree`

**Methods (4):**
- `void setShouldAutoFree(boolean)`
- `boolean shouldAutoFree()`
- `PoolableReducer obtain(Class)`
- `void free()`

### PositionTargetReducers (class)
`com.perblue.rpg.simulation.targettests.PositionTargetReducers`

**Fields (6):**
- `public static final TargetReducer CLOSEST_IN_FRONT`
- `public static final TargetReducer CLOSEST_TO_SOURCE`
- `public static final TargetReducer FARTHEST_FROM_SOURCE`
- `public static final TargetReducer FARTHEST_LEFT`
- `public static final TargetReducer FARTHEST_RIGHT`
- `private static final Comparator LEFT_COMPARATOR`

**Methods (2):**
- `TargetReducer getMostUpFront(Entity)`
- `TargetReducer getMostInBack(Entity)`

### RandomTargetReducers (class)
`com.perblue.rpg.simulation.targettests.RandomTargetReducers`

**Fields (1):**
- `public static final TargetReducer RANDOM`

### StatTargetReducer (class)
`com.perblue.rpg.simulation.targettests.StatTargetReducer`
extends `com.perblue.rpg.simulation.targettests.PoolableReducer`

**Fields (2):**
- `private boolean findLowest`
- `private StatType statType`

**Methods (3):**
- `StatTargetReducer highest(StatType)`
- `StatTargetReducer lowest(StatType)`
- `Unit getSingleTarget(Entity, a)`

### TargetReducerUtil (class)
`com.perblue.rpg.simulation.targettests.TargetReducerUtil`

**Methods (3):**
- `TargetReducer createTargetReducer(Comparator)`
- `Object getBest(a, Comparator)`
- `Comparator reverse(Comparator)`

### TitanTargetTest (class)
`com.perblue.rpg.simulation.targettests.TitanTargetTest`
extends `com.perblue.rpg.simulation.TargetingHelper$PoolableTest`

**Fields (1):**
- `private boolean isTitan`

**Methods (4):**
- `TitanTargetTest isTitan()`
- `boolean isTitan(Entity)`
- `TitanTargetTest isNotTitan()`
- `boolean canTarget(Entity, Entity)`

## Package: com.perblue.rpg.game.buff (182 classes)

### AOEOT (class)
`com.perblue.rpg.game.buff.AOEOT`
extends `com.perblue.rpg.game.buff.SimpleIntervalBuff`

**Fields (1):**
- `private IDamageProvider damageProvider`

**Methods (5):**
- `AOEOT initDamageProvider(IDamageProvider)`
- `void getBuffIcons(a)`
- `float getDamageRatioAtMaxDistance()`
- `void copyTo(IBuff)`
- `void doTick(Entity)`

### BansheeOnCritBuff (class)
`com.perblue.rpg.game.buff.BansheeOnCritBuff`
extends `com.perblue.rpg.game.buff.PassiveSkillBuff`

**Methods (1):**
- `float onCrit(Entity, Entity, DamageSource, float)`

### BaseStatAdditionBuff (class)
`com.perblue.rpg.game.buff.BaseStatAdditionBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (2):**
- `protected CombatSkill skill`
- `protected z statModification`

**Methods (4):**
- `SimpleDurationBuff initStatModification(z)`
- `void getBuffIcons(a)`
- `z getStatAdditions()`
- `void connectSourceSkill(CombatSkill)`

### BlindBuff (class)
`com.perblue.rpg.game.buff.BlindBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (1):**
- `private float level`

**Methods (6):**
- `StackingEffect getStackingEffect(IBuff)`
- `void getBuffIcons(a)`
- `String getBuffName()`
- `float getEffectiveLevel()`
- `BlindBuff initEffectiveLevel(float)`
- `void onAdd(Entity)`

### BoneDragonNegationAuraBuff (class)
`com.perblue.rpg.game.buff.BoneDragonNegationAuraBuff`
extends `com.perblue.rpg.game.buff.PassiveSkillBuff`

**Methods (1):**
- `void onPreDealingDamage(Entity, Entity, DamageSource)`

### BoneDragonTitanBuff (class)
`com.perblue.rpg.game.buff.BoneDragonTitanBuff`

**Fields (1):**
- `private CombatSkill skill`

**Methods (4):**
- `void preDamageToTarget(Entity, Entity, IDamageProvider)`
- `float getDamageToTargetAwarePriority()`
- `String getBuffName()`
- `void connectSourceSkill(CombatSkill)`

### BossBattleBuff (class)
`com.perblue.rpg.game.buff.BossBattleBuff`

**Methods (2):**
- `String getBuffName()`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`

### BossBuff (class)
`com.perblue.rpg.game.buff.BossBuff`
extends `com.perblue.rpg.game.buff.UntargetableBuffWithDungeonManSkill3`

**Methods (2):**
- `String getBuffName()`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`

### BrozerkerExplodingShieldBuff (class)
`com.perblue.rpg.game.buff.BrozerkerExplodingShieldBuff`
extends `com.perblue.rpg.game.buff.HealthShieldBuff`

**Fields (1):**
- `private SkillDamageProvider damageProvider`

**Methods (4):**
- `BrozerkerExplodingShieldBuff initDamageProvider(SkillDamageProvider)`
- `StackingEffect getStackingEffect(IBuff)`
- `void copyTo(IBuff)`
- `void onRemove(Entity)`

### BrozerkerHealingShieldBuff (class)
`com.perblue.rpg.game.buff.BrozerkerHealingShieldBuff`
extends `com.perblue.rpg.game.buff.HealthShieldBuff`

**Methods (2):**
- `StackingEffect getStackingEffect(IBuff)`
- `float damageShield(float, DamageSource, Entity)`

### BrozerkerReducedMagicDamageBuff (class)
`com.perblue.rpg.game.buff.BrozerkerReducedMagicDamageBuff`

**Fields (1):**
- `private CombatSkill skill`

**Methods (4):**
- `float getModifyTakenDamagePriority()`
- `String getBuffName()`
- `void connectSourceSkill(CombatSkill)`
- `float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)`

### BuffFactoryHelper (class)
`com.perblue.rpg.game.buff.BuffFactoryHelper`

### BuffHelper (class)
`com.perblue.rpg.game.buff.BuffHelper`

**Fields (2):**
- `private static final TargetTest DISPELLER_TEST`
- `private static final Log LOG`

**Methods (7):**
- `ICopyableBuff makeCopy(ICopyableBuff)`
- `boolean tryDebuff(Entity, Entity, CombatSkill)`
- `float getTenacityDurationScale(Unit, IDisableBuff)`
- `float getLongerDisablesDurationScale(Entity)`
- `void notifyDispellers(Entity, IBuff)`
- `IBuff getBuffFromType(IBuff, Class)`
- `boolean isBuffType(IBuff, Class)`

### CastingFreeze (class)
`com.perblue.rpg.game.buff.CastingFreeze`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Methods (1):**
- `StackingEffect getStackingEffect(IBuff)`

### CharmedBuff (class)
`com.perblue.rpg.game.buff.CharmedBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (1):**
- `private CombatSkill skill`

**Methods (7):**
- `StackingEffect getStackingEffect(IBuff)`
- `void getBuffIcons(a)`
- `CharSequence getCombatText()`
- `void copyTo(IBuff)`
- `void connectSourceSkill(CombatSkill)`
- `float getEffectiveLevel()`
- `CombatSkill getSourceSkill()`

### ClawManPoisonBuff (class)
`com.perblue.rpg.game.buff.ClawManPoisonBuff`
extends `com.perblue.rpg.game.buff.StatSubtractionBuff`

**Methods (1):**
- `void onAdd(Entity)`

### CosmicElfSilenceBuff (class)
`com.perblue.rpg.game.buff.CosmicElfSilenceBuff`
extends `com.perblue.rpg.game.buff.SilenceBuff`

### CrimsonWitchLegendaryDamageDebuff (class)
`com.perblue.rpg.game.buff.CrimsonWitchLegendaryDamageDebuff`
extends `com.perblue.rpg.game.buff.StatSubtractionBuff`

**Fields (1):**
- `private float maxDebuffPercentage`

**Methods (4):**
- `void setMaxDebuffPercentage(float)`
- `void copyTo(IBuff)`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`
- `CrimsonWitchLegendaryDamageDebuff build(float, float)`

### CrimsonWitchLegendaryDodgeDebuff (class)
`com.perblue.rpg.game.buff.CrimsonWitchLegendaryDodgeDebuff`
extends `com.perblue.rpg.game.buff.StatReductionBuff`

**Fields (1):**
- `private float MAX_STACK_DODGE_REDUCTION`

**Methods (3):**
- `void copyTo(IBuff)`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`
- `CrimsonWitchLegendaryDodgeDebuff build(float)`

### CyclopsWizardEnergyBuff (class)
`com.perblue.rpg.game.buff.CyclopsWizardEnergyBuff`
extends `com.perblue.rpg.game.buff.SimpleIntervalBuff`

**Fields (2):**
- `private boolean inCombat`
- `private CombatSkill skill`

**Methods (7):**
- `StackingEffect getStackingEffect(IBuff)`
- `void onCombatStart(Entity)`
- `void onCombatDone(Entity)`
- `void giveEnergy(Entity)`
- `void connectSourceSkill(CombatSkill)`
- `void doTick(Entity)`
- `void update(Entity, long)`

### DruidinatrixCloneBuff (class)
`com.perblue.rpg.game.buff.DruidinatrixCloneBuff`

**Fields (2):**
- `private boolean hasBeenMapped`
- `private boolean ranged`

**Methods (5):**
- `DruidinatrixCloneBuff setRanged(boolean)`
- `boolean isRanged()`
- `String getBuffName()`
- `void onRemove(Entity)`
- `void update(Entity, long)`

### DruidinatrixEnergyDrain (class)
`com.perblue.rpg.game.buff.DruidinatrixEnergyDrain`
extends `com.perblue.rpg.game.buff.SimpleIntervalBuff`

**Fields (1):**
- `private CombatSkill sourceSkill`

**Methods (6):**
- `StackingEffect getStackingEffect(IBuff)`
- `DruidinatrixEnergyDrain initSourceSkill(CombatSkill)`
- `void copyTo(IBuff)`
- `void doTick(Entity)`
- `void onAdd(Entity)`
- `void onRemove(Entity)`

### DungeonManTrappedBuff (class)
`com.perblue.rpg.game.buff.DungeonManTrappedBuff`
extends `com.perblue.rpg.game.buff.PreventsDisables`

**Methods (1):**
- `String getBuffName()`

### EnergyShieldBuff (class)
`com.perblue.rpg.game.buff.EnergyShieldBuff`
extends `com.perblue.rpg.game.buff.ShieldBuff`

**Methods (4):**
- `float getShieldHP()`
- `float damageShield(float, Entity)`
### com.perblue.rpg.game.buff.EnergyShieldBuff [LOAD ERROR: com.perblue.rpg.game.buff.ShieldBuff and com.perblue.rpg.game.buff.ShieldBuff$ShieldType disagree on InnerClasses attribute]

### FaithHealerReducedPhysicalDamage (class)
`com.perblue.rpg.game.buff.FaithHealerReducedPhysicalDamage`

**Fields (1):**
- `private CombatSkill skill`

**Methods (4):**
- `float getModifyTakenDamagePriority()`
- `String getBuffName()`
- `void connectSourceSkill(CombatSkill)`
- `float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)`

### GenieHornRemovalHelperBuff (class)
`com.perblue.rpg.game.buff.GenieHornRemovalHelperBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Methods (1):**
- `void onRemove(Entity)`

### GenieHornsBuff (class)
`com.perblue.rpg.game.buff.GenieHornsBuff`
extends `com.perblue.rpg.game.buff.StatAdditionBuff`

**Methods (3):**
- `void getBuffIcons(a)`
- `void onAdd(Entity)`
- `void onRemove(Entity)`

### GenieRevivableBuff (class)
`com.perblue.rpg.game.buff.GenieRevivableBuff`

**Methods (1):**
- `String getBuffName()`

### GenieRevivingBuff (class)
`com.perblue.rpg.game.buff.GenieRevivingBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (3):**
- `private int blockedHitsRemaining`
- `private boolean freeBlock`
- `private GenieSkill2 skill`

**Methods (9):**
- `float getModifyTakenDamagePriority()`
- `void onPreDamage(Entity, Entity, DamageSource)`
- `GenieRevivingBuff setMaxBlockedHits(int)`
- `void copyTo(IBuff)`
- `void connectSourceSkill(CombatSkill)`
- `float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`
- `void onAdd(Entity)`
- `void onRemove(Entity)`

### GhostBuff (class)
`com.perblue.rpg.game.buff.GhostBuff`

**Fields (3):**
- `private float damageScalar`
- `private Unit source`
- `private b tintColor`

**Methods (9):**
- `void doCooldownReduction(Entity, SkillType, int)`
- `void doBossHPLoss(SkillType)`
- `void setTintColor(b)`
- `b getTintColor()`
- `String getBuffName()`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`
- `GhostBuff setSource(Unit)`
- `void onRemove(Entity)`
- `float getDamageScalar()`

### GiantPlantInvincibleBuff (class)
`com.perblue.rpg.game.buff.GiantPlantInvincibleBuff`

**Fields (1):**
- ` boolean allowDOT`

**Methods (7):**
- `float getModifyTakenDamagePriority()`
- `GiantPlantInvincibleBuff setAllowDOT(boolean)`
- `void copyTo(IBuff)`
- `IBuff makeInstance()`
- `String getBuffName()`
- `float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`

### GoldenColossusShield (class)
`com.perblue.rpg.game.buff.GoldenColossusShield`
extends `com.perblue.rpg.game.buff.HealthShieldBuff`

**Methods (3):**
- `void destroyShield(boolean)`
- `void onAdd(Entity)`
- `void onRemove(Entity)`

### GreedyDragonSteadfastBuff (class)
`com.perblue.rpg.game.buff.GreedyDragonSteadfastBuff`

**Methods (2):**
- `String getBuffName()`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`

### GuaranteedCrit (class)
`com.perblue.rpg.game.buff.GuaranteedCrit`

**Methods (1):**
- `String getBuffName()`

### HeadCrabDebuff (class)
`com.perblue.rpg.game.buff.HeadCrabDebuff`
extends `com.perblue.rpg.game.buff.SimpleDOT`

**Fields (1):**
- `private CombatSkill skill`

**Methods (6):**
- `void getBuffIcons(a)`
- `CharSequence getCombatText()`
- `void copyTo(IBuff)`
- `String getBuffName()`
- `void connectSourceSkill(CombatSkill)`
- `float getEffectiveLevel()`

### HeadCrabTargetMarker (class)
`com.perblue.rpg.game.buff.HeadCrabTargetMarker`

**Methods (1):**
- `String getBuffName()`

### HealthShieldBuff (class)
`com.perblue.rpg.game.buff.HealthShieldBuff`
extends `com.perblue.rpg.game.buff.ShieldBuff`

**Methods (16):**
- `void getBuffIcons(a)`
- `boolean updateForStackingEffect(Entity, SimpleDurationBuff, StackingEffect)`
- `float damageShield(float, DamageSource, Entity)`
- `void copyTo(IBuff)`
- `String getBuffName()`
- `void connectSourceSkill(CombatSkill)`
- `int getEffectiveLevel()`
- `float getTotalSize()`
- `void setShieldHp(float)`
- `void setTotalShieldHp(float)`
- `void destroyShield(boolean)`
- `HealthShieldBuff initShieldDuration(long, Unit)`
- `HealthShieldBuff initShieldSize(float, Unit)`
- `SimpleDurationBuff initDuration(long)`

### HeavyTagBuff (class)
`com.perblue.rpg.game.buff.HeavyTagBuff`

**Fields (1):**
- `private boolean disableParticle`

**Methods (4):**
- `void disableParticle(boolean)`
- `boolean isDisableParticle()`
- `String getBuffName()`
- `boolean hasBuff(HeroTag)`

### IActiveAbilityDisabled (interface)
`com.perblue.rpg.game.buff.IActiveAbilityDisabled`

### IAddAwareBuff (interface)
`com.perblue.rpg.game.buff.IAddAwareBuff`

**Methods (1):**
- `void onAdd(Entity)`

### IBuff (interface)
`com.perblue.rpg.game.buff.IBuff`

**Methods (1):**
- `String getBuffName()`

### IBuffDebugInfo (interface)
`com.perblue.rpg.game.buff.IBuffDebugInfo`

**Methods (1):**
- `String getDebugString()`

### IBuffIcon (interface)
`com.perblue.rpg.game.buff.IBuffIcon`

**Methods (1):**
- `void getBuffIcons(a)`

### IBuffWrapperBuff (interface)
`com.perblue.rpg.game.buff.IBuffWrapperBuff`

**Methods (2):**
- `IBuff getInnerBuff()`
- `void setInnerBuff(IBuff)`

### ICharmImmunityBuff (interface)
`com.perblue.rpg.game.buff.ICharmImmunityBuff`

### ICharmed (interface)
`com.perblue.rpg.game.buff.ICharmed`

### ICombatTextBuff (interface)
`com.perblue.rpg.game.buff.ICombatTextBuff`

**Methods (1):**
- `CharSequence getCombatText()`

### IConspirator (interface)
`com.perblue.rpg.game.buff.IConspirator`

### ICopyToSpawnBuff (interface)
`com.perblue.rpg.game.buff.ICopyToSpawnBuff`

### ICopyableBuff (interface)
`com.perblue.rpg.game.buff.ICopyableBuff`

**Methods (2):**
- `void copyTo(IBuff)`
- `IBuff makeInstance()`

### ICrossCounterBuff (interface)
`com.perblue.rpg.game.buff.ICrossCounterBuff`

**Methods (1):**
- `void onCrossCounter(Entity)`

### IDOTBuff (interface)
`com.perblue.rpg.game.buff.IDOTBuff`

**Methods (1):**
- `void copyTo(IBuff)`

### IDamageModifyingBuff (interface)
`com.perblue.rpg.game.buff.IDamageModifyingBuff`

**Methods (1):**
- `float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)`

### IDamageReflectingBuff (interface)
`com.perblue.rpg.game.buff.IDamageReflectingBuff`

### IDamageToTargetAware (interface)
`com.perblue.rpg.game.buff.IDamageToTargetAware`

**Fields (1):**
- `public static final Comparator PRIORITY_SORTER`

**Methods (2):**
- `void preDamageToTarget(Entity, Entity, IDamageProvider)`
- `float getDamageToTargetAwarePriority()`

### IDeathAwareBuff (interface)
`com.perblue.rpg.game.buff.IDeathAwareBuff`

**Methods (1):**
- `void onDeath(Entity, boolean)`

### IDebuff (interface)
`com.perblue.rpg.game.buff.IDebuff`

### IDebuffImmune (interface)
`com.perblue.rpg.game.buff.IDebuffImmune`

### IDisableActiveSkillBuff (interface)
`com.perblue.rpg.game.buff.IDisableActiveSkillBuff`

### IDisableAttackBuff (interface)
`com.perblue.rpg.game.buff.IDisableAttackBuff`

### IDisableBuff (interface)
`com.perblue.rpg.game.buff.IDisableBuff`

**Methods (1):**
- `float getEffectiveLevel()`

### IDisableableBuff (interface)
`com.perblue.rpg.game.buff.IDisableableBuff`

**Methods (2):**
- `boolean isDisabled()`
- `void setDisabled(boolean)`

### IDodgeAwareBuff (interface)
`com.perblue.rpg.game.buff.IDodgeAwareBuff`

**Methods (1):**
- `void onDodge(Entity)`

### IDrainBar (interface)
`com.perblue.rpg.game.buff.IDrainBar`

### IDurationBuff (interface)
`com.perblue.rpg.game.buff.IDurationBuff`

**Fields (1):**
- `public static final long INDEFINITE = -1`

**Methods (4):**
- `float getDurationScale()`
- `long getTimeLeft()`
- `void setDurationScale(float)`
- `long getDuration()`

### IEnergyInvincible (interface)
`com.perblue.rpg.game.buff.IEnergyInvincible`

### IEnergyShieldBuff (interface)
`com.perblue.rpg.game.buff.IEnergyShieldBuff`

**Fields (1):**
- `public static final int SHIELD_IMMUNE = -1`

**Methods (4):**
- `float getShieldHP()`
- `float damageShield(float, Entity)`
- `float getTotalSize()`
- `void destroyShield(boolean)`

### IEntityAwareBuff (interface)
`com.perblue.rpg.game.buff.IEntityAwareBuff`

**Methods (2):**
- `Entity getEntity()`
- `void setEntity(Entity)`

### IFocusTargetBuff (interface)
`com.perblue.rpg.game.buff.IFocusTargetBuff`

### IHeroTagBuff (interface)
`com.perblue.rpg.game.buff.IHeroTagBuff`

**Methods (1):**
- `boolean hasBuff(HeroTag)`

### IIgnoreSpecialDeathBuff (interface)
`com.perblue.rpg.game.buff.IIgnoreSpecialDeathBuff`

### IImmovable (interface)
`com.perblue.rpg.game.buff.IImmovable`

### IInvincible (interface)
`com.perblue.rpg.game.buff.IInvincible`

### IModifyDamageDealtState1 (interface)
`com.perblue.rpg.game.buff.IModifyDamageDealtState1`

**Methods (1):**
- `float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)`

### IModifyDamageDealtState2 (interface)
`com.perblue.rpg.game.buff.IModifyDamageDealtState2`

**Methods (1):**
- `float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)`

### IModifyTakenDamagePostShield (interface)
`com.perblue.rpg.game.buff.IModifyTakenDamagePostShield`

**Methods (1):**
- `float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)`

### IModifyTakenDamageStage1 (interface)
`com.perblue.rpg.game.buff.IModifyTakenDamageStage1`

**Methods (1):**
- `float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)`

### IModifyTakenDamageStage2 (interface)
`com.perblue.rpg.game.buff.IModifyTakenDamageStage2`

**Fields (1):**
- `public static final Comparator PRIORITY_SORTER`

**Methods (2):**
- `float getModifyTakenDamagePriority()`
- `float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)`

### IOnCombatDoneBuff (interface)
`com.perblue.rpg.game.buff.IOnCombatDoneBuff`

**Methods (1):**
- `void onCombatDone(Entity)`

### IOnCombatStartBuff (interface)
`com.perblue.rpg.game.buff.IOnCombatStartBuff`

**Methods (1):**
- `void onCombatStart(Entity)`

### IOnHealedBuff (interface)
`com.perblue.rpg.game.buff.IOnHealedBuff`

**Methods (1):**
- `float onHeal(Entity, Entity, DamageSource, float)`

### IOnHealingBuff (interface)
`com.perblue.rpg.game.buff.IOnHealingBuff`

**Methods (1):**
- `float onHeal(Entity, Entity, DamageSource, float)`

### IOnHitAwareBuff (interface)
`com.perblue.rpg.game.buff.IOnHitAwareBuff`

**Methods (1):**
- `void onHit(Entity, Entity, DamageSource)`

### IOnIdleBuff (interface)
`com.perblue.rpg.game.buff.IOnIdleBuff`

**Methods (1):**
- `boolean onIdle(Entity)`

### IOnLifeSteal (interface)
`com.perblue.rpg.game.buff.IOnLifeSteal`

**Methods (1):**
- `float onLifeSteal(Entity, Entity, float)`

### IOtherBuffAddAwareBuff (interface)
`com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff`

**Methods (1):**
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`

### IOtherBuffRemoveAwareBuff (interface)
`com.perblue.rpg.game.buff.IOtherBuffRemoveAwareBuff`

**Methods (1):**
- `void onOtherBuffRemove(Entity, IBuff)`

### IPariah (interface)
`com.perblue.rpg.game.buff.IPariah`

### IPartiallyDefeatedBuff (interface)
`com.perblue.rpg.game.buff.IPartiallyDefeatedBuff`

### IPauseSkillCooldownsBuff (interface)
`com.perblue.rpg.game.buff.IPauseSkillCooldownsBuff`

### IPirateShieldBuff (interface)
`com.perblue.rpg.game.buff.IPirateShieldBuff`

### IPreDamagedAwareBuff (interface)
`com.perblue.rpg.game.buff.IPreDamagedAwareBuff`

**Methods (1):**
- `void onPreDamage(Entity, Entity, DamageSource)`

### IPreDamagingAwareBuff (interface)
`com.perblue.rpg.game.buff.IPreDamagingAwareBuff`

**Methods (1):**
- `void onPreDealingDamage(Entity, Entity, DamageSource)`

### IPreEnergyChange (interface)
`com.perblue.rpg.game.buff.IPreEnergyChange`

**Methods (1):**
- `boolean onPreEnergyChange(Entity, Entity, float, CombatSkill)`

### IPreventEnergyGainBuff (interface)
`com.perblue.rpg.game.buff.IPreventEnergyGainBuff`

### IRPGParticleEffectAwareBuff (interface)
`com.perblue.rpg.game.buff.IRPGParticleEffectAwareBuff`

**Methods (2):**
- `void setRPGParticleEffect(RPGParticleEffect)`
- `RPGParticleEffect getRPGParticleEffect()`

### IRemovableNegativeBuff (interface)
`com.perblue.rpg.game.buff.IRemovableNegativeBuff`

**Methods (1):**
- `int getEffectiveLevel()`

### IRemovablePositiveBuff (interface)
`com.perblue.rpg.game.buff.IRemovablePositiveBuff`

**Methods (1):**
- `int getEffectiveLevel()`

### IRemoveAwareBuff (interface)
`com.perblue.rpg.game.buff.IRemoveAwareBuff`

**Methods (1):**
- `void onRemove(Entity)`

### IRoundBoostBuff (interface)
`com.perblue.rpg.game.buff.IRoundBoostBuff`

**Methods (1):**
- `void doRoundBoosts()`

### ISkillActivationAwareBuff (interface)
`com.perblue.rpg.game.buff.ISkillActivationAwareBuff`

**Methods (1):**
- `boolean onSkillActivation(Entity, CombatSkill)`

### ISkillActivationControlBuff (interface)
`com.perblue.rpg.game.buff.ISkillActivationControlBuff`

**Methods (1):**
- `boolean onSkillActivate(Entity, CombatSkill)`

### ISkillAwareBuff (interface)
`com.perblue.rpg.game.buff.ISkillAwareBuff`

**Methods (1):**
- `void connectSourceSkill(CombatSkill)`

### ISourceAwareBuff (interface)
`com.perblue.rpg.game.buff.ISourceAwareBuff`

**Methods (2):**
- `Entity getSource()`
- `void setSource(Entity)`

### ISourceCritBuff (interface)
`com.perblue.rpg.game.buff.ISourceCritBuff`

**Methods (1):**
- `float onCrit(Entity, Entity, DamageSource, float)`

### ISpecialDeathBuff (interface)
`com.perblue.rpg.game.buff.ISpecialDeathBuff`

**Methods (1):**
- `boolean doSpecialDeath(Unit)`

### IStaggerAwareBuff (interface)
`com.perblue.rpg.game.buff.IStaggerAwareBuff`

**Methods (1):**
- `void onStaggered()`

### IStatAdditionBuff (interface)
`com.perblue.rpg.game.buff.IStatAdditionBuff`

**Methods (1):**
- `z getStatAdditions()`

### IStatAmplificationBuff (interface)
`com.perblue.rpg.game.buff.IStatAmplificationBuff`

**Methods (1):**
- `z getStatAmplifications()`

### IStatReductionBuff (interface)
`com.perblue.rpg.game.buff.IStatReductionBuff`

**Methods (1):**
- `z getStatReductions()`

### IStatSettingBuff (interface)
`com.perblue.rpg.game.buff.IStatSettingBuff`

**Methods (1):**
- `z getStatSetting()`

### IStatSubtractionBuff (interface)
`com.perblue.rpg.game.buff.IStatSubtractionBuff`

**Methods (1):**
- `z getStatSubtractions()`

### ISteadfast (interface)
`com.perblue.rpg.game.buff.ISteadfast`

### IStealable (interface)
`com.perblue.rpg.game.buff.IStealable`

**Methods (1):**
- `int getEffectiveLevel()`

### IStunBuff (interface)
`com.perblue.rpg.game.buff.IStunBuff`

### ISwitchTeamBuff (interface)
`com.perblue.rpg.game.buff.ISwitchTeamBuff`

### IUnKnockbackBuff (interface)
`com.perblue.rpg.game.buff.IUnKnockbackBuff`

### IUnclearableBuff (interface)
`com.perblue.rpg.game.buff.IUnclearableBuff`

### IUntargetable (interface)
`com.perblue.rpg.game.buff.IUntargetable`

### IUntargetableAlly (interface)
`com.perblue.rpg.game.buff.IUntargetableAlly`

### IUntargetableEnemy (interface)
`com.perblue.rpg.game.buff.IUntargetableEnemy`

### IUpdateAwareBuff (interface)
`com.perblue.rpg.game.buff.IUpdateAwareBuff`

**Methods (1):**
- `void update(Entity, long)`

### IVoidableBuff (interface)
`com.perblue.rpg.game.buff.IVoidableBuff`

### IWaitBuff (interface)
`com.perblue.rpg.game.buff.IWaitBuff`

### IgnoreStatModificationBuff (class)
`com.perblue.rpg.game.buff.IgnoreStatModificationBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (1):**
- `protected a ignoredStatTypes`

**Methods (5):**
- `SimpleDurationBuff initStatIgnoreArray(a)`
- `void copyTo(IBuff)`
- `a getIgnoredStatModifications()`
- `void onAdd(Entity)`
- `void onRemove(Entity)`

### ImmovableBuff (class)
`com.perblue.rpg.game.buff.ImmovableBuff`

**Methods (1):**
- `String getBuffName()`

### InvincibleBuff (class)
`com.perblue.rpg.game.buff.InvincibleBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Methods (1):**
- `String getBuffName()`

### InvisibleBuff (class)
`com.perblue.rpg.game.buff.InvisibleBuff`

**Methods (1):**
- `String getBuffName()`

### KillMarkDebuff (class)
`com.perblue.rpg.game.buff.KillMarkDebuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Methods (1):**
- `String getBuffName()`

### LastDefenderCrossCounterBuff (class)
`com.perblue.rpg.game.buff.LastDefenderCrossCounterBuff`
extends `com.perblue.rpg.game.buff.PassiveSkillBuff`

**Methods (1):**
- `void onCrossCounter(Entity)`

### LastDefenderEnergyDrainBuff (class)
`com.perblue.rpg.game.buff.LastDefenderEnergyDrainBuff`
extends `com.perblue.rpg.game.buff.SimpleIntervalBuff`

**Fields (3):**
- `private static final String ANIM_SKILL1_ACTIVE_END = skill1_end`
- `private CombatSkill sourceSkill`
- `private boolean stopping`

**Methods (6):**
- `StackingEffect getStackingEffect(IBuff)`
- `LastDefenderEnergyDrainBuff initSourceSkill(CombatSkill)`
- `void copyTo(IBuff)`
- `void doTick(Entity)`
- `void onAdd(Entity)`
- `void onRemove(Entity)`

### LastDefenderHammerBuff (class)
`com.perblue.rpg.game.buff.LastDefenderHammerBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (2):**
- `private LastDefenderEnergyDrainBuff energyDrainBuff`
- `private StatAdditionBuff statAdditionBuff`

**Methods (12):**
- `LastDefenderHammerBuff initTickInterval(int)`
- `LastDefenderHammerBuff initStatModification(z)`
- `StackingEffect getStackingEffect(IBuff)`
- `void getBuffIcons(a)`
- `LastDefenderHammerBuff initSourceSkill(CombatSkill)`
- `void copyTo(IBuff)`
- `z getStatAdditions()`
- `void connectSourceSkill(CombatSkill)`
- `int getEffectiveLevel()`
- `void onAdd(Entity)`
- `void onRemove(Entity)`
- `void update(Entity, long)`

### MedusaTitanBuff (class)
`com.perblue.rpg.game.buff.MedusaTitanBuff`

**Fields (2):**
- `private int attackCount`
- `private CombatSkill skill`

**Methods (5):**
- `void preDamageToTarget(Entity, Entity, IDamageProvider)`
- `float getDamageToTargetAwarePriority()`
- `String getBuffName()`
- `void connectSourceSkill(CombatSkill)`
- `void onHit(Entity, Entity, DamageSource)`

### NoNewBuffsBuff (class)
`com.perblue.rpg.game.buff.NoNewBuffsBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Methods (2):**
- `String getBuffName()`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`

### NotShieldableBuff (class)
`com.perblue.rpg.game.buff.NotShieldableBuff`

**Methods (3):**
- `String getBuffName()`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`
- `void onAdd(Entity)`

### NpcLyingLanternDeathBuff (class)
`com.perblue.rpg.game.buff.NpcLyingLanternDeathBuff`
extends `com.perblue.rpg.game.buff.BlindBuff`

**Methods (1):**
- `void connectSourceSkill(CombatSkill)`

### NpcLyingLanternEntranceDebuff (class)
`com.perblue.rpg.game.buff.NpcLyingLanternEntranceDebuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (2):**
- `private final a listeners`
- `private Unit source`

**Methods (10):**
- `StackingEffect getStackingEffect(IBuff)`
- `boolean isEntranceBuffInvalid(Entity)`
- `IBuff makeInstance()`
- `Entity getSource()`
- `boolean isConflictingBuff(IBuff)`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`
- `void setSource(Entity)`
- `void onAdd(Entity)`
- `void onRemove(Entity)`
- `void update(Entity, long)`

### NpcLyingLanternTargetBuff (class)
`com.perblue.rpg.game.buff.NpcLyingLanternTargetBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Methods (2):**
- `StackingEffect getStackingEffect(IBuff)`
- `String getBuffName()`

### OldBuff (class)
`com.perblue.rpg.game.buff.OldBuff`

### OrcMonkLegendaryBuff (class)
`com.perblue.rpg.game.buff.OrcMonkLegendaryBuff`
extends `com.perblue.rpg.game.buff.PassiveSkillBuff`

**Methods (1):**
- `float onHeal(Entity, Entity, DamageSource, float)`

### OverrideMaxEnergyBuff (class)
`com.perblue.rpg.game.buff.OverrideMaxEnergyBuff`

**Fields (1):**
- `private int maxEnergy`

**Methods (5):**
- `void setMaxEnergy(int)`
- `void copyTo(IBuff)`
- `IBuff makeInstance()`
- `String getBuffName()`
- `int getMaxEnergy()`

### PassiveSkillBuff (class)
`com.perblue.rpg.game.buff.PassiveSkillBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (1):**
- `protected CombatSkill sourceSkill`

**Methods (1):**
- `void connectSourceSkill(CombatSkill)`

### PlantSoulCrossPolinationBuff (class)
`com.perblue.rpg.game.buff.PlantSoulCrossPolinationBuff`
extends `com.perblue.rpg.game.buff.PassiveSkillBuff`

**Methods (1):**
- `boolean onSkillActivation(Entity, CombatSkill)`

### PlantSoulDeepRootsBuff (class)
`com.perblue.rpg.game.buff.PlantSoulDeepRootsBuff`
extends `com.perblue.rpg.game.buff.PassiveSkillBuff`

**Methods (1):**
- `void onDeath(Entity, boolean)`

### PlantSoulLifeForceBuff (class)
`com.perblue.rpg.game.buff.PlantSoulLifeForceBuff`
extends `com.perblue.rpg.game.buff.SimpleIntervalBuff`

**Fields (5):**
- `private IDamageProvider basicHealProvider`
- `private float deathHealAmount`
- `private IDamageProvider deathHealProvider`
- `private boolean inCombat`
- `private CombatSkill skill`

**Methods (7):**
- `StackingEffect getStackingEffect(IBuff)`
- `void onCombatStart(Entity)`
- `void onCombatDone(Entity)`
- `void copyTo(IBuff)`
- `void connectSourceSkill(CombatSkill)`
- `void doTick(Entity)`
- `void update(Entity, long)`

### PreventsDisables (class)
`com.perblue.rpg.game.buff.PreventsDisables`

**Methods (2):**
- `String getBuffName()`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`

### RabidDragonLegendaryBuff (class)
`com.perblue.rpg.game.buff.RabidDragonLegendaryBuff`
extends `com.perblue.rpg.game.buff.PassiveSkillBuff`

**Fields (1):**
- `private z buffBoosts`

**Methods (1):**
- `boolean onSkillActivation(Entity, CombatSkill)`

### RabidDragonSkill1Buff (class)
`com.perblue.rpg.game.buff.RabidDragonSkill1Buff`
extends `com.perblue.rpg.game.buff.StatAdditionBuff`

### RabidDragonTitanBuff (class)
`com.perblue.rpg.game.buff.RabidDragonTitanBuff`

**Fields (1):**
- `private float critPercent`

**Methods (3):**
- `float getCritPercent()`
- `String getBuffName()`
- `void connectSourceSkill(CombatSkill)`

### RagingRevenantRevivalBuff (class)
`com.perblue.rpg.game.buff.RagingRevenantRevivalBuff`
extends `com.perblue.rpg.game.buff.PassiveSkillBuff`

**Fields (3):**
- `private a allies`
- `private boolean hasRevived`
- `private final AnimationStateAdapter listener`

**Methods (6):**
- `void onCombatStart(Entity)`
- `void doRevive()`
- `boolean doSpecialDeath(Unit)`
- `void onRemove(Entity)`

### RollerWarriorLegendaryBuff (class)
`com.perblue.rpg.game.buff.RollerWarriorLegendaryBuff`
extends `com.perblue.rpg.game.buff.PassiveSkillBuff`

**Fields (1):**
- `private SkillDamageProvider healProvider`

**Methods (2):**
- `float onCrit(Entity, Entity, DamageSource, float)`
- `void connectSourceSkill(CombatSkill)`

### SadisticDancerAvatarBuff (class)
`com.perblue.rpg.game.buff.SadisticDancerAvatarBuff`

**Fields (9):**
- `private static final int AVATAR_COUNT = 2`
- `private int AvatarHealth`
- `private a avatarList`
- `private SkillDamageProvider healProvider`
- `private BaseProjectileEffect projectileEffect`
- `private ProjectileType[] projectileTypes`
- `private ItemType skinType`
- `private Unit target`
- `private SkillDamageProvider zeroProvider`

**Methods (12):**
- `float getModifyTakenDamagePriority()`
- `String getBuffName()`
- `void setAvatarCount(int, boolean)`
- `void endAvatar(boolean)`
- `void addAvatar(RPGParticleEffect)`
- `void destroyAvatar(boolean)`
- `void subAvatarCount()`
- `float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`
- `void onRemove(Entity)`

### ShieldBuff (class)
`com.perblue.rpg.game.buff.ShieldBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (8):**
- `public static final Comparator PRIORITY_SORTER`
- `public static final int SHIELD_IMMUNE = -1`
- `private boolean blockNonMatchingDamage`
- `private DamageTypeData damageFilter`
- `private float priority`
- `protected float shieldHp`
- `protected CombatSkill skill`
- `protected float totalShieldHp`

**Methods (18):**
- `void getBuffIcons(a)`
- `boolean updateForStackingEffect(Entity, SimpleDurationBuff, StackingEffect)`
- `float getShieldHP(DamageSource)`
- `ShieldBuff setBlockNonMatchingDamage(boolean)`
- `void setIgnoreOtherDamages(boolean)`
- `void copyTo(IBuff)`
- `void connectSourceSkill(CombatSkill)`
- `int getEffectiveLevel()`
- `float getDisplayPercentage()`
- `float getTotalSize()`
### com.perblue.rpg.game.buff.ShieldBuff [LOAD ERROR: com.perblue.rpg.game.buff.ShieldBuff and com.perblue.rpg.game.buff.ShieldBuff$ShieldType disagree on InnerClasses attribute]

### SilenceBuff (class)
`com.perblue.rpg.game.buff.SilenceBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (1):**
- `private float level`

**Methods (7):**
- `StackingEffect getStackingEffect(IBuff)`
- `void getBuffIcons(a)`
- `CharSequence getCombatText()`
- `String getBuffName()`
- `float getEffectiveLevel()`
- `SilenceBuff initEffectiveLevel(float)`
- `void onAdd(Entity)`

### SimpleDOT (class)
`com.perblue.rpg.game.buff.SimpleDOT`
extends `com.perblue.rpg.game.buff.SimpleIntervalBuff`

**Fields (3):**
- `private boolean copied`
- `private IDamageProvider damageProvider`
- `private float totalDamage`

**Methods (8):**
- `SimpleDOT initDamageProvider(IDamageProvider)`
- `StackingEffect getStackingEffect(IBuff)`
- `void getBuffIcons(a)`
- `void copyTo(IBuff)`
- `String getBuffName()`
- `float getTotalDamage()`
- `void doTick(Entity)`
- `void onAdd(Entity)`

### SimpleDurationBuff (class)
`com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (6):**
- `private long duration`
- `private float durationScale`
- `private Entity entity`
- `private boolean forceExpire`
- `private long initialDuration`
- `private long timeLeft`

**Methods (16):**
- `StackingEffect getStackingEffect(IBuff)`
- `float getDurationScale()`
- `Entity getEntity()`
- `long getTimeLeft()`
- `void onDurationExpired(Entity)`
- `void forceExpire()`
- `boolean updateForStackingEffect(Entity, SimpleDurationBuff, StackingEffect)`
- `void copyTo(IBuff)`
- `IBuff makeInstance()`
- `void setDurationScale(float)`
- `String getBuffName()`
- `SimpleDurationBuff initDuration(long)`
- `boolean onOtherBuffAdd(Entity, Entity, IBuff)`
- `void setEntity(Entity)`
- `long getDuration()`
- `void update(Entity, long)`

### SimpleEnergyOverTime (class)
`com.perblue.rpg.game.buff.SimpleEnergyOverTime`
extends `com.perblue.rpg.game.buff.SimpleIntervalBuff`

**Fields (2):**
### com.perblue.rpg.game.buff.SimpleEnergyOverTime [LOAD ERROR: com.perblue.rpg.simulation.skills.generic.SkillDamageProvider and com.perblue.rpg.simulation.skills.generic.SkillDamageProvider$DamageFunction disagree on InnerClasses attribute]

### SimpleHealOverTime (class)
`com.perblue.rpg.game.buff.SimpleHealOverTime`
extends `com.perblue.rpg.game.buff.SimpleIntervalBuff`

**Fields (1):**
- `private IDamageProvider damageProvider`

**Methods (4):**
- `SimpleHealOverTime initDamageProvider(IDamageProvider)`
- `StackingEffect getStackingEffect(IBuff)`
- `void getBuffIcons(a)`
- `void doTick(Entity)`

### SimpleIntervalBuff (class)
`com.perblue.rpg.game.buff.SimpleIntervalBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (5):**
- `static final boolean $assertionsDisabled = true`
- `private static final int DEFAULT_TICK_INTERVAL = 1000`
- `private long current`
- `private long nextTick`
- `private int tickInterval`

**Methods (5):**
- `SimpleIntervalBuff initTickInterval(int)`
- `void copyTo(IBuff)`
- `void resetTick()`
- `void doTick(Entity)`
- `void update(Entity, long)`

### SimpleStunBuff (class)
`com.perblue.rpg.game.buff.SimpleStunBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (1):**
- `private float level`

**Methods (8):**
- `StackingEffect getStackingEffect(IBuff)`
- `void getBuffIcons(a)`
- `void copyTo(IBuff)`
- `String getBuffName()`
- `float getEffectiveLevel()`
- `SimpleStunBuff initEffectiveLevel(float)`
- `void onAdd(Entity)`
- `void onRemove(Entity)`

### SpecialAnimationBuff (class)
`com.perblue.rpg.game.buff.SpecialAnimationBuff`

**Methods (1):**
- `String getBuffName()`

### StatAdditionBuff (class)
`com.perblue.rpg.game.buff.StatAdditionBuff`
extends `com.perblue.rpg.game.buff.BaseStatAdditionBuff`

**Methods (6):**
- `void copyTo(IBuff)`
- `int getEffectiveLevel()`

### StatAmplificationBuff (class)
`com.perblue.rpg.game.buff.StatAmplificationBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (1):**
- `private z statModification`

**Methods (5):**
- `SimpleDurationBuff initStatModification(z)`
- `void getBuffIcons(a)`
- `void copyTo(IBuff)`
- `String getBuffName()`
- `z getStatAmplifications()`

### StatDebuff (class)
`com.perblue.rpg.game.buff.StatDebuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (2):**
- `protected CombatSkill skill`
- `private z statModification`

**Methods (6):**
- `SimpleDurationBuff initStatModification(z)`
- `void copyTo(IBuff)`
- `String getBuffName()`
- `z getStatSubtractions()`
- `void connectSourceSkill(CombatSkill)`
- `int getEffectiveLevel()`

### StatModificationIcons (class)
`com.perblue.rpg.game.buff.StatModificationIcons`

**Methods (1):**
- `void getBuffIcons(ModificationType, z, a)`

### StatReductionBuff (class)
`com.perblue.rpg.game.buff.StatReductionBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (1):**
- `protected z statModification`

**Methods (5):**
- `SimpleDurationBuff initStatModification(z)`
- `void getBuffIcons(a)`
- `void copyTo(IBuff)`
- `String getBuffName()`
- `z getStatReductions()`

### StatSettingBuff (class)
`com.perblue.rpg.game.buff.StatSettingBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (1):**
- `private z statModification`

**Methods (4):**
- `SimpleDurationBuff initStatModification(z)`
- `void copyTo(IBuff)`
- `String getBuffName()`
- `z getStatSetting()`

### StatSubtractionBuff (class)
`com.perblue.rpg.game.buff.StatSubtractionBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (2):**
- `protected CombatSkill skill`
- `protected z statModification`

**Methods (6):**
- `SimpleDurationBuff initStatModification(z)`
- `void getBuffIcons(a)`
- `void copyTo(IBuff)`
- `z getStatSubtractions()`
- `void connectSourceSkill(CombatSkill)`
- `int getEffectiveLevel()`

### SteadfastBuff (class)
`com.perblue.rpg.game.buff.SteadfastBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Methods (1):**
- `String getBuffName()`

### StoneBuff (class)
`com.perblue.rpg.game.buff.StoneBuff`
extends `com.perblue.rpg.game.buff.SimpleStunBuff`

**Methods (3):**
- `StackingEffect getStackingEffect(IBuff)`
- `String getBuffName()`
- `void onAdd(Entity)`

### TastyBuff (class)
`com.perblue.rpg.game.buff.TastyBuff`

**Methods (2):**
- `boolean isTastyBuff(Entity)`
- `String getBuffName()`

### ToxicDamageBoostBuff (class)
`com.perblue.rpg.game.buff.ToxicDamageBoostBuff`

**Fields (1):**
- `private CombatSkill skill`

**Methods (3):**
- `String getBuffName()`
- `void connectSourceSkill(CombatSkill)`
- `float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)`

### TutorialBuff (class)
`com.perblue.rpg.game.buff.TutorialBuff`

**Methods (1):**
- `String getBuffName()`

### UnTastyBuff (class)
`com.perblue.rpg.game.buff.UnTastyBuff`

**Methods (2):**
- `boolean isUnTastyBuff(Entity)`
- `String getBuffName()`

### UnclearableStatAdditionBuff (class)
`com.perblue.rpg.game.buff.UnclearableStatAdditionBuff`
extends `com.perblue.rpg.game.buff.BaseStatAdditionBuff`

**Methods (5):**
- `void copyTo(IBuff)`

### UntargetableBuff (class)
`com.perblue.rpg.game.buff.UntargetableBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Methods (1):**
- `String getBuffName()`

### UntargetableBuffWithDungeonManSkill3 (class)
`com.perblue.rpg.game.buff.UntargetableBuffWithDungeonManSkill3`

**Methods (1):**
- `String getBuffName()`

### UntargetableEnemyBuff (class)
`com.perblue.rpg.game.buff.UntargetableEnemyBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

### VoidWyvernEnergyDebuff (class)
`com.perblue.rpg.game.buff.VoidWyvernEnergyDebuff`
extends `com.perblue.rpg.game.buff.SimpleIntervalBuff`

**Fields (4):**
- `private float accumulatedAmount`
- `private boolean inCombat`
- `private boolean isShowingParticle`
- `private CombatSkill skill`

**Methods (7):**
- `StackingEffect getStackingEffect(IBuff)`
- `void onCombatStart(Entity)`
- `void drainEnergy(Entity)`
- `void onCombatDone(Entity)`
- `void connectSourceSkill(CombatSkill)`
- `void doTick(Entity)`
- `void update(Entity, long)`

### WeredragonBuff (class)
`com.perblue.rpg.game.buff.WeredragonBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

**Fields (2):**
- `private WeredragonEnergyDrainBuff energyDrainBuff`
- `private StatAdditionBuff statAdditionBuff`

**Methods (12):**
- `WeredragonBuff initTickInterval(int)`
- `WeredragonBuff initStatModification(z)`
- `StackingEffect getStackingEffect(IBuff)`
- `void getBuffIcons(a)`
- `WeredragonBuff initSourceSkill(CombatSkill)`
- `void copyTo(IBuff)`
- `z getStatAdditions()`
- `void connectSourceSkill(CombatSkill)`
- `int getEffectiveLevel()`
- `void onAdd(Entity)`
- `void onRemove(Entity)`
- `void update(Entity, long)`

### WeredragonEnergyDrainBuff (class)
`com.perblue.rpg.game.buff.WeredragonEnergyDrainBuff`
extends `com.perblue.rpg.game.buff.SimpleIntervalBuff`

**Fields (3):**
- `private CombatSkill sourceSkill`
- `private boolean stopping`
- `private WeredragonIOtherBuff weredragonIOtherBuff`

**Methods (7):**
- `StackingEffect getStackingEffect(IBuff)`
- `WeredragonEnergyDrainBuff initSourceSkill(CombatSkill)`
- `void copyTo(IBuff)`
- `void doTick(Entity)`
- `void onAdd(Entity)`
- `void onRemove(Entity)`

### ZombieSquireReviveBuff (class)
`com.perblue.rpg.game.buff.ZombieSquireReviveBuff`
extends `com.perblue.rpg.game.buff.SimpleDurationBuff`

## Package: com.perblue.rpg.game.logic (44 classes)

### ArenaHelper (class)
`com.perblue.rpg.game.logic.ArenaHelper`

**Fields (2):**
- `public static final List COLISEUM_ATTACK_LINEUPS`
- `public static final List COLISEUM_DEFENSE_LINEUPS`

**Methods (22):**
- `int getColiseumLineups()`
- `boolean coliseumRequiresThreeWins()`
- `a getDemotionLeagueInfo(ArenaTier, int)`
- `int getNumberOfDivisions(ArenaTier)`
- `ResourceType getMerchantResource(ArenaType)`
- `CharSequence getNoMoreResetsString(ArenaType)`
- `long getPromotionDuration(ArenaTier, int, ArenaType)`
- `a getPromotionLeagueInfo(ArenaTier, int)`
- `long getPromotionEndTime(ArenaTier, int, ArenaType)`
- `CharSequence getUnlockResetString(ArenaType)`
- `String getResetUseType(ArenaType)`
- `VIPFeature getVIPResetFeature(ArenaType)`
- `void giveArenaEXP(IUser, Iterable, ArenaType)`
- `void resetArenaChances(IUser, ArenaType)`
- `boolean hasFreeAttackAvailable(IUser, ArenaType)`
- `String getChanceType(ArenaType)`
- `Unlockable getUnlockable(ArenaType)`
- `void checkArenaAttackStart(IUser, boolean, long, ArenaType)`
- `VIPFeature getVIPCooldownFeature(ArenaType)`
- `CharSequence getUnlockCooldownString(ArenaType)`
- `void claimArenaPromotionRewards(IUser, ArenaType)`
- `CooldownType getCooldown(ArenaType)`

### BossBattleCampaignHelper (class)
`com.perblue.rpg.game.logic.BossBattleCampaignHelper`

**Fields (4):**
- `private static final long BOSS_BATTLE_BOSS_STAGE_MAX_DURATION = 180000`
- `private static final long BOSS_BATTLE_NORMAL_STAGE_MAX_DURATION = 90000`
- `public static final ItemType ITEM_BOSS_BATTLE_STAGE_RESET`
- `public static final int NUM_STAGES = 1`

**Methods (23):**
- `String getFreeAdvanceDailyUseType(long)`
- `boolean autoAttackAvailable(IUser, long, int, int)`
- `long getStageMaxDuration(BossBattleInfo, int, int)`
- `int getFreeResets(long, IUser)`
- `CampaignLevelLockStatusType getLevelLockStatus(IBossBattleData, int, int)`
- `boolean isAvailable(IUser)`
- `int getFreeAdvances(long, IUser)`
- `CharSequence getChapterTitle(int, String)`
- `long getElapsedTime(BossBattleInfo, int, int, long)`
- `String getFreeResetDailyUseType(long)`
- `CampaignLevel getLatestUnlockedLevel(IBossBattleData, BossBattleInfo)`
- `Collection getTimeBonuses(BossBattleInfo, int, List)`
- `void giveGold(IUser, long, int, int, int)`
- `void giveLoot(IUser, long, int, int, Collection)`
- `void giveTeamXP(IUser, long, int, int, int)`
- `boolean isChapterComplete(IBossBattleData, BossBattleInfo, int)`
- `boolean isClearedStage(IBossBattleData, BossBattleInfo, int, int)`
- `boolean isLevelUnlocked(IBossBattleData, int, int)`
- `void recordOutcome(IUser, BossBattleInfo, IBossBattleData, int, int, CombatOutcome, long, HeroLineup)`
- `boolean selectChapter(long, int, IUser)`
- `Collection getLoot(BossBattleInfo, int, int)`
- `boolean reset(long, BossBattleResetType, IUser)`
- `boolean advance(long, BossBattleAdvanceType, IUser)`

### BossPitHelper (class)
`com.perblue.rpg.game.logic.BossPitHelper`

**Fields (3):**
- `private static final List BOSS_TYPES`
- `public static final ModeDifficulty MAX_DIFFICULTY`
- `private static final long ONE_DAY = 86400000`

**Methods (15):**
- `boolean shouldReset(IBossPit, IUser)`
- `List beginRaid(IUser, UnitType, int, ModeDifficulty)`
- `void doChecks(IUser, UnitType, int, ModeDifficulty)`
- `void advanceStage(IUser)`
- `void finishAttack(IUser, UnitType, int, ModeDifficulty, CombatOutcome, Collection)`
- `int getExpReward(UnitType, int, ModeDifficulty)`
- `int getGoldReward(UnitType, int, ModeDifficulty)`
- `String getWinKey(UnitType, int, ModeDifficulty)`
- `boolean isTagGood(HeroTag, UnitType, int)`
- `boolean isTagRelevant(HeroTag, UnitType, int)`
- `List recordRaidOutcome(IUser, UnitType, int, ModeDifficulty, List)`
- `void giveGold(IUser, UnitType, int, ModeDifficulty)`
- `void giveLoot(IUser, UnitType, int, ModeDifficulty, Collection)`
- `void recordOutcome(IUser, UnitType, int, ModeDifficulty, CombatOutcome, int, int, Collection, HeroLineup, int)`
- `List getBossTypes()`

### CampaignHelper (class)
`com.perblue.rpg.game.logic.CampaignHelper`

**Fields (3):**
- `public static final int DURATION_BONUS_DROP_RATE = 2`
- `public static final int MIN_STARS_FOR_RAID = 3`
- `public static final int NUM_STAGES = 3`

**Methods (41):**
- `CampaignType getCampaignType(GameMode)`
- `List recordRaidOutcome(IUser, CampaignType, int, int, int, Collection, GameModeMultipliers)`
- `int getStarsForLevel(IUser, CampaignType, int, int)`
- `boolean canResetLevel(IUser, int, int)`
- `GameMode getCampaignGameMode(CampaignType)`
- `long getDoubleDropEndTimeLO(IUser, CampaignType)`
- `long getDropBonusEndTimeItem(IUser, CampaignType, int)`
- `TimeType getItemDoubleDropStartTimeType(CampaignType)`
- `TimeType getItemDoubleDropEndTimeType(CampaignType)`
- `long getDropBonusEndTime(IUser, CampaignType)`
- `int getDropBonusMultiplierLO(IUser, CampaignType)`
- `int getDropBonusMultiplierItem(IUser, CampaignType, int)`
- `boolean isItemDoubleDropSameItemType(CampaignType, UseItemEventType)`
- `int getDropBonusMultiplier(IUser, CampaignType)`
- `RaidAllInformation getRaidAllInformation(IUser, ItemType)`
- `long getXPBonusTeamEndTime(IUser)`
- `boolean isXPBonusTeamActiveLO(IUser)`
- `long getXPBonusTeamEndTimeLO(IUser)`
- `int getXPBonusTeamMultiplierLO(IUser)`
- `int getXPBonusTeamMultiplierItem(IUser, int)`
- `long getXPBonusTeamEndTimeItem(IUser, int)`
- `int getXPBonusTeamMultiplier(IUser)`
- `boolean hasCampaignEvent(IUser)`
- `int useRaidTickets(IUser, CampaignType, int, int, int, SpecialEventsHelperState)`
- `void useRaidTickets(IUser, RaidAllInformation, SpecialEventsHelperState)`
- `boolean isXPBonusTeamActive(IUser)`
- `boolean isDropBonusDropActive(IUser, CampaignType)`
- `boolean hasEnoughStaminaForAttack(IUser)`
- `boolean isDropBonusDropActiveLO(IUser, CampaignType)`
- `boolean isXPBonusSameItemType(UseItemEventType)`
- `void resetEliteCampaignLevel(IUser, int, int)`
- `int getResetCost(IUser, int, int)`
- `boolean autoAttackAvailable(IUser, CampaignType, int, int)`
- `CampaignLevelLockStatusType getLevelLockStatus(IUser, CampaignType, int, int)`
- `CampaignLevel getLatestUnlockedLevel(IUser, CampaignType)`
- `void giveGold(IUser, CampaignType, int, int, int, GameMode, GameModeMultipliers)`
- `void giveLoot(IUser, CampaignType, int, int, GameMode, Collection, int)`
- `void giveTeamXP(IUser, CampaignType, int, int, int, GameMode, GameModeMultipliers)`
- `boolean isChapterComplete(IUser, CampaignType, int)`
- `boolean isLevelUnlocked(IUser, CampaignType, int, int)`
- `int recordOutcome(IUser, CampaignType, int, int, CombatOutcome, int, int, Collection, Collection, int, GameModeMultipliers)`

### CampaignLootHelper (class)
`com.perblue.rpg.game.logic.CampaignLootHelper`

**Methods (28):**
- `int calculateGoldPerUnit(UnitType, int, float)`
- `float calculateMemoryValue(IUser, ItemType, float, int)`
- `int calculateNewLootLimit(int, Collection)`
- `float calculateRaidTicketMemoryValue(IUser, float, int)`
- `float calculateSymmetricMemoryValue(IUser, ItemType, float, float, int)`
- `int getGoldPerUnit(GameMode, UnitType, int, int, Rarity, boolean, GameModeMultipliers)`
- `int getGoldPerUnit(CampaignType, UnitType, int, int, Rarity, boolean, GameModeMultipliers)`
- `Collection computeExpLoot(IUser, CampaignType, GameModeMultipliers)`
- `void rollExpLoot(IUser, Collection, CampaignType, ItemType, UserValue, GameModeMultipliers)`
- `Collection computePrimaryLoot(IUser, CampaignType, int, int, GameModeMultipliers)`
- `int rollPrimaryLootItem(int, ItemType, float, Random)`
- `RewardDrop computeRaidTicketLoot(IUser, CampaignType, GameModeMultipliers, int)`
- `int rollRaidTicketLootItem(float, Random)`
- `Collection computeSecondaryLoot(IUser, CampaignType, int, int, GameModeMultipliers, int)`
- `int rollSecondaryLootItem(ItemType, Random)`
- `float getUnitGoldDropMultiplier(GameMode, boolean, GameModeMultipliers)`
- `void updateExtraLootMemory(IUser, Map)`
- `void updateRaidTicketLootMemory(IUser, RewardDrop)`
- `void updateMemoryUnconditional(IUser, CampaignLoot)`
- `void updateMemory(IUser, CampaignType, int, int, CampaignLoot)`
- `void updateMemory(IUser, CampaignLoot, boolean)`
- `List addExpItems(IUser, int, String[])`
- `boolean gotLoot(Collection)`
- `void addPooledXP(IUser, int)`
- `int calculateGoldEarned(CampaignType, int, int, GameModeMultipliers)`
- `int calculateRaidTicketExp(IUser, CampaignType, int, int)`
- `void updateLootMemory(IUser, Collection)`
- `CampaignLoot getLoot(IUser, CampaignType, int, int, GameModeMultipliers)`

### ChallengesHelper (class)
`com.perblue.rpg.game.logic.ChallengesHelper`

**Fields (3):**
- `public static final r DRAGON_OPEN_DAYS`
- `public static final r MAGIC_OPEN_DAYS`
- `public static final r PHYSICAL_OPEN_DAYS`

**Methods (1):**
- `boolean hasAttacksAvailable(IUser)`

### ChestHelper (class)
`com.perblue.rpg.game.logic.ChestHelper`

**Fields (6):**
- `static final boolean $assertionsDisabled = true`
- `private static final int CHEST_DISPLAY_PICK_SIZE = 4`
- `private static final AtomicReference CHEST_DROP_DATA`
- `private static final float DISCOUNTED_PRICE_RATIO = 0.9`
- `private static final Log LOG`
- `private static final int MAX_HERO_ITEMS_CONSIDERED_FOR_DISPLAY = 16`

**Methods (23):**
- `boolean checkIfCanRollChests()`
- `ResourceType getPurchaseCurrency(ChestType)`
- `LootResults buyChests(IUser, ChestType, int, int, ItemType)`
- `UserFlag getChestFlag(ChestType, int)`
- `UserFlag getFreeChestFlag(ChestType, int)`
- `boolean hasFreeChest(IUser, ChestType)`
- `boolean hasFreeChest(IUser)`
- `int getPurchaseCost(ChestType, int)`
- `int getChestChances(IUser, ChestType)`
- `boolean isGoldUnlocked(IUser)`
- `RandomSeedType getChestRandomSeed(IUser, ChestType, int)`
- `int getBasePurchaseCost(ChestType, int)`
- `PossibleChestDrops getPossibleChestDrops()`
- `List getPossibleGoldChestDrops()`
- `List getPossibleGoldChestHeroes()`
- `List getPossibleGoldChestItems()`
- `List getSecondGoldChestHeroes()`
- `long getTimeUntilNextFreeChest(IUser, ChestType)`
- `void setPossibleChestDrops(PossibleChestDrops)`
- `long getEndTime()`
- `int getMaxChestChances(IUser, ChestType)`
- `List getSortedHeroes(User)`
- `Boolean shouldShowRedDot(User)`

### com.perblue.rpg.game.logic.CombatHelper [LOAD ERROR: null]

### CombatResults (class)
`com.perblue.rpg.game.logic.CombatResults`

**Fields (6):**
- `private a attackers`
- `private a defenders`
- `private Exception exception`
- `private float outcome`
- `private int stars`
- `private a timesLeft`

**Methods (11):**
- `int getStars()`
- `void setStars(int)`
- `a getTimesLeft()`
- `void printResults()`
- `void setException(Exception)`
- `void setOutcome(float)`
- `void setTimesLeft(a)`
- `float getOutcome()`
- `a getAttackers()`
- `a getDefenders()`
- `Exception getException()`

### ContestHelper (class)
`com.perblue.rpg.game.logic.ContestHelper`

**Fields (5):**
- `static final boolean $assertionsDisabled = true`
- `public static final long CONTESTS_LOOKBACK = 86400000`
- `private static final IContestHelperExtension DEFAULT_EXTENSION`
- `private static IContestHelperExtension extension`
- `private static boolean shouldShowRedDot`

**Methods (22):**
- `boolean shouldShowRedDot()`
- `void tryRecordBattleWinTasks(IUser, ContestTaskType, Collection)`
- `void setShouldShowRedDot(boolean)`
- `boolean canDropItem(ContestInfo, ItemType)`
- `float getPercentileRank(String)`
- `ContestProgressRewardInfo getProgressInfo(ContestInfo, int)`
- `ContestProgressRewardInfo getProgressInfo(ContestProgressRewards, int)`
- `ContestRankRewardInfo getRankInfo(ContestInfo, int)`
- `ContestRankRewardInfo getRankInfo(ContestRankRewards, int)`
- `ContestRankRewardInfo getRankInfo(int, int, ContestInfo)`
- `boolean isAtRank(ContestRankRewardInfo, int, int)`
- `String getRankRange(ContestRankRewardInfo, ContestRankRewardInfo)`
- `String getRankRange(ContestRankRewardInfo, ContestRankRewardInfo, boolean)`
- `int getTopRank(String)`
- `boolean isTopRank(String)`
- `boolean isPercentileRank(String)`
- `void recordTasks(IUser, ContestInfo, ContestTaskInfo, int)`
- `void tryRecordItemTasks(IUser, ContestTaskType, ItemType, int)`
- `void tryRecordTasks(IUser, ContestTaskType, int)`
- `void tryRecordTasks(IUser, ContestTaskType, String, int)`
- `void setExtension(IContestHelperExtension)`

### CryptRaidHelper (class)
`com.perblue.rpg.game.logic.CryptRaidHelper`

**Fields (9):**
- `public static final long DAY = 86400000`
- `public static final int[] MAX_ATTACKS`
- `public static final int MAX_ATTACKS_PER_PLAYER = 20`
- `public static final long RAID_DURATION = 57600000`
- `public static final long RAID_END_OFFSET = 86400000`
- `public static final int RAID_END_OFFSET_HOUR = 24`
- `public static final long RAID_START_OFFSET = 28800000`
- `public static final int RAID_START_OFFSET_HOUR = 8`
- `public static final long TIME_ZONE_CHANGE_PENALTY_PERIOD = 2592000000`

**Methods (5):**
- `boolean showRedDot(IUser)`
- `long getNextRaidStartTime(long, long, long, long, TimeZone)`
- `int getPoints(SkullAnimation, CryptRaidData)`
- `void giveGold(IUser, List)`
- `void recordOutcome(IUser, HeroLineup, int, CombatOutcome, List)`

### DailyActivityHelper (class)
`com.perblue.rpg.game.logic.DailyActivityHelper`

**Fields (80):**
- `static final boolean $assertionsDisabled = true`
- `public static final String ANY_CAMPAIGN_USE = campaign_any`
- `public static final String ANY_CHALLENGES_USE = challenges`
- `public static final String ANY_CHEST_USE = chest_any`
- `public static final String ANY_EXPEDITION_USE = expedition_any`
- `public static final String ANY_FIGHT_PIT_USE = fightPit_any`
- `public static final String ANY_THE_MOUNTAIN_USE = theMountain`
- `public static final String BAZAAR_TRADER_REFRESH_USE = refresh_bazaarTrader`
- `public static final String BLACK_MARKET_TRADER_FREE_REFRESH_USE = free_refresh_blackMarketTrader`
- `public static final String BLACK_MARKET_TRADER_REFRESH_USE = refresh_blackMarketTrader`
- `public static final String BOSS_BATTLE_ADVANCE_USE_PREFIX = BossBattleAdvance_`
- `public static final String BOSS_BATTLE_RESET_USE_PREFIX = BossBattleReset_`
- `public static final String BOSS_BATTLE_WIN = boss_battle_win`
- `public static final String BOSS_PIT_CHANCE = bossPit`
- `public static final String BOSS_PIT_WIN = bossPitWin`
- `public static final String CHALLENGES_DRAGON_CHANCE = challengesDragon`
- `public static final String CHALLENGES_DRAGON_RESET_USE = challengesDragonReset`
- `public static final String CHALLENGES_MAGIC_CHANCE = challengesMagic`
- `public static final String CHALLENGES_MAGIC_RESET_USE = challengesMagicReset`
- `public static final String CHALLENGES_PHYSICAL_CHANCE = challengesPhysical`
- `public static final String CHALLENGES_PHYSICAL_RESET_USE = challengesPhysicalReset`
- `public static final String COLISEUM_CHANCE = coliseum`
- `public static final String COLISEUM_RESET_USE = coliseum_reset`
- `public static final String COLISEUM_TRADER_REFRESH_USE = refresh_coliseumTrader`
- `public static final String COLISEUM_USE = coliseumUse`
- `public static final String CRYPT_RAID_USE = cryptRaid`
- `public static final String DAILY_EVENT_SIGNIN_CHANCE = daily_event_signin`
- `public static final String DAILY_EVENT_SIGNIN_VIP_CHANCE = daily_event_signin_vip`
- `public static final String DAILY_LOGIN_COUNT = dailyLoginCount`
- `public static final String DAILY_SIGNIN_CHANCE = daily_signin`
- `public static final String DAILY_SIGNIN_VIP_CHANCE = daily_signin_vip`
- `public static final String ELITE_CAMPAIGN_CHANCE_PREFIX = ELITE_`
- `public static final String ELITE_CAMPAIGN_USE = campaign_elite`
- `public static final String ENCHANTING = enchanting`
- `public static final String EVENT_CHEST_USE = chest_event`
- `public static final String EXPEDITIONS_TRADER_REFRESH_USE = refresh_expeditionsTrader`
- `public static final String EXPEDITION_RESET_USE = expeditionReset`
- `protected static DailyActivityHelperExt EXT`
- `public static final String FIGHT_PIT_CHANCE = fightPit`
- `public static final String FIGHT_PIT_RESET_USE = fightPit_reset`
- `public static final String FIGHT_PIT_TRADER_REFRESH_USE = refresh_fightpitTrader`
- `public static final int FREE_BOSS_BATTLE_STAGE_ADVANCES = 1`
- `public static final int FREE_BOSS_BATTLE_STAGE_RESETS = 1`
- `public static final String FULL_MOON_GO = fullMoonGo`
- `public static final String GOLD_CHEST_USE = chest_gold`
- `public static final String GOLD_PURCHASE_USE = buy_gold`
- `public static final String GUILD_TRADER_REFRESH_USE = refresh_guildTrader`
- `public static final String GUILD_WAR_TRADER_REFRESH_USE = refresh_guildWarTrader`
- `public static final String IAP_PURCHASE_USE = iap_purchase`
- `public static final String MERCENARY_POST = mercenary_post`
- `public static final String MONTHLY_DIAMONDS_QUEST_CHANCE = quest_monthlyDiamonds`
- `public static final String NORMAL_TRADER_FREE_REFRESH_USE = free_refresh_trader`
- `public static final String NORMAL_TRADER_REFRESH_USE = refresh_trader`
- `public static final String ORANGE_CHEST_USE = chest_orange`
- `public static final String PEDDLER_TRADER_FREE_REFRESH_USE = free_refresh_peddlerTrader`
- `public static final String PEDDLER_TRADER_REFRESH_USE = refresh_peddlerTrader`
- `public static final String PURPLE_CHEST_USE = chest_purple`
- `public static final String QUARTER_MOON_GO = quarterMoonGo`
- `public static final String RAID_TICKET_PURCHASE_USE = buy_raid_ticket`
- `public static final String RESET_ELITE_CAMPAIGN_USE_PREFIX = RESET_ELITE_`
- `public static final int RESET_TIME = 5`
- `public static final long RESET_TIME_MILLIS = 18000000`
- `public static final String RUNE_EMPOWER_ATTEMPT = runeEmpowerAttempt`
- `public static final String RUNE_SHRINE_USE = runeShrineUse`
- `public static final String RUNICITE_PURCHASE_USE = buy_runicite`
- `public static final String SILVER_CHEST_CHANCE = chest_silver_chance`
- `public static final String SILVER_CHEST_USE = chest_silver`
- `public static final String SKILL_POINT_PURCHASE_USE = buy_powerPoints`
- `public static final String SOULMART_REFRESH_USE = refresh_soulmart`
- `public static final String SOUL_CHEST_USE = chest_soul`
- `public static final String STAMINA_PURCHASE_USE = buy_stamina`
- `public static final String TAPPED_MONTHLY_CARD_REMINDER = tappedMonthlyCardReminder`
- `public static final String THE_CAVES_CHANCE = theCaves`
- `public static final String THE_CAVES_RESET_USE = theCavesReset`
- `public static final String THE_SUMMIT_CHANCE = theSummit`
- `public static final String THE_SUMMIT_RESET_USE = theSummitReset`
- `public static final String UPGRADE_SKILL_USE = skill_upgrade`
- `public static final String VIEWED_CHAT_APP_UPSELL = viewedChatAppUpsell`
- `public static final String VIEWED_GLOBAL_CHAT_RULES = viewedGlobalChatRules`
- `public static final String WEEKLY_FREE_RUNE_REMOVAL = week_freeRuneRemove`

**Methods (7):**
- `void checkAndUpdateDailyValues(IUser)`
- `boolean isResetDaily(String)`
- `long getDailyResetTime(int, Calendar, long)`
- `long getNextDailyResetTime(IUser, boolean)`
- `int getMaxDailyUses(IUser, String)`
- `int getMaxDailyChances(IUser, String)`
- `int getRemainingDailyUses(IUser, String)`

### com.perblue.rpg.game.logic.DefeatTipHelper [LOAD ERROR: null]

### DifficultyModeHelper (class)
`com.perblue.rpg.game.logic.DifficultyModeHelper`

**Fields (2):**
- `static final boolean $assertionsDisabled = true`
- `private static final long TIME_VERIFY_WINDOW = 60000`

**Methods (38):**
- `long getCooldownDuration(GameMode, IUser)`
### com.perblue.rpg.game.logic.DifficultyModeHelper [LOAD ERROR: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$DamageSourceType disagree on InnerClasses attribute]

### EnchantingHelper (class)
`com.perblue.rpg.game.logic.EnchantingHelper`

**Methods (9):**
- `int getEnchantMaxDiamondCost(IUser, UnitType, HeroEquipSlot)`
- `int getCurrentStarPoints(IUser, UnitType, HeroEquipSlot)`
- `List addEnchantItems(IUser, int)`
- `List addEnchantItems(IUser, int, boolean, boolean)`
- `IEquippedItem enchantItem(IUser, UnitType, HeroEquipSlot, Map, boolean)`
- `int getEnchantGoldCost(IUser, UnitType, HeroEquipSlot, Map)`
- `int getEnchantPoints(ItemType, IUser)`
- `int getPowerIncrease(IUser, UnitType, HeroEquipSlot, Map)`
- `boolean shouldShowRedDot(IUser)`

### ExpeditionHelper (class)
`com.perblue.rpg.game.logic.ExpeditionHelper`

**Fields (4):**
- `public static final int MIN_HERO_LEVEL = 20`
- `public static final int NODES_PER_ROUND = 3`
- `public static final int NODE_AMOUNT = 15`
- `public static final int ROUNDS = 5`

**Methods (9):**
- `void enableDifficulty(IUser, int)`
- `int getMaxDifficulty(IUser)`
- `int getResetsRemaining(IUser)`
- `List openChest(IUser, int, int, int, List)`
- `int getGlobalMaxDifficulty()`
- `int modifyGoldForDifficulty(int, int)`
- `boolean isDifficultyAvailable(IUser, int)`
- `int getMaxEnabledDifficulty(IUser)`
- `int giveLoot(IUser, NodeReward, int, int)`

### GuildHelper (class)
`com.perblue.rpg.game.logic.GuildHelper`

**Fields (14):**
- `private static final long CHAMPION_INACTIVE_CLAIM = 604800000`
- `private static List CHAMPION_PERMISSIONS`
- `public static final int CREATE_GUILD_COST = 2000`
- `private static final long GUILD_LEAVE_LOCKOUT_TIME = 86400000`
- `public static final int MAX_GUILD_MOTTO_LENGTH = 50`
- `public static final int MAX_GUILD_NAME_LENGTH = 16`
- `public static final int MAX_MEMBERS = 50`
- `public static final int MIN_GUILD_NAME_LENGTH = 3`
- `public static final int MIN_TEAM_LEVEL_INCREMENT = 5`
- `private static final long OFFICER_INACTIVE_CLAIM = 1814400000`
- `private static List OFFICER_PERMISSIONS`
- `private static List ORDERED_ROLES`
- `private static Map PERMISSIONS`
- `private static List RULER_PERMISSIONS`

**Methods (26):**
- `boolean canChangeWarMembers(GuildRole)`
- `boolean canDeleteGuildWallPosts(GuildRole)`
- `boolean canEditCryptDifficulty(GuildRole)`
- `boolean canEditGuildPrivacy(GuildRole)`
- `boolean canEditMinTeamLevel(GuildRole)`
- `boolean canParticipateInGuildModes(IUser)`
- `boolean canSurrenderOrFinishWarBattle(GuildRole)`
- `int getRoleComparisonIndex(GuildRole)`
- `boolean canDemote(GuildRole, GuildRole)`
- `GuildRole getNextLowerRole(GuildRole)`
- `boolean canDisband(GuildRole)`
- `boolean canEditCountry(GuildRole)`
- `boolean canEditDescription(GuildRole)`
- `boolean canEditEmblem(GuildRole)`
- `boolean canEditGuildWall(GuildRole)`
- `boolean canEditTimeZone(GuildRole)`
- `boolean canKickMember(GuildRole, GuildRole)`
- `boolean canPromote(GuildRole, GuildRole)`
- `GuildRole getNextHigherRole(GuildRole)`
- `boolean canRegisterForWar(GuildRole)`
- `boolean canStartWarBattle(GuildRole)`
- `void chargeForCreation(IUser)`
- `boolean isInGuild(IUser)`
- `boolean canAcceptMembers(GuildRole)`
- `long getClaimLeaderInactiveTime(GuildRole)`
- `List getPermissions(GuildRole)`

### HeroHelper (class)
`com.perblue.rpg.game.logic.HeroHelper`

**Methods (37):**
- `void addAdditionalNeededItems(IUser, List, ItemType, int)`
- `boolean rarityAllowsPromotion(IHero)`
- `void copySkillsToUnitData(Unit, IHero)`
- `void addMaxXPForLevel(UnitType, IUser)`
- `boolean canEvolve(UnitType, IUser)`
- `boolean canGetParts(IUser, ItemType)`
- `boolean canPromoteManually(UnitType, IUser)`
- `boolean canUnlock(UnitType, IUser)`
- `IHero equipItem(UnitType, ItemType, HeroEquipSlot, IUser)`
- `IHero evolve(UnitType, IUser)`
- `GearState getGearState(IUser, IHero, HeroEquipSlot, ContentUpdate, boolean)`
- `GearState getGearState(IUser, IHero, HeroEquipSlot, ContentUpdate)`
- `AutoPromoteData getAutoPromoteData(UnitType, IUser)`
- `List findHeroThatNeedsItem(IUser, ItemType, ContentUpdate)`
- `int getSoulStoneConversion(int)`
- `boolean canCraftItem(IUser, ItemType, Map, Map, int)`
- `List getNeededItems(IUser, ContentUpdate, IHero)`
- `Set getTypes(Collection)`
- `boolean hasItemsToEquip(IUser, IHero, ContentUpdate)`
- `boolean hasSkillsToUpgrade(IUser)`
- `boolean hasThingsToDo(IUser, UnitType, ContentUpdate)`
- `boolean hasThingsToDo(IUser, ContentUpdate)`
- `void makeLegendary(IUser, UnitType)`
- `PrepareForPromoteData prepareForPromote(UnitType, IUser, Map)`
- `PromoteOutcomeData promote(UnitType, IUser)`
- `int returnSlotNum(HeroEquipSlot)`
- `IHero upgradeSkill(UnitType, SkillType, IUser)`
- `void initSkills(IHero, boolean)`
- `int addHeroEXP(UnitType, ItemType, int, IUser, String)`
- `int addHeroEXP(UnitType, int, IUser, String)`
- `int addHeroEXP(UnitType, ItemType, int, int, IUser, String)`
- `boolean hasMaxStarHeroes(IUser)`
- `void giveFullGear(IHero)`
- `void giveMaxEnchant(IHero)`
- `void giveMaxSkills(IHero)`
- `void setSkin(IUser, UnitType, ItemType)`
- `IHero unlock(UnitType, IUser)`

### HowToPlayHelper (class)
`com.perblue.rpg.game.logic.HowToPlayHelper`

**Fields (2):**
- `private static final String DATA_BUNDLE = com.perblue.rpg.util.localization.how_to_play_data`
- `private static final String STRINGS_BUNDLE = com.perblue.rpg.util.localization.how_to_play`

**Methods (6):**
- `HowToPlayDeck createDeck(HowToPlayDeckType)`
- `String getDataString(String, String, boolean)`
- `int getCardCount(HowToPlayDeckType)`
- `HowToPlayCardType getCardType(String)`
- `String[] getBulletKeys(HowToPlayDeckType, int)`
- `String getString(String, boolean)`

### ItemHelper (class)
`com.perblue.rpg.game.logic.ItemHelper`

**Fields (2):**
- `private static final int STAMINA_CONSUMABLE_AMOUNT = 60`
- `private static final long TEMP_VIP_DURATION = 86400000`

**Methods (20):**
- `void useAlchemyCostResetItem(IUser)`
- `void useDoubleCampaignDropItem(IUser, ItemType, CampaignType, int)`
- `void useEliteChancesCostResetItem(IUser)`
- `void useStaminaCostResetItem(IUser)`
- `void useStaminaConsumableItem(IUser)`
- `boolean checkXPBonusItemEventAdjustment(IUser, SpecialEventInfo)`
- `boolean hasUnviewedConsumableItem(IUser)`
- `void useItem(IUser, ItemType)`
- `void useTempVIPItem(IUser, int)`
- `void useTeamXPBonusItem(IUser, ItemType, int)`
- `boolean exchangeItem(IUser, String, String)`
- `UseItemEventType getItemEventType(ItemType)`
- `UseItemEventType getItemEventType(GameMode, int)`
- `void updateBonusItem(IUser, UseItemEventType, long, int)`
- `void updateBonusItem(IUser, UseItemEventType, long, long)`
- `boolean checkDoubleCampaignDropItemEventAdjustment(IUser, SpecialEventInfo)`
- `boolean updateEventAdjustmentTimeAndPauseTime(IUser, GameMode, TimeType, int, long, long, long)`
- `boolean checkForItemXPBonusEventAdjustments(IUser, SpecialEventInfo)`
- `int getItemEventRate(UseItemEventType)`
- `boolean checkForItemEventAdjustments(IUser, SpecialEventInfo)`

### ItemLootRange (class)
`com.perblue.rpg.game.logic.ItemLootRange`

**Fields (3):**
- `private int max`
- `private int min`
- `private final ItemType type`

**Methods (5):**
- `int getMax()`
- `int getMin()`
- `void setMin(int)`
- `void setMax(int)`
- `ItemType getType()`

### LapsedCatchUpHelper (class)
`com.perblue.rpg.game.logic.LapsedCatchUpHelper`

**Fields (1):**
- `private static final long DAY = 86400000`

**Methods (4):**
- `void claimStaminaRewards(IUser)`
- `CatchUpPeriod checkUserInPeriod(IUser)`
- `int getStaminaRewards(IUser)`

### LegendaryQuestHelper (class)
`com.perblue.rpg.game.logic.LegendaryQuestHelper`

**Fields (1):**
- `private static UnitType[] HIPPY_UNIT_TYPES`

**Methods (37):**
- `void onDifficultyModeAttack(IUser, Collection, int, int, GameMode, ModeDifficulty, CombatOutcome)`
- `void checkForQuestChanges(IUser)`
- `void onClaimStaminaRewards(IUser)`
- `void recordContestBattleWin(ContestTaskType, IUser, Collection, int, int, int)`
- `void recordHardExpeditionWinQuests(IUser, List, Set)`
- `void onExpeditionCompleted(IUser, int, int)`
- `void recordExpeditionCompleted(IUser, int, ContestTaskType, ContestTaskType)`
- `void onTitanTempleAttack(IUser, Collection, int, int, UnitType, CombatOutcome)`
- `void recordAttackBaseInformation(IUser, AttackBase)`
- `void onStaminaSpend(IUser, int)`
- `boolean shouldNotUseHero(IUser, IHero)`
- `ContestTaskType getPowerDefeatedAboveOwnTaskType(ContestTaskType)`
- `ContestTaskType getPowerDefeatedTaskType(ContestTaskType)`
- `boolean requiresConsecutiveDailyProgress(LegendaryQuestType)`
- `ContestTaskType getHeroesRemainingTaskType(ContestTaskType)`
- `boolean containsHero(Collection, UnitType)`
- `void doQuestSkip(IUser, int, int)`
- `void doSacrifice(IUser, int, int)`
- `void doSacrifice(IUser, int, int, ItemType)`
- `void doSacrifice(IUser, int, int, ResourceType)`
- `String getGenericUseKey(UnitType)`
- `boolean isMultiDay(LegendaryQuestType)`
- `void recordHeroUse(IUser, Collection, CombatOutcome)`
- `void recordHeroUse(IUser, HeroLineup, CombatOutcome)`
- `void onColiseumAttack(IUser, Collection, int, int, ArenaTier, boolean, boolean)`
- `void onExpeditionAttack(IUser, List, int, int, int, int, CombatOutcome)`
- `void recordHeroUseData(IUser, Collection, CombatOutcome)`
- `void onFightPitAttack(IUser, Collection, int, int, ArenaTier, CombatOutcome)`
- `void onGlobalChat(IUser, String)`
- `void onGoldEarned(IUser, int)`
- `void onGuildWarAttack(IUser, HeroLineup, List, CombatOutcome, int, int)`
- `void onMerchantPurchase(IUser)`
- `void onChestOpen(IUser, ChestType, int)`
- `boolean shouldShowRedDot(IUser, UnitType, ContentUpdate)`
- `void onCryptRaidAttack(IUser, HeroLineup, int, List, CombatOutcome)`
- `void onBossPitAttack(IUser, HeroLineup, int, int, UnitType, int, ModeDifficulty, CombatOutcome)`
- `void onCampaignAttack(IUser, Collection, int, int, CampaignType, int, int, CombatOutcome)`

### LegendaryQuestType (enum)
`com.perblue.rpg.game.logic.LegendaryQuestType`
extends `java.lang.Enum`

**Fields (20):**
- `private static final LegendaryQuestType[] $VALUES`
- `public static final LegendaryQuestType BASIC_SINGLE_DAY`
- `public static final LegendaryQuestType BUY_MERCHANT_ITEMS`
- `public static final LegendaryQuestType CHAT_CONSECUTIVE`
- `public static final LegendaryQuestType ENCHANT_HEROES`
- `public static final LegendaryQuestType FULL_MOON`
- `public static final LegendaryQuestType HERO_ABSTINENCE`
- `public static final LegendaryQuestType OPEN_CHESTS`
- `public static final LegendaryQuestType QUARTER_MOON`
- `public static final LegendaryQuestType SACRIFICE_ITEMS`
- `public static final LegendaryQuestType SACRIFICE_ITEM_CONSECUTIVE`
- `public static final LegendaryQuestType SACRIFICE_RESOURCES`
- `public static final LegendaryQuestType TITAN_KILLS`
- `public static final LegendaryQuestType WIN_BOSS_PIT`
- `public static final LegendaryQuestType WIN_COLISEUM`
- `public static final LegendaryQuestType WIN_COLISEUM_CONSECUTIVE`
- `public static final LegendaryQuestType WIN_ELITE_NODE`
- `public static final LegendaryQuestType WIN_FIGHT_PIT`
- `public static final LegendaryQuestType WIN_FIGHT_PIT_CONSECUTIVE`
- `public static final LegendaryQuestType WIN_HARD_EXPEDITION_BATTLE`

**Methods (2):**
- `LegendaryQuestType[] values()`
- `LegendaryQuestType valueOf(String)`

**Constants (19):**
- BASIC_SINGLE_DAY
- SACRIFICE_RESOURCES
- SACRIFICE_ITEMS
- SACRIFICE_ITEM_CONSECUTIVE
- WIN_FIGHT_PIT
- WIN_COLISEUM
- WIN_BOSS_PIT
- WIN_ELITE_NODE
- WIN_FIGHT_PIT_CONSECUTIVE
- WIN_COLISEUM_CONSECUTIVE
- TITAN_KILLS
- HERO_ABSTINENCE
- FULL_MOON
- WIN_HARD_EXPEDITION_BATTLE
- BUY_MERCHANT_ITEMS
- OPEN_CHESTS
- CHAT_CONSECUTIVE
- ENCHANT_HEROES
- QUARTER_MOON

### MailHelper (class)
`com.perblue.rpg.game.logic.MailHelper`

**Methods (9):**
- `void deleteMessage(long, IUser)`
- `IMailMessage findMessage(long, IUser)`
- `boolean hasNewMail(IUser)`
- `boolean isPriority(MailType)`
- `void markOpened(IMailMessage, IUser)`
- `void markOpened(long, IUser)`
- `void takeAttachments(long, IUser)`
- `void takeAttachments(IMailMessage, IUser)`
- `boolean canCollectWithoutReading(MailType)`

### MercenaryHelper (class)
`com.perblue.rpg.game.logic.MercenaryHelper`

**Fields (3):**
- `private static final long CRYPT_HIRE_COOLDOWN = 7200000`
- `private static final long EXPEDITION_HIRE_COOLDOWN = 43200000`
- `public static final long POST_DURATION = 79200000`

**Methods (5):**
- `boolean canPostHero(User)`
- `void chargeForMercenary(IUser, int)`
- `long getHireCooldown(GameMode)`
- `int getHireCost(MercenaryHeroData, GameMode)`
- `int getAndUpdateGold(IUser)`

### MerchantHelper (class)
`com.perblue.rpg.game.logic.MerchantHelper`

**Methods (22):**
- `IMerchantItem findUnpurchasedItem(MerchantType, RewardDrop, IUser, int)`
- `String getFreeRefreshDailyUseType(MerchantType)`
- `ResourceType getMerchantPrimaryCurrency(MerchantType)`
- `long getNextAutoRefreshTime(MerchantType, IUser)`
- `String getRefreshDailyUseType(MerchantType)`
- `int getStaminaRequired(MerchantType)`
- `Collection getAutoSellItems(IUser)`
- `int getFreeRefreshes(MerchantType, IUser)`
- `int getItemCost(MerchantType, IMerchantItem)`
- `boolean isLimitedTime(MerchantType)`
- `a purchaseItem(MerchantType, RewardDrop, IUser, int, int, int)`
- `boolean shouldAutoRefresh(MerchantType, IUser)`
- `void unlockMerchant(IUser, MerchantType)`
- `long getTimeUntilNextAutoRefresh(MerchantType, IUser)`
- `boolean hasNewOrAutoSellItems(IUser)`
- `boolean isConsistentStoneType(MerchantType)`
- `boolean isPaidRefreshEnabled(MerchantType, IUser)`
- `boolean refresh(MerchantType, MerchantRefreshType, IUser)`
- `boolean checkForFoundMerchant(IUser, int, MerchantType, boolean)`
- `void checkForFoundMerchant(IUser, int)`
- `int getItemAmount(MerchantType, IMerchantItem)`
- `boolean isAvailable(IUser, MerchantType)`

### MountainHelper (class)
`com.perblue.rpg.game.logic.MountainHelper`

**Fields (2):**
- `public static final r CAVES_OPEN_DAYS`
- `public static final r SUMMIT_OPEN_DAYS`

**Methods (1):**
- `boolean hasAttacksAvailable(IUser)`

### NameChangeHelper (class)
`com.perblue.rpg.game.logic.NameChangeHelper`

**Fields (5):**
- `private static final String LEGAL_CHARS =  -/0123456789_AaÁáÀàÂâÅåÄäÃãÆæBbCcÇçDdEeÉéÈèÊêËëFfGgĞğHhIiÍíÌìÎîÏïİIJijıJjKkLlMmNnÑñOoÓóÒòÔôÖöÕõØøŒœPpQqRrSsŞşßTtUuÚúÙùÛûÜüVvWwXxYyŸÿZzАаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя`
- `public static final int MAX_NAME_LENGTH = 16`
- `public static final int MIN_NAME_LENGTH = 3`
- `public static final int NORMAL_COST = 100`
- `private static String[] illegalNames`

**Methods (3):**
- `boolean containsIgnoreCase(String, String)`
- `int getNameChangeCost(IUser)`
- `boolean isNameLegal(String)`

### PlayerRankingHelper (class)
`com.perblue.rpg.game.logic.PlayerRankingHelper`

**Fields (9):**
- `public static final int MIN_LEVEL = 10`
- `public static final int TOP_LIST_LOAD_SIZE = 220`
- `public static final int TOP_LIST_SIZE = 200`
- `private static Map guildRanks`
- `private static Map topArenaPlayers`
- `private static Map topGuilds`
- `private static Map topPlayers`
- `private static Map yourArenaInfo`
- `private static Map yourRanks`

**Methods (13):**
- `void calculateRankedStats(IUser)`
- `int getGuildRank(RankType)`
- `List getTopArenaPlayers(RankType)`
- `List getTopGuilds(RankType)`
- `Collection getTopHeroes(IUser)`
- `List getTopPlayers(RankType)`
- `ArenaRankingRow getYourArenaInfo(RankType)`
- `int getYourRank(RankType)`
- `int getYourScore(RankType)`
- `void updateRankings(PlayerArenaRankings)`
- `void updateRankings(GuildRankings)`
- `void updateRankings(PlayerRankings)`
- `void clearCache()`

### QuickAttackAutomator (class)
`com.perblue.rpg.game.logic.QuickAttackAutomator`

**Fields (3):**
- `private int playSpeed`
- `protected CoreAttackScreen screen`
- `private boolean stopQuickAttack`

**Methods (6):**
- `void retreat()`
- `void setSoundEnabled(boolean)`
- `void runCombat(int, CoreAttackScreen)`
- `void dispose()`
- `void update(float)`
- `void stop()`

### RewardHelper (class)
`com.perblue.rpg.game.logic.RewardHelper`

**Methods (34):**
- `void giveResourceReward(IUser, RewardDrop, GameMode, boolean, String[])`
- `boolean isValidRewardType(String)`
- `void convertHeroDrop(IUser, RewardDrop)`
- `RewardDrop copyWithMultiplier(RewardDrop, int)`
- `List copyWithMultiplier(List, int)`
- `RewardDrop createDrop(ResourceType, int)`
- `RewardDrop createDrop(ItemType, int)`
- `void giveItemReward(IUser, RewardDrop, GameMode, boolean, boolean, String[])`
- `boolean isRune(RewardDrop)`
- `String getMainType(RewardDrop)`
- `RewardDrop getWithQuantity(RewardDrop, int)`
- `void mergeReward(Collection, RewardDrop)`
- `boolean isItem(RewardDrop)`
- `boolean giveReward(IUser, RewardDrop, boolean, String[])`
- `void giveReward(IUser, RewardDrop, GameMode, boolean, boolean, String[])`
- `void giveRewards(IUser, Collection, boolean, String[])`
- `void giveRewards(IUser, Collection, GameMode, boolean, boolean, String[])`
- `void mergeRewards(Collection, Collection)`
- `ItemCategory getCategory(RewardDrop)`
- `boolean compareDrops(List, List)`
- `boolean compareDrops(RewardDrop, RewardDrop, boolean)`
- `boolean isResource(RewardDrop)`
- `List convert(IUser, List, boolean)`
- `RewardDrop convert(IUser, t, boolean, GameMode, GameModeMultipliers, Map)`
- `RewardDrop convert(IUser, t, boolean, GameMode, GameModeMultipliers)`
- `RuneData convert(t)`
- `List convert(IUser, List, boolean, GameMode, GameModeMultipliers, Map)`
- `List convert(IUser, List, boolean, GameMode, GameModeMultipliers)`
- `List convert(IUser, List, boolean, GameMode)`
- `boolean contains(Collection, ItemType)`
- `boolean contains(Collection, ResourceType)`
- `RuneData copy(RuneData)`
- `RuneBonusData copy(RuneBonusData)`
- `RewardDrop copy(RewardDrop)`

### com.perblue.rpg.game.logic.RuneHelper [LOAD ERROR: null]

### SeedHelper (class)
`com.perblue.rpg.game.logic.SeedHelper`

**Methods (1):**
- `long getDefaultSeed(long, RandomSeedType)`

### SigninHelper (class)
`com.perblue.rpg.game.logic.SigninHelper`

**Fields (2):**
- `private static final AtomicReference DATA`
- `protected static final long END_TIME_FUDGE = 60000`

**Methods (32):**
- `int getDaysInMonth(long)`
- `void tryResetUserSignInCount(IUser)`
- `int getActiveRewardIndex(IUser)`
- `int getActiveRewardIndex(IUser, long)`
- `SigninReward getCurrentSigninReward(IUser)`
- `int getDoubleRewardVIPLevel(IUser, int, long)`
- `DailySignInClaimableStatus getDetailedAlreadyClaimed(IUser, int, long)`
- `void addUserData(IUser, long)`
- `boolean areDifferentDays(IUser, long, long, long)`
- `DailySignInClaimableStatus claim(IUser, int, long)`
- `DailySignInClaimableStatus getClaimableStatus(IUser, int, long)`
- `boolean isClaimable(DailySignInClaimableStatus)`
- `boolean isClaimable(IUser, int, long)`
- `boolean isClaimable(IUser, int)`
- `EventSigninBonus getEventSigninData(IUser, long)`
- `RewardDrop getReward(IUser, int)`
- `List getRewardEvent(IUser, int, long)`
- `void giveItem(IUser, RewardDrop, int, String)`
- `String convertJSTTime(Date, boolean)`
- `long getEndOfMonth(long, boolean)`
- `Map getEventSigninList(IUser)`
- `long getLastMonth(long)`
- `long getNextMonth(long)`
- `long getStartOfMonth(long, boolean)`
- `long isEventSignedIn(IUser)`
- `boolean isSignedIn(IUser)`
- `long getCurrentServerEndTime()`
- `UnitType getCurrentServerSigninHero()`
- `boolean isCurrentOrFutureSigninHero(UnitType)`
- `String convertTime(Date, boolean, String)`
- `List getRewards(IUser)`
- `void setData(SigninRewards)`

### com.perblue.rpg.game.logic.SpecialEventsHelper [LOAD ERROR: null]

### Tip (class)
`com.perblue.rpg.game.logic.Tip`

**Fields (3):**
- `private String header`
- `private String icon`
- `private String tip`

**Methods (3):**
- `String getIcon()`
- `String getTip()`
- `String getHeader()`

### com.perblue.rpg.game.logic.TitanTempleHelper [LOAD ERROR: null]

### UpperLimit (class)
`com.perblue.rpg.game.logic.UpperLimit`

**Fields (1):**
- `public static final int LIMIT_INT = 2100000000`

**Methods (3):**
- `UpperLimitType checkLimit(IUser, ResourceType, int)`
- `long getTotalResourceAmount(IUser, ResourceType, long)`
- `int getLimitedTotalResourceAmount(IUser, ResourceType, long)`

### UserHelper (class)
`com.perblue.rpg.game.logic.UserHelper`

**Fields (8):**
- `public static final Set DEFAULT_AVATARS`
- `public static final String FREE_VIP5_CONSUMABLE_AB = FreeVIP5Consumable_24509`
- `public static final String LAPSED_CATCH_UP_AB = LapsedCatchUp_22269`
- `private static final Log LOG`
- `public static final int NEW_ACCOUNT_COST = 100`
- `public static final String NEW_USER_IAP_HERO_AB = NewUserHeroIAP_24111`
- `public static final String STAMINA_COST_GROWTH_AB = StaminaGrowth2_22473`
- `public static final String STARTER_PACK_AB = Starter_Pack_12-16`

**Methods (44):**
- `int calcTotalbuyGold(IUser, int, int, List)`
- `int calcTotalbuyGold(IUser, int, int)`
- `void buyAccount(IUser)`
- `Iterable buyGold(int, IUser)`
- `List calcBuyGoldResults(IUser, int, int)`
- `List calcBuyGoldResults(IUser, int, int, boolean)`
- `void sellItem(ItemType, int, IUser)`
- `long timeUntilFull(User)`
- `void buyPowerPoints(IUser)`
- `Integer buyRaidTickets(IUser)`
- `Iterable buyRunicite(int, IUser)`
- `void buyStamina(IUser)`
- `void recalcVIPLevel(IUser)`
- `int getResourceCap(ResourceType, IUser)`
- `List getUnlockedAvatars(IUser)`
- `int giveVIPTickets(IUser, int, String[])`
- `boolean hasAnySkins(IUser)`
- `boolean isSkinEquipped(IUser, ItemType)`
- `void purchaseSkin(IUser, ItemType, int)`
- `long getNextResourceGeneration(ResourceType, IUser)`
- `long getResourceGenerationInterval(ResourceType, IUser)`
- `int getReachableHeroStars(IUser, UnitType)`
- `boolean itemSellsForSoulmartTokens(ItemType, IUser)`
- `long getResourceGenerationRemaining(ResourceType, IUser)`
- `String getBossPitKey(UnitType, ModeDifficulty, int)`
- `boolean resourceGenerates(ResourceType)`
- `int updateAndGetResource(ResourceType, IUser, int)`
- `void updateLastResourceGenerationTime(ResourceType, IUser, int, int)`
- `float getItemDropMultiplier(IUser, CampaignType, int)`
- `float getItemDropMultiplier(IUser, CampaignType)`
- `void onTeamLevelChange(IUser, int, int)`
- `void chargeUser(IUser, ResourceType, int, float, String[])`
- `void chargeUser(IUser, ResourceType, int, String[])`
- `void giveUser(IUser, ResourceType, int, boolean, String[])`
- `boolean giveUser(IUser, ItemType, int, boolean, String[])`
- `void giveUser(IUser, ResourceType, int, boolean, boolean, String[])`
- `int addCampaignDropMultiplier(int, int, Map)`
- `int getCampaignDropMultiplier(Map)`
- `int getCampaignMultiplierDropsLeft(int, Map)`
- `void removeItem(IUser, ItemType, int, String[])`
- `int useCampaignMultiplierDrop(int, Map)`
- `int giveTeamXP(IUser, int, String[])`
- `int changeName(IUser, String)`
- `void setTimeZone(IUser, int, String)`

### WarHelper (class)
`com.perblue.rpg.game.logic.WarHelper`

**Fields (1):**
- `public static final List WAR_DEFENSE_LINEUPS`

**Methods (12):**
- `int getBattlePointValue(int, int, int)`
- `boolean hasAllDefenseLineupsSet(IUser)`
- `void viewedBattleResults(IUser, long)`
- `void claimRewards(IUser, ClaimGuildWarRewards)`
- `List getNPCLineup(IUser, HeroLineupType, long)`
- `GuildWarRewardClaimStatus getPostClaimStatus(int)`
- `boolean isUnclaimed(WarResult)`
- `boolean startAttack(IUser)`
- `boolean checkForWarInfoUpdates(WarInfo)`
- `boolean shouldShowRedDot(IUser, WarRedDotInfo)`
- `void giveGold(IUser, List, int)`
- `void recordOutcome(IUser, HeroLineup, CombatOutcome, List, int, int, int)`

### EmptyContextDTCode (class)
`com.perblue.rpg.game.logic.droptable.EmptyContextDTCode`
extends `com.perblue.common.b.aw`

### UserContextDTCode (class)
`com.perblue.rpg.game.logic.droptable.UserContextDTCode`
extends `com.perblue.rpg.game.logic.droptable.EmptyContextDTCode`

**Fields (1):**
- `private int minTeamLevel`

**Methods (6):**
- `void validateQuestId(String[], r)`
- `int checkLegendaryQuest$635fe69a(UserDTContext, l)`
- `void setMinTeamLevel(int)`

### UserDTContext (class)
`com.perblue.rpg.game.logic.droptable.UserDTContext`
extends `com.perblue.common.b.n`

**Fields (1):**
- `private final IUser user`

**Methods (1):**
- `IUser getUser()`

## Package: com.perblue.rpg.game.objects (49 classes)

### AnimationElement (class)
`com.perblue.rpg.game.objects.AnimationElement`

**Fields (9):**
- `private static Log LOG`
- `public static final float STEP_SIZE = 0.033333335`
- `private float animAccumlator`
- `private IAnimationMapping animMapping`
- `private final AnimationState animState`
- `private z persistentAttachments`
- `private final n posedBounds`
- `private final Skeleton skeleton`
- `protected boolean skeletonTransformDirty`

**Methods (21):**
- `Skeleton getSkeleton()`
- `Animation getAnimation(String)`
- `void updateWorldTransform()`
- `void setAnimMapping(IAnimationMapping)`
- `void setAnimationImmediately(Entity, String, boolean)`
- `void setPersistentAttachment(String, String)`
- `void setPersistentAttachment(Slot, Attachment)`
- `Bone getHitBone()`
- `IAnimationMapping getAnimMapping()`
- `float getHeightFromOrigin()`
- `String getPrimaryAnimation()`
- `void removePersistentAttachment(Slot)`
- `void removePersistentAttachment(String)`
- `n getPosedBounds()`
- `void setAnimation(Entity, String, boolean)`
- `void setAnimation(Entity, AnimationType, boolean)`
- `AnimationState getAnimState()`
- `float getAnimationLength(AnimationType)`
- `float getAnimationLength(String)`
- `void update(float)`
- `void reset()`

### ClientBossBattleData (class)
`com.perblue.rpg.game.objects.ClientBossBattleData`

**Fields (3):**
- `private BossBattleResponse data`
- `private long eventID`
- `private List opponents`

**Methods (23):**
- `void addUsedUnit(UnitType)`
- `long getEventID()`
- `List getOpponents()`
- `long getPoints()`
- `List getUsedUnits()`
- `void setClearedChapter(Integer)`
- `void setEventID(long)`
- `void setOpponents(List)`
- `void setPoints(long)`
- `void setUsedUnits(List)`
- `Integer getTeamLevel()`
- `void setTeamLevel(Integer)`
- `Integer getClearedChapter()`
- `Integer getClearedLevel()`
- `long getTotalElapsedTime()`
- `List getDistributedTimeBonusRanks()`
- `void setDistributedTimeBonusRanks(List)`
- `void setClearedLevel(Integer)`
- `void addUsedUnits(List)`
- `void setElapsedTimes(List)`
- `void addElapsedTime(long)`
- `void setData(BossBattleResponse)`
- `BossBattleResponse getData()`

### ClientBossPit (class)
`com.perblue.rpg.game.objects.ClientBossPit`

**Fields (1):**
- `private final BossPitData data`

**Methods (18):**
- `Collection getCurrentCompletedBosses()`
- `void setCurrentBoss(UnitType)`
- `void setCurrentPhase(int)`
- `int getCurrentPhase()`
- `void addCompletedBoss(UnitType)`
- `UnitType getCurrentBoss()`
- `void setCurrentDifficultyCap(ModeDifficulty)`
- `void clearCompletedBosses()`
- `void setCurrentPhaseComplete(boolean)`
- `ModeDifficulty getCurrentDifficulty()`
- `ModeDifficulty getCurrentDifficultyCap()`
- `boolean isCurrentPhaseComplete()`
- `void setCurrentDifficulty(ModeDifficulty)`
- `void setLastAttackTime(long)`
- `void addWin(UnitType, int, ModeDifficulty)`
- `long getLastAttackTime()`
- `int getPhase(UnitType)`
- `int getWins(UnitType, int, ModeDifficulty)`

### ClientCampaignLevelStatus (class)
`com.perblue.rpg.game.objects.ClientCampaignLevelStatus`

**Fields (7):**
- `private CampaignType campaignType`
- `private int chapter`
- `private long lastWinTime`
- `private int level`
- `private int stars`
- `private int totalWins`
- `private int winsAtCurrentStars`

**Methods (11):**
- `int getStars()`
- `void setStars(int)`
- `CampaignType getCampaignType()`
- `int getTotalWins()`
- `void setTotalWins(int)`
- `void setLastWinTime(long)`
- `void setWinsAtCurrentStars(int)`
- `int getWinsAtCurrentStars()`
- `long getLastWinTime()`
- `int getChapter()`
- `int getLevel()`

### ClientContestData (class)
`com.perblue.rpg.game.objects.ClientContestData`

**Fields (6):**
- `private long contestID`
- `private ContestData data`
- `private long pointsToAnimateFrom`
- `public boolean shouldAnimateProgressBar`
- `public boolean shouldAnimateProgressTimer`
- `private boolean shouldShowProgressBanner`

**Methods (20):**
- `boolean getAnimateProgressBarFlag()`
- `boolean getAnimateProgressTimerFlag()`
- `long getPointsToAnimateFrom()`
- `boolean getShouldShowProgressBanner()`
- `void setAnimateProgressBarFlag(boolean)`
- `void setAnimateProgressTimerFlag(boolean)`
- `void setPointsToAnimateFrom(float)`
- `int getCompletedCount(int)`
- `int getPartialCount(int)`
- `void setPartialCount(int, int)`
- `void setCompletedCount(int, int)`
- `void setShouldShowProgressBanner(boolean)`
- `long getContestID()`
- `int getTotalPlayers()`
- `void setContestID(long)`
- `void setRank(int)`
- `int getRank()`
- `long getPoints()`
- `void setPoints(long)`
- `void setData(long, ContestData)`

### ClientEntityFactories (class)
`com.perblue.rpg.game.objects.ClientEntityFactories`

**Fields (2):**
- `private static final EntityFactory PROJECTILES`
- `private static final EntityFactory UNITS`

**Methods (2):**
- `EntityFactory getProjectileFactory()`
- `EntityFactory getUnitFactory()`

### ClientEquippedItem (class)
`com.perblue.rpg.game.objects.ClientEquippedItem`

**Fields (6):**
- `private int enchantMaterialPoints`
- `private UnitType equippedTo`
- `private boolean initialized`
- `private int stars`
- `private int totalPoints`
- `private ItemType type`

**Methods (11):**
- `int getStars()`
- `void setStars(int)`
- `int getEnchantMaterialPoints()`
- `void setEnchantMaterialPoints(int)`
- `UnitType getHeroEquippedTo()`
- `int getTotalPoints()`
- `void setTotalPoints(int)`
- `void setHeroEquippedTo(UnitType)`
- `void setInitialized(boolean)`
- `void setType(ItemType)`
- `ItemType getType()`

### ClientMailMessage (class)
`com.perblue.rpg.game.objects.ClientMailMessage`

**Fields (11):**
- `private List attachments`
- `private long expiration`
- `private Map extraData`
- `private String message`
- `private long messageId`
- `private boolean opened`
- `private boolean persistent`
- `private String sender`
- `private long sentDate`
- `private String subject`
- `private MailType type`

**Methods (25):**
- `void setAttachments(List)`
- `void setExtraData(Map)`
- `boolean isOpened()`
- `void setOpened(boolean)`
- `boolean isPersistent()`
- `Collection getAttachments()`
- `String getExtraData(MailExtraDataType)`
- `String getSubject()`
- `void setExpiration(long)`
- `long getExpiration()`
- `String getSender()`
- `long getSentDate()`
- `void setPersistent(boolean)`
- `void setSender(String)`
- `void setSentDate(long)`
- `void setSubject(String)`
- `void setMessage(String)`
- `void setID(long)`
- `void setType(MailType)`
- `long getID()`
- `boolean equals(Object)`
- `int hashCode()`
- `String getMessage()`
- `void delete(boolean)`
- `MailType getType()`

### ClientMerchantItem (class)
`com.perblue.rpg.game.objects.ClientMerchantItem`

**Fields (4):**
- `private int cost`
- `private ResourceType currency`
- `private RewardDrop item`
- `private boolean purchased`

**Methods (8):**
- `boolean isPurchased()`
- `int getCost()`
- `void setPurchased(boolean)`
- `void setCost(int)`
- `void setItem(RewardDrop)`
- `ResourceType getCurrency()`
- `void setCurrency(ResourceType)`
- `RewardDrop getItem()`

### ClientRune (class)
`com.perblue.rpg.game.objects.ClientRune`

**Fields (10):**
- `private z bonusMap`
- `private UnitType equippedTo`
- `private int fusionPoints`
- `private UnitType heroRestriction`
- `private long id`
- `private int level`
- `private Rarity rarity`
- `private RuneEquipSlot slot`
- `private int stars`
- `private RuneSetType type`

**Methods (30):**
- `void clearBonusData()`
- `a getTertiaryBonuses()`
- `int getFusionPoints()`
- `void setFusionPoints(int)`
- `void addBonus(RuneBonusData, String)`
- `void addBonus(IRuneBonus)`
- `Iterable getAllBonuses()`
- `IRuneBonus getBonus(StatType)`
- `a getPrimaryBonuses()`
- `void removeBonus(StatType)`
- `void setHeroRestriction(UnitType)`
- `void setRuneSetType(RuneSetType)`
- `void setSlot(RuneEquipSlot)`
- `UnitType getHeroRestriction()`
- `RuneSetType getRuneSetType()`
- `IRuneBonus getSecondaryBonus()`
- `int getStars()`
- `Rarity getRarity()`
- `void setLevel(int)`
- `void setRarity(Rarity)`
- `void setStars(int)`
- `UnitType getHeroEquippedTo()`
- `int getLevel()`
- `void setHeroEquippedTo(UnitType)`
- `void setID(long)`
- `long getID()`
- `String toString()`
- `RuneEquipSlot getSlot()`

### CombatRenderSkill (class)
`com.perblue.rpg.game.objects.CombatRenderSkill`

**Fields (4):**
- `private AnimationType animation`
- `private long duration`
- `private boolean kill`
- `private SkillType type`

**Methods (9):**
- `void setKill(boolean)`
- `AnimationType getAnimation()`
- `boolean isKill()`
- `void setDuration(long)`
- `void setType(SkillType)`
- `void setAnimation(AnimationType)`
- `long getDuration()`
- `String toString()`
- `SkillType getType()`

### DamageTypeData (class)
`com.perblue.rpg.game.objects.DamageTypeData`

**Fields (4):**
### com.perblue.rpg.game.objects.DamageTypeData [LOAD ERROR: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$DamageSourceType disagree on InnerClasses attribute]

### Entity (class)
`com.perblue.rpg.game.objects.Entity`

**Fields (26):**
- `protected a actionQueue`
- `public boolean active`
- `private AnimationElement animationElement`
- `private h buffs`
- `protected boolean buffsDirty`
- `private long deltaLeft`
- `protected float energy`
- `protected float hp`
- `private p hpOffset`
- `protected long id`
- `protected boolean initialized`
- `protected a labels`
- `protected float oldHP`
- `private q originalPosition`
- `protected int overrideDamage`
- `protected int overrideMaxHP`
- `protected a parallelActionQueue`
- `protected Entity parent`
- `private q position`
- `protected float prevYaw`
- `protected float scale`
- `protected IScene scene`
- `private long spreadOutCooldown`
- `private int teamNumber`
- `protected boolean visible`
- `protected float yaw`

**Methods (83):**
- `float getScale()`
- `q getPosition()`
- `SimAction getCurrentAction()`
- `float getEnergy()`
- `float getHP()`
- `boolean addBuff(IBuff, Entity)`
- `void addSimAction(SimAction, boolean)`
- `void addSimAction(SimAction)`
- `boolean canClearSimActions()`
- `boolean clearSimActions(boolean)`
- `void addParallelSimAction(SimAction)`
- `void addParallelSimAction(SimAction, boolean)`
- `boolean clearParallelSimActions(boolean)`
- `AnimationElement getAnimationElement()`
- `int getMaxEnergy()`
- `a getParallelActions()`
- `float getYaw()`
- `boolean isActionQueueEmpty()`
- `boolean removeBuff(IBuff)`
- `void setEnergy(float)`
- `void setHP(float, String)`
- `void setHP(float)`
- `void setPosition(q)`
- `void setPosition(float, float, float)`
- `void setPosition(float, float)`
- `void setYaw(float)`
- `boolean clearParallelAction(SimAction, boolean)`
- `boolean clearParallelAction(long, boolean)`
- `boolean clearParallelSimActionType(Class, boolean)`
- `float getAnimateSpeedMultiplier()`
- `boolean clearActionArray(a, boolean)`
- `int BuffCount()`
- `a calcBounds(a)`
- `boolean clearAction(SimAction, boolean)`
- `boolean clearAction(long, boolean)`
- `void clearAllBuffs()`
- `boolean clearSimActionType(Class, boolean)`
- `void dispose()`
- `int getActionQueueSize()`
- `IBuff getBuff(Class)`
- `p getHPOffset()`
- `a getLabels()`
- `float getPrevYaw()`
- `IScene getScene()`
- `q getTargetPosition()`
- `q getOriginalPosition()`
- `long getSpreadOutCooldown()`
- `void resetSpreadOutCooldown()`
- `void setAnimationElement(AnimationElement)`
- `void setOriginalPosition(q)`
- `void setSpreadoutCooldownOverride(long)`
- `int getTeam()`
- `boolean hasBuff(Class)`
- `boolean hasAction(SimAction)`
- `boolean hasAction(long)`
- `boolean hasSpecialDeath()`
- `boolean isStunned()`
- `boolean isVisible()`
- `boolean isWearingCostume()`
- `void markBuffsDirty()`
- `void onBuffsDirty()`
- `void onDeath()`
- `void removeBuffs(Class)`
- `void removeBuffs(Class, Class)`
- `void setHPOffset(p)`
- `void setID(long)`
- `void setInitialized(boolean)`
- `void setOverrideMaxHP(int)`
- `void setScale(float, boolean)`
- `void setScale(float)`
- `void setScene(IScene)`
- `void setTeam(int)`
- `void setVisible(boolean)`
- `void updateAfterActions(long, boolean)`
- `a getBuffs(Class, a)`
- `a getBuffs(Class)`
- `a getBuffs()`
- `long getID()`
- `void update(long, boolean)`
- `Entity getParent()`
- `a getActions()`
- `void create()`
- `void setParent(Entity)`

### EntityFactory (interface)
`com.perblue.rpg.game.objects.EntityFactory`

**Methods (1):**
- `IEntity create(IScene)`

### EntityGroup (class)
`com.perblue.rpg.game.objects.EntityGroup`

**Fields (3):**
- `public a entities`
- `public a toAdd`
- `public a toRemove`

### EnvEntity (class)
`com.perblue.rpg.game.objects.EnvEntity`
extends `com.perblue.rpg.game.objects.Entity`

**Fields (5):**
- `protected boolean isRemovable`
- `protected int maxHP`
- `protected ParticleType particleType`
- `protected ItemType skin`
- `protected EnvEntityType type`

**Methods (9):**
- `boolean isRemovable()`
- `ParticleType getParticleType()`
- `void setIsRemovable(boolean)`
- `void setMaxHP(int)`
- `boolean showHP()`
- `int getMaxHP()`
- `ItemType getSkin()`
- `void setSkin(ItemType)`
- `EnvEntityType getType()`

### EnvEntityType (enum)
`com.perblue.rpg.game.objects.EnvEntityType`
extends `java.lang.Enum`

**Fields (60):**
- `private static final EnvEntityType[] $VALUES`
- `public static final EnvEntityType ABYSS_DRAGON_RAIN`
- `public static final EnvEntityType ALLEY_EYE_BLUE`
- `public static final EnvEntityType ALLEY_EYE_GREEN`
- `public static final EnvEntityType ALLEY_EYE_YELLOW`
- `public static final EnvEntityType ALLEY_LIGHT_RAY`
- `public static final EnvEntityType CHICKEN`
- `public static final EnvEntityType COLOSSUS_FLAG`
- `public static final EnvEntityType COLOSSUS_GOLD_PILE`
- `public static final EnvEntityType DIGGER_MOLE_SKILL2`
- `public static final EnvEntityType DIGGER_MOLE_SKILL3`
- `public static final EnvEntityType DRAGON_SLAYER_BANNER`
- `public static final EnvEntityType DRAGON_SLAYER_BANNER_UNICORN`
- `public static final EnvEntityType DUNGEON_MAN_DOOR`
- `public static final EnvEntityType DUNGEON_MAN_DOOR_BACKGROUND`
- `public static final EnvEntityType DUNGEON_MAN_DOOR_BACKGROUND_MASTERY`
- `public static final EnvEntityType DUNGEON_MAN_DOOR_BACKGROUND_MECHA`
- `public static final EnvEntityType DUNGEON_MAN_DOOR_FOREGROUND`
- `public static final EnvEntityType DUNGEON_MAN_DOOR_FOREGROUND_MASTERY`
- `public static final EnvEntityType DUNGEON_MAN_DOOR_FOREGROUND_MECHA`
- `public static final EnvEntityType DUNGEON_MAN_DOOR_MASTERY`
- `public static final EnvEntityType DUNGEON_MAN_DOOR_MECHA`
- `public static final EnvEntityType FISH`
- `public static final EnvEntityType GENIE_GOAT`
- `public static final EnvEntityType GIANT_PLANT`
- `public static final EnvEntityType JELLO`
- `public static final EnvEntityType KRAKEN_KING_MECHALORD_TENTACLE_1`
- `public static final EnvEntityType KRAKEN_KING_MECHALORD_TENTACLE_3`
- `public static final EnvEntityType KRAKEN_KING_TENTACLE_1`
- `public static final EnvEntityType KRAKEN_KING_TENTACLE_3`
- `public static final EnvEntityType MARINA_BOATS`
- `public static final EnvEntityType MARINA_FRONT_BOAT`
- `public static final EnvEntityType NPC_ABYSS_DRAGON_RAIN`
- `public static final EnvEntityType NPC_ANUBIS_DRAGON_SAND_BACKGROUND`
- `public static final EnvEntityType NPC_ANUBIS_DRAGON_SAND_FOREGROUND`
- `public static final EnvEntityType NPC_BOSS_ABYSS_DRAGON_RAIN`
- `public static final EnvEntityType NPC_BOSS_ANUBIS_DRAGON_SAND_BACKGROUND`
- `public static final EnvEntityType NPC_BOSS_ANUBIS_DRAGON_SAND_FOREGROUND`
- `public static final EnvEntityType PARTICLE_EFFECT`
- `public static final EnvEntityType PIE`
- `public static final EnvEntityType PLAGUE_SKULKER_CORPSE`
- `public static final EnvEntityType SEAGULLS`
- `public static final EnvEntityType SHADOW_ASSASSIN_SHADOW`
- `public static final EnvEntityType SHADOW_ASSASSIN_SHADOW_SKIN_WATCH`
- `public static final EnvEntityType SILENT_SPIRIT_WALL`
- `public static final EnvEntityType SMOKE_TEST_LR`
- `public static final EnvEntityType SMOKE_TEST_RL`
- `public static final EnvEntityType SNAKE`
- `public static final EnvEntityType SNIPER_WOLF_VICTORY_WOLF`
- `public static final EnvEntityType SNIPER_WOLF_WOLF`
- `public static final EnvEntityType SPIDER_QUEEN_COCOON`
- `public static final EnvEntityType SPIDER_QUEEN_STRING`
- `public static final EnvEntityType SPOTLIGHT`
- `public static final EnvEntityType STORM_DRAGON_TWISTER`
- `public static final EnvEntityType TAVERN_DUST`
- `public static final EnvEntityType TOMB_ANGEL_TOMB`
- `public static final EnvEntityType UNICORGI_RAINBOW`
- `public static final EnvEntityType VILE_BILE_PUDDLE`
- `public static final EnvEntityType ZOMBIE_ORGAN`
- `public static final EnvEntityType ZOMBIE_ORGAN_SKIN_DIGITAL`

**Methods (2):**
- `EnvEntityType[] values()`
- `EnvEntityType valueOf(String)`

**Constants (59):**
- SNAKE
- FISH
- PIE
- CHICKEN
- JELLO
- SMOKE_TEST_RL
- SMOKE_TEST_LR
- ZOMBIE_ORGAN
- ZOMBIE_ORGAN_SKIN_DIGITAL
- SHADOW_ASSASSIN_SHADOW
- SHADOW_ASSASSIN_SHADOW_SKIN_WATCH
- SPOTLIGHT
- GIANT_PLANT
- COLOSSUS_FLAG
- COLOSSUS_GOLD_PILE
- STORM_DRAGON_TWISTER
- UNICORGI_RAINBOW
- GENIE_GOAT
- SNIPER_WOLF_WOLF
- SNIPER_WOLF_VICTORY_WOLF
- ALLEY_EYE_BLUE
- ALLEY_EYE_GREEN
- ALLEY_EYE_YELLOW
- ALLEY_LIGHT_RAY
- TAVERN_DUST
- MARINA_BOATS
- MARINA_FRONT_BOAT
- SEAGULLS
- KRAKEN_KING_TENTACLE_1
- KRAKEN_KING_TENTACLE_3
- KRAKEN_KING_MECHALORD_TENTACLE_1
- KRAKEN_KING_MECHALORD_TENTACLE_3
- SPIDER_QUEEN_COCOON
- SPIDER_QUEEN_STRING
- SILENT_SPIRIT_WALL
- PARTICLE_EFFECT
- DUNGEON_MAN_DOOR_BACKGROUND
- DUNGEON_MAN_DOOR_FOREGROUND
- DUNGEON_MAN_DOOR
- DUNGEON_MAN_DOOR_BACKGROUND_MASTERY
- DUNGEON_MAN_DOOR_FOREGROUND_MASTERY
- DUNGEON_MAN_DOOR_MASTERY
- DUNGEON_MAN_DOOR_BACKGROUND_MECHA
- DUNGEON_MAN_DOOR_FOREGROUND_MECHA
- DUNGEON_MAN_DOOR_MECHA
- VILE_BILE_PUDDLE
- TOMB_ANGEL_TOMB
- PLAGUE_SKULKER_CORPSE
- DRAGON_SLAYER_BANNER
- DRAGON_SLAYER_BANNER_UNICORN
- DIGGER_MOLE_SKILL2
- DIGGER_MOLE_SKILL3
- NPC_ANUBIS_DRAGON_SAND_FOREGROUND
- NPC_ANUBIS_DRAGON_SAND_BACKGROUND
- NPC_ABYSS_DRAGON_RAIN
- NPC_BOSS_ANUBIS_DRAGON_SAND_FOREGROUND
- NPC_BOSS_ANUBIS_DRAGON_SAND_BACKGROUND
- ABYSS_DRAGON_RAIN
- NPC_BOSS_ABYSS_DRAGON_RAIN

### Environment (class)
`com.perblue.rpg.game.objects.Environment`

**Fields (7):**
- `public static final float HEIGHT = 5000.0`
- `public static final float ISO_HEIGHT = 3000.0`
- `public static final float ISO_WIDTH = 4000.0`
- `public static final float NEGLIGIBLE_FUDGE = 0.1`
- `public static final n PLAYABLE_BOUNDS`
- `public static final float WIDTH = 4000.0`
- `public static final float WORLD_TO_ISO = 0.6`

**Methods (2):**
- `float getPlayableBoundsCenterX()`
- `float getPlayableBoundsCenterY()`

### IBossBattleData (interface)
`com.perblue.rpg.game.objects.IBossBattleData`

**Methods (21):**
- `void addUsedUnit(UnitType)`
- `long getEventID()`
- `List getOpponents()`
- `long getPoints()`
- `List getUsedUnits()`
- `void setClearedChapter(Integer)`
- `void setEventID(long)`
- `void setOpponents(List)`
- `void setPoints(long)`
- `void setUsedUnits(List)`
- `Integer getTeamLevel()`
- `void setTeamLevel(Integer)`
- `Integer getClearedChapter()`
- `Integer getClearedLevel()`
- `long getTotalElapsedTime()`
- `List getDistributedTimeBonusRanks()`
- `void setDistributedTimeBonusRanks(List)`
- `void setClearedLevel(Integer)`
- `void addUsedUnits(List)`
- `void setElapsedTimes(List)`
- `void addElapsedTime(long)`

### IBossPit (interface)
`com.perblue.rpg.game.objects.IBossPit`

**Methods (18):**
- `Collection getCurrentCompletedBosses()`
- `void setCurrentBoss(UnitType)`
- `void setCurrentPhase(int)`
- `int getCurrentPhase()`
- `void addCompletedBoss(UnitType)`
- `UnitType getCurrentBoss()`
- `void setCurrentDifficultyCap(ModeDifficulty)`
- `void clearCompletedBosses()`
- `void setCurrentPhaseComplete(boolean)`
- `ModeDifficulty getCurrentDifficulty()`
- `ModeDifficulty getCurrentDifficultyCap()`
- `boolean isCurrentPhaseComplete()`
- `void setCurrentDifficulty(ModeDifficulty)`
- `void setLastAttackTime(long)`
- `void addWin(UnitType, int, ModeDifficulty)`
- `long getLastAttackTime()`
- `int getPhase(UnitType)`
- `int getWins(UnitType, int, ModeDifficulty)`

### ICampaignLevelStatus (interface)
`com.perblue.rpg.game.objects.ICampaignLevelStatus`

**Methods (8):**
- `int getStars()`
- `void setStars(int)`
- `int getTotalWins()`
- `void setTotalWins(int)`
- `void setLastWinTime(long)`
- `void setWinsAtCurrentStars(int)`
- `int getWinsAtCurrentStars()`
- `long getLastWinTime()`

### IContestData (interface)
`com.perblue.rpg.game.objects.IContestData`

**Methods (11):**
- `int getCompletedCount(int)`
- `int getPartialCount(int)`
- `void setPartialCount(int, int)`
- `void setCompletedCount(int, int)`
- `long getContestID()`
- `int getTotalPlayers()`
- `void setContestID(long)`
- `void setRank(int)`
- `int getRank()`
- `long getPoints()`
- `void setPoints(long)`

### IEntity (interface)
`com.perblue.rpg.game.objects.IEntity`

**Methods (27):**
- `q getPosition()`
- `SimAction getCurrentAction()`
- `float getEnergy()`
- `float getHP()`
- `boolean addBuff(IBuff, Entity)`
- `void addSimAction(SimAction)`
- `boolean canClearSimActions()`
- `boolean clearSimActions(boolean)`
- `void addParallelSimAction(SimAction)`
- `boolean clearParallelSimActions(boolean)`
- `AnimationElement getAnimationElement()`
- `int getMaxEnergy()`
- `int getMaxHP()`
- `a getParallelActions()`
- `float getYaw()`
- `boolean isActionQueueEmpty()`
- `boolean removeBuff(IBuff)`
- `void setEnergy(float)`
- `void setHP(float)`
- `void setPosition(float, float)`
- `void setPosition(float, float, float)`
- `void setPosition(q)`
- `void setYaw(float)`
- `a getBuffs()`
- `long getID()`
- `void update(long, boolean)`
- `a getActions()`

### IEquippedItem (interface)
`com.perblue.rpg.game.objects.IEquippedItem`

**Methods (10):**
- `int getStars()`
- `void setStars(int)`
- `int getEnchantMaterialPoints()`
- `void setEnchantMaterialPoints(int)`
- `UnitType getHeroEquippedTo()`
- `int getTotalPoints()`
- `void setTotalPoints(int)`
- `void setHeroEquippedTo(UnitType)`
- `void setType(ItemType)`
- `ItemType getType()`

### IHero (interface)
`com.perblue.rpg.game.objects.IHero`

**Methods (35):**
- `int getStars()`
- `Rarity getRarity()`
- `void clearModePersistentData(GameMode)`
- `boolean isMercenary()`
- `void setEXP(int)`
- `void setItem(HeroEquipSlot, ItemType)`
- `void setItem(HeroEquipSlot, IEquippedItem)`
- `void setLegendary(boolean)`
- `void setLevel(int)`
- `void setMercenary(boolean)`
- `void setRarity(Rarity)`
- `void setRune(RuneEquipSlot, IRune)`
- `void setSkillLevel(SkillType, int)`
- `void setSkinType(ItemType)`
- `void setStars(int)`
- `ItemType getSkinType()`
- `float getStat(StatType)`
- `int getLevel()`
- `int getSkillLevel(SkillType)`
- `IRune getRune(RuneEquipSlot)`
- `IRune getRuneByID(long)`
- `int getEnergy(GameMode)`
- `int getHP(GameMode)`
- `void setEnergy(GameMode, int)`
- `void setHP(GameMode, int)`
- `void setType(UnitType)`
- `Iterable getRunes()`
- `Iterable getSkills()`
- `int getEXP()`
- `boolean isLegendary()`
- `IEquippedItem getItem(HeroEquipSlot)`
- `Iterable getItems()`
- `void setExtra(GameMode, HeroBattleDataExtraType, String)`
- `String getExtra(GameMode, HeroBattleDataExtraType)`
- `UnitType getType()`

### IMailMessage (interface)
`com.perblue.rpg.game.objects.IMailMessage`

**Methods (20):**
- `boolean isOpened()`
- `void setOpened(boolean)`
- `boolean isPersistent()`
- `Collection getAttachments()`
- `String getExtraData(MailExtraDataType)`
- `String getSubject()`
- `void setExpiration(long)`
- `long getExpiration()`
- `String getSender()`
- `long getSentDate()`
- `void setPersistent(boolean)`
- `void setSender(String)`
- `void setSentDate(long)`
- `void setSubject(String)`
- `void setMessage(String)`
- `void setType(MailType)`
- `long getID()`
- `String getMessage()`
- `void delete(boolean)`
- `MailType getType()`

### IMerchantItem (interface)
`com.perblue.rpg.game.objects.IMerchantItem`

**Methods (8):**
- `boolean isPurchased()`
- `int getCost()`
- `void setPurchased(boolean)`
- `void setCost(int)`
- `void setItem(RewardDrop)`
- `ResourceType getCurrency()`
- `void setCurrency(ResourceType)`
- `RewardDrop getItem()`

### IRune (interface)
`com.perblue.rpg.game.objects.IRune`

**Methods (26):**
- `Iterable getTertiaryBonuses()`
- `int getFusionPoints()`
- `void setFusionPoints(int)`
- `void addBonus(IRuneBonus)`
- `void addBonus(RuneBonusData, String)`
- `Iterable getAllBonuses()`
- `IRuneBonus getBonus(StatType)`
- `Iterable getPrimaryBonuses()`
- `void removeBonus(StatType)`
- `void setHeroRestriction(UnitType)`
- `void setRuneSetType(RuneSetType)`
- `void setSlot(RuneEquipSlot)`
- `UnitType getHeroRestriction()`
- `RuneSetType getRuneSetType()`
- `IRuneBonus getSecondaryBonus()`
- `int getStars()`
- `Rarity getRarity()`
- `void setLevel(int)`
- `void setRarity(Rarity)`
- `void setStars(int)`
- `UnitType getHeroEquippedTo()`
- `int getLevel()`
- `void setHeroEquippedTo(UnitType)`
- `void setID(long)`
- `long getID()`
- `RuneEquipSlot getSlot()`

### IRuneBonus (interface)
`com.perblue.rpg.game.objects.IRuneBonus`

**Methods (6):**
- `void setStatType(StatType)`
- `void setBonusType(RuneBonusType)`
- `void setSubLevel(int, String)`
- `int getSubLevel()`
- `RuneBonusType getBonusType()`
- `StatType getStatType()`

### IScene (interface)
`com.perblue.rpg.game.objects.IScene`

**Methods (40):**
- `boolean removeExternalEntity(Entity)`
- `void removeSceneListener(ISceneListener)`
- `boolean shouldShowVictoryAnimations()`
- `EntityFactory getProjectileFactory()`
- `void addProjectile(Projectile)`
- `int getAttackersRemaining()`
- `int getDefendersRemaining()`
- `boolean isCastingFreezeLastFrame()`
- `a getOpponentsOfUnit(Unit)`
- `int getStage()`
- `EntityFactory getUnitFactory()`
- `boolean isCombatComplete()`
- `boolean isLastStage()`
- `boolean isStageEnded()`
- `boolean isVictory()`
- `void setCombatComplete(boolean)`
- `void setIsVictory(boolean)`
- `void setSceneInt(SceneInt, int)`
- `void setStageEnded(boolean)`
- `void addEnvEntity(EnvEntity)`
- `void addExternalEntity(Entity)`
- `void addSceneListener(ISceneListener)`
- `void addUnit(Unit)`
- `a getAlliesOfUnit(Unit)`
- `int getNumStages()`
- `a getProjectiles()`
- `int getSceneInt(SceneInt)`
- `void addDelayedAction(Runnable)`
- `boolean isCastingFreeze()`
- `boolean removeUnit(Unit)`
- `boolean removeEnvEntity(EnvEntity)`
- `a getExternalEntities()`
- `boolean isUpdatingEntities()`
- `a getEnvEntities()`
- `a getAttackers()`
- `a getDefenders()`
- `Random getRnd()`
- `boolean isFlagSet(SceneFlag)`
- `boolean removeProjectile(Projectile)`
- `void update(long, boolean)`

### ISceneListener (interface)
`com.perblue.rpg.game.objects.ISceneListener`

**Methods (6):**
- `void entityDestroyed(IEntity)`
- `void entityMoved(IEntity)`
- `void entityAdded(IEntity)`
- `void entityRemoved(IEntity)`
- `void unitCostumeRefresh(IEntity)`
- `void unitRemoveRendering(IEntity)`

### IUser (interface)
`com.perblue.rpg.game.objects.IUser`

**Fields (4):**
- `public static final int AUTO_REQUESTED = 1`
- `public static final int FF_REQUESTED = 2`
- `public static final int GOOGLE_UPDATED = 1`
- `public static final int IOS_UPDATED = 2`

**Methods (205):**
- `int getShardID()`
- `void setFlag(UserFlag, boolean)`
- `long getCooldownEnd(CooldownType)`
- `int getVIPLevel()`
- `void setCooldownEnd(CooldownType, long)`
- `void decDailyChances(String)`
- `void incDailyUses(String)`
- `void incCount(UserFlag, int)`
- `void incCount(UserFlag)`
- `int getTeamLevel()`
- `int getDailyUses(String)`
- `void setDailyChances(String, int)`
- `AppReviewStatus getAppReviewStatus()`
- `Avatar getAvatar()`
- `IBossPit getBossPit()`
- `int getBossPitStars(UnitType, ModeDifficulty, int)`
- `ICampaignLevelStatus getCampaignLevel(CampaignType, int, int)`
- `Iterable getCampaignLevels(CampaignType, int)`
- `IContestData getContestData(long)`
- `Iterable getCountTypes()`
- `Iterable getDailyUseTypes()`
- `int getExpLootPool()`
- `long getFacebookID()`
- `Iterable getFlagTypes()`
- `long getGuildID()`
- `GuildRole getGuildRole()`
- `HeroLineup getHeroLineup(HeroLineupType)`
- `Iterable getHeroes()`
- `int getIAPPurchases(String)`
- `Map getIAPPurchases()`
- `int getItemAmount(ItemType)`
- `long getLastDailyReset()`
- `long getLastLoginTime()`
- `Map getLootMemory()`
- `float getLootMemoryValue(ItemType)`
- `Iterable getMailMessages()`
- `Iterable getMerchantItems(MerchantType)`
- `int getMonthlySignins()`
- `String getPreviousName()`
- `int getQuestCounter(String)`
- `a getRandom(RandomSeedType)`
- `int getRealVIPLevel()`
- `int getRuneCount()`
- `float getRuneMemoryValue(int, int)`
- `void addRune(IRune)`
- `void addAutoAttackAvailable(GameMode, ModeDifficulty)`
- `void addCampaignDropMultiplier(int, int)`
- `void addItemEventMultiplier(UseItemEventType, Long)`
- `void addQuestCounterIfNotExists(String, int)`
- `void clearUnclaimedArenaDemotion(ArenaType)`
- `Map getActiveDropMultipliers()`
- `int getCampaignDropMultiplier()`
- `int getCampaignMultiplierDropsLeft(int)`
- `Iterable getDailyChanceTypes()`
- `int getEventCompletionCount(long)`
- `void clearMercenaryHero(GameMode)`
- `IHero createHero(UnitType, Rarity, int, int, String[])`
- `int getABGroup(String)`
- `void addABGroup(String, int)`
- `void addEventCompleted(long)`
- `void addHero(IHero)`
- `void addItem(ItemType, int, boolean, boolean, String[])`
- `boolean addPromoCode(String)`
- `void addQuestCounter(String, int)`
- `Map getEventCompletionCountList()`
- `long getEventSigninBonusLastSigninTime(long)`
- `Map getEventSigninBonusLastSigninTimes()`
- `int getEventSigninBonusMonthlySignin(long)`
- `Map getEventSigninBonusMonthlySignins()`
- `int getExpeditionStageCompletionCount(ModeDifficulty, int)`
- `int getGameModeCompetionCount(GameMode, ModeDifficulty)`
- `String getGameModeCompetionCountKey(GameMode, ModeDifficulty)`
- `int getGameModeCompetionCountWithKey(String)`
- `long getItemEventMultiplier(UseItemEventType)`
- `Map getItemEventMultipliers()`
- `long getLastMonthlySigninTime()`
- `long getLastResourceGenerationTime(ResourceType)`
- `int getMercenaryGoldEarned()`
- `long getMerchantAutoRefreshTime(MerchantType)`
- `long getMerchantCooldownEnd(MerchantType)`
- `long getMerchantExpiration(MerchantType)`
- `int getMerchantStaminaMemory(MerchantType)`
- `DailySignInClaimableStatus getPreviousDailySignin(int)`
- `DailySignInClaimableStatus getPreviousEventDailySignin(long, long)`
- `int getQuestCompletionCount(int)`
- `long getQuestLastCompletedTime(int)`
- `long getSpecialEventsLastCheckedTime()`
- `int getTeamLevelAtEventStart(long)`
- `int getUnclaimedArenaDemotionDivision(ArenaType)`
- `ArenaTier getUnclaimedArenaDemotionTier(ArenaType)`
- `boolean hasViewedConsumableItem(ItemType)`
- `boolean hasViewedDailyQuest(Integer)`
- `void increaseExpeditionStageUnlocked(ModeDifficulty, int)`
- `void increaseGameModeCompetionCount(GameMode, ModeDifficulty)`
- `boolean isAutoAttackAvailable(GameMode, ModeDifficulty)`
- `boolean isFastForwardRequested(HeroLineupType)`
- `boolean isMerchantPermUnlocked(MerchantType)`
- `boolean isThirdyPartyQuestUpdated(int, BuildSource)`
- `void markThirdPartyQuestUpdated(int, BuildSource)`
- `void resetPreviousDailySignins()`
- `void resetPreviousEventDailySignins(long)`
- `long getSeed(RandomSeedType)`
- `int getTeamPower()`
- `String getTimeZoneID()`
- `int getTimeZoneOffset()`
- `int getTotalPower()`
- `int getTotalStars()`
- `IUserTutorialAct getTutorialAct(TutorialActType)`
- `IRune giveRune(RuneData, String[])`
- `boolean hasAnyPromoCode()`
- `boolean hasExpeditionData()`
- `boolean hasFlag(UserFlag)`
- `boolean hasMaxStarHeroes()`
- `boolean hasNewSkins()`
- `boolean hasPromoCode(String)`
- `boolean hasQuestCounter(String)`
- `boolean hasSnapshotEvent(long)`
- `void incMonthlySignins()`
- `void incQuestCounter(String)`
- `void incQuestCounter(String, int)`
- `boolean isAutoRequested(HeroLineupType)`
- `boolean isSkinNew(ItemType)`
- `boolean likedHeroWallPost(long, long)`
- `IUserTutorialAct makeNewTutorialAct(TutorialActType)`
- `void markSkinAsNew(ItemType)`
- `void markSkinAsViewed(ItemType)`
- `void recordHeroXPGain(IHero, int, String)`
- `void removeHero(UnitType)`
- `void removeItem(ItemType, int, String[])`
- `void removeQuestCounter(String)`
- `void removeRune(IRune)`
- `void removeTutorial(TutorialActType)`
- `void resetDailyChances(String, int)`
- `void resetDailyUses(String, int)`
- `void resetRandom(RandomSeedType)`
- `void returnRandom(RandomSeedType)`
- `void setAppReviewStatus(AppReviewStatus)`
- `void setAutoRequested(HeroLineupType, boolean)`
- `void setAvatar(Avatar)`
- `void setBossPitStars(UnitType, ModeDifficulty, int, int)`
- `void setDailyUses(String, int)`
- `void setExpLootPool(int)`
- `void setFacebookID(long)`
- `void setGuildID(long)`
- `void setGuildRole(GuildRole)`
- `void setHeroLineup(HeroLineupType, HeroLineup)`
- `void setLastDailyReset(long)`
- `void setMerchantItems(MerchantType, List)`
- `void setMonthlySignins(int)`
- `void setPreviousName(String)`
- `void setQuestCounter(String, int)`
- `void setResource(ResourceType, int, float, String[])`
- `void setResource(ResourceType, int, String[])`
- `void setShardID(int)`
- `void setTeamLevel(int)`
- `void setTeamPower(int)`
- `void setTimeZoneID(String)`
- `void setTimeZoneOffset(int)`
- `void setTotalPower(int)`
- `void setTotalStars(int)`
- `void setVIPLevel(int)`
- `void updateLootMemory(ItemType, float)`
- `void updateRuneMemory(int, int, float)`
- `void setEventSigninBonusLastSigninTime(long, long)`
- `void setEventSigninBonusMonthlySignins(long, int)`
- `void setFastForwardRequested(HeroLineupType, boolean)`
- `void setLastMonthlySigninTime(long)`
- `void setLastResourceGenerationTime(ResourceType, long)`
- `void setLastViewedWarBattle(long)`
- `void setLikedHeroWallPost(long, boolean)`
- `void setMerchantAutoRefreshTime(MerchantType, long)`
- `void setMerchantCooldownEnd(MerchantType, long)`
- `void setMerchantExpiration(MerchantType, long)`
- `void setMerchantPermUnlocked(MerchantType, boolean)`
- `void setMerchantStaminaMemory(MerchantType, int)`
- `void setPreviousDailySignin(int, DailySignInClaimableStatus)`
- `void setPreviousEventDailySignin(long, long, DailySignInClaimableStatus)`
- `void setQuestCompletedCount(int, int)`
- `void setQuestLastCompletedTime(int, long)`
- `void setSpecialEventsLastCheckedTime(long)`
- `void setViewedConsumableItem(ItemType)`
- `void setViewedDailyQuest(int)`
- `void useCampaignMultiplierDrop(int, String, int, int)`
- `int getDailyChances(String)`
- `ArenaTier getUnclaimedArenaPromotionTier(ArenaType)`
- `int getUnclaimedArenaPromotionDivision(ArenaType)`
- `boolean hasClaimedArenaReward(ArenaTier, int, ArenaType)`
- `void clearUnclaimedArenaPromotion(ArenaType)`
- `void setCount(UserFlag, int)`
- `IHero getHero(UnitType)`
- `IRune getRuneByID(long)`
- `Iterable getRunes()`
- `void setSeed(RandomSeedType, long, String)`
- `Iterable getItems()`
- `long getID()`
- `void setLanguage(Language)`
- `long getTime(TimeType)`
- `int getCount(UserFlag)`
- `void setTime(TimeType, long)`
- `void setCreationTime(long)`
- `long getCreationTime()`
- `String getName()`
- `int getResource(ResourceType)`
- `void setName(String)`
- `Language getLanguage()`

### IUserTutorialAct (interface)
`com.perblue.rpg.game.objects.IUserTutorialAct`

**Methods (10):**
- `int getMaxStep()`
- `int getStep()`
- `void setMaxStep(int)`
- `void setShouldUpdate(boolean)`
- `void setStep(int)`
- `void setUserID(long)`
- `void setVersion(int)`
- `void setType(TutorialActType)`
- `int getVersion()`
- `TutorialActType getType()`

### ItemStack (class)
`com.perblue.rpg.game.objects.ItemStack`

**Fields (2):**
- `public ItemType item`
- `public int quantity`

**Methods (6):**
- `Integer getValue()`
- `ItemType getKey()`
- `Integer setValue(Integer)`

### Projectile (class)
`com.perblue.rpg.game.objects.Projectile`
extends `com.perblue.rpg.game.objects.Entity`

**Fields (9):**
- `private ParticleType customParticle`
- `private IDamageProvider damageProvider`
- `private boolean isClearable`
- `private q launchPosition`
- `private q launchTarget`
- `private float pitch`
- `private ItemType skin`
- `private IProjectileEffect source`
- `private ProjectileType type`

**Methods (21):**
- `int getMaxHP()`
- `void setClearable(boolean)`
- `boolean isClearable()`
- `IProjectileEffect getActionSource()`
- `ParticleType getCustomParticle()`
- `IDamageProvider getDamageProvider()`
- `q getLaunchPosition()`
- `q getLaunchTarget()`
- `float getPitch()`
- `ItemType getSkin()`
- `void setCustomParticle(ParticleType)`
- `void setDamageProvider(IDamageProvider)`
- `void setLaunchPosition(q)`
- `void setLaunchTarget(float, float, float)`
- `void setLaunchTarget(q)`
- `void setPitch(float)`
- `void setSkin(ItemType)`
- `void setType(ProjectileType)`
- `void setProjectileEffect(IProjectileEffect)`
- `String toString()`
- `ProjectileType getType()`

### ProjectileType (enum)
`com.perblue.rpg.game.objects.ProjectileType`
extends `java.lang.Enum`

**Fields (212):**
- `private static final ProjectileType[] $VALUES`
- `public static final ProjectileType ANCIENT_DWARF_0`
- `public static final ProjectileType ANCIENT_DWARF_4`
- `public static final ProjectileType ANGELIC_HERALD_0`
- `public static final ProjectileType AQUATIC_1`
- `public static final ProjectileType ARCHER_ARROW`
- `public static final ProjectileType BANSHEE_0`
- `public static final ProjectileType BANSHEE_1`
- `public static final ProjectileType BARDBARIAN_0`
- `public static final ProjectileType BLACK_WING_0`
- `public static final ProjectileType BLACK_WING_1`
- `public static final ProjectileType BONE_DRAGON_0`
- `public static final ProjectileType BONE_DRAGON_1`
- `public static final ProjectileType BONE_DRAGON_2`
- `public static final ProjectileType BOUNCING_LIGHTNING`
- `public static final ProjectileType BRUTE_DRAGON_1`
- `public static final ProjectileType BRUTE_DRAGON_2`
- `public static final ProjectileType CATAPULT_KNIGHT_0`
- `public static final ProjectileType CATAPULT_KNIGHT_1`
- `public static final ProjectileType CATAPULT_KNIGHT_2`
- `public static final ProjectileType CATAPULT_KNIGHT_3`
- `public static final ProjectileType CATAPULT_KNIGHT_VICTORY`
- `public static final ProjectileType CENTAUR_OF_ATTENTION_0`
- `public static final ProjectileType CENTAUR_OF_ATTENTION_1`
- `public static final ProjectileType CENTAUR_OF_ATTENTION_2`
- `public static final ProjectileType CENTAUR_OF_ATTENTION_3`
- `public static final ProjectileType CENTAUR_OF_ATTENTION_6`
- `public static final ProjectileType COSMIC_ELF_0`
- `public static final ProjectileType COSMIC_ELF_3`
- `public static final ProjectileType CRIMSON_WITCH_WRAITH_0`
- `public static final ProjectileType CRIMSON_WITCH_WRAITH_1`
- `public static final ProjectileType CURSED_STATUE_0`
- `public static final ProjectileType CURSED_STATUE_1`
- `public static final ProjectileType CURSED_STATUE_3`
- `public static final ProjectileType CYCLOPS_WIZARD_0`
- `public static final ProjectileType CYCLOPS_WIZARD_1`
- `public static final ProjectileType CYCLOPS_WIZARD_2`
- `public static final ProjectileType CYCLOPS_WIZARD_3`
- `public static final ProjectileType DARK_DRACUL_0`
- `public static final ProjectileType DARK_DRACUL_1`
- `public static final ProjectileType DARK_HERO_1`
- `public static final ProjectileType DARK_HERO_2`
- `public static final ProjectileType DEEP_DRAGON_0`
- `public static final ProjectileType DEEP_DRAGON_3`
- `public static final ProjectileType DEEP_DRAGON_6`
- `public static final ProjectileType DOPPELGANGER_0`
- `public static final ProjectileType DOPPELGANGER_2`
- `public static final ProjectileType DRAGON_LADY_DRAGON`
- `public static final ProjectileType DRAGZILLA_0`
- `public static final ProjectileType DRAGZILLA_2`
- `public static final ProjectileType DRUIDINATRIX_1`
- `public static final ProjectileType DRUIDINATRIX_3`
- `public static final ProjectileType DUNGEON_MAN_0`
- `public static final ProjectileType DUNGEON_MAN_1`
- `public static final ProjectileType DUNGEON_MAN_2`
- `public static final ProjectileType DUST_DEVIL_0`
- `public static final ProjectileType DUST_DEVIL_1`
- `public static final ProjectileType DUST_DEVIL_2`
- `public static final ProjectileType DUST_DEVIL_3`
- `public static final ProjectileType DUST_DEVIL_4`
- `public static final ProjectileType DWARVEN_ARCHER_0`
- `public static final ProjectileType DWARVEN_ARCHER_2`
- `public static final ProjectileType ETERNAL_ENCHANTER_0`
- `public static final ProjectileType ETERNAL_ENCHANTER_2`
- `public static final ProjectileType FAITH_HEALER_BOOK_1`
- `public static final ProjectileType FAITH_HEALER_BOOK_2`
- `public static final ProjectileType FROST_GIANT_0`
- `public static final ProjectileType FROST_GIANT_1`
- `public static final ProjectileType FROST_GIANT_2`
- `public static final ProjectileType GENIE_0`
- `public static final ProjectileType GENIE_1`
- `public static final ProjectileType GENIE_TITAN`
- `public static final ProjectileType GRAND_HUNTRESS_0`
- `public static final ProjectileType GRAND_HUNTRESS_3`
- `public static final ProjectileType GROOVY_DRUID_0`
- `public static final ProjectileType GROOVY_DRUID_1`
- `public static final ProjectileType GROOVY_DRUID_2`
- `public static final ProjectileType KARAOKE_KING_0`
- `public static final ProjectileType KARAOKE_KING_2`
- `public static final ProjectileType LIGHTNING`
- `public static final ProjectileType MAGIC_DRAGON_0`
- `public static final ProjectileType MAGIC_DRAGON_1`
- `public static final ProjectileType MAGIC_DRAGON_2`
- `public static final ProjectileType MAGIC_DRAGON_3`
- `public static final ProjectileType MAGIC_DRAGON_VICTORY`
- `public static final ProjectileType MEDUSA_0`
- `public static final ProjectileType MEDUSA_1`
- `public static final ProjectileType MEDUSA_2`
- `public static final ProjectileType MEDUSA_3`
- `public static final ProjectileType MISTRESS_MANICURE_0`
- `public static final ProjectileType MISTRESS_MANICURE_3`
- `public static final ProjectileType MOON_DRAKE_ENERGY_BLUE`
- `public static final ProjectileType MOON_DRAKE_ENERGY_RED`
- `public static final ProjectileType MOON_DRAKE_LIGHT_BEAM`
- `public static final ProjectileType MYSTIC_WILDLING_0`
- `public static final ProjectileType NONE`
- `public static final ProjectileType NPC_ABYSS_DRAGON_0_0`
- `public static final ProjectileType NPC_ABYSS_DRAGON_0_1`
- `public static final ProjectileType NPC_ABYSS_DRAGON_0_2`
- `public static final ProjectileType NPC_ABYSS_DRAGON_1_0`
- `public static final ProjectileType NPC_ABYSS_DRAGON_1_1`
- `public static final ProjectileType NPC_ABYSS_DRAGON_2_0`
- `public static final ProjectileType NPC_ANUBIS_DRAGON_0`
- `public static final ProjectileType NPC_AOE_MAGIC_CRYSTAL`
- `public static final ProjectileType NPC_AOE_PHYS_CRYSTAL`
- `public static final ProjectileType NPC_BOSS_ANUBIS_DRAGON_0`
- `public static final ProjectileType NPC_CRYSTAL_LIZARD_0`
- `public static final ProjectileType NPC_EVIL_WIZARD_BOMB`
- `public static final ProjectileType NPC_EYEBALL_0`
- `public static final ProjectileType NPC_FIREBALL`
- `public static final ProjectileType NPC_GIANT_PLANT_SPEW_POISON`
- `public static final ProjectileType NPC_GOLD_COLOSSUS_GOLD`
- `public static final ProjectileType NPC_INFERNO_SPIDER_0`
- `public static final ProjectileType NPC_KING_IMP_0`
- `public static final ProjectileType NPC_LYING_LANTERN_1`
- `public static final ProjectileType NPC_MONSTER_PHYS_IMP`
- `public static final ProjectileType NPC_MUSHROOM_0`
- `public static final ProjectileType NPC_PLAGUE_SKULKER_1_RAT1`
- `public static final ProjectileType NPC_PLAGUE_SKULKER_1_RAT2`
- `public static final ProjectileType NPC_PLAGUE_SKULKER_1_RAT3`
- `public static final ProjectileType NPC_SCARECROW_0`
- `public static final ProjectileType NPC_SINISTER_ASSAILANT_1`
- `public static final ProjectileType NPC_SQUID_SQUIRT`
- `public static final ProjectileType NPC_SQUIRREL_0`
- `public static final ProjectileType PCH_ANUBIS_DRAGON_0`
- `public static final ProjectileType PCH_ANUBIS_DRAGON_1`
- `public static final ProjectileType PIRATE_0`
- `public static final ProjectileType PIRATE_1`
- `public static final ProjectileType PIRATE_3`
- `public static final ProjectileType PIRATE_4`
- `public static final ProjectileType PIRATE_5`
- `public static final ProjectileType PLAGUE_ENTREPRENEUR_2`
- `public static final ProjectileType PLANT_SOUL_1`
- `public static final ProjectileType RABID_DRAGON_0`
- `public static final ProjectileType RABID_DRAGON_2`
- `public static final ProjectileType RAGING_REVENANT_0`
- `public static final ProjectileType RAGING_REVENANT_1`
- `public static final ProjectileType RAGING_REVENANT_2`
- `public static final ProjectileType SADISTIC_DANCER_2_1`
- `public static final ProjectileType SADISTIC_DANCER_2_2`
- `public static final ProjectileType SATYR_1`
- `public static final ProjectileType SATYR_2`
- `public static final ProjectileType SHADOW_ASSASSIN_0`
- `public static final ProjectileType SHADOW_ASSASSIN_2`
- `public static final ProjectileType SHADOW_ASSASSIN_3`
- `public static final ProjectileType SKELETON_KING_0`
- `public static final ProjectileType SNAKE_DRAGON_SONIC_WAVE`
- `public static final ProjectileType SNIPER_WOLF_0`
- `public static final ProjectileType SOJOURNER_SORCERESS_0`
- `public static final ProjectileType SOJOURNER_SORCERESS_1`
- `public static final ProjectileType SOJOURNER_SORCERESS_2`
- `public static final ProjectileType SPECTRAL_DRAGON_0`
- `public static final ProjectileType SPECTRAL_DRAGON_1`
- `public static final ProjectileType SPECTRAL_DRAGON_2_0`
- `public static final ProjectileType SPECTRAL_DRAGON_2_0_SKIN_REDDRAGON`
- `public static final ProjectileType SPECTRAL_DRAGON_2_1`
- `public static final ProjectileType SPECTRAL_DRAGON_2_1_SKIN_REDDRAGON`
- `public static final ProjectileType SPECTRAL_DRAGON_2_2`
- `public static final ProjectileType SPECTRAL_DRAGON_2_2_SKIN_REDDRAGON`
- `public static final ProjectileType SPECTRAL_DRAGON_2_3`
- `public static final ProjectileType SPECTRAL_DRAGON_2_3_SKIN_REDDRAGON`
- `public static final ProjectileType SPECTRAL_DRAGON_2_4`
- `public static final ProjectileType SPECTRAL_DRAGON_2_5`
- `public static final ProjectileType SPECTRAL_DRAGON_2_6`
- `public static final ProjectileType SPECTRAL_DRAGON_2_7`
- `public static final ProjectileType SPECTRAL_DRAGON_4`
- `public static final ProjectileType SPIKEY_DRAGON_0_0`
- `public static final ProjectileType SPIKEY_DRAGON_0_1`
- `public static final ProjectileType SPIKEY_DRAGON_0_2`
- `public static final ProjectileType SPIKEY_DRAGON_0_3`
- `public static final ProjectileType SPIKEY_DRAGON_0_4`
- `public static final ProjectileType SPIKEY_DRAGON_1`
- `public static final ProjectileType SPIKEY_DRAGON_2`
- `public static final ProjectileType SPIKEY_DRAGON_3`
- `public static final ProjectileType STEPLADDER_BROTHERS_0`
- `public static final ProjectileType STEPLADDER_BROTHERS_1`
- `public static final ProjectileType STEPLADDER_BROTHERS_4`
- `public static final ProjectileType STORM_DRAGON_0`
- `public static final ProjectileType STORM_DRAGON_1`
- `public static final ProjectileType STORM_DRAGON_3`
- `public static final ProjectileType STOWAWAY_0`
- `public static final ProjectileType STOWAWAY_1`
- `public static final ProjectileType STOWAWAY_4`
- `public static final ProjectileType SUN_SEEKER_1`
- `public static final ProjectileType TOMB_ANGEL_0`
- `public static final ProjectileType TOMB_ANGEL_2`
- `public static final ProjectileType TRIPLE_THREAT_3`
- `public static final ProjectileType UNDERSTUDY_0`
- `public static final ProjectileType UNDERSTUDY_0_BEAM`
- `public static final ProjectileType UNDERSTUDY_1`
- `public static final ProjectileType UNDERSTUDY_1_HAND`
- `public static final ProjectileType UNDERSTUDY_2`
- `public static final ProjectileType UNDERSTUDY_6`
- `public static final ProjectileType UNRIPE_MYTHOLOGY_0`
- `public static final ProjectileType UNRIPE_MYTHOLOGY_1`
- `public static final ProjectileType UNRIPE_MYTHOLOGY_3`
- `public static final ProjectileType VERMILION_PRIESTESS_0`
- `public static final ProjectileType VERMILION_PRIESTESS_1`
- `public static final ProjectileType VOID_WYVERN_0`
- `public static final ProjectileType VOID_WYVERN_2`
- `public static final ProjectileType VOID_WYVERN_3`
- `public static final ProjectileType VULTURE_DRAGON_2`
- `public static final ProjectileType WEE_WITCH_0`
- `public static final ProjectileType WEE_WITCH_1`
- `public static final ProjectileType WEREDRAGON_0`
- `public static final ProjectileType WHITE_TIGRESS_0_0`
- `public static final ProjectileType WHITE_TIGRESS_0_1`
- `public static final ProjectileType WHITE_TIGRESS_0_2`
- `public static final ProjectileType WHITE_TIGRESS_1`
- `public static final ProjectileType WHITE_TIGRESS_3`
- `public static final ProjectileType WILDLING_ARCHER_0`
- `public static final ProjectileType WILDLING_SNIPER_0`

**Methods (2):**
- `ProjectileType[] values()`
- `ProjectileType valueOf(String)`

**Constants (211):**
- NONE
- ARCHER_ARROW
- LIGHTNING
- BOUNCING_LIGHTNING
- CENTAUR_OF_ATTENTION_0
- CENTAUR_OF_ATTENTION_1
- CENTAUR_OF_ATTENTION_2
- CENTAUR_OF_ATTENTION_3
- FAITH_HEALER_BOOK_1
- FAITH_HEALER_BOOK_2
- SNAKE_DRAGON_SONIC_WAVE
- DRAGON_LADY_DRAGON
- NPC_FIREBALL
- NPC_AOE_PHYS_CRYSTAL
- NPC_AOE_MAGIC_CRYSTAL
- NPC_MONSTER_PHYS_IMP
- CRIMSON_WITCH_WRAITH_0
- CRIMSON_WITCH_WRAITH_1
- DUST_DEVIL_0
- DUST_DEVIL_1
- DUST_DEVIL_2
- DUST_DEVIL_3
- DUST_DEVIL_4
- MOON_DRAKE_ENERGY_BLUE
- MOON_DRAKE_LIGHT_BEAM
- MOON_DRAKE_ENERGY_RED
- UNDERSTUDY_0
- UNDERSTUDY_0_BEAM
- UNDERSTUDY_1
- UNDERSTUDY_1_HAND
- UNDERSTUDY_2
- WILDLING_ARCHER_0
- WILDLING_SNIPER_0
- MYSTIC_WILDLING_0
- DARK_DRACUL_0
- DARK_DRACUL_1
- BRUTE_DRAGON_1
- BRUTE_DRAGON_2
- COSMIC_ELF_0
- COSMIC_ELF_3
- CATAPULT_KNIGHT_0
- CATAPULT_KNIGHT_1
- CATAPULT_KNIGHT_2
- CATAPULT_KNIGHT_3
- CATAPULT_KNIGHT_VICTORY
- MEDUSA_0
- MEDUSA_1
- MEDUSA_2
- MEDUSA_3
- AQUATIC_1
- BARDBARIAN_0
- BONE_DRAGON_0
- BONE_DRAGON_1
- BONE_DRAGON_2
- NPC_INFERNO_SPIDER_0
- MAGIC_DRAGON_0
- MAGIC_DRAGON_1
- MAGIC_DRAGON_2
- MAGIC_DRAGON_3
- MAGIC_DRAGON_VICTORY
- SHADOW_ASSASSIN_0
- SHADOW_ASSASSIN_2
- SHADOW_ASSASSIN_3
- GROOVY_DRUID_0
- GROOVY_DRUID_1
- GROOVY_DRUID_2
- NPC_SCARECROW_0
- SPIKEY_DRAGON_0_0
- SPIKEY_DRAGON_0_1
- SPIKEY_DRAGON_0_2
- SPIKEY_DRAGON_0_3
- SPIKEY_DRAGON_0_4
- SPIKEY_DRAGON_1
- SPIKEY_DRAGON_2
- SPIKEY_DRAGON_3
- FROST_GIANT_0
- FROST_GIANT_1
- FROST_GIANT_2
- DRUIDINATRIX_1
- DRUIDINATRIX_3
- NPC_EVIL_WIZARD_BOMB
- DWARVEN_ARCHER_0
- DWARVEN_ARCHER_2
- RABID_DRAGON_0
- RABID_DRAGON_2
- NPC_GOLD_COLOSSUS_GOLD
- NPC_GIANT_PLANT_SPEW_POISON
- NPC_SQUID_SQUIRT
- NPC_MUSHROOM_0
- SATYR_1
- SATYR_2
- STORM_DRAGON_0
- STORM_DRAGON_1
- STORM_DRAGON_3
- SKELETON_KING_0
- GENIE_0
- GENIE_1
- SNIPER_WOLF_0
- DRAGZILLA_0
- DRAGZILLA_2
- PIRATE_0
- PIRATE_1
- PIRATE_3
- PIRATE_4
- PIRATE_5
- CYCLOPS_WIZARD_0
- CYCLOPS_WIZARD_1
- CYCLOPS_WIZARD_2
- CYCLOPS_WIZARD_3
- NPC_EYEBALL_0
- DOPPELGANGER_0
- DOPPELGANGER_2
- NPC_SQUIRREL_0
- DEEP_DRAGON_0
- DEEP_DRAGON_3
- STOWAWAY_0
- STOWAWAY_1
- STOWAWAY_4
- CURSED_STATUE_0
- CURSED_STATUE_1
- CURSED_STATUE_3
- VULTURE_DRAGON_2
- PLANT_SOUL_1
- GENIE_TITAN
- BANSHEE_0
- BANSHEE_1
- RAGING_REVENANT_0
- RAGING_REVENANT_1
- RAGING_REVENANT_2
- SPECTRAL_DRAGON_0
- SPECTRAL_DRAGON_1
- SPECTRAL_DRAGON_2_0
- SPECTRAL_DRAGON_2_1
- SPECTRAL_DRAGON_2_2
- SPECTRAL_DRAGON_2_3
- SPECTRAL_DRAGON_2_4
- SPECTRAL_DRAGON_2_5
- SPECTRAL_DRAGON_2_6
- SPECTRAL_DRAGON_2_7
- SPECTRAL_DRAGON_4
- NPC_LYING_LANTERN_1
- WEREDRAGON_0
- WEE_WITCH_0
- WEE_WITCH_1
- DUNGEON_MAN_0
- DUNGEON_MAN_1
- DUNGEON_MAN_2
- NPC_PLAGUE_SKULKER_1_RAT1
- NPC_PLAGUE_SKULKER_1_RAT2
- NPC_PLAGUE_SKULKER_1_RAT3
- PLAGUE_ENTREPRENEUR_2
- MISTRESS_MANICURE_0
- MISTRESS_MANICURE_3
- VOID_WYVERN_0
- VOID_WYVERN_2
- VOID_WYVERN_3
- TOMB_ANGEL_0
- TOMB_ANGEL_2
- ANGELIC_HERALD_0
- TRIPLE_THREAT_3
- ETERNAL_ENCHANTER_0
- ETERNAL_ENCHANTER_2
- GRAND_HUNTRESS_0
- GRAND_HUNTRESS_3
- SOJOURNER_SORCERESS_0
- SOJOURNER_SORCERESS_1
- SOJOURNER_SORCERESS_2
- KARAOKE_KING_0
- KARAOKE_KING_2
- SUN_SEEKER_1
- STEPLADDER_BROTHERS_0
- STEPLADDER_BROTHERS_1
- STEPLADDER_BROTHERS_4
- NPC_CRYSTAL_LIZARD_0
- BLACK_WING_0
- BLACK_WING_1
- UNRIPE_MYTHOLOGY_0
- UNRIPE_MYTHOLOGY_1
- UNRIPE_MYTHOLOGY_3
- ANCIENT_DWARF_0
- ANCIENT_DWARF_4
- NPC_ANUBIS_DRAGON_0
- SADISTIC_DANCER_2_1
- SADISTIC_DANCER_2_2
- NPC_KING_IMP_0
- WHITE_TIGRESS_0_0
- WHITE_TIGRESS_0_1
- WHITE_TIGRESS_0_2
- WHITE_TIGRESS_1
- WHITE_TIGRESS_3
- CENTAUR_OF_ATTENTION_6
- VERMILION_PRIESTESS_0
- VERMILION_PRIESTESS_1
- NPC_ABYSS_DRAGON_0_0
- NPC_ABYSS_DRAGON_0_1
- NPC_ABYSS_DRAGON_0_2
- NPC_ABYSS_DRAGON_1_0
- NPC_ABYSS_DRAGON_1_1
- NPC_ABYSS_DRAGON_2_0
- NPC_BOSS_ANUBIS_DRAGON_0
- PCH_ANUBIS_DRAGON_0
- PCH_ANUBIS_DRAGON_1
- UNDERSTUDY_6
- DEEP_DRAGON_6
- NPC_SINISTER_ASSAILANT_1
- DARK_HERO_1
- DARK_HERO_2
- SPECTRAL_DRAGON_2_0_SKIN_REDDRAGON
- SPECTRAL_DRAGON_2_1_SKIN_REDDRAGON
- SPECTRAL_DRAGON_2_2_SKIN_REDDRAGON
- SPECTRAL_DRAGON_2_3_SKIN_REDDRAGON

### RaidInstance (class)
`com.perblue.rpg.game.objects.RaidInstance`

**Fields (32):**
- `protected a attackerInfos`
- `protected a attackers`
- `private boolean combatComplete`
- `private Runnable combatCompleteListener`
- `protected a defenders`
- `private a delayedActions`
- `protected a envEntities`
- `private a envEntitiesToAdd`
- `private a envEntitiesToRemove`
- `private EnvironmentType envType`
- `protected EntityGroup externalGroup`
- `protected a extraPreloadedUnits`
- `private EnumSet flags`
- `private boolean isCastingFreeze`
- `private boolean isCastingFreezeLastFrame`
- `private boolean isPVE`
- `protected boolean isUpdatingEntities`
- `protected a listeners`
- `private long nextEntityID`
- `protected int numStages`
- `protected a projectiles`
- `private a projectilesToAdd`
- `private a projectilesToRemove`
- `protected a random`
- `private y sceneInts`
- `private boolean shouldShowVictoryAnimations`
- `protected int stage`
- `protected a stageDefenderInfos`
- `private boolean stageEnded`
- `private a unitsToAdd`
- `private a unitsToRemove`
- `private boolean victory`

**Methods (74):**
- `boolean hasTankAllies(Unit)`
- `boolean isValidUnitsLeft(a, boolean)`
- `void fireEntityAdded(IEntity)`
- `void addExtraPreloadedUnits(UnitType)`
- `void fireEntityRemoved(IEntity)`
- `a getAttackerInfos()`
- `int getWinningTeam()`
- `boolean isAttackersLeft()`
- `boolean isDefendersLeft()`
- `boolean isAttacker(Unit)`
- `boolean isBattleOver()`
- `void refreshUnitCoffin(Unit)`
- `void refreshUnitCostume(Unit)`
- `void setAttackerInfos(a)`
- `void setFlag(SceneFlag, boolean)`
- `void setIsPVE(boolean)`
- `void setNumStages(int)`
- `void fireUnitCostumeRefresh(IEntity)`
- `void fireUnitRemoveRendering(IEntity)`
- `a getExtraPreloadedUnits()`
- `int getNumberOfAttackers(boolean)`
- `a getStageDefenderInfos()`
- `void killRemainingSummons()`
- `void setCombatCompleteListener(Runnable)`
- `void setExtraPreloadedUnits(a)`
- `void setShouldShowVictoryAnimations(boolean)`
- `void setStageDefenderInfos(a)`
- `boolean removeExternalEntity(Entity)`
- `void removeSceneListener(ISceneListener)`
- `boolean shouldShowVictoryAnimations()`
- `EntityFactory getProjectileFactory()`
- `void addProjectile(Projectile)`
- `int getAttackersRemaining(boolean)`
- `int getAttackersRemaining()`
- `int getDefendersRemaining(boolean)`
- `int getDefendersRemaining()`
- `boolean isCastingFreezeLastFrame()`
- `a getOpponentsOfUnit(Unit)`
- `int getStage()`
- `EntityFactory getUnitFactory()`
- `boolean isCombatComplete()`
- `boolean isLastStage()`
- `boolean isStageEnded()`
- `boolean isVictory()`
- `void setCombatComplete(boolean)`
- `void setIsVictory(boolean)`
- `void setSceneInt(SceneInt, int)`
- `void setStageEnded(boolean)`
- `void addEnvEntity(EnvEntity)`
- `void addExternalEntity(Entity)`
- `void addSceneListener(ISceneListener)`
- `void addUnit(Unit)`
- `a getAlliesOfUnit(Unit)`
- `int getNumStages()`
- `a getProjectiles()`
- `void endStage()`
- `int getSceneInt(SceneInt)`
- `void addDelayedAction(Runnable)`
- `boolean isCastingFreeze()`
- `boolean removeUnit(Unit)`
- `boolean removeEnvEntity(EnvEntity)`
- `a getExternalEntities()`
- `boolean isUpdatingEntities()`
- `a getEnvEntities()`
- `a getAttackers()`
- `a getDefenders()`
- `Random getRnd()`
- `boolean isFlagSet(SceneFlag)`
- `EnvironmentType getEnvType()`
- `void setEnvType(EnvironmentType)`
- `void setStage(int)`
- `boolean removeProjectile(Projectile)`
- `void update(long, boolean)`
- `void clear()`

### RuneBonus (class)
`com.perblue.rpg.game.objects.RuneBonus`

**Fields (3):**
- `private RuneBonusType bonusType`
- `private StatType statType`
- `private int subLevel`

**Methods (7):**
- `void setStatType(StatType)`
- `void setBonusType(RuneBonusType)`
- `void setSubLevel(int, String)`
- `int getSubLevel()`
- `RuneBonusType getBonusType()`
- `StatType getStatType()`
- `String toString()`

### RuneEventType (enum)
`com.perblue.rpg.game.objects.RuneEventType`
extends `java.lang.Enum`

**Fields (11):**
- `private static final RuneEventType[] $VALUES`
- `public static final RuneEventType ADDED_SOULSTONE`
- `public static final RuneEventType ATTACHED`
- `public static final RuneEventType DEBUG_GIVE_RUNE`
- `public static final RuneEventType DESTROYED`
- `public static final RuneEventType EMPOWER_FAILED`
- `public static final RuneEventType EMPOWER_SUCCESS`
- `public static final RuneEventType FUSION_DESTROYED`
- `public static final RuneEventType FUSION_IMPROVED`
- `public static final RuneEventType REMOVED`
- `public static final RuneEventType SOLD`

**Methods (2):**
- `RuneEventType[] values()`
- `RuneEventType valueOf(String)`

**Constants (10):**
- ATTACHED
- REMOVED
- SOLD
- ADDED_SOULSTONE
- EMPOWER_SUCCESS
- EMPOWER_FAILED
- DEBUG_GIVE_RUNE
- FUSION_DESTROYED
- FUSION_IMPROVED
- DESTROYED

### SceneFlag (enum)
`com.perblue.rpg.game.objects.SceneFlag`
extends `java.lang.Enum`

**Fields (8):**
- `private static final SceneFlag[] $VALUES`
- `public static final SceneFlag ATTACKERS_ACTIVES_FREEZE`
- `public static final SceneFlag DEFENDERS_ACTIVES_FREEZE`
- `public static final SceneFlag DEFENDERS_GREEN_EYES`
- `public static final SceneFlag DONT_FADE_ON_REMOVE`
- `public static final SceneFlag DONT_SKEW_WORLD`
- `public static final SceneFlag ONLY_IDLE_AI`
- `public static final SceneFlag TEMPLE_SHADOW`

**Methods (2):**
- `SceneFlag[] values()`
- `SceneFlag valueOf(String)`

**Constants (7):**
- DEFENDERS_GREEN_EYES
- DEFENDERS_ACTIVES_FREEZE
- ATTACKERS_ACTIVES_FREEZE
- TEMPLE_SHADOW
- ONLY_IDLE_AI
- DONT_FADE_ON_REMOVE
- DONT_SKEW_WORLD

### SceneInt (enum)
`com.perblue.rpg.game.objects.SceneInt`
extends `java.lang.Enum`

**Fields (3):**
- `private static final SceneInt[] $VALUES`
- `public static final SceneInt BOSS_STAGE`
- `private final int defaultValue`

**Methods (3):**
- `SceneInt[] values()`
- `SceneInt valueOf(String)`
- `int getDefaultValue()`

**Constants (1):**
- BOSS_STAGE

### TitanBuffUnitData (class)
`com.perblue.rpg.game.objects.TitanBuffUnitData`
extends `com.perblue.rpg.game.objects.UnitData`

**Fields (1):**
- `private UnitType titanType`

**Methods (4):**
- `UnitType getTitanType()`
- `void setTitanType(UnitType)`
- `boolean equals(Object)`
- `int hashCode()`

### Unit (class)
`com.perblue.rpg.game.objects.Unit`
extends `com.perblue.rpg.game.objects.Entity`

**Fields (23):**
- `private static final Log LOG`
- `private static final long NO_TIME_OF_DEATH = -1`
- `private static final Comparator SKILL_COMPARATOR`
- `private int cachedPower`
- `private x cachedStats`
- `private boolean canBeRevived`
- `private CoffinState coffinState`
- `private a combatSkills`
- `private UnitType costume`
- `private UnitData data`
- `private q doorScissorPosition`
- `private boolean instantKill`
- `private boolean isCoffin`
- `private boolean isMoving`
- `private a lootItems`
- `private a queuedActions`
- `private UnitRenderable renderable`
- `private ShadowData shadowData`
- `private boolean shouldGiveGold`
- `private boolean showVictory`
- `private long skillsCooldown`
- `private float speedMultiplier`
- `private long timeOfDeath`

**Methods (74):**
- `boolean showVictory()`
- `void addSecondaryStats(x, StatType, float)`
- `void addCombatSkill(CombatSkill)`
- `void addLootItem(RewardDrop)`
- `void addQueuedSkill(CombatRenderSkill)`
- `void cancelSkills()`
- `void clearCombatSkills()`
- `void clearProjectiles()`
- `void endStage()`
- `CombatSkill getCombatSkill(SkillType)`
- `float getStat(StatType)`
- `CoffinState getCoffinState()`
- `a getCombatSkills()`
- `UnitType getCostume()`
- `float getDeathFadeLength()`
- `float getHPPercent()`
- `Iterable getLoot()`
- `int getPower()`
- `CombatSkill getQueuedSkill()`
- `boolean isKill()`
- `UnitRenderable getRenderable()`
- `SectionType getSectionType()`
- `ShadowData getShadowData()`
- `long getSkillsCooldown()`
- `long getTimeOfDeath()`
- `CombatSkill getActiveCombatSkill()`
- `q getDoorScissorPosition()`
- `void setDoorScissorPosition(q)`
- `boolean hasTag(HeroTag)`
- `void initEnergy(float)`
- `boolean isAttacking()`
- `void updateCachedStats()`
- `void removeCombatSkill(SkillType)`
- `void runSkillsOnDeath()`
- `void setCanBeRevived(boolean)`
- `void setCoffinState(CoffinState)`
- `void setCostume(UnitType)`
- `void setData(UnitData)`
- `void setIsCoffin(boolean)`
- `void setMoving(boolean)`
- `void setQueuedSkill(SkillType)`
- `void setQueuedSkill(SkillType, boolean)`
- `void setRenderable(UnitRenderable)`
- `void setShadowData(ShadowData)`
- `void setShouldGiveGold(boolean)`
- `void setShowVictory(boolean)`
- `void setSkillsCooldown(long)`
- `void setSpeedMultiplier(float)`
- `void setupQueuedSkills()`
- `void unitDeath()`
- `void unitRevive()`
- `boolean addBuff(IBuff, Entity)`
- `int getMaxHP()`
- `void setEnergy(float)`
- `float getAnimateSpeedMultiplier()`
- `void dispose()`
- `boolean hasSpecialDeath()`
- `boolean isWearingCostume()`
- `void onBuffsDirty()`
- `void onDeath()`
- `void updateAfterActions(long, boolean)`
- `float getMoveSpeed()`
- `boolean shouldGiveGold()`
- `boolean canBeRevived()`
- `boolean isCoffin()`
- `boolean isMoving()`
- `UnitData getData()`
- `String toString()`
- `Unit getParent()`

### UnitData (class)
`com.perblue.rpg.game.objects.UnitData`

**Fields (23):**
- `private Set availableSkills`
- `private int bossBattleStageUnitId`
- `private int cachedPower`
- `private x cachedStats`
- `private DamageTypeData damageTypeData`
- `private int exp`
- `private float hpMultiplier`
- `private int id`
- `private boolean initialized`
- `private boolean isBoss`
- `private Map items`
- `private boolean legendary`
- `private int level`
- `private boolean mercenary`
- `private Map modePersistentData`
- `private Rarity rarity`
- `private Collection rewardDrops`
- `private Map runes`
- `private float scale`
- `private Map skills`
- `private ItemType skinType`
- `private int stars`
- `private UnitType type`

**Methods (69):**
- `int getStars()`
- `Rarity getRarity()`
- `void clearModePersistentData(GameMode)`
- `boolean isMercenary()`
- `void setEXP(int)`
- `void setItem(HeroEquipSlot, ClientEquippedItem)`
- `void setItem(HeroEquipSlot, ItemType)`
- `void setLegendary(boolean)`
- `void setLevel(int)`
- `void setMercenary(boolean)`
- `void setRarity(Rarity)`
- `void setRune(RuneEquipSlot, IRune)`
- `void setSkillLevel(SkillType, int)`
- `void setSkinType(ItemType)`
- `void setStars(int)`
- `ItemType getSkinType()`
- `float getStat(StatType)`
- `Collection getLoot()`
- `int getPower()`
- `SectionType getSectionType()`
- `void updateCachedStats()`
- `int getLevel()`
- `int getSkillLevel(SkillType)`
- `IRune getRune(RuneEquipSlot)`
- `IRune getRuneByID(long)`
- `boolean isBoss()`
- `int getBossBattleStageUnitId()`
- `Map getModePersistentData()`
- `HeroBattleData getOrCreateModePersistentData(GameMode)`
- `void setBossBattleStageUnitId(int)`
- `void setModePersistentData(Map)`
- `void addRewardDrop(RewardDrop)`
- `boolean canEquipItem(ItemType)`
- `UnitData deepCopy()`
- `void setDamageTypeData(DamageTypeData)`
- `Set getAvailableSkills()`
- `DamageTypeData getDamageTypeData()`
- `Map getEquippedItems()`
- `float getHPMultiplier()`
- `Collection getSkillTypes()`
- `boolean isPlayerUnit()`
- `void setHPMultiplier(float)`
- `void setIsBoss(boolean)`
- `UnitData simpleCopy()`
- `float getScale()`
- `int getEnergy(GameMode)`
- `int getHP(GameMode)`
- `void setEnergy(GameMode, int)`
- `void setHP(GameMode, int)`
- `void setID(int)`
- `void setInitialized(boolean)`
- `void setScale(float)`
- `void setType(UnitType)`
- `Iterable getRunes()`
- `Iterable getSkills()`
- `int getEXP()`
- `boolean isLegendary()`
- `ClientEquippedItem getItem(HeroEquipSlot)`
- `Iterable getItems()`
- `int getID()`
- `void setExtra(GameMode, HeroBattleDataExtraType, String)`
- `String getExtra(GameMode, HeroBattleDataExtraType)`
- `String getDisplayName()`
- `boolean equals(Object)`
- `String toString()`
- `int hashCode()`
- `UnitType getType()`

### UnitDataExtended (class)
`com.perblue.rpg.game.objects.UnitDataExtended`
extends `com.perblue.rpg.game.objects.UnitData`

**Fields (1):**
- `public z stats`

### User (class)
`com.perblue.rpg.game.objects.User`

**Fields (33):**
- `static final boolean $assertionsDisabled = true`
- `private ClientBossPit bossPit`
- `private p completedQuests`
- `private Map contestData`
- `private Map counts`
- `private long creationDate`
- `private String creationDateServerTxt`
- `private int diamonds`
- `private UserExtra extra`
- `private long facebookID`
- `private Set flags`
- `private long guildID`
- `private GuildRole guildRole`
- `private z heroes`
- `private boolean initialized`
- `private long lastLogin`
- `private Map levelsByChapter`
- `private Map levelsByKey`
- `private List lootMemoryChanges`
- `private a mailMessages`
- `private Map merchantData`
- `private Map merchantItems`
- `private Map randoms`
- `private a runes`
- `private int shardID`
- `private int teamLevel`
- `private int teamPower`
- `private int totalPower`
- `private int totalStars`
- `private Map tutorialActs`
- `private long userID`
- `private String userName`
- `private int vipLevel`

**Methods (245):**
- `int getShardID()`
- `int getResourceAmount(ResourceType)`
- `void onQuestProgress(String)`
- `void setCounts(Map)`
- `void setFlags(Map)`
- `void setMerchantData(Map)`
- `void addMailMessage(ClientMailMessage)`
- `void addTutorialAct(UserTutorialAct)`
- `boolean checkResourceLevel(ResourceType, int)`
- `boolean canPreTriggerActiveSkills()`
- `List getAndClearLootMemoryChanges()`
- `int getBlockedSortIndex(long)`
- `String getCreationDateServerTxt()`
- `List getHeroLineupSummary(HeroLineupType)`
- `void setCampaignLevelStatuses(List)`
- `void deleteMailMessage(IMailMessage)`
- `MercenaryHeroData getHiredMercenary(GameMode)`
- `long getPersonalMessageHideTime(long)`
- `Map getPersonalMessageHideTime()`
- `boolean getPersonalMessageHideTimeExists(long)`
- `void setCreationDateServerTxt(String)`
- `void setPersonalMessageHideTime(long, long)`
- `long getUserID()`
- `void initMerchantData(MerchantType, MerchantData)`
- `void setContestData(Map)`
- `void setHiredMercenary(GameMode, MercenaryHeroData)`
- `void setLastLoginTime(long)`
- `void setMailMessages(Iterable)`
- `void setUserID(long)`
- `void setFlag(UserFlag, boolean)`
- `long getCooldownEnd(CooldownType)`
- `int getVIPLevel()`
- `void setCooldownEnd(CooldownType, long)`
- `void decDailyChances(String)`
- `void incDailyUses(String)`
- `void incCount(UserFlag)`
- `void incCount(UserFlag, int)`
- `int getTeamLevel()`
- `int getDailyUses(String)`
- `int getMaxDailyChances(String)`
- `void setDailyChances(String, int)`
- `AppReviewStatus getAppReviewStatus()`
- `Avatar getAvatar()`
- `IBossPit getBossPit()`
- `int getBossPitStars(UnitType, ModeDifficulty, int)`
- `ClientCampaignLevelStatus getCampaignLevel(CampaignType, int, int)`
- `a getCampaignLevels(CampaignType, int)`
- `Map getContestData()`
- `ClientContestData getContestData(long)`
- `Iterable getCountTypes()`
- `Iterable getDailyUseTypes()`
- `int getExpLootPool()`
- `long getFacebookID()`
- `Iterable getFlagTypes()`
- `long getGuildID()`
- `GuildRole getGuildRole()`
- `HeroLineup getHeroLineup(HeroLineupType)`
- `Iterable getHeroes()`
- `int getIAPPurchases(String)`
- `Map getIAPPurchases()`
- `int getItemAmount(ItemType)`
- `long getLastDailyReset()`
- `long getLastLoginTime()`
- `Map getLootMemory()`
- `float getLootMemoryValue(ItemType)`
- `Iterable getMailMessages()`
- `Iterable getMerchantItems(MerchantType)`
- `int getMonthlySignins()`
- `String getPreviousName()`
- `int getQuestCounter(String)`
- `a getRandom(RandomSeedType)`
- `int getRealVIPLevel()`
- `int getRuneCount()`
- `float getRuneMemoryValue(int, int)`
- `void addRune(IRune)`
- `void addAutoAttackAvailable(GameMode, ModeDifficulty)`
- `void addCampaignDropMultiplier(int, int)`
- `void addItemEventMultiplier(UseItemEventType, Long)`
- `void addQuestCounterIfNotExists(String, int)`
- `void clearUnclaimedArenaDemotion(ArenaType)`
- `Map getActiveDropMultipliers()`
- `int getCampaignDropMultiplier()`
- `int getCampaignMultiplierDropsLeft(int)`
- `Iterable getDailyChanceTypes()`
- `int getEventCompletionCount(long)`
- `void clearMercenaryHero(GameMode)`
- `UnitData createHero(UnitType, Rarity, int, int, String[])`
- `int getABGroup(String)`
- `void addABGroup(String, int)`
- `void addEventCompleted(long)`
- `void addHero(UnitData)`
- `void addItem(ItemType, int, boolean, boolean, String[])`
- `boolean addPromoCode(String)`
- `void addQuestCounter(String, int)`
- `Map getEventCompletionCountList()`
- `long getEventSigninBonusLastSigninTime(long)`
- `Map getEventSigninBonusLastSigninTimes()`
- `int getEventSigninBonusMonthlySignin(long)`
- `Map getEventSigninBonusMonthlySignins()`
- `int getExpeditionStageCompletionCount(ModeDifficulty, int)`
- `int getGameModeCompetionCount(GameMode, ModeDifficulty)`
- `String getGameModeCompetionCountKey(GameMode, ModeDifficulty)`
- `int getGameModeCompetionCountWithKey(String)`
- `long getItemEventMultiplier(UseItemEventType)`
- `Map getItemEventMultipliers()`
- `long getLastMonthlySigninTime()`
- `long getLastResourceGenerationTime(ResourceType)`
- `int getMercenaryGoldEarned()`
- `long getMerchantAutoRefreshTime(MerchantType)`
- `long getMerchantCooldownEnd(MerchantType)`
- `long getMerchantExpiration(MerchantType)`
- `int getMerchantStaminaMemory(MerchantType)`
- `DailySignInClaimableStatus getPreviousDailySignin(int)`
- `DailySignInClaimableStatus getPreviousEventDailySignin(long, long)`
- `int getQuestCompletionCount(int)`
- `long getQuestLastCompletedTime(int)`
- `long getSpecialEventsLastCheckedTime()`
- `int getTeamLevelAtEventStart(long)`
- `int getUnclaimedArenaDemotionDivision(ArenaType)`
- `ArenaTier getUnclaimedArenaDemotionTier(ArenaType)`
- `boolean hasViewedConsumableItem(ItemType)`
- `boolean hasViewedDailyQuest(Integer)`
- `void increaseExpeditionStageUnlocked(ModeDifficulty, int)`
- `void increaseGameModeCompetionCount(GameMode, ModeDifficulty)`
- `boolean isAutoAttackAvailable(GameMode, ModeDifficulty)`
- `boolean isFastForwardRequested(HeroLineupType)`
- `boolean isMerchantPermUnlocked(MerchantType)`
- `boolean isThirdyPartyQuestUpdated(int, BuildSource)`
- `void markThirdPartyQuestUpdated(int, BuildSource)`
- `void resetPreviousDailySignins()`
- `void resetPreviousEventDailySignins(long)`
- `long getSeed(RandomSeedType)`
- `int getTeamPower()`
- `String getTimeZoneID()`
- `int getTimeZoneOffset()`
- `int getTotalPower()`
- `int getTotalStars()`
- `IUserTutorialAct getTutorialAct(TutorialActType)`
- `IRune giveRune(RuneData, String[])`
- `boolean hasAnyPromoCode()`
- `boolean hasExpeditionData()`
- `boolean hasFlag(UserFlag)`
- `boolean hasMaxStarHeroes()`
- `boolean hasNewSkins()`
- `boolean hasPromoCode(String)`
- `boolean hasQuestCounter(String)`
- `boolean hasSnapshotEvent(long)`
- `void incMonthlySignins()`
- `void incQuestCounter(String, int)`
- `void incQuestCounter(String)`
- `boolean isAutoRequested(HeroLineupType)`
- `boolean isSkinNew(ItemType)`
- `boolean likedHeroWallPost(long, long)`
- `IUserTutorialAct makeNewTutorialAct(TutorialActType)`
- `void markSkinAsNew(ItemType)`
- `void markSkinAsViewed(ItemType)`
- `void recordHeroXPGain(UnitData, int, String)`
- `void removeHero(UnitType)`
- `void removeItem(ItemType, int, String[])`
- `void removeQuestCounter(String)`
- `void removeRune(IRune)`
- `void removeTutorial(TutorialActType)`
- `void resetDailyChances(String, int)`
- `void resetDailyUses(String, int)`
- `void resetRandom(RandomSeedType)`
- `void returnRandom(RandomSeedType)`
- `void setAppReviewStatus(AppReviewStatus)`
- `void setAutoRequested(HeroLineupType, boolean)`
- `void setAvatar(Avatar)`
- `void setBossPitStars(UnitType, ModeDifficulty, int, int)`
- `void setDailyUses(String, int)`
- `void setExpLootPool(int)`
- `void setFacebookID(long)`
- `void setGuildID(long)`
- `void setGuildRole(GuildRole)`
- `void setHeroLineup(HeroLineupType, HeroLineup)`
- `void setLastDailyReset(long)`
- `void setMerchantItems(MerchantType, List)`
- `void setMonthlySignins(int)`
- `void setPreviousName(String)`
- `void setQuestCounter(String, int)`
- `void setResource(ResourceType, int, float, String[])`
- `void setResource(ResourceType, int, String[])`
- `void setShardID(int)`
- `void setTeamLevel(int)`
- `void setTeamPower(int)`
- `void setTimeZoneID(String)`
- `void setTimeZoneOffset(int)`
- `void setTotalPower(int)`
- `void setTotalStars(int)`
- `void setVIPLevel(int)`
- `void updateLootMemory(ItemType, float)`
- `void updateRuneMemory(int, int, float)`
- `void setEventSigninBonusLastSigninTime(long, long)`
- `void setEventSigninBonusMonthlySignins(long, int)`
- `void setFastForwardRequested(HeroLineupType, boolean)`
- `void setLastMonthlySigninTime(long)`
- `void setLastResourceGenerationTime(ResourceType, long)`
- `void setLastViewedWarBattle(long)`
- `void setLikedHeroWallPost(long, boolean)`
- `void setMerchantAutoRefreshTime(MerchantType, long)`
- `void setMerchantCooldownEnd(MerchantType, long)`
- `void setMerchantExpiration(MerchantType, long)`
- `void setMerchantPermUnlocked(MerchantType, boolean)`
- `void setMerchantStaminaMemory(MerchantType, int)`
- `void setPreviousDailySignin(int, DailySignInClaimableStatus)`
- `void setPreviousEventDailySignin(long, long, DailySignInClaimableStatus)`
- `void setQuestCompletedCount(int, int)`
- `void setQuestLastCompletedTime(int, long)`
- `void setSpecialEventsLastCheckedTime(long)`
- `void setViewedConsumableItem(ItemType)`
- `void setViewedDailyQuest(int)`
- `void useCampaignMultiplierDrop(int, String, int, int)`
- `int getDailyChances(String)`
- `ArenaTier getUnclaimedArenaPromotionTier(ArenaType)`
- `int getUnclaimedArenaPromotionDivision(ArenaType)`
- `boolean hasClaimedArenaReward(ArenaTier, int, ArenaType)`
- `void clearUnclaimedArenaPromotion(ArenaType)`
- `void setCount(UserFlag, int)`
- `UnitData getHero(UnitType)`
- `IRune getRuneByID(long)`
- `void setInitialized(boolean)`
- `Iterable getRunes()`
- `void setSeed(RandomSeedType, long, String)`
- `Iterable getItems()`
- `long getID()`
- `void setLanguage(Language)`
- `long getTime(TimeType)`
- `int getCount(UserFlag)`
- `void setTime(TimeType, long)`
- `void setCreationTime(long)`
- `long getCreationTime()`
- `void setExtra(UserExtra, String)`
- `UserExtra getExtra()`
- `String getName()`
- `int getResource(ResourceType)`
- `void setName(String)`
- `Language getLanguage()`

### UserFlag (enum)
`com.perblue.rpg.game.objects.UserFlag`
extends `java.lang.Enum`

**Fields (81):**
- `private static final UserFlag[] $VALUES`
- `public static final UserFlag AB_VIP5_FREE_CONSUMABLE_SHOULD_BE_GIVEN`
- `public static final UserFlag BETA_0_2`
- `public static final UserFlag BETA_0_3`
- `public static final UserFlag BOSS_BATTLE_COUNT`
- `public static final UserFlag BOSS_PIT_BATTLE_COUNT`
- `public static final UserFlag CAMPAIGN_BATTLES_DONE`
- `public static final UserFlag CAMPAIGN_KILLS`
- `public static final UserFlag CAMPAIGN_UNLOCKED`
- `public static final UserFlag CHATS`
- `public static final UserFlag CHAT_APP_REWARD_SENT`
- `public static final UserFlag COLISEUM_BATTLE_COUNT`
- `public static final UserFlag COLISEUM_RUNS`
- `public static final UserFlag COLISEUM_VICTORIES`
- `public static final UserFlag COMMUNITY_BUTTON_SHOWN_NAME_CHANGE_PROMPT`
- `public static final UserFlag CONTEST_PARTICIPATION_COUNT`
- `public static final UserFlag CRYPT_BATTLE_COUNT`
- `public static final UserFlag CRYPT_OPPONENTS_DEFEAT_COUNT`
- `public static final UserFlag CRYPT_OPPONENT_HEROES_DEFEAT_COUNT`
- `public static final UserFlag CRYPT_RAID_WIN_COUNT`
- `public static final UserFlag ELITE_CAMPAIGN_BATTLES_DONE`
- `public static final UserFlag EVENTS_WINDOW_ON_MAINSCREEN`
- `public static final UserFlag EVENT_10_CHEST_ROLLS`
- `public static final UserFlag EVENT_CHEST_ROLLS`
- `public static final UserFlag EXPEDITION_BATTLE_COUNT`
- `public static final UserFlag EXPEDITION_MAX_DIFFICULTY`
- `public static final UserFlag EXPERT_CAMPAIGN_BATTLES_DONE`
- `public static final UserFlag FACEBOOK_LIKED`
- `public static final UserFlag FAILED_AN_EMPOWER`
- `public static final UserFlag FIGHT_PIT_BATTLE_COUNT`
- `public static final UserFlag FIGHT_PIT_VICTORIES`
- `public static final UserFlag FREE_GOLD_CHEST_ROLLS`
- `public static final UserFlag FREE_NAME_CHANGE`
- `public static final UserFlag FREE_ORANGE_CHEST_ROLLS`
- `public static final UserFlag FREE_PURPLE_CHEST_ROLLS`
- `public static final UserFlag FREE_TIME_ZONE_RESET`
- `public static final UserFlag GOLD_10_CHEST_ROLLS`
- `public static final UserFlag GOLD_CHEST_ROLLS`
- `public static final UserFlag GOT_TUTORIAL_RUNE`
- `public static final UserFlag GOT_TUTORIAL_RUNE_OFFERING`
- `public static final UserFlag HAS_NEW_MAINSCREEN_CONTEST_PROGRESS`
- `public static final UserFlag HAS_SEEN_CONTEST_START`
- `public static final UserFlag HAS_SKIN_FOR_TUTORIAL`
- `public static final UserFlag HOW_TO_PLAY_EXPEDITION`
- `public static final UserFlag HOW_TO_PLAY_VIP`
- `public static final UserFlag IN_LAPSED_CATCH_UP_PERIOD`
- `public static final UserFlag IS_RUNE_TOGGLE_ON`
- `public static final UserFlag L15_RUNES_CREATED`
- `public static final UserFlag LAST_CRYPT_SCORE`
- `public static final UserFlag MERCENARY_GOLD`
- `public static final UserFlag MONTHLY_DIAMOND_DAYS`
- `public static final UserFlag MONTHLY_PURCHASE`
- `public static final UserFlag NEW_CHEST_SEEDS`
- `public static final UserFlag NOT_FIRST_ACCOUNT`
- `public static final UserFlag NO_LOOT_LAST_BATTLE`
- `public static final UserFlag OPTED_OUT_OF_WAR`
- `public static final UserFlag ORANGE_10_CHEST_ROLLS`
- `public static final UserFlag ORANGE_CHEST_ROLLS`
- `public static final UserFlag PAID_SOUL_CHEST_ROLLS`
- `public static final UserFlag PROMO_CODE_ATTEMPTS`
- `public static final UserFlag PURPLE_10_CHEST_ROLLS`
- `public static final UserFlag PURPLE_CHEST_ROLLS`
- `public static final UserFlag REPLAYKIT_COUNT`
- `public static final UserFlag SILVER_10_CHEST_ROLLS`
- `public static final UserFlag SILVER_CHEST_ROLLS`
- `public static final UserFlag SOUL_CHEST_ROLLS`
- `public static final UserFlag TEMPLE_INVITES`
- `public static final UserFlag TEMPLE_STAMINA_MEMORY`
- `public static final UserFlag TEMPLE_WIN_COUNT`
- `public static final UserFlag TEMPLE_WIN_STREAK`
- `public static final UserFlag TEMPROARY_VIP_LEVEL`
- `public static final UserFlag TITANS_KILLED`
- `public static final UserFlag TUTORIAL_RIGGED_RUNE_SHRINE`
- `public static final UserFlag UNLOCKED_HARD_EXPEDITION`
- `public static final UserFlag VIEWED_BATTLE_STATS`
- `public static final UserFlag VIEWED_CRYPT_RESULTS`
- `public static final UserFlag VIEWED_LAST_CHANCE_PROMO_WINDOW`
- `public static final UserFlag VIEWED_SOULMART_INFO`
- `public static final UserFlag VIP_TICKET_FIXED`
- `public static final UserFlag WAR_ATTACK_ATTEMPTS`
- `public static final UserFlag WW_1_0`

**Methods (3):**
- `boolean isAvailable(ContentUpdate)`
- `UserFlag[] values()`
- `UserFlag valueOf(String)`

**Constants (80):**
- SILVER_CHEST_ROLLS
- GOLD_CHEST_ROLLS
- SOUL_CHEST_ROLLS
- PURPLE_CHEST_ROLLS
- ORANGE_CHEST_ROLLS
- CAMPAIGN_BATTLES_DONE
- ELITE_CAMPAIGN_BATTLES_DONE
- CAMPAIGN_UNLOCKED
- MONTHLY_DIAMOND_DAYS
- FREE_NAME_CHANGE
- FIGHT_PIT_VICTORIES
- CAMPAIGN_KILLS
- MERCENARY_GOLD
- BETA_0_2
- NO_LOOT_LAST_BATTLE
- BETA_0_3
- WW_1_0
- SILVER_10_CHEST_ROLLS
- GOLD_10_CHEST_ROLLS
- PURPLE_10_CHEST_ROLLS
- ORANGE_10_CHEST_ROLLS
- CHATS
- LAST_CRYPT_SCORE
- EVENT_CHEST_ROLLS
- EVENT_10_CHEST_ROLLS
- COLISEUM_RUNS
- COLISEUM_VICTORIES
- FREE_TIME_ZONE_RESET
- UNLOCKED_HARD_EXPEDITION
- FACEBOOK_LIKED
- HOW_TO_PLAY_EXPEDITION
- HOW_TO_PLAY_VIP
- VIEWED_CRYPT_RESULTS
- TITANS_KILLED
- TEMPLE_INVITES
- TEMPLE_STAMINA_MEMORY
- TEMPLE_WIN_STREAK
- NEW_CHEST_SEEDS
- REPLAYKIT_COUNT
- NOT_FIRST_ACCOUNT
- PROMO_CODE_ATTEMPTS
- VIEWED_LAST_CHANCE_PROMO_WINDOW
- PAID_SOUL_CHEST_ROLLS
- VIEWED_SOULMART_INFO
- FREE_GOLD_CHEST_ROLLS
- FREE_PURPLE_CHEST_ROLLS
- FREE_ORANGE_CHEST_ROLLS
- TEMPROARY_VIP_LEVEL
- VIEWED_BATTLE_STATS
- L15_RUNES_CREATED
- GOT_TUTORIAL_RUNE
- OPTED_OUT_OF_WAR
- WAR_ATTACK_ATTEMPTS
- GOT_TUTORIAL_RUNE_OFFERING
- TUTORIAL_RIGGED_RUNE_SHRINE
- FAILED_AN_EMPOWER
- MONTHLY_PURCHASE
- HAS_SEEN_CONTEST_START
- HAS_NEW_MAINSCREEN_CONTEST_PROGRESS
- IS_RUNE_TOGGLE_ON
- CHAT_APP_REWARD_SENT
- IN_LAPSED_CATCH_UP_PERIOD
- COMMUNITY_BUTTON_SHOWN_NAME_CHANGE_PROMPT
- EVENTS_WINDOW_ON_MAINSCREEN
- HAS_SKIN_FOR_TUTORIAL
- AB_VIP5_FREE_CONSUMABLE_SHOULD_BE_GIVEN
- EXPEDITION_MAX_DIFFICULTY
- VIP_TICKET_FIXED
- FIGHT_PIT_BATTLE_COUNT
- COLISEUM_BATTLE_COUNT
- CRYPT_BATTLE_COUNT
- CRYPT_RAID_WIN_COUNT
- CRYPT_OPPONENTS_DEFEAT_COUNT
- CRYPT_OPPONENT_HEROES_DEFEAT_COUNT
- EXPEDITION_BATTLE_COUNT
- BOSS_PIT_BATTLE_COUNT
- TEMPLE_WIN_COUNT
- CONTEST_PARTICIPATION_COUNT
- BOSS_BATTLE_COUNT
- EXPERT_CAMPAIGN_BATTLES_DONE

### UserProperty (enum)
`com.perblue.rpg.game.objects.UserProperty`
extends `java.lang.Enum`

**Fields (26):**
- `private static final UserProperty[] $VALUES`
- `public static final UserProperty AVATAR`
- `public static final UserProperty BAZAAR_TOKENS`
- `public static final UserProperty COLISEUM_TOKENS`
- `public static final UserProperty DIAMONDS`
- `public static final UserProperty EXPEDITION_TOKENS`
- `public static final UserProperty FIGHT_TOKENS`
- `public static final UserProperty GOLD`
- `public static final UserProperty GUILD`
- `public static final UserProperty GUILD_TOKENS`
- `public static final UserProperty GUILD_WAR_TOKENS`
- `public static final UserProperty HEROES`
- `public static final UserProperty ITEMS`
- `public static final UserProperty LANGUAGE`
- `public static final UserProperty MAILBOX`
- `public static final UserProperty MONTHLY_CARD`
- `public static final UserProperty NAME`
- `public static final UserProperty QUEST_PROGRESS`
- `public static final UserProperty RUNICITE`
- `public static final UserProperty SIGNIN`
- `public static final UserProperty SOULMART_TOKENS`
- `public static final UserProperty STAMINA`
- `public static final UserProperty TEAM_LEVEL`
- `public static final UserProperty TEAM_XP`
- `public static final UserProperty VIP_LEVEL`
- `public static final UserProperty VIP_TICKETS`

**Methods (3):**
- `UserProperty get(ResourceType)`
- `UserProperty[] values()`
- `UserProperty valueOf(String)`

**Constants (25):**
- DIAMONDS
- NAME
- LANGUAGE
- GOLD
- STAMINA
- TEAM_LEVEL
- TEAM_XP
- VIP_TICKETS
- VIP_LEVEL
- ITEMS
- HEROES
- QUEST_PROGRESS
- AVATAR
- MAILBOX
- FIGHT_TOKENS
- SIGNIN
- MONTHLY_CARD
- GUILD
- GUILD_TOKENS
- COLISEUM_TOKENS
- SOULMART_TOKENS
- EXPEDITION_TOKENS
- GUILD_WAR_TOKENS
- RUNICITE
- BAZAAR_TOKENS

### UserTutorialAct (class)
`com.perblue.rpg.game.objects.UserTutorialAct`

**Fields (4):**
- `private int maxStep`
- `private int step`
- `private TutorialActType type`
- `private int version`

**Methods (11):**
- `int getMaxStep()`
- `int getStep()`
- `void setMaxStep(int)`
- `void setShouldUpdate(boolean)`
- `void setStep(int)`
- `void setUserID(long)`
- `void setVersion(int)`
- `void setType(TutorialActType)`
- `int getVersion()`
- `String toString()`
- `TutorialActType getType()`

## Package: com.perblue.rpg.replay (8 classes)

### ReplayPlayer (class)
`com.perblue.rpg.replay.ReplayPlayer`

**Fields (10):**
- `protected static int globalTick`
- `protected a ignoredActions`
- `protected RaidInstance instance`
- `protected PlayerListener listener`
- `protected int nextSameTickIndex`
- `protected boolean paused`
- `protected float playSpeed`
- `protected Replay replay`
- `protected int tick`
- `protected long timeStepRemainder`

**Methods (13):**
- `boolean hasFutureDeployments(int)`
- `int nextSameTickIndex()`
- `void tick()`
- `void doTickAction(i)`
- `void doTickActions()`
- `int getCurrentTick()`
- `void ignoreAction(i)`
- `void pause()`
- `void setPlaySpeed(float)`
- `int getTick()`
- `float update(float)`
- `RaidInstance getInstance()`
- `void resume()`

### ReplayRecorder (class)
`com.perblue.rpg.replay.ReplayRecorder`

**Fields (3):**
- `private boolean combatEnded`
- `private ReplayPlayer player`
- `private Replay replay`

**Methods (2):**
- `void onCombatEnd()`
- `void onCombatStart()`

### StageReplay (class)
`com.perblue.rpg.replay.StageReplay`

**Fields (3):**
- `public final ReplayPlayer player`
- `public final ReplayRecorder recorder`
- `public final Replay replay`

### DebugAutoQueue (class)
`com.perblue.rpg.replay.autoqueue.DebugAutoQueue`

**Fields (3):**
- `public static final String CURRENT_JSON_FILE_NAME = current`
- `public static final long MSEC_PER_TICK = 25`
- `public QueueDataRecord currentDataRecord`

**Methods (16):**
- `void readyDebugAutoQueueCommands()`
- `QueueDataRecord buildDefaultDebugAutoQueueCommands()`
- `void processDebugAutoQueueCommands(RaidInstance, int)`
- `String getNextOrLastQueueText(int, boolean)`
- `void doTickActions(RaidInstance, int)`
- `String getJsonString(QueueDataRecord)`
- `String getJsonBasePath()`
- `String getJsonFullPath(String, String)`
- `boolean isCombatSimulator()`
- `String getLastQueueText(int)`
- `String getNextQueueText(int)`
- `QueueDataRecord loadJsonFromFile(String, String)`
- `QueueDataRecord loadJsonString(String)`
- `void saveJsonToFile(String, String, QueueDataRecord)`
- `void forceQueueingUnitSkill(Unit, UnitType, SkillType)`
- `CombatSkill getUnitBasicAttackOrAnotherCombatSkill(Unit)`

### DebugAutoQueueReplayPlayer (class)
`com.perblue.rpg.replay.autoqueue.DebugAutoQueueReplayPlayer`
extends `com.perblue.rpg.replay.ReplayPlayer`

**Fields (3):**
- `private static String globalLastQueueText`
- `private static String globalNextQueueText`
- `protected DebugAutoQueue debugAutoQueue`

**Methods (3):**
- `void doTickActions()`
- `String getLastQueueText()`
- `String getNextQueueText()`

### DefaultTestCase (class)
`com.perblue.rpg.replay.autoqueue.DefaultTestCase`

**Fields (1):**
- `private static final Map testCases`

**Methods (1):**
- `QueueDataRecord buildDebugQueuedCommands()`

### QueueData (class)
`com.perblue.rpg.replay.autoqueue.QueueData`

**Fields (2):**
- `public static final DebugAutoQueueTestCase TEST_CASE_DO_NOTHING`
- `public static final int UNDEFINED_SKILL_SUFFIX_NUMBER = -1`

**Methods (3):**
- `DebugAutoQueueCommand generateNewCommandAndRegisterToDataRecord(QueueDataRecord)`
- `void appendCommand(QueueDataRecord, QueueDataRecord)`
- `DebugAutoQueueCommand readyEmptyCommand(QueueDataRecord)`

### QueueDataRecord (class)
`com.perblue.rpg.replay.autoqueue.QueueDataRecord`

**Fields (3):**
- `public a attackersUnitTypes`
- `public a defendersUnitTypes`
- `public a queuedCommands`

