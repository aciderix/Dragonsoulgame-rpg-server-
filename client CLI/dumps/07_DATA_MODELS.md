# DragonSoul - Game Data Models

## Package: com.perblue.rpg.game.data (280 classes)

### BaseStats (class)
`com.perblue.rpg.game.data.BaseStats`
extends `com.perblue.common.stats.GeneralStats`

**Fields (1):**
- `public int maxLevel`

**Methods (5):**
- `void onMissingRow(String, Level)`
- `void saveStat(int, Enum, String)`
- `void saveStat(Level, Enum, String)`

### BattleStats (class)
`com.perblue.rpg.game.data.BattleStats`

**Fields (16):**
- `public x attackerHealing`
- `public x attackerKnockback`
- `public x attackerLifeSteal`
- `public z attackerPrimaryDamage`
- `public z attackerPrimaryDamageTaken`
- `public z attackerSubDamageTaken`
- `public z attackerSubTypeDamage`
- `public x attackerUnitDamage`
- `public x defenderHealing`
- `public x defenderKnockback`
- `public x defenderLifeSteal`
- `public z defenderPrimaryDamage`
- `public z defenderPrimaryDamageTaken`
- `public z defenderSubDamageTaken`
- `public z defenderSubTypeDamage`
- `public x defenderUnitDamage`

### DTEnumNode (class)
`com.perblue.rpg.game.data.DTEnumNode`

**Fields (1):**
- `private final Class enumClass`

**Methods (3):**
- `List toDropItems(Collection)`
- `List toDropItems(Enum)`
- `void getSummrayOfAll(r, q)`

### DTHeroesNode (class)
`com.perblue.rpg.game.data.DTHeroesNode`

**Methods (1):**
- `void getSummrayOfAll(r, q)`

### DifficultyModeStats (class)
`com.perblue.rpg.game.data.DifficultyModeStats`

**Fields (3):**
- `private static final Pattern LOOT_RANGE_PATTERN`
- `protected final Map ENEMY_STATS`
- `protected final Map LOOT_STATS`

**Methods (14):**
- `UnitType getBossType(GameMode, ModeDifficulty)`
- `Collection getEnemyStats()`
- `Collection getLootStats()`
- `List getFinalStageEnemyData(ModeDifficulty, DifficultyModeEnemyStats)`
- `List getFinalStageEnemyData(GameMode, ModeDifficulty)`
- `EnvironmentType getEnvironmentType(GameMode, ModeDifficulty)`
- `Collection getPossibleLoot(GameMode, ModeDifficulty)`
- `List getStageEnemies(GameMode, ModeDifficulty, int)`
- `int getEnemyLevel(GameMode, ModeDifficulty)`
- `int getEnemyStars(GameMode, ModeDifficulty)`
- `Rarity getEnemyRarity(GameMode, ModeDifficulty)`
- `Collection rollLoot(GameMode, ModeDifficulty, a)`
- `int getExpReward(GameMode, ModeDifficulty)`

### HeroRole (enum)
`com.perblue.rpg.game.data.HeroRole`
extends `java.lang.Enum`

**Fields (6):**
- `private static final HeroRole[] $VALUES`
- `public static final HeroRole CONTROL`
- `public static final HeroRole DPS`
- `public static final HeroRole NONE`
- `public static final HeroRole SUPPORT`
- `public static final HeroRole TANK`

**Methods (2):**
- `HeroRole[] values()`
- `HeroRole valueOf(String)`

**Constants (5):**
- NONE
- TANK
- DPS
- SUPPORT
- CONTROL

### HeroSort (enum)
`com.perblue.rpg.game.data.HeroSort`
extends `java.lang.Enum`

**Fields (7):**
- `private static final HeroSort[] $VALUES`
- `public static final HeroSort LEVEL`
- `public static final HeroSort NAME`
- `public static final HeroSort POWER`
- `public static final HeroSort RARITY`
- `public static final HeroSort ROLE`
- `public static final HeroSort STARS`

**Methods (2):**
- `HeroSort[] values()`
- `HeroSort valueOf(String)`

**Constants (6):**
- POWER
- LEVEL
- RARITY
- STARS
- ROLE
- NAME

### Level (enum)
`com.perblue.rpg.game.data.Level`
extends `java.lang.Enum`

**Fields (26):**
- `private static final Level[] $VALUES`
- `public static final Level EIGHT`
- `public static final Level EIGHTEEN`
- `public static final Level ELEVEN`
- `public static final Level FIFTEEN`
- `public static final Level FIVE`
- `public static final Level FOUR`
- `public static final Level FOURTEEN`
- `public static final Level NINE`
- `public static final Level NINETEEN`
- `public static final Level ONE`
- `public static final Level SEVEN`
- `public static final Level SEVENTEEN`
- `public static final Level SIX`
- `public static final Level SIXTEEN`
- `public static final Level TEN`
- `public static final Level THIRTEEN`
- `public static final Level THREE`
- `public static final Level TWELVE`
- `public static final Level TWENTY`
- `public static final Level TWENTYONE`
- `public static final Level TWENTYTWO`
- `public static final Level TWO`
- `public static final Level ZERO`
- `private static int maxVal`
- `private final int val`

**Methods (4):**
- `int getMaxVal()`
- `int getVal()`
- `Level[] values()`
- `Level valueOf(String)`

**Constants (23):**
- ZERO
- ONE
- TWO
- THREE
- FOUR
- FIVE
- SIX
- SEVEN
- EIGHT
- NINE
- TEN
- ELEVEN
- TWELVE
- THIRTEEN
- FOURTEEN
- FIFTEEN
- SIXTEEN
- SEVENTEEN
- EIGHTEEN
- NINETEEN
- TWENTY
- TWENTYONE
- TWENTYTWO

### ModeDifficulty (enum)
`com.perblue.rpg.game.data.ModeDifficulty`
extends `java.lang.Enum`

**Fields (34):**
- `private static final ModeDifficulty[] $VALUES`
- `public static final ModeDifficulty EIGHT`
- `public static final ModeDifficulty EIGHTEEN`
- `public static final ModeDifficulty ELEVEN`
- `public static final ModeDifficulty FIFTEEN`
- `public static final ModeDifficulty FIVE`
- `public static final ModeDifficulty FOUR`
- `public static final ModeDifficulty FOURTEEN`
- `public static final ModeDifficulty NINE`
- `public static final ModeDifficulty NINETEEN`
- `public static final ModeDifficulty ONE`
- `public static final ModeDifficulty SEVEN`
- `public static final ModeDifficulty SEVENTEEN`
- `public static final ModeDifficulty SIX`
- `public static final ModeDifficulty SIXTEEN`
- `public static final ModeDifficulty TEN`
- `public static final ModeDifficulty THIRTEEN`
- `public static final ModeDifficulty THIRTY`
- `public static final ModeDifficulty THIRTYONE`
- `public static final ModeDifficulty THIRTYTWO`
- `public static final ModeDifficulty THREE`
- `public static final ModeDifficulty TWELVE`
- `public static final ModeDifficulty TWENTY`
- `public static final ModeDifficulty TWENTYEIGHT`
- `public static final ModeDifficulty TWENTYFIVE`
- `public static final ModeDifficulty TWENTYFOUR`
- `public static final ModeDifficulty TWENTYNINE`
- `public static final ModeDifficulty TWENTYONE`
- `public static final ModeDifficulty TWENTYSEVEN`
- `public static final ModeDifficulty TWENTYSIX`
- `public static final ModeDifficulty TWENTYTHREE`
- `public static final ModeDifficulty TWENTYTWO`
- `public static final ModeDifficulty TWO`
- `private static ModeDifficulty[] values`

**Methods (5):**
- `ModeDifficulty[] valuesCached()`
- `ModeDifficulty get(int)`
- `ModeDifficulty[] values()`
- `ModeDifficulty valueOf(String)`
- `int getIndex()`

**Constants (32):**
- ONE
- TWO
- THREE
- FOUR
- FIVE
- SIX
- SEVEN
- EIGHT
- NINE
- TEN
- ELEVEN
- TWELVE
- THIRTEEN
- FOURTEEN
- FIFTEEN
- SIXTEEN
- SEVENTEEN
- EIGHTEEN
- NINETEEN
- TWENTY
- TWENTYONE
- TWENTYTWO
- TWENTYTHREE
- TWENTYFOUR
- TWENTYFIVE
- TWENTYSIX
- TWENTYSEVEN
- TWENTYEIGHT
- TWENTYNINE
- THIRTY
- THIRTYONE
- THIRTYTWO

### RPGDropTableStats (class)
`com.perblue.rpg.game.data.RPGDropTableStats`
extends `com.perblue.common.stats.DropTableStats`

**Methods (1):**
- `boolean shouldValidate()`

### com.perblue.rpg.game.data.SyncStatDataClientHelper [LOAD ERROR: null]

### com.perblue.rpg.game.data.arena.ArenaStats [LOAD ERROR: null]

### BossBattleCampaignUnitInfo (class)
`com.perblue.rpg.game.data.bossbattle.BossBattleCampaignUnitInfo`
extends `com.perblue.rpg.game.data.campaign.CampaignUnitInfo`

**Fields (3):**
- `private Integer level`
- `private Rarity rarity`
- `private Integer stars`

**Methods (3):**
- `Integer getStars()`
- `Rarity getRarity()`
- `Integer getLevel()`

### com.perblue.rpg.game.data.bossbattle.BossBattleStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.bosspit.BossPitStats [LOAD ERROR: null]

### CampaignLevel (class)
`com.perblue.rpg.game.data.campaign.CampaignLevel`

**Fields (3):**
- `private int chapter`
- `private int level`
- `private GameMode mode`

**Methods (4):**
- `CampaignType getCampaignType()`
- `GameMode getMode()`
- `int getChapter()`
- `int getLevel()`

### com.perblue.rpg.game.data.campaign.CampaignStats [LOAD ERROR: null]

### CampaignUnitInfo (class)
`com.perblue.rpg.game.data.campaign.CampaignUnitInfo`

**Fields (2):**
- `private boolean isBoss`
- `private UnitType unitType`

**Methods (2):**
- `boolean isBoss()`
- `UnitType getType()`

### com.perblue.rpg.game.data.challenges.ChallengesStats [LOAD ERROR: null]

### ChestContext (class)
`com.perblue.rpg.game.data.chest.ChestContext`
extends `com.perblue.rpg.game.logic.droptable.UserDTContext`

**Fields (4):**
- `private UserFlag chestRollFlag`
- `private int count`
- `private UserFlag freeRollFlag`
- `private boolean isPaid`

**Methods (8):**
- `void setChestRollFlag(UserFlag)`
- `UserFlag getChestRollFlag()`
- `boolean isPaidRoll()`
- `UserFlag getFreeChestRollFlag()`
- `void setFreeChestRollFlag(UserFlag)`
- `void setIsPaidRoll(boolean)`
- `void setCount(int)`
- `int getCount()`

### ChestContextDTCode (class)
`com.perblue.rpg.game.data.chest.ChestContextDTCode`
extends `com.perblue.rpg.game.logic.droptable.UserContextDTCode`

**Methods (1):**
- `void validateType(String, r)`

### com.perblue.rpg.game.data.chest.ChestStats [LOAD ERROR: null]

### EventChestStats (class)
`com.perblue.rpg.game.data.chest.EventChestStats`
extends `com.perblue.rpg.game.data.RPGDropTableStats`

**Fields (2):**
- `private static final String DISPLAY_ROOT_NAME = DISPLAY`
- `public String tableData`

**Methods (2):**
- `List getPossibleLoot(IUser)`
- `List rollChest(IUser, UserFlag, int)`

### com.perblue.rpg.game.data.chest.GeneralGearDropTableStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.chest.GeneralHeroDropTableStats [LOAD ERROR: null]

### ContentHelper (class)
`com.perblue.rpg.game.data.content.ContentHelper`

**Fields (3):**
- `static final boolean $assertionsDisabled = true`
- `private static ShardStats EXT`
- `public static final String PREFIX = content`

**Methods (3):**
- `void serverSetup(ShardStats)`
- `ContentStats getStats()`
- `ShardStats get()`

### ContentStats (class)
`com.perblue.rpg.game.data.content.ContentStats`
extends `com.perblue.common.stats.a`

**Fields (5):**
- `static final boolean $assertionsDisabled = true`
- `private static final ContentColumn DEFAULT`
- `private static final Log LOG`
- `private static final a colConverter`
- `private static final a rowConverter`

**Methods (30):**
- `Collection getLevelsWithStone(ItemType)`
- `int getNumExpertChaptersAvailable()`
- `ItemType getCampaignSoulStone(int, int)`
- `boolean isGoldChestHero(UnitType)`
- `boolean isChestHero(UnitType)`
- `Set getChestHeroes()`
- `Set getAvailableHeroes()`
- `Set getGoldChestHeroes()`
- `List getArenaMerchantHeroes()`
- `List getBazaarMerchantHeroes()`
- `List getColiseumMerchantHeroes()`
- `List getDailySoulChestHeroes(Random)`
- `List getExpeditionMerchantHeroes()`
- `UnitType getFeaturedSoulChestHero()`
- `List getGuildMerchantHeroes()`
- `UnitType getMonthlySigninHero(long)`
- `Map getSigninHeroesByEndTime()`
- `List getWarMerchantHeroes()`
- `void validateMaxTeamLevel()`
- `ContentColumn getServerColumn()`
- `ContentUpdate getContentUpdate()`
- `Rarity getMaxRarity()`
- `Rarity getMaxRarity(ContentUpdate)`
- `long getFeaturedSoulChestHeroStartTime()`
- `List getSecondGoldChestHeroes()`
- `int getMaxTeamLevel()`
- `ContentColumn getColumn(long)`
- `int getNumChaptersAvailable()`
- `boolean isHeroAvailable(UnitType)`

### ContentUpdate (enum)
`com.perblue.rpg.game.data.content.ContentUpdate`
extends `java.lang.Enum`

**Fields (36):**
- `private static final ContentUpdate[] $VALUES`
- `public static final int BETA_0_2_VERSION = 8`
- `public static final int BETA_0_3_VERSION = 9`
- `public static final int NEW_CHEST_SEEDS_VERSION = 29`
- `public static final ContentUpdate R0_2`
- `public static final ContentUpdate R0_3`
- `public static final ContentUpdate R1`
- `public static final ContentUpdate R1_0`
- `public static final ContentUpdate R1_1`
- `public static final ContentUpdate R1_2`
- `public static final ContentUpdate R1_3`
- `public static final ContentUpdate R1_4`
- `public static final ContentUpdate R2`
- `public static final ContentUpdate R2_1`
- `public static final ContentUpdate R2_10`
- `public static final ContentUpdate R2_11`
- `public static final ContentUpdate R2_13`
- `public static final ContentUpdate R2_14`
- `public static final ContentUpdate R2_15`
- `public static final ContentUpdate R2_16`
- `public static final ContentUpdate R2_17`
- `public static final ContentUpdate R2_18`
- `public static final ContentUpdate R2_2`
- `public static final ContentUpdate R2_20`
- `public static final ContentUpdate R2_21`
- `public static final ContentUpdate R2_22`
- `public static final ContentUpdate R2_3`
- `public static final ContentUpdate R2_5`
- `public static final ContentUpdate R2_6`
- `public static final ContentUpdate R2_7`
- `public static final ContentUpdate R2_8`
- `public static final ContentUpdate R2_9`
- `public static final ContentUpdate R3`
- `public static final ContentUpdate UNKNOWN`
- `public static final int WW_1_0_VERSION = 12`
- `private static ContentUpdate[] values`

**Methods (3):**
- `ContentUpdate[] valuesCached()`
- `ContentUpdate[] values()`
- `ContentUpdate valueOf(String)`

**Constants (30):**
- UNKNOWN
- R1
- R2
- R0_2
- R0_3
- R1_0
- R1_1
- R1_2
- R1_3
- R1_4
- R2_1
- R2_2
- R2_3
- R2_5
- R2_6
- R2_7
- R2_8
- R2_9
- R2_10
- R2_11
- R2_13
- R2_14
- R2_15
- R2_16
- R2_17
- R2_18
- R2_20
- R2_21
- R2_22
- R3

### com.perblue.rpg.game.data.crypt.CryptRaidStats [LOAD ERROR: null]

### AnimatedDisplayData (class)
`com.perblue.rpg.game.data.display.AnimatedDisplayData`
extends `com.perblue.rpg.game.data.display.BaseDisplayData`

**Fields (8):**
- `public static final float DEFAULT_FRAME_DURATION = 0.1`
- `public static final RotationType DEFAULT_ROT`
- `public final String atlasPath`
- `public final float frameDuration`
- `public final int playMode$4477989a`
- `public final String regionPrefix`
- `public final float scaleX`
- `public final float scaleY`

**Methods (1):**
- `Collection getPaths()`

### AnimationVFXListenerUtil (class)
`com.perblue.rpg.game.data.display.AnimationVFXListenerUtil`

**Methods (1):**
- `AnimationStateListener defaultUnitVFX(Unit)`

### BaseDisplayData (class)
`com.perblue.rpg.game.data.display.BaseDisplayData`

**Fields (1):**
- `public final RotationType rotation`

**Methods (1):**
- `Collection getPaths()`

### DisplayData (class)
`com.perblue.rpg.game.data.display.DisplayData`

**Fields (2):**
- `public a sortedDisplays`
- `public final String uiIcon`

**Methods (1):**
- `DisplayData addLayer(BaseDisplayData)`

### DisplayDataUtil (class)
`com.perblue.rpg.game.data.display.DisplayDataUtil`

**Fields (12):**
- `private static final Map ALL_DATA`
- `public static final ShadowData DEFAULT_SHADOW`
- `public static final String GIANT_PLANT_STAGE2_KEY = NPC_GIANT_PLANT_STAGE2`
- `private static float GLOBAL_SCALE`
- `private static Log LOG`
- `public static final DisplayData NULL_DATA`
- `private static final Map SHADOW_DATA`
- `public static final float TITAN_COMBAT_SCALE_MULT = 0.75`
- `private static DisplayData UNDERSTUDY_CACTUS`
- `private static DisplayData UNDERSTUDY_CLUB`
- `private static DisplayData UNDERSTUDY_FRYING_PAN`
- `public static final Map UNIT_SCALING`

**Methods (42):**
- `void setupScaling()`
- `void setupShadows()`
- `void addUnitSkin(UnitType, ItemType, String, String, String)`
- `DisplayData addProjectileSkin(String, ItemType)`
- `DisplayData addProjectileSkin(String, ItemType, String, String, RotationType)`
- `DisplayData addEnvironment(EnvironmentType, String)`
- `DisplayData addEnvironment(EnvironmentType)`
- `DisplayData addEnvironment(EnvironmentType, String, String)`
- `DisplayData addEnvironment(EnvironmentType, String, boolean)`
- `DisplayData addEnvEntityDisplay(String)`
- `DisplayData addEnvEntityDisplay(String, String, String, float)`
- `DisplayData addEnvEntityDisplaySkin(String, ItemType, String, String, float)`
- `DisplayData addEnvEntityDisplaySkin(String, ItemType)`
- `DisplayData addSpineUI(SpineUIType, String, String)`
- `void addDisplayDataBase(String, DisplayData)`
- `void addEnvEntityShadow(EnvEntityType, String, float, float, float, float)`
- `void addUnitShadow(UnitType, String, float, float, float, float)`
- `DisplayData getDisplayData(String)`
- `float getTempleUiScale(UnitType)`
- `DisplayData getUnitDisplay(UnitType, ItemType)`
- `DisplayData getUnitDisplay(UnitType)`
- `DisplayData getUIDisplay(SpineUIType)`
- `EnvironmentType getBossPitEnvironmentType(UnitType, int)`
- `DisplayData getEnvEntityDisplay(EnvEntityType, ItemType)`
- `DisplayData getEnvironmentDisplay(EnvironmentType)`
- `float getMaxTempleUiScale(Unit)`
- `DisplayData getProjectileDisplay(ProjectileType, ItemType)`
- `String getShadowFollowSlot(Entity)`
- `SpineDisplayData getSpineDisplayData(UnitType)`
- `SpineDisplayData getSpineDisplayData(DisplayData)`
- `float getTitanEntityScale(UnitType)`
- `void initMixData(Unit, AnimationStateData)`
- `void initAnimMapping(UnitType, AnimationElement)`
- `DisplayData addProjectile(String)`
- `DisplayData addProjectile(String, String, String, RotationType)`
- `void addUnit(String, String, String, String, float)`
- `void addUnit(UnitType, String, String, String)`
- `float getFlyingHeight(UnitType)`
- `float getCastingScaleMultiplier(UnitType)`
- `float getUnitScale(UnitType)`
- `ShadowData getShadowData(UnitType)`
- `ShadowData getShadowData(EnvEntityType)`

### EnvironmentData (class)
`com.perblue.rpg.game.data.display.EnvironmentData`

**Methods (3):**
- `boolean isSnowing(EnvironmentType)`
- `float getAngle(EnvironmentType)`
- `boolean isTrapezoid(EnvironmentType)`

### LayeredDisplayData (class)
`com.perblue.rpg.game.data.display.LayeredDisplayData`
extends `com.perblue.rpg.game.data.display.StaticDisplayData`

**Fields (1):**
- `public final RenderGroupType groupType`

### MultiMappedParticleHitData (class)
`com.perblue.rpg.game.data.display.MultiMappedParticleHitData`

**Fields (1):**
- ` HashMap particles`

**Methods (2):**
- `void addParticles(String, MultiParticleHitData)`
- `MultiParticleHitData getParticles(String)`

### MultiParticleHitData (class)
`com.perblue.rpg.game.data.display.MultiParticleHitData`

**Fields (1):**
- `protected a particles`

**Methods (2):**
- `void addParticles(ParticleHitData)`
- `a getParticles()`

### ParticleHitData (class)
`com.perblue.rpg.game.data.display.ParticleHitData`
extends `com.perblue.rpg.game.data.display.MultiParticleHitData`

**Fields (5):**
- `public long duration`
- `public q offset`
- `public HIT_LOCATION position`
- `public boolean removeOnCompletion`
- `public ParticleType type`

**Methods (2):**
- `ParticleType getParticleType()`
- `a getParticles()`

### ShadowData (class)
`com.perblue.rpg.game.data.display.ShadowData`

**Fields (5):**
- `public final String followSlot`
- `public final float scaleX`
- `public final float scaleY`
- `public final float xOffset`
- `public final float yOffset`

### SpineDisplayData (class)
`com.perblue.rpg.game.data.display.SpineDisplayData`
extends `com.perblue.rpg.game.data.display.BaseDisplayData`

**Fields (3):**
- `public final String atlasPath`
- `public final float scale`
- `public final String skeletonPath`

**Methods (1):**
- `Collection getPaths()`

### StaticDisplayData (class)
`com.perblue.rpg.game.data.display.StaticDisplayData`
extends `com.perblue.rpg.game.data.display.BaseDisplayData`

**Fields (3):**
- `public static final RotationType DEFAULT_ROT`
- `public final String atlasPath`
- `public final String regionName`

**Methods (1):**
- `Collection getPaths()`

### VFXUtil (class)
`com.perblue.rpg.game.data.display.VFXUtil`

**Fields (2):**
- `public static final Map PROJECTILE_HIT_DATA`
- `public static final Map VFX_HIT_DATA`

**Methods (7):**
- `AnimationStateListener defaultUnitVFX(Unit)`
- `AnimationStateListener getBaseVFX(Entity)`
- `AnimationStateListener getBaseVFX(Projectile)`
- `AnimationStateListener getBaseVFX(Unit)`
- `AnimationStateListener getBaseVFX(EnvEntity)`
- `MultiParticleHitData getVfxData(SkillType, Entity)`
- `void putVfxData(SkillType, MultiParticleHitData)`

### com.perblue.rpg.game.data.expedition.ExpeditionStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.item.CraftingStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.item.GearTicketStats [LOAD ERROR: null]

### HowToGetHelper (class)
`com.perblue.rpg.game.data.item.HowToGetHelper`

**Fields (4):**
- `public static final int INFINITE_CAMPAIGN_LEVELS = -1`
- `private static final Comparator INFINITE_LIST_CAMPAIGN_SORT`
- `private static final Comparator SMALL_LIST_CAMPAIGN_SORT`
- `private static UnitType hero`

**Methods (9):**
- `boolean isHeroAvailableInChest(RewardDrop, ItemType)`
- `boolean shouldShowMerchantInHowToGet(MerchantType, LinkableItem, IUser)`
- `void _getHowToGetLinks(LinkableItem, IUser, List, int)`
- `void addMerchants(LinkableItem, IUser, List)`
- `boolean runeMatches(IRune, RuneData)`
- `Collection getHowToGetLinks(ItemType, IUser, UnitType, int)`
- `Collection getHowToGetLinks(ItemType, IUser, int)`
- `Collection getHowToGetLinks(IRune, IUser, int)`

### ItemCategory (enum)
`com.perblue.rpg.game.data.item.ItemCategory`
extends `java.lang.Enum`

**Fields (10):**
- `private static final ItemCategory[] $VALUES`
- `public static final ItemCategory GEAR`
- `public static final ItemCategory HERO`
- `public static final ItemCategory HIDDEN`
- `public static final ItemCategory MISC`
- `public static final ItemCategory REEL`
- `public static final ItemCategory RUNE`
- `public static final ItemCategory SHARD`
- `public static final ItemCategory STONE`
- `public static final ItemCategory TRASH`

**Methods (2):**
- `ItemCategory[] values()`
- `ItemCategory valueOf(String)`

**Constants (9):**
- HIDDEN
- GEAR
- MISC
- STONE
- HERO
- REEL
- SHARD
- TRASH
- RUNE

### com.perblue.rpg.game.data.item.ItemStats [LOAD ERROR: Could not initialize class com.perblue.rpg.game.data.item.ItemStats]

### StatType (enum)
`com.perblue.rpg.game.data.item.StatType`
extends `java.lang.Enum`

**Fields (66):**
- `private static final StatType[] $VALUES`
- `public static final StatType ACCURACY`
- `public static final StatType AGILITY`
- `public static final StatType ARMOR`
- `public static final StatType ARMOR_PENETRATION`
- `public static final StatType ATTACK_DAMAGE`
- `public static final StatType ATTACK_SPEED_MODIFIER`
- `public static final StatType BASHING_DMG_AMP`
- `public static final StatType BASHING_DMG_REDUX`
- `public static final StatType CATEGORY`
- `public static final StatType CONTENT_UPDATE`
- `public static final StatType COOLDOWN_REDUCTION`
- `public static final StatType CRIT_DAMAGE_BONUS`
- `public static final StatType CRIT_DMG_REDUX`
- `public static final StatType DIAMOND_PRICE`
- `public static final StatType DODGE`
- `public static final StatType ELECTRICAL_DMG_AMP`
- `public static final StatType ELECTRICAL_DMG_REDUX`
- `public static final StatType ENCHANT_POINTS`
- `public static final StatType ENERGY_CONSUMPTION_REDUCTION`
- `public static final StatType ENERGY_GAIN`
- `public static final StatType ENERGY_REGEN`
- `public static final StatType ENERGY_WHEN_ATTACKED`
- `public static final StatType EXP_GIVEN`
- `public static final StatType FIGHT_PIT_TOKEN_PRICE`
- `public static final StatType FIRE_DMG_AMP`
- `public static final StatType FIRE_DMG_REDUX`
- `public static final StatType GOLD_PRICE`
- `public static final StatType HOLY_DMG_AMP`
- `public static final StatType HOLY_DMG_REDUX`
- `public static final StatType HP_REGEN`
- `public static final StatType IGNORE_MAGIC_RESISTANCE`
- `public static final StatType IMPROVE_HEALING`
- `public static final StatType INTELLECT`
- `public static final StatType LARGER_SHIELDS`
- `public static final StatType LIFE_STEAL_RATING`
- `public static final StatType LONGER_DISABLES`
- `public static final StatType LONGER_SHIELDS`
- `public static final StatType MAGIC_CRIT`
- `public static final StatType MAGIC_POWER`
- `public static final StatType MAGIC_RESISTANCE`
- `public static final StatType MAGIC_VAMP`
- `public static final StatType MAX_ENERGY`
- `public static final StatType MAX_HP`
- `public static final StatType MOVEMENT_SPEED_MODIFIER`
- `public static final StatType NECROTIC_DMG_AMP`
- `public static final StatType NECROTIC_DMG_REDUX`
- `public static final Set PERCENT_VALUED_STATS`
- `public static final StatType PHYSICAL_CRIT`
- `public static final StatType PIERCING_DMG_AMP`
- `public static final StatType PIERCING_DMG_REDUX`
- `public static final StatType RARITY`
- `public static final StatType REQUIRED_LEVEL`
- `public static final StatType SKILL_LEVEL`
- `public static final StatType SLASHING_DMG_AMP`
- `public static final StatType SLASHING_DMG_REDUX`
- `public static final StatType STARTING_ENERGY`
- `public static final StatType STRENGTH`
- `public static final StatType TENACITY`
- `public static final StatType TOXIC_DMG_AMP`
- `public static final StatType TOXIC_DMG_REDUX`
- `public static final Set UNIT_STATS`
- `public static final StatType VEND_VALUE`
- `public static final StatType WATER_DMG_AMP`
- `public static final StatType WATER_DMG_REDUX`
- `private static StatType[] values`

**Methods (7):**
- `boolean defaultHide()`
- `float getBaseHideValue()`
- `boolean isCoreStat()`
- `boolean isPercentStat()`
- `StatType[] valuesCached()`
- `StatType[] values()`
- `StatType valueOf(String)`

**Constants (62):**
- CATEGORY
- RARITY
- REQUIRED_LEVEL
- VEND_VALUE
- GOLD_PRICE
- DIAMOND_PRICE
- FIGHT_PIT_TOKEN_PRICE
- ENCHANT_POINTS
- EXP_GIVEN
- CONTENT_UPDATE
- STRENGTH
- INTELLECT
- AGILITY
- MAX_HP
- HP_REGEN
- MAX_ENERGY
- ENERGY_REGEN
- ATTACK_DAMAGE
- MAGIC_POWER
- ARMOR
- MAGIC_RESISTANCE
- ARMOR_PENETRATION
- IGNORE_MAGIC_RESISTANCE
- PHYSICAL_CRIT
- CRIT_DAMAGE_BONUS
- CRIT_DMG_REDUX
- LIFE_STEAL_RATING
- MAGIC_VAMP
- DODGE
- ACCURACY
- ENERGY_WHEN_ATTACKED
- STARTING_ENERGY
- ENERGY_CONSUMPTION_REDUCTION
- ENERGY_GAIN
- IMPROVE_HEALING
- TENACITY
- LONGER_DISABLES
- SKILL_LEVEL
- MOVEMENT_SPEED_MODIFIER
- ATTACK_SPEED_MODIFIER
- COOLDOWN_REDUCTION
- LARGER_SHIELDS
- LONGER_SHIELDS
- BASHING_DMG_AMP
- PIERCING_DMG_AMP
- SLASHING_DMG_AMP
- WATER_DMG_AMP
- NECROTIC_DMG_AMP
- TOXIC_DMG_AMP
- ELECTRICAL_DMG_AMP
- FIRE_DMG_AMP
- HOLY_DMG_AMP
- MAGIC_CRIT
- BASHING_DMG_REDUX
- PIERCING_DMG_REDUX
- SLASHING_DMG_REDUX
- WATER_DMG_REDUX
- NECROTIC_DMG_REDUX
- TOXIC_DMG_REDUX
- ELECTRICAL_DMG_REDUX
- FIRE_DMG_REDUX
- HOLY_DMG_REDUX

### com.perblue.rpg.game.data.item.enchanting.EnchantingStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.misc.GameModeRefreshStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.misc.GoldDrop [LOAD ERROR: null]

### LegacyVipTicketMap (class)
`com.perblue.rpg.game.data.misc.LegacyVipTicketMap`

**Fields (1):**
- `public static final int[] legacyVipTicketsByLevel`

**Methods (1):**
- `int getLegacyVipTicketsByLevel(int)`

### MerchantDTCode (class)
`com.perblue.rpg.game.data.misc.MerchantDTCode`
extends `com.perblue.rpg.game.logic.droptable.UserContextDTCode`

**Methods (2):**
- `void validateParamter(String, String, r)`
- `void validateType(String, r)`

### com.perblue.rpg.game.data.misc.MerchantStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.misc.MidasStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.misc.QuestStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.misc.RaidTicketPurchaseStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.misc.StaminaStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.misc.SupportLinks [LOAD ERROR: null]

### com.perblue.rpg.game.data.misc.TeamLevelStats [LOAD ERROR: Could not initialize class com.perblue.rpg.game.data.misc.TeamLevelStats]

### Unlockable (enum)
`com.perblue.rpg.game.data.misc.Unlockable`
extends `java.lang.Enum`

**Fields (167):**
- `private static final Unlockable[] $VALUES`
- `public static final Unlockable ADVANCED_TAGS`
- `public static final Unlockable ALCHEMY`
- `public static final Unlockable BAZAAR`
- `public static final Unlockable BLACK_MARKET`
- `public static final Unlockable BOSS_BATTLE`
- `public static final Unlockable BOSS_PIT`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_1`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_10`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_11`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_12`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_13`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_14`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_15`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_16`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_17`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_18`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_19`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_2`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_3`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_4`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_5`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_6`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_7`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_8`
- `public static final Unlockable BOSS_PIT_EVIL_WIZARD_9`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_1`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_10`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_11`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_12`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_13`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_14`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_15`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_16`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_17`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_18`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_19`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_2`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_3`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_4`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_5`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_6`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_7`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_8`
- `public static final Unlockable BOSS_PIT_GIANT_PLANT_9`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_1`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_10`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_11`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_12`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_13`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_14`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_15`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_16`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_17`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_18`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_19`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_2`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_3`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_4`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_5`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_6`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_7`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_8`
- `public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_9`
- `public static final Unlockable CHALLENGES`
- `public static final Unlockable CHALLENGES_10`
- `public static final Unlockable CHALLENGES_11`
- `public static final Unlockable CHALLENGES_12`
- `public static final Unlockable CHALLENGES_13`
- `public static final Unlockable CHALLENGES_14`
- `public static final Unlockable CHALLENGES_15`
- `public static final Unlockable CHALLENGES_16`
- `public static final Unlockable CHALLENGES_17`
- `public static final Unlockable CHALLENGES_18`
- `public static final Unlockable CHALLENGES_19`
- `public static final Unlockable CHALLENGES_2`
- `public static final Unlockable CHALLENGES_20`
- `public static final Unlockable CHALLENGES_21`
- `public static final Unlockable CHALLENGES_22`
- `public static final Unlockable CHALLENGES_3`
- `public static final Unlockable CHALLENGES_4`
- `public static final Unlockable CHALLENGES_5`
- `public static final Unlockable CHALLENGES_6`
- `public static final Unlockable CHALLENGES_7`
- `public static final Unlockable CHALLENGES_8`
- `public static final Unlockable CHALLENGES_9`
- `public static final Unlockable CHAPTER_10`
- `public static final Unlockable CHAPTER_11`
- `public static final Unlockable CHAPTER_12`
- `public static final Unlockable CHAPTER_13`
- `public static final Unlockable CHAPTER_14`
- `public static final Unlockable CHAPTER_15`
- `public static final Unlockable CHAPTER_16`
- `public static final Unlockable CHAPTER_17`
- `public static final Unlockable CHAPTER_18`
- `public static final Unlockable CHAPTER_19`
- `public static final Unlockable CHAPTER_2`
- `public static final Unlockable CHAPTER_20`
- `public static final Unlockable CHAPTER_21`
- `public static final Unlockable CHAPTER_22`
- `public static final Unlockable CHAPTER_23`
- `public static final Unlockable CHAPTER_24`
- `public static final Unlockable CHAPTER_25`
- `public static final Unlockable CHAPTER_26`
- `public static final Unlockable CHAPTER_27`
- `public static final Unlockable CHAPTER_28`
- `public static final Unlockable CHAPTER_29`
- `public static final Unlockable CHAPTER_3`
- `public static final Unlockable CHAPTER_4`
- `public static final Unlockable CHAPTER_5`
- `public static final Unlockable CHAPTER_6`
- `public static final Unlockable CHAPTER_7`
- `public static final Unlockable CHAPTER_8`
- `public static final Unlockable CHAPTER_9`
- `public static final Unlockable COLISEUM`
- `public static final Unlockable COLISEUM_QUICK_ATTACK`
- `public static final Unlockable CRYPT_RAID`
- `public static final Unlockable CRYPT_RAID_QUICK_ATTACK`
- `public static final Unlockable ELITE_CAMPAIGN`
- `public static final Unlockable ENCHANTING`
- `public static final Unlockable EXPEDITION`
- `public static final Unlockable EXPEDITION_QUICK_ATTACK`
- `public static final Unlockable EXPERT_CAMPAIGN`
- `public static final Unlockable FAST_FORWARD`
- `public static final Unlockable FIGHT_PIT`
- `public static final Unlockable FIGHT_PIT_QUICK_ATTACK`
- `public static final Unlockable GUILDS`
- `public static final Unlockable GUILD_WAR`
- `public static final Unlockable GUILD_WAR_QUICK_ATTACK`
- `public static final Unlockable ORANGE_CHEST`
- `public static final Unlockable PEDDLER`
- `public static final Unlockable POWER_UPGRADE`
- `public static final Unlockable PURCHASE`
- `public static final Unlockable PURPLE_CHEST`
- `public static final Unlockable RANKINGS`
- `public static final Unlockable RUNES`
- `public static final Unlockable SERVICE_OPEN`
- `public static final Unlockable SKINS`
- `public static final Unlockable SOULMART`
- `public static final Unlockable THE_MOUNTAIN`
- `public static final Unlockable THE_MOUNTAIN_10`
- `public static final Unlockable THE_MOUNTAIN_11`
- `public static final Unlockable THE_MOUNTAIN_12`
- `public static final Unlockable THE_MOUNTAIN_13`
- `public static final Unlockable THE_MOUNTAIN_14`
- `public static final Unlockable THE_MOUNTAIN_15`
- `public static final Unlockable THE_MOUNTAIN_16`
- `public static final Unlockable THE_MOUNTAIN_17`
- `public static final Unlockable THE_MOUNTAIN_18`
- `public static final Unlockable THE_MOUNTAIN_19`
- `public static final Unlockable THE_MOUNTAIN_2`
- `public static final Unlockable THE_MOUNTAIN_20`
- `public static final Unlockable THE_MOUNTAIN_21`
- `public static final Unlockable THE_MOUNTAIN_22`
- `public static final Unlockable THE_MOUNTAIN_3`
- `public static final Unlockable THE_MOUNTAIN_4`
- `public static final Unlockable THE_MOUNTAIN_5`
- `public static final Unlockable THE_MOUNTAIN_6`
- `public static final Unlockable THE_MOUNTAIN_7`
- `public static final Unlockable THE_MOUNTAIN_8`
- `public static final Unlockable THE_MOUNTAIN_9`
- `public static final Unlockable TITAN_TEMPLE`
- `public static final Unlockable TITAN_TEMPLE_QUICK_ATTACK`
- `public static final Unlockable TRADER`
- `public static final Unlockable TREASURE_CRYPT`
- `public static final Unlockable WORLD_CHANNEL`
- `private static Unlockable[] values`

**Methods (12):**
- `Unlockable getUnlockableForBossPit(UnitType, ModeDifficulty)`
- `Unlockable getUnlockableForChapter(int)`
- `Unlockable getUnlockableForChests(ChestType)`
- `Unlockable getUnlockableForGameMode(GameMode, ModeDifficulty)`
- `int getChapterIndex()`
- `Set getUnlockables(int, int)`
- `boolean isCampaign()`
- `boolean isFeature()`
- `Unlockable[] valuesCached()`
- `Unlockable[] values()`
- `Unlockable valueOf(String)`
- `boolean isHidden()`

**Constants (165):**
- CHAPTER_2
- CHAPTER_3
- CHAPTER_4
- CHAPTER_5
- CHAPTER_6
- CHAPTER_7
- CHAPTER_8
- CHAPTER_9
- CHAPTER_10
- CHAPTER_11
- CHAPTER_12
- CHAPTER_13
- CHAPTER_14
- CHAPTER_15
- CHAPTER_16
- CHAPTER_17
- CHAPTER_18
- CHAPTER_19
- CHAPTER_20
- CHAPTER_21
- CHAPTER_22
- CHAPTER_23
- CHAPTER_24
- CHAPTER_25
- CHAPTER_26
- CHAPTER_27
- CHAPTER_28
- CHAPTER_29
- POWER_UPGRADE
- FIGHT_PIT
- ELITE_CAMPAIGN
- EXPERT_CAMPAIGN
- ALCHEMY
- ENCHANTING
- WORLD_CHANNEL
- CHALLENGES
- CHALLENGES_2
- CHALLENGES_3
- CHALLENGES_4
- CHALLENGES_5
- CHALLENGES_6
- CHALLENGES_7
- CHALLENGES_8
- CHALLENGES_9
- CHALLENGES_10
- CHALLENGES_11
- CHALLENGES_12
- CHALLENGES_13
- CHALLENGES_14
- CHALLENGES_15
- CHALLENGES_16
- CHALLENGES_17
- CHALLENGES_18
- CHALLENGES_19
- CHALLENGES_20
- CHALLENGES_21
- CHALLENGES_22
- EXPEDITION
- PEDDLER
- GUILDS
- BLACK_MARKET
- BAZAAR
- TREASURE_CRYPT
- THE_MOUNTAIN
- THE_MOUNTAIN_2
- THE_MOUNTAIN_3
- THE_MOUNTAIN_4
- THE_MOUNTAIN_5
- THE_MOUNTAIN_6
- THE_MOUNTAIN_7
- THE_MOUNTAIN_8
- THE_MOUNTAIN_9
- THE_MOUNTAIN_10
- THE_MOUNTAIN_11
- THE_MOUNTAIN_12
- THE_MOUNTAIN_13
- THE_MOUNTAIN_14
- THE_MOUNTAIN_15
- THE_MOUNTAIN_16
- THE_MOUNTAIN_17
- THE_MOUNTAIN_18
- THE_MOUNTAIN_19
- THE_MOUNTAIN_20
- THE_MOUNTAIN_21
- THE_MOUNTAIN_22
- COLISEUM
- TRADER
- RANKINGS
- CRYPT_RAID
- TITAN_TEMPLE
- BOSS_PIT
- BOSS_PIT_EVIL_WIZARD_1
- BOSS_PIT_EVIL_WIZARD_2
- BOSS_PIT_EVIL_WIZARD_3
- BOSS_PIT_EVIL_WIZARD_4
- BOSS_PIT_EVIL_WIZARD_5
- BOSS_PIT_EVIL_WIZARD_6
- BOSS_PIT_EVIL_WIZARD_7
- BOSS_PIT_EVIL_WIZARD_8
- BOSS_PIT_EVIL_WIZARD_9
- BOSS_PIT_EVIL_WIZARD_10
- BOSS_PIT_EVIL_WIZARD_11
- BOSS_PIT_EVIL_WIZARD_12
- BOSS_PIT_EVIL_WIZARD_13
- BOSS_PIT_EVIL_WIZARD_14
- BOSS_PIT_EVIL_WIZARD_15
- BOSS_PIT_EVIL_WIZARD_16
- BOSS_PIT_EVIL_WIZARD_17
- BOSS_PIT_EVIL_WIZARD_18
- BOSS_PIT_EVIL_WIZARD_19
- BOSS_PIT_GIANT_PLANT_1
- BOSS_PIT_GIANT_PLANT_2
- BOSS_PIT_GIANT_PLANT_3
- BOSS_PIT_GIANT_PLANT_4
- BOSS_PIT_GIANT_PLANT_5
- BOSS_PIT_GIANT_PLANT_6
- BOSS_PIT_GIANT_PLANT_7
- BOSS_PIT_GIANT_PLANT_8
- BOSS_PIT_GIANT_PLANT_9
- BOSS_PIT_GIANT_PLANT_10
- BOSS_PIT_GIANT_PLANT_11
- BOSS_PIT_GIANT_PLANT_12
- BOSS_PIT_GIANT_PLANT_13
- BOSS_PIT_GIANT_PLANT_14
- BOSS_PIT_GIANT_PLANT_15
- BOSS_PIT_GIANT_PLANT_16
- BOSS_PIT_GIANT_PLANT_17
- BOSS_PIT_GIANT_PLANT_18
- BOSS_PIT_GIANT_PLANT_19
- BOSS_PIT_GOLD_COLOSSUS_1
- BOSS_PIT_GOLD_COLOSSUS_2
- BOSS_PIT_GOLD_COLOSSUS_3
- BOSS_PIT_GOLD_COLOSSUS_4
- BOSS_PIT_GOLD_COLOSSUS_5
- BOSS_PIT_GOLD_COLOSSUS_6
- BOSS_PIT_GOLD_COLOSSUS_7
- BOSS_PIT_GOLD_COLOSSUS_8
- BOSS_PIT_GOLD_COLOSSUS_9
- BOSS_PIT_GOLD_COLOSSUS_10
- BOSS_PIT_GOLD_COLOSSUS_11
- BOSS_PIT_GOLD_COLOSSUS_12
- BOSS_PIT_GOLD_COLOSSUS_13
- BOSS_PIT_GOLD_COLOSSUS_14
- BOSS_PIT_GOLD_COLOSSUS_15
- BOSS_PIT_GOLD_COLOSSUS_16
- BOSS_PIT_GOLD_COLOSSUS_17
- BOSS_PIT_GOLD_COLOSSUS_18
- BOSS_PIT_GOLD_COLOSSUS_19
- SOULMART
- GUILD_WAR
- RUNES
- FAST_FORWARD
- SKINS
- ADVANCED_TAGS
- PURPLE_CHEST
- ORANGE_CHEST
- FIGHT_PIT_QUICK_ATTACK
- CRYPT_RAID_QUICK_ATTACK
- EXPEDITION_QUICK_ATTACK
- TITAN_TEMPLE_QUICK_ATTACK
- COLISEUM_QUICK_ATTACK
- GUILD_WAR_QUICK_ATTACK
- BOSS_BATTLE
- PURCHASE
- SERVICE_OPEN

### com.perblue.rpg.game.data.misc.Unlockables [LOAD ERROR: null]

### UserValue (enum)
`com.perblue.rpg.game.data.misc.UserValue`
extends `java.lang.Enum`

**Fields (70):**
- `private static final UserValue[] $VALUES`
- `public static final UserValue ALLOWED_UNACKNOWLEDGED_CHESTS`
- `public static final UserValue BLOCKED_LIST_LIMIT`
- `public static final UserValue BLUE_PRIME_LOOT`
- `public static final UserValue BLUE_PRIME_LOOT_MEM`
- `public static final UserValue BLUE_SECOND_LOOT`
- `public static final UserValue BOSS_PIT_ATTEMPTS`
- `public static final UserValue CAMPAIGN_LOOT_LIMIT`
- `public static final UserValue CHAT_APP_BUTTON`
- `public static final UserValue CHAT_APP_IMAGE_LINK`
- `public static final UserValue CHAT_APP_UPSELL`
- `public static final UserValue COLISEUM_THREE_ATTACKS`
- `public static final UserValue CRYPT_RECOMMENDED_POWER_SCALAR`
- `public static final UserValue CRYSTAL_SHRINE_GENERATION_INTERVAL`
- `public static final UserValue CRYSTAL_SHRINE_ROLL_CAPACITY`
- `public static final UserValue EXP_DECANTER_CHANCE`
- `public static final UserValue EXP_FLASK_CHANCE`
- `public static final UserValue EXP_PHILTER_CHANCE`
- `public static final UserValue EXP_VIAL_CHANCE`
- `public static final UserValue FIGHT_PIT_CONTENT_UPDATE_LOCK`
- `public static final UserValue FIRST_WIN_MAJOR_STAGE_LOOT_MULT`
- `public static final UserValue FIRST_WIN_MINOR_STAGE_LOOT_MULT`
- `public static final UserValue FRIEND_LIMIT`
- `public static final UserValue GOLD_CHEST_GENERATION_INTERVAL`
- `public static final UserValue GREEN_PRIME_LOOT`
- `public static final UserValue GREEN_PRIME_LOOT_MEM`
- `public static final UserValue GREEN_SECOND_LOOT`
- `public static final UserValue LOOT_MEMORY_FUNC`
- `public static final UserValue MAX_RARITY`
- `public static final UserValue MIN_CHAPTER_FOR_ELITE`
- `public static final UserValue MIN_STONE_FOR_10X_GOLD_CHEST`
- `public static final UserValue ORANGE_CHEST_ENABLED`
- `public static final UserValue ORANGE_CHEST_GENERATION_INTERVAL`
- `public static final UserValue ORANGE_PRIME_LOOT`
- `public static final UserValue ORANGE_PRIME_LOOT_MEM`
- `public static final UserValue ORANGE_SECOND_LOOT`
- `public static final UserValue PM_ROOM_LIMIT`
- `public static final UserValue PRIMARY_LOOT_FUNC`
- `public static final UserValue PROMO_CODE_ENABLED`
- `public static final UserValue PURPLE_CHEST_ENABLED`
- `public static final UserValue PURPLE_CHEST_GENERATION_INTERVAL`
- `public static final UserValue PURPLE_PRIME_LOOT`
- `public static final UserValue PURPLE_PRIME_LOOT_MEM`
- `public static final UserValue PURPLE_SECOND_LOOT`
- `public static final UserValue QUICK_ATTACK_ENABLED`
- `public static final UserValue QUICK_ATTACK_PLAY_SPEED`
- `public static final UserValue RAID_TICKETS_PURCHASE_AMOUNT`
- `public static final UserValue RAID_TICKET_LOOT_FUNCTION`
- `public static final UserValue RAID_TICKET_LOOT_MEM_FUNCTION`
- `public static final UserValue SECONDARY_LOOT_FUNC`
- `public static final UserValue SECOND_GOLD_CHEST_GENERATION_INTERVAL`
- `public static final UserValue SKILL_POINT_GENERATION_INTERVAL`
- `public static final UserValue SKILL_POINT_PURCHASE_AMOUNT`
- `public static final UserValue SOUL_CHEST_GENERATION_INTERVAL`
- `public static final UserValue SS_PRIME_LOOT`
- `public static final UserValue SS_PRIME_LOOT_MEM`
- `public static final UserValue SS_SECOND_LOOT`
- `public static final UserValue STAMINA_GENERATION_INTERVAL`
- `public static final UserValue STAMINA_HARD_CAP`
- `public static final UserValue STAMINA_PURCHASE_AMOUNT`
- `public static final UserValue STONE_SHRINE_GENERATION_INTERVAL`
- `public static final UserValue STONE_SHRINE_ROLL_CAPACITY`
- `public static final UserValue SYMMETRIC_LOOT`
- `public static final UserValue SYMMETRIC_LOOT_MEM`
- `public static final UserValue THOUGHT_BUBBLE_MIN_LEVEL`
- `public static final UserValue THOUGHT_BUBBLE_PROBABILITY`
- `public static final UserValue TIME_ZONE_CHANGE_INTERVAL`
- `public static final UserValue WHITE_PRIME_LOOT`
- `public static final UserValue WHITE_PRIME_LOOT_MEM`
- `public static final UserValue WHITE_SECOND_LOOT`

**Methods (2):**
- `UserValue[] values()`
- `UserValue valueOf(String)`

**Constants (69):**
- PRIMARY_LOOT_FUNC
- SECONDARY_LOOT_FUNC
- LOOT_MEMORY_FUNC
- RAID_TICKET_LOOT_FUNCTION
- RAID_TICKET_LOOT_MEM_FUNCTION
- FIRST_WIN_MAJOR_STAGE_LOOT_MULT
- FIRST_WIN_MINOR_STAGE_LOOT_MULT
- SS_PRIME_LOOT
- SS_PRIME_LOOT_MEM
- WHITE_PRIME_LOOT
- WHITE_PRIME_LOOT_MEM
- GREEN_PRIME_LOOT
- GREEN_PRIME_LOOT_MEM
- BLUE_PRIME_LOOT
- BLUE_PRIME_LOOT_MEM
- PURPLE_PRIME_LOOT
- PURPLE_PRIME_LOOT_MEM
- SS_SECOND_LOOT
- WHITE_SECOND_LOOT
- GREEN_SECOND_LOOT
- BLUE_SECOND_LOOT
- PURPLE_SECOND_LOOT
- MIN_CHAPTER_FOR_ELITE
- FIGHT_PIT_CONTENT_UPDATE_LOCK
- CRYPT_RECOMMENDED_POWER_SCALAR
- MIN_STONE_FOR_10X_GOLD_CHEST
- CAMPAIGN_LOOT_LIMIT
- BLOCKED_LIST_LIMIT
- THOUGHT_BUBBLE_MIN_LEVEL
- THOUGHT_BUBBLE_PROBABILITY
- MAX_RARITY
- EXP_DECANTER_CHANCE
- EXP_FLASK_CHANCE
- EXP_PHILTER_CHANCE
- EXP_VIAL_CHANCE
- BOSS_PIT_ATTEMPTS
- PROMO_CODE_ENABLED
- COLISEUM_THREE_ATTACKS
- ORANGE_PRIME_LOOT
- ORANGE_PRIME_LOOT_MEM
- ORANGE_SECOND_LOOT
- CHAT_APP_BUTTON
- CHAT_APP_IMAGE_LINK
- CHAT_APP_UPSELL
- PM_ROOM_LIMIT
- FRIEND_LIMIT
- SYMMETRIC_LOOT
- SYMMETRIC_LOOT_MEM
- ALLOWED_UNACKNOWLEDGED_CHESTS
- TIME_ZONE_CHANGE_INTERVAL
- STAMINA_GENERATION_INTERVAL
- SKILL_POINT_GENERATION_INTERVAL
- GOLD_CHEST_GENERATION_INTERVAL
- SOUL_CHEST_GENERATION_INTERVAL
- PURPLE_CHEST_GENERATION_INTERVAL
- ORANGE_CHEST_GENERATION_INTERVAL
- PURPLE_CHEST_ENABLED
- ORANGE_CHEST_ENABLED
- SECOND_GOLD_CHEST_GENERATION_INTERVAL
- STAMINA_HARD_CAP
- STAMINA_PURCHASE_AMOUNT
- SKILL_POINT_PURCHASE_AMOUNT
- STONE_SHRINE_GENERATION_INTERVAL
- CRYSTAL_SHRINE_GENERATION_INTERVAL
- STONE_SHRINE_ROLL_CAPACITY
- CRYSTAL_SHRINE_ROLL_CAPACITY
- RAID_TICKETS_PURCHASE_AMOUNT
- QUICK_ATTACK_ENABLED
- QUICK_ATTACK_PLAY_SPEED

### com.perblue.rpg.game.data.misc.UserValues [LOAD ERROR: null]

### VIPFeature (enum)
`com.perblue.rpg.game.data.misc.VIPFeature`
extends `java.lang.Enum`

**Fields (56):**
- `private static final VIPFeature[] $VALUES`
- `public static final VIPFeature ALCHEMY`
- `public static final VIPFeature ARENA_BATTLES_PER_RESET`
- `public static final VIPFeature BLACK_MARKET_PERM`
- `public static final VIPFeature BONUS_DIAMOND_PERCENT`
- `public static final VIPFeature BOOTY_CAVES`
- `public static final VIPFeature BOSS_PIT_BETTER_REWARDS`
- `public static final VIPFeature BOSS_PIT_RUNS`
- `public static final VIPFeature CHALLENGES_COOLDOWN`
- `public static final VIPFeature CHALLENGE_RESETS`
- `public static final VIPFeature CLEAR_COLISEUM_COOLDOWN`
- `public static final VIPFeature CLEAR_FIGHT_PIT_COOLDOWN`
- `public static final VIPFeature COLISEUM_RESET`
- `public static final VIPFeature DIAMONDS_ADMIRATION`
- `public static final VIPFeature DOUBLE_RUNE_OFFERING_CHANCE`
- `public static final VIPFeature ELITE_RESET`
- `public static final VIPFeature ENCHANT_MAX`
- `public static final VIPFeature EXPEDITION_GOLD_BONUS`
- `public static final VIPFeature EXPEDITION_RUN`
- `public static final VIPFeature EXPEDITION_TOKEN_BONUS`
- `public static final VIPFeature EXTRA_FREE_STAMINA`
- `public static final VIPFeature EXTRA_STAMINA_CAP`
- `public static final VIPFeature EXTRA_WAR_PICK_REWARDS`
- `public static final VIPFeature FAST_FORWARD`
- `public static final VIPFeature FIGHT_PIT_RESET`
- `public static final VIPFeature FREE_MERCHANT_RESETS`
- `public static final VIPFeature FREE_RUNE_REMOVALS`
- `public static final VIPFeature GUILD_ADMIRATION`
- `public static final VIPFeature GUILD_COIN_BONUS`
- `public static final VIPFeature GUILD_RAID_GOLD_MULT`
- `public static final VIPFeature MAX_LEVEL_FROM_XP`
- `public static final VIPFeature MERCENARY_HALL_HEROES`
- `public static final VIPFeature MOUNTAIN_COOLDOWN`
- `public static final VIPFeature MOUNTAIN_RESETS`
- `public static final VIPFeature PEDDLER_PERM`
- `public static final VIPFeature POWER_POINTS`
- `public static final VIPFeature RAID_10`
- `public static final VIPFeature RAID_BOSS_PIT`
- `public static final VIPFeature RAID_CHALLENGES`
- `public static final VIPFeature RAID_MOUNTAIN`
- `public static final VIPFeature RAID_TICKETS`
- `public static final VIPFeature RAID_TICKET_PURCHASE_LIMIT`
- `public static final VIPFeature REFILL_POWER_POINTS`
- `public static final VIPFeature RUNICITE_ALCHEMY`
- `public static final VIPFeature SIGN_IN_MULTIPLIER`
- `public static final VIPFeature SILVER_CHEST_GENERATION`
- `public static final VIPFeature SOULMART_RESETS`
- `public static final VIPFeature SOUL_CHEST`
- `public static final VIPFeature STAMINA_HOURS`
- `public static final VIPFeature STAMINA_PURCHASE`
- `public static final VIPFeature TEMPLE_TOKEN_MULT`
- `public static final VIPFeature USE_RAID_TICKETS`
- `public static final VIPFeature VIP_CHAT`
- `public static final VIPFeature VIP_TICKETS`
- `public static final VIPFeature WAR_TOKEN_BONUS`
- `public static final VIPFeature WEEKLY_FREE_ITEMS`

**Methods (6):**
- `boolean isEverFeature()`
- `boolean isNewFeature(int)`
- `boolean isEverPerk()`
- `boolean shouldHide(IUser)`
- `VIPFeature[] values()`
- `VIPFeature valueOf(String)`

**Constants (55):**
- VIP_TICKETS
- EXPEDITION_RUN
- USE_RAID_TICKETS
- BONUS_DIAMOND_PERCENT
- RAID_TICKETS
- STAMINA_PURCHASE
- ALCHEMY
- RUNICITE_ALCHEMY
- REFILL_POWER_POINTS
- ELITE_RESET
- FAST_FORWARD
- FIGHT_PIT_RESET
- COLISEUM_RESET
- CLEAR_FIGHT_PIT_COOLDOWN
- CLEAR_COLISEUM_COOLDOWN
- RAID_10
- VIP_CHAT
- RAID_CHALLENGES
- RAID_MOUNTAIN
- POWER_POINTS
- SILVER_CHEST_GENERATION
- CHALLENGES_COOLDOWN
- MOUNTAIN_COOLDOWN
- GUILD_COIN_BONUS
- GUILD_RAID_GOLD_MULT
- TEMPLE_TOKEN_MULT
- ENCHANT_MAX
- WAR_TOKEN_BONUS
- PEDDLER_PERM
- EXPEDITION_TOKEN_BONUS
- EXPEDITION_GOLD_BONUS
- SOUL_CHEST
- BLACK_MARKET_PERM
- BOSS_PIT_BETTER_REWARDS
- MERCENARY_HALL_HEROES
- SOULMART_RESETS
- RAID_BOSS_PIT
- BOSS_PIT_RUNS
- ARENA_BATTLES_PER_RESET
- FREE_MERCHANT_RESETS
- EXTRA_STAMINA_CAP
- EXTRA_FREE_STAMINA
- STAMINA_HOURS
- DOUBLE_RUNE_OFFERING_CHANCE
- FREE_RUNE_REMOVALS
- SIGN_IN_MULTIPLIER
- MOUNTAIN_RESETS
- CHALLENGE_RESETS
- EXTRA_WAR_PICK_REWARDS
- WEEKLY_FREE_ITEMS
- RAID_TICKET_PURCHASE_LIMIT
- MAX_LEVEL_FROM_XP
- BOOTY_CAVES
- GUILD_ADMIRATION
- DIAMONDS_ADMIRATION

### com.perblue.rpg.game.data.misc.VIPStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.mountain.MountainStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.rune.GeneralRuneDropTableStats [LOAD ERROR: Could not initialize class com.perblue.rpg.game.data.misc.Unlockables]

### com.perblue.rpg.game.data.rune.RuneStats [LOAD ERROR: Could not initialize class com.perblue.rpg.game.data.rune.RuneStats]

### ClientChat (class)
`com.perblue.rpg.game.data.social.ClientChat`

**Fields (3):**
- `public Chat chat`
- `public boolean isNew`
- `public int likes`

### SocialDataManager (class)
`com.perblue.rpg.game.data.social.SocialDataManager`

**Fields (17):**
- `private static final String LAST_CHAT_ROOM = lastChatRoom`
- `private static final String LAST_MESSAGE_USER_ID = lastMessageUserID`
- `private static final Map MAX_HISTORY`
- `public static final int MAX_VISIBLE_LIKES = 9999`
- `private Set blockedUsers`
- `private List chatLists`
- `private Set dataListeners`
- `private Map friends`
- `private List globalChat`
- `private List guildWallChat`
- `private List heroChat`
- `private List kingdomChat`
- `private long lastChatPreviewTime`
- `private long mostRecentChatTime`
- `private Map playerNameCache`
- `private Map pmRooms`
- `private List vipChat`

**Methods (51):**
- `boolean shouldShowChatAppButton()`
- `boolean shouldShowChatAppImageLink()`
- `boolean shouldShowChatAppUpsell()`
- `void clearTemporaryClientChats(UnitType)`
- `String getCachedPlayerName(long)`
- `long getLastChatPreviewTime()`
- `boolean hasPendingFriendRequest()`
- `void initializeBlockedUsers(Set)`
- `void setLastChatPreviewTime(long)`
- `int getMaxHistory(ChatRoomType)`
- `boolean isGuildOrWallChat(ClientChat)`
- `boolean isGuildWall(ClientChat)`
- `void removeChat(long)`
- `void removeChat(Chat, List)`
- `void setSticky(ClientChat, boolean)`
- `void updateChat(Chat)`
- `void addChat(Chat, boolean, boolean, long)`
- `boolean isBlocked(long)`
- `void addPMRoom(PMRoomSummary, boolean)`
- `List getChatForRoom(ChatType, ChatRoomType)`
- `void addChatAppUpsell()`
- `long getNextChatTime()`
- `void addChatPMHide(BasicUserInfo)`
- `void addFriend(Friend)`
- `void addPMThread(PMThread)`
- `void addRulesChat()`
- `void updateName(BasicUserInfo)`
- `int getLikes(Chat)`
- `boolean canRemoveGuildChat(ClientChat, ChatType)`
- `void checkNameUpdate(BasicUserInfo)`
- `boolean blockUser(long)`
- `void clearChatRoom(ChatType, ChatRoomType)`
- `void clearFriends()`
- `void clearNewStatus(ChatRoomType, long)`
- `Map getPMRooms()`
- `void ensurePlayerCached(BasicUserInfo)`
- `int getBlockedUserSize()`
- `Friend getFriend(long)`
- `Collection getFriends()`
- `a getLastChatRoom()`
- `int getNewCount(ChatRoomType)`
- `void handleHeroWall(HeroWall)`
- `boolean isFriend(long)`
- `void markRoomRead(ChatType, ChatRoomType)`
- `void removePMRoom(long)`
- `void setLastChatRoom(ChatRoomType, long)`
- `void unblockUser(long)`
- `void removeSocialDataListener(SocialDataListener)`
- `void addSocialDataListener(SocialDataListener)`
- `boolean isSticky(ClientChat)`
- `void reset()`

### SoundData (class)
`com.perblue.rpg.game.data.sound.SoundData`

**Fields (2):**
- `private Sounds sound`
- `private SoundType type`

**Methods (4):**
- `void setSound(Sounds)`
- `Sounds getSound()`
- `SoundType getSoundType()`
- `void setSoundType(SoundType)`

### SoundUtil (class)
`com.perblue.rpg.game.data.sound.SoundUtil`

**Fields (4):**
- `public static final Map CACHED_SOUND_LOCATIONS`
- `private static Log LOG`
- `public static final Map SOUND_HIT_DATA`
- `private static final Map UNIT_MAPPING`

**Methods (12):**
- `float getProbability(String, boolean)`
- `void requireUnitSounds(UnitType, BaseScreen)`
- `void requireUnitSounds(Unit, BaseScreen)`
- `void requireUnitSounds(UnitData, BaseScreen)`
- `void handleSoundEventDefault(Entity, Event)`
- `AnimationStateListener getBaseSound(EnvEntity)`
- `AnimationStateListener getBaseSound(Entity)`
- `AnimationStateListener getBaseSound(Unit)`
- `AnimationStateListener getBaseSound(Projectile)`
- `void loadRaidInstance(RaidInstance, BaseScreen)`
- `float getVolume(String, boolean)`

### com.perblue.rpg.game.data.titantemple.TitanTempleStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.tutorial.TutorialStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.AbyssDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.AncientDwarfStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.AngelDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.AngelicHeraldStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.AquaticManStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.BansheeStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.BardbarianStats [LOAD ERROR: null]

### BaseUnitStats (class)
`com.perblue.rpg.game.data.unit.BaseUnitStats`
extends `com.perblue.rpg.game.data.BaseStats`

**Fields (4):**
- `public final float[] AGILITY`
- `public final float[] INTELLECT`
- `public final float[] STRENGTH`
- `private final EnumSet columns`

**Methods (2):**
- `void saveStat(int, Col, String)`

### com.perblue.rpg.game.data.unit.BlackWingStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.BoneDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.BrozerkerStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.BulwarkAngelStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.BurntOneStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.CatapultKnightStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.CentaurOfAttentionStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.ClawManStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.CosmicElfStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.CrimsonWitchStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.CursedStatueStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.CyclopsWizardStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DarkDraculStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DarkHeroStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DarkHorseStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DeepDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DemonTotemStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DiggerMoleStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DoppelgangerStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DragonLadyStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DragonSlayerStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DragzillaStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DruidinatrixStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DungeonManStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DustDevilStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.DwarvenArcherStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.ElectroyetiStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.EternalEnchanterStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.FaithHealerStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.ForgottenDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.FrostGiantStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.GeneralUnitStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.GenieStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.GrandHuntressStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.GreedDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.GroovyDruidStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.HydraStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.KaraokeKingStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.KrakenKingStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.LastDefenderStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.MagicDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.MedusaStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.MinotaurStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.MistressManicureStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.MoonDrakeStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.NinjaDwarfStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.OrcMonkStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.PchAnubisDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.PirateStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.PlagueEntrepreneurStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.PlantSoulStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.PolemasterStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.ProjectileStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.RabidDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.RagingRevenantStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.RollerWarriorStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.SadisticDancerStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.SatyrStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.SavageCutieStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.ShadowAssassinStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.ShadowofSvenStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.SilentSpiritStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.SkeletonKingStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.SnapDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.SnapperBoneStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.SniperWolfStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.SojournerSorceressStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.SpectralDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.SpiderQueenStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.SpikeyDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.StepladderBrothersStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.StormDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.StowawayStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.SunSeekerStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.TombAngelStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.TripleThreatStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.UmlautTheFirstStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.UnicorgiStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.UnitStats [LOAD ERROR: Could not initialize class com.perblue.rpg.game.data.unit.GeneralUnitStats]

### UnitStatsMath (class)
`com.perblue.rpg.game.data.unit.UnitStatsMath`

**Fields (7):**
- `public static final USMConfig CONFIG_ALL`
- `public static final USMConfig CONFIG_CURRENT_ENCHANTING`
- `public static final USMConfig CONFIG_CURRENT_GEAR_ONLY`
- `public static final USMConfig CONFIG_GROWTH_ONLY`
- `public static final USMConfig CONFIG_GROWTH_ONLY_NO_RUNES`
- `public static final USMConfig CONFIG_NO_RUNES`
- `private static ac contextPool`

**Methods (13):**
- `float getCurrentGearStat(IHero, StatType, USMConfig)`
- `float getRunesStatAdditions(IHero, StatType, boolean)`
- `float getRunesSetBonusAdditions(IHero, StatType)`
- `float getRunesStatMultiplications(IHero, StatType, boolean)`
- `float getRunesSetBonusPercentages(IHero, StatType)`
- `float getAdditive(IHero, StatType, USMConfig, CacheContext)`
- `float getCoreDerivatives(IHero, StatType, USMConfig, CacheContext)`
- `float getGrowth(IHero, StatType, USMConfig)`
- `float getMultiplicitive(IHero, StatType, USMConfig)`
- `float getSkillsStat(IHero, StatType)`
- `float getStat(IHero, StatType, USMConfig)`
- `float getStat(IHero, StatType, USMConfig, CacheContext)`
- `void getStats(IHero, x, USMConfig)`

### com.perblue.rpg.game.data.unit.UnripeMythologyStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.UnstableUnderstudyStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.VermilionPriestessStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.VileBileStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.VoidWyvernStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.VultureDragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.WeeWitchStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.WeredragonStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.WhiteTigerStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.WhiteTigressStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.ZombieSquireStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.AbyssDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.AncientDwarfGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.AngelDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.AngelicHeraldGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.AquaticManGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.BansheeGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.BardbarianGearStats [LOAD ERROR: null]

### BaseHeroGearStats (class)
`com.perblue.rpg.game.data.unit.gear.BaseHeroGearStats`
extends `com.perblue.common.stats.GeneralStats`

**Fields (1):**
- `protected Map gear`

**Methods (8):**
- `Iterable getGear(Rarity)`
- `void onMissingRow(String, Rarity)`
- `void initStats(int, int)`
- `void saveStat(Rarity, HeroEquipSlot, String)`
- `ItemType getItem(Rarity, HeroEquipSlot)`
- `Iterable getItems(Rarity)`

### com.perblue.rpg.game.data.unit.gear.BlackWingGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.BoneDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.BrozerkerGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.BulwarkAngelGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.BurntOneGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.CatapultKnightGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.CentaurOfAttentionGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.ClawManGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.CosmicElfGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.CrimsonWitchGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.CursedStatueGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.CyclopsWizardGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DarkDraculGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DarkHeroGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DarkHorseGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DeepDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DemonTotemGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DiggerMoleGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DoppelgangerGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DragonLadyGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DragonSlayerGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DragzillaGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DruidinatrixGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DungeonManGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DustDevilGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.DwarvenArcherGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.ElectroyetiGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.EternalEnchanterGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.FaithHealerGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.ForgottenDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.FrostGiantGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.GenieGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.GrandHuntressGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.GreedDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.GroovyDruidGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.HydraGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.KaraokeKingGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.KrakenKingGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.LastDefenderGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.MagicDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.MedusaGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.MinotaurGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.MistressManicureGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.MoonDrakeGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.NinjaDwarfGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.OrcMonkGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.PchAnubisDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.PirateGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.PlagueEntrepreneurGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.PlantSoulGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.PolemasterGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.RabidDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.RagingRevenantGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.RollerWarriorGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.SadisticDancerGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.SatyrGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.SavageCutieGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.ShadowAssassinGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.ShadowofSvenGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.SilentSpiritGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.SkeletonKingGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.SnapDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.SnapperBoneGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.SniperWolfGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.SojournerSorceressGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.SpectralDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.SpiderQueenGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.SpikeyDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.StepladderBrothersGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.StormDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.StowawayGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.SunSeekerGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.TombAngelGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.TripleThreatGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.UmlautTheFirstGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.UnicorgiGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.UnripeMythologyGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.UnstableUnderstudyGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.VermilionPriestessGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.VileBileGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.VoidWyvernGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.VultureDragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.WeeWitchGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.WeredragonGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.WhiteTigerGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.WhiteTigressGearStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.gear.ZombieSquireGearStats [LOAD ERROR: null]

### BaseSkillsStats (class)
`com.perblue.rpg.game.data.unit.skill.BaseSkillsStats`
extends `com.perblue.rpg.game.data.BaseStats`

**Fields (1):**
- `private final EnumSet columns`

**Methods (2):**
- `void saveStat(int, Col, String)`

### com.perblue.rpg.game.data.unit.skill.GeneralSkillStats [LOAD ERROR: null]

### com.perblue.rpg.game.data.unit.skill.SkillStats [LOAD ERROR: Could not initialize class com.perblue.rpg.game.data.unit.skill.SkillStats]

### com.perblue.rpg.game.data.war.GuildWarStats [LOAD ERROR: Could not initialize class com.perblue.rpg.game.data.chest.GeneralGearDropTableStats]

### StatEffectType (enum)
`com.perblue.rpg.game.data.war.StatEffectType`
extends `java.lang.Enum`

**Fields (5):**
- `private static final StatEffectType[] $VALUES`
- `public static final StatEffectType FLAT`
- `public static final StatEffectType GROWTH`
- `public static final StatEffectType PERCENT`
- `public static final StatEffectType SET`

**Methods (2):**
- `StatEffectType[] values()`
- `StatEffectType valueOf(String)`

**Constants (4):**
- PERCENT
- FLAT
- GROWTH
- SET

### TagColor (enum)
`com.perblue.rpg.game.data.war.TagColor`
extends `java.lang.Enum`

**Fields (4):**
- `private static final TagColor[] $VALUES`
- `public static final TagColor GREEN`
- `public static final TagColor RED`
- `public static final TagColor WHITE`

**Methods (2):**
- `TagColor[] values()`
- `TagColor valueOf(String)`

**Constants (3):**
- WHITE
- GREEN
- RED

### WarModifierData (class)
`com.perblue.rpg.game.data.war.WarModifierData`

**Fields (10):**
- `private TagColor attackerColor`
- `private TagColor defenderColor`
- `private StatType effect`
- `private float effectAmount`
- `private long effectDuration`
- `private a effectTags`
- `private StatEffectType effectType`
- `private a effectUnit`
- `private HeroTag iconTag`
- `private WarModifierType type`

**Methods (25):**
- `TagColor getAttackerColor()`
- `TagColor getDefenderColor()`
- `StatType getEffect()`
- `a getEffectTags()`
- `HeroTag getIconTag()`
- `boolean matchesTag(UnitData, int)`
- `void setAttackerColor(TagColor)`
- `void setDefenderColor(TagColor)`
- `void setEffect(StatType)`
- `void setEffectTags(a)`
- `void setIconTag(HeroTag)`
- `boolean matchesUnit(Unit, WarModifierData)`
- `float getEffectAmount()`
- `void initializeOnUnit(Unit)`
- `StatEffectType getEffectType()`
- `a getEffectUnit()`
- `void setEffectAmount(float)`
- `void setEffectDuration(long)`
- `void setEffectType(StatEffectType)`
- `void setEffectUnit(a)`
- `long getEffectDuration()`
- `void setType(WarModifierType)`
- `boolean matches(UnitData, int, a)`
- `boolean matches(UnitData, int, UnitSet)`
- `WarModifierType getType()`

### WarModifierSetType (enum)
`com.perblue.rpg.game.data.war.WarModifierSetType`
extends `java.lang.Enum`

**Fields (23):**
- `private static final WarModifierSetType[] $VALUES`
- `public static final WarModifierSetType AN_APPLE_A_DAY`
- `public static final WarModifierSetType ARMOR_UP`
- `public static final WarModifierSetType BORING_ARGUMENT`
- `public static final WarModifierSetType BRAINS_OVER_BRAWN`
- `public static final WarModifierSetType CLEAN_ENERGY`
- `public static final WarModifierSetType DRAGON_WAGON`
- `public static final WarModifierSetType HIGH_NOON`
- `public static final WarModifierSetType HORROR_FLICK_SPECIAL`
- `public static final WarModifierSetType IRON_ARMOR`
- `public static final WarModifierSetType LEVEL_1`
- `public static final WarModifierSetType NONE`
- `public static final WarModifierSetType POINTY_THINGS`
- `public static final WarModifierSetType POMPEII`
- `public static final WarModifierSetType RAINY_DAY`
- `public static final WarModifierSetType RIP`
- `public static final WarModifierSetType SHARP_OBJECTS`
- `public static final WarModifierSetType STEROIDS`
- `public static final WarModifierSetType THE_HUNT`
- `public static final WarModifierSetType THRIFT_SHOP`
- `public static final WarModifierSetType TOP_DRAGONSOUL_CHEF`
- `public static final WarModifierSetType TOXIC_DARTS`
- `public static final WarModifierSetType WISDOM_KILLS`

**Methods (2):**
- `WarModifierSetType[] values()`
- `WarModifierSetType valueOf(String)`

**Constants (22):**
- NONE
- RIP
- DRAGON_WAGON
- HORROR_FLICK_SPECIAL
- SHARP_OBJECTS
- LEVEL_1
- BORING_ARGUMENT
- THE_HUNT
- ARMOR_UP
- AN_APPLE_A_DAY
- POMPEII
- TOP_DRAGONSOUL_CHEF
- RAINY_DAY
- IRON_ARMOR
- CLEAN_ENERGY
- STEROIDS
- POINTY_THINGS
- HIGH_NOON
- THRIFT_SHOP
- WISDOM_KILLS
- BRAINS_OVER_BRAWN
- TOXIC_DARTS

### WarModifierType (enum)
`com.perblue.rpg.game.data.war.WarModifierType`
extends `java.lang.Enum`

**Fields (42):**
- `private static final WarModifierType[] $VALUES`
- `public static final WarModifierType ACHILLES_HEEL`
- `public static final WarModifierType ARMOR_PIERCER`
- `public static final WarModifierType BLACK_DEATH`
- `public static final WarModifierType BOOK_OF_DRAGONS`
- `public static final WarModifierType BOOK_OF_TESLA`
- `public static final WarModifierType BRAINS_OVER_BRAWN`
- `public static final WarModifierType CHAIN_MAIL`
- `public static final WarModifierType DRAGON_SLAYER`
- `public static final WarModifierType DRUGS`
- `public static final WarModifierType DULL_POINT`
- `public static final WarModifierType DUMB_PROTAGONISTS`
- `public static final WarModifierType EASY_PICKINGS`
- `public static final WarModifierType ENHANCED_CONDUCTIVITY`
- `public static final WarModifierType FAITH`
- `public static final WarModifierType FRIED_UP`
- `public static final WarModifierType HEAVY_AMMO`
- `public static final WarModifierType HYDRATION`
- `public static final WarModifierType IRON_PROTECTION`
- `public static final WarModifierType JUICED`
- `public static final WarModifierType LONG_DAY`
- `public static final WarModifierType MASTER_OF_DEATH`
- `public static final WarModifierType MASTER_OF_THE_SEA`
- `public static final WarModifierType NOOBS`
- `public static final WarModifierType NO_PAIN_NO_GAIN`
- `public static final WarModifierType OLD_AMMO`
- `public static final WarModifierType PACIFIST`
- `public static final WarModifierType PIERCED_TONGUE`
- `public static final WarModifierType POT_SMASH`
- `public static final WarModifierType QUICK_DRAW`
- `public static final WarModifierType SLASHER`
- `public static final WarModifierType SLICE_AND_DICE`
- `public static final WarModifierType SMART_SHOPPERS`
- `public static final WarModifierType STEALBACK`
- `public static final WarModifierType SUNNY_DAY`
- `public static final WarModifierType TAMER_OF_FIRE`
- `public static final WarModifierType TENDER_MEAT`
- `public static final WarModifierType THROMBOCYTOPENIA`
- `public static final WarModifierType TOXIC_DARTS`
- `public static final WarModifierType UNFOCUSED`
- `public static final WarModifierType VAMPIRESOUL`
- `public static final WarModifierType XL_OUT_OF_STOCK`

**Methods (2):**
- `WarModifierType[] values()`
- `WarModifierType valueOf(String)`

**Constants (41):**
- IRON_PROTECTION
- ENHANCED_CONDUCTIVITY
- ARMOR_PIERCER
- UNFOCUSED
- BLACK_DEATH
- THROMBOCYTOPENIA
- SUNNY_DAY
- OLD_AMMO
- ACHILLES_HEEL
- FRIED_UP
- SLICE_AND_DICE
- TENDER_MEAT
- NO_PAIN_NO_GAIN
- JUICED
- BOOK_OF_DRAGONS
- DRAGON_SLAYER
- MASTER_OF_THE_SEA
- PACIFIST
- LONG_DAY
- POT_SMASH
- VAMPIRESOUL
- CHAIN_MAIL
- SLASHER
- DULL_POINT
- PIERCED_TONGUE
- HYDRATION
- DRUGS
- STEALBACK
- TAMER_OF_FIRE
- BOOK_OF_TESLA
- MASTER_OF_DEATH
- BRAINS_OVER_BRAWN
- TOXIC_DARTS
- HEAVY_AMMO
- QUICK_DRAW
- EASY_PICKINGS
- FAITH
- NOOBS
- DUMB_PROTAGONISTS
- XL_OUT_OF_STOCK
- SMART_SHOPPERS

## Package: com.perblue.rpg.game.crafting (1 classes)

### CraftingHelper (class)
`com.perblue.rpg.game.crafting.CraftingHelper`

**Methods (8):**
- `int getCraftSuccessMaxAmount(IUser, Rarity)`
- `int getCraftSuccessAmount(IUser, Rarity)`
- `boolean isCraftSuccessActive(IUser)`
- `long getCraftSuccessEndTime(IUser)`
- `boolean craftItem(IUser, ItemType, int)`
- `ItemType getMissingPart(IUser, ItemType)`
- `void craftItemRecursive(IUser, ItemType, y, int)`
- `void craftItemRecursive(IUser, ItemType, int)`

## Package: com.perblue.rpg.game.event (62 classes)

### BattleOverEvent (class)
`com.perblue.rpg.game.event.BattleOverEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Methods (1):**
- `void reset()`

### BirthdayRewardEvent (class)
`com.perblue.rpg.game.event.BirthdayRewardEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Fields (2):**
- `private int points`
- `private RewardDrop reward`

**Methods (4):**
- `RewardDrop getReward()`
- `int getPoints()`
- `void reset()`
- `void reset(RewardDrop, int)`

### BuffAddedEvent (class)
`com.perblue.rpg.game.event.BuffAddedEvent`
extends `com.perblue.rpg.game.event.TargetedEvent`

**Fields (1):**
- `private IBuff buff`

**Methods (3):**
- `void setBuff(IBuff)`
- `IBuff getBuff()`
- `void reset()`

### BuffUpdatedEvent (class)
`com.perblue.rpg.game.event.BuffUpdatedEvent`
extends `com.perblue.rpg.game.event.TargetedEvent`

**Fields (3):**
- `private IBuff buff`
- ` boolean removed`
- `private long timeLeft`

**Methods (7):**
- `long getTimeLeft()`
- `void setBuff(IBuff)`
- `void setRemoved(boolean)`
- `void setTimeLeft(long)`
- `boolean wasRemoved()`
- `IBuff getBuff()`
- `void reset()`

### ContestsUpdateEvent (class)
`com.perblue.rpg.game.event.ContestsUpdateEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Methods (1):**
- `void reset()`

### CritEvent (class)
`com.perblue.rpg.game.event.CritEvent`
extends `com.perblue.rpg.game.event.Event`

**Fields (5):**
- `private float critChance`
- `private DamageSource damageSource`
- `private boolean didCrit`
- `private Entity source`
- `private Entity target`

**Methods (7):**
- `float getCritChance()`
- `Entity getSoruce()`
- `boolean isDidCrit()`
- `DamageSource getDamageSource()`
- `Object getEventSource()`
- `Entity getTarget()`
- `void reset()`

### EntityAlphaEvent (class)
`com.perblue.rpg.game.event.EntityAlphaEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (2):**
- `private float alpha`
- `private float duration`

**Methods (4):**
- `float getAlpha()`
- `void setAlpha(float)`
- `void setDuration(float)`
- `float getDuration()`

### EntityAttackEvent (class)
`com.perblue.rpg.game.event.EntityAttackEvent`
extends `com.perblue.rpg.game.event.Event`

**Fields (3):**
- `protected IEntity attacker`
- `protected final boolean attackerIsSource`
- `protected IEntity target`

**Methods (6):**
- `IEntity getAttacker()`
- `void setAttacker(IEntity)`
- `Object getEventSource()`
- `IEntity getTarget()`
- `void setTarget(IEntity)`
- `void reset()`

### EntityColorEvent (class)
`com.perblue.rpg.game.event.EntityColorEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (1):**
- `private b color`

**Methods (2):**
- `b getColor()`
- `void setColor(b)`

### EntityDamageEvent (class)
`com.perblue.rpg.game.event.EntityDamageEvent`
extends `com.perblue.rpg.game.event.EntityAttackEvent`

**Fields (7):**
- `private float damage`
### com.perblue.rpg.game.event.EntityDamageEvent [LOAD ERROR: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$DamageSubType disagree on InnerClasses attribute]

### EntityDeathEvent (class)
`com.perblue.rpg.game.event.EntityDeathEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (1):**
- `private float damageDone`

**Methods (2):**
- `void setDamageDone(float)`
- `float getDamageDone()`

### EntityDestroyedEvent (class)
`com.perblue.rpg.game.event.EntityDestroyedEvent`
extends `com.perblue.rpg.game.event.EntityAttackEvent`

### EntityEnergyChangeEvent (class)
`com.perblue.rpg.game.event.EntityEnergyChangeEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (2):**
- `private float energyChange`
- `private boolean shouldAnimate`

**Methods (5):**
- `boolean shouldAnimate()`
- `EntityEnergyChangeEvent setShouldAnimate(boolean)`
- `float getEnergyChange()`
- `void setEnergyChange(float)`
- `void reset()`

### EntityEvent (class)
`com.perblue.rpg.game.event.EntityEvent`
extends `com.perblue.rpg.game.event.Event`

**Fields (1):**
- `protected Entity source`

**Methods (4):**
- `Entity getSource()`
- `Object getEventSource()`
- `void setSource(Entity)`
- `void reset()`

### EntityHPChangeEvent (class)
`com.perblue.rpg.game.event.EntityHPChangeEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (2):**
- `private float damageDone`
- `private String message`

**Methods (5):**
- `void setDamageDone(float)`
- `void setMessage(String)`
- `float getDamageDone()`
- `String getMessage()`
- `void reset()`

### EntityHealEvent (class)
`com.perblue.rpg.game.event.EntityHealEvent`
extends `com.perblue.rpg.game.event.EntityAttackEvent`

**Fields (4):**
### com.perblue.rpg.game.event.EntityHealEvent [LOAD ERROR: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$DamageSourceType disagree on InnerClasses attribute]

### EntityHitEvent (class)
`com.perblue.rpg.game.event.EntityHitEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

### EntityKnockbackEvent (class)
`com.perblue.rpg.game.event.EntityKnockbackEvent`
extends `com.perblue.rpg.game.event.EntityAttackEvent`

**Fields (1):**
- `private float distance`

**Methods (3):**
- `float getDistance()`
- `void setDistance(float)`
- `void reset()`

### EntityPlaySoundEvent (class)
`com.perblue.rpg.game.event.EntityPlaySoundEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (2):**
- `private String soundName`
- `private float volume`

**Methods (5):**
- `String getSoundName()`
- `float getVolume()`
- `void setSoundName(String)`
- `void setVolume(float)`
- `void reset()`

### EntityRemovedEvent (class)
`com.perblue.rpg.game.event.EntityRemovedEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (1):**
- `protected boolean isReload`

**Methods (2):**
- `boolean isReload()`
- `void reset()`

### EntityReviveEvent (class)
`com.perblue.rpg.game.event.EntityReviveEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

### EntityScaleChangedEvent (class)
`com.perblue.rpg.game.event.EntityScaleChangedEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

### EntitySpawnParticleEvent (class)
`com.perblue.rpg.game.event.EntitySpawnParticleEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (2):**
- `private long duration`
- `private ParticleType type`

**Methods (5):**
- `void setDuration(long)`
- `void setType(ParticleType)`
- `long getDuration()`
- `ParticleType getType()`
- `void reset()`

### EntityStopSoundsEvent (class)
`com.perblue.rpg.game.event.EntityStopSoundsEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (1):**
- `private boolean fadeOut`

**Methods (3):**
- `boolean isFadeOut()`
- `void setFadeOut(boolean)`
- `void reset()`

### Event (class)
`com.perblue.rpg.game.event.Event`

**Fields (1):**
- `private ac pool`

**Methods (3):**
- `Object getEventSource()`
- `void setPool(ac)`
- `void free()`

### EventHelper (class)
`com.perblue.rpg.game.event.EventHelper`

**Fields (5):**
- `private static final List EVENTS`
- `private static final Map LISTENERS_BY_EVENT_TYPE`
- `private static final Map LISTENERS_BY_ID`
- `private static final Map SOURCE_LISTENERS`
- `private static boolean inTransaction`

**Methods (17):**
- `al getSourceListenerArray(Class, Object, boolean)`
- `void dispatchEventInternal(Event)`
- `void printSourceListeners()`
- `void beginTransaction()`
- `void clearAll()`
- `void commitTransaction()`
- `void printListeners(Map)`
- `void revertTransaction()`
- `void addEventListener(String, Class, EventListener)`
- `void addEventListener(Class, EventListener)`
- `void removeEventListener(Class, EventListener)`
- `void removeEventListener(String, Class)`
- `void removeAllSourceEventListeners(Object)`
- `void dispatchImmediateEvent(Event)`
- `EventListener addSourceEventListener(Class, Object, EventListener)`
- `void removeSourceEventListener(Object, EventListener)`
- `void dispatchEvent(Event)`

### EventListener (interface)
`com.perblue.rpg.game.event.EventListener`

**Methods (1):**
- `void onEvent(Event)`

### EventPool (class)
`com.perblue.rpg.game.event.EventPool`

**Fields (2):**
- `private static Log LOG`
- `public static boolean server`

**Methods (59):**
- `StopAllSoundsEvent createStopAllSoundsEvent()`
- `TempleUpdateEvent createTempleUpdateEvent(Entity, float, float)`
- `UnitViewIconEvent createUnitViewIconEvent(Unit)`
- `WallClockTickEvent createWallClockTickEvent()`
- `ContestsUpdateEvent createContestsUpdateEvent()`
- `EntityAlphaEvent createEntityAlphaEvent(Entity, float, float)`
- `EntityColorEvent createEntityColorEvent(Entity, b)`
- `EntityHitEvent createEntityHitEvent(Entity)`
- `RankingDataChangeEvent createRankingDataChangeEvent(RankType)`
- `SpecialEventsChangeEvent createSpecialEventsChangeEvent()`
- `PauseEntitySoundsEvent createPauseEntitySoundsEvent()`
- `ResumeEntitySoundsEvent createResumeEntitySoundsEvent()`
- `BattleOverEvent createBattleOverEvent()`
- `TutorialTransitionEvent createTutorialTransitionEvent(IUser, TutorialTransition)`
- `ShadowFadeEvent createShadowFadeEvent(Unit, float, float)`
- `MimeResetSoundsEvent createMimeResetSoundsEvent()`
- `MimeHushSoundsEvent createMimeHushSoundsEvent(float, float)`
- `ShowEntityHealEvent createShowEntityHealEvent(Entity, Entity, float, CombatSkill)`
- `EntitySpawnParticleEvent createEntityParticleEvent(Entity, ParticleType, boolean)`
- `EntitySpawnParticleEvent createEntityParticleEvent(Entity, ParticleType, long)`
- `EntitySpawnParticleEvent createEntityParticleEvent(Entity, ParticleType)`
- `UnitViewCounterEvent createUnitViewCounterEvent(Entity, int)`
- `EntityRemovedEvent createEntityRemovedEvent(Entity)`
- `BirthdayRewardEvent createBirthdayEvent(RewardDrop, int)`
- `UserChangeEvent createUserChangeEvent(IUser, UserProperty)`
- `MerchantRefreshedEvent createMerchantRefreshedEvent(MerchantType)`
- `EntityDestroyedEvent createEntityDestroyedEvent(Entity, Entity)`
### com.perblue.rpg.game.event.EventPool [LOAD ERROR: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$DamageSourceType disagree on InnerClasses attribute]

### ForceFullEnergy (class)
`com.perblue.rpg.game.event.ForceFullEnergy`
extends `com.perblue.rpg.game.event.Event`

**Fields (1):**
- `private UnitType heroType`

**Methods (3):**
- `UnitType getHeroType()`
- `Object getEventSource()`
- `void reset()`

### GlobalEvent (class)
`com.perblue.rpg.game.event.GlobalEvent`
extends `com.perblue.rpg.game.event.Event`

**Methods (1):**
- `Object getEventSource()`

### HeroesForHireUpdateEvent (class)
`com.perblue.rpg.game.event.HeroesForHireUpdateEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Fields (1):**
- `private HeroesForHire heroesForHire`

**Methods (2):**
- `HeroesForHire getHeroesForHire()`
- `void reset()`

### LegendaryQuestCompletedEvent (class)
`com.perblue.rpg.game.event.LegendaryQuestCompletedEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Fields (4):**
- `private UnitType hero`
- `private int questID`
- `private boolean unlockedSkill`
- `private IUser user`

**Methods (5):**
- `boolean unlockedSkill()`
- `int getQuestID()`
- `IUser getUser()`
- `UnitType getHero()`
- `void reset()`

### LegendaryQuestDataEvent (class)
`com.perblue.rpg.game.event.LegendaryQuestDataEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (2):**
- `private int count`
- `private String dataType`

**Methods (5):**
- `String getDataType()`
- `LegendaryQuestDataEvent setCount(int)`
- `LegendaryQuestDataEvent setDataType(String)`
- `int getCount()`
- `void reset()`

### MerchantFoundEvent (class)
`com.perblue.rpg.game.event.MerchantFoundEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Fields (2):**
- `private MerchantType type`
- `private IUser user`

**Methods (3):**
- `IUser getUser()`
- `MerchantType getType()`
- `void reset()`

### MerchantRefreshedEvent (class)
`com.perblue.rpg.game.event.MerchantRefreshedEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Fields (1):**
- `private MerchantType type`

**Methods (3):**
- `void setType(MerchantType)`
- `MerchantType getType()`
- `void reset()`

### MimeHushSoundsEvent (class)
`com.perblue.rpg.game.event.MimeHushSoundsEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Fields (2):**
- `private float effectReduction`
- `private float musicReduction`

**Methods (5):**
- `float getEffectReduction()`
- `float getMusicReduction()`
- `void setEffectReduction(float)`
- `void setMusicReduction(float)`
- `void reset()`

### MimeResetSoundsEvent (class)
`com.perblue.rpg.game.event.MimeResetSoundsEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Methods (1):**
- `void reset()`

### NextStageEvent (class)
`com.perblue.rpg.game.event.NextStageEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Methods (1):**
- `void reset()`

### PauseCombatEvent (class)
`com.perblue.rpg.game.event.PauseCombatEvent`
extends `com.perblue.rpg.game.event.Event`

**Methods (2):**
- `Object getEventSource()`
- `void reset()`

### PauseEntitySoundsEvent (class)
`com.perblue.rpg.game.event.PauseEntitySoundsEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Methods (1):**
- `void reset()`

### ProjectileLandEvent (class)
`com.perblue.rpg.game.event.ProjectileLandEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (1):**
- `private Entity targetObj`

**Methods (3):**
- `Entity getTargetObj()`
- `void setTargetObj(Entity)`
- `void reset()`

### RankingDataChangeEvent (class)
`com.perblue.rpg.game.event.RankingDataChangeEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Fields (1):**
- `private RankType type`

**Methods (3):**
- `void setType(RankType)`
- `RankType getType()`
- `void reset()`

### ResumeCombatEvent (class)
`com.perblue.rpg.game.event.ResumeCombatEvent`
extends `com.perblue.rpg.game.event.Event`

**Methods (2):**
- `Object getEventSource()`
- `void reset()`

### ResumeEntitySoundsEvent (class)
`com.perblue.rpg.game.event.ResumeEntitySoundsEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Methods (1):**
- `void reset()`

### RuneEvent (class)
`com.perblue.rpg.game.event.RuneEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Fields (2):**
- `private IRune rune`
- `private RuneEventType type`

**Methods (5):**
- `RuneEventType getRuneEventType()`
- `void setRuneEventType(RuneEventType)`
- `void setRune(IRune)`
- `IRune getRune()`
- `void reset()`

### ShadowFadeEvent (class)
`com.perblue.rpg.game.event.ShadowFadeEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (2):**
- `private float alpha`
- `private float duration`

**Methods (4):**
- `float getAlpha()`
- `void setAlpha(float)`
- `void setDuration(float)`
- `float getDuration()`

### ShowCombatTextEvent (class)
`com.perblue.rpg.game.event.ShowCombatTextEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (2):**
- `private String text`
- `private CombatTextType textType`

**Methods (5):**
- `String getText()`
- `CombatTextType getTextType()`
- `void setTextType(CombatTextType)`
- `void setText(String)`
- `void reset()`

### ShowEnergyChangeEvent (class)
`com.perblue.rpg.game.event.ShowEnergyChangeEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (2):**
- `private float energyChange`
- `private CombatSkill sourceSkill`

**Methods (5):**
- `float getEnergyChange()`
- `void setEnergyChange(float)`
- `void setSourceSkill(CombatSkill)`
- `CombatSkill getSourceSkill()`
- `void reset()`

### ShowEntityDodgeEvent (class)
`com.perblue.rpg.game.event.ShowEntityDodgeEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (1):**
- `private CombatSkill sourceSkill`

**Methods (3):**
- `void setSourceSkill(CombatSkill)`
- `CombatSkill getSourceSkill()`
- `void reset()`

### ShowEntityHealEvent (class)
`com.perblue.rpg.game.event.ShowEntityHealEvent`
extends `com.perblue.rpg.game.event.EntityAttackEvent`

**Fields (3):**
- `private float healAmount`
- `private q hitPosition`
- `private CombatSkill skillSource`

**Methods (7):**
- `q getHitPosition()`
- `void setHealAmount(float)`
- `float getHealAmount()`
- `void setHitPosition(q)`
- `void setSkillSource(CombatSkill)`
- `CombatSkill getSkillSource()`
- `void reset()`

### SkillStatusChangeEvent (class)
`com.perblue.rpg.game.event.SkillStatusChangeEvent`
extends `com.perblue.rpg.game.event.TargetedEvent`

**Fields (2):**
- `private CombatSkill skill`
- `private SkillStatusChangeType type`

**Methods (5):**
- `SkillStatusChangeType getStatusChangeType()`
- `void setStatusChangeType(SkillStatusChangeType)`
- `CombatSkill getSkill()`
- `void setSkill(CombatSkill)`
- `void reset()`

### SpawnParticleEvent (class)
`com.perblue.rpg.game.event.SpawnParticleEvent`
extends `com.perblue.rpg.game.event.TargetedEvent`

**Fields (8):**
- `private long duration`
- `private boolean flipX`
- `private Bone followBone`
- `private Entity followEntity`
- `private float scale`
- `private Direction sourceDir`
- `private q sourceLoc`
- `private ParticleType type`

**Methods (16):**
- `SpawnParticleEvent setFlipX(boolean)`
- `Bone getFollowBone()`
- `Entity getFollowEntity()`
- `Direction getSourceDirection()`
- `q getSourceLoc()`
- `boolean isFlipX()`
- `SpawnParticleEvent setFollow(Entity, Bone)`
- `SpawnParticleEvent setSourceDirection(Direction)`
- `SpawnParticleEvent setSourceLoc(q)`
- `SpawnParticleEvent setDuration(long)`
- `float getScale()`
- `SpawnParticleEvent setScale(float)`
- `SpawnParticleEvent setType(ParticleType)`
- `long getDuration()`
- `ParticleType getType()`
- `void reset()`

### SpecialEventsChangeEvent (class)
`com.perblue.rpg.game.event.SpecialEventsChangeEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Methods (1):**
- `void reset()`

### StopAllSoundsEvent (class)
`com.perblue.rpg.game.event.StopAllSoundsEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Methods (1):**
- `void reset()`

### TargetedEvent (class)
`com.perblue.rpg.game.event.TargetedEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (2):**
- `private q targetLoc`
- `private Entity targetObj`

**Methods (5):**
- `Entity getTargetObj()`
- `void setTargetLoc(q)`
- `q getTargetLoc()`
- `void setTargetObj(Entity)`
- `void reset()`

### TempleUpdateEvent (class)
`com.perblue.rpg.game.event.TempleUpdateEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (2):**
- `private float colorAmount`
- `private float scale`

**Methods (4):**
- `void setColorAmount(float)`
- `float getColorAmount()`
- `float getScale()`
- `void setScale(float)`

### UnitStatChangeEvent (class)
`com.perblue.rpg.game.event.UnitStatChangeEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (3):**
- `private String message`
- `private boolean showBuffedStats`
- `private String unitStatString`

**Methods (7):**
- `boolean showBuffedStats()`
- `String getUnitStatString()`
- `void setShowBuffedStats(boolean)`
- `void setUnitStatString(Unit)`
- `void setMessage(String)`
- `String getMessage()`
- `void reset()`

### UnitViewCounterEvent (class)
`com.perblue.rpg.game.event.UnitViewCounterEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

**Fields (1):**
- `private int count`

**Methods (3):**
- `void setCount(int)`
- `int getCount()`
- `void reset()`

### UnitViewIconEvent (class)
`com.perblue.rpg.game.event.UnitViewIconEvent`
extends `com.perblue.rpg.game.event.EntityEvent`

### UserChangeEvent (class)
`com.perblue.rpg.game.event.UserChangeEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Fields (3):**
- `private int prevTeamLevel`
- `private UserProperty property`
- `private IUser user`

**Methods (7):**
- `int getPrevTeamLevel()`
- `void setUser(IUser)`
- `IUser getUser()`
- `void setPrevTeamLevel(int)`
- `UserProperty getProperty()`
- `void setProperty(UserProperty)`
- `void reset()`

### WallClockEventHelper (class)
`com.perblue.rpg.game.event.WallClockEventHelper`

**Fields (2):**
- `private static boolean active`
- `private static int timerTaskLensLevel`

**Methods (7):**
- `void tick()`
- `void addLens()`
- `void removeLens()`
- `void cancel()`
- `void start()`
- `void stop()`

### WallClockTickEvent (class)
`com.perblue.rpg.game.event.WallClockTickEvent`
extends `com.perblue.rpg.game.event.GlobalEvent`

**Fields (1):**
- `protected long timestamp`

**Methods (4):**
- `long getTime()`
- `void setTime(long)`
- `void setTime()`
- `void reset()`

## Package: com.perblue.rpg.assets (7 classes)

### AssetNameMapping (class)
`com.perblue.rpg.assets.AssetNameMapping`

**Fields (3):**
- `public static final Map UNIT_NAME_MAP`
- `private static Pattern particleNameMatcher`
- `private static Pattern particleSkinPattern`

**Methods (4):**
- `UnitType getUnitTypeForParticle(String)`
- `UnitType getUnitTypeForParticle(ParticleType)`
- `String getAssetFolder(UnitType)`
- `ItemType getSkinForParticle(String)`

### ExternalContentHelper (class)
`com.perblue.rpg.assets.ExternalContentHelper`

**Fields (3):**
- `public static final int BOOT_DOWNLOAD_TEAM_LEVEL = 5`
- `public static final int FORCE_DOWNLOAD_TEAM_LEVEL = 10`
- `public static final int STARTING_CHAPTERS = 2`

**Methods (3):**
- `boolean checkForExternalContent(String, UnitType, Runnable)`
- `String getLastUnitAssetPath()`
- `Set getInternalUnits()`

### RPGAssetManager (class)
`com.perblue.rpg.assets.RPGAssetManager`
extends `com.badlogic.gdx.a.e`

**Fields (11):**
- `private static final int DEFAULT_SCALE = 20`
- `private static Log LOG`
- `public static final String PARTICLES_PREFIX = world/particles/`
- `public static String SOUND_EXTENSION`
- `private static String SOUND_PREFIX`
- `private static int maxDisplayDataCacheSize`
- `private a displayDataCache`
- `private boolean hasWorldAdditional`
- `private RPGFileHandleResolver resolver`
- `private ShaderFactory shaderFactory`
- `private a toRemove`

**Methods (53):**
- `RPGAnimatedSprite loadAnimation$36df04e3(String, String, RotationType, float, int, AssetLoadType)`
- `boolean handleLoadDisplayData(DisplayData, AssetLoadType)`
- `RPGSprite loadSprite(String, String, RotationType, AssetLoadType)`
- `g loadParticleEffect(ParticleType, AssetLoadType)`
- `g loadParticleEffect(ParticleType)`
- `void unloadDisplayData(DisplayData)`
- `void unloadParticleEffect(ParticleType)`
- `void loadDisplayData(DisplayData)`
- `b copyBitmapFont(b)`
- `a copyBitmapFontData(a)`
- `boolean isSpineDataLoading(DisplayData)`
- `int getScaledFontSize(int)`
- `void loadIso(a)`
- `void loadIso(String, Class, c)`
- `void loadIso(String, Class)`
- `boolean assetExists(String)`
- `void asyncPreLoad()`
- `void setMaxDisplayDataCacheSize(int)`
- `boolean evictOldestFromCache()`
- `String getPlaceholderFilename(Class)`
- `String getSortedDiagnostics()`
- `int getUsedTextureMemory()`
- `Object getIso(String, Class)`
- `d getResolver()`
- `b getScaledFont(String, int, boolean)`
- `b getScaledFont(String, int)`
- `b getUnScaledFont(String, int)`
- `b lookupMusic(String, a)`
- `c lookupSound(String, a)`
- `void printDiagnostics()`
- `void taskFailed(a, RuntimeException)`
- `void loadPreLoadedAssets()`
- `void resetServerSelection()`
- `void setHasWorldAdditional(boolean)`
- `void testParticlePerf()`
- `void unloadAsset(Object)`
- `void cleanCache()`
- `boolean getHasWorldAdditional()`
- `a getParticleEffect(ParticleType)`
- `RPGShader getShader(ShaderAttribute, ShaderAttribute, ShaderAttribute)`
- `RPGShader getShader(ShaderAttribute, ShaderAttribute)`
- `RPGShader getShader(ShaderAttribute)`
- `RPGShader getShader()`
- `RPGShader getShader(long)`
- `boolean isLoading(String)`
- `boolean isLoaded(String, Class)`
- `boolean isLoaded(String)`
- `void unload(String)`
- `void addToCache(DisplayData)`
- `Object get(String, Class)`
- `Object get(String)`
- `void load(String, Class, c)`
- `void error(a, Throwable)`

### com.perblue.rpg.assets.RPGFileHandleResolver [LOAD ERROR: Could not initialize class com.perblue.rpg.game.data.campaign.CampaignStats]

### SoundProbabilities (class)
`com.perblue.rpg.assets.SoundProbabilities`

**Fields (1):**
- `public static final EnumMap SOUND_PROBABILITIES`

### SoundVolumes (class)
`com.perblue.rpg.assets.SoundVolumes`

**Fields (1):**
- `public static final EnumMap SOUND_VOLUMES`

### Sounds (enum)
`com.perblue.rpg.assets.Sounds`
extends `java.lang.Enum`

**Fields (1301):**
- `private static final Sounds[] $VALUES`
- `private static final Map VARIATIONS`
- `public static final Sounds arena_promotion`
- `public static final Sounds battle_music`
- `public static final Sounds boss_pit_ui_defeated`
- `public static final Sounds boss_pit_ui_fled`
- `public static final Sounds bossbattle_music_boss`
- `public static final Sounds bosspit_evil_wizard_death`
- `public static final Sounds bosspit_evil_wizard_flee`
- `public static final Sounds bosspit_evil_wizard_summon`
- `public static final Sounds bosspit_evil_wizard_throw_fire`
- `public static final Sounds bosspit_evil_wizard_throw_hit`
- `public static final Sounds bosspit_evil_wizard_victory`
- `public static final Sounds bosspit_giant_plant_bite_attack_1`
- `public static final Sounds bosspit_giant_plant_bite_attack_2`
- `public static final Sounds bosspit_giant_plant_bite_attack_idle`
- `public static final Sounds bosspit_giant_plant_bite_attack_pullback`
- `public static final Sounds bosspit_giant_plant_bite_attack_swallow`
- `public static final Sounds bosspit_giant_plant_bite_cliff_fall`
- `public static final Sounds bosspit_giant_plant_bite_pullback_to_pot`
- `public static final Sounds bosspit_giant_plant_death`
- `public static final Sounds bosspit_giant_plant_flee_loop`
- `public static final Sounds bosspit_giant_plant_flee_start`
- `public static final Sounds bosspit_giant_plant_hide`
- `public static final Sounds bosspit_giant_plant_hop`
- `public static final Sounds bosspit_giant_plant_minion_attack_loop`
- `public static final Sounds bosspit_giant_plant_minion_death`
- `public static final Sounds bosspit_giant_plant_minion_growth`
- `public static final Sounds bosspit_giant_plant_poison`
- `public static final Sounds bosspit_giant_plant_pot_breaking`
- `public static final Sounds bosspit_giant_plant_spew`
- `public static final Sounds bosspit_giant_plant_unhide`
- `public static final Sounds bosspit_giant_plant_victory`
- `public static final Sounds bosspit_gold_colossus_attack`
- `public static final Sounds bosspit_gold_colossus_coin_fire`
- `public static final Sounds bosspit_gold_colossus_coin_hit`
- `public static final Sounds bosspit_gold_colossus_death`
- `public static final Sounds bosspit_gold_colossus_eat`
- `public static final Sounds bosspit_gold_colossus_jump`
- `public static final Sounds bosspit_gold_colossus_land`
- `public static final Sounds bosspit_gold_colossus_victory`
- `public static final Sounds bosspit_gold_colossus_wind`
- `public static final Sounds bosspit_music_colossus`
- `public static final Sounds bosspit_music_plant`
- `public static final Sounds bosspit_music_wizard`
- `public static final Sounds cave_difficulty`
- `public static final Sounds chest_open_chest`
- `public static final Sounds chest_open_single_item`
- `public static final Sounds chest_open_ten_items`
- `public static final Sounds chest_open_ten_single_item`
- `public static final Sounds chest_open_ten_single_item_A`
- `public static final Sounds chest_open_ten_single_item_B`
- `public static final Sounds combat_hero_skill`
- `public static final Sounds combat_physical_hit`
- `public static final Sounds combat_stun_1`
- `public static final Sounds combat_stun_2`
- `public static final Sounds combat_stun_3`
- `public static final Sounds craft_success`
- `public static final Sounds crafting_moment`
- `public static final Sounds diamonds_to_gold`
- `public static final Sounds enchanting_choose_hero`
- `public static final Sounds enchanting_get_item`
- `public static final Sounds expeditions_chest_open_reward`
- `public static final Sounds expeditions_fightbutton_press`
- `public static final Sounds expeditions_green_checkmark`
- `public static final Sounds expeditions_wave_end_chest_open`
- `public static final Sounds expeditions_wave_start`
- `public static final Sounds gear_into_frame`
- `public static final Sounds got_a_new_hero`
- `public static final Sounds green_mist`
- `public static final Sounds hero_abyss_dragon_basic_attack`
- `public static final Sounds hero_abyss_dragon_basic_attack_hit`
- `public static final Sounds hero_abyss_dragon_death`
- `public static final Sounds hero_abyss_dragon_skill1_impact`
- `public static final Sounds hero_abyss_dragon_skill1_start`
- `public static final Sounds hero_abyss_dragon_skill2`
- `public static final Sounds hero_abyss_dragon_skill3_attack`
- `public static final Sounds hero_abyss_dragon_skill4_attack`
- `public static final Sounds hero_abyss_dragon_victory`
- `public static final Sounds hero_ancient_dwarf_attack`
- `public static final Sounds hero_ancient_dwarf_attack_hit`
- `public static final Sounds hero_ancient_dwarf_death`
- `public static final Sounds hero_ancient_dwarf_skill1_buff`
- `public static final Sounds hero_ancient_dwarf_skill1_shout`
- `public static final Sounds hero_ancient_dwarf_skill2_hit_1`
- `public static final Sounds hero_ancient_dwarf_skill2_hit_2`
- `public static final Sounds hero_ancient_dwarf_skill2_hit_3`
- `public static final Sounds hero_ancient_dwarf_skill2_shoot_1`
- `public static final Sounds hero_ancient_dwarf_skill2_shoot_2`
- `public static final Sounds hero_ancient_dwarf_skill2_shoot_3`
- `public static final Sounds hero_ancient_dwarf_skill3_healing`
- `public static final Sounds hero_ancient_dwarf_skill3_hoof`
- `public static final Sounds hero_ancient_dwarf_skill4_hit`
- `public static final Sounds hero_ancient_dwarf_skill4_shoot`
- `public static final Sounds hero_ancient_dwarf_victory`
- `public static final Sounds hero_angel_dragon_attack`
- `public static final Sounds hero_angel_dragon_attack_hit`
- `public static final Sounds hero_angel_dragon_skill1_end`
- `public static final Sounds hero_angel_dragon_skill1_loop`
- `public static final Sounds hero_angel_dragon_skill1_start`
- `public static final Sounds hero_angel_dragon_skill2_end`
- `public static final Sounds hero_angel_dragon_skill2_loop`
- `public static final Sounds hero_angel_dragon_skill2_start`
- `public static final Sounds hero_angel_dragon_skill4`
- `public static final Sounds hero_angelic_herald_attack`
- `public static final Sounds hero_angelic_herald_skill1`
- `public static final Sounds hero_angelic_herald_skill2`
- `public static final Sounds hero_angelic_herald_skill2_attack1`
- `public static final Sounds hero_angelic_herald_skill2_attack2`
- `public static final Sounds hero_angelic_herald_skill5_shimmer`
- `public static final Sounds hero_angelic_herald_skill5_trumpet`
- `public static final Sounds hero_apprentice_attack_fire_1`
- `public static final Sounds hero_apprentice_attack_fire_2`
- `public static final Sounds hero_apprentice_attack_hit`
- `public static final Sounds hero_apprentice_death`
- `public static final Sounds hero_apprentice_skill1_bust_through_ground`
- `public static final Sounds hero_apprentice_skill1_fire`
- `public static final Sounds hero_apprentice_skill2_fire`
- `public static final Sounds hero_apprentice_skill2_hit`
- `public static final Sounds hero_apprentice_skill3_fire`
- `public static final Sounds hero_apprentice_skill3_hit`
- `public static final Sounds hero_apprentice_skill6_shot`
- `public static final Sounds hero_apprentice_victory`
- `public static final Sounds hero_aquatic_man_attack_fire`
- `public static final Sounds hero_aquatic_man_attack_hit`
- `public static final Sounds hero_aquatic_man_death`
- `public static final Sounds hero_aquatic_man_skill1_fire`
- `public static final Sounds hero_aquatic_man_skill1_hit`
- `public static final Sounds hero_aquatic_man_skill2_fire`
- `public static final Sounds hero_aquatic_man_skill2_spout`
- `public static final Sounds hero_aquatic_man_skill2_swirl`
- `public static final Sounds hero_aquatic_man_skill3_buff`
- `public static final Sounds hero_aquatic_man_skill3_fire`
- `public static final Sounds hero_aquatic_man_skill3_hit`
- `public static final Sounds hero_aquatic_man_victory`
- `public static final Sounds hero_banshee_attack_fire`
- `public static final Sounds hero_banshee_attack_hit`
- `public static final Sounds hero_banshee_death`
- `public static final Sounds hero_banshee_skill1_end`
- `public static final Sounds hero_banshee_skill1_loop_1`
- `public static final Sounds hero_banshee_skill1_loop_2`
- `public static final Sounds hero_banshee_skill1_start`
- `public static final Sounds hero_banshee_skill3_loop`
- `public static final Sounds hero_banshee_skill3_start`
- `public static final Sounds hero_banshee_victory`
- `public static final Sounds hero_bardbarian_attack_fire`
- `public static final Sounds hero_bardbarian_attack_hit`
- `public static final Sounds hero_bardbarian_death`
- `public static final Sounds hero_bardbarian_skill1`
- `public static final Sounds hero_bardbarian_skill2_fire`
- `public static final Sounds hero_bardbarian_skill2_hit_wave`
- `public static final Sounds hero_bardbarian_skill3_hit`
- `public static final Sounds hero_bardbarian_victory`
- `public static final Sounds hero_black_wing_attack`
- `public static final Sounds hero_black_wing_death`
- `public static final Sounds hero_black_wing_skill1`
- `public static final Sounds hero_black_wing_skill1_fire`
- `public static final Sounds hero_black_wing_skill1_impact`
- `public static final Sounds hero_black_wing_skill2`
- `public static final Sounds hero_black_wing_skill4`
- `public static final Sounds hero_black_wing_victory`
- `public static final Sounds hero_bone_dragon_attack_fire`
- `public static final Sounds hero_bone_dragon_attack_hit`
- `public static final Sounds hero_bone_dragon_death`
- `public static final Sounds hero_bone_dragon_skill1_fire`
- `public static final Sounds hero_bone_dragon_skill1_hit`
- `public static final Sounds hero_bone_dragon_skill1_smoulder`
- `public static final Sounds hero_bone_dragon_skill2_fire`
- `public static final Sounds hero_bone_dragon_skill2_hit`
- `public static final Sounds hero_bone_dragon_skill3_fire`
- `public static final Sounds hero_bone_dragon_skill3_heal`
- `public static final Sounds hero_bone_dragon_victory`
- `public static final Sounds hero_brozerker_attack_1`
- `public static final Sounds hero_brozerker_attack_2`
- `public static final Sounds hero_brozerker_boobs`
- `public static final Sounds hero_brozerker_bros`
- `public static final Sounds hero_brozerker_death`
- `public static final Sounds hero_brozerker_foes`
- `public static final Sounds hero_brozerker_skill1`
- `public static final Sounds hero_brozerker_skill2_dmg`
- `public static final Sounds hero_brozerker_skill2_heal`
- `public static final Sounds hero_brozerker_skill3`
- `public static final Sounds hero_brozerker_victory`
- `public static final Sounds hero_brute_dragon_attack`
- `public static final Sounds hero_brute_dragon_death`
- `public static final Sounds hero_brute_dragon_skill1_fire`
- `public static final Sounds hero_brute_dragon_skill1_hit`
- `public static final Sounds hero_brute_dragon_skill2_bubbling`
- `public static final Sounds hero_brute_dragon_skill2_fire`
- `public static final Sounds hero_brute_dragon_skill3`
- `public static final Sounds hero_brute_dragon_skill6`
- `public static final Sounds hero_brute_dragon_victory`
- `public static final Sounds hero_bulwark_angel_attack`
- `public static final Sounds hero_bulwark_angel_skill1`
- `public static final Sounds hero_bulwark_angel_skill2_end`
- `public static final Sounds hero_bulwark_angel_skill2_loop`
- `public static final Sounds hero_bulwark_angel_skill2_start`
- `public static final Sounds hero_bulwark_angel_skill3_loop`
- `public static final Sounds hero_bulwark_angel_skill3_start`
- `public static final Sounds hero_burnt_one_attack`
- `public static final Sounds hero_burnt_one_death`
- `public static final Sounds hero_burnt_one_skill1_active_end`
- `public static final Sounds hero_burnt_one_skill1_active_start`
- `public static final Sounds hero_burnt_one_skill1_passive_end`
- `public static final Sounds hero_burnt_one_skill1_passive_loop`
- `public static final Sounds hero_burnt_one_skill1_passive_start`
- `public static final Sounds hero_burnt_one_skill3_hit`
- `public static final Sounds hero_burnt_one_skill3_lava`
- `public static final Sounds hero_catapult_knight_attack_fire`
- `public static final Sounds hero_catapult_knight_attack_hit`
- `public static final Sounds hero_catapult_knight_death`
- `public static final Sounds hero_catapult_knight_skill1_fire`
- `public static final Sounds hero_catapult_knight_skill1_hit`
- `public static final Sounds hero_catapult_knight_skill2_fire`
- `public static final Sounds hero_catapult_knight_skill2_hit`
- `public static final Sounds hero_catapult_knight_skill3`
- `public static final Sounds hero_catapult_knight_victory`
- `public static final Sounds hero_centaur_attack_fire_1`
- `public static final Sounds hero_centaur_attack_fire_2`
- `public static final Sounds hero_centaur_attack_hit_1`
- `public static final Sounds hero_centaur_attack_hit_2`
- `public static final Sounds hero_centaur_death`
- `public static final Sounds hero_centaur_skill1_fire`
- `public static final Sounds hero_centaur_skill1_hit`
- `public static final Sounds hero_centaur_skill2_fire`
- `public static final Sounds hero_centaur_skill2_hit`
- `public static final Sounds hero_centaur_skill3_fire`
- `public static final Sounds hero_centaur_skill3_hit`
- `public static final Sounds hero_centaur_victory`
- `public static final Sounds hero_claw_man_basic_attack`
- `public static final Sounds hero_claw_man_death`
- `public static final Sounds hero_claw_man_skill1`
- `public static final Sounds hero_claw_man_skill1_jump`
- `public static final Sounds hero_claw_man_skill2_1`
- `public static final Sounds hero_claw_man_skill2_2`
- `public static final Sounds hero_claw_man_skill4`
- `public static final Sounds hero_claw_man_victory`
- `public static final Sounds hero_cursed_statue_attack_beam`
- `public static final Sounds hero_cursed_statue_attack_fire`
- `public static final Sounds hero_cursed_statue_death`
- `public static final Sounds hero_cursed_statue_skill1_fire`
- `public static final Sounds hero_cursed_statue_skill1_hit`
- `public static final Sounds hero_cursed_statue_skill2_fire`
- `public static final Sounds hero_cursed_statue_skill2_switch`
- `public static final Sounds hero_cursed_statue_skill3`
- `public static final Sounds hero_cursed_statue_victory`
- `public static final Sounds hero_cyclops_wizard_attack_fire`
- `public static final Sounds hero_cyclops_wizard_attack_hit`
- `public static final Sounds hero_cyclops_wizard_death`
- `public static final Sounds hero_cyclops_wizard_skill1`
- `public static final Sounds hero_cyclops_wizard_skill1_hit`
- `public static final Sounds hero_cyclops_wizard_skill2_fire`
- `public static final Sounds hero_cyclops_wizard_skill2_hit`
- `public static final Sounds hero_cyclops_wizard_skill3_fire`
- `public static final Sounds hero_cyclops_wizard_skill3_hit`
- `public static final Sounds hero_cyclops_wizard_victory`
- `public static final Sounds hero_dark_hero_attack`
- `public static final Sounds hero_dark_hero_skill1_end`
- `public static final Sounds hero_dark_hero_skill1_loop`
- `public static final Sounds hero_dark_hero_skill1_start`
- `public static final Sounds hero_dark_hero_skill2`
- `public static final Sounds hero_dark_hero_skill4`
- `public static final Sounds hero_dark_hero_victory`
- `public static final Sounds hero_dark_horse_attack`
- `public static final Sounds hero_dark_horse_death`
- `public static final Sounds hero_dark_horse_skill1`
- `public static final Sounds hero_dark_horse_skill2`
- `public static final Sounds hero_dark_horse_skill3`
- `public static final Sounds hero_dark_horse_victory`
- `public static final Sounds hero_deep_dragon_attack_fire`
- `public static final Sounds hero_deep_dragon_attack_hit`
- `public static final Sounds hero_deep_dragon_death`
- `public static final Sounds hero_deep_dragon_skill1_end`
- `public static final Sounds hero_deep_dragon_skill1_loop_1`
- `public static final Sounds hero_deep_dragon_skill1_loop_2`
- `public static final Sounds hero_deep_dragon_skill1_start`
- `public static final Sounds hero_deep_dragon_skill2`
- `public static final Sounds hero_deep_dragon_skill3_fire`
- `public static final Sounds hero_deep_dragon_skill3_hit`
- `public static final Sounds hero_deep_dragon_skill6_hit`
- `public static final Sounds hero_deep_dragon_victory`
- `public static final Sounds hero_demon_totem1_skill5_end`
- `public static final Sounds hero_demon_totem_attack_stacked`
- `public static final Sounds hero_demon_totem_skill2_stacked`
- `public static final Sounds hero_demon_totem_skill3_stacked`
- `public static final Sounds hero_demon_totem_t1_attack`
- `public static final Sounds hero_demon_totem_t1_death`
- `public static final Sounds hero_demon_totem_t1_skill1`
- `public static final Sounds hero_demon_totem_t1_skill2`
- `public static final Sounds hero_demon_totem_t1_skill3`
- `public static final Sounds hero_demon_totem_t1_skill6`
- `public static final Sounds hero_demon_totem_t1_victory`
- `public static final Sounds hero_demon_totem_t2_attack`
- `public static final Sounds hero_demon_totem_t2_death`
- `public static final Sounds hero_demon_totem_t2_skill1`
- `public static final Sounds hero_demon_totem_t2_skill2`
- `public static final Sounds hero_demon_totem_t2_skill3`
- `public static final Sounds hero_demon_totem_t2_skill6`
- `public static final Sounds hero_demon_totem_t2_victory`
- `public static final Sounds hero_demon_totem_t3_attack`
- `public static final Sounds hero_demon_totem_t3_death`
- `public static final Sounds hero_demon_totem_t3_skill1`
- `public static final Sounds hero_demon_totem_t3_skill2`
- `public static final Sounds hero_demon_totem_t3_skill3`
- `public static final Sounds hero_demon_totem_t3_skill6`
- `public static final Sounds hero_demon_totem_t3_victory`
- `public static final Sounds hero_demon_totem_victory_stacked`
- `public static final Sounds hero_digger_mole_attack`
- `public static final Sounds hero_digger_mole_attack_hit`
- `public static final Sounds hero_digger_mole_death`
- `public static final Sounds hero_digger_mole_skill1_1`
- `public static final Sounds hero_digger_mole_skill1_2`
- `public static final Sounds hero_digger_mole_skill1_3`
- `public static final Sounds hero_digger_mole_skill2`
- `public static final Sounds hero_digger_mole_skill2_hit`
- `public static final Sounds hero_digger_mole_skill2_molark`
- `public static final Sounds hero_digger_mole_skill3`
- `public static final Sounds hero_digger_mole_skill3_molark`
- `public static final Sounds hero_digger_mole_skill4_guard`
- `public static final Sounds hero_digger_mole_skill4_hit`
- `public static final Sounds hero_digger_mole_skill4_jump`
- `public static final Sounds hero_digger_mole_skill5`
- `public static final Sounds hero_digger_mole_victory`
- `public static final Sounds hero_doppelganger_attack_fire`
- `public static final Sounds hero_doppelganger_attack_hit`
- `public static final Sounds hero_doppelganger_death`
- `public static final Sounds hero_doppelganger_mimi_hit`
- `public static final Sounds hero_doppelganger_mimi_loop_1`
- `public static final Sounds hero_doppelganger_mimi_loop_2`
- `public static final Sounds hero_doppelganger_mimi_loop_3`
- `public static final Sounds hero_doppelganger_mimi_loop_4`
- `public static final Sounds hero_doppelganger_skill1`
- `public static final Sounds hero_doppelganger_skill1_idle_1`
- `public static final Sounds hero_doppelganger_skill1_idle_2`
- `public static final Sounds hero_doppelganger_skill2_fire`
- `public static final Sounds hero_doppelganger_skill2_hit`
- `public static final Sounds hero_doppelganger_skill3`
- `public static final Sounds hero_doppelganger_victory`
- `public static final Sounds hero_dragon_lady_attack_1`
- `public static final Sounds hero_dragon_lady_attack_2`
- `public static final Sounds hero_dragon_lady_death`
- `public static final Sounds hero_dragon_lady_skill1_fire`
- `public static final Sounds hero_dragon_lady_skill1_hit`
- `public static final Sounds hero_dragon_lady_skill2`
- `public static final Sounds hero_dragon_lady_skill3`
- `public static final Sounds hero_dragon_lady_victory`
- `public static final Sounds hero_dragon_slayer_attack`
- `public static final Sounds hero_dragon_slayer_death`
- `public static final Sounds hero_dragon_slayer_skill1`
- `public static final Sounds hero_dragon_slayer_skill3`
- `public static final Sounds hero_dragon_slayer_victory`
- `public static final Sounds hero_dragzilla_attack_fire`
- `public static final Sounds hero_dragzilla_attack_hit`
- `public static final Sounds hero_dragzilla_death`
- `public static final Sounds hero_dragzilla_foot1`
- `public static final Sounds hero_dragzilla_foot2`
- `public static final Sounds hero_dragzilla_hit`
- `public static final Sounds hero_dragzilla_skill1_fire`
- `public static final Sounds hero_dragzilla_skill1_hit`
- `public static final Sounds hero_dragzilla_skill2_fire`
- `public static final Sounds hero_dragzilla_skill2_hit`
- `public static final Sounds hero_dragzilla_victory`
- `public static final Sounds hero_druidinatrix_attack`
- `public static final Sounds hero_druidinatrix_death`
- `public static final Sounds hero_druidinatrix_skill1_fire`
- `public static final Sounds hero_druidinatrix_skill1_hit`
- `public static final Sounds hero_druidinatrix_skill2`
- `public static final Sounds hero_druidinatrix_skill3_fire`
- `public static final Sounds hero_druidinatrix_skill3_hit`
- `public static final Sounds hero_druidinatrix_victory`
- `public static final Sounds hero_druidinatrix_wings`
- `public static final Sounds hero_dungeon_man_attack`
- `public static final Sounds hero_dungeon_man_attack_dice_impact`
- `public static final Sounds hero_dungeon_man_death`
- `public static final Sounds hero_dungeon_man_skill1`
- `public static final Sounds hero_dungeon_man_skill1_hit`
- `public static final Sounds hero_dungeon_man_skill2`
- `public static final Sounds hero_dungeon_man_skill3`
- `public static final Sounds hero_dungeon_man_skill3_hit`
- `public static final Sounds hero_dungeon_man_victory`
- `public static final Sounds hero_dwarven_archer_attack_fire`
- `public static final Sounds hero_dwarven_archer_attack_hit`
- `public static final Sounds hero_dwarven_archer_death`
- `public static final Sounds hero_dwarven_archer_skill1`
- `public static final Sounds hero_dwarven_archer_skill2_fire`
- `public static final Sounds hero_dwarven_archer_skill2_hit`
- `public static final Sounds hero_dwarven_archer_skill3`
- `public static final Sounds hero_dwarven_archer_victory`
- `public static final Sounds hero_electroyeti_attack_1`
- `public static final Sounds hero_electroyeti_attack_2`
- `public static final Sounds hero_electroyeti_death`
- `public static final Sounds hero_electroyeti_skill1_fire`
- `public static final Sounds hero_electroyeti_skill1_mult_lightning_1`
- `public static final Sounds hero_electroyeti_skill2_fire`
- `public static final Sounds hero_electroyeti_skill2_hit`
- `public static final Sounds hero_electroyeti_skill3`
- `public static final Sounds hero_electroyeti_victory`
- `public static final Sounds hero_equip_item`
- `public static final Sounds hero_eternal_enchanter_attack`
- `public static final Sounds hero_eternal_enchanter_attack_hit`
- `public static final Sounds hero_eternal_enchanter_death`
- `public static final Sounds hero_eternal_enchanter_skill1_end`
- `public static final Sounds hero_eternal_enchanter_skill1_loop`
- `public static final Sounds hero_eternal_enchanter_skill1_start`
- `public static final Sounds hero_eternal_enchanter_skill2`
- `public static final Sounds hero_eternal_enchanter_skill3_end`
- `public static final Sounds hero_eternal_enchanter_skill3_loop`
- `public static final Sounds hero_eternal_enchanter_skill3_start`
- `public static final Sounds hero_eternal_enchanter_victory`
- `public static final Sounds hero_evolve_sequence`
- `public static final Sounds hero_fairy_dragon_attack_fire`
- `public static final Sounds hero_fairy_dragon_attack_hit`
- `public static final Sounds hero_fairy_dragon_death`
- `public static final Sounds hero_fairy_dragon_skill1_charge`
- `public static final Sounds hero_fairy_dragon_skill1_fire`
- `public static final Sounds hero_fairy_dragon_skill2_buff`
- `public static final Sounds hero_fairy_dragon_skill2_fire`
- `public static final Sounds hero_fairy_dragon_skill3_fire`
- `public static final Sounds hero_fairy_dragon_skill3_hit`
- `public static final Sounds hero_fairy_dragon_victory`
- `public static final Sounds hero_faith_healer_attack_fire_1`
- `public static final Sounds hero_faith_healer_attack_fire_2`
- `public static final Sounds hero_faith_healer_attack_hit`
- `public static final Sounds hero_faith_healer_death`
- `public static final Sounds hero_faith_healer_skill1`
- `public static final Sounds hero_faith_healer_skill2_fire`
- `public static final Sounds hero_faith_healer_skill3`
- `public static final Sounds hero_faith_healer_victory`
- `public static final Sounds hero_forgotten_dragon_attack`
- `public static final Sounds hero_forgotten_dragon_attack_hit`
- `public static final Sounds hero_forgotten_dragon_death`
- `public static final Sounds hero_forgotten_dragon_hit`
- `public static final Sounds hero_forgotten_dragon_skill1`
- `public static final Sounds hero_forgotten_dragon_skill1_coo`
- `public static final Sounds hero_forgotten_dragon_skill2`
- `public static final Sounds hero_forgotten_dragon_skill2_coo`
- `public static final Sounds hero_forgotten_dragon_skill3`
- `public static final Sounds hero_forgotten_dragon_skill4`
- `public static final Sounds hero_forgotten_dragon_victory`
- `public static final Sounds hero_forgotten_dragon_victory_pops`
- `public static final Sounds hero_frost_giant_attack_fire`
- `public static final Sounds hero_frost_giant_attack_hit`
- `public static final Sounds hero_frost_giant_death`
- `public static final Sounds hero_frost_giant_skill1`
- `public static final Sounds hero_frost_giant_skill2_fire`
- `public static final Sounds hero_frost_giant_skill2_hit`
- `public static final Sounds hero_frost_giant_skill3`
- `public static final Sounds hero_frost_giant_victory`
- `public static final Sounds hero_genie_attack_cow`
- `public static final Sounds hero_genie_attack_fire`
- `public static final Sounds hero_genie_death`
- `public static final Sounds hero_genie_skill1_fire`
- `public static final Sounds hero_genie_skill1_hit`
- `public static final Sounds hero_genie_skill1_loop`
- `public static final Sounds hero_genie_skill2_end`
- `public static final Sounds hero_genie_skill2_start`
- `public static final Sounds hero_genie_skill3_goat`
- `public static final Sounds hero_genie_skill3_hit`
- `public static final Sounds hero_genie_skill5_build`
- `public static final Sounds hero_genie_skill5_polymorph`
- `public static final Sounds hero_genie_victory`
- `public static final Sounds hero_grand_huntress_attack`
- `public static final Sounds hero_grand_huntress_attack_hit`
- `public static final Sounds hero_grand_huntress_death`
- `public static final Sounds hero_grand_huntress_skill1`
- `public static final Sounds hero_grand_huntress_skill1_barrage`
- `public static final Sounds hero_grand_huntress_skill1_hit`
- `public static final Sounds hero_grand_huntress_skill1_loop`
- `public static final Sounds hero_grand_huntress_skill2`
- `public static final Sounds hero_grand_huntress_skill3`
- `public static final Sounds hero_grand_huntress_skill3_hit`
- `public static final Sounds hero_grand_huntress_victory`
- `public static final Sounds hero_greedy_dragon_basic_attack`
- `public static final Sounds hero_greedy_dragon_death`
- `public static final Sounds hero_greedy_dragon_skill1_end`
- `public static final Sounds hero_greedy_dragon_skill1_explode`
- `public static final Sounds hero_greedy_dragon_skill1_loop`
- `public static final Sounds hero_greedy_dragon_skill1_start`
- `public static final Sounds hero_greedy_dragon_skill2`
- `public static final Sounds hero_greedy_dragon_skill3`
- `public static final Sounds hero_greedy_dragon_victory`
- `public static final Sounds hero_groovy_druid_attack_fire`
- `public static final Sounds hero_groovy_druid_attack_hit`
- `public static final Sounds hero_groovy_druid_death`
- `public static final Sounds hero_groovy_druid_disco_death`
- `public static final Sounds hero_groovy_druid_disco_skill1`
- `public static final Sounds hero_groovy_druid_disco_skill1_hit`
- `public static final Sounds hero_groovy_druid_disco_skill2`
- `public static final Sounds hero_groovy_druid_disco_skill2_hit`
- `public static final Sounds hero_groovy_druid_disco_skill3`
- `public static final Sounds hero_groovy_druid_skill1_fire`
- `public static final Sounds hero_groovy_druid_skill1_hit`
- `public static final Sounds hero_groovy_druid_skill2_cast`
- `public static final Sounds hero_groovy_druid_skill2_hit`
- `public static final Sounds hero_groovy_druid_skill3_cast`
- `public static final Sounds hero_groovy_druid_victory`
- `public static final Sounds hero_karaoke_king_attack`
- `public static final Sounds hero_karaoke_king_attack_hit`
- `public static final Sounds hero_karaoke_king_death`
- `public static final Sounds hero_karaoke_king_skill1_end`
- `public static final Sounds hero_karaoke_king_skill1_loop`
- `public static final Sounds hero_karaoke_king_skill1_start`
- `public static final Sounds hero_karaoke_king_skill2`
- `public static final Sounds hero_karaoke_king_skill3`
- `public static final Sounds hero_karaoke_king_skill4`
- `public static final Sounds hero_karaoke_king_victory`
- `public static final Sounds hero_karaoke_king_victory_alt`
- `public static final Sounds hero_kraken_king_attack`
- `public static final Sounds hero_kraken_king_death`
- `public static final Sounds hero_kraken_king_mechalord_attack`
- `public static final Sounds hero_kraken_king_mechalord_attack_hit`
- `public static final Sounds hero_kraken_king_mechalord_skill1_giant_tentacle`
- `public static final Sounds hero_kraken_king_mechalord_skill3`
- `public static final Sounds hero_kraken_king_skill1`
- `public static final Sounds hero_kraken_king_skill3`
- `public static final Sounds hero_kraken_king_tentacle`
- `public static final Sounds hero_kraken_king_victory`
- `public static final Sounds hero_landing`
- `public static final Sounds hero_last_defender_basic_attack_hammer`
- `public static final Sounds hero_last_defender_basic_attack_hammer_1`
- `public static final Sounds hero_last_defender_basic_attack_hammer_end`
- `public static final Sounds hero_last_defender_basic_attack_shield`
- `public static final Sounds hero_last_defender_basic_attack_shield_1`
- `public static final Sounds hero_last_defender_death`
- `public static final Sounds hero_last_defender_skill1`
- `public static final Sounds hero_last_defender_skill5`
- `public static final Sounds hero_last_defender_victory`
- `public static final Sounds hero_level_up`
- `public static final Sounds hero_magic_dragon_attack_fire`
- `public static final Sounds hero_magic_dragon_attack_hit`
- `public static final Sounds hero_magic_dragon_death`
- `public static final Sounds hero_magic_dragon_skill1_fire`
- `public static final Sounds hero_magic_dragon_skill1_hit`
- `public static final Sounds hero_magic_dragon_skill2_fire`
- `public static final Sounds hero_magic_dragon_skill2_hit`
- `public static final Sounds hero_magic_dragon_skill3_fire`
- `public static final Sounds hero_magic_dragon_skill3_generate`
- `public static final Sounds hero_magic_dragon_skill3_hit`
- `public static final Sounds hero_magic_dragon_victory`
- `public static final Sounds hero_medusa_attack_fire`
- `public static final Sounds hero_medusa_attack_hit`
- `public static final Sounds hero_medusa_death`
- `public static final Sounds hero_medusa_skill1_fire`
- `public static final Sounds hero_medusa_skill1_hit`
- `public static final Sounds hero_medusa_skill2_fire`
- `public static final Sounds hero_medusa_skill2_hit`
- `public static final Sounds hero_medusa_skill3`
- `public static final Sounds hero_medusa_victory`
- `public static final Sounds hero_minotaur_attack`
- `public static final Sounds hero_minotaur_death`
- `public static final Sounds hero_minotaur_skill1`
- `public static final Sounds hero_minotaur_skill2_hit`
- `public static final Sounds hero_minotaur_skill2_run`
- `public static final Sounds hero_minotaur_skill3`
- `public static final Sounds hero_minotaur_victory`
- `public static final Sounds hero_mistress_manicure_attack`
- `public static final Sounds hero_mistress_manicure_attack_impact`
- `public static final Sounds hero_mistress_manicure_death`
- `public static final Sounds hero_mistress_manicure_skill1_end`
- `public static final Sounds hero_mistress_manicure_skill1_loop`
- `public static final Sounds hero_mistress_manicure_skill1_start`
- `public static final Sounds hero_mistress_manicure_skill2`
- `public static final Sounds hero_mistress_manicure_skill3`
- `public static final Sounds hero_mistress_manicure_victory`
- `public static final Sounds hero_ninja_dwarf_attack_1`
- `public static final Sounds hero_ninja_dwarf_attack_2`
- `public static final Sounds hero_ninja_dwarf_death`
- `public static final Sounds hero_ninja_dwarf_skill1_hit`
- `public static final Sounds hero_ninja_dwarf_skill1_teleport`
- `public static final Sounds hero_ninja_dwarf_skill1_whirl`
- `public static final Sounds hero_ninja_dwarf_skill2_hit`
- `public static final Sounds hero_ninja_dwarf_skill2_teleport`
- `public static final Sounds hero_ninja_dwarf_skill2_whirl`
- `public static final Sounds hero_ninja_dwarf_skill6_impact`
- `public static final Sounds hero_ninja_dwarf_victory`
- `public static final Sounds hero_orc_monk_attack`
- `public static final Sounds hero_orc_monk_death`
- `public static final Sounds hero_orc_monk_skill1`
- `public static final Sounds hero_orc_monk_skill2`
- `public static final Sounds hero_orc_monk_skill3`
- `public static final Sounds hero_orc_monk_victory`
- `public static final Sounds hero_pch_anubis_dragon_basic_attack_auragathering`
- `public static final Sounds hero_pch_anubis_dragon_basic_attack_hit`
- `public static final Sounds hero_pch_anubis_dragon_basic_attack_sandball`
- `public static final Sounds hero_pch_anubis_dragon_death`
- `public static final Sounds hero_pch_anubis_dragon_hit_shell`
- `public static final Sounds hero_pch_anubis_dragon_skill1_impact`
- `public static final Sounds hero_pch_anubis_dragon_skill1_start`
- `public static final Sounds hero_pch_anubis_dragon_skill3`
- `public static final Sounds hero_pch_anubis_dragon_skill4`
- `public static final Sounds hero_pch_anubis_dragon_victory`
- `public static final Sounds hero_pirate_attack_fire`
- `public static final Sounds hero_pirate_attack_hit`
- `public static final Sounds hero_pirate_death`
- `public static final Sounds hero_pirate_skill1_fire`
- `public static final Sounds hero_pirate_skill1_hit`
- `public static final Sounds hero_pirate_skill2`
- `public static final Sounds hero_pirate_skill2_yar`
- `public static final Sounds hero_pirate_skill3_fire`
- `public static final Sounds hero_pirate_skill3_hit`
- `public static final Sounds hero_pirate_victory`
- `public static final Sounds hero_plague_entrepreneur_attack`
- `public static final Sounds hero_plague_entrepreneur_death`
- `public static final Sounds hero_plague_entrepreneur_skill1`
- `public static final Sounds hero_plague_entrepreneur_skill2`
- `public static final Sounds hero_plague_entrepreneur_skill2_hit`
- `public static final Sounds hero_plant_soul_attack`
- `public static final Sounds hero_plant_soul_death`
- `public static final Sounds hero_plant_soul_skill1_end`
- `public static final Sounds hero_plant_soul_skill1_loop`
- `public static final Sounds hero_plant_soul_skill1_start`
- `public static final Sounds hero_plant_soul_victory`
- `public static final Sounds hero_polemaster_attack_1`
- `public static final Sounds hero_polemaster_attack_2`
- `public static final Sounds hero_polemaster_death`
- `public static final Sounds hero_polemaster_skill1_fire`
- `public static final Sounds hero_polemaster_skill1_hit`
- `public static final Sounds hero_polemaster_skill3_fire`
- `public static final Sounds hero_polemaster_victory`
- `public static final Sounds hero_promote_sequence`
- `public static final Sounds hero_rabid_dragon_attack_fire`
- `public static final Sounds hero_rabid_dragon_attack_hit`
- `public static final Sounds hero_rabid_dragon_death`
- `public static final Sounds hero_rabid_dragon_skill1_seq1`
- `public static final Sounds hero_rabid_dragon_skill1_seq2`
- `public static final Sounds hero_rabid_dragon_skill1_seq4`
- `public static final Sounds hero_rabid_dragon_skill1_seq5`
- `public static final Sounds hero_rabid_dragon_skill2_fire`
- `public static final Sounds hero_rabid_dragon_skill2_hit`
- `public static final Sounds hero_rabid_dragon_skill3`
- `public static final Sounds hero_rabid_dragon_victory`
- `public static final Sounds hero_raging_revenant_attack`
- `public static final Sounds hero_raging_revenant_attack_impact`
- `public static final Sounds hero_raging_revenant_death`
- `public static final Sounds hero_raging_revenant_skill1`
- `public static final Sounds hero_raging_revenant_skill2_fire`
- `public static final Sounds hero_raging_revenant_skill2_hit`
- `public static final Sounds hero_raging_revenant_skill3`
- `public static final Sounds hero_raging_revenant_skill4`
- `public static final Sounds hero_raging_revenant_skill5_loop`
- `public static final Sounds hero_raging_revenant_victory`
- `public static final Sounds hero_red_shaman_attack_1`
- `public static final Sounds hero_red_shaman_attack_2`
- `public static final Sounds hero_red_shaman_death`
- `public static final Sounds hero_red_shaman_skill1`
- `public static final Sounds hero_red_shaman_skill2`
- `public static final Sounds hero_red_shaman_skill3`
- `public static final Sounds hero_red_shaman_victory`
- `public static final Sounds hero_roller_viking_attack_1`
- `public static final Sounds hero_roller_viking_attack_2`
- `public static final Sounds hero_roller_viking_death`
- `public static final Sounds hero_roller_viking_skill1`
- `public static final Sounds hero_roller_viking_skill2`
- `public static final Sounds hero_roller_viking_victory`
- `public static final Sounds hero_sadistic_dancer_basic_attack_hit`
- `public static final Sounds hero_sadistic_dancer_basic_attack_thunder`
- `public static final Sounds hero_sadistic_dancer_basic_attack_whip`
- `public static final Sounds hero_sadistic_dancer_death`
- `public static final Sounds hero_sadistic_dancer_skill1_damage_up`
- `public static final Sounds hero_sadistic_dancer_skill1_energy_down`
- `public static final Sounds hero_sadistic_dancer_skill1_loop`
- `public static final Sounds hero_sadistic_dancer_skill1_ring_fingers`
- `public static final Sounds hero_sadistic_dancer_skill2_end`
- `public static final Sounds hero_sadistic_dancer_skill2_loop`
- `public static final Sounds hero_sadistic_dancer_skill2_start`
- `public static final Sounds hero_sadistic_dancer_victory`
- `public static final Sounds hero_sand_dragon_attack_fire`
- `public static final Sounds hero_sand_dragon_attack_hit`
- `public static final Sounds hero_sand_dragon_death`
- `public static final Sounds hero_sand_dragon_skill1_fire`
- `public static final Sounds hero_sand_dragon_skill1_hit_A`
- `public static final Sounds hero_sand_dragon_skill1_hit_B`
- `public static final Sounds hero_sand_dragon_skill2_fire`
- `public static final Sounds hero_sand_dragon_skill2_hit`
- `public static final Sounds hero_sand_dragon_skill3_burn`
- `public static final Sounds hero_sand_dragon_skill3_fire`
- `public static final Sounds hero_sand_dragon_skill3_hit`
- `public static final Sounds hero_sand_dragon_skill4_fire`
- `public static final Sounds hero_sand_dragon_victory`
- `public static final Sounds hero_satyr_attack`
- `public static final Sounds hero_satyr_death`
- `public static final Sounds hero_satyr_hit`
- `public static final Sounds hero_satyr_skill1`
- `public static final Sounds hero_satyr_skill2`
- `public static final Sounds hero_satyr_stunheal`
- `public static final Sounds hero_satyr_victory`
- `public static final Sounds hero_savage_cutie_attack`
- `public static final Sounds hero_savage_cutie_death`
- `public static final Sounds hero_savage_cutie_hit`
- `public static final Sounds hero_savage_cutie_skill1`
- `public static final Sounds hero_savage_cutie_skill2`
- `public static final Sounds hero_savage_cutie_skill3`
- `public static final Sounds hero_savage_cutie_victory`
- `public static final Sounds hero_shadow_assassin_attack_fire`
- `public static final Sounds hero_shadow_assassin_attack_hit`
- `public static final Sounds hero_shadow_assassin_death`
- `public static final Sounds hero_shadow_assassin_skill1_end`
- `public static final Sounds hero_shadow_assassin_skill1_fire`
- `public static final Sounds hero_shadow_assassin_skill1_hit`
- `public static final Sounds hero_shadow_assassin_skill2_fire`
- `public static final Sounds hero_shadow_assassin_skill2_hit`
- `public static final Sounds hero_shadow_assassin_skill3_fire`
- `public static final Sounds hero_shadow_assassin_skill3_hit`
- `public static final Sounds hero_shadow_assassin_victory`
- `public static final Sounds hero_shadow_of_sven_attack`
- `public static final Sounds hero_shadow_of_sven_attack_hit`
- `public static final Sounds hero_shadow_of_sven_attack_recover`
- `public static final Sounds hero_shadow_of_sven_attack_slash`
- `public static final Sounds hero_shadow_of_sven_attack_windup`
- `public static final Sounds hero_shadow_of_sven_death_banish`
- `public static final Sounds hero_shadow_of_sven_death_sword`
- `public static final Sounds hero_shadow_of_sven_skill1_end_orbdissappear`
- `public static final Sounds hero_shadow_of_sven_skill1_end_swing`
- `public static final Sounds hero_shadow_of_sven_skill1_end_swordfromground`
- `public static final Sounds hero_shadow_of_sven_skill1_loop_lightning`
- `public static final Sounds hero_shadow_of_sven_skill1_loop_orb`
- `public static final Sounds hero_shadow_of_sven_skill1_start_ground`
- `public static final Sounds hero_shadow_of_sven_skill1_start_portal`
- `public static final Sounds hero_shadow_of_sven_skill1_start_swing`
- `public static final Sounds hero_shadow_of_sven_skill2`
- `public static final Sounds hero_shadow_of_sven_skill5_blast`
- `public static final Sounds hero_shadow_of_sven_skill5_charge`
- `public static final Sounds hero_shadow_of_sven_victory_ground`
- `public static final Sounds hero_shadow_of_sven_victory_swing`
- `public static final Sounds hero_silent_spirit_attack`
- `public static final Sounds hero_silent_spirit_skill1`
- `public static final Sounds hero_silent_spirit_skill2`
- `public static final Sounds hero_silent_spirit_skill3`
- `public static final Sounds hero_silent_spirit_skill4`
- `public static final Sounds hero_silent_spirit_skill4_end`
- `public static final Sounds hero_silent_spirit_victory`
- `public static final Sounds hero_skeleton_king_attack_fire`
- `public static final Sounds hero_skeleton_king_attack_hit`
- `public static final Sounds hero_skeleton_king_death`
- `public static final Sounds hero_skeleton_king_hit`
- `public static final Sounds hero_skeleton_king_skill1`
- `public static final Sounds hero_skeleton_king_skill2_dmg`
- `public static final Sounds hero_skeleton_king_skill2_fire`
- `public static final Sounds hero_skeleton_king_skill2_heal`
- `public static final Sounds hero_skeleton_king_skill3`
- `public static final Sounds hero_skeleton_king_victory`
- `public static final Sounds hero_snake_dragon_attack`
- `public static final Sounds hero_snake_dragon_death`
- `public static final Sounds hero_snake_dragon_skill1_fire`
- `public static final Sounds hero_snake_dragon_skill1_hit`
- `public static final Sounds hero_snake_dragon_skill3`
- `public static final Sounds hero_snake_dragon_victory`
- `public static final Sounds hero_sniper_wolf_attack_fire`
- `public static final Sounds hero_sniper_wolf_attack_hit`
- `public static final Sounds hero_sniper_wolf_death`
- `public static final Sounds hero_sniper_wolf_skill1`
- `public static final Sounds hero_sniper_wolf_skill2`
- `public static final Sounds hero_sniper_wolf_skill3_fire`
- `public static final Sounds hero_sniper_wolf_skill3_wolf_loop`
- `public static final Sounds hero_sniper_wolf_victory`
- `public static final Sounds hero_sniper_wolf_victory_wolf`
- `public static final Sounds hero_sojourner_sorceress_attack`
- `public static final Sounds hero_sojourner_sorceress_attack_hit`
- `public static final Sounds hero_sojourner_sorceress_death`
- `public static final Sounds hero_sojourner_sorceress_skill1`
- `public static final Sounds hero_sojourner_sorceress_skill1_hit`
- `public static final Sounds hero_sojourner_sorceress_skill2_cast`
- `public static final Sounds hero_sojourner_sorceress_skill2_hit`
- `public static final Sounds hero_sojourner_sorceress_skill2_pop`
- `public static final Sounds hero_sojourner_sorceress_skill3`
- `public static final Sounds hero_sojourner_sorceress_skill5_fireballs`
- `public static final Sounds hero_sojourner_sorceress_skill5_scream`
- `public static final Sounds hero_sojourner_sorceress_victory`
- `public static final Sounds hero_solid_longevity_basic_attack`
- `public static final Sounds hero_solid_longevity_basic_attack_hit`
- `public static final Sounds hero_solid_longevity_death`
- `public static final Sounds hero_solid_longevity_skill1_attack`
- `public static final Sounds hero_solid_longevity_skill1_loop`
- `public static final Sounds hero_solid_longevity_skill1_start`
- `public static final Sounds hero_solid_longevity_skill2`
- `public static final Sounds hero_solid_longevity_skill3`
- `public static final Sounds hero_solid_longevity_skill4`
- `public static final Sounds hero_solid_longevity_victory`
- `public static final Sounds hero_spectral_dragon_attack_fire`
- `public static final Sounds hero_spectral_dragon_attack_hit`
- `public static final Sounds hero_spectral_dragon_death`
- `public static final Sounds hero_spectral_dragon_skill1`
- `public static final Sounds hero_spectral_dragon_skill2_flame1`
- `public static final Sounds hero_spectral_dragon_skill2_flame2`
- `public static final Sounds hero_spectral_dragon_skill2_flame3_fire`
- `public static final Sounds hero_spectral_dragon_skill2_hit`
- `public static final Sounds hero_spectral_dragon_skill3`
- `public static final Sounds hero_spectral_dragon_victory`
- `public static final Sounds hero_spider_queen_attack`
- `public static final Sounds hero_spider_queen_coccoon_deflate`
- `public static final Sounds hero_spider_queen_coccoon_fall`
- `public static final Sounds hero_spider_queen_coccoon_pop`
- `public static final Sounds hero_spider_queen_death`
- `public static final Sounds hero_spider_queen_skill1_end`
- `public static final Sounds hero_spider_queen_skill1_loop`
- `public static final Sounds hero_spider_queen_skill1_spray`
- `public static final Sounds hero_spider_queen_skill1_start`
- `public static final Sounds hero_spider_queen_skill2`
- `public static final Sounds hero_spider_queen_victory`
- `public static final Sounds hero_spikey_dragon_attack_fire`
- `public static final Sounds hero_spikey_dragon_attack_hit`
- `public static final Sounds hero_spikey_dragon_death`
- `public static final Sounds hero_spikey_dragon_skill1_fire`
- `public static final Sounds hero_spikey_dragon_skill1_hit`
- `public static final Sounds hero_spikey_dragon_skill2_fire`
- `public static final Sounds hero_spikey_dragon_skill2_hit`
- `public static final Sounds hero_spikey_dragon_skill3`
- `public static final Sounds hero_spikey_dragon_victory`
- `public static final Sounds hero_stepladder_brothers_attack_hit`
- `public static final Sounds hero_stepladder_brothers_attack_projectile`
- `public static final Sounds hero_stepladder_brothers_attack_throw`
- `public static final Sounds hero_stepladder_brothers_death`
- `public static final Sounds hero_stepladder_brothers_skill1_end_hit`
- `public static final Sounds hero_stepladder_brothers_skill1_end_projectile`
- `public static final Sounds hero_stepladder_brothers_skill1_end_throw`
- `public static final Sounds hero_stepladder_brothers_skill1_loop`
- `public static final Sounds hero_stepladder_brothers_skill1_start`
- `public static final Sounds hero_stepladder_brothers_skill2`
- `public static final Sounds hero_stepladder_brothers_skill2_wall`
- `public static final Sounds hero_stepladder_brothers_skill3`
- `public static final Sounds hero_stepladder_brothers_skill4_hit`
- `public static final Sounds hero_stepladder_brothers_skill4_objectappear`
- `public static final Sounds hero_stepladder_brothers_skill4_throw`
- `public static final Sounds hero_stepladder_brothers_victory`
- `public static final Sounds hero_storm_dragon_attack_fire`
- `public static final Sounds hero_storm_dragon_attack_hit`
- `public static final Sounds hero_storm_dragon_death`
- `public static final Sounds hero_storm_dragon_skill1_fire`
- `public static final Sounds hero_storm_dragon_skill1_hit`
- `public static final Sounds hero_storm_dragon_skill2_fire`
- `public static final Sounds hero_storm_dragon_skill2_hit`
- `public static final Sounds hero_storm_dragon_skill3_fire`
- `public static final Sounds hero_storm_dragon_skill3_hit`
- `public static final Sounds hero_storm_dragon_victory`
- `public static final Sounds hero_stowaway_attack_fire`
- `public static final Sounds hero_stowaway_attack_hit`
- `public static final Sounds hero_stowaway_death`
- `public static final Sounds hero_stowaway_skill1_bomb`
- `public static final Sounds hero_stowaway_skill1_boomerang`
- `public static final Sounds hero_stowaway_skill1_fire`
- `public static final Sounds hero_stowaway_skill1_grenade`
- `public static final Sounds hero_stowaway_skill1_pennies`
- `public static final Sounds hero_stowaway_skill1_tears`
- `public static final Sounds hero_stowaway_skill2_end`
- `public static final Sounds hero_stowaway_skill2_grab`
- `public static final Sounds hero_stowaway_skill2_start`
- `public static final Sounds hero_stowaway_skill4_end`
- `public static final Sounds hero_stowaway_skill4_hit`
- `public static final Sounds hero_stowaway_skill4_loop_1`
- `public static final Sounds hero_stowaway_skill4_loop_2`
- `public static final Sounds hero_stowaway_victory`
- `public static final Sounds hero_summon_sequence`
- `public static final Sounds hero_sun_seeker_attack_1`
- `public static final Sounds hero_sun_seeker_attack_2`
- `public static final Sounds hero_sun_seeker_death`
- `public static final Sounds hero_sun_seeker_skill1_fire`
- `public static final Sounds hero_sun_seeker_skill1_fireball`
- `public static final Sounds hero_sun_seeker_skill1_hitball`
- `public static final Sounds hero_sun_seeker_skill1_hitenemy`
- `public static final Sounds hero_sun_seeker_skill1_throw`
- `public static final Sounds hero_sun_seeker_skill2_explosion`
- `public static final Sounds hero_sun_seeker_skill2_firehand`
- `public static final Sounds hero_sun_seeker_skill2_sunlight`
- `public static final Sounds hero_sun_seeker_skill4_cross_scoops`
- `public static final Sounds hero_sun_seeker_skill4_fire_scoops`
- `public static final Sounds hero_sun_seeker_skill4_hit_enemy_fire`
- `public static final Sounds hero_sun_seeker_skill4_hit_enemy_scoops`
- `public static final Sounds hero_sun_seeker_skill4_hit_get_scoop`
- `public static final Sounds hero_sun_seeker_skill4_hit_put_away_scoop`
- `public static final Sounds hero_sun_seeker_skill4_sun`
- `public static final Sounds hero_sun_seeker_victory`
- `public static final Sounds hero_tomb_angel_attack`
- `public static final Sounds hero_tomb_angel_prison_end`
- `public static final Sounds hero_tomb_angel_prison_start`
- `public static final Sounds hero_tomb_angel_skill2`
- `public static final Sounds hero_tomb_angel_skill3`
- `public static final Sounds hero_triple_threat_attack`
- `public static final Sounds hero_triple_threat_death`
- `public static final Sounds hero_triple_threat_skill1`
- `public static final Sounds hero_triple_threat_skill2`
- `public static final Sounds hero_triple_threat_skill3`
- `public static final Sounds hero_triple_threat_skill3_hit`
- `public static final Sounds hero_triple_threat_victory`
- `public static final Sounds hero_umlaut_the_first_attack`
- `public static final Sounds hero_umlaut_the_first_attack_hit`
- `public static final Sounds hero_umlaut_the_first_death`
- `public static final Sounds hero_umlaut_the_first_skill1`
- `public static final Sounds hero_umlaut_the_first_skill2`
- `public static final Sounds hero_umlaut_the_first_victory`
- `public static final Sounds hero_unicorgi_attack`
- `public static final Sounds hero_unicorgi_death`
- `public static final Sounds hero_unicorgi_skill1_part1`
- `public static final Sounds hero_unicorgi_skill1_part2`
- `public static final Sounds hero_unicorgi_skill1_part3`
- `public static final Sounds hero_unicorgi_skill2`
- `public static final Sounds hero_unicorgi_skill3`
- `public static final Sounds hero_unicorgi_victory`
- `public static final Sounds hero_unripe_mythology_attack`
- `public static final Sounds hero_unripe_mythology_death_dragon`
- `public static final Sounds hero_unripe_mythology_death_egg`
- `public static final Sounds hero_unripe_mythology_skill1_blast`
- `public static final Sounds hero_unripe_mythology_skill1_impact`
- `public static final Sounds hero_unripe_mythology_skill1_spin`
- `public static final Sounds hero_unripe_mythology_skill3_end`
- `public static final Sounds hero_unripe_mythology_skill3_loop`
- `public static final Sounds hero_unripe_mythology_skill4`
- `public static final Sounds hero_unripe_mythology_victory`
- `public static final Sounds hero_vampire_dragon_attack_1`
- `public static final Sounds hero_vampire_dragon_attack_2`
- `public static final Sounds hero_vampire_dragon_attack_hit`
- `public static final Sounds hero_vampire_dragon_death`
- `public static final Sounds hero_vampire_dragon_skill1_DOT`
- `public static final Sounds hero_vampire_dragon_skill1_fire`
- `public static final Sounds hero_vampire_dragon_skill1_suck`
- `public static final Sounds hero_vampire_dragon_skill2_fire`
- `public static final Sounds hero_vampire_dragon_skill2_hit`
- `public static final Sounds hero_vampire_dragon_skill3_fire`
- `public static final Sounds hero_vampire_dragon_victory`
- `public static final Sounds hero_vermilion_bird_basic_attack`
- `public static final Sounds hero_vermilion_bird_basic_attack_hit`
- `public static final Sounds hero_vermilion_bird_death`
- `public static final Sounds hero_vermilion_bird_skill1_attack`
- `public static final Sounds hero_vermilion_bird_skill1_hit`
- `public static final Sounds hero_vermilion_bird_skill1_loop`
- `public static final Sounds hero_vermilion_bird_skill1_start`
- `public static final Sounds hero_vermilion_bird_skill2`
- `public static final Sounds hero_vermilion_bird_skill3_loop`
- `public static final Sounds hero_vermilion_bird_skill4`
- `public static final Sounds hero_vermilion_bird_victory`
- `public static final Sounds hero_vile_bile_attack`
- `public static final Sounds hero_vile_bile_death`
- `public static final Sounds hero_vile_bile_skill1_end`
- `public static final Sounds hero_vile_bile_skill1_loop`
- `public static final Sounds hero_vile_bile_skill2`
- `public static final Sounds hero_vile_bile_skill4`
- `public static final Sounds hero_void_wyvern_attack`
- `public static final Sounds hero_void_wyvern_death`
- `public static final Sounds hero_void_wyvern_skill1_end`
- `public static final Sounds hero_void_wyvern_skill1_loop`
- `public static final Sounds hero_void_wyvern_skill2_fire`
- `public static final Sounds hero_void_wyvern_skill2_hit_01`
- `public static final Sounds hero_void_wyvern_skill2_hit_02`
- `public static final Sounds hero_void_wyvern_skill2_hit_03`
- `public static final Sounds hero_void_wyvern_skill3`
- `public static final Sounds hero_void_wyvern_victory`
- `public static final Sounds hero_vulcan_elf_attack_1`
- `public static final Sounds hero_vulcan_elf_attack_2`
- `public static final Sounds hero_vulcan_elf_death`
- `public static final Sounds hero_vulcan_elf_skill1`
- `public static final Sounds hero_vulcan_elf_skill2`
- `public static final Sounds hero_vulcan_elf_skill3_fire`
- `public static final Sounds hero_vulcan_elf_skill3_hit`
- `public static final Sounds hero_vulcan_elf_victory`
- `public static final Sounds hero_vulture_dragon_attack`
- `public static final Sounds hero_vulture_dragon_death`
- `public static final Sounds hero_vulture_dragon_skill1_end`
- `public static final Sounds hero_vulture_dragon_skill1_loop`
- `public static final Sounds hero_vulture_dragon_skill1_loop_slash_1`
- `public static final Sounds hero_vulture_dragon_skill1_loop_slash_2`
- `public static final Sounds hero_vulture_dragon_skill1_start`
- `public static final Sounds hero_vulture_dragon_skill1_swoop`
- `public static final Sounds hero_vulture_dragon_skill2_fire`
- `public static final Sounds hero_vulture_dragon_skill2_sizzle`
- `public static final Sounds hero_vulture_dragon_skill5`
- `public static final Sounds hero_vulture_dragon_victory`
- `public static final Sounds hero_wee_witch_attack`
- `public static final Sounds hero_wee_witch_death`
- `public static final Sounds hero_wee_witch_skill1`
- `public static final Sounds hero_wee_witch_skill1_hit`
- `public static final Sounds hero_wee_witch_skill2`
- `public static final Sounds hero_wee_witch_victory`
- `public static final Sounds hero_weredragon_attack_dragon`
- `public static final Sounds hero_weredragon_attack_dragon_v2`
- `public static final Sounds hero_weredragon_attack_man`
- `public static final Sounds hero_weredragon_attack_man_v1`
- `public static final Sounds hero_weredragon_death_dragon`
- `public static final Sounds hero_weredragon_death_man`
- `public static final Sounds hero_weredragon_skill1`
- `public static final Sounds hero_weredragon_skill1_revert`
- `public static final Sounds hero_weredragon_skill2`
- `public static final Sounds hero_weredragon_skill3`
- `public static final Sounds hero_weredragon_skill3_hit`
- `public static final Sounds hero_weredragon_skill5`
- `public static final Sounds hero_weredragon_skill5_revert`
- `public static final Sounds hero_weredragon_victory`
- `public static final Sounds hero_white_tiger_basic_attack`
- `public static final Sounds hero_white_tiger_basic_attack_hit`
- `public static final Sounds hero_white_tiger_death`
- `public static final Sounds hero_white_tiger_skill1_attack`
- `public static final Sounds hero_white_tiger_skill1_hit`
- `public static final Sounds hero_white_tiger_skill3_attack`
- `public static final Sounds hero_white_tiger_skill3_hit`
- `public static final Sounds hero_white_tiger_skill3_impact`
- `public static final Sounds hero_white_tiger_victory`
- `public static final Sounds hero_zombie_squire_attack`
- `public static final Sounds hero_zombie_squire_death`
- `public static final Sounds hero_zombie_squire_hit_organs`
- `public static final Sounds hero_zombie_squire_skill1`
- `public static final Sounds hero_zombie_squire_skill2`
- `public static final Sounds hero_zombie_squire_skill4`
- `public static final Sounds hero_zombie_squire_victory`
- `public static final Sounds loss_music`
- `public static final Sounds main_screen_big_fire`
- `public static final Sounds main_screen_crickets`
- `public static final Sounds main_screen_music`
- `public static final Sounds main_screen_small_fire`
- `public static final Sounds monster_angelic_avenger_attack`
- `public static final Sounds monster_ant_ambush`
- `public static final Sounds monster_ant_attack`
- `public static final Sounds monster_ant_death`
- `public static final Sounds monster_ant_pre_attack`
- `public static final Sounds monster_ant_victory`
- `public static final Sounds monster_anubis_dragon_basic_attack_auragathering`
- `public static final Sounds monster_anubis_dragon_basic_attack_hit`
- `public static final Sounds monster_anubis_dragon_basic_attack_sandball`
- `public static final Sounds monster_anubis_dragon_death`
- `public static final Sounds monster_anubis_dragon_hit_shell`
- `public static final Sounds monster_anubis_dragon_skill1_bracelet_brilliant`
- `public static final Sounds monster_anubis_dragon_skill1_hit`
- `public static final Sounds monster_anubis_dragon_skill1_sandwave_1`
- `public static final Sounds monster_anubis_dragon_skill1_sandwave_2`
- `public static final Sounds monster_anubis_dragon_skill1_sandwave_3`
- `public static final Sounds monster_anubis_dragon_victory`
- `public static final Sounds monster_archer_grunt_attack_fire`
- `public static final Sounds monster_archer_grunt_attack_hit`
- `public static final Sounds monster_archer_grunt_death`
- `public static final Sounds monster_archer_grunt_victory`
- `public static final Sounds monster_archer_magic_attack_fire`
- `public static final Sounds monster_archer_magic_attack_hit`
- `public static final Sounds monster_archer_magic_death`
- `public static final Sounds monster_archer_magic_victory`
- `public static final Sounds monster_archer_phys_attack_fire`
- `public static final Sounds monster_archer_phys_attack_hit`
- `public static final Sounds monster_archer_phys_death`
- `public static final Sounds monster_archer_phys_victory`
- `public static final Sounds monster_blue_dragon_basic_attack`
- `public static final Sounds monster_blue_dragon_basic_attack_hit`
- `public static final Sounds monster_blue_dragon_death`
- `public static final Sounds monster_blue_dragon_skill1_impact`
- `public static final Sounds monster_blue_dragon_skill1_start`
- `public static final Sounds monster_blue_dragon_skill2`
- `public static final Sounds monster_blue_dragon_victory`
- `public static final Sounds monster_boss_abyss_dragon_basic_attack`
- `public static final Sounds monster_boss_abyss_dragon_basic_attack_hit`
- `public static final Sounds monster_boss_abyss_dragon_death`
- `public static final Sounds monster_boss_abyss_dragon_skill1_impact`
- `public static final Sounds monster_boss_abyss_dragon_skill1_start`
- `public static final Sounds monster_boss_abyss_dragon_skill2`
- `public static final Sounds monster_boss_abyss_dragon_victory`
- `public static final Sounds monster_boss_anubis_dragon_basic_attack_auragathering`
- `public static final Sounds monster_boss_anubis_dragon_basic_attack_hit`
- `public static final Sounds monster_boss_anubis_dragon_basic_attack_sandball`
- `public static final Sounds monster_boss_anubis_dragon_death`
- `public static final Sounds monster_boss_anubis_dragon_hit_shell`
- `public static final Sounds monster_boss_anubis_dragon_skill1_bracelet_brilliant`
- `public static final Sounds monster_boss_anubis_dragon_skill1_hit`
- `public static final Sounds monster_boss_anubis_dragon_skill1_sandwave_1`
- `public static final Sounds monster_boss_anubis_dragon_skill1_sandwave_2`
- `public static final Sounds monster_boss_anubis_dragon_skill1_sandwave_3`
- `public static final Sounds monster_boss_anubis_dragon_victory`
- `public static final Sounds monster_boss_umlaut_the_first_attack`
- `public static final Sounds monster_boss_umlaut_the_first_attack_hit`
- `public static final Sounds monster_boss_umlaut_the_first_death`
- `public static final Sounds monster_boss_umlaut_the_first_skill1`
- `public static final Sounds monster_boss_umlaut_the_first_skill2`
- `public static final Sounds monster_boss_umlaut_the_first_victory`
- `public static final Sounds monster_boss_umlautthefifth_first_basic_attack`
- `public static final Sounds monster_boss_umlautthefifth_first_basic_attack_hit`
- `public static final Sounds monster_boss_umlautthefifth_first_death`
- `public static final Sounds monster_boss_umlautthefifth_first_skill1_attack`
- `public static final Sounds monster_boss_umlautthefifth_first_skill1_start`
- `public static final Sounds monster_boss_umlautthefifth_first_skill2`
- `public static final Sounds monster_boss_umlautthefifth_first_skill3_intro`
- `public static final Sounds monster_boss_umlautthefifth_first_skill3_lightning`
- `public static final Sounds monster_boss_umlautthefifth_first_skill3_noise`
- `public static final Sounds monster_boss_umlautthefifth_first_skill3_shaking`
- `public static final Sounds monster_boss_umlautthefifth_first_victory`
- `public static final Sounds monster_breaker_mkii_attack`
- `public static final Sounds monster_breaker_mkii_death_explode`
- `public static final Sounds monster_breaker_mkii_death_heat`
- `public static final Sounds monster_breaker_mkii_death_steam`
- `public static final Sounds monster_breaker_mkii_skill1_end`
- `public static final Sounds monster_breaker_mkii_skill1_hit`
- `public static final Sounds monster_breaker_mkii_skill1_start`
- `public static final Sounds monster_breaker_mkii_skill1_steam`
- `public static final Sounds monster_breaker_mkii_victory_drill`
- `public static final Sounds monster_breaker_mkii_victory_steam`
- `public static final Sounds monster_cauldron_monster_death`
- `public static final Sounds monster_cauldron_monster_hit`
- `public static final Sounds monster_cauldron_monster_victory`
- `public static final Sounds monster_cauldron_monster_walk_loop`
- `public static final Sounds monster_cauldron_monster_walk_start`
- `public static final Sounds monster_cauldron_monster_walk_stop`
- `public static final Sounds monster_cloud_attack`
- `public static final Sounds monster_cloud_death`
- `public static final Sounds monster_cloud_hit`
- `public static final Sounds monster_cloud_shield`
- `public static final Sounds monster_cloud_victory`
- `public static final Sounds monster_crystal_lizard_attack_hit`
- `public static final Sounds monster_crystal_lizard_attack_swing`
- `public static final Sounds monster_crystal_lizard_death`
- `public static final Sounds monster_crystal_lizard_skill1_end`
- `public static final Sounds monster_crystal_lizard_skill1_explode`
- `public static final Sounds monster_crystal_lizard_skill1_loop`
- `public static final Sounds monster_crystal_lizard_skill1_start`
- `public static final Sounds monster_crystal_lizard_victory_eat`
- `public static final Sounds monster_crystal_lizard_victory_fly`
- `public static final Sounds monster_crystal_lizard_victory_growl`
- `public static final Sounds monster_eyeball_attack_fire`
- `public static final Sounds monster_eyeball_attack_hit`
- `public static final Sounds monster_eyeball_death`
- `public static final Sounds monster_eyeball_eyepops`
- `public static final Sounds monster_eyeball_victory`
- `public static final Sounds monster_flea_demon_attack`
- `public static final Sounds monster_goblin_attack`
- `public static final Sounds monster_goblin_death`
- `public static final Sounds monster_goblin_victory`
- `public static final Sounds monster_head_crab_attack_death`
- `public static final Sounds monster_head_crab_attack_end`
- `public static final Sounds monster_head_crab_attack_loop`
- `public static final Sounds monster_head_crab_attack_start`
- `public static final Sounds monster_head_crab_death`
- `public static final Sounds monster_head_crab_victory`
- `public static final Sounds monster_head_crab_walk`
- `public static final Sounds monster_inferno_spider_attack_fire`
- `public static final Sounds monster_inferno_spider_attack_hit`
- `public static final Sounds monster_inferno_spider_death`
- `public static final Sounds monster_inferno_spider_victory`
- `public static final Sounds monster_kamikaze_gnome_attack`
- `public static final Sounds monster_kamikaze_gnome_tick`
- `public static final Sounds monster_king_imp_attack_fire`
- `public static final Sounds monster_king_imp_attack_hit`
- `public static final Sounds monster_king_imp_death`
- `public static final Sounds monster_king_imp_skill2`
- `public static final Sounds monster_king_imp_victory`
- `public static final Sounds monster_lying_lantern_attack`
- `public static final Sounds monster_lying_lantern_death`
- `public static final Sounds monster_lying_lantern_skill`
- `public static final Sounds monster_lying_lantern_skill_hit`
- `public static final Sounds monster_magic_golem_attack_fire`
- `public static final Sounds monster_magic_golem_attack_hit`
- `public static final Sounds monster_magic_golem_death`
- `public static final Sounds monster_magic_golem_victory`
- `public static final Sounds monster_magic_imp_attack_fire`
- `public static final Sounds monster_magic_imp_attack_hit`
- `public static final Sounds monster_magic_imp_death`
- `public static final Sounds monster_magic_imp_victory`
- `public static final Sounds monster_man_eating_plant_attack`
- `public static final Sounds monster_man_eating_plant_death`
- `public static final Sounds monster_man_eating_plant_hide`
- `public static final Sounds monster_man_eating_plant_out`
- `public static final Sounds monster_man_eating_plant_victory`
- `public static final Sounds monster_man_eating_plant_walk`
- `public static final Sounds monster_mr_smashy_attack`
- `public static final Sounds monster_mr_smashy_death`
- `public static final Sounds monster_mr_smashy_step`
- `public static final Sounds monster_mr_smashy_victory`
- `public static final Sounds monster_mushroom_attack`
- `public static final Sounds monster_mushroom_death`
- `public static final Sounds monster_mushroom_victory`
- `public static final Sounds monster_phys_golem_attack_fire`
- `public static final Sounds monster_phys_golem_attack_hit`
- `public static final Sounds monster_phys_golem_death`
- `public static final Sounds monster_phys_golem_victory`
- `public static final Sounds monster_phys_imp_attack_fire`
- `public static final Sounds monster_phys_imp_attack_hit`
- `public static final Sounds monster_phys_imp_death`
- `public static final Sounds monster_phys_imp_victory`
- `public static final Sounds monster_plague_skulker_attack`
- `public static final Sounds monster_plague_skulker_death`
- `public static final Sounds monster_plague_skulker_hit_react`
- `public static final Sounds monster_plague_skulker_victory`
- `public static final Sounds monster_redtiger_basic_attack`
- `public static final Sounds monster_redtiger_skill1_end`
- `public static final Sounds monster_redtiger_skill1_loop`
- `public static final Sounds monster_redtiger_skill1_start`
- `public static final Sounds monster_scarecrow_attack_fire`
- `public static final Sounds monster_scarecrow_attack_hit`
- `public static final Sounds monster_scarecrow_death`
- `public static final Sounds monster_scarecrow_victory`
- `public static final Sounds monster_shark_attack`
- `public static final Sounds monster_shark_death`
- `public static final Sounds monster_shark_hit`
- `public static final Sounds monster_shark_skill1`
- `public static final Sounds monster_shark_victory`
- `public static final Sounds monster_sinister_assailant_attack`
- `public static final Sounds monster_sinister_assailant_death`
- `public static final Sounds monster_sinister_assailant_skill1`
- `public static final Sounds monster_sinister_assailant_skill1_impact`
- `public static final Sounds monster_sinister_assailant_victory`
- `public static final Sounds monster_sinister_assailant_victory_scythe_throw`
- `public static final Sounds monster_skeleton_deer_attack`
- `public static final Sounds monster_skeleton_deer_charge`
- `public static final Sounds monster_skeleton_deer_death`
- `public static final Sounds monster_skeleton_deer_stun`
- `public static final Sounds monster_skeleton_deer_victory`
- `public static final Sounds monster_sprite_buff_attack_fire`
- `public static final Sounds monster_sprite_buff_attack_hit`
- `public static final Sounds monster_sprite_buff_death`
- `public static final Sounds monster_sprite_buff_victory`
- `public static final Sounds monster_sprite_heal_attack_fire`
- `public static final Sounds monster_sprite_heal_attack_hit`
- `public static final Sounds monster_sprite_heal_death`
- `public static final Sounds monster_sprite_heal_victory`
- `public static final Sounds monster_squid_squirter_attack_fire`
- `public static final Sounds monster_squid_squirter_attack_hit`
- `public static final Sounds monster_squid_squirter_death`
- `public static final Sounds monster_squid_squirter_victory`
- `public static final Sounds monster_squirrel_attack_hit_1`
- `public static final Sounds monster_squirrel_attack_hit_2`
- `public static final Sounds monster_squirrel_attack_start`
- `public static final Sounds monster_squirrel_death`
- `public static final Sounds monster_squirrel_hit`
- `public static final Sounds monster_squirrel_throw_1`
- `public static final Sounds monster_squirrel_throw_2`
- `public static final Sounds monster_squirrel_throw_3`
- `public static final Sounds monster_squirrel_throw_4`
- `public static final Sounds monster_squirrel_victory`
- `public static final Sounds monster_troll_blob_attack`
- `public static final Sounds monster_troll_blob_death`
- `public static final Sounds monster_troll_blob_victory`
- `public static final Sounds monster_umlautthefifth_first_basic_attack`
- `public static final Sounds monster_umlautthefifth_first_basic_attack_hit`
- `public static final Sounds monster_umlautthefifth_first_death`
- `public static final Sounds monster_umlautthefifth_first_skill1_attack`
- `public static final Sounds monster_umlautthefifth_first_skill1_start`
- `public static final Sounds monster_umlautthefifth_first_skill2`
- `public static final Sounds monster_umlautthefifth_first_victory`
- `public static final Sounds narrator_text`
- `public static final Sounds perblue`
- `public static final Sounds power_points_lvl_up`
- `public static final Sounds purchase_diamonds`
- `public static final Sounds quest_collect`
- `public static final Sounds raid_result`
- `public static final Sounds regular_purchase`
- `public static final Sounds reward_claim_button`
- `public static final Sounds sign_in_reward`
- `public static final Sounds skull_anim`
- `public static final Sounds team_level_up`
- `public static final Sounds temple_ui_coffin`
- `public static final Sounds temple_ui_coffin_open`
- `public static final Sounds temple_ui_doors_close`
- `public static final Sounds temple_ui_doors_open`
- `public static final Sounds temple_ui_rotate`
- `public static final Sounds temple_ui_view_hero`
- `public static final Sounds ui_button_tap`
- `public static final Sounds ui_chat_close`
- `public static final Sounds ui_chat_mini_close`
- `public static final Sounds ui_chat_mini_open`
- `public static final Sounds ui_chat_open`
- `public static final Sounds ui_contest_bell1`
- `public static final Sounds ui_contest_bell2`
- `public static final Sounds ui_contest_progress_meter`
- `public static final Sounds ui_doppleganger_character_select`
- `public static final Sounds ui_fusion_dialog_choose`
- `public static final Sounds ui_fusion_dialog_fuse`
- `public static final Sounds ui_menu_back`
- `public static final Sounds ui_menu_close`
- `public static final Sounds ui_menu_popup_close`
- `public static final Sounds ui_menu_popup_open`
- `public static final Sounds ui_menu_scroll_close`
- `public static final Sounds ui_menu_scroll_open`
- `public static final Sounds ui_rune_embue`
- `public static final Sounds ui_rune_empower10_rumble_1`
- `public static final Sounds ui_rune_empower10_rumble_2`
- `public static final Sounds ui_rune_empower10_success`
- `public static final Sounds ui_rune_empower_success`
- `public static final Sounds ui_rune_frames_seperate`
- `public static final Sounds ui_rune_fusion_dialog_loop`
- `public static final Sounds ui_rune_fusion_fuse_1`
- `public static final Sounds ui_rune_fusion_fuse_2`
- `public static final Sounds ui_rune_fusion_fuse_5`
- `public static final Sounds ui_rune_fusion_nostars`
- `public static final Sounds ui_rune_fusion_place_in_shrine`
- `public static final Sounds ui_rune_fusion_post_dialog`
- `public static final Sounds ui_rune_fusion_select_offering_1`
- `public static final Sounds ui_rune_fusion_select_offering_2`
- `public static final Sounds ui_rune_fusion_select_rune`
- `public static final Sounds ui_rune_place_rune`
- `public static final Sounds ui_rune_remove_rune`
- `public static final Sounds ui_rune_sell_rune`
- `public static final Sounds ui_rune_server_latency_A`
- `public static final Sounds ui_rune_server_latency_B`
- `public static final Sounds victory_fanfare`
- `public static final Sounds vip_level_up`
- `public static final Sounds war_battle_music`
- `public static final Sounds war_button_heroes`
- `public static final Sounds war_button_items`
- `public static final Sounds war_check_mark`
- `public static final Sounds war_coin_sack`
- `public static final Sounds war_defeat`
- `public static final Sounds war_menu_music`
- `public static final Sounds war_progress_meter`
- `public static final Sounds war_reward_banner`
- `public static final Sounds war_reward_shield`
- `public static final Sounds war_victory`
- `public static final Sounds war_you_lost`
- `public static final Sounds war_you_won_broken_shield`
- `public static final Sounds you_won_seq`
- `private String assetName`
- `private final boolean internal`

**Methods (6):**
- `Sounds getRandomVariation()`
- `boolean isInternal()`
- `String getAsset()`
- `Sounds[] values()`
- `Sounds valueOf(String)`
- `void init(String, String)`

**Constants (1297):**
- arena_promotion
- battle_music
- chest_open_chest
- chest_open_single_item
- chest_open_ten_items
- chest_open_ten_single_item
- chest_open_ten_single_item_A
- chest_open_ten_single_item_B
- combat_hero_skill
- combat_physical_hit
- combat_stun_1
- combat_stun_2
- combat_stun_3
- craft_success
- crafting_moment
- diamonds_to_gold
- gear_into_frame
- got_a_new_hero
- green_mist
- hero_apprentice_attack_fire_1
- hero_apprentice_attack_fire_2
- hero_apprentice_attack_hit
- hero_apprentice_death
- hero_apprentice_skill1_bust_through_ground
- hero_apprentice_skill1_fire
- hero_apprentice_skill2_fire
- hero_apprentice_skill2_hit
- hero_apprentice_skill3_fire
- hero_apprentice_skill3_hit
- hero_apprentice_skill6_shot
- hero_apprentice_victory
- hero_brozerker_attack_1
- hero_brozerker_attack_2
- hero_brozerker_boobs
- hero_brozerker_bros
- hero_brozerker_death
- hero_brozerker_foes
- hero_brozerker_skill1
- hero_brozerker_skill2_dmg
- hero_brozerker_skill2_heal
- hero_brozerker_skill3
- hero_brozerker_victory
- hero_brute_dragon_attack
- hero_brute_dragon_death
- hero_brute_dragon_skill1_fire
- hero_brute_dragon_skill1_hit
- hero_brute_dragon_skill2_bubbling
- hero_brute_dragon_skill2_fire
- hero_brute_dragon_skill3
- hero_brute_dragon_skill6
- hero_brute_dragon_victory
- hero_centaur_attack_fire_1
- hero_centaur_attack_fire_2
- hero_centaur_attack_hit_1
- hero_centaur_attack_hit_2
- hero_centaur_death
- hero_centaur_skill1_fire
- hero_centaur_skill1_hit
- hero_centaur_skill2_fire
- hero_centaur_skill2_hit
- hero_centaur_skill3_fire
- hero_centaur_skill3_hit
- hero_centaur_victory
- hero_demon_totem1_skill5_end
- hero_dragon_lady_attack_1
- hero_dragon_lady_attack_2
- hero_dragon_lady_death
- hero_dragon_lady_skill1_fire
- hero_dragon_lady_skill1_hit
- hero_dragon_lady_skill2
- hero_dragon_lady_skill3
- hero_dragon_lady_victory
- hero_electroyeti_attack_1
- hero_electroyeti_attack_2
- hero_electroyeti_death
- hero_electroyeti_skill1_fire
- hero_electroyeti_skill1_mult_lightning_1
- hero_electroyeti_skill2_fire
- hero_electroyeti_skill2_hit
- hero_electroyeti_skill3
- hero_electroyeti_victory
- hero_equip_item
- hero_evolve_sequence
- hero_faith_healer_attack_fire_1
- hero_faith_healer_attack_fire_2
- hero_faith_healer_attack_hit
- hero_faith_healer_death
- hero_faith_healer_skill1
- hero_faith_healer_skill2_fire
- hero_faith_healer_skill3
- hero_faith_healer_victory
- hero_landing
- hero_level_up
- hero_ninja_dwarf_attack_1
- hero_ninja_dwarf_attack_2
- hero_ninja_dwarf_death
- hero_ninja_dwarf_skill1_hit
- hero_ninja_dwarf_skill1_teleport
- hero_ninja_dwarf_skill1_whirl
- hero_ninja_dwarf_skill2_hit
- hero_ninja_dwarf_skill2_teleport
- hero_ninja_dwarf_skill2_whirl
- hero_ninja_dwarf_skill6_impact
- hero_ninja_dwarf_victory
- hero_pch_anubis_dragon_basic_attack_auragathering
- hero_pch_anubis_dragon_basic_attack_hit
- hero_pch_anubis_dragon_basic_attack_sandball
- hero_pch_anubis_dragon_death
- hero_pch_anubis_dragon_hit_shell
- hero_pch_anubis_dragon_skill1_impact
- hero_pch_anubis_dragon_skill1_start
- hero_pch_anubis_dragon_skill3
- hero_pch_anubis_dragon_skill4
- hero_pch_anubis_dragon_victory
- hero_polemaster_attack_1
- hero_polemaster_attack_2
- hero_polemaster_death
- hero_polemaster_skill1_fire
- hero_polemaster_skill1_hit
- hero_polemaster_skill3_fire
- hero_polemaster_victory
- hero_promote_sequence
- hero_red_shaman_attack_1
- hero_red_shaman_attack_2
- hero_red_shaman_death
- hero_red_shaman_skill1
- hero_red_shaman_skill2
- hero_red_shaman_skill3
- hero_red_shaman_victory
- hero_roller_viking_attack_1
- hero_roller_viking_attack_2
- hero_roller_viking_death
- hero_roller_viking_skill1
- hero_roller_viking_skill2
- hero_roller_viking_victory
- hero_sand_dragon_attack_fire
- hero_sand_dragon_attack_hit
- hero_sand_dragon_death
- hero_sand_dragon_skill1_fire
- hero_sand_dragon_skill1_hit_A
- hero_sand_dragon_skill1_hit_B
- hero_sand_dragon_skill2_fire
- hero_sand_dragon_skill2_hit
- hero_sand_dragon_skill3_burn
- hero_sand_dragon_skill3_fire
- hero_sand_dragon_skill3_hit
- hero_sand_dragon_skill4_fire
- hero_sand_dragon_victory
- hero_shadow_of_sven_attack
- hero_shadow_of_sven_attack_hit
- hero_shadow_of_sven_attack_recover
- hero_shadow_of_sven_attack_slash
- hero_shadow_of_sven_attack_windup
- hero_shadow_of_sven_death_banish
- hero_shadow_of_sven_death_sword
- hero_shadow_of_sven_skill1_end_orbdissappear
- hero_shadow_of_sven_skill1_end_swing
- hero_shadow_of_sven_skill1_end_swordfromground
- hero_shadow_of_sven_skill1_loop_lightning
- hero_shadow_of_sven_skill1_loop_orb
- hero_shadow_of_sven_skill1_start_ground
- hero_shadow_of_sven_skill1_start_portal
- hero_shadow_of_sven_skill1_start_swing
- hero_shadow_of_sven_skill2
- hero_shadow_of_sven_skill5_blast
- hero_shadow_of_sven_skill5_charge
- hero_shadow_of_sven_victory_ground
- hero_shadow_of_sven_victory_swing
- hero_summon_sequence
- hero_umlaut_the_first_attack
- hero_umlaut_the_first_attack_hit
- hero_umlaut_the_first_death
- hero_umlaut_the_first_skill1
- hero_umlaut_the_first_skill2
- hero_umlaut_the_first_victory
- hero_vampire_dragon_attack_1
- hero_vampire_dragon_attack_2
- hero_vampire_dragon_attack_hit
- hero_vampire_dragon_death
- hero_vampire_dragon_skill1_DOT
- hero_vampire_dragon_skill1_fire
- hero_vampire_dragon_skill1_suck
- hero_vampire_dragon_skill2_fire
- hero_vampire_dragon_skill2_hit
- hero_vampire_dragon_skill3_fire
- hero_vampire_dragon_victory
- hero_vulcan_elf_attack_1
- hero_vulcan_elf_attack_2
- hero_vulcan_elf_death
- hero_vulcan_elf_skill1
- hero_vulcan_elf_skill2
- hero_vulcan_elf_skill3_fire
- hero_vulcan_elf_skill3_hit
- hero_vulcan_elf_victory
- loss_music
- main_screen_big_fire
- main_screen_crickets
- main_screen_music
- main_screen_small_fire
- monster_archer_grunt_attack_fire
- monster_archer_grunt_attack_hit
- monster_archer_grunt_death
- monster_archer_grunt_victory
- monster_archer_magic_attack_fire
- monster_archer_magic_attack_hit
- monster_archer_magic_death
- monster_archer_magic_victory
- monster_archer_phys_attack_fire
- monster_archer_phys_attack_hit
- monster_archer_phys_death
- monster_archer_phys_victory
- monster_boss_abyss_dragon_basic_attack
- monster_boss_abyss_dragon_basic_attack_hit
- monster_boss_abyss_dragon_death
- monster_boss_abyss_dragon_skill1_impact
- monster_boss_abyss_dragon_skill1_start
- monster_boss_abyss_dragon_skill2
- monster_boss_abyss_dragon_victory
- monster_boss_anubis_dragon_basic_attack_auragathering
- monster_boss_anubis_dragon_basic_attack_hit
- monster_boss_anubis_dragon_basic_attack_sandball
- monster_boss_anubis_dragon_death
- monster_boss_anubis_dragon_hit_shell
- monster_boss_anubis_dragon_skill1_bracelet_brilliant
- monster_boss_anubis_dragon_skill1_hit
- monster_boss_anubis_dragon_skill1_sandwave_1
- monster_boss_anubis_dragon_skill1_sandwave_2
- monster_boss_anubis_dragon_skill1_sandwave_3
- monster_boss_anubis_dragon_victory
- monster_boss_umlaut_the_first_attack
- monster_boss_umlaut_the_first_attack_hit
- monster_boss_umlaut_the_first_death
- monster_boss_umlaut_the_first_skill1
- monster_boss_umlaut_the_first_skill2
- monster_boss_umlaut_the_first_victory
- monster_boss_umlautthefifth_first_basic_attack
- monster_boss_umlautthefifth_first_basic_attack_hit
- monster_boss_umlautthefifth_first_death
- monster_boss_umlautthefifth_first_skill1_attack
- monster_boss_umlautthefifth_first_skill1_start
- monster_boss_umlautthefifth_first_skill2
- monster_boss_umlautthefifth_first_skill3_intro
- monster_boss_umlautthefifth_first_skill3_lightning
- monster_boss_umlautthefifth_first_skill3_noise
- monster_boss_umlautthefifth_first_skill3_shaking
- monster_boss_umlautthefifth_first_victory
- monster_goblin_attack
- monster_goblin_death
- monster_goblin_victory
- monster_magic_golem_attack_fire
- monster_magic_golem_attack_hit
- monster_magic_golem_death
- monster_magic_golem_victory
- monster_magic_imp_attack_fire
- monster_magic_imp_attack_hit
- monster_magic_imp_death
- monster_magic_imp_victory
- monster_man_eating_plant_attack
- monster_man_eating_plant_death
- monster_man_eating_plant_hide
- monster_man_eating_plant_out
- monster_man_eating_plant_victory
- monster_man_eating_plant_walk
- monster_phys_golem_attack_fire
- monster_phys_golem_attack_hit
- monster_phys_golem_death
- monster_phys_golem_victory
- perblue
- power_points_lvl_up
- purchase_diamonds
- quest_collect
- raid_result
- regular_purchase
- reward_claim_button
- sign_in_reward
- team_level_up
- ui_button_tap
- ui_menu_back
- ui_menu_close
- ui_menu_popup_close
- ui_menu_popup_open
- ui_menu_scroll_close
- ui_menu_scroll_open
- victory_fanfare
- vip_level_up
- you_won_seq
- boss_pit_ui_defeated
- boss_pit_ui_fled
- bossbattle_music_boss
- bosspit_evil_wizard_death
- bosspit_evil_wizard_flee
- bosspit_evil_wizard_summon
- bosspit_evil_wizard_throw_fire
- bosspit_evil_wizard_throw_hit
- bosspit_evil_wizard_victory
- bosspit_giant_plant_bite_attack_1
- bosspit_giant_plant_bite_attack_2
- bosspit_giant_plant_bite_attack_idle
- bosspit_giant_plant_bite_attack_pullback
- bosspit_giant_plant_bite_attack_swallow
- bosspit_giant_plant_bite_cliff_fall
- bosspit_giant_plant_bite_pullback_to_pot
- bosspit_giant_plant_death
- bosspit_giant_plant_flee_loop
- bosspit_giant_plant_flee_start
- bosspit_giant_plant_hide
- bosspit_giant_plant_hop
- bosspit_giant_plant_minion_attack_loop
- bosspit_giant_plant_minion_death
- bosspit_giant_plant_minion_growth
- bosspit_giant_plant_poison
- bosspit_giant_plant_pot_breaking
- bosspit_giant_plant_spew
- bosspit_giant_plant_unhide
- bosspit_giant_plant_victory
- bosspit_gold_colossus_attack
- bosspit_gold_colossus_coin_fire
- bosspit_gold_colossus_coin_hit
- bosspit_gold_colossus_death
- bosspit_gold_colossus_eat
- bosspit_gold_colossus_jump
- bosspit_gold_colossus_land
- bosspit_gold_colossus_victory
- bosspit_gold_colossus_wind
- bosspit_music_colossus
- bosspit_music_plant
- bosspit_music_wizard
- cave_difficulty
- enchanting_choose_hero
- enchanting_get_item
- expeditions_chest_open_reward
- expeditions_fightbutton_press
- expeditions_green_checkmark
- expeditions_wave_end_chest_open
- expeditions_wave_start
- hero_abyss_dragon_basic_attack
- hero_abyss_dragon_basic_attack_hit
- hero_abyss_dragon_death
- hero_abyss_dragon_skill1_impact
- hero_abyss_dragon_skill1_start
- hero_abyss_dragon_skill2
- hero_abyss_dragon_skill3_attack
- hero_abyss_dragon_skill4_attack
- hero_abyss_dragon_victory
- hero_ancient_dwarf_attack
- hero_ancient_dwarf_attack_hit
- hero_ancient_dwarf_death
- hero_ancient_dwarf_skill1_buff
- hero_ancient_dwarf_skill1_shout
- hero_ancient_dwarf_skill2_hit_1
- hero_ancient_dwarf_skill2_hit_2
- hero_ancient_dwarf_skill2_hit_3
- hero_ancient_dwarf_skill2_shoot_1
- hero_ancient_dwarf_skill2_shoot_2
- hero_ancient_dwarf_skill2_shoot_3
- hero_ancient_dwarf_skill3_healing
- hero_ancient_dwarf_skill3_hoof
- hero_ancient_dwarf_skill4_hit
- hero_ancient_dwarf_skill4_shoot
- hero_ancient_dwarf_victory
- hero_angel_dragon_attack
- hero_angel_dragon_attack_hit
- hero_angel_dragon_skill1_end
- hero_angel_dragon_skill1_loop
- hero_angel_dragon_skill1_start
- hero_angel_dragon_skill2_end
- hero_angel_dragon_skill2_loop
- hero_angel_dragon_skill2_start
- hero_angel_dragon_skill4
- hero_angelic_herald_attack
- hero_angelic_herald_skill1
- hero_angelic_herald_skill2
- hero_angelic_herald_skill2_attack1
- hero_angelic_herald_skill2_attack2
- hero_angelic_herald_skill5_shimmer
- hero_angelic_herald_skill5_trumpet
- hero_aquatic_man_attack_fire
- hero_aquatic_man_attack_hit
- hero_aquatic_man_death
- hero_aquatic_man_skill1_fire
- hero_aquatic_man_skill1_hit
- hero_aquatic_man_skill2_fire
- hero_aquatic_man_skill2_spout
- hero_aquatic_man_skill2_swirl
- hero_aquatic_man_skill3_buff
- hero_aquatic_man_skill3_fire
- hero_aquatic_man_skill3_hit
- hero_aquatic_man_victory
- hero_banshee_attack_fire
- hero_banshee_attack_hit
- hero_banshee_death
- hero_banshee_skill1_end
- hero_banshee_skill1_loop_1
- hero_banshee_skill1_loop_2
- hero_banshee_skill1_start
- hero_banshee_skill3_loop
- hero_banshee_skill3_start
- hero_banshee_victory
- hero_bardbarian_attack_fire
- hero_bardbarian_attack_hit
- hero_bardbarian_death
- hero_bardbarian_skill1
- hero_bardbarian_skill2_fire
- hero_bardbarian_skill2_hit_wave
- hero_bardbarian_skill3_hit
- hero_bardbarian_victory
- hero_black_wing_attack
- hero_black_wing_death
- hero_black_wing_skill1
- hero_black_wing_skill1_fire
- hero_black_wing_skill1_impact
- hero_black_wing_skill2
- hero_black_wing_skill4
- hero_black_wing_victory
- hero_bone_dragon_attack_fire
- hero_bone_dragon_attack_hit
- hero_bone_dragon_death
- hero_bone_dragon_skill1_fire
- hero_bone_dragon_skill1_hit
- hero_bone_dragon_skill1_smoulder
- hero_bone_dragon_skill2_fire
- hero_bone_dragon_skill2_hit
- hero_bone_dragon_skill3_fire
- hero_bone_dragon_skill3_heal
- hero_bone_dragon_victory
- hero_bulwark_angel_attack
- hero_bulwark_angel_skill1
- hero_bulwark_angel_skill2_end
- hero_bulwark_angel_skill2_loop
- hero_bulwark_angel_skill2_start
- hero_bulwark_angel_skill3_loop
- hero_bulwark_angel_skill3_start
- hero_burnt_one_attack
- hero_burnt_one_death
- hero_burnt_one_skill1_active_end
- hero_burnt_one_skill1_active_start
- hero_burnt_one_skill1_passive_end
- hero_burnt_one_skill1_passive_loop
- hero_burnt_one_skill1_passive_start
- hero_burnt_one_skill3_hit
- hero_burnt_one_skill3_lava
- hero_catapult_knight_attack_fire
- hero_catapult_knight_attack_hit
- hero_catapult_knight_death
- hero_catapult_knight_skill1_fire
- hero_catapult_knight_skill1_hit
- hero_catapult_knight_skill2_fire
- hero_catapult_knight_skill2_hit
- hero_catapult_knight_skill3
- hero_catapult_knight_victory
- hero_claw_man_basic_attack
- hero_claw_man_death
- hero_claw_man_skill1
- hero_claw_man_skill1_jump
- hero_claw_man_skill2_1
- hero_claw_man_skill2_2
- hero_claw_man_skill4
- hero_claw_man_victory
- hero_cursed_statue_attack_beam
- hero_cursed_statue_attack_fire
- hero_cursed_statue_death
- hero_cursed_statue_skill1_fire
- hero_cursed_statue_skill1_hit
- hero_cursed_statue_skill2_fire
- hero_cursed_statue_skill2_switch
- hero_cursed_statue_skill3
- hero_cursed_statue_victory
- hero_cyclops_wizard_attack_fire
- hero_cyclops_wizard_attack_hit
- hero_cyclops_wizard_death
- hero_cyclops_wizard_skill1
- hero_cyclops_wizard_skill1_hit
- hero_cyclops_wizard_skill2_fire
- hero_cyclops_wizard_skill2_hit
- hero_cyclops_wizard_skill3_fire
- hero_cyclops_wizard_skill3_hit
- hero_cyclops_wizard_victory
- hero_dark_hero_attack
- hero_dark_hero_skill1_end
- hero_dark_hero_skill1_loop
- hero_dark_hero_skill1_start
- hero_dark_hero_skill2
- hero_dark_hero_skill4
- hero_dark_hero_victory
- hero_dark_horse_attack
- hero_dark_horse_death
- hero_dark_horse_skill1
- hero_dark_horse_skill2
- hero_dark_horse_skill3
- hero_dark_horse_victory
- hero_deep_dragon_attack_fire
- hero_deep_dragon_attack_hit
- hero_deep_dragon_death
- hero_deep_dragon_skill1_end
- hero_deep_dragon_skill1_loop_1
- hero_deep_dragon_skill1_loop_2
- hero_deep_dragon_skill1_start
- hero_deep_dragon_skill2
- hero_deep_dragon_skill3_fire
- hero_deep_dragon_skill3_hit
- hero_deep_dragon_skill6_hit
- hero_deep_dragon_victory
- hero_demon_totem_attack_stacked
- hero_demon_totem_skill2_stacked
- hero_demon_totem_skill3_stacked
- hero_demon_totem_t1_attack
- hero_demon_totem_t1_death
- hero_demon_totem_t1_skill1
- hero_demon_totem_t1_skill2
- hero_demon_totem_t1_skill3
- hero_demon_totem_t1_skill6
- hero_demon_totem_t1_victory
- hero_demon_totem_t2_attack
- hero_demon_totem_t2_death
- hero_demon_totem_t2_skill1
- hero_demon_totem_t2_skill2
- hero_demon_totem_t2_skill3
- hero_demon_totem_t2_skill6
- hero_demon_totem_t2_victory
- hero_demon_totem_t3_attack
- hero_demon_totem_t3_death
- hero_demon_totem_t3_skill1
- hero_demon_totem_t3_skill2
- hero_demon_totem_t3_skill3
- hero_demon_totem_t3_skill6
- hero_demon_totem_t3_victory
- hero_demon_totem_victory_stacked
- hero_digger_mole_attack
- hero_digger_mole_attack_hit
- hero_digger_mole_death
- hero_digger_mole_skill1_1
- hero_digger_mole_skill1_2
- hero_digger_mole_skill1_3
- hero_digger_mole_skill2
- hero_digger_mole_skill2_hit
- hero_digger_mole_skill2_molark
- hero_digger_mole_skill3
- hero_digger_mole_skill3_molark
- hero_digger_mole_skill4_guard
- hero_digger_mole_skill4_hit
- hero_digger_mole_skill4_jump
- hero_digger_mole_skill5
- hero_digger_mole_victory
- hero_doppelganger_attack_fire
- hero_doppelganger_attack_hit
- hero_doppelganger_death
- hero_doppelganger_mimi_hit
- hero_doppelganger_mimi_loop_1
- hero_doppelganger_mimi_loop_2
- hero_doppelganger_mimi_loop_3
- hero_doppelganger_mimi_loop_4
- hero_doppelganger_skill1
- hero_doppelganger_skill1_idle_1
- hero_doppelganger_skill1_idle_2
- hero_doppelganger_skill2_fire
- hero_doppelganger_skill2_hit
- hero_doppelganger_skill3
- hero_doppelganger_victory
- hero_dragon_slayer_attack
- hero_dragon_slayer_death
- hero_dragon_slayer_skill1
- hero_dragon_slayer_skill3
- hero_dragon_slayer_victory
- hero_dragzilla_attack_fire
- hero_dragzilla_attack_hit
- hero_dragzilla_death
- hero_dragzilla_foot1
- hero_dragzilla_foot2
- hero_dragzilla_hit
- hero_dragzilla_skill1_fire
- hero_dragzilla_skill1_hit
- hero_dragzilla_skill2_fire
- hero_dragzilla_skill2_hit
- hero_dragzilla_victory
- hero_druidinatrix_attack
- hero_druidinatrix_death
- hero_druidinatrix_skill1_fire
- hero_druidinatrix_skill1_hit
- hero_druidinatrix_skill2
- hero_druidinatrix_skill3_fire
- hero_druidinatrix_skill3_hit
- hero_druidinatrix_victory
- hero_druidinatrix_wings
- hero_dungeon_man_attack
- hero_dungeon_man_attack_dice_impact
- hero_dungeon_man_death
- hero_dungeon_man_skill1
- hero_dungeon_man_skill1_hit
- hero_dungeon_man_skill2
- hero_dungeon_man_skill3
- hero_dungeon_man_skill3_hit
- hero_dungeon_man_victory
- hero_dwarven_archer_attack_fire
- hero_dwarven_archer_attack_hit
- hero_dwarven_archer_death
- hero_dwarven_archer_skill1
- hero_dwarven_archer_skill2_fire
- hero_dwarven_archer_skill2_hit
- hero_dwarven_archer_skill3
- hero_dwarven_archer_victory
- hero_eternal_enchanter_attack
- hero_eternal_enchanter_attack_hit
- hero_eternal_enchanter_death
- hero_eternal_enchanter_skill1_end
- hero_eternal_enchanter_skill1_loop
- hero_eternal_enchanter_skill1_start
- hero_eternal_enchanter_skill2
- hero_eternal_enchanter_skill3_end
- hero_eternal_enchanter_skill3_loop
- hero_eternal_enchanter_skill3_start
- hero_eternal_enchanter_victory
- hero_fairy_dragon_attack_fire
- hero_fairy_dragon_attack_hit
- hero_fairy_dragon_death
- hero_fairy_dragon_skill1_charge
- hero_fairy_dragon_skill1_fire
- hero_fairy_dragon_skill2_buff
- hero_fairy_dragon_skill2_fire
- hero_fairy_dragon_skill3_fire
- hero_fairy_dragon_skill3_hit
- hero_fairy_dragon_victory
- hero_forgotten_dragon_attack
- hero_forgotten_dragon_attack_hit
- hero_forgotten_dragon_death
- hero_forgotten_dragon_hit
- hero_forgotten_dragon_skill1
- hero_forgotten_dragon_skill1_coo
- hero_forgotten_dragon_skill2
- hero_forgotten_dragon_skill2_coo
- hero_forgotten_dragon_skill3
- hero_forgotten_dragon_skill4
- hero_forgotten_dragon_victory
- hero_forgotten_dragon_victory_pops
- hero_frost_giant_attack_fire
- hero_frost_giant_attack_hit
- hero_frost_giant_death
- hero_frost_giant_skill1
- hero_frost_giant_skill2_fire
- hero_frost_giant_skill2_hit
- hero_frost_giant_skill3
- hero_frost_giant_victory
- hero_genie_attack_cow
- hero_genie_attack_fire
- hero_genie_death
- hero_genie_skill1_fire
- hero_genie_skill1_hit
- hero_genie_skill1_loop
- hero_genie_skill2_end
- hero_genie_skill2_start
- hero_genie_skill3_goat
- hero_genie_skill3_hit
- hero_genie_skill5_build
- hero_genie_skill5_polymorph
- hero_genie_victory
- hero_grand_huntress_attack
- hero_grand_huntress_attack_hit
- hero_grand_huntress_death
- hero_grand_huntress_skill1
- hero_grand_huntress_skill1_barrage
- hero_grand_huntress_skill1_hit
- hero_grand_huntress_skill1_loop
- hero_grand_huntress_skill2
- hero_grand_huntress_skill3
- hero_grand_huntress_skill3_hit
- hero_grand_huntress_victory
- hero_greedy_dragon_basic_attack
- hero_greedy_dragon_death
- hero_greedy_dragon_skill1_end
- hero_greedy_dragon_skill1_explode
- hero_greedy_dragon_skill1_loop
- hero_greedy_dragon_skill1_start
- hero_greedy_dragon_skill2
- hero_greedy_dragon_skill3
- hero_greedy_dragon_victory
- hero_groovy_druid_attack_fire
- hero_groovy_druid_attack_hit
- hero_groovy_druid_death
- hero_groovy_druid_disco_death
- hero_groovy_druid_disco_skill1
- hero_groovy_druid_disco_skill1_hit
- hero_groovy_druid_disco_skill2
- hero_groovy_druid_disco_skill2_hit
- hero_groovy_druid_disco_skill3
- hero_groovy_druid_skill1_fire
- hero_groovy_druid_skill1_hit
- hero_groovy_druid_skill2_cast
- hero_groovy_druid_skill2_hit
- hero_groovy_druid_skill3_cast
- hero_groovy_druid_victory
- hero_karaoke_king_attack
- hero_karaoke_king_attack_hit
- hero_karaoke_king_death
- hero_karaoke_king_skill1_end
- hero_karaoke_king_skill1_loop
- hero_karaoke_king_skill1_start
- hero_karaoke_king_skill2
- hero_karaoke_king_skill3
- hero_karaoke_king_skill4
- hero_karaoke_king_victory
- hero_karaoke_king_victory_alt
- hero_kraken_king_attack
- hero_kraken_king_death
- hero_kraken_king_mechalord_attack
- hero_kraken_king_mechalord_attack_hit
- hero_kraken_king_mechalord_skill1_giant_tentacle
- hero_kraken_king_mechalord_skill3
- hero_kraken_king_skill1
- hero_kraken_king_skill3
- hero_kraken_king_tentacle
- hero_kraken_king_victory
- hero_last_defender_basic_attack_hammer
- hero_last_defender_basic_attack_hammer_1
- hero_last_defender_basic_attack_hammer_end
- hero_last_defender_basic_attack_shield
- hero_last_defender_basic_attack_shield_1
- hero_last_defender_death
- hero_last_defender_skill1
- hero_last_defender_skill5
- hero_last_defender_victory
- hero_magic_dragon_attack_fire
- hero_magic_dragon_attack_hit
- hero_magic_dragon_death
- hero_magic_dragon_skill1_fire
- hero_magic_dragon_skill1_hit
- hero_magic_dragon_skill2_fire
- hero_magic_dragon_skill2_hit
- hero_magic_dragon_skill3_fire
- hero_magic_dragon_skill3_generate
- hero_magic_dragon_skill3_hit
- hero_magic_dragon_victory
- hero_medusa_attack_fire
- hero_medusa_attack_hit
- hero_medusa_death
- hero_medusa_skill1_fire
- hero_medusa_skill1_hit
- hero_medusa_skill2_fire
- hero_medusa_skill2_hit
- hero_medusa_skill3
- hero_medusa_victory
- hero_minotaur_attack
- hero_minotaur_death
- hero_minotaur_skill1
- hero_minotaur_skill2_hit
- hero_minotaur_skill2_run
- hero_minotaur_skill3
- hero_minotaur_victory
- hero_mistress_manicure_attack
- hero_mistress_manicure_attack_impact
- hero_mistress_manicure_death
- hero_mistress_manicure_skill1_end
- hero_mistress_manicure_skill1_loop
- hero_mistress_manicure_skill1_start
- hero_mistress_manicure_skill2
- hero_mistress_manicure_skill3
- hero_mistress_manicure_victory
- hero_orc_monk_attack
- hero_orc_monk_death
- hero_orc_monk_skill1
- hero_orc_monk_skill2
- hero_orc_monk_skill3
- hero_orc_monk_victory
- hero_pirate_attack_fire
- hero_pirate_attack_hit
- hero_pirate_death
- hero_pirate_skill1_fire
- hero_pirate_skill1_hit
- hero_pirate_skill2
- hero_pirate_skill2_yar
- hero_pirate_skill3_fire
- hero_pirate_skill3_hit
- hero_pirate_victory
- hero_plague_entrepreneur_attack
- hero_plague_entrepreneur_death
- hero_plague_entrepreneur_skill1
- hero_plague_entrepreneur_skill2
- hero_plague_entrepreneur_skill2_hit
- hero_plant_soul_attack
- hero_plant_soul_death
- hero_plant_soul_skill1_end
- hero_plant_soul_skill1_loop
- hero_plant_soul_skill1_start
- hero_plant_soul_victory
- hero_rabid_dragon_attack_fire
- hero_rabid_dragon_attack_hit
- hero_rabid_dragon_death
- hero_rabid_dragon_skill1_seq1
- hero_rabid_dragon_skill1_seq2
- hero_rabid_dragon_skill1_seq4
- hero_rabid_dragon_skill1_seq5
- hero_rabid_dragon_skill2_fire
- hero_rabid_dragon_skill2_hit
- hero_rabid_dragon_skill3
- hero_rabid_dragon_victory
- hero_raging_revenant_attack
- hero_raging_revenant_attack_impact
- hero_raging_revenant_death
- hero_raging_revenant_skill1
- hero_raging_revenant_skill2_fire
- hero_raging_revenant_skill2_hit
- hero_raging_revenant_skill3
- hero_raging_revenant_skill4
- hero_raging_revenant_skill5_loop
- hero_raging_revenant_victory
- hero_sadistic_dancer_basic_attack_hit
- hero_sadistic_dancer_basic_attack_thunder
- hero_sadistic_dancer_basic_attack_whip
- hero_sadistic_dancer_death
- hero_sadistic_dancer_skill1_damage_up
- hero_sadistic_dancer_skill1_energy_down
- hero_sadistic_dancer_skill1_loop
- hero_sadistic_dancer_skill1_ring_fingers
- hero_sadistic_dancer_skill2_end
- hero_sadistic_dancer_skill2_loop
- hero_sadistic_dancer_skill2_start
- hero_sadistic_dancer_victory
- hero_satyr_attack
- hero_satyr_death
- hero_satyr_hit
- hero_satyr_skill1
- hero_satyr_skill2
- hero_satyr_stunheal
- hero_satyr_victory
- hero_savage_cutie_attack
- hero_savage_cutie_death
- hero_savage_cutie_hit
- hero_savage_cutie_skill1
- hero_savage_cutie_skill2
- hero_savage_cutie_skill3
- hero_savage_cutie_victory
- hero_shadow_assassin_attack_fire
- hero_shadow_assassin_attack_hit
- hero_shadow_assassin_death
- hero_shadow_assassin_skill1_end
- hero_shadow_assassin_skill1_fire
- hero_shadow_assassin_skill1_hit
- hero_shadow_assassin_skill2_fire
- hero_shadow_assassin_skill2_hit
- hero_shadow_assassin_skill3_fire
- hero_shadow_assassin_skill3_hit
- hero_shadow_assassin_victory
- hero_silent_spirit_attack
- hero_silent_spirit_skill1
- hero_silent_spirit_skill2
- hero_silent_spirit_skill3
- hero_silent_spirit_skill4
- hero_silent_spirit_skill4_end
- hero_silent_spirit_victory
- hero_skeleton_king_attack_fire
- hero_skeleton_king_attack_hit
- hero_skeleton_king_death
- hero_skeleton_king_hit
- hero_skeleton_king_skill1
- hero_skeleton_king_skill2_dmg
- hero_skeleton_king_skill2_fire
- hero_skeleton_king_skill2_heal
- hero_skeleton_king_skill3
- hero_skeleton_king_victory
- hero_snake_dragon_attack
- hero_snake_dragon_death
- hero_snake_dragon_skill1_fire
- hero_snake_dragon_skill1_hit
- hero_snake_dragon_skill3
- hero_snake_dragon_victory
- hero_sniper_wolf_attack_fire
- hero_sniper_wolf_attack_hit
- hero_sniper_wolf_death
- hero_sniper_wolf_skill1
- hero_sniper_wolf_skill2
- hero_sniper_wolf_skill3_fire
- hero_sniper_wolf_skill3_wolf_loop
- hero_sniper_wolf_victory
- hero_sniper_wolf_victory_wolf
- hero_sojourner_sorceress_attack
- hero_sojourner_sorceress_attack_hit
- hero_sojourner_sorceress_death
- hero_sojourner_sorceress_skill1
- hero_sojourner_sorceress_skill1_hit
- hero_sojourner_sorceress_skill2_cast
- hero_sojourner_sorceress_skill2_hit
- hero_sojourner_sorceress_skill2_pop
- hero_sojourner_sorceress_skill3
- hero_sojourner_sorceress_skill5_fireballs
- hero_sojourner_sorceress_skill5_scream
- hero_sojourner_sorceress_victory
- hero_solid_longevity_basic_attack
- hero_solid_longevity_basic_attack_hit
- hero_solid_longevity_death
- hero_solid_longevity_skill1_attack
- hero_solid_longevity_skill1_loop
- hero_solid_longevity_skill1_start
- hero_solid_longevity_skill2
- hero_solid_longevity_skill3
- hero_solid_longevity_skill4
- hero_solid_longevity_victory
- hero_spectral_dragon_attack_fire
- hero_spectral_dragon_attack_hit
- hero_spectral_dragon_death
- hero_spectral_dragon_skill1
- hero_spectral_dragon_skill2_flame1
- hero_spectral_dragon_skill2_flame2
- hero_spectral_dragon_skill2_flame3_fire
- hero_spectral_dragon_skill2_hit
- hero_spectral_dragon_skill3
- hero_spectral_dragon_victory
- hero_spider_queen_attack
- hero_spider_queen_coccoon_deflate
- hero_spider_queen_coccoon_fall
- hero_spider_queen_coccoon_pop
- hero_spider_queen_death
- hero_spider_queen_skill1_end
- hero_spider_queen_skill1_loop
- hero_spider_queen_skill1_spray
- hero_spider_queen_skill1_start
- hero_spider_queen_skill2
- hero_spider_queen_victory
- hero_spikey_dragon_attack_fire
- hero_spikey_dragon_attack_hit
- hero_spikey_dragon_death
- hero_spikey_dragon_skill1_fire
- hero_spikey_dragon_skill1_hit
- hero_spikey_dragon_skill2_fire
- hero_spikey_dragon_skill2_hit
- hero_spikey_dragon_skill3
- hero_spikey_dragon_victory
- hero_stepladder_brothers_attack_hit
- hero_stepladder_brothers_attack_projectile
- hero_stepladder_brothers_attack_throw
- hero_stepladder_brothers_death
- hero_stepladder_brothers_skill1_end_hit
- hero_stepladder_brothers_skill1_end_projectile
- hero_stepladder_brothers_skill1_end_throw
- hero_stepladder_brothers_skill1_loop
- hero_stepladder_brothers_skill1_start
- hero_stepladder_brothers_skill2
- hero_stepladder_brothers_skill2_wall
- hero_stepladder_brothers_skill3
- hero_stepladder_brothers_skill4_hit
- hero_stepladder_brothers_skill4_objectappear
- hero_stepladder_brothers_skill4_throw
- hero_stepladder_brothers_victory
- hero_storm_dragon_attack_fire
- hero_storm_dragon_attack_hit
- hero_storm_dragon_death
- hero_storm_dragon_skill1_fire
- hero_storm_dragon_skill1_hit
- hero_storm_dragon_skill2_fire
- hero_storm_dragon_skill2_hit
- hero_storm_dragon_skill3_fire
- hero_storm_dragon_skill3_hit
- hero_storm_dragon_victory
- hero_stowaway_attack_fire
- hero_stowaway_attack_hit
- hero_stowaway_death
- hero_stowaway_skill1_bomb
- hero_stowaway_skill1_boomerang
- hero_stowaway_skill1_fire
- hero_stowaway_skill1_grenade
- hero_stowaway_skill1_pennies
- hero_stowaway_skill1_tears
- hero_stowaway_skill2_end
- hero_stowaway_skill2_grab
- hero_stowaway_skill2_start
- hero_stowaway_skill4_end
- hero_stowaway_skill4_hit
- hero_stowaway_skill4_loop_1
- hero_stowaway_skill4_loop_2
- hero_stowaway_victory
- hero_sun_seeker_attack_1
- hero_sun_seeker_attack_2
- hero_sun_seeker_death
- hero_sun_seeker_skill1_fire
- hero_sun_seeker_skill1_fireball
- hero_sun_seeker_skill1_hitball
- hero_sun_seeker_skill1_hitenemy
- hero_sun_seeker_skill1_throw
- hero_sun_seeker_skill2_explosion
- hero_sun_seeker_skill2_firehand
- hero_sun_seeker_skill2_sunlight
- hero_sun_seeker_skill4_cross_scoops
- hero_sun_seeker_skill4_fire_scoops
- hero_sun_seeker_skill4_hit_enemy_fire
- hero_sun_seeker_skill4_hit_enemy_scoops
- hero_sun_seeker_skill4_hit_get_scoop
- hero_sun_seeker_skill4_hit_put_away_scoop
- hero_sun_seeker_skill4_sun
- hero_sun_seeker_victory
- hero_tomb_angel_attack
- hero_tomb_angel_prison_end
- hero_tomb_angel_prison_start
- hero_tomb_angel_skill2
- hero_tomb_angel_skill3
- hero_triple_threat_attack
- hero_triple_threat_death
- hero_triple_threat_skill1
- hero_triple_threat_skill2
- hero_triple_threat_skill3
- hero_triple_threat_skill3_hit
- hero_triple_threat_victory
- hero_unicorgi_attack
- hero_unicorgi_death
- hero_unicorgi_skill1_part1
- hero_unicorgi_skill1_part2
- hero_unicorgi_skill1_part3
- hero_unicorgi_skill2
- hero_unicorgi_skill3
- hero_unicorgi_victory
- hero_unripe_mythology_attack
- hero_unripe_mythology_death_dragon
- hero_unripe_mythology_death_egg
- hero_unripe_mythology_skill1_blast
- hero_unripe_mythology_skill1_impact
- hero_unripe_mythology_skill1_spin
- hero_unripe_mythology_skill3_end
- hero_unripe_mythology_skill3_loop
- hero_unripe_mythology_skill4
- hero_unripe_mythology_victory
- hero_vermilion_bird_basic_attack
- hero_vermilion_bird_basic_attack_hit
- hero_vermilion_bird_death
- hero_vermilion_bird_skill1_attack
- hero_vermilion_bird_skill1_hit
- hero_vermilion_bird_skill1_loop
- hero_vermilion_bird_skill1_start
- hero_vermilion_bird_skill2
- hero_vermilion_bird_skill3_loop
- hero_vermilion_bird_skill4
- hero_vermilion_bird_victory
- hero_vile_bile_attack
- hero_vile_bile_death
- hero_vile_bile_skill1_end
- hero_vile_bile_skill1_loop
- hero_vile_bile_skill2
- hero_vile_bile_skill4
- hero_void_wyvern_attack
- hero_void_wyvern_death
- hero_void_wyvern_skill1_end
- hero_void_wyvern_skill1_loop
- hero_void_wyvern_skill2_fire
- hero_void_wyvern_skill2_hit_01
- hero_void_wyvern_skill2_hit_02
- hero_void_wyvern_skill2_hit_03
- hero_void_wyvern_skill3
- hero_void_wyvern_victory
- hero_vulture_dragon_attack
- hero_vulture_dragon_death
- hero_vulture_dragon_skill1_end
- hero_vulture_dragon_skill1_loop
- hero_vulture_dragon_skill1_loop_slash_1
- hero_vulture_dragon_skill1_loop_slash_2
- hero_vulture_dragon_skill1_start
- hero_vulture_dragon_skill1_swoop
- hero_vulture_dragon_skill2_fire
- hero_vulture_dragon_skill2_sizzle
- hero_vulture_dragon_skill5
- hero_vulture_dragon_victory
- hero_wee_witch_attack
- hero_wee_witch_death
- hero_wee_witch_skill1
- hero_wee_witch_skill1_hit
- hero_wee_witch_skill2
- hero_wee_witch_victory
- hero_weredragon_attack_dragon
- hero_weredragon_attack_dragon_v2
- hero_weredragon_attack_man
- hero_weredragon_attack_man_v1
- hero_weredragon_death_dragon
- hero_weredragon_death_man
- hero_weredragon_skill1
- hero_weredragon_skill1_revert
- hero_weredragon_skill2
- hero_weredragon_skill3
- hero_weredragon_skill3_hit
- hero_weredragon_skill5
- hero_weredragon_skill5_revert
- hero_weredragon_victory
- hero_white_tiger_basic_attack
- hero_white_tiger_basic_attack_hit
- hero_white_tiger_death
- hero_white_tiger_skill1_attack
- hero_white_tiger_skill1_hit
- hero_white_tiger_skill3_attack
- hero_white_tiger_skill3_hit
- hero_white_tiger_skill3_impact
- hero_white_tiger_victory
- hero_zombie_squire_attack
- hero_zombie_squire_death
- hero_zombie_squire_hit_organs
- hero_zombie_squire_skill1
- hero_zombie_squire_skill2
- hero_zombie_squire_skill4
- hero_zombie_squire_victory
- monster_angelic_avenger_attack
- monster_ant_ambush
- monster_ant_attack
- monster_ant_death
- monster_ant_pre_attack
- monster_ant_victory
- monster_anubis_dragon_basic_attack_auragathering
- monster_anubis_dragon_basic_attack_hit
- monster_anubis_dragon_basic_attack_sandball
- monster_anubis_dragon_death
- monster_anubis_dragon_hit_shell
- monster_anubis_dragon_skill1_bracelet_brilliant
- monster_anubis_dragon_skill1_hit
- monster_anubis_dragon_skill1_sandwave_1
- monster_anubis_dragon_skill1_sandwave_2
- monster_anubis_dragon_skill1_sandwave_3
- monster_anubis_dragon_victory
- monster_blue_dragon_basic_attack
- monster_blue_dragon_basic_attack_hit
- monster_blue_dragon_death
- monster_blue_dragon_skill1_impact
- monster_blue_dragon_skill1_start
- monster_blue_dragon_skill2
- monster_blue_dragon_victory
- monster_breaker_mkii_attack
- monster_breaker_mkii_death_explode
- monster_breaker_mkii_death_heat
- monster_breaker_mkii_death_steam
- monster_breaker_mkii_skill1_end
- monster_breaker_mkii_skill1_hit
- monster_breaker_mkii_skill1_start
- monster_breaker_mkii_skill1_steam
- monster_breaker_mkii_victory_drill
- monster_breaker_mkii_victory_steam
- monster_cauldron_monster_death
- monster_cauldron_monster_hit
- monster_cauldron_monster_victory
- monster_cauldron_monster_walk_loop
- monster_cauldron_monster_walk_start
- monster_cauldron_monster_walk_stop
- monster_cloud_attack
- monster_cloud_death
- monster_cloud_hit
- monster_cloud_shield
- monster_cloud_victory
- monster_crystal_lizard_attack_hit
- monster_crystal_lizard_attack_swing
- monster_crystal_lizard_death
- monster_crystal_lizard_skill1_end
- monster_crystal_lizard_skill1_explode
- monster_crystal_lizard_skill1_loop
- monster_crystal_lizard_skill1_start
- monster_crystal_lizard_victory_eat
- monster_crystal_lizard_victory_fly
- monster_crystal_lizard_victory_growl
- monster_eyeball_attack_fire
- monster_eyeball_attack_hit
- monster_eyeball_death
- monster_eyeball_eyepops
- monster_eyeball_victory
- monster_flea_demon_attack
- monster_head_crab_attack_death
- monster_head_crab_attack_end
- monster_head_crab_attack_loop
- monster_head_crab_attack_start
- monster_head_crab_death
- monster_head_crab_victory
- monster_head_crab_walk
- monster_inferno_spider_attack_fire
- monster_inferno_spider_attack_hit
- monster_inferno_spider_death
- monster_inferno_spider_victory
- monster_kamikaze_gnome_attack
- monster_kamikaze_gnome_tick
- monster_king_imp_attack_fire
- monster_king_imp_attack_hit
- monster_king_imp_death
- monster_king_imp_skill2
- monster_king_imp_victory
- monster_lying_lantern_attack
- monster_lying_lantern_death
- monster_lying_lantern_skill
- monster_lying_lantern_skill_hit
- monster_mr_smashy_attack
- monster_mr_smashy_death
- monster_mr_smashy_step
- monster_mr_smashy_victory
- monster_mushroom_attack
- monster_mushroom_death
- monster_mushroom_victory
- monster_phys_imp_attack_fire
- monster_phys_imp_attack_hit
- monster_phys_imp_death
- monster_phys_imp_victory
- monster_plague_skulker_attack
- monster_plague_skulker_death
- monster_plague_skulker_hit_react
- monster_plague_skulker_victory
- monster_redtiger_basic_attack
- monster_redtiger_skill1_end
- monster_redtiger_skill1_loop
- monster_redtiger_skill1_start
- monster_scarecrow_attack_fire
- monster_scarecrow_attack_hit
- monster_scarecrow_death
- monster_scarecrow_victory
- monster_shark_attack
- monster_shark_death
- monster_shark_hit
- monster_shark_skill1
- monster_shark_victory
- monster_sinister_assailant_attack
- monster_sinister_assailant_death
- monster_sinister_assailant_skill1
- monster_sinister_assailant_skill1_impact
- monster_sinister_assailant_victory
- monster_sinister_assailant_victory_scythe_throw
- monster_skeleton_deer_attack
- monster_skeleton_deer_charge
- monster_skeleton_deer_death
- monster_skeleton_deer_stun
- monster_skeleton_deer_victory
- monster_sprite_buff_attack_fire
- monster_sprite_buff_attack_hit
- monster_sprite_buff_death
- monster_sprite_buff_victory
- monster_sprite_heal_attack_fire
- monster_sprite_heal_attack_hit
- monster_sprite_heal_death
- monster_sprite_heal_victory
- monster_squid_squirter_attack_fire
- monster_squid_squirter_attack_hit
- monster_squid_squirter_death
- monster_squid_squirter_victory
- monster_squirrel_attack_hit_1
- monster_squirrel_attack_hit_2
- monster_squirrel_attack_start
- monster_squirrel_death
- monster_squirrel_hit
- monster_squirrel_throw_1
- monster_squirrel_throw_2
- monster_squirrel_throw_3
- monster_squirrel_throw_4
- monster_squirrel_victory
- monster_troll_blob_attack
- monster_troll_blob_death
- monster_troll_blob_victory
- monster_umlautthefifth_first_basic_attack
- monster_umlautthefifth_first_basic_attack_hit
- monster_umlautthefifth_first_death
- monster_umlautthefifth_first_skill1_attack
- monster_umlautthefifth_first_skill1_start
- monster_umlautthefifth_first_skill2
- monster_umlautthefifth_first_victory
- narrator_text
- skull_anim
- temple_ui_coffin
- temple_ui_coffin_open
- temple_ui_doors_close
- temple_ui_doors_open
- temple_ui_rotate
- temple_ui_view_hero
- ui_chat_close
- ui_chat_mini_close
- ui_chat_mini_open
- ui_chat_open
- ui_contest_bell1
- ui_contest_bell2
- ui_contest_progress_meter
- ui_doppleganger_character_select
- ui_fusion_dialog_choose
- ui_fusion_dialog_fuse
- ui_rune_embue
- ui_rune_empower10_rumble_1
- ui_rune_empower10_rumble_2
- ui_rune_empower10_success
- ui_rune_empower_success
- ui_rune_frames_seperate
- ui_rune_fusion_dialog_loop
- ui_rune_fusion_fuse_1
- ui_rune_fusion_fuse_2
- ui_rune_fusion_fuse_5
- ui_rune_fusion_nostars
- ui_rune_fusion_place_in_shrine
- ui_rune_fusion_post_dialog
- ui_rune_fusion_select_offering_1
- ui_rune_fusion_select_offering_2
- ui_rune_fusion_select_rune
- ui_rune_place_rune
- ui_rune_remove_rune
- ui_rune_sell_rune
- ui_rune_server_latency_A
- ui_rune_server_latency_B
- war_battle_music
- war_button_heroes
- war_button_items
- war_check_mark
- war_coin_sack
- war_defeat
- war_menu_music
- war_progress_meter
- war_reward_banner
- war_reward_shield
- war_victory
- war_you_lost
- war_you_won_broken_shield

## Package: com.perblue.rpg.assetupdate (7 classes)

### AssetUpdater (class)
`com.perblue.rpg.assetupdate.AssetUpdater`

**Fields (20):**
- `public static final String COL_CATEGORY = Category`
- `public static final String COL_COMPRESSION = Compression`
- `public static final String COL_DENSITY = Density`
- `public static final String COL_ENVIRONMENT = Environment`
- `public static final String COL_REVISION = Revision`
- `public static final String COL_SIZE = Size`
- `public static final String COL_URL = URL`
- `public static final String DOWNLOAD_ADDITIONAL_ON_BOOT = shouldDownloadAdditionalWorld`
- `public static final String MISSING_ADDITIONAL = missingAdditionalWorld`
- `private static final String TAG = AssetUpdater`
- `public static final String TEST_CONTENT_DOWNLOAD_ENABLED = testContentDownloadEnabled`
- `public static final boolean VERBOSE_LOGGING = false`
- `private boolean active`
- `private CategoryUpdater asyncUpdater`
- `private List backgroundCategories`
- `private List bootCategories`
- `private UpdateListener bootUpdateListener`
- `private CategoryUpdater bootUpdater`
- `private ar finishedTimer`
- `private RPGMain game`

**Methods (28):**
- `boolean isMissingExternals(AssetCategory)`
- `void startAsyncInner(String, UpdateListener, List)`
- `List getBootCategories(boolean)`
- `String getUpdaterPrefs()`
- `void startNewBootUpdater()`
- `List getCategoriesToReDownload(List)`
- `String getStatsReasonForDownload()`
- `boolean isTestingContentDownloadEnabled()`
- `void deleteAllExternalContentForTesting()`
- `boolean isAdditionalBootDownloadEnabled()`
- `void setTestingContentDownloadEnabled(boolean)`
- `void startWarnedDownload()`
- `void cancelUpdate()`
- `void startAsync(long, String, UpdateListener, List)`
- `void startAsync(long)`
- `void enableAdditionalBootDownload(String)`
- `void start(boolean)`
- `void start()`
- `boolean isActive()`

### CategoryUpdater (class)
`com.perblue.rpg.assetupdate.CategoryUpdater`

**Fields (30):**
- `private static final float DOWNLOAD_PERCENT = 0.5`
- `private DownloadListener archiveDownloadListener`
- `private final m archivePrefs`
- `private long archiveSize`
- `private long archiveStartTime`
- `private int archivesDownloaded`
- `private List archivesToDownload`
- `private DownloadListener backupIndexDownloadListener`
- `private boolean canceled`
- `private List categories`
- `private List categoriesToReDownload`
- `private String compression`
- `private String density`
- `private DeviceInfo deviceInfo`
- `private boolean downloadedIndex`
- `private FileDownloader downloader`
- `private String environment`
- `private RPGMain game`
- `private DownloadListener indexDownloadListener`
- `private LineListener indexLineListener`
- `private long indexSize`
- `private long indexStartTime`
- `private UpdateListener listener`
- `private NetworkProvider network`
- `private String reason`
- `private String soundCompression`
- `private String soundDensity`
- `private int totalArchives`
- `private long totalDownloadedSize`
- `private long totalFileSize`

**Methods (43):**
- `void downloadNextArchive()`
- `void startArchiveDownloads()`
- `void checkArchives(List, List, List)`
- `void setCategoriesToReDownload(List)`
- `void startWarnedDownload()`
- `void setCategories(List)`
- `String getResourceFolder()`
- `void setListener(UpdateListener)`
- `void cancel()`
- `List getRows(AssetCategory, List, List, List)`
- `void log(String)`
- `void start(String, String)`

### DownloadListener (interface)
`com.perblue.rpg.assetupdate.DownloadListener`

**Methods (3):**
- `void onFinished(String, String, String)`
- `void onProgress(String, String, int, int, long, long)`
- `void onFailed(String, String)`

### FileDownloader (class)
`com.perblue.rpg.assetupdate.FileDownloader`

**Fields (7):**
- `public static final String ASSETS_FOLDER = Assets`
- `private static final String DOWNLOAD_FOLDER = Downloads`
- `private static final int MAX_FAILURES = 5`
- `private static final String TAG = FileDownloader`
- `private GenericDownloader genericDownloader`
- `private String resourceFolder`
- `private SilentExceptionListener silentListener`

**Methods (11):**
- `a getDownloadDirectory()`
- `a getResourceDirectory()`
- `void getDownloadedTextFile(String, LineListener)`
- `void downloadFile(String, long, DownloadListener)`
- `void downloadFile(String, DownloadListener)`
- `void deleteExternalContentForTesting()`
- `a getAssetDirectory()`
- `void setResourceFolder(String)`
- `void cancel()`

### IDownload (interface)
`com.perblue.rpg.assetupdate.IDownload`

**Methods (3):**
- `void getDownloadedTextFile(String, LineListener)`
- `void downloadFile(String, DownloadListener)`
- `void downloadFile(String, long, DownloadListener)`

### LineListener (interface)
`com.perblue.rpg.assetupdate.LineListener`

**Methods (2):**
- `void onLine(String)`
- `void onComplete()`

### SilentExceptionListener (interface)
`com.perblue.rpg.assetupdate.SilentExceptionListener`

**Methods (2):**
- `void onSilentException(Throwable)`
- `void onSilentException(Throwable, String)`

