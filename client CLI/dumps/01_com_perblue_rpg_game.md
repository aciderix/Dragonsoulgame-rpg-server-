# GAME - Core Game Logic
Package prefix: `com.perblue.rpg.game`
Classes: 714

## com.perblue.rpg.game.ActionHelper
```
public class ActionHelper

  // Fields (1)
  private static final String TAG

  // Constructors (1)
  com.perblue.rpg.game.ActionHelper()

  // Methods (2)
  public static void actionFailed(ClientErrorCodeException, Action)
  public static void doAction(CommandType, UnitType, ItemType, User, Map, ActionListener)
```

## com.perblue.rpg.game.ActionListener
```
public abstract interface interface ActionListener

  // Methods (1)
  public abstract void onResult(boolean, Object)
```

## com.perblue.rpg.game.ClientActionHelper
```
public class ClientActionHelper

  // Fields (4)
  private static final long MERCHANT_REFRESH_MIN_INTERVAL = 2000
  private static Map lastBossBattleAdvanceRequests
  private static Map lastBossBattleResetRequests
  private static Map lastMerchantRefreshRequests

  // Constructors (1)
  com.perblue.rpg.game.ClientActionHelper()

  // Methods (110)
  public static void legendarySacrifice(int, long, ActionListener)
  public static void requestContestRankings(long, boolean)
  public static void requestGuildRankings(RankType)
  public static void requestPlayerRankings(RankType)
  public static void promoteUnitAuto(UnitData, ActionListener)
  public static void redeemCode(String)
  public static void registerForWar()
  public static void rejectFriend(long)
  public static void removeChat(long, ChatRoomType)
  public static void removeFriend(long)
  public static void requestNewMail()
  public static void requestPMThread(long)
  public static void requestWarInfo()
  public static void requestWarLogs()
  public static void requestWarMembers()
  public static boolean resetBossBattle(long, BossBattleResetType, boolean)
  public static void resetGameMode(GameMode)
  public static void saveHeroLineup(HeroLineupType, HeroLineup)
  public static void saveHeroLineups(MultipleHeroLineupType, Map)
  public static void sendTempleInvite(long, int, long, ActionListener)
  public static void setSkinForHero(UnitType, ItemType)
  public static void startArenaAttack(long, boolean)
  public static void startQuest(int)
  public static void startWarBattle()
  public static void surrenderWarBattle()
  public static void toggleChatSticky(long, ChatRoomType, boolean)
  public static void unlikeHeroWallPost(Long)
  public static void startColiseumAttack(long, boolean)
  public static void startTitanTempleAttack(long, UnitType)
  public static void takeMailAttachments(IMailMessage)
  public static void toggleWarOptOutStatus(long, boolean)
  public static void trackHowToPlayShown(HowToPlayDeckType)
  public static void tryRefreshSpecialEvents()
  public static void updateThirdPartyQuestStatus(int, BuildSource)
  public static void viewLegendaryQuests(UnitType)
  public static void viewWarBattleResults(long)
  public static void viewedConsumableItem(ItemType)
  public static void unlockHero(UnitType, ActionListener)
  public static void updateTimezone(int, String)
  public static void useExpPotion(UnitData, ItemType, ActionListener)
  public static void viewedChatRules()
  public static void viewedChests(long)
  public static void viewedCryptResults(boolean)
  public static void viewedGuildWall()
  public static void viewedSkin(ItemType)
  public static void evolveUnit(UnitData, ActionListener)
  public static void resetEliteCampaignLevel(int, int, ActionListener)
  public static void equipItem(UnitData, ItemType, HeroEquipSlot, ActionListener)
  public static void equipItem(UnitData, ItemType, HeroEquipSlot)
  public static void upgradeSkill(UnitData, SkillType, ActionListener)
  public static void buyStamina(ActionListener)
  public static void buyPowerPoints()
  public static void buyGold(int, ActionListener)
  public static void sellItem(ItemType, int)
  public static void viewedChatAppUpsell()
  public static void tappedMonthlyCardReminder()
  public static void quarterMoonGo()
  public static void unlockMerchant(MerchantType, ActionListener)
  public static void setCount(UserFlag, int)
  public static void setFlag(UserFlag, boolean)
  public static void useItem(ItemType, ActionListener)
  public static void fullMoonGo()
  public static void attachRune(IRune, UnitType, boolean)
  public static void removeRune(IRune, UnitType)
  public static void sellRune(IRune)
  public static void buyRunicite(int, ActionListener)
  public static void buyOfferingPackage(OfferingPackageType, ItemType, ActionListener)
  public static void buyRaidTickets(ActionListener)
  public static void removeItem(ItemType, int, ActionListener)
  public static void exchangeItem(String, String, ActionListener)
  public static void empowerRune(IRune, int)
  public static void enchantItem(UnitType, HeroEquipSlot, Map, boolean, ActionListener)
  public static void markMailOpened(IMailMessage)
  public static void activateRuneShrine(RuneShrineType, List, int, RuneShrineActivationType)
  public static void addFriend(long)
  public static void addXPForMaxLevel(UnitData, ActionListener)
  public static boolean advanceBossBattle(long, BossBattleAdvanceType, boolean, ActionListener)
  public static boolean refreshMerchant(MerchantType, MerchantRefreshType, boolean)
  public static void buySkin(ItemType, int)
  public static void chatSilence(long, long)
  public static void claimSignInReward(int, long, ActionListener)
  public static void createNewUser(ActionListener)
  public static void editChat(long, ChatRoomType, String)
  public static boolean autoRefreshMerchant(MerchantType)
  public static void claimArenaPromotionReward(ArenaType)
  public static void claimLapsedUserReward(ItemType, int)
  public static void claimTitanTempleReward(long, UnitType, RewardDrop)
  public static void dropExpeditionDifficulty(int)
  public static void empowerRuneMultiple(IRune, int, int)
  public static void getGuildWarRankings()
  public static void getTitanTempleInvites(long)
  public static void openExpeditionChest(ActionListener)
  public static void personalMessageThreadHideChannel(long)
  public static void promoteUnitManually(UnitData, ActionListener)
  public static void purchaseMerchantItem(MerchantType, RewardDrop, int, int, int)
  public static void refreshGoldChestDrops()
  public static void deleteMailMessage(IMailMessage)
  public static void setSeed(RandomSeedType, long, String)
  public static void facebookLiked()
  public static void refreshSpecialEvents()
  public static void requestArenaRankings(RankType)
  public static void imbueRune(IRune, UnitType)
  public static boolean isRefreshReady(MerchantType)
  public static void legendaryQuestSkip(int, long, ActionListener)
  public static void fuseRunes(IRune, Collection, ActionListener)
  public static void hireHero(UnitType, long, int, GameMode, ActionListener)
  public static void likeHeroWallPost(long)
  public static void completeQuest(int)
  public static void resetArenaChances(ArenaType)
  public static void getHeroesForHire(boolean)
```

## com.perblue.rpg.game.ClientDebugActionHelper [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.ClientNetworkStateConverter
```
public abstract class ClientNetworkStateConverter

  // Constructors (1)
  com.perblue.rpg.game.ClientNetworkStateConverter()

  // Methods (32)
  public static User getUser(UserInfo, UserExtra, String)
  public static void addAllContestData(Map, AllContestData)
  public static void applyAttackBase(AttackBase, AttackScreen, CombatOutcome, int, int, boolean)
  public static void applyAttackBase(AttackBase, AttackScreen, CombatOutcome, int, int)
  public static HeroLineup convertLineup(List)
  public static ClientRune copyRune(IRune)
  public static RuneData getRuneData(IRune)
  public static BasicUserInfo getBasicUserInfo(User)
  public static ClientBossBattleData getBossBattleData(BossBattleInfo, BossBattleResponse)
  public static BossPitAttack getBossPitAttack(UnitType, int, CombatOutcome, int, int, Collection, HeroLineup, AttackScreen, ModeDifficulty)
  public static CampaignAttack getCampaignAttack(CampaignType, int, int, CombatOutcome, int, int, Collection, Iterable, int, AttackScreen)
  private static ClientEquippedItem getEquippedItem(EquippedItemData, UnitType)
  public static ClientMerchantItem getMerchantItem(MerchantItemData)
  public static RuneBonus getRuneBonus(RuneBonusData)
  private static RuneBonusData getRuneBonusData(IRuneBonus)
  public static UserTutorialAct getUserTutorialAct(TutorialAct)
  public static BossBattleAttack getBossBattleAttack(long, int, int, CombatOutcome, int, int, HeroLineup, List, int, long, long, AttackScreen, String, int)
  public static DifficultyModeAttack getDifficultyAttack(GameMode, ModeDifficulty, CombatOutcome, int, int, Collection, Iterable, int, AttackScreen, long)
  public static EquippedItemData getEquippedItemData(ClientEquippedItem)
  public static ExpeditionAttack getExpeditionAttack(CombatOutcome, int, int, AttackScreen, boolean, int)
  public static RaidTicketResults getRaidTicketResults(CampaignType, int, int)
  public static BasicUserInfo getYourBasicUserInfo()
  public static void updateRune(ClientRune, RuneData)
  public static UnitData getHero(HeroData)
  public static HeroSummary getHeroSummary(UnitData)
  public static List getMerchantItems(Iterable)
  public static ClientCampaignLevelStatus getClientCampaignLevelStatus(CampaignLevelStatus)
  public static ClientRune getRune(RuneData, UnitType)
  public static ClientMailMessage getClientMailMessage(MailMessage)
  public static HeroData getHeroData(UnitData)
  public static HeroData getHeroData(Unit)
  public static UnitData getHeroData(HeroSummary)
```

## com.perblue.rpg.game.GameStateManager
```
public abstract class GameStateManager

  // Fields (5)
  public static final AtomicInteger ACTION_ID = 1
  private static Action currentAction
  private static ActionGroup currentGroup
  private static boolean eventsInGroup
  private static boolean inNestedGroup

  // Constructors (1)
  com.perblue.rpg.game.GameStateManager()

  // Methods (8)
  public static void completeGroupAction()
  public static void actionGroupFailed(ClientErrorCodeException)
  public static void cancelAction()
  public static void startGroupAction(boolean)
  public static void updateActionExtra(Map)
  public static void actionFailed(ClientErrorCodeException)
  public static void startAction(CommandType, UnitType, ItemType, Map)
  public static void completeAction()
```

## com.perblue.rpg.game.buff.AOEOT
```
public class AOEOT extends com.perblue.rpg.game.buff.SimpleIntervalBuff implements com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.IDOTBuff

  // Fields (1)
  private IDamageProvider damageProvider

  // Constructors (1)
  com.perblue.rpg.game.buff.AOEOT()

  // Methods (5)
  public void copyTo(IBuff)
  protected void doTick(Entity)
  protected float getDamageRatioAtMaxDistance()
  public void getBuffIcons(a)
  public AOEOT initDamageProvider(IDamageProvider)
```

## com.perblue.rpg.game.buff.BansheeOnCritBuff
```
public class BansheeOnCritBuff extends com.perblue.rpg.game.buff.PassiveSkillBuff implements com.perblue.rpg.game.buff.ISourceCritBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.BansheeOnCritBuff()

  // Methods (1)
  public float onCrit(Entity, Entity, DamageSource, float)
```

## com.perblue.rpg.game.buff.BaseStatAdditionBuff
```
abstract class BaseStatAdditionBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.ICopyToSpawnBuff, com.perblue.rpg.game.buff.ISkillAwareBuff, com.perblue.rpg.game.buff.IStatAdditionBuff

  // Fields (2)
  protected CombatSkill skill
  protected z statModification

  // Constructors (1)
  com.perblue.rpg.game.buff.BaseStatAdditionBuff()

  // Methods (4)
  public z getStatAdditions()
  public void connectSourceSkill(CombatSkill)
  public void getBuffIcons(a)
  public SimpleDurationBuff initStatModification(z)
```

## com.perblue.rpg.game.buff.BlindBuff
```
public class BlindBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.IDebuff, com.perblue.rpg.game.buff.IDisableBuff, com.perblue.rpg.game.buff.IVoidableBuff

  // Fields (1)
  private float level

  // Constructors (1)
  com.perblue.rpg.game.buff.BlindBuff()

  // Methods (6)
  public void onAdd(Entity)
  public String getBuffName()
  public void getBuffIcons(a)
  protected StackingEffect getStackingEffect(IBuff)
  public float getEffectiveLevel()
  public BlindBuff initEffectiveLevel(float)
```

## com.perblue.rpg.game.buff.BoneDragonNegationAuraBuff
```
public class BoneDragonNegationAuraBuff extends com.perblue.rpg.game.buff.PassiveSkillBuff implements com.perblue.rpg.game.buff.IPreDamagingAwareBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.BoneDragonNegationAuraBuff()

  // Methods (1)
  public void onPreDealingDamage(Entity, Entity, DamageSource)
```

## com.perblue.rpg.game.buff.BoneDragonTitanBuff
```
public class BoneDragonTitanBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IDamageToTargetAware, com.perblue.rpg.game.buff.ISkillAwareBuff

  // Fields (1)
  private CombatSkill skill

  // Constructors (1)
  com.perblue.rpg.game.buff.BoneDragonTitanBuff()

  // Methods (4)
  public String getBuffName()
  public void connectSourceSkill(CombatSkill)
  public float getDamageToTargetAwarePriority()
  public void preDamageToTarget(Entity, Entity, IDamageProvider)
```

## com.perblue.rpg.game.buff.BossBattleBuff
```
public class BossBattleBuff implements com.perblue.rpg.game.buff.ICharmImmunityBuff, com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff, com.perblue.rpg.game.buff.IUnclearableBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.BossBattleBuff()

  // Methods (2)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.BossBuff
```
public class BossBuff extends com.perblue.rpg.game.buff.UntargetableBuffWithDungeonManSkill3 implements com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff, com.perblue.rpg.game.buff.IUnclearableBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.BossBuff()

  // Methods (2)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.BrozerkerExplodingShieldBuff
```
public class BrozerkerExplodingShieldBuff extends com.perblue.rpg.game.buff.HealthShieldBuff implements com.perblue.rpg.game.buff.IRemoveAwareBuff

  // Fields (1)
  private SkillDamageProvider damageProvider

  // Constructors (1)
  com.perblue.rpg.game.buff.BrozerkerExplodingShieldBuff()

  // Methods (4)
  public void onRemove(Entity)
  public void copyTo(IBuff)
  public BrozerkerExplodingShieldBuff initDamageProvider(SkillDamageProvider)
  protected StackingEffect getStackingEffect(IBuff)
```

## com.perblue.rpg.game.buff.BrozerkerHealingShieldBuff
```
public class BrozerkerHealingShieldBuff extends com.perblue.rpg.game.buff.HealthShieldBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.BrozerkerHealingShieldBuff()

  // Methods (2)
  protected StackingEffect getStackingEffect(IBuff)
  public float damageShield(float, DamageSource, Entity)
```

## com.perblue.rpg.game.buff.BrozerkerReducedMagicDamageBuff
```
public class BrozerkerReducedMagicDamageBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IModifyTakenDamageStage2, com.perblue.rpg.game.buff.ISkillAwareBuff

  // Fields (1)
  private CombatSkill skill

  // Constructors (1)
  com.perblue.rpg.game.buff.BrozerkerReducedMagicDamageBuff()

  // Methods (4)
  public String getBuffName()
  public void connectSourceSkill(CombatSkill)
  public float getModifyTakenDamagePriority()
  public float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)
```

## com.perblue.rpg.game.buff.BuffFactoryHelper
```
public class BuffFactoryHelper

  // Constructors (1)
  com.perblue.rpg.game.buff.BuffFactoryHelper()
```

## com.perblue.rpg.game.buff.BuffHelper
```
public class BuffHelper

  // Fields (2)
  private static final TargetTest DISPELLER_TEST
  private static final Log LOG

  // Constructors (1)
  com.perblue.rpg.game.buff.BuffHelper()

  // Methods (7)
  public static void notifyDispellers(Entity, IBuff)
  public static IBuff getBuffFromType(IBuff, Class)
  public static boolean isBuffType(IBuff, Class)
  public static float getTenacityDurationScale(Unit, IDisableBuff)
  public static float getLongerDisablesDurationScale(Entity)
  public static ICopyableBuff makeCopy(ICopyableBuff)
  public static boolean tryDebuff(Entity, Entity, CombatSkill)
```

## com.perblue.rpg.game.buff.CastingFreeze
```
public class CastingFreeze extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IStunBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.CastingFreeze()

  // Methods (1)
  protected StackingEffect getStackingEffect(IBuff)
```

## com.perblue.rpg.game.buff.CharmedBuff
```
public class CharmedBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.ICharmed, com.perblue.rpg.game.buff.ICombatTextBuff, com.perblue.rpg.game.buff.IDisableBuff, com.perblue.rpg.game.buff.ISkillAwareBuff, com.perblue.rpg.game.buff.IVoidableBuff

  // Fields (1)
  private CombatSkill skill

  // Constructors (1)
  com.perblue.rpg.game.buff.CharmedBuff()

  // Methods (7)
  public void copyTo(IBuff)
  public void connectSourceSkill(CombatSkill)
  public void getBuffIcons(a)
  protected StackingEffect getStackingEffect(IBuff)
  public float getEffectiveLevel()
  public CombatSkill getSourceSkill()
  public CharSequence getCombatText()
```

## com.perblue.rpg.game.buff.ClawManPoisonBuff
```
public class ClawManPoisonBuff extends com.perblue.rpg.game.buff.StatSubtractionBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IDebuff

  // Constructors (1)
  com.perblue.rpg.game.buff.ClawManPoisonBuff()

  // Methods (1)
  public void onAdd(Entity)
```

## com.perblue.rpg.game.buff.CosmicElfSilenceBuff
```
public class CosmicElfSilenceBuff extends com.perblue.rpg.game.buff.SilenceBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.CosmicElfSilenceBuff()
```

## com.perblue.rpg.game.buff.CrimsonWitchLegendaryDamageDebuff
```
public class CrimsonWitchLegendaryDamageDebuff extends com.perblue.rpg.game.buff.StatSubtractionBuff implements com.perblue.rpg.game.buff.IVoidableBuff

  // Fields (1)
  private float maxDebuffPercentage

  // Constructors (1)
  com.perblue.rpg.game.buff.CrimsonWitchLegendaryDamageDebuff()

  // Methods (4)
  private void setMaxDebuffPercentage(float)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public void copyTo(IBuff)
  public static CrimsonWitchLegendaryDamageDebuff build(float, float)
```

## com.perblue.rpg.game.buff.CrimsonWitchLegendaryDodgeDebuff
```
public class CrimsonWitchLegendaryDodgeDebuff extends com.perblue.rpg.game.buff.StatReductionBuff implements com.perblue.rpg.game.buff.IVoidableBuff

  // Fields (1)
  private float MAX_STACK_DODGE_REDUCTION

  // Constructors (1)
  com.perblue.rpg.game.buff.CrimsonWitchLegendaryDodgeDebuff()

  // Methods (3)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public void copyTo(IBuff)
  public static CrimsonWitchLegendaryDodgeDebuff build(float)
```

## com.perblue.rpg.game.buff.CyclopsWizardEnergyBuff
```
public class CyclopsWizardEnergyBuff extends com.perblue.rpg.game.buff.SimpleIntervalBuff implements com.perblue.rpg.game.buff.IOnCombatDoneBuff, com.perblue.rpg.game.buff.IOnCombatStartBuff, com.perblue.rpg.game.buff.ISkillAwareBuff, com.perblue.rpg.game.buff.IUnclearableBuff

  // Fields (2)
  private boolean inCombat
  private CombatSkill skill

  // Constructors (1)
  com.perblue.rpg.game.buff.CyclopsWizardEnergyBuff(CombatSkill)

  // Methods (7)
  public void giveEnergy(Entity)
  protected void doTick(Entity)
  public void connectSourceSkill(CombatSkill)
  protected StackingEffect getStackingEffect(IBuff)
  public void onCombatDone(Entity)
  public void onCombatStart(Entity)
  public void update(Entity, long)
```

## com.perblue.rpg.game.buff.DruidinatrixCloneBuff
```
public class DruidinatrixCloneBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IRemoveAwareBuff, com.perblue.rpg.game.buff.IUnclearableBuff, com.perblue.rpg.game.buff.IUpdateAwareBuff

  // Fields (2)
  private boolean hasBeenMapped
  private boolean ranged

  // Constructors (1)
  com.perblue.rpg.game.buff.DruidinatrixCloneBuff()

  // Methods (5)
  public boolean isRanged()
  public DruidinatrixCloneBuff setRanged(boolean)
  public void onRemove(Entity)
  public String getBuffName()
  public void update(Entity, long)
```

## com.perblue.rpg.game.buff.DruidinatrixEnergyDrain
```
public class DruidinatrixEnergyDrain extends com.perblue.rpg.game.buff.SimpleIntervalBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IDrainBar, com.perblue.rpg.game.buff.IRemoveAwareBuff

  // Fields (1)
  private CombatSkill sourceSkill

  // Constructors (1)
  com.perblue.rpg.game.buff.DruidinatrixEnergyDrain()

  // Methods (6)
  public DruidinatrixEnergyDrain initSourceSkill(CombatSkill)
  public void onAdd(Entity)
  public void onRemove(Entity)
  public void copyTo(IBuff)
  protected void doTick(Entity)
  protected StackingEffect getStackingEffect(IBuff)
```

## com.perblue.rpg.game.buff.DungeonManTrappedBuff
```
public class DungeonManTrappedBuff extends com.perblue.rpg.game.buff.PreventsDisables implements com.perblue.rpg.game.buff.IActiveAbilityDisabled, com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.ISteadfast, com.perblue.rpg.game.buff.IUnclearableBuff, com.perblue.rpg.game.buff.IUntargetable

  // Constructors (1)
  com.perblue.rpg.game.buff.DungeonManTrappedBuff()

  // Methods (1)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.EnergyShieldBuff
```
public class EnergyShieldBuff extends com.perblue.rpg.game.buff.ShieldBuff implements com.perblue.rpg.game.buff.IEnergyShieldBuff, com.perblue.rpg.game.buff.IPreventEnergyGainBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.EnergyShieldBuff()

  // Methods (4)
  public float damageShield(float, Entity)
  public float getShieldHP()
## com.perblue.rpg.game.buff.EnergyShieldBuff [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.buff.ShieldBuff and com.perblue.rpg.game.buff.ShieldBuff$ShieldType disagree on InnerClasses attribute]

## com.perblue.rpg.game.buff.FaithHealerReducedPhysicalDamage
```
public class FaithHealerReducedPhysicalDamage implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IModifyTakenDamageStage2, com.perblue.rpg.game.buff.ISkillAwareBuff

  // Fields (1)
  private CombatSkill skill

  // Constructors (1)
  com.perblue.rpg.game.buff.FaithHealerReducedPhysicalDamage()

  // Methods (4)
  public String getBuffName()
  public void connectSourceSkill(CombatSkill)
  public float getModifyTakenDamagePriority()
  public float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)
```

## com.perblue.rpg.game.buff.GenieHornRemovalHelperBuff
```
public class GenieHornRemovalHelperBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IRemoveAwareBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.GenieHornRemovalHelperBuff()

  // Methods (1)
  public void onRemove(Entity)
```

## com.perblue.rpg.game.buff.GenieHornsBuff
```
public class GenieHornsBuff extends com.perblue.rpg.game.buff.StatAdditionBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.IRemoveAwareBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.GenieHornsBuff()

  // Methods (3)
  public void onAdd(Entity)
  public void onRemove(Entity)
  public void getBuffIcons(a)
```

## com.perblue.rpg.game.buff.GenieRevivableBuff
```
public class GenieRevivableBuff implements com.perblue.rpg.game.buff.IUnclearableBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.GenieRevivableBuff()

  // Methods (1)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.GenieRevivingBuff
```
public class GenieRevivingBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IModifyTakenDamageStage2, com.perblue.rpg.game.buff.IPreDamagedAwareBuff, com.perblue.rpg.game.buff.IRemoveAwareBuff, com.perblue.rpg.game.buff.ISkillAwareBuff, com.perblue.rpg.game.buff.IUnclearableBuff

  // Fields (3)
  private int blockedHitsRemaining
  private boolean freeBlock
  private GenieSkill2 skill

  // Constructors (1)
  com.perblue.rpg.game.buff.GenieRevivingBuff()

  // Methods (9)
  public void onPreDamage(Entity, Entity, DamageSource)
  public GenieRevivingBuff setMaxBlockedHits(int)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public void onAdd(Entity)
  public void onRemove(Entity)
  public void copyTo(IBuff)
  public void connectSourceSkill(CombatSkill)
  public float getModifyTakenDamagePriority()
  public float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)
```

## com.perblue.rpg.game.buff.GhostBuff
```
public class GhostBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff, com.perblue.rpg.game.buff.IRemoveAwareBuff

  // Fields (3)
  private float damageScalar
  private Unit source
  private b tintColor

  // Constructors (1)
  com.perblue.rpg.game.buff.GhostBuff()

  // Methods (9)
  private void doCooldownReduction(Entity, SkillType, int)
  private void doBossHPLoss(SkillType)
  public b getTintColor()
  public void setTintColor(b)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public GhostBuff setSource(Unit)
  public void onRemove(Entity)
  public String getBuffName()
  public float getDamageScalar()
```

## com.perblue.rpg.game.buff.GiantPlantInvincibleBuff
```
public class GiantPlantInvincibleBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.ICopyableBuff, com.perblue.rpg.game.buff.IModifyTakenDamageStage2, com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff

  // Fields (1)
   boolean allowDOT

  // Constructors (1)
  com.perblue.rpg.game.buff.GiantPlantInvincibleBuff()

  // Methods (7)
  public GiantPlantInvincibleBuff setAllowDOT(boolean)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public String getBuffName()
  public void copyTo(IBuff)
  public IBuff makeInstance()
  public float getModifyTakenDamagePriority()
  public float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)
```

## com.perblue.rpg.game.buff.GoldenColossusShield
```
public class GoldenColossusShield extends com.perblue.rpg.game.buff.HealthShieldBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IRemoveAwareBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.GoldenColossusShield()

  // Methods (3)
  public void onAdd(Entity)
  public void onRemove(Entity)
  public void destroyShield(boolean)
```

## com.perblue.rpg.game.buff.GreedyDragonSteadfastBuff
```
public class GreedyDragonSteadfastBuff implements com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff, com.perblue.rpg.game.buff.ISteadfast, com.perblue.rpg.game.buff.IUnclearableBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.GreedyDragonSteadfastBuff()

  // Methods (2)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.GuaranteedCrit
```
public class GuaranteedCrit implements com.perblue.rpg.game.buff.IBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.GuaranteedCrit()

  // Methods (1)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.HeadCrabDebuff
```
public class HeadCrabDebuff extends com.perblue.rpg.game.buff.SimpleDOT implements com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.ICharmed, com.perblue.rpg.game.buff.ICombatTextBuff, com.perblue.rpg.game.buff.IDebuff, com.perblue.rpg.game.buff.IDisableBuff, com.perblue.rpg.game.buff.IPariah, com.perblue.rpg.game.buff.ISkillAwareBuff, com.perblue.rpg.game.buff.IUnclearableBuff

  // Fields (1)
  private CombatSkill skill

  // Constructors (1)
  com.perblue.rpg.game.buff.HeadCrabDebuff()

  // Methods (6)
  public String getBuffName()
  public void copyTo(IBuff)
  public void connectSourceSkill(CombatSkill)
  public void getBuffIcons(a)
  public float getEffectiveLevel()
  public CharSequence getCombatText()
```

## com.perblue.rpg.game.buff.HeadCrabTargetMarker
```
public class HeadCrabTargetMarker implements com.perblue.rpg.game.buff.IUnclearableBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.HeadCrabTargetMarker()

  // Methods (1)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.HealthShieldBuff
```
public class HealthShieldBuff extends com.perblue.rpg.game.buff.ShieldBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.HealthShieldBuff()

  // Methods (16)
  public String getBuffName()
  public void copyTo(IBuff)
  public void connectSourceSkill(CombatSkill)
  protected boolean updateForStackingEffect(Entity, SimpleDurationBuff, StackingEffect)
  public void getBuffIcons(a)
  public int getEffectiveLevel()
  public void destroyShield(boolean)
  public float getTotalSize()
  public float damageShield(float, DamageSource, Entity)
  public HealthShieldBuff initShieldDuration(long, Unit)
  public HealthShieldBuff initShieldSize(float, Unit)
  public void setShieldHp(float)
  public void setTotalShieldHp(float)
  public SimpleDurationBuff initDuration(long)
```

## com.perblue.rpg.game.buff.HeavyTagBuff
```
public class HeavyTagBuff implements com.perblue.rpg.game.buff.IHeroTagBuff

  // Fields (1)
  private boolean disableParticle

  // Constructors (1)
  com.perblue.rpg.game.buff.HeavyTagBuff()

  // Methods (4)
  public void disableParticle(boolean)
  public boolean isDisableParticle()
  public boolean hasBuff(HeroTag)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.IActiveAbilityDisabled
```
public abstract interface interface IActiveAbilityDisabled implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IDebuff
```

## com.perblue.rpg.game.buff.IAddAwareBuff
```
public abstract interface interface IAddAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void onAdd(Entity)
```

## com.perblue.rpg.game.buff.IBuff
```
public abstract interface interface IBuff

  // Methods (1)
  public abstract String getBuffName()
```

## com.perblue.rpg.game.buff.IBuffDebugInfo
```
public abstract interface interface IBuffDebugInfo implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract String getDebugString()
```

## com.perblue.rpg.game.buff.IBuffIcon
```
public abstract interface interface IBuffIcon implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void getBuffIcons(a)
```

## com.perblue.rpg.game.buff.IBuffWrapperBuff
```
public abstract interface interface IBuffWrapperBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (2)
  public abstract void setInnerBuff(IBuff)
  public abstract IBuff getInnerBuff()
```

## com.perblue.rpg.game.buff.ICharmImmunityBuff
```
public abstract interface interface ICharmImmunityBuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.ICharmed
```
public abstract interface interface ICharmed implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IDebuff
```

## com.perblue.rpg.game.buff.ICombatTextBuff
```
public abstract interface interface ICombatTextBuff

  // Methods (1)
  public abstract CharSequence getCombatText()
```

## com.perblue.rpg.game.buff.IConspirator
```
public abstract interface interface IConspirator implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.ICopyToSpawnBuff
```
public abstract interface interface ICopyToSpawnBuff implements com.perblue.rpg.game.buff.ICopyableBuff
```

## com.perblue.rpg.game.buff.ICopyableBuff
```
public abstract interface interface ICopyableBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (2)
  public abstract void copyTo(IBuff)
  public abstract IBuff makeInstance()
```

## com.perblue.rpg.game.buff.ICrossCounterBuff
```
public abstract interface interface ICrossCounterBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void onCrossCounter(Entity)
```

## com.perblue.rpg.game.buff.IDOTBuff
```
public abstract interface interface IDOTBuff implements com.perblue.rpg.game.buff.ICopyableBuff

  // Methods (1)
  public abstract void copyTo(IBuff)
```

## com.perblue.rpg.game.buff.IDamageModifyingBuff
```
public abstract interface interface IDamageModifyingBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)
```

## com.perblue.rpg.game.buff.IDamageReflectingBuff
```
public abstract interface interface IDamageReflectingBuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IDamageToTargetAware
```
public abstract interface interface IDamageToTargetAware implements com.perblue.rpg.game.buff.IBuff

  // Fields (1)
  public static final Comparator PRIORITY_SORTER

  // Methods (2)
  public abstract float getDamageToTargetAwarePriority()
  public abstract void preDamageToTarget(Entity, Entity, IDamageProvider)
```

## com.perblue.rpg.game.buff.IDeathAwareBuff
```
public abstract interface interface IDeathAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void onDeath(Entity, boolean)
```

## com.perblue.rpg.game.buff.IDebuff
```
public abstract interface interface IDebuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IDebuffImmune
```
public abstract interface interface IDebuffImmune implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IDisableActiveSkillBuff
```
public abstract interface interface IDisableActiveSkillBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IDebuff
```

## com.perblue.rpg.game.buff.IDisableAttackBuff
```
public abstract interface interface IDisableAttackBuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IDisableBuff
```
public abstract interface interface IDisableBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract float getEffectiveLevel()
```

## com.perblue.rpg.game.buff.IDisableableBuff
```
public abstract interface interface IDisableableBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (2)
  public abstract boolean isDisabled()
  public abstract void setDisabled(boolean)
```

## com.perblue.rpg.game.buff.IDodgeAwareBuff
```
public abstract interface interface IDodgeAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void onDodge(Entity)
```

## com.perblue.rpg.game.buff.IDrainBar
```
public abstract interface interface IDrainBar implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IDurationBuff
```
public abstract interface interface IDurationBuff implements com.perblue.rpg.game.buff.IBuff

  // Fields (1)
  public static final long INDEFINITE = -1

  // Methods (4)
  public abstract void setDurationScale(float)
  public abstract float getDurationScale()
  public abstract long getTimeLeft()
  public abstract long getDuration()
```

## com.perblue.rpg.game.buff.IEnergyInvincible
```
public abstract interface interface IEnergyInvincible implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IEnergyShieldBuff
```
public abstract interface interface IEnergyShieldBuff implements com.perblue.rpg.game.buff.IRemovablePositiveBuff

  // Fields (1)
  public static final int SHIELD_IMMUNE = -1

  // Methods (4)
  public abstract void destroyShield(boolean)
  public abstract float getTotalSize()
  public abstract float damageShield(float, Entity)
  public abstract float getShieldHP()
```

## com.perblue.rpg.game.buff.IEntityAwareBuff
```
public abstract interface interface IEntityAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (2)
  public abstract void setEntity(Entity)
  public abstract Entity getEntity()
```

## com.perblue.rpg.game.buff.IFocusTargetBuff
```
public abstract interface interface IFocusTargetBuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IHeroTagBuff
```
public abstract interface interface IHeroTagBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract boolean hasBuff(HeroTag)
```

## com.perblue.rpg.game.buff.IIgnoreSpecialDeathBuff
```
public abstract interface interface IIgnoreSpecialDeathBuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IImmovable
```
public abstract interface interface IImmovable implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IInvincible
```
public abstract interface interface IInvincible implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IModifyDamageDealtState1
```
public abstract interface interface IModifyDamageDealtState1 implements com.perblue.rpg.game.buff.IDamageModifyingBuff

  // Methods (1)
  public abstract float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)
```

## com.perblue.rpg.game.buff.IModifyDamageDealtState2
```
public abstract interface interface IModifyDamageDealtState2 implements com.perblue.rpg.game.buff.IDamageModifyingBuff

  // Methods (1)
  public abstract float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)
```

## com.perblue.rpg.game.buff.IModifyTakenDamagePostShield
```
public abstract interface interface IModifyTakenDamagePostShield implements com.perblue.rpg.game.buff.IDamageModifyingBuff

  // Methods (1)
  public abstract float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)
```

## com.perblue.rpg.game.buff.IModifyTakenDamageStage1
```
public abstract interface interface IModifyTakenDamageStage1 implements com.perblue.rpg.game.buff.IDamageModifyingBuff

  // Methods (1)
  public abstract float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)
```

## com.perblue.rpg.game.buff.IModifyTakenDamageStage2
```
public abstract interface interface IModifyTakenDamageStage2 implements com.perblue.rpg.game.buff.IDamageModifyingBuff

  // Fields (1)
  public static final Comparator PRIORITY_SORTER

  // Methods (2)
  public abstract float getModifyTakenDamagePriority()
  public abstract float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)
```

## com.perblue.rpg.game.buff.IOnCombatDoneBuff
```
public abstract interface interface IOnCombatDoneBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void onCombatDone(Entity)
```

## com.perblue.rpg.game.buff.IOnCombatStartBuff
```
public abstract interface interface IOnCombatStartBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void onCombatStart(Entity)
```

## com.perblue.rpg.game.buff.IOnHealedBuff
```
public abstract interface interface IOnHealedBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract float onHeal(Entity, Entity, DamageSource, float)
```

## com.perblue.rpg.game.buff.IOnHealingBuff
```
public abstract interface interface IOnHealingBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract float onHeal(Entity, Entity, DamageSource, float)
```

## com.perblue.rpg.game.buff.IOnHitAwareBuff
```
public abstract interface interface IOnHitAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void onHit(Entity, Entity, DamageSource)
```

## com.perblue.rpg.game.buff.IOnIdleBuff
```
public abstract interface interface IOnIdleBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract boolean onIdle(Entity)
```

## com.perblue.rpg.game.buff.IOnLifeSteal
```
public abstract interface interface IOnLifeSteal implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract float onLifeSteal(Entity, Entity, float)
```

## com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff
```
public abstract interface interface IOtherBuffAddAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract boolean onOtherBuffAdd(Entity, Entity, IBuff)
```

## com.perblue.rpg.game.buff.IOtherBuffRemoveAwareBuff
```
public abstract interface interface IOtherBuffRemoveAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void onOtherBuffRemove(Entity, IBuff)
```

## com.perblue.rpg.game.buff.IPariah
```
public abstract interface interface IPariah implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IPartiallyDefeatedBuff
```
public abstract interface interface IPartiallyDefeatedBuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IPauseSkillCooldownsBuff
```
public abstract interface interface IPauseSkillCooldownsBuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IPirateShieldBuff
```
public abstract interface interface IPirateShieldBuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IPreDamagedAwareBuff
```
public abstract interface interface IPreDamagedAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void onPreDamage(Entity, Entity, DamageSource)
```

## com.perblue.rpg.game.buff.IPreDamagingAwareBuff
```
public abstract interface interface IPreDamagingAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void onPreDealingDamage(Entity, Entity, DamageSource)
```

## com.perblue.rpg.game.buff.IPreEnergyChange
```
public abstract interface interface IPreEnergyChange implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract boolean onPreEnergyChange(Entity, Entity, float, CombatSkill)
```

## com.perblue.rpg.game.buff.IPreventEnergyGainBuff
```
public abstract interface interface IPreventEnergyGainBuff implements com.perblue.rpg.game.buff.IDebuff
```

## com.perblue.rpg.game.buff.IRPGParticleEffectAwareBuff
```
public abstract interface interface IRPGParticleEffectAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (2)
  public abstract RPGParticleEffect getRPGParticleEffect()
  public abstract void setRPGParticleEffect(RPGParticleEffect)
```

## com.perblue.rpg.game.buff.IRemovableNegativeBuff
```
public abstract interface interface IRemovableNegativeBuff implements com.perblue.rpg.game.buff.IDebuff, com.perblue.rpg.game.buff.ISkillAwareBuff

  // Methods (1)
  public abstract int getEffectiveLevel()
```

## com.perblue.rpg.game.buff.IRemovablePositiveBuff
```
public abstract interface interface IRemovablePositiveBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.ISkillAwareBuff, com.perblue.rpg.game.buff.IStealable

  // Methods (1)
  public abstract int getEffectiveLevel()
```

## com.perblue.rpg.game.buff.IRemoveAwareBuff
```
public abstract interface interface IRemoveAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void onRemove(Entity)
```

## com.perblue.rpg.game.buff.IRoundBoostBuff
```
public abstract interface interface IRoundBoostBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.ISkillAwareBuff, com.perblue.rpg.game.buff.IUnclearableBuff

  // Methods (1)
  public abstract void doRoundBoosts()
```

## com.perblue.rpg.game.buff.ISkillActivationAwareBuff
```
public abstract interface interface ISkillActivationAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract boolean onSkillActivation(Entity, CombatSkill)
```

## com.perblue.rpg.game.buff.ISkillActivationControlBuff
```
public abstract interface interface ISkillActivationControlBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract boolean onSkillActivate(Entity, CombatSkill)
```

## com.perblue.rpg.game.buff.ISkillAwareBuff
```
public abstract interface interface ISkillAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void connectSourceSkill(CombatSkill)
```

## com.perblue.rpg.game.buff.ISourceAwareBuff
```
public abstract interface interface ISourceAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (2)
  public abstract void setSource(Entity)
  public abstract Entity getSource()
```

## com.perblue.rpg.game.buff.ISourceCritBuff
```
public abstract interface interface ISourceCritBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract float onCrit(Entity, Entity, DamageSource, float)
```

## com.perblue.rpg.game.buff.ISpecialDeathBuff
```
public abstract interface interface ISpecialDeathBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract boolean doSpecialDeath(Unit)
```

## com.perblue.rpg.game.buff.IStaggerAwareBuff
```
public abstract interface interface IStaggerAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void onStaggered()
```

## com.perblue.rpg.game.buff.IStatAdditionBuff
```
public abstract interface interface IStatAdditionBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract z getStatAdditions()
```

## com.perblue.rpg.game.buff.IStatAmplificationBuff
```
public abstract interface interface IStatAmplificationBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract z getStatAmplifications()
```

## com.perblue.rpg.game.buff.IStatReductionBuff
```
public abstract interface interface IStatReductionBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract z getStatReductions()
```

## com.perblue.rpg.game.buff.IStatSettingBuff
```
public abstract interface interface IStatSettingBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract z getStatSetting()
```

## com.perblue.rpg.game.buff.IStatSubtractionBuff
```
public abstract interface interface IStatSubtractionBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IRemovableNegativeBuff

  // Methods (1)
  public abstract z getStatSubtractions()
```

## com.perblue.rpg.game.buff.ISteadfast
```
public abstract interface interface ISteadfast implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IStealable
```
public abstract interface interface IStealable implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract int getEffectiveLevel()
```

## com.perblue.rpg.game.buff.IStunBuff
```
public abstract interface interface IStunBuff implements com.perblue.rpg.game.buff.IDebuff
```

## com.perblue.rpg.game.buff.ISwitchTeamBuff
```
public abstract interface interface ISwitchTeamBuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IUnKnockbackBuff
```
public abstract interface interface IUnKnockbackBuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IUnclearableBuff
```
public abstract interface interface IUnclearableBuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IUntargetable
```
public abstract interface interface IUntargetable implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IUntargetableAlly, com.perblue.rpg.game.buff.IUntargetableEnemy
```

## com.perblue.rpg.game.buff.IUntargetableAlly
```
public abstract interface interface IUntargetableAlly implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IUntargetableEnemy
```
public abstract interface interface IUntargetableEnemy implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IUpdateAwareBuff
```
public abstract interface interface IUpdateAwareBuff implements com.perblue.rpg.game.buff.IBuff

  // Methods (1)
  public abstract void update(Entity, long)
```

## com.perblue.rpg.game.buff.IVoidableBuff
```
public abstract interface interface IVoidableBuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IWaitBuff
```
public abstract interface interface IWaitBuff implements com.perblue.rpg.game.buff.IBuff
```

## com.perblue.rpg.game.buff.IgnoreStatModificationBuff
```
public class IgnoreStatModificationBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IRemoveAwareBuff

  // Fields (1)
  protected a ignoredStatTypes

  // Constructors (1)
  com.perblue.rpg.game.buff.IgnoreStatModificationBuff()

  // Methods (5)
  public SimpleDurationBuff initStatIgnoreArray(a)
  public void onAdd(Entity)
  public void onRemove(Entity)
  public a getIgnoredStatModifications()
  public void copyTo(IBuff)
```

## com.perblue.rpg.game.buff.ImmovableBuff
```
public class ImmovableBuff implements com.perblue.rpg.game.buff.IImmovable

  // Constructors (1)
  com.perblue.rpg.game.buff.ImmovableBuff()

  // Methods (1)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.InvincibleBuff
```
public class InvincibleBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IInvincible

  // Constructors (1)
  com.perblue.rpg.game.buff.InvincibleBuff()

  // Methods (1)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.InvisibleBuff
```
public class InvisibleBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IUnclearableBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.InvisibleBuff()

  // Methods (1)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.KillMarkDebuff
```
public class KillMarkDebuff extends com.perblue.rpg.game.buff.SimpleDurationBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.KillMarkDebuff()

  // Methods (1)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.LastDefenderCrossCounterBuff
```
public class LastDefenderCrossCounterBuff extends com.perblue.rpg.game.buff.PassiveSkillBuff implements com.perblue.rpg.game.buff.ICrossCounterBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.LastDefenderCrossCounterBuff()

  // Methods (1)
  public void onCrossCounter(Entity)
```

## com.perblue.rpg.game.buff.LastDefenderEnergyDrainBuff
```
public class LastDefenderEnergyDrainBuff extends com.perblue.rpg.game.buff.SimpleIntervalBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IRemoveAwareBuff

  // Fields (3)
  private static final String ANIM_SKILL1_ACTIVE_END = skill1_end
  private CombatSkill sourceSkill
  private boolean stopping

  // Constructors (1)
  com.perblue.rpg.game.buff.LastDefenderEnergyDrainBuff()

  // Methods (6)
  public LastDefenderEnergyDrainBuff initSourceSkill(CombatSkill)
  public void onAdd(Entity)
  public void onRemove(Entity)
  public void copyTo(IBuff)
  protected void doTick(Entity)
  protected StackingEffect getStackingEffect(IBuff)
```

## com.perblue.rpg.game.buff.LastDefenderHammerBuff
```
public class LastDefenderHammerBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.ICopyToSpawnBuff, com.perblue.rpg.game.buff.IDrainBar, com.perblue.rpg.game.buff.IRemovablePositiveBuff, com.perblue.rpg.game.buff.IRemoveAwareBuff, com.perblue.rpg.game.buff.IStatAdditionBuff

  // Fields (2)
  private LastDefenderEnergyDrainBuff energyDrainBuff
  private StatAdditionBuff statAdditionBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.LastDefenderHammerBuff()

  // Methods (12)
  public LastDefenderHammerBuff initSourceSkill(CombatSkill)
  public void onAdd(Entity)
  public void onRemove(Entity)
  public z getStatAdditions()
  public void copyTo(IBuff)
  public void connectSourceSkill(CombatSkill)
  public void getBuffIcons(a)
  public LastDefenderHammerBuff initTickInterval(int)
  protected StackingEffect getStackingEffect(IBuff)
  public int getEffectiveLevel()
  public LastDefenderHammerBuff initStatModification(z)
  public void update(Entity, long)
```

## com.perblue.rpg.game.buff.MedusaTitanBuff
```
public class MedusaTitanBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IDamageToTargetAware, com.perblue.rpg.game.buff.IOnHitAwareBuff, com.perblue.rpg.game.buff.ISkillAwareBuff

  // Fields (2)
  private int attackCount
  private CombatSkill skill

  // Constructors (1)
  com.perblue.rpg.game.buff.MedusaTitanBuff()

  // Methods (5)
  public void onHit(Entity, Entity, DamageSource)
  public String getBuffName()
  public void connectSourceSkill(CombatSkill)
  public float getDamageToTargetAwarePriority()
  public void preDamageToTarget(Entity, Entity, IDamageProvider)
```

## com.perblue.rpg.game.buff.NoNewBuffsBuff
```
public class NoNewBuffsBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.NoNewBuffsBuff()

  // Methods (2)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.NotShieldableBuff
```
public class NotShieldableBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff, com.perblue.rpg.game.buff.IUnclearableBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.NotShieldableBuff()

  // Methods (3)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public void onAdd(Entity)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.NpcLyingLanternDeathBuff
```
public class NpcLyingLanternDeathBuff extends com.perblue.rpg.game.buff.BlindBuff implements com.perblue.rpg.game.buff.ISkillAwareBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.NpcLyingLanternDeathBuff()

  // Methods (1)
  public void connectSourceSkill(CombatSkill)
```

## com.perblue.rpg.game.buff.NpcLyingLanternEntranceDebuff
```
public class NpcLyingLanternEntranceDebuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IActiveAbilityDisabled, com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IDisableAttackBuff, com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff, com.perblue.rpg.game.buff.IRemoveAwareBuff, com.perblue.rpg.game.buff.ISourceAwareBuff, com.perblue.rpg.game.buff.IUpdateAwareBuff

  // Fields (2)
  private final a listeners
  private Unit source

  // Constructors (1)
  com.perblue.rpg.game.buff.NpcLyingLanternEntranceDebuff()

  // Methods (10)
  private boolean isEntranceBuffInvalid(Entity)
  private boolean isConflictingBuff(IBuff)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public void setSource(Entity)
  public void onAdd(Entity)
  public void onRemove(Entity)
  public IBuff makeInstance()
  protected StackingEffect getStackingEffect(IBuff)
  public Entity getSource()
  public void update(Entity, long)
```

## com.perblue.rpg.game.buff.NpcLyingLanternTargetBuff
```
public class NpcLyingLanternTargetBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.NpcLyingLanternTargetBuff()

  // Methods (2)
  public String getBuffName()
  protected StackingEffect getStackingEffect(IBuff)
```

## com.perblue.rpg.game.buff.OldBuff
```
public class OldBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.OldBuff()
```

## com.perblue.rpg.game.buff.OrcMonkLegendaryBuff
```
public class OrcMonkLegendaryBuff extends com.perblue.rpg.game.buff.PassiveSkillBuff implements com.perblue.rpg.game.buff.IOnHealingBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.OrcMonkLegendaryBuff()

  // Methods (1)
  public float onHeal(Entity, Entity, DamageSource, float)
```

## com.perblue.rpg.game.buff.OverrideMaxEnergyBuff
```
public class OverrideMaxEnergyBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.ICopyToSpawnBuff, com.perblue.rpg.game.buff.IUnclearableBuff

  // Fields (1)
  private int maxEnergy

  // Constructors (1)
  com.perblue.rpg.game.buff.OverrideMaxEnergyBuff()

  // Methods (5)
  public void setMaxEnergy(int)
  public int getMaxEnergy()
  public String getBuffName()
  public void copyTo(IBuff)
  public IBuff makeInstance()
```

## com.perblue.rpg.game.buff.PassiveSkillBuff
```
public abstract class PassiveSkillBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.ISkillAwareBuff

  // Fields (1)
  protected CombatSkill sourceSkill

  // Constructors (1)
  com.perblue.rpg.game.buff.PassiveSkillBuff()

  // Methods (1)
  public void connectSourceSkill(CombatSkill)
```

## com.perblue.rpg.game.buff.PlantSoulCrossPolinationBuff
```
public class PlantSoulCrossPolinationBuff extends com.perblue.rpg.game.buff.PassiveSkillBuff implements com.perblue.rpg.game.buff.ISkillActivationAwareBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.PlantSoulCrossPolinationBuff()

  // Methods (1)
  public boolean onSkillActivation(Entity, CombatSkill)
```

## com.perblue.rpg.game.buff.PlantSoulDeepRootsBuff
```
public class PlantSoulDeepRootsBuff extends com.perblue.rpg.game.buff.PassiveSkillBuff implements com.perblue.rpg.game.buff.IDeathAwareBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.PlantSoulDeepRootsBuff()

  // Methods (1)
  public void onDeath(Entity, boolean)
```

## com.perblue.rpg.game.buff.PlantSoulLifeForceBuff
```
public class PlantSoulLifeForceBuff extends com.perblue.rpg.game.buff.SimpleIntervalBuff implements com.perblue.rpg.game.buff.IOnCombatDoneBuff, com.perblue.rpg.game.buff.IOnCombatStartBuff, com.perblue.rpg.game.buff.ISkillAwareBuff, com.perblue.rpg.game.buff.IUnclearableBuff

  // Fields (5)
  private IDamageProvider basicHealProvider
  private float deathHealAmount
  private IDamageProvider deathHealProvider
  private boolean inCombat
  private CombatSkill skill

  // Constructors (1)
  com.perblue.rpg.game.buff.PlantSoulLifeForceBuff()

  // Methods (7)
  public void copyTo(IBuff)
  protected void doTick(Entity)
  public void connectSourceSkill(CombatSkill)
  protected StackingEffect getStackingEffect(IBuff)
  public void onCombatDone(Entity)
  public void onCombatStart(Entity)
  public void update(Entity, long)
```

## com.perblue.rpg.game.buff.PreventsDisables
```
public class PreventsDisables implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.PreventsDisables()

  // Methods (2)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.RabidDragonLegendaryBuff
```
public class RabidDragonLegendaryBuff extends com.perblue.rpg.game.buff.PassiveSkillBuff implements com.perblue.rpg.game.buff.ISkillActivationAwareBuff

  // Fields (1)
  private z buffBoosts

  // Constructors (1)
  com.perblue.rpg.game.buff.RabidDragonLegendaryBuff()

  // Methods (1)
  public boolean onSkillActivation(Entity, CombatSkill)
```

## com.perblue.rpg.game.buff.RabidDragonSkill1Buff
```
public class RabidDragonSkill1Buff extends com.perblue.rpg.game.buff.StatAdditionBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.RabidDragonSkill1Buff()
```

## com.perblue.rpg.game.buff.RabidDragonTitanBuff
```
public class RabidDragonTitanBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.ISkillAwareBuff

  // Fields (1)
  private float critPercent

  // Constructors (1)
  com.perblue.rpg.game.buff.RabidDragonTitanBuff()

  // Methods (3)
  public float getCritPercent()
  public String getBuffName()
  public void connectSourceSkill(CombatSkill)
```

## com.perblue.rpg.game.buff.RagingRevenantRevivalBuff
```
public class RagingRevenantRevivalBuff extends com.perblue.rpg.game.buff.PassiveSkillBuff implements com.perblue.rpg.game.buff.IOnCombatStartBuff, com.perblue.rpg.game.buff.IRemoveAwareBuff, com.perblue.rpg.game.buff.ISpecialDeathBuff

  // Fields (3)
  private a allies
  private boolean hasRevived
  private final AnimationStateAdapter listener

  // Constructors (1)
  com.perblue.rpg.game.buff.RagingRevenantRevivalBuff()

  // Methods (6)
  private void doRevive()
  public void onRemove(Entity)
  public boolean doSpecialDeath(Unit)
  public void onCombatStart(Entity)
```

## com.perblue.rpg.game.buff.RollerWarriorLegendaryBuff
```
public class RollerWarriorLegendaryBuff extends com.perblue.rpg.game.buff.PassiveSkillBuff implements com.perblue.rpg.game.buff.ISourceCritBuff

  // Fields (1)
  private SkillDamageProvider healProvider

  // Constructors (1)
  com.perblue.rpg.game.buff.RollerWarriorLegendaryBuff()

  // Methods (2)
  public void connectSourceSkill(CombatSkill)
  public float onCrit(Entity, Entity, DamageSource, float)
```

## com.perblue.rpg.game.buff.SadisticDancerAvatarBuff
```
public class SadisticDancerAvatarBuff implements com.perblue.rpg.game.buff.IModifyTakenDamageStage2, com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff, com.perblue.rpg.game.buff.IRemoveAwareBuff

  // Fields (9)
  private static final int AVATAR_COUNT = 2
  private int AvatarHealth
  private a avatarList
  private SkillDamageProvider healProvider
  private BaseProjectileEffect projectileEffect
  private ProjectileType[] projectileTypes
  private ItemType skinType
  private Unit target
  private SkillDamageProvider zeroProvider

  // Constructors (1)
  com.perblue.rpg.game.buff.SadisticDancerAvatarBuff(SkillDamageProvider, ItemType)

  // Methods (12)
  private void setAvatarCount(int, boolean)
  private void endAvatar(boolean)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public void onRemove(Entity)
  public String getBuffName()
  public void addAvatar(RPGParticleEffect)
  public void destroyAvatar(boolean)
  public void subAvatarCount()
  public float getModifyTakenDamagePriority()
  public float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)
```

## com.perblue.rpg.game.buff.ShieldBuff
```
public abstract class ShieldBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.ICopyToSpawnBuff, com.perblue.rpg.game.buff.IRemovablePositiveBuff

  // Fields (8)
  public static final Comparator PRIORITY_SORTER
  public static final int SHIELD_IMMUNE = -1
  private boolean blockNonMatchingDamage
  private DamageTypeData damageFilter
  private float priority
  protected float shieldHp
  protected CombatSkill skill
  protected float totalShieldHp

  // Constructors (1)
  com.perblue.rpg.game.buff.ShieldBuff()

  // Methods (18)
  public DamageTypeData getDamageTypeData()
  public void copyTo(IBuff)
  public void connectSourceSkill(CombatSkill)
  protected boolean updateForStackingEffect(Entity, SimpleDurationBuff, StackingEffect)
  public void getBuffIcons(a)
  public int getEffectiveLevel()
  public void destroyShield(boolean)
  public float getTotalSize()
  public float getShieldHP(DamageSource)
  public ShieldBuff initShieldDuration(long, Unit)
  public ShieldBuff initShieldSize(float, Unit)
  public float getShieldPriority()
## com.perblue.rpg.game.buff.ShieldBuff [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.buff.ShieldBuff and com.perblue.rpg.game.buff.ShieldBuff$ShieldType disagree on InnerClasses attribute]

## com.perblue.rpg.game.buff.SilenceBuff
```
public class SilenceBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.ICombatTextBuff, com.perblue.rpg.game.buff.IDebuff, com.perblue.rpg.game.buff.IDisableBuff, com.perblue.rpg.game.buff.IVoidableBuff

  // Fields (1)
  private float level

  // Constructors (1)
  com.perblue.rpg.game.buff.SilenceBuff()

  // Methods (7)
  public void onAdd(Entity)
  public String getBuffName()
  public void getBuffIcons(a)
  protected StackingEffect getStackingEffect(IBuff)
  public float getEffectiveLevel()
  public SilenceBuff initEffectiveLevel(float)
  public CharSequence getCombatText()
```

## com.perblue.rpg.game.buff.SimpleDOT
```
public class SimpleDOT extends com.perblue.rpg.game.buff.SimpleIntervalBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.IDOTBuff, com.perblue.rpg.game.buff.IDebuff

  // Fields (3)
  private boolean copied
  private IDamageProvider damageProvider
  private float totalDamage

  // Constructors (1)
  com.perblue.rpg.game.buff.SimpleDOT()

  // Methods (8)
  public float getTotalDamage()
  public void onAdd(Entity)
  public String getBuffName()
  public void copyTo(IBuff)
  protected void doTick(Entity)
  public void getBuffIcons(a)
  public SimpleDOT initDamageProvider(IDamageProvider)
  protected StackingEffect getStackingEffect(IBuff)
```

## com.perblue.rpg.game.buff.SimpleDurationBuff
```
public class SimpleDurationBuff implements com.perblue.rpg.game.buff.ICopyableBuff, com.perblue.rpg.game.buff.IDurationBuff, com.perblue.rpg.game.buff.IEntityAwareBuff, com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff, com.perblue.rpg.game.buff.IUpdateAwareBuff

  // Fields (6)
  private long duration
  private float durationScale
  private Entity entity
  private boolean forceExpire
  private long initialDuration
  private long timeLeft

  // Constructors (1)
  com.perblue.rpg.game.buff.SimpleDurationBuff()

  // Methods (16)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public void setEntity(Entity)
  public void setDurationScale(float)
  public String getBuffName()
  public void copyTo(IBuff)
  protected boolean updateForStackingEffect(Entity, SimpleDurationBuff, StackingEffect)
  public void forceExpire()
  public float getDurationScale()
  public IBuff makeInstance()
  public Entity getEntity()
  protected StackingEffect getStackingEffect(IBuff)
  public long getTimeLeft()
  protected void onDurationExpired(Entity)
  public SimpleDurationBuff initDuration(long)
  public long getDuration()
  public void update(Entity, long)
```

## com.perblue.rpg.game.buff.SimpleEnergyOverTime
```
public class SimpleEnergyOverTime extends com.perblue.rpg.game.buff.SimpleIntervalBuff implements com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.ISkillAwareBuff

  // Fields (2)
## com.perblue.rpg.game.buff.SimpleEnergyOverTime [ERROR: IncompatibleClassChangeError: com.perblue.rpg.simulation.skills.generic.SkillDamageProvider and com.perblue.rpg.simulation.skills.generic.SkillDamageProvider$DamageFunction disagree on InnerClasses attribute]

## com.perblue.rpg.game.buff.SimpleHealOverTime
```
public class SimpleHealOverTime extends com.perblue.rpg.game.buff.SimpleIntervalBuff implements com.perblue.rpg.game.buff.IBuffIcon

  // Fields (1)
  private IDamageProvider damageProvider

  // Constructors (1)
  com.perblue.rpg.game.buff.SimpleHealOverTime()

  // Methods (4)
  protected void doTick(Entity)
  public void getBuffIcons(a)
  public SimpleHealOverTime initDamageProvider(IDamageProvider)
  protected StackingEffect getStackingEffect(IBuff)
```

## com.perblue.rpg.game.buff.SimpleIntervalBuff
```
public abstract class SimpleIntervalBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff

  // Fields (5)
  static final boolean $assertionsDisabled = true
  private static final int DEFAULT_TICK_INTERVAL = 1000
  private long current
  private long nextTick
  private int tickInterval

  // Constructors (1)
  com.perblue.rpg.game.buff.SimpleIntervalBuff()

  // Methods (5)
  public void copyTo(IBuff)
  protected abstract void doTick(Entity)
  public SimpleIntervalBuff initTickInterval(int)
  protected void resetTick()
  public void update(Entity, long)
```

## com.perblue.rpg.game.buff.SimpleStunBuff
```
public class SimpleStunBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.ICopyableBuff, com.perblue.rpg.game.buff.IDisableBuff, com.perblue.rpg.game.buff.IRemoveAwareBuff, com.perblue.rpg.game.buff.IStunBuff, com.perblue.rpg.game.buff.IVoidableBuff

  // Fields (1)
  private float level

  // Constructors (1)
  com.perblue.rpg.game.buff.SimpleStunBuff()

  // Methods (8)
  public void onAdd(Entity)
  public void onRemove(Entity)
  public String getBuffName()
  public void copyTo(IBuff)
  public void getBuffIcons(a)
  protected StackingEffect getStackingEffect(IBuff)
  public float getEffectiveLevel()
  public SimpleStunBuff initEffectiveLevel(float)
```

## com.perblue.rpg.game.buff.SpecialAnimationBuff
```
public class SpecialAnimationBuff implements com.perblue.rpg.game.buff.IBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.SpecialAnimationBuff()

  // Methods (1)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.StatAdditionBuff
```
public class StatAdditionBuff extends com.perblue.rpg.game.buff.BaseStatAdditionBuff implements com.perblue.rpg.game.buff.IRemovablePositiveBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.StatAdditionBuff()

  // Methods (6)
  public void copyTo(IBuff)
  public int getEffectiveLevel()
```

## com.perblue.rpg.game.buff.StatAmplificationBuff
```
public class StatAmplificationBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.ICopyToSpawnBuff, com.perblue.rpg.game.buff.IStatAmplificationBuff

  // Fields (1)
  private z statModification

  // Constructors (1)
  com.perblue.rpg.game.buff.StatAmplificationBuff()

  // Methods (5)
  public z getStatAmplifications()
  public String getBuffName()
  public void copyTo(IBuff)
  public void getBuffIcons(a)
  public SimpleDurationBuff initStatModification(z)
```

## com.perblue.rpg.game.buff.StatDebuff
```
public class StatDebuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.ICopyToSpawnBuff, com.perblue.rpg.game.buff.IStatSubtractionBuff

  // Fields (2)
  protected CombatSkill skill
  private z statModification

  // Constructors (1)
  com.perblue.rpg.game.buff.StatDebuff()

  // Methods (6)
  public z getStatSubtractions()
  public String getBuffName()
  public void copyTo(IBuff)
  public void connectSourceSkill(CombatSkill)
  public int getEffectiveLevel()
  public SimpleDurationBuff initStatModification(z)
```

## com.perblue.rpg.game.buff.StatModificationIcons
```
public class StatModificationIcons

  // Constructors (1)
  com.perblue.rpg.game.buff.StatModificationIcons()

  // Methods (1)
  public static void getBuffIcons(ModificationType, z, a)
```

## com.perblue.rpg.game.buff.StatReductionBuff
```
public class StatReductionBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.IDebuff, com.perblue.rpg.game.buff.IStatReductionBuff

  // Fields (1)
  protected z statModification

  // Constructors (1)
  com.perblue.rpg.game.buff.StatReductionBuff()

  // Methods (5)
  public String getBuffName()
  public z getStatReductions()
  public void copyTo(IBuff)
  public void getBuffIcons(a)
  public SimpleDurationBuff initStatModification(z)
```

## com.perblue.rpg.game.buff.StatSettingBuff
```
public class StatSettingBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.ICopyToSpawnBuff, com.perblue.rpg.game.buff.IStatSettingBuff

  // Fields (1)
  private z statModification

  // Constructors (1)
  com.perblue.rpg.game.buff.StatSettingBuff()

  // Methods (4)
  public String getBuffName()
  public z getStatSetting()
  public void copyTo(IBuff)
  public SimpleDurationBuff initStatModification(z)
```

## com.perblue.rpg.game.buff.StatSubtractionBuff
```
public class StatSubtractionBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.ICopyToSpawnBuff, com.perblue.rpg.game.buff.IStatSubtractionBuff

  // Fields (2)
  protected CombatSkill skill
  protected z statModification

  // Constructors (1)
  com.perblue.rpg.game.buff.StatSubtractionBuff()

  // Methods (6)
  public z getStatSubtractions()
  public void copyTo(IBuff)
  public void connectSourceSkill(CombatSkill)
  public void getBuffIcons(a)
  public int getEffectiveLevel()
  public SimpleDurationBuff initStatModification(z)
```

## com.perblue.rpg.game.buff.SteadfastBuff
```
public class SteadfastBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.ISteadfast

  // Constructors (1)
  com.perblue.rpg.game.buff.SteadfastBuff()

  // Methods (1)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.StoneBuff
```
public class StoneBuff extends com.perblue.rpg.game.buff.SimpleStunBuff implements com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.ICopyableBuff, com.perblue.rpg.game.buff.IDisableBuff, com.perblue.rpg.game.buff.IVoidableBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.StoneBuff()

  // Methods (3)
  public void onAdd(Entity)
  public String getBuffName()
  protected StackingEffect getStackingEffect(IBuff)
```

## com.perblue.rpg.game.buff.TastyBuff
```
public class TastyBuff implements com.perblue.rpg.game.buff.IBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.TastyBuff()

  // Methods (2)
  public static boolean isTastyBuff(Entity)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.ToxicDamageBoostBuff
```
public class ToxicDamageBoostBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IModifyDamageDealtState2, com.perblue.rpg.game.buff.ISkillAwareBuff

  // Fields (1)
  private CombatSkill skill

  // Constructors (1)
  com.perblue.rpg.game.buff.ToxicDamageBoostBuff()

  // Methods (3)
  public String getBuffName()
  public void connectSourceSkill(CombatSkill)
  public float modifyDamage(Entity, Entity, float, DamageSource, CombatSkill)
```

## com.perblue.rpg.game.buff.TutorialBuff
```
public class TutorialBuff implements com.perblue.rpg.game.buff.IBuff, com.perblue.rpg.game.buff.IUnclearableBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.TutorialBuff()

  // Methods (1)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.UnTastyBuff
```
public class UnTastyBuff implements com.perblue.rpg.game.buff.IBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.UnTastyBuff()

  // Methods (2)
  public static boolean isUnTastyBuff(Entity)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.UnclearableStatAdditionBuff
```
public class UnclearableStatAdditionBuff extends com.perblue.rpg.game.buff.BaseStatAdditionBuff implements com.perblue.rpg.game.buff.IUnclearableBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.UnclearableStatAdditionBuff()

  // Methods (5)
  public void copyTo(IBuff)
```

## com.perblue.rpg.game.buff.UntargetableBuff
```
public class UntargetableBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IUntargetable

  // Constructors (1)
  com.perblue.rpg.game.buff.UntargetableBuff()

  // Methods (1)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.UntargetableBuffWithDungeonManSkill3
```
public class UntargetableBuffWithDungeonManSkill3 implements com.perblue.rpg.game.buff.IBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.UntargetableBuffWithDungeonManSkill3()

  // Methods (1)
  public String getBuffName()
```

## com.perblue.rpg.game.buff.UntargetableEnemyBuff
```
public class UntargetableEnemyBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IUntargetableEnemy

  // Constructors (1)
  com.perblue.rpg.game.buff.UntargetableEnemyBuff()
```

## com.perblue.rpg.game.buff.VoidWyvernEnergyDebuff
```
public class VoidWyvernEnergyDebuff extends com.perblue.rpg.game.buff.SimpleIntervalBuff implements com.perblue.rpg.game.buff.IOnCombatDoneBuff, com.perblue.rpg.game.buff.IOnCombatStartBuff, com.perblue.rpg.game.buff.ISkillAwareBuff, com.perblue.rpg.game.buff.IUnclearableBuff

  // Fields (4)
  private float accumulatedAmount
  private boolean inCombat
  private boolean isShowingParticle
  private CombatSkill skill

  // Constructors (1)
  com.perblue.rpg.game.buff.VoidWyvernEnergyDebuff(CombatSkill)

  // Methods (7)
  public void drainEnergy(Entity)
  protected void doTick(Entity)
  public void connectSourceSkill(CombatSkill)
  protected StackingEffect getStackingEffect(IBuff)
  public void onCombatDone(Entity)
  public void onCombatStart(Entity)
  public void update(Entity, long)
```

## com.perblue.rpg.game.buff.WeredragonBuff
```
public class WeredragonBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IBuffIcon, com.perblue.rpg.game.buff.ICopyToSpawnBuff, com.perblue.rpg.game.buff.IDrainBar, com.perblue.rpg.game.buff.IRemovablePositiveBuff, com.perblue.rpg.game.buff.IRemoveAwareBuff, com.perblue.rpg.game.buff.IStatAdditionBuff

  // Fields (2)
  private WeredragonEnergyDrainBuff energyDrainBuff
  private StatAdditionBuff statAdditionBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.WeredragonBuff()

  // Methods (12)
  public WeredragonBuff initSourceSkill(CombatSkill)
  public void onAdd(Entity)
  public void onRemove(Entity)
  public z getStatAdditions()
  public void copyTo(IBuff)
  public void connectSourceSkill(CombatSkill)
  public void getBuffIcons(a)
  public WeredragonBuff initTickInterval(int)
  protected StackingEffect getStackingEffect(IBuff)
  public int getEffectiveLevel()
  public WeredragonBuff initStatModification(z)
  public void update(Entity, long)
```

## com.perblue.rpg.game.buff.WeredragonEnergyDrainBuff
```
public class WeredragonEnergyDrainBuff extends com.perblue.rpg.game.buff.SimpleIntervalBuff implements com.perblue.rpg.game.buff.IAddAwareBuff, com.perblue.rpg.game.buff.IRemoveAwareBuff

  // Fields (3)
  private CombatSkill sourceSkill
  private boolean stopping
  private WeredragonIOtherBuff weredragonIOtherBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.WeredragonEnergyDrainBuff()

  // Methods (7)
  public WeredragonEnergyDrainBuff initSourceSkill(CombatSkill)
  public void onAdd(Entity)
  public void onRemove(Entity)
  public void copyTo(IBuff)
  protected void doTick(Entity)
  protected StackingEffect getStackingEffect(IBuff)
```

## com.perblue.rpg.game.buff.ZombieSquireReviveBuff
```
public class ZombieSquireReviveBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IBuff

  // Constructors (1)
  com.perblue.rpg.game.buff.ZombieSquireReviveBuff()
```

## com.perblue.rpg.game.crafting.CraftingHelper
```
public abstract class CraftingHelper

  // Constructors (1)
  com.perblue.rpg.game.crafting.CraftingHelper()

  // Methods (8)
  public static boolean isCraftSuccessActive(IUser)
  public static long getCraftSuccessEndTime(IUser)
  public static int getCraftSuccessMaxAmount(IUser, Rarity)
  public static boolean craftItem(IUser, ItemType, int)
  public static ItemType getMissingPart(IUser, ItemType)
  private static void craftItemRecursive(IUser, ItemType, y, int)
  public static void craftItemRecursive(IUser, ItemType, int)
  public static int getCraftSuccessAmount(IUser, Rarity)
```

## com.perblue.rpg.game.data.BaseStats
```
public abstract class BaseStats extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  public int maxLevel

  // Constructors (3)
  com.perblue.rpg.game.data.BaseStats(int, Class)
  com.perblue.rpg.game.data.BaseStats(Class)
  com.perblue.rpg.game.data.BaseStats(String, Class)

  // Methods (5)
  protected abstract void saveStat(int, Enum, String)
  protected void saveStat(Level, Enum, String)
  protected void onMissingRow(String, Level)
```

## com.perblue.rpg.game.data.BattleStats
```
public class BattleStats

  // Fields (16)
  public x attackerHealing
  public x attackerKnockback
  public x attackerLifeSteal
  public z attackerPrimaryDamage
  public z attackerPrimaryDamageTaken
  public z attackerSubDamageTaken
  public z attackerSubTypeDamage
  public x attackerUnitDamage
  public x defenderHealing
  public x defenderKnockback
  public x defenderLifeSteal
  public z defenderPrimaryDamage
  public z defenderPrimaryDamageTaken
  public z defenderSubDamageTaken
  public z defenderSubTypeDamage
  public x defenderUnitDamage

  // Constructors (1)
  com.perblue.rpg.game.data.BattleStats()
```

## com.perblue.rpg.game.data.DTEnumNode
```
public abstract class DTEnumNode implements com.perblue.common.b.o

  // Fields (1)
  private final Class enumClass

  // Constructors (1)
  com.perblue.rpg.game.data.DTEnumNode(Class)

  // Methods (3)
  public static List toDropItems(Collection)
  public static List toDropItems(Enum)
  public void getSummrayOfAll(r, q)
```

## com.perblue.rpg.game.data.DTHeroesNode
```
public abstract class DTHeroesNode implements com.perblue.common.b.o

  // Constructors (1)
  com.perblue.rpg.game.data.DTHeroesNode()

  // Methods (1)
  public void getSummrayOfAll(r, q)
```

## com.perblue.rpg.game.data.DifficultyModeStats
```
public abstract class DifficultyModeStats

  // Fields (3)
  private static final Pattern LOOT_RANGE_PATTERN
  protected final Map ENEMY_STATS
  protected final Map LOOT_STATS

  // Constructors (1)
  com.perblue.rpg.game.data.DifficultyModeStats()

  // Methods (14)
  public int getEnemyLevel(GameMode, ModeDifficulty)
  public Rarity getEnemyRarity(GameMode, ModeDifficulty)
  public int getEnemyStars(GameMode, ModeDifficulty)
  public UnitType getBossType(GameMode, ModeDifficulty)
  public Collection getEnemyStats()
  public EnvironmentType getEnvironmentType(GameMode, ModeDifficulty)
  public int getExpReward(GameMode, ModeDifficulty)
  public Collection getLootStats()
   List getFinalStageEnemyData(ModeDifficulty, DifficultyModeEnemyStats)
  public List getFinalStageEnemyData(GameMode, ModeDifficulty)
  public Collection getPossibleLoot(GameMode, ModeDifficulty)
  public List getStageEnemies(GameMode, ModeDifficulty, int)
  public Collection rollLoot(GameMode, ModeDifficulty, a)
```

## com.perblue.rpg.game.data.HeroRole
```
public final enum HeroRole extends java.lang.Enum

  // Fields (6)
  private static final HeroRole[] $VALUES
  public static final HeroRole CONTROL
  public static final HeroRole DPS
  public static final HeroRole NONE
  public static final HeroRole SUPPORT
  public static final HeroRole TANK

  // Constructors (1)
  com.perblue.rpg.game.data.HeroRole(String, int)

  // Methods (2)
  public static HeroRole[] values()
  public static HeroRole valueOf(String)
```

## com.perblue.rpg.game.data.HeroSort
```
public final enum HeroSort extends java.lang.Enum

  // Fields (7)
  private static final HeroSort[] $VALUES
  public static final HeroSort LEVEL
  public static final HeroSort NAME
  public static final HeroSort POWER
  public static final HeroSort RARITY
  public static final HeroSort ROLE
  public static final HeroSort STARS

  // Constructors (1)
  com.perblue.rpg.game.data.HeroSort(String, int)

  // Methods (2)
  public static HeroSort[] values()
  public static HeroSort valueOf(String)
```

## com.perblue.rpg.game.data.Level
```
public final enum Level extends java.lang.Enum

  // Fields (26)
  private static final Level[] $VALUES
  public static final Level EIGHT
  public static final Level EIGHTEEN
  public static final Level ELEVEN
  public static final Level FIFTEEN
  public static final Level FIVE
  public static final Level FOUR
  public static final Level FOURTEEN
  public static final Level NINE
  public static final Level NINETEEN
  public static final Level ONE
  public static final Level SEVEN
  public static final Level SEVENTEEN
  public static final Level SIX
  public static final Level SIXTEEN
  public static final Level TEN
  public static final Level THIRTEEN
  public static final Level THREE
  public static final Level TWELVE
  public static final Level TWENTY
  public static final Level TWENTYONE
  public static final Level TWENTYTWO
  public static final Level TWO
  public static final Level ZERO
  private static int maxVal
  private final int val

  // Constructors (1)
  com.perblue.rpg.game.data.Level(String, int, int)

  // Methods (4)
  public final int getVal()
  public static int getMaxVal()
  public static Level[] values()
  public static Level valueOf(String)
```

## com.perblue.rpg.game.data.ModeDifficulty
```
public final enum ModeDifficulty extends java.lang.Enum

  // Fields (34)
  private static final ModeDifficulty[] $VALUES
  public static final ModeDifficulty EIGHT
  public static final ModeDifficulty EIGHTEEN
  public static final ModeDifficulty ELEVEN
  public static final ModeDifficulty FIFTEEN
  public static final ModeDifficulty FIVE
  public static final ModeDifficulty FOUR
  public static final ModeDifficulty FOURTEEN
  public static final ModeDifficulty NINE
  public static final ModeDifficulty NINETEEN
  public static final ModeDifficulty ONE
  public static final ModeDifficulty SEVEN
  public static final ModeDifficulty SEVENTEEN
  public static final ModeDifficulty SIX
  public static final ModeDifficulty SIXTEEN
  public static final ModeDifficulty TEN
  public static final ModeDifficulty THIRTEEN
  public static final ModeDifficulty THIRTY
  public static final ModeDifficulty THIRTYONE
  public static final ModeDifficulty THIRTYTWO
  public static final ModeDifficulty THREE
  public static final ModeDifficulty TWELVE
  public static final ModeDifficulty TWENTY
  public static final ModeDifficulty TWENTYEIGHT
  public static final ModeDifficulty TWENTYFIVE
  public static final ModeDifficulty TWENTYFOUR
  public static final ModeDifficulty TWENTYNINE
  public static final ModeDifficulty TWENTYONE
  public static final ModeDifficulty TWENTYSEVEN
  public static final ModeDifficulty TWENTYSIX
  public static final ModeDifficulty TWENTYTHREE
  public static final ModeDifficulty TWENTYTWO
  public static final ModeDifficulty TWO
  private static ModeDifficulty[] values

  // Constructors (1)
  com.perblue.rpg.game.data.ModeDifficulty(String, int)

  // Methods (5)
  public static ModeDifficulty[] valuesCached()
  public static ModeDifficulty get(int)
  public static ModeDifficulty[] values()
  public static ModeDifficulty valueOf(String)
  public final int getIndex()
```

## com.perblue.rpg.game.data.RPGDropTableStats
```
public abstract class RPGDropTableStats extends com.perblue.common.stats.DropTableStats

  // Constructors (2)
  com.perblue.rpg.game.data.RPGDropTableStats(String, String, m)
  com.perblue.rpg.game.data.RPGDropTableStats(String, m)

  // Methods (1)
  protected boolean shouldValidate()
```

## com.perblue.rpg.game.data.SyncStatDataClientHelper [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.arena.ArenaStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.bossbattle.BossBattleCampaignUnitInfo
```
public class BossBattleCampaignUnitInfo extends com.perblue.rpg.game.data.campaign.CampaignUnitInfo

  // Fields (3)
  private Integer level
  private Rarity rarity
  private Integer stars

  // Constructors (1)
  com.perblue.rpg.game.data.bossbattle.BossBattleCampaignUnitInfo(UnitType, Rarity, Integer, Integer, boolean)

  // Methods (3)
  public Integer getLevel()
  public Rarity getRarity()
  public Integer getStars()
```

## com.perblue.rpg.game.data.bossbattle.BossBattleStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.bosspit.BossPitStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.campaign.CampaignLevel
```
public class CampaignLevel

  // Fields (3)
  private int chapter
  private int level
  private GameMode mode

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignLevel(GameMode, int, int)

  // Methods (4)
  public GameMode getMode()
  public int getChapter()
  public CampaignType getCampaignType()
  public int getLevel()
```

## com.perblue.rpg.game.data.campaign.CampaignStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.campaign.CampaignUnitInfo
```
public class CampaignUnitInfo

  // Fields (2)
  private boolean isBoss
  private UnitType unitType

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignUnitInfo(UnitType, boolean)

  // Methods (2)
  public boolean isBoss()
  public UnitType getType()
```

## com.perblue.rpg.game.data.challenges.ChallengesStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.chest.ChestContext
```
 class ChestContext extends com.perblue.rpg.game.logic.droptable.UserDTContext

  // Fields (4)
  private UserFlag chestRollFlag
  private int count
  private UserFlag freeRollFlag
  private boolean isPaid

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestContext(IUser)

  // Methods (8)
  public UserFlag getChestRollFlag()
  public void setIsPaidRoll(boolean)
  public boolean isPaidRoll()
  public void setChestRollFlag(UserFlag)
  public UserFlag getFreeChestRollFlag()
  public void setFreeChestRollFlag(UserFlag)
  public void setCount(int)
  public int getCount()
```

## com.perblue.rpg.game.data.chest.ChestContextDTCode
```
public class ChestContextDTCode extends com.perblue.rpg.game.logic.droptable.UserContextDTCode

  // Constructors (4)
  com.perblue.rpg.game.data.chest.ChestContextDTCode()
  com.perblue.rpg.game.data.chest.ChestContextDTCode(String[])
  com.perblue.rpg.game.data.chest.ChestContextDTCode(Class, String[])
  com.perblue.rpg.game.data.chest.ChestContextDTCode(Class)

  // Methods (1)
  public void validateType(String, r)
```

## com.perblue.rpg.game.data.chest.ChestStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.chest.EventChestStats
```
public class EventChestStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Fields (2)
  private static final String DISPLAY_ROOT_NAME = DISPLAY
  public String tableData

  // Constructors (1)
  com.perblue.rpg.game.data.chest.EventChestStats(String)

  // Methods (2)
  public List rollChest(IUser, UserFlag, int)
  public List getPossibleLoot(IUser)
```

## com.perblue.rpg.game.data.chest.GeneralGearDropTableStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.chest.GeneralHeroDropTableStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.content.ContentHelper
```
public class ContentHelper

  // Fields (3)
  static final boolean $assertionsDisabled = true
  private static ShardStats EXT
  public static final String PREFIX = content

  // Constructors (1)
  com.perblue.rpg.game.data.content.ContentHelper()

  // Methods (3)
  public static void serverSetup(ShardStats)
  public static ContentStats getStats()
  public static ShardStats get()
```

## com.perblue.rpg.game.data.content.ContentStats
```
public class ContentStats extends com.perblue.common.stats.a

  // Fields (5)
  static final boolean $assertionsDisabled = true
  private static final ContentColumn DEFAULT
  private static final Log LOG
  private static final a colConverter
  private static final a rowConverter

  // Constructors (1)
  com.perblue.rpg.game.data.content.ContentStats()

  // Methods (30)
  public ContentColumn getServerColumn()
  public List getGuildMerchantHeroes()
  public UnitType getMonthlySigninHero(long)
  public Map getSigninHeroesByEndTime()
  public List getWarMerchantHeroes()
  public void validateMaxTeamLevel()
  public int getNumExpertChaptersAvailable()
  public int getNumChaptersAvailable()
  public ItemType getCampaignSoulStone(int, int)
  public Collection getLevelsWithStone(ItemType)
  private static Rarity getMaxRarity(ContentUpdate)
  public Rarity getMaxRarity()
  public List getSecondGoldChestHeroes()
  public Set getAvailableHeroes()
  public Set getGoldChestHeroes()
  public Set getChestHeroes()
  public boolean isGoldChestHero(UnitType)
  public boolean isChestHero(UnitType)
  public List getArenaMerchantHeroes()
  public List getBazaarMerchantHeroes()
  public List getColiseumMerchantHeroes()
  public List getDailySoulChestHeroes(Random)
  public List getExpeditionMerchantHeroes()
  public UnitType getFeaturedSoulChestHero()
  public long getFeaturedSoulChestHeroStartTime()
  public boolean isHeroAvailable(UnitType)
  public ContentUpdate getContentUpdate()
  public int getMaxTeamLevel()
  public ContentColumn getColumn(long)
```

## com.perblue.rpg.game.data.content.ContentUpdate
```
public final enum ContentUpdate extends java.lang.Enum

  // Fields (36)
  private static final ContentUpdate[] $VALUES
  public static final int BETA_0_2_VERSION = 8
  public static final int BETA_0_3_VERSION = 9
  public static final int NEW_CHEST_SEEDS_VERSION = 29
  public static final ContentUpdate R0_2
  public static final ContentUpdate R0_3
  public static final ContentUpdate R1
  public static final ContentUpdate R1_0
  public static final ContentUpdate R1_1
  public static final ContentUpdate R1_2
  public static final ContentUpdate R1_3
  public static final ContentUpdate R1_4
  public static final ContentUpdate R2
  public static final ContentUpdate R2_1
  public static final ContentUpdate R2_10
  public static final ContentUpdate R2_11
  public static final ContentUpdate R2_13
  public static final ContentUpdate R2_14
  public static final ContentUpdate R2_15
  public static final ContentUpdate R2_16
  public static final ContentUpdate R2_17
  public static final ContentUpdate R2_18
  public static final ContentUpdate R2_2
  public static final ContentUpdate R2_20
  public static final ContentUpdate R2_21
  public static final ContentUpdate R2_22
  public static final ContentUpdate R2_3
  public static final ContentUpdate R2_5
  public static final ContentUpdate R2_6
  public static final ContentUpdate R2_7
  public static final ContentUpdate R2_8
  public static final ContentUpdate R2_9
  public static final ContentUpdate R3
  public static final ContentUpdate UNKNOWN
  public static final int WW_1_0_VERSION = 12
  private static ContentUpdate[] values

  // Constructors (1)
  com.perblue.rpg.game.data.content.ContentUpdate(String, int)

  // Methods (3)
  public static ContentUpdate[] valuesCached()
  public static ContentUpdate[] values()
  public static ContentUpdate valueOf(String)
```

## com.perblue.rpg.game.data.crypt.CryptRaidStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.display.AnimatedDisplayData
```
public class AnimatedDisplayData extends com.perblue.rpg.game.data.display.BaseDisplayData

  // Fields (8)
  public static final float DEFAULT_FRAME_DURATION = 0.1
  public static final RotationType DEFAULT_ROT
  public final String atlasPath
  public final float frameDuration
  public final int playMode$4477989a
  public final String regionPrefix
  public final float scaleX
  public final float scaleY

  // Constructors (3)
  com.perblue.rpg.game.data.display.AnimatedDisplayData(String, String, RotationType, float, int)
  com.perblue.rpg.game.data.display.AnimatedDisplayData(String, String, RotationType, float, float, float, int)
  com.perblue.rpg.game.data.display.AnimatedDisplayData(String, String, RotationType, float)

  // Methods (1)
  public Collection getPaths()
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil
```
public class AnimationVFXListenerUtil

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil()

  // Methods (1)
  public static AnimationStateListener defaultUnitVFX(Unit)
```

## com.perblue.rpg.game.data.display.BaseDisplayData
```
public abstract class BaseDisplayData

  // Fields (1)
  public final RotationType rotation

  // Constructors (1)
  com.perblue.rpg.game.data.display.BaseDisplayData(RotationType)

  // Methods (1)
  public abstract Collection getPaths()
```

## com.perblue.rpg.game.data.display.DisplayData
```
public class DisplayData

  // Fields (2)
  public a sortedDisplays
  public final String uiIcon

  // Constructors (2)
  com.perblue.rpg.game.data.display.DisplayData(String)
  com.perblue.rpg.game.data.display.DisplayData()

  // Methods (1)
  protected DisplayData addLayer(BaseDisplayData)
```

## com.perblue.rpg.game.data.display.DisplayDataUtil
```
public class DisplayDataUtil

  // Fields (12)
  private static final Map ALL_DATA
  public static final ShadowData DEFAULT_SHADOW
  public static final String GIANT_PLANT_STAGE2_KEY = NPC_GIANT_PLANT_STAGE2
  private static float GLOBAL_SCALE
  private static Log LOG
  public static final DisplayData NULL_DATA
  private static final Map SHADOW_DATA
  public static final float TITAN_COMBAT_SCALE_MULT = 0.75
  private static DisplayData UNDERSTUDY_CACTUS
  private static DisplayData UNDERSTUDY_CLUB
  private static DisplayData UNDERSTUDY_FRYING_PAN
  public static final Map UNIT_SCALING

  // Constructors (1)
  com.perblue.rpg.game.data.display.DisplayDataUtil()

  // Methods (42)
  private static void setupScaling()
  private static void setupShadows()
  public static float getUnitScale(UnitType)
  public static void addUnitSkin(UnitType, ItemType, String, String, String)
  public static DisplayData addProjectileSkin(String, ItemType)
  public static DisplayData addProjectileSkin(String, ItemType, String, String, RotationType)
  public static DisplayData addEnvironment(EnvironmentType, String)
  public static DisplayData addEnvironment(EnvironmentType, String, String)
  public static DisplayData addEnvironment(EnvironmentType, String, boolean)
  public static DisplayData addEnvironment(EnvironmentType)
  public static DisplayData addEnvEntityDisplay(String, String, String, float)
  public static DisplayData addEnvEntityDisplay(String)
  public static DisplayData addEnvEntityDisplaySkin(String, ItemType)
  public static DisplayData addEnvEntityDisplaySkin(String, ItemType, String, String, float)
  public static DisplayData addSpineUI(SpineUIType, String, String)
  public static EnvironmentType getBossPitEnvironmentType(UnitType, int)
  public static float getCastingScaleMultiplier(UnitType)
  public static DisplayData getEnvEntityDisplay(EnvEntityType, ItemType)
  public static DisplayData getEnvironmentDisplay(EnvironmentType)
  public static float getMaxTempleUiScale(Unit)
  public static DisplayData getProjectileDisplay(ProjectileType, ItemType)
  public static String getShadowFollowSlot(Entity)
  private static void addDisplayDataBase(String, DisplayData)
  public static void addEnvEntityShadow(EnvEntityType, String, float, float, float, float)
  public static void addUnitShadow(UnitType, String, float, float, float, float)
  public static DisplayData getDisplayData(String)
  public static float getTempleUiScale(UnitType)
  public static DisplayData getUnitDisplay(UnitType, ItemType)
  public static DisplayData getUnitDisplay(UnitType)
  public static DisplayData getUIDisplay(SpineUIType)
  public static void initAnimMapping(UnitType, AnimationElement)
  public static void initMixData(Unit, AnimationStateData)
  public static SpineDisplayData getSpineDisplayData(DisplayData)
  public static SpineDisplayData getSpineDisplayData(UnitType)
  public static float getTitanEntityScale(UnitType)
  public static float getFlyingHeight(UnitType)
  public static ShadowData getShadowData(UnitType)
  public static ShadowData getShadowData(EnvEntityType)
  public static DisplayData addProjectile(String)
  public static DisplayData addProjectile(String, String, String, RotationType)
  public static void addUnit(UnitType, String, String, String)
  public static void addUnit(String, String, String, String, float)
```

## com.perblue.rpg.game.data.display.EnvironmentData
```
public class EnvironmentData

  // Constructors (1)
  com.perblue.rpg.game.data.display.EnvironmentData()

  // Methods (3)
  public static boolean isTrapezoid(EnvironmentType)
  public static float getAngle(EnvironmentType)
  public static boolean isSnowing(EnvironmentType)
```

## com.perblue.rpg.game.data.display.LayeredDisplayData
```
public class LayeredDisplayData extends com.perblue.rpg.game.data.display.StaticDisplayData

  // Fields (1)
  public final RenderGroupType groupType

  // Constructors (2)
  com.perblue.rpg.game.data.display.LayeredDisplayData(String, String, RotationType, RenderGroupType)
  com.perblue.rpg.game.data.display.LayeredDisplayData(String, String, RenderGroupType)
```

## com.perblue.rpg.game.data.display.MultiMappedParticleHitData
```
public class MultiMappedParticleHitData

  // Fields (1)
   HashMap particles

  // Constructors (2)
  com.perblue.rpg.game.data.display.MultiMappedParticleHitData(MultiParticleHitData)
  com.perblue.rpg.game.data.display.MultiMappedParticleHitData()

  // Methods (2)
  public void addParticles(String, MultiParticleHitData)
  public MultiParticleHitData getParticles(String)
```

## com.perblue.rpg.game.data.display.MultiParticleHitData
```
public class MultiParticleHitData

  // Fields (1)
  protected a particles

  // Constructors (4)
  com.perblue.rpg.game.data.display.MultiParticleHitData()
  com.perblue.rpg.game.data.display.MultiParticleHitData(ParticleHitData, ParticleHitData, ParticleHitData)
  com.perblue.rpg.game.data.display.MultiParticleHitData(ParticleHitData, ParticleHitData)
  com.perblue.rpg.game.data.display.MultiParticleHitData(ParticleHitData)

  // Methods (2)
  public void addParticles(ParticleHitData)
  public a getParticles()
```

## com.perblue.rpg.game.data.display.ParticleHitData
```
public class ParticleHitData extends com.perblue.rpg.game.data.display.MultiParticleHitData

  // Fields (5)
  public long duration
  public q offset
  public HIT_LOCATION position
  public boolean removeOnCompletion
  public ParticleType type

  // Constructors (4)
  com.perblue.rpg.game.data.display.ParticleHitData(ParticleType, HIT_LOCATION)
  com.perblue.rpg.game.data.display.ParticleHitData(ParticleType, HIT_LOCATION, q, long, boolean)
  com.perblue.rpg.game.data.display.ParticleHitData(ParticleType, HIT_LOCATION, q)
  com.perblue.rpg.game.data.display.ParticleHitData(ParticleType, HIT_LOCATION, long)

  // Methods (2)
  public ParticleType getParticleType()
  public a getParticles()
```

## com.perblue.rpg.game.data.display.ShadowData
```
public class ShadowData

  // Fields (5)
  public final String followSlot
  public final float scaleX
  public final float scaleY
  public final float xOffset
  public final float yOffset

  // Constructors (1)
  com.perblue.rpg.game.data.display.ShadowData(String, float, float, float, float)
```

## com.perblue.rpg.game.data.display.SpineDisplayData
```
public class SpineDisplayData extends com.perblue.rpg.game.data.display.BaseDisplayData

  // Fields (3)
  public final String atlasPath
  public final float scale
  public final String skeletonPath

  // Constructors (2)
  com.perblue.rpg.game.data.display.SpineDisplayData(String, String, float, RotationType)
  com.perblue.rpg.game.data.display.SpineDisplayData(String, String, float)

  // Methods (1)
  public Collection getPaths()
```

## com.perblue.rpg.game.data.display.StaticDisplayData
```
public class StaticDisplayData extends com.perblue.rpg.game.data.display.BaseDisplayData

  // Fields (3)
  public static final RotationType DEFAULT_ROT
  public final String atlasPath
  public final String regionName

  // Constructors (2)
  com.perblue.rpg.game.data.display.StaticDisplayData(String, String, RotationType)
  com.perblue.rpg.game.data.display.StaticDisplayData(String, String)

  // Methods (1)
  public Collection getPaths()
```

## com.perblue.rpg.game.data.display.VFXUtil
```
public class VFXUtil

  // Fields (2)
  public static final Map PROJECTILE_HIT_DATA
  public static final Map VFX_HIT_DATA

  // Constructors (1)
  com.perblue.rpg.game.data.display.VFXUtil()

  // Methods (7)
  private static void putVfxData(SkillType, MultiParticleHitData)
  public static AnimationStateListener getBaseVFX(EnvEntity)
  public static AnimationStateListener getBaseVFX(Projectile)
  public static AnimationStateListener getBaseVFX(Unit)
  public static AnimationStateListener getBaseVFX(Entity)
  public static MultiParticleHitData getVfxData(SkillType, Entity)
  private static AnimationStateListener defaultUnitVFX(Unit)
```

## com.perblue.rpg.game.data.expedition.ExpeditionStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.item.CraftingStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.item.GearTicketStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.item.HowToGetHelper
```
public class HowToGetHelper

  // Fields (4)
  public static final int INFINITE_CAMPAIGN_LEVELS = -1
  private static final Comparator INFINITE_LIST_CAMPAIGN_SORT
  private static final Comparator SMALL_LIST_CAMPAIGN_SORT
  private static UnitType hero

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper()

  // Methods (9)
  private static void _getHowToGetLinks(LinkableItem, IUser, List, int)
  private static void addMerchants(LinkableItem, IUser, List)
  public static Collection getHowToGetLinks(ItemType, IUser, UnitType, int)
  public static Collection getHowToGetLinks(ItemType, IUser, int)
  public static Collection getHowToGetLinks(IRune, IUser, int)
  private static boolean isHeroAvailableInChest(RewardDrop, ItemType)
  private static boolean shouldShowMerchantInHowToGet(MerchantType, LinkableItem, IUser)
  public static boolean runeMatches(IRune, RuneData)
```

## com.perblue.rpg.game.data.item.ItemCategory
```
public final enum ItemCategory extends java.lang.Enum

  // Fields (10)
  private static final ItemCategory[] $VALUES
  public static final ItemCategory GEAR
  public static final ItemCategory HERO
  public static final ItemCategory HIDDEN
  public static final ItemCategory MISC
  public static final ItemCategory REEL
  public static final ItemCategory RUNE
  public static final ItemCategory SHARD
  public static final ItemCategory STONE
  public static final ItemCategory TRASH

  // Constructors (1)
  com.perblue.rpg.game.data.item.ItemCategory(String, int)

  // Methods (2)
  public static ItemCategory[] values()
  public static ItemCategory valueOf(String)
```

## com.perblue.rpg.game.data.item.ItemStats [ERROR: NoClassDefFoundError: Could not initialize class com.perblue.rpg.game.data.item.ItemStats]

## com.perblue.rpg.game.data.item.StatType
```
public final enum StatType extends java.lang.Enum

  // Fields (66)
  private static final StatType[] $VALUES
  public static final StatType ACCURACY
  public static final StatType AGILITY
  public static final StatType ARMOR
  public static final StatType ARMOR_PENETRATION
  public static final StatType ATTACK_DAMAGE
  public static final StatType ATTACK_SPEED_MODIFIER
  public static final StatType BASHING_DMG_AMP
  public static final StatType BASHING_DMG_REDUX
  public static final StatType CATEGORY
  public static final StatType CONTENT_UPDATE
  public static final StatType COOLDOWN_REDUCTION
  public static final StatType CRIT_DAMAGE_BONUS
  public static final StatType CRIT_DMG_REDUX
  public static final StatType DIAMOND_PRICE
  public static final StatType DODGE
  public static final StatType ELECTRICAL_DMG_AMP
  public static final StatType ELECTRICAL_DMG_REDUX
  public static final StatType ENCHANT_POINTS
  public static final StatType ENERGY_CONSUMPTION_REDUCTION
  public static final StatType ENERGY_GAIN
  public static final StatType ENERGY_REGEN
  public static final StatType ENERGY_WHEN_ATTACKED
  public static final StatType EXP_GIVEN
  public static final StatType FIGHT_PIT_TOKEN_PRICE
  public static final StatType FIRE_DMG_AMP
  public static final StatType FIRE_DMG_REDUX
  public static final StatType GOLD_PRICE
  public static final StatType HOLY_DMG_AMP
  public static final StatType HOLY_DMG_REDUX
  public static final StatType HP_REGEN
  public static final StatType IGNORE_MAGIC_RESISTANCE
  public static final StatType IMPROVE_HEALING
  public static final StatType INTELLECT
  public static final StatType LARGER_SHIELDS
  public static final StatType LIFE_STEAL_RATING
  public static final StatType LONGER_DISABLES
  public static final StatType LONGER_SHIELDS
  public static final StatType MAGIC_CRIT
  public static final StatType MAGIC_POWER
  public static final StatType MAGIC_RESISTANCE
  public static final StatType MAGIC_VAMP
  public static final StatType MAX_ENERGY
  public static final StatType MAX_HP
  public static final StatType MOVEMENT_SPEED_MODIFIER
  public static final StatType NECROTIC_DMG_AMP
  public static final StatType NECROTIC_DMG_REDUX
  public static final Set PERCENT_VALUED_STATS
  public static final StatType PHYSICAL_CRIT
  public static final StatType PIERCING_DMG_AMP
  public static final StatType PIERCING_DMG_REDUX
  public static final StatType RARITY
  public static final StatType REQUIRED_LEVEL
  public static final StatType SKILL_LEVEL
  public static final StatType SLASHING_DMG_AMP
  public static final StatType SLASHING_DMG_REDUX
  public static final StatType STARTING_ENERGY
  public static final StatType STRENGTH
  public static final StatType TENACITY
  public static final StatType TOXIC_DMG_AMP
  public static final StatType TOXIC_DMG_REDUX
  public static final Set UNIT_STATS
  public static final StatType VEND_VALUE
  public static final StatType WATER_DMG_AMP
  public static final StatType WATER_DMG_REDUX
  private static StatType[] values

  // Constructors (1)
  com.perblue.rpg.game.data.item.StatType(String, int)

  // Methods (7)
  public final boolean defaultHide()
  public final float getBaseHideValue()
  public final boolean isCoreStat()
  public final boolean isPercentStat()
  public static StatType[] valuesCached()
  public static StatType[] values()
  public static StatType valueOf(String)
```

## com.perblue.rpg.game.data.item.enchanting.EnchantingStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.misc.GameModeRefreshStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.misc.GoldDrop [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.misc.LegacyVipTicketMap
```
public class LegacyVipTicketMap

  // Fields (1)
  public static final int[] legacyVipTicketsByLevel

  // Constructors (1)
  com.perblue.rpg.game.data.misc.LegacyVipTicketMap()

  // Methods (1)
  public static int getLegacyVipTicketsByLevel(int)
```

## com.perblue.rpg.game.data.misc.MerchantDTCode
```
public class MerchantDTCode extends com.perblue.rpg.game.logic.droptable.UserContextDTCode

  // Constructors (4)
  com.perblue.rpg.game.data.misc.MerchantDTCode()
  com.perblue.rpg.game.data.misc.MerchantDTCode(String[])
  com.perblue.rpg.game.data.misc.MerchantDTCode(Class, String[])
  com.perblue.rpg.game.data.misc.MerchantDTCode(Class)

  // Methods (2)
  public void validateParamter(String, String, r)
  public void validateType(String, r)
```

## com.perblue.rpg.game.data.misc.MerchantStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.misc.MidasStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.misc.QuestStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.misc.RaidTicketPurchaseStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.misc.StaminaStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.misc.SupportLinks [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.misc.TeamLevelStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.misc.Unlockable
```
public final enum Unlockable extends java.lang.Enum

  // Fields (167)
  private static final Unlockable[] $VALUES
  public static final Unlockable ADVANCED_TAGS
  public static final Unlockable ALCHEMY
  public static final Unlockable BAZAAR
  public static final Unlockable BLACK_MARKET
  public static final Unlockable BOSS_BATTLE
  public static final Unlockable BOSS_PIT
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_1
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_10
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_11
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_12
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_13
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_14
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_15
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_16
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_17
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_18
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_19
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_2
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_3
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_4
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_5
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_6
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_7
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_8
  public static final Unlockable BOSS_PIT_EVIL_WIZARD_9
  public static final Unlockable BOSS_PIT_GIANT_PLANT_1
  public static final Unlockable BOSS_PIT_GIANT_PLANT_10
  public static final Unlockable BOSS_PIT_GIANT_PLANT_11
  public static final Unlockable BOSS_PIT_GIANT_PLANT_12
  public static final Unlockable BOSS_PIT_GIANT_PLANT_13
  public static final Unlockable BOSS_PIT_GIANT_PLANT_14
  public static final Unlockable BOSS_PIT_GIANT_PLANT_15
  public static final Unlockable BOSS_PIT_GIANT_PLANT_16
  public static final Unlockable BOSS_PIT_GIANT_PLANT_17
  public static final Unlockable BOSS_PIT_GIANT_PLANT_18
  public static final Unlockable BOSS_PIT_GIANT_PLANT_19
  public static final Unlockable BOSS_PIT_GIANT_PLANT_2
  public static final Unlockable BOSS_PIT_GIANT_PLANT_3
  public static final Unlockable BOSS_PIT_GIANT_PLANT_4
  public static final Unlockable BOSS_PIT_GIANT_PLANT_5
  public static final Unlockable BOSS_PIT_GIANT_PLANT_6
  public static final Unlockable BOSS_PIT_GIANT_PLANT_7
  public static final Unlockable BOSS_PIT_GIANT_PLANT_8
  public static final Unlockable BOSS_PIT_GIANT_PLANT_9
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_1
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_10
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_11
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_12
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_13
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_14
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_15
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_16
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_17
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_18
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_19
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_2
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_3
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_4
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_5
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_6
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_7
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_8
  public static final Unlockable BOSS_PIT_GOLD_COLOSSUS_9
  public static final Unlockable CHALLENGES
  public static final Unlockable CHALLENGES_10
  public static final Unlockable CHALLENGES_11
  public static final Unlockable CHALLENGES_12
  public static final Unlockable CHALLENGES_13
  public static final Unlockable CHALLENGES_14
  public static final Unlockable CHALLENGES_15
  public static final Unlockable CHALLENGES_16
  public static final Unlockable CHALLENGES_17
  public static final Unlockable CHALLENGES_18
  public static final Unlockable CHALLENGES_19
  public static final Unlockable CHALLENGES_2
  public static final Unlockable CHALLENGES_20
  public static final Unlockable CHALLENGES_21
  public static final Unlockable CHALLENGES_22
  public static final Unlockable CHALLENGES_3
  public static final Unlockable CHALLENGES_4
  public static final Unlockable CHALLENGES_5
  public static final Unlockable CHALLENGES_6
  public static final Unlockable CHALLENGES_7
  public static final Unlockable CHALLENGES_8
  public static final Unlockable CHALLENGES_9
  public static final Unlockable CHAPTER_10
  public static final Unlockable CHAPTER_11
  public static final Unlockable CHAPTER_12
  public static final Unlockable CHAPTER_13
  public static final Unlockable CHAPTER_14
  public static final Unlockable CHAPTER_15
  public static final Unlockable CHAPTER_16
  public static final Unlockable CHAPTER_17
  public static final Unlockable CHAPTER_18
  public static final Unlockable CHAPTER_19
  public static final Unlockable CHAPTER_2
  public static final Unlockable CHAPTER_20
  public static final Unlockable CHAPTER_21
  public static final Unlockable CHAPTER_22
  public static final Unlockable CHAPTER_23
  public static final Unlockable CHAPTER_24
  public static final Unlockable CHAPTER_25
  public static final Unlockable CHAPTER_26
  public static final Unlockable CHAPTER_27
  public static final Unlockable CHAPTER_28
  public static final Unlockable CHAPTER_29
  public static final Unlockable CHAPTER_3
  public static final Unlockable CHAPTER_4
  public static final Unlockable CHAPTER_5
  public static final Unlockable CHAPTER_6
  public static final Unlockable CHAPTER_7
  public static final Unlockable CHAPTER_8
  public static final Unlockable CHAPTER_9
  public static final Unlockable COLISEUM
  public static final Unlockable COLISEUM_QUICK_ATTACK
  public static final Unlockable CRYPT_RAID
  public static final Unlockable CRYPT_RAID_QUICK_ATTACK
  public static final Unlockable ELITE_CAMPAIGN
  public static final Unlockable ENCHANTING
  public static final Unlockable EXPEDITION
  public static final Unlockable EXPEDITION_QUICK_ATTACK
  public static final Unlockable EXPERT_CAMPAIGN
  public static final Unlockable FAST_FORWARD
  public static final Unlockable FIGHT_PIT
  public static final Unlockable FIGHT_PIT_QUICK_ATTACK
  public static final Unlockable GUILDS
  public static final Unlockable GUILD_WAR
  public static final Unlockable GUILD_WAR_QUICK_ATTACK
  public static final Unlockable ORANGE_CHEST
  public static final Unlockable PEDDLER
  public static final Unlockable POWER_UPGRADE
  public static final Unlockable PURCHASE
  public static final Unlockable PURPLE_CHEST
  public static final Unlockable RANKINGS
  public static final Unlockable RUNES
  public static final Unlockable SERVICE_OPEN
  public static final Unlockable SKINS
  public static final Unlockable SOULMART
  public static final Unlockable THE_MOUNTAIN
  public static final Unlockable THE_MOUNTAIN_10
  public static final Unlockable THE_MOUNTAIN_11
  public static final Unlockable THE_MOUNTAIN_12
  public static final Unlockable THE_MOUNTAIN_13
  public static final Unlockable THE_MOUNTAIN_14
  public static final Unlockable THE_MOUNTAIN_15
  public static final Unlockable THE_MOUNTAIN_16
  public static final Unlockable THE_MOUNTAIN_17
  public static final Unlockable THE_MOUNTAIN_18
  public static final Unlockable THE_MOUNTAIN_19
  public static final Unlockable THE_MOUNTAIN_2
  public static final Unlockable THE_MOUNTAIN_20
  public static final Unlockable THE_MOUNTAIN_21
  public static final Unlockable THE_MOUNTAIN_22
  public static final Unlockable THE_MOUNTAIN_3
  public static final Unlockable THE_MOUNTAIN_4
  public static final Unlockable THE_MOUNTAIN_5
  public static final Unlockable THE_MOUNTAIN_6
  public static final Unlockable THE_MOUNTAIN_7
  public static final Unlockable THE_MOUNTAIN_8
  public static final Unlockable THE_MOUNTAIN_9
  public static final Unlockable TITAN_TEMPLE
  public static final Unlockable TITAN_TEMPLE_QUICK_ATTACK
  public static final Unlockable TRADER
  public static final Unlockable TREASURE_CRYPT
  public static final Unlockable WORLD_CHANNEL
  private static Unlockable[] values

  // Constructors (1)
  com.perblue.rpg.game.data.misc.Unlockable(String, int)

  // Methods (12)
  public static Unlockable getUnlockableForBossPit(UnitType, ModeDifficulty)
  public static Unlockable getUnlockableForChapter(int)
  public static Unlockable getUnlockableForChests(ChestType)
  public static Unlockable getUnlockableForGameMode(GameMode, ModeDifficulty)
  public final int getChapterIndex()
  public static Set getUnlockables(int, int)
  public final boolean isCampaign()
  public final boolean isFeature()
  public static Unlockable[] valuesCached()
  public static Unlockable[] values()
  public static Unlockable valueOf(String)
  public final boolean isHidden()
```

## com.perblue.rpg.game.data.misc.Unlockables [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.misc.UserValue
```
public final enum UserValue extends java.lang.Enum

  // Fields (70)
  private static final UserValue[] $VALUES
  public static final UserValue ALLOWED_UNACKNOWLEDGED_CHESTS
  public static final UserValue BLOCKED_LIST_LIMIT
  public static final UserValue BLUE_PRIME_LOOT
  public static final UserValue BLUE_PRIME_LOOT_MEM
  public static final UserValue BLUE_SECOND_LOOT
  public static final UserValue BOSS_PIT_ATTEMPTS
  public static final UserValue CAMPAIGN_LOOT_LIMIT
  public static final UserValue CHAT_APP_BUTTON
  public static final UserValue CHAT_APP_IMAGE_LINK
  public static final UserValue CHAT_APP_UPSELL
  public static final UserValue COLISEUM_THREE_ATTACKS
  public static final UserValue CRYPT_RECOMMENDED_POWER_SCALAR
  public static final UserValue CRYSTAL_SHRINE_GENERATION_INTERVAL
  public static final UserValue CRYSTAL_SHRINE_ROLL_CAPACITY
  public static final UserValue EXP_DECANTER_CHANCE
  public static final UserValue EXP_FLASK_CHANCE
  public static final UserValue EXP_PHILTER_CHANCE
  public static final UserValue EXP_VIAL_CHANCE
  public static final UserValue FIGHT_PIT_CONTENT_UPDATE_LOCK
  public static final UserValue FIRST_WIN_MAJOR_STAGE_LOOT_MULT
  public static final UserValue FIRST_WIN_MINOR_STAGE_LOOT_MULT
  public static final UserValue FRIEND_LIMIT
  public static final UserValue GOLD_CHEST_GENERATION_INTERVAL
  public static final UserValue GREEN_PRIME_LOOT
  public static final UserValue GREEN_PRIME_LOOT_MEM
  public static final UserValue GREEN_SECOND_LOOT
  public static final UserValue LOOT_MEMORY_FUNC
  public static final UserValue MAX_RARITY
  public static final UserValue MIN_CHAPTER_FOR_ELITE
  public static final UserValue MIN_STONE_FOR_10X_GOLD_CHEST
  public static final UserValue ORANGE_CHEST_ENABLED
  public static final UserValue ORANGE_CHEST_GENERATION_INTERVAL
  public static final UserValue ORANGE_PRIME_LOOT
  public static final UserValue ORANGE_PRIME_LOOT_MEM
  public static final UserValue ORANGE_SECOND_LOOT
  public static final UserValue PM_ROOM_LIMIT
  public static final UserValue PRIMARY_LOOT_FUNC
  public static final UserValue PROMO_CODE_ENABLED
  public static final UserValue PURPLE_CHEST_ENABLED
  public static final UserValue PURPLE_CHEST_GENERATION_INTERVAL
  public static final UserValue PURPLE_PRIME_LOOT
  public static final UserValue PURPLE_PRIME_LOOT_MEM
  public static final UserValue PURPLE_SECOND_LOOT
  public static final UserValue QUICK_ATTACK_ENABLED
  public static final UserValue QUICK_ATTACK_PLAY_SPEED
  public static final UserValue RAID_TICKETS_PURCHASE_AMOUNT
  public static final UserValue RAID_TICKET_LOOT_FUNCTION
  public static final UserValue RAID_TICKET_LOOT_MEM_FUNCTION
  public static final UserValue SECONDARY_LOOT_FUNC
  public static final UserValue SECOND_GOLD_CHEST_GENERATION_INTERVAL
  public static final UserValue SKILL_POINT_GENERATION_INTERVAL
  public static final UserValue SKILL_POINT_PURCHASE_AMOUNT
  public static final UserValue SOUL_CHEST_GENERATION_INTERVAL
  public static final UserValue SS_PRIME_LOOT
  public static final UserValue SS_PRIME_LOOT_MEM
  public static final UserValue SS_SECOND_LOOT
  public static final UserValue STAMINA_GENERATION_INTERVAL
  public static final UserValue STAMINA_HARD_CAP
  public static final UserValue STAMINA_PURCHASE_AMOUNT
  public static final UserValue STONE_SHRINE_GENERATION_INTERVAL
  public static final UserValue STONE_SHRINE_ROLL_CAPACITY
  public static final UserValue SYMMETRIC_LOOT
  public static final UserValue SYMMETRIC_LOOT_MEM
  public static final UserValue THOUGHT_BUBBLE_MIN_LEVEL
  public static final UserValue THOUGHT_BUBBLE_PROBABILITY
  public static final UserValue TIME_ZONE_CHANGE_INTERVAL
  public static final UserValue WHITE_PRIME_LOOT
  public static final UserValue WHITE_PRIME_LOOT_MEM
  public static final UserValue WHITE_SECOND_LOOT

  // Constructors (1)
  com.perblue.rpg.game.data.misc.UserValue(String, int)

  // Methods (2)
  public static UserValue[] values()
  public static UserValue valueOf(String)
```

## com.perblue.rpg.game.data.misc.UserValues [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.misc.VIPFeature
```
public final enum VIPFeature extends java.lang.Enum

  // Fields (56)
  private static final VIPFeature[] $VALUES
  public static final VIPFeature ALCHEMY
  public static final VIPFeature ARENA_BATTLES_PER_RESET
  public static final VIPFeature BLACK_MARKET_PERM
  public static final VIPFeature BONUS_DIAMOND_PERCENT
  public static final VIPFeature BOOTY_CAVES
  public static final VIPFeature BOSS_PIT_BETTER_REWARDS
  public static final VIPFeature BOSS_PIT_RUNS
  public static final VIPFeature CHALLENGES_COOLDOWN
  public static final VIPFeature CHALLENGE_RESETS
  public static final VIPFeature CLEAR_COLISEUM_COOLDOWN
  public static final VIPFeature CLEAR_FIGHT_PIT_COOLDOWN
  public static final VIPFeature COLISEUM_RESET
  public static final VIPFeature DIAMONDS_ADMIRATION
  public static final VIPFeature DOUBLE_RUNE_OFFERING_CHANCE
  public static final VIPFeature ELITE_RESET
  public static final VIPFeature ENCHANT_MAX
  public static final VIPFeature EXPEDITION_GOLD_BONUS
  public static final VIPFeature EXPEDITION_RUN
  public static final VIPFeature EXPEDITION_TOKEN_BONUS
  public static final VIPFeature EXTRA_FREE_STAMINA
  public static final VIPFeature EXTRA_STAMINA_CAP
  public static final VIPFeature EXTRA_WAR_PICK_REWARDS
  public static final VIPFeature FAST_FORWARD
  public static final VIPFeature FIGHT_PIT_RESET
  public static final VIPFeature FREE_MERCHANT_RESETS
  public static final VIPFeature FREE_RUNE_REMOVALS
  public static final VIPFeature GUILD_ADMIRATION
  public static final VIPFeature GUILD_COIN_BONUS
  public static final VIPFeature GUILD_RAID_GOLD_MULT
  public static final VIPFeature MAX_LEVEL_FROM_XP
  public static final VIPFeature MERCENARY_HALL_HEROES
  public static final VIPFeature MOUNTAIN_COOLDOWN
  public static final VIPFeature MOUNTAIN_RESETS
  public static final VIPFeature PEDDLER_PERM
  public static final VIPFeature POWER_POINTS
  public static final VIPFeature RAID_10
  public static final VIPFeature RAID_BOSS_PIT
  public static final VIPFeature RAID_CHALLENGES
  public static final VIPFeature RAID_MOUNTAIN
  public static final VIPFeature RAID_TICKETS
  public static final VIPFeature RAID_TICKET_PURCHASE_LIMIT
  public static final VIPFeature REFILL_POWER_POINTS
  public static final VIPFeature RUNICITE_ALCHEMY
  public static final VIPFeature SIGN_IN_MULTIPLIER
  public static final VIPFeature SILVER_CHEST_GENERATION
  public static final VIPFeature SOULMART_RESETS
  public static final VIPFeature SOUL_CHEST
  public static final VIPFeature STAMINA_HOURS
  public static final VIPFeature STAMINA_PURCHASE
  public static final VIPFeature TEMPLE_TOKEN_MULT
  public static final VIPFeature USE_RAID_TICKETS
  public static final VIPFeature VIP_CHAT
  public static final VIPFeature VIP_TICKETS
  public static final VIPFeature WAR_TOKEN_BONUS
  public static final VIPFeature WEEKLY_FREE_ITEMS

  // Constructors (1)
  com.perblue.rpg.game.data.misc.VIPFeature(String, int)

  // Methods (6)
  public final boolean isEverFeature()
  public final boolean isNewFeature(int)
  public final boolean isEverPerk()
  public final boolean shouldHide(IUser)
  public static VIPFeature[] values()
  public static VIPFeature valueOf(String)
```

## com.perblue.rpg.game.data.misc.VIPStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.mountain.MountainStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.rune.GeneralRuneDropTableStats [ERROR: NoClassDefFoundError: Could not initialize class com.perblue.rpg.game.data.misc.Unlockables]

## com.perblue.rpg.game.data.rune.RuneStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.social.ClientChat
```
public class ClientChat

  // Fields (3)
  public Chat chat
  public boolean isNew
  public int likes

  // Constructors (1)
  com.perblue.rpg.game.data.social.ClientChat(Chat, boolean, int)
```

## com.perblue.rpg.game.data.social.SocialDataManager
```
public class SocialDataManager

  // Fields (17)
  private static final String LAST_CHAT_ROOM = lastChatRoom
  private static final String LAST_MESSAGE_USER_ID = lastMessageUserID
  private static final Map MAX_HISTORY
  public static final int MAX_VISIBLE_LIKES = 9999
  private Set blockedUsers
  private List chatLists
  private Set dataListeners
  private Map friends
  private List globalChat
  private List guildWallChat
  private List heroChat
  private List kingdomChat
  private long lastChatPreviewTime
  private long mostRecentChatTime
  private Map playerNameCache
  private Map pmRooms
  private List vipChat

  // Constructors (1)
  com.perblue.rpg.game.data.social.SocialDataManager()

  // Methods (51)
  private boolean canRemoveGuildChat(ClientChat, ChatType)
  public static boolean isSticky(ClientChat)
  private void checkNameUpdate(BasicUserInfo)
  private void updateName(BasicUserInfo)
  private int getLikes(Chat)
  public static int getMaxHistory(ChatRoomType)
  public static boolean isGuildOrWallChat(ClientChat)
  public static boolean isGuildWall(ClientChat)
  public static void setSticky(ClientChat, boolean)
  public void updateChat(Chat)
  public void addChat(Chat, boolean, boolean, long)
  public boolean isBlocked(long)
  public void addPMRoom(PMRoomSummary, boolean)
  public static boolean shouldShowChatAppImageLink()
  public static boolean shouldShowChatAppUpsell()
  public void clearTemporaryClientChats(UnitType)
  public String getCachedPlayerName(long)
  public long getLastChatPreviewTime()
  public boolean hasPendingFriendRequest()
  public void initializeBlockedUsers(Set)
  public void setLastChatPreviewTime(long)
  public void addPMThread(PMThread)
  public void addRulesChat()
  public boolean blockUser(long)
  public void clearChatRoom(ChatType, ChatRoomType)
  public void clearFriends()
  public void clearNewStatus(ChatRoomType, long)
  public void ensurePlayerCached(BasicUserInfo)
  public int getBlockedUserSize()
  public Collection getFriends()
  public a getLastChatRoom()
  public int getNewCount(ChatRoomType)
  public void handleHeroWall(HeroWall)
  public boolean isFriend(long)
  public void markRoomRead(ChatType, ChatRoomType)
  public void removePMRoom(long)
  public void setLastChatRoom(ChatRoomType, long)
  public void unblockUser(long)
  public static boolean shouldShowChatAppButton()
  public List getChatForRoom(ChatType, ChatRoomType)
  public void addChatAppUpsell()
  public long getNextChatTime()
  public void addChatPMHide(BasicUserInfo)
  private void removeChat(Chat, List)
  public void removeChat(long)
  public void addSocialDataListener(SocialDataListener)
  public void removeSocialDataListener(SocialDataListener)
  public Map getPMRooms()
  public Friend getFriend(long)
  public void addFriend(Friend)
  public void reset()
```

## com.perblue.rpg.game.data.sound.SoundData
```
public class SoundData

  // Fields (2)
  private Sounds sound
  private SoundType type

  // Constructors (1)
  com.perblue.rpg.game.data.sound.SoundData(Sounds, SoundType)

  // Methods (4)
  public Sounds getSound()
  public SoundType getSoundType()
  public void setSound(Sounds)
  public void setSoundType(SoundType)
```

## com.perblue.rpg.game.data.sound.SoundUtil
```
public class SoundUtil

  // Fields (4)
  public static final Map CACHED_SOUND_LOCATIONS
  private static Log LOG
  public static final Map SOUND_HIT_DATA
  private static final Map UNIT_MAPPING

  // Constructors (1)
  com.perblue.rpg.game.data.sound.SoundUtil()

  // Methods (12)
  private static void handleSoundEventDefault(Entity, Event)
  public static AnimationStateListener getBaseSound(EnvEntity)
  public static AnimationStateListener getBaseSound(Projectile)
  public static AnimationStateListener getBaseSound(Unit)
  public static AnimationStateListener getBaseSound(Entity)
  public static float getProbability(String, boolean)
  private static void requireUnitSounds(Unit, BaseScreen)
  private static void requireUnitSounds(UnitData, BaseScreen)
  private static void requireUnitSounds(UnitType, BaseScreen)
  public static float getVolume(String, boolean)
  public static void loadRaidInstance(RaidInstance, BaseScreen)
```

## com.perblue.rpg.game.data.titantemple.TitanTempleStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.tutorial.TutorialStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.AbyssDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.AncientDwarfStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.AngelDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.AngelicHeraldStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.AquaticManStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.BansheeStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.BardbarianStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.BaseUnitStats
```
public abstract class BaseUnitStats extends com.perblue.rpg.game.data.BaseStats

  // Fields (4)
  public final float[] AGILITY
  public final float[] INTELLECT
  public final float[] STRENGTH
  private final EnumSet columns

  // Constructors (2)
  com.perblue.rpg.game.data.unit.BaseUnitStats(String, String, EnumSet)
  com.perblue.rpg.game.data.unit.BaseUnitStats()

  // Methods (2)
  protected void saveStat(int, Col, String)
```

## com.perblue.rpg.game.data.unit.BlackWingStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.BoneDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.BrozerkerStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.BulwarkAngelStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.BurntOneStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.CatapultKnightStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.CentaurOfAttentionStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.ClawManStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.CosmicElfStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.CrimsonWitchStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.CursedStatueStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.CyclopsWizardStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DarkDraculStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DarkHeroStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DarkHorseStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DeepDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DemonTotemStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DiggerMoleStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DoppelgangerStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DragonLadyStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DragonSlayerStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DragzillaStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DruidinatrixStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DungeonManStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DustDevilStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.DwarvenArcherStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.ElectroyetiStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.EternalEnchanterStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.FaithHealerStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.ForgottenDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.FrostGiantStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.GeneralUnitStats [ERROR: NoClassDefFoundError: Could not initialize class com.perblue.rpg.game.data.unit.GeneralUnitStats]

## com.perblue.rpg.game.data.unit.GenieStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.GrandHuntressStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.GreedDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.GroovyDruidStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.HydraStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.KaraokeKingStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.KrakenKingStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.LastDefenderStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.MagicDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.MedusaStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.MinotaurStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.MistressManicureStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.MoonDrakeStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.NinjaDwarfStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.OrcMonkStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.PchAnubisDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.PirateStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.PlagueEntrepreneurStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.PlantSoulStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.PolemasterStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.ProjectileStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.RabidDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.RagingRevenantStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.RollerWarriorStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.SadisticDancerStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.SatyrStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.SavageCutieStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.ShadowAssassinStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.ShadowofSvenStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.SilentSpiritStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.SkeletonKingStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.SnapDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.SnapperBoneStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.SniperWolfStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.SojournerSorceressStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.SpectralDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.SpiderQueenStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.SpikeyDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.StepladderBrothersStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.StormDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.StowawayStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.SunSeekerStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.TombAngelStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.TripleThreatStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.UmlautTheFirstStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.UnicorgiStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.UnitStats [ERROR: NoClassDefFoundError: Could not initialize class com.perblue.rpg.game.data.unit.UnitStats]

## com.perblue.rpg.game.data.unit.UnitStatsMath
```
public class UnitStatsMath

  // Fields (7)
  public static final USMConfig CONFIG_ALL
  public static final USMConfig CONFIG_CURRENT_ENCHANTING
  public static final USMConfig CONFIG_CURRENT_GEAR_ONLY
  public static final USMConfig CONFIG_GROWTH_ONLY
  public static final USMConfig CONFIG_GROWTH_ONLY_NO_RUNES
  public static final USMConfig CONFIG_NO_RUNES
  private static ac contextPool

  // Constructors (1)
  com.perblue.rpg.game.data.unit.UnitStatsMath()

  // Methods (13)
  private static float getRunesSetBonusPercentages(IHero, StatType)
  private static float getRunesStatAdditions(IHero, StatType, boolean)
  private static float getRunesSetBonusAdditions(IHero, StatType)
  private static float getRunesStatMultiplications(IHero, StatType, boolean)
  private static float getAdditive(IHero, StatType, USMConfig, CacheContext)
  private static float getCoreDerivatives(IHero, StatType, USMConfig, CacheContext)
  private static float getGrowth(IHero, StatType, USMConfig)
  private static float getMultiplicitive(IHero, StatType, USMConfig)
  public static float getStat(IHero, StatType, USMConfig)
  private static float getStat(IHero, StatType, USMConfig, CacheContext)
  private static float getSkillsStat(IHero, StatType)
  private static float getCurrentGearStat(IHero, StatType, USMConfig)
  public static void getStats(IHero, x, USMConfig)
```

## com.perblue.rpg.game.data.unit.UnripeMythologyStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.UnstableUnderstudyStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.VermilionPriestessStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.VileBileStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.VoidWyvernStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.VultureDragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.WeeWitchStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.WeredragonStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.WhiteTigerStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.WhiteTigressStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.ZombieSquireStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.AbyssDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.AncientDwarfGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.AngelDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.AngelicHeraldGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.AquaticManGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.BansheeGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.BardbarianGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.BaseHeroGearStats
```
public class BaseHeroGearStats extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  protected Map gear

  // Constructors (2)
  com.perblue.rpg.game.data.unit.gear.BaseHeroGearStats(String)
  com.perblue.rpg.game.data.unit.gear.BaseHeroGearStats()

  // Methods (8)
  public Iterable getGear(Rarity)
  protected void initStats(int, int)
  protected void saveStat(Rarity, HeroEquipSlot, String)
  protected void onMissingRow(String, Rarity)
  public ItemType getItem(Rarity, HeroEquipSlot)
  public Iterable getItems(Rarity)
```

## com.perblue.rpg.game.data.unit.gear.BlackWingGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.BoneDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.BrozerkerGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.BulwarkAngelGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.BurntOneGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.CatapultKnightGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.CentaurOfAttentionGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.ClawManGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.CosmicElfGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.CrimsonWitchGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.CursedStatueGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.CyclopsWizardGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DarkDraculGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DarkHeroGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DarkHorseGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DeepDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DemonTotemGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DiggerMoleGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DoppelgangerGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DragonLadyGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DragonSlayerGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DragzillaGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DruidinatrixGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DungeonManGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DustDevilGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.DwarvenArcherGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.ElectroyetiGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.EternalEnchanterGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.FaithHealerGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.ForgottenDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.FrostGiantGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.GenieGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.GrandHuntressGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.GreedDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.GroovyDruidGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.HydraGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.KaraokeKingGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.KrakenKingGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.LastDefenderGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.MagicDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.MedusaGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.MinotaurGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.MistressManicureGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.MoonDrakeGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.NinjaDwarfGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.OrcMonkGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.PchAnubisDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.PirateGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.PlagueEntrepreneurGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.PlantSoulGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.PolemasterGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.RabidDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.RagingRevenantGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.RollerWarriorGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.SadisticDancerGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.SatyrGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.SavageCutieGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.ShadowAssassinGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.ShadowofSvenGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.SilentSpiritGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.SkeletonKingGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.SnapDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.SnapperBoneGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.SniperWolfGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.SojournerSorceressGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.SpectralDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.SpiderQueenGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.SpikeyDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.StepladderBrothersGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.StormDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.StowawayGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.SunSeekerGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.TombAngelGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.TripleThreatGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.UmlautTheFirstGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.UnicorgiGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.UnripeMythologyGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.UnstableUnderstudyGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.VermilionPriestessGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.VileBileGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.VoidWyvernGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.VultureDragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.WeeWitchGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.WeredragonGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.WhiteTigerGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.WhiteTigressGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.gear.ZombieSquireGearStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.skill.BaseSkillsStats
```
public abstract class BaseSkillsStats extends com.perblue.rpg.game.data.BaseStats

  // Fields (1)
  private final EnumSet columns

  // Constructors (2)
  com.perblue.rpg.game.data.unit.skill.BaseSkillsStats(String, String, EnumSet)
  com.perblue.rpg.game.data.unit.skill.BaseSkillsStats()

  // Methods (2)
  protected void saveStat(int, Col, String)
```

## com.perblue.rpg.game.data.unit.skill.GeneralSkillStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.unit.skill.SkillStats [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.data.war.GuildWarStats [ERROR: NoClassDefFoundError: Could not initialize class com.perblue.rpg.game.data.chest.GeneralGearDropTableStats]

## com.perblue.rpg.game.data.war.StatEffectType
```
public final enum StatEffectType extends java.lang.Enum

  // Fields (5)
  private static final StatEffectType[] $VALUES
  public static final StatEffectType FLAT
  public static final StatEffectType GROWTH
  public static final StatEffectType PERCENT
  public static final StatEffectType SET

  // Constructors (1)
  com.perblue.rpg.game.data.war.StatEffectType(String, int)

  // Methods (2)
  public static StatEffectType[] values()
  public static StatEffectType valueOf(String)
```

## com.perblue.rpg.game.data.war.TagColor
```
public final enum TagColor extends java.lang.Enum

  // Fields (4)
  private static final TagColor[] $VALUES
  public static final TagColor GREEN
  public static final TagColor RED
  public static final TagColor WHITE

  // Constructors (1)
  com.perblue.rpg.game.data.war.TagColor(String, int)

  // Methods (2)
  public static TagColor[] values()
  public static TagColor valueOf(String)
```

## com.perblue.rpg.game.data.war.WarModifierData
```
public class WarModifierData

  // Fields (10)
  private TagColor attackerColor
  private TagColor defenderColor
  private StatType effect
  private float effectAmount
  private long effectDuration
  private a effectTags
  private StatEffectType effectType
  private a effectUnit
  private HeroTag iconTag
  private WarModifierType type

  // Constructors (1)
  com.perblue.rpg.game.data.war.WarModifierData(WarModifierType)

  // Methods (25)
  public StatEffectType getEffectType()
  public StatType getEffect()
  public float getEffectAmount()
  public a getEffectTags()
  public a getEffectUnit()
  public TagColor getAttackerColor()
  public TagColor getDefenderColor()
  public HeroTag getIconTag()
  public boolean matchesTag(UnitData, int)
  public void setAttackerColor(TagColor)
  public void setDefenderColor(TagColor)
  public void setEffect(StatType)
  public void setEffectTags(a)
  public void setIconTag(HeroTag)
  public long getEffectDuration()
  public static boolean matchesUnit(Unit, WarModifierData)
  public void initializeOnUnit(Unit)
  public void setEffectType(StatEffectType)
  public void setEffectAmount(float)
  public void setEffectDuration(long)
  public void setEffectUnit(a)
  public void setType(WarModifierType)
  private static boolean matches(UnitData, int, a)
  private static boolean matches(UnitData, int, UnitSet)
  public WarModifierType getType()
```

## com.perblue.rpg.game.data.war.WarModifierSetType
```
public final enum WarModifierSetType extends java.lang.Enum

  // Fields (23)
  private static final WarModifierSetType[] $VALUES
  public static final WarModifierSetType AN_APPLE_A_DAY
  public static final WarModifierSetType ARMOR_UP
  public static final WarModifierSetType BORING_ARGUMENT
  public static final WarModifierSetType BRAINS_OVER_BRAWN
  public static final WarModifierSetType CLEAN_ENERGY
  public static final WarModifierSetType DRAGON_WAGON
  public static final WarModifierSetType HIGH_NOON
  public static final WarModifierSetType HORROR_FLICK_SPECIAL
  public static final WarModifierSetType IRON_ARMOR
  public static final WarModifierSetType LEVEL_1
  public static final WarModifierSetType NONE
  public static final WarModifierSetType POINTY_THINGS
  public static final WarModifierSetType POMPEII
  public static final WarModifierSetType RAINY_DAY
  public static final WarModifierSetType RIP
  public static final WarModifierSetType SHARP_OBJECTS
  public static final WarModifierSetType STEROIDS
  public static final WarModifierSetType THE_HUNT
  public static final WarModifierSetType THRIFT_SHOP
  public static final WarModifierSetType TOP_DRAGONSOUL_CHEF
  public static final WarModifierSetType TOXIC_DARTS
  public static final WarModifierSetType WISDOM_KILLS

  // Constructors (1)
  com.perblue.rpg.game.data.war.WarModifierSetType(String, int)

  // Methods (2)
  public static WarModifierSetType[] values()
  public static WarModifierSetType valueOf(String)
```

## com.perblue.rpg.game.data.war.WarModifierType
```
public final enum WarModifierType extends java.lang.Enum

  // Fields (42)
  private static final WarModifierType[] $VALUES
  public static final WarModifierType ACHILLES_HEEL
  public static final WarModifierType ARMOR_PIERCER
  public static final WarModifierType BLACK_DEATH
  public static final WarModifierType BOOK_OF_DRAGONS
  public static final WarModifierType BOOK_OF_TESLA
  public static final WarModifierType BRAINS_OVER_BRAWN
  public static final WarModifierType CHAIN_MAIL
  public static final WarModifierType DRAGON_SLAYER
  public static final WarModifierType DRUGS
  public static final WarModifierType DULL_POINT
  public static final WarModifierType DUMB_PROTAGONISTS
  public static final WarModifierType EASY_PICKINGS
  public static final WarModifierType ENHANCED_CONDUCTIVITY
  public static final WarModifierType FAITH
  public static final WarModifierType FRIED_UP
  public static final WarModifierType HEAVY_AMMO
  public static final WarModifierType HYDRATION
  public static final WarModifierType IRON_PROTECTION
  public static final WarModifierType JUICED
  public static final WarModifierType LONG_DAY
  public static final WarModifierType MASTER_OF_DEATH
  public static final WarModifierType MASTER_OF_THE_SEA
  public static final WarModifierType NOOBS
  public static final WarModifierType NO_PAIN_NO_GAIN
  public static final WarModifierType OLD_AMMO
  public static final WarModifierType PACIFIST
  public static final WarModifierType PIERCED_TONGUE
  public static final WarModifierType POT_SMASH
  public static final WarModifierType QUICK_DRAW
  public static final WarModifierType SLASHER
  public static final WarModifierType SLICE_AND_DICE
  public static final WarModifierType SMART_SHOPPERS
  public static final WarModifierType STEALBACK
  public static final WarModifierType SUNNY_DAY
  public static final WarModifierType TAMER_OF_FIRE
  public static final WarModifierType TENDER_MEAT
  public static final WarModifierType THROMBOCYTOPENIA
  public static final WarModifierType TOXIC_DARTS
  public static final WarModifierType UNFOCUSED
  public static final WarModifierType VAMPIRESOUL
  public static final WarModifierType XL_OUT_OF_STOCK

  // Constructors (1)
  com.perblue.rpg.game.data.war.WarModifierType(String, int)

  // Methods (2)
  public static WarModifierType[] values()
  public static WarModifierType valueOf(String)
```

## com.perblue.rpg.game.event.BattleOverEvent
```
public class BattleOverEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Constructors (1)
  com.perblue.rpg.game.event.BattleOverEvent()

  // Methods (1)
  public void reset()
```

## com.perblue.rpg.game.event.BirthdayRewardEvent
```
public class BirthdayRewardEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Fields (2)
  private int points
  private RewardDrop reward

  // Constructors (1)
  com.perblue.rpg.game.event.BirthdayRewardEvent()

  // Methods (4)
  public RewardDrop getReward()
  public int getPoints()
  public void reset()
   void reset(RewardDrop, int)
```

## com.perblue.rpg.game.event.BuffAddedEvent
```
public class BuffAddedEvent extends com.perblue.rpg.game.event.TargetedEvent

  // Fields (1)
  private IBuff buff

  // Constructors (1)
  com.perblue.rpg.game.event.BuffAddedEvent()

  // Methods (3)
  public IBuff getBuff()
  public void setBuff(IBuff)
  public void reset()
```

## com.perblue.rpg.game.event.BuffUpdatedEvent
```
public class BuffUpdatedEvent extends com.perblue.rpg.game.event.TargetedEvent

  // Fields (3)
  private IBuff buff
   boolean removed
  private long timeLeft

  // Constructors (1)
  com.perblue.rpg.game.event.BuffUpdatedEvent()

  // Methods (7)
  public IBuff getBuff()
  public void setBuff(IBuff)
  public void setRemoved(boolean)
  public void setTimeLeft(long)
  public boolean wasRemoved()
  public long getTimeLeft()
  public void reset()
```

## com.perblue.rpg.game.event.ContestsUpdateEvent
```
public class ContestsUpdateEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Constructors (1)
  com.perblue.rpg.game.event.ContestsUpdateEvent()

  // Methods (1)
  public void reset()
```

## com.perblue.rpg.game.event.CritEvent
```
public class CritEvent extends com.perblue.rpg.game.event.Event

  // Fields (5)
  private float critChance
  private DamageSource damageSource
  private boolean didCrit
  private Entity source
  private Entity target

  // Constructors (1)
  com.perblue.rpg.game.event.CritEvent(Entity, Entity, DamageSource, float, boolean)

  // Methods (7)
  public float getCritChance()
  public Entity getSoruce()
  public boolean isDidCrit()
  public Object getEventSource()
  public DamageSource getDamageSource()
  public Entity getTarget()
  public void reset()
```

## com.perblue.rpg.game.event.EntityAlphaEvent
```
public class EntityAlphaEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (2)
  private float alpha
  private float duration

  // Constructors (1)
  com.perblue.rpg.game.event.EntityAlphaEvent()

  // Methods (4)
  public float getAlpha()
  public void setAlpha(float)
  public void setDuration(float)
  public float getDuration()
```

## com.perblue.rpg.game.event.EntityAttackEvent
```
public class EntityAttackEvent extends com.perblue.rpg.game.event.Event

  // Fields (3)
  protected IEntity attacker
  protected final boolean attackerIsSource
  protected IEntity target

  // Constructors (1)
  com.perblue.rpg.game.event.EntityAttackEvent(boolean)

  // Methods (6)
  public Object getEventSource()
  public void setAttacker(IEntity)
  public IEntity getAttacker()
  public IEntity getTarget()
  public void setTarget(IEntity)
  public void reset()
```

## com.perblue.rpg.game.event.EntityColorEvent
```
public class EntityColorEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (1)
  private b color

  // Constructors (1)
  com.perblue.rpg.game.event.EntityColorEvent()

  // Methods (2)
  public b getColor()
  public void setColor(b)
```

## com.perblue.rpg.game.event.EntityDamageEvent
```
public class EntityDamageEvent extends com.perblue.rpg.game.event.EntityAttackEvent

  // Fields (7)
  private float damage
## com.perblue.rpg.game.event.EntityDamageEvent [ERROR: IncompatibleClassChangeError: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$DamageSubType disagree on InnerClasses attribute]

## com.perblue.rpg.game.event.EntityDeathEvent
```
public class EntityDeathEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (1)
  private float damageDone

  // Constructors (1)
  com.perblue.rpg.game.event.EntityDeathEvent()

  // Methods (2)
  public void setDamageDone(float)
  public float getDamageDone()
```

## com.perblue.rpg.game.event.EntityDestroyedEvent
```
public class EntityDestroyedEvent extends com.perblue.rpg.game.event.EntityAttackEvent

  // Constructors (1)
  com.perblue.rpg.game.event.EntityDestroyedEvent()
```

## com.perblue.rpg.game.event.EntityEnergyChangeEvent
```
public class EntityEnergyChangeEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (2)
  private float energyChange
  private boolean shouldAnimate

  // Constructors (1)
  com.perblue.rpg.game.event.EntityEnergyChangeEvent()

  // Methods (5)
  public boolean shouldAnimate()
  public float getEnergyChange()
  public void setEnergyChange(float)
  public EntityEnergyChangeEvent setShouldAnimate(boolean)
  public void reset()
```

## com.perblue.rpg.game.event.EntityEvent
```
public class EntityEvent extends com.perblue.rpg.game.event.Event

  // Fields (1)
  protected Entity source

  // Constructors (2)
  com.perblue.rpg.game.event.EntityEvent(Entity)
  com.perblue.rpg.game.event.EntityEvent()

  // Methods (4)
  public Object getEventSource()
  public void setSource(Entity)
  public Entity getSource()
  public void reset()
```

## com.perblue.rpg.game.event.EntityHPChangeEvent
```
public class EntityHPChangeEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (2)
  private float damageDone
  private String message

  // Constructors (1)
  com.perblue.rpg.game.event.EntityHPChangeEvent()

  // Methods (5)
  public void setDamageDone(float)
  public void setMessage(String)
  public float getDamageDone()
  public String getMessage()
  public void reset()
```

## com.perblue.rpg.game.event.EntityHealEvent
```
public class EntityHealEvent extends com.perblue.rpg.game.event.EntityAttackEvent

  // Fields (4)
## com.perblue.rpg.game.event.EntityHealEvent [ERROR: IncompatibleClassChangeError: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$DamageSourceType disagree on InnerClasses attribute]

## com.perblue.rpg.game.event.EntityHitEvent
```
public class EntityHitEvent extends com.perblue.rpg.game.event.EntityEvent

  // Constructors (1)
  com.perblue.rpg.game.event.EntityHitEvent()
```

## com.perblue.rpg.game.event.EntityKnockbackEvent
```
public class EntityKnockbackEvent extends com.perblue.rpg.game.event.EntityAttackEvent

  // Fields (1)
  private float distance

  // Constructors (1)
  com.perblue.rpg.game.event.EntityKnockbackEvent()

  // Methods (3)
  public void setDistance(float)
  public float getDistance()
  public void reset()
```

## com.perblue.rpg.game.event.EntityPlaySoundEvent
```
public class EntityPlaySoundEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (2)
  private String soundName
  private float volume

  // Constructors (1)
  com.perblue.rpg.game.event.EntityPlaySoundEvent()

  // Methods (5)
  public String getSoundName()
  public float getVolume()
  public void setSoundName(String)
  public void setVolume(float)
  public void reset()
```

## com.perblue.rpg.game.event.EntityRemovedEvent
```
public class EntityRemovedEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (1)
  protected boolean isReload

  // Constructors (1)
  com.perblue.rpg.game.event.EntityRemovedEvent()

  // Methods (2)
  public boolean isReload()
  public void reset()
```

## com.perblue.rpg.game.event.EntityReviveEvent
```
public class EntityReviveEvent extends com.perblue.rpg.game.event.EntityEvent

  // Constructors (1)
  com.perblue.rpg.game.event.EntityReviveEvent()
```

## com.perblue.rpg.game.event.EntityScaleChangedEvent
```
public class EntityScaleChangedEvent extends com.perblue.rpg.game.event.EntityEvent

  // Constructors (1)
  com.perblue.rpg.game.event.EntityScaleChangedEvent()
```

## com.perblue.rpg.game.event.EntitySpawnParticleEvent
```
public class EntitySpawnParticleEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (2)
  private long duration
  private ParticleType type

  // Constructors (1)
  com.perblue.rpg.game.event.EntitySpawnParticleEvent()

  // Methods (5)
  public void setType(ParticleType)
  public void setDuration(long)
  public long getDuration()
  public ParticleType getType()
  public void reset()
```

## com.perblue.rpg.game.event.EntityStopSoundsEvent
```
public class EntityStopSoundsEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (1)
  private boolean fadeOut

  // Constructors (1)
  com.perblue.rpg.game.event.EntityStopSoundsEvent()

  // Methods (3)
  public boolean isFadeOut()
  public void setFadeOut(boolean)
  public void reset()
```

## com.perblue.rpg.game.event.Event
```
public abstract class Event implements com.badlogic.gdx.utils.ac$a

  // Fields (1)
  private ac pool

  // Constructors (1)
  com.perblue.rpg.game.event.Event()

  // Methods (3)
  public abstract Object getEventSource()
  public void setPool(ac)
  public void free()
```

## com.perblue.rpg.game.event.EventHelper
```
public abstract class EventHelper

  // Fields (5)
  private static final List EVENTS
  private static final Map LISTENERS_BY_EVENT_TYPE
  private static final Map LISTENERS_BY_ID
  private static final Map SOURCE_LISTENERS
  private static boolean inTransaction

  // Constructors (1)
  com.perblue.rpg.game.event.EventHelper()

  // Methods (17)
  private static al getSourceListenerArray(Class, Object, boolean)
  private static void dispatchEventInternal(Event)
  public static void dispatchImmediateEvent(Event)
  public static void printSourceListeners()
  public static void removeAllSourceEventListeners(Object)
  public static void clearAll()
  private static void printListeners(Map)
  public static EventListener addSourceEventListener(Class, Object, EventListener)
  public static void removeSourceEventListener(Object, EventListener)
  public static void revertTransaction()
  public static void commitTransaction()
  public static void beginTransaction()
  public static void dispatchEvent(Event)
  public static void addEventListener(Class, EventListener)
  public static void addEventListener(String, Class, EventListener)
  public static void removeEventListener(String, Class)
  public static void removeEventListener(Class, EventListener)
```

## com.perblue.rpg.game.event.EventListener
```
public abstract interface interface EventListener

  // Methods (1)
  public abstract void onEvent(Event)
```

## com.perblue.rpg.game.event.EventPool
```
public class EventPool

  // Fields (2)
  private static Log LOG
  public static boolean server

  // Constructors (1)
  com.perblue.rpg.game.event.EventPool()

  // Methods (59)
  public static MimeHushSoundsEvent createMimeHushSoundsEvent(float, float)
  public static MimeResetSoundsEvent createMimeResetSoundsEvent()
  public static ProjectileLandEvent createProjectileLandEvent(Projectile, Entity)
  public static EntitySpawnParticleEvent createEntityParticleEvent(Entity, ParticleType)
  public static EntitySpawnParticleEvent createEntityParticleEvent(Entity, ParticleType, long)
  public static EntitySpawnParticleEvent createEntityParticleEvent(Entity, ParticleType, boolean)
  public static EntityRemovedEvent createEntityRemovedEvent(Entity)
  public static RankingDataChangeEvent createRankingDataChangeEvent(RankType)
  public static ShadowFadeEvent createShadowFadeEvent(Unit, float, float)
  public static ShowEnergyChangeEvent createShowEnergyChangeEvent(Entity, float, CombatSkill)
  public static ShowEntityDodgeEvent createShowEntityDodgeEvent(Entity, CombatSkill)
  public static SpecialEventsChangeEvent createSpecialEventsChangeEvent()
  public static StopAllSoundsEvent createStopAllSoundsEvent()
  public static TempleUpdateEvent createTempleUpdateEvent(Entity, float, float)
  public static UnitViewCounterEvent createUnitViewCounterEvent(Entity, int)
  public static UnitViewIconEvent createUnitViewIconEvent(Unit)
  public static BirthdayRewardEvent createBirthdayEvent(RewardDrop, int)
  public static ContestsUpdateEvent createContestsUpdateEvent()
  public static EntityAlphaEvent createEntityAlphaEvent(Entity, float, float)
  public static EntityColorEvent createEntityColorEvent(Entity, b)
## com.perblue.rpg.game.event.EventPool [ERROR: IncompatibleClassChangeError: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$DamageSourceType disagree on InnerClasses attribute]

## com.perblue.rpg.game.event.ForceFullEnergy
```
public class ForceFullEnergy extends com.perblue.rpg.game.event.Event

  // Fields (1)
  private UnitType heroType

  // Constructors (1)
  com.perblue.rpg.game.event.ForceFullEnergy(UnitType)

  // Methods (3)
  public UnitType getHeroType()
  public Object getEventSource()
  public void reset()
```

## com.perblue.rpg.game.event.GlobalEvent
```
public abstract class GlobalEvent extends com.perblue.rpg.game.event.Event

  // Constructors (1)
  com.perblue.rpg.game.event.GlobalEvent()

  // Methods (1)
  public Object getEventSource()
```

## com.perblue.rpg.game.event.HeroesForHireUpdateEvent
```
public class HeroesForHireUpdateEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Fields (1)
  private HeroesForHire heroesForHire

  // Constructors (1)
  com.perblue.rpg.game.event.HeroesForHireUpdateEvent(HeroesForHire)

  // Methods (2)
  public HeroesForHire getHeroesForHire()
  public void reset()
```

## com.perblue.rpg.game.event.LegendaryQuestCompletedEvent
```
public class LegendaryQuestCompletedEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Fields (4)
  private UnitType hero
  private int questID
  private boolean unlockedSkill
  private IUser user

  // Constructors (1)
  com.perblue.rpg.game.event.LegendaryQuestCompletedEvent(IUser, int, UnitType, boolean)

  // Methods (5)
  public boolean unlockedSkill()
  public int getQuestID()
  public IUser getUser()
  public UnitType getHero()
  public void reset()
```

## com.perblue.rpg.game.event.LegendaryQuestDataEvent
```
public class LegendaryQuestDataEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (2)
  private int count
  private String dataType

  // Constructors (1)
  com.perblue.rpg.game.event.LegendaryQuestDataEvent()

  // Methods (5)
  public LegendaryQuestDataEvent setDataType(String)
  public String getDataType()
  public LegendaryQuestDataEvent setCount(int)
  public int getCount()
  public void reset()
```

## com.perblue.rpg.game.event.MerchantFoundEvent
```
public class MerchantFoundEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Fields (2)
  private MerchantType type
  private IUser user

  // Constructors (1)
  com.perblue.rpg.game.event.MerchantFoundEvent(MerchantType, IUser)

  // Methods (3)
  public IUser getUser()
  public MerchantType getType()
  public void reset()
```

## com.perblue.rpg.game.event.MerchantRefreshedEvent
```
public class MerchantRefreshedEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Fields (1)
  private MerchantType type

  // Constructors (1)
  com.perblue.rpg.game.event.MerchantRefreshedEvent()

  // Methods (3)
  public void setType(MerchantType)
  public MerchantType getType()
  public void reset()
```

## com.perblue.rpg.game.event.MimeHushSoundsEvent
```
public class MimeHushSoundsEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Fields (2)
  private float effectReduction
  private float musicReduction

  // Constructors (1)
  com.perblue.rpg.game.event.MimeHushSoundsEvent()

  // Methods (5)
  public void setEffectReduction(float)
  public void setMusicReduction(float)
  public float getEffectReduction()
  public float getMusicReduction()
  public void reset()
```

## com.perblue.rpg.game.event.MimeResetSoundsEvent
```
public class MimeResetSoundsEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Constructors (1)
  com.perblue.rpg.game.event.MimeResetSoundsEvent()

  // Methods (1)
  public void reset()
```

## com.perblue.rpg.game.event.NextStageEvent
```
public class NextStageEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Constructors (1)
  com.perblue.rpg.game.event.NextStageEvent()

  // Methods (1)
  public void reset()
```

## com.perblue.rpg.game.event.PauseCombatEvent
```
public class PauseCombatEvent extends com.perblue.rpg.game.event.Event

  // Constructors (1)
  com.perblue.rpg.game.event.PauseCombatEvent()

  // Methods (2)
  public Object getEventSource()
  public void reset()
```

## com.perblue.rpg.game.event.PauseEntitySoundsEvent
```
public class PauseEntitySoundsEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Constructors (1)
  com.perblue.rpg.game.event.PauseEntitySoundsEvent()

  // Methods (1)
  public void reset()
```

## com.perblue.rpg.game.event.ProjectileLandEvent
```
public class ProjectileLandEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (1)
  private Entity targetObj

  // Constructors (1)
  com.perblue.rpg.game.event.ProjectileLandEvent()

  // Methods (3)
  public void setTargetObj(Entity)
  public Entity getTargetObj()
  public void reset()
```

## com.perblue.rpg.game.event.RankingDataChangeEvent
```
public class RankingDataChangeEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Fields (1)
  private RankType type

  // Constructors (1)
  com.perblue.rpg.game.event.RankingDataChangeEvent()

  // Methods (3)
  public void setType(RankType)
  public RankType getType()
  public void reset()
```

## com.perblue.rpg.game.event.ResumeCombatEvent
```
public class ResumeCombatEvent extends com.perblue.rpg.game.event.Event

  // Constructors (1)
  com.perblue.rpg.game.event.ResumeCombatEvent()

  // Methods (2)
  public Object getEventSource()
  public void reset()
```

## com.perblue.rpg.game.event.ResumeEntitySoundsEvent
```
public class ResumeEntitySoundsEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Constructors (1)
  com.perblue.rpg.game.event.ResumeEntitySoundsEvent()

  // Methods (1)
  public void reset()
```

## com.perblue.rpg.game.event.RuneEvent
```
public class RuneEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Fields (2)
  private IRune rune
  private RuneEventType type

  // Constructors (1)
  com.perblue.rpg.game.event.RuneEvent()

  // Methods (5)
  public void setRuneEventType(RuneEventType)
  public RuneEventType getRuneEventType()
  public void setRune(IRune)
  public IRune getRune()
  public void reset()
```

## com.perblue.rpg.game.event.ShadowFadeEvent
```
public class ShadowFadeEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (2)
  private float alpha
  private float duration

  // Constructors (1)
  com.perblue.rpg.game.event.ShadowFadeEvent()

  // Methods (4)
  public float getAlpha()
  public void setAlpha(float)
  public void setDuration(float)
  public float getDuration()
```

## com.perblue.rpg.game.event.ShowCombatTextEvent
```
public class ShowCombatTextEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (2)
  private String text
  private CombatTextType textType

  // Constructors (1)
  com.perblue.rpg.game.event.ShowCombatTextEvent()

  // Methods (5)
  public CombatTextType getTextType()
  public void setTextType(CombatTextType)
  public String getText()
  public void setText(String)
  public void reset()
```

## com.perblue.rpg.game.event.ShowEnergyChangeEvent
```
public class ShowEnergyChangeEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (2)
  private float energyChange
  private CombatSkill sourceSkill

  // Constructors (1)
  com.perblue.rpg.game.event.ShowEnergyChangeEvent()

  // Methods (5)
  public float getEnergyChange()
  public void setEnergyChange(float)
  public void setSourceSkill(CombatSkill)
  public CombatSkill getSourceSkill()
  public void reset()
```

## com.perblue.rpg.game.event.ShowEntityDodgeEvent
```
public class ShowEntityDodgeEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (1)
  private CombatSkill sourceSkill

  // Constructors (1)
  com.perblue.rpg.game.event.ShowEntityDodgeEvent()

  // Methods (3)
  public void setSourceSkill(CombatSkill)
  public CombatSkill getSourceSkill()
  public void reset()
```

## com.perblue.rpg.game.event.ShowEntityHealEvent
```
public class ShowEntityHealEvent extends com.perblue.rpg.game.event.EntityAttackEvent

  // Fields (3)
  private float healAmount
  private q hitPosition
  private CombatSkill skillSource

  // Constructors (1)
  com.perblue.rpg.game.event.ShowEntityHealEvent()

  // Methods (7)
  public CombatSkill getSkillSource()
  public void setHitPosition(q)
  public void setSkillSource(CombatSkill)
  public float getHealAmount()
  public q getHitPosition()
  public void setHealAmount(float)
  public void reset()
```

## com.perblue.rpg.game.event.SkillStatusChangeEvent
```
public class SkillStatusChangeEvent extends com.perblue.rpg.game.event.TargetedEvent

  // Fields (2)
  private CombatSkill skill
  private SkillStatusChangeType type

  // Constructors (1)
  com.perblue.rpg.game.event.SkillStatusChangeEvent()

  // Methods (5)
  public void setStatusChangeType(SkillStatusChangeType)
  public void setSkill(CombatSkill)
  public SkillStatusChangeType getStatusChangeType()
  public CombatSkill getSkill()
  public void reset()
```

## com.perblue.rpg.game.event.SpawnParticleEvent
```
public class SpawnParticleEvent extends com.perblue.rpg.game.event.TargetedEvent

  // Fields (8)
  private long duration
  private boolean flipX
  private Bone followBone
  private Entity followEntity
  private float scale
  private Direction sourceDir
  private q sourceLoc
  private ParticleType type

  // Constructors (1)
  com.perblue.rpg.game.event.SpawnParticleEvent()

  // Methods (16)
  public SpawnParticleEvent setScale(float)
  public float getScale()
  public Bone getFollowBone()
  public Entity getFollowEntity()
  public Direction getSourceDirection()
  public q getSourceLoc()
  public boolean isFlipX()
  public SpawnParticleEvent setFlipX(boolean)
  public SpawnParticleEvent setFollow(Entity, Bone)
  public SpawnParticleEvent setSourceDirection(Direction)
  public SpawnParticleEvent setSourceLoc(q)
  public SpawnParticleEvent setType(ParticleType)
  public SpawnParticleEvent setDuration(long)
  public long getDuration()
  public ParticleType getType()
  public void reset()
```

## com.perblue.rpg.game.event.SpecialEventsChangeEvent
```
public class SpecialEventsChangeEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Constructors (1)
  com.perblue.rpg.game.event.SpecialEventsChangeEvent()

  // Methods (1)
  public void reset()
```

## com.perblue.rpg.game.event.StopAllSoundsEvent
```
public class StopAllSoundsEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Constructors (1)
  com.perblue.rpg.game.event.StopAllSoundsEvent()

  // Methods (1)
  public void reset()
```

## com.perblue.rpg.game.event.TargetedEvent
```
public class TargetedEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (2)
  private q targetLoc
  private Entity targetObj

  // Constructors (3)
  com.perblue.rpg.game.event.TargetedEvent()
  com.perblue.rpg.game.event.TargetedEvent(Entity, q)
  com.perblue.rpg.game.event.TargetedEvent(Entity, Entity)

  // Methods (5)
  public void setTargetLoc(q)
  public void setTargetObj(Entity)
  public q getTargetLoc()
  public Entity getTargetObj()
  public void reset()
```

## com.perblue.rpg.game.event.TempleUpdateEvent
```
public class TempleUpdateEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (2)
  private float colorAmount
  private float scale

  // Constructors (1)
  com.perblue.rpg.game.event.TempleUpdateEvent()

  // Methods (4)
  public void setColorAmount(float)
  public float getColorAmount()
  public void setScale(float)
  public float getScale()
```

## com.perblue.rpg.game.event.UnitStatChangeEvent
```
public class UnitStatChangeEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (3)
  private String message
  private boolean showBuffedStats
  private String unitStatString

  // Constructors (1)
  com.perblue.rpg.game.event.UnitStatChangeEvent()

  // Methods (7)
  public void setShowBuffedStats(boolean)
  public void setUnitStatString(Unit)
  public boolean showBuffedStats()
  public String getUnitStatString()
  public void setMessage(String)
  public String getMessage()
  public void reset()
```

## com.perblue.rpg.game.event.UnitViewCounterEvent
```
public class UnitViewCounterEvent extends com.perblue.rpg.game.event.EntityEvent

  // Fields (1)
  private int count

  // Constructors (1)
  com.perblue.rpg.game.event.UnitViewCounterEvent()

  // Methods (3)
  public void setCount(int)
  public int getCount()
  public void reset()
```

## com.perblue.rpg.game.event.UnitViewIconEvent
```
public class UnitViewIconEvent extends com.perblue.rpg.game.event.EntityEvent

  // Constructors (1)
  com.perblue.rpg.game.event.UnitViewIconEvent()
```

## com.perblue.rpg.game.event.UserChangeEvent
```
public class UserChangeEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Fields (3)
  private int prevTeamLevel
  private UserProperty property
  private IUser user

  // Constructors (1)
  com.perblue.rpg.game.event.UserChangeEvent()

  // Methods (7)
  public int getPrevTeamLevel()
  public IUser getUser()
  public void setUser(IUser)
  public void setPrevTeamLevel(int)
  public UserProperty getProperty()
  public void setProperty(UserProperty)
  public void reset()
```

## com.perblue.rpg.game.event.WallClockEventHelper
```
public class WallClockEventHelper

  // Fields (2)
  private static boolean active
  private static int timerTaskLensLevel

  // Constructors (1)
  com.perblue.rpg.game.event.WallClockEventHelper()

  // Methods (7)
  private static void tick()
  public static void cancel()
  public static void addLens()
  public static void removeLens()
  private static void start()
  private static void stop()
```

## com.perblue.rpg.game.event.WallClockTickEvent
```
public class WallClockTickEvent extends com.perblue.rpg.game.event.GlobalEvent

  // Fields (1)
  protected long timestamp

  // Constructors (1)
  com.perblue.rpg.game.event.WallClockTickEvent()

  // Methods (4)
  public void setTime(long)
  public void setTime()
  public long getTime()
  public void reset()
```

## com.perblue.rpg.game.logic.ArenaHelper
```
public abstract class ArenaHelper

  // Fields (2)
  public static final List COLISEUM_ATTACK_LINEUPS
  public static final List COLISEUM_DEFENSE_LINEUPS

  // Constructors (1)
  com.perblue.rpg.game.logic.ArenaHelper()

  // Methods (22)
  public static VIPFeature getVIPCooldownFeature(ArenaType)
  public static CharSequence getUnlockCooldownString(ArenaType)
  public static boolean coliseumRequiresThreeWins()
  public static a getDemotionLeagueInfo(ArenaTier, int)
  public static int getNumberOfDivisions(ArenaTier)
  public static ResourceType getMerchantResource(ArenaType)
  public static CharSequence getNoMoreResetsString(ArenaType)
  public static long getPromotionDuration(ArenaTier, int, ArenaType)
  public static a getPromotionLeagueInfo(ArenaTier, int)
  public static long getPromotionEndTime(ArenaTier, int, ArenaType)
  public static CharSequence getUnlockResetString(ArenaType)
  public static boolean hasFreeAttackAvailable(IUser, ArenaType)
  public static String getChanceType(ArenaType)
  public static Unlockable getUnlockable(ArenaType)
  public static int getColiseumLineups()
  public static String getResetUseType(ArenaType)
  public static VIPFeature getVIPResetFeature(ArenaType)
  public static void giveArenaEXP(IUser, Iterable, ArenaType)
  public static CooldownType getCooldown(ArenaType)
  public static void checkArenaAttackStart(IUser, boolean, long, ArenaType)
  public static void claimArenaPromotionRewards(IUser, ArenaType)
  public static void resetArenaChances(IUser, ArenaType)
```

## com.perblue.rpg.game.logic.BossBattleCampaignHelper
```
public class BossBattleCampaignHelper

  // Fields (4)
  private static final long BOSS_BATTLE_BOSS_STAGE_MAX_DURATION = 180000
  private static final long BOSS_BATTLE_NORMAL_STAGE_MAX_DURATION = 90000
  public static final ItemType ITEM_BOSS_BATTLE_STAGE_RESET
  public static final int NUM_STAGES = 1

  // Constructors (1)
  com.perblue.rpg.game.logic.BossBattleCampaignHelper()

  // Methods (23)
  public static int getFreeResets(long, IUser)
  public static boolean isAvailable(IUser)
  public static String getFreeAdvanceDailyUseType(long)
  public static boolean autoAttackAvailable(IUser, long, int, int)
  public static long getStageMaxDuration(BossBattleInfo, int, int)
  public static String getFreeResetDailyUseType(long)
  public static Collection getLoot(BossBattleInfo, int, int)
  public static Collection getTimeBonuses(BossBattleInfo, int, List)
  public static CharSequence getChapterTitle(int, String)
  public static long getElapsedTime(BossBattleInfo, int, int, long)
  public static CampaignLevelLockStatusType getLevelLockStatus(IBossBattleData, int, int)
  public static CampaignLevel getLatestUnlockedLevel(IBossBattleData, BossBattleInfo)
  private static void giveGold(IUser, long, int, int, int)
  private static void giveLoot(IUser, long, int, int, Collection)
  private static void giveTeamXP(IUser, long, int, int, int)
  public static boolean isChapterComplete(IBossBattleData, BossBattleInfo, int)
  public static boolean isClearedStage(IBossBattleData, BossBattleInfo, int, int)
  public static boolean isLevelUnlocked(IBossBattleData, int, int)
  public static void recordOutcome(IUser, BossBattleInfo, IBossBattleData, int, int, CombatOutcome, long, HeroLineup)
  public static boolean selectChapter(long, int, IUser)
  public static int getFreeAdvances(long, IUser)
  public static boolean reset(long, BossBattleResetType, IUser)
  public static boolean advance(long, BossBattleAdvanceType, IUser)
```

## com.perblue.rpg.game.logic.BossPitHelper
```
public abstract class BossPitHelper

  // Fields (3)
  private static final List BOSS_TYPES
  public static final ModeDifficulty MAX_DIFFICULTY
  private static final long ONE_DAY = 86400000

  // Constructors (1)
  com.perblue.rpg.game.logic.BossPitHelper()

  // Methods (15)
  public static List beginRaid(IUser, UnitType, int, ModeDifficulty)
  private static boolean shouldReset(IBossPit, IUser)
  private static void doChecks(IUser, UnitType, int, ModeDifficulty)
  private static void finishAttack(IUser, UnitType, int, ModeDifficulty, CombatOutcome, Collection)
  public static String getWinKey(UnitType, int, ModeDifficulty)
  public static List recordRaidOutcome(IUser, UnitType, int, ModeDifficulty, List)
  public static int getGoldReward(UnitType, int, ModeDifficulty)
  public static boolean isTagGood(HeroTag, UnitType, int)
  public static boolean isTagRelevant(HeroTag, UnitType, int)
  public static List getBossTypes()
  private static void giveGold(IUser, UnitType, int, ModeDifficulty)
  private static void giveLoot(IUser, UnitType, int, ModeDifficulty, Collection)
  public static void recordOutcome(IUser, UnitType, int, ModeDifficulty, CombatOutcome, int, int, Collection, HeroLineup, int)
  public static void advanceStage(IUser)
  public static int getExpReward(UnitType, int, ModeDifficulty)
```

## com.perblue.rpg.game.logic.CampaignHelper
```
public class CampaignHelper

  // Fields (3)
  public static final int DURATION_BONUS_DROP_RATE = 2
  public static final int MIN_STARS_FOR_RAID = 3
  public static final int NUM_STAGES = 3

  // Constructors (1)
  com.perblue.rpg.game.logic.CampaignHelper()

  // Methods (41)
  public static long getDoubleDropEndTimeLO(IUser, CampaignType)
  public static long getDropBonusEndTimeItem(IUser, CampaignType, int)
  public static List recordRaidOutcome(IUser, CampaignType, int, int, int, Collection, GameModeMultipliers)
  public static boolean canResetLevel(IUser, int, int)
  public static boolean hasCampaignEvent(IUser)
  public static void useRaidTickets(IUser, RaidAllInformation, SpecialEventsHelperState)
  public static int useRaidTickets(IUser, CampaignType, int, int, int, SpecialEventsHelperState)
  public static RaidAllInformation getRaidAllInformation(IUser, ItemType)
  public static long getXPBonusTeamEndTime(IUser)
  public static boolean isXPBonusTeamActiveLO(IUser)
  public static long getXPBonusTeamEndTimeLO(IUser)
  public static int getXPBonusTeamMultiplierLO(IUser)
  private static int getXPBonusTeamMultiplierItem(IUser, int)
  public static long getXPBonusTeamEndTimeItem(IUser, int)
  public static int getXPBonusTeamMultiplier(IUser)
  public static boolean isXPBonusTeamActive(IUser)
  public static boolean isDropBonusDropActive(IUser, CampaignType)
  public static boolean hasEnoughStaminaForAttack(IUser)
  public static boolean isDropBonusDropActiveLO(IUser, CampaignType)
  public static boolean isXPBonusSameItemType(UseItemEventType)
  public static TimeType getItemDoubleDropStartTimeType(CampaignType)
  public static TimeType getItemDoubleDropEndTimeType(CampaignType)
  public static long getDropBonusEndTime(IUser, CampaignType)
  public static int getDropBonusMultiplierLO(IUser, CampaignType)
  private static int getDropBonusMultiplierItem(IUser, CampaignType, int)
  public static boolean isItemDoubleDropSameItemType(CampaignType, UseItemEventType)
  public static int getDropBonusMultiplier(IUser, CampaignType)
  public static int getStarsForLevel(IUser, CampaignType, int, int)
  public static GameMode getCampaignGameMode(CampaignType)
  public static boolean autoAttackAvailable(IUser, CampaignType, int, int)
  public static CampaignLevelLockStatusType getLevelLockStatus(IUser, CampaignType, int, int)
  public static CampaignLevel getLatestUnlockedLevel(IUser, CampaignType)
  private static void giveGold(IUser, CampaignType, int, int, int, GameMode, GameModeMultipliers)
  private static void giveLoot(IUser, CampaignType, int, int, GameMode, Collection, int)
  private static void giveTeamXP(IUser, CampaignType, int, int, int, GameMode, GameModeMultipliers)
  public static boolean isChapterComplete(IUser, CampaignType, int)
  public static boolean isLevelUnlocked(IUser, CampaignType, int, int)
  public static int recordOutcome(IUser, CampaignType, int, int, CombatOutcome, int, int, Collection, Collection, int, GameModeMultipliers)
  public static int getResetCost(IUser, int, int)
  public static CampaignType getCampaignType(GameMode)
  public static void resetEliteCampaignLevel(IUser, int, int)
```

## com.perblue.rpg.game.logic.CampaignLootHelper
```
public class CampaignLootHelper

  // Constructors (1)
  com.perblue.rpg.game.logic.CampaignLootHelper()

  // Methods (28)
  public static transient List addExpItems(IUser, int, String[])
  private static int calculateGoldPerUnit(UnitType, int, float)
  private static float calculateMemoryValue(IUser, ItemType, float, int)
  public static boolean gotLoot(Collection)
  public static void addPooledXP(IUser, int)
  public static int calculateGoldEarned(CampaignType, int, int, GameModeMultipliers)
  public static int calculateRaidTicketExp(IUser, CampaignType, int, int)
  public static int getGoldPerUnit(GameMode, UnitType, int, int, Rarity, boolean, GameModeMultipliers)
  public static int getGoldPerUnit(CampaignType, UnitType, int, int, Rarity, boolean, GameModeMultipliers)
  private static Collection computeExpLoot(IUser, CampaignType, GameModeMultipliers)
  private static void rollExpLoot(IUser, Collection, CampaignType, ItemType, UserValue, GameModeMultipliers)
  private static Collection computePrimaryLoot(IUser, CampaignType, int, int, GameModeMultipliers)
  private static int calculateNewLootLimit(int, Collection)
  private static float calculateRaidTicketMemoryValue(IUser, float, int)
  private static float calculateSymmetricMemoryValue(IUser, ItemType, float, float, int)
  private static int rollPrimaryLootItem(int, ItemType, float, Random)
  private static RewardDrop computeRaidTicketLoot(IUser, CampaignType, GameModeMultipliers, int)
  private static int rollRaidTicketLootItem(float, Random)
  private static Collection computeSecondaryLoot(IUser, CampaignType, int, int, GameModeMultipliers, int)
  private static int rollSecondaryLootItem(ItemType, Random)
  private static float getUnitGoldDropMultiplier(GameMode, boolean, GameModeMultipliers)
  private static void updateExtraLootMemory(IUser, Map)
  private static void updateRaidTicketLootMemory(IUser, RewardDrop)
  public static void updateMemoryUnconditional(IUser, CampaignLoot)
  public static void updateMemory(IUser, CampaignType, int, int, CampaignLoot)
  public static void updateMemory(IUser, CampaignLoot, boolean)
  public static CampaignLoot getLoot(IUser, CampaignType, int, int, GameModeMultipliers)
  private static void updateLootMemory(IUser, Collection)
```

## com.perblue.rpg.game.logic.ChallengesHelper
```
public abstract class ChallengesHelper

  // Fields (3)
  public static final r DRAGON_OPEN_DAYS
  public static final r MAGIC_OPEN_DAYS
  public static final r PHYSICAL_OPEN_DAYS

  // Constructors (1)
  com.perblue.rpg.game.logic.ChallengesHelper()

  // Methods (1)
  public static boolean hasAttacksAvailable(IUser)
```

## com.perblue.rpg.game.logic.ChestHelper
```
public class ChestHelper

  // Fields (6)
  static final boolean $assertionsDisabled = true
  private static final int CHEST_DISPLAY_PICK_SIZE = 4
  private static final AtomicReference CHEST_DROP_DATA
  private static final float DISCOUNTED_PRICE_RATIO = 0.9
  private static final Log LOG
  private static final int MAX_HERO_ITEMS_CONSIDERED_FOR_DISPLAY = 16

  // Constructors (1)
  com.perblue.rpg.game.logic.ChestHelper()

  // Methods (23)
  public static LootResults buyChests(IUser, ChestType, int, int, ItemType)
  public static UserFlag getChestFlag(ChestType, int)
  public static UserFlag getFreeChestFlag(ChestType, int)
  public static ResourceType getPurchaseCurrency(ChestType)
  public static boolean checkIfCanRollChests()
  private static int getBasePurchaseCost(ChestType, int)
  public static List getPossibleGoldChestDrops()
  private static List getPossibleGoldChestHeroes()
  private static List getPossibleGoldChestItems()
  public static long getTimeUntilNextFreeChest(IUser, ChestType)
  public static boolean hasFreeChest(IUser, ChestType)
  public static boolean hasFreeChest(IUser)
  public static int getChestChances(IUser, ChestType)
  public static boolean isGoldUnlocked(IUser)
  public static long getEndTime()
  public static int getMaxChestChances(IUser, ChestType)
  private static List getSortedHeroes(User)
  public static Boolean shouldShowRedDot(User)
  public static void setPossibleChestDrops(PossibleChestDrops)
  public static int getPurchaseCost(ChestType, int)
  public static PossibleChestDrops getPossibleChestDrops()
  public static List getSecondGoldChestHeroes()
  public static RandomSeedType getChestRandomSeed(IUser, ChestType, int)
```

## com.perblue.rpg.game.logic.CombatHelper [ERROR: NoClassDefFoundError: Could not initialize class com.perblue.rpg.game.data.misc.TeamLevelStats]

## com.perblue.rpg.game.logic.CombatResults
```
public class CombatResults

  // Fields (6)
  private a attackers
  private a defenders
  private Exception exception
  private float outcome
  private int stars
  private a timesLeft

  // Constructors (1)
  com.perblue.rpg.game.logic.CombatResults()

  // Methods (11)
  public float getOutcome()
  public void printResults()
  public void setException(Exception)
  public void setOutcome(float)
  public void setStars(int)
  public a getDefenders()
  public a getAttackers()
  public a getTimesLeft()
  public void setTimesLeft(a)
  public int getStars()
  public Exception getException()
```

## com.perblue.rpg.game.logic.ContestHelper
```
public class ContestHelper

  // Fields (5)
  static final boolean $assertionsDisabled = true
  public static final long CONTESTS_LOOKBACK = 86400000
  private static final IContestHelperExtension DEFAULT_EXTENSION
  private static IContestHelperExtension extension
  private static boolean shouldShowRedDot

  // Constructors (1)
  com.perblue.rpg.game.logic.ContestHelper()

  // Methods (22)
  public static boolean shouldShowRedDot()
  public static void setShouldShowRedDot(boolean)
  public static void tryRecordBattleWinTasks(IUser, ContestTaskType, Collection)
  public static boolean canDropItem(ContestInfo, ItemType)
  public static float getPercentileRank(String)
  public static ContestProgressRewardInfo getProgressInfo(ContestProgressRewards, int)
  public static ContestProgressRewardInfo getProgressInfo(ContestInfo, int)
  public static ContestRankRewardInfo getRankInfo(ContestInfo, int)
  public static ContestRankRewardInfo getRankInfo(ContestRankRewards, int)
  public static ContestRankRewardInfo getRankInfo(int, int, ContestInfo)
  public static boolean isAtRank(ContestRankRewardInfo, int, int)
  private static String getRankRange(ContestRankRewardInfo, ContestRankRewardInfo)
  public static String getRankRange(ContestRankRewardInfo, ContestRankRewardInfo, boolean)
  public static int getTopRank(String)
  public static boolean isTopRank(String)
  public static void tryRecordTasks(IUser, ContestTaskType, int)
  public static void tryRecordTasks(IUser, ContestTaskType, String, int)
  public static boolean isPercentileRank(String)
  public static void recordTasks(IUser, ContestInfo, ContestTaskInfo, int)
  public static void tryRecordItemTasks(IUser, ContestTaskType, ItemType, int)
  public static void setExtension(IContestHelperExtension)
```

## com.perblue.rpg.game.logic.CryptRaidHelper
```
public abstract class CryptRaidHelper

  // Fields (9)
  public static final long DAY = 86400000
  public static final int[] MAX_ATTACKS
  public static final int MAX_ATTACKS_PER_PLAYER = 20
  public static final long RAID_DURATION = 57600000
  public static final long RAID_END_OFFSET = 86400000
  public static final int RAID_END_OFFSET_HOUR = 24
  public static final long RAID_START_OFFSET = 28800000
  public static final int RAID_START_OFFSET_HOUR = 8
  public static final long TIME_ZONE_CHANGE_PENALTY_PERIOD = 2592000000

  // Constructors (1)
  com.perblue.rpg.game.logic.CryptRaidHelper()

  // Methods (5)
  public static boolean showRedDot(IUser)
  public static long getNextRaidStartTime(long, long, long, long, TimeZone)
  private static void giveGold(IUser, List)
  public static void recordOutcome(IUser, HeroLineup, int, CombatOutcome, List)
  public static int getPoints(SkullAnimation, CryptRaidData)
```

## com.perblue.rpg.game.logic.DailyActivityHelper
```
public abstract class DailyActivityHelper

  // Fields (80)
  static final boolean $assertionsDisabled = true
  public static final String ANY_CAMPAIGN_USE = campaign_any
  public static final String ANY_CHALLENGES_USE = challenges
  public static final String ANY_CHEST_USE = chest_any
  public static final String ANY_EXPEDITION_USE = expedition_any
  public static final String ANY_FIGHT_PIT_USE = fightPit_any
  public static final String ANY_THE_MOUNTAIN_USE = theMountain
  public static final String BAZAAR_TRADER_REFRESH_USE = refresh_bazaarTrader
  public static final String BLACK_MARKET_TRADER_FREE_REFRESH_USE = free_refresh_blackMarketTrader
  public static final String BLACK_MARKET_TRADER_REFRESH_USE = refresh_blackMarketTrader
  public static final String BOSS_BATTLE_ADVANCE_USE_PREFIX = BossBattleAdvance_
  public static final String BOSS_BATTLE_RESET_USE_PREFIX = BossBattleReset_
  public static final String BOSS_BATTLE_WIN = boss_battle_win
  public static final String BOSS_PIT_CHANCE = bossPit
  public static final String BOSS_PIT_WIN = bossPitWin
  public static final String CHALLENGES_DRAGON_CHANCE = challengesDragon
  public static final String CHALLENGES_DRAGON_RESET_USE = challengesDragonReset
  public static final String CHALLENGES_MAGIC_CHANCE = challengesMagic
  public static final String CHALLENGES_MAGIC_RESET_USE = challengesMagicReset
  public static final String CHALLENGES_PHYSICAL_CHANCE = challengesPhysical
  public static final String CHALLENGES_PHYSICAL_RESET_USE = challengesPhysicalReset
  public static final String COLISEUM_CHANCE = coliseum
  public static final String COLISEUM_RESET_USE = coliseum_reset
  public static final String COLISEUM_TRADER_REFRESH_USE = refresh_coliseumTrader
  public static final String COLISEUM_USE = coliseumUse
  public static final String CRYPT_RAID_USE = cryptRaid
  public static final String DAILY_EVENT_SIGNIN_CHANCE = daily_event_signin
  public static final String DAILY_EVENT_SIGNIN_VIP_CHANCE = daily_event_signin_vip
  public static final String DAILY_LOGIN_COUNT = dailyLoginCount
  public static final String DAILY_SIGNIN_CHANCE = daily_signin
  public static final String DAILY_SIGNIN_VIP_CHANCE = daily_signin_vip
  public static final String ELITE_CAMPAIGN_CHANCE_PREFIX = ELITE_
  public static final String ELITE_CAMPAIGN_USE = campaign_elite
  public static final String ENCHANTING = enchanting
  public static final String EVENT_CHEST_USE = chest_event
  public static final String EXPEDITIONS_TRADER_REFRESH_USE = refresh_expeditionsTrader
  public static final String EXPEDITION_RESET_USE = expeditionReset
  protected static DailyActivityHelperExt EXT
  public static final String FIGHT_PIT_CHANCE = fightPit
  public static final String FIGHT_PIT_RESET_USE = fightPit_reset
  public static final String FIGHT_PIT_TRADER_REFRESH_USE = refresh_fightpitTrader
  public static final int FREE_BOSS_BATTLE_STAGE_ADVANCES = 1
  public static final int FREE_BOSS_BATTLE_STAGE_RESETS = 1
  public static final String FULL_MOON_GO = fullMoonGo
  public static final String GOLD_CHEST_USE = chest_gold
  public static final String GOLD_PURCHASE_USE = buy_gold
  public static final String GUILD_TRADER_REFRESH_USE = refresh_guildTrader
  public static final String GUILD_WAR_TRADER_REFRESH_USE = refresh_guildWarTrader
  public static final String IAP_PURCHASE_USE = iap_purchase
  public static final String MERCENARY_POST = mercenary_post
  public static final String MONTHLY_DIAMONDS_QUEST_CHANCE = quest_monthlyDiamonds
  public static final String NORMAL_TRADER_FREE_REFRESH_USE = free_refresh_trader
  public static final String NORMAL_TRADER_REFRESH_USE = refresh_trader
  public static final String ORANGE_CHEST_USE = chest_orange
  public static final String PEDDLER_TRADER_FREE_REFRESH_USE = free_refresh_peddlerTrader
  public static final String PEDDLER_TRADER_REFRESH_USE = refresh_peddlerTrader
  public static final String PURPLE_CHEST_USE = chest_purple
  public static final String QUARTER_MOON_GO = quarterMoonGo
  public static final String RAID_TICKET_PURCHASE_USE = buy_raid_ticket
  public static final String RESET_ELITE_CAMPAIGN_USE_PREFIX = RESET_ELITE_
  public static final int RESET_TIME = 5
  public static final long RESET_TIME_MILLIS = 18000000
  public static final String RUNE_EMPOWER_ATTEMPT = runeEmpowerAttempt
  public static final String RUNE_SHRINE_USE = runeShrineUse
  public static final String RUNICITE_PURCHASE_USE = buy_runicite
  public static final String SILVER_CHEST_CHANCE = chest_silver_chance
  public static final String SILVER_CHEST_USE = chest_silver
  public static final String SKILL_POINT_PURCHASE_USE = buy_powerPoints
  public static final String SOULMART_REFRESH_USE = refresh_soulmart
  public static final String SOUL_CHEST_USE = chest_soul
  public static final String STAMINA_PURCHASE_USE = buy_stamina
  public static final String TAPPED_MONTHLY_CARD_REMINDER = tappedMonthlyCardReminder
  public static final String THE_CAVES_CHANCE = theCaves
  public static final String THE_CAVES_RESET_USE = theCavesReset
  public static final String THE_SUMMIT_CHANCE = theSummit
  public static final String THE_SUMMIT_RESET_USE = theSummitReset
  public static final String UPGRADE_SKILL_USE = skill_upgrade
  public static final String VIEWED_CHAT_APP_UPSELL = viewedChatAppUpsell
  public static final String VIEWED_GLOBAL_CHAT_RULES = viewedGlobalChatRules
  public static final String WEEKLY_FREE_RUNE_REMOVAL = week_freeRuneRemove

  // Constructors (1)
  com.perblue.rpg.game.logic.DailyActivityHelper()

  // Methods (7)
  public static long getNextDailyResetTime(IUser, boolean)
  public static int getMaxDailyUses(IUser, String)
  private static boolean isResetDaily(String)
  private static long getDailyResetTime(int, Calendar, long)
  public static int getRemainingDailyUses(IUser, String)
  public static int getMaxDailyChances(IUser, String)
  public static void checkAndUpdateDailyValues(IUser)
```

## com.perblue.rpg.game.logic.DefeatTipHelper [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.logic.DifficultyModeHelper
```
public abstract class DifficultyModeHelper

  // Fields (2)
  static final boolean $assertionsDisabled = true
  private static final long TIME_VERIFY_WINDOW = 60000

  // Constructors (1)
  com.perblue.rpg.game.logic.DifficultyModeHelper()

  // Methods (38)
  public static String getChanceKey(GameMode)
  public static CooldownType getCooldownType(GameMode)
  public static CharSequence getFilterHint(GameMode)
  public static HeroLineupType getLineupType(GameMode)
  public static int getNextOpenDay(GameMode, IUser)
  public static r getOpenDays(GameMode)
  public static VIPFeature getRaidFeature(GameMode, ModeDifficulty)
  public static String getResetUseKey(GameMode)
  public static long getVerifiedTime(long)
  public static boolean usesMercenaries(GameMode)
  public static boolean usesTraits(GameMode)
  public static long getCooldownDuration(GameMode, IUser)
## com.perblue.rpg.game.logic.DifficultyModeHelper [ERROR: IncompatibleClassChangeError: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$DamageSourceType disagree on InnerClasses attribute]

## com.perblue.rpg.game.logic.EnchantingHelper
```
public abstract class EnchantingHelper

  // Constructors (1)
  com.perblue.rpg.game.logic.EnchantingHelper()

  // Methods (9)
  public static int getEnchantMaxDiamondCost(IUser, UnitType, HeroEquipSlot)
  public static int getCurrentStarPoints(IUser, UnitType, HeroEquipSlot)
  public static List addEnchantItems(IUser, int)
  public static List addEnchantItems(IUser, int, boolean, boolean)
  public static int getEnchantGoldCost(IUser, UnitType, HeroEquipSlot, Map)
  public static int getEnchantPoints(ItemType, IUser)
  public static int getPowerIncrease(IUser, UnitType, HeroEquipSlot, Map)
  public static boolean shouldShowRedDot(IUser)
  public static IEquippedItem enchantItem(IUser, UnitType, HeroEquipSlot, Map, boolean)
```

## com.perblue.rpg.game.logic.ExpeditionHelper
```
public abstract class ExpeditionHelper

  // Fields (4)
  public static final int MIN_HERO_LEVEL = 20
  public static final int NODES_PER_ROUND = 3
  public static final int NODE_AMOUNT = 15
  public static final int ROUNDS = 5

  // Constructors (1)
  com.perblue.rpg.game.logic.ExpeditionHelper()

  // Methods (9)
  public static int getMaxEnabledDifficulty(IUser)
  public static int modifyGoldForDifficulty(int, int)
  public static boolean isDifficultyAvailable(IUser, int)
  public static int getResetsRemaining(IUser)
  public static int getGlobalMaxDifficulty()
  public static List openChest(IUser, int, int, int, List)
  public static int giveLoot(IUser, NodeReward, int, int)
  public static int getMaxDifficulty(IUser)
  public static void enableDifficulty(IUser, int)
```

## com.perblue.rpg.game.logic.GuildHelper
```
public abstract class GuildHelper

  // Fields (14)
  private static final long CHAMPION_INACTIVE_CLAIM = 604800000
  private static List CHAMPION_PERMISSIONS
  public static final int CREATE_GUILD_COST = 2000
  private static final long GUILD_LEAVE_LOCKOUT_TIME = 86400000
  public static final int MAX_GUILD_MOTTO_LENGTH = 50
  public static final int MAX_GUILD_NAME_LENGTH = 16
  public static final int MAX_MEMBERS = 50
  public static final int MIN_GUILD_NAME_LENGTH = 3
  public static final int MIN_TEAM_LEVEL_INCREMENT = 5
  private static final long OFFICER_INACTIVE_CLAIM = 1814400000
  private static List OFFICER_PERMISSIONS
  private static List ORDERED_ROLES
  private static Map PERMISSIONS
  private static List RULER_PERMISSIONS

  // Constructors (1)
  com.perblue.rpg.game.logic.GuildHelper()

  // Methods (26)
  public static boolean canAcceptMembers(GuildRole)
  public static boolean canDemote(GuildRole, GuildRole)
  public static GuildRole getNextLowerRole(GuildRole)
  public static boolean canDisband(GuildRole)
  public static boolean canEditCountry(GuildRole)
  public static boolean canEditDescription(GuildRole)
  public static boolean canEditEmblem(GuildRole)
  public static boolean canEditGuildWall(GuildRole)
  public static boolean canEditTimeZone(GuildRole)
  public static boolean canKickMember(GuildRole, GuildRole)
  public static boolean canPromote(GuildRole, GuildRole)
  public static GuildRole getNextHigherRole(GuildRole)
  public static boolean canRegisterForWar(GuildRole)
  public static boolean canStartWarBattle(GuildRole)
  public static boolean isInGuild(IUser)
  public static boolean canSurrenderOrFinishWarBattle(GuildRole)
  public static int getRoleComparisonIndex(GuildRole)
  public static boolean canEditCryptDifficulty(GuildRole)
  public static boolean canEditGuildPrivacy(GuildRole)
  public static boolean canEditMinTeamLevel(GuildRole)
  public static boolean canParticipateInGuildModes(IUser)
  public static boolean canChangeWarMembers(GuildRole)
  public static boolean canDeleteGuildWallPosts(GuildRole)
  public static long getClaimLeaderInactiveTime(GuildRole)
  public static void chargeForCreation(IUser)
  public static List getPermissions(GuildRole)
```

## com.perblue.rpg.game.logic.HeroHelper
```
public abstract class HeroHelper

  // Constructors (1)
  com.perblue.rpg.game.logic.HeroHelper()

  // Methods (37)
  private static void addAdditionalNeededItems(IUser, List, ItemType, int)
  public static boolean rarityAllowsPromotion(IHero)
  public static void copySkillsToUnitData(Unit, IHero)
  public static List findHeroThatNeedsItem(IUser, ItemType, ContentUpdate)
  private static boolean canGetParts(IUser, ItemType)
  private static boolean canCraftItem(IUser, ItemType, Map, Map, int)
  public static boolean canEvolve(UnitType, IUser)
  public static boolean canPromoteManually(UnitType, IUser)
  public static boolean canUnlock(UnitType, IUser)
  private static GearState getGearState(IUser, IHero, HeroEquipSlot, ContentUpdate, boolean)
  public static GearState getGearState(IUser, IHero, HeroEquipSlot, ContentUpdate)
  public static AutoPromoteData getAutoPromoteData(UnitType, IUser)
  public static List getNeededItems(IUser, ContentUpdate, IHero)
  public static Set getTypes(Collection)
  public static void giveFullGear(IHero)
  public static void giveMaxEnchant(IHero)
  public static void giveMaxSkills(IHero)
  private static boolean hasItemsToEquip(IUser, IHero, ContentUpdate)
  public static boolean hasSkillsToUpgrade(IUser)
  public static boolean hasThingsToDo(IUser, UnitType, ContentUpdate)
  public static boolean hasThingsToDo(IUser, ContentUpdate)
  public static int returnSlotNum(HeroEquipSlot)
  public static void initSkills(IHero, boolean)
  public static int getSoulStoneConversion(int)
  public static void makeLegendary(IUser, UnitType)
  public static IHero equipItem(UnitType, ItemType, HeroEquipSlot, IUser)
  public static IHero evolve(UnitType, IUser)
  public static PromoteOutcomeData promote(UnitType, IUser)
  public static IHero upgradeSkill(UnitType, SkillType, IUser)
  public static int addHeroEXP(UnitType, ItemType, int, IUser, String)
  public static int addHeroEXP(UnitType, int, IUser, String)
  private static int addHeroEXP(UnitType, ItemType, int, int, IUser, String)
  public static PrepareForPromoteData prepareForPromote(UnitType, IUser, Map)
  public static void addMaxXPForLevel(UnitType, IUser)
  public static void setSkin(IUser, UnitType, ItemType)
  public static boolean hasMaxStarHeroes(IUser)
  public static IHero unlock(UnitType, IUser)
```

## com.perblue.rpg.game.logic.HowToPlayHelper
```
public abstract class HowToPlayHelper

  // Fields (2)
  private static final String DATA_BUNDLE = com.perblue.rpg.util.localization.how_to_play_data
  private static final String STRINGS_BUNDLE = com.perblue.rpg.util.localization.how_to_play

  // Constructors (1)
  com.perblue.rpg.game.logic.HowToPlayHelper()

  // Methods (6)
  public static String getDataString(String, String, boolean)
  public static HowToPlayDeck createDeck(HowToPlayDeckType)
  public static int getCardCount(HowToPlayDeckType)
  public static HowToPlayCardType getCardType(String)
  public static String[] getBulletKeys(HowToPlayDeckType, int)
  public static String getString(String, boolean)
```

## com.perblue.rpg.game.logic.ItemHelper
```
public abstract class ItemHelper

  // Fields (2)
  private static final int STAMINA_CONSUMABLE_AMOUNT = 60
  private static final long TEMP_VIP_DURATION = 86400000

  // Constructors (1)
  com.perblue.rpg.game.logic.ItemHelper()

  // Methods (20)
  public static boolean hasUnviewedConsumableItem(IUser)
  private static void useAlchemyCostResetItem(IUser)
  private static void useDoubleCampaignDropItem(IUser, ItemType, CampaignType, int)
  private static void useEliteChancesCostResetItem(IUser)
  private static void useStaminaCostResetItem(IUser)
  private static boolean checkXPBonusItemEventAdjustment(IUser, SpecialEventInfo)
  private static void useStaminaConsumableItem(IUser)
  public static UseItemEventType getItemEventType(GameMode, int)
  public static UseItemEventType getItemEventType(ItemType)
  private static void updateBonusItem(IUser, UseItemEventType, long, long)
  private static void updateBonusItem(IUser, UseItemEventType, long, int)
  private static void useTempVIPItem(IUser, int)
  private static void useTeamXPBonusItem(IUser, ItemType, int)
  public static int getItemEventRate(UseItemEventType)
  public static boolean checkForItemXPBonusEventAdjustments(IUser, SpecialEventInfo)
  private static boolean checkDoubleCampaignDropItemEventAdjustment(IUser, SpecialEventInfo)
  private static boolean updateEventAdjustmentTimeAndPauseTime(IUser, GameMode, TimeType, int, long, long, long)
  public static boolean checkForItemEventAdjustments(IUser, SpecialEventInfo)
  public static void useItem(IUser, ItemType)
  public static boolean exchangeItem(IUser, String, String)
```

## com.perblue.rpg.game.logic.ItemLootRange
```
public class ItemLootRange

  // Fields (3)
  private int max
  private int min
  private final ItemType type

  // Constructors (1)
  com.perblue.rpg.game.logic.ItemLootRange(ItemType)

  // Methods (5)
  public int getMax()
  public int getMin()
  public void setMin(int)
  public void setMax(int)
  public ItemType getType()
```

## com.perblue.rpg.game.logic.LapsedCatchUpHelper
```
public class LapsedCatchUpHelper

  // Fields (1)
  private static final long DAY = 86400000

  // Constructors (1)
  com.perblue.rpg.game.logic.LapsedCatchUpHelper()

  // Methods (4)
  public static CatchUpPeriod checkUserInPeriod(IUser)
  public static int getStaminaRewards(IUser)
  public static void claimStaminaRewards(IUser)
```

## com.perblue.rpg.game.logic.LegendaryQuestHelper
```
public class LegendaryQuestHelper

  // Fields (1)
  private static UnitType[] HIPPY_UNIT_TYPES

  // Constructors (1)
  com.perblue.rpg.game.logic.LegendaryQuestHelper()

  // Methods (37)
  private static void recordHeroUse(IUser, HeroLineup, CombatOutcome)
  private static void recordHeroUse(IUser, Collection, CombatOutcome)
  public static void onColiseumAttack(IUser, Collection, int, int, ArenaTier, boolean, boolean)
  public static void onExpeditionAttack(IUser, List, int, int, int, int, CombatOutcome)
  private static void recordHeroUseData(IUser, Collection, CombatOutcome)
  public static void onFightPitAttack(IUser, Collection, int, int, ArenaTier, CombatOutcome)
  public static void onGlobalChat(IUser, String)
  public static void onGoldEarned(IUser, int)
  public static void onGuildWarAttack(IUser, HeroLineup, List, CombatOutcome, int, int)
  public static void onStaminaSpend(IUser, int)
  public static boolean shouldNotUseHero(IUser, IHero)
  public static void onClaimStaminaRewards(IUser)
  private static ContestTaskType getHeroesRemainingTaskType(ContestTaskType)
  private static ContestTaskType getPowerDefeatedAboveOwnTaskType(ContestTaskType)
  private static ContestTaskType getPowerDefeatedTaskType(ContestTaskType)
  public static boolean requiresConsecutiveDailyProgress(LegendaryQuestType)
  private static void recordContestBattleWin(ContestTaskType, IUser, Collection, int, int, int)
  private static void recordHardExpeditionWinQuests(IUser, List, Set)
  public static void onExpeditionCompleted(IUser, int, int)
  private static void recordExpeditionCompleted(IUser, int, ContestTaskType, ContestTaskType)
  public static void onTitanTempleAttack(IUser, Collection, int, int, UnitType, CombatOutcome)
  public static boolean isMultiDay(LegendaryQuestType)
  private static boolean containsHero(Collection, UnitType)
  private static String getGenericUseKey(UnitType)
  public static void onDifficultyModeAttack(IUser, Collection, int, int, GameMode, ModeDifficulty, CombatOutcome)
  public static void onBossPitAttack(IUser, HeroLineup, int, int, UnitType, int, ModeDifficulty, CombatOutcome)
  public static void onCampaignAttack(IUser, Collection, int, int, CampaignType, int, int, CombatOutcome)
  public static void onChestOpen(IUser, ChestType, int)
  public static boolean shouldShowRedDot(IUser, UnitType, ContentUpdate)
  public static void onCryptRaidAttack(IUser, HeroLineup, int, List, CombatOutcome)
  public static void onMerchantPurchase(IUser)
  public static void checkForQuestChanges(IUser)
  public static void recordAttackBaseInformation(IUser, AttackBase)
  public static void doSacrifice(IUser, int, int)
  private static void doSacrifice(IUser, int, int, ResourceType)
  private static void doSacrifice(IUser, int, int, ItemType)
  public static void doQuestSkip(IUser, int, int)
```

## com.perblue.rpg.game.logic.LegendaryQuestType
```
public final enum LegendaryQuestType extends java.lang.Enum

  // Fields (20)
  private static final LegendaryQuestType[] $VALUES
  public static final LegendaryQuestType BASIC_SINGLE_DAY
  public static final LegendaryQuestType BUY_MERCHANT_ITEMS
  public static final LegendaryQuestType CHAT_CONSECUTIVE
  public static final LegendaryQuestType ENCHANT_HEROES
  public static final LegendaryQuestType FULL_MOON
  public static final LegendaryQuestType HERO_ABSTINENCE
  public static final LegendaryQuestType OPEN_CHESTS
  public static final LegendaryQuestType QUARTER_MOON
  public static final LegendaryQuestType SACRIFICE_ITEMS
  public static final LegendaryQuestType SACRIFICE_ITEM_CONSECUTIVE
  public static final LegendaryQuestType SACRIFICE_RESOURCES
  public static final LegendaryQuestType TITAN_KILLS
  public static final LegendaryQuestType WIN_BOSS_PIT
  public static final LegendaryQuestType WIN_COLISEUM
  public static final LegendaryQuestType WIN_COLISEUM_CONSECUTIVE
  public static final LegendaryQuestType WIN_ELITE_NODE
  public static final LegendaryQuestType WIN_FIGHT_PIT
  public static final LegendaryQuestType WIN_FIGHT_PIT_CONSECUTIVE
  public static final LegendaryQuestType WIN_HARD_EXPEDITION_BATTLE

  // Constructors (1)
  com.perblue.rpg.game.logic.LegendaryQuestType(String, int)

  // Methods (2)
  public static LegendaryQuestType[] values()
  public static LegendaryQuestType valueOf(String)
```

## com.perblue.rpg.game.logic.MailHelper
```
public class MailHelper

  // Constructors (1)
  com.perblue.rpg.game.logic.MailHelper()

  // Methods (9)
  public static boolean canCollectWithoutReading(MailType)
  public static IMailMessage findMessage(long, IUser)
  public static boolean hasNewMail(IUser)
  public static boolean isPriority(MailType)
  public static void markOpened(IMailMessage, IUser)
  public static void markOpened(long, IUser)
  public static void takeAttachments(long, IUser)
  public static void takeAttachments(IMailMessage, IUser)
  public static void deleteMessage(long, IUser)
```

## com.perblue.rpg.game.logic.MercenaryHelper
```
public abstract class MercenaryHelper

  // Fields (3)
  private static final long CRYPT_HIRE_COOLDOWN = 7200000
  private static final long EXPEDITION_HIRE_COOLDOWN = 43200000
  public static final long POST_DURATION = 79200000

  // Constructors (1)
  com.perblue.rpg.game.logic.MercenaryHelper()

  // Methods (5)
  public static boolean canPostHero(User)
  public static long getHireCooldown(GameMode)
  public static int getHireCost(MercenaryHeroData, GameMode)
  public static int getAndUpdateGold(IUser)
  public static void chargeForMercenary(IUser, int)
```

## com.perblue.rpg.game.logic.MerchantHelper
```
public class MerchantHelper

  // Constructors (1)
  com.perblue.rpg.game.logic.MerchantHelper()

  // Methods (22)
  public static a purchaseItem(MerchantType, RewardDrop, IUser, int, int, int)
  public static int getFreeRefreshes(MerchantType, IUser)
  public static boolean isAvailable(IUser, MerchantType)
  public static Collection getAutoSellItems(IUser)
  private static boolean checkForFoundMerchant(IUser, int, MerchantType, boolean)
  public static void checkForFoundMerchant(IUser, int)
  public static IMerchantItem findUnpurchasedItem(MerchantType, RewardDrop, IUser, int)
  public static int getItemCost(MerchantType, IMerchantItem)
  private static int getStaminaRequired(MerchantType)
  public static String getFreeRefreshDailyUseType(MerchantType)
  public static ResourceType getMerchantPrimaryCurrency(MerchantType)
  public static long getNextAutoRefreshTime(MerchantType, IUser)
  public static String getRefreshDailyUseType(MerchantType)
  public static boolean isLimitedTime(MerchantType)
  public static boolean shouldAutoRefresh(MerchantType, IUser)
  public static long getTimeUntilNextAutoRefresh(MerchantType, IUser)
  public static boolean hasNewOrAutoSellItems(IUser)
  public static boolean isConsistentStoneType(MerchantType)
  public static boolean refresh(MerchantType, MerchantRefreshType, IUser)
  public static void unlockMerchant(IUser, MerchantType)
  public static int getItemAmount(MerchantType, IMerchantItem)
  public static boolean isPaidRefreshEnabled(MerchantType, IUser)
```

## com.perblue.rpg.game.logic.MountainHelper
```
public abstract class MountainHelper

  // Fields (2)
  public static final r CAVES_OPEN_DAYS
  public static final r SUMMIT_OPEN_DAYS

  // Constructors (1)
  com.perblue.rpg.game.logic.MountainHelper()

  // Methods (1)
  public static boolean hasAttacksAvailable(IUser)
```

## com.perblue.rpg.game.logic.NameChangeHelper
```
public class NameChangeHelper

  // Fields (5)
  private static final String LEGAL_CHARS =  -/0123456789_AaÁáÀàÂâÅåÄäÃãÆæBbCcÇçDdEeÉéÈèÊêËëFfGgĞğHhIiÍíÌìÎîÏïİIJijıJjKkLlMmNnÑñOoÓóÒòÔôÖöÕõØøŒœPpQqRrSsŞşßTtUuÚúÙùÛûÜüVvWwXxYyŸÿZzАаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя
  public static final int MAX_NAME_LENGTH = 16
  public static final int MIN_NAME_LENGTH = 3
  public static final int NORMAL_COST = 100
  private static String[] illegalNames

  // Constructors (1)
  com.perblue.rpg.game.logic.NameChangeHelper()

  // Methods (3)
  public static boolean containsIgnoreCase(String, String)
  public static int getNameChangeCost(IUser)
  public static boolean isNameLegal(String)
```

## com.perblue.rpg.game.logic.PlayerRankingHelper
```
public abstract class PlayerRankingHelper

  // Fields (9)
  public static final int MIN_LEVEL = 10
  public static final int TOP_LIST_LOAD_SIZE = 220
  public static final int TOP_LIST_SIZE = 200
  private static Map guildRanks
  private static Map topArenaPlayers
  private static Map topGuilds
  private static Map topPlayers
  private static Map yourArenaInfo
  private static Map yourRanks

  // Constructors (1)
  com.perblue.rpg.game.logic.PlayerRankingHelper()

  // Methods (13)
  public static int getGuildRank(RankType)
  public static List getTopArenaPlayers(RankType)
  public static List getTopGuilds(RankType)
  public static Collection getTopHeroes(IUser)
  public static List getTopPlayers(RankType)
  public static ArenaRankingRow getYourArenaInfo(RankType)
  public static int getYourRank(RankType)
  public static int getYourScore(RankType)
  public static void updateRankings(GuildRankings)
  public static void updateRankings(PlayerArenaRankings)
  public static void updateRankings(PlayerRankings)
  public static void calculateRankedStats(IUser)
  public static void clearCache()
```

## com.perblue.rpg.game.logic.QuickAttackAutomator
```
public class QuickAttackAutomator

  // Fields (3)
  private int playSpeed
  protected CoreAttackScreen screen
  private boolean stopQuickAttack

  // Constructors (1)
  com.perblue.rpg.game.logic.QuickAttackAutomator()

  // Methods (6)
  public void runCombat(int, CoreAttackScreen)
  public void dispose()
  private void setSoundEnabled(boolean)
  private void retreat()
  public void update(float)
  public void stop()
```

## com.perblue.rpg.game.logic.RewardHelper
```
public abstract class RewardHelper

  // Constructors (1)
  com.perblue.rpg.game.logic.RewardHelper()

  // Methods (34)
  private static void convertHeroDrop(IUser, RewardDrop)
  public static RewardDrop copyWithMultiplier(RewardDrop, int)
  public static List copyWithMultiplier(List, int)
  public static RewardDrop createDrop(ItemType, int)
  public static RewardDrop createDrop(ResourceType, int)
  private static transient void giveItemReward(IUser, RewardDrop, GameMode, boolean, boolean, String[])
  private static transient void giveResourceReward(IUser, RewardDrop, GameMode, boolean, String[])
  public static void mergeReward(Collection, RewardDrop)
  public static boolean isValidRewardType(String)
  public static boolean compareDrops(List, List)
  public static boolean compareDrops(RewardDrop, RewardDrop, boolean)
  public static transient void giveRewards(IUser, Collection, boolean, String[])
  public static transient void giveRewards(IUser, Collection, GameMode, boolean, boolean, String[])
  public static void mergeRewards(Collection, Collection)
  public static boolean isRune(RewardDrop)
  public static boolean isItem(RewardDrop)
  public static String getMainType(RewardDrop)
  public static RewardDrop getWithQuantity(RewardDrop, int)
  public static ItemCategory getCategory(RewardDrop)
  public static transient boolean giveReward(IUser, RewardDrop, boolean, String[])
  public static transient void giveReward(IUser, RewardDrop, GameMode, boolean, boolean, String[])
  public static boolean isResource(RewardDrop)
  public static RewardDrop convert(IUser, t, boolean, GameMode, GameModeMultipliers, Map)
  public static RewardDrop convert(IUser, t, boolean, GameMode, GameModeMultipliers)
  public static List convert(IUser, List, boolean, GameMode, GameModeMultipliers, Map)
  public static List convert(IUser, List, boolean, GameMode, GameModeMultipliers)
  public static List convert(IUser, List, boolean, GameMode)
  private static RuneData convert(t)
  public static List convert(IUser, List, boolean)
  public static boolean contains(Collection, ItemType)
  public static boolean contains(Collection, ResourceType)
  private static RuneData copy(RuneData)
  public static RewardDrop copy(RewardDrop)
  private static RuneBonusData copy(RuneBonusData)
```

## com.perblue.rpg.game.logic.RuneHelper [ERROR: NoClassDefFoundError: Could not initialize class com.perblue.rpg.game.data.rune.RuneStats]

## com.perblue.rpg.game.logic.SeedHelper
```
public abstract class SeedHelper

  // Constructors (1)
  com.perblue.rpg.game.logic.SeedHelper()

  // Methods (1)
  public static long getDefaultSeed(long, RandomSeedType)
```

## com.perblue.rpg.game.logic.SigninHelper
```
public abstract class SigninHelper

  // Fields (2)
  private static final AtomicReference DATA
  protected static final long END_TIME_FUDGE = 60000

  // Constructors (1)
  com.perblue.rpg.game.logic.SigninHelper()

  // Methods (32)
  public static void tryResetUserSignInCount(IUser)
  public static int getActiveRewardIndex(IUser)
  public static int getActiveRewardIndex(IUser, long)
  private static SigninReward getCurrentSigninReward(IUser)
  public static int getDoubleRewardVIPLevel(IUser, int, long)
  private static DailySignInClaimableStatus getDetailedAlreadyClaimed(IUser, int, long)
  public static long getCurrentServerEndTime()
  public static String convertJSTTime(Date, boolean)
  public static int getDaysInMonth(long)
  public static long getEndOfMonth(long, boolean)
  public static Map getEventSigninList(IUser)
  public static long getLastMonth(long)
  public static long getNextMonth(long)
  public static long getStartOfMonth(long, boolean)
  public static long isEventSignedIn(IUser)
  public static boolean isSignedIn(IUser)
  public static void addUserData(IUser, long)
  private static boolean areDifferentDays(IUser, long, long, long)
  public static DailySignInClaimableStatus getClaimableStatus(IUser, int, long)
  public static boolean isClaimable(IUser, int, long)
  public static boolean isClaimable(IUser, int)
  public static boolean isClaimable(DailySignInClaimableStatus)
  public static EventSigninBonus getEventSigninData(IUser, long)
  public static List getRewardEvent(IUser, int, long)
  public static RewardDrop getReward(IUser, int)
  public static UnitType getCurrentServerSigninHero()
  public static boolean isCurrentOrFutureSigninHero(UnitType)
  private static void giveItem(IUser, RewardDrop, int, String)
  public static void setData(SigninRewards)
  public static List getRewards(IUser)
  public static String convertTime(Date, boolean, String)
  public static DailySignInClaimableStatus claim(IUser, int, long)
```

## com.perblue.rpg.game.logic.SpecialEventsHelper [ERROR: ExceptionInInitializerError: null]

## com.perblue.rpg.game.logic.Tip
```
public class Tip

  // Fields (3)
  private String header
  private String icon
  private String tip

  // Constructors (1)
  com.perblue.rpg.game.logic.Tip(String, String, String)

  // Methods (3)
  public String getTip()
  public String getIcon()
  public String getHeader()
```

## com.perblue.rpg.game.logic.TitanTempleHelper [ERROR: NoClassDefFoundError: Could not initialize class com.perblue.rpg.game.data.unit.skill.SkillStats]

## com.perblue.rpg.game.logic.UpperLimit
```
public class UpperLimit

  // Fields (1)
  public static final int LIMIT_INT = 2100000000

  // Constructors (1)
  com.perblue.rpg.game.logic.UpperLimit()

  // Methods (3)
  public static UpperLimitType checkLimit(IUser, ResourceType, int)
  public static long getTotalResourceAmount(IUser, ResourceType, long)
  public static int getLimitedTotalResourceAmount(IUser, ResourceType, long)
```

## com.perblue.rpg.game.logic.UserHelper
```
public abstract class UserHelper

  // Fields (8)
  public static final Set DEFAULT_AVATARS
  public static final String FREE_VIP5_CONSUMABLE_AB = FreeVIP5Consumable_24509
  public static final String LAPSED_CATCH_UP_AB = LapsedCatchUp_22269
  private static final Log LOG
  public static final int NEW_ACCOUNT_COST = 100
  public static final String NEW_USER_IAP_HERO_AB = NewUserHeroIAP_24111
  public static final String STAMINA_COST_GROWTH_AB = StaminaGrowth2_22473
  public static final String STARTER_PACK_AB = Starter_Pack_12-16

  // Constructors (1)
  com.perblue.rpg.game.logic.UserHelper()

  // Methods (44)
  public static int calcTotalbuyGold(IUser, int, int, List)
  public static int calcTotalbuyGold(IUser, int, int)
  public static void recalcVIPLevel(IUser)
  public static int getResourceCap(ResourceType, IUser)
  public static List getUnlockedAvatars(IUser)
  private static transient int giveVIPTickets(IUser, int, String[])
  public static boolean isSkinEquipped(IUser, ItemType)
  public static long timeUntilFull(User)
  public static long getNextResourceGeneration(ResourceType, IUser)
  public static long getResourceGenerationInterval(ResourceType, IUser)
  public static boolean itemSellsForSoulmartTokens(ItemType, IUser)
  public static List calcBuyGoldResults(IUser, int, int, boolean)
  public static List calcBuyGoldResults(IUser, int, int)
  public static float getItemDropMultiplier(IUser, CampaignType)
  public static float getItemDropMultiplier(IUser, CampaignType, int)
  public static long getResourceGenerationRemaining(ResourceType, IUser)
  public static boolean hasAnySkins(IUser)
  public static int getReachableHeroStars(IUser, UnitType)
  private static transient int giveTeamXP(IUser, int, String[])
  public static void buyStamina(IUser)
  public static void buyPowerPoints(IUser)
  public static Iterable buyGold(int, IUser)
  public static void sellItem(ItemType, int, IUser)
  public static transient void giveUser(IUser, ResourceType, int, boolean, boolean, String[])
  public static transient boolean giveUser(IUser, ItemType, int, boolean, String[])
  public static transient void giveUser(IUser, ResourceType, int, boolean, String[])
  public static transient void chargeUser(IUser, ResourceType, int, String[])
  public static transient void chargeUser(IUser, ResourceType, int, float, String[])
  public static Iterable buyRunicite(int, IUser)
  public static void purchaseSkin(IUser, ItemType, int)
  public static Integer buyRaidTickets(IUser)
  public static transient void removeItem(IUser, ItemType, int, String[])
  public static boolean resourceGenerates(ResourceType)
  public static int addCampaignDropMultiplier(int, int, Map)
  public static int getCampaignDropMultiplier(Map)
  public static int getCampaignMultiplierDropsLeft(int, Map)
  public static String getBossPitKey(UnitType, ModeDifficulty, int)
  public static int updateAndGetResource(ResourceType, IUser, int)
  public static void updateLastResourceGenerationTime(ResourceType, IUser, int, int)
  public static int useCampaignMultiplierDrop(int, Map)
  public static void onTeamLevelChange(IUser, int, int)
  public static void buyAccount(IUser)
  public static void setTimeZone(IUser, int, String)
  public static int changeName(IUser, String)
```

## com.perblue.rpg.game.logic.WarHelper
```
public abstract class WarHelper

  // Fields (1)
  public static final List WAR_DEFENSE_LINEUPS

  // Constructors (1)
  com.perblue.rpg.game.logic.WarHelper()

  // Methods (12)
  public static boolean checkForWarInfoUpdates(WarInfo)
  public static void claimRewards(IUser, ClaimGuildWarRewards)
  public static List getNPCLineup(IUser, HeroLineupType, long)
  public static GuildWarRewardClaimStatus getPostClaimStatus(int)
  public static boolean isUnclaimed(WarResult)
  public static boolean startAttack(IUser)
  public static int getBattlePointValue(int, int, int)
  public static boolean hasAllDefenseLineupsSet(IUser)
  public static boolean shouldShowRedDot(IUser, WarRedDotInfo)
  private static void giveGold(IUser, List, int)
  public static void recordOutcome(IUser, HeroLineup, CombatOutcome, List, int, int, int)
  public static void viewedBattleResults(IUser, long)
```

## com.perblue.rpg.game.logic.droptable.EmptyContextDTCode
```
public class EmptyContextDTCode extends com.perblue.common.b.aw

  // Constructors (4)
  com.perblue.rpg.game.logic.droptable.EmptyContextDTCode(String[])
  com.perblue.rpg.game.logic.droptable.EmptyContextDTCode(Class, String[])
  com.perblue.rpg.game.logic.droptable.EmptyContextDTCode(Class)
  com.perblue.rpg.game.logic.droptable.EmptyContextDTCode()
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode
```
public class UserContextDTCode extends com.perblue.rpg.game.logic.droptable.EmptyContextDTCode

  // Fields (1)
  private int minTeamLevel

  // Constructors (4)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode()
  com.perblue.rpg.game.logic.droptable.UserContextDTCode(Class)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode(Class, String[])
  com.perblue.rpg.game.logic.droptable.UserContextDTCode(String[])

  // Methods (6)
  private void validateQuestId(String[], r)
  private int checkLegendaryQuest$635fe69a(UserDTContext, l)
  public void setMinTeamLevel(int)
```

## com.perblue.rpg.game.logic.droptable.UserDTContext
```
public class UserDTContext extends com.perblue.common.b.n

  // Fields (1)
  private final IUser user

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserDTContext(IUser)

  // Methods (1)
  public IUser getUser()
```

## com.perblue.rpg.game.objects.AnimationElement
```
public class AnimationElement

  // Fields (9)
  private static Log LOG
  public static final float STEP_SIZE = 0.033333335
  private float animAccumlator
  private IAnimationMapping animMapping
  private final AnimationState animState
  private z persistentAttachments
  private final n posedBounds
  private final Skeleton skeleton
  protected boolean skeletonTransformDirty

  // Constructors (1)
  com.perblue.rpg.game.objects.AnimationElement(Skeleton, AnimationState)

  // Methods (21)
  public float getAnimationLength(AnimationType)
  public float getAnimationLength(String)
  public AnimationState getAnimState()
  public void setPersistentAttachment(String, String)
  public void setPersistentAttachment(Slot, Attachment)
  public void removePersistentAttachment(String)
  public void removePersistentAttachment(Slot)
  public void updateWorldTransform()
  public IAnimationMapping getAnimMapping()
  public Bone getHitBone()
  public void setAnimation(Entity, AnimationType, boolean)
  public void setAnimation(Entity, String, boolean)
  public float getHeightFromOrigin()
  public String getPrimaryAnimation()
  public void setAnimationImmediately(Entity, String, boolean)
  public void setAnimMapping(IAnimationMapping)
  public n getPosedBounds()
  public Skeleton getSkeleton()
  public Animation getAnimation(String)
  public void update(float)
  public void reset()
```

## com.perblue.rpg.game.objects.ClientBossBattleData
```
public class ClientBossBattleData implements com.perblue.rpg.game.objects.IBossBattleData

  // Fields (3)
  private BossBattleResponse data
  private long eventID
  private List opponents

  // Constructors (1)
  com.perblue.rpg.game.objects.ClientBossBattleData()

  // Methods (23)
  public Integer getClearedChapter()
  public Integer getClearedLevel()
  public long getTotalElapsedTime()
  public List getDistributedTimeBonusRanks()
  public void setDistributedTimeBonusRanks(List)
  public void setClearedLevel(Integer)
  public void addUsedUnits(List)
  public void setElapsedTimes(List)
  public void addElapsedTime(long)
  public void setData(BossBattleResponse)
  public void setEventID(long)
  public void setOpponents(List)
  public void addUsedUnit(UnitType)
  public long getEventID()
  public List getOpponents()
  public long getPoints()
  public List getUsedUnits()
  public void setClearedChapter(Integer)
  public void setPoints(long)
  public void setUsedUnits(List)
  public Integer getTeamLevel()
  public void setTeamLevel(Integer)
  public BossBattleResponse getData()
```

## com.perblue.rpg.game.objects.ClientBossPit
```
public class ClientBossPit implements com.perblue.rpg.game.objects.IBossPit

  // Fields (1)
  private final BossPitData data

  // Constructors (1)
  com.perblue.rpg.game.objects.ClientBossPit(BossPitData)

  // Methods (18)
  public void setCurrentDifficultyCap(ModeDifficulty)
  public void clearCompletedBosses()
  public void setCurrentPhaseComplete(boolean)
  public ModeDifficulty getCurrentDifficulty()
  public ModeDifficulty getCurrentDifficultyCap()
  public boolean isCurrentPhaseComplete()
  public void setCurrentDifficulty(ModeDifficulty)
  public void setCurrentBoss(UnitType)
  public void setCurrentPhase(int)
  public int getCurrentPhase()
  public void addCompletedBoss(UnitType)
  public UnitType getCurrentBoss()
  public void addWin(UnitType, int, ModeDifficulty)
  public int getPhase(UnitType)
  public Collection getCurrentCompletedBosses()
  public int getWins(UnitType, int, ModeDifficulty)
  public long getLastAttackTime()
  public void setLastAttackTime(long)
```

## com.perblue.rpg.game.objects.ClientCampaignLevelStatus
```
public class ClientCampaignLevelStatus implements com.perblue.rpg.game.objects.ICampaignLevelStatus

  // Fields (7)
  private CampaignType campaignType
  private int chapter
  private long lastWinTime
  private int level
  private int stars
  private int totalWins
  private int winsAtCurrentStars

  // Constructors (1)
  com.perblue.rpg.game.objects.ClientCampaignLevelStatus(CampaignType, int, int)

  // Methods (11)
  public void setStars(int)
  public int getChapter()
  public void setWinsAtCurrentStars(int)
  public int getTotalWins()
  public void setTotalWins(int)
  public void setLastWinTime(long)
  public int getWinsAtCurrentStars()
  public CampaignType getCampaignType()
  public long getLastWinTime()
  public int getLevel()
  public int getStars()
```

## com.perblue.rpg.game.objects.ClientContestData
```
public class ClientContestData implements com.perblue.rpg.game.objects.IContestData

  // Fields (6)
  private long contestID
  private ContestData data
  private long pointsToAnimateFrom
  public boolean shouldAnimateProgressBar
  public boolean shouldAnimateProgressTimer
  private boolean shouldShowProgressBanner

  // Constructors (2)
  com.perblue.rpg.game.objects.ClientContestData(long, ContestData)
  com.perblue.rpg.game.objects.ClientContestData(long)

  // Methods (20)
  public boolean getShouldShowProgressBanner()
  public void setAnimateProgressBarFlag(boolean)
  public void setAnimateProgressTimerFlag(boolean)
  public void setPointsToAnimateFrom(float)
  public boolean getAnimateProgressBarFlag()
  public boolean getAnimateProgressTimerFlag()
  public long getPointsToAnimateFrom()
  public void setShouldShowProgressBanner(boolean)
  public void setCompletedCount(int, int)
  public int getCompletedCount(int)
  public int getPartialCount(int)
  public void setPartialCount(int, int)
  public void setContestID(long)
  public void setRank(int)
  public long getContestID()
  public int getTotalPlayers()
  public void setData(long, ContestData)
  public long getPoints()
  public void setPoints(long)
  public int getRank()
```

## com.perblue.rpg.game.objects.ClientEntityFactories
```
public abstract class ClientEntityFactories

  // Fields (2)
  private static final EntityFactory PROJECTILES
  private static final EntityFactory UNITS

  // Constructors (1)
  com.perblue.rpg.game.objects.ClientEntityFactories()

  // Methods (2)
  static EntityFactory getUnitFactory()
  static EntityFactory getProjectileFactory()
```

## com.perblue.rpg.game.objects.ClientEquippedItem
```
public class ClientEquippedItem implements com.perblue.rpg.game.objects.IEquippedItem

  // Fields (6)
  private int enchantMaterialPoints
  private UnitType equippedTo
  private boolean initialized
  private int stars
  private int totalPoints
  private ItemType type

  // Constructors (1)
  com.perblue.rpg.game.objects.ClientEquippedItem()

  // Methods (11)
  public void setHeroEquippedTo(UnitType)
  public void setStars(int)
  public void setTotalPoints(int)
  public int getTotalPoints()
  public void setEnchantMaterialPoints(int)
  public int getEnchantMaterialPoints()
  public UnitType getHeroEquippedTo()
  public int getStars()
  public void setType(ItemType)
  public void setInitialized(boolean)
  public ItemType getType()
```

## com.perblue.rpg.game.objects.ClientMailMessage
```
public class ClientMailMessage implements com.perblue.rpg.game.objects.IMailMessage

  // Fields (11)
  private List attachments
  private long expiration
  private Map extraData
  private String message
  private long messageId
  private boolean opened
  private boolean persistent
  private String sender
  private long sentDate
  private String subject
  private MailType type

  // Constructors (1)
  com.perblue.rpg.game.objects.ClientMailMessage()

  // Methods (25)
  public Collection getAttachments()
  public long getExpiration()
  public String getExtraData(MailExtraDataType)
  public String getSender()
  public long getSentDate()
  public String getSubject()
  public boolean isOpened()
  public boolean isPersistent()
  public void setExpiration(long)
  public void setMessage(String)
  public void setOpened(boolean)
  public void setPersistent(boolean)
  public void setSender(String)
  public void setSentDate(long)
  public void setSubject(String)
  public void setAttachments(List)
  public void setExtraData(Map)
  public void setType(MailType)
  public void setID(long)
  public long getID()
  public boolean equals(Object)
  public int hashCode()
  public String getMessage()
  public void delete(boolean)
  public MailType getType()
```

## com.perblue.rpg.game.objects.ClientMerchantItem
```
public class ClientMerchantItem implements com.perblue.rpg.game.objects.IMerchantItem

  // Fields (4)
  private int cost
  private ResourceType currency
  private RewardDrop item
  private boolean purchased

  // Constructors (1)
  com.perblue.rpg.game.objects.ClientMerchantItem()

  // Methods (8)
  public void setItem(RewardDrop)
  public boolean isPurchased()
  public ResourceType getCurrency()
  public int getCost()
  public void setPurchased(boolean)
  public void setCost(int)
  public void setCurrency(ResourceType)
  public RewardDrop getItem()
```

## com.perblue.rpg.game.objects.ClientRune
```
public class ClientRune implements com.perblue.rpg.game.objects.IRune

  // Fields (10)
  private z bonusMap
  private UnitType equippedTo
  private int fusionPoints
  private UnitType heroRestriction
  private long id
  private int level
  private Rarity rarity
  private RuneEquipSlot slot
  private int stars
  private RuneSetType type

  // Constructors (1)
  com.perblue.rpg.game.objects.ClientRune()

  // Methods (30)
  public void addBonus(RuneBonusData, String)
  public void addBonus(IRuneBonus)
  public Iterable getAllBonuses()
  public IRuneBonus getBonus(StatType)
  public int getFusionPoints()
  public UnitType getHeroRestriction()
  public a getPrimaryBonuses()
  public RuneSetType getRuneSetType()
  public IRuneBonus getSecondaryBonus()
  public a getTertiaryBonuses()
  public void removeBonus(StatType)
  public void setFusionPoints(int)
  public void setHeroEquippedTo(UnitType)
  public void setHeroRestriction(UnitType)
  public void setLevel(int)
  public void setRarity(Rarity)
  public void setRuneSetType(RuneSetType)
  public void setSlot(RuneEquipSlot)
  public void setStars(int)
  public void clearBonusData()
  public int getLevel()
  public Rarity getRarity()
  public UnitType getHeroEquippedTo()
  public int getStars()
  public void setID(long)
  public long getID()
  public String toString()
  public RuneEquipSlot getSlot()
```

## com.perblue.rpg.game.objects.CombatRenderSkill
```
public class CombatRenderSkill

  // Fields (4)
  private AnimationType animation
  private long duration
  private boolean kill
  private SkillType type

  // Constructors (2)
  com.perblue.rpg.game.objects.CombatRenderSkill(AnimationType, long)
  com.perblue.rpg.game.objects.CombatRenderSkill(SkillType, boolean)

  // Methods (9)
  public void setKill(boolean)
  public void setAnimation(AnimationType)
  public AnimationType getAnimation()
  public boolean isKill()
  public void setType(SkillType)
  public void setDuration(long)
  public long getDuration()
  public String toString()
  public SkillType getType()
```

## com.perblue.rpg.game.objects.DamageTypeData
```
public class DamageTypeData

  // Fields (4)
## com.perblue.rpg.game.objects.DamageTypeData [ERROR: IncompatibleClassChangeError: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$DamageSourceType disagree on InnerClasses attribute]

## com.perblue.rpg.game.objects.Entity
```
public abstract class Entity implements com.perblue.rpg.game.objects.IEntity

  // Fields (26)
  protected a actionQueue
  public boolean active
  private AnimationElement animationElement
  private h buffs
  protected boolean buffsDirty
  private long deltaLeft
  protected float energy
  protected float hp
  private p hpOffset
  protected long id
  protected boolean initialized
  protected a labels
  protected float oldHP
  private q originalPosition
  protected int overrideDamage
  protected int overrideMaxHP
  protected a parallelActionQueue
  protected Entity parent
  private q position
  protected float prevYaw
  protected float scale
  protected IScene scene
  private long spreadOutCooldown
  private int teamNumber
  protected boolean visible
  protected float yaw

  // Constructors (2)
  com.perblue.rpg.game.objects.Entity(IScene)
  com.perblue.rpg.game.objects.Entity()

  // Methods (83)
  public void setPosition(q)
  public void setPosition(float, float)
  public void setPosition(float, float, float)
  public void setScale(float)
  public void setScale(float, boolean)
  public void setVisible(boolean)
  public float getEnergy()
  public float getHP()
  public float getScale()
  public void setEnergy(float)
  public void setHP(float, String)
  public void setHP(float)
  public a getBuffs(Class)
  public a getBuffs(Class, a)
  public a getBuffs()
  public boolean hasBuff(Class)
  public void addParallelSimAction(SimAction)
  public void addParallelSimAction(SimAction, boolean)
  public boolean clearParallelSimActions(boolean)
  public AnimationElement getAnimationElement()
  public boolean addBuff(IBuff, Entity)
  public void addSimAction(SimAction)
  public void addSimAction(SimAction, boolean)
  public boolean canClearSimActions()
  public boolean clearSimActions(boolean)
  public SimAction getCurrentAction()
  public int getMaxEnergy()
  public a getParallelActions()
  public q getPosition()
  public float getYaw()
  public boolean isActionQueueEmpty()
  public boolean removeBuff(IBuff)
  public void setYaw(float)
  public boolean clearParallelAction(long, boolean)
  public boolean clearParallelAction(SimAction, boolean)
  public boolean clearParallelSimActionType(Class, boolean)
  public float getAnimateSpeedMultiplier()
  public q getOriginalPosition()
  public long getSpreadOutCooldown()
  private boolean clearActionArray(a, boolean)
  public int BuffCount()
  public a calcBounds(a)
  public boolean clearAction(SimAction, boolean)
  public boolean clearAction(long, boolean)
  public void clearAllBuffs()
  public boolean clearSimActionType(Class, boolean)
  public void dispose()
  public int getActionQueueSize()
  public IBuff getBuff(Class)
  public p getHPOffset()
  public a getLabels()
  public float getPrevYaw()
  public IScene getScene()
  public q getTargetPosition()
  public int getTeam()
  public boolean hasAction(SimAction)
  public boolean hasAction(long)
  protected boolean hasSpecialDeath()
  public boolean isStunned()
  public boolean isWearingCostume()
  public void markBuffsDirty()
  protected void onBuffsDirty()
  public void onDeath()
  public void removeBuffs(Class, Class)
  public void removeBuffs(Class)
  public void setHPOffset(p)
  public void setOverrideMaxHP(int)
  public void setScene(IScene)
  public void setTeam(int)
  protected void updateAfterActions(long, boolean)
  public void resetSpreadOutCooldown()
  public void setAnimationElement(AnimationElement)
  public void setOriginalPosition(q)
  public void setSpreadoutCooldownOverride(long)
  public void setInitialized(boolean)
  public boolean isVisible()
  public void setID(long)
  public long getID()
  public void update(long, boolean)
  public Entity getParent()
  public a getActions()
  public void create()
  public void setParent(Entity)
```

## com.perblue.rpg.game.objects.EntityFactory
```
public abstract interface interface EntityFactory

  // Methods (1)
  public abstract IEntity create(IScene)
```

## com.perblue.rpg.game.objects.EntityGroup
```
public class EntityGroup

  // Fields (3)
  public a entities
  public a toAdd
  public a toRemove

  // Constructors (1)
  com.perblue.rpg.game.objects.EntityGroup()
```

## com.perblue.rpg.game.objects.EnvEntity
```
public class EnvEntity extends com.perblue.rpg.game.objects.Entity

  // Fields (5)
  protected boolean isRemovable
  protected int maxHP
  protected ParticleType particleType
  protected ItemType skin
  protected EnvEntityType type

  // Constructors (3)
  com.perblue.rpg.game.objects.EnvEntity(EnvEntityType)
  com.perblue.rpg.game.objects.EnvEntity(EnvEntityType, ItemType)
  com.perblue.rpg.game.objects.EnvEntity(ParticleType)

  // Methods (9)
  public void setIsRemovable(boolean)
  public void setMaxHP(int)
  public boolean showHP()
  public ParticleType getParticleType()
  public int getMaxHP()
  public boolean isRemovable()
  public void setSkin(ItemType)
  public ItemType getSkin()
  public EnvEntityType getType()
```

## com.perblue.rpg.game.objects.EnvEntityType
```
public final enum EnvEntityType extends java.lang.Enum

  // Fields (60)
  private static final EnvEntityType[] $VALUES
  public static final EnvEntityType ABYSS_DRAGON_RAIN
  public static final EnvEntityType ALLEY_EYE_BLUE
  public static final EnvEntityType ALLEY_EYE_GREEN
  public static final EnvEntityType ALLEY_EYE_YELLOW
  public static final EnvEntityType ALLEY_LIGHT_RAY
  public static final EnvEntityType CHICKEN
  public static final EnvEntityType COLOSSUS_FLAG
  public static final EnvEntityType COLOSSUS_GOLD_PILE
  public static final EnvEntityType DIGGER_MOLE_SKILL2
  public static final EnvEntityType DIGGER_MOLE_SKILL3
  public static final EnvEntityType DRAGON_SLAYER_BANNER
  public static final EnvEntityType DRAGON_SLAYER_BANNER_UNICORN
  public static final EnvEntityType DUNGEON_MAN_DOOR
  public static final EnvEntityType DUNGEON_MAN_DOOR_BACKGROUND
  public static final EnvEntityType DUNGEON_MAN_DOOR_BACKGROUND_MASTERY
  public static final EnvEntityType DUNGEON_MAN_DOOR_BACKGROUND_MECHA
  public static final EnvEntityType DUNGEON_MAN_DOOR_FOREGROUND
  public static final EnvEntityType DUNGEON_MAN_DOOR_FOREGROUND_MASTERY
  public static final EnvEntityType DUNGEON_MAN_DOOR_FOREGROUND_MECHA
  public static final EnvEntityType DUNGEON_MAN_DOOR_MASTERY
  public static final EnvEntityType DUNGEON_MAN_DOOR_MECHA
  public static final EnvEntityType FISH
  public static final EnvEntityType GENIE_GOAT
  public static final EnvEntityType GIANT_PLANT
  public static final EnvEntityType JELLO
  public static final EnvEntityType KRAKEN_KING_MECHALORD_TENTACLE_1
  public static final EnvEntityType KRAKEN_KING_MECHALORD_TENTACLE_3
  public static final EnvEntityType KRAKEN_KING_TENTACLE_1
  public static final EnvEntityType KRAKEN_KING_TENTACLE_3
  public static final EnvEntityType MARINA_BOATS
  public static final EnvEntityType MARINA_FRONT_BOAT
  public static final EnvEntityType NPC_ABYSS_DRAGON_RAIN
  public static final EnvEntityType NPC_ANUBIS_DRAGON_SAND_BACKGROUND
  public static final EnvEntityType NPC_ANUBIS_DRAGON_SAND_FOREGROUND
  public static final EnvEntityType NPC_BOSS_ABYSS_DRAGON_RAIN
  public static final EnvEntityType NPC_BOSS_ANUBIS_DRAGON_SAND_BACKGROUND
  public static final EnvEntityType NPC_BOSS_ANUBIS_DRAGON_SAND_FOREGROUND
  public static final EnvEntityType PARTICLE_EFFECT
  public static final EnvEntityType PIE
  public static final EnvEntityType PLAGUE_SKULKER_CORPSE
  public static final EnvEntityType SEAGULLS
  public static final EnvEntityType SHADOW_ASSASSIN_SHADOW
  public static final EnvEntityType SHADOW_ASSASSIN_SHADOW_SKIN_WATCH
  public static final EnvEntityType SILENT_SPIRIT_WALL
  public static final EnvEntityType SMOKE_TEST_LR
  public static final EnvEntityType SMOKE_TEST_RL
  public static final EnvEntityType SNAKE
  public static final EnvEntityType SNIPER_WOLF_VICTORY_WOLF
  public static final EnvEntityType SNIPER_WOLF_WOLF
  public static final EnvEntityType SPIDER_QUEEN_COCOON
  public static final EnvEntityType SPIDER_QUEEN_STRING
  public static final EnvEntityType SPOTLIGHT
  public static final EnvEntityType STORM_DRAGON_TWISTER
  public static final EnvEntityType TAVERN_DUST
  public static final EnvEntityType TOMB_ANGEL_TOMB
  public static final EnvEntityType UNICORGI_RAINBOW
  public static final EnvEntityType VILE_BILE_PUDDLE
  public static final EnvEntityType ZOMBIE_ORGAN
  public static final EnvEntityType ZOMBIE_ORGAN_SKIN_DIGITAL

  // Constructors (1)
  com.perblue.rpg.game.objects.EnvEntityType(String, int)

  // Methods (2)
  public static EnvEntityType[] values()
  public static EnvEntityType valueOf(String)
```

## com.perblue.rpg.game.objects.Environment
```
public class Environment

  // Fields (7)
  public static final float HEIGHT = 5000.0
  public static final float ISO_HEIGHT = 3000.0
  public static final float ISO_WIDTH = 4000.0
  public static final float NEGLIGIBLE_FUDGE = 0.1
  public static final n PLAYABLE_BOUNDS
  public static final float WIDTH = 4000.0
  public static final float WORLD_TO_ISO = 0.6

  // Constructors (1)
  com.perblue.rpg.game.objects.Environment()

  // Methods (2)
  public static float getPlayableBoundsCenterX()
  public static float getPlayableBoundsCenterY()
```

## com.perblue.rpg.game.objects.IBossBattleData
```
public abstract interface interface IBossBattleData

  // Methods (21)
  public abstract Integer getClearedChapter()
  public abstract Integer getClearedLevel()
  public abstract long getTotalElapsedTime()
  public abstract List getDistributedTimeBonusRanks()
  public abstract void setDistributedTimeBonusRanks(List)
  public abstract void setClearedLevel(Integer)
  public abstract void addUsedUnits(List)
  public abstract void setElapsedTimes(List)
  public abstract void addElapsedTime(long)
  public abstract void setEventID(long)
  public abstract void setOpponents(List)
  public abstract void addUsedUnit(UnitType)
  public abstract long getEventID()
  public abstract List getOpponents()
  public abstract long getPoints()
  public abstract List getUsedUnits()
  public abstract void setClearedChapter(Integer)
  public abstract void setPoints(long)
  public abstract void setUsedUnits(List)
  public abstract Integer getTeamLevel()
  public abstract void setTeamLevel(Integer)
```

## com.perblue.rpg.game.objects.IBossPit
```
public abstract interface interface IBossPit

  // Methods (18)
  public abstract void setCurrentDifficultyCap(ModeDifficulty)
  public abstract void clearCompletedBosses()
  public abstract void setCurrentPhaseComplete(boolean)
  public abstract ModeDifficulty getCurrentDifficulty()
  public abstract ModeDifficulty getCurrentDifficultyCap()
  public abstract boolean isCurrentPhaseComplete()
  public abstract void setCurrentDifficulty(ModeDifficulty)
  public abstract void setCurrentBoss(UnitType)
  public abstract void setCurrentPhase(int)
  public abstract int getCurrentPhase()
  public abstract void addCompletedBoss(UnitType)
  public abstract UnitType getCurrentBoss()
  public abstract void addWin(UnitType, int, ModeDifficulty)
  public abstract int getPhase(UnitType)
  public abstract Collection getCurrentCompletedBosses()
  public abstract int getWins(UnitType, int, ModeDifficulty)
  public abstract long getLastAttackTime()
  public abstract void setLastAttackTime(long)
```

## com.perblue.rpg.game.objects.ICampaignLevelStatus
```
public abstract interface interface ICampaignLevelStatus

  // Methods (8)
  public abstract void setStars(int)
  public abstract void setWinsAtCurrentStars(int)
  public abstract int getTotalWins()
  public abstract void setTotalWins(int)
  public abstract void setLastWinTime(long)
  public abstract int getWinsAtCurrentStars()
  public abstract long getLastWinTime()
  public abstract int getStars()
```

## com.perblue.rpg.game.objects.IContestData
```
public abstract interface interface IContestData

  // Methods (11)
  public abstract void setCompletedCount(int, int)
  public abstract int getCompletedCount(int)
  public abstract int getPartialCount(int)
  public abstract void setPartialCount(int, int)
  public abstract void setContestID(long)
  public abstract void setRank(int)
  public abstract long getContestID()
  public abstract int getTotalPlayers()
  public abstract long getPoints()
  public abstract void setPoints(long)
  public abstract int getRank()
```

## com.perblue.rpg.game.objects.IEntity
```
public abstract interface interface IEntity

  // Methods (27)
  public abstract void setPosition(float, float)
  public abstract void setPosition(q)
  public abstract void setPosition(float, float, float)
  public abstract float getEnergy()
  public abstract float getHP()
  public abstract void setEnergy(float)
  public abstract void setHP(float)
  public abstract int getMaxHP()
  public abstract a getBuffs()
  public abstract void addParallelSimAction(SimAction)
  public abstract boolean clearParallelSimActions(boolean)
  public abstract AnimationElement getAnimationElement()
  public abstract boolean addBuff(IBuff, Entity)
  public abstract void addSimAction(SimAction)
  public abstract boolean canClearSimActions()
  public abstract boolean clearSimActions(boolean)
  public abstract SimAction getCurrentAction()
  public abstract int getMaxEnergy()
  public abstract a getParallelActions()
  public abstract q getPosition()
  public abstract float getYaw()
  public abstract boolean isActionQueueEmpty()
  public abstract boolean removeBuff(IBuff)
  public abstract void setYaw(float)
  public abstract long getID()
  public abstract void update(long, boolean)
  public abstract a getActions()
```

## com.perblue.rpg.game.objects.IEquippedItem
```
public abstract interface interface IEquippedItem

  // Methods (10)
  public abstract void setHeroEquippedTo(UnitType)
  public abstract void setStars(int)
  public abstract void setTotalPoints(int)
  public abstract int getTotalPoints()
  public abstract void setEnchantMaterialPoints(int)
  public abstract int getEnchantMaterialPoints()
  public abstract UnitType getHeroEquippedTo()
  public abstract int getStars()
  public abstract void setType(ItemType)
  public abstract ItemType getType()
```

## com.perblue.rpg.game.objects.IHero
```
public abstract interface interface IHero

  // Methods (35)
  public abstract void setLevel(int)
  public abstract void setRarity(Rarity)
  public abstract void setStars(int)
  public abstract void clearModePersistentData(GameMode)
  public abstract void setLegendary(boolean)
  public abstract void setSkinType(ItemType)
  public abstract void setSkillLevel(SkillType, int)
  public abstract float getStat(StatType)
  public abstract void setEXP(int)
  public abstract void setItem(HeroEquipSlot, IEquippedItem)
  public abstract void setItem(HeroEquipSlot, ItemType)
  public abstract void setRune(RuneEquipSlot, IRune)
  public abstract int getEnergy(GameMode)
  public abstract int getHP(GameMode)
  public abstract int getSkillLevel(SkillType)
  public abstract Iterable getSkills()
  public abstract ItemType getSkinType()
  public abstract void setEnergy(GameMode, int)
  public abstract void setHP(GameMode, int)
  public abstract void setMercenary(boolean)
  public abstract boolean isLegendary()
  public abstract boolean isMercenary()
  public abstract int getLevel()
  public abstract int getEXP()
  public abstract IEquippedItem getItem(HeroEquipSlot)
  public abstract Rarity getRarity()
  public abstract Iterable getItems()
  public abstract IRune getRuneByID(long)
  public abstract Iterable getRunes()
  public abstract IRune getRune(RuneEquipSlot)
  public abstract int getStars()
  public abstract void setType(UnitType)
  public abstract void setExtra(GameMode, HeroBattleDataExtraType, String)
  public abstract String getExtra(GameMode, HeroBattleDataExtraType)
  public abstract UnitType getType()
```

## com.perblue.rpg.game.objects.IMailMessage
```
public abstract interface interface IMailMessage

  // Methods (20)
  public abstract Collection getAttachments()
  public abstract long getExpiration()
  public abstract String getExtraData(MailExtraDataType)
  public abstract String getSender()
  public abstract long getSentDate()
  public abstract String getSubject()
  public abstract boolean isOpened()
  public abstract boolean isPersistent()
  public abstract void setExpiration(long)
  public abstract void setMessage(String)
  public abstract void setOpened(boolean)
  public abstract void setPersistent(boolean)
  public abstract void setSender(String)
  public abstract void setSentDate(long)
  public abstract void setSubject(String)
  public abstract void setType(MailType)
  public abstract long getID()
  public abstract String getMessage()
  public abstract void delete(boolean)
  public abstract MailType getType()
```

## com.perblue.rpg.game.objects.IMerchantItem
```
public abstract interface interface IMerchantItem

  // Methods (8)
  public abstract void setItem(RewardDrop)
  public abstract boolean isPurchased()
  public abstract ResourceType getCurrency()
  public abstract int getCost()
  public abstract void setPurchased(boolean)
  public abstract void setCost(int)
  public abstract void setCurrency(ResourceType)
  public abstract RewardDrop getItem()
```

## com.perblue.rpg.game.objects.IRune
```
public abstract interface interface IRune

  // Methods (26)
  public abstract void addBonus(IRuneBonus)
  public abstract void addBonus(RuneBonusData, String)
  public abstract Iterable getAllBonuses()
  public abstract IRuneBonus getBonus(StatType)
  public abstract int getFusionPoints()
  public abstract UnitType getHeroRestriction()
  public abstract Iterable getPrimaryBonuses()
  public abstract RuneSetType getRuneSetType()
  public abstract IRuneBonus getSecondaryBonus()
  public abstract Iterable getTertiaryBonuses()
  public abstract void removeBonus(StatType)
  public abstract void setFusionPoints(int)
  public abstract void setHeroEquippedTo(UnitType)
  public abstract void setHeroRestriction(UnitType)
  public abstract void setLevel(int)
  public abstract void setRarity(Rarity)
  public abstract void setRuneSetType(RuneSetType)
  public abstract void setSlot(RuneEquipSlot)
  public abstract void setStars(int)
  public abstract int getLevel()
  public abstract Rarity getRarity()
  public abstract UnitType getHeroEquippedTo()
  public abstract int getStars()
  public abstract void setID(long)
  public abstract long getID()
  public abstract RuneEquipSlot getSlot()
```

## com.perblue.rpg.game.objects.IRuneBonus
```
public abstract interface interface IRuneBonus

  // Methods (6)
  public abstract void setBonusType(RuneBonusType)
  public abstract void setStatType(StatType)
  public abstract void setSubLevel(int, String)
  public abstract RuneBonusType getBonusType()
  public abstract StatType getStatType()
  public abstract int getSubLevel()
```

## com.perblue.rpg.game.objects.IScene
```
public abstract interface interface IScene

  // Methods (40)
  public abstract boolean isLastStage()
  public abstract void setSceneInt(SceneInt, int)
  public abstract void addExternalEntity(Entity)
  public abstract a getAlliesOfUnit(Unit)
  public abstract int getNumStages()
  public abstract boolean isCastingFreezeLastFrame()
  public abstract boolean shouldShowVictoryAnimations()
  public abstract boolean removeExternalEntity(Entity)
  public abstract void removeSceneListener(ISceneListener)
  public abstract int getDefendersRemaining()
  public abstract a getOpponentsOfUnit(Unit)
  public abstract EntityFactory getUnitFactory()
  public abstract a getProjectiles()
  public abstract boolean removeProjectile(Projectile)
  public abstract int getSceneInt(SceneInt)
  public abstract void addDelayedAction(Runnable)
  public abstract EntityFactory getProjectileFactory()
  public abstract void addProjectile(Projectile)
  public abstract boolean isUpdatingEntities()
  public abstract Random getRnd()
  public abstract boolean isFlagSet(SceneFlag)
  public abstract a getDefenders()
  public abstract a getAttackers()
  public abstract void addEnvEntity(EnvEntity)
  public abstract a getEnvEntities()
  public abstract boolean removeEnvEntity(EnvEntity)
  public abstract int getAttackersRemaining()
  public abstract void addSceneListener(ISceneListener)
  public abstract void setStageEnded(boolean)
  public abstract void setCombatComplete(boolean)
  public abstract boolean isVictory()
  public abstract void setIsVictory(boolean)
  public abstract boolean isStageEnded()
  public abstract void addUnit(Unit)
  public abstract boolean removeUnit(Unit)
  public abstract a getExternalEntities()
  public abstract boolean isCombatComplete()
  public abstract boolean isCastingFreeze()
  public abstract int getStage()
  public abstract void update(long, boolean)
```

## com.perblue.rpg.game.objects.ISceneListener
```
public abstract interface interface ISceneListener

  // Methods (6)
  public abstract void entityDestroyed(IEntity)
  public abstract void entityMoved(IEntity)
  public abstract void entityAdded(IEntity)
  public abstract void entityRemoved(IEntity)
  public abstract void unitCostumeRefresh(IEntity)
  public abstract void unitRemoveRendering(IEntity)
```

## com.perblue.rpg.game.objects.IUser
```
public abstract interface interface IUser

  // Fields (4)
  public static final int AUTO_REQUESTED = 1
  public static final int FF_REQUESTED = 2
  public static final int GOOGLE_UPDATED = 1
  public static final int IOS_UPDATED = 2

  // Methods (205)
  public abstract int getEventSigninBonusMonthlySignin(long)
  public abstract void setLastMonthlySigninTime(long)
  public abstract long getLastMonthlySigninTime()
  public abstract Map getEventSigninBonusLastSigninTimes()
  public abstract void setEventSigninBonusLastSigninTime(long, long)
  public abstract Iterable getDailyChanceTypes()
  public abstract void clearUnclaimedArenaDemotion(ArenaType)
  public abstract boolean hasViewedDailyQuest(Integer)
  public abstract void setViewedDailyQuest(int)
  public abstract void setEventSigninBonusMonthlySignins(long, int)
  public abstract void resetPreviousDailySignins()
  public abstract Map getEventSigninBonusMonthlySignins()
  public abstract IHero getHero(UnitType)
  public abstract transient void addItem(ItemType, int, boolean, boolean, String[])
  public abstract int getTeamLevel()
  public abstract void setTeamLevel(int)
  public abstract void markThirdPartyQuestUpdated(int, BuildSource)
  public abstract void setLikedHeroWallPost(long, boolean)
  public abstract void setViewedConsumableItem(ItemType)
  public abstract void setCount(UserFlag, int)
  public abstract void setFlag(UserFlag, boolean)
  public abstract void setDailyUses(String, int)
  public abstract void incCount(UserFlag)
  public abstract void incCount(UserFlag, int)
  public abstract void addQuestCounter(String, int)
  public abstract void removeRune(IRune)
  public abstract void markSkinAsViewed(ItemType)
  public abstract transient void removeItem(ItemType, int, String[])
  public abstract Iterable getDailyUseTypes()
  public abstract int getDailyUses(String)
  public abstract int getExpLootPool()
  public abstract long getFacebookID()
  public abstract Iterable getFlagTypes()
  public abstract GuildRole getGuildRole()
  public abstract HeroLineup getHeroLineup(HeroLineupType)
  public abstract Iterable getHeroes()
  public abstract Map getIAPPurchases()
  public abstract int getIAPPurchases(String)
  public abstract Iterable getItems()
  public abstract long getLastDailyReset()
  public abstract long getLastLoginTime()
  public abstract Map getLootMemory()
  public abstract float getLootMemoryValue(ItemType)
  public abstract Iterable getMailMessages()
  public abstract String getPreviousName()
  public abstract a getRandom(RandomSeedType)
  public abstract long getSeed(RandomSeedType)
  public abstract int getRealVIPLevel()
  public abstract IRune getRuneByID(long)
  public abstract int getRuneCount()
  public abstract float getRuneMemoryValue(int, int)
  public abstract Iterable getRunes()
  public abstract int getItemAmount(ItemType)
  public abstract Iterable getMerchantItems(MerchantType)
  public abstract void setMerchantItems(MerchantType, List)
  public abstract void addABGroup(String, int)
  public abstract void addEventCompleted(long)
  public abstract void addHero(IHero)
  public abstract void addAutoAttackAvailable(GameMode, ModeDifficulty)
  public abstract boolean isAutoAttackAvailable(GameMode, ModeDifficulty)
  public abstract void addCampaignDropMultiplier(int, int)
  public abstract int getEventCompletionCount(long)
  public abstract void addItemEventMultiplier(UseItemEventType, Long)
  public abstract void addQuestCounterIfNotExists(String, int)
  public abstract void clearUnclaimedArenaPromotion(ArenaType)
  public abstract Map getActiveDropMultipliers()
  public abstract int getCampaignDropMultiplier()
  public abstract int getCampaignMultiplierDropsLeft(int)
  public abstract void markSkinAsNew(ItemType)
  public abstract boolean addPromoCode(String)
  public abstract int getQuestCounter(String)
  public abstract void addRune(IRune)
  public abstract void clearMercenaryHero(GameMode)
  public abstract transient IHero createHero(UnitType, Rarity, int, int, String[])
  public abstract void decDailyChances(String)
  public abstract int getDailyChances(String)
  public abstract int getABGroup(String)
  public abstract AppReviewStatus getAppReviewStatus()
  public abstract Avatar getAvatar()
  public abstract IBossPit getBossPit()
  public abstract int getBossPitStars(UnitType, ModeDifficulty, int)
  public abstract ICampaignLevelStatus getCampaignLevel(CampaignType, int, int)
  public abstract Iterable getCampaignLevels(CampaignType, int)
  public abstract IContestData getContestData(long)
  public abstract long getCooldownEnd(CooldownType)
  public abstract Iterable getCountTypes()
  public abstract Map getEventCompletionCountList()
  public abstract long getEventSigninBonusLastSigninTime(long)
  public abstract int getExpeditionStageCompletionCount(ModeDifficulty, int)
  public abstract int getGameModeCompetionCount(GameMode, ModeDifficulty)
  public abstract String getGameModeCompetionCountKey(GameMode, ModeDifficulty)
  public abstract int getGameModeCompetionCountWithKey(String)
  public abstract long getItemEventMultiplier(UseItemEventType)
  public abstract Map getItemEventMultipliers()
  public abstract long getLastResourceGenerationTime(ResourceType)
  public abstract int getMercenaryGoldEarned()
  public abstract long getMerchantAutoRefreshTime(MerchantType)
  public abstract long getMerchantCooldownEnd(MerchantType)
  public abstract long getMerchantExpiration(MerchantType)
  public abstract int getMerchantStaminaMemory(MerchantType)
  public abstract DailySignInClaimableStatus getPreviousDailySignin(int)
  public abstract DailySignInClaimableStatus getPreviousEventDailySignin(long, long)
  public abstract int getQuestCompletionCount(int)
  public abstract long getQuestLastCompletedTime(int)
  public abstract long getSpecialEventsLastCheckedTime()
  public abstract int getTeamLevelAtEventStart(long)
  public abstract int getUnclaimedArenaDemotionDivision(ArenaType)
  public abstract ArenaTier getUnclaimedArenaDemotionTier(ArenaType)
  public abstract int getUnclaimedArenaPromotionDivision(ArenaType)
  public abstract ArenaTier getUnclaimedArenaPromotionTier(ArenaType)
  public abstract boolean hasClaimedArenaReward(ArenaTier, int, ArenaType)
  public abstract boolean hasViewedConsumableItem(ItemType)
  public abstract int getShardID()
  public abstract int getTeamPower()
  public abstract String getTimeZoneID()
  public abstract int getTimeZoneOffset()
  public abstract int getTotalPower()
  public abstract int getTotalStars()
  public abstract IUserTutorialAct getTutorialAct(TutorialActType)
  public abstract transient IRune giveRune(RuneData, String[])
  public abstract boolean hasAnyPromoCode()
  public abstract boolean hasExpeditionData()
  public abstract boolean hasFlag(UserFlag)
  public abstract boolean hasMaxStarHeroes()
  public abstract boolean hasNewSkins()
  public abstract boolean hasPromoCode(String)
  public abstract boolean hasQuestCounter(String)
  public abstract boolean hasSnapshotEvent(long)
  public abstract void incMonthlySignins()
  public abstract void incQuestCounter(String)
  public abstract void incQuestCounter(String, int)
  public abstract boolean isAutoRequested(HeroLineupType)
  public abstract boolean isSkinNew(ItemType)
  public abstract boolean likedHeroWallPost(long, long)
  public abstract IUserTutorialAct makeNewTutorialAct(TutorialActType)
  public abstract void recordHeroXPGain(IHero, int, String)
  public abstract void increaseExpeditionStageUnlocked(ModeDifficulty, int)
  public abstract void increaseGameModeCompetionCount(GameMode, ModeDifficulty)
  public abstract boolean isFastForwardRequested(HeroLineupType)
  public abstract boolean isMerchantPermUnlocked(MerchantType)
  public abstract boolean isThirdyPartyQuestUpdated(int, BuildSource)
  public abstract void resetPreviousEventDailySignins(long)
  public abstract void setFastForwardRequested(HeroLineupType, boolean)
  public abstract void setLastResourceGenerationTime(ResourceType, long)
  public abstract void setLastViewedWarBattle(long)
  public abstract void setMerchantAutoRefreshTime(MerchantType, long)
  public abstract void setMerchantCooldownEnd(MerchantType, long)
  public abstract void setMerchantExpiration(MerchantType, long)
  public abstract void setMerchantPermUnlocked(MerchantType, boolean)
  public abstract void setMerchantStaminaMemory(MerchantType, int)
  public abstract void setPreviousDailySignin(int, DailySignInClaimableStatus)
  public abstract void setPreviousEventDailySignin(long, long, DailySignInClaimableStatus)
  public abstract void setQuestCompletedCount(int, int)
  public abstract void removeHero(UnitType)
  public abstract void removeQuestCounter(String)
  public abstract void removeTutorial(TutorialActType)
  public abstract void resetDailyChances(String, int)
  public abstract void resetDailyUses(String, int)
  public abstract void resetRandom(RandomSeedType)
  public abstract void setSeed(RandomSeedType, long, String)
  public abstract void returnRandom(RandomSeedType)
  public abstract void setAppReviewStatus(AppReviewStatus)
  public abstract void setAutoRequested(HeroLineupType, boolean)
  public abstract void setAvatar(Avatar)
  public abstract void setBossPitStars(UnitType, ModeDifficulty, int, int)
  public abstract void setCooldownEnd(CooldownType, long)
  public abstract void setExpLootPool(int)
  public abstract void setFacebookID(long)
  public abstract void setGuildID(long)
  public abstract void setGuildRole(GuildRole)
  public abstract void setHeroLineup(HeroLineupType, HeroLineup)
  public abstract void setLastDailyReset(long)
  public abstract void setPreviousName(String)
  public abstract void setQuestCounter(String, int)
  public abstract void setShardID(int)
  public abstract void setTeamPower(int)
  public abstract void setTimeZoneID(String)
  public abstract void setTimeZoneOffset(int)
  public abstract void setTotalPower(int)
  public abstract void setTotalStars(int)
  public abstract void updateLootMemory(ItemType, float)
  public abstract void updateRuneMemory(int, int, float)
  public abstract void setQuestLastCompletedTime(int, long)
  public abstract void setSpecialEventsLastCheckedTime(long)
  public abstract void useCampaignMultiplierDrop(int, String, int, int)
  public abstract void setVIPLevel(int)
  public abstract transient void setResource(ResourceType, int, String[])
  public abstract transient void setResource(ResourceType, int, float, String[])
  public abstract void setMonthlySignins(int)
  public abstract int getMonthlySignins()
  public abstract void setDailyChances(String, int)
  public abstract long getGuildID()
  public abstract int getVIPLevel()
  public abstract void incDailyUses(String)
  public abstract void setTime(TimeType, long)
  public abstract void setCreationTime(long)
  public abstract long getCreationTime()
  public abstract long getID()
  public abstract void setLanguage(Language)
  public abstract long getTime(TimeType)
  public abstract int getCount(UserFlag)
  public abstract String getName()
  public abstract int getResource(ResourceType)
  public abstract void setName(String)
  public abstract Language getLanguage()
```

## com.perblue.rpg.game.objects.IUserTutorialAct
```
public abstract interface interface IUserTutorialAct

  // Methods (10)
  public abstract void setMaxStep(int)
  public abstract void setStep(int)
  public abstract int getMaxStep()
  public abstract int getStep()
  public abstract void setShouldUpdate(boolean)
  public abstract void setType(TutorialActType)
  public abstract void setUserID(long)
  public abstract void setVersion(int)
  public abstract int getVersion()
  public abstract TutorialActType getType()
```

## com.perblue.rpg.game.objects.ItemStack
```
public class ItemStack implements java.util.Map$Entry

  // Fields (2)
  public ItemType item
  public int quantity

  // Constructors (2)
  com.perblue.rpg.game.objects.ItemStack(ItemType)
  com.perblue.rpg.game.objects.ItemStack(ItemType, int)

  // Methods (6)
  public Integer getValue()
  public ItemType getKey()
  public Integer setValue(Integer)
```

## com.perblue.rpg.game.objects.Projectile
```
public class Projectile extends com.perblue.rpg.game.objects.Entity

  // Fields (9)
  private ParticleType customParticle
  private IDamageProvider damageProvider
  private boolean isClearable
  private q launchPosition
  private q launchTarget
  private float pitch
  private ItemType skin
  private IProjectileEffect source
  private ProjectileType type

  // Constructors (3)
  com.perblue.rpg.game.objects.Projectile(IScene, Entity)
  com.perblue.rpg.game.objects.Projectile(IScene, IDamageProvider, ProjectileType, Entity)
  com.perblue.rpg.game.objects.Projectile(IScene)

  // Methods (21)
  public int getMaxHP()
  public void setClearable(boolean)
  public boolean isClearable()
  public IDamageProvider getDamageProvider()
  public IProjectileEffect getActionSource()
  public void setProjectileEffect(IProjectileEffect)
  public ParticleType getCustomParticle()
  public q getLaunchPosition()
  public float getPitch()
  public void setCustomParticle(ParticleType)
  public void setDamageProvider(IDamageProvider)
  public void setLaunchPosition(q)
  public void setLaunchTarget(float, float, float)
  public void setLaunchTarget(q)
  public void setPitch(float)
  public q getLaunchTarget()
  public void setSkin(ItemType)
  public void setType(ProjectileType)
  public ItemType getSkin()
  public String toString()
  public ProjectileType getType()
```

## com.perblue.rpg.game.objects.ProjectileType
```
public final enum ProjectileType extends java.lang.Enum

  // Fields (212)
  private static final ProjectileType[] $VALUES
  public static final ProjectileType ANCIENT_DWARF_0
  public static final ProjectileType ANCIENT_DWARF_4
  public static final ProjectileType ANGELIC_HERALD_0
  public static final ProjectileType AQUATIC_1
  public static final ProjectileType ARCHER_ARROW
  public static final ProjectileType BANSHEE_0
  public static final ProjectileType BANSHEE_1
  public static final ProjectileType BARDBARIAN_0
  public static final ProjectileType BLACK_WING_0
  public static final ProjectileType BLACK_WING_1
  public static final ProjectileType BONE_DRAGON_0
  public static final ProjectileType BONE_DRAGON_1
  public static final ProjectileType BONE_DRAGON_2
  public static final ProjectileType BOUNCING_LIGHTNING
  public static final ProjectileType BRUTE_DRAGON_1
  public static final ProjectileType BRUTE_DRAGON_2
  public static final ProjectileType CATAPULT_KNIGHT_0
  public static final ProjectileType CATAPULT_KNIGHT_1
  public static final ProjectileType CATAPULT_KNIGHT_2
  public static final ProjectileType CATAPULT_KNIGHT_3
  public static final ProjectileType CATAPULT_KNIGHT_VICTORY
  public static final ProjectileType CENTAUR_OF_ATTENTION_0
  public static final ProjectileType CENTAUR_OF_ATTENTION_1
  public static final ProjectileType CENTAUR_OF_ATTENTION_2
  public static final ProjectileType CENTAUR_OF_ATTENTION_3
  public static final ProjectileType CENTAUR_OF_ATTENTION_6
  public static final ProjectileType COSMIC_ELF_0
  public static final ProjectileType COSMIC_ELF_3
  public static final ProjectileType CRIMSON_WITCH_WRAITH_0
  public static final ProjectileType CRIMSON_WITCH_WRAITH_1
  public static final ProjectileType CURSED_STATUE_0
  public static final ProjectileType CURSED_STATUE_1
  public static final ProjectileType CURSED_STATUE_3
  public static final ProjectileType CYCLOPS_WIZARD_0
  public static final ProjectileType CYCLOPS_WIZARD_1
  public static final ProjectileType CYCLOPS_WIZARD_2
  public static final ProjectileType CYCLOPS_WIZARD_3
  public static final ProjectileType DARK_DRACUL_0
  public static final ProjectileType DARK_DRACUL_1
  public static final ProjectileType DARK_HERO_1
  public static final ProjectileType DARK_HERO_2
  public static final ProjectileType DEEP_DRAGON_0
  public static final ProjectileType DEEP_DRAGON_3
  public static final ProjectileType DEEP_DRAGON_6
  public static final ProjectileType DOPPELGANGER_0
  public static final ProjectileType DOPPELGANGER_2
  public static final ProjectileType DRAGON_LADY_DRAGON
  public static final ProjectileType DRAGZILLA_0
  public static final ProjectileType DRAGZILLA_2
  public static final ProjectileType DRUIDINATRIX_1
  public static final ProjectileType DRUIDINATRIX_3
  public static final ProjectileType DUNGEON_MAN_0
  public static final ProjectileType DUNGEON_MAN_1
  public static final ProjectileType DUNGEON_MAN_2
  public static final ProjectileType DUST_DEVIL_0
  public static final ProjectileType DUST_DEVIL_1
  public static final ProjectileType DUST_DEVIL_2
  public static final ProjectileType DUST_DEVIL_3
  public static final ProjectileType DUST_DEVIL_4
  public static final ProjectileType DWARVEN_ARCHER_0
  public static final ProjectileType DWARVEN_ARCHER_2
  public static final ProjectileType ETERNAL_ENCHANTER_0
  public static final ProjectileType ETERNAL_ENCHANTER_2
  public static final ProjectileType FAITH_HEALER_BOOK_1
  public static final ProjectileType FAITH_HEALER_BOOK_2
  public static final ProjectileType FROST_GIANT_0
  public static final ProjectileType FROST_GIANT_1
  public static final ProjectileType FROST_GIANT_2
  public static final ProjectileType GENIE_0
  public static final ProjectileType GENIE_1
  public static final ProjectileType GENIE_TITAN
  public static final ProjectileType GRAND_HUNTRESS_0
  public static final ProjectileType GRAND_HUNTRESS_3
  public static final ProjectileType GROOVY_DRUID_0
  public static final ProjectileType GROOVY_DRUID_1
  public static final ProjectileType GROOVY_DRUID_2
  public static final ProjectileType KARAOKE_KING_0
  public static final ProjectileType KARAOKE_KING_2
  public static final ProjectileType LIGHTNING
  public static final ProjectileType MAGIC_DRAGON_0
  public static final ProjectileType MAGIC_DRAGON_1
  public static final ProjectileType MAGIC_DRAGON_2
  public static final ProjectileType MAGIC_DRAGON_3
  public static final ProjectileType MAGIC_DRAGON_VICTORY
  public static final ProjectileType MEDUSA_0
  public static final ProjectileType MEDUSA_1
  public static final ProjectileType MEDUSA_2
  public static final ProjectileType MEDUSA_3
  public static final ProjectileType MISTRESS_MANICURE_0
  public static final ProjectileType MISTRESS_MANICURE_3
  public static final ProjectileType MOON_DRAKE_ENERGY_BLUE
  public static final ProjectileType MOON_DRAKE_ENERGY_RED
  public static final ProjectileType MOON_DRAKE_LIGHT_BEAM
  public static final ProjectileType MYSTIC_WILDLING_0
  public static final ProjectileType NONE
  public static final ProjectileType NPC_ABYSS_DRAGON_0_0
  public static final ProjectileType NPC_ABYSS_DRAGON_0_1
  public static final ProjectileType NPC_ABYSS_DRAGON_0_2
  public static final ProjectileType NPC_ABYSS_DRAGON_1_0
  public static final ProjectileType NPC_ABYSS_DRAGON_1_1
  public static final ProjectileType NPC_ABYSS_DRAGON_2_0
  public static final ProjectileType NPC_ANUBIS_DRAGON_0
  public static final ProjectileType NPC_AOE_MAGIC_CRYSTAL
  public static final ProjectileType NPC_AOE_PHYS_CRYSTAL
  public static final ProjectileType NPC_BOSS_ANUBIS_DRAGON_0
  public static final ProjectileType NPC_CRYSTAL_LIZARD_0
  public static final ProjectileType NPC_EVIL_WIZARD_BOMB
  public static final ProjectileType NPC_EYEBALL_0
  public static final ProjectileType NPC_FIREBALL
  public static final ProjectileType NPC_GIANT_PLANT_SPEW_POISON
  public static final ProjectileType NPC_GOLD_COLOSSUS_GOLD
  public static final ProjectileType NPC_INFERNO_SPIDER_0
  public static final ProjectileType NPC_KING_IMP_0
  public static final ProjectileType NPC_LYING_LANTERN_1
  public static final ProjectileType NPC_MONSTER_PHYS_IMP
  public static final ProjectileType NPC_MUSHROOM_0
  public static final ProjectileType NPC_PLAGUE_SKULKER_1_RAT1
  public static final ProjectileType NPC_PLAGUE_SKULKER_1_RAT2
  public static final ProjectileType NPC_PLAGUE_SKULKER_1_RAT3
  public static final ProjectileType NPC_SCARECROW_0
  public static final ProjectileType NPC_SINISTER_ASSAILANT_1
  public static final ProjectileType NPC_SQUID_SQUIRT
  public static final ProjectileType NPC_SQUIRREL_0
  public static final ProjectileType PCH_ANUBIS_DRAGON_0
  public static final ProjectileType PCH_ANUBIS_DRAGON_1
  public static final ProjectileType PIRATE_0
  public static final ProjectileType PIRATE_1
  public static final ProjectileType PIRATE_3
  public static final ProjectileType PIRATE_4
  public static final ProjectileType PIRATE_5
  public static final ProjectileType PLAGUE_ENTREPRENEUR_2
  public static final ProjectileType PLANT_SOUL_1
  public static final ProjectileType RABID_DRAGON_0
  public static final ProjectileType RABID_DRAGON_2
  public static final ProjectileType RAGING_REVENANT_0
  public static final ProjectileType RAGING_REVENANT_1
  public static final ProjectileType RAGING_REVENANT_2
  public static final ProjectileType SADISTIC_DANCER_2_1
  public static final ProjectileType SADISTIC_DANCER_2_2
  public static final ProjectileType SATYR_1
  public static final ProjectileType SATYR_2
  public static final ProjectileType SHADOW_ASSASSIN_0
  public static final ProjectileType SHADOW_ASSASSIN_2
  public static final ProjectileType SHADOW_ASSASSIN_3
  public static final ProjectileType SKELETON_KING_0
  public static final ProjectileType SNAKE_DRAGON_SONIC_WAVE
  public static final ProjectileType SNIPER_WOLF_0
  public static final ProjectileType SOJOURNER_SORCERESS_0
  public static final ProjectileType SOJOURNER_SORCERESS_1
  public static final ProjectileType SOJOURNER_SORCERESS_2
  public static final ProjectileType SPECTRAL_DRAGON_0
  public static final ProjectileType SPECTRAL_DRAGON_1
  public static final ProjectileType SPECTRAL_DRAGON_2_0
  public static final ProjectileType SPECTRAL_DRAGON_2_0_SKIN_REDDRAGON
  public static final ProjectileType SPECTRAL_DRAGON_2_1
  public static final ProjectileType SPECTRAL_DRAGON_2_1_SKIN_REDDRAGON
  public static final ProjectileType SPECTRAL_DRAGON_2_2
  public static final ProjectileType SPECTRAL_DRAGON_2_2_SKIN_REDDRAGON
  public static final ProjectileType SPECTRAL_DRAGON_2_3
  public static final ProjectileType SPECTRAL_DRAGON_2_3_SKIN_REDDRAGON
  public static final ProjectileType SPECTRAL_DRAGON_2_4
  public static final ProjectileType SPECTRAL_DRAGON_2_5
  public static final ProjectileType SPECTRAL_DRAGON_2_6
  public static final ProjectileType SPECTRAL_DRAGON_2_7
  public static final ProjectileType SPECTRAL_DRAGON_4
  public static final ProjectileType SPIKEY_DRAGON_0_0
  public static final ProjectileType SPIKEY_DRAGON_0_1
  public static final ProjectileType SPIKEY_DRAGON_0_2
  public static final ProjectileType SPIKEY_DRAGON_0_3
  public static final ProjectileType SPIKEY_DRAGON_0_4
  public static final ProjectileType SPIKEY_DRAGON_1
  public static final ProjectileType SPIKEY_DRAGON_2
  public static final ProjectileType SPIKEY_DRAGON_3
  public static final ProjectileType STEPLADDER_BROTHERS_0
  public static final ProjectileType STEPLADDER_BROTHERS_1
  public static final ProjectileType STEPLADDER_BROTHERS_4
  public static final ProjectileType STORM_DRAGON_0
  public static final ProjectileType STORM_DRAGON_1
  public static final ProjectileType STORM_DRAGON_3
  public static final ProjectileType STOWAWAY_0
  public static final ProjectileType STOWAWAY_1
  public static final ProjectileType STOWAWAY_4
  public static final ProjectileType SUN_SEEKER_1
  public static final ProjectileType TOMB_ANGEL_0
  public static final ProjectileType TOMB_ANGEL_2
  public static final ProjectileType TRIPLE_THREAT_3
  public static final ProjectileType UNDERSTUDY_0
  public static final ProjectileType UNDERSTUDY_0_BEAM
  public static final ProjectileType UNDERSTUDY_1
  public static final ProjectileType UNDERSTUDY_1_HAND
  public static final ProjectileType UNDERSTUDY_2
  public static final ProjectileType UNDERSTUDY_6
  public static final ProjectileType UNRIPE_MYTHOLOGY_0
  public static final ProjectileType UNRIPE_MYTHOLOGY_1
  public static final ProjectileType UNRIPE_MYTHOLOGY_3
  public static final ProjectileType VERMILION_PRIESTESS_0
  public static final ProjectileType VERMILION_PRIESTESS_1
  public static final ProjectileType VOID_WYVERN_0
  public static final ProjectileType VOID_WYVERN_2
  public static final ProjectileType VOID_WYVERN_3
  public static final ProjectileType VULTURE_DRAGON_2
  public static final ProjectileType WEE_WITCH_0
  public static final ProjectileType WEE_WITCH_1
  public static final ProjectileType WEREDRAGON_0
  public static final ProjectileType WHITE_TIGRESS_0_0
  public static final ProjectileType WHITE_TIGRESS_0_1
  public static final ProjectileType WHITE_TIGRESS_0_2
  public static final ProjectileType WHITE_TIGRESS_1
  public static final ProjectileType WHITE_TIGRESS_3
  public static final ProjectileType WILDLING_ARCHER_0
  public static final ProjectileType WILDLING_SNIPER_0

  // Constructors (1)
  com.perblue.rpg.game.objects.ProjectileType(String, int)

  // Methods (2)
  public static ProjectileType[] values()
  public static ProjectileType valueOf(String)
```

## com.perblue.rpg.game.objects.RaidInstance
```
public class RaidInstance implements com.perblue.rpg.game.objects.IScene

  // Fields (32)
  protected a attackerInfos
  protected a attackers
  private boolean combatComplete
  private Runnable combatCompleteListener
  protected a defenders
  private a delayedActions
  protected a envEntities
  private a envEntitiesToAdd
  private a envEntitiesToRemove
  private EnvironmentType envType
  protected EntityGroup externalGroup
  protected a extraPreloadedUnits
  private EnumSet flags
  private boolean isCastingFreeze
  private boolean isCastingFreezeLastFrame
  private boolean isPVE
  protected boolean isUpdatingEntities
  protected a listeners
  private long nextEntityID
  protected int numStages
  protected a projectiles
  private a projectilesToAdd
  private a projectilesToRemove
  protected a random
  private y sceneInts
  private boolean shouldShowVictoryAnimations
  protected int stage
  protected a stageDefenderInfos
  private boolean stageEnded
  private a unitsToAdd
  private a unitsToRemove
  private boolean victory

  // Constructors (1)
  com.perblue.rpg.game.objects.RaidInstance(a)

  // Methods (74)
  protected void fireUnitCostumeRefresh(IEntity)
  public boolean hasTankAllies(Unit)
  public boolean isLastStage()
  public void refreshUnitCoffin(Unit)
  public void refreshUnitCostume(Unit)
  public void setSceneInt(SceneInt, int)
  private boolean isValidUnitsLeft(a, boolean)
  protected void fireEntityAdded(IEntity)
  public void addExternalEntity(Entity)
  protected void fireEntityRemoved(IEntity)
  public a getAlliesOfUnit(Unit)
  public a getAttackerInfos()
  public int getNumStages()
  public boolean isCastingFreezeLastFrame()
  public boolean shouldShowVictoryAnimations()
  public boolean removeExternalEntity(Entity)
  public void removeSceneListener(ISceneListener)
  protected void fireUnitRemoveRendering(IEntity)
  public int getDefendersRemaining()
  public int getDefendersRemaining(boolean)
  public a getOpponentsOfUnit(Unit)
  public EntityFactory getUnitFactory()
  public void setStage(int)
  public a getProjectiles()
  public boolean removeProjectile(Projectile)
  public void endStage()
  public int getSceneInt(SceneInt)
  public void addDelayedAction(Runnable)
  public EntityFactory getProjectileFactory()
  public void addProjectile(Projectile)
  public boolean isUpdatingEntities()
  public Random getRnd()
  public boolean isAttacker(Unit)
  public boolean isFlagSet(SceneFlag)
  public a getDefenders()
  public a getAttackers()
  public a getStageDefenderInfos()
  public a getExtraPreloadedUnits()
  public void addExtraPreloadedUnits(UnitType)
  public EnvironmentType getEnvType()
  public void addEnvEntity(EnvEntity)
  public a getEnvEntities()
  public boolean isAttackersLeft()
  public boolean isDefendersLeft()
  public boolean removeEnvEntity(EnvEntity)
  public int getNumberOfAttackers(boolean)
  public int getAttackersRemaining(boolean)
  public int getAttackersRemaining()
  public void killRemainingSummons()
  public void addSceneListener(ISceneListener)
  public void setStageEnded(boolean)
  public void setCombatComplete(boolean)
  public boolean isVictory()
  public void setIsVictory(boolean)
  public boolean isBattleOver()
  public boolean isStageEnded()
  public void setIsPVE(boolean)
  public void setNumStages(int)
  public void setAttackerInfos(a)
  public void addUnit(Unit)
  public boolean removeUnit(Unit)
  public a getExternalEntities()
  public void setStageDefenderInfos(a)
  public boolean isCombatComplete()
  public boolean isCastingFreeze()
  public int getWinningTeam()
  public void setCombatCompleteListener(Runnable)
  public void setShouldShowVictoryAnimations(boolean)
  public void setEnvType(EnvironmentType)
  public void setFlag(SceneFlag, boolean)
  public int getStage()
  public void setExtraPreloadedUnits(a)
  public void update(long, boolean)
  public void clear()
```

## com.perblue.rpg.game.objects.RuneBonus
```
public class RuneBonus implements com.perblue.rpg.game.objects.IRuneBonus

  // Fields (3)
  private RuneBonusType bonusType
  private StatType statType
  private int subLevel

  // Constructors (2)
  com.perblue.rpg.game.objects.RuneBonus()
  com.perblue.rpg.game.objects.RuneBonus(StatType, RuneBonusType)

  // Methods (7)
  public void setBonusType(RuneBonusType)
  public void setStatType(StatType)
  public void setSubLevel(int, String)
  public RuneBonusType getBonusType()
  public StatType getStatType()
  public int getSubLevel()
  public String toString()
```

## com.perblue.rpg.game.objects.RuneEventType
```
public final enum RuneEventType extends java.lang.Enum

  // Fields (11)
  private static final RuneEventType[] $VALUES
  public static final RuneEventType ADDED_SOULSTONE
  public static final RuneEventType ATTACHED
  public static final RuneEventType DEBUG_GIVE_RUNE
  public static final RuneEventType DESTROYED
  public static final RuneEventType EMPOWER_FAILED
  public static final RuneEventType EMPOWER_SUCCESS
  public static final RuneEventType FUSION_DESTROYED
  public static final RuneEventType FUSION_IMPROVED
  public static final RuneEventType REMOVED
  public static final RuneEventType SOLD

  // Constructors (1)
  com.perblue.rpg.game.objects.RuneEventType(String, int)

  // Methods (2)
  public static RuneEventType[] values()
  public static RuneEventType valueOf(String)
```

## com.perblue.rpg.game.objects.SceneFlag
```
public final enum SceneFlag extends java.lang.Enum

  // Fields (8)
  private static final SceneFlag[] $VALUES
  public static final SceneFlag ATTACKERS_ACTIVES_FREEZE
  public static final SceneFlag DEFENDERS_ACTIVES_FREEZE
  public static final SceneFlag DEFENDERS_GREEN_EYES
  public static final SceneFlag DONT_FADE_ON_REMOVE
  public static final SceneFlag DONT_SKEW_WORLD
  public static final SceneFlag ONLY_IDLE_AI
  public static final SceneFlag TEMPLE_SHADOW

  // Constructors (1)
  com.perblue.rpg.game.objects.SceneFlag(String, int)

  // Methods (2)
  public static SceneFlag[] values()
  public static SceneFlag valueOf(String)
```

## com.perblue.rpg.game.objects.SceneInt
```
public final enum SceneInt extends java.lang.Enum

  // Fields (3)
  private static final SceneInt[] $VALUES
  public static final SceneInt BOSS_STAGE
  private final int defaultValue

  // Constructors (1)
  com.perblue.rpg.game.objects.SceneInt(String, int, int)

  // Methods (3)
  public static SceneInt[] values()
  public static SceneInt valueOf(String)
  public final int getDefaultValue()
```

## com.perblue.rpg.game.objects.TitanBuffUnitData
```
public class TitanBuffUnitData extends com.perblue.rpg.game.objects.UnitData

  // Fields (1)
  private UnitType titanType

  // Constructors (1)
  com.perblue.rpg.game.objects.TitanBuffUnitData()

  // Methods (4)
  public UnitType getTitanType()
  public void setTitanType(UnitType)
  public boolean equals(Object)
  public int hashCode()
```

## com.perblue.rpg.game.objects.Unit
```
public class Unit extends com.perblue.rpg.game.objects.Entity

  // Fields (23)
  private static final Log LOG
  private static final long NO_TIME_OF_DEATH = -1
  private static final Comparator SKILL_COMPARATOR
  private int cachedPower
  private x cachedStats
  private boolean canBeRevived
  private CoffinState coffinState
  private a combatSkills
  private UnitType costume
  private UnitData data
  private q doorScissorPosition
  private boolean instantKill
  private boolean isCoffin
  private boolean isMoving
  private a lootItems
  private a queuedActions
  private UnitRenderable renderable
  private ShadowData shadowData
  private boolean shouldGiveGold
  private boolean showVictory
  private long skillsCooldown
  private float speedMultiplier
  private long timeOfDeath

  // Constructors (2)
  com.perblue.rpg.game.objects.Unit(IScene)
  com.perblue.rpg.game.objects.Unit()

  // Methods (74)
  public float getStat(StatType)
  public Iterable getLoot()
  public int getPower()
  public SectionType getSectionType()
  public void setEnergy(float)
  public void updateCachedStats()
  public int getMaxHP()
  public boolean hasTag(HeroTag)
  public boolean addBuff(IBuff, Entity)
  public float getAnimateSpeedMultiplier()
  public void dispose()
  protected boolean hasSpecialDeath()
  public boolean isWearingCostume()
  protected void onBuffsDirty()
  public void onDeath()
  protected void updateAfterActions(long, boolean)
  public boolean canBeRevived()
  public boolean isCoffin()
  public boolean isMoving()
  public boolean shouldGiveGold()
  public boolean showVictory()
  private void addSecondaryStats(x, StatType, float)
  public void addCombatSkill(CombatSkill)
  public void addLootItem(RewardDrop)
  public void addQueuedSkill(CombatRenderSkill)
  public void cancelSkills()
  public void clearCombatSkills()
  public void clearProjectiles()
  public void endStage()
  public CombatSkill getCombatSkill(SkillType)
  public CoffinState getCoffinState()
  public a getCombatSkills()
  public UnitType getCostume()
  public float getDeathFadeLength()
  public float getHPPercent()
  public float getMoveSpeed()
  public CombatSkill getQueuedSkill()
  public boolean isKill()
  public UnitRenderable getRenderable()
  public ShadowData getShadowData()
  public long getSkillsCooldown()
  public long getTimeOfDeath()
  public CombatSkill getActiveCombatSkill()
  public q getDoorScissorPosition()
  public void setDoorScissorPosition(q)
  public void initEnergy(float)
  public boolean isAttacking()
  public void removeCombatSkill(SkillType)
  public void runSkillsOnDeath()
  public void setCanBeRevived(boolean)
  public void setCoffinState(CoffinState)
  public void setCostume(UnitType)
  public void setData(UnitData)
  public void setIsCoffin(boolean)
  public void setMoving(boolean)
  public void setQueuedSkill(SkillType, boolean)
  public void setQueuedSkill(SkillType)
  public void setRenderable(UnitRenderable)
  public void setShadowData(ShadowData)
  public void setShouldGiveGold(boolean)
  public void setShowVictory(boolean)
  public void setSkillsCooldown(long)
  public void setSpeedMultiplier(float)
  public void setupQueuedSkills()
  public void unitDeath()
  public void unitRevive()
  public UnitData getData()
  public String toString()
  public Unit getParent()
```

## com.perblue.rpg.game.objects.UnitData
```
public class UnitData implements com.perblue.rpg.game.objects.IHero

  // Fields (23)
  private Set availableSkills
  private int bossBattleStageUnitId
  private int cachedPower
  private x cachedStats
  private DamageTypeData damageTypeData
  private int exp
  private float hpMultiplier
  private int id
  private boolean initialized
  private boolean isBoss
  private Map items
  private boolean legendary
  private int level
  private boolean mercenary
  private Map modePersistentData
  private Rarity rarity
  private Collection rewardDrops
  private Map runes
  private float scale
  private Map skills
  private ItemType skinType
  private int stars
  private UnitType type

  // Constructors (1)
  com.perblue.rpg.game.objects.UnitData()

  // Methods (69)
  public void setScale(float)
  public void setLevel(int)
  public void setRarity(Rarity)
  public void setStars(int)
  public void clearModePersistentData(GameMode)
  public int getBossBattleStageUnitId()
  public Map getModePersistentData()
  public HeroBattleData getOrCreateModePersistentData(GameMode)
  public void setBossBattleStageUnitId(int)
  public void setModePersistentData(Map)
  public void setLegendary(boolean)
  public void setSkinType(ItemType)
  public void setDamageTypeData(DamageTypeData)
  public void setSkillLevel(SkillType, int)
  public boolean isBoss()
  public void addRewardDrop(RewardDrop)
  public boolean canEquipItem(ItemType)
  public float getStat(StatType)
  public UnitData deepCopy()
  public void setEXP(int)
  public void setItem(HeroEquipSlot, ItemType)
  public void setItem(HeroEquipSlot, ClientEquippedItem)
  public void setRune(RuneEquipSlot, IRune)
  public Set getAvailableSkills()
  public DamageTypeData getDamageTypeData()
  public int getEnergy(GameMode)
  public Map getEquippedItems()
  public int getHP(GameMode)
  public float getHPMultiplier()
  public Collection getLoot()
  public int getPower()
  public float getScale()
  public SectionType getSectionType()
  public int getSkillLevel(SkillType)
  public Collection getSkillTypes()
  public Iterable getSkills()
  public ItemType getSkinType()
  public boolean isPlayerUnit()
  public void setEnergy(GameMode, int)
  public void setHP(GameMode, int)
  public void setHPMultiplier(float)
  public void updateCachedStats()
  public void setIsBoss(boolean)
  public void setMercenary(boolean)
  public UnitData simpleCopy()
  public boolean isLegendary()
  public boolean isMercenary()
  public int getLevel()
  public int getEXP()
  public ClientEquippedItem getItem(HeroEquipSlot)
  public Rarity getRarity()
  public Iterable getItems()
  public IRune getRuneByID(long)
  public Iterable getRunes()
  public IRune getRune(RuneEquipSlot)
  public int getStars()
  public void setType(UnitType)
  public void setInitialized(boolean)
  public void setID(int)
  public void setExtra(GameMode, HeroBattleDataExtraType, String)
  public String getExtra(GameMode, HeroBattleDataExtraType)
  public int getID()
  public String getDisplayName()
  public boolean equals(Object)
  public String toString()
  public int hashCode()
  public UnitType getType()
```

## com.perblue.rpg.game.objects.UnitDataExtended
```
public class UnitDataExtended extends com.perblue.rpg.game.objects.UnitData

  // Fields (1)
  public z stats

  // Constructors (1)
  com.perblue.rpg.game.objects.UnitDataExtended()
```

## com.perblue.rpg.game.objects.User
```
public class User implements com.perblue.rpg.game.objects.IUser

  // Fields (33)
  static final boolean $assertionsDisabled = true
  private ClientBossPit bossPit
  private p completedQuests
  private Map contestData
  private Map counts
  private long creationDate
  private String creationDateServerTxt
  private int diamonds
  private UserExtra extra
  private long facebookID
  private Set flags
  private long guildID
  private GuildRole guildRole
  private z heroes
  private boolean initialized
  private long lastLogin
  private Map levelsByChapter
  private Map levelsByKey
  private List lootMemoryChanges
  private a mailMessages
  private Map merchantData
  private Map merchantItems
  private Map randoms
  private a runes
  private int shardID
  private int teamLevel
  private int teamPower
  private int totalPower
  private int totalStars
  private Map tutorialActs
  private long userID
  private String userName
  private int vipLevel

  // Constructors (1)
  com.perblue.rpg.game.objects.User()

  // Methods (245)
  public int getEventSigninBonusMonthlySignin(long)
  public void setLastMonthlySigninTime(long)
  public long getLastMonthlySigninTime()
  public Map getEventSigninBonusLastSigninTimes()
  public void setEventSigninBonusLastSigninTime(long, long)
  public Iterable getDailyChanceTypes()
  public void clearUnclaimedArenaDemotion(ArenaType)
  public boolean hasViewedDailyQuest(Integer)
  public void setViewedDailyQuest(int)
  public void setEventSigninBonusMonthlySignins(long, int)
  public void resetPreviousDailySignins()
  public Map getEventSigninBonusMonthlySignins()
  public UnitData getHero(UnitType)
  public transient void addItem(ItemType, int, boolean, boolean, String[])
  public int getTeamLevel()
  public void setTeamLevel(int)
  public void markThirdPartyQuestUpdated(int, BuildSource)
  public void setLikedHeroWallPost(long, boolean)
  public void setViewedConsumableItem(ItemType)
  public void setPersonalMessageHideTime(long, long)
  public void setCount(UserFlag, int)
  public void setFlag(UserFlag, boolean)
  public void setDailyUses(String, int)
  public void incCount(UserFlag, int)
  public void incCount(UserFlag)
  private void onQuestProgress(String)
  public void addQuestCounter(String, int)
  public void removeRune(IRune)
  public void markSkinAsViewed(ItemType)
  public transient void removeItem(ItemType, int, String[])
  public int getMaxDailyChances(String)
  public Iterable getDailyUseTypes()
  public int getDailyUses(String)
  public int getExpLootPool()
  public long getFacebookID()
  public Iterable getFlagTypes()
  public GuildRole getGuildRole()
  public HeroLineup getHeroLineup(HeroLineupType)
  public Iterable getHeroes()
  public MercenaryHeroData getHiredMercenary(GameMode)
  public Map getIAPPurchases()
  public int getIAPPurchases(String)
  public Iterable getItems()
  public long getLastDailyReset()
  public long getLastLoginTime()
  public Map getLootMemory()
  public float getLootMemoryValue(ItemType)
  public Iterable getMailMessages()
  public String getPreviousName()
  public a getRandom(RandomSeedType)
  public long getSeed(RandomSeedType)
  public int getRealVIPLevel()
  public IRune getRuneByID(long)
  public int getRuneCount()
  public float getRuneMemoryValue(int, int)
  public Iterable getRunes()
  public int getItemAmount(ItemType)
  private int getResourceAmount(ResourceType)
  private void setCounts(Map)
  private void setFlags(Map)
  private void setMerchantData(Map)
  public Iterable getMerchantItems(MerchantType)
  public void setMerchantItems(MerchantType, List)
  public void addABGroup(String, int)
  public void addEventCompleted(long)
  public void addHero(UnitData)
  private void setCampaignLevelStatuses(List)
  public void addAutoAttackAvailable(GameMode, ModeDifficulty)
  public boolean isAutoAttackAvailable(GameMode, ModeDifficulty)
  public void addCampaignDropMultiplier(int, int)
  public int getEventCompletionCount(long)
  public void addItemEventMultiplier(UseItemEventType, Long)
  public void addQuestCounterIfNotExists(String, int)
  public boolean canPreTriggerActiveSkills()
  public void clearUnclaimedArenaPromotion(ArenaType)
  public Map getActiveDropMultipliers()
  public List getAndClearLootMemoryChanges()
  public int getBlockedSortIndex(long)
  public int getCampaignDropMultiplier()
  public int getCampaignMultiplierDropsLeft(int)
  public void markSkinAsNew(ItemType)
  public void addMailMessage(ClientMailMessage)
  public boolean addPromoCode(String)
  public int getQuestCounter(String)
  public void addRune(IRune)
  public void addTutorialAct(UserTutorialAct)
  public boolean checkResourceLevel(ResourceType, int)
  public void clearMercenaryHero(GameMode)
  public transient UnitData createHero(UnitType, Rarity, int, int, String[])
  public void decDailyChances(String)
  public int getDailyChances(String)
  public void deleteMailMessage(IMailMessage)
  public int getABGroup(String)
  public AppReviewStatus getAppReviewStatus()
  public Avatar getAvatar()
  public IBossPit getBossPit()
  public int getBossPitStars(UnitType, ModeDifficulty, int)
  public ClientCampaignLevelStatus getCampaignLevel(CampaignType, int, int)
  public a getCampaignLevels(CampaignType, int)
  public Map getContestData()
  public ClientContestData getContestData(long)
  public long getCooldownEnd(CooldownType)
  public Iterable getCountTypes()
  public String getCreationDateServerTxt()
  public Map getEventCompletionCountList()
  public long getEventSigninBonusLastSigninTime(long)
  public int getExpeditionStageCompletionCount(ModeDifficulty, int)
  public int getGameModeCompetionCount(GameMode, ModeDifficulty)
  public String getGameModeCompetionCountKey(GameMode, ModeDifficulty)
  public int getGameModeCompetionCountWithKey(String)
  public List getHeroLineupSummary(HeroLineupType)
  public long getItemEventMultiplier(UseItemEventType)
  public Map getItemEventMultipliers()
  public long getLastResourceGenerationTime(ResourceType)
  public int getMercenaryGoldEarned()
  public long getMerchantAutoRefreshTime(MerchantType)
  public long getMerchantCooldownEnd(MerchantType)
  public long getMerchantExpiration(MerchantType)
  public int getMerchantStaminaMemory(MerchantType)
  public long getPersonalMessageHideTime(long)
  public Map getPersonalMessageHideTime()
  public boolean getPersonalMessageHideTimeExists(long)
  public DailySignInClaimableStatus getPreviousDailySignin(int)
  public DailySignInClaimableStatus getPreviousEventDailySignin(long, long)
  public int getQuestCompletionCount(int)
  public long getQuestLastCompletedTime(int)
  public long getSpecialEventsLastCheckedTime()
  public int getTeamLevelAtEventStart(long)
  public int getUnclaimedArenaDemotionDivision(ArenaType)
  public ArenaTier getUnclaimedArenaDemotionTier(ArenaType)
  public int getUnclaimedArenaPromotionDivision(ArenaType)
  public ArenaTier getUnclaimedArenaPromotionTier(ArenaType)
  public boolean hasClaimedArenaReward(ArenaTier, int, ArenaType)
  public boolean hasViewedConsumableItem(ItemType)
  public int getShardID()
  public int getTeamPower()
  public String getTimeZoneID()
  public int getTimeZoneOffset()
  public int getTotalPower()
  public int getTotalStars()
  public IUserTutorialAct getTutorialAct(TutorialActType)
  public long getUserID()
  public transient IRune giveRune(RuneData, String[])
  public boolean hasAnyPromoCode()
  public boolean hasExpeditionData()
  public boolean hasFlag(UserFlag)
  public boolean hasMaxStarHeroes()
  public boolean hasNewSkins()
  public boolean hasPromoCode(String)
  public boolean hasQuestCounter(String)
  public boolean hasSnapshotEvent(long)
  public void incMonthlySignins()
  public void incQuestCounter(String, int)
  public void incQuestCounter(String)
  public void initMerchantData(MerchantType, MerchantData)
  public boolean isAutoRequested(HeroLineupType)
  public boolean isSkinNew(ItemType)
  public boolean likedHeroWallPost(long, long)
  public IUserTutorialAct makeNewTutorialAct(TutorialActType)
  public void recordHeroXPGain(UnitData, int, String)
  public void increaseExpeditionStageUnlocked(ModeDifficulty, int)
  public void increaseGameModeCompetionCount(GameMode, ModeDifficulty)
  public boolean isFastForwardRequested(HeroLineupType)
  public boolean isMerchantPermUnlocked(MerchantType)
  public boolean isThirdyPartyQuestUpdated(int, BuildSource)
  public void resetPreviousEventDailySignins(long)
  public void setCreationDateServerTxt(String)
  public void setFastForwardRequested(HeroLineupType, boolean)
  public void setLastResourceGenerationTime(ResourceType, long)
  public void setLastViewedWarBattle(long)
  public void setMerchantAutoRefreshTime(MerchantType, long)
  public void setMerchantCooldownEnd(MerchantType, long)
  public void setMerchantExpiration(MerchantType, long)
  public void setMerchantPermUnlocked(MerchantType, boolean)
  public void setMerchantStaminaMemory(MerchantType, int)
  public void setPreviousDailySignin(int, DailySignInClaimableStatus)
  public void setPreviousEventDailySignin(long, long, DailySignInClaimableStatus)
  public void setQuestCompletedCount(int, int)
  public void removeHero(UnitType)
  public void removeQuestCounter(String)
  public void removeTutorial(TutorialActType)
  public void resetDailyChances(String, int)
  public void resetDailyUses(String, int)
  public void resetRandom(RandomSeedType)
  public void setSeed(RandomSeedType, long, String)
  public void returnRandom(RandomSeedType)
  public void setAppReviewStatus(AppReviewStatus)
  public void setAutoRequested(HeroLineupType, boolean)
  public void setAvatar(Avatar)
  public void setBossPitStars(UnitType, ModeDifficulty, int, int)
  public void setContestData(Map)
  public void setCooldownEnd(CooldownType, long)
  public void setExpLootPool(int)
  public void setFacebookID(long)
  public void setGuildID(long)
  public void setGuildRole(GuildRole)
  public void setHeroLineup(HeroLineupType, HeroLineup)
  public void setHiredMercenary(GameMode, MercenaryHeroData)
  public void setInitialized(boolean)
  public void setLastDailyReset(long)
  public void setLastLoginTime(long)
  public void setMailMessages(Iterable)
  public void setPreviousName(String)
  public void setQuestCounter(String, int)
  public void setShardID(int)
  public void setTeamPower(int)
  public void setTimeZoneID(String)
  public void setTimeZoneOffset(int)
  public void setTotalPower(int)
  public void setTotalStars(int)
  public void setUserID(long)
  public void updateLootMemory(ItemType, float)
  public void updateRuneMemory(int, int, float)
  public void setQuestLastCompletedTime(int, long)
  public void setSpecialEventsLastCheckedTime(long)
  public void useCampaignMultiplierDrop(int, String, int, int)
  public void setVIPLevel(int)
  public transient void setResource(ResourceType, int, String[])
  public transient void setResource(ResourceType, int, float, String[])
  public void setMonthlySignins(int)
  public int getMonthlySignins()
  public void setDailyChances(String, int)
  public long getGuildID()
  public int getVIPLevel()
  public void incDailyUses(String)
  public void setTime(TimeType, long)
  public void setCreationTime(long)
  public long getCreationTime()
  public void setExtra(UserExtra, String)
  public UserExtra getExtra()
  public long getID()
  public void setLanguage(Language)
  public long getTime(TimeType)
  public int getCount(UserFlag)
  public String getName()
  public int getResource(ResourceType)
  public void setName(String)
  public Language getLanguage()
```

## com.perblue.rpg.game.objects.UserFlag
```
public final enum UserFlag extends java.lang.Enum

  // Fields (81)
  private static final UserFlag[] $VALUES
  public static final UserFlag AB_VIP5_FREE_CONSUMABLE_SHOULD_BE_GIVEN
  public static final UserFlag BETA_0_2
  public static final UserFlag BETA_0_3
  public static final UserFlag BOSS_BATTLE_COUNT
  public static final UserFlag BOSS_PIT_BATTLE_COUNT
  public static final UserFlag CAMPAIGN_BATTLES_DONE
  public static final UserFlag CAMPAIGN_KILLS
  public static final UserFlag CAMPAIGN_UNLOCKED
  public static final UserFlag CHATS
  public static final UserFlag CHAT_APP_REWARD_SENT
  public static final UserFlag COLISEUM_BATTLE_COUNT
  public static final UserFlag COLISEUM_RUNS
  public static final UserFlag COLISEUM_VICTORIES
  public static final UserFlag COMMUNITY_BUTTON_SHOWN_NAME_CHANGE_PROMPT
  public static final UserFlag CONTEST_PARTICIPATION_COUNT
  public static final UserFlag CRYPT_BATTLE_COUNT
  public static final UserFlag CRYPT_OPPONENTS_DEFEAT_COUNT
  public static final UserFlag CRYPT_OPPONENT_HEROES_DEFEAT_COUNT
  public static final UserFlag CRYPT_RAID_WIN_COUNT
  public static final UserFlag ELITE_CAMPAIGN_BATTLES_DONE
  public static final UserFlag EVENTS_WINDOW_ON_MAINSCREEN
  public static final UserFlag EVENT_10_CHEST_ROLLS
  public static final UserFlag EVENT_CHEST_ROLLS
  public static final UserFlag EXPEDITION_BATTLE_COUNT
  public static final UserFlag EXPEDITION_MAX_DIFFICULTY
  public static final UserFlag EXPERT_CAMPAIGN_BATTLES_DONE
  public static final UserFlag FACEBOOK_LIKED
  public static final UserFlag FAILED_AN_EMPOWER
  public static final UserFlag FIGHT_PIT_BATTLE_COUNT
  public static final UserFlag FIGHT_PIT_VICTORIES
  public static final UserFlag FREE_GOLD_CHEST_ROLLS
  public static final UserFlag FREE_NAME_CHANGE
  public static final UserFlag FREE_ORANGE_CHEST_ROLLS
  public static final UserFlag FREE_PURPLE_CHEST_ROLLS
  public static final UserFlag FREE_TIME_ZONE_RESET
  public static final UserFlag GOLD_10_CHEST_ROLLS
  public static final UserFlag GOLD_CHEST_ROLLS
  public static final UserFlag GOT_TUTORIAL_RUNE
  public static final UserFlag GOT_TUTORIAL_RUNE_OFFERING
  public static final UserFlag HAS_NEW_MAINSCREEN_CONTEST_PROGRESS
  public static final UserFlag HAS_SEEN_CONTEST_START
  public static final UserFlag HAS_SKIN_FOR_TUTORIAL
  public static final UserFlag HOW_TO_PLAY_EXPEDITION
  public static final UserFlag HOW_TO_PLAY_VIP
  public static final UserFlag IN_LAPSED_CATCH_UP_PERIOD
  public static final UserFlag IS_RUNE_TOGGLE_ON
  public static final UserFlag L15_RUNES_CREATED
  public static final UserFlag LAST_CRYPT_SCORE
  public static final UserFlag MERCENARY_GOLD
  public static final UserFlag MONTHLY_DIAMOND_DAYS
  public static final UserFlag MONTHLY_PURCHASE
  public static final UserFlag NEW_CHEST_SEEDS
  public static final UserFlag NOT_FIRST_ACCOUNT
  public static final UserFlag NO_LOOT_LAST_BATTLE
  public static final UserFlag OPTED_OUT_OF_WAR
  public static final UserFlag ORANGE_10_CHEST_ROLLS
  public static final UserFlag ORANGE_CHEST_ROLLS
  public static final UserFlag PAID_SOUL_CHEST_ROLLS
  public static final UserFlag PROMO_CODE_ATTEMPTS
  public static final UserFlag PURPLE_10_CHEST_ROLLS
  public static final UserFlag PURPLE_CHEST_ROLLS
  public static final UserFlag REPLAYKIT_COUNT
  public static final UserFlag SILVER_10_CHEST_ROLLS
  public static final UserFlag SILVER_CHEST_ROLLS
  public static final UserFlag SOUL_CHEST_ROLLS
  public static final UserFlag TEMPLE_INVITES
  public static final UserFlag TEMPLE_STAMINA_MEMORY
  public static final UserFlag TEMPLE_WIN_COUNT
  public static final UserFlag TEMPLE_WIN_STREAK
  public static final UserFlag TEMPROARY_VIP_LEVEL
  public static final UserFlag TITANS_KILLED
  public static final UserFlag TUTORIAL_RIGGED_RUNE_SHRINE
  public static final UserFlag UNLOCKED_HARD_EXPEDITION
  public static final UserFlag VIEWED_BATTLE_STATS
  public static final UserFlag VIEWED_CRYPT_RESULTS
  public static final UserFlag VIEWED_LAST_CHANCE_PROMO_WINDOW
  public static final UserFlag VIEWED_SOULMART_INFO
  public static final UserFlag VIP_TICKET_FIXED
  public static final UserFlag WAR_ATTACK_ATTEMPTS
  public static final UserFlag WW_1_0

  // Constructors (1)
  com.perblue.rpg.game.objects.UserFlag(String, int)

  // Methods (3)
  public final boolean isAvailable(ContentUpdate)
  public static UserFlag[] values()
  public static UserFlag valueOf(String)
```

## com.perblue.rpg.game.objects.UserProperty
```
public final enum UserProperty extends java.lang.Enum

  // Fields (26)
  private static final UserProperty[] $VALUES
  public static final UserProperty AVATAR
  public static final UserProperty BAZAAR_TOKENS
  public static final UserProperty COLISEUM_TOKENS
  public static final UserProperty DIAMONDS
  public static final UserProperty EXPEDITION_TOKENS
  public static final UserProperty FIGHT_TOKENS
  public static final UserProperty GOLD
  public static final UserProperty GUILD
  public static final UserProperty GUILD_TOKENS
  public static final UserProperty GUILD_WAR_TOKENS
  public static final UserProperty HEROES
  public static final UserProperty ITEMS
  public static final UserProperty LANGUAGE
  public static final UserProperty MAILBOX
  public static final UserProperty MONTHLY_CARD
  public static final UserProperty NAME
  public static final UserProperty QUEST_PROGRESS
  public static final UserProperty RUNICITE
  public static final UserProperty SIGNIN
  public static final UserProperty SOULMART_TOKENS
  public static final UserProperty STAMINA
  public static final UserProperty TEAM_LEVEL
  public static final UserProperty TEAM_XP
  public static final UserProperty VIP_LEVEL
  public static final UserProperty VIP_TICKETS

  // Constructors (1)
  com.perblue.rpg.game.objects.UserProperty(String, int)

  // Methods (3)
  public static UserProperty get(ResourceType)
  public static UserProperty[] values()
  public static UserProperty valueOf(String)
```

## com.perblue.rpg.game.objects.UserTutorialAct
```
public class UserTutorialAct implements com.perblue.rpg.game.objects.IUserTutorialAct

  // Fields (4)
  private int maxStep
  private int step
  private TutorialActType type
  private int version

  // Constructors (1)
  com.perblue.rpg.game.objects.UserTutorialAct()

  // Methods (11)
  public void setMaxStep(int)
  public void setStep(int)
  public int getMaxStep()
  public int getStep()
  public void setShouldUpdate(boolean)
  public void setType(TutorialActType)
  public void setUserID(long)
  public void setVersion(int)
  public int getVersion()
  public String toString()
  public TutorialActType getType()
```

## com.perblue.rpg.game.specialevent.BirthdayEvent
```
public class BirthdayEvent extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (2)
  private RewardDrop drop
  private List dropList

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BirthdayEvent()

  // Methods (3)
  public void refreshInternal(long, SpecialEventsHelperState)
  public List getRewards()
  public boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo
```
public class BossBattleCampaignInfo

  // Fields (1)
  private q chapter

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleCampaignInfo()

  // Methods (4)
  public ChapterData getChapter(int)
  public int getNumLevels(int)
  public void setChapter(int, ChapterData)
  public int getNumChapters()
```

## com.perblue.rpg.game.specialevent.BossBattleInfo
```
public class BossBattleInfo extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (10)
  public Integer backgroundID
  public BossBattleCampaignInfo campaignInfo
  public String entryBackground
  public String eventName
  public String eventText
  public Map fieldBuffList
  public q layers
  public ArrayList timeBonusList
  public UnitType unitType
  public WarModifierType warModifierType

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleInfo()

  // Methods (30)
  public boolean isBossLevel(int, int)
  public boolean isLastChapterAndLastLevel(int, int)
  public List getDistributionTimeBonuses(int, List)
  public List getDistributionTimeBonusRanks(int)
  public List getDistributionTimeBonusRanks(int, List)
  public List getStageEnemyData(int, int)
  public void refreshInternal(long, SpecialEventsHelperState)
  public Integer getBackgroundID()
  public UnitType getBossUnitType()
  public BossBattleCampaignInfo getBossBattleCampaignInfo()
  public List getStageFieldBuffData(int, int)
  public String getEntryBackgorund()
  public String getEventName()
  public String getEventText()
  public Map getFieldBuff()
  public q getLayers()
  public String getRank(int)
  public String getStageNumber(int, int)
  public List getTimeBonus()
  protected void loadSpecific(t)
  protected void loadLayers(t)
  protected void loadStageSettings(t)
  protected void loadFileData(BossBattleEnum, String, int)
  protected void loadFieldBuff(List, List, int)
  protected void loadTimeBonus(List, List)
  protected void loadStageData(List, List, int)
  protected void loadLayerSetting(int, t)
  protected List loadReward(String)
   boolean load(SpecialEventType, t, int)
  public BossBattleLayer getLayer(int)
```

## com.perblue.rpg.game.specialevent.ChestDiscount
```
public class ChestDiscount extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (2)
  private List chests
  private MultiplierDouble discount

  // Constructors (1)
  com.perblue.rpg.game.specialevent.ChestDiscount()

  // Methods (2)
  protected void refreshInternal(long, SpecialEventsHelperState)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.ContestEvent
```
public class ContestEvent extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (6)
  private String contestSummary
  private String contestTitle
  private RewardMessage message
  private int progressTableGroupID
  private int rankTableGroupID
  private int taskTableGroupID

  // Constructors (1)
  com.perblue.rpg.game.specialevent.ContestEvent()

  // Methods (8)
  public String getContestSummary()
  public String getContestTitle()
  public void modifyExtra(MailExtra)
  public MailType getMailType(MailType)
  public int getProgressTableGroupID()
  public int getRankTableGroupID()
  public int getTaskTableGroupID()
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.ContestInfo
```
public class ContestInfo

  // Fields (4)
  public ContestEvent eventInfo
  public ContestProgressRewards progressRewards
  public ContestRankRewards rankRewards
  public ContestTasks tasks

  // Constructors (1)
  com.perblue.rpg.game.specialevent.ContestInfo(ContestEvent)
```

## com.perblue.rpg.game.specialevent.CraftSuccess
```
 class CraftSuccess extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (1)
  private Map dropList

  // Constructors (1)
  com.perblue.rpg.game.specialevent.CraftSuccess()

  // Methods (2)
  public void refreshInternal(long, SpecialEventsHelperState)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.DisableSkins
```
 class DisableSkins extends com.perblue.rpg.game.specialevent.SkinSpecialEvent

  // Constructors (1)
  com.perblue.rpg.game.specialevent.DisableSkins()

  // Methods (1)
  protected void refreshInternal(long, SpecialEventsHelperState)
```

## com.perblue.rpg.game.specialevent.DropBonus
```
 class DropBonus extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (3)
  private List affectedGameModes
  private StuffFilter filter
  private MultiplierInt multiplier

  // Constructors (1)
  com.perblue.rpg.game.specialevent.DropBonus()

  // Methods (2)
  public void refreshInternal(long, SpecialEventsHelperState)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.EventChestData
```
public class EventChestData

  // Fields (14)
  public List bulletPoints
  public Integer buy1Price
  public Integer buyXAmount
  public String chestDetailsScreenInfo
  public String chestDetailsScreenTitle
  public String chestSelectionCardInfo
  public String chestSelectionCardTitle
  public ResourceType currency
  public String headingOne
  public String headingTwo
  public String image
  public String info
  public EventChestStats stats
  public String windowTitle

  // Constructors (1)
  com.perblue.rpg.game.specialevent.EventChestData()
```

## com.perblue.rpg.game.specialevent.EventReward
```
public class EventReward

  // Fields (3)
  private List drops
  private RewardSpecialEvent info
  private RewardMessage message

  // Constructors (1)
  com.perblue.rpg.game.specialevent.EventReward(List, RewardMessage, RewardSpecialEvent)

  // Methods (4)
   void setDrops(List)
  public List getDrops()
  public RewardSpecialEvent getInfo()
  public RewardMessage getMessage()
```

## com.perblue.rpg.game.specialevent.EventSigninBonus
```
public class EventSigninBonus extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (9)
  private static final String VIEW_SCHEDULE_TXT = Until 
  private int comeBackDay
  private long endTime
  private String infoTxt
  private boolean isViewSchedule
  private Map signinItemList
  private long startTime
  private String titleTxt
  private String windowBorderImageName

  // Constructors (1)
  com.perblue.rpg.game.specialevent.EventSigninBonus()

  // Methods (9)
  public Map getSigninItemList()
  public String getScheduleTxt(User)
  public int getComeBackDay()
  public String getWIndowBorderImageName()
  public String getTitleTxt()
  public String getInfoTxt()
  public void refreshInternal(long, SpecialEventsHelperState)
  public boolean isOpen(IUser, long)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.ExtraChest
```
 class ExtraChest extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (1)
  private EventChestData data

  // Constructors (1)
  com.perblue.rpg.game.specialevent.ExtraChest()

  // Methods (2)
  public void refreshInternal(long, SpecialEventsHelperState)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.FirstDailyPurchaseEvent
```
 class FirstDailyPurchaseEvent extends com.perblue.rpg.game.specialevent.PurchaseEvent

  // Constructors (1)
  com.perblue.rpg.game.specialevent.FirstDailyPurchaseEvent()

  // Methods (1)
  public boolean isUserEligibleInternal(IUser, long, boolean, boolean, boolean)
```

## com.perblue.rpg.game.specialevent.FirstPurchaseEvent
```
 class FirstPurchaseEvent extends com.perblue.rpg.game.specialevent.PurchaseEvent

  // Constructors (1)
  com.perblue.rpg.game.specialevent.FirstPurchaseEvent()

  // Methods (1)
  public boolean isUserEligibleInternal(IUser, long, boolean, boolean, boolean)
```

## com.perblue.rpg.game.specialevent.GuildGiftPurchaseEvent
```
public class GuildGiftPurchaseEvent extends com.perblue.rpg.game.specialevent.PurchaseEvent

  // Fields (2)
  private RewardMessage guildMessage
  private List guildRewards

  // Constructors (1)
  com.perblue.rpg.game.specialevent.GuildGiftPurchaseEvent()

  // Methods (3)
  protected void addRewards(IUser, List, List, int)
  protected EventReward getGuildRewards(int)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.MerchantDiscount
```
public class MerchantDiscount extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (3)
  private StuffFilter filter
  private MultiplierDouble multiplier
  private List types

  // Constructors (1)
  com.perblue.rpg.game.specialevent.MerchantDiscount()

  // Methods (2)
  protected void refreshInternal(long, SpecialEventsHelperState)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.MerchantRefreshDiscount
```
 class MerchantRefreshDiscount extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (2)
  private MultiplierDouble multiplier
  private List types

  // Constructors (1)
  com.perblue.rpg.game.specialevent.MerchantRefreshDiscount()

  // Methods (2)
  protected void refreshInternal(long, SpecialEventsHelperState)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.MiscBonus
```
public class MiscBonus extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (2)
  private List multFilter
  private MultiplierDouble multiplier

  // Constructors (1)
  com.perblue.rpg.game.specialevent.MiscBonus()

  // Methods (2)
  public void refreshInternal(long, SpecialEventsHelperState)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.MiscDiscount
```
 class MiscDiscount extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (2)
  private MultiplierType multType
  private MultiplierDouble multiplier

  // Constructors (1)
  com.perblue.rpg.game.specialevent.MiscDiscount(MultiplierType)

  // Methods (2)
  protected void refreshInternal(long, SpecialEventsHelperState)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.ModesOpen
```
 class ModesOpen extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (1)
  private List openModes

  // Constructors (1)
  com.perblue.rpg.game.specialevent.ModesOpen()

  // Methods (2)
  protected void refreshInternal(long, SpecialEventsHelperState)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.Multiplier
```
abstract class Multiplier

  // Fields (1)
  protected final Object multiplier

  // Constructors (1)
  com.perblue.rpg.game.specialevent.Multiplier(Object)

  // Methods (5)
  public void applyAll(Map, List)
  public void applyAll(Map, Object[])
  public Object getMultiplier()
  public void apply(Map, Object)
  protected abstract Object multiply(Object)
```

## com.perblue.rpg.game.specialevent.MultiplierDouble
```
 class MultiplierDouble extends com.perblue.rpg.game.specialevent.Multiplier

  // Constructors (1)
  com.perblue.rpg.game.specialevent.MultiplierDouble(Double)

  // Methods (2)
  protected Double multiply(Double)
```

## com.perblue.rpg.game.specialevent.MultiplierInt
```
 class MultiplierInt extends com.perblue.rpg.game.specialevent.Multiplier

  // Constructors (1)
  com.perblue.rpg.game.specialevent.MultiplierInt(Integer)

  // Methods (2)
  protected Integer multiply(Integer)
```

## com.perblue.rpg.game.specialevent.PurchaseEvent
```
public class PurchaseEvent extends com.perblue.rpg.game.specialevent.RewardSpecialEvent

  // Fields (4)
  protected boolean ladderRewards
  protected int maxRewardTimes
  protected int maxStackTimes
  protected int requiredPurchaseAmount

  // Constructors (1)
  com.perblue.rpg.game.specialevent.PurchaseEvent()

  // Methods (6)
  public void modifyExtra(MailExtra)
  protected void addRewards(IUser, List, List, int)
  public void onStorePurchase(IUser, int, List, List)
  public boolean isUserEligibleInternal(IUser, long, boolean, boolean, boolean)
  public final boolean isLadderRewards()
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.RewardMessage
```
public class RewardMessage

  // Fields (5)
  private String body
  private String icon
  private String sender
  private String subject
  private MailType type

  // Constructors (1)
  com.perblue.rpg.game.specialevent.RewardMessage()

  // Methods (7)
  public void modifyExtra(MailExtra)
  public String getBody()
  public String getIcon()
  public String getSender()
  public String getSubject()
  public void load(t)
  public MailType getType()
```

## com.perblue.rpg.game.specialevent.RewardSpecialEvent
```
public class RewardSpecialEvent extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (2)
  private RewardMessage message
  private List rewards

  // Constructors (1)
  com.perblue.rpg.game.specialevent.RewardSpecialEvent()

  // Methods (5)
  protected static void loadRewards(List, t)
  public List getRewards()
  protected EventReward getRewards(RewardSpecialEvent, int)
  protected EventReward getRewards(RewardSpecialEvent, int, int)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.RuneShrineDiscount
```
 class RuneShrineDiscount extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (2)
  private MultiplierDouble multiplier
  private RuneShrineType shrineType

  // Constructors (1)
  com.perblue.rpg.game.specialevent.RuneShrineDiscount()

  // Methods (2)
  protected void refreshInternal(long, SpecialEventsHelperState)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.ShopBonus
```
public class ShopBonus extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (2)
  private List affectedMerchants
  private int multiplier

  // Constructors (1)
  com.perblue.rpg.game.specialevent.ShopBonus()

  // Methods (2)
  public void refreshInternal(long, SpecialEventsHelperState)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.SkinDiscount
```
 class SkinDiscount extends com.perblue.rpg.game.specialevent.SkinSpecialEvent

  // Fields (1)
  private MultiplierDouble discount

  // Constructors (1)
  com.perblue.rpg.game.specialevent.SkinDiscount()

  // Methods (2)
  protected void refreshInternal(long, SpecialEventsHelperState)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.SkinSpecialEvent
```
abstract class SkinSpecialEvent extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (1)
  protected List skins

  // Constructors (1)
  com.perblue.rpg.game.specialevent.SkinSpecialEvent()

  // Methods (1)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.SparseRange
```
public class SparseRange

  // Fields (2)
  static final boolean $assertionsDisabled = true
  private List ranges

  // Constructors (1)
  com.perblue.rpg.game.specialevent.SparseRange()

  // Methods (4)
  public List getRanges()
  public void loadFromString(String)
  public void unionRange(long, long)
  public boolean contains(long)
```

## com.perblue.rpg.game.specialevent.SpecialEventBuilder
```
public class SpecialEventBuilder

  // Fields (1)
  public static final Log LOG

  // Constructors (1)
  com.perblue.rpg.game.specialevent.SpecialEventBuilder()

  // Methods (9)
  private static void fillContestList(Collection, List, int)
  private static SpecialEventInfo instantiate(SpecialEventType)
  private static void fillEventList(Collection, List, int)
  public static ContestRaw makeContestRaw(ContestInfo, SpecialEventRaw)
  public static void updateSpecialEvents(SpecialEvents, Collection, Collection, int)
  public static ContestInfo buildContest(ContestRaw, int)
  public static SpecialEventInfo buildEvent(String, int)
  public static List buildContests(Collection, int)
  public static SpecialEvents buildEvents(SpecialEventsRaw, int)
```

## com.perblue.rpg.game.specialevent.SpecialEventInfo
```
public class SpecialEventInfo

  // Fields (33)
  public SparseRange RegisterdDateList
  public String abTestCategory
  public int abTestGroup
  public String action
  public long begin
  public String button
  public Integer completionCount
  public Long completionPreviousID
  public String details
  public long end
  public Long eventID
  public boolean hasTappedInfoButton
  public boolean hidden
  public String image
  public Long maxTimeSinceUserSpend
  public Long maxUserAge
  public Integer maxUserLevel
  public Integer maxUserPurchases
  public Integer maxUserSpend
  public Long minTimeSinceUserSpend
  public Long minUserAge
  public Integer minUserLevel
  public Integer minUserPurchases
  public Integer minUserSpend
  public String promoCode
  public boolean snapshotCriteria
  public int sortIndex
  public String summary
  public Long timeLastSeen
  public String title
  public SpecialEventType type
  public SparseRange userIDRange
  public long visibleAfter

  // Constructors (1)
  com.perblue.rpg.game.specialevent.SpecialEventInfo()

  // Methods (44)
  private void loadDisplayInformation(t)
  public Long getMaxTimeSinceUserSpend()
  public Integer getMaxUserPurchases()
  public Long getMinTimeSinceUserSpend()
  public Integer getMinUserPurchases()
  public SparseRange getRegisterdDateList()
  public boolean isUserEligibleInternal(IUser, long, boolean, boolean, boolean)
  protected void modifyExtraInternal(MailExtra)
  protected void refreshInternal(long, SpecialEventsHelperState)
  protected static MultiplierDouble loadDiscount(t)
  protected static void loadEnumFilter(Class, List, t, String)
  private void loadTarget(t)
  private void loadTargeting(t)
  private void loadTargets(t)
  private boolean loadTimeRange(t, int)
  private boolean loadTimeRanges(t, int)
  public String getAction()
  public long getBegin()
  public String getButton()
  public String getDetails()
  public long getEnd()
  public String getImage()
  public Long getMaxUserAge()
  public Integer getMaxUserLevel()
  public Integer getMaxUserSpend()
  public Long getMinUserAge()
  public Integer getMinUserLevel()
  public Integer getMinUserSpend()
  public String getPromoCode()
  public int getSortIndex()
  public String getSummary()
  public String getTitle()
  public SparseRange getUserIDRange()
  public long getVisibleAfter()
  public boolean isLadderRewards()
  public boolean isSnapshotCriteria()
  public List getRewards()
  protected static RewardDrop loadReward(t)
  public final void refresh(long, SpecialEventsHelperState)
  protected static void ensure(boolean, String)
  public long getID()
   boolean load(SpecialEventType, t, int)
  public SpecialEventType getType()
  public boolean isHidden()
```

## com.perblue.rpg.game.specialevent.SpecialEventType
```
public final enum SpecialEventType extends java.lang.Enum

  // Fields (30)
  private static final SpecialEventType[] $VALUES
  public static final SpecialEventType ALCHEMY_DISCOUNT
  public static final SpecialEventType BIRTHDAY
  public static final SpecialEventType BOSS_BATTLE
  public static final SpecialEventType CHEST_DISCOUNT
  public static final SpecialEventType CONTEST
  public static final SpecialEventType CRAFT_SUCCESS
  public static final SpecialEventType DISABLE_SKIN_BUY
  public static final SpecialEventType DROP_BONUS
  public static final SpecialEventType EVENT_SIGNIN_BONUS
  public static final SpecialEventType EXTRA_CHEST
  public static final SpecialEventType FREE_STUFF_AFTER_FIRST_DAILY_PURCHASE
  public static final SpecialEventType FREE_STUFF_AFTER_FIRST_PURCHASE
  public static final SpecialEventType FREE_STUFF_AFTER_PURCHASE
  public static final SpecialEventType FREE_STUFF_AT_TEAM_LEVEL
  public static final SpecialEventType FREE_STUFF_EVERY_X_TEAM_LEVEL
  public static final SpecialEventType GENERIC
  public static final SpecialEventType GUILD_GIFT_AFTER_PURCHASE
  public static final SpecialEventType MISC_BONUS
  public static final SpecialEventType MODES_OPEN
  public static final SpecialEventType RUNE_OFFERING_PACKAGE_DISCOUNT
  public static final SpecialEventType RUNE_REMOVAL_DISCOUNT
  public static final SpecialEventType RUNE_SHRINE_COST_DISCOUNT
  public static final SpecialEventType RUNICITE_ALCHEMY_DISCOUNT
  public static final SpecialEventType SHOP_BONUS
  public static final SpecialEventType SKIN_BUY_DISCOUNT
  public static final SpecialEventType STAMINA_DISCOUNT
  public static final SpecialEventType TRADER_DISCOUNT
  public static final SpecialEventType TRADER_REFRESH_DISCOUNT
  public static final SpecialEventType XP_BONUS

  // Constructors (1)
  com.perblue.rpg.game.specialevent.SpecialEventType(String, int)

  // Methods (2)
  public static SpecialEventType[] values()
  public static SpecialEventType valueOf(String)
```

## com.perblue.rpg.game.specialevent.SpecialEvents
```
public class SpecialEvents

  // Fields (4)
  public Boolean changed
  private List contests
  private List events
  public SigninRewards signinRewards

  // Constructors (1)
  com.perblue.rpg.game.specialevent.SpecialEvents()

  // Methods (7)
  public void setEvents(List)
  public List getContests()
  public void addOrUpdateContest(ContestInfo)
  public void addOrUpdateEvent(SpecialEventInfo)
  public List getEvents()
  public boolean deleteContestOrEvent(long)
  public void setContests(List)
```

## com.perblue.rpg.game.specialevent.SpecialEventsHelperState
```
public class SpecialEventsHelperState

  // Fields (20)
  private RewardDrop birthdayReward
  private Map bossBattles
  private Map chestMultipliers
  private long chestSaleStartTime
  private Map contestInfoMap
  private Map contestTaskTypeMap
  private Map craftSuccessList
  private Set disabledSkins
  private EventChestData eventChestData
  private Map eventSigninList
  private final long generationTime
  private Map merchantMultipliers
  private Map merchantRefreshMultipliers
  private Map miscMultipliers
  private Map modeMultipliers
  private long nextRefresh
  private Set openModes
  private Map runeShrineMulipliers
  private Map skinMultipliers
  private List teamLevelChallenges

  // Constructors (1)
  com.perblue.rpg.game.specialevent.SpecialEventsHelperState(long)

  // Methods (30)
  public Map getChestMultipliers()
  public long getChestSaleStartTime()
  public Map getContestTaskTypeMap()
  public Map getMerchantMultipliers()
  public Map getMerchantRefreshMultipliers()
  public GameModeMultipliers getOrCreateModeMultipliers(GameMode, SpecialEventInfo)
  public Map getRuneShrineMulipliers()
  public List getTeamLevelChallenges()
  public void setChestSaleStartTime(long)
  public Map getCraftSuccess(Rarity)
  public Map getMiscMultipliers()
  public RewardDrop getBirthdayReward()
  public BossBattleInfo getBossBattle(long)
  public Map getBossBattles()
  public Map getContestInfoMap()
  public Set getDisabledSkins()
  public EventChestData getEventChestData()
  public EventSigninBonus getEventSignin(long)
  public Map getEventSignins()
  public GameModeMultipliers getModeMultipliers(GameMode)
  public long getNextRefresh()
  public Set getOpenModes()
  public Map getSkinMultipliers()
  public boolean isValidAt(long)
  public void setBirthdayReward(RewardDrop)
  public void setCraftSuccess(Map)
  public void setEventChestData(EventChestData)
  public void setEventSignin(EventSigninBonus)
  public void setBossBattle(BossBattleInfo)
  public void refreshAtOrBefore(long)
```

## com.perblue.rpg.game.specialevent.StuffFilter
```
 class StuffFilter

  // Fields (4)
  private static final Log LOG
  private ItemType[] items
  private Integer[] resourceItemIndices
  private ResourceType[] resources

  // Constructors (1)
  com.perblue.rpg.game.specialevent.StuffFilter(ItemType[], ResourceType[], Integer[])

  // Methods (4)
  public void applyBonus(GameModeMultipliers, MultiplierInt)
  static Integer[] makeIndices(EnumSet, EnumSet)
  public void applyDiscount(MerchantMultipliers, MultiplierDouble)
  static StuffFilter load(t)
```

## com.perblue.rpg.game.specialevent.TargetAttribute
```
abstract enum TargetAttribute extends java.lang.Enum

  // Fields (6)
  private static final TargetAttribute[] $VALUES
  public static final TargetAttribute DAYS_SINCE_SPEND
  public static final TargetAttribute PURCHASE_COUNT
  public static final TargetAttribute SPEND_AMOUNT
  public static final TargetAttribute TEAM_LEVEL
  public static final TargetAttribute USER_AGE

  // Constructors (2)
  com.perblue.rpg.game.specialevent.TargetAttribute(String, int)

  // Methods (4)
  abstract void setMin(SpecialEventInfo, long)
  abstract void setMax(SpecialEventInfo, long)
  public static TargetAttribute[] values()
  public static TargetAttribute valueOf(String)
```

## com.perblue.rpg.game.specialevent.TeamAtLevelEvent
```
public class TeamAtLevelEvent extends com.perblue.rpg.game.specialevent.TeamLevelEvent

  // Fields (1)
  protected int requiredLevel

  // Constructors (1)
  com.perblue.rpg.game.specialevent.TeamAtLevelEvent()

  // Methods (5)
  public int getMailLevel(IUser)
  public void getTeamLevelChallengeRewards(int, List)
  public boolean isUserEligibleInternal(IUser, long, boolean, boolean, boolean)
  public void onTeamLevelChange(IUser, int, int, List)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.TeamLevelEvent
```
public abstract class TeamLevelEvent extends com.perblue.rpg.game.specialevent.RewardSpecialEvent

  // Constructors (1)
  com.perblue.rpg.game.specialevent.TeamLevelEvent()

  // Methods (5)
  protected abstract int getMailLevel(IUser)
  public void modifyExtra(MailExtra, IUser)
  public abstract void getTeamLevelChallengeRewards(int, List)
  protected void refreshInternal(long, SpecialEventsHelperState)
  public abstract void onTeamLevelChange(IUser, int, int, List)
```

## com.perblue.rpg.game.specialevent.TeamLevelRecordEvent
```
public class TeamLevelRecordEvent extends com.perblue.rpg.game.specialevent.TeamLevelEvent

  // Fields (1)
  protected int numLevels

  // Constructors (1)
  com.perblue.rpg.game.specialevent.TeamLevelRecordEvent()

  // Methods (4)
  public int getMailLevel(IUser)
  public void getTeamLevelChallengeRewards(int, List)
  public void onTeamLevelChange(IUser, int, int, List)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.specialevent.XPBonus
```
 class XPBonus extends com.perblue.rpg.game.specialevent.SpecialEventInfo

  // Fields (1)
  private Integer xpBonus

  // Constructors (1)
  com.perblue.rpg.game.specialevent.XPBonus()

  // Methods (2)
  public void refreshInternal(long, SpecialEventsHelperState)
   boolean load(SpecialEventType, t, int)
```

## com.perblue.rpg.game.tutorial.AbstractTutorialAct
```
abstract class AbstractTutorialAct

  // Constructors (1)
  com.perblue.rpg.game.tutorial.AbstractTutorialAct()

  // Methods (22)
  protected boolean isOnScreenWithDropDownMenu()
  public abstract void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  protected BaseModalWindow getTopModalWindowOfType(Class)
  protected void addNarrator(List, String, NarratorState)
  protected void addNarrator(List, String)
  protected void changeStep(IUser, IUserTutorialAct, int)
  protected void changeStepForce(IUser, IUserTutorialAct, int)
  public TutCompletionState getCompletionState(IUser, IUserTutorialAct)
  protected BaseModalWindow getTopModalWindow()
  protected boolean isAnyPopupShowing()
  protected boolean isModalWindowOnTop(Class)
  protected boolean isOnScreen(Class)
  public static boolean isSideMenuOpen()
  public static boolean isUIElementShowing(String)
  public abstract int getMaxStep()
  public abstract boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public abstract void getNarrators(IUser, IUserTutorialAct, List)
  public abstract void getPointers(IUser, IUserTutorialAct, List)
  public final boolean isCompleted(IUser, IUserTutorialAct)
  public abstract int getVersion()
  public abstract void clear()
  public abstract TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.AchievementsActV1
```
 class AchievementsActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (6)
  public static final int QUEST_ID = 10004
  private static final int S_CLAIM_ACHIEVEMENT = 3
  private static final int S_DONE = 4
  private static final int S_INITAL = 0
  private static final int S_OPEN_ACHIEVEMENTS = 2
  private static final int S_OPEN_HUD_MENU = 1

  // Constructors (1)
  com.perblue.rpg.game.tutorial.AchievementsActV1()

  // Methods (9)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean hasSpecificAchievementToClaim(IUser)
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.ArenaActV1
```
 class ArenaActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (7)
  private static final int S_DONE = 6
  private static final int S_INITAL = 0
  private static final int S_OUTCOME = 5
  private static final int S_PICK_LINEUP = 3
  private static final int S_TAP_FIGHT = 4
  private static final int S_TAP_FIGHT_PIT = 1
  private static final int S_TAP_OPPONENT = 2

  // Constructors (1)
  com.perblue.rpg.game.tutorial.ArenaActV1()

  // Methods (10)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean hasArenaUnlocked(IUser)
  private boolean isFightPitScreen(BaseScreen)
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.AutoFightActV1
```
 class AutoFightActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (3)
  private static final int S_DONE = 2
  private static final int S_INITAL = 0
  private static final int S_TAP_AUTO_FIGHT = 1

  // Constructors (1)
  com.perblue.rpg.game.tutorial.AutoFightActV1()

  // Methods (9)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean canAutoFight()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.BossPitActV1
```
 class BossPitActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (9)
  private static final int S_DONE = 8
  private static final int S_HERO_PICKER_INFO = 5
  private static final int S_INITAL = 0
  private static final int S_TAP_BOSS_PIT = 1
  private static final int S_TAP_CONTINUE = 3
  private static final int S_TAP_DIFFICULT = 4
  private static final int S_TAP_EVIL_WIZARD = 2
  private static final int S_VICTORY_INFO = 7
  private static final int S_WAIT_FOR_VICTORY = 6

  // Constructors (1)
  com.perblue.rpg.game.tutorial.BossPitActV1()

  // Methods (11)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean isOnBossPitStage(BaseScreen, UnitType, BossState)
  private boolean isOnBossPitStage(UnitType, BossState)
  private boolean hasBossPitUnlockedAndWizardAvalible(IUser)
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.BossStoryAct
```
abstract class BossStoryAct extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (8)
  private static final String PREFIX = STAGE_
  private static final int STEP_RANGE_PER_LEVEL = 1
  private static final String TYPE_POST_COMBAT = POST
  private static final String TYPE_PRE_COMBAT = PRE
  private String currentTapToContinueType
  private List narrators
  private int nextNarratorIndex
  private LootBattleVictoryWindow victoryWindow

  // Constructors (1)
  com.perblue.rpg.game.tutorial.BossStoryAct()

  // Methods (14)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private Narrator getNarrator(String)
  private int getBossPhaseNumber(BaseScreen)
  private boolean isTop(NarratorLocation)
  private boolean locationsConflict(NarratorLocation, NarratorLocation)
  private void prepNextNarrator(int, String)
  private boolean testNextNarrator(int, String)
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  protected abstract UnitType getBossUnitType()
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
```

## com.perblue.rpg.game.tutorial.CraftingActV1
```
 class CraftingActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (8)
  private static final int S_DONE = 7
  private static final int S_FINAL_MSG = 6
  private static final int S_INITAL = 0
  private static final int S_TAP_CRAFT = 2
  private static final int S_TAP_EQUIP = 3
  private static final int S_TAP_INGREDIENT = 5
  private static final int S_TAP_SLOT = 1
  private static final int S_WAIT_FOR_WINDOW_CLOSE = 4

  // Constructors (1)
  com.perblue.rpg.game.tutorial.CraftingActV1()

  // Methods (10)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private int getCraftableSlot(IUser)
  private boolean isCraftingWingOut()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.CryptRaidActV1
```
 class CryptRaidActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (8)
  private static final int S_DIALOG_1 = 2
  private static final int S_DIALOG_2 = 3
  private static final int S_DONE = 7
  private static final int S_INITAL = 0
  private static final int S_PICK_LINEUP = 5
  private static final int S_TAP_CRYPT = 1
  private static final int S_TAP_FIGHT = 6
  private static final int S_TAP_OPPONENT = 4

  // Constructors (1)
  com.perblue.rpg.game.tutorial.CryptRaidActV1()

  // Methods (10)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean isInGuild()
  private boolean hasCryptUnlocked(IUser)
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.DailyQuestActV1
```
 class DailyQuestActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (8)
  private static final int QUEST_ID = 8
  private static final int S_CLAIM_REWARD = 3
  private static final int S_DONE = 6
  private static final int S_FINAL_MSG_1 = 4
  private static final int S_FINAL_MSG_2 = 5
  private static final int S_INITAL = 0
  private static final int S_OPEN_DAILY_QUEST_MENU = 2
  private static final int S_OPEN_HUD_MENU = 1

  // Constructors (1)
  com.perblue.rpg.game.tutorial.DailyQuestActV1()

  // Methods (9)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean hasSpecificQuestToClaim(IUser)
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.DefaultTutorialAct
```
public class DefaultTutorialAct extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Constructors (1)
  com.perblue.rpg.game.tutorial.DefaultTutorialAct()

  // Methods (9)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  public TutCompletionState getCompletionState(IUser, IUserTutorialAct)
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.EnchantingActV1
```
 class EnchantingActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (8)
  private static final int S_ADD_ITEMS = 4
  private static final int S_DONE = 7
  private static final int S_ENCHANT = 5
  private static final int S_FINAL_MSG = 6
  private static final int S_INITAL = 0
  private static final int S_OPEN_ENCHANTING = 1
  private static final int S_SELECT_GEAR = 3
  private static final int S_SELECT_HERO = 2

  // Constructors (1)
  com.perblue.rpg.game.tutorial.EnchantingActV1()

  // Methods (13)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private int getEnchantableGearIndex()
  private boolean heroHasItemToEnchant(IHero)
  private boolean isItemToEnchant(IEquippedItem)
  private int getNewState(IUser)
  private boolean hasItemToEnchant(IUser)
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.EquippingHeroActV1
```
 class EquippingHeroActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (3)
  private static final int S_DONE = 2
  private static final int S_EQUIP_FOURTH_HERO = 1
  private static final int S_INITAL = 0

  // Constructors (1)
  com.perblue.rpg.game.tutorial.EquippingHeroActV1()

  // Methods (10)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean has4HeroesEquipped()
  private boolean has4thHeroToEquip()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.EvilWizardStory
```
public class EvilWizardStory extends com.perblue.rpg.game.tutorial.BossStoryAct

  // Constructors (1)
  com.perblue.rpg.game.tutorial.EvilWizardStory()

  // Methods (10)
  protected UnitType getBossUnitType()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.EvolvingHeroActV1
```
 class EvolvingHeroActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (8)
  private static final int S_DONE = 7
  private static final int S_FINAL_MSG = 6
  private static final int S_INITAL = 0
  private static final int S_OPEN_HERO_MENU = 2
  private static final int S_OPEN_HERO_YOU_CAN_EVOLVE = 3
  private static final int S_OPEN_MAIN_MENU = 1
  private static final int S_TAP_CONFIRM = 5
  private static final int S_TAP_EVOLVE = 4

  // Constructors (1)
  com.perblue.rpg.game.tutorial.EvolvingHeroActV1()

  // Methods (11)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private UIComponentName getEvolveCompName()
  private boolean hasHeroToEvolve()
  private boolean isShowingHeroYouCanEvolve()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.GiantPlantStory
```
public class GiantPlantStory extends com.perblue.rpg.game.tutorial.BossStoryAct

  // Constructors (1)
  com.perblue.rpg.game.tutorial.GiantPlantStory()

  // Methods (10)
  protected UnitType getBossUnitType()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.GoldenColossusStory
```
public class GoldenColossusStory extends com.perblue.rpg.game.tutorial.BossStoryAct

  // Constructors (1)
  com.perblue.rpg.game.tutorial.GoldenColossusStory()

  // Methods (10)
  protected UnitType getBossUnitType()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.GuildWarActV1
```
public class GuildWarActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (13)
  private static final int S_ATTACK_INFO = 11
  private static final int S_DEFENSE_INFO = 4
  private static final int S_DONE = 12
  private static final int S_INITAL = 0
  private static final int S_LINEUP_1_INFO = 6
  private static final int S_TAP_ATTACKABLE_LINEUP = 10
  private static final int S_TAP_DEFENSE = 3
  private static final int S_TAP_EDIT_FIRST_LINEUP = 5
  private static final int S_TAP_EDIT_SECOND_LINEUP = 8
  private static final int S_TAP_ENEMY_ICON = 9
  private static final int S_TAP_GUILD_WAR = 1
  private static final int S_WAIT_FOR_DEFENSE_SCREEN = 7
  private static final int S_WAR_INFO = 2

  // Constructors (1)
  com.perblue.rpg.game.tutorial.GuildWarActV1()

  // Methods (13)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean isWarScreenLoading()
  private boolean hasWarUnlockedAndAvailable(IUser)
  private boolean onWarScreenWithRecommendedTarget()
  private boolean onWarAttackDetailsWithAttackableLineup()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.IntroTutorialActV0
```
 class IntroTutorialActV0 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Constructors (1)
  com.perblue.rpg.game.tutorial.IntroTutorialActV0()

  // Methods (9)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  public TutCompletionState getCompletionState(IUser, IUserTutorialAct)
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.IntroTutorialActV1
```
 class IntroTutorialActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (72)
  private static final int P_LAST_STEP_OF_INTERLUDE = 40
  private static final int S_CLOSE_CENTAUR = 56
  private static final int S_CLOSE_GOLD_CHEST_POPUP = 47
  private static final int S_CLOSE_HERO_LIST = 57
  private static final int S_CONTINUE_ON_COMBAT_INFO = 60
  private static final int S_CONTINUE_ON_VICTORY = 70
  private static final int S_DONE = 72
  private static final int S_INITAL = 0
  private static final int S_INTERLUDE_DIALOG_A = 29
  private static final int S_INTERLUDE_DIALOG_B = 30
  private static final int S_INTERLUDE_DIALOG_C = 31
  private static final int S_INTERLUDE_DIALOG_D = 32
  private static final int S_INTERLUDE_DIALOG_E = 33
  private static final int S_INTRO_COMBAT_CAST_1 = 7
  private static final int S_INTRO_COMBAT_CAST_2 = 9
  private static final int S_INTRO_COMBAT_CAST_3 = 11
  private static final int S_INTRO_COMBAT_CAST_4 = 13
  private static final int S_INTRO_COMBAT_DIALOG_1_A = 2
  private static final int S_INTRO_COMBAT_DIALOG_1_B = 3
  private static final int S_INTRO_COMBAT_DIALOG_1_C = 4
  private static final int S_INTRO_COMBAT_DIALOG_1_D = 5
  private static final int S_INTRO_COMBAT_DIALOG_2_A = 15
  private static final int S_INTRO_COMBAT_DIALOG_2_B = 16
  private static final int S_INTRO_COMBAT_PRE_WAIT_1 = 1
  private static final int S_INTRO_COMBAT_VFX = 17
  private static final int S_INTRO_COMBAT_WAIT_1 = 6
  private static final int S_INTRO_COMBAT_WAIT_2 = 8
  private static final int S_INTRO_COMBAT_WAIT_3 = 10
  private static final int S_INTRO_COMBAT_WAIT_4 = 12
  private static final int S_INTRO_COMBAT_WAIT_5 = 14
  private static final int S_OPEN_CAMPAIGN_SCREEN = 58
  private static final int S_OPEN_CHEST_SCREEN = 41
  private static final int S_OPEN_FIRST_LEVEL = 59
  private static final int S_OPEN_GOLD_CHEST_MENU = 42
  private static final int S_OPEN_HERO_MENU = 52
  private static final int S_OPEN_MAIN_MENU = 51
  private static final int S_OPEN_SILVER_CHEST_MENU = 48
  private static final int S_ROLL_GOLD_CHEST = 43
  private static final int S_ROLL_SILVER_CHEST = 49
  private static final int S_SELECT_CENTAUR = 53
  private static final int S_SELECT_HEROS = 61
  private static final int S_START_BATTLE = 62
  private static final int S_TAP_EQUIPMENT_SLOT = 54
  private static final int S_TAP_EQUIP_BUTTON = 55
  private static final int S_TAP_THROUGH_GOLD_CHEST = 44
  private static final int S_TAP_THROUGH_SILVER_CHEST = 50
  private static final int S_TEMP_COMBAT_DIALOG_1_A = 19
  private static final int S_TEMP_COMBAT_DIALOG_1_B = 21
  private static final int S_TEMP_COMBAT_DIALOG_1_C = 22
  private static final int S_TEMP_COMBAT_DIALOG_1_D = 23
  private static final int S_TEMP_COMBAT_DIALOG_1_E = 24
  private static final int S_TEMP_COMBAT_DIALOG_1_F = 25
  private static final int S_TEMP_COMBAT_DIALOG_1_G = 26
  private static final int S_TEMP_COMBAT_DIALOG_2_A = 28
  private static final int S_TEMP_COMBAT_ENEMIES_ENTER = 20
  private static final int S_TEMP_COMBAT_PRE_WAIT_1 = 18
  private static final int S_TEMP_COMBAT_WAIT_1 = 27
  private static final int S_TUT_CLOSING_REMARK = 71
  private static final int S_TUT_DIALOG_1_A = 35
  private static final int S_TUT_DIALOG_1_B = 36
  private static final int S_TUT_DIALOG_1_E = 39
  private static final int S_TUT_DIALOG_1_F = 40
  private static final int S_TUT_DIALOG_2_A = 45
  private static final int S_TUT_DIALOG_2_B = 46
  private static final int S_TUT_DIALOG_3_A = 65
  private static final int S_TUT_DIALOG_3_B = 66
  private static final int S_TUT_DIALOG_3_C = 67
  private static final int S_TUT_DIALOG_3_D = 68
  private static final int S_TUT_PRE_WAIT_1 = 64
  private static final int S_TUT_WAIT_FOR_COMBAT = 69
  private static final int S_TUT_WAIT_FOR_STAGE_3 = 63
  private boolean transitioningOut

  // Constructors (1)
  com.perblue.rpg.game.tutorial.IntroTutorialActV1()

  // Methods (18)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  static int getHeroIndexToEquip()
  private void playDeathScene()
  private void pushStartScreen()
  private boolean hasCentaurRigged(IUser)
  private boolean hasCrownEquiped(IUser)
  private boolean hasCrownRigged(IUser)
  private void pushInterludeScreen()
  private TutorialAttackScreen startCombat1()
  private TutorialAttackScreen startCombat2()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.LegendaryQuestInfoActV1
```
 class LegendaryQuestInfoActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (3)
  private static final int S_DONE = 2
  private static final int S_OPEN_SKILLS_TAB = 0
  private static final int S_TAP_UNLOCK = 1

  // Constructors (1)
  com.perblue.rpg.game.tutorial.LegendaryQuestInfoActV1()

  // Methods (10)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean isPromtionAnimationInProgress()
  public boolean isViewingHeroWithLegendaryQuest(IUser)
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.LegendaryQuestStoryAct
```
 class LegendaryQuestStoryAct extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (6)
  private static final String PREFIX = QUEST_
  private static final int S_DONE = 7
  private TutorialActType actType
  private List narrators
  private int nextNarratorIndex
  private UnitType unitType

  // Constructors (1)
  com.perblue.rpg.game.tutorial.LegendaryQuestStoryAct(UnitType, TutorialActType)

  // Methods (17)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  public TutCompletionState getCompletionState(IUser, IUserTutorialAct)
  private Narrator getNarrator(String)
  private boolean isTop(NarratorLocation)
  private boolean locationsConflict(NarratorLocation, NarratorLocation)
  private void prepNextNarrator(int)
  private boolean testNextNarrator(int)
  private boolean isPathToLegendaryForMyHeroShowing()
  private int getQuestStep(IUser)
  protected UnitType getHeroUnitType()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.MysticClosetActV1
```
public class MysticClosetActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (12)
  private static final int S_ARROW_TO_CAVE = 2
  private static final int S_ARROW_TO_SCROLL = 5
  private static final int S_ARROW_TO_UNDERSTUDY = 6
  private static final int S_DIALOG_1 = 4
  private static final int S_DONE = 11
  private static final int S_INITIAL = 0
  private static final int S_LEAVE_SCREEN = 10
  private static final int S_NOTICE_CLOSET = 1
  private static final int S_OPENED_MYSTIC_CLOSET = 3
  private static final int S_TAP_FOR_MASTERY_SKIN = 8
  private static final int S_TAP_TO_CONTINUE = 9
  private static final int S_WRONG_HERO_SELECTED = 7

  // Constructors (1)
  com.perblue.rpg.game.tutorial.MysticClosetActV1()

  // Methods (10)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean hasUnderstudyMastery(IUser)
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.MysticClosetActV2
```
public class MysticClosetActV2 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (5)
  private static final int S_ARROW_TO_BUTTON = 3
  private static final int S_ARROW_TO_HERO = 2
  private static final int S_DIALOGUE_1 = 1
  private static final int S_DONE = 4
  private static final int S_INITIAL = 0

  // Constructors (1)
  com.perblue.rpg.game.tutorial.MysticClosetActV2()

  // Methods (10)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  public static boolean isUIElementShowing(String)
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.Narrator
```
public class Narrator

  // Fields (5)
  private NarratorCloseCallback closeCallback
  private final NarratorLocation location
  private final NarratorType narratorType
  private NarratorState state
  private final String text

  // Constructors (2)
  com.perblue.rpg.game.tutorial.Narrator(NarratorLocation, String, NarratorType)
  com.perblue.rpg.game.tutorial.Narrator(NarratorLocation, String)

  // Methods (7)
  public Narrator setCloseCallback(NarratorCloseCallback)
  public NarratorCloseCallback getCloseCallback()
  public NarratorType getNarratorType()
  public void setState(NarratorState)
  public String getText()
  public NarratorLocation getLocation()
  public NarratorState getState()
```

## com.perblue.rpg.game.tutorial.NarratorLocation
```
public final enum NarratorLocation extends java.lang.Enum

  // Fields (5)
  private static final NarratorLocation[] $VALUES
  public static final NarratorLocation LOWER_LEFT
  public static final NarratorLocation LOWER_RIGHT
  public static final NarratorLocation UPPER_LEFT
  public static final NarratorLocation UPPER_RIGHT

  // Constructors (1)
  com.perblue.rpg.game.tutorial.NarratorLocation(String, int)

  // Methods (2)
  public static NarratorLocation[] values()
  public static NarratorLocation valueOf(String)
```

## com.perblue.rpg.game.tutorial.NarratorState
```
public final enum NarratorState extends java.lang.Enum

  // Fields (4)
  private static final NarratorState[] $VALUES
  public static final NarratorState DEEMPHASISED
  public static final NarratorState NORMAL
  public static final NarratorState TAP_TO_CONTINUE

  // Constructors (1)
  com.perblue.rpg.game.tutorial.NarratorState(String, int)

  // Methods (2)
  public static NarratorState[] values()
  public static NarratorState valueOf(String)
```

## com.perblue.rpg.game.tutorial.NarratorType
```
public final enum NarratorType extends java.lang.Enum

  // Fields (156)
  private static final NarratorType[] $VALUES
  public static final NarratorType ABYSS_DRAGON
  public static final NarratorType ABYSS_DRAGON_POSSESSED
  public static final NarratorType ANCIENT_DWARF
  public static final NarratorType ANCIENT_DWARF_POSSESSED
  public static final NarratorType ANGELIC_AVENGER
  public static final NarratorType ANGELIC_HERALD
  public static final NarratorType ANGEL_DRAGON
  public static final NarratorType ANGEL_DRAGON_POSSESSED
  public static final NarratorType ANUBIS_DRAGON
  public static final NarratorType ANUBIS_DRAGON_POSSESSED
  public static final NarratorType AQUATIC_MAN
  public static final NarratorType BANSHEE
  public static final NarratorType BARDBARIAN
  public static final NarratorType BLACK_WING
  public static final NarratorType BLACK_WING_POSSESSED
  public static final NarratorType BONE_DRAGON
  public static final NarratorType BONE_DRAGON_POSSESSED
  public static final NarratorType BROZERKER
  public static final NarratorType BROZERKER_POSSESSED
  public static final NarratorType BULWARK_ANGEL
  public static final NarratorType CATAPULT_KNIGHT
  public static final NarratorType CENTAUR_MASTERY
  public static final NarratorType CENTAUR_OF_ATTENTION
  public static final NarratorType CENTAUR_OF_ATTENTION_CHEST_HAIR
  public static final NarratorType CENTAUR_OF_ATTENTION_SNAKE_HAT
  public static final NarratorType CLAW_MAN
  public static final NarratorType CRIMSON_WITCH
  public static final NarratorType CRIMSON_WITCH_POSSESSED
  public static final NarratorType DARK_DRACUL
  public static final NarratorType DARK_DRACUL_POSSESSED
  public static final NarratorType DARK_HERO
  public static final NarratorType DARK_HORSE
  public static final NarratorType DEEP_DRAGON
  public static final NarratorType DEEP_DRAGON_POSSESSED
  public static final NarratorType DEMON_TOTEM
  public static final NarratorType DEMON_TOTEM_BLUE
  public static final NarratorType DEMON_TOTEM_GREEN
  public static final NarratorType DEMON_TOTEM_RED
  public static final NarratorType DIGGER_MOLE
  public static final NarratorType DIGGER_MOLE_POSSESSED
  public static final NarratorType DRAGON_LADY
  public static final NarratorType DRAGON_SLAYER
  public static final NarratorType DRAGON_SLAYER_POSSESSED
  public static final NarratorType DRAGZILLA
  public static final NarratorType DRAGZILLA_POSSESSED
  public static final NarratorType DRUIDINATRIX
  public static final NarratorType DUNGEON_MAN
  public static final NarratorType DUST_DEVIL
  public static final NarratorType DUST_DEVIL_POSSESSED
  public static final NarratorType DWARVEN_ARCHER
  public static final NarratorType ELECTROYETI
  public static final NarratorType ELECTROYETI_MASTERY
  public static final NarratorType ELECTROYETI_POSSESSED
  public static final NarratorType ETERNAL_ENCHANTER
  public static final NarratorType EVERYONE
  public static final NarratorType EVIL_WIZARD
  public static final NarratorType FAITH_HEALER
  public static final NarratorType FORGOTTEN_DRAGON
  public static final NarratorType FORGOTTEN_DRAGON_POSSESSED
  public static final NarratorType FROST_GIANT
  public static final NarratorType GENIE
  public static final NarratorType GIANT_PLANT
  public static final NarratorType GOBLIN
  public static final NarratorType GOLDEN_COLOSSUS
  public static final NarratorType GRAND_HUNTRESS
  public static final NarratorType GRAND_HUNTRESS_POSSESSED
  public static final NarratorType GREED_DRAGON
  public static final NarratorType GREED_DRAGON_POSSESSED
  public static final NarratorType GROOVY_DRUID
  public static final NarratorType HYDRA
  public static final NarratorType HYDRA_POSSESSED
  public static final NarratorType KARAOKE_KING
  public static final NarratorType KARAOKE_KING_POSSESSED
  public static final NarratorType KING_IMP
  public static final NarratorType LAST_DEFENDER
  public static final NarratorType LAST_DEFENDER_POSSESSED
  public static final NarratorType MAGIC_DRAGON
  public static final NarratorType MAGIC_DRAGON_POSSESSED
  public static final NarratorType MEDUSA
  public static final NarratorType MINOTAUR
  public static final NarratorType MOON_DRAKE
  public static final NarratorType MOON_DRAKE_POSSESSED
  public static final NarratorType MR_SMASHY_ANGRY
  public static final NarratorType MR_SMASHY_HAPPY
  public static final NarratorType NINJA_DWARF
  public static final NarratorType NPC_SINISTER_ASSAILANT_POSSESSED
  public static final NarratorType NPC_UMLAUT_THE_FIFTH_FIRST
  public static final NarratorType NPC_UMLAUT_THE_FIFTH_FIRST_POSSESSED
  public static final NarratorType ORC_MONK
  public static final NarratorType PCH_ANUBIS_DRAGON
  public static final NarratorType PCH_ANUBIS_DRAGON_POSSESSED
  public static final NarratorType PIRATE
  public static final NarratorType PLANT_SOUL
  public static final NarratorType POLEMASTER
  public static final NarratorType RABID_DRAGON
  public static final NarratorType RABID_DRAGON_POSSESSED
  public static final NarratorType RAGING_REVENANT
  public static final NarratorType REDTIGER
  public static final NarratorType ROLLER_WARRIOR
  public static final NarratorType SADISTIC_DANCER
  public static final NarratorType SADISTIC_DANCER_POSSESSED
  public static final NarratorType SATYR
  public static final NarratorType SAVAGE_CUTIE_CUTE
  public static final NarratorType SAVAGE_CUTIE_CUTE_POSSESSED
  public static final NarratorType SAVAGE_CUTIE_EVIL
  public static final NarratorType SAVAGE_CUTIE_EVIL_POSSESSED
  public static final NarratorType SHADOW_ASSASSIN
  public static final NarratorType SHADOW_OF_SVEN
  public static final NarratorType SHADOW_OF_SVEN_POSSESSED
  public static final NarratorType SKELETON_KING
  public static final NarratorType SNAPPER_BONE
  public static final NarratorType SNAPPER_BONE_POSSESSED
  public static final NarratorType SNAP_DRAGON
  public static final NarratorType SNAP_DRAGON_POSSESSED
  public static final NarratorType SNIPER_WOLF
  public static final NarratorType SOJOURNER_SORCERESS
  public static final NarratorType SOJOURNER_SORCERESS_POSSESSED
  public static final NarratorType SPECTRAL_DRAGON
  public static final NarratorType SPECTRAL_DRAGON_POSSESSED
  public static final NarratorType SPIKEY_DRAGON
  public static final NarratorType SPIKEY_DRAGON_POSSESSED
  public static final NarratorType STEPLADDER_BROTHERS
  public static final NarratorType STEPLADDER_BROTHERS_POSSESSED
  public static final NarratorType STORM_DRAGON
  public static final NarratorType STORM_DRAGON_POSSESSED
  public static final NarratorType STOWAWAY
  public static final NarratorType SUN_SEEKER
  public static final NarratorType SUN_SEEKER_POSSESSED
  public static final NarratorType TOMB_ANGEL
  public static final NarratorType TOMB_ANGEL_POSSESSED
  public static final NarratorType TRIPLE_THREAT
  public static final NarratorType TRIPLE_THREAT_POSSESSED
  public static final NarratorType UMLAUT_CH25
  public static final NarratorType UMLAUT_CH25_POSSESSED
  public static final NarratorType UMLAUT_THE_FIRST
  public static final NarratorType UMLAUT_THE_FIRST_POSSESSED
  public static final NarratorType UNDERSTUDY_MAGICAL_GIRL
  public static final NarratorType UNICORGI
  public static final NarratorType UNRIPE_MYTHOLOGY
  public static final NarratorType UNRIPE_MYTHOLOGY_EGG
  public static final NarratorType UNRIPE_MYTHOLOGY_POSSESSED
  public static final NarratorType UNSTABLE_UNDERSTUDY
  public static final NarratorType UNSTABLE_UNDERSTUDY_POSSESSED
  public static final NarratorType VERMILION_PRIESTESS
  public static final NarratorType VERMILION_PRIESTESS_POSSESSED
  public static final NarratorType VILE_BILE
  public static final NarratorType VOID_WYVERN
  public static final NarratorType VOID_WYVERN_POSSESSED
  public static final NarratorType VULCAN
  public static final NarratorType VULTURE_DRAGON
  public static final NarratorType WEE_WITCH
  public static final NarratorType WEREDRAGON
  public static final NarratorType WEREDRAGON_POSSESSED
  public static final NarratorType WHITE_TIGRESS
  public static final NarratorType ZOMBIE_SQUIRE

  // Constructors (1)
  com.perblue.rpg.game.tutorial.NarratorType(String, int)

  // Methods (2)
  public static NarratorType[] values()
  public static NarratorType valueOf(String)
```

## com.perblue.rpg.game.tutorial.PowerPointsActV1
```
 class PowerPointsActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (7)
  private static final int S_DONE = 9
  private static final int S_INITAL = 0
  private static final int S_OPEN_DRAGON_LADY = 3
  private static final int S_OPEN_HERO_MENU = 2
  private static final int S_OPEN_HUD_MENU = 1
  private static final int S_OPEN_SKILLS_TAB = 4
  private static final int S_UPGRADE_A_SKILL = 5

  // Constructors (1)
  com.perblue.rpg.game.tutorial.PowerPointsActV1()

  // Methods (10)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean hasPowerPointsUnlocked(IUser)
  private boolean isShowingDragonLady()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.PowerUseActV1
```
 class PowerUseActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (5)
  private static final int S_DONE = 4
  private static final int S_INITAL = 0
  private static final int S_REMINDER_1 = 1
  private static final int S_REMINDER_2 = 3
  private static final int S_WAIT_1 = 2

  // Constructors (1)
  com.perblue.rpg.game.tutorial.PowerUseActV1()

  // Methods (11)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean hasSkillReadyToUse()
  private boolean isOnThirdStage()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  private int getSkillReadyToUse()
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.PromoteHeroActV1
```
 class PromoteHeroActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (5)
  private static final int S_DONE = 4
  private static final int S_FINAL_MSG = 3
  private static final int S_INITAL = 0
  private static final int S_TAP_CONFIRM = 2
  private static final int S_TAP_PROMOTE = 1

  // Constructors (1)
  com.perblue.rpg.game.tutorial.PromoteHeroActV1()

  // Methods (9)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean isShowingHeroYouCanPromote()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.RuneFusionActV1
```
public class RuneFusionActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (6)
  private static final int S_CONGRATS = 1
  private static final int S_DIALOG_1 = 2
  private static final int S_DIALOG_2 = 3
  private static final int S_DIALOG_3 = 4
  private static final int S_DONE = 6
  private static final int S_INITAL = 0

  // Constructors (1)
  com.perblue.rpg.game.tutorial.RuneFusionActV1()

  // Methods (10)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean currentEmpowerRuneHasFusionUnlocked()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.RuneShrineActV1
```
public class RuneShrineActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (15)
  private static final int S_ACTIVATE_WOOD_SHRINE = 5
  private static final int S_CONGRATS_1 = 8
  private static final int S_CONGRATS_2 = 9
  private static final int S_DIALOG_1 = 2
  private static final int S_DONE = 13
  private static final int S_INITAL = 0
  private static final int S_TAP_BACK = 10
  private static final int S_TAP_DONE = 7
  private static final int S_TAP_OFFERING = 3
  private static final int S_TAP_RUNE_SHRINE = 1
  private static final int S_TAP_RUNE_TEMPLE = 11
  private static final int S_TAP_SLOT_TAB = 12
  private static final int S_TAP_WOOD_SHRINE = 4
  private static final int S_WATCH_ACTIVATION = 6
  public static final ItemType TUTORIAL_OFFERING_ITEM

  // Constructors (1)
  com.perblue.rpg.game.tutorial.RuneShrineActV1()

  // Methods (12)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean hasSlotOfferings(IUser)
  private boolean hasTreeOffering()
  private boolean isOnSetTab()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.RunesActV1
```
public class RunesActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (11)
  private static final int S_ATTACH_INFO = 3
  private static final int S_CONFIRM_ATTACH = 2
  private static final int S_DONE = 9
  private static final int S_DO_EMPOWER = 5
  private static final int S_EMPOWER_INFO = 6
  private static final int S_FIRST_FAIL = 8
  private static final int S_INITAL = 0
  private static final int S_TAP_EQUIPED_RUNE = 4
  private static final int S_TAP_NEW_RUNE = 1
  private static final int S_WAIT_FOR_FAILURE = 7
  private boolean empoweringInProgress

  // Constructors (1)
  com.perblue.rpg.game.tutorial.RunesActV1()

  // Methods (14)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean isShowingEmpowerableRune()
  public static long findTutorialRuneID()
  private boolean hasEnoughRunicite()
  private boolean userHasRune()
  private boolean isShowingNewRuneToEquip()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.StoryActV1
```
 class StoryActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (9)
  private static final Map CHAP_N_LVL_TO_G_LVL
  static final int FINAL_STAGE_NUMBER = 2
  private static final int STEP_RANGE_PER_LEVEL = 1
  private static final String TYPE_POST_COMBAT = POST
  private static final String TYPE_PRE_COMBAT = PRE
  private String currentTapToContinueType
  private List narrators
  private int nextNarratorIndex
  private LootBattleVictoryWindow victoryWindow

  // Constructors (1)
  com.perblue.rpg.game.tutorial.StoryActV1()

  // Methods (14)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private Narrator getNarrator(String)
  private int getGlobalLevelNumber(BaseScreen)
  private boolean isTop(NarratorLocation)
  private boolean locationsConflict(NarratorLocation, NarratorLocation)
  private void prepNextNarrator(int, String)
  private boolean testNextNarrator(int, String)
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.TempleInviteActV1
```
 class TempleInviteActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (7)
  private static final int S_DONE = 9
  private static final int S_FINAL_DIALOG = 7
  private static final int S_INITAL = 0
  private static final int S_TAP_FIGHT = 4
  private static final int S_TAP_TEMPLE = 1
  private static final int S_VIEW_OTHER = 2
  private static final int S_VIEW_TITAN = 3

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TempleInviteActV1()

  // Methods (15)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean showingOtherTempleWithNoAttempts()
  private boolean showingYourInviteScreen()
  private boolean hasTempleUnlocked(IUser)
  private boolean isOtherTemple(BaseScreen)
  private boolean onYourInviteScreen(BaseScreen)
  private boolean showingOtherTemple()
  private boolean isInGuild()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.TempleYoursActV1
```
 class TempleYoursActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (9)
  private static final int S_CLAIM_REWARD = 5
  private static final int S_DONE = 9
  private static final int S_FINAL_DIALOG = 7
  private static final int S_INITAL = 0
  private static final int S_TAP_FIGHT = 4
  private static final int S_TAP_INVITE_GUILD = 6
  private static final int S_TAP_TEMPLE = 1
  private static final int S_VIEW_TITAN = 3
  private static final int S_VIEW_YOURS = 2

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TempleYoursActV1()

  // Methods (15)
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean showingYourInviteScreen()
  private boolean hasTempleUnlocked(IUser)
  private boolean isYourTemple(BaseScreen)
  private boolean onYourInviteScreen(BaseScreen)
  private boolean showingYourTemple()
  private boolean isShowingLobyWithYourTemple()
  private boolean showingYourTempleWithReward()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```

## com.perblue.rpg.game.tutorial.TransitionDataType
```
public final enum TransitionDataType extends java.lang.Enum

  // Fields (8)
  private static final TransitionDataType[] $VALUES
  public static final TransitionDataType EVENT
  public static final TransitionDataType NEW_VALUE
  public static final TransitionDataType OLD_VALUE
  public static final TransitionDataType SCREEN
  public static final TransitionDataType TYPE
  public static final TransitionDataType UNIT
  public static final TransitionDataType WINDOW

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TransitionDataType(String, int)

  // Methods (2)
  public static TransitionDataType[] values()
  public static TransitionDataType valueOf(String)
```

## com.perblue.rpg.game.tutorial.TutorialFlag
```
public final enum TutorialFlag extends java.lang.Enum

  // Fields (47)
  private static final TutorialFlag[] $VALUES
  public static final TutorialFlag ATTACK_SCREEN_FADE_OUT_HERO_BUTTONS
  public static final TutorialFlag ATTACK_SCREEN_HIDE_HERO_BUTTONS
  public static final TutorialFlag ATTACK_SCREEN_HIDE_THOUGHT_BUBBLES
  public static final TutorialFlag ATTACK_SCREEN_HIDE_TOP_HUD
  public static final TutorialFlag ATTACK_SCREEN_SHOW_TAP_TO_CONTINUE_TEXT
  public static final TutorialFlag BACK_BUTTON_EXITS_APP_FROM_ATTACK_SCREEN
  public static final TutorialFlag CAMPAIGN_BATTLE_INFO_HIGHLIGHT_CONTINUE
  public static final TutorialFlag CHEST_SCREEN_PREVENT_10_X_ROLLS
  public static final TutorialFlag CHEST_SCREEN_PREVENT_OPENING_EVENT_CHEST
  public static final TutorialFlag CHEST_SCREEN_PREVENT_OPENING_ORANGE_CHEST
  public static final TutorialFlag CHEST_SCREEN_PREVENT_OPENING_PURPLE_CHEST
  public static final TutorialFlag CHEST_SCREEN_PREVENT_OPENING_SILVER_CHEST
  public static final TutorialFlag CHEST_SCREEN_PREVENT_OPENING_SOUL_CHEST
  public static final TutorialFlag CRATING_WINDOW_ONLY_SHOW_FIRST_CARD
  public static final TutorialFlag HERO_CHOOSER_PREVENT_CONTINUE
  public static final TutorialFlag HERO_SUMMARY_WINDOW_CLOSE_POP_TO_MAIN_MENU
  public static final TutorialFlag HERO_SUMMARY_WINDOW_HIDE_LEFT_AND_RIGHT_ARROWS
  public static final TutorialFlag HIDE_CHAT
  public static final TutorialFlag HIDE_MAIN_MENU_RED_NOTIF_BADGES
  public static final TutorialFlag HIDE_RESOURCE_SALES
  public static final TutorialFlag HIDE_SIDE_MENU_RED_NOTIF_BADGES
  public static final TutorialFlag HIDE_TAP_FOR_DETAILS_ON_LOOT
  public static final TutorialFlag MAIN_SCREEN_DISABLE_CAMPAIGN_BUTTON
  public static final TutorialFlag MAIN_SCREEN_DISABLE_SIGN_IN_BUTTON
  public static final TutorialFlag MAIN_SCREEN_DO_CAMERA_PAN
  public static final TutorialFlag MAIN_SCREEN_HIDE_CHESTS
  public static final TutorialFlag MAIN_SCREEN_HIDE_NON_TUTORIAL_OBJECTS
  public static final TutorialFlag MAIN_SCREEN_HIDE_OBJECT_NAMES
  public static final TutorialFlag MAIN_SCREEN_HIDE_SIGN_IN_NAME
  public static final TutorialFlag MAIN_SCREEN_HIDE_TOP_HUD
  public static final TutorialFlag MAIN_SCREEN_HIGHLIGHT_CAMPAIGN
  public static final TutorialFlag MAIN_SCREEN_SCROLL_TO_CRYPT
  public static final TutorialFlag MAIN_SCREEN_START_SCROLLED_LEFT
  public static final TutorialFlag MAIN_SCREEN_START_SCROLLED_RIGHT
  public static final TutorialFlag NARRATOR_VIEW_SHOW_TAP_TO_CONTINUE_TEXT
  public static final TutorialFlag PREVENT_NON_CENTAUR_EQUIPPING
  public static final TutorialFlag PREVENT_SELLING_OF_ENCHANT_MATERIALS
  public static final TutorialFlag RUNE_SHRINE_DISABLE_CRYSTAL
  public static final TutorialFlag RUNE_SHRINE_DISABLE_NON_TUTORIAL_OFFERINGS
  public static final TutorialFlag RUNE_SHRINE_DISABLE_STONE
  public static final TutorialFlag RUNE_SHRINE_RESET_ON_SHOW
  public static final TutorialFlag RUNE_TEMPLE_SCROLL_TO_FIRST_RUNE
  public static final TutorialFlag SUPPRESS_CAMPAIGN_VICTORY_WINDOW
  public static final TutorialFlag SUPRESS_NORMAL_SCREEN_AFTER_SPLASH
  public static final TutorialFlag WAR_SCREEN_HIGHLIGHT_DEFENSE_BUTTON
  public static final TutorialFlag WAR_SCREEN_SCROLL_TO_RECOMMENDED

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialFlag(String, int)

  // Methods (2)
  public static TutorialFlag[] values()
  public static TutorialFlag valueOf(String)
```

## com.perblue.rpg.game.tutorial.TutorialHelper
```
public class TutorialHelper

  // Fields (11)
  private static final Map ACTS
  public static final NarratorCloseCallback GENERIC_TAP_TO_CONTINUE_LISTENER
  private static final Map LEGENDARY_HERO_TO_QUEST_MAP
  private static final Log LOG
  public static final String TUTORIAL_FINISHED_EVENT = TutorialFinished
  private static a TUTORIAL_PRIOIRTY
  private static boolean errorAddingTutorialActs
  private static List narrators
  private static List pointers
  private static boolean pointersAndNarratorsDirty
  private static boolean updateIsQueued

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialHelper()

  // Methods (35)
  private static void onTutorialTransition(IUser, TutorialTransition, Map)
  public static void updateForTutorialDelayed(float)
  public static void updateForTutorialDelayed()
  public static void startCombatTimerEvent(float)
  public static void autoProgressNarrator()
  public static void addTutorialIfMissing(IUser, TutorialActType)
  public static boolean completedIntroTutorial(IUser)
  private static void updatePointersAndNarrators(IUser)
  public static boolean isAnyPointerShowing()
  public static void removeUnneededTutorials(IUser)
  public static void startGlobalTimerEvent(float)
  public static int getMaxVersion(TutorialActType)
  public static void clearUserData(IUser)
  public static void finishAllTutorials()
  public static void finishIntroForced()
  public static boolean isActCompleted(IUser, IUserTutorialAct)
  public static boolean isNarratorShowing(IUser)
  public static boolean isNarratorShowing(IUser, NarratorLocation)
  public static void setStoryStep(int)
  public static boolean completedTutorialAct(IUser, TutorialActType)
  public static TutorialActType getLegendaryQuestTutorialTypeForHero(UnitType)
  public static ContentUpdate getContentUpdate(TutorialActType)
  public static int getMaxStep(IUserTutorialAct)
  public static boolean isFlagSet(TutorialFlag)
  public static boolean isFlagSet(IUser, TutorialFlag)
  public static List getNarrators(IUser)
  public static void markPointersAndNarratorsDirty()
  public static Narrator getNarratorForLocation(List, NarratorLocation)
  public static IUserTutorialAct addTutorialAct(IUser, TutorialActType)
  private static void addTutorialAct(AbstractTutorialAct)
  public static AbstractTutorialAct getTutorialAct(IUserTutorialAct)
  public static List getPointers(IUser)
  public static void init()
```

## com.perblue.rpg.game.tutorial.TutorialPointerDir
```
public final enum TutorialPointerDir extends java.lang.Enum

  // Fields (7)
  private static final TutorialPointerDir[] $VALUES
  public static final TutorialPointerDir AUTO
  public static final TutorialPointerDir DOWN
  public static final TutorialPointerDir DOWN_LOW
  public static final TutorialPointerDir LEFT
  public static final TutorialPointerDir RIGHT
  public static final TutorialPointerDir UP

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialPointerDir(String, int)

  // Methods (2)
  public static TutorialPointerDir[] values()
  public static TutorialPointerDir valueOf(String)
```

## com.perblue.rpg.game.tutorial.TutorialPointerInfo
```
public class TutorialPointerInfo

  // Fields (6)
  private boolean darkenNonFocusedElements
  private TutorialPointerDir direction
  private final UIComponentName pointAt
  private int pointAtIndex
  private final String pointerText
  private final TutorialPointerType type

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialPointerInfo(TutorialPointerType, UIComponentName, String)

  // Methods (10)
  public UIComponentName getPointAt()
  public String getPointerText()
  public TutorialPointerInfo setPointAtIndex(int)
  private static TutorialPointerDir getDefaultDirection(UIComponentName)
  public boolean getDarkenNonFocusedElements()
  public TutorialPointerInfo setDarkenNonFocusedElements(boolean)
  public TutorialPointerDir getDirection()
  public void setDirection(TutorialPointerDir)
  public String getActorTutorialName()
  public TutorialPointerType getType()
```

## com.perblue.rpg.game.tutorial.TutorialPointerType
```
public final enum TutorialPointerType extends java.lang.Enum

  // Fields (4)
  private static final TutorialPointerType[] $VALUES
  public static final TutorialPointerType FINGER
  public static final TutorialPointerType NOTIF_BADGE
  public static final TutorialPointerType QUEST

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialPointerType(String, int)

  // Methods (2)
  public static TutorialPointerType[] values()
  public static TutorialPointerType valueOf(String)
```

## com.perblue.rpg.game.tutorial.TutorialStepChangeEvent
```
public class TutorialStepChangeEvent extends com.perblue.rpg.game.event.Event

  // Fields (1)
  private IUser user

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialStepChangeEvent(IUser)

  // Methods (3)
  public Object getEventSource()
  public IUser getUser()
  public void reset()
```

## com.perblue.rpg.game.tutorial.TutorialTransition
```
public final enum TutorialTransition extends java.lang.Enum

  // Fields (41)
  private static final TutorialTransition[] $VALUES
  public static final TutorialTransition ACTIVE_SKILL_READY
  public static final TutorialTransition ACTIVE_SKILL_USED
  public static final TutorialTransition ACT_COMPLETE
  public static final TutorialTransition BUTTON_PRESSED
  public static final TutorialTransition CAMPAIGN_VICTORY_WINDOW_SUPPRESSED
  public static final TutorialTransition CLOSE_WINDOW
  public static final TutorialTransition ENCHANTING_STATE_CHANGE
  public static final TutorialTransition ENCHANTING_SUCCESSFUL
  public static final TutorialTransition ENTITY_SELECTED
  public static final TutorialTransition ENTITY_UNSELECTED
  public static final TutorialTransition GENERIC_TAP_TO_CONTINUE
  public static final TutorialTransition GENERIC_TIMER_EVENT
  public static final TutorialTransition HERO_LINEUP_CHANGE
  public static final TutorialTransition HERO_SKIN_EQUIPPED
  public static final TutorialTransition HERO_SKIN_UNDERSTUDY_MASTERY_SELECTED
  public static final TutorialTransition HERO_SUMMARY_TAB_CHANGE
  public static final TutorialTransition LEAVE_SCREEN
  public static final TutorialTransition LEGENDARY_QUEST_COMPLETED
  public static final TutorialTransition MODAL_WINDOW_HIDDEN
  public static final TutorialTransition MODAL_WINDOW_SHOWN
  public static final TutorialTransition NEW_COMBAT_STAGE_STARTED
  public static final TutorialTransition RUNE_ATTACHED
  public static final TutorialTransition RUNE_CIRCLE_UPDATED
  public static final TutorialTransition RUNE_EMPOWERING_FAILURE
  public static final TutorialTransition RUNE_EMPOWERING_SUCCESS
  public static final TutorialTransition RUNE_OFFERING_SLOTTED
  public static final TutorialTransition RUNE_OFFERING_TAPPED
  public static final TutorialTransition RUNE_SHRINE_ACTIVATED
  public static final TutorialTransition SHRINE_TAB_SWITCH
  public static final TutorialTransition SIDE_MENU_CLOSED
  public static final TutorialTransition SIDE_MENU_OPENED
  public static final TutorialTransition START_APP
  public static final TutorialTransition TAB_CHANGE
  public static final TutorialTransition TEMPLE_REWARD_CLAIMED
  public static final TutorialTransition TEMPLE_SCREEN_MODE_CHANGE
  public static final TutorialTransition TUTORIAL_COMABT_OVER
  public static final TutorialTransition VIEW_SCREEN
  public static final TutorialTransition VIEW_WINDOW
  public static final TutorialTransition WAR_ATTACK_DETAILS_LAYOUT
  public static final TutorialTransition WAR_SCREEN_LAYOUT

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialTransition(String, int)

  // Methods (2)
  public static TutorialTransition[] values()
  public static TutorialTransition valueOf(String)
```

## com.perblue.rpg.game.tutorial.TutorialTransitionEvent
```
public class TutorialTransitionEvent extends com.perblue.rpg.game.event.Event

  // Fields (3)
  private TutorialTransition transition
  private Map transitionData
  private IUser user

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialTransitionEvent()

  // Methods (10)
  public Object getEventSource()
  public static void fireButtonPress(RPGMain, b)
  public static void fireButtonPress(b)
  public Map getTransitionData()
  public IUser getUser()
  public void setTransition(TutorialTransition)
  public void setUser(IUser)
  public TutorialTransitionEvent addData(TransitionDataType, Object)
  public TutorialTransition getTransition()
  public void reset()
```

## com.perblue.rpg.game.tutorial.UIComponentName
```
public final enum UIComponentName extends java.lang.Enum

  // Fields (97)
  private static final UIComponentName[] $VALUES
  public static final UIComponentName ACHIEVEMENT_WINDOW_CLAIM_ACHIEVEMENT
  public static final UIComponentName ADD_EXP_BUTTON
  public static final UIComponentName ATTACK_SCREEN_HERO_BUTTON
  public static final UIComponentName AUTO_FIGHT_BUTTON
  public static final UIComponentName BACK_BUTTON
  public static final UIComponentName BASE_MENU_ACHIEVEMENTS_BUTTON
  public static final UIComponentName BASE_MENU_BUTTON
  public static final UIComponentName BASE_MENU_DAILY_QUESTS_BUTTON
  public static final UIComponentName BASE_MENU_HERO_BUTTON
  public static final UIComponentName BOSS_PIT_ENTRY_EVIL_WIZARD_BUTTON
  public static final UIComponentName BOSS_PIT_STATE_CONTINUE_BUTTON
  public static final UIComponentName CAMPAIGN_BATTLE_INFO_CONTINUE
  public static final UIComponentName CAMPAIGN_SCREEN_LEVEL_1
  public static final UIComponentName CHEST_DETAILS_BUY_ONE_LEVEL_1
  public static final UIComponentName CHEST_DETAILS_BUY_ONE_LEVEL_2
  public static final UIComponentName CHEST_SCREEN_CHEST_1
  public static final UIComponentName CHEST_SCREEN_CHEST_2
  public static final UIComponentName CLOSE_WINDOW
  public static final UIComponentName CLOSE_WINDOW_NEW_HERO_OVERLAY
  public static final UIComponentName CRAFTING_INSUFFICENT_INGREDIENT_BUTTON
  public static final UIComponentName CRAFTING_WINDOW_EQUIP_BUTTON
  public static final UIComponentName CRAFT_BUTTON
  public static final UIComponentName CRYPT_SCREEN_RECOMENDED_BUTTON
  public static final UIComponentName DAILY_QUEST_WINDOW_CLAIM_REWARD
  public static final UIComponentName DECISION_PROMPT_BUTTON_1
  public static final UIComponentName DECISION_PROMPT_BUTTON_2
  public static final UIComponentName DIFFICULTY_CHOOSER_CONTINUE_BUTTON
  public static final UIComponentName ENCHANTING_SCREEN_ENCHANT_BUTTON
  public static final UIComponentName ENCHANTING_SCREEN_GEAR_SLOT
  public static final UIComponentName ENCHANTING_SCREEN_HERO_RIGHT_ARROW
  public static final UIComponentName ENCHANTING_SCREEN_VOID_DUST_BUTTON
  public static final UIComponentName EQUIP_GEAR_PROMPT_EQUIP_BUTTON
  public static final UIComponentName EVOLVE_HERO_PROMPT_CONFIRM
  public static final UIComponentName FIGHT_PIT_TARGETED_OPPONENT
  public static final UIComponentName HERO_AVAILABLE_SKIN_EQUIP_BUTTON
  public static final UIComponentName HERO_AVAILABLE_SKIN_ROW
  public static final UIComponentName HERO_CHOOSER_FIGHT_BUTTON
  public static final UIComponentName HERO_LIST_VIEW_HERO
  public static final UIComponentName HERO_MGMT_CENTUAR
  public static final UIComponentName HERO_MGMT_DRAGON_LADY
  public static final UIComponentName HERO_MGMT_EVOLVABLE
  public static final UIComponentName HERO_MGMT_YETI
  public static final UIComponentName HERO_SKIN_UNDERSTUDY
  public static final UIComponentName HERO_SKIN_UNDERSTUDY_MASTERY
  public static final UIComponentName HERO_SUMMARY_BUY_POWER_POINTS
  public static final UIComponentName HERO_SUMMARY_EVOLVE_BUTTON
  public static final UIComponentName HERO_SUMMARY_EXP_PLUS_BUTTON
  public static final UIComponentName HERO_SUMMARY_ITEM_SLOT
  public static final UIComponentName HERO_SUMMARY_PROMOTE_BUTTON
  public static final UIComponentName HERO_SUMMARY_SKILLS_TAB
  public static final UIComponentName HERO_SUMMARY_UNLOCK_LEGENDARY
  public static final UIComponentName HERO_SUMMARY_UPGRADE_SKILL_BUTTON
  public static final UIComponentName HERO_SUMMARY_WINDOW_EXP_ADD_WIDGET
  public static final UIComponentName MAIN_SCREEN_BOSS_PIT_BUTTON
  public static final UIComponentName MAIN_SCREEN_CAMPAIGN_BUTTON
  public static final UIComponentName MAIN_SCREEN_CHESTS_BUTTON
  public static final UIComponentName MAIN_SCREEN_CRYPT_BUTTON
  public static final UIComponentName MAIN_SCREEN_ENCHANTING_BUTTON
  public static final UIComponentName MAIN_SCREEN_FIGHT_PIT_BUTTON
  public static final UIComponentName MAIN_SCREEN_GUILD_WAR_BUTTON
  public static final UIComponentName MAIN_SCREEN_MYSTIC_CLOSET
  public static final UIComponentName MAIN_SCREEN_RUNE_SHRINE_BUTTON
  public static final UIComponentName MAIN_SCREEN_RUNE_TEMPLE_BUTTON
  public static final UIComponentName MAIN_SCREEN_TEMPLE_BUTTON
  public static final UIComponentName PROMOTE_HERO_PROMPT_CONFIRM
  public static final UIComponentName RECIPE_BUTTON
  public static final UIComponentName RUNES_ATTACHABLE_RUNE
  public static final UIComponentName RUNES_ATTACH_BUTTON
  public static final UIComponentName RUNES_ATTACH_CONFIRM_BUTTON
  public static final UIComponentName RUNES_DO_EMPOWER_BUTTON_ENABLED
  public static final UIComponentName RUNES_EMPOWERABLE_RUNE
  public static final UIComponentName RUNES_EMPOWER_BUTTON
  public static final UIComponentName RUNES_FUSION_BUTTON
  public static final UIComponentName SHRINE_ACTIVATE_BUTTON
  public static final UIComponentName SHRINE_REUSLTS_DONE_BUTTON
  public static final UIComponentName SHRINE_SET_ICON
  public static final UIComponentName SHRINE_SET_TAB
  public static final UIComponentName SHRINE_SLOT_TAB
  public static final UIComponentName SHRINE_WOOD_SLOT
  public static final UIComponentName SUMMON_HERO_PROMPT_CONFIRM_BUTTON
  public static final UIComponentName TEMPLE_COLLECT_REWARD_BUTTON
  public static final UIComponentName TEMPLE_FIGHT_BUTTON
  public static final UIComponentName TEMPLE_INVITE_BUTTON
  public static final UIComponentName TEMPLE_VIEW_INVITE_BUTTON
  public static final UIComponentName TEMPLE_VIEW_TITAN_BUTTON
  public static final UIComponentName TEMPLE_VIEW_YOURS_BUTTON
  public static final UIComponentName TICKETS_METER
  public static final UIComponentName TUTORIAL_HELP_BUTTON
  public static final UIComponentName VICTORY_CONTINUE_BUTTON
  public static final UIComponentName VIP_LEVEL_LABEL
  public static final UIComponentName WAR_DEFENSE_BUTTON
  public static final UIComponentName WAR_FIRST_DEFENSE_LINEUP_EDIT_BUTTON
  public static final UIComponentName WAR_LINEUP_ATTACK_BUTTON
  public static final UIComponentName WAR_RECOMMENDED_NODE
  public static final UIComponentName WAR_SECOND_DEFENSE_LINEUP_EDIT_BUTTON
  private static UIComponentName[] values

  // Constructors (1)
  com.perblue.rpg.game.tutorial.UIComponentName(String, int)

  // Methods (3)
  public static UIComponentName[] valuesCached()
  public static UIComponentName[] values()
  public static UIComponentName valueOf(String)
```

## com.perblue.rpg.game.tutorial.UnlockHeroActV1
```
 class UnlockHeroActV1 extends com.perblue.rpg.game.tutorial.AbstractTutorialAct

  // Fields (13)
  private static final int S_DIALOG_1_A = 5
  private static final int S_DIALOG_1_B = 6
  private static final int S_DIALOG_2_A = 11
  private static final int S_DONE = 12
  private static final int S_INITAL = 0
  private static final int S_OPEN_HERO_MENU_1 = 2
  private static final int S_OPEN_HERO_MENU_2 = 8
  private static final int S_OPEN_HUD_MENU_1 = 1
  private static final int S_OPEN_HUD_MENU_2 = 7
  private static final int S_OPEN_YETI = 9
  private static final int S_SPEND_EXP_POT = 10
  private static final int S_TAP_UNLOCK = 3
  private static final int S_TAP_YES = 4

  // Constructors (1)
  com.perblue.rpg.game.tutorial.UnlockHeroActV1()

  // Methods (13)
  private boolean hasYeti(IUser)
  private boolean hasYetiToUnlock(IUser)
  private boolean isOutOfPowerPoints(IUser)
  private boolean isShowingYeti()
  public void onTutorialTransition(IUser, IUserTutorialAct, TutorialTransition, Map)
  private boolean hasEXPPotionToSpend()
  public int getMaxStep()
  public boolean isFlagSet(IUser, IUserTutorialAct, TutorialFlag)
  public void getNarrators(IUser, IUserTutorialAct, List)
  public void getPointers(IUser, IUserTutorialAct, List)
  public int getVersion()
  public void clear()
  public TutorialActType getType()
```


---
# Inner Classes (780)

## com.perblue.rpg.game.ActionHelper$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$CommandType
  static final int[] $SwitchMap$com$perblue$rpg$util$localization$ClientErrorCode
```

## com.perblue.rpg.game.ClientActionHelper$1
```
static final class  implements java.lang.Runnable

  // Fields (2)
  final int val$questID
  final BuildSource val$source

  // Constructors (1)
  com.perblue.rpg.game.ClientActionHelper$1(int, BuildSource)

  // Methods (1)
  public final void run()
```

## com.perblue.rpg.game.ClientActionHelper$2
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$game$logic$BossBattleCampaignHelper$BossBattleAdvanceType
  static final int[] $SwitchMap$com$perblue$rpg$game$logic$BossBattleCampaignHelper$BossBattleResetType
  static final int[] $SwitchMap$com$perblue$rpg$game$logic$MerchantHelper$MerchantRefreshType
```

## com.perblue.rpg.game.ClientDebugActionHelper$1
```
static final class  implements com.perblue.a.a.h

  // Fields (1)
  final RequestExtendedGuildInfo val$message

  // Constructors (1)
  com.perblue.rpg.game.ClientDebugActionHelper$1(RequestExtendedGuildInfo)

  // Methods (2)
  public final void onReceive(e, ExtendedGuildInfo)
```

## com.perblue.rpg.game.ClientDebugActionHelper$1$1
```
 class  implements java.lang.Runnable

  // Fields (2)
  final  this$0
  final ExtendedGuildInfo val$guildInfo

  // Constructors (1)
  com.perblue.rpg.game.ClientDebugActionHelper$1$1(, ExtendedGuildInfo)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.game.buff.BuffHelper$1
```
static final class  implements com.perblue.rpg.simulation.TargetingHelper$TargetTest

  // Constructors (1)
  com.perblue.rpg.game.buff.BuffHelper$1()

  // Methods (1)
  public final boolean canTarget(Entity, Entity)
```

## com.perblue.rpg.game.buff.BuffHelper$2
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UnitType
```

## com.perblue.rpg.game.buff.HealthShieldBuff$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$buff$SimpleDurationBuff$StackingEffect
```

## com.perblue.rpg.game.buff.IDamageToTargetAware$1
```
static final class  implements java.util.Comparator

  // Constructors (1)
  com.perblue.rpg.game.buff.IDamageToTargetAware$1()

  // Methods (2)
  public final int compare(IDamageToTargetAware, IDamageToTargetAware)
```

## com.perblue.rpg.game.buff.IModifyTakenDamageStage2$1
```
static final class  implements java.util.Comparator

  // Constructors (1)
  com.perblue.rpg.game.buff.IModifyTakenDamageStage2$1()

  // Methods (2)
  public final int compare(IModifyTakenDamageStage2, IModifyTakenDamageStage2)
```

## com.perblue.rpg.game.buff.LastDefenderEnergyDrainBuff$1
```
 class  extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  final LastDefenderEnergyDrainBuff this$0
  final IAnimationMapping val$animMapping

  // Constructors (1)
  com.perblue.rpg.game.buff.LastDefenderEnergyDrainBuff$1(LastDefenderEnergyDrainBuff, IAnimationMapping)

  // Methods (1)
  public void event(int, Event)
```

## com.perblue.rpg.game.buff.NpcLyingLanternEntranceDebuff$1
```
 class  implements com.perblue.rpg.game.event.EventListener

  // Fields (2)
  final NpcLyingLanternEntranceDebuff this$0
  final Entity val$target

  // Constructors (1)
  com.perblue.rpg.game.buff.NpcLyingLanternEntranceDebuff$1(NpcLyingLanternEntranceDebuff, Entity)

  // Methods (2)
  public void onEvent(EntityDeathEvent)
```

## com.perblue.rpg.game.buff.OrcMonkLegendaryBuff$1
```
static class 
```

## com.perblue.rpg.game.buff.OrcMonkLegendaryBuff$OrcMonkBlessingBuff
```
 class OrcMonkBlessingBuff extends com.perblue.rpg.game.buff.StatAdditionBuff implements com.perblue.rpg.game.buff.IBuffDebugInfo, com.perblue.rpg.game.buff.IPreDamagedAwareBuff, com.perblue.rpg.game.buff.IVoidableBuff

  // Fields (1)
  final OrcMonkLegendaryBuff this$0

  // Constructors (2)
  com.perblue.rpg.game.buff.OrcMonkLegendaryBuff$OrcMonkBlessingBuff(OrcMonkLegendaryBuff)

  // Methods (4)
  public void onPreDamage(Entity, Entity, DamageSource)
  public String getDebugString()
  public String getBuffName()
  protected StackingEffect getStackingEffect(IBuff)
```

## com.perblue.rpg.game.buff.RabidDragonLegendaryBuff$1
```
static class 
```

## com.perblue.rpg.game.buff.RabidDragonLegendaryBuff$RabidDragonOneWithMurderBuff
```
static class RabidDragonOneWithMurderBuff extends com.perblue.rpg.game.buff.StatAdditionBuff

  // Constructors (2)
  com.perblue.rpg.game.buff.RabidDragonLegendaryBuff$RabidDragonOneWithMurderBuff()

  // Methods (1)
  public StackingEffect getStackingEffect(IBuff)
```

## com.perblue.rpg.game.buff.RagingRevenantRevivalBuff$1
```
 class  extends com.perblue.rpg.simulation.skills.generic.AnimationSkill$TriggerEffectListener

  // Fields (1)
  final RagingRevenantRevivalBuff this$0

  // Constructors (1)
  com.perblue.rpg.game.buff.RagingRevenantRevivalBuff$1(RagingRevenantRevivalBuff)

  // Methods (1)
  protected void onTriggerEffect(String)
```

## com.perblue.rpg.game.buff.RagingRevenantRevivalBuff$RagingRevenantRevivingBuff
```
static class RagingRevenantRevivingBuff extends com.perblue.rpg.game.buff.SimpleDurationBuff implements com.perblue.rpg.game.buff.IImmovable, com.perblue.rpg.game.buff.IInvincible, com.perblue.rpg.game.buff.ISteadfast, com.perblue.rpg.game.buff.IUntargetable

  // Constructors (2)
  com.perblue.rpg.game.buff.RagingRevenantRevivalBuff$RagingRevenantRevivingBuff()

  // Methods (1)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
```

## com.perblue.rpg.game.buff.SadisticDancerAvatarBuff$1
```
 class  implements a.a.f

  // Fields (5)
  final SadisticDancerAvatarBuff this$0
  final boolean val$isSpiderCocoon
  final ParticleType val$particle
  final CombatSkill val$sourceSkill
  final Unit val$unit

  // Constructors (1)
  com.perblue.rpg.game.buff.SadisticDancerAvatarBuff$1(SadisticDancerAvatarBuff, Unit, CombatSkill, boolean, ParticleType)

  // Methods (1)
  public void onEvent(int, a)
```

## com.perblue.rpg.game.buff.SadisticDancerAvatarBuff$2
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ItemType
```

## com.perblue.rpg.game.buff.ShieldBuff$1
```
static final class  implements java.util.Comparator

  // Constructors (1)
  com.perblue.rpg.game.buff.ShieldBuff$1()

  // Methods (2)
  public final int compare(ShieldBuff, ShieldBuff)
```

## com.perblue.rpg.game.buff.ShieldBuff$2
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$buff$SimpleDurationBuff$StackingEffect
```

## com.perblue.rpg.game.buff.ShieldBuff$ShieldType
```
## com.perblue.rpg.game.buff.ShieldBuff$ShieldType [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.buff.ShieldBuff and com.perblue.rpg.game.buff.ShieldBuff$ShieldType disagree on InnerClasses attribute]

## com.perblue.rpg.game.buff.SimpleDurationBuff$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$buff$SimpleDurationBuff$StackingEffect
```

## com.perblue.rpg.game.buff.SimpleDurationBuff$StackingEffect
```
public static final enum StackingEffect extends java.lang.Enum

  // Fields (8)
  private static final StackingEffect[] $VALUES
  public static final StackingEffect ADD_TIME_KEEP_NEW
  public static final StackingEffect ADD_TIME_KEEP_OLD
  public static final StackingEffect KEEP_BOTH
  public static final StackingEffect KEEP_NEW
  public static final StackingEffect KEEP_OLD
  public static final StackingEffect MAX_TIME_KEEP_NEW
  public static final StackingEffect MAX_TIME_KEEP_OLD

  // Constructors (1)
  com.perblue.rpg.game.buff.SimpleDurationBuff$StackingEffect(String, int)

  // Methods (2)
  public static StackingEffect[] values()
  public static StackingEffect valueOf(String)
```

## com.perblue.rpg.game.buff.SimpleEnergyOverTime$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$simulation$skills$generic$SkillDamageProvider$DamageFunction
```

## com.perblue.rpg.game.buff.SimpleStunBuff$1
```
 class  implements java.lang.Runnable

  // Fields (2)
  final SimpleStunBuff this$0
  final Entity val$target

  // Constructors (1)
  com.perblue.rpg.game.buff.SimpleStunBuff$1(SimpleStunBuff, Entity)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.game.buff.SimpleStunBuff$2
```
 class  implements java.lang.Runnable

  // Fields (2)
  final SimpleStunBuff this$0
  final Entity val$target

  // Constructors (1)
  com.perblue.rpg.game.buff.SimpleStunBuff$2(SimpleStunBuff, Entity)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.game.buff.StatModificationIcons$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$buff$StatModificationIcons$ModificationType
  static final int[] $SwitchMap$com$perblue$rpg$game$data$item$StatType
```

## com.perblue.rpg.game.buff.StatModificationIcons$ModificationType
```
public static final enum ModificationType extends java.lang.Enum

  // Fields (4)
  private static final ModificationType[] $VALUES
  public static final ModificationType NEGATIVE
  public static final ModificationType OTHER
  public static final ModificationType POSITIVE

  // Constructors (1)
  com.perblue.rpg.game.buff.StatModificationIcons$ModificationType(String, int)

  // Methods (2)
  public static ModificationType[] values()
  public static ModificationType valueOf(String)
```

## com.perblue.rpg.game.buff.StoneBuff$1
```
 class  implements java.lang.Runnable

  // Fields (2)
  final StoneBuff this$0
  final Entity val$target

  // Constructors (1)
  com.perblue.rpg.game.buff.StoneBuff$1(StoneBuff, Entity)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.game.buff.WeredragonEnergyDrainBuff$1
```
 class  extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  final WeredragonEnergyDrainBuff this$0
  final Entity val$entity

  // Constructors (1)
  com.perblue.rpg.game.buff.WeredragonEnergyDrainBuff$1(WeredragonEnergyDrainBuff, Entity)

  // Methods (1)
  public void event(int, Event)
```

## com.perblue.rpg.game.buff.WeredragonEnergyDrainBuff$2
```
 class  extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  final WeredragonEnergyDrainBuff this$0
  final Entity val$entity

  // Constructors (1)
  com.perblue.rpg.game.buff.WeredragonEnergyDrainBuff$2(WeredragonEnergyDrainBuff, Entity)

  // Methods (1)
  public void event(int, Event)
```

## com.perblue.rpg.game.buff.WeredragonEnergyDrainBuff$3
```
 class  extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (3)
  final WeredragonEnergyDrainBuff this$0
  final IAnimationMapping val$animMapping
  final Entity val$target

  // Constructors (1)
  com.perblue.rpg.game.buff.WeredragonEnergyDrainBuff$3(WeredragonEnergyDrainBuff, IAnimationMapping, Entity)

  // Methods (1)
  public void event(int, Event)
```

## com.perblue.rpg.game.buff.WeredragonEnergyDrainBuff$WeredragonIOtherBuff
```
public class WeredragonIOtherBuff implements com.perblue.rpg.game.buff.ICharmImmunityBuff, com.perblue.rpg.game.buff.IOtherBuffAddAwareBuff, com.perblue.rpg.game.buff.IUnclearableBuff

  // Fields (1)
  final WeredragonEnergyDrainBuff this$0

  // Constructors (1)
  com.perblue.rpg.game.buff.WeredragonEnergyDrainBuff$WeredragonIOtherBuff(WeredragonEnergyDrainBuff)

  // Methods (2)
  public boolean onOtherBuffAdd(Entity, Entity, IBuff)
  public String getBuffName()
```

## com.perblue.rpg.game.data.DifficultyModeStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$DifficultyModeStats$DifficultyModeEnemyStats$Col
```

## com.perblue.rpg.game.data.DifficultyModeStats$DifficultyModeEnemyStats
```
public static class DifficultyModeEnemyStats extends com.perblue.common.stats.GeneralStats

  // Fields (2)
   EnemyData[] enemyData
  private Class ownerClass

  // Constructors (1)
  com.perblue.rpg.game.data.DifficultyModeStats$DifficultyModeEnemyStats(String, Class)

  // Methods (4)
  protected void initStats(int, int)
  protected String getPackageString()
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.DifficultyModeStats$DifficultyModeEnemyStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (9)
  private static final Col[] $VALUES
  public static final Col ENEMY_LEVEL
  public static final Col ENEMY_RARITY
  public static final Col ENEMY_STARS
  public static final Col ENVIRONMENT
  public static final Col EXP_REWARD
  public static final Col STAGE_ONE
  public static final Col STAGE_THREE
  public static final Col STAGE_TWO

  // Constructors (1)
  com.perblue.rpg.game.data.DifficultyModeStats$DifficultyModeEnemyStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.DifficultyModeStats$DifficultyModeEnemyStats$EnemyData
```
static class EnemyData

  // Fields (8)
   EnvironmentType environment
   int expReward
   int level
   Rarity rarity
   List stageOneUnits
   List stageThreeUnits
   List stageTwoUnits
   int stars

  // Constructors (1)
  com.perblue.rpg.game.data.DifficultyModeStats$DifficultyModeEnemyStats$EnemyData()
```

## com.perblue.rpg.game.data.DifficultyModeStats$DifficultyModeLootStats
```
public static class DifficultyModeLootStats extends com.perblue.common.stats.GeneralStats

  // Fields (3)
   Map[] itemQuantities
   a[] items
  private Class ownerClass

  // Constructors (1)
  com.perblue.rpg.game.data.DifficultyModeStats$DifficultyModeLootStats(String, Class)

  // Methods (4)
  protected void initStats(int, int)
  protected String getPackageString()
  protected void saveStat(Integer, ItemType, String)
```

## com.perblue.rpg.game.data.arena.ArenaStats$1
```
static class 

  // Fields (6)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$arena$ArenaStats$ArenaConstant
  static final int[] $SwitchMap$com$perblue$rpg$game$data$arena$ArenaStats$ArenaConstantStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$arena$ArenaStats$ArenaDailyRewards$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$arena$ArenaStats$ArenaHeroEXPStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$arena$ArenaStats$ArenaPromotionRewards$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$arena$ArenaStats$ArenaResetStats$Col
```

## com.perblue.rpg.game.data.arena.ArenaStats$ArenaConstant
```
public static final enum ArenaConstant extends java.lang.Enum

  // Fields (19)
  private static final ArenaConstant[] $VALUES
  public static final ArenaConstant BRONZE_PROMOTE_TIME
  public static final ArenaConstant COOLDOWN_DURATION
  public static final ArenaConstant COPPER_PROMOTE_TIME
  public static final ArenaConstant DAILY_REWARD_EXPIRATION
  public static final ArenaConstant DAILY_REWARD_HOUR
  public static final ArenaConstant DEFENSE_REWARD
  public static final ArenaConstant DEMOTION_INACTIVE_TIME
  public static final ArenaConstant DEMOTION_RANK_WINDOW
  public static final ArenaConstant DEMOTION_START_DELAY
  public static final ArenaConstant DEMOTION_TIME_WINDOW
  public static final ArenaConstant DEMOTION_WARNING_TIME
  public static final ArenaConstant GOLD_PROMOTE_TIME
  public static final ArenaConstant LEAGUE_SIZE
  public static final ArenaConstant PLATINUM_PROMOTE_TIME
  public static final ArenaConstant PROMOTION_LEAGUE_SIZE
  public static final ArenaConstant PROMOTION_POSITIONS
  public static final ArenaConstant SILVER_PROMOTE_TIME
  public static final ArenaConstant SKIP_COOLDOWN_COST

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ArenaConstant(String, int)

  // Methods (2)
  public static ArenaConstant[] values()
  public static ArenaConstant valueOf(String)
```

## com.perblue.rpg.game.data.arena.ArenaStats$ArenaConstantStats
```
static class ArenaConstantStats extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ArenaConstantStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(ArenaConstant, Col, String)
```

## com.perblue.rpg.game.data.arena.ArenaStats$ArenaConstantStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (3)
  private static final Col[] $VALUES
  public static final Col COLISEUM_VALUE
  public static final Col FIGHT_PIT_VALUE

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ArenaConstantStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.arena.ArenaStats$ArenaDailyRewards
```
abstract static class ArenaDailyRewards extends com.perblue.common.stats.GeneralStats

  // Fields (2)
  private EnumMap scratchPad
  private int scratchRow

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ArenaDailyRewards(String)

  // Methods (7)
  private void finishRow()
  protected abstract void initMap()
  protected void initStats(int, int)
  protected void finishStats()
  protected void saveStat(Integer, Col, String)
  protected abstract Map getMap()
```

## com.perblue.rpg.game.data.arena.ArenaStats$ArenaDailyRewards$Col
```
public static final enum Col extends java.lang.Enum

  // Fields (9)
  private static final Col[] $VALUES
  public static final Col DIAMONDS
  public static final Col DIVISION
  public static final Col FIGHT_TOKENS
  public static final Col GOLD
  public static final Col ITEM_REWARDS
  public static final Col MAX_POS
  public static final Col MIN_POS
  public static final Col TIER

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ArenaDailyRewards$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.arena.ArenaStats$ArenaHeroEXPStats
```
static class ArenaHeroEXPStats extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ArenaHeroEXPStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.arena.ArenaStats$ArenaHeroEXPStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col EXP

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ArenaHeroEXPStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.arena.ArenaStats$ArenaPromotionRewards
```
abstract static class ArenaPromotionRewards extends com.perblue.common.stats.GeneralStats

  // Fields (2)
  private EnumMap scratchPad
  private int scratchRow

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ArenaPromotionRewards(String)

  // Methods (7)
  private void finishRow()
  protected abstract void initMap()
  protected void initStats(int, int)
  protected void finishStats()
  protected void saveStat(Integer, Col, String)
  protected abstract Map getMap()
```

## com.perblue.rpg.game.data.arena.ArenaStats$ArenaPromotionRewards$Col
```
public static final enum Col extends java.lang.Enum

  // Fields (7)
  private static final Col[] $VALUES
  public static final Col DIAMONDS
  public static final Col DIVISION
  public static final Col FIGHT_TOKENS
  public static final Col GOLD
  public static final Col ITEM_REWARDS
  public static final Col TIER

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ArenaPromotionRewards$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.arena.ArenaStats$ArenaResetStats
```
static class ArenaResetStats extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ArenaResetStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.arena.ArenaStats$ArenaResetStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col COST

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ArenaResetStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.arena.ArenaStats$ArenaRewardData
```
public static class ArenaRewardData

  // Fields (5)
  private int diamonds
  private int fightTokens
  private int gold
  private Map itemRewards
  private int maxPos

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ArenaRewardData()

  // Methods (10)
  public int getDiamonds()
  public int getFightTokens()
  public Map getItemRewards()
  public int getGold()
  public int getMaxPos()
```

## com.perblue.rpg.game.data.arena.ArenaStats$ColiseumDailyRewards
```
static class ColiseumDailyRewards extends com.perblue.rpg.game.data.arena.ArenaStats$ArenaDailyRewards

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ColiseumDailyRewards()

  // Methods (2)
  protected void initMap()
  protected Map getMap()
```

## com.perblue.rpg.game.data.arena.ArenaStats$ColiseumPromotionRewards
```
static class ColiseumPromotionRewards extends com.perblue.rpg.game.data.arena.ArenaStats$ArenaPromotionRewards

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$ColiseumPromotionRewards()

  // Methods (2)
  protected void initMap()
  protected Map getMap()
```

## com.perblue.rpg.game.data.arena.ArenaStats$FightPitDailyRewards
```
static class FightPitDailyRewards extends com.perblue.rpg.game.data.arena.ArenaStats$ArenaDailyRewards

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$FightPitDailyRewards()

  // Methods (2)
  protected void initMap()
  protected Map getMap()
```

## com.perblue.rpg.game.data.arena.ArenaStats$FightPitPromotionRewards
```
static class FightPitPromotionRewards extends com.perblue.rpg.game.data.arena.ArenaStats$ArenaPromotionRewards

  // Constructors (1)
  com.perblue.rpg.game.data.arena.ArenaStats$FightPitPromotionRewards()

  // Methods (2)
  protected void initMap()
  protected Map getMap()
```

## com.perblue.rpg.game.data.bossbattle.BossBattleStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$bossbattle$BossBattleStats$StageResetStats$Col
```

## com.perblue.rpg.game.data.bossbattle.BossBattleStats$StageResetStats
```
static class StageResetStats extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  private int[] cost

  // Constructors (2)
  com.perblue.rpg.game.data.bossbattle.BossBattleStats$StageResetStats()

  // Methods (4)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.bossbattle.BossBattleStats$StageResetStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col COST

  // Constructors (1)
  com.perblue.rpg.game.data.bossbattle.BossBattleStats$StageResetStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.bosspit.BossPitStats$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$bosspit$BossPitStats$BattleStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$bosspit$BossPitStats$ExtraStats$Col
```

## com.perblue.rpg.game.data.bosspit.BossPitStats$BattleStats
```
public static class BattleStats extends com.perblue.common.stats.GeneralStats

  // Fields (5)
  private static final Log LOG
  protected Map amountOfTime
  protected Map hpToProgress
  protected Map skills
  protected Map tags

  // Constructors (1)
  com.perblue.rpg.game.data.bosspit.BossPitStats$BattleStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(String, Col, String)
```

## com.perblue.rpg.game.data.bosspit.BossPitStats$BattleStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (5)
  private static final Col[] $VALUES
  public static final Col AMOUNT_OF_TIME
  public static final Col HP_TO_PROGRESS
  public static final Col SKILLS
  public static final Col TAGS

  // Constructors (1)
  com.perblue.rpg.game.data.bosspit.BossPitStats$BattleStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.bosspit.BossPitStats$ExtraStats
```
public static class ExtraStats extends com.perblue.common.stats.GeneralStats

  // Fields (6)
  private static final Log LOG
  protected Map gold
  protected Map levels
  protected Map rarity
  protected Map stars
  protected Map xp

  // Constructors (1)
  com.perblue.rpg.game.data.bosspit.BossPitStats$ExtraStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(String, Col, String)
```

## com.perblue.rpg.game.data.bosspit.BossPitStats$ExtraStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (6)
  private static final Col[] $VALUES
  public static final Col GOLD
  public static final Col LEVEL
  public static final Col RARITY
  public static final Col STARS
  public static final Col XP

  // Constructors (1)
  com.perblue.rpg.game.data.bosspit.BossPitStats$ExtraStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.bosspit.BossPitStats$RewardStats
```
public static class RewardStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.bosspit.BossPitStats$RewardStats()

  // Methods (2)
  private static RewardsCode createCode()
  protected void initStats(int, int)
```

## com.perblue.rpg.game.data.bosspit.BossPitStats$RewardStats$1
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.bosspit.BossPitStats$RewardStats$1()

  // Methods (3)
  protected final Set generateAllPossibleValues()
  public final String evaluate(RewardsContext)
```

## com.perblue.rpg.game.data.bosspit.BossPitStats$RewardStats$2
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.bosspit.BossPitStats$RewardStats$2(String[])

  // Methods (2)
  public final String evaluate(RewardsContext)
```

## com.perblue.rpg.game.data.bosspit.BossPitStats$RewardStats$3
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.bosspit.BossPitStats$RewardStats$3()

  // Methods (3)
  protected final Set generateAllPossibleValues()
  public final String evaluate(RewardsContext)
```

## com.perblue.rpg.game.data.bosspit.BossPitStats$RewardStats$4
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.bosspit.BossPitStats$RewardStats$4(ax)

  // Methods (2)
  public final String evaluate(RewardsContext)
```

## com.perblue.rpg.game.data.bosspit.BossPitStats$RewardStats$5
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.bosspit.BossPitStats$RewardStats$5(ax)

  // Methods (2)
  public final String evaluate(RewardsContext)
```

## com.perblue.rpg.game.data.bosspit.BossPitStats$RewardsCode
```
public static class RewardsCode extends com.perblue.rpg.game.logic.droptable.UserContextDTCode

  // Constructors (1)
  com.perblue.rpg.game.data.bosspit.BossPitStats$RewardsCode()
```

## com.perblue.rpg.game.data.bosspit.BossPitStats$RewardsContext
```
public static class RewardsContext extends com.perblue.rpg.game.logic.droptable.UserDTContext

  // Fields (6)
   UnitType bossType
   ModeDifficulty difficulty
   boolean forceDisplayMax
   boolean forceDisplayMin
   int phase
   int vipLevel

  // Constructors (1)
  com.perblue.rpg.game.data.bosspit.BossPitStats$RewardsContext(IUser)
```

## com.perblue.rpg.game.data.campaign.CampaignStats$1
```
static final class  extends java.util.HashMap

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$1()
```

## com.perblue.rpg.game.data.campaign.CampaignStats$2
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$campaign$CampaignStats$CampaignData$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$campaign$CampaignStats$EliteResetStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$CampaignType
```

## com.perblue.rpg.game.data.campaign.CampaignStats$CampaignContext
```
public static class CampaignContext extends com.perblue.rpg.game.logic.droptable.UserDTContext

  // Fields (2)
   int chapter
   int node

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$CampaignContext(IUser)
```

## com.perblue.rpg.game.data.campaign.CampaignStats$CampaignData
```
public static class CampaignData extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  private q chapters

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$CampaignData(String)

  // Methods (19)
  public List getStageTwoEnemies(int, int)
  public List getStageOneEnemies(int, int)
  public List getStageThreeEnemies(int, int)
  public EnvironmentType getEnvironment(int, int)
  public PrimaryLoot getPrimaryLoot(int, int)
  public List getSecondaryLoot(int, int)
  public int getStaminaCost(int, int)
  public Iterable getChapterData()
  public boolean isMajor(int, int)
  public int getNumLevels(int)
  protected void initStats(int, int)
  protected void saveStat(String, Col, String)
  private void saveStat(int, int, Col, String)
  public int getEnemyLevel(int, int)
  public Rarity getEnemyRarity(int, int)
  public int getEnemyStars(int, int)
  public int getExpReward(int, int)
  public int getNumChapters()
```

## com.perblue.rpg.game.data.campaign.CampaignStats$CampaignData$Col
```
static final enum Col extends java.lang.Enum

  // Fields (13)
  private static final Col[] $VALUES
  public static final Col ENEMY_LEVEL
  public static final Col ENEMY_RARITY
  public static final Col ENEMY_STARS
  public static final Col ENVIRONMENT
  public static final Col EXP_REWARD
  public static final Col IS_MAJOR
  public static final Col PRIMARY_LOOT
  public static final Col SECONDARY_LOOT
  public static final Col STAGE_ONE
  public static final Col STAGE_THREE
  public static final Col STAGE_TWO
  public static final Col STAMINA_COST

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$CampaignData$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.campaign.CampaignStats$ChapterData
```
public static class ChapterData

  // Fields (13)
  private static final String BOSS_PREFIX = [boss]
  private q enemyLevel
  private q enemyRarity
  private q enemyStars
  private q environment
  private q expReward
  private q isMajor
  private q primaryLoot
  private q secondaryLoot
  private q stageOneUnits
  private q stageThreeUnits
  private q stageTwoUnits
  private q staminaCost

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$ChapterData()

  // Methods (27)
  private static List parseLoot(String)
  public List getStageTwoEnemies(int)
  public List getStageOneEnemies(int)
  public List getStageThreeEnemies(int)
  public EnvironmentType getEnvironment(int)
  public PrimaryLoot getPrimaryLoot(int)
  public List getSecondaryLoot(int)
  public int getStaminaCost(int)
  public boolean getIsMajor(int)
  public void setEnemyLevel(int, int)
  public void setEnemyRarity(int, Rarity)
  public void setEnemyStars(int, int)
  public void setExpReward(int, int)
  public void setIsMajor(int, boolean)
  public void setStaminaCost(int, int)
  public void setPrimaryLoot(int, String)
  public void setSecondaryLoot(int, String)
  public void setStageOneEnemies(int, String)
  public void setStageTwoEnemies(int, String)
  public void setStageThreeEnemies(int, String)
  public int getNumLevels()
  public int getEnemyLevel(int)
  public Rarity getEnemyRarity(int)
  public int getEnemyStars(int)
  public int getExpReward(int)
  public static List parseUnits(String)
  public void setEnvironment(int, EnvironmentType)
```

## com.perblue.rpg.game.data.campaign.CampaignStats$EliteResetStats
```
public static class EliteResetStats extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  private int[] cost

  // Constructors (2)
  com.perblue.rpg.game.data.campaign.CampaignStats$EliteResetStats()

  // Methods (4)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.campaign.CampaignStats$EliteResetStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col COST

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$EliteResetStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.campaign.CampaignStats$ExtraDrops
```
public static class ExtraDrops extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$ExtraDrops()

  // Methods (1)
  private static UserContextDTCode createCode()
```

## com.perblue.rpg.game.data.campaign.CampaignStats$ExtraDrops$1
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$ExtraDrops$1()

  // Methods (3)
  protected final Set generateAllPossibleValues()
  public final String evaluate(CampaignContext)
```

## com.perblue.rpg.game.data.campaign.CampaignStats$ExtraDrops$2
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$ExtraDrops$2()

  // Methods (3)
  protected final Set generateAllPossibleValues()
  public final String evaluate(CampaignContext)
```

## com.perblue.rpg.game.data.campaign.CampaignStats$ExtraDropsExpert
```
public static class ExtraDropsExpert extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$ExtraDropsExpert()

  // Methods (1)
  private static UserContextDTCode createCode()
```

## com.perblue.rpg.game.data.campaign.CampaignStats$ExtraDropsExpert$1
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$ExtraDropsExpert$1()

  // Methods (3)
  protected final Set generateAllPossibleValues()
  public final String evaluate(CampaignContext)
```

## com.perblue.rpg.game.data.campaign.CampaignStats$ExtraDropsExpert$2
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$ExtraDropsExpert$2()

  // Methods (3)
  protected final Set generateAllPossibleValues()
  public final String evaluate(CampaignContext)
```

## com.perblue.rpg.game.data.campaign.CampaignStats$PrimaryLoot
```
static class PrimaryLoot

  // Fields (2)
  private final List baseLoot
  private final ThreadLocal lootHolder

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$PrimaryLoot(List)

  // Methods (2)
  public List getItems(ItemType)
```

## com.perblue.rpg.game.data.campaign.CampaignStats$PrimaryLoot$1
```
 class  extends java.lang.ThreadLocal

  // Fields (1)
  final PrimaryLoot this$0

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$PrimaryLoot$1(PrimaryLoot)

  // Methods (2)
  protected PrimaryLootInternal initialValue()
```

## com.perblue.rpg.game.data.campaign.CampaignStats$PrimaryLoot$PrimaryLootInternal
```
static class PrimaryLootInternal

  // Fields (2)
  private boolean containsSoulStone
  private final List loot

  // Constructors (1)
  com.perblue.rpg.game.data.campaign.CampaignStats$PrimaryLoot$PrimaryLootInternal(List)

  // Methods (1)
  public List getItems(ItemType)
```

## com.perblue.rpg.game.data.campaign.CampaignStats$RuneSource
```
static class RuneSource

  // Fields (2)
   CampaignLevel level
   RuneData rune

  // Constructors (2)
  com.perblue.rpg.game.data.campaign.CampaignStats$RuneSource()
```

## com.perblue.rpg.game.data.chest.ChestContextDTCode$1
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final ChestContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestContextDTCode$1(ChestContextDTCode, ax)

  // Methods (2)
  public String evaluate(ChestContext)
```

## com.perblue.rpg.game.data.chest.ChestContextDTCode$2
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final ChestContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestContextDTCode$2(ChestContextDTCode, ax)

  // Methods (2)
  public String evaluate(ChestContext)
```

## com.perblue.rpg.game.data.chest.ChestContextDTCode$3
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final ChestContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestContextDTCode$3(ChestContextDTCode, ax)

  // Methods (2)
  public String evaluate(ChestContext)
```

## com.perblue.rpg.game.data.chest.ChestContextDTCode$4
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final ChestContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestContextDTCode$4(ChestContextDTCode, ax)

  // Methods (2)
  public String evaluate(ChestContext)
```

## com.perblue.rpg.game.data.chest.ChestStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ChestType
```

## com.perblue.rpg.game.data.chest.ChestStats$ChestDisplayStats
```
public static class ChestDisplayStats extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  protected Map data

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestStats$ChestDisplayStats()

  // Methods (5)
  protected void initStats(int, int)
  protected void saveStat(ChestType, Col, String)
  protected void onMissingRow(String, ChestType)
```

## com.perblue.rpg.game.data.chest.ChestStats$ChestDisplayStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (6)
  private static final Col[] $VALUES
  public static final Col CURRENCY
  public static final Col POSSIBLE_HEROES
  public static final Col POSSIBLE_LOOT
  public static final Col PRICE_1
  public static final Col PRICE_10

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestStats$ChestDisplayStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.chest.ChestStats$GoldChestDrops
```
static class GoldChestDrops extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestStats$GoldChestDrops()
```

## com.perblue.rpg.game.data.chest.ChestStats$OrangeChestDrops
```
static class OrangeChestDrops extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestStats$OrangeChestDrops()
```

## com.perblue.rpg.game.data.chest.ChestStats$PurpleChestDrops
```
static class PurpleChestDrops extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestStats$PurpleChestDrops()
```

## com.perblue.rpg.game.data.chest.ChestStats$SilverChestDrops
```
static class SilverChestDrops extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestStats$SilverChestDrops()
```

## com.perblue.rpg.game.data.chest.ChestStats$SoulChestCode
```
static class SoulChestCode extends com.perblue.rpg.game.logic.droptable.UserContextDTCode

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestStats$SoulChestCode()
```

## com.perblue.rpg.game.data.chest.ChestStats$SoulChestContext
```
static class SoulChestContext extends com.perblue.rpg.game.logic.droptable.UserDTContext

  // Fields (2)
   boolean paidRoll
   a rnd

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestStats$SoulChestContext(IUser)
```

## com.perblue.rpg.game.data.chest.ChestStats$SoulChestDrops
```
static class SoulChestDrops extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestStats$SoulChestDrops()

  // Methods (1)
  private static SoulChestCode createCode()
```

## com.perblue.rpg.game.data.chest.ChestStats$SoulChestDrops$1
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestStats$SoulChestDrops$1(ax)

  // Methods (2)
  public final String evaluate(SoulChestContext)
```

## com.perblue.rpg.game.data.chest.ChestStats$SoulChestDrops$2
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestStats$SoulChestDrops$2(ax)

  // Methods (2)
  public final String evaluate(SoulChestContext)
```

## com.perblue.rpg.game.data.chest.ChestStats$SoulChestDrops$3
```
static final class  extends com.perblue.rpg.game.data.DTHeroesNode

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestStats$SoulChestDrops$3()

  // Methods (1)
  public final List execute(p)
```

## com.perblue.rpg.game.data.chest.ChestStats$SoulChestDrops$4
```
static final class  extends com.perblue.rpg.game.data.DTHeroesNode

  // Constructors (1)
  com.perblue.rpg.game.data.chest.ChestStats$SoulChestDrops$4()

  // Methods (1)
  public final List execute(p)
```

## com.perblue.rpg.game.data.content.ContentStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$content$ContentUpdate
```

## com.perblue.rpg.game.data.content.ContentStats$ContentColumn
```
public static class ContentColumn extends com.perblue.common.stats.a$a

  // Fields (20)
   Set availableHeroes
   List bazaarHeroes
   q chapterLevelStoneDrops
   Set chestHeroes
   List coliseumHeroes
  private List dailySoulChestHeroes
   List expeditionHeroes
   UnitType featuredSoulchestHero
   List fightPitHeroes
   Set goldChestHeroes
   List guildStoreHeroes
   long lastSoulChestCalculationDay
   int maxChapter
   int maxExpertChapter
   int maxTeamLevel
   UnitType monthlySigninHero
   ContentUpdate release
   List secondGoldChestHeroes
   Map stoneToLevels
   List warHeroes

  // Constructors (1)
  com.perblue.rpg.game.data.content.ContentStats$ContentColumn()

  // Methods (11)
  private void addGoldChestHero(UnitType)
  private void addMerchantHero(UnitType, List)
  private static t makeDrop(UnitType)
  private void addAvailableHero(UnitType)
  private void addCampaignHero(UnitType, int, int)
  private void generateSoulChestHeroes(long, Random)
  public List getDailySoulChestHeroes(long, Random)
  protected void finishStats()
  public void saveStat(String, String)
  private void error(String)
```

## com.perblue.rpg.game.data.crypt.CryptRaidStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$crypt$CryptRaidStats$MatchmakingStats$Col
```

## com.perblue.rpg.game.data.crypt.CryptRaidStats$DifficultyStats
```
public static class DifficultyStats extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  protected Map data

  // Constructors (1)
  com.perblue.rpg.game.data.crypt.CryptRaidStats$DifficultyStats()

  // Methods (5)
  protected void initStats(int, int)
  protected void saveStat(ModeDifficulty, Col, String)
  protected void onMissingRow(String, ModeDifficulty)
```

## com.perblue.rpg.game.data.crypt.CryptRaidStats$DifficultyStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (6)
  private static final Col[] $VALUES
  public static final Col COMPLETION_REWARD
  public static final Col GOLD_SKULL_VALUE
  public static final Col LEGION_SCALAR
  public static final Col SCORE_TO_TOKEN_MULT
  public static final Col SILVER_SKULL_VALUE

  // Constructors (1)
  com.perblue.rpg.game.data.crypt.CryptRaidStats$DifficultyStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.crypt.CryptRaidStats$MatchmakingStats
```
public static class MatchmakingStats extends com.perblue.common.stats.GeneralStats

  // Fields (5)
  protected g[] baseValue
  protected float[] downBackoff
  protected float[] downPowerDelta
  protected float[] upBackoff
  protected float[] upPowerDelta

  // Constructors (1)
  com.perblue.rpg.game.data.crypt.CryptRaidStats$MatchmakingStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(String, Col, String)
```

## com.perblue.rpg.game.data.crypt.CryptRaidStats$MatchmakingStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (6)
  private static final Col[] $VALUES
  public static final Col BASE_VALUE
  public static final Col DOWN_BACKOFF
  public static final Col DOWN_POWER_DELTA
  public static final Col UP_BACKOFF
  public static final Col UP_POWER_DELTA

  // Constructors (1)
  com.perblue.rpg.game.data.crypt.CryptRaidStats$MatchmakingStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UnitType
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$AbyssDragonAnimationAdapter
```
public static final class AbyssDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$AbyssDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$AncientDwarfAnimationAdapter
```
public static final class AncientDwarfAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$AncientDwarfAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$AngelDragonAnimationAdapter
```
public static final class AngelDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$AngelDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$AngelicHeraldAnimationAdapter
```
public static final class AngelicHeraldAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$AngelicHeraldAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$AquaticManAnimationAdapter
```
public static final class AquaticManAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$AquaticManAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BansheeAnimationAdapter
```
public static final class BansheeAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BansheeAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BardbarianAnimationAdapter
```
public static final class BardbarianAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BardbarianAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BlackWingAnimationAdapter
```
public static final class BlackWingAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BlackWingAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BoneDragonAnimationAdapter
```
public static final class BoneDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BoneDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BrozerkerAnimationAdapter
```
public static final class BrozerkerAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BrozerkerAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BulwarkAngelAnimationAdapter
```
public static final class BulwarkAngelAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BulwarkAngelAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BurntOneAnimationAdapter
```
public static final class BurntOneAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$BurntOneAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$CatapultKnightAnimationAdapter
```
public static final class CatapultKnightAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$CatapultKnightAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$CentaurOfAttentionAnimationAdapter
```
public static final class CentaurOfAttentionAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$CentaurOfAttentionAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$ClawManAnimationAdapter
```
public static final class ClawManAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$ClawManAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$CosmicElfAnimationAdapter
```
public static final class CosmicElfAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$CosmicElfAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$CrimsonWitchAnimationAdapter
```
public static final class CrimsonWitchAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$CrimsonWitchAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$CursedStatueAnimationAdapter
```
public static final class CursedStatueAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$CursedStatueAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$CyclopsWizardAnimationAdapter
```
public static final class CyclopsWizardAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$CyclopsWizardAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DarkDraculAnimationAdapter
```
public static final class DarkDraculAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DarkDraculAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DarkHeroAnimationAdapter
```
public static final class DarkHeroAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DarkHeroAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DarkHorseAnimationAdapter
```
public static final class DarkHorseAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DarkHorseAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DeepDragonAnimationAdapter
```
public static final class DeepDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DeepDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DemonTotemAnimationAdapter
```
public static final class DemonTotemAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DemonTotemAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DiggerMoleAnimationAdapter
```
public static final class DiggerMoleAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DiggerMoleAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DoppelgangerAnimationAdapter
```
public static final class DoppelgangerAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DoppelgangerAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DragonLadyAnimationAdapter
```
public static final class DragonLadyAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DragonLadyAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DragonSlayerAnimationAdapter
```
public static final class DragonSlayerAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DragonSlayerAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DragzillaAnimationAdapter
```
public static final class DragzillaAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DragzillaAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DruidinatrixAnimationAdapter
```
public static final class DruidinatrixAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DruidinatrixAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DungeonManAnimationAdapter
```
public static final class DungeonManAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DungeonManAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DustDevilAnimationAdapter
```
public static final class DustDevilAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DustDevilAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DwarvenArcherAnimationAdapter
```
public static final class DwarvenArcherAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$DwarvenArcherAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$ElectroyetiAnimationAdapter
```
public static final class ElectroyetiAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$ElectroyetiAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$EternalEnchanterAnimationAdapter
```
public static final class EternalEnchanterAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$EternalEnchanterAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$FaithHealerAnimationAdapter
```
public static final class FaithHealerAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$FaithHealerAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$ForgottenDragonAnimationAdapter
```
public static final class ForgottenDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$ForgottenDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$FrostGiantAnimationAdapter
```
public static final class FrostGiantAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$FrostGiantAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$GenieAnimationAdapter
```
public static final class GenieAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$GenieAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$GrandHuntressAnimationAdapter
```
public static final class GrandHuntressAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$GrandHuntressAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$GreedDragonAnimationAdapter
```
public static final class GreedDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$GreedDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$GroovyDruidAnimationAdapter
```
public static final class GroovyDruidAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$GroovyDruidAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$HydraAnimationAdapter
```
public static final class HydraAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$HydraAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$KaraokeKingAnimationAdapter
```
public static final class KaraokeKingAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$KaraokeKingAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$KrakenKingAnimationAdapter
```
public static final class KrakenKingAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$KrakenKingAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$LastDefenderAnimationAdapter
```
public static final class LastDefenderAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$LastDefenderAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$MagicDragonAnimationAdapter
```
public static final class MagicDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$MagicDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$MedusaAnimationAdapter
```
public static final class MedusaAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$MedusaAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$MinotaurAnimationAdapter
```
public static final class MinotaurAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$MinotaurAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$MistressManicureAnimationAdapter
```
public static final class MistressManicureAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$MistressManicureAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$MoonDrakeAnimationAdapter
```
public static final class MoonDrakeAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$MoonDrakeAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NinjaDwarfAnimationAdapter
```
public static final class NinjaDwarfAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NinjaDwarfAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcAbyssDragonAnimationAdapter
```
public static final class NpcAbyssDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcAbyssDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcAngelicAvengerAnimationAdapter
```
public static final class NpcAngelicAvengerAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcAngelicAvengerAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcAntAnimationAdapter
```
public static final class NpcAntAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcAntAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcAnubisDragonAnimationAdapter
```
public static final class NpcAnubisDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcAnubisDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcBossAbyssDragonAnimationAdapter
```
public static final class NpcBossAbyssDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcBossAbyssDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcBossAndragonusTheFirstAnimationAdapter
```
public static final class NpcBossAndragonusTheFirstAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcBossAndragonusTheFirstAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcBossAnubisDragonAnimationAdapter
```
public static final class NpcBossAnubisDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcBossAnubisDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcBossUmlautTheFifthFirstAnimationAdapter
```
public static final class NpcBossUmlautTheFifthFirstAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcBossUmlautTheFifthFirstAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcBuffSpriteAnimationAdapter
```
public static final class NpcBuffSpriteAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcBuffSpriteAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcCauldronMonsterAnimationAdapter
```
public static final class NpcCauldronMonsterAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcCauldronMonsterAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcCloudMonsterAnimationAdapter
```
public static final class NpcCloudMonsterAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcCloudMonsterAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcCrystalGolemAnimationAdapter
```
public static final class NpcCrystalGolemAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcCrystalGolemAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcCrystalLizardAnimationAdapter
```
public static final class NpcCrystalLizardAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcCrystalLizardAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcEvilWizardAnimationAdapter
```
public static final class NpcEvilWizardAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcEvilWizardAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcEyeballAnimationAdapter
```
public static final class NpcEyeballAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcEyeballAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcFireImpAnimationAdapter
```
public static final class NpcFireImpAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcFireImpAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcFleaDemonAnimationAdapter
```
public static final class NpcFleaDemonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcFleaDemonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcGiantPlantAnimationAdapter
```
public static final class NpcGiantPlantAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcGiantPlantAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcGiantPlantRootAnimationAdapter
```
public static final class NpcGiantPlantRootAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcGiantPlantRootAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcGoldColossusAnimationAdapter
```
public static final class NpcGoldColossusAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcGoldColossusAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcHeadCrabAnimationAdapter
```
public static final class NpcHeadCrabAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcHeadCrabAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcHealerSpriteAnimationAdapter
```
public static final class NpcHealerSpriteAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcHealerSpriteAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcIceGolemAnimationAdapter
```
public static final class NpcIceGolemAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcIceGolemAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcInfernoSpiderAnimationAdapter
```
public static final class NpcInfernoSpiderAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcInfernoSpiderAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcKamikazeGnomeAnimationAdapter
```
public static final class NpcKamikazeGnomeAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcKamikazeGnomeAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcKingImpAnimationAdapter
```
public static final class NpcKingImpAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcKingImpAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcLyingLanternAnimationAdapter
```
public static final class NpcLyingLanternAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcLyingLanternAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcMrSmashyAnimationAdapter
```
public static final class NpcMrSmashyAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcMrSmashyAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcMushroomAnimationAdapter
```
public static final class NpcMushroomAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcMushroomAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcMysticWildlingAnimationAdapter
```
public static final class NpcMysticWildlingAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcMysticWildlingAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcPlagueSkulkerAnimationAdapter
```
public static final class NpcPlagueSkulkerAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcPlagueSkulkerAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcPottedPlantAnimationAdapter
```
public static final class NpcPottedPlantAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcPottedPlantAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcRedTigerAnimationAdapter
```
public static final class NpcRedTigerAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcRedTigerAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcScarecrowAnimationAdapter
```
public static final class NpcScarecrowAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcScarecrowAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcSharkAnimationAdapter
```
public static final class NpcSharkAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcSharkAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcSinisterAssailantAnimationAdapter
```
public static final class NpcSinisterAssailantAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcSinisterAssailantAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcSkeletonDeerAnimationAdapter
```
public static final class NpcSkeletonDeerAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcSkeletonDeerAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcSquidAnimationAdapter
```
public static final class NpcSquidAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcSquidAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcStoneImpAnimationAdapter
```
public static final class NpcStoneImpAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcStoneImpAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcTrollBlobAnimationAdapter
```
public static final class NpcTrollBlobAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcTrollBlobAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcUmlautTheFifthFirstAnimationAdapter
```
public static final class NpcUmlautTheFifthFirstAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcUmlautTheFifthFirstAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcWildlingArcherAnimationAdapter
```
public static final class NpcWildlingArcherAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcWildlingArcherAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcWildlingSniperAnimationAdapter
```
public static final class NpcWildlingSniperAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$NpcWildlingSniperAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$OrcMonkAnimationAdapter
```
public static final class OrcMonkAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$OrcMonkAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$PchAnubisDragonAnimationAdapter
```
public static final class PchAnubisDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$PchAnubisDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$PirateAnimationAdapter
```
public static final class PirateAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$PirateAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$PlagueEntrepreneurAnimationAdapter
```
public static final class PlagueEntrepreneurAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$PlagueEntrepreneurAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$PlantSoulAnimationAdapter
```
public static final class PlantSoulAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$PlantSoulAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$PolemasterAnimationAdapter
```
public static final class PolemasterAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$PolemasterAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$RabidDragonAnimationAdapter
```
public static final class RabidDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$RabidDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$RagingRevenantAnimationAdapter
```
public static final class RagingRevenantAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$RagingRevenantAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$RollerWarriorAnimationAdapter
```
public static final class RollerWarriorAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$RollerWarriorAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SadisticDancerAnimationAdapter
```
public static final class SadisticDancerAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SadisticDancerAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SatyrAnimationAdapter
```
public static final class SatyrAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SatyrAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SavageCutieAnimationAdapter
```
public static final class SavageCutieAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SavageCutieAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$ShadowAssassinAnimationAdapter
```
public static final class ShadowAssassinAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$ShadowAssassinAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$ShadowOfSvenAnimationAdapter
```
public static final class ShadowOfSvenAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$ShadowOfSvenAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SilentSpiritAnimationAdapter
```
public static final class SilentSpiritAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SilentSpiritAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkeletonKingAnimationAdapter
```
public static final class SkeletonKingAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkeletonKingAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinAbyssDragonWinterAnimationAdapter
```
public static final class SkinAbyssDragonWinterAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinAbyssDragonWinterAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinAncientDwarfMechaAnimationAdapter
```
public static final class SkinAncientDwarfMechaAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinAncientDwarfMechaAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinAngelDragonFallenAnimationAdapter
```
public static final class SkinAngelDragonFallenAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinAngelDragonFallenAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinAngelDragonUsercontestAnimationAdapter
```
public static final class SkinAngelDragonUsercontestAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinAngelDragonUsercontestAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinBlackWingMechaAnimationAdapter
```
public static final class SkinBlackWingMechaAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinBlackWingMechaAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinBurntOneVoodooAnimationAdapter
```
public static final class SkinBurntOneVoodooAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinBurntOneVoodooAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinCursedStatueHawaiiAnimationAdapter
```
public static final class SkinCursedStatueHawaiiAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinCursedStatueHawaiiAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinCursedStatueMeerAnimationAdapter
```
public static final class SkinCursedStatueMeerAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinCursedStatueMeerAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinCursedStatueUsercontestAnimationAdapter
```
public static final class SkinCursedStatueUsercontestAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinCursedStatueUsercontestAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDarkDraculHorrorAnimationAdapter
```
public static final class SkinDarkDraculHorrorAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDarkDraculHorrorAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDoppelgangerMoltenAnimationAdapter
```
public static final class SkinDoppelgangerMoltenAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDoppelgangerMoltenAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDragonLadySpaceKnightAnimationAdapter
```
public static final class SkinDragonLadySpaceKnightAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDragonLadySpaceKnightAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDragonSlayerUnicornAnimationAdapter
```
public static final class SkinDragonSlayerUnicornAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDragonSlayerUnicornAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDruidinatrixMasteryAnimationAdapter
```
public static final class SkinDruidinatrixMasteryAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDruidinatrixMasteryAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDungeonManMasteryAnimationAdapter
```
public static final class SkinDungeonManMasteryAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDungeonManMasteryAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDungeonManMechaAnimationAdapter
```
public static final class SkinDungeonManMechaAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinDungeonManMechaAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinGroovyDruidDiscoAnimationAdapter
```
public static final class SkinGroovyDruidDiscoAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinGroovyDruidDiscoAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinKrakenKingMechalordAnimationAdapter
```
public static final class SkinKrakenKingMechalordAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinKrakenKingMechalordAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinMedusaHorrorAnimationAdapter
```
public static final class SkinMedusaHorrorAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinMedusaHorrorAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinMoonDrakeMechaAnimationAdapter
```
public static final class SkinMoonDrakeMechaAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinMoonDrakeMechaAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinNinjaDwarfFriggingRabbitAnimationAdapter
```
public static final class SkinNinjaDwarfFriggingRabbitAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinNinjaDwarfFriggingRabbitAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinPlantSoulCountryAnimationAdapter
```
public static final class SkinPlantSoulCountryAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinPlantSoulCountryAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinPlantSoulMasteryAnimationAdapter
```
public static final class SkinPlantSoulMasteryAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinPlantSoulMasteryAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSadisticDancerMechaAnimationAdapter
```
public static final class SkinSadisticDancerMechaAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSadisticDancerMechaAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSadisticDancerWinterAnimationAdapter
```
public static final class SkinSadisticDancerWinterAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSadisticDancerWinterAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinShadowAssassinWatchAnimationAdapter
```
public static final class SkinShadowAssassinWatchAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinShadowAssassinWatchAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinShadowOfSvenMechaAnimationAdapter
```
public static final class SkinShadowOfSvenMechaAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinShadowOfSvenMechaAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSkeletonDeerAscendantDeerAnimationAdapter
```
public static final class SkinSkeletonDeerAscendantDeerAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSkeletonDeerAscendantDeerAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSkeletonKingAscendantAnimationAdapter
```
public static final class SkinSkeletonKingAscendantAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSkeletonKingAscendantAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSpectralDragonEasterAnimationAdapter
```
public static final class SkinSpectralDragonEasterAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSpectralDragonEasterAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSpectralDragonReddragonAnimationAdapter
```
public static final class SkinSpectralDragonReddragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSpectralDragonReddragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSpiderQueenMasteryAnimationAdapter
```
public static final class SkinSpiderQueenMasteryAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSpiderQueenMasteryAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinStepladderBrothersHorrorAnimationAdapter
```
public static final class SkinStepladderBrothersHorrorAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinStepladderBrothersHorrorAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSunSeekerSnowAnimationAdapter
```
public static final class SkinSunSeekerSnowAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinSunSeekerSnowAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinTombAngelUsercontestAnimationAdapter
```
public static final class SkinTombAngelUsercontestAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinTombAngelUsercontestAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinVoidWyvernImaginationAnimationAdapter
```
public static final class SkinVoidWyvernImaginationAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinVoidWyvernImaginationAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinVoidWyvernMasteryAnimationAdapter
```
public static final class SkinVoidWyvernMasteryAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinVoidWyvernMasteryAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinWeeWitchHorrorAnimationAdapter
```
public static final class SkinWeeWitchHorrorAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinWeeWitchHorrorAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinWeredragonMasteryAnimationAdapter
```
public static final class SkinWeredragonMasteryAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinWeredragonMasteryAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinZombieSquireDigitalAnimationAdapter
```
public static final class SkinZombieSquireDigitalAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SkinZombieSquireDigitalAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SnapDragonAnimationAdapter
```
public static final class SnapDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SnapDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SnapperBoneAnimationAdapter
```
public static final class SnapperBoneAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SnapperBoneAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SniperWolfAnimationAdapter
```
public static final class SniperWolfAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SniperWolfAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SojournerSorceressAnimationAdapter
```
public static final class SojournerSorceressAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SojournerSorceressAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SpectralDragonAnimationAdapter
```
public static final class SpectralDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SpectralDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SpiderQueenAnimationAdapter
```
public static final class SpiderQueenAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SpiderQueenAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SpikeyDragonAnimationAdapter
```
public static final class SpikeyDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SpikeyDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$StepladderBrothersAnimationAdapter
```
public static final class StepladderBrothersAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$StepladderBrothersAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$StormDragonAnimationAdapter
```
public static final class StormDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$StormDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$StowawayAnimationAdapter
```
public static final class StowawayAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$StowawayAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SunSeekerAnimationAdapter
```
public static final class SunSeekerAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$SunSeekerAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$TombAngelAnimationAdapter
```
public static final class TombAngelAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$TombAngelAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$TripleThreatAnimationAdapter
```
public static final class TripleThreatAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$TripleThreatAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$UmlautTheFirstAnimationAdapter
```
public static final class UmlautTheFirstAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$UmlautTheFirstAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$UnicorgiAnimationAdapter
```
public static final class UnicorgiAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$UnicorgiAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$UnripeMythologyAnimationAdapter
```
public static final class UnripeMythologyAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$UnripeMythologyAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$UnstableUnderstudyAnimationAdapter
```
public static final class UnstableUnderstudyAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$UnstableUnderstudyAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$VermilionPriestessAnimationAdapter
```
public static final class VermilionPriestessAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$VermilionPriestessAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$VileBileAnimationAdapter
```
public static final class VileBileAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$VileBileAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$VoidWyvernAnimationAdapter
```
public static final class VoidWyvernAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$VoidWyvernAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$VultureDragonAnimationAdapter
```
public static final class VultureDragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$VultureDragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$WeeWitchAnimationAdapter
```
public static final class WeeWitchAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$WeeWitchAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$WeredragonAnimationAdapter
```
public static final class WeredragonAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$WeredragonAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$WhiteTigressAnimationAdapter
```
public static final class WhiteTigressAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$WhiteTigressAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$ZombieSquireAnimationAdapter
```
public static final class ZombieSquireAnimationAdapter extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  private final Entity entity
  private final Skeleton skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.AnimationVFXListenerUtil$ZombieSquireAnimationAdapter(Skeleton, Entity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.DisplayDataUtil$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$objects$ProjectileType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UnitType
```

## com.perblue.rpg.game.data.display.EnvironmentData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$EnvironmentType
```

## com.perblue.rpg.game.data.display.VFXUtil$1
```
static final class  extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  final EnvEntity val$entity
  final Skeleton val$skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.VFXUtil$1(EnvEntity, Skeleton)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.VFXUtil$2
```
static final class  extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  final EnvEntity val$entity
  final Skeleton val$skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.VFXUtil$2(EnvEntity, Skeleton)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.VFXUtil$3
```
static final class  extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  final EnvEntity val$entity
  final Skeleton val$skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.VFXUtil$3(Skeleton, EnvEntity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.VFXUtil$4
```
static final class  extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (2)
  final EnvEntity val$entity
  final Skeleton val$skeleton

  // Constructors (1)
  com.perblue.rpg.game.data.display.VFXUtil$4(EnvEntity, Skeleton)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.display.VFXUtil$5
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$game$objects$EnvEntityType
  static final int[] $SwitchMap$com$perblue$rpg$game$objects$ProjectileType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UnitType
```

## com.perblue.rpg.game.data.display.VFXUtil$HIT_LOCATION
```
public static final enum HIT_LOCATION extends java.lang.Enum

  // Fields (4)
  private static final HIT_LOCATION[] $VALUES
  public static final HIT_LOCATION EVENT_POS
  public static final HIT_LOCATION HIT_POS
  public static final HIT_LOCATION UNIT_BASE

  // Constructors (1)
  com.perblue.rpg.game.data.display.VFXUtil$HIT_LOCATION(String, int)

  // Methods (2)
  public static HIT_LOCATION[] values()
  public static HIT_LOCATION valueOf(String)
```

## com.perblue.rpg.game.data.expedition.ExpeditionStats$1
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$expedition$ExpeditionStats$DifficultyStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$expedition$ExpeditionStats$MatchmakingStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$expedition$ExpeditionStats$RewardStats$Col
```

## com.perblue.rpg.game.data.expedition.ExpeditionStats$DifficultyStats
```
public static class DifficultyStats extends com.perblue.common.stats.GeneralStats

  // Fields (2)
   int[] extraLevels
   int[] goldMultiplier

  // Constructors (1)
  com.perblue.rpg.game.data.expedition.ExpeditionStats$DifficultyStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.expedition.ExpeditionStats$DifficultyStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (3)
  private static final Col[] $VALUES
  public static final Col EXTRA_LEVELS
  public static final Col GOLD_MULT

  // Constructors (1)
  com.perblue.rpg.game.data.expedition.ExpeditionStats$DifficultyStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.expedition.ExpeditionStats$ExpeditionChestDrops
```
public static class ExpeditionChestDrops extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.expedition.ExpeditionStats$ExpeditionChestDrops()
```

## com.perblue.rpg.game.data.expedition.ExpeditionStats$ExpeditionContext
```
public static class ExpeditionContext extends com.perblue.rpg.game.logic.droptable.UserDTContext

  // Fields (2)
  public final int difficulty
  public final int round

  // Constructors (1)
  com.perblue.rpg.game.data.expedition.ExpeditionStats$ExpeditionContext(IUser, int, int)
```

## com.perblue.rpg.game.data.expedition.ExpeditionStats$ExpeditionDTCode
```
public static class ExpeditionDTCode extends com.perblue.rpg.game.logic.droptable.UserContextDTCode

  // Constructors (1)
  com.perblue.rpg.game.data.expedition.ExpeditionStats$ExpeditionDTCode()
```

## com.perblue.rpg.game.data.expedition.ExpeditionStats$ExpeditionDTCode$1
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final ExpeditionDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.expedition.ExpeditionStats$ExpeditionDTCode$1(ExpeditionDTCode)

  // Methods (3)
  public Set generateAllPossibleValues()
  public String evaluate(ExpeditionContext)
```

## com.perblue.rpg.game.data.expedition.ExpeditionStats$ExpeditionDTCode$2
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final ExpeditionDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.expedition.ExpeditionStats$ExpeditionDTCode$2(ExpeditionDTCode)

  // Methods (3)
  public Set generateAllPossibleValues()
  public String evaluate(ExpeditionContext)
```

## com.perblue.rpg.game.data.expedition.ExpeditionStats$MatchmakingStats
```
public static class MatchmakingStats extends com.perblue.common.stats.GeneralStats

  // Fields (4)
  protected float[] downBackoff
  protected float[] downPowerDelta
  protected float[] upBackoff
  protected float[] upPowerDelta

  // Constructors (1)
  com.perblue.rpg.game.data.expedition.ExpeditionStats$MatchmakingStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.expedition.ExpeditionStats$MatchmakingStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (5)
  private static final Col[] $VALUES
  public static final Col DOWN_BACKOFF
  public static final Col DOWN_POWER_DELTA
  public static final Col UP_BACKOFF
  public static final Col UP_POWER_DELTA

  // Constructors (1)
  com.perblue.rpg.game.data.expedition.ExpeditionStats$MatchmakingStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.expedition.ExpeditionStats$RewardStats
```
public static class RewardStats extends com.perblue.common.stats.GeneralStats

  // Fields (2)
  protected g[] gold
  protected int[] numItems

  // Constructors (1)
  com.perblue.rpg.game.data.expedition.ExpeditionStats$RewardStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.expedition.ExpeditionStats$RewardStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (3)
  private static final Col[] $VALUES
  public static final Col GOLD
  public static final Col NUM_ITEMS

  // Constructors (1)
  com.perblue.rpg.game.data.expedition.ExpeditionStats$RewardStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.item.CraftingStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$item$CraftingStats$Col
```

## com.perblue.rpg.game.data.item.CraftingStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (10)
  private static final Col[] $VALUES
  public static final Col CRAFTING_GOLD
  public static final Col PART1_QUANTITY
  public static final Col PART1_TYPE
  public static final Col PART2_QUANTITY
  public static final Col PART2_TYPE
  public static final Col PART3_QUANTITY
  public static final Col PART3_TYPE
  public static final Col PART4_QUANTITY
  public static final Col PART4_TYPE

  // Constructors (1)
  com.perblue.rpg.game.data.item.CraftingStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.item.GearTicketStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$item$GearTicketStats$Col
```

## com.perblue.rpg.game.data.item.GearTicketStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col GEAR_TICKET_COST

  // Constructors (1)
  com.perblue.rpg.game.data.item.GearTicketStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.item.HowToGetHelper$1
```
static final class  implements java.util.Comparator

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper$1()

  // Methods (2)
  public final int compare(CampaignLevel, CampaignLevel)
```

## com.perblue.rpg.game.data.item.HowToGetHelper$10
```
static final class  implements com.perblue.rpg.ui.widgets.HowToGetCard$LinkAdapter

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper$10()

  // Methods (7)
  public final String getIconName()
  public final boolean isCampaignLevel()
  public final String getDescription()
  public final String getTitle()
  public final void onActivate()
  public final CampaignLevel getCampaignLevel()
  public final boolean isLocked()
```

## com.perblue.rpg.game.data.item.HowToGetHelper$11
```
static final class  implements com.perblue.rpg.ui.widgets.HowToGetCard$LinkAdapter

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper$11()

  // Methods (7)
  public final String getIconName()
  public final boolean isCampaignLevel()
  public final String getDescription()
  public final String getTitle()
  public final void onActivate()
  public final CampaignLevel getCampaignLevel()
  public final boolean isLocked()
```

## com.perblue.rpg.game.data.item.HowToGetHelper$12
```
static final class  implements com.perblue.rpg.ui.widgets.HowToGetCard$LinkAdapter

  // Fields (1)
  final MerchantType val$type

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper$12(MerchantType)

  // Methods (7)
  public final String getIconName()
  public final boolean isCampaignLevel()
  public final String getDescription()
  public final String getTitle()
  public final void onActivate()
  public final CampaignLevel getCampaignLevel()
  public final boolean isLocked()
```

## com.perblue.rpg.game.data.item.HowToGetHelper$13
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$GameMode
```

## com.perblue.rpg.game.data.item.HowToGetHelper$2
```
static final class  implements java.util.Comparator

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper$2()

  // Methods (2)
  public final int compare(CampaignLevel, CampaignLevel)
```

## com.perblue.rpg.game.data.item.HowToGetHelper$3
```
static final class  implements com.perblue.rpg.ui.widgets.HowToGetCard$LinkAdapter

  // Fields (4)
  final boolean val$isRuneSetOffering
  final boolean val$isRuneSlotOffering
  final CampaignLevel val$level
  final int val$maxCampaignLevels

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper$3(int, boolean, CampaignLevel, boolean)

  // Methods (7)
  public final String getIconName()
  public final boolean isCampaignLevel()
  public final String getDescription()
  public final String getTitle()
  public final void onActivate()
  public final CampaignLevel getCampaignLevel()
  public final boolean isLocked()
```

## com.perblue.rpg.game.data.item.HowToGetHelper$4
```
static final class  implements com.perblue.rpg.ui.widgets.HowToGetCard$LinkAdapter

  // Fields (5)
  final boolean val$isRuneSetOffering
  final boolean val$isRuneSlotOffering
  final LinkableItem val$item
  final CampaignLevel val$level
  final int val$maxCampaignLevels

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper$4(CampaignLevel, int, boolean, boolean, LinkableItem)

  // Methods (7)
  public final String getIconName()
  public final boolean isCampaignLevel()
  public final String getDescription()
  public final String getTitle()
  public final void onActivate()
  public final CampaignLevel getCampaignLevel()
  public final boolean isLocked()
```

## com.perblue.rpg.game.data.item.HowToGetHelper$5
```
static final class  implements com.perblue.rpg.ui.widgets.HowToGetCard$LinkAdapter

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper$5()

  // Methods (7)
  public final String getIconName()
  public final boolean isCampaignLevel()
  public final String getDescription()
  public final String getTitle()
  public final void onActivate()
  public final CampaignLevel getCampaignLevel()
  public final boolean isLocked()
```

## com.perblue.rpg.game.data.item.HowToGetHelper$6
```
static final class  implements com.perblue.rpg.ui.widgets.HowToGetCard$LinkAdapter

  // Fields (2)
  final ModeDifficulty val$difficulty
  final GameMode val$gameMode

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper$6(GameMode, ModeDifficulty)

  // Methods (7)
  public final String getIconName()
  public final boolean isCampaignLevel()
  public final String getDescription()
  public final String getTitle()
  public final void onActivate()
  public final CampaignLevel getCampaignLevel()
  public final boolean isLocked()
```

## com.perblue.rpg.game.data.item.HowToGetHelper$7
```
static final class  implements com.perblue.rpg.ui.widgets.HowToGetCard$LinkAdapter

  // Fields (3)
  final UnitType val$bossType
  final ModeDifficulty val$difficulty
  final int val$stageFinal

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper$7(UnitType, ModeDifficulty, int)

  // Methods (7)
  public final String getIconName()
  public final boolean isCampaignLevel()
  public final String getDescription()
  public final String getTitle()
  public final void onActivate()
  public final CampaignLevel getCampaignLevel()
  public final boolean isLocked()
```

## com.perblue.rpg.game.data.item.HowToGetHelper$8
```
static final class  implements com.perblue.rpg.ui.widgets.HowToGetCard$LinkAdapter

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper$8()

  // Methods (7)
  public final String getIconName()
  public final boolean isCampaignLevel()
  public final String getDescription()
  public final String getTitle()
  public final void onActivate()
  public final CampaignLevel getCampaignLevel()
  public final boolean isLocked()
```

## com.perblue.rpg.game.data.item.HowToGetHelper$9
```
static final class  implements com.perblue.rpg.ui.widgets.HowToGetCard$LinkAdapter

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper$9()

  // Methods (7)
  public final String getIconName()
  public final boolean isCampaignLevel()
  public final String getDescription()
  public final String getTitle()
  public final void onActivate()
  public final CampaignLevel getCampaignLevel()
  public final boolean isLocked()
```

## com.perblue.rpg.game.data.item.HowToGetHelper$LinkableItem
```
public static class LinkableItem

  // Fields (2)
  public ItemType itemType
  public IRune rune

  // Constructors (1)
  com.perblue.rpg.game.data.item.HowToGetHelper$LinkableItem()
```

## com.perblue.rpg.game.data.item.ItemStats$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$item$StatType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ItemType
```

## com.perblue.rpg.game.data.item.StatType$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$item$StatType
```

## com.perblue.rpg.game.data.item.enchanting.EnchantingStats$1
```
static class 

  // Fields (4)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$item$enchanting$EnchantingStats$EnchantingValues
  static final int[] $SwitchMap$com$perblue$rpg$game$data$item$enchanting$EnchantingStats$PointStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$item$enchanting$EnchantingStats$ValueStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$Rarity
```

## com.perblue.rpg.game.data.item.enchanting.EnchantingStats$EnchantingValues
```
static final enum EnchantingValues extends java.lang.Enum

  // Fields (11)
  private static final EnchantingValues[] $VALUES
  public static final EnchantingValues BLUE_COST_PER_POINT
  public static final EnchantingValues CYAN_COST_PER_POINT
  public static final EnchantingValues DIAMOND_COST
  public static final EnchantingValues ENCHANT_RETURN
  public static final EnchantingValues GREEN_COST_PER_POINT
  public static final EnchantingValues NON_ENCHANT_RETURN
  public static final EnchantingValues ORANGE_COST_PER_POINT
  public static final EnchantingValues PURPLE_COST_PER_POINT
  public static final EnchantingValues RED_COST_PER_POINT
  public static final EnchantingValues STAT_INCREASE

  // Constructors (1)
  com.perblue.rpg.game.data.item.enchanting.EnchantingStats$EnchantingValues(String, int)

  // Methods (2)
  public static EnchantingValues[] values()
  public static EnchantingValues valueOf(String)
```

## com.perblue.rpg.game.data.item.enchanting.EnchantingStats$PointStats
```
static class PointStats extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  private Rarity rarity

  // Constructors (1)
  com.perblue.rpg.game.data.item.enchanting.EnchantingStats$PointStats(Rarity)

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.item.enchanting.EnchantingStats$PointStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (3)
  private static final Col[] $VALUES
  public static final Col POINTS
  public static final Col REFUND

  // Constructors (1)
  com.perblue.rpg.game.data.item.enchanting.EnchantingStats$PointStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.item.enchanting.EnchantingStats$StatIncreaseStats
```
static class StatIncreaseStats extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.item.enchanting.EnchantingStats$StatIncreaseStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(StatType, Col, String)
```

## com.perblue.rpg.game.data.item.enchanting.EnchantingStats$StatIncreaseStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col STAT_INCREASE

  // Constructors (1)
  com.perblue.rpg.game.data.item.enchanting.EnchantingStats$StatIncreaseStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.item.enchanting.EnchantingStats$ValueStats
```
static class ValueStats extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.item.enchanting.EnchantingStats$ValueStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(EnchantingValues, Col, String)
```

## com.perblue.rpg.game.data.item.enchanting.EnchantingStats$ValueStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col VALUE

  // Constructors (1)
  com.perblue.rpg.game.data.item.enchanting.EnchantingStats$ValueStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.GoldDrop$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$GoldDrop$GoldDropConstants$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$GoldDrop$GoldDropValues$Col
```

## com.perblue.rpg.game.data.misc.GoldDrop$GoldDropConstants
```
static class GoldDropConstants extends com.perblue.common.stats.GeneralStats

  // Fields (2)
  protected Map parsers
  protected Map valueMap

  // Constructors (1)
  com.perblue.rpg.game.data.misc.GoldDrop$GoldDropConstants()

  // Methods (5)
  public g getParser(Row)
  protected void initStats(int, int)
  protected void saveStat(Row, Col, String)
  public Float getValue(Row)
```

## com.perblue.rpg.game.data.misc.GoldDrop$GoldDropConstants$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col VALUE

  // Constructors (1)
  com.perblue.rpg.game.data.misc.GoldDrop$GoldDropConstants$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.GoldDrop$GoldDropConstants$Row
```
static final enum Row extends java.lang.Enum

  // Fields (6)
  private static final Row[] $VALUES
  public static final Row BOSS_MULTIPLIER
  public static final Row CRYPT_RAID_FUNCTION
  public static final Row ELITE_CAMPAIGN_MULTIPLIER
  public static final Row EXPERT_CAMPAIGN_MULTIPLIER
  public static final Row TITAN_TEMPLE_MULTIPLIER

  // Constructors (1)
  com.perblue.rpg.game.data.misc.GoldDrop$GoldDropConstants$Row(String, int)

  // Methods (2)
  public static Row[] values()
  public static Row valueOf(String)
```

## com.perblue.rpg.game.data.misc.GoldDrop$GoldDropValues
```
static class GoldDropValues extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  protected static Map valueMap

  // Constructors (1)
  com.perblue.rpg.game.data.misc.GoldDrop$GoldDropValues()

  // Methods (6)
  protected void initStats(int, int)
  protected void saveStat(UnitType, Col, String)
  protected void onMissingRow(String, UnitType)
  public String getValue(UnitType)
```

## com.perblue.rpg.game.data.misc.GoldDrop$GoldDropValues$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col VALUE

  // Constructors (1)
  com.perblue.rpg.game.data.misc.GoldDrop$GoldDropValues$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.MerchantDTCode$1
```
 class  extends com.perblue.rpg.game.data.DTHeroesNode

  // Fields (1)
  final MerchantDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantDTCode$1(MerchantDTCode)

  // Methods (1)
  public List execute(p)
```

## com.perblue.rpg.game.data.misc.MerchantDTCode$2
```
 class  extends com.perblue.rpg.game.data.DTHeroesNode

  // Fields (1)
  final MerchantDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantDTCode$2(MerchantDTCode)

  // Methods (1)
  public List execute(p)
```

## com.perblue.rpg.game.data.misc.MerchantDTCode$3
```
 class  extends com.perblue.rpg.game.data.DTHeroesNode

  // Fields (1)
  final MerchantDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantDTCode$3(MerchantDTCode)

  // Methods (1)
  public List execute(p)
```

## com.perblue.rpg.game.data.misc.MerchantDTCode$4
```
 class  extends com.perblue.rpg.game.data.DTHeroesNode

  // Fields (1)
  final MerchantDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantDTCode$4(MerchantDTCode)

  // Methods (1)
  public List execute(p)
```

## com.perblue.rpg.game.data.misc.MerchantDTCode$5
```
 class  extends com.perblue.rpg.game.data.DTHeroesNode

  // Fields (1)
  final MerchantDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantDTCode$5(MerchantDTCode)

  // Methods (1)
  public List execute(p)
```

## com.perblue.rpg.game.data.misc.MerchantDTCode$6
```
 class  extends com.perblue.rpg.game.data.DTHeroesNode

  // Fields (1)
  final MerchantDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantDTCode$6(MerchantDTCode)

  // Methods (1)
  public List execute(p)
```

## com.perblue.rpg.game.data.misc.MerchantStats$1
```
static class 

  // Fields (5)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$MerchantStats$CostStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$MerchantStats$MerchantConstantStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$MerchantStats$SoulmartRefreshCostStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$MerchantStats$TypeStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$MerchantType
```

## com.perblue.rpg.game.data.misc.MerchantStats$ArenaDropStats
```
static class ArenaDropStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$ArenaDropStats()
```

## com.perblue.rpg.game.data.misc.MerchantStats$BazaarDropStats
```
static class BazaarDropStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$BazaarDropStats()
```

## com.perblue.rpg.game.data.misc.MerchantStats$BlackMarketDropStats
```
static class BlackMarketDropStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$BlackMarketDropStats()
```

## com.perblue.rpg.game.data.misc.MerchantStats$ColiseumDropStats
```
static class ColiseumDropStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$ColiseumDropStats()
```

## com.perblue.rpg.game.data.misc.MerchantStats$CostStats
```
static class CostStats extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  private int[] cost

  // Constructors (2)
  com.perblue.rpg.game.data.misc.MerchantStats$CostStats()

  // Methods (4)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.misc.MerchantStats$CostStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col COST

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$CostStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.MerchantStats$ExpeditionDropStats
```
static class ExpeditionDropStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$ExpeditionDropStats()
```

## com.perblue.rpg.game.data.misc.MerchantStats$GuildDropStats
```
static class GuildDropStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$GuildDropStats()
```

## com.perblue.rpg.game.data.misc.MerchantStats$GuildWarDropStats
```
static class GuildWarDropStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$GuildWarDropStats()
```

## com.perblue.rpg.game.data.misc.MerchantStats$MerchantConstant
```
public static final enum MerchantConstant extends java.lang.Enum

  // Fields (10)
  private static final MerchantConstant[] $VALUES
  public static final MerchantConstant BLACK_MARKET_STAMINA_REQ
  public static final MerchantConstant BLACK_MARKET_UNLOCK_COST
  public static final MerchantConstant COOLDOWN_DURATION
  public static final MerchantConstant FOUND_DURATION
  public static final MerchantConstant OLD_ITEM_DISCOUNT_PERCENT
  public static final MerchantConstant OLD_ITEM_DISCOUNT_THRESHOLD
  public static final MerchantConstant PEDDLER_STAMINA_REQ
  public static final MerchantConstant PEDDLER_UNLOCK_COST
  public static final MerchantConstant SOULMART_TOKEN_RATE

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$MerchantConstant(String, int)

  // Methods (2)
  public static MerchantConstant[] values()
  public static MerchantConstant valueOf(String)
```

## com.perblue.rpg.game.data.misc.MerchantStats$MerchantConstantStats
```
static class MerchantConstantStats extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$MerchantConstantStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(MerchantConstant, Col, String)
```

## com.perblue.rpg.game.data.misc.MerchantStats$MerchantConstantStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col VALUE

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$MerchantConstantStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.MerchantStats$NormalDropStats
```
static class NormalDropStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$NormalDropStats()
```

## com.perblue.rpg.game.data.misc.MerchantStats$PeddlerDropStats
```
static class PeddlerDropStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$PeddlerDropStats()
```

## com.perblue.rpg.game.data.misc.MerchantStats$SoulmartDropStats
```
static class SoulmartDropStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$SoulmartDropStats()
```

## com.perblue.rpg.game.data.misc.MerchantStats$SoulmartRefreshCostStats
```
static class SoulmartRefreshCostStats extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  private int[] cost

  // Constructors (2)
  com.perblue.rpg.game.data.misc.MerchantStats$SoulmartRefreshCostStats()

  // Methods (4)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.misc.MerchantStats$SoulmartRefreshCostStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col COST

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$SoulmartRefreshCostStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.MerchantStats$TypeStats
```
static class TypeStats extends com.perblue.common.stats.GeneralStats

  // Fields (4)
  protected Map clientRefreshTimes
  protected Map inventorySize
  protected Map refreshCostOffset
  protected Map refreshCurrency

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$TypeStats()

  // Methods (5)
  protected void initStats(int, int)
  protected void saveStat(MerchantType, Col, String)
  protected void onMissingRow(String, MerchantType)
```

## com.perblue.rpg.game.data.misc.MerchantStats$TypeStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (5)
  private static final Col[] $VALUES
  public static final Col INVENTORY_SIZE
  public static final Col REFRESH_COST_OFFSET
  public static final Col REFRESH_RESOURCE_TYPE
  public static final Col REFRESH_TIMES

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MerchantStats$TypeStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.MidasStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$MidasStats$ValueStats$Col
```

## com.perblue.rpg.game.data.misc.MidasStats$CritStats
```
static class CritStats extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  protected c chances

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MidasStats$CritStats()

  // Methods (5)
  protected void initStats(int, int)
  protected void saveStat(Level, Col, String)
  protected void onMissingRow(String, Level)
```

## com.perblue.rpg.game.data.misc.MidasStats$CritStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col CHANCE

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MidasStats$CritStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.MidasStats$ValueStats
```
static class ValueStats extends com.perblue.common.stats.GeneralStats

  // Fields (3)
  protected int[] baseGold
  protected int[] cost
  protected g formula

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MidasStats$ValueStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.misc.MidasStats$ValueStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (4)
  private static final Col[] $VALUES
  public static final Col BASE_GOLD
  public static final Col COST
  public static final Col TOTAL_GOLD

  // Constructors (1)
  com.perblue.rpg.game.data.misc.MidasStats$ValueStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.QuestStats$1
```
static class 

  // Fields (4)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$QuestStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$QuestStats$QuestType
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$QuestStats$RequirementStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$QuestStats$RequirementStats$Property
```

## com.perblue.rpg.game.data.misc.QuestStats$Col
```
public static final enum Col extends java.lang.Enum

  // Fields (21)
  private static final Col[] $VALUES
  public static final Col BUTTON_ACTION
  public static final Col CAMPAIGN_CHAPTER
  public static final Col CAMPAIGN_LEVEL
  public static final Col CAMPAIGN_TYPE
  public static final Col COMPLETE_REQUIREMENTS
  public static final Col EXTRA
  public static final Col GOOGLE_ID
  public static final Col ICON
  public static final Col KEY
  public static final Col PREVIOUS_QUEST
  public static final Col QUEST_TYPE
  public static final Col REWARD_1
  public static final Col REWARD_1_QTY
  public static final Col REWARD_2
  public static final Col REWARD_2_QTY
  public static final Col REWARD_3
  public static final Col REWARD_3_QTY
  public static final Col SORT_INDEX
  public static final Col UNLOCK_REQUIREMENTS
  public static final Col VALUE

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.QuestStats$IQuestReq
```
public abstract static interface interface IQuestReq

  // Methods (16)
  public abstract int getProgressDenominator(IUser, int)
  public abstract int getProgressNumerator(IUser, int)
  public abstract boolean requiresProgressToday(IUser, int)
  public abstract ResourceType getSacrificeResource(int)
  public abstract ItemType getSacrificeItem(int)
  public abstract String getProgressString(IUser, int)
  public abstract boolean isAutoComplete(IUser, int)
  public abstract boolean isAutoStart(IUser, int)
  public abstract boolean isSatisfied(IUser, int)
  public abstract boolean isStarted(IUser, int)
  public abstract void onDailyReset(IUser, int)
  public abstract void onQuestCompleted(IUser, int)
  public abstract void onQuestStarted(IUser, int)
  public abstract boolean isTime()
  public abstract void ensureQuestStarted(IUser, int)
  public abstract long getValue(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$QuestData
```
static class QuestData

  // Fields (16)
  public String buttonAction
  public int campaignChapter
  public int campaignLevel
  public CampaignType campaignType
  public String[] completeRequirements
  public String extra
  public String googleID
  public String icon
  public String key
  public int previousQuest
  public QuestReward[] rewards
  public int sortIndex
  public QuestType type
  public UnitType unitType
  public String[] unlockRequirements
  public String value

  // Constructors (2)
  com.perblue.rpg.game.data.misc.QuestStats$QuestData()
```

## com.perblue.rpg.game.data.misc.QuestStats$QuestReward
```
static class QuestReward

  // Fields (3)
  public g expr
  public ItemType item
  public ResourceType resource

  // Constructors (2)
  com.perblue.rpg.game.data.misc.QuestStats$QuestReward()
```

## com.perblue.rpg.game.data.misc.QuestStats$QuestType
```
public static final enum QuestType extends java.lang.Enum

  // Fields (7)
  private static final QuestType[] $VALUES
  public static final QuestType ACHIEVEMENT
  public static final QuestType DAILY_QUEST
  public static final QuestType FREE_STAMINA
  public static final QuestType LEGENDARY
  public static final QuestType MASTERY
  public static final QuestType MONTHLY_CARD

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$QuestType(String, int)

  // Methods (2)
  public static QuestType[] values()
  public static QuestType valueOf(String)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats
```
public static class RequirementStats extends com.perblue.common.stats.GeneralStats

  // Fields (2)
  protected Map cachedReqs
  protected Map reqData

  // Constructors (2)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats()

  // Methods (6)
  public IQuestReq getRequirement(String)
  private List parseReqList(String)
  public IQuestReq createRequirement(QuestReqData)
  protected void initStats(int, int)
  protected void saveStat(String, Col, String)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$AndRequirement
```
static class AndRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$DelegatingRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$AndRequirement(List, g, g)

  // Methods (3)
  public boolean isSatisfied(IUser, int)
  public long getProperty(IUser, int)
  public long getValue(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ArenaTierAndDivisionRequirement
```
static class ArenaTierAndDivisionRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (2)
  protected String arenaTierName
  protected ArenaType arenaType

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ArenaTierAndDivisionRequirement(Operation, String, String, g, g, ArenaType)

  // Methods (3)
  public int getProgressDenominator(IUser, int)
  public boolean isSatisfied(IUser, int)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$BaseRequirement
```
abstract static class BaseRequirement implements com.perblue.rpg.game.data.misc.QuestStats$IQuestReq

  // Fields (2)
  protected g denomExpr
  protected g numerExpr

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$BaseRequirement(g, g)

  // Methods (17)
  public int getProgressDenominator(IUser, int)
  public int getProgressNumerator(IUser, int)
  public boolean requiresProgressToday(IUser, int)
  public ResourceType getSacrificeResource(int)
  public ItemType getSacrificeItem(int)
  protected void inputProgressDenomVars(IUser, int)
  protected void inputProgressNumerVars(IUser, int)
  public String getProgressString(IUser, int)
  public boolean isAutoComplete(IUser, int)
  public boolean isAutoStart(IUser, int)
  public boolean isStarted(IUser, int)
  public void onDailyReset(IUser, int)
  public void onQuestCompleted(IUser, int)
  public void onQuestStarted(IUser, int)
  public boolean isTime()
  public void ensureQuestStarted(IUser, int)
  protected abstract long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$BossBattleWinRequirement
```
static class BossBattleWinRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$BossBattleWinRequirement(Operation, String, UnitType, int, int, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$BossPitWinsRequirement
```
static class BossPitWinsRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$BossPitWinsRequirement(Operation, String, UnitType, int, int, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$CampaignChapterCountRequirement
```
static class CampaignChapterCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$CampaignChapterCountRequirement(Operation, String, g, g)

  // Methods (2)
  protected long getProperty(IUser, int)
  public long getValue(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$CampaignExpertChapterCountRequirement
```
static class CampaignExpertChapterCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$CampaignChapterCountRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$CampaignExpertChapterCountRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$CampaignStageBestStarsRequirement
```
static class CampaignStageBestStarsRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (3)
  private int chapter
  private int level
  private CampaignType type

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$CampaignStageBestStarsRequirement(Operation, String, CampaignType, int, int, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$CampaignStageLastWinRequirement
```
static class CampaignStageLastWinRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (3)
  private int chapter
  private int level
  private CampaignType type

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$CampaignStageLastWinRequirement(Operation, String, CampaignType, int, int, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$CampaignStageWinsAtBestStarsRequirement
```
static class CampaignStageWinsAtBestStarsRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (3)
  private int chapter
  private int level
  private CampaignType type

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$CampaignStageWinsAtBestStarsRequirement(Operation, String, CampaignType, int, int, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$CampaignStageWinsRequirement
```
static class CampaignStageWinsRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (3)
  private int chapter
  private int level
  private CampaignType type

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$CampaignStageWinsRequirement(Operation, String, CampaignType, int, int, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$Col
```
public static final enum Col extends java.lang.Enum

  // Fields (10)
  private static final Col[] $VALUES
  public static final Col CAMPAIGN_CHAPTER
  public static final Col CAMPAIGN_LEVEL
  public static final Col CAMPAIGN_TYPE
  public static final Col EXTRA
  public static final Col OPERATION
  public static final Col PROGRESS_DENOM
  public static final Col PROGRESS_NUM
  public static final Col PROPERTY
  public static final Col VALUE

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement
```
abstract static class ComparisonRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$BaseRequirement

  // Fields (2)
  protected Operation comparison
  protected g parser

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement(Operation, String, g, g)

  // Methods (3)
  protected void inputVars(IUser)
  public boolean isSatisfied(IUser, int)
  public long getValue(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ConsecutiveDailyQuestCountRequirement
```
static class ConsecutiveDailyQuestCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$QuestCountRequirement

  // Fields (1)
  protected boolean countIsGood

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ConsecutiveDailyQuestCountRequirement(Operation, String, String, g, g, boolean)

  // Methods (9)
  public boolean requiresProgressToday(IUser, int)
  public boolean isAutoStart(IUser, int)
  public boolean isStarted(IUser, int)
  public void onDailyReset(IUser, int)
  public void onQuestCompleted(IUser, int)
  public void onQuestStarted(IUser, int)
  protected String getDayKey(int)
  public void ensureQuestStarted(IUser, int)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ContestAvailableRequirement
```
static class ContestAvailableRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private String extraData

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ContestAvailableRequirement(Operation, String, String, g, g)

  // Methods (2)
  public boolean isSatisfied(IUser, int)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ContestParticipationCountRequirement
```
static class ContestParticipationCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ContestParticipationCountRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ContestPointsRequirement
```
static class ContestPointsRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private String extraData

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ContestPointsRequirement(Operation, String, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$DailyChancesRequirement
```
static class DailyChancesRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private String key

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$DailyChancesRequirement(Operation, String, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$DailyQuestCountRequirement
```
static class DailyQuestCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$QuestCountRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$DailyQuestCountRequirement(Operation, String, String, g, g)

  // Methods (1)
  public void onDailyReset(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$DailyUsesRequirement
```
static class DailyUsesRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private String key

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$DailyUsesRequirement(Operation, String, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$DebugOnlyRequirement
```
static class DebugOnlyRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$DebugOnlyRequirement(Operation, String, g, g)

  // Methods (2)
  public boolean isSatisfied(IUser, int)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$DelegatingRequirement
```
abstract static class DelegatingRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$BaseRequirement

  // Fields (1)
  protected List delegateReqs

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$DelegatingRequirement(List, g, g)

  // Methods (3)
  protected void inputProgressDenomVars(IUser, int)
  protected void inputProgressNumerVars(IUser, int)
  public boolean isTime()
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ExpeditionStageCompletionCountRequirement
```
static class ExpeditionStageCompletionCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private String extraData

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ExpeditionStageCompletionCountRequirement(Operation, String, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$GameModeCompletionCountRequirement
```
static class GameModeCompletionCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private String extraData

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$GameModeCompletionCountRequirement(Operation, String, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$GuildIDRequirement
```
static class GuildIDRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$GuildIDRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasHeroAtRarityRequirement
```
static class HasHeroAtRarityRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private Rarity minRarity

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasHeroAtRarityRequirement(Operation, String, Rarity, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasHeroAtSkillLevelRequirement
```
static class HasHeroAtSkillLevelRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private String extraData

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasHeroAtSkillLevelRequirement(Operation, String, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasHeroRequirement
```
static class HasHeroRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private UnitType hero

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasHeroRequirement(Operation, String, UnitType, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasUniqueHeroAtLevelRequirement
```
static class HasUniqueHeroAtLevelRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasUniqueHeroAtLevelRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasUniqueHeroAtRarityRequirement
```
static class HasUniqueHeroAtRarityRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private String extraData

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasUniqueHeroAtRarityRequirement(Operation, String, String, g, g)

  // Methods (3)
  public int getProgressDenominator(IUser, int)
  public boolean isSatisfied(IUser, int)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasUniqueHeroAtSkillLevelRequirement
```
static class HasUniqueHeroAtSkillLevelRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private String extraData

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasUniqueHeroAtSkillLevelRequirement(Operation, String, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasUniqueHeroAtStarsRequirement
```
static class HasUniqueHeroAtStarsRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasUniqueHeroAtStarsRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasUniqueHeroUniqueSkillAtSkillLevelRequirement
```
static class HasUniqueHeroUniqueSkillAtSkillLevelRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private String extraData

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HasUniqueHeroUniqueSkillAtSkillLevelRequirement(Operation, String, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HeroCountRequirement
```
static class HeroCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HeroCountRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HighestHeroLevelRequirement
```
static class HighestHeroLevelRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$HighestHeroLevelRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$InclusiveOrRequirement
```
static class InclusiveOrRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$DelegatingRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$InclusiveOrRequirement(List, g, g)

  // Methods (4)
  public boolean requiresProgressToday(IUser, int)
  public boolean isSatisfied(IUser, int)
  public long getProperty(IUser, int)
  public long getValue(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ItemCountRequirement
```
static class ItemCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private ItemType item

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ItemCountRequirement(Operation, String, ItemType, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$LevelFilteredHeroCountRequirement
```
static class LevelFilteredHeroCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private int minLevel

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$LevelFilteredHeroCountRequirement(Operation, String, int, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$MaxTeamLevelRequirement
```
static class MaxTeamLevelRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$MaxTeamLevelRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$MoonPhaseRequirement
```
static class MoonPhaseRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$MoonPhaseRequirement(Operation, String, g, g)

  // Methods (2)
  public boolean requiresProgressToday(IUser, int)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$OpenedChestsRequirement
```
static class OpenedChestsRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  protected String chestTypeName

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$OpenedChestsRequirement(Operation, String, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$Operation
```
static final enum Operation extends java.lang.Enum

  // Fields (19)
  private static final Operation[] $VALUES
  public static final Operation AND
  public static final Operation EQUAL
  public static final Operation GREATER
  public static final Operation GREATER_OR_EQUAL
  public static final Operation LESS
  public static final Operation LESS_OR_EQUAL
  public static final Operation NOT_EQUAL
  public static final Operation NOT_SAME_DAY
  public static final Operation NOT_SAME_EVENT_DAY
  public static final Operation NOT_ZERO
  public static final Operation OR
  public static final Operation SAME_DAY
  public static final Operation SAME_EVENT_DAY
  public static final Operation ZERO
  private boolean greater
  private boolean less
  private boolean negate
  private int type

  // Constructors (3)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$Operation(String, int, boolean, boolean, boolean)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$Operation(String, int, boolean, int)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$Operation(String, int)

  // Methods (3)
  public final boolean isSatisfied(IUser, long, long)
  public static Operation[] values()
  public static Operation valueOf(String)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$Property
```
static final enum Property extends java.lang.Enum

  // Fields (54)
  private static final Property[] $VALUES
  public static final Property BOSS_BATTLE_WINS
  public static final Property BOSS_PIT_WINS
  public static final Property CAMPAIGN_STAGE_BEST_STARS
  public static final Property CAMPAIGN_STAGE_LAST_WIN
  public static final Property CAMPAIGN_STAGE_WINS
  public static final Property CAMPAIGN_STAGE_WINS_AT_BEST_STARS
  public static final Property CHAPTER_COUNT
  public static final Property COLISEUM_TIER_AND_DIVISION
  public static final Property CONSEC_QUEST_COUNT
  public static final Property CONTEST_AVAILABLE
  public static final Property CONTEST_POINTS
  public static final Property DAILY_CHANCES
  public static final Property DAILY_QUEST_COUNT
  public static final Property DAILY_USES
  public static final Property DEBUG_ONLY
  public static final Property EXPEDITION_STAGE_COMPLETION_COUNT
  public static final Property EXPERT_CHAPTER_COUNT
  public static final Property FIGHT_PIT_TIER_AND_DIVISION
  public static final Property GAMEMODE_COMPLETION_COUNT
  public static final Property GUILD_ID
  public static final Property HERO_AT_RARITY
  public static final Property HERO_COUNT
  public static final Property HERO_COUNT_AT_LEVEL
  public static final Property HERO_COUNT_AT_RARITY
  public static final Property HERO_COUNT_AT_SKILL_LEVEL
  public static final Property HERO_COUNT_AT_STARS
  public static final Property HERO_COUNT_MAX_ENCHANT
  public static final Property HIGHEST_HERO_LEVEL
  public static final Property ITEM_COUNT
  public static final Property MAX_TEAM_LEVEL
  public static final Property MOON_PHASE
  public static final Property NOT_CONSEC_QUEST_COUNT
  public static final Property OPENED_CHESTS
  public static final Property QUEST_COMPLETION_COUNT
  public static final Property QUEST_COUNT
  public static final Property QUEST_LAST_COMPLETED
  public static final Property RUNES_UNLOCKED
  public static final Property SAC_CONSEC_QUEST_COUNT
  public static final Property SAC_QUEST_COUNT
  public static final Property SERVER_TIME
  public static final Property SERVER_TIME_OF_DAY
  public static final Property TEAM_LEVEL
  public static final Property TOTAL_POWER
  public static final Property TOTAL_STARS
  public static final Property UNIQUE_HERO_AT_LEVEL
  public static final Property UNIQUE_HERO_AT_RARITY
  public static final Property UNIQUE_HERO_AT_SKILL_LEVEL
  public static final Property UNIQUE_HERO_AT_STARS
  public static final Property UNIQUE_HERO_UNIQUE_SKILL_AT_SKILL_LEVEL
  public static final Property USER_COUNT
  public static final Property USER_FLAG
  public static final Property USER_TZ_TIME_OF_DAY
  public static final Property VIP_LEVEL

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$Property(String, int)

  // Methods (2)
  public static Property[] values()
  public static Property valueOf(String)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$QuestCompletionCountRequirement
```
static class QuestCompletionCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private int questID

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$QuestCompletionCountRequirement(Operation, String, int, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$QuestCountRequirement
```
static class QuestCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  protected String key

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$QuestCountRequirement(Operation, String, String, g, g)

  // Methods (5)
  public void onQuestCompleted(IUser, int)
  public void onQuestStarted(IUser, int)
  public void ensureQuestStarted(IUser, int)
  protected long getProperty(IUser, int)
  protected String getKey(int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$QuestLastCompletedRequirement
```
static class QuestLastCompletedRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private int questID

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$QuestLastCompletedRequirement(Operation, String, int, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$QuestReqData
```
static class QuestReqData

  // Fields (10)
  public int campaignChapter
  public int campaignLevel
  public CampaignType campaignType
  public g denomExpr
  public String extra
  public g numExpr
  public Operation operation
  public Property property
  public UnitType unitType
  public String value

  // Constructors (2)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$QuestReqData()
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$RarityFilteredHeroCountRequirement
```
static class RarityFilteredHeroCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private Rarity minRarity

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$RarityFilteredHeroCountRequirement(Operation, String, Rarity, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$RarityFilteredHeroEnchantCountRequirement
```
static class RarityFilteredHeroEnchantCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private Rarity minRarity

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$RarityFilteredHeroEnchantCountRequirement(Operation, String, Rarity, g, g)

  // Methods (2)
  public boolean isAutoComplete(IUser, int)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$RunesUnlockedRequirement
```
static class RunesUnlockedRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$RunesUnlockedRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$SacrificeConsecutiveDailyQuestCountRequirement
```
static class SacrificeConsecutiveDailyQuestCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ConsecutiveDailyQuestCountRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$SacrificeConsecutiveDailyQuestCountRequirement(Operation, String, String, g, g)

  // Methods (3)
  public ResourceType getSacrificeResource(int)
  public ItemType getSacrificeItem(int)
  protected String getKey(int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$SacrificeQuestCountRequirement
```
static class SacrificeQuestCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$QuestCountRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$SacrificeQuestCountRequirement(Operation, String, String, g, g)

  // Methods (3)
  public ResourceType getSacrificeResource(int)
  public ItemType getSacrificeItem(int)
  protected String getKey(int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ServerTimeOfDayRequirement
```
static class ServerTimeOfDayRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ServerTimeOfDayRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ServerTimeRequirement
```
static class ServerTimeRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ServerTimeRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$StarsFilteredHeroCountRequirement
```
static class StarsFilteredHeroCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private int minStars

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$StarsFilteredHeroCountRequirement(Operation, String, int, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$TeamLevelRequirement
```
static class TeamLevelRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$TeamLevelRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$TotalPowerRequirement
```
static class TotalPowerRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$TotalPowerRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$TotalStarsRequirement
```
static class TotalStarsRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$TotalStarsRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$UserCountRequirement
```
static class UserCountRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private UserFlag key

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$UserCountRequirement(Operation, String, UserFlag, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$UserFlagRequirement
```
static class UserFlagRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Fields (1)
  private UserFlag key

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$UserFlagRequirement(Operation, String, UserFlag, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$UserTimeOfDayRequirement
```
public static class UserTimeOfDayRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$UserTimeOfDayRequirement(Operation, String, g, g)

  // Methods (17)
  public boolean isTime()
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$VipLevelRequirement
```
static class VipLevelRequirement extends com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$ComparisonRequirement

  // Constructors (1)
  com.perblue.rpg.game.data.misc.QuestStats$RequirementStats$VipLevelRequirement(Operation, String, g, g)

  // Methods (1)
  protected long getProperty(IUser, int)
```

## com.perblue.rpg.game.data.misc.RaidTicketPurchaseStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$RaidTicketPurchaseStats$Col
```

## com.perblue.rpg.game.data.misc.RaidTicketPurchaseStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col COST

  // Constructors (1)
  com.perblue.rpg.game.data.misc.RaidTicketPurchaseStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.StaminaStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$StaminaStats$Col
```

## com.perblue.rpg.game.data.misc.StaminaStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (5)
  private static final Col[] $VALUES
  public static final Col ALTERNATE_COST
  public static final Col COST
  public static final Col DROP_COUNT
  public static final Col DROP_MULTIPLIER

  // Constructors (1)
  com.perblue.rpg.game.data.misc.StaminaStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.SupportLinks$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$SupportLinks$Col
```

## com.perblue.rpg.game.data.misc.SupportLinks$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col VALUE

  // Constructors (1)
  com.perblue.rpg.game.data.misc.SupportLinks$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.SupportLinks$SupportLink
```
public static final enum SupportLink extends java.lang.Enum

  // Fields (26)
  private static final SupportLink[] $VALUES
  public static final SupportLink COMMUNITY_URL
  public static final SupportLink DISCOURSE_AUTH_URL
  public static final SupportLink DISCOURSE_COMMUNITY
  public static final SupportLink DISCOURSE_NEWS_AND_FEEDBACK
  public static final SupportLink DISCOURSE_SHARE_IDEA
  public static final SupportLink FACEBOOK_HOMEPAGE_URL
  public static final SupportLink FACEBOOK_PAGE_ID
  public static final SupportLink FAQ_URL
  public static final SupportLink LOST_ACCOUNT_FAQ
  public static final SupportLink OTHER_EMAIL_ADDRESS
  public static final SupportLink OTHER_EMAIL_SUBJECT
  public static final SupportLink PAYMENT_EMAIL_ADDRESS
  public static final SupportLink PAYMENT_EMAIL_SUBJECT
  public static final SupportLink RECOVERY_EMAIL_ADDRESS
  public static final SupportLink RECOVERY_EMAIL_SUBJECT
  public static final SupportLink REPORT_VIOLATION_EMAIL
  public static final SupportLink REPORT_VIOLATION_SUBJECT
  public static final SupportLink RUNE_GUIDE
  public static final SupportLink TUTORIAL_EMAIL_ADDRESS
  public static final SupportLink TUTORIAL_EMAIL_SUBJECT
  public static final SupportLink USER_VOICE_BUGS_FORUM
  public static final SupportLink USER_VOICE_IDEAS_FORUM
  public static final SupportLink USER_VOICE_URL
  public static final SupportLink WAR_GUIDE
  public static final SupportLink WHATS_NEW_URL

  // Constructors (1)
  com.perblue.rpg.game.data.misc.SupportLinks$SupportLink(String, int)

  // Methods (2)
  public static SupportLink[] values()
  public static SupportLink valueOf(String)
```

## com.perblue.rpg.game.data.misc.TeamLevelStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$TeamLevelStats$Col
```

## com.perblue.rpg.game.data.misc.TeamLevelStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (6)
  private static final Col[] $VALUES
  public static final Col EXP_TO_NEXT_LEVEL
  public static final Col MAX_HERO_LEVEL
  public static final Col MAX_STAMINA
  public static final Col POOL_EXP_PER_STAMINA
  public static final Col STAMINA_GAIN_ON_LEVEL

  // Constructors (1)
  com.perblue.rpg.game.data.misc.TeamLevelStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.Unlockable$1
```
static class 

  // Fields (5)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$ModeDifficulty
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$Unlockable
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ChestType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$GameMode
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UnitType
```

## com.perblue.rpg.game.data.misc.Unlockables$1
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$Unlockable
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$Unlockables$Col
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$MerchantType
```

## com.perblue.rpg.game.data.misc.Unlockables$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col TEAM_LEVEL_REQ

  // Constructors (1)
  com.perblue.rpg.game.data.misc.Unlockables$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.UserValues$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$UserValues$Col
```

## com.perblue.rpg.game.data.misc.UserValues$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col VALUE

  // Constructors (1)
  com.perblue.rpg.game.data.misc.UserValues$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.misc.VIPFeature$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$misc$VIPFeature
```

## com.perblue.rpg.game.data.rune.GeneralRuneDropTableStats$1
```
static class 
```

## com.perblue.rpg.game.data.rune.GeneralRuneDropTableStats$RuneDTCode
```
static class RuneDTCode extends com.perblue.rpg.game.logic.droptable.UserContextDTCode

  // Constructors (2)
  com.perblue.rpg.game.data.rune.GeneralRuneDropTableStats$RuneDTCode()

  // Methods (2)
  public void validateParamter(String, String, r)
  public void validateType(String, r)
```

## com.perblue.rpg.game.data.rune.GeneralRuneDropTableStats$RuneDTCode$1
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final RuneDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.rune.GeneralRuneDropTableStats$RuneDTCode$1(RuneDTCode)

  // Methods (3)
  protected Set generateAllPossibleValues()
  public String evaluate(UserDTContext)
```

## com.perblue.rpg.game.data.rune.GeneralRuneDropTableStats$RuneDTCode$2
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final RuneDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.rune.GeneralRuneDropTableStats$RuneDTCode$2(RuneDTCode)

  // Methods (3)
  public String evaluate$32677f44(n)
  protected Set generateAllPossibleValues()
```

## com.perblue.rpg.game.data.rune.RuneStats$1
```
static class 

  // Fields (12)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$rune$RuneStats$RuneBonusStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$rune$RuneStats$RuneHeroKeystones$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$rune$RuneStats$RuneHeroRecommendedSetStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$rune$RuneStats$RuneOfferingPackageStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$rune$RuneStats$RuneRarityStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$rune$RuneStats$RuneSetStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$rune$RuneStats$RuneShrineStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$rune$RuneStats$RuneStarStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$rune$RuneStats$RuniciteMidasStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ItemType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$RuneBonusType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$RuneShrineType
```

## com.perblue.rpg.game.data.rune.RuneStats$BonusFunction
```
## com.perblue.rpg.game.data.rune.RuneStats$BonusFunction [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$BonusFunction disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$EmpowerChances
```
public static class EmpowerChances extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  protected float[][] chances

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$EmpowerChances()

  // Methods (5)
  protected void initStats(int, int)
  protected void saveStat(Level, Level, String)
  protected void onMissingRow(String, Level)
```

## com.perblue.rpg.game.data.rune.RuneStats$EmpowerCosts
```
## com.perblue.rpg.game.data.rune.RuneStats$EmpowerCosts [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$EmpowerCosts disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneBonusStats
```
## com.perblue.rpg.game.data.rune.RuneStats$RuneBonusStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneBonusStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneBonusStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (7)
  private static final Col[] $VALUES
  public static final Col BONUS_FUNCTION
  public static final Col IS_GROWTH
  public static final Col MAJOR_BONUS
  public static final Col PRIMARY
  public static final Col SECONDARY
  public static final Col TERTIARY

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneBonusStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.rune.RuneStats$RuneConstant
```
public static final enum RuneConstant extends java.lang.Enum

  // Fields (11)
  private static final RuneConstant[] $VALUES
  public static final RuneConstant EMPOWER_MULTIPLE_UNLOCK_RUNE_LEVEL
  public static final RuneConstant EMPOWER_ODDS
  public static final RuneConstant EMPOWER_ODDS_MEM
  public static final RuneConstant FIRST_SLOT_OFFERING_CHAPTER
  public static final RuneConstant FUSION_UNLOCK_RUNE_LEVEL
  public static final RuneConstant HERO_LEVEL_REQ
  public static final RuneConstant SERVERS_WITH_12_ENCHANT_MAX
  public static final RuneConstant SERVERS_WITH_5_STAR_RUNE_MAX
  public static final RuneConstant SHARDS_IGNORING_HERO_LEVEL_REQS
  private Class clazz

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneConstant(String, int, Class)

  // Methods (3)
  public final Class getConstantType()
  public static RuneConstant[] values()
  public static RuneConstant valueOf(String)
```

## com.perblue.rpg.game.data.rune.RuneStats$RuneConstants
```
## com.perblue.rpg.game.data.rune.RuneStats$RuneConstants [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneConstants disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneConstants$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col Value

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneConstants$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.rune.RuneStats$RuneContext
```
## com.perblue.rpg.game.data.rune.RuneStats$RuneContext [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneContext disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneHeroKeystones
```
## com.perblue.rpg.game.data.rune.RuneStats$RuneHeroKeystones [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneHeroKeystones disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneHeroKeystones$Col
```
static final enum Col extends java.lang.Enum

  // Fields (4)
  private static final Col[] $VALUES
  public static final Col BONUS
  public static final Col HERO
  public static final Col MAGNITUDE

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneHeroKeystones$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.rune.RuneStats$RuneHeroRecommendedSetStats
```
## com.perblue.rpg.game.data.rune.RuneStats$RuneHeroRecommendedSetStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneHeroRecommendedSetStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneHeroRecommendedSetStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col SETS

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneHeroRecommendedSetStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.rune.RuneStats$RuneOfferingPackageStats
```
## com.perblue.rpg.game.data.rune.RuneStats$RuneOfferingPackageStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneOfferingPackageStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneOfferingPackageStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col COST

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneOfferingPackageStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.rune.RuneStats$RuneRarityStats
```
## com.perblue.rpg.game.data.rune.RuneStats$RuneRarityStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneRarityStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneRarityStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (3)
  private static final Col[] $VALUES
  public static final Col BONUSES
  public static final Col LEVEL

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneRarityStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.rune.RuneStats$RuneSellValues
```
## com.perblue.rpg.game.data.rune.RuneStats$RuneSellValues [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneSellValues disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneSetStats
```
## com.perblue.rpg.game.data.rune.RuneStats$RuneSetStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneSetStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneSetStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (8)
  private static final Col[] $VALUES
  public static final Col BONUS_FUNCTION
  public static final Col CONTENT_UPDATE
  public static final Col MAGNITUDE
  public static final Col MIN_TEAM_LEVEL
  public static final Col RUNE_SET_EFFECT
  public static final Col SET_SIZE
  public static final Col SHARDS_IGNORING_TL_CU

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneSetStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.rune.RuneStats$RuneShrineDrops
```
## com.perblue.rpg.game.data.rune.RuneStats$RuneShrineDrops [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneShrineDrops disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneShrineDrops$1
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneShrineDrops$1()

  // Methods (3)
  protected final Set generateAllPossibleValues()
## com.perblue.rpg.game.data.rune.RuneStats$RuneShrineDrops$1 [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$ShrineContext disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneShrineDrops$2
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneShrineDrops$2()

  // Methods (3)
  protected final Set generateAllPossibleValues()
## com.perblue.rpg.game.data.rune.RuneStats$RuneShrineDrops$2 [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$ShrineContext disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneShrineDrops$3
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneShrineDrops$3()

  // Methods (3)
  protected final Set generateAllPossibleValues()
## com.perblue.rpg.game.data.rune.RuneStats$RuneShrineDrops$3 [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$ShrineContext disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneShrineStats
```
## com.perblue.rpg.game.data.rune.RuneStats$RuneShrineStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneShrineStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneShrineStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col DIAMOND_COST

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneShrineStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.rune.RuneStats$RuneStarStats
```
## com.perblue.rpg.game.data.rune.RuneStats$RuneStarStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneStarStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneStarStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (4)
  private static final Col[] $VALUES
  public static final Col FUSION_POINT_COST
  public static final Col FUSION_POINT_VALUE
  public static final Col UNEQUIP_COST

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneStarStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.rune.RuneStats$RuneUpgrades
```
## com.perblue.rpg.game.data.rune.RuneStats$RuneUpgrades [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneUpgrades disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneUpgrades$1
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneUpgrades$1()

  // Methods (3)
  protected final Set generateAllPossibleValues()
## com.perblue.rpg.game.data.rune.RuneStats$RuneUpgrades$1 [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneContext disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneUpgrades$2
```
static final class  extends com.perblue.common.b.b

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneUpgrades$2(int)

  // Methods (2)
## com.perblue.rpg.game.data.rune.RuneStats$RuneUpgrades$2 [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuneContext disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuneUpgrades$3
```
static final class  implements com.perblue.common.b.o

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuneUpgrades$3()

  // Methods (2)
  public final void getSummrayOfAll(r, q)
  public final List execute(p)
```

## com.perblue.rpg.game.data.rune.RuneStats$RuniciteCritStats
```
## com.perblue.rpg.game.data.rune.RuneStats$RuniciteCritStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuniciteCritStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuniciteCritStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col CHANCE

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuniciteCritStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.rune.RuneStats$RuniciteMidasStats
```
## com.perblue.rpg.game.data.rune.RuneStats$RuniciteMidasStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$RuniciteMidasStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.rune.RuneStats$RuniciteMidasStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (4)
  private static final Col[] $VALUES
  public static final Col BASE_RUNICITE
  public static final Col COST
  public static final Col TOTAL_RUNICITE

  // Constructors (1)
  com.perblue.rpg.game.data.rune.RuneStats$RuniciteMidasStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.rune.RuneStats$ShrineContext
```
## com.perblue.rpg.game.data.rune.RuneStats$ShrineContext [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.rune.RuneStats and com.perblue.rpg.game.data.rune.RuneStats$ShrineContext disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.social.SocialDataManager$1
```
 class  implements com.perblue.rpg.ui.widgets.DecisionListener

  // Fields (1)
  final SocialDataManager this$0

  // Constructors (1)
  com.perblue.rpg.game.data.social.SocialDataManager$1(SocialDataManager)

  // Methods (1)
  public void onDecision(DecisionResult)
```

## com.perblue.rpg.game.data.social.SocialDataManager$2
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ChatRoomType
```

## com.perblue.rpg.game.data.social.SocialDataManager$SocialDataListener
```
public abstract static interface interface SocialDataListener

  // Methods (9)
  public abstract void updateChat(ClientChat)
  public abstract void updateUser(BasicUserInfo)
  public abstract void addPMRoom(PMRoomSummary)
  public abstract void receivedEmptyPMThread(PMThread)
  public abstract void removeAllChatsFromPlayer(long)
  public abstract void clearChat(ChatRoomType)
  public abstract void addChats(List, boolean)
  public abstract void newChat(ClientChat, boolean, long)
  public abstract void removeChat(long, ChatRoomType)
```

## com.perblue.rpg.game.data.sound.SoundData$SoundType
```
public static final enum SoundType extends java.lang.Enum

  // Fields (4)
  private static final SoundType[] $VALUES
  public static final SoundType DOT
  public static final SoundType NORMAL
  public static final SoundType SPLASH

  // Constructors (1)
  com.perblue.rpg.game.data.sound.SoundData$SoundType(String, int)

  // Methods (2)
  public static SoundType[] values()
  public static SoundType valueOf(String)
```

## com.perblue.rpg.game.data.sound.SoundUtil$1
```
static final class  extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (1)
  final Unit val$unit

  // Constructors (1)
  com.perblue.rpg.game.data.sound.SoundUtil$1(Unit)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.sound.SoundUtil$2
```
static final class  extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (1)
  final Unit val$unit

  // Constructors (1)
  com.perblue.rpg.game.data.sound.SoundUtil$2(Unit)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.sound.SoundUtil$3
```
static final class  extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (1)
  final EnvEntity val$entity

  // Constructors (1)
  com.perblue.rpg.game.data.sound.SoundUtil$3(EnvEntity)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.sound.SoundUtil$4
```
static final class  extends com.esotericsoftware.spine.AnimationState$AnimationStateAdapter

  // Fields (1)
  final Projectile val$projectile

  // Constructors (1)
  com.perblue.rpg.game.data.sound.SoundUtil$4(Projectile)

  // Methods (1)
  public final void event(int, Event)
```

## com.perblue.rpg.game.data.sound.SoundUtil$5
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$game$objects$EnvEntityType
  static final int[] $SwitchMap$com$perblue$rpg$game$objects$ProjectileType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UnitType
```

## com.perblue.rpg.game.data.titantemple.TitanTempleStats$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$titantemple$TitanTempleStats$EnemyLevelStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$titantemple$TitanTempleStats$WinStreakStats$Col
```

## com.perblue.rpg.game.data.titantemple.TitanTempleStats$Constant
```
static final enum Constant extends java.lang.Enum

  // Fields (3)
  private static final Constant[] $VALUES
  public static final Constant LEVELS_PER_WIN
  private int value

  // Constructors (1)
  com.perblue.rpg.game.data.titantemple.TitanTempleStats$Constant(String, int, int)

  // Methods (4)
  public static Constant[] values()
  public static Constant valueOf(String)
```

## com.perblue.rpg.game.data.titantemple.TitanTempleStats$Constants
```
static class Constants extends com.perblue.common.stats.GeneralStats

  // Constructors (2)
  com.perblue.rpg.game.data.titantemple.TitanTempleStats$Constants()

  // Methods (2)
  protected void saveStat(Constant, String, String)
```

## com.perblue.rpg.game.data.titantemple.TitanTempleStats$EnemyLevelStats
```
static class EnemyLevelStats extends com.perblue.common.stats.GeneralStats

  // Fields (2)
  private Rarity[] rarity
  private int[] stars

  // Constructors (1)
  com.perblue.rpg.game.data.titantemple.TitanTempleStats$EnemyLevelStats()

  // Methods (5)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.titantemple.TitanTempleStats$EnemyLevelStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (3)
  private static final Col[] $VALUES
  public static final Col RARITY
  public static final Col STARS

  // Constructors (1)
  com.perblue.rpg.game.data.titantemple.TitanTempleStats$EnemyLevelStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.titantemple.TitanTempleStats$EnemyStats
```
static class EnemyStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (2)
  com.perblue.rpg.game.data.titantemple.TitanTempleStats$EnemyStats()
```

## com.perblue.rpg.game.data.titantemple.TitanTempleStats$RewardsCode
```
static class RewardsCode extends com.perblue.rpg.game.logic.droptable.UserContextDTCode

  // Constructors (1)
  com.perblue.rpg.game.data.titantemple.TitanTempleStats$RewardsCode()
```

## com.perblue.rpg.game.data.titantemple.TitanTempleStats$RewardsContext
```
static class RewardsContext extends com.perblue.rpg.game.logic.droptable.UserDTContext

  // Fields (2)
   List possibleRewards
   a rnd

  // Constructors (1)
  com.perblue.rpg.game.data.titantemple.TitanTempleStats$RewardsContext(IUser)
```

## com.perblue.rpg.game.data.titantemple.TitanTempleStats$RewardsStats
```
static class RewardsStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (2)
  com.perblue.rpg.game.data.titantemple.TitanTempleStats$RewardsStats()

  // Methods (1)
  private static RewardsCode createCode()
```

## com.perblue.rpg.game.data.titantemple.TitanTempleStats$RewardsStats$1
```
static final class  implements com.perblue.common.b.o

  // Constructors (1)
  com.perblue.rpg.game.data.titantemple.TitanTempleStats$RewardsStats$1()

  // Methods (2)
  public final void getSummrayOfAll(r, q)
  public final List execute(p)
```

## com.perblue.rpg.game.data.titantemple.TitanTempleStats$WinStreakStats
```
static class WinStreakStats extends com.perblue.common.stats.GeneralStats

  // Fields (2)
  private int[] drops
  private int[] tokens

  // Constructors (1)
  com.perblue.rpg.game.data.titantemple.TitanTempleStats$WinStreakStats()

  // Methods (5)
  public int getNumDrops(int)
  public int getNumTokens(int)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.titantemple.TitanTempleStats$WinStreakStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (3)
  private static final Col[] $VALUES
  public static final Col DROPS
  public static final Col TOKENS

  // Constructors (1)
  com.perblue.rpg.game.data.titantemple.TitanTempleStats$WinStreakStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.tutorial.TutorialStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (5)
  private static final Col[] $VALUES
  public static final Col LEVEL
  public static final Col PHASE
  public static final Col SIDE
  public static final Col STARS

  // Constructors (1)
  com.perblue.rpg.game.data.tutorial.TutorialStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.tutorial.TutorialStats$Side
```
public static final enum Side extends java.lang.Enum

  // Fields (3)
  private static final Side[] $VALUES
  public static final Side AI
  public static final Side PLAYER

  // Constructors (1)
  com.perblue.rpg.game.data.tutorial.TutorialStats$Side(String, int)

  // Methods (2)
  public static Side[] values()
  public static Side valueOf(String)
```

## com.perblue.rpg.game.data.tutorial.TutorialStats$TutorialLevels
```
public static class TutorialLevels

  // Fields (2)
  public final int level
  public final int stars

  // Constructors (1)
  com.perblue.rpg.game.data.tutorial.TutorialStats$TutorialLevels(int, int)
```

## com.perblue.rpg.game.data.unit.BaseUnitStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$BaseUnitStats$Col
```

## com.perblue.rpg.game.data.unit.BaseUnitStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (4)
  private static final Col[] $VALUES
  public static final Col AGILITY
  public static final Col INTELLECT
  public static final Col STRENGTH

  // Constructors (1)
  com.perblue.rpg.game.data.unit.BaseUnitStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.GeneralUnitStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$GeneralUnitStats$Col
```

## com.perblue.rpg.game.data.unit.GeneralUnitStats$Col
```
public static final enum Col extends java.lang.Enum

  // Fields (20)
  private static final Col[] $VALUES
  public static final Col ACCURACY
  public static final Col AGILITY
  public static final Col ARMOR
  public static final Col ATTACK_DAMAGE
  public static final Col CORE_STAT
  public static final Col INTELLECT
  public static final Col IS_HERO
  public static final Col MAGIC_POWER
  public static final Col MAGIC_RESISTANCE
  public static final Col MAX_HP
  public static final Col PHYSICAL_CRIT
  public static final Col ROLE
  public static final Col SECTION
  public static final Col STARTING_SKILLS
  public static final Col STARTING_STARS
  public static final Col STRENGTH
  public static final Col SUB_SECTION
  public static final Col TAGS
  public static final Col VERTICAL_SORTING

  // Constructors (1)
  com.perblue.rpg.game.data.unit.GeneralUnitStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.ProjectileStats$1
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$ProjectileStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$objects$ProjectileType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ItemType
```

## com.perblue.rpg.game.data.unit.ProjectileStats$Col
```
public static final enum Col extends java.lang.Enum

  // Fields (7)
  private static final Col[] $VALUES
  public static final Col GRAVITY
  public static final Col HOMING
  public static final Col MAX_LAUNCH_ANGLE
  public static final Col MAX_LAUNCH_SPEED
  public static final Col MIN_LAUNCH_ANGLE
  public static final Col MIN_LAUNCH_SPEED

  // Constructors (1)
  com.perblue.rpg.game.data.unit.ProjectileStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.UnitStats$1
```
static final class  extends com.perblue.rpg.game.data.unit.BaseUnitStats

  // Constructors (1)
  com.perblue.rpg.game.data.unit.UnitStats$1()
```

## com.perblue.rpg.game.data.unit.UnitStats$2
```
static final class  extends java.util.EnumMap

  // Constructors (1)
  com.perblue.rpg.game.data.unit.UnitStats$2(Class)
```

## com.perblue.rpg.game.data.unit.UnitStats$3
```
static final class  extends com.perblue.rpg.game.data.unit.gear.BaseHeroGearStats

  // Constructors (1)
  com.perblue.rpg.game.data.unit.UnitStats$3()
```

## com.perblue.rpg.game.data.unit.UnitStats$4
```
static final class  extends java.util.EnumMap

  // Constructors (1)
  com.perblue.rpg.game.data.unit.UnitStats$4(Class)
```

## com.perblue.rpg.game.data.unit.UnitStats$5
```
static class 

  // Fields (10)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$item$StatType
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$UnitStats$CoreStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$UnitStats$HeroEXPStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$UnitStats$HeroStoneStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$UnitStats$NpcGrowthStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$UnitStats$PowerStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$UnitStats$PromotionStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$HeroTag
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$Rarity
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UnitType
```

## com.perblue.rpg.game.data.unit.UnitStats$CoreStats
```
## com.perblue.rpg.game.data.unit.UnitStats$CoreStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.unit.UnitStats and com.perblue.rpg.game.data.unit.UnitStats$CoreStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.unit.UnitStats$CoreStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (3)
  private static final Col[] $VALUES
  public static final Col MAX_VALUE
  public static final Col STAT

  // Constructors (1)
  com.perblue.rpg.game.data.unit.UnitStats$CoreStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.UnitStats$HeroEXPStats
```
## com.perblue.rpg.game.data.unit.UnitStats$HeroEXPStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.unit.UnitStats and com.perblue.rpg.game.data.unit.UnitStats$HeroEXPStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.unit.UnitStats$HeroEXPStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col EXP

  // Constructors (1)
  com.perblue.rpg.game.data.unit.UnitStats$HeroEXPStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.UnitStats$HeroStoneStats
```
## com.perblue.rpg.game.data.unit.UnitStats$HeroStoneStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.unit.UnitStats and com.perblue.rpg.game.data.unit.UnitStats$HeroStoneStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.unit.UnitStats$HeroStoneStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (4)
  private static final Col[] $VALUES
  public static final Col EVOLVE_COST
  public static final Col STONES
  public static final Col UNLOCK_COST

  // Constructors (1)
  com.perblue.rpg.game.data.unit.UnitStats$HeroStoneStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.UnitStats$NpcGrowthStats
```
## com.perblue.rpg.game.data.unit.UnitStats$NpcGrowthStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.unit.UnitStats and com.perblue.rpg.game.data.unit.UnitStats$NpcGrowthStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.unit.UnitStats$NpcGrowthStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (7)
  private static final Col[] $VALUES
  public static final Col ACCURACY
  public static final Col AGILITY
  public static final Col DODGE
  public static final Col INTELLECT
  public static final Col LIFE_STEAL_RATING
  public static final Col STRENGTH

  // Constructors (1)
  com.perblue.rpg.game.data.unit.UnitStats$NpcGrowthStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.UnitStats$PowerStats
```
## com.perblue.rpg.game.data.unit.UnitStats$PowerStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.unit.UnitStats and com.perblue.rpg.game.data.unit.UnitStats$PowerStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.unit.UnitStats$PowerStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col POWER

  // Constructors (1)
  com.perblue.rpg.game.data.unit.UnitStats$PowerStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.UnitStats$PromotionStats
```
## com.perblue.rpg.game.data.unit.UnitStats$PromotionStats [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.data.unit.UnitStats and com.perblue.rpg.game.data.unit.UnitStats$PromotionStats disagree on InnerClasses attribute]

## com.perblue.rpg.game.data.unit.UnitStats$PromotionStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (4)
  private static final Col[] $VALUES
  public static final Col AGILITY
  public static final Col INTELLECT
  public static final Col STRENGTH

  // Constructors (1)
  com.perblue.rpg.game.data.unit.UnitStats$PromotionStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.UnitStatsMath$1
```
static final class  extends com.badlogic.gdx.utils.ac

  // Constructors (1)
  com.perblue.rpg.game.data.unit.UnitStatsMath$1()

  // Methods (2)
  protected final CacheContext newObject()
```

## com.perblue.rpg.game.data.unit.UnitStatsMath$2
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$item$StatType
```

## com.perblue.rpg.game.data.unit.UnitStatsMath$CacheContext
```
static class CacheContext

  // Fields (3)
  private float agility
  private float intellect
  private float strength

  // Constructors (2)
  com.perblue.rpg.game.data.unit.UnitStatsMath$CacheContext()

  // Methods (6)
```

## com.perblue.rpg.game.data.unit.UnitStatsMath$USMConfig
```
public static class USMConfig

  // Fields (4)
  private boolean currentGearOnly
  private boolean growthOnly
  private float itemBase
  private float runes

  // Constructors (2)
  com.perblue.rpg.game.data.unit.UnitStatsMath$USMConfig()

  // Methods (8)
```

## com.perblue.rpg.game.data.unit.skill.BaseSkillsStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$skill$BaseSkillsStats$Col
```

## com.perblue.rpg.game.data.unit.skill.BaseSkillsStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (1)
  private static final Col[] $VALUES

  // Constructors (1)
  com.perblue.rpg.game.data.unit.skill.BaseSkillsStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.skill.GeneralSkillStats$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$skill$GeneralSkillStats$Col
```

## com.perblue.rpg.game.data.unit.skill.GeneralSkillStats$Col
```
public static final enum Col extends java.lang.Enum

  // Fields (19)
  private static final Col[] $VALUES
  public static final Col CAST_RANGE
  public static final Col CATEGORY
  public static final Col COOLDOWN
  public static final Col DAMAGE_SUB_TYPE
  public static final Col DAMAGE_TYPE
  public static final Col DURATION
  public static final Col ENERGY_GAIN
  public static final Col INIT_COOLDOWN
  public static final Col MISC_RANGE
  public static final Col PRIORITY
  public static final Col PROJECTILE_TYPE
  public static final Col RARITY
  public static final Col SPLASH_RANGE
  public static final Col TAGS
  public static final Col TARGET_TAG
  public static final Col TRIGGER_RANGE
  public static final Col UNIT
  public static final Col VISUAL_DURATION

  // Constructors (1)
  com.perblue.rpg.game.data.unit.skill.GeneralSkillStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.skill.SkillStats$1
```
static class 

  // Fields (6)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$skill$SkillStats$CombatStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$skill$SkillStats$PowerStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$skill$SkillStats$PurchaseCostStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$unit$skill$SkillStats$SkillDynamicStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$HeroTag
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$Rarity
```

## com.perblue.rpg.game.data.unit.skill.SkillStats$CombatStats
```
static class CombatStats extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  protected EnumMap combatStats

  // Constructors (1)
  com.perblue.rpg.game.data.unit.skill.SkillStats$CombatStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(Row, Col, String)
```

## com.perblue.rpg.game.data.unit.skill.SkillStats$CombatStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col VALUE

  // Constructors (1)
  com.perblue.rpg.game.data.unit.skill.SkillStats$CombatStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.skill.SkillStats$CombatStats$Row
```
static final enum Row extends java.lang.Enum

  // Fields (2)
  private static final Row[] $VALUES
  public static final Row HP_PERCENT_TO_STAGGER

  // Constructors (1)
  com.perblue.rpg.game.data.unit.skill.SkillStats$CombatStats$Row(String, int)

  // Methods (2)
  public static Row[] values()
  public static Row valueOf(String)
```

## com.perblue.rpg.game.data.unit.skill.SkillStats$PowerStats
```
static class PowerStats extends com.perblue.common.stats.GeneralStats

  // Fields (2)
  protected Map powerPerPoint
  protected Map unlockPower

  // Constructors (1)
  com.perblue.rpg.game.data.unit.skill.SkillStats$PowerStats()

  // Methods (5)
  protected void initStats(int, int)
  protected void saveStat(Rarity, Col, String)
  protected void onMissingRow(String, Rarity)
```

## com.perblue.rpg.game.data.unit.skill.SkillStats$PowerStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (3)
  private static final Col[] $VALUES
  public static final Col POWER_PER_POINT
  public static final Col UNLOCK_POWER

  // Constructors (1)
  com.perblue.rpg.game.data.unit.skill.SkillStats$PowerStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.skill.SkillStats$PurchaseCostStats
```
static class PurchaseCostStats extends com.perblue.common.stats.GeneralStats

  // Fields (1)
  protected int[] cost

  // Constructors (1)
  com.perblue.rpg.game.data.unit.skill.SkillStats$PurchaseCostStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.unit.skill.SkillStats$PurchaseCostStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col COST

  // Constructors (1)
  com.perblue.rpg.game.data.unit.skill.SkillStats$PurchaseCostStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.unit.skill.SkillStats$SkillDynamicStats
```
public static class SkillDynamicStats extends com.perblue.common.stats.GeneralStats

  // Fields (5)
  public EnumMap EFFECT_DURATIONS
  public EnumMap W
  public EnumMap X
  public EnumMap Y
  public EnumMap Z

  // Constructors (1)
  com.perblue.rpg.game.data.unit.skill.SkillStats$SkillDynamicStats()

  // Methods (5)
  protected void initStats(int, int)
  protected void saveStat(SkillType, Col, String)
  protected void onMissingRow(String, SkillType)
```

## com.perblue.rpg.game.data.unit.skill.SkillStats$SkillDynamicStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (6)
  private static final Col[] $VALUES
  public static final Col EFFECT_DURATION
  public static final Col STAT_W
  public static final Col STAT_X
  public static final Col STAT_Y
  public static final Col STAT_Z

  // Constructors (1)
  com.perblue.rpg.game.data.unit.skill.SkillStats$SkillDynamicStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$1
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$war$GuildWarStats$GuildWarConstants$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$war$GuildWarStats$WarModifierSetStats$Col
  static final int[] $SwitchMap$com$perblue$rpg$game$data$war$GuildWarStats$WarModifierStats$Col
```

## com.perblue.rpg.game.data.war.GuildWarStats$ActiveWarModifierStats
```
static class ActiveWarModifierStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$ActiveWarModifierStats()

  // Methods (1)
  private static ActiveWarModifierStatsCode createCode()
```

## com.perblue.rpg.game.data.war.GuildWarStats$ActiveWarModifierStatsCode
```
static class ActiveWarModifierStatsCode extends com.perblue.rpg.game.data.war.GuildWarStats$WarContextDTCode

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$ActiveWarModifierStatsCode()
```

## com.perblue.rpg.game.data.war.GuildWarStats$ContributionRewardSaclars
```
static class ContributionRewardSaclars extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$ContributionRewardSaclars()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$ContributionRewardSaclars$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col Scalar

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$ContributionRewardSaclars$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$GuildWarConstant
```
public static final enum GuildWarConstant extends java.lang.Enum

  // Fields (32)
  private static final GuildWarConstant[] $VALUES
  public static final GuildWarConstant ATTACKS_PER_BATTLE
  public static final GuildWarConstant BATTLE_ATK_LOSS_WAR_TOKENS
  public static final GuildWarConstant BATTLE_ATK_WIN_WAR_TOKENS
  public static final GuildWarConstant BATTLE_DEF_LOSS_WAR_TOKENS
  public static final GuildWarConstant BATTLE_DEF_WIN_WAR_TOKENS
  public static final GuildWarConstant BATTLE_GOLD_REWARD
  public static final GuildWarConstant BATTLE_WIN_STREAK_COUNT
  public static final GuildWarConstant BATTLE_WIN_STREAK_MAX_MMR
  public static final GuildWarConstant BATTLE_WIN_STREAK_REWARD
  public static final GuildWarConstant FITNESS_DEFENSE_PENALTY
  public static final GuildWarConstant HANDICAP_SIZE
  public static final GuildWarConstant INITIAL_MMR
  public static final GuildWarConstant MAX_BATTLES_PER_WAR
  public static final GuildWarConstant MAX_DEFENSIVE_BATTLES
  public static final GuildWarConstant MAX_WAR_TICKET_STORAGE
  public static final GuildWarConstant MEMBER_DROP_KICK_THRESHOLD
  public static final GuildWarConstant MIN_ELIGIBLE_MEMBERS
  public static final GuildWarConstant MMR_DECAY_RATE
  public static final GuildWarConstant MMR_DECAY_THRESHOLD
  public static final GuildWarConstant MMR_K
  public static final GuildWarConstant MMR_SCALAR
  public static final GuildWarConstant MMR_SEARCH_BACKOFF
  public static final GuildWarConstant MMR_SEARCH_INITIAL_RANGE
  public static final GuildWarConstant OPT_OUT_COOLDOWN_MINUTES
  public static final GuildWarConstant RANK_MATCHMAKING_THRESHOLD
  public static final GuildWarConstant RECOMMENDED_POWER_SCALAR
  public static final GuildWarConstant RETRIES_PER_ATTACK
  public static final GuildWarConstant SURRENDER_DISABLE_TIME
  public static final GuildWarConstant TOP_LINEUP_BONUS_AMOUNT
  public static final GuildWarConstant TOP_LINEUP_BONUS_PERCENT
  public static final GuildWarConstant VICTORY_TARGET

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$GuildWarConstant(String, int)

  // Methods (2)
  public static GuildWarConstant[] values()
  public static GuildWarConstant valueOf(String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$GuildWarConstants
```
static class GuildWarConstants extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$GuildWarConstants()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(GuildWarConstant, Col, String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$GuildWarConstants$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col Value

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$GuildWarConstants$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$GuildWarFightStats
```
static class GuildWarFightStats extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$GuildWarFightStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$GuildWarFightStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (6)
  private static final Col[] $VALUES
  public static final Col ATK_LOSS_CONTRIB
  public static final Col ATK_WIN_CONTRIB
  public static final Col ATK_WIN_GOLD
  public static final Col BATTLE_POINTS
  public static final Col DEF_SURVIVE_CONTRIB

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$GuildWarFightStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$GuildWarMatchmakingStats
```
static class GuildWarMatchmakingStats extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$GuildWarMatchmakingStats()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(Integer, Integer, String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$GuildWarRewards
```
static class GuildWarRewards extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$GuildWarRewards()

  // Methods (3)
  protected void initStats(int, int)
  protected void saveStat(Integer, Col, String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$GuildWarRewards$Col
```
static final enum Col extends java.lang.Enum

  // Fields (9)
  private static final Col[] $VALUES
  public static final Col ICON
  public static final Col INTERPOLATE_TOKENS
  public static final Col LOWEST_RANK
  public static final Col MAX_TOKENS
  public static final Col PICK_A
  public static final Col PICK_B
  public static final Col PICK_C
  public static final Col PICK_D

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$GuildWarRewards$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$NPCStats
```
static class NPCStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$NPCStats()

  // Methods (1)
  private static NPCStatsCode createCode()
```

## com.perblue.rpg.game.data.war.GuildWarStats$NPCStatsCode
```
static class NPCStatsCode extends com.perblue.rpg.game.data.war.GuildWarStats$WarContextDTCode

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$NPCStatsCode()
```

## com.perblue.rpg.game.data.war.GuildWarStats$PickDropCode
```
static class PickDropCode extends com.perblue.rpg.game.logic.droptable.UserContextDTCode

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$PickDropCode()
```

## com.perblue.rpg.game.data.war.GuildWarStats$PickDropStats
```
static class PickDropStats extends com.perblue.rpg.game.data.RPGDropTableStats

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$PickDropStats()

  // Methods (1)
  private static PickDropCode createCode()
```

## com.perblue.rpg.game.data.war.GuildWarStats$PickDropStats$1
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$PickDropStats$1(String[])

  // Methods (2)
  public final String evaluate(RewardsContext)
```

## com.perblue.rpg.game.data.war.GuildWarStats$PickDropStats$2
```
static final class  extends com.perblue.common.b.s

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$PickDropStats$2(String[])

  // Methods (2)
  public final String evaluate(RewardsContext)
```

## com.perblue.rpg.game.data.war.GuildWarStats$PickRewardAmounts
```
static class PickRewardAmounts extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$PickRewardAmounts()

  // Methods (5)
  protected void initStats(int, int)
  protected void saveStat(Level, Col, String)
  protected void onMissingRow(String, Level)
```

## com.perblue.rpg.game.data.war.GuildWarStats$PickRewardAmounts$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col NumPicks

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$PickRewardAmounts$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$RewardsContext
```
public static class RewardsContext extends com.perblue.rpg.game.logic.droptable.UserDTContext

  // Fields (1)
   int level

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$RewardsContext(IUser, int)
```

## com.perblue.rpg.game.data.war.GuildWarStats$WarContext
```
public static class WarContext extends com.perblue.common.b.n

  // Fields (1)
   long warID

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$WarContext(long)
```

## com.perblue.rpg.game.data.war.GuildWarStats$WarContextDTCode
```
public static class WarContextDTCode extends com.perblue.rpg.game.logic.droptable.EmptyContextDTCode

  // Constructors (4)
  com.perblue.rpg.game.data.war.GuildWarStats$WarContextDTCode(String[])
  com.perblue.rpg.game.data.war.GuildWarStats$WarContextDTCode(Class, String[])
  com.perblue.rpg.game.data.war.GuildWarStats$WarContextDTCode(Class)
  com.perblue.rpg.game.data.war.GuildWarStats$WarContextDTCode()
```

## com.perblue.rpg.game.data.war.GuildWarStats$WarContextDTCode$1
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final WarContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$WarContextDTCode$1(WarContextDTCode, ax)

  // Methods (2)
  public String evaluate(WarContext)
```

## com.perblue.rpg.game.data.war.GuildWarStats$WarContextDTCode$2
```
 class  implements com.perblue.common.b.k

  // Fields (1)
  final WarContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$WarContextDTCode$2(WarContextDTCode)

  // Methods (5)
  public int postCheck$3271f9a3(WarContext, l, List)
  public int preCheck$3c687114(WarContext, l)
  public void validateParamters(String[], r)
```

## com.perblue.rpg.game.data.war.GuildWarStats$WarModifierSetStats
```
static class WarModifierSetStats extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$WarModifierSetStats()

  // Methods (5)
  protected void initStats(int, int)
  protected void saveStat(WarModifierSetType, Col, String)
  protected void onMissingRow(String, WarModifierSetType)
```

## com.perblue.rpg.game.data.war.GuildWarStats$WarModifierSetStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (2)
  private static final Col[] $VALUES
  public static final Col MODIFIERS

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$WarModifierSetStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$WarModifierStats
```
static class WarModifierStats extends com.perblue.common.stats.GeneralStats

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$WarModifierStats()

  // Methods (4)
  private a parseUnitSets(String)
  protected void initStats(int, int)
  protected void saveStat(WarModifierType, Col, String)
```

## com.perblue.rpg.game.data.war.GuildWarStats$WarModifierStats$Col
```
static final enum Col extends java.lang.Enum

  // Fields (10)
  private static final Col[] $VALUES
  public static final Col ATTACKER_COLOR
  public static final Col DEFENDER_COLOR
  public static final Col EFFECT
  public static final Col EFFECT_AMOUNT
  public static final Col EFFECT_DURATION
  public static final Col EFFECT_TAGS
  public static final Col EFFECT_TYPE
  public static final Col EFFECT_UNIT
  public static final Col ICON_TAG

  // Constructors (1)
  com.perblue.rpg.game.data.war.GuildWarStats$WarModifierStats$Col(String, int)

  // Methods (2)
  public static Col[] values()
  public static Col valueOf(String)
```

## com.perblue.rpg.game.data.war.WarModifierData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$war$StatEffectType
```

## com.perblue.rpg.game.data.war.WarModifierData$UnitSet
```
public static class UnitSet

  // Fields (6)
  private boolean all
  private StatType coreStat
  private SectionType position
  private HeroRole role
  private HeroTag tag
  private int teamNumber

  // Constructors (1)
  com.perblue.rpg.game.data.war.WarModifierData$UnitSet()

  // Methods (17)
  public int getTeamNumber()
  public boolean isAll()
  public void setCoreStat(StatType)
  public void setPosition(SectionType)
  public HeroRole getRole()
  public StatType getCoreStat()
  public SectionType getPosition()
  public void setTag(HeroTag)
  public void setRole(HeroRole)
  public void setTeamNumber(int)
  public HeroTag getTag()
  public void setAll(boolean)
```

## com.perblue.rpg.game.event.SkillStatusChangeEvent$SkillStatusChangeType
```
public static final enum SkillStatusChangeType extends java.lang.Enum

  // Fields (7)
  private static final SkillStatusChangeType[] $VALUES
  public static final SkillStatusChangeType ACTIVATED
  public static final SkillStatusChangeType ANIMATION_EVENT
  public static final SkillStatusChangeType CANCELLED
  public static final SkillStatusChangeType COMPLETED
  public static final SkillStatusChangeType SPECIAL_EVENT
  public static final SkillStatusChangeType TITAN_ACTIVATION

  // Constructors (1)
  com.perblue.rpg.game.event.SkillStatusChangeEvent$SkillStatusChangeType(String, int)

  // Methods (2)
  public static SkillStatusChangeType[] values()
  public static SkillStatusChangeType valueOf(String)
```

## com.perblue.rpg.game.event.WallClockEventHelper$1
```
static final class  implements java.lang.Runnable

  // Constructors (1)
  com.perblue.rpg.game.event.WallClockEventHelper$1()

  // Methods (1)
  public final void run()
```

## com.perblue.rpg.game.event.WallClockEventHelper$2
```
static final class  implements java.lang.Runnable

  // Constructors (1)
  com.perblue.rpg.game.event.WallClockEventHelper$2()

  // Methods (1)
  public final void run()
```

## com.perblue.rpg.game.logic.ArenaHelper$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ArenaTier
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ArenaType
```

## com.perblue.rpg.game.logic.BossBattleCampaignHelper$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$logic$BossBattleCampaignHelper$BossBattleAdvanceType
  static final int[] $SwitchMap$com$perblue$rpg$game$logic$BossBattleCampaignHelper$BossBattleResetType
```

## com.perblue.rpg.game.logic.BossBattleCampaignHelper$BossBattleAdvanceType
```
public static final enum BossBattleAdvanceType extends java.lang.Enum

  // Fields (2)
  private static final BossBattleAdvanceType[] $VALUES
  public static final BossBattleAdvanceType FREE

  // Constructors (1)
  com.perblue.rpg.game.logic.BossBattleCampaignHelper$BossBattleAdvanceType(String, int)

  // Methods (2)
  public static BossBattleAdvanceType[] values()
  public static BossBattleAdvanceType valueOf(String)
```

## com.perblue.rpg.game.logic.BossBattleCampaignHelper$BossBattleResetType
```
public static final enum BossBattleResetType extends java.lang.Enum

  // Fields (4)
  private static final BossBattleResetType[] $VALUES
  public static final BossBattleResetType FREE
  public static final BossBattleResetType ITEM
  public static final BossBattleResetType PAID

  // Constructors (1)
  com.perblue.rpg.game.logic.BossBattleCampaignHelper$BossBattleResetType(String, int)

  // Methods (2)
  public static BossBattleResetType[] values()
  public static BossBattleResetType valueOf(String)
```

## com.perblue.rpg.game.logic.BossBattleCampaignHelper$CampaignLevelLockStatusType
```
public static final enum CampaignLevelLockStatusType extends java.lang.Enum

  // Fields (3)
  private static final CampaignLevelLockStatusType[] $VALUES
  public static final CampaignLevelLockStatusType PREVIOUS_LEVEL_NOT_COMPLETE
  public static final CampaignLevelLockStatusType UNLOCKED

  // Constructors (1)
  com.perblue.rpg.game.logic.BossBattleCampaignHelper$CampaignLevelLockStatusType(String, int)

  // Methods (2)
  public static CampaignLevelLockStatusType[] values()
  public static CampaignLevelLockStatusType valueOf(String)
```

## com.perblue.rpg.game.logic.CampaignHelper$1
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$CampaignType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$GameMode
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UseItemEventType
```

## com.perblue.rpg.game.logic.CampaignHelper$CampaignLevelLockStatusType
```
public static final enum CampaignLevelLockStatusType extends java.lang.Enum

  // Fields (8)
  private static final CampaignLevelLockStatusType[] $VALUES
  public static final CampaignLevelLockStatusType ELITE_CAMPAIGN_LOCKED
  public static final CampaignLevelLockStatusType ELITE_CHAPTER_NOT_COMPLETE
  public static final CampaignLevelLockStatusType EXPERT_CAMPAIGN_LOCKED
  public static final CampaignLevelLockStatusType NORMAL_CHAPTER_NOT_COMPLETE
  public static final CampaignLevelLockStatusType PREVIOUS_LEVEL_NOT_COMPLETE
  public static final CampaignLevelLockStatusType TEAM_LEVEL_NOT_HIGH_ENOUGH
  public static final CampaignLevelLockStatusType UNLOCKED

  // Constructors (1)
  com.perblue.rpg.game.logic.CampaignHelper$CampaignLevelLockStatusType(String, int)

  // Methods (2)
  public static CampaignLevelLockStatusType[] values()
  public static CampaignLevelLockStatusType valueOf(String)
```

## com.perblue.rpg.game.logic.CampaignHelper$RaidAllInformation
```
public static class RaidAllInformation

  // Fields (3)
  public List levels
  public int totalRaids
  public int totalStaminaNeeded

  // Constructors (1)
  com.perblue.rpg.game.logic.CampaignHelper$RaidAllInformation()
```

## com.perblue.rpg.game.logic.CampaignHelper$RaidAllLevelInformation
```
public static class RaidAllLevelInformation

  // Fields (4)
  public int chapter
  public int level
  public int numRaids
  public CampaignType type

  // Constructors (1)
  com.perblue.rpg.game.logic.CampaignHelper$RaidAllLevelInformation()
```

## com.perblue.rpg.game.logic.CampaignLootHelper$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$GameMode
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$Rarity
```

## com.perblue.rpg.game.logic.CampaignLootHelper$CampaignLoot
```
public static class CampaignLoot

  // Fields (4)
  public List combinedLoot
  public Map extraMemoryLoot
  public Collection primaryLoot
  public RewardDrop raidTicketLoot

  // Constructors (1)
  com.perblue.rpg.game.logic.CampaignLootHelper$CampaignLoot()
```

## com.perblue.rpg.game.logic.ChestHelper$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ChestType
```

## com.perblue.rpg.game.logic.ChestHelper$LootResults
```
public static class LootResults

  // Fields (3)
  private Set heroesUnlocked
  public List lootDrops
  public boolean wasFree

  // Constructors (1)
  com.perblue.rpg.game.logic.ChestHelper$LootResults()

  // Methods (3)
  public void markHeroUnlockedDrop(RewardDrop)
  public boolean wasHeroUnlock(RewardDrop)
```

## com.perblue.rpg.game.logic.CombatHelper$1
```
static final class  implements java.lang.Runnable

  // Fields (1)
  final Unit val$targetUnit

  // Constructors (1)
  com.perblue.rpg.game.logic.CombatHelper$1(Unit)

  // Methods (1)
  public final void run()
```

## com.perblue.rpg.game.logic.CombatHelper$2
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UnitType
  static final int[] $SwitchMap$com$perblue$rpg$simulation$DamageSource$DamageSourceType
```

## com.perblue.rpg.game.logic.ContestHelper$1
```
static final class  implements com.perblue.rpg.game.logic.ContestHelper$IContestHelperExtension

  // Constructors (1)
  com.perblue.rpg.game.logic.ContestHelper$1()

  // Methods (2)
  public final void earnedProgressLevel(IUser, ContestInfo, ContestProgressRewardInfo)
  public final void earnedPoints(IUser, ContestInfo, ContestTaskInfo, long, long)
```

## com.perblue.rpg.game.logic.ContestHelper$ClientContestHelperExt
```
public static class ClientContestHelperExt implements com.perblue.rpg.game.logic.ContestHelper$IContestHelperExtension

  // Constructors (1)
  com.perblue.rpg.game.logic.ContestHelper$ClientContestHelperExt()

  // Methods (2)
  public void earnedProgressLevel(IUser, ContestInfo, ContestProgressRewardInfo)
  public void earnedPoints(IUser, ContestInfo, ContestTaskInfo, long, long)
```

## com.perblue.rpg.game.logic.ContestHelper$IContestHelperExtension
```
public abstract static interface interface IContestHelperExtension

  // Methods (2)
  public abstract void earnedProgressLevel(IUser, ContestInfo, ContestProgressRewardInfo)
  public abstract void earnedPoints(IUser, ContestInfo, ContestTaskInfo, long, long)
```

## com.perblue.rpg.game.logic.CryptRaidHelper$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$ui$screens$SkullAnimation
```

## com.perblue.rpg.game.logic.DailyActivityHelper$DailyActivityHelperExt
```
public abstract static interface interface DailyActivityHelperExt

  // Methods (1)
  public abstract void sendWeeklyFreeItem(IUser, long)
```

## com.perblue.rpg.game.logic.DifficultyModeHelper$1
```
static final class  implements com.perblue.common.a

  // Constructors (1)
  com.perblue.rpg.game.logic.DifficultyModeHelper$1()

  // Methods (2)
  public final boolean matches(UnitData)
```

## com.perblue.rpg.game.logic.DifficultyModeHelper$2
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$GameMode
```

## com.perblue.rpg.game.logic.ExpeditionHelper$ExpeditionStringType
```
public static final enum ExpeditionStringType extends java.lang.Enum

  // Fields (10)
  private static final ExpeditionStringType[] $VALUES
  public static final ExpeditionStringType AVAILABLE
  public static final ExpeditionStringType GOLD_TOTAL
  public static final ExpeditionStringType INFO
  public static final ExpeditionStringType LOCKED_INFO
  public static final ExpeditionStringType NAME
  public static final ExpeditionStringType ONLY_ON_RESET_ERROR
  public static final ExpeditionStringType REWARDS
  public static final ExpeditionStringType UNLOCK_ERROR
  private final String postfix

  // Constructors (2)
  com.perblue.rpg.game.logic.ExpeditionHelper$ExpeditionStringType(String, int, String)
  com.perblue.rpg.game.logic.ExpeditionHelper$ExpeditionStringType(String, int)

  // Methods (3)
  public final String getIdentifier(int)
  public static ExpeditionStringType[] values()
  public static ExpeditionStringType valueOf(String)
```

## com.perblue.rpg.game.logic.GuildHelper$GuildPermission
```
public static final enum GuildPermission extends java.lang.Enum

  // Fields (16)
  private static final GuildPermission[] $VALUES
  public static final GuildPermission ACCEPT_NEW_MEMBER
  public static final GuildPermission CHANGE_WAR_MEMBERS
  public static final GuildPermission CLAIM_LEADER
  public static final GuildPermission DELETE_GUILD_WALL_POSTS
  public static final GuildPermission DEMOTE_LOWER
  public static final GuildPermission EDIT_ALL
  public static final GuildPermission EDIT_CRYPT_DIFFICULTY
  public static final GuildPermission EDIT_DESCRIPTION
  public static final GuildPermission EDIT_EMBLEM
  public static final GuildPermission EDIT_GUILD_WALL
  public static final GuildPermission KICK_LOWER
  public static final GuildPermission MAKE_LEADER
  public static final GuildPermission MANAGE_WAR
  public static final GuildPermission PROMOTE_LOWER
  public static final GuildPermission SURRENDER_OR_FINISH_WAR

  // Constructors (1)
  com.perblue.rpg.game.logic.GuildHelper$GuildPermission(String, int)

  // Methods (2)
  public static GuildPermission[] values()
  public static GuildPermission valueOf(String)
```

## com.perblue.rpg.game.logic.HeroHelper$AutoPromoteData
```
public static class AutoPromoteData

  // Fields (4)
  public boolean canAutoPromote
  public String debugReason
  public HashMap usedItems
  public HashMap usedResources

  // Constructors (1)
  com.perblue.rpg.game.logic.HeroHelper$AutoPromoteData()
```

## com.perblue.rpg.game.logic.HeroHelper$GearState
```
public static final enum GearState extends java.lang.Enum

  // Fields (9)
  private static final GearState[] $VALUES
  public static final GearState CANT_HAVE
  public static final GearState CRAFT_TO_EQUIP
  public static final GearState DONT_HAVE
  public static final GearState EQUIPPED
  public static final GearState READY_TO_EQUIP
  public static final GearState TOO_LOW_LEVEL_CRAFT
  public static final GearState TOO_LOW_LEVEL_EQUIP
  public static final GearState UNRELEASED

  // Constructors (1)
  com.perblue.rpg.game.logic.HeroHelper$GearState(String, int)

  // Methods (2)
  public static GearState[] values()
  public static GearState valueOf(String)
```

## com.perblue.rpg.game.logic.HeroHelper$PrepareForPromoteData
```
public static class PrepareForPromoteData

  // Fields (1)
  public List equippedItems

  // Constructors (1)
  com.perblue.rpg.game.logic.HeroHelper$PrepareForPromoteData()
```

## com.perblue.rpg.game.logic.HeroHelper$PromoteOutcomeData
```
public static class PromoteOutcomeData

  // Fields (3)
  public List enchantItemsGained
  public IHero hero
  public List prePromoteItems

  // Constructors (1)
  com.perblue.rpg.game.logic.HeroHelper$PromoteOutcomeData()
```

## com.perblue.rpg.game.logic.ItemHelper$1
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$GameMode
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ItemType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UseItemEventType
```

## com.perblue.rpg.game.logic.LapsedCatchUpHelper$CatchUpPeriod
```
public static final enum CatchUpPeriod extends java.lang.Enum

  // Fields (8)
  private static final CatchUpPeriod[] $VALUES
  public static final long DURATION = 86400000
  public static final CatchUpPeriod FIFTEEN_DAY
  public static final CatchUpPeriod FIVE_DAY
  public static final CatchUpPeriod TEN_DAY
  private final String description
  private final int staminaPacks
  private final long startInterval

  // Constructors (1)
  com.perblue.rpg.game.logic.LapsedCatchUpHelper$CatchUpPeriod(String, int, long, int, String)

  // Methods (6)
  public final int getStaminaPacks()
  public static CatchUpPeriod getByTime(long)
  public final String getDescription()
  public static CatchUpPeriod[] values()
  public static CatchUpPeriod valueOf(String)
  public final boolean contains(long)
```

## com.perblue.rpg.game.logic.LegendaryQuestHelper$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$logic$LegendaryQuestType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ContestTaskType
```

## com.perblue.rpg.game.logic.MailHelper$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$MailType
```

## com.perblue.rpg.game.logic.MercenaryHelper$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$GameMode
```

## com.perblue.rpg.game.logic.MerchantHelper$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$logic$MerchantHelper$MerchantRefreshType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$MerchantType
```

## com.perblue.rpg.game.logic.MerchantHelper$MerchantRefreshType
```
public static final enum MerchantRefreshType extends java.lang.Enum

  // Fields (5)
  private static final MerchantRefreshType[] $VALUES
  public static final MerchantRefreshType AUTO
  public static final MerchantRefreshType ITEM
  public static final MerchantRefreshType PAID
  public static final MerchantRefreshType VIP

  // Constructors (1)
  com.perblue.rpg.game.logic.MerchantHelper$MerchantRefreshType(String, int)

  // Methods (2)
  public static MerchantRefreshType[] values()
  public static MerchantRefreshType valueOf(String)
```

## com.perblue.rpg.game.logic.PlayerRankingHelper$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$RankType
```

## com.perblue.rpg.game.logic.QuickAttackAutomator$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$ui$screens$BaseScreen$LoadState
```

## com.perblue.rpg.game.logic.RuneHelper$1
```
static final class  implements java.util.Comparator

  // Constructors (1)
  com.perblue.rpg.game.logic.RuneHelper$1()

  // Methods (2)
  public final int compare(ItemType, ItemType)
```

## com.perblue.rpg.game.logic.RuneHelper$2
```
static final class  implements java.util.Comparator

  // Constructors (1)
  com.perblue.rpg.game.logic.RuneHelper$2()

  // Methods (2)
  public final int compare(ItemType, ItemType)
```

## com.perblue.rpg.game.logic.RuneHelper$3
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$OfferingPackageType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$RuneShrineActivationType
```

## com.perblue.rpg.game.logic.RuneHelper$RuneFusionResult
```
## com.perblue.rpg.game.logic.RuneHelper$RuneFusionResult [ERROR: IncompatibleClassChangeError: com.perblue.rpg.game.logic.RuneHelper and com.perblue.rpg.game.logic.RuneHelper$RuneFusionResult disagree on InnerClasses attribute]

## com.perblue.rpg.game.logic.SigninHelper$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$DailySignInClaimableStatus
```

## com.perblue.rpg.game.logic.SpecialEventsHelper$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$specialevent$SpecialEventType
```

## com.perblue.rpg.game.logic.SpecialEventsHelper$ClientSpecialEventsHelperExt
```
static class ClientSpecialEventsHelperExt implements com.perblue.rpg.game.logic.SpecialEventsHelper$ISpecialEventsHelperExtension

  // Constructors (1)
  com.perblue.rpg.game.logic.SpecialEventsHelper$ClientSpecialEventsHelperExt()

  // Methods (5)
  public void recordBirthdayPoints(IUser, RewardDrop, int)
  public int getUserPurchaseCount(IUser)
  public void sendTeamLevelChallengeRewardsMail(IUser, RewardMessage, Collection, TeamLevelEvent)
  public void sendRewardsMail(IUser, RewardMessage, Collection, PurchaseEvent)
  public void sendGuildGiftMail(IUser, RewardMessage, Collection, PurchaseEvent)
```

## com.perblue.rpg.game.logic.SpecialEventsHelper$ClientSpecialEventsHelperExt$1
```
 class  extends com.badlogic.gdx.utils.ar$a

  // Fields (1)
  final ClientSpecialEventsHelperExt this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.SpecialEventsHelper$ClientSpecialEventsHelperExt$1(ClientSpecialEventsHelperExt)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.game.logic.SpecialEventsHelper$GameModeMultipliers
```
public static class GameModeMultipliers

  // Fields (3)
  public SpecialEventInfo event
  public Map itemQtyMultipliers
  public Map resourceMultipliers

  // Constructors (1)
  com.perblue.rpg.game.logic.SpecialEventsHelper$GameModeMultipliers()

  // Methods (2)
  public int getLootMultiplier(ItemType)
  public int getLootMultiplier(ResourceType)
```

## com.perblue.rpg.game.logic.SpecialEventsHelper$ISpecialEventsHelperExtension
```
public abstract static interface interface ISpecialEventsHelperExtension

  // Methods (5)
  public abstract void recordBirthdayPoints(IUser, RewardDrop, int)
  public abstract int getUserPurchaseCount(IUser)
  public abstract void sendTeamLevelChallengeRewardsMail(IUser, RewardMessage, Collection, TeamLevelEvent)
  public abstract void sendRewardsMail(IUser, RewardMessage, Collection, PurchaseEvent)
  public abstract void sendGuildGiftMail(IUser, RewardMessage, Collection, PurchaseEvent)
```

## com.perblue.rpg.game.logic.SpecialEventsHelper$MerchantMultipliers
```
public static class MerchantMultipliers

  // Fields (2)
  public int itemQtyMultiplier
  public Map resourceItemDiscounts

  // Constructors (1)
  com.perblue.rpg.game.logic.SpecialEventsHelper$MerchantMultipliers()

  // Methods (1)
  public static int getIndex(ItemType, ResourceType)
```

## com.perblue.rpg.game.logic.SpecialEventsHelper$MultiplierType
```
public static final enum MultiplierType extends java.lang.Enum

  // Fields (9)
  private static final MultiplierType[] $VALUES
  public static final MultiplierType ALCHEMY_COST
  public static final MultiplierType BONUS_ALCHEMY
  public static final MultiplierType BONUS_RUNICITE_ALCHEMY
  public static final MultiplierType BONUS_STAMINA
  public static final MultiplierType RUNE_OFFERING_PACKAGE_COST
  public static final MultiplierType RUNE_REMOVAL_COST
  public static final MultiplierType RUNICITE_ALCHEMY_COST
  public static final MultiplierType STAMINA_PURCHASE_COST

  // Constructors (1)
  com.perblue.rpg.game.logic.SpecialEventsHelper$MultiplierType(String, int)

  // Methods (2)
  public static MultiplierType[] values()
  public static MultiplierType valueOf(String)
```

## com.perblue.rpg.game.logic.TitanTempleHelper$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$SkillType
```

## com.perblue.rpg.game.logic.UpperLimit$UpperLimitType
```
public static final enum UpperLimitType extends java.lang.Enum

  // Fields (4)
  private static final UpperLimitType[] $VALUES
  public static final UpperLimitType ALREADY_OVER_LIMIT
  public static final UpperLimitType NOT_OVER_LIMIT
  public static final UpperLimitType OVER_LIMIT

  // Constructors (1)
  com.perblue.rpg.game.logic.UpperLimit$UpperLimitType(String, int)

  // Methods (2)
  public static UpperLimitType[] values()
  public static UpperLimitType valueOf(String)
```

## com.perblue.rpg.game.logic.UserHelper$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$logic$UpperLimit$UpperLimitType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ResourceType
```

## com.perblue.rpg.game.logic.WarHelper$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$WarState
```

## com.perblue.rpg.game.logic.droptable.EmptyContextDTCode$1
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final EmptyContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.EmptyContextDTCode$1(EmptyContextDTCode, int)

  // Methods (2)
  protected int doPostCheck$418154f$469d4fb0(n, l, List)
```

## com.perblue.rpg.game.logic.droptable.EmptyContextDTCode$2
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final EmptyContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.EmptyContextDTCode$2(EmptyContextDTCode, int)

  // Methods (2)
  protected int doPostCheck$418154f$469d4fb0(n, l, List)
```

## com.perblue.rpg.game.logic.droptable.EmptyContextDTCode$3
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final EmptyContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.EmptyContextDTCode$3(EmptyContextDTCode, int)

  // Methods (3)
  public void validateParamters(String[], r)
  protected int doPostCheck$418154f$469d4fb0(n, l, List)
```

## com.perblue.rpg.game.logic.droptable.EmptyContextDTCode$4
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final EmptyContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.EmptyContextDTCode$4(EmptyContextDTCode, int)

  // Methods (2)
  protected int doPostCheck$418154f$469d4fb0(n, l, List)
```

## com.perblue.rpg.game.logic.droptable.EmptyContextDTCode$5
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final EmptyContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.EmptyContextDTCode$5(EmptyContextDTCode, int)

  // Methods (2)
  protected int doPostCheck$418154f$469d4fb0(n, l, List)
```

## com.perblue.rpg.game.logic.droptable.EmptyContextDTCode$6
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final EmptyContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.EmptyContextDTCode$6(EmptyContextDTCode, int)

  // Methods (2)
  protected int doPostCheck$418154f$469d4fb0(n, l, List)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$1
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$1(UserContextDTCode)

  // Methods (3)
  protected Set generateAllPossibleValues()
  public String evaluate(UserDTContext)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$10
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$10(UserContextDTCode, int)

  // Methods (6)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
  protected int doPreCheck$635fe69a(UserDTContext, l)
  public int postCheck$66c9a329(UserDTContext, l, List)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$11
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$11(UserContextDTCode, int)

  // Methods (3)
  public void validateParamters(String[], r)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$12
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$12(UserContextDTCode, int)

  // Methods (4)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
  protected int doPreCheck$635fe69a(UserDTContext, l)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$13
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$13(UserContextDTCode, int)

  // Methods (4)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
  protected int doPreCheck$635fe69a(UserDTContext, l)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$14
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$14(UserContextDTCode, int)

  // Methods (4)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
  protected int doPreCheck$635fe69a(UserDTContext, l)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$15
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$15(UserContextDTCode, int)

  // Methods (4)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
  protected int doPreCheck$635fe69a(UserDTContext, l)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$16
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$16(UserContextDTCode, int)

  // Methods (4)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
  protected int doPreCheck$635fe69a(UserDTContext, l)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$17
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$17(UserContextDTCode, int)

  // Methods (4)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
  protected int doPreCheck$635fe69a(UserDTContext, l)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$18
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$18(UserContextDTCode, int)

  // Methods (4)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
  protected int doPreCheck$635fe69a(UserDTContext, l)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$19
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$19(UserContextDTCode, int)

  // Methods (4)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
  protected int doPreCheck$635fe69a(UserDTContext, l)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$2
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$2(UserContextDTCode, ax)

  // Methods (2)
  public String evaluate(UserDTContext)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$20
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$20(UserContextDTCode, int)

  // Methods (3)
  public void validateParamters(String[], r)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$21
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$21(UserContextDTCode, int)

  // Methods (2)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$22
```
 class  implements com.perblue.common.b.k

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$22(UserContextDTCode)

  // Methods (5)
  public void validateParamters(String[], r)
  public int preCheck$635fe69a(UserDTContext, l)
  public int postCheck$66c9a329(UserDTContext, l, List)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$23
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$23(UserContextDTCode, int)

  // Methods (2)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$24
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$24(UserContextDTCode, int)

  // Methods (3)
  public void validateParamters(String[], r)
  protected int doPostCheck$66c9a329(UserDTContext, l, List)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$25
```
 class  implements com.perblue.common.b.k

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$25(UserContextDTCode)

  // Methods (5)
  public void validateParamters(String[], r)
  public int preCheck$635fe69a(UserDTContext, l)
  public int postCheck$66c9a329(UserDTContext, l, List)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$26
```
 class  extends com.perblue.rpg.game.data.DTEnumNode

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$26(UserContextDTCode, Class)

  // Methods (1)
  public List execute(p)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$27
```
 class  extends com.perblue.rpg.game.data.DTHeroesNode

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$27(UserContextDTCode)

  // Methods (1)
  public List execute(p)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$28
```
 class  extends com.perblue.rpg.game.data.DTHeroesNode

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$28(UserContextDTCode)

  // Methods (1)
  public List execute(p)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$29
```
 class  extends com.perblue.rpg.game.data.DTHeroesNode

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$29(UserContextDTCode)

  // Methods (1)
  public List execute(p)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$3
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$3(UserContextDTCode, ax)

  // Methods (2)
  public String evaluate(UserDTContext)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$30
```
 class  extends com.perblue.rpg.game.data.DTHeroesNode

  // Fields (2)
  static final boolean $assertionsDisabled = true
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$30(UserContextDTCode)

  // Methods (1)
  public List execute(p)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$4
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$4(UserContextDTCode, ax)

  // Methods (2)
  public String evaluate(UserDTContext)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$5
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$5(UserContextDTCode, ax)

  // Methods (2)
  public String evaluate(UserDTContext)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$6
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$6(UserContextDTCode, ax)

  // Methods (2)
  public String evaluate(UserDTContext)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$7
```
 class  extends com.perblue.common.b.s

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$7(UserContextDTCode, ax)

  // Methods (2)
  public String evaluate(UserDTContext)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$8
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$8(UserContextDTCode, int)

  // Methods (3)
  public void validateParamters(String[], r)
  protected int doPreCheck$635fe69a(UserDTContext, l)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$9
```
 class  extends com.perblue.common.b.b

  // Fields (1)
  final UserContextDTCode this$0

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$9(UserContextDTCode, int)

  // Methods (3)
  public void validateParamters(String[], r)
  protected int doPreCheck$635fe69a(UserDTContext, l)
```

## com.perblue.rpg.game.logic.droptable.UserContextDTCode$DTChestHeroesStarNode
```
static class DTChestHeroesStarNode extends com.perblue.rpg.game.data.DTHeroesNode

  // Fields (1)
  private final int numStars

  // Constructors (1)
  com.perblue.rpg.game.logic.droptable.UserContextDTCode$DTChestHeroesStarNode(int)

  // Methods (1)
  public List execute(p)
```

## com.perblue.rpg.game.objects.ClientEntityFactories$1
```
static final class  implements com.perblue.rpg.game.objects.EntityFactory

  // Fields (1)
  private int nextID

  // Constructors (1)
  com.perblue.rpg.game.objects.ClientEntityFactories$1()

  // Methods (2)
  public final Projectile create(IScene)
```

## com.perblue.rpg.game.objects.ClientEntityFactories$2
```
static final class  implements com.perblue.rpg.game.objects.EntityFactory

  // Constructors (1)
  com.perblue.rpg.game.objects.ClientEntityFactories$2()

  // Methods (2)
  public final Unit create(IScene)
```

## com.perblue.rpg.game.objects.Entity$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UnitType
```

## com.perblue.rpg.game.objects.EnvEntity$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$objects$EnvEntityType
```

## com.perblue.rpg.game.objects.Unit$1
```
static final class  implements java.util.Comparator

  // Constructors (1)
  com.perblue.rpg.game.objects.Unit$1()

  // Methods (2)
  public final int compare(CombatSkill, CombatSkill)
```

## com.perblue.rpg.game.objects.Unit$2
```
 class  implements java.lang.Runnable

  // Fields (1)
  final Unit this$0

  // Constructors (1)
  com.perblue.rpg.game.objects.Unit$2(Unit)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.game.objects.Unit$3
```
 class  implements java.lang.Runnable

  // Fields (1)
  final Unit this$0

  // Constructors (1)
  com.perblue.rpg.game.objects.Unit$3(Unit)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.game.objects.Unit$4
```
 class  implements java.lang.Runnable

  // Fields (1)
  final Unit this$0

  // Constructors (1)
  com.perblue.rpg.game.objects.Unit$4(Unit)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.game.objects.Unit$5
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$data$item$StatType
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UnitType
```

## com.perblue.rpg.game.objects.User$1
```
 class  implements java.lang.Runnable

  // Fields (2)
  final User this$0
  final String val$key

  // Constructors (1)
  com.perblue.rpg.game.objects.User$1(User, String)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.game.objects.User$2
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$BuildSource
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ResourceType
```

## com.perblue.rpg.game.objects.UserFlag$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$objects$UserFlag
```

## com.perblue.rpg.game.objects.UserProperty$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$ResourceType
```

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuff
```
public static class BossBattleFieldBuff

  // Fields (13)
  private static Map vfxPosMap
  protected Float effectAmount
  protected Long effectDelay
  protected Long effectDuration
  protected Long effectLoopTime
  protected EffectType effectType
  protected a effectUnit
  protected boolean effectUnitRuleAnd
  protected Integer id
  protected boolean isVFXUnitPos
  protected String key
  protected ParticleType vfx
  protected q vfxPos

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuff()

  // Methods (26)
  public Long getEffectDelay()
  public Long getEffectLoopTime()
  public boolean getIsVFXUnit()
  public ParticleType getVfx()
  public q getVfxPos()
  public boolean isEffectUnitRuleAnd()
  public EffectType getEffectType()
  public Float getEffectAmount()
  public a getEffectUnit()
  public Long getEffectDuration()
  public void setEffectUnitRuleAnd(boolean)
  public void setKey(String)
  public void setEffectType(EffectType)
  public void setEffectAmount(Float)
  public void setEffectDuration(Long)
  public void setEffectLoopTime(Long)
  public void setEffectDelay(Long)
  public void setVfx(ParticleType)
  public void setEffectUnit(a)
  public static q getVfxTypePos(String)
  public void setVfxPos(float, float, float)
  public void setVfxPos(q)
  public void setID(Integer)
  public Integer getID()
  public boolean matches(UnitData, int)
  public String getKey()
```

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuff$1
```
static final class  extends java.util.HashMap

  // Fields (1)
  private static final long serialVersionUID = 1

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuff$1()
```

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuff$EffectType
```
public static final enum EffectType extends java.lang.Enum

  // Fields (6)
  private static final EffectType[] $VALUES
  public static final EffectType DAMAGE_ATTACK
  public static final EffectType DAMAGE_DEFENSE
  public static final EffectType DOT
  public static final EffectType NPC_POP
  public static final EffectType STAT_TYPE

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuff$EffectType(String, int)

  // Methods (2)
  public static EffectType[] values()
  public static EffectType valueOf(String)
```

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuff$UnitSetFieldBuff
```
public static class UnitSetFieldBuff extends com.perblue.rpg.game.data.war.WarModifierData$UnitSet

  // Fields (1)
  private UnitType unitType

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuff$UnitSetFieldBuff()

  // Methods (2)
  public UnitType getUnitType()
  public void setUnitType(UnitType)
```

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuffBattleStatus
```
public static class BossBattleFieldBuffBattleStatus extends com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuff

  // Fields (2)
  protected boolean isAttackCase
  protected StatusType statusType

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuffBattleStatus()

  // Methods (4)
  public boolean isAttackCase()
  public StatusType getStatusType()
  public void setStatusType(StatusType)
  public void setAttackCase(boolean)
```

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuffBattleStatus$StatusType
```
public static final enum StatusType extends java.lang.Enum

  // Fields (5)
  private static final StatusType[] $VALUES
  public static final StatusType DAMAGE_MAGIC
  public static final StatusType DAMAGE_PHYSICAL
  public static final StatusType DAMAGE_TRUE
  public static final StatusType ENERGY

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuffBattleStatus$StatusType(String, int)

  // Methods (2)
  public static StatusType[] values()
  public static StatusType valueOf(String)
```

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuffDamageType
```
public static class BossBattleFieldBuffDamageType extends com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuff

  // Fields (1)
## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuffDamageType [ERROR: IncompatibleClassChangeError: com.perblue.rpg.simulation.DamageSource and com.perblue.rpg.simulation.DamageSource$DamageSourceType disagree on InnerClasses attribute]

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuffNpcPop
```
public static class BossBattleFieldBuffNpcPop extends com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuff

  // Fields (4)
  protected Integer effectLevel
  protected Rarity effectRarity
  protected Integer effectStars
  protected UnitType effectUnitType

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuffNpcPop()

  // Methods (8)
  public Rarity getEffectRarity()
  public Integer getEffectStars()
  public Integer getEffectLevel()
  public UnitType getEffectUnitType()
  public void setEffectUnitType(UnitType)
  public void setEffectLevel(Integer)
  public void setEffectRarity(Rarity)
  public void setEffectStars(Integer)
```

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuffStatType
```
public static class BossBattleFieldBuffStatType extends com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuff

  // Fields (2)
  protected StatEffectType amountType
  protected StatType effectStatType

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleFieldBuffStatType()

  // Methods (4)
  public StatType getEffectStatType()
  public StatEffectType getAmountType()
  public void setEffectStatType(StatType)
  public void setAmountType(StatEffectType)
```

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleLayer
```
public static class BossBattleLayer

  // Fields (5)
  private Integer endChapter
  private String layerName
  private Integer maxTeamLevel
  private Integer minTeamLevel
  private Integer startChapter

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$BossBattleLayer()

  // Methods (10)
  public int getEndChapter()
  public String getLayerName()
  public int getStartChapter()
  public int getMaxTeamLevel()
  public int getMinTeamLevel()
  public void setLayerName(String)
  public void setMinTeamLevel(int)
  public void setMaxTeamLevel(int)
  public void setStartChapter(int)
  public void setEndChapter(int)
```

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$ChapterData
```
public static class ChapterData

  // Fields (8)
  private q environment
  private q finishRewards
  private q flavor
  private q gold
  private q stageNumberData
  private q stageUnits
  private q teamXP
  private List timeBonus

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$ChapterData()

  // Methods (17)
  public String getFlavor(int)
  public void setTimeBonus(List)
  public EnvironmentType getEnvironment(int)
  public int getNumLevels()
  public List getFinishRewards(int)
  public Integer getGold(int)
  public Integer getTeamXP(int)
  public List getStageUnits(int)
  public String getStageNumberData(int)
  public List getTimeBonus()
  public void setStageNumberData(int, String)
  public void setStageUnits(int, List)
  public void setFlavor(int, String)
  public void setEnvironment(int, EnvironmentType)
  public void setFinishRewards(int, List)
  public void setGold(int, Integer)
  public void setTeamXP(int, Integer)
```

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$TimeBonus
```
public static class TimeBonus

  // Fields (4)
  private RankType rankType
  private List rewards
  private int second
  private int sort

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$TimeBonus()

  // Methods (8)
  public void setRankType(RankType)
  public void setSecond(int)
  public void setSort(int)
  public void setRewards(List)
  public List getRewards()
  public RankType getRankType()
  public int getSort()
  public int getSecond()
```

## com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$TimeBonus$RankType
```
static final enum RankType extends java.lang.Enum

  // Fields (7)
  private static final RankType[] $VALUES
  public static final RankType A
  public static final RankType B
  public static final RankType C
  public static final RankType D
  public static final RankType S
  public static final RankType SS

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleCampaignInfo$TimeBonus$RankType(String, int)

  // Methods (2)
  public static RankType[] values()
  public static RankType valueOf(String)
```

## com.perblue.rpg.game.specialevent.BossBattleInfo$1
```
 class  implements java.util.Comparator

  // Fields (1)
  final BossBattleInfo this$0

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleInfo$1(BossBattleInfo)

  // Methods (2)
  public int compare(TimeBonus, TimeBonus)
```

## com.perblue.rpg.game.specialevent.BossBattleInfo$2
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$specialevent$BossBattleCampaignInfo$BossBattleFieldBuff$EffectType
  static final int[] $SwitchMap$com$perblue$rpg$game$specialevent$BossBattleInfo$BossBattleEnum
```

## com.perblue.rpg.game.specialevent.BossBattleInfo$BossBattleEnum
```
public static final enum BossBattleEnum extends java.lang.Enum

  // Fields (4)
  private static final BossBattleEnum[] $VALUES
  public static final BossBattleEnum FieldBuff
  public static final BossBattleEnum StageData
  public static final BossBattleEnum TimeBonus

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleInfo$BossBattleEnum(String, int)

  // Methods (2)
  public static BossBattleEnum[] values()
  public static BossBattleEnum valueOf(String)
```

## com.perblue.rpg.game.specialevent.BossBattleInfo$FieldBuffEnum
```
static final enum FieldBuffEnum extends java.lang.Enum

  // Fields (13)
  private static final FieldBuffEnum[] $VALUES
  public static final FieldBuffEnum AMOUNT_TYPE
  public static final FieldBuffEnum EFFECT
  public static final FieldBuffEnum EFFECT_AMOUNT
  public static final FieldBuffEnum EFFECT_DELAY
  public static final FieldBuffEnum EFFECT_DURATION
  public static final FieldBuffEnum EFFECT_LOOP_TIME
  public static final FieldBuffEnum EFFECT_TYPE
  public static final FieldBuffEnum EFFECT_UNIT
  public static final FieldBuffEnum KEY
  public static final FieldBuffEnum VFX
  public static final FieldBuffEnum VFX_POS
  private final int stageColumn

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleInfo$FieldBuffEnum(String, int, int)

  // Methods (3)
  public final int getColumn()
  public static FieldBuffEnum[] values()
  public static FieldBuffEnum valueOf(String)
```

## com.perblue.rpg.game.specialevent.BossBattleInfo$ShopDataEnum
```
static final enum ShopDataEnum extends java.lang.Enum

  // Fields (7)
  private static final ShopDataEnum[] $VALUES
  public static final ShopDataEnum ConsumptionItemsType
  public static final ShopDataEnum ConsumptionNumber
  public static final ShopDataEnum ItemNumber
  public static final ShopDataEnum ItemType
  public static final ShopDataEnum PurchasesNumber
  private final int shopColumn

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleInfo$ShopDataEnum(String, int, int)

  // Methods (3)
  public final int getColumn()
  public static ShopDataEnum[] values()
  public static ShopDataEnum valueOf(String)
```

## com.perblue.rpg.game.specialevent.BossBattleInfo$StageDataEnum
```
static final enum StageDataEnum extends java.lang.Enum

  // Fields (28)
  private static final StageDataEnum[] $VALUES
  public static final StageDataEnum Background
  public static final StageDataEnum ClearCompensationGold
  public static final StageDataEnum ClearCompensationItem
  public static final StageDataEnum ClearCompensationTeamXP
  public static final StageDataEnum FlavorText
  public static final StageDataEnum StageNumber
  public static final StageDataEnum Unit1
  public static final StageDataEnum Unit1Level
  public static final StageDataEnum Unit1Rarity
  public static final StageDataEnum Unit1Stars
  public static final StageDataEnum Unit2
  public static final StageDataEnum Unit2Level
  public static final StageDataEnum Unit2Rarity
  public static final StageDataEnum Unit2Stars
  public static final StageDataEnum Unit3
  public static final StageDataEnum Unit3Level
  public static final StageDataEnum Unit3Rarity
  public static final StageDataEnum Unit3Stars
  public static final StageDataEnum Unit4
  public static final StageDataEnum Unit4Level
  public static final StageDataEnum Unit4Rarity
  public static final StageDataEnum Unit4Stars
  public static final StageDataEnum Unit5
  public static final StageDataEnum Unit5Level
  public static final StageDataEnum Unit5Rarity
  public static final StageDataEnum Unit5Stars
  private final int stageColumn

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleInfo$StageDataEnum(String, int, int)

  // Methods (3)
  public final int getColumn()
  public static StageDataEnum[] values()
  public static StageDataEnum valueOf(String)
```

## com.perblue.rpg.game.specialevent.BossBattleInfo$TimeBonusEnum
```
static final enum TimeBonusEnum extends java.lang.Enum

  // Fields (6)
  private static final TimeBonusEnum[] $VALUES
  public static final TimeBonusEnum Compensation
  public static final TimeBonusEnum ElapsedSeconds
  public static final TimeBonusEnum Rank
  public static final TimeBonusEnum Sort
  private final int timeBonusColumn

  // Constructors (1)
  com.perblue.rpg.game.specialevent.BossBattleInfo$TimeBonusEnum(String, int, int)

  // Methods (3)
  public final int getColumn()
  public static TimeBonusEnum[] values()
  public static TimeBonusEnum valueOf(String)
```

## com.perblue.rpg.game.specialevent.EventSigninBonus$SigninItem
```
public class SigninItem

  // Fields (5)
  private int day
  private String imageName
  private List itemList
  private int needVipLevel
  final EventSigninBonus this$0

  // Constructors (1)
  com.perblue.rpg.game.specialevent.EventSigninBonus$SigninItem(EventSigninBonus)

  // Methods (5)
  public int getNeedVipLevel()
  public List getItemList()
  public String getImageName()
  public void setData(t)
  public int getDay()
```

## com.perblue.rpg.game.specialevent.SparseRange$Range
```
public static class Range

  // Fields (2)
  private long max
  private long min

  // Constructors (1)
  com.perblue.rpg.game.specialevent.SparseRange$Range(long, long)

  // Methods (3)
  public long getMax()
  public long getMin()
  public boolean contains(long)
```

## com.perblue.rpg.game.specialevent.SpecialEventBuilder$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$specialevent$SpecialEventType
```

## com.perblue.rpg.game.specialevent.TargetAttribute$1
```
static final class  extends com.perblue.rpg.game.specialevent.TargetAttribute

  // Constructors (1)
  com.perblue.rpg.game.specialevent.TargetAttribute$1(String, int)

  // Methods (2)
  final void setMin(SpecialEventInfo, long)
  final void setMax(SpecialEventInfo, long)
```

## com.perblue.rpg.game.specialevent.TargetAttribute$2
```
static final class  extends com.perblue.rpg.game.specialevent.TargetAttribute

  // Constructors (1)
  com.perblue.rpg.game.specialevent.TargetAttribute$2(String, int)

  // Methods (2)
  final void setMin(SpecialEventInfo, long)
  final void setMax(SpecialEventInfo, long)
```

## com.perblue.rpg.game.specialevent.TargetAttribute$3
```
static final class  extends com.perblue.rpg.game.specialevent.TargetAttribute

  // Constructors (1)
  com.perblue.rpg.game.specialevent.TargetAttribute$3(String, int)

  // Methods (2)
  final void setMin(SpecialEventInfo, long)
  final void setMax(SpecialEventInfo, long)
```

## com.perblue.rpg.game.specialevent.TargetAttribute$4
```
static final class  extends com.perblue.rpg.game.specialevent.TargetAttribute

  // Constructors (1)
  com.perblue.rpg.game.specialevent.TargetAttribute$4(String, int)

  // Methods (2)
  final void setMin(SpecialEventInfo, long)
  final void setMax(SpecialEventInfo, long)
```

## com.perblue.rpg.game.specialevent.TargetAttribute$5
```
static final class  extends com.perblue.rpg.game.specialevent.TargetAttribute

  // Constructors (1)
  com.perblue.rpg.game.specialevent.TargetAttribute$5(String, int)

  // Methods (2)
  final void setMin(SpecialEventInfo, long)
  final void setMax(SpecialEventInfo, long)
```

## com.perblue.rpg.game.tutorial.AbstractTutorialAct$TutCompletionState
```
public static final enum TutCompletionState extends java.lang.Enum

  // Fields (4)
  private static final TutCompletionState[] $VALUES
  public static final TutCompletionState DONE
  public static final TutCompletionState IN_PROG
  public static final TutCompletionState REMOVE

  // Constructors (1)
  com.perblue.rpg.game.tutorial.AbstractTutorialAct$TutCompletionState(String, int)

  // Methods (2)
  public static TutCompletionState[] values()
  public static TutCompletionState valueOf(String)
```

## com.perblue.rpg.game.tutorial.AchievementsActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.ArenaActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.AutoFightActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.BossPitActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.BossStoryAct$1
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$NarratorLocation
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.CraftingActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.CryptRaidActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.DailyQuestActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.EnchantingActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.EquippingHeroActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.EvolvingHeroActV1$1
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UnitType
```

## com.perblue.rpg.game.tutorial.GuildWarActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.IntroTutorialActV1$1
```
 class  implements a.a.f

  // Fields (1)
  final IntroTutorialActV1 this$0

  // Constructors (1)
  com.perblue.rpg.game.tutorial.IntroTutorialActV1$1(IntroTutorialActV1)

  // Methods (1)
  public void onEvent(int, a)
```

## com.perblue.rpg.game.tutorial.IntroTutorialActV1$2
```
 class  implements a.a.f

  // Fields (3)
  final IntroTutorialActV1 this$0
  final IUser val$user
  final IUserTutorialAct val$userAct

  // Constructors (1)
  com.perblue.rpg.game.tutorial.IntroTutorialActV1$2(IntroTutorialActV1, IUser, IUserTutorialAct)

  // Methods (1)
  public void onEvent(int, a)
```

## com.perblue.rpg.game.tutorial.IntroTutorialActV1$3
```
 class  implements a.a.f

  // Fields (3)
  final IntroTutorialActV1 this$0
  final RaidInstance val$inst
  final EnvEntity val$smokeRL

  // Constructors (1)
  com.perblue.rpg.game.tutorial.IntroTutorialActV1$3(IntroTutorialActV1, RaidInstance, EnvEntity)

  // Methods (1)
  public void onEvent(int, a)
```

## com.perblue.rpg.game.tutorial.IntroTutorialActV1$4
```
 class  implements a.a.f

  // Fields (4)
  final IntroTutorialActV1 this$0
  final RaidInstance val$inst
  final EnvEntity val$smokeRL
  final Unit val$unit

  // Constructors (1)
  com.perblue.rpg.game.tutorial.IntroTutorialActV1$4(IntroTutorialActV1, Unit, EnvEntity, RaidInstance)

  // Methods (1)
  public void onEvent(int, a)
```

## com.perblue.rpg.game.tutorial.IntroTutorialActV1$5
```
 class  implements a.a.f

  // Fields (2)
  final IntroTutorialActV1 this$0
  final Unit val$unit

  // Constructors (1)
  com.perblue.rpg.game.tutorial.IntroTutorialActV1$5(IntroTutorialActV1, Unit)

  // Methods (1)
  public void onEvent(int, a)
```

## com.perblue.rpg.game.tutorial.IntroTutorialActV1$6
```
 class  implements a.a.f

  // Fields (1)
  final IntroTutorialActV1 this$0

  // Constructors (1)
  com.perblue.rpg.game.tutorial.IntroTutorialActV1$6(IntroTutorialActV1)

  // Methods (1)
  public void onEvent(int, a)
```

## com.perblue.rpg.game.tutorial.IntroTutorialActV1$6$1
```
 class  implements a.a.f

  // Fields (2)
  final  this$1
  final TutorialAttackScreen val$tutScreen

  // Constructors (1)
  com.perblue.rpg.game.tutorial.IntroTutorialActV1$6$1(, TutorialAttackScreen)

  // Methods (1)
  public void onEvent(int, a)
```

## com.perblue.rpg.game.tutorial.IntroTutorialActV1$7
```
 class  implements a.a.f

  // Fields (2)
  final IntroTutorialActV1 this$0
  final TutorialAttackScreen val$attackScreen

  // Constructors (1)
  com.perblue.rpg.game.tutorial.IntroTutorialActV1$7(IntroTutorialActV1, TutorialAttackScreen)

  // Methods (1)
  public void onEvent(int, a)
```

## com.perblue.rpg.game.tutorial.IntroTutorialActV1$8
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$UnitType
```

## com.perblue.rpg.game.tutorial.LegendaryQuestInfoActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.LegendaryQuestStoryAct$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$NarratorLocation
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.MysticClosetActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.MysticClosetActV2$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.PowerPointsActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.PowerUseActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.PromoteHeroActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.RuneFusionActV1$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.RuneShrineActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.RunesActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.StoryActV1$1
```
static class 

  // Fields (3)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$NarratorLocation
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.TempleInviteActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.TempleYoursActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

## com.perblue.rpg.game.tutorial.TutorialHelper$1
```
static final class  implements com.perblue.rpg.ui.widgets.NarratorView$NarratorCloseCallback

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialHelper$1()

  // Methods (1)
  public final void onClose()
```

## com.perblue.rpg.game.tutorial.TutorialHelper$2
```
static final class  implements com.perblue.rpg.game.event.EventListener

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialHelper$2()

  // Methods (2)
  public final void onEvent(TutorialTransitionEvent)
```

## com.perblue.rpg.game.tutorial.TutorialHelper$3
```
static final class  implements com.perblue.rpg.game.event.EventListener

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialHelper$3()

  // Methods (2)
  public final void onEvent(UserChangeEvent)
```

## com.perblue.rpg.game.tutorial.TutorialHelper$4
```
static final class  implements a.a.f

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialHelper$4()

  // Methods (1)
  public final void onEvent(int, a)
```

## com.perblue.rpg.game.tutorial.TutorialHelper$5
```
static final class  implements a.a.f

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialHelper$5()

  // Methods (1)
  public final void onEvent(int, a)
```

## com.perblue.rpg.game.tutorial.TutorialHelper$6
```
static final class  implements a.a.f

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialHelper$6()

  // Methods (1)
  public final void onEvent(int, a)
```

## com.perblue.rpg.game.tutorial.TutorialHelper$7
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$network$messages$TutorialActType
```

## com.perblue.rpg.game.tutorial.TutorialPointerInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$UIComponentName
```

## com.perblue.rpg.game.tutorial.TutorialPointerInfo$GridRectangle
```
public static class GridRectangle

  // Fields (4)
  public int height
  public int width
  public int x
  public int y

  // Constructors (1)
  com.perblue.rpg.game.tutorial.TutorialPointerInfo$GridRectangle(int, int, int, int)
```

## com.perblue.rpg.game.tutorial.UnlockHeroActV1$1
```
static class 

  // Fields (2)
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialFlag
  static final int[] $SwitchMap$com$perblue$rpg$game$tutorial$TutorialTransition
```

