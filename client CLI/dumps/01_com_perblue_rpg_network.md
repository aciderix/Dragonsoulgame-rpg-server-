# NETWORK - Protocol & Messages
Package prefix: `com.perblue.rpg.network`
Classes: 368

## com.perblue.rpg.network.ClientXORConnectionWrapper
```
public class ClientXORConnectionWrapper extends com.perblue.common.i.a

  // Constructors (2)
  com.perblue.rpg.network.ClientXORConnectionWrapper()
  com.perblue.rpg.network.ClientXORConnectionWrapper(byte[])
```

## com.perblue.rpg.network.EmptyNetworkProvider
```
public class EmptyNetworkProvider extends com.perblue.rpg.network.NetworkProvider

  // Fields (1)
  private static final Runnable emptyRunnable

  // Constructors (1)
  com.perblue.rpg.network.EmptyNetworkProvider()

  // Methods (5)
  public void connectToServer(Runnable, Runnable)
  public void onReconnect()
  public void onStop(boolean, long)
  public void sendMessage(i)
  public void sendMessage(i, boolean)
```

## com.perblue.rpg.network.NetworkProvider
```
public class NetworkProvider

  // Fields (18)
  private static final int CONNECTION_SEND_TIMEOUT = 0
  public static final int CONNECT_TIMEOUT = 10000
  private static final int RECONNECT_ATTEMPTS = 3
  private static final int RECONNECT_INTERVAL = 5
  private static final String TAG
  private e connection
  private volatile boolean disconnected
  private AtomicReference error
  private final Queue failedMessageQueue
  private AtomicReference host
  private final ExecutorService networkExecutor
  private volatile boolean outOfRetrys
  private volatile boolean paused
  private AtomicReference port
  private final Runnable reconnectRunnable
  private AtomicReference retryRunnable
  private final ScheduledExecutorService sendExecutor
  private final Runnable sendFailRunnable

  // Constructors (1)
  com.perblue.rpg.network.NetworkProvider(Runnable, Runnable)

  // Methods (30)
  public boolean isReconnecting()
  private void tryReconnect()
  public Exception getError()
  private e getConnection()
  public void setAddress(String, int)
  public void setDisconnected()
  public void setListener(Class, h)
  public void setPaused(boolean)
  public void connectToServer(Runnable, Runnable)
  public void onReconnect()
  public void onStop(boolean, long)
  public void sendMessage(i, boolean)
  public void sendMessage(i)
  public String getHost()
```

## com.perblue.rpg.network.ServerXORConnectionWrapper
```
public class ServerXORConnectionWrapper extends com.perblue.common.i.a

  // Constructors (1)
  com.perblue.rpg.network.ServerXORConnectionWrapper()
```

## com.perblue.rpg.network.XORConnectionWrapper
```
public class XORConnectionWrapper extends com.perblue.common.i.a

  // Constructors (2)
  com.perblue.rpg.network.XORConnectionWrapper()
  com.perblue.rpg.network.XORConnectionWrapper(byte[])
```

## com.perblue.rpg.network.messages.ABTestGroups
```
public class ABTestGroups extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = ABTestGroups1
  public Map testGroups

  // Constructors (2)
  com.perblue.rpg.network.messages.ABTestGroups()
  com.perblue.rpg.network.messages.ABTestGroups(a)

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  protected boolean innerReadFieldTestGroups(a)
  public String toString()
```

## com.perblue.rpg.network.messages.AcceptGuildMember
```
public class AcceptGuildMember extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = AcceptGuildMember1
  public Long chatID
  public Boolean isAccept
  public Long userID

  // Constructors (2)
  com.perblue.rpg.network.messages.AcceptGuildMember(a)
  com.perblue.rpg.network.messages.AcceptGuildMember()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.Action
```
public class Action extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = Action1
  public CommandType command
  public Map extra
  public UnitType heroType
  public Integer iD
  public ItemType itemType

  // Constructors (2)
  com.perblue.rpg.network.messages.Action()
  com.perblue.rpg.network.messages.Action(a)

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  protected boolean innerReadFieldExtra(a)
  public String toString()
```

## com.perblue.rpg.network.messages.ActionExtraType
```
public final enum ActionExtraType extends java.lang.Enum

  // Fields (21)
  private static final ActionExtraType[] $VALUES
  public static final ActionExtraType CHAPTER
  public static final ActionExtraType COST
  public static final ActionExtraType COUNT
  public static final ActionExtraType DEFAULT
  public static final ActionExtraType ENTRY_POINT
  public static final ActionExtraType FORCE
  public static final ActionExtraType ID
  public static final ActionExtraType INDEX
  public static final ActionExtraType LEVEL
  public static final ActionExtraType PRODUCT_ID
  public static final ActionExtraType REASON
  public static final ActionExtraType REASON_2
  public static final ActionExtraType SKILL
  public static final ActionExtraType SLOT
  public static final ActionExtraType TEXT
  public static final ActionExtraType TIME
  public static final ActionExtraType TYPE
  public static final ActionExtraType UPSELL
  public static final ActionExtraType USE_ITEM
  private static ActionExtraType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.ActionExtraType(String, int)

  // Methods (3)
  public static ActionExtraType[] valuesCached()
  public static ActionExtraType[] values()
  public static ActionExtraType valueOf(String)
```

## com.perblue.rpg.network.messages.ActionGroup
```
public class ActionGroup extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ActionGroup1
  public List actions
  public List upsellActions

  // Constructors (2)
  com.perblue.rpg.network.messages.ActionGroup(a)
  com.perblue.rpg.network.messages.ActionGroup()

  // Methods (8)
  protected boolean innerReadFieldActions(a)
  protected boolean innerReadFieldUpsellActions(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ActivateRuneShrine
```
public class ActivateRuneShrine extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = ActivateRuneShrine1
  public RuneShrineActivationType activationType
  public Integer diamondsUsed
  public List offerings
  public RuneShrineType shrineType

  // Constructors (2)
  com.perblue.rpg.network.messages.ActivateRuneShrine(a)
  com.perblue.rpg.network.messages.ActivateRuneShrine()

  // Methods (7)
  protected boolean innerReadFieldOfferings(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.AddInProgressCryptAttack
```
public class AddInProgressCryptAttack extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = AddInProgressCryptAttack1
  public Integer rank

  // Constructors (2)
  com.perblue.rpg.network.messages.AddInProgressCryptAttack(a)
  com.perblue.rpg.network.messages.AddInProgressCryptAttack()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.AddInProgressGuildWarAttack
```
public class AddInProgressGuildWarAttack extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = AddInProgressGuildWarAttack1
  public Long defenderID

  // Constructors (2)
  com.perblue.rpg.network.messages.AddInProgressGuildWarAttack(a)
  com.perblue.rpg.network.messages.AddInProgressGuildWarAttack()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.AddInProgressTempleAttack
```
public class AddInProgressTempleAttack extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = AddInProgressTempleAttack1
  public Long templeID

  // Constructors (2)
  com.perblue.rpg.network.messages.AddInProgressTempleAttack(a)
  com.perblue.rpg.network.messages.AddInProgressTempleAttack()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.AdvanceBossBattleResponse
```
public class AdvanceBossBattleResponse extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = AdvanceBossBattleResponse1
  public BossBattleResponse bossBattle

  // Constructors (2)
  com.perblue.rpg.network.messages.AdvanceBossBattleResponse(a)
  com.perblue.rpg.network.messages.AdvanceBossBattleResponse()

  // Methods (8)
  protected boolean innerReadFieldBossBattle(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldBossBattle_BossBattleData(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.AllContestData
```
public class AllContestData extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = AllContestData1
  public Map contests

  // Constructors (2)
  com.perblue.rpg.network.messages.AllContestData(a)
  com.perblue.rpg.network.messages.AllContestData()

  // Methods (7)
  protected boolean innerReadFieldContests(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.AmazonVerificationRequest
```
public class AmazonVerificationRequest extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = AmazonVerificationRequest1
  public String entryPoint
  public String packageName
  public String productID
  public String purchaseID
  public String purchaseToken
  public String userID

  // Constructors (2)
  com.perblue.rpg.network.messages.AmazonVerificationRequest(a)
  com.perblue.rpg.network.messages.AmazonVerificationRequest()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.AmazonVerificationResponse
```
public class AmazonVerificationResponse extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = AmazonVerificationResponse1
  public String productID
  public String purchaseID
  public Boolean success

  // Constructors (2)
  com.perblue.rpg.network.messages.AmazonVerificationResponse(a)
  com.perblue.rpg.network.messages.AmazonVerificationResponse()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.AppReviewStatus
```
public final enum AppReviewStatus extends java.lang.Enum

  // Fields (5)
  private static final AppReviewStatus[] $VALUES
  public static final AppReviewStatus NEVER
  public static final AppReviewStatus NO_RESPONSE
  public static final AppReviewStatus REVIEWED
  private static AppReviewStatus[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.AppReviewStatus(String, int)

  // Methods (3)
  public static AppReviewStatus[] valuesCached()
  public static AppReviewStatus[] values()
  public static AppReviewStatus valueOf(String)
```

## com.perblue.rpg.network.messages.ArenaAttack
```
public class ArenaAttack extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = ArenaAttack1
  public AttackBase base
  public Long defendingUserID
  public List heroes

  // Constructors (2)
  com.perblue.rpg.network.messages.ArenaAttack(a)
  com.perblue.rpg.network.messages.ArenaAttack()

  // Methods (8)
  protected boolean innerReadFieldHeroes(a)
  protected boolean innerReadFieldBase(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ArenaDemotion
```
public class ArenaDemotion extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = ArenaDemotion1
  public ArenaType type
  public Integer unclaimedArenaDemotionDivision
  public ArenaTier unclaimedArenaDemotionTier

  // Constructors (2)
  com.perblue.rpg.network.messages.ArenaDemotion(a)
  com.perblue.rpg.network.messages.ArenaDemotion()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ArenaInfo
```
public class ArenaInfo extends com.perblue.a.a.i

  // Fields (11)
  private static final String FULL_NAME = ArenaInfo1
  public List challengerLeagueData
  public List leagueData
  public Integer promotePositions
  public Integer topDivision
  public ArenaTier topTier
  public ArenaType type
  public Integer yourDivision
  public ArenaRow yourInfo
  public Integer yourRank
  public ArenaTier yourTier

  // Constructors (2)
  com.perblue.rpg.network.messages.ArenaInfo(a)
  com.perblue.rpg.network.messages.ArenaInfo()

  // Methods (10)
  protected boolean innerReadFieldYourInfo(a)
  protected boolean innerReadFieldYourInfo_PlayerRow(a)
  protected boolean innerReadFieldLeagueData(a)
  protected boolean innerReadFieldChallengerLeagueData(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ArenaLeagueExtra
```
public class ArenaLeagueExtra extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = ArenaLeagueExtra1
  public List members
  public Integer membersReceived
  public Long nextDemotionEndTime
  public Long nextPromotionEndTime
  public Boolean old
  public Long oldTime

  // Constructors (2)
  com.perblue.rpg.network.messages.ArenaLeagueExtra(a)
  com.perblue.rpg.network.messages.ArenaLeagueExtra()

  // Methods (7)
  protected boolean innerReadFieldMembers(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ArenaPromotion
```
public class ArenaPromotion extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = ArenaPromotion1
  public ArenaType type
  public Integer unclaimedArenaPromotionDivision
  public ArenaTier unclaimedArenaPromotionTier

  // Constructors (2)
  com.perblue.rpg.network.messages.ArenaPromotion(a)
  com.perblue.rpg.network.messages.ArenaPromotion()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ArenaRankingRow
```
public class ArenaRankingRow extends com.perblue.a.a.i

  // Fields (8)
  private static final String FULL_NAME = ArenaRankingRow1
  public Integer division
  public Integer heroPower
  public List lineup
  public List lineups
  public PlayerRow playerRow
  public Integer rank
  public ArenaTier tier

  // Constructors (2)
  com.perblue.rpg.network.messages.ArenaRankingRow(a)
  com.perblue.rpg.network.messages.ArenaRankingRow()

  // Methods (11)
  protected boolean innerReadFieldPlayerRow(a)
  protected boolean innerReadFieldLineup(a)
  protected boolean innerReadFieldLineups(a)
  protected boolean innerReadFieldPlayerRow_Info(a)
  protected boolean innerReadFieldPlayerRow_GuildInfo(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ArenaRow
```
public class ArenaRow extends com.perblue.a.a.i

  // Fields (13)
  private static final String FULL_NAME = ArenaRow1
  public Double countUpScalar
  public Long demotionEndTime
  public Integer heroPower
  public Boolean isNew
  public Long lastAttackTime
  public List lineup
  public List lineups
  public PlayerRow playerRow
  public Long promotionEndTime
  public Long promotionFreezeTime
  public Boolean provisional
  public Integer rankDelta

  // Constructors (2)
  com.perblue.rpg.network.messages.ArenaRow(a)
  com.perblue.rpg.network.messages.ArenaRow()

  // Methods (11)
  protected boolean innerReadFieldPlayerRow(a)
  protected boolean innerReadFieldLineup(a)
  protected boolean innerReadFieldLineups(a)
  protected boolean innerReadFieldPlayerRow_Info(a)
  protected boolean innerReadFieldPlayerRow_GuildInfo(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ArenaShortInfoExtra
```
public class ArenaShortInfoExtra extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = ArenaShortInfoExtra1
  public ArenaRow arenaRow

  // Constructors (2)
  com.perblue.rpg.network.messages.ArenaShortInfoExtra()
  com.perblue.rpg.network.messages.ArenaShortInfoExtra(a)

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldArenaRow_PlayerRow(a)
  protected boolean innerReadFieldArenaRow(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ArenaTier
```
public final enum ArenaTier extends java.lang.Enum

  // Fields (9)
  private static final ArenaTier[] $VALUES
  public static final ArenaTier BRONZE
  public static final ArenaTier CHALLENGER
  public static final ArenaTier COPPER
  public static final ArenaTier DEFAULT
  public static final ArenaTier GOLD
  public static final ArenaTier PLATINUM
  public static final ArenaTier SILVER
  private static ArenaTier[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.ArenaTier(String, int)

  // Methods (3)
  public static ArenaTier[] valuesCached()
  public static ArenaTier[] values()
  public static ArenaTier valueOf(String)
```

## com.perblue.rpg.network.messages.ArenaType
```
public final enum ArenaType extends java.lang.Enum

  // Fields (5)
  private static final ArenaType[] $VALUES
  public static final ArenaType COLISEUM
  public static final ArenaType DEFAULT
  public static final ArenaType FIGHT_PIT
  private static ArenaType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.ArenaType(String, int)

  // Methods (3)
  public static ArenaType[] valuesCached()
  public static ArenaType[] values()
  public static ArenaType valueOf(String)
```

## com.perblue.rpg.network.messages.ArenaUpdate
```
public class ArenaUpdate extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = ArenaUpdate1
  public ArenaInfo updateInfo

  // Constructors (2)
  com.perblue.rpg.network.messages.ArenaUpdate(a)
  com.perblue.rpg.network.messages.ArenaUpdate()

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldUpdateInfo(a)
  protected boolean innerReadFieldUpdateInfo_YourInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.AttackBase
```
public class AttackBase extends com.perblue.a.a.i

  // Fields (79)
  private static final String FULL_NAME = AttackBase1
  public HeroLineupType attackLineupType
  public Map attackerAccuracy
  public Map attackerActiveSkillUses
  public Map attackerAgility
  public Map attackerArmor
  public Map attackerArmorPenetration
  public Map attackerAttackDamage
  public Map attackerAttackSpeedModifier
  public Map attackerCooldownReduction
  public Map attackerCritDamageBonus
  public Map attackerDodge
  public Map attackerEnergyConsumptionReduction
  public Map attackerEnergyGain
  public Map attackerEnergyRegen
  public Map attackerExpertise
  public Map attackerFury
  public Map attackerHPRegen
  public Map attackerIgnoreMagicResistance
  public Map attackerImproveHealing
  public Map attackerIntellect
  public Map attackerLargerShields
  public Map attackerLifeStealRating
  public Map attackerLongerDisables
  public Map attackerLongerShields
  public Map attackerMagicCrit
  public Map attackerMagicPower
  public Map attackerMagicResistance
  public Map attackerMagicVamp
  public Map attackerMaxHP
  public Map attackerMovementSpeedModifier
  public Map attackerPhysicalCrit
  public Map attackerReducedCritDamage
  public Map attackerStartingEnergy
  public Map attackerStartingHP
  public Map attackerStrength
  public Map attackerTenacity
  public Boolean autoEnabled
  public Map damageDoneInfo
  public Map defenderAccuracy
  public Map defenderActiveSkillUses
  public Map defenderAgility
  public Map defenderArmor
  public Map defenderArmorPenetration
  public Map defenderAttackDamage
  public Map defenderAttackSpeedModifier
  public Map defenderCooldownReduction
  public Map defenderCritDamageBonus
  public Map defenderDodge
  public Map defenderEnergyConsumptionReduction
  public Map defenderEnergyGain
  public Map defenderEnergyRegen
  public Map defenderExpertise
  public Map defenderFury
  public Map defenderHPRegen
  public Map defenderIgnoreMagicResistance
  public Map defenderImproveHealing
  public Map defenderIntellect
  public Map defenderLargerShields
  public Map defenderLifeStealRating
  public Map defenderLongerDisables
  public Map defenderLongerShields
  public Map defenderMagicCrit
  public Map defenderMagicPower
  public Map defenderMagicResistance
  public Map defenderMagicVamp
  public Map defenderMaxHP
  public Map defenderMovementSpeedModifier
  public Map defenderPhysicalCrit
  public Map defenderReducedCritDamage
  public Map defenderStartingEnergy
  public Map defenderStartingHP
  public Map defenderStrength
  public Map defenderTenacity
  public Integer heroesRemaining
  public CombatOutcome outcome
  public Integer stars
  public Boolean twoXEnabled
  public Boolean usedAuto

  // Constructors (2)
  com.perblue.rpg.network.messages.AttackBase(a)
  com.perblue.rpg.network.messages.AttackBase()

  // Methods (77)
  protected boolean innerReadFieldDefenderAttackDamage(a)
  protected boolean innerReadFieldAttackerMagicPower(a)
  protected boolean innerReadFieldDefenderMagicPower(a)
  protected boolean innerReadFieldAttackerArmor(a)
  protected boolean innerReadFieldDefenderArmor(a)
  protected boolean innerReadFieldAttackerPhysicalCrit(a)
  protected boolean innerReadFieldDamageDoneInfo(a)
  protected boolean innerReadFieldAttackerStartingHP(a)
  protected boolean innerReadFieldDefenderStartingHP(a)
  protected boolean innerReadFieldAttackerMaxHP(a)
  protected boolean innerReadFieldDefenderMaxHP(a)
  protected boolean innerReadFieldAttackerAttackDamage(a)
  protected boolean innerReadFieldDefenderPhysicalCrit(a)
  protected boolean innerReadFieldAttackerMagicCrit(a)
  protected boolean innerReadFieldDefenderMagicCrit(a)
  protected boolean innerReadFieldAttackerHPRegen(a)
  protected boolean innerReadFieldDefenderHPRegen(a)
  protected boolean innerReadFieldAttackerEnergyRegen(a)
  protected boolean innerReadFieldDefenderEnergyRegen(a)
  protected boolean innerReadFieldAttackerDodge(a)
  protected boolean innerReadFieldDefenderDodge(a)
  protected boolean innerReadFieldAttackerStrength(a)
  protected boolean innerReadFieldDefenderStrength(a)
  protected boolean innerReadFieldAttackerAgility(a)
  protected boolean innerReadFieldDefenderAgility(a)
  protected boolean innerReadFieldAttackerIntellect(a)
  protected boolean innerReadFieldDefenderIntellect(a)
  protected boolean innerReadFieldAttackerAccuracy(a)
  protected boolean innerReadFieldDefenderAccuracy(a)
  protected boolean innerReadFieldAttackerFury(a)
  protected boolean innerReadFieldDefenderFury(a)
  protected boolean innerReadFieldAttackerTenacity(a)
  protected boolean innerReadFieldDefenderTenacity(a)
  protected boolean innerReadFieldAttackerExpertise(a)
  protected boolean innerReadFieldDefenderExpertise(a)
  protected boolean innerReadFieldAttackerEnergyGain(a)
  protected boolean innerReadFieldDefenderEnergyGain(a)
  protected boolean innerReadFieldAttackerMagicVamp(a)
  protected boolean innerReadFieldDefenderMagicVamp(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldDefenderStartingEnergy(a)
  protected boolean innerReadFieldAttackerActiveSkillUses(a)
  protected boolean innerReadFieldDefenderActiveSkillUses(a)
  protected boolean innerReadFieldAttackerMagicResistance(a)
  protected boolean innerReadFieldDefenderMagicResistance(a)
  protected boolean innerReadFieldAttackerLifeStealRating(a)
  protected boolean innerReadFieldAttackerStartingEnergy(a)
  protected boolean innerReadFieldDefenderLifeStealRating(a)
  protected boolean innerReadFieldAttackerIgnoreMagicResistance(a)
  protected boolean innerReadFieldDefenderIgnoreMagicResistance(a)
  protected boolean innerReadFieldAttackerImproveHealing(a)
  protected boolean innerReadFieldDefenderImproveHealing(a)
  protected boolean innerReadFieldAttackerArmorPenetration(a)
  protected boolean innerReadFieldDefenderArmorPenetration(a)
  protected boolean innerReadFieldAttackerEnergyConsumptionReduction(a)
  protected boolean innerReadFieldDefenderEnergyConsumptionReduction(a)
  protected boolean innerReadFieldAttackerReducedCritDamage(a)
  protected boolean innerReadFieldDefenderReducedCritDamage(a)
  protected boolean innerReadFieldAttackerLongerDisables(a)
  protected boolean innerReadFieldDefenderLongerDisables(a)
  protected boolean innerReadFieldAttackerMovementSpeedModifier(a)
  protected boolean innerReadFieldDefenderMovementSpeedModifier(a)
  protected boolean innerReadFieldAttackerAttackSpeedModifier(a)
  protected boolean innerReadFieldDefenderAttackSpeedModifier(a)
  protected boolean innerReadFieldAttackerCooldownReduction(a)
  protected boolean innerReadFieldDefenderCooldownReduction(a)
  protected boolean innerReadFieldAttackerLargerShields(a)
  protected boolean innerReadFieldDefenderLargerShields(a)
  protected boolean innerReadFieldAttackerLongerShields(a)
  protected boolean innerReadFieldDefenderLongerShields(a)
  protected boolean innerReadFieldAttackerCritDamageBonus(a)
  protected boolean innerReadFieldDefenderCritDamageBonus(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.AuthType
```
public final enum AuthType extends java.lang.Enum

  // Fields (9)
  private static final AuthType[] $VALUES
  public static final AuthType DEVICE
  public static final AuthType EMAIL
  public static final AuthType FACEBOOK
  public static final AuthType FORCED
  public static final AuthType GAME_CENTER
  public static final AuthType GAME_CIRCLE
  public static final AuthType GOOGLE_PLUS
  private static AuthType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.AuthType(String, int)

  // Methods (3)
  public static AuthType[] valuesCached()
  public static AuthType[] values()
  public static AuthType valueOf(String)
```

## com.perblue.rpg.network.messages.Avatar
```
public class Avatar extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = Avatar1
  public ItemType skin
  public UnitType unit

  // Constructors (2)
  com.perblue.rpg.network.messages.Avatar(a)
  com.perblue.rpg.network.messages.Avatar()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BasicGuildInfo
```
public class BasicGuildInfo extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = BasicGuildInfo1
  public GuildEmblemType emblem
  public Long iD
  public String name
  public Integer warBorder

  // Constructors (2)
  com.perblue.rpg.network.messages.BasicGuildInfo(a)
  com.perblue.rpg.network.messages.BasicGuildInfo()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BasicUserInfo
```
public class BasicUserInfo extends com.perblue.a.a.i

  // Fields (12)
  private static final String FULL_NAME = BasicUserInfo1
  public Avatar avatar
  public Long creationTime
  public Long guildID
  public GuildRole guildRole
  public Long iD
  public String name
  public UnitType oldAvatar
  public String previousName
  public Integer teamLevel
  public Long userLastActive
  public Integer vIPLevel

  // Constructors (2)
  com.perblue.rpg.network.messages.BasicUserInfo(a)
  com.perblue.rpg.network.messages.BasicUserInfo()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldAvatar(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.Battle
```
public class Battle extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = Battle1
  public Long attackerID
  public Long defenderID
  public GameMode gameMode
  public Long iD

  // Constructors (2)
  com.perblue.rpg.network.messages.Battle(a)
  com.perblue.rpg.network.messages.Battle()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BetaPurchase
```
public class BetaPurchase extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = BetaPurchase1
  public String entryPoint
  public String productId
  public String purchaseID

  // Constructors (2)
  com.perblue.rpg.network.messages.BetaPurchase(a)
  com.perblue.rpg.network.messages.BetaPurchase()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BlockUser
```
public class BlockUser extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = BlockUser1
  public Long userID

  // Constructors (2)
  com.perblue.rpg.network.messages.BlockUser(a)
  com.perblue.rpg.network.messages.BlockUser()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BlockedList
```
public class BlockedList extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = BlockedList1
  public List users

  // Constructors (2)
  com.perblue.rpg.network.messages.BlockedList(a)
  com.perblue.rpg.network.messages.BlockedList()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldUsers(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BootData
```
public class BootData extends com.perblue.a.a.i

  // Fields (19)
  private static final String FULL_NAME = BootData1
  public AllContestData allContests
  public Server currentServer
  public Boolean firstBoot
  public GuildInfo guildInfo
  public IAPProducts iAPProducts
  public String loginEvent
  public List mailMessages
  public PossibleChestDrops possibleChestDrops
  public PrivateUserInfo privateUserInfo
  public Long serverTime
  public SpecialEventsRaw specialEvents
  public Map statData
  public Map tapJoyPPEEvents
  public TitanTempleSummaries titanTemples
  public Boolean updateAvailable
  public UserExtra userExtra
  public UserInfo userInfo
  public WarRedDotInfo warRedDotInfo

  // Constructors (2)
  com.perblue.rpg.network.messages.BootData(a)
  com.perblue.rpg.network.messages.BootData()

  // Methods (28)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldGuildInfo(a)
  protected boolean innerReadFieldGuildInfo_BasicInfo(a)
  protected boolean innerReadFieldUserInfo(a)
  protected boolean innerReadFieldPrivateUserInfo(a)
  protected boolean innerReadFieldUserExtra(a)
  protected boolean innerReadFieldStatData(a)
  protected boolean innerReadFieldIAPProducts(a)
  protected boolean innerReadFieldPossibleChestDrops(a)
  protected boolean innerReadFieldMailMessages(a)
  protected boolean innerReadFieldSpecialEvents(a)
  protected boolean innerReadFieldTapJoyPPEEvents(a)
  protected boolean innerReadFieldCurrentServer(a)
  protected boolean innerReadFieldTitanTemples(a)
  protected boolean innerReadFieldWarRedDotInfo(a)
  protected boolean innerReadFieldAllContests(a)
  protected boolean innerReadFieldUserExtra_Avatar(a)
  protected boolean innerReadFieldUserInfo_BasicInfo(a)
  protected boolean innerReadFieldPossibleChestDrops_GoldMonthlyDrop(a)
  protected boolean innerReadFieldSpecialEvents_SigninRewards(a)
  protected boolean innerReadFieldTitanTemples_YourTemple(a)
  protected boolean innerReadFieldUserExtra_OldExpeditionData(a)
  protected boolean innerReadFieldUserExtra_BossPitData(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BossBattleAttack
```
public class BossBattleAttack extends com.perblue.a.a.i

  // Fields (13)
  private static final String FULL_NAME = BossBattleAttack1
  public HeroLineup attackerHeroes
  public AttackBase base
  public Integer bossHPLeft
  public Integer chapter
  public String clearRank
  public List defenderHeroes
  public Long elapsedTime
  public Long eventID
  public Integer level
  public Integer stagePhase
  public Integer stagesCleared
  public Long totalElapsedTime

  // Constructors (2)
  com.perblue.rpg.network.messages.BossBattleAttack()
  com.perblue.rpg.network.messages.BossBattleAttack(a)

  // Methods (9)
  protected boolean innerReadFieldBase(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldAttackerHeroes(a)
  protected boolean innerReadFieldDefenderHeroes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BossBattleData
```
public class BossBattleData extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = BossBattleData1
  public BossBattleExtraData extraData
  public Long points

  // Constructors (2)
  com.perblue.rpg.network.messages.BossBattleData(a)
  com.perblue.rpg.network.messages.BossBattleData()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldExtraData(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BossBattleExtraData
```
public class BossBattleExtraData extends com.perblue.a.a.i

  // Fields (8)
  private static final String FULL_NAME = BossBattleExtraData1
  public Integer clearedChapter
  public Integer clearedLevel
  public List distributedTimeBonusRanks
  public List elapsedTimes
  public List opponents
  public Integer teamLevel
  public List usedUnits

  // Constructors (2)
  com.perblue.rpg.network.messages.BossBattleExtraData()
  com.perblue.rpg.network.messages.BossBattleExtraData(a)

  // Methods (10)
  protected boolean innerReadFieldDistributedTimeBonusRanks(a)
  protected boolean innerReadFieldOpponents(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldUsedUnits(a)
  protected boolean innerReadFieldElapsedTimes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BossBattleResponse
```
public class BossBattleResponse extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = BossBattleResponse1
  public BossBattleData bossBattleData
  public Long eventID
  public List opponents

  // Constructors (2)
  com.perblue.rpg.network.messages.BossBattleResponse(a)
  com.perblue.rpg.network.messages.BossBattleResponse()

  // Methods (9)
  protected boolean innerReadFieldOpponents(a)
  protected boolean innerReadFieldBossBattleData(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldBossBattleData_ExtraData(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BossBattlesResponse
```
public class BossBattlesResponse extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = BossBattlesResponse1
  public Map bossBattles

  // Constructors (2)
  com.perblue.rpg.network.messages.BossBattlesResponse(a)
  com.perblue.rpg.network.messages.BossBattlesResponse()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldBossBattles(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BossPitAttack
```
public class BossPitAttack extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = BossPitAttack1
  public HeroLineup attackerHeroes
  public AttackBase base
  public UnitType bossType
  public List lootEarned
  public Integer modeDifficulty
  public Integer phase

  // Constructors (2)
  com.perblue.rpg.network.messages.BossPitAttack(a)
  com.perblue.rpg.network.messages.BossPitAttack()

  // Methods (9)
  protected boolean innerReadFieldBase(a)
  protected boolean innerReadFieldLootEarned(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldAttackerHeroes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BossPitData
```
public class BossPitData extends com.perblue.a.a.i

  // Fields (9)
  private static final String FULL_NAME = BossPitData1
  public List completedBosses
  public UnitType currentBoss
  public Integer currentDifficulty
  public Integer currentDifficultyCap
  public Integer currentPhase
  public Boolean currentPhaseComplete
  public Long lastAttackTime
  public Map wins

  // Constructors (2)
  com.perblue.rpg.network.messages.BossPitData()
  com.perblue.rpg.network.messages.BossPitData(a)

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldWins(a)
  protected boolean innerReadFieldCompletedBosses(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BossPitRaidResults
```
public class BossPitRaidResults extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = BossPitRaidResults1
  public UnitType boss
  public Integer modeDifficulty
  public Integer phase
  public RaidOutcome result

  // Constructors (2)
  com.perblue.rpg.network.messages.BossPitRaidResults(a)
  com.perblue.rpg.network.messages.BossPitRaidResults()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldResult(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.BuildSource
```
public final enum BuildSource extends java.lang.Enum

  // Fields (7)
  private static final BuildSource[] $VALUES
  public static final BuildSource AMAZON
  public static final BuildSource DEFAULT
  public static final BuildSource GOOGLE
  public static final BuildSource IOS
  public static final BuildSource OTHER
  private static BuildSource[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.BuildSource(String, int)

  // Methods (3)
  public static BuildSource[] valuesCached()
  public static BuildSource[] values()
  public static BuildSource valueOf(String)
```

## com.perblue.rpg.network.messages.BuyChests
```
public class BuyChests extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = BuyChests1
  public ChestType chestType
  public Integer cost
  public Integer count
  public List rewardDrops
  public ItemType usedItem

  // Constructors (2)
  com.perblue.rpg.network.messages.BuyChests(a)
  com.perblue.rpg.network.messages.BuyChests()

  // Methods (7)
  protected boolean innerReadFieldRewardDrops(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CampaignAttack
```
public class CampaignAttack extends com.perblue.a.a.i

  // Fields (11)
  private static final String FULL_NAME = CampaignAttack1
  public AttackBase base
  public CampaignType campaignType
  public Integer chapter
  public List heroes
  public Integer kills
  public Integer level
  public List lootEarned
  public List memoryChanges
  public Long snapshotTime
  public Integer stagesCleared

  // Constructors (2)
  com.perblue.rpg.network.messages.CampaignAttack(a)
  com.perblue.rpg.network.messages.CampaignAttack()

  // Methods (10)
  protected boolean innerReadFieldHeroes(a)
  protected boolean innerReadFieldBase(a)
  protected boolean innerReadFieldLootEarned(a)
  protected boolean innerReadFieldMemoryChanges(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CampaignLevelStatus
```
public class CampaignLevelStatus extends com.perblue.a.a.i

  // Fields (8)
  private static final String FULL_NAME = CampaignLevelStatus1
  public CampaignType campaignType
  public Integer chapter
  public Long lastWinTime
  public Integer level
  public Integer stars
  public Integer totalWins
  public Integer winsAtCurrentStars

  // Constructors (2)
  com.perblue.rpg.network.messages.CampaignLevelStatus(a)
  com.perblue.rpg.network.messages.CampaignLevelStatus()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CampaignType
```
public final enum CampaignType extends java.lang.Enum

  // Fields (5)
  private static final CampaignType[] $VALUES
  public static final CampaignType ELITE
  public static final CampaignType EXPERT
  public static final CampaignType NORMAL
  private static CampaignType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.CampaignType(String, int)

  // Methods (3)
  public static CampaignType[] valuesCached()
  public static CampaignType[] values()
  public static CampaignType valueOf(String)
```

## com.perblue.rpg.network.messages.ChangeServer
```
public class ChangeServer extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = ChangeServer1
  public String contentLocation
  public String host
  public Integer port

  // Constructors (2)
  com.perblue.rpg.network.messages.ChangeServer(a)
  com.perblue.rpg.network.messages.ChangeServer()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ChangeTutorialStep
```
public class ChangeTutorialStep extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ChangeTutorialStep1
  public Integer step
  public TutorialActType type

  // Constructors (2)
  com.perblue.rpg.network.messages.ChangeTutorialStep(a)
  com.perblue.rpg.network.messages.ChangeTutorialStep()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.Chat
```
public class Chat extends com.perblue.a.a.i

  // Fields (11)
  private static final String FULL_NAME = Chat1
  public Long chatID
  public Map extra
  public BasicGuildInfo guildInfo
  public Lineup heroes
  public String message
  public ChatRoomType room
  public List runes
  public BasicUserInfo sender
  public Date time
  public ChatType type

  // Constructors (2)
  com.perblue.rpg.network.messages.Chat(a)
  com.perblue.rpg.network.messages.Chat()

  // Methods (12)
  protected boolean innerReadFieldHeroes(a)
  protected boolean innerReadFieldSender(a)
  protected boolean innerReadFieldSender_Avatar(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldRunes(a)
  protected boolean innerReadFieldGuildInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  protected boolean innerReadFieldExtra(a)
  public String toString()
```

## com.perblue.rpg.network.messages.ChatExtra
```
public class ChatExtra extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ChatExtra1
  public Lineup heroes
  public List runes

  // Constructors (2)
  com.perblue.rpg.network.messages.ChatExtra(a)
  com.perblue.rpg.network.messages.ChatExtra()

  // Methods (8)
  protected boolean innerReadFieldHeroes(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldRunes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ChatExtraType
```
public final enum ChatExtraType extends java.lang.Enum

  // Fields (12)
  private static final ChatExtraType[] $VALUES
  public static final ChatExtraType DEFAULT
  public static final ChatExtraType FLAG_AS_NEW
  public static final ChatExtraType HERO_TYPE
  public static final ChatExtraType LIKE_COUNT
  public static final ChatExtraType MOTD
  public static final ChatExtraType PERBLUE_STAFF
  public static final ChatExtraType RECEIVER_ID
  public static final ChatExtraType RECEIVER_NAME
  public static final ChatExtraType SHARD_ID
  public static final ChatExtraType STICKY
  private static ChatExtraType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.ChatExtraType(String, int)

  // Methods (3)
  public static ChatExtraType[] valuesCached()
  public static ChatExtraType[] values()
  public static ChatExtraType valueOf(String)
```

## com.perblue.rpg.network.messages.ChatList
```
public class ChatList extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ChatList1
  public List chats
  public Long lastViewTime

  // Constructors (2)
  com.perblue.rpg.network.messages.ChatList(a)
  com.perblue.rpg.network.messages.ChatList()

  // Methods (7)
  protected boolean innerReadFieldChats(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ChatRoomType
```
public final enum ChatRoomType extends java.lang.Enum

  // Fields (8)
  private static final ChatRoomType[] $VALUES
  public static final ChatRoomType GLOBAL
  public static final ChatRoomType GUILD
  public static final ChatRoomType GUILD_WALL
  public static final ChatRoomType HERO_WALL
  public static final ChatRoomType PERSONAL_MESSAGE
  public static final ChatRoomType VIP
  private static ChatRoomType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.ChatRoomType(String, int)

  // Methods (3)
  public static ChatRoomType[] valuesCached()
  public static ChatRoomType[] values()
  public static ChatRoomType valueOf(String)
```

## com.perblue.rpg.network.messages.ChatType
```
public final enum ChatType extends java.lang.Enum

  // Fields (14)
  private static final ChatType[] $VALUES
  public static final ChatType ADD_FRIEND
  public static final ChatType CHAT_APP_IMAGE
  public static final ChatType CHAT_APP_UPSELL
  public static final ChatType DELETE_CHAT
  public static final ChatType GUILD_WALL
  public static final ChatType JOIN_GUILD
  public static final ChatType JOIN_GUILD_REQUEST
  public static final ChatType LEAVE_GUILD
  public static final ChatType NORMAL
  public static final ChatType RANK_CHANGE
  public static final ChatType REMOVE_FRIEND
  public static final ChatType RULES
  private static ChatType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.ChatType(String, int)

  // Methods (3)
  public static ChatType[] valuesCached()
  public static ChatType[] values()
  public static ChatType valueOf(String)
```

## com.perblue.rpg.network.messages.ChestAcknowledgement
```
public class ChestAcknowledgement extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = ChestAcknowledgement1

  // Constructors (2)
  com.perblue.rpg.network.messages.ChestAcknowledgement(a)
  com.perblue.rpg.network.messages.ChestAcknowledgement()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ChestType
```
public final enum ChestType extends java.lang.Enum

  // Fields (10)
  private static final ChestType[] $VALUES
  public static final ChestType DEFAULT
  public static final ChestType EVENT
  public static final ChestType EXPEDITION
  public static final ChestType GOLD
  public static final ChestType ORANGE
  public static final ChestType PURPLE
  public static final ChestType SILVER
  public static final ChestType SOUL
  private static ChestType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.ChestType(String, int)

  // Methods (3)
  public static ChestType[] valuesCached()
  public static ChestType[] values()
  public static ChestType valueOf(String)
```

## com.perblue.rpg.network.messages.ClaimGuildWarRewards
```
public class ClaimGuildWarRewards extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = ClaimGuildWarRewards1
  public List claimedPickRewards
  public Integer claimedWarTokens
  public Integer startRewardIndex
  public Long warResultID

  // Constructors (2)
  com.perblue.rpg.network.messages.ClaimGuildWarRewards(a)
  com.perblue.rpg.network.messages.ClaimGuildWarRewards()

  // Methods (7)
  protected boolean innerReadFieldClaimedPickRewards(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ClaimInactiveGuild
```
public class ClaimInactiveGuild extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = ClaimInactiveGuild1
  public Long guildID

  // Constructors (2)
  com.perblue.rpg.network.messages.ClaimInactiveGuild(a)
  com.perblue.rpg.network.messages.ClaimInactiveGuild()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ClaimedPickRewards
```
public class ClaimedPickRewards extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = ClaimedPickRewards1
  public List rewards

  // Constructors (2)
  com.perblue.rpg.network.messages.ClaimedPickRewards(a)
  com.perblue.rpg.network.messages.ClaimedPickRewards()

  // Methods (7)
  protected boolean innerReadFieldRewards(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ClearAuthType
```
public class ClearAuthType extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ClearAuthType1
  public AuthType authType
  public Long userID

  // Constructors (2)
  com.perblue.rpg.network.messages.ClearAuthType(a)
  com.perblue.rpg.network.messages.ClearAuthType()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ClientInfo
```
public class ClientInfo extends com.perblue.a.a.i

  // Fields (45)
  private static final String FULL_NAME = ClientInfo1
  public String aPMacAddress
  public String aPSSID
  public String advertisingIdentifier
  public BuildSource buildSource
  public String carrierName
  public Integer clientConfigsHash
  public String country
  public Float dPIX
  public Float dPIY
  public Boolean dontLinkUser
  public Integer fullVersion
  public String imei
  public Boolean isConnectedToCell
  public Boolean isConnectedToWiFi
  public Boolean isReconnect
  public String language
  public Boolean limitAdTracking
  public String loginRequestID
  public String networkType
  public String notifType
  public String packageName
  public String phoneModel
  public String phoneName
  public Platform platform
  public PrivateUserInfo privateLoginInfo
  public String rawLanguage
  public String referalData
  public String registrationID
  public Integer sDKVersion
  public Float screenDensity
  public Integer screenHeight
  public Integer screenSize
  public Integer screenWidth
  public Integer shardID
  public String signature
  public Map statVersions
  public String systemDescription
  public String systemName
  public String systemVersion
  public Integer timeOffset
  public String timeZone
  public String uniqueIdentifier
  public Long userID
  public Integer version

  // Constructors (2)
  com.perblue.rpg.network.messages.ClientInfo(a)
  com.perblue.rpg.network.messages.ClientInfo()

  // Methods (8)
  protected boolean innerReadFieldPrivateLoginInfo(a)
  protected boolean innerReadFieldStatVersions(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ClockChange
```
public class ClockChange extends com.perblue.a.a.i

  // Fields (9)
  private static final String FULL_NAME = ClockChange1
  public Long clientTime
  public Long deviceRunningTime
  public Long offsetDelta
  public Long roundTrip
  public Long serverDelay
  public Long serverTime
  public String source
  public Long timeSinceReceived

  // Constructors (2)
  com.perblue.rpg.network.messages.ClockChange(a)
  com.perblue.rpg.network.messages.ClockChange()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ColiseumAttack
```
public class ColiseumAttack extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = ColiseumAttack1
  public AttackBase base
  public List battles
  public Long defendingUserID
  public List heroesUsed

  // Constructors (2)
  com.perblue.rpg.network.messages.ColiseumAttack(a)
  com.perblue.rpg.network.messages.ColiseumAttack()

  // Methods (9)
  protected boolean innerReadFieldBase(a)
  protected boolean innerReadFieldBattles(a)
  protected boolean innerReadFieldHeroesUsed(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ColiseumBattle
```
public class ColiseumBattle extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = ColiseumBattle1
  public List heroesUsed
  public CombatOutcome outcome
  public Integer stars

  // Constructors (2)
  com.perblue.rpg.network.messages.ColiseumBattle(a)
  com.perblue.rpg.network.messages.ColiseumBattle()

  // Methods (7)
  protected boolean innerReadFieldHeroesUsed(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CombatOutcome
```
public final enum CombatOutcome extends java.lang.Enum

  // Fields (5)
  private static final CombatOutcome[] $VALUES
  public static final CombatOutcome LOSS
  public static final CombatOutcome RETREAT
  public static final CombatOutcome WIN
  private static CombatOutcome[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.CombatOutcome(String, int)

  // Methods (3)
  public static CombatOutcome[] valuesCached()
  public static CombatOutcome[] values()
  public static CombatOutcome valueOf(String)
```

## com.perblue.rpg.network.messages.CommandType
```
public final enum CommandType extends java.lang.Enum

  // Fields (123)
  private static final CommandType[] $VALUES
  public static final CommandType ADD_FRIEND
  public static final CommandType ADD_HERO_EXP
  public static final CommandType ADD_XP_FOR_MAX_LEVEL
  public static final CommandType ADVANCE_BOSS_BATTLE
  public static final CommandType APPROVE_FRIEND
  public static final CommandType ATTACH_RUNE
  public static final CommandType AUTO_PROMOTE
  public static final CommandType BUY_GOLD
  public static final CommandType BUY_NEW_ACCOUNT
  public static final CommandType BUY_OFFERING_PACKAGE
  public static final CommandType BUY_POWER_POINTS
  public static final CommandType BUY_RAID_TICKETS
  public static final CommandType BUY_RUNICITE
  public static final CommandType BUY_SKIN
  public static final CommandType BUY_STAMINA
  public static final CommandType CHAT_SILENCE
  public static final CommandType CLAIM_FIGHT_PIT_PROMOTION_REWARD
  public static final CommandType CLAIM_LAPSED_CATCH_UP
  public static final CommandType CLAIM_SIGNIN_REWARD
  public static final CommandType CLAIM_TITAN_TEMPLE_REWARD
  public static final CommandType CLEAR_FIGHT_PIT_DEMOTION
  public static final CommandType COMPLETE_QUEST
  public static final CommandType CREATE_GUILD
  public static final CommandType DEBUG_COMMAND
  public static final CommandType DEBUG_GIVE_ITEM
  public static final CommandType DEBUG_GIVE_RESOURCE
  public static final CommandType DEBUG_SELECT_CHAPTER_BOSS_BATTLE
  public static final CommandType DEBUG_SET_SIGNINS
  public static final CommandType DEBUG_SET_TEAM_LEVEL
  public static final CommandType DEBUG_SET_VIP_LEVEL
  public static final CommandType DEFAULT
  public static final CommandType DELETE_MAIL_MESSAGE
  public static final CommandType DISBAND_GUILD
  public static final CommandType DROP_EXPEDITION_DIFFICULTY
  public static final CommandType EDIT_CHAT
  public static final CommandType EMPOWER_RUNE
  public static final CommandType EQUIP_ITEM
  public static final CommandType EVOLVE
  public static final CommandType EXCHANGE_ITEM
  public static final CommandType FACEBOOK_LIKED
  public static final CommandType FULL_MOON_GO
  public static final CommandType GET_ARENA_RANKINGS
  public static final CommandType GET_CONTEST_RANKINGS
  public static final CommandType GET_GUILD_RANKINGS
  public static final CommandType GET_GUILD_WAR_RANKINGS
  public static final CommandType GET_HEROES_FOR_HIRE
  public static final CommandType GET_NEW_MAIL_MESSAGES
  public static final CommandType GET_PLAYER_RANKINGS
  public static final CommandType GET_PM_THREAD
  public static final CommandType GET_TITAN_TEMPLE_INVITES
  public static final CommandType HIRE_HERO
  public static final CommandType HOW_TO_PLAY_VIEW
  public static final CommandType IMBUE_RUNE
  public static final CommandType LEAVE_HERO_WALL
  public static final CommandType LEGENDARY_QUEST_SKIP
  public static final CommandType LEGENDARY_SACRIFICE
  public static final CommandType LIKE_HERO_WALL_POST
  public static final CommandType MARK_MAIL_OPENED
  public static final CommandType NEVER_REVIEW
  public static final CommandType OPEN_EXPEDITION_CHEST
  public static final CommandType OPT_OUT_OF_WAR
  public static final CommandType PMTHREAD_HIDECHANNEL
  public static final CommandType POST_HERO
  public static final CommandType PROMOTE
  public static final CommandType PURCHASE_TRADER_ITEM
  public static final CommandType QUARTER_MOON_GO
  public static final CommandType REDEEM_CODE
  public static final CommandType REFRESH_SOUL_CHEST_DROPS
  public static final CommandType REFRESH_SPECIAL_EVENTS
  public static final CommandType REFRESH_TRADER
  public static final CommandType REGISTER_FOR_WAR
  public static final CommandType REJECT_FRIEND
  public static final CommandType REMOVE_CHAT
  public static final CommandType REMOVE_FRIEND
  public static final CommandType REMOVE_ITEM
  public static final CommandType REMOVE_RUNE
  public static final CommandType REQUEST_WAR_INFO
  public static final CommandType REQUEST_WAR_LOGS
  public static final CommandType REQUEST_WAR_MEMBERS
  public static final CommandType RESET_BOSS_BATTLE
  public static final CommandType RESET_ELITE_LEVEL
  public static final CommandType RESET_FIGHT_PIT_CHANCES
  public static final CommandType RESET_GAME_MODE
  public static final CommandType REVIEW_APP
  public static final CommandType SELL_ITEM
  public static final CommandType SELL_RUNE
  public static final CommandType SEND_TITAN_TEMPLE_INVITE
  public static final CommandType SET_COUNT
  public static final CommandType SET_FLAG
  public static final CommandType SET_SEED
  public static final CommandType SET_SKIN
  public static final CommandType SKIPPED_REVIEW
  public static final CommandType START_COLISEUM_ATTACK
  public static final CommandType START_FIGHT_PIT_ATTACK
  public static final CommandType START_QUEST
  public static final CommandType START_TITAN_TEMPLE_ATTACK
  public static final CommandType START_WAR_BATTLE
  public static final CommandType SURRENDER_WAR_BATTLE
  public static final CommandType TAKE_MAIL_ATTACHMENTS
  public static final CommandType TAPPED_MONTHLY_CARD_REMINDER
  public static final CommandType THIRD_PARTY_QUEST_UPDATE
  public static final CommandType TOGGLE_CHAT_STICKY
  public static final CommandType UNLIKE_HERO_WALL_POST
  public static final CommandType UNLOCK_HERO
  public static final CommandType UNLOCK_MERCHANT
  public static final CommandType UPDATE_HOW_TO_PLAY
  public static final CommandType UPDATE_TIME
  public static final CommandType UPDATE_TIMEZONE
  public static final CommandType UPGRADE_SKILL
  public static final CommandType USE_ITEM
  public static final CommandType VIEWED_CHAT_APP_UPSELL
  public static final CommandType VIEWED_CHAT_RULES
  public static final CommandType VIEWED_CHESTS
  public static final CommandType VIEWED_CONSUMABLE_ITEM
  public static final CommandType VIEWED_CRYPT_RESULTS
  public static final CommandType VIEWED_GUILD_WALL
  public static final CommandType VIEWED_SKIN
  public static final CommandType VIEW_BATTLE_RESULTS
  public static final CommandType VIEW_DAILY_QUESTS
  public static final CommandType VIEW_LEGENDARY_QUESTS
  public static final CommandType VIEW_TREASURE
  private static CommandType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.CommandType(String, int)

  // Methods (3)
  public static CommandType[] valuesCached()
  public static CommandType[] values()
  public static CommandType valueOf(String)
```

## com.perblue.rpg.network.messages.ContestData
```
public class ContestData extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = ContestData1
  public ContestExtraData extraData
  public Long points
  public Integer rank
  public Integer totalPlayers

  // Constructors (2)
  com.perblue.rpg.network.messages.ContestData(a)
  com.perblue.rpg.network.messages.ContestData()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldExtraData(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ContestExtraData
```
public class ContestExtraData extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ContestExtraData1
  public Map taskCompletionCount
  public Map taskPartialCount

  // Constructors (2)
  com.perblue.rpg.network.messages.ContestExtraData(a)
  com.perblue.rpg.network.messages.ContestExtraData()

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldTaskCompletionCount(a)
  protected boolean innerReadFieldTaskPartialCount(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ContestProgressRewardInfo
```
public class ContestProgressRewardInfo extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = ContestProgressRewardInfo1
  public Integer progressIndex
  public Integer requiredPoints
  public List rewards

  // Constructors (2)
  com.perblue.rpg.network.messages.ContestProgressRewardInfo(a)
  com.perblue.rpg.network.messages.ContestProgressRewardInfo()

  // Methods (7)
  protected boolean innerReadFieldRewards(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ContestProgressRewards
```
public class ContestProgressRewards extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ContestProgressRewards1
  public Integer progressGroupID
  public List rewardInfo

  // Constructors (2)
  com.perblue.rpg.network.messages.ContestProgressRewards(a)
  com.perblue.rpg.network.messages.ContestProgressRewards()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldRewardInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ContestRankRewardInfo
```
public class ContestRankRewardInfo extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = ContestRankRewardInfo1
  public String maxRank
  public Integer rankIndex
  public List rewards

  // Constructors (2)
  com.perblue.rpg.network.messages.ContestRankRewardInfo(a)
  com.perblue.rpg.network.messages.ContestRankRewardInfo()

  // Methods (7)
  protected boolean innerReadFieldRewards(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ContestRankRewards
```
public class ContestRankRewards extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ContestRankRewards1
  public Integer rankGroupID
  public List rewardInfo

  // Constructors (2)
  com.perblue.rpg.network.messages.ContestRankRewards(a)
  com.perblue.rpg.network.messages.ContestRankRewards()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldRewardInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ContestRankingRow
```
public class ContestRankingRow extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = ContestRankingRow1
  public Integer contestRankIndex
  public PlayerRow playerRow
  public Long points
  public Integer rank

  // Constructors (2)
  com.perblue.rpg.network.messages.ContestRankingRow(a)
  com.perblue.rpg.network.messages.ContestRankingRow()

  // Methods (9)
  protected boolean innerReadFieldPlayerRow(a)
  protected boolean innerReadFieldPlayerRow_Info(a)
  protected boolean innerReadFieldPlayerRow_GuildInfo(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ContestRankings
```
public class ContestRankings extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = ContestRankings1
  public List guildMembers
  public List topPlayers
  public ContestRankingRow yourInfo

  // Constructors (2)
  com.perblue.rpg.network.messages.ContestRankings(a)
  com.perblue.rpg.network.messages.ContestRankings()

  // Methods (10)
  protected boolean innerReadFieldYourInfo(a)
  protected boolean innerReadFieldYourInfo_PlayerRow(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldTopPlayers(a)
  protected boolean innerReadFieldGuildMembers(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ContestRaw
```
public class ContestRaw extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = ContestRaw1
  public SpecialEventRaw eventInfo
  public ContestProgressRewards progressRewards
  public ContestRankRewards rankRewards
  public ContestTasks tasks

  // Constructors (2)
  com.perblue.rpg.network.messages.ContestRaw()
  com.perblue.rpg.network.messages.ContestRaw(a)

  // Methods (10)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldRankRewards(a)
  protected boolean innerReadFieldEventInfo(a)
  protected boolean innerReadFieldTasks(a)
  protected boolean innerReadFieldProgressRewards(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ContestTaskInfo
```
public class ContestTaskInfo extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = ContestTaskInfo1
  public Integer countNeeded
  public Integer maxTimes
  public Integer pointsEarned
  public String taskData
  public Integer taskIndex
  public ContestTaskType type

  // Constructors (2)
  com.perblue.rpg.network.messages.ContestTaskInfo(a)
  com.perblue.rpg.network.messages.ContestTaskInfo()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ContestTaskType
```
public final enum ContestTaskType extends java.lang.Enum

  // Fields (56)
  private static final ContestTaskType[] $VALUES
  public static final ContestTaskType BATTLE_HEROES_LEFT
  public static final ContestTaskType BATTLE_POWER_DEFEATED
  public static final ContestTaskType BATTLE_POWER_DEFEATED_ABOVE_OWN
  public static final ContestTaskType BATTLE_WON
  public static final ContestTaskType COLISEUM_BATTLES_WON
  public static final ContestTaskType COLISEUM_HEROES_LEFT
  public static final ContestTaskType COLISEUM_POWER_DEFEATED
  public static final ContestTaskType COLISEUM_POWER_DEFEATED_ABOVE_OWN
  public static final ContestTaskType DEFAULT
  public static final ContestTaskType ENCHANTING_STARS_EARNED
  public static final ContestTaskType EXPEDITION_3_BATTLE_WON
  public static final ContestTaskType EXPEDITION_3_FINISHED
  public static final ContestTaskType EXPEDITION_3_HEROES_LEFT
  public static final ContestTaskType EXPEDITION_3_POWER_DEFEATED
  public static final ContestTaskType EXPEDITION_4_BATTLE_WON
  public static final ContestTaskType EXPEDITION_4_FINISHED
  public static final ContestTaskType EXPEDITION_4_HEROES_LEFT
  public static final ContestTaskType EXPEDITION_4_POWER_DEFEATED
  public static final ContestTaskType EXPEDITION_HARD_BATTLE_WON
  public static final ContestTaskType EXPEDITION_HARD_FINISHED
  public static final ContestTaskType EXPEDITION_HARD_HEROES_LEFT
  public static final ContestTaskType EXPEDITION_HARD_POWER_DEFEATED
  public static final ContestTaskType EXPEDITION_NORM_BATTLE_WON
  public static final ContestTaskType EXPEDITION_NORM_FINISHED
  public static final ContestTaskType EXPEDITION_NORM_HEROES_LEFT
  public static final ContestTaskType EXPEDITION_NORM_POWER_DEFEATED
  public static final ContestTaskType FIGHT_PIT_BATTLES_WON
  public static final ContestTaskType FIGHT_PIT_HEROES_LEFT
  public static final ContestTaskType FIGHT_PIT_POWER_DEFEATED
  public static final ContestTaskType FIGHT_PIT_POWER_DEFEATED_ABOVE_OWN
  public static final ContestTaskType HERO_EVOLVED
  public static final ContestTaskType HERO_LEVELS_GAINED
  public static final ContestTaskType HERO_PROMOTED
  public static final ContestTaskType HERO_SKILLS_LEVELED
  public static final ContestTaskType ITEM_BURN
  public static final ContestTaskType ITEM_CRAFTED
  public static final ContestTaskType ITEM_EARN_FULL_ITEM
  public static final ContestTaskType ITEM_EARN_SHARD
  public static final ContestTaskType ITEM_GEAR_ENCHANTED
  public static final ContestTaskType ITEM_GEAR_EQUIP
  public static final ContestTaskType RARITY_CRAFTED
  public static final ContestTaskType RARITY_EARN_FULL_ITEM
  public static final ContestTaskType RARITY_EARN_SHARD
  public static final ContestTaskType RARITY_GEAR_ENCHANTED
  public static final ContestTaskType RARITY_GEAR_EQUIP
  public static final ContestTaskType RESOURCE_BURN
  public static final ContestTaskType RESOURCE_EARN
  public static final ContestTaskType WAR_ALL_BATTLES_DONE
  public static final ContestTaskType WAR_BATTLES_DONE
  public static final ContestTaskType WAR_BATTLES_WON
  public static final ContestTaskType WAR_GUILD_BATTLES_WON
  public static final ContestTaskType WAR_HEROES_LEFT
  public static final ContestTaskType WAR_POWER_DEFEATED
  public static final ContestTaskType WAR_POWER_DEFEATED_ABOVE_OWN
  private static ContestTaskType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.ContestTaskType(String, int)

  // Methods (3)
  public static ContestTaskType[] valuesCached()
  public static ContestTaskType[] values()
  public static ContestTaskType valueOf(String)
```

## com.perblue.rpg.network.messages.ContestTasks
```
public class ContestTasks extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ContestTasks1
  public Integer taskGroupID
  public List tasks

  // Constructors (2)
  com.perblue.rpg.network.messages.ContestTasks(a)
  com.perblue.rpg.network.messages.ContestTasks()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldTasks(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ContestsUpdate
```
public class ContestsUpdate extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = ContestsUpdate1
  public List contests

  // Constructors (2)
  com.perblue.rpg.network.messages.ContestsUpdate(a)
  com.perblue.rpg.network.messages.ContestsUpdate()

  // Methods (7)
  protected boolean innerReadFieldContests(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CooldownType
```
public final enum CooldownType extends java.lang.Enum

  // Fields (11)
  private static final CooldownType[] $VALUES
  public static final CooldownType CHALLENGES_DRAGON_ATTACK
  public static final CooldownType CHALLENGES_MAGIC_ATTACK
  public static final CooldownType CHALLENGES_PHYSICAL_ATTACK
  public static final CooldownType COLISEUM_ATTACK
  public static final CooldownType DEFAULT
  public static final CooldownType FIGHT_PIT_ATTACK
  public static final CooldownType THE_CAVES_ATTACK
  public static final CooldownType THE_SUMMIT_ATTACK
  public static final CooldownType WAR_OPT_OUT
  private static CooldownType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.CooldownType(String, int)

  // Methods (3)
  public static CooldownType[] valuesCached()
  public static CooldownType[] values()
  public static CooldownType valueOf(String)
```

## com.perblue.rpg.network.messages.CraftItem
```
public class CraftItem extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = CraftItem1
  public Integer amount
  public ItemType itemType

  // Constructors (2)
  com.perblue.rpg.network.messages.CraftItem(a)
  com.perblue.rpg.network.messages.CraftItem()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CreateGuild
```
public class CreateGuild extends com.perblue.a.a.i

  // Fields (8)
  private static final String FULL_NAME = CreateGuild1
  public String country
  public GuildEmblemType emblem
  public Integer minLevel
  public String motto
  public String name
  public GuildNewMemberPolicy newMemberPolicy
  public String timeZone

  // Constructors (2)
  com.perblue.rpg.network.messages.CreateGuild(a)
  com.perblue.rpg.network.messages.CreateGuild()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CryptAttackResult
```
public final enum CryptAttackResult extends java.lang.Enum

  // Fields (5)
  private static final CryptAttackResult[] $VALUES
  public static final CryptAttackResult FAILED
  public static final CryptAttackResult GOLD
  public static final CryptAttackResult WHITE
  private static CryptAttackResult[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.CryptAttackResult(String, int)

  // Methods (3)
  public static CryptAttackResult[] valuesCached()
  public static CryptAttackResult[] values()
  public static CryptAttackResult valueOf(String)
```

## com.perblue.rpg.network.messages.CryptLogData
```
public class CryptLogData extends com.perblue.a.a.i

  // Fields (8)
  private static final String FULL_NAME = CryptLogData1
  public Integer attackNum
  public List attackers
  public List defenders
  public Integer powerDefeated
  public CryptAttackResult result
  public Long time
  public Long userID

  // Constructors (2)
  com.perblue.rpg.network.messages.CryptLogData(a)
  com.perblue.rpg.network.messages.CryptLogData()

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldAttackers(a)
  protected boolean innerReadFieldDefenders(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CryptLogExtra
```
public class CryptLogExtra extends com.perblue.a.a.i

  // Fields (10)
  private static final String FULL_NAME = CryptLogExtra1
  public Integer attackNum
  public List attackers
  public List defenderHealth
  public Integer defenderIndex
  public Integer lineupIndex
  public Integer memberIndex
  public Integer powerDefeated
  public CryptAttackResult result
  public Long time

  // Constructors (2)
  com.perblue.rpg.network.messages.CryptLogExtra()
  com.perblue.rpg.network.messages.CryptLogExtra(a)

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldDefenderHealth(a)
  protected boolean innerReadFieldAttackers(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CryptRaidAttack
```
public class CryptRaidAttack extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = CryptRaidAttack1
  public HeroLineup attackerHeroes
  public AttackBase base
  public List defenderHeroes
  public Integer rank
  public Integer stage

  // Constructors (2)
  com.perblue.rpg.network.messages.CryptRaidAttack()
  com.perblue.rpg.network.messages.CryptRaidAttack(a)

  // Methods (9)
  protected boolean innerReadFieldBase(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldAttackerHeroes(a)
  protected boolean innerReadFieldDefenderHeroes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CryptRaidData
```
public class CryptRaidData extends com.perblue.a.a.i

  // Fields (20)
  private static final String FULL_NAME = CryptRaidData1
  public CryptRaidScoringInfo cryptRaidScoringInfo
  public Integer currentScore
  public Integer difficulty
  public Integer goldSkullPoints
  public List log
  public Integer maxScore
  public List members
  public Long nextRaidStartTime
  public List opponents
  public Integer perMemberAttackLimit
  public Long raidEndTime
  public Long raidStartTime
  public Boolean youAreInRaid
  public Integer yourAttackCount
  public Integer yourGoldSkulls
  public Integer yourHeroesLeft
  public Integer yourScore
  public Integer yourTotalHeroes
  public Integer yourWhiteSkulls

  // Constructors (2)
  com.perblue.rpg.network.messages.CryptRaidData(a)
  com.perblue.rpg.network.messages.CryptRaidData()

  // Methods (10)
  protected boolean innerReadFieldOpponents(a)
  protected boolean innerReadFieldMembers(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldCryptRaidScoringInfo(a)
  protected boolean innerReadFieldLog(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CryptRaidExtra
```
public class CryptRaidExtra extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = CryptRaidExtra1
  public Integer difficulty
  public Boolean ended
  public List log
  public List members
  public List opponents
  public Date startTime

  // Constructors (2)
  com.perblue.rpg.network.messages.CryptRaidExtra(a)
  com.perblue.rpg.network.messages.CryptRaidExtra()

  // Methods (9)
  protected boolean innerReadFieldOpponents(a)
  protected boolean innerReadFieldMembers(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldLog(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CryptRaidHeroesUpdate
```
public class CryptRaidHeroesUpdate extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = CryptRaidHeroesUpdate1
  public Boolean clearMercenary

  // Constructors (2)
  com.perblue.rpg.network.messages.CryptRaidHeroesUpdate(a)
  com.perblue.rpg.network.messages.CryptRaidHeroesUpdate()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CryptRaidMemberData
```
public class CryptRaidMemberData extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = CryptRaidMemberData1
  public Integer attacksDone
  public Integer enemyPowerDefeated
  public Integer goldSkulls
  public Boolean leftGuild
  public Long userID
  public Integer whiteSkulls

  // Constructors (2)
  com.perblue.rpg.network.messages.CryptRaidMemberData(a)
  com.perblue.rpg.network.messages.CryptRaidMemberData()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CryptRaidMemberSummary
```
public class CryptRaidMemberSummary extends com.perblue.a.a.i

  // Fields (10)
  private static final String FULL_NAME = CryptRaidMemberSummary1
  public Integer attacksDone
  public Integer enemyPowerDefeated
  public Integer goldSkulls
  public Integer heroesLeft
  public Integer powerLeft
  public Integer score
  public Integer totalHeroes
  public BasicUserInfo user
  public Integer whiteSkulls

  // Constructors (2)
  com.perblue.rpg.network.messages.CryptRaidMemberSummary()
  com.perblue.rpg.network.messages.CryptRaidMemberSummary(a)

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldUser_Avatar(a)
  protected boolean innerReadFieldUser(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CryptRaidOpponentData
```
public class CryptRaidOpponentData extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = CryptRaidOpponentData1
  public List lineups
  public Integer rank
  public Integer skullCount

  // Constructors (2)
  com.perblue.rpg.network.messages.CryptRaidOpponentData(a)
  com.perblue.rpg.network.messages.CryptRaidOpponentData()

  // Methods (7)
  protected boolean innerReadFieldLineups(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CryptRaidOpponentSummary
```
public class CryptRaidOpponentSummary extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = CryptRaidOpponentSummary1
  public Boolean attackInProgress
  public List lineups
  public Integer rank
  public Integer skullCount

  // Constructors (2)
  com.perblue.rpg.network.messages.CryptRaidOpponentSummary(a)
  com.perblue.rpg.network.messages.CryptRaidOpponentSummary()

  // Methods (7)
  protected boolean innerReadFieldLineups(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CryptRaidScoringInfo
```
public class CryptRaidScoringInfo extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = CryptRaidScoringInfo1
  public List bulletPoints
  public Integer completionSkulls

  // Constructors (2)
  com.perblue.rpg.network.messages.CryptRaidScoringInfo(a)
  com.perblue.rpg.network.messages.CryptRaidScoringInfo()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldBulletPoints(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CryptRaidStartTimeUpdate
```
public class CryptRaidStartTimeUpdate extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = CryptRaidStartTimeUpdate1
  public Long newNextRaidStart

  // Constructors (2)
  com.perblue.rpg.network.messages.CryptRaidStartTimeUpdate(a)
  com.perblue.rpg.network.messages.CryptRaidStartTimeUpdate()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.CryptRaidUpdate
```
public class CryptRaidUpdate extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = CryptRaidUpdate1
  public CryptLogData logEntry
  public CryptRaidMemberSummary member
  public CryptRaidOpponentSummary opponent
  public Integer scoreDelta

  // Constructors (2)
  com.perblue.rpg.network.messages.CryptRaidUpdate(a)
  com.perblue.rpg.network.messages.CryptRaidUpdate()

  // Methods (10)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldOpponent(a)
  protected boolean innerReadFieldMember(a)
  protected boolean innerReadFieldLogEntry(a)
  protected boolean innerReadFieldMember_User(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.DailySignInClaimableStatus
```
public final enum DailySignInClaimableStatus extends java.lang.Enum

  // Fields (10)
  private static final DailySignInClaimableStatus[] $VALUES
  public static final DailySignInClaimableStatus BOTH_CLAIMABLE
  public static final DailySignInClaimableStatus NORMAL_CLAIMABLE
  public static final DailySignInClaimableStatus UNCLAIMABLE_ALREADY_CLAIMED
  public static final DailySignInClaimableStatus UNCLAIMABLE_ALREADY_VIP_CLAIMED
  public static final DailySignInClaimableStatus UNCLAIMABLE_EXTRA_VIP_CLAIMED
  public static final DailySignInClaimableStatus UNCLAIMABLE_REQUIRES_VIP
  public static final DailySignInClaimableStatus UNCLAIMABLE_TODAY
  public static final DailySignInClaimableStatus VIP_CLAIMABLE
  private static DailySignInClaimableStatus[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.DailySignInClaimableStatus(String, int)

  // Methods (3)
  public static DailySignInClaimableStatus[] valuesCached()
  public static DailySignInClaimableStatus[] values()
  public static DailySignInClaimableStatus valueOf(String)
```

## com.perblue.rpg.network.messages.DamageInfo
```
public class DamageInfo extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = DamageInfo1
  public Float amountHealed
  public Float damageTaken
  public Map legendaryData
  public Map subTypeDamage

  // Constructors (2)
  com.perblue.rpg.network.messages.DamageInfo()
  com.perblue.rpg.network.messages.DamageInfo(a)

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldSubTypeDamage(a)
  protected boolean innerReadFieldLegendaryData(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.DebugEditHeroes
```
public class DebugEditHeroes extends com.perblue.a.a.i

  // Fields (12)
  private static final String FULL_NAME = DebugEditHeroes1
  public Boolean giveAllHeroes
  public Boolean legendary
  public Integer level
  public Boolean maxEnchant
  public Boolean maxGear
  public Boolean maxSkills
  public Boolean randomRunes
  public Rarity rarity
  public Boolean removeAllHeroes
  public UnitType selectedUnitType
  public Integer stars

  // Constructors (2)
  com.perblue.rpg.network.messages.DebugEditHeroes(a)
  com.perblue.rpg.network.messages.DebugEditHeroes()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.DebugGiveRune
```
public class DebugGiveRune extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = DebugGiveRune1
  public RuneData rune

  // Constructors (2)
  com.perblue.rpg.network.messages.DebugGiveRune(a)
  com.perblue.rpg.network.messages.DebugGiveRune()

  // Methods (7)
  protected boolean innerReadFieldRune(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.DefenderData
```
public class DefenderData extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = DefenderData1
  public List lineup
  public BasicUserInfo user

  // Constructors (2)
  com.perblue.rpg.network.messages.DefenderData(a)
  com.perblue.rpg.network.messages.DefenderData()

  // Methods (9)
  protected boolean innerReadFieldLineup(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldUser_Avatar(a)
  protected boolean innerReadFieldUser(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.DemoteFromOfficer
```
public class DemoteFromOfficer extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = DemoteFromOfficer1
  public GuildRole currentClientRole
  public Long userToDemote

  // Constructors (2)
  com.perblue.rpg.network.messages.DemoteFromOfficer(a)
  com.perblue.rpg.network.messages.DemoteFromOfficer()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.DifficultyModeAttack
```
public class DifficultyModeAttack extends com.perblue.a.a.i

  // Fields (8)
  private static final String FULL_NAME = DifficultyModeAttack1
  public Long attackEndTime
  public AttackBase base
  public GameMode gameMode
  public List heroes
  public List lootEarned
  public Integer modeDifficulty
  public Integer stagesCleared

  // Constructors (2)
  com.perblue.rpg.network.messages.DifficultyModeAttack(a)
  com.perblue.rpg.network.messages.DifficultyModeAttack()

  // Methods (9)
  protected boolean innerReadFieldHeroes(a)
  protected boolean innerReadFieldBase(a)
  protected boolean innerReadFieldLootEarned(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.DifficultyModeRaidResults
```
public class DifficultyModeRaidResults extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = DifficultyModeRaidResults1
  public GameMode gameMode
  public Integer modeDifficulty
  public List outcomes
  public Long raidTime

  // Constructors (2)
  com.perblue.rpg.network.messages.DifficultyModeRaidResults(a)
  com.perblue.rpg.network.messages.DifficultyModeRaidResults()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldOutcomes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.DiscourseAuthToken
```
public class DiscourseAuthToken extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = DiscourseAuthToken1
  public String authToken
  public String redirect

  // Constructors (2)
  com.perblue.rpg.network.messages.DiscourseAuthToken(a)
  com.perblue.rpg.network.messages.DiscourseAuthToken()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.DownloadTime
```
public class DownloadTime extends com.perblue.a.a.i

  // Fields (8)
  private static final String FULL_NAME = DownloadTime1
  public String connectionType
  public String content
  public Long contentSize
  public String deviceID
  public Long duration
  public String reason
  public Boolean successful

  // Constructors (2)
  com.perblue.rpg.network.messages.DownloadTime(a)
  com.perblue.rpg.network.messages.DownloadTime()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.EditGuild
```
public class EditGuild extends com.perblue.a.a.i

  // Fields (9)
  private static final String FULL_NAME = EditGuild1
  public String country
  public Integer cryptDifficulty
  public GuildEmblemType emblem
  public Long guildID
  public Integer minLevel
  public String motto
  public GuildNewMemberPolicy newMemberPolicy
  public String timeZone

  // Constructors (2)
  com.perblue.rpg.network.messages.EditGuild(a)
  com.perblue.rpg.network.messages.EditGuild()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.EditGuildCryptSettings
```
public class EditGuildCryptSettings extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = EditGuildCryptSettings1
  public Integer cryptDifficulty
  public Integer cryptMaxAttacks
  public Long guildID

  // Constructors (2)
  com.perblue.rpg.network.messages.EditGuildCryptSettings(a)
  com.perblue.rpg.network.messages.EditGuildCryptSettings()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.EnchantItem
```
public class EnchantItem extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = EnchantItem1
  public UnitType hero
  public Map itemsUsed
  public HeroEquipSlot slot
  public Boolean useDiamonds

  // Constructors (2)
  com.perblue.rpg.network.messages.EnchantItem(a)
  com.perblue.rpg.network.messages.EnchantItem()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldItemsUsed(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.EndInProgressGuildWarAttack
```
public class EndInProgressGuildWarAttack extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = EndInProgressGuildWarAttack1
  public Long defenderID

  // Constructors (2)
  com.perblue.rpg.network.messages.EndInProgressGuildWarAttack(a)
  com.perblue.rpg.network.messages.EndInProgressGuildWarAttack()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.EnvironmentType
```
public final enum EnvironmentType extends java.lang.Enum

  // Fields (182)
  private static final EnvironmentType[] $VALUES
  public static final EnvironmentType BOSSBATTLE3_COMBAT_1
  public static final EnvironmentType BOSSBATTLE3_COMBAT_2
  public static final EnvironmentType BOSSBATTLE3_COMBAT_3
  public static final EnvironmentType BOSSBATTLE4_COMBAT_1
  public static final EnvironmentType BOSSBATTLE4_COMBAT_2
  public static final EnvironmentType BOSSBATTLE4_COMBAT_3
  public static final EnvironmentType BOSSBATTLE5_COMBAT_1
  public static final EnvironmentType BOSSBATTLE5_COMBAT_2
  public static final EnvironmentType BOSSBATTLE5_COMBAT_3
  public static final EnvironmentType BOSSBATTLE6_COMBAT_1
  public static final EnvironmentType BOSSBATTLE6_COMBAT_2
  public static final EnvironmentType BOSSBATTLE6_COMBAT_3
  public static final EnvironmentType BOSSBATTLE_COMBAT_1
  public static final EnvironmentType BOSSBATTLE_COMBAT_2
  public static final EnvironmentType BOSSBATTLE_COMBAT_3
  public static final EnvironmentType BOSSPIT_BONEYARD
  public static final EnvironmentType BOSSPIT_FOREST_CLIFF
  public static final EnvironmentType CH10_COMBAT_1
  public static final EnvironmentType CH10_COMBAT_2
  public static final EnvironmentType CH10_COMBAT_3
  public static final EnvironmentType CH10_COMBAT_4
  public static final EnvironmentType CH10_COMBAT_SM
  public static final EnvironmentType CH11_COMBAT_1
  public static final EnvironmentType CH11_COMBAT_2
  public static final EnvironmentType CH11_COMBAT_3
  public static final EnvironmentType CH11_COMBAT_SM
  public static final EnvironmentType CH12_COMBAT_1
  public static final EnvironmentType CH12_COMBAT_2
  public static final EnvironmentType CH12_COMBAT_3
  public static final EnvironmentType CH12_COMBAT_4
  public static final EnvironmentType CH12_COMBAT_SM
  public static final EnvironmentType CH13_COMBAT_1
  public static final EnvironmentType CH13_COMBAT_2
  public static final EnvironmentType CH13_COMBAT_3
  public static final EnvironmentType CH13_COMBAT_4
  public static final EnvironmentType CH13_COMBAT_SM
  public static final EnvironmentType CH14_COMBAT_1
  public static final EnvironmentType CH14_COMBAT_2
  public static final EnvironmentType CH14_COMBAT_3
  public static final EnvironmentType CH14_COMBAT_4
  public static final EnvironmentType CH14_COMBAT_SM
  public static final EnvironmentType CH15_COMBAT_1
  public static final EnvironmentType CH15_COMBAT_2
  public static final EnvironmentType CH15_COMBAT_3
  public static final EnvironmentType CH15_COMBAT_4
  public static final EnvironmentType CH15_COMBAT_SM
  public static final EnvironmentType CH16_COMBAT_1
  public static final EnvironmentType CH16_COMBAT_2
  public static final EnvironmentType CH16_COMBAT_3
  public static final EnvironmentType CH16_COMBAT_4
  public static final EnvironmentType CH16_COMBAT_SM
  public static final EnvironmentType CH17_COMBAT_1
  public static final EnvironmentType CH17_COMBAT_2
  public static final EnvironmentType CH17_COMBAT_3
  public static final EnvironmentType CH17_COMBAT_4
  public static final EnvironmentType CH17_COMBAT_SM
  public static final EnvironmentType CH18_COMBAT_1
  public static final EnvironmentType CH18_COMBAT_2
  public static final EnvironmentType CH18_COMBAT_3
  public static final EnvironmentType CH18_COMBAT_4
  public static final EnvironmentType CH18_COMBAT_SM
  public static final EnvironmentType CH19_COMBAT_1
  public static final EnvironmentType CH19_COMBAT_2
  public static final EnvironmentType CH19_COMBAT_3
  public static final EnvironmentType CH19_COMBAT_4
  public static final EnvironmentType CH19_COMBAT_SM
  public static final EnvironmentType CH1_COMBAT_1
  public static final EnvironmentType CH1_COMBAT_2
  public static final EnvironmentType CH1_COMBAT_3
  public static final EnvironmentType CH1_COMBAT_4
  public static final EnvironmentType CH1_COMBAT_SM
  public static final EnvironmentType CH20_COMBAT_1
  public static final EnvironmentType CH20_COMBAT_2
  public static final EnvironmentType CH20_COMBAT_3
  public static final EnvironmentType CH20_COMBAT_4
  public static final EnvironmentType CH20_COMBAT_SM
  public static final EnvironmentType CH21_COMBAT_1
  public static final EnvironmentType CH21_COMBAT_2
  public static final EnvironmentType CH21_COMBAT_3
  public static final EnvironmentType CH21_COMBAT_4
  public static final EnvironmentType CH21_COMBAT_SM
  public static final EnvironmentType CH22_COMBAT_1
  public static final EnvironmentType CH22_COMBAT_2
  public static final EnvironmentType CH22_COMBAT_3
  public static final EnvironmentType CH22_COMBAT_4
  public static final EnvironmentType CH22_COMBAT_SM
  public static final EnvironmentType CH23_COMBAT_1
  public static final EnvironmentType CH23_COMBAT_2
  public static final EnvironmentType CH23_COMBAT_3
  public static final EnvironmentType CH23_COMBAT_4
  public static final EnvironmentType CH23_COMBAT_SM
  public static final EnvironmentType CH24_CAVERN
  public static final EnvironmentType CH24_HORIZON
  public static final EnvironmentType CH24_MYSTERIOUSFORTRESS
  public static final EnvironmentType CH24_RUINS
  public static final EnvironmentType CH24_TERRACE
  public static final EnvironmentType CH25_DUNGEON
  public static final EnvironmentType CH25_HALL
  public static final EnvironmentType CH25_RAMPARTWALL_A
  public static final EnvironmentType CH25_RAMPARTWALL_B
  public static final EnvironmentType CH25_STONE_BRIDGE
  public static final EnvironmentType CH25_TEMPLE_TOWER
  public static final EnvironmentType CH26_MASSIVE_ALTOR
  public static final EnvironmentType CH26_NIGHT_DESERT
  public static final EnvironmentType CH26_OASIS
  public static final EnvironmentType CH26_PALACE_IN_SAND
  public static final EnvironmentType CH26_SUNBAKED_DESERT
  public static final EnvironmentType CH27_ACOLIGHT_STATUTE
  public static final EnvironmentType CH27_ANCIENT_CITY
  public static final EnvironmentType CH27_DESTROYED_ANCIENT_CITY
  public static final EnvironmentType CH27_ENTRANCE_TO_ALTER_WORLD
  public static final EnvironmentType CH27_ROAD_ALONG_CLIFF
  public static final EnvironmentType CH27_ROAD_ALONG_CLIFF_REVERSED
  public static final EnvironmentType CH28_BURNING_WATCHTOWER
  public static final EnvironmentType CH28_DEATH_FIGHT_UMLAUT_THE_FIFTH
  public static final EnvironmentType CH28_FLAME_BATTERY
  public static final EnvironmentType CH28_ITS_NOW_OR_NEVER
  public static final EnvironmentType CH28_SIGNS_OF_DECISIVE_BATTLE
  public static final EnvironmentType CH28_TRACES_OF_PLUNDER
  public static final EnvironmentType CH29_1_FOREST_WATERFALL
  public static final EnvironmentType CH29_2_FOREST_FLOWERT
  public static final EnvironmentType CH29_3_FOREST_NIGHT
  public static final EnvironmentType CH29_4_FOREST_RUINS
  public static final EnvironmentType CH29_5_FOREST_REMAINS
  public static final EnvironmentType CH2_COMBAT_1
  public static final EnvironmentType CH2_COMBAT_2
  public static final EnvironmentType CH2_COMBAT_3
  public static final EnvironmentType CH2_COMBAT_4
  public static final EnvironmentType CH2_COMBAT_SM
  public static final EnvironmentType CH3_COMBAT_1
  public static final EnvironmentType CH3_COMBAT_2
  public static final EnvironmentType CH3_COMBAT_3
  public static final EnvironmentType CH3_COMBAT_4
  public static final EnvironmentType CH3_COMBAT_SM
  public static final EnvironmentType CH4_COMBAT_1
  public static final EnvironmentType CH4_COMBAT_2
  public static final EnvironmentType CH4_COMBAT_3
  public static final EnvironmentType CH4_COMBAT_4
  public static final EnvironmentType CH4_COMBAT_SM
  public static final EnvironmentType CH6_COMBAT_1
  public static final EnvironmentType CH6_COMBAT_2
  public static final EnvironmentType CH6_COMBAT_3
  public static final EnvironmentType CH6_COMBAT_4
  public static final EnvironmentType CH6_COMBAT_SM
  public static final EnvironmentType CH7_COMBAT_1
  public static final EnvironmentType CH7_COMBAT_2
  public static final EnvironmentType CH7_COMBAT_3
  public static final EnvironmentType CH7_COMBAT_4
  public static final EnvironmentType CH7_COMBAT_SM
  public static final EnvironmentType CH8_COMBAT_2
  public static final EnvironmentType CH8_COMBAT_3
  public static final EnvironmentType CH8_COMBAT_4
  public static final EnvironmentType CH8_COMBAT_SM
  public static final EnvironmentType CH9_COMBAT_1
  public static final EnvironmentType CH9_COMBAT_SM
  public static final EnvironmentType CHALLENGES_DRAGON
  public static final EnvironmentType CHALLENGES_MAGIC_IMMUNE
  public static final EnvironmentType CHALLENGES_PHYS_IMMUNE
  public static final EnvironmentType CRYPT
  public static final EnvironmentType DEFAULT
  public static final EnvironmentType EXP1_1
  public static final EnvironmentType EXP1_2
  public static final EnvironmentType EXP1_3
  public static final EnvironmentType EXP2_1
  public static final EnvironmentType EXP2_2
  public static final EnvironmentType EXP2_3
  public static final EnvironmentType EXP3_1
  public static final EnvironmentType EXP3_2
  public static final EnvironmentType EXP3_3
  public static final EnvironmentType EXP4_1
  public static final EnvironmentType EXP4_2
  public static final EnvironmentType EXP4_3
  public static final EnvironmentType EXP5_1
  public static final EnvironmentType EXP5_2
  public static final EnvironmentType EXP5_3
  public static final EnvironmentType MYSTIC_CLOSET
  public static final EnvironmentType RUNES
  public static final EnvironmentType RUNE_SHRINE
  public static final EnvironmentType THE_MOUNTAIN_CAVES
  public static final EnvironmentType THE_MOUNTAIN_SUMMIT
  private static EnvironmentType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.EnvironmentType(String, int)

  // Methods (3)
  public static EnvironmentType[] valuesCached()
  public static EnvironmentType[] values()
  public static EnvironmentType valueOf(String)
```

## com.perblue.rpg.network.messages.EquippedItemData
```
public class EquippedItemData extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = EquippedItemData1
  public Integer enchantMaterialPoints
  public Integer stars
  public Integer totalPoints
  public ItemType type

  // Constructors (2)
  com.perblue.rpg.network.messages.EquippedItemData(a)
  com.perblue.rpg.network.messages.EquippedItemData()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ErrorReport
```
public class ErrorReport extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = ErrorReport1
  public String deviceID
  public Date errorTime
  public Platform platform
  public Map reportData

  // Constructors (2)
  com.perblue.rpg.network.messages.ErrorReport(a)
  com.perblue.rpg.network.messages.ErrorReport()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldReportData(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ErrorResponse
```
public class ErrorResponse extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = ErrorResponse1
  public String errorMessage
  public ErrorType errorType
  public Boolean forceShowMessage

  // Constructors (2)
  com.perblue.rpg.network.messages.ErrorResponse(a)
  com.perblue.rpg.network.messages.ErrorResponse()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ErrorType
```
public final enum ErrorType extends java.lang.Enum

  // Fields (6)
  private static final ErrorType[] $VALUES
  public static final ErrorType DEFAULT
  public static final ErrorType DISCONNECT
  public static final ErrorType RETRY
  public static final ErrorType STICKY
  private static ErrorType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.ErrorType(String, int)

  // Methods (3)
  public static ErrorType[] valuesCached()
  public static ErrorType[] values()
  public static ErrorType valueOf(String)
```

## com.perblue.rpg.network.messages.ExistingUserInfos
```
public class ExistingUserInfos extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = ExistingUserInfos1
  public Boolean foundAtBoot
  public Boolean newAccountIsFree
  public Integer uniqueUsers
  public List userInfo
  public Boolean userInitiated

  // Constructors (2)
  com.perblue.rpg.network.messages.ExistingUserInfos(a)
  com.perblue.rpg.network.messages.ExistingUserInfos()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldUserInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ExpeditionAttack
```
public class ExpeditionAttack extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = ExpeditionAttack1
  public Boolean acceptBattle
  public List attackerHeroes
  public AttackBase base
  public List defenderHeroes
  public Integer nodeIndex

  // Constructors (2)
  com.perblue.rpg.network.messages.ExpeditionAttack()
  com.perblue.rpg.network.messages.ExpeditionAttack(a)

  // Methods (9)
  protected boolean innerReadFieldBase(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldAttackerHeroes(a)
  protected boolean innerReadFieldDefenderHeroes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ExpeditionRunData
```
public class ExpeditionRunData extends com.perblue.a.a.i

  // Fields (8)
  private static final String FULL_NAME = ExpeditionRunData1
  public Integer chestsOpened
  public List defenders
  public Boolean deprecatedHardMode
  public Integer difficulty
  public List nodeRewards
  public Integer nodesDefeated
  public Integer totalGoldEarned

  // Constructors (2)
  com.perblue.rpg.network.messages.ExpeditionRunData(a)
  com.perblue.rpg.network.messages.ExpeditionRunData()

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldDefenders(a)
  protected boolean innerReadFieldNodeRewards(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ExtendedGuildInfo
```
public class ExtendedGuildInfo extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ExtendedGuildInfo1
  public GuildInfo guildInfo
  public List members

  // Constructors (2)
  com.perblue.rpg.network.messages.ExtendedGuildInfo(a)
  com.perblue.rpg.network.messages.ExtendedGuildInfo()

  // Methods (9)
  protected boolean innerReadFieldMembers(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldGuildInfo(a)
  protected boolean innerReadFieldGuildInfo_BasicInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ExtendedHeroSummary
```
public class ExtendedHeroSummary extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = ExtendedHeroSummary1
  public Integer energy
  public Integer health
  public HeroSummary summary

  // Constructors (2)
  com.perblue.rpg.network.messages.ExtendedHeroSummary(a)
  com.perblue.rpg.network.messages.ExtendedHeroSummary()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldSummary(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.FacebookUserInfo
```
public class FacebookUserInfo extends com.perblue.a.a.i

  // Fields (12)
  private static final String FULL_NAME = FacebookUserInfo1
  public String facebookID
  public String firstName
  public String gender
  public String hometown
  public String lastName
  public String locale
  public String location
  public Integer maxAge
  public Integer minAge
  public Integer timezone
  public Long userID

  // Constructors (2)
  com.perblue.rpg.network.messages.FacebookUserInfo(a)
  com.perblue.rpg.network.messages.FacebookUserInfo()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.Friend
```
public class Friend extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = Friend1
  public Long friendID
  public BasicUserInfo otherUserInfo
  public String requestMessage
  public FriendStatus status
  public Long userID1
  public Long userID2

  // Constructors (2)
  com.perblue.rpg.network.messages.Friend(a)
  com.perblue.rpg.network.messages.Friend()

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldOtherUserInfo(a)
  protected boolean innerReadFieldOtherUserInfo_Avatar(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.FriendExtra
```
public class FriendExtra extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = FriendExtra1

  // Constructors (2)
  com.perblue.rpg.network.messages.FriendExtra(a)
  com.perblue.rpg.network.messages.FriendExtra()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.FriendStatus
```
public final enum FriendStatus extends java.lang.Enum

  // Fields (6)
  private static final FriendStatus[] $VALUES
  public static final FriendStatus APPROVED
  public static final FriendStatus NOT_FRIENDS
  public static final FriendStatus PENDING_1
  public static final FriendStatus PENDING_2
  private static FriendStatus[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.FriendStatus(String, int)

  // Methods (3)
  public static FriendStatus[] valuesCached()
  public static FriendStatus[] values()
  public static FriendStatus valueOf(String)
```

## com.perblue.rpg.network.messages.FriendUpdate
```
public class FriendUpdate extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = FriendUpdate1
  public Friend friend

  // Constructors (2)
  com.perblue.rpg.network.messages.FriendUpdate(a)
  com.perblue.rpg.network.messages.FriendUpdate()

  // Methods (8)
  protected boolean innerReadFieldFriend(a)
  protected boolean innerReadFieldFriend_OtherUserInfo(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.FullWarLineupData
```
public class FullWarLineupData extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = FullWarLineupData1
  public Boolean defeated
  public String defeatedBy
  public Integer points
  public List stage1
  public List stage2

  // Constructors (2)
  com.perblue.rpg.network.messages.FullWarLineupData(a)
  com.perblue.rpg.network.messages.FullWarLineupData()

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldStage2(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  protected boolean innerReadFieldStage1(a)
  public String toString()
```

## com.perblue.rpg.network.messages.FuseRunes
```
public class FuseRunes extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = FuseRunes1
  public UnitType hero
  public Long runeID
  public List sacrificedRuneIDs

  // Constructors (2)
  com.perblue.rpg.network.messages.FuseRunes(a)
  com.perblue.rpg.network.messages.FuseRunes()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldSacrificedRuneIDs(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GameCenterUserInfo
```
public class GameCenterUserInfo extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = GameCenterUserInfo1
  public String displayName
  public String gameCenterID
  public Integer maxAge
  public Long userID

  // Constructors (2)
  com.perblue.rpg.network.messages.GameCenterUserInfo(a)
  com.perblue.rpg.network.messages.GameCenterUserInfo()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GameCircleUserInfo
```
public class GameCircleUserInfo extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = GameCircleUserInfo1
  public String displayName
  public String gameCircleID
  public Long userID

  // Constructors (2)
  com.perblue.rpg.network.messages.GameCircleUserInfo(a)
  com.perblue.rpg.network.messages.GameCircleUserInfo()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GameMode
```
public final enum GameMode extends java.lang.Enum

  // Fields (23)
  private static final GameMode[] $VALUES
  public static final GameMode BOSS_BATTLE
  public static final GameMode BOSS_PIT
  public static final GameMode CAMPAIGN
  public static final GameMode CHALLENGES_MAGIC_IMMUNE
  public static final GameMode CHALLENGES_ONLY_DRAGONS
  public static final GameMode CHALLENGES_PHYSICAL_IMMUNE
  public static final GameMode COLISEUM
  public static final GameMode CRAFT
  public static final GameMode CRYPT
  public static final GameMode ELITE_CAMPAIGN
  public static final GameMode ENCHANTING
  public static final GameMode EXPEDITION
  public static final GameMode EXPERT_CAMPAIGN
  public static final GameMode FIGHT_PIT
  public static final GameMode GUILD_WAR
  public static final GameMode GUILD_WAR_REGISTRATION
  public static final GameMode RUNES
  public static final GameMode THE_MOUNTAIN_CAVES
  public static final GameMode THE_MOUNTAIN_SUMMIT
  public static final GameMode TITAN_TEMPLE
  public static final GameMode XP_BONUS_TEAM
  private static GameMode[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.GameMode(String, int)

  // Methods (3)
  public static GameMode[] valuesCached()
  public static GameMode[] values()
  public static GameMode valueOf(String)
```

## com.perblue.rpg.network.messages.GenerateDiscourseAuthToken
```
public class GenerateDiscourseAuthToken extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = GenerateDiscourseAuthToken1
  public String redirect

  // Constructors (2)
  com.perblue.rpg.network.messages.GenerateDiscourseAuthToken(a)
  com.perblue.rpg.network.messages.GenerateDiscourseAuthToken()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GetArenaInfo
```
public class GetArenaInfo extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = GetArenaInfo1
  public ArenaType type

  // Constructors (2)
  com.perblue.rpg.network.messages.GetArenaInfo(a)
  com.perblue.rpg.network.messages.GetArenaInfo()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GetBlockedList
```
public class GetBlockedList extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = GetBlockedList1

  // Constructors (2)
  com.perblue.rpg.network.messages.GetBlockedList(a)
  com.perblue.rpg.network.messages.GetBlockedList()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GetBossBattles
```
public class GetBossBattles extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = GetBossBattles1

  // Constructors (2)
  com.perblue.rpg.network.messages.GetBossBattles(a)
  com.perblue.rpg.network.messages.GetBossBattles()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GetCryptRaid
```
public class GetCryptRaid extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = GetCryptRaid1

  // Constructors (2)
  com.perblue.rpg.network.messages.GetCryptRaid(a)
  com.perblue.rpg.network.messages.GetCryptRaid()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GetExistingUsers
```
public class GetExistingUsers extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = GetExistingUsers1
  public List emails
  public PrivateUserInfo privateLoginInfo

  // Constructors (2)
  com.perblue.rpg.network.messages.GetExistingUsers(a)
  com.perblue.rpg.network.messages.GetExistingUsers()

  // Methods (8)
  protected boolean innerReadFieldEmails(a)
  protected boolean innerReadFieldPrivateLoginInfo(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GetExpedition
```
public class GetExpedition extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = GetExpedition1

  // Constructors (2)
  com.perblue.rpg.network.messages.GetExpedition(a)
  com.perblue.rpg.network.messages.GetExpedition()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GetExpeditionResponse
```
public class GetExpeditionResponse extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = GetExpeditionResponse1
  public ExpeditionRunData currentExpedition
  public Long expeditionID
  public Long expeditionWarWeek
  public Long expeditionWarWeekEnd

  // Constructors (2)
  com.perblue.rpg.network.messages.GetExpeditionResponse(a)
  com.perblue.rpg.network.messages.GetExpeditionResponse()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldCurrentExpedition(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GetHeroWall
```
public class GetHeroWall extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = GetHeroWall1
  public UnitType heroType

  // Constructors (2)
  com.perblue.rpg.network.messages.GetHeroWall(a)
  com.perblue.rpg.network.messages.GetHeroWall()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GetServers
```
public class GetServers extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = GetServers1
  public List emails
  public PrivateUserInfo privateLoginInfo

  // Constructors (2)
  com.perblue.rpg.network.messages.GetServers(a)
  com.perblue.rpg.network.messages.GetServers()

  // Methods (8)
  protected boolean innerReadFieldEmails(a)
  protected boolean innerReadFieldPrivateLoginInfo(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GetTitanTempleData
```
public class GetTitanTempleData extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = GetTitanTempleData1
  public Long templeID

  // Constructors (2)
  com.perblue.rpg.network.messages.GetTitanTempleData(a)
  com.perblue.rpg.network.messages.GetTitanTempleData()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GetUserSaveData
```
public class GetUserSaveData extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = GetUserSaveData1
  public Long userID

  // Constructors (2)
  com.perblue.rpg.network.messages.GetUserSaveData(a)
  com.perblue.rpg.network.messages.GetUserSaveData()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GlobalMailMessagePerUserData
```
public class GlobalMailMessagePerUserData extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = GlobalMailMessagePerUserData1
  public Boolean attachmentsClaimed
  public Boolean opened

  // Constructors (2)
  com.perblue.rpg.network.messages.GlobalMailMessagePerUserData(a)
  com.perblue.rpg.network.messages.GlobalMailMessagePerUserData()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GooglePlusUserInfo
```
public class GooglePlusUserInfo extends com.perblue.a.a.i

  // Fields (14)
  private static final String FULL_NAME = GooglePlusUserInfo1
  public String birthday
  public String displayName
  public String firstName
  public String gender
  public String googlePlusID
  public String hometown
  public String lastName
  public String locale
  public String location
  public Integer maxAge
  public Integer minAge
  public String nickname
  public Long userID

  // Constructors (2)
  com.perblue.rpg.network.messages.GooglePlusUserInfo(a)
  com.perblue.rpg.network.messages.GooglePlusUserInfo()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildBattleEnded
```
public class GuildBattleEnded extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = GuildBattleEnded1
  public Boolean moreBattlesAvailable
  public WarBattleResult result
  public Long warEndTime
  public Boolean warEnded

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildBattleEnded(a)
  com.perblue.rpg.network.messages.GuildBattleEnded()

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldResult(a)
  protected boolean innerReadFieldResult_OpponentInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildBattleStarted
```
public class GuildBattleStarted extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = GuildBattleStarted1

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildBattleStarted(a)
  com.perblue.rpg.network.messages.GuildBattleStarted()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildChatExtra
```
public class GuildChatExtra extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = GuildChatExtra1
  public ChatExtra chatData
  public Lineup heroes
  public Boolean mOTD
  public Boolean sticky

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildChatExtra(a)
  com.perblue.rpg.network.messages.GuildChatExtra()

  // Methods (9)
  protected boolean innerReadFieldHeroes(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldChatData(a)
  protected boolean innerReadFieldChatData_Heroes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildEligibleMemberChange
```
public class GuildEligibleMemberChange extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = GuildEligibleMemberChange1
  public Boolean added
  public Long memberID
  public Long optOutCooldownEnd

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildEligibleMemberChange(a)
  com.perblue.rpg.network.messages.GuildEligibleMemberChange()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildEmblemType
```
public final enum GuildEmblemType extends java.lang.Enum

  // Fields (48)
  private static final GuildEmblemType[] $VALUES
  public static final GuildEmblemType AGGRAVATED_ASSAULT
  public static final GuildEmblemType AGGRESSIVE_ARMOR
  public static final GuildEmblemType ALE_JITSU
  public static final GuildEmblemType ATTACK_OF_RIDICULE
  public static final GuildEmblemType AWKWARD_SILENCE
  public static final GuildEmblemType BEACON
  public static final GuildEmblemType BESSIES_BANE
  public static final GuildEmblemType BIT_O_NIP
  public static final GuildEmblemType BLINDING_LIGHT
  public static final GuildEmblemType BLOODY_BAT
  public static final GuildEmblemType BLUNT_FORCE_TRAUMA
  public static final GuildEmblemType BOCK_JITSU
  public static final GuildEmblemType BOMBARDMENT
  public static final GuildEmblemType BRASS_KNUCKLES
  public static final GuildEmblemType BROS_BEFORE_FOES
  public static final GuildEmblemType BUST_A_MOVE
  public static final GuildEmblemType CANNONBALLER
  public static final GuildEmblemType CHUNKY_FEMUR
  public static final GuildEmblemType DANCING_DEVIL
  public static final GuildEmblemType ENCHANTED_ELBOW_PADS
  public static final GuildEmblemType EVANGELIZE
  public static final GuildEmblemType FEAR_OF_THE_GODS
  public static final GuildEmblemType FINE_BRIE
  public static final GuildEmblemType FLIPPANT_MISSLE
  public static final GuildEmblemType FOAM_FINGER
  public static final GuildEmblemType FREE_MANS_CROWBAR
  public static final GuildEmblemType FREQUENCY_MODULATION
  public static final GuildEmblemType GET_ON_UP
  public static final GuildEmblemType GOBLIN_GROG
  public static final GuildEmblemType GOBLIN_WHACKER
  public static final GuildEmblemType GRRL_POWER
  public static final GuildEmblemType HEART_OF_STONE
  public static final GuildEmblemType HUNGER_PAIN
  public static final GuildEmblemType ILLUMINATE
  public static final GuildEmblemType IMPALE
  public static final GuildEmblemType LOADED_DIE
  public static final GuildEmblemType LUCKY_ORCS_FOOT
  public static final GuildEmblemType MY_FIRST_SHIELD
  public static final GuildEmblemType PAPER_CROWN
  public static final GuildEmblemType PROFANE_STORM
  public static final GuildEmblemType PUNCH_OUT
  public static final GuildEmblemType RUBBER_VEST
  public static final GuildEmblemType SNAZZY_VEST
  public static final GuildEmblemType STICK_ON_MOUSTACHE
  public static final GuildEmblemType STOLEN_SNEAKERS
  public static final GuildEmblemType SWASH_BUCKLER
  private static GuildEmblemType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.GuildEmblemType(String, int)

  // Methods (3)
  public static GuildEmblemType[] valuesCached()
  public static GuildEmblemType[] values()
  public static GuildEmblemType valueOf(String)
```

## com.perblue.rpg.network.messages.GuildExtra
```
public class GuildExtra extends com.perblue.a.a.i

  // Fields (19)
  private static final String FULL_NAME = GuildExtra1
  public Integer campaignKills
  public Integer cryptDifficulty
  public Integer cryptMaxAttacks
  public Long cryptRaidID
  public Integer cryptRaidWins
  public Long currentWarBattleID
  public Long currentWarLogID
  public GuildEmblemType emblem
  public Integer fightPitWins
  public Integer highestCryptDifficulty
  public Long lastExtraCryptRaid
  public List mercenaries
  public Long previousWarBattleID
  public Integer regWarEligibleMembers
  public Map requestLimits
  public String timeZone
  public Integer warBorder
  public Long warBorderEndTime

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildExtra(a)
  com.perblue.rpg.network.messages.GuildExtra()

  // Methods (8)
  protected boolean innerReadFieldRequestLimits(a)
  protected boolean innerReadFieldMercenaries(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildInfo
```
public class GuildInfo extends com.perblue.a.a.i

  // Fields (23)
  private static final String FULL_NAME = GuildInfo1
  public BasicGuildInfo basicInfo
  public Integer birthdayPoints
  public Integer birthdayRank
  public Integer campaignKills
  public String country
  public Integer cryptDifficulty
  public Integer cryptMaxAttacks
  public Integer cryptRaidWins
  public Integer fightPitWins
  public Integer highestCryptDifficulty
  public Long lastExtraCryptRaid
  public Integer memberCount
  public Integer minTeamLevel
  public String motto
  public GuildNewMemberPolicy newMemberPolicy
  public Integer teamPower
  public Integer teamPowerRank
  public String timeZone
  public Integer totalPower
  public Integer totalPowerRank
  public Integer totalStars
  public Integer totalStarsRank

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildInfo(a)
  com.perblue.rpg.network.messages.GuildInfo()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldBasicInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildNewMemberPolicy
```
public final enum GuildNewMemberPolicy extends java.lang.Enum

  // Fields (5)
  private static final GuildNewMemberPolicy[] $VALUES
  public static final GuildNewMemberPolicy APPLICATION_ONLY
  public static final GuildNewMemberPolicy OPEN
  public static final GuildNewMemberPolicy PRIVATE
  private static GuildNewMemberPolicy[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.GuildNewMemberPolicy(String, int)

  // Methods (3)
  public static GuildNewMemberPolicy[] valuesCached()
  public static GuildNewMemberPolicy[] values()
  public static GuildNewMemberPolicy valueOf(String)
```

## com.perblue.rpg.network.messages.GuildRankings
```
public class GuildRankings extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = GuildRankings1
  public RankType rankType
  public List topGuilds
  public Integer yourGuildRank
  public Integer yourGuildValue

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildRankings(a)
  com.perblue.rpg.network.messages.GuildRankings()

  // Methods (7)
  protected boolean innerReadFieldTopGuilds(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildRegisteredForWar
```
public class GuildRegisteredForWar extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = GuildRegisteredForWar1

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildRegisteredForWar(a)
  com.perblue.rpg.network.messages.GuildRegisteredForWar()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildRegistrationRemoved
```
public class GuildRegistrationRemoved extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = GuildRegistrationRemoved1

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildRegistrationRemoved(a)
  com.perblue.rpg.network.messages.GuildRegistrationRemoved()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildRemovedFromWar
```
public class GuildRemovedFromWar extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = GuildRemovedFromWar1

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildRemovedFromWar(a)
  com.perblue.rpg.network.messages.GuildRemovedFromWar()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildRole
```
public final enum GuildRole extends java.lang.Enum

  // Fields (8)
  private static final GuildRole[] $VALUES
  public static final GuildRole CHAMPION
  public static final GuildRole MEMBER
  public static final GuildRole NONE
  public static final GuildRole OFFICER
  public static final GuildRole RULER
  public static final GuildRole VETERAN
  private static GuildRole[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.GuildRole(String, int)

  // Methods (3)
  public static GuildRole[] valuesCached()
  public static GuildRole[] values()
  public static GuildRole valueOf(String)
```

## com.perblue.rpg.network.messages.GuildRow
```
public class GuildRow extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = GuildRow1
  public GuildInfo guildInfo

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildRow(a)
  com.perblue.rpg.network.messages.GuildRow()

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldGuildInfo(a)
  protected boolean innerReadFieldGuildInfo_BasicInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildWarAttack
```
public class GuildWarAttack extends com.perblue.a.a.i

  // Fields (8)
  private static final String FULL_NAME = GuildWarAttack1
  public Boolean acceptBattle
  public HeroLineup attackerHeroes
  public AttackBase base
  public List defenderHeroes
  public Long defenderID
  public Integer lineupNum
  public Integer stagesCleared

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildWarAttack()
  com.perblue.rpg.network.messages.GuildWarAttack(a)

  // Methods (9)
  protected boolean innerReadFieldBase(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldAttackerHeroes(a)
  protected boolean innerReadFieldDefenderHeroes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildWarAttacked
```
public class GuildWarAttacked extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = GuildWarAttacked1

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildWarAttacked(a)
  com.perblue.rpg.network.messages.GuildWarAttacked()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildWarBattleExtra
```
public class GuildWarBattleExtra extends com.perblue.a.a.i

  // Fields (9)
  private static final String FULL_NAME = GuildWarBattleExtra1
  public Map attackers
  public Map defenders
  public Boolean ended
  public Integer pointsEarned
  public Long startTime
  public Boolean surrendered
  public Integer targetPoints
  public Long victoryTime

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildWarBattleExtra(a)
  com.perblue.rpg.network.messages.GuildWarBattleExtra()

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldAttackers(a)
  protected boolean innerReadFieldDefenders(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildWarEnded
```
public class GuildWarEnded extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = GuildWarEnded1
  public Long registrationStartTime
  public WarResult result

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildWarEnded()
  com.perblue.rpg.network.messages.GuildWarEnded(a)

  // Methods (8)
  protected boolean innerReadFieldResult_GuildInfo(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldResult(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildWarFightComplete
```
public class GuildWarFightComplete extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = GuildWarFightComplete1
  public Long attackerID
  public Long earlyEndTime
  public WarOpponentInfo opponent
  public Integer pointDelta

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildWarFightComplete()
  com.perblue.rpg.network.messages.GuildWarFightComplete(a)

  // Methods (8)
  protected boolean innerReadFieldOpponent_Info(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldOpponent(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildWarLogExtra
```
public class GuildWarLogExtra extends com.perblue.a.a.i

  // Fields (11)
  private static final String FULL_NAME = GuildWarLogExtra1
  public Integer defensiveLoses
  public Integer defensiveWins
  public Long lastWarTicketGenerationTime
  public Map memberData
  public Integer offensiveLoses
  public Integer offensiveWins
  public Integer rewardTierIcon
  public Long warStartTime
  public Integer warTickets
  public Integer winStreak

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildWarLogExtra(a)
  com.perblue.rpg.network.messages.GuildWarLogExtra()

  // Methods (7)
  protected boolean innerReadFieldMemberData(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildWarMMRUpdate
```
public class GuildWarMMRUpdate extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = GuildWarMMRUpdate1
  public Integer newMMR

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildWarMMRUpdate(a)
  com.perblue.rpg.network.messages.GuildWarMMRUpdate()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildWarOpponentUpdate
```
public class GuildWarOpponentUpdate extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = GuildWarOpponentUpdate1
  public BasicGuildInfo info

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildWarOpponentUpdate(a)
  com.perblue.rpg.network.messages.GuildWarOpponentUpdate()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildWarOptedOut
```
public class GuildWarOptedOut extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = GuildWarOptedOut1
  public String optedOutBy

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildWarOptedOut(a)
  com.perblue.rpg.network.messages.GuildWarOptedOut()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildWarRankingRow
```
public class GuildWarRankingRow extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = GuildWarRankingRow1
  public GuildRow info
  public Integer mMR
  public WarGuildProgress progress
  public Integer rank
  public Integer rewardTier
  public Integer topPercent

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildWarRankingRow(a)
  com.perblue.rpg.network.messages.GuildWarRankingRow()

  // Methods (9)
  protected boolean innerReadFieldProgress(a)
  protected boolean innerReadFieldInfo_GuildInfo(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildWarRankings
```
public class GuildWarRankings extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = GuildWarRankings1
  public List topGuilds
  public GuildWarRankingRow yourGuild

  // Constructors (2)
  com.perblue.rpg.network.messages.GuildWarRankings(a)
  com.perblue.rpg.network.messages.GuildWarRankings()

  // Methods (10)
  protected boolean innerReadFieldTopGuilds(a)
  protected boolean innerReadFieldYourGuild_Info(a)
  protected boolean innerReadFieldYourGuild_Progress(a)
  protected boolean innerReadFieldYourGuild(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.GuildWarRewardClaimStatus
```
public final enum GuildWarRewardClaimStatus extends java.lang.Enum

  // Fields (10)
  private static final GuildWarRewardClaimStatus[] $VALUES
  public static final GuildWarRewardClaimStatus CLAIMED_FOUR_PICK
  public static final GuildWarRewardClaimStatus CLAIMED_ONE_PICK
  public static final GuildWarRewardClaimStatus CLAIMED_THREE_PICK
  public static final GuildWarRewardClaimStatus CLAIMED_TOKENS
  public static final GuildWarRewardClaimStatus CLAIMED_TWO_PICK
  public static final GuildWarRewardClaimStatus NOT_ELIGIBLE
  public static final GuildWarRewardClaimStatus UNCLAIMED
  public static final GuildWarRewardClaimStatus UNKNOWN
  private static GuildWarRewardClaimStatus[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.GuildWarRewardClaimStatus(String, int)

  // Methods (3)
  public static GuildWarRewardClaimStatus[] valuesCached()
  public static GuildWarRewardClaimStatus[] values()
  public static GuildWarRewardClaimStatus valueOf(String)
```

## com.perblue.rpg.network.messages.GuildWarStatus
```
public final enum GuildWarStatus extends java.lang.Enum

  // Fields (9)
  private static final GuildWarStatus[] $VALUES
  public static final GuildWarStatus GOOD
  public static final GuildWarStatus JOINED_DURING_WAR
  public static final GuildWarStatus JOINED_LATE
  public static final GuildWarStatus LEFT
  public static final GuildWarStatus NO_DEFENSE
  public static final GuildWarStatus OPTED_OUT
  public static final GuildWarStatus UNKNOWN
  private static GuildWarStatus[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.GuildWarStatus(String, int)

  // Methods (3)
  public static GuildWarStatus[] valuesCached()
  public static GuildWarStatus[] values()
  public static GuildWarStatus valueOf(String)
```

## com.perblue.rpg.network.messages.HeroBattleData
```
public class HeroBattleData extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = HeroBattleData1
  public Integer energy
  public Map extra
  public Integer health

  // Constructors (2)
  com.perblue.rpg.network.messages.HeroBattleData()
  com.perblue.rpg.network.messages.HeroBattleData(a)

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  protected boolean innerReadFieldExtra(a)
  public String toString()
```

## com.perblue.rpg.network.messages.HeroBattleDataExtraType
```
public final enum HeroBattleDataExtraType extends java.lang.Enum

  // Fields (21)
  private static final HeroBattleDataExtraType[] $VALUES
  public static final HeroBattleDataExtraType ACTION_QUEUE
  public static final HeroBattleDataExtraType ACTIVE
  public static final HeroBattleDataExtraType BARDBARIAN_LEGENDARY_COUNT
  public static final HeroBattleDataExtraType BLACK_WING_REVIVED
  public static final HeroBattleDataExtraType CENTAUR_LEGENDARY_COUNT
  public static final HeroBattleDataExtraType DEFAULT
  public static final HeroBattleDataExtraType GENIE_REVIVED_COUNT
  public static final HeroBattleDataExtraType HIT_ANIMATIONS
  public static final HeroBattleDataExtraType IS_TITAN
  public static final HeroBattleDataExtraType MINION_HEALTH_BONUS
  public static final HeroBattleDataExtraType MISTRESS_MANICURE_STACK_COUNT
  public static final HeroBattleDataExtraType PCH_ANUBISDRAGON_REVIVED
  public static final HeroBattleDataExtraType REVIVED
  public static final HeroBattleDataExtraType SPIDER_QUEEN_TASTY_HEROES
  public static final HeroBattleDataExtraType TITAN_HEALTH_BONUS
  public static final HeroBattleDataExtraType UNRIPE_MYTHOLOGY_INCUBATION
  public static final HeroBattleDataExtraType VILE_BILE_DAMAGE_TAKEN
  public static final HeroBattleDataExtraType VISIBLE
  public static final HeroBattleDataExtraType ZOMBIE_REVIVED
  private static HeroBattleDataExtraType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.HeroBattleDataExtraType(String, int)

  // Methods (3)
  public static HeroBattleDataExtraType[] valuesCached()
  public static HeroBattleDataExtraType[] values()
  public static HeroBattleDataExtraType valueOf(String)
```

## com.perblue.rpg.network.messages.HeroBattleDatas
```
public class HeroBattleDatas extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = HeroBattleDatas1
  public List data

  // Constructors (2)
  com.perblue.rpg.network.messages.HeroBattleDatas(a)
  com.perblue.rpg.network.messages.HeroBattleDatas()

  // Methods (7)
  protected boolean innerReadFieldData(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.HeroData
```
public class HeroData extends com.perblue.a.a.i

  // Fields (14)
  private static final String FULL_NAME = HeroData1
  public Integer eXP
  public Integer heroNum
  public Boolean isLegendary
  public Boolean isMercenary
  public Map items
  public Integer level
  public Map modePersistentData
  public Rarity rarity
  public Map runes
  public Map skills
  public ItemType skin
  public Integer stars
  public UnitType type

  // Constructors (2)
  com.perblue.rpg.network.messages.HeroData(a)
  com.perblue.rpg.network.messages.HeroData()

  // Methods (10)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldSkills(a)
  protected boolean innerReadFieldItems(a)
  protected boolean innerReadFieldModePersistentData(a)
  protected boolean innerReadFieldRunes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.HeroEquipSlot
```
public final enum HeroEquipSlot extends java.lang.Enum

  // Fields (8)
  private static final HeroEquipSlot[] $VALUES
  public static final HeroEquipSlot FIVE
  public static final HeroEquipSlot FOUR
  public static final HeroEquipSlot ONE
  public static final HeroEquipSlot SIX
  public static final HeroEquipSlot THREE
  public static final HeroEquipSlot TWO
  private static HeroEquipSlot[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.HeroEquipSlot(String, int)

  // Methods (3)
  public static HeroEquipSlot[] valuesCached()
  public static HeroEquipSlot[] values()
  public static HeroEquipSlot valueOf(String)
```

## com.perblue.rpg.network.messages.HeroHired
```
public class HeroHired extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = HeroHired1
  public MercenaryHeroData hero

  // Constructors (2)
  com.perblue.rpg.network.messages.HeroHired(a)
  com.perblue.rpg.network.messages.HeroHired()

  // Methods (8)
  protected boolean innerReadFieldHero(a)
  protected boolean innerReadFieldHero_HeroData(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.HeroLineup
```
public class HeroLineup extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = HeroLineup1
  public List heroes
  public UnitType mercenaryType

  // Constructors (2)
  com.perblue.rpg.network.messages.HeroLineup(a)
  com.perblue.rpg.network.messages.HeroLineup()

  // Methods (7)
  protected boolean innerReadFieldHeroes(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.HeroLineupType
```
public final enum HeroLineupType extends java.lang.Enum

  // Fields (36)
  private static final HeroLineupType[] $VALUES
  public static final HeroLineupType BOSS_BATTLE
  public static final HeroLineupType BOSS_PIT_EVIL_WIZARD_1
  public static final HeroLineupType BOSS_PIT_EVIL_WIZARD_2
  public static final HeroLineupType BOSS_PIT_EVIL_WIZARD_3
  public static final HeroLineupType BOSS_PIT_GIANT_PLANT_1
  public static final HeroLineupType BOSS_PIT_GIANT_PLANT_2
  public static final HeroLineupType BOSS_PIT_GIANT_PLANT_3
  public static final HeroLineupType BOSS_PIT_GOLDEN_COLOSSUS_1
  public static final HeroLineupType BOSS_PIT_GOLDEN_COLOSSUS_2
  public static final HeroLineupType BOSS_PIT_GOLDEN_COLOSSUS_3
  public static final HeroLineupType CHALLENGES_MAGIC_IMMUNE
  public static final HeroLineupType CHALLENGES_ONLY_DRAGONS
  public static final HeroLineupType CHALLENGES_PHYSICAL_IMMUNE
  public static final HeroLineupType COLISEUM_ATTACK_1
  public static final HeroLineupType COLISEUM_ATTACK_2
  public static final HeroLineupType COLISEUM_ATTACK_3
  public static final HeroLineupType COLISEUM_DEFENSE_1
  public static final HeroLineupType COLISEUM_DEFENSE_2
  public static final HeroLineupType COLISEUM_DEFENSE_3
  public static final HeroLineupType CRYPT_RAID
  public static final HeroLineupType DEFAULT
  public static final HeroLineupType ELITE_CAMPAIGN
  public static final HeroLineupType EXPEDITION
  public static final HeroLineupType EXPERT_CAMPAIGN
  public static final HeroLineupType FIGHT_PIT_ATTACK
  public static final HeroLineupType FIGHT_PIT_DEFENSE
  public static final HeroLineupType GUILD_WAR_ATTACK
  public static final HeroLineupType GUILD_WAR_DEFENSE_1
  public static final HeroLineupType GUILD_WAR_DEFENSE_2
  public static final HeroLineupType GUILD_WAR_DEFENSE_3
  public static final HeroLineupType NORMAL_CAMPAIGN
  public static final HeroLineupType THE_MOUNTAIN_CAVES
  public static final HeroLineupType THE_MOUNTAIN_SUMMIT
  public static final HeroLineupType TITAN_TEMPLE
  private static HeroLineupType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.HeroLineupType(String, int)

  // Methods (3)
  public static HeroLineupType[] valuesCached()
  public static HeroLineupType[] values()
  public static HeroLineupType valueOf(String)
```

## com.perblue.rpg.network.messages.HeroLineupUpdate
```
public class HeroLineupUpdate extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = HeroLineupUpdate1
  public HeroLineup lineup
  public HeroLineupType type

  // Constructors (2)
  com.perblue.rpg.network.messages.HeroLineupUpdate(a)
  com.perblue.rpg.network.messages.HeroLineupUpdate()

  // Methods (7)
  protected boolean innerReadFieldLineup(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.HeroPersistentData
```
public class HeroPersistentData extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = HeroPersistentData1
  public HeroBattleData heroBattleData
  public HeroData heroData

  // Constructors (2)
  com.perblue.rpg.network.messages.HeroPersistentData()
  com.perblue.rpg.network.messages.HeroPersistentData(a)

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldHeroData(a)
  protected boolean innerReadFieldHeroBattleData(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.HeroSummary
```
public class HeroSummary extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = HeroSummary1
  public Boolean isLegendary
  public Integer level
  public Rarity rarity
  public ItemType skin
  public Integer stars
  public UnitType type

  // Constructors (2)
  com.perblue.rpg.network.messages.HeroSummary(a)
  com.perblue.rpg.network.messages.HeroSummary()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.HeroTag
```
public final enum HeroTag extends java.lang.Enum

  // Fields (67)
  private static final HeroTag[] $VALUES
  public static final HeroTag ARMOR
  public static final HeroTag AXE
  public static final HeroTag BASHING
  public static final HeroTag BLIND
  public static final HeroTag BOAST_OF_HEAD
  public static final HeroTag BOWTIE
  public static final HeroTag CAN
  public static final HeroTag CHARMED
  public static final HeroTag CRIMSON
  public static final HeroTag DAMAGE_OVER_TIME
  public static final HeroTag DRAGON
  public static final HeroTag ELECTRIC
  public static final HeroTag ENERGY
  public static final HeroTag EYES_OF_ENLIGHTENMENT
  public static final HeroTag FEMALE
  public static final HeroTag FIRE
  public static final HeroTag FLAMES_OF_PASSION
  public static final HeroTag GOOD_LOOKING
  public static final HeroTag HARVEST_PARTY
  public static final HeroTag HASTE
  public static final HeroTag HEALING
  public static final HeroTag HEALING2
  public static final HeroTag HEAVY
  public static final HeroTag HOLY
  public static final HeroTag HOLY_BEAST
  public static final HeroTag HORNS
  public static final HeroTag INDOORSY
  public static final HeroTag INVINCIBLE
  public static final HeroTag I_LOVE_THE_SEA
  public static final HeroTag KNOCKBACK
  public static final HeroTag LAMB_LOVER
  public static final HeroTag LIFE_STEAL
  public static final HeroTag LONELY_HERO
  public static final HeroTag LOYAL_MATEY
  public static final HeroTag MAGIC
  public static final HeroTag MAGIC_RESISTANCE
  public static final HeroTag MALE
  public static final HeroTag MELEE
  public static final HeroTag MIRROR_HATER
  public static final HeroTag NECROTIC
  public static final HeroTag NONE
  public static final HeroTag NOSE
  public static final HeroTag PHYSICAL
  public static final HeroTag PIERCING
  public static final HeroTag PIOUS_HALO
  public static final HeroTag PROJECTILE
  public static final HeroTag RANGED
  public static final HeroTag REVERENT
  public static final HeroTag ROAMING_THINGS_IN_THE_DARK_NIGHT
  public static final HeroTag SHEILD_BREAK
  public static final HeroTag SILENCE
  public static final HeroTag SLASHING
  public static final HeroTag SLOW
  public static final HeroTag SNIPER_WOLF
  public static final HeroTag STAT
  public static final HeroTag STEAL
  public static final HeroTag STUN
  public static final HeroTag TASTY
  public static final HeroTag TEA_PARTY_WITH_WIZARDS
  public static final HeroTag TOTAL
  public static final HeroTag TOXIC
  public static final HeroTag TRUE
  public static final HeroTag UNSTABLE
  public static final HeroTag WATER
  public static final HeroTag WILD_INTUITION
  private static HeroTag[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.HeroTag(String, int)

  // Methods (3)
  public static HeroTag[] valuesCached()
  public static HeroTag[] values()
  public static HeroTag valueOf(String)
```

## com.perblue.rpg.network.messages.HeroTagPrefix
```
public final enum HeroTagPrefix extends java.lang.Enum

  // Fields (7)
  private static final HeroTagPrefix[] $VALUES
  public static final HeroTagPrefix IMMUNE_TO
  public static final HeroTagPrefix NONE
  public static final HeroTagPrefix REQUIRES
  public static final HeroTagPrefix REQUIRES_ONE
  public static final HeroTagPrefix WEAK_TO
  private static HeroTagPrefix[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.HeroTagPrefix(String, int)

  // Methods (3)
  public static HeroTagPrefix[] valuesCached()
  public static HeroTagPrefix[] values()
  public static HeroTagPrefix valueOf(String)
```

## com.perblue.rpg.network.messages.HeroWall
```
public class HeroWall extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = HeroWall1
  public UnitType heroType
  public List posts

  // Constructors (2)
  com.perblue.rpg.network.messages.HeroWall(a)
  com.perblue.rpg.network.messages.HeroWall()

  // Methods (7)
  protected boolean innerReadFieldPosts(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.HeroWallPostExtra
```
public class HeroWallPostExtra extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = HeroWallPostExtra1
  public ChatExtra chatData
  public Lineup heroes

  // Constructors (2)
  com.perblue.rpg.network.messages.HeroWallPostExtra(a)
  com.perblue.rpg.network.messages.HeroWallPostExtra()

  // Methods (9)
  protected boolean innerReadFieldHeroes(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldChatData(a)
  protected boolean innerReadFieldChatData_Heroes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.HeroesForHire
```
public class HeroesForHire extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = HeroesForHire1
  public Boolean forJobBoard
  public Long guildID
  public List mercenaries

  // Constructors (2)
  com.perblue.rpg.network.messages.HeroesForHire(a)
  com.perblue.rpg.network.messages.HeroesForHire()

  // Methods (7)
  protected boolean innerReadFieldMercenaries(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.HowToPlayDeckType
```
public final enum HowToPlayDeckType extends java.lang.Enum

  // Fields (30)
  private static final HowToPlayDeckType[] $VALUES
  public static final HowToPlayDeckType BOSS_BATTLE
  public static final HowToPlayDeckType BOSS_BATTLE_LAYER
  public static final HowToPlayDeckType BOSS_BATTLE_REWARD
  public static final HowToPlayDeckType BOSS_PIT
  public static final HowToPlayDeckType CHAT_RULES
  public static final HowToPlayDeckType COLISEUM
  public static final HowToPlayDeckType CONTESTS
  public static final HowToPlayDeckType CRYPT
  public static final HowToPlayDeckType DEFAULT
  public static final HowToPlayDeckType ENCHANTING
  public static final HowToPlayDeckType EXPEDITION
  public static final HowToPlayDeckType FIGHT_PIT
  public static final HowToPlayDeckType GOLD_CHEST
  public static final HowToPlayDeckType GUILD
  public static final HowToPlayDeckType HERO_STATS
  public static final HowToPlayDeckType IAP_PURCHASING
  public static final HowToPlayDeckType LEGENDARY
  public static final HowToPlayDeckType MONTHLY_DEAL
  public static final HowToPlayDeckType ORANGE_CHEST
  public static final HowToPlayDeckType PURPLE_CHEST
  public static final HowToPlayDeckType RUNES
  public static final HowToPlayDeckType RUNE_SHRINE
  public static final HowToPlayDeckType SILVER_CHEST
  public static final HowToPlayDeckType SOUL_CHEST
  public static final HowToPlayDeckType TITAN_TEMPLE_OTHER
  public static final HowToPlayDeckType TITAN_TEMPLE_OWNER
  public static final HowToPlayDeckType VIP
  public static final HowToPlayDeckType WAR
  private static HowToPlayDeckType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.HowToPlayDeckType(String, int)

  // Methods (3)
  public static HowToPlayDeckType[] valuesCached()
  public static HowToPlayDeckType[] values()
  public static HowToPlayDeckType valueOf(String)
```

## com.perblue.rpg.network.messages.IAPCompletePurchase
```
public class IAPCompletePurchase extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = IAPCompletePurchase1
  public String purchaseData

  // Constructors (2)
  com.perblue.rpg.network.messages.IAPCompletePurchase(a)
  com.perblue.rpg.network.messages.IAPCompletePurchase()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.IAPProduct
```
public class IAPProduct extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = IAPProduct1
  public Integer baseDiamonds
  public Integer baseVIPTickets
  public Integer bonusDiamonds
  public Integer bonusVIPTickets
  public String productID
  public SaleBadgeType saleBadgeType

  // Constructors (2)
  com.perblue.rpg.network.messages.IAPProduct(a)
  com.perblue.rpg.network.messages.IAPProduct()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.IAPProducts
```
public class IAPProducts extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = IAPProducts1
  public List products

  // Constructors (2)
  com.perblue.rpg.network.messages.IAPProducts(a)
  com.perblue.rpg.network.messages.IAPProducts()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldProducts(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.IAPVerificationRequest
```
public class IAPVerificationRequest extends com.perblue.a.a.i

  // Fields (8)
  private static final String FULL_NAME = IAPVerificationRequest1
  public String entryPoint
  public String failureMessage
  public String productID
  public String purchaseID
  public String signature
  public String signedData
  public Boolean success

  // Constructors (2)
  com.perblue.rpg.network.messages.IAPVerificationRequest(a)
  com.perblue.rpg.network.messages.IAPVerificationRequest()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.IAPVerificationResponse
```
public class IAPVerificationResponse extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = IAPVerificationResponse1
  public String purchaseData
  public Boolean valid

  // Constructors (2)
  com.perblue.rpg.network.messages.IAPVerificationResponse(a)
  com.perblue.rpg.network.messages.IAPVerificationResponse()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.IOSPurchaseLog
```
public class IOSPurchaseLog extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = IOSPurchaseLog1
  public String note
  public String productID
  public Long transactionDate
  public String transactionID
  public String transactionState

  // Constructors (2)
  com.perblue.rpg.network.messages.IOSPurchaseLog(a)
  com.perblue.rpg.network.messages.IOSPurchaseLog()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.InAppPurchaseError
```
public class InAppPurchaseError extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = InAppPurchaseError1
  public String errorMessage
  public String productId
  public String transactionId
  public Boolean validationFailed

  // Constructors (2)
  com.perblue.rpg.network.messages.InAppPurchaseError(a)
  com.perblue.rpg.network.messages.InAppPurchaseError()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.InAppPurchaseVerified
```
public class InAppPurchaseVerified extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = InAppPurchaseVerified1
  public String productId
  public String transactionId

  // Constructors (2)
  com.perblue.rpg.network.messages.InAppPurchaseVerified(a)
  com.perblue.rpg.network.messages.InAppPurchaseVerified()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.InAppPurchaseVerifiedAndGiven
```
public class InAppPurchaseVerifiedAndGiven extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = InAppPurchaseVerifiedAndGiven1
  public String productId
  public String transactionId

  // Constructors (2)
  com.perblue.rpg.network.messages.InAppPurchaseVerifiedAndGiven(a)
  com.perblue.rpg.network.messages.InAppPurchaseVerifiedAndGiven()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.InGameNotification
```
public class InGameNotification extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = InGameNotification1
  public String displayText
  public Float duration
  public InGameNotificationType type
  public PlayerRow userInfo

  // Constructors (2)
  com.perblue.rpg.network.messages.InGameNotification(a)
  com.perblue.rpg.network.messages.InGameNotification()

  // Methods (9)
  protected boolean innerReadFieldUserInfo_Info(a)
  protected boolean innerReadFieldUserInfo_GuildInfo(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldUserInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.InGameNotificationType
```
public final enum InGameNotificationType extends java.lang.Enum

  // Fields (3)
  private static final InGameNotificationType[] $VALUES
  public static final InGameNotificationType GENERIC
  private static InGameNotificationType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.InGameNotificationType(String, int)

  // Methods (3)
  public static InGameNotificationType[] valuesCached()
  public static InGameNotificationType[] values()
  public static InGameNotificationType valueOf(String)
```

## com.perblue.rpg.network.messages.ItemType
```
public final enum ItemType extends java.lang.Enum

  // Fields (1234)
  private static final ItemType[] $VALUES
  public static final ItemType ADAMANTIUM_TIARA
  public static final ItemType ADVENTURERS_RIDES
  public static final ItemType ADVENTURERS_STARTER_PACK
  public static final ItemType AGED_DRAGON_MILK
  public static final ItemType ALCHEMIST_STARTER_PACK
  public static final ItemType ALCHEMY_COST_RESET
  public static final ItemType AMULET_OF_CONCENTRATED_AWESOME
  public static final ItemType ANCIENT_CODE
  public static final ItemType ANCIENT_COIN
  public static final ItemType ANCIENT_TOME_OF_OCCULT_NONSENSE
  public static final ItemType AND_MY_AXE
  public static final ItemType ANNIVERSARY_1000TH_RESKIN
  public static final ItemType ANTI_MAGIC_SHIELD
  public static final ItemType ARCANE_DOODLES
  public static final ItemType ARCANE_SLACKS
  public static final ItemType ARTIFACT_OF_UNIMAGINABLE_POWER
  public static final ItemType AUTO_FLUTE
  public static final ItemType AXES_OF_DUAL_WIELDING
  public static final ItemType AXE_OF_GRATUITOUS_GUITAR_SOLOS
  public static final ItemType AXE_OF_GRINDING
  public static final ItemType BAG_O_HAMMERS
  public static final ItemType BALANCE_OF_LIFE
  public static final ItemType BANANA_PEEL_MOUNTAIN
  public static final ItemType BANJO_OF_DUELING
  public static final ItemType BEARLY_THERE_BOOTS
  public static final ItemType BELL_OF_SILENCE
  public static final ItemType BESSIES_BANE
  public static final ItemType BIG_STABBY_SPEAR
  public static final ItemType BIT_O_NIP
  public static final ItemType BLACKBERRY_JAM
  public static final ItemType BLACKSMITH_BREW
  public static final ItemType BLACKSTEEL_BLADE
  public static final ItemType BLISSFUL_IGNORANCE
  public static final ItemType BLOODY_BAT
  public static final ItemType BLUNT_BLADE
  public static final ItemType BONE_CRUSHING_PLIERS
  public static final ItemType BOOK_OF_IRMAC
  public static final ItemType BOOM_BOX
  public static final ItemType BOOTS_MADE_FOR_WALKIN
  public static final ItemType BOSS_BATTLE_STAGE_RESET
  public static final ItemType BOWIE_KNIFE
  public static final ItemType BRACELET_OF_LIGHTNING
  public static final ItemType BRAIN_GUARD_9000
  public static final ItemType BRAIN_PILLS
  public static final ItemType BUNNY_BLADE
  public static final ItemType BUNNY_SLIPPERS
  public static final ItemType BUTTER_KNIFE
  public static final ItemType CANNON_CANOE
  public static final ItemType CAPTAINS_TIGHTPANTS
  public static final ItemType CAT_O_NINE_TAILS
  public static final ItemType CAVE_DAGGER
  public static final ItemType CHAIN_WALLET
  public static final ItemType CHAMPIONSHIP_BELT
  public static final ItemType CHAPS_OF_ENDURANCE
  public static final ItemType CHUGG_BOOTS
  public static final ItemType CHUNKY_FEMUR
  public static final ItemType CLOAK_OF_THE_OWL
  public static final ItemType CLOUDY_MONOCULAR_TELESCOPE
  public static final ItemType COG_NITIVE_MASK
  public static final ItemType COPPER_ORE
  public static final ItemType COSPLAY_SWORD
  public static final ItemType CREATINE_CACTUS
  public static final ItemType CROWNING_ACHIEVEMENT
  public static final ItemType CRUDE_SHIELD
  public static final ItemType CRUDE_SNIPPERS
  public static final ItemType CRYSTAL_MUSHROOM
  public static final ItemType DAISY_CHAINSAW
  public static final ItemType DANCERS_BRA
  public static final ItemType DEAD_EYE
  public static final ItemType DEATH_METAL_BLADE
  public static final ItemType DECODER_RING
  public static final ItemType DECODER_RING_2_ORDER
  public static final ItemType DECODER_RING_3_ORDER
  public static final ItemType DEDICATED_BROZERKER
  public static final ItemType DEDICATED_CENTAUR_OF_ATTENTION
  public static final ItemType DEDICATED_COSMIC_ELF
  public static final ItemType DEDICATED_DEEP_DRAGON
  public static final ItemType DEDICATED_DEMON_TOTEM
  public static final ItemType DEDICATED_DRAGON_LADY
  public static final ItemType DEDICATED_GENIE
  public static final ItemType DEDICATED_MEDUSA
  public static final ItemType DEDICATED_NINJA_DWARF
  public static final ItemType DEDICATED_ORC_MONK
  public static final ItemType DEDICATED_ROLLER_WARRIOR
  public static final ItemType DEDICATED_SATYR
  public static final ItemType DEDICATED_SHADOW_ASSASSIN
  public static final ItemType DEDICATED_SNAP_DRAGON
  public static final ItemType DEDICATED_UNSTABLE_UNDERSTUDY
  public static final ItemType DEERSTALKER_HAT
  public static final ItemType DEFAULT
  public static final ItemType DENSE_CAKE_OF_HATE
  public static final ItemType DESERT_SMASHER
  public static final ItemType DEVILS_POT
  public static final ItemType DIPLOMATIC_IMMUNITY
  public static final ItemType DIRECTORS_CUT
  public static final ItemType DIRK_OF_DISEMBOWELING
  public static final ItemType DIRTY_BASTARD_SWORD
  public static final ItemType DODGY_JEWELRY
  public static final ItemType DONT_TASE_ME_BOW
  public static final ItemType DOUBLE_AXE
  public static final ItemType DOUBLE_BLADED_SWORD
  public static final ItemType DOUBLE_ELITE_CAMPAIGN_DROPS
  public static final ItemType DOUBLE_EXPERT_CAMPAIGN_DROPS
  public static final ItemType DOUBLE_NORMAL_CAMPAIGN_DROPS
  public static final ItemType DRACONIAN_DISH
  public static final ItemType DRACONIC_FUSE
  public static final ItemType DRAGONS_BALLZ
  public static final ItemType DRAGONS_BLADE
  public static final ItemType DRAGONS_POCKET_WATCH
  public static final ItemType DRAGON_BLANKIE
  public static final ItemType DRAGON_LEATHER_TIGHTS
  public static final ItemType DRAGON_SAND_BOOTS
  public static final ItemType DRAGON_SCALE
  public static final ItemType DRAGON_SCALE_GROVE
  public static final ItemType DROP_OF_MOONLIGHT
  public static final ItemType DUELING_KNIVES_OF_HACKENSLASH
  public static final ItemType DWARVEN_LIFTING_BELT
  public static final ItemType ELITE_CHANCES_COST_RESET
  public static final ItemType EMBARASSING_CHAINMAIL_OF_IMMENSE_POWER
  public static final ItemType ENCHANTED_ELBOW_PADS
  public static final ItemType END_CENTURY_FLAME_RADIATOR
  public static final ItemType ENGAGEMENT_KNUCKLES
  public static final ItemType ENIDS_EXPENSIVE_ELIXIR
  public static final ItemType ENIDS_EXPENSIVE_ELIXIR_2_ORDER
  public static final ItemType ESCUTCHEON_OF_EYES
  public static final ItemType EVENT_CHEST_ROLL_X1
  public static final ItemType EXCALIBURTREYNOLDS
  public static final ItemType EXOTIC_FAN
  public static final ItemType EXPLOSIVE_CANNON
  public static final ItemType EXP_DECANTER
  public static final ItemType EXP_FLASK
  public static final ItemType EXP_PHILTER
  public static final ItemType EXP_VIAL
  public static final ItemType EXTREME_FAD_DIET
  public static final ItemType EYE_OF_THE_BEHOLDER
  public static final ItemType EYE_ON_THE_PRIZE
  public static final ItemType FAMILIAR_ENERGY_TANK
  public static final ItemType FAMILY_TREE_OF_UMLAUT
  public static final ItemType FEATHERWEIGHT_WINGS
  public static final ItemType FEATHER_OF_PHOENIX
  public static final ItemType FEATHER_WEIGHT_FOIL
  public static final ItemType FEATHER_WEIGHT_PAULDRONS
  public static final ItemType FINE_BRIE
  public static final ItemType FINS_OF_SEA_DRAGON
  public static final ItemType FLAIL_OF_TOTAL_DEVASTATION
  public static final ItemType FLAMEY_POOFS
  public static final ItemType FLATTERING_MIRROR
  public static final ItemType FLOPPIN_FLIP_FLOPS
  public static final ItemType FOAM_FINGER
  public static final ItemType FOUNTAIN_OF_OLD_AGE
  public static final ItemType FOUR_D_GLASSES
  public static final ItemType FRAMED_DIPLOMA
  public static final ItemType FREE_MANS_CROWBAR
  public static final ItemType FRIENDZONITE
  public static final ItemType GAUNTLET_OF_THRONE
  public static final ItemType GEAR_TICKET_CYAN
  public static final ItemType GEAR_TICKET_ORANGE
  public static final ItemType GEAR_TICKET_PURPLE
  public static final ItemType GENERIC_ORANGE
  public static final ItemType GENTLEMENS_CLUB
  public static final ItemType GIANTS_GROG
  public static final ItemType GIRDLE_OF_VICTORY
  public static final ItemType GLAIVE_OF_DISMEMBERMENT
  public static final ItemType GLASS_CANNON
  public static final ItemType GLASS_CASE_OF_EMOTION
  public static final ItemType GLORY_SEEKER
  public static final ItemType GLOVES_OF_CRIT
  public static final ItemType GOBLIN_GROG
  public static final ItemType GOBLIN_WHACKER
  public static final ItemType GOLDEN_SLINGSHOT
  public static final ItemType GOLD_AX_SILVER_AX
  public static final ItemType GOLD_CHEST_ROLL_X1
  public static final ItemType GOLD_RUSH
  public static final ItemType GOOD_GREEN_GOO
  public static final ItemType GOOD_SLEEPING_BED
  public static final ItemType GOURD
  public static final ItemType GREAT_HORNED_HORN
  public static final ItemType GREAVES_OF_PLEIAS
  public static final ItemType GREENISH_LANTERN
  public static final ItemType GRIEVOUS_BODILY_HARM
  public static final ItemType GROUND_GEARS
  public static final ItemType HAIR_OF_THE_DOG
  public static final ItemType HAMMER_OF_WICKED_BEATS
  public static final ItemType HAMMER_TIME
  public static final ItemType HANDY_RASP
  public static final ItemType HAROLDS_HOMEMADE_HALBERD
  public static final ItemType HEAD_BANGER
  public static final ItemType HEALTHY_DOSE_OF_SKEPTICISM
  public static final ItemType HEAL_AID
  public static final ItemType HEARTY_CHEST
  public static final ItemType HEART_HAT
  public static final ItemType HEART_HEALTH_CANDY
  public static final ItemType HELMET_OF_FORESIGHT
  public static final ItemType HELM_OF_SCREAMING_MANFACE
  public static final ItemType HELM_OF_THE_RAGING_BEAR
  public static final ItemType HEMP_BRACELET
  public static final ItemType HERMITS_PILLS
  public static final ItemType HERO_ABYSS_DRAGON
  public static final ItemType HERO_ANCIENT_DWARF
  public static final ItemType HERO_ANGELIC_HERALD
  public static final ItemType HERO_ANGEL_DRAGON
  public static final ItemType HERO_AQUATIC_MAN
  public static final ItemType HERO_BANSHEE
  public static final ItemType HERO_BARDBARIAN
  public static final ItemType HERO_BLACK_WING
  public static final ItemType HERO_BONE_DRAGON
  public static final ItemType HERO_BROZERKER
  public static final ItemType HERO_BULWARK_ANGEL
  public static final ItemType HERO_BURNT_ONE
  public static final ItemType HERO_CATAPULT_KNIGHT
  public static final ItemType HERO_CENTAUR_OF_ATTENTION
  public static final ItemType HERO_CLAW_MAN
  public static final ItemType HERO_COSMIC_ELF
  public static final ItemType HERO_CRIMSON_WITCH
  public static final ItemType HERO_CURSED_STATUE
  public static final ItemType HERO_CYCLOPS_WIZARD
  public static final ItemType HERO_DARK_DRACUL
  public static final ItemType HERO_DARK_HERO
  public static final ItemType HERO_DARK_HORSE
  public static final ItemType HERO_DEEP_DRAGON
  public static final ItemType HERO_DEMON_TOTEM
  public static final ItemType HERO_DIGGER_MOLE
  public static final ItemType HERO_DOPPELGANGER
  public static final ItemType HERO_DRAGON_LADY
  public static final ItemType HERO_DRAGON_SLAYER
  public static final ItemType HERO_DRAGZILLA
  public static final ItemType HERO_DRUIDINATRIX
  public static final ItemType HERO_DUNGEON_MAN
  public static final ItemType HERO_DUST_DEVIL
  public static final ItemType HERO_DWARVEN_ARCHER
  public static final ItemType HERO_ELECTROYETI
  public static final ItemType HERO_ETERNAL_ENCHANTER
  public static final ItemType HERO_FAITH_HEALER
  public static final ItemType HERO_FORGOTTEN_DRAGON
  public static final ItemType HERO_FROST_GIANT
  public static final ItemType HERO_GENIE
  public static final ItemType HERO_GRAND_HUNTRESS
  public static final ItemType HERO_GREED_DRAGON
  public static final ItemType HERO_GROOVY_DRUID
  public static final ItemType HERO_HYDRA
  public static final ItemType HERO_KARAOKE_KING
  public static final ItemType HERO_KRAKEN_KING
  public static final ItemType HERO_LAST_DEFENDER
  public static final ItemType HERO_MAGIC_DRAGON
  public static final ItemType HERO_MEDUSA
  public static final ItemType HERO_MINOTAUR
  public static final ItemType HERO_MISTRESS_MANICURE
  public static final ItemType HERO_MOON_DRAKE
  public static final ItemType HERO_NINJA_DWARF
  public static final ItemType HERO_ORC_MONK
  public static final ItemType HERO_PCH_ANUBIS_DRAGON
  public static final ItemType HERO_PIRATE
  public static final ItemType HERO_PLAGUE_ENTREPRENEUR
  public static final ItemType HERO_PLANT_SOUL
  public static final ItemType HERO_POLEMASTER
  public static final ItemType HERO_RABID_DRAGON
  public static final ItemType HERO_RAGING_REVENANT
  public static final ItemType HERO_ROLLER_WARRIOR
  public static final ItemType HERO_SADISTIC_DANCER
  public static final ItemType HERO_SATYR
  public static final ItemType HERO_SAVAGE_CUTIE
  public static final ItemType HERO_SHADOW_ASSASSIN
  public static final ItemType HERO_SHADOW_OF_SVEN
  public static final ItemType HERO_SILENT_SPIRIT
  public static final ItemType HERO_SKELETON_KING
  public static final ItemType HERO_SNAPPER_BONE
  public static final ItemType HERO_SNAP_DRAGON
  public static final ItemType HERO_SNIPER_WOLF
  public static final ItemType HERO_SOJOURNER_SORCERESS
  public static final ItemType HERO_SPECTRAL_DRAGON
  public static final ItemType HERO_SPIDER_QUEEN
  public static final ItemType HERO_SPIKEY_DRAGON
  public static final ItemType HERO_STEPLADDER_BROTHERS
  public static final ItemType HERO_STORM_DRAGON
  public static final ItemType HERO_STOWAWAY
  public static final ItemType HERO_SUN_SEEKER
  public static final ItemType HERO_TOMB_ANGEL
  public static final ItemType HERO_TRIPLE_THREAT
  public static final ItemType HERO_UMLAUT_THE_FIRST
  public static final ItemType HERO_UNICORGI
  public static final ItemType HERO_UNRIPE_MYTHOLOGY
  public static final ItemType HERO_UNSTABLE_UNDERSTUDY
  public static final ItemType HERO_VERMILION_PRIESTESS
  public static final ItemType HERO_VILE_BILE
  public static final ItemType HERO_VOID_WYVERN
  public static final ItemType HERO_VULTURE_DRAGON
  public static final ItemType HERO_WEE_WITCH
  public static final ItemType HERO_WEREDRAGON
  public static final ItemType HERO_WHITE_TIGRESS
  public static final ItemType HERO_ZOMBIE_SQUIRE
  public static final ItemType HIGH_TEA
  public static final ItemType HIPPY_GLO_STICKS
  public static final ItemType HOLY_LANCE_OF_PLOT_ADVANCEMENT
  public static final ItemType HORNS_OF_WHITE_DEER
  public static final ItemType HOT_ARMOR
  public static final ItemType ILLUSORY_HURDLE
  public static final ItemType IMPRACTICAL_CHESTPLATE
  public static final ItemType INTIMIDATING_BEARD
  public static final ItemType IRON_CLAWS
  public static final ItemType IRON_HELMET_OF_BIKING
  public static final ItemType IRON_ORE
  public static final ItemType ITEM_INFO
  public static final ItemType IVY_LEAGUE_HAIRCUT
  public static final ItemType JAR_OF_KITTEN_TEAR
  public static final ItemType KEY_TO_THE_KINGDOM
  public static final ItemType KINDNESS
  public static final ItemType KING_JEFFS_CROSSBOW
  public static final ItemType LASER_POINTER
  public static final ItemType LASER_POINTER_2_ORDER
  public static final ItemType LASER_POINTER_3_ORDER
  public static final ItemType LASER_POINTER_4_ORDER
  public static final ItemType LAVISHLY_ADORNED_RAPIER
  public static final ItemType LAZARUS_BEANS
  public static final ItemType LEAD_ZEPPELIN
  public static final ItemType LEGENDARY_QUEST_SKIP
  public static final ItemType LENSLESS_GLASSES
  public static final ItemType LICHE_FINGER
  public static final ItemType LIFEDRINKER
  public static final ItemType LIFESIPPER
  public static final ItemType LIGER_BALM
  public static final ItemType LIGHTNING_GREASE
  public static final ItemType LION_LIQUEUR
  public static final ItemType LITTLE_PRICKS
  public static final ItemType LOADED_DIE
  public static final ItemType LOAFERS_OF_ALACRITY
  public static final ItemType LORD_OF_RIVER
  public static final ItemType LOST_CONCEPT_ART
  public static final ItemType LOST_DISK_OF_POWER
  public static final ItemType LOST_GREAVES
  public static final ItemType LUCKY_ORCS_FOOT
  public static final ItemType MACE_OF_FRIENDSHIP
  public static final ItemType MACGUFFIN_FRAGMENT_45
  public static final ItemType MAD_GODS_MUG
  public static final ItemType MAGATAMA
  public static final ItemType MAGICAL_CREAM
  public static final ItemType MAGICAL_HATRACK
  public static final ItemType MAGICAL_PEST_MAST
  public static final ItemType MAGICAL_WATER_BOTTLE
  public static final ItemType MAGIC_EIGHT_BALL
  public static final ItemType MAI_TAI_OF_IMMUNITY
  public static final ItemType MANLY_FIRST_AID_KIT
  public static final ItemType MASK_OF_THE_ANCIENT_KING
  public static final ItemType MEATY_BUTTER
  public static final ItemType MELTY_CHOCOLATE_BAR
  public static final ItemType MIND_MAP
  public static final ItemType MIRACLE_FURNACE_OF_BLACKSMITH
  public static final ItemType MITHRIL_ORE
  public static final ItemType MITHRIL_OREEAL
  public static final ItemType MJOLNIRBY
  public static final ItemType MONSTER_HUNTER_ARMOR
  public static final ItemType MOON_LIGHT
  public static final ItemType MOTIVATIONAL_CASSETTE
  public static final ItemType MUNDANE_MUSHROOMS
  public static final ItemType MUSCLE_BOUND_BOOK
  public static final ItemType MUSCLE_WAX
  public static final ItemType MUSSEL_MILK
  public static final ItemType MYSTERIOUS_EGG
  public static final ItemType MYSTICAL_ELVEN_JUNK
  public static final ItemType MY_FIRST_SHIELD
  public static final ItemType MY_JAM
  public static final ItemType NAUGHTY_TAPESTRY
  public static final ItemType NAVIGATION_TO_THE_PAST
  public static final ItemType NECRONOMICON
  public static final ItemType NEW_KNIGHT_IN_TOWN
  public static final ItemType NONSTICK_SHIELD
  public static final ItemType NUMBER_529
  public static final ItemType OFFERING_BLOOD
  public static final ItemType OFFERING_FIRE
  public static final ItemType OFFERING_HAIL
  public static final ItemType OFFERING_KEYSTONE
  public static final ItemType OFFERING_LIGHTNING
  public static final ItemType OFFERING_MAJOR_1
  public static final ItemType OFFERING_MAJOR_2
  public static final ItemType OFFERING_MINOR_1
  public static final ItemType OFFERING_MINOR_2
  public static final ItemType OFFERING_MINOR_3
  public static final ItemType OFFERING_MIST
  public static final ItemType OFFERING_OCEAN
  public static final ItemType OFFERING_RIVER
  public static final ItemType OFFERING_ROCK
  public static final ItemType OFFERING_TREE
  public static final ItemType OGRES_BATTERING_RAM
  public static final ItemType ORANGE_CHEST_ROLL_X1
  public static final ItemType ORBITAL_KITTY
  public static final ItemType ORB_OF_EVERLASTING_FLAVOR
  public static final ItemType ORGANIC_BOOK_OF_NATURE
  public static final ItemType ORNATE_CROWN_OF_THE_GM
  public static final ItemType OVERPOWERING_FRAGRANCE
  public static final ItemType PAPER_CROWN
  public static final ItemType PENETRABLE_ARMOR
  public static final ItemType PETER_PIPERS_PEPPER_SPRAY
  public static final ItemType PHAT_PANTS
  public static final ItemType PHILTER_OF_PURE_TESTOSTERONE
  public static final ItemType PHOENIX_TALISMAN
  public static final ItemType PHOTO_BOMB
  public static final ItemType PIECE_OF_ACOLYTE_STATUE
  public static final ItemType PLASTIC_VAMPIRE_TEETH
  public static final ItemType PLUCKY_HEROINES_SHORTBOW
  public static final ItemType POCKET_PROTECTOR
  public static final ItemType POISONED_DAGGER
  public static final ItemType POISONED_SILVER_ACCESSORY_OF_SCORPION
  public static final ItemType POLITICAL_PLATFORM_SHOES
  public static final ItemType PORTABLE_NUTRITIOUS_DIET
  public static final ItemType POWER_OF_SCIENCE
  public static final ItemType PRETTY_SWEET_CAPE
  public static final ItemType PRICKLING_WHIP
  public static final ItemType PRIMAL_ESSENCE
  public static final ItemType PROTEIN_POWDER
  public static final ItemType PURIFICATION_ROBE
  public static final ItemType PURIFYING_TUNING_FORK
  public static final ItemType PURPLE_CHEST_ROLL_X1
  public static final ItemType PURPLE_PILLS_OF_POTENCY
  public static final ItemType PYRAMID_POWER
  public static final ItemType RACING_STRIPES
  public static final ItemType RAID_TICKET
  public static final ItemType RATTLING_SABRE
  public static final ItemType RAW_EGG
  public static final ItemType READIN_RAIN_BOW
  public static final ItemType REEL_ADVENTURERS_RIDES
  public static final ItemType REEL_ANCIENT_CODE
  public static final ItemType REEL_ANCIENT_COIN
  public static final ItemType REEL_BAG_O_HAMMERS
  public static final ItemType REEL_BALANCE_OF_LIFE
  public static final ItemType REEL_BANANA_PEEL_MOUNTAIN
  public static final ItemType REEL_BEARLY_THERE_BOOTS
  public static final ItemType REEL_BIG_STABBY_SPEAR
  public static final ItemType REEL_BLACKBERRY_JAM
  public static final ItemType REEL_BLACKSMITH_BREW
  public static final ItemType REEL_BLACKSTEEL_BLADE
  public static final ItemType REEL_BLOODY_BAT
  public static final ItemType REEL_BLUNT_BLADE
  public static final ItemType REEL_BONE_CRUSHING_PLIERS
  public static final ItemType REEL_BOOM_BOX
  public static final ItemType REEL_BRACELET_OF_LIGHTNING
  public static final ItemType REEL_BRAIN_GUARD_9000
  public static final ItemType REEL_BUNNY_BLADE
  public static final ItemType REEL_CHUGG_BOOTS
  public static final ItemType REEL_CHUNKY_FEMUR
  public static final ItemType REEL_CLOAK_OF_THE_OWL
  public static final ItemType REEL_CLOUDY_MONOCULAR_TELESCOPE
  public static final ItemType REEL_COG_NITIVE_MASK
  public static final ItemType REEL_CRYSTAL_MUSHROOM
  public static final ItemType REEL_DANCERS_BRA
  public static final ItemType REEL_DEATH_METAL_BLADE
  public static final ItemType REEL_DECODER_RING
  public static final ItemType REEL_DEDICATED_BROZERKER
  public static final ItemType REEL_DEDICATED_CENTAUR_OF_ATTENTION
  public static final ItemType REEL_DEDICATED_COSMIC_ELF
  public static final ItemType REEL_DEDICATED_DEEP_DRAGON
  public static final ItemType REEL_DEDICATED_DEMON_TOTEM
  public static final ItemType REEL_DEDICATED_DRAGON_LADY
  public static final ItemType REEL_DEDICATED_GENIE
  public static final ItemType REEL_DEDICATED_MEDUSA
  public static final ItemType REEL_DEDICATED_NINJA_DWARF
  public static final ItemType REEL_DEDICATED_ORC_MONK
  public static final ItemType REEL_DEDICATED_ROLLER_WARRIOR
  public static final ItemType REEL_DEDICATED_SATYR
  public static final ItemType REEL_DEDICATED_SHADOW_ASSASSIN
  public static final ItemType REEL_DEDICATED_SNAP_DRAGON
  public static final ItemType REEL_DEDICATED_UNSTABLE_UNDERSTUDY
  public static final ItemType REEL_DENSE_CAKE_OF_HATE
  public static final ItemType REEL_DIPLOMATIC_IMMUNITY
  public static final ItemType REEL_DIRK_OF_DISEMBOWELING
  public static final ItemType REEL_DIRTY_BASTARD_SWORD
  public static final ItemType REEL_DRACONIAN_DISH
  public static final ItemType REEL_DRAGONS_BLADE
  public static final ItemType REEL_DRAGON_LEATHER_TIGHTS
  public static final ItemType REEL_DRAGON_SAND_BOOTS
  public static final ItemType REEL_DRAGON_SCALE
  public static final ItemType REEL_DRAGON_SCALE_GROVE
  public static final ItemType REEL_DROP_OF_MOONLIGHT
  public static final ItemType REEL_END_CENTURY_FLAME_RADIATOR
  public static final ItemType REEL_ENIDS_EXPENSIVE_ELIXIR
  public static final ItemType REEL_ESCUTCHEON_OF_EYES
  public static final ItemType REEL_EXOTIC_FAN
  public static final ItemType REEL_EXPLOSIVE_CANNON
  public static final ItemType REEL_EYE_OF_THE_BEHOLDER
  public static final ItemType REEL_EYE_ON_THE_PRIZE
  public static final ItemType REEL_FAMILY_TREE_OF_UMLAUT
  public static final ItemType REEL_FEATHER_OF_PHOENIX
  public static final ItemType REEL_FEATHER_WEIGHT_FOIL
  public static final ItemType REEL_FEATHER_WEIGHT_PAULDRONS
  public static final ItemType REEL_FINS_OF_SEA_DRAGON
  public static final ItemType REEL_FLAIL_OF_TOTAL_DEVASTATION
  public static final ItemType REEL_FLATTERING_MIRROR
  public static final ItemType REEL_FLOPPIN_FLIP_FLOPS
  public static final ItemType REEL_GIRDLE_OF_VICTORY
  public static final ItemType REEL_GLASS_CASE_OF_EMOTION
  public static final ItemType REEL_GLORY_SEEKER
  public static final ItemType REEL_GOBLIN_WHACKER
  public static final ItemType REEL_GOLD_AX_SILVER_AX
  public static final ItemType REEL_GOLD_RUSH
  public static final ItemType REEL_GOOD_SLEEPING_BED
  public static final ItemType REEL_GOURD
  public static final ItemType REEL_GREAVES_OF_PLEIAS
  public static final ItemType REEL_GRIEVOUS_BODILY_HARM
  public static final ItemType REEL_HAMMER_OF_WICKED_BEATS
  public static final ItemType REEL_HAMMER_TIME
  public static final ItemType REEL_HANDY_RASP
  public static final ItemType REEL_HEART_HAT
  public static final ItemType REEL_HEART_HEALTH_CANDY
  public static final ItemType REEL_HELMET_OF_FORESIGHT
  public static final ItemType REEL_HERMITS_PILLS
  public static final ItemType REEL_HOLY_LANCE_OF_PLOT_ADVANCEMENT
  public static final ItemType REEL_HORNS_OF_WHITE_DEER
  public static final ItemType REEL_INTIMIDATING_BEARD
  public static final ItemType REEL_IRON_HELMET_OF_BIKING
  public static final ItemType REEL_IVY_LEAGUE_HAIRCUT
  public static final ItemType REEL_JAR_OF_KITTEN_TEAR
  public static final ItemType REEL_KINDNESS
  public static final ItemType REEL_LASER_POINTER
  public static final ItemType REEL_LEAD_ZEPPELIN
  public static final ItemType REEL_LIFEDRINKER
  public static final ItemType REEL_LORD_OF_RIVER
  public static final ItemType REEL_LOST_GREAVES
  public static final ItemType REEL_LUCKY_ORCS_FOOT
  public static final ItemType REEL_MAGATAMA
  public static final ItemType REEL_MAGICAL_CREAM
  public static final ItemType REEL_MAGICAL_HATRACK
  public static final ItemType REEL_MAGICAL_PEST_MAST
  public static final ItemType REEL_MAGIC_EIGHT_BALL
  public static final ItemType REEL_MAI_TAI_OF_IMMUNITY
  public static final ItemType REEL_MASK_OF_THE_ANCIENT_KING
  public static final ItemType REEL_MIRACLE_FURNACE_OF_BLACKSMITH
  public static final ItemType REEL_MJOLNIRBY
  public static final ItemType REEL_MYSTERIOUS_EGG
  public static final ItemType REEL_MYSTICAL_ELVEN_JUNK
  public static final ItemType REEL_NAVIGATION_TO_THE_PAST
  public static final ItemType REEL_NECRONOMICON
  public static final ItemType REEL_OGRES_BATTERING_RAM
  public static final ItemType REEL_ORBITAL_KITTY
  public static final ItemType REEL_ORB_OF_EVERLASTING_FLAVOR
  public static final ItemType REEL_ORNATE_CROWN_OF_THE_GM
  public static final ItemType REEL_PIECE_OF_ACOLYTE_STATUE
  public static final ItemType REEL_PLASTIC_VAMPIRE_TEETH
  public static final ItemType REEL_POCKET_PROTECTOR
  public static final ItemType REEL_POISONED_SILVER_ACCESSORY_OF_SCORPION
  public static final ItemType REEL_PORTABLE_NUTRITIOUS_DIET
  public static final ItemType REEL_POWER_OF_SCIENCE
  public static final ItemType REEL_PRETTY_SWEET_CAPE
  public static final ItemType REEL_PURIFICATION_ROBE
  public static final ItemType REEL_PYRAMID_POWER
  public static final ItemType REEL_RATTLING_SABRE
  public static final ItemType REEL_REMOTE_COMMUNICATION_FLOWER
  public static final ItemType REEL_RING_OF_TEMPTATION
  public static final ItemType REEL_ROCKET_CLOAK
  public static final ItemType REEL_ROD_OF_WITTY_PARTY_BANTER
  public static final ItemType REEL_RUBY_FLIP_FLOPS
  public static final ItemType REEL_SAMURAI_SWORD
  public static final ItemType REEL_SANDWICH_OF_UNSURPASSED_MEATINESS
  public static final ItemType REEL_SAND_STORM
  public static final ItemType REEL_SECRET_HAND_SCROLL
  public static final ItemType REEL_SHINING_HOLY_TREE
  public static final ItemType REEL_SHINING_LIGHT_OF_FIREFLY
  public static final ItemType REEL_SHINY_BOTTLECAP
  public static final ItemType REEL_SHOES_OF_THE_MAD_GOD
  public static final ItemType REEL_SHOVEL
  public static final ItemType REEL_SHRIMPISH_CREATURE
  public static final ItemType REEL_SICK_MULLET
  public static final ItemType REEL_SIDE_OF_BACON
  public static final ItemType REEL_SOUL_FOR_POWER_VOLUME_45
  public static final ItemType REEL_SPARKLE_PONY_KEYCHAIN
  public static final ItemType REEL_SPUD_GUN
  public static final ItemType REEL_STEAM_ENGINE
  public static final ItemType REEL_SUNBLOCK_GOGGLES
  public static final ItemType REEL_SUPER_SPIKEY_SPEAR
  public static final ItemType REEL_SWORD_OF_DESPAIR
  public static final ItemType REEL_TAROT_DECK_OF_HYPERBOLE
  public static final ItemType REEL_TEN_FOOT_POLE
  public static final ItemType REEL_THE_1_RING
  public static final ItemType REEL_THE_COMPENSATOR
  public static final ItemType REEL_THE_MAD_GODS_TRIDENT
  public static final ItemType REEL_THE_POWER_OF_MEDICINE
  public static final ItemType REEL_THE_SHIELD_STOPS_YOU
  public static final ItemType REEL_THE_SPEAR_BRINGS_VICTORY
  public static final ItemType REEL_THINKING_CAP
  public static final ItemType REEL_TIGER_SALVE
  public static final ItemType REEL_TIGER_UNDERWEAR
  public static final ItemType REEL_TOME_OF_CURSED_HORTICULTURE
  public static final ItemType REEL_TOME_OF_FORBIDDEN_TRIVIA
  public static final ItemType REEL_TRIASSIC_TRINKET
  public static final ItemType REEL_UNICORN_PUKE
  public static final ItemType REEL_UPHOLSTERED_THRONE
  public static final ItemType REEL_VAMPIRE_BUNNYEARS
  public static final ItemType REEL_WARRIORS_HELMET
  public static final ItemType REEL_WRAITH_BARRIER
  public static final ItemType REEL_YODELING_SWORD
  public static final ItemType REMOTE_COMMUNICATION_FLOWER
  public static final ItemType RINGS_OF_A_FEATHER
  public static final ItemType RING_OF_FIRE
  public static final ItemType RING_OF_ILL_WILL
  public static final ItemType RING_OF_TEMPTATION
  public static final ItemType RING_OF_THE_SQUIRREL
  public static final ItemType ROBE_OF_SHARP_COMEBACKS
  public static final ItemType ROCKET_CLOAK
  public static final ItemType ROD_OF_BADASSERY
  public static final ItemType ROD_OF_TASING
  public static final ItemType ROD_OF_WITTY_PARTY_BANTER
  public static final ItemType ROLL_OF_DUCT_TAPE
  public static final ItemType RUBBER_VEST
  public static final ItemType RUBY_FLIP_FLOPS
  public static final ItemType RUNICITE_BLOCK
  public static final ItemType RUNICITE_MONOLITH
  public static final ItemType RUNICITE_SHARD
  public static final ItemType RUNICITE_SLAB
  public static final ItemType RUNICITE_STONE
  public static final ItemType SACRED_CODEX
  public static final ItemType SAMURAI_SWORD
  public static final ItemType SANDWICH_OF_UNSURPASSED_MEATINESS
  public static final ItemType SAND_STORM
  public static final ItemType SECRET_HAND_SCROLL
  public static final ItemType SELF_PRESERVER
  public static final ItemType SHARD_ADAMANTIUM_TIARA
  public static final ItemType SHARD_AGED_DRAGON_MILK
  public static final ItemType SHARD_ANCIENT_TOME_OF_OCCULT_NONSENSE
  public static final ItemType SHARD_AND_MY_AXE
  public static final ItemType SHARD_ANTI_MAGIC_SHIELD
  public static final ItemType SHARD_AXE_OF_GRATUITOUS_GUITAR_SOLOS
  public static final ItemType SHARD_BOOK_OF_IRMAC
  public static final ItemType SHARD_BOOTS_MADE_FOR_WALKIN
  public static final ItemType SHARD_BOWIE_KNIFE
  public static final ItemType SHARD_BUNNY_SLIPPERS
  public static final ItemType SHARD_CAT_O_NINE_TAILS
  public static final ItemType SHARD_COSPLAY_SWORD
  public static final ItemType SHARD_CREATINE_CACTUS
  public static final ItemType SHARD_CRUDE_SNIPPERS
  public static final ItemType SHARD_DEAD_EYE
  public static final ItemType SHARD_DEVILS_POT
  public static final ItemType SHARD_DONT_TASE_ME_BOW
  public static final ItemType SHARD_DOUBLE_AXE
  public static final ItemType SHARD_DOUBLE_BLADED_SWORD
  public static final ItemType SHARD_DRAGONS_POCKET_WATCH
  public static final ItemType SHARD_DRAGON_BLANKIE
  public static final ItemType SHARD_EXTREME_FAD_DIET
  public static final ItemType SHARD_FAMILIAR_ENERGY_TANK
  public static final ItemType SHARD_FOUR_D_GLASSES
  public static final ItemType SHARD_FRAMED_DIPLOMA
  public static final ItemType SHARD_GAUNTLET_OF_THRONE
  public static final ItemType SHARD_GENTLEMENS_CLUB
  public static final ItemType SHARD_GIANTS_GROG
  public static final ItemType SHARD_GOLDEN_SLINGSHOT
  public static final ItemType SHARD_GROUND_GEARS
  public static final ItemType SHARD_HAROLDS_HOMEMADE_HALBERD
  public static final ItemType SHARD_HEAD_BANGER
  public static final ItemType SHARD_HEALTHY_DOSE_OF_SKEPTICISM
  public static final ItemType SHARD_HEAL_AID
  public static final ItemType SHARD_HEARTY_CHEST
  public static final ItemType SHARD_HELM_OF_THE_RAGING_BEAR
  public static final ItemType SHARD_HIGH_TEA
  public static final ItemType SHARD_IMPRACTICAL_CHESTPLATE
  public static final ItemType SHARD_IRON_CLAWS
  public static final ItemType SHARD_LAZARUS_BEANS
  public static final ItemType SHARD_LENSLESS_GLASSES
  public static final ItemType SHARD_LIGER_BALM
  public static final ItemType SHARD_LIGHTNING_GREASE
  public static final ItemType SHARD_LITTLE_PRICKS
  public static final ItemType SHARD_LOST_CONCEPT_ART
  public static final ItemType SHARD_LOST_DISK_OF_POWER
  public static final ItemType SHARD_MACE_OF_FRIENDSHIP
  public static final ItemType SHARD_MACGUFFIN_FRAGMENT_45
  public static final ItemType SHARD_MAD_GODS_MUG
  public static final ItemType SHARD_MAGICAL_WATER_BOTTLE
  public static final ItemType SHARD_MANLY_FIRST_AID_KIT
  public static final ItemType SHARD_MUNDANE_MUSHROOMS
  public static final ItemType SHARD_MUSCLE_WAX
  public static final ItemType SHARD_NAUGHTY_TAPESTRY
  public static final ItemType SHARD_PETER_PIPERS_PEPPER_SPRAY
  public static final ItemType SHARD_PHAT_PANTS
  public static final ItemType SHARD_PHILTER_OF_PURE_TESTOSTERONE
  public static final ItemType SHARD_PHOENIX_TALISMAN
  public static final ItemType SHARD_PHOTO_BOMB
  public static final ItemType SHARD_POISONED_DAGGER
  public static final ItemType SHARD_PRICKLING_WHIP
  public static final ItemType SHARD_RACING_STRIPES
  public static final ItemType SHARD_REEL_ADVENTURERS_RIDES
  public static final ItemType SHARD_REEL_ANCIENT_CODE
  public static final ItemType SHARD_REEL_ANCIENT_COIN
  public static final ItemType SHARD_REEL_BALANCE_OF_LIFE
  public static final ItemType SHARD_REEL_BANANA_PEEL_MOUNTAIN
  public static final ItemType SHARD_REEL_BEARLY_THERE_BOOTS
  public static final ItemType SHARD_REEL_BIG_STABBY_SPEAR
  public static final ItemType SHARD_REEL_BLACKBERRY_JAM
  public static final ItemType SHARD_REEL_BLACKSMITH_BREW
  public static final ItemType SHARD_REEL_BLACKSTEEL_BLADE
  public static final ItemType SHARD_REEL_BLUNT_BLADE
  public static final ItemType SHARD_REEL_BONE_CRUSHING_PLIERS
  public static final ItemType SHARD_REEL_BOOM_BOX
  public static final ItemType SHARD_REEL_BRACELET_OF_LIGHTNING
  public static final ItemType SHARD_REEL_BRAIN_GUARD_9000
  public static final ItemType SHARD_REEL_BUNNY_BLADE
  public static final ItemType SHARD_REEL_CHUGG_BOOTS
  public static final ItemType SHARD_REEL_CLOAK_OF_THE_OWL
  public static final ItemType SHARD_REEL_CLOUDY_MONOCULAR_TELESCOPE
  public static final ItemType SHARD_REEL_COG_NITIVE_MASK
  public static final ItemType SHARD_REEL_CRYSTAL_MUSHROOM
  public static final ItemType SHARD_REEL_DANCERS_BRA
  public static final ItemType SHARD_REEL_DEATH_METAL_BLADE
  public static final ItemType SHARD_REEL_DECODER_RING
  public static final ItemType SHARD_REEL_DEDICATED_BROZERKER
  public static final ItemType SHARD_REEL_DEDICATED_CENTAUR_OF_ATTENTION
  public static final ItemType SHARD_REEL_DEDICATED_COSMIC_ELF
  public static final ItemType SHARD_REEL_DEDICATED_DEEP_DRAGON
  public static final ItemType SHARD_REEL_DEDICATED_DEMON_TOTEM
  public static final ItemType SHARD_REEL_DEDICATED_DRAGON_LADY
  public static final ItemType SHARD_REEL_DEDICATED_GENIE
  public static final ItemType SHARD_REEL_DEDICATED_MEDUSA
  public static final ItemType SHARD_REEL_DEDICATED_NINJA_DWARF
  public static final ItemType SHARD_REEL_DEDICATED_ORC_MONK
  public static final ItemType SHARD_REEL_DEDICATED_ROLLER_WARRIOR
  public static final ItemType SHARD_REEL_DEDICATED_SATYR
  public static final ItemType SHARD_REEL_DEDICATED_SHADOW_ASSASSIN
  public static final ItemType SHARD_REEL_DEDICATED_SNAP_DRAGON
  public static final ItemType SHARD_REEL_DEDICATED_UNSTABLE_UNDERSTUDY
  public static final ItemType SHARD_REEL_DENSE_CAKE_OF_HATE
  public static final ItemType SHARD_REEL_DIPLOMATIC_IMMUNITY
  public static final ItemType SHARD_REEL_DIRK_OF_DISEMBOWELING
  public static final ItemType SHARD_REEL_DIRTY_BASTARD_SWORD
  public static final ItemType SHARD_REEL_DRACONIAN_DISH
  public static final ItemType SHARD_REEL_DRAGONS_BLADE
  public static final ItemType SHARD_REEL_DRAGON_LEATHER_TIGHTS
  public static final ItemType SHARD_REEL_DRAGON_SAND_BOOTS
  public static final ItemType SHARD_REEL_DRAGON_SCALE
  public static final ItemType SHARD_REEL_DRAGON_SCALE_GROVE
  public static final ItemType SHARD_REEL_DROP_OF_MOONLIGHT
  public static final ItemType SHARD_REEL_END_CENTURY_FLAME_RADIATOR
  public static final ItemType SHARD_REEL_ENIDS_EXPENSIVE_ELIXIR
  public static final ItemType SHARD_REEL_ESCUTCHEON_OF_EYES
  public static final ItemType SHARD_REEL_EXOTIC_FAN
  public static final ItemType SHARD_REEL_EXPLOSIVE_CANNON
  public static final ItemType SHARD_REEL_EYE_OF_THE_BEHOLDER
  public static final ItemType SHARD_REEL_EYE_ON_THE_PRIZE
  public static final ItemType SHARD_REEL_FAMILY_TREE_OF_UMLAUT
  public static final ItemType SHARD_REEL_FEATHER_OF_PHOENIX
  public static final ItemType SHARD_REEL_FEATHER_WEIGHT_FOIL
  public static final ItemType SHARD_REEL_FEATHER_WEIGHT_PAULDRONS
  public static final ItemType SHARD_REEL_FINS_OF_SEA_DRAGON
  public static final ItemType SHARD_REEL_FLAIL_OF_TOTAL_DEVASTATION
  public static final ItemType SHARD_REEL_FLATTERING_MIRROR
  public static final ItemType SHARD_REEL_FLOPPIN_FLIP_FLOPS
  public static final ItemType SHARD_REEL_GIRDLE_OF_VICTORY
  public static final ItemType SHARD_REEL_GLASS_CASE_OF_EMOTION
  public static final ItemType SHARD_REEL_GLORY_SEEKER
  public static final ItemType SHARD_REEL_GOLD_AX_SILVER_AX
  public static final ItemType SHARD_REEL_GOLD_RUSH
  public static final ItemType SHARD_REEL_GOOD_SLEEPING_BED
  public static final ItemType SHARD_REEL_GOURD
  public static final ItemType SHARD_REEL_GREAVES_OF_PLEIAS
  public static final ItemType SHARD_REEL_GRIEVOUS_BODILY_HARM
  public static final ItemType SHARD_REEL_HAMMER_OF_WICKED_BEATS
  public static final ItemType SHARD_REEL_HAMMER_TIME
  public static final ItemType SHARD_REEL_HANDY_RASP
  public static final ItemType SHARD_REEL_HEART_HAT
  public static final ItemType SHARD_REEL_HEART_HEALTH_CANDY
  public static final ItemType SHARD_REEL_HELMET_OF_FORESIGHT
  public static final ItemType SHARD_REEL_HERMITS_PILLS
  public static final ItemType SHARD_REEL_HOLY_LANCE_OF_PLOT_ADVANCEMENT
  public static final ItemType SHARD_REEL_HORNS_OF_WHITE_DEER
  public static final ItemType SHARD_REEL_INTIMIDATING_BEARD
  public static final ItemType SHARD_REEL_IRON_HELMET_OF_BIKING
  public static final ItemType SHARD_REEL_IVY_LEAGUE_HAIRCUT
  public static final ItemType SHARD_REEL_JAR_OF_KITTEN_TEAR
  public static final ItemType SHARD_REEL_KINDNESS
  public static final ItemType SHARD_REEL_LASER_POINTER
  public static final ItemType SHARD_REEL_LEAD_ZEPPELIN
  public static final ItemType SHARD_REEL_LIFEDRINKER
  public static final ItemType SHARD_REEL_LORD_OF_RIVER
  public static final ItemType SHARD_REEL_LOST_GREAVES
  public static final ItemType SHARD_REEL_MAGATAMA
  public static final ItemType SHARD_REEL_MAGICAL_CREAM
  public static final ItemType SHARD_REEL_MAGICAL_HATRACK
  public static final ItemType SHARD_REEL_MAGICAL_PEST_MAST
  public static final ItemType SHARD_REEL_MAI_TAI_OF_IMMUNITY
  public static final ItemType SHARD_REEL_MASK_OF_THE_ANCIENT_KING
  public static final ItemType SHARD_REEL_MIRACLE_FURNACE_OF_BLACKSMITH
  public static final ItemType SHARD_REEL_MJOLNIRBY
  public static final ItemType SHARD_REEL_MYSTERIOUS_EGG
  public static final ItemType SHARD_REEL_MYSTICAL_ELVEN_JUNK
  public static final ItemType SHARD_REEL_NAVIGATION_TO_THE_PAST
  public static final ItemType SHARD_REEL_NECRONOMICON
  public static final ItemType SHARD_REEL_OGRES_BATTERING_RAM
  public static final ItemType SHARD_REEL_ORBITAL_KITTY
  public static final ItemType SHARD_REEL_ORB_OF_EVERLASTING_FLAVOR
  public static final ItemType SHARD_REEL_ORNATE_CROWN_OF_THE_GM
  public static final ItemType SHARD_REEL_PIECE_OF_ACOLYTE_STATUE
  public static final ItemType SHARD_REEL_POCKET_PROTECTOR
  public static final ItemType SHARD_REEL_POISONED_SILVER_ACCESSORY_OF_SCORPION
  public static final ItemType SHARD_REEL_PORTABLE_NUTRITIOUS_DIET
  public static final ItemType SHARD_REEL_POWER_OF_SCIENCE
  public static final ItemType SHARD_REEL_PURIFICATION_ROBE
  public static final ItemType SHARD_REEL_PYRAMID_POWER
  public static final ItemType SHARD_REEL_RATTLING_SABRE
  public static final ItemType SHARD_REEL_REMOTE_COMMUNICATION_FLOWER
  public static final ItemType SHARD_REEL_RING_OF_TEMPTATION
  public static final ItemType SHARD_REEL_ROCKET_CLOAK
  public static final ItemType SHARD_REEL_ROD_OF_WITTY_PARTY_BANTER
  public static final ItemType SHARD_REEL_RUBY_FLIP_FLOPS
  public static final ItemType SHARD_REEL_SAMURAI_SWORD
  public static final ItemType SHARD_REEL_SANDWICH_OF_UNSURPASSED_MEATINESS
  public static final ItemType SHARD_REEL_SAND_STORM
  public static final ItemType SHARD_REEL_SECRET_HAND_SCROLL
  public static final ItemType SHARD_REEL_SHINING_HOLY_TREE
  public static final ItemType SHARD_REEL_SHINING_LIGHT_OF_FIREFLY
  public static final ItemType SHARD_REEL_SHOES_OF_THE_MAD_GOD
  public static final ItemType SHARD_REEL_SHOVEL
  public static final ItemType SHARD_REEL_SHRIMPISH_CREATURE
  public static final ItemType SHARD_REEL_SICK_MULLET
  public static final ItemType SHARD_REEL_SOUL_FOR_POWER_VOLUME_45
  public static final ItemType SHARD_REEL_STEAM_ENGINE
  public static final ItemType SHARD_REEL_SUNBLOCK_GOGGLES
  public static final ItemType SHARD_REEL_SUPER_SPIKEY_SPEAR
  public static final ItemType SHARD_REEL_SWORD_OF_DESPAIR
  public static final ItemType SHARD_REEL_TAROT_DECK_OF_HYPERBOLE
  public static final ItemType SHARD_REEL_THE_1_RING
  public static final ItemType SHARD_REEL_THE_COMPENSATOR
  public static final ItemType SHARD_REEL_THE_MAD_GODS_TRIDENT
  public static final ItemType SHARD_REEL_THE_SHIELD_STOPS_YOU
  public static final ItemType SHARD_REEL_THE_SPEAR_BRINGS_VICTORY
  public static final ItemType SHARD_REEL_THINKING_CAP
  public static final ItemType SHARD_REEL_TIGER_SALVE
  public static final ItemType SHARD_REEL_TIGER_UNDERWEAR
  public static final ItemType SHARD_REEL_TOME_OF_CURSED_HORTICULTURE
  public static final ItemType SHARD_REEL_TOME_OF_FORBIDDEN_TRIVIA
  public static final ItemType SHARD_REEL_TRIASSIC_TRINKET
  public static final ItemType SHARD_REEL_UNICORN_PUKE
  public static final ItemType SHARD_REEL_UPHOLSTERED_THRONE
  public static final ItemType SHARD_REEL_WARRIORS_HELMET
  public static final ItemType SHARD_REEL_WRAITH_BARRIER
  public static final ItemType SHARD_REEL_YODELING_SWORD
  public static final ItemType SHARD_RINGS_OF_A_FEATHER
  public static final ItemType SHARD_RING_OF_FIRE
  public static final ItemType SHARD_RING_OF_ILL_WILL
  public static final ItemType SHARD_RING_OF_THE_SQUIRREL
  public static final ItemType SHARD_ROLL_OF_DUCT_TAPE
  public static final ItemType SHARD_SACRED_CODEX
  public static final ItemType SHARD_SELF_PRESERVER
  public static final ItemType SHARD_SOUL_PUPPET
  public static final ItemType SHARD_STAFF_OF_BOSS_FIGHTING
  public static final ItemType SHARD_SWEATBAND_OF_TRAINING_MONTAGES
  public static final ItemType SHARD_THE_HOLY_PAIL
  public static final ItemType SHARD_THE_HUSTLE
  public static final ItemType SHARD_THE_UGLY_STICK
  public static final ItemType SHARD_TIME_KILLER
  public static final ItemType SHARD_UNTESTED_JETPACK
  public static final ItemType SHARD_VOLATILE_SMOOTHIE
  public static final ItemType SHARD_VORPAL_BOOMERANG
  public static final ItemType SHARD_WAR_SANDALS
  public static final ItemType SHARD_WILDYS_HAT
  public static final ItemType SHARD_WIZARDY_FOR_IDIOTS
  public static final ItemType SHIMMER_DUST
  public static final ItemType SHINING_HOLY_TREE
  public static final ItemType SHINING_LIGHT_OF_FIREFLY
  public static final ItemType SHINY_BOTTLECAP
  public static final ItemType SHOES_OF_THE_MAD_GOD
  public static final ItemType SHOP_REFRESH
  public static final ItemType SHOT_IN_THE_ARM
  public static final ItemType SHOT_IN_THE_ARM_2_ORDER
  public static final ItemType SHOT_IN_THE_ARM_3_ORDER
  public static final ItemType SHOVEL
  public static final ItemType SHRIMPISH_CREATURE
  public static final ItemType SHRINE_ROLL_CRYSTAL
  public static final ItemType SHRINE_ROLL_STONE
  public static final ItemType SICK_MULLET
  public static final ItemType SIDE_OF_BACON
  public static final ItemType SILVER_CHEST_ROLL_X1
  public static final ItemType SILVER_ORE
  public static final ItemType SKIN_ABYSS_DRAGON_MASTERY
  public static final ItemType SKIN_ABYSS_DRAGON_WINTER
  public static final ItemType SKIN_ANCIENT_DWARF_MECHA
  public static final ItemType SKIN_ANGELIC_HERALD_PIGEON
  public static final ItemType SKIN_ANGEL_DRAGON_FALLEN
  public static final ItemType SKIN_ANGEL_DRAGON_USERCONTEST
  public static final ItemType SKIN_AQUATIC_MAN_MANATEE
  public static final ItemType SKIN_AQUATIC_MAN_MASTERY
  public static final ItemType SKIN_BANSHEE_BUTTON_DOLL
  public static final ItemType SKIN_BANSHEE_MASTERY
  public static final ItemType SKIN_BARDBARIAN_CHAMPION
  public static final ItemType SKIN_BARDBARIAN_EMO_FREDDIE
  public static final ItemType SKIN_BARDBARIAN_HIGHSCORE
  public static final ItemType SKIN_BARDBARIAN_MASTERY
  public static final ItemType SKIN_BARDBARIAN_WOOD_ELF
  public static final ItemType SKIN_BLACK_WING_MECHA
  public static final ItemType SKIN_BONE_DRAGON_ADAMANTIUM
  public static final ItemType SKIN_BONE_DRAGON_MASTERY
  public static final ItemType SKIN_BONE_DRAGON_PEPPERMINT
  public static final ItemType SKIN_BROZERKER_BODYGUARD
  public static final ItemType SKIN_BROZERKER_MASTERY
  public static final ItemType SKIN_BROZERKER_VEGAS_DUDE
  public static final ItemType SKIN_BROZERKER_VETERAN
  public static final ItemType SKIN_BULWARK_ANGEL_SWAN
  public static final ItemType SKIN_BURNT_ONE_VOODOO
  public static final ItemType SKIN_CATAPULT_KNIGHT_MASTERY
  public static final ItemType SKIN_CATAPULT_KNIGHT_UNICORN
  public static final ItemType SKIN_CENTAUR_OF_ATTENTION_MASTERY
  public static final ItemType SKIN_CENTAUR_RESPLENDENT
  public static final ItemType SKIN_COSMIC_ELF_ALIEN
  public static final ItemType SKIN_COSMIC_ELF_HORROR
  public static final ItemType SKIN_COSMIC_ELF_MASTERY
  public static final ItemType SKIN_COSMIC_ELF_VELVETEEN_FOX
  public static final ItemType SKIN_CRIMSON_WITCH_CRIMSON_PANDA
  public static final ItemType SKIN_CRIMSON_WITCH_CROW
  public static final ItemType SKIN_CRIMSON_WITCH_MASTERY
  public static final ItemType SKIN_CRIMSON_WITCH_SORCERESS
  public static final ItemType SKIN_CURSED_STATUE_HAWAII
  public static final ItemType SKIN_CURSED_STATUE_MEER
  public static final ItemType SKIN_CURSED_STATUE_USERCONTEST
  public static final ItemType SKIN_CYCLOPS_WIZARD_CYCLEOPS
  public static final ItemType SKIN_CYCLOPS_WIZARD_MASTERY
  public static final ItemType SKIN_CYCLOPS_WIZARD_VALENTINE
  public static final ItemType SKIN_DARK_DRACUL_FLYING_SQUIRREL
  public static final ItemType SKIN_DARK_DRACUL_HORROR
  public static final ItemType SKIN_DARK_DRACUL_MASTERY
  public static final ItemType SKIN_DARK_HORSE_MASTERY
  public static final ItemType SKIN_DARK_HORSE_MECH
  public static final ItemType SKIN_DARK_HORSE_ZEBRA
  public static final ItemType SKIN_DEEP_DRAGON_WYRM
  public static final ItemType SKIN_DEMON_TOTEM_KITTEN
  public static final ItemType SKIN_DEMON_TOTEM_MASTERY
  public static final ItemType SKIN_DOPPELGANGER_MASTERY
  public static final ItemType SKIN_DOPPELGANGER_MOLTEN
  public static final ItemType SKIN_DRAGON_LADY_3RD_ANNIVERSARY
  public static final ItemType SKIN_DRAGON_LADY_ANNIVERSARY_1000TH
  public static final ItemType SKIN_DRAGON_LADY_MASTERY
  public static final ItemType SKIN_DRAGON_LADY_SPACE_KNIGHT
  public static final ItemType SKIN_DRAGON_SLAYER_UNICORN
  public static final ItemType SKIN_DRAGON_SLAYER_WINTER
  public static final ItemType SKIN_DRAGZILLA_DRAG
  public static final ItemType SKIN_DRAGZILLA_MASTERY
  public static final ItemType SKIN_DRAGZILLA_MECHA
  public static final ItemType SKIN_DRAGZILLA_ZILLA
  public static final ItemType SKIN_DRUIDINATRIX_EASTER
  public static final ItemType SKIN_DRUIDINATRIX_MASTERY
  public static final ItemType SKIN_DRUIDINATRIX_SPRING
  public static final ItemType SKIN_DUNGEON_MAN_MASTERY
  public static final ItemType SKIN_DUNGEON_MAN_MECHA
  public static final ItemType SKIN_DUST_DEVIL_MASTERY
  public static final ItemType SKIN_DUST_DEVIL_PARISIAN
  public static final ItemType SKIN_DWARVEN_ARCHER_DWARVEN_HUNTRESS
  public static final ItemType SKIN_DWARVEN_ARCHER_MASTERY
  public static final ItemType SKIN_DWARVEN_ARCHER_ROMANTIC
  public static final ItemType SKIN_ELECTROYETI_3RD_ANNIVERSARY
  public static final ItemType SKIN_ELECTROYETI_MASTERY
  public static final ItemType SKIN_ELECTROYETI_SASQUATCH
  public static final ItemType SKIN_ETERNAL_ENCHANTER_EASTER
  public static final ItemType SKIN_ETERNAL_ENCHANTER_MASTERY
  public static final ItemType SKIN_ETERNAL_ENCHANTER_USERCONTEST
  public static final ItemType SKIN_FAITH_HEALER_CTHULU
  public static final ItemType SKIN_FAITH_HEALER_MASTERY
  public static final ItemType SKIN_FROST_GIANT_FLAMING
  public static final ItemType SKIN_FROST_GIANT_FURIOUS
  public static final ItemType SKIN_FROST_GIANT_MASTERY
  public static final ItemType SKIN_GENIE_GOLDEN
  public static final ItemType SKIN_GENIE_RANDOM_TUSKER
  public static final ItemType SKIN_GENIE_TARNISHED_DJINN
  public static final ItemType SKIN_GRAND_HUNTRESS_LEOPARD
  public static final ItemType SKIN_GROOVY_DRUID_DISCO
  public static final ItemType SKIN_GROOVY_DRUID_MASTERY
  public static final ItemType SKIN_HYDRA_MASTERY
  public static final ItemType SKIN_HYDRA_SEA_DRAGON
  public static final ItemType SKIN_KARAOKE_KING_MONKEY
  public static final ItemType SKIN_KRAKEN_KING_MASTERY
  public static final ItemType SKIN_KRAKEN_KING_MECHALORD
  public static final ItemType SKIN_LAST_DEFENDER_BUFFALO
  public static final ItemType SKIN_MAGIC_DRAGON_MASTERY
  public static final ItemType SKIN_MAGIC_DRAGON_SPAGHETTI
  public static final ItemType SKIN_MEDUSA_BLACK_MAMBA
  public static final ItemType SKIN_MEDUSA_HORROR
  public static final ItemType SKIN_MEDUSA_MASTERY
  public static final ItemType SKIN_MINOTAUR_HOLSTEIN
  public static final ItemType SKIN_MINOTAUR_MARAUDER
  public static final ItemType SKIN_MINOTAUR_MASTERY
  public static final ItemType SKIN_MISTRESS_MANICURE_BAT
  public static final ItemType SKIN_MISTRESS_MANICURE_MASTERY
  public static final ItemType SKIN_MOON_DRAKE_FESTIVE_FAIRY
  public static final ItemType SKIN_MOON_DRAKE_MASTERY
  public static final ItemType SKIN_MOON_DRAKE_MECHA
  public static final ItemType SKIN_MOON_DRAKE_USERCONTEST
  public static final ItemType SKIN_NINJA_DWARF_DATENIGHT
  public static final ItemType SKIN_NINJA_DWARF_FRIGGING_RABBIT
  public static final ItemType SKIN_NINJA_DWARF_MASTERY
  public static final ItemType SKIN_NPC_ANUBIS_DRAGON_MASTERY
  public static final ItemType SKIN_ORC_MONK_MASTERY
  public static final ItemType SKIN_ORC_MONK_MECHA
  public static final ItemType SKIN_ORC_MONK_ORCS
  public static final ItemType SKIN_ORC_MONK_UNCLE
  public static final ItemType SKIN_PCH_ANUBIS_DRAGON_MASTERY
  public static final ItemType SKIN_PIRATE_MASTERY
  public static final ItemType SKIN_PIRATE_SPACE
  public static final ItemType SKIN_PLANT_SOUL_COUNTRY
  public static final ItemType SKIN_PLANT_SOUL_HORSEY_SOUL
  public static final ItemType SKIN_PLANT_SOUL_MASTERY
  public static final ItemType SKIN_POLEMASTER_GYMNAST
  public static final ItemType SKIN_POLEMASTER_MASTERY
  public static final ItemType SKIN_RABID_DRAGON_DOGGY
  public static final ItemType SKIN_RABID_DRAGON_MASTERY
  public static final ItemType SKIN_RAGING_REVENANT_DOCTORING_REVENANT
  public static final ItemType SKIN_RAGING_REVENANT_MASTERY
  public static final ItemType SKIN_ROLLER_WARRIOR_DERBY_GIRL
  public static final ItemType SKIN_ROLLER_WARRIOR_LUAU
  public static final ItemType SKIN_ROLLER_WARRIOR_MASTERY
  public static final ItemType SKIN_ROLLER_WARRIOR_VALENTINE
  public static final ItemType SKIN_SADISTIC_DANCER_MECHA
  public static final ItemType SKIN_SADISTIC_DANCER_WINTER
  public static final ItemType SKIN_SATYR_MASTERY
  public static final ItemType SKIN_SATYR_WOLF
  public static final ItemType SKIN_SAVAGE_CUTIE_MASTERY
  public static final ItemType SKIN_SAVAGE_CUTIE_RAVAGER
  public static final ItemType SKIN_SAVAGE_CUTIE_TADPOLE
  public static final ItemType SKIN_SHADOW_ASSASSIN_MASTERY
  public static final ItemType SKIN_SHADOW_ASSASSIN_WATCH
  public static final ItemType SKIN_SHADOW_OF_SVEN_MECHA
  public static final ItemType SKIN_SILENT_SPIRIT_CLOWN
  public static final ItemType SKIN_SILENT_SPIRIT_MASTERY
  public static final ItemType SKIN_SKELETON_DEER_ASCENDANT_DEER
  public static final ItemType SKIN_SKELETON_DEER_MASTERY
  public static final ItemType SKIN_SKELETON_KING_ASCENDANT
  public static final ItemType SKIN_SKELETON_KING_MASTERY
  public static final ItemType SKIN_SNAPPER_BONE_LIZARD_BONE
  public static final ItemType SKIN_SNAP_DRAGON_EVERGLADES
  public static final ItemType SKIN_SNAP_DRAGON_MASTERY
  public static final ItemType SKIN_SNIPER_WOLF_ASTRAL_SPIRIT
  public static final ItemType SKIN_SNIPER_WOLF_DANCER
  public static final ItemType SKIN_SOJOURNER_SORCERESS_CHRISTMAS
  public static final ItemType SKIN_SPECTRAL_DRAGON_EASTER
  public static final ItemType SKIN_SPECTRAL_DRAGON_MASTERY
  public static final ItemType SKIN_SPECTRAL_DRAGON_REDDRAGON
  public static final ItemType SKIN_SPIDER_QUEEN_MASTERY
  public static final ItemType SKIN_SPIDER_QUEEN_TURTLE
  public static final ItemType SKIN_SPIKEY_DRAGON_MASTERY
  public static final ItemType SKIN_SPIKEY_DRAGON_MECHA
  public static final ItemType SKIN_SPIKEY_DRAGON_ROTUNDITY
  public static final ItemType SKIN_STEPLADDER_BROTHERS_HORROR
  public static final ItemType SKIN_STORM_DRAGON_MASTERY
  public static final ItemType SKIN_STOWAWAY_BUISNESS
  public static final ItemType SKIN_STOWAWAY_MASTERY
  public static final ItemType SKIN_STOWAWAY_SANTAS_HELPER
  public static final ItemType SKIN_SUN_SEEKER_SNOW
  public static final ItemType SKIN_TOMB_ANGEL_USERCONTEST
  public static final ItemType SKIN_TOMB_ANGEL_WINTER
  public static final ItemType SKIN_UMLAUT_THE_FIRST_MASTERY
  public static final ItemType SKIN_UNICORGI_ARMORED
  public static final ItemType SKIN_UNICORGI_MASTERY
  public static final ItemType SKIN_UNICORGI_PIZZA_MANAGER_CORGI
  public static final ItemType SKIN_UNICORGI_RAINBOW
  public static final ItemType SKIN_UNRIPE_MYTHOLOGY_WINTER
  public static final ItemType SKIN_UNSTABLE_UNDERSTUDY_3RD_ANNIVERSARY
  public static final ItemType SKIN_UNSTABLE_UNDERSTUDY_BALLERINA
  public static final ItemType SKIN_UNSTABLE_UNDERSTUDY_MASTERY
  public static final ItemType SKIN_VERMILION_PRIESTESS_CLERIC_OF_FALCONERS
  public static final ItemType SKIN_VOID_WYVERN_IMAGINATION
  public static final ItemType SKIN_VOID_WYVERN_MASTERY
  public static final ItemType SKIN_VOID_WYVERN_TAPIR
  public static final ItemType SKIN_VULTURE_DRAGON_MASTERY
  public static final ItemType SKIN_WEE_WITCH_EASTER
  public static final ItemType SKIN_WEE_WITCH_HORROR
  public static final ItemType SKIN_WEE_WITCH_MASTERY
  public static final ItemType SKIN_WEREDRAGON_FLORIST
  public static final ItemType SKIN_WEREDRAGON_MASTERY
  public static final ItemType SKIN_WHITE_TIGRESS_CAT_WOMAN
  public static final ItemType SKIN_ZOMBIE_SQUIRE_DIGITAL
  public static final ItemType SKIN_ZOMBIE_SQUIRE_MASTERY
  public static final ItemType SLIGHTLY_EVIL_MAGIC_MIRROR
  public static final ItemType SMARTY_PANTS
  public static final ItemType SNAKE_OIL
  public static final ItemType SNAZZY_VEST
  public static final ItemType SOCK_FULL_O_PENNIES
  public static final ItemType SOUL_CHEST_ROLL
  public static final ItemType SOUL_FOR_POWER_VOLUME_45
  public static final ItemType SOUL_OF_DRAGONS
  public static final ItemType SOUL_PUPPET
  public static final ItemType SPARKLE_PONY_KEYCHAIN
  public static final ItemType SPIDER_BOMB
  public static final ItemType SPUD_GUN
  public static final ItemType SREEL_FEATHER_WEIGHT_FOIL
  public static final ItemType STAFF_OF_BOSS_FIGHTING
  public static final ItemType STAMINA_CONSUMABLE
  public static final ItemType STAMINA_COST_RESET
  public static final ItemType STAY_BOARD
  public static final ItemType STEAM_ENGINE
  public static final ItemType STICK_ON_MOUSTACHE
  public static final ItemType STOLEN_SNEAKERS
  public static final ItemType STONE_ABYSS_DRAGON
  public static final ItemType STONE_ANCIENT_DWARF
  public static final ItemType STONE_ANGELIC_HERALD
  public static final ItemType STONE_ANGEL_DRAGON
  public static final ItemType STONE_AQUATIC_MAN
  public static final ItemType STONE_BANSHEE
  public static final ItemType STONE_BARDBARIAN
  public static final ItemType STONE_BLACK_WING
  public static final ItemType STONE_BONE_DRAGON
  public static final ItemType STONE_BROZERKER
  public static final ItemType STONE_BULWARK_ANGEL
  public static final ItemType STONE_BURNT_ONE
  public static final ItemType STONE_CATAPULT_KNIGHT
  public static final ItemType STONE_CENTAUR_OF_ATTENTION
  public static final ItemType STONE_CLAW_MAN
  public static final ItemType STONE_COSMIC_ELF
  public static final ItemType STONE_CRIMSON_WITCH
  public static final ItemType STONE_CURSED_STATUE
  public static final ItemType STONE_CYCLOPS_WIZARD
  public static final ItemType STONE_DARK_DRACUL
  public static final ItemType STONE_DARK_HERO
  public static final ItemType STONE_DARK_HORSE
  public static final ItemType STONE_DEEP_DRAGON
  public static final ItemType STONE_DEMON_TOTEM
  public static final ItemType STONE_DIGGER_MOLE
  public static final ItemType STONE_DOPPELGANGER
  public static final ItemType STONE_DRAGON_LADY
  public static final ItemType STONE_DRAGON_SLAYER
  public static final ItemType STONE_DRAGZILLA
  public static final ItemType STONE_DRUIDINATRIX
  public static final ItemType STONE_DUNGEON_MAN
  public static final ItemType STONE_DUST_DEVIL
  public static final ItemType STONE_DWARVEN_ARCHER
  public static final ItemType STONE_ELECTROYETI
  public static final ItemType STONE_ETERNAL_ENCHANTER
  public static final ItemType STONE_FAITH_HEALER
  public static final ItemType STONE_FORGOTTEN_DRAGON
  public static final ItemType STONE_FROST_GIANT
  public static final ItemType STONE_GENIE
  public static final ItemType STONE_GRAND_HUNTRESS
  public static final ItemType STONE_GREED_DRAGON
  public static final ItemType STONE_GROOVY_DRUID
  public static final ItemType STONE_HYDRA
  public static final ItemType STONE_KARAOKE_KING
  public static final ItemType STONE_KRAKEN_KING
  public static final ItemType STONE_LAST_DEFENDER
  public static final ItemType STONE_MAGIC_DRAGON
  public static final ItemType STONE_MEDUSA
  public static final ItemType STONE_MINOTAUR
  public static final ItemType STONE_MISTRESS_MANICURE
  public static final ItemType STONE_MOON_DRAKE
  public static final ItemType STONE_NINJA_DWARF
  public static final ItemType STONE_ORC_MONK
  public static final ItemType STONE_PCH_ANUBIS_DRAGON
  public static final ItemType STONE_PIRATE
  public static final ItemType STONE_PLAGUE_ENTREPRENEUR
  public static final ItemType STONE_PLANT_SOUL
  public static final ItemType STONE_POLEMASTER
  public static final ItemType STONE_RABID_DRAGON
  public static final ItemType STONE_RAGING_REVENANT
  public static final ItemType STONE_ROLLER_WARRIOR
  public static final ItemType STONE_SADISTIC_DANCER
  public static final ItemType STONE_SATYR
  public static final ItemType STONE_SAVAGE_CUTIE
  public static final ItemType STONE_SHADOW_ASSASSIN
  public static final ItemType STONE_SHADOW_OF_SVEN
  public static final ItemType STONE_SILENT_SPIRIT
  public static final ItemType STONE_SKELETON_KING
  public static final ItemType STONE_SNAPPER_BONE
  public static final ItemType STONE_SNAP_DRAGON
  public static final ItemType STONE_SNIPER_WOLF
  public static final ItemType STONE_SOJOURNER_SORCERESS
  public static final ItemType STONE_SPECTRAL_DRAGON
  public static final ItemType STONE_SPIDER_QUEEN
  public static final ItemType STONE_SPIKEY_DRAGON
  public static final ItemType STONE_STEPLADDER_BROTHERS
  public static final ItemType STONE_STORM_DRAGON
  public static final ItemType STONE_STOWAWAY
  public static final ItemType STONE_SUN_SEEKER
  public static final ItemType STONE_TOMB_ANGEL
  public static final ItemType STONE_TRIPLE_THREAT
  public static final ItemType STONE_UMLAUT_THE_FIRST
  public static final ItemType STONE_UNICORGI
  public static final ItemType STONE_UNRIPE_MYTHOLOGY
  public static final ItemType STONE_UNSTABLE_UNDERSTUDY
  public static final ItemType STONE_VERMILION_PRIESTESS
  public static final ItemType STONE_VILE_BILE
  public static final ItemType STONE_VOID_WYVERN
  public static final ItemType STONE_VULTURE_DRAGON
  public static final ItemType STONE_WEE_WITCH
  public static final ItemType STONE_WEREDRAGON
  public static final ItemType STONE_WHITE_TIGRESS
  public static final ItemType STONE_ZOMBIE_SQUIRE
  public static final ItemType SUNBLOCK_GOGGLES
  public static final ItemType SUPER_SPIKEY_SPEAR
  public static final ItemType SVENS_SWORD_OF_DOOOOOM
  public static final ItemType SWASH_BUCKLER
  public static final ItemType SWEATBAND_OF_TRAINING_MONTAGES
  public static final ItemType SWORDY_MCEPICPANTS
  public static final ItemType SWORD_OF_DESPAIR
  public static final ItemType TAROT_DECK_OF_HYPERBOLE
  public static final ItemType TEAM_XP_BONUS_ITEM_12_HOUR
  public static final ItemType TEAM_XP_BONUS_ITEM_24_HOUR
  public static final ItemType TEAM_XP_BONUS_ITEM_72_HOUR
  public static final ItemType TEN_FOOT_POLE
  public static final ItemType THE_1_RING
  public static final ItemType THE_COMPENSATOR
  public static final ItemType THE_HOLY_PAIL
  public static final ItemType THE_HUSTLE
  public static final ItemType THE_MAD_GODS_TRIDENT
  public static final ItemType THE_POWER_OF_MEDICINE
  public static final ItemType THE_POWER_OF_MEDICINE_2_ORDER
  public static final ItemType THE_POWER_OF_MEDICINE_3_ORDER
  public static final ItemType THE_POWER_OF_MEDICINE_4_ORDER
  public static final ItemType THE_SHIELD_STOPS_YOU
  public static final ItemType THE_SPEAR_BRINGS_VICTORY
  public static final ItemType THE_UGLY_STICK
  public static final ItemType THINKING_CAP
  public static final ItemType THONG_OF_VITALITY
  public static final ItemType TIGER_SALVE
  public static final ItemType TIGER_UNDERWEAR
  public static final ItemType TIME_KILLER
  public static final ItemType TIME_SAVER
  public static final ItemType TOME_OF_CURSED_HORTICULTURE
  public static final ItemType TOME_OF_FORBIDDEN_TRIVIA
  public static final ItemType TOME_OF_FORBIDDEN_TRIVIA_2_ORDER
  public static final ItemType TOME_OF_FORBIDDEN_TRIVIA_3_ORDER
  public static final ItemType TOME_OF_NASTY_BEHAVIOR
  public static final ItemType TRIASSIC_TRINKET
  public static final ItemType TUNNEL_VISION
  public static final ItemType UNICORN_PUKE
  public static final ItemType UNTESTED_JETPACK
  public static final ItemType UPHOLSTERED_THRONE
  public static final ItemType VAMPIRE_BUNNYEARS
  public static final ItemType VANISHING_SCROLL
  public static final ItemType VIP5_CONSUMABLE
  public static final ItemType VOID_DUST
  public static final ItemType VOLATILE_SMOOTHIE
  public static final ItemType VOLCANIC_BLADE
  public static final ItemType VOLCANIC_ORE
  public static final ItemType VORPAL_BOOMERANG
  public static final ItemType WAND_OF_GOLD_SPARKLES
  public static final ItemType WARRIORS_HELMET
  public static final ItemType WAR_SANDALS
  public static final ItemType WHITE_PICKET_SHIELD
  public static final ItemType WICKED_MULLET
  public static final ItemType WILDYS_HAT
  public static final ItemType WIZARDY_FOR_IDIOTS
  public static final ItemType WORLD_EGG
  public static final ItemType WRAITH_BARRIER
  public static final ItemType YA_VAMPIRE_SERIES
  public static final ItemType YODELING_SWORD
  private static ItemType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.ItemType(String, int)

  // Methods (3)
  public static ItemType[] valuesCached()
  public static ItemType[] values()
  public static ItemType valueOf(String)
```

## com.perblue.rpg.network.messages.ItemUpdate
```
public class ItemUpdate extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ItemUpdate1
  public Integer delta
  public ItemType type

  // Constructors (2)
  com.perblue.rpg.network.messages.ItemUpdate(a)
  com.perblue.rpg.network.messages.ItemUpdate()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.JoinGuild
```
public class JoinGuild extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = JoinGuild1
  public Long guildID

  // Constructors (2)
  com.perblue.rpg.network.messages.JoinGuild(a)
  com.perblue.rpg.network.messages.JoinGuild()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.KickFromGuild
```
public class KickFromGuild extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = KickFromGuild1
  public Long userToKick

  // Constructors (2)
  com.perblue.rpg.network.messages.KickFromGuild(a)
  com.perblue.rpg.network.messages.KickFromGuild()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.LeaveGuild
```
public class LeaveGuild extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = LeaveGuild1

  // Constructors (2)
  com.perblue.rpg.network.messages.LeaveGuild(a)
  com.perblue.rpg.network.messages.LeaveGuild()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.Lineup
```
public class Lineup extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = Lineup1
  public List lineup

  // Constructors (2)
  com.perblue.rpg.network.messages.Lineup(a)
  com.perblue.rpg.network.messages.Lineup()

  // Methods (7)
  protected boolean innerReadFieldLineup(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.LineupSummary
```
public class LineupSummary extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = LineupSummary1
  public List lineup
  public Integer power

  // Constructors (2)
  com.perblue.rpg.network.messages.LineupSummary(a)
  com.perblue.rpg.network.messages.LineupSummary()

  // Methods (7)
  protected boolean innerReadFieldLineup(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ListRecGuildsResponse
```
public class ListRecGuildsResponse extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = ListRecGuildsResponse1
  public List guilds

  // Constructors (2)
  com.perblue.rpg.network.messages.ListRecGuildsResponse(a)
  com.perblue.rpg.network.messages.ListRecGuildsResponse()

  // Methods (7)
  protected boolean innerReadFieldGuilds(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ListRecommendedGuilds
```
public class ListRecommendedGuilds extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = ListRecommendedGuilds1

  // Constructors (2)
  com.perblue.rpg.network.messages.ListRecommendedGuilds(a)
  com.perblue.rpg.network.messages.ListRecommendedGuilds()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.LoadTime
```
public class LoadTime extends com.perblue.a.a.i

  // Fields (8)
  private static final String FULL_NAME = LoadTime1
  public String deviceID
  public Long duration
  public Date endTime
  public Integer loadCount
  public Platform platform
  public String screen
  public Date startTime

  // Constructors (2)
  com.perblue.rpg.network.messages.LoadTime(a)
  com.perblue.rpg.network.messages.LoadTime()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.Logout
```
public class Logout extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = Logout1
  public Boolean inactive
  public Integer systemVolume

  // Constructors (2)
  com.perblue.rpg.network.messages.Logout(a)
  com.perblue.rpg.network.messages.Logout()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.MachinimaAction
```
public class MachinimaAction extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = MachinimaAction1
  public MachinimaActionType actionType
  public Long characterID
  public String params

  // Constructors (2)
  com.perblue.rpg.network.messages.MachinimaAction(a)
  com.perblue.rpg.network.messages.MachinimaAction()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.MachinimaActionType
```
public final enum MachinimaActionType extends java.lang.Enum

  // Fields (6)
  private static final MachinimaActionType[] $VALUES
  public static final MachinimaActionType HEAD_TRACKING_MODE
  public static final MachinimaActionType MOVE
  public static final MachinimaActionType PLAY_ANIMATION
  public static final MachinimaActionType ROTATE_HEAD
  private static MachinimaActionType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.MachinimaActionType(String, int)

  // Methods (3)
  public static MachinimaActionType[] valuesCached()
  public static MachinimaActionType[] values()
  public static MachinimaActionType valueOf(String)
```

## com.perblue.rpg.network.messages.MailExtra
```
public class MailExtra extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = MailExtra1
  public List attachments
  public Map data
  public Map itemAttachments
  public Boolean opened
  public Map resourceAttachments

  // Constructors (2)
  com.perblue.rpg.network.messages.MailExtra(a)
  com.perblue.rpg.network.messages.MailExtra()

  // Methods (10)
  protected boolean innerReadFieldAttachments(a)
  protected boolean innerReadFieldData(a)
  protected boolean innerReadFieldResourceAttachments(a)
  protected boolean innerReadFieldItemAttachments(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.MailExtraDataType
```
public final enum MailExtraDataType extends java.lang.Enum

  // Fields (27)
  private static final MailExtraDataType[] $VALUES
  public static final MailExtraDataType BUILD_SOURCE
  public static final MailExtraDataType CUSTOM_BUTTON_DEST
  public static final MailExtraDataType CUSTOM_BUTTON_TEXT
  public static final MailExtraDataType CUSTOM_ICON
  public static final MailExtraDataType CUSTOM_MESSAGE
  public static final MailExtraDataType CUSTOM_SENDER
  public static final MailExtraDataType CUSTOM_SUBJECT
  public static final MailExtraDataType DEFAULT
  public static final MailExtraDataType DURATION
  public static final MailExtraDataType INDEX
  public static final MailExtraDataType IS_EVENT
  public static final MailExtraDataType IS_OFFENSE
  public static final MailExtraDataType IS_WIN
  public static final MailExtraDataType LEAGUE
  public static final MailExtraDataType PLATFORM
  public static final MailExtraDataType PLAYER_NAME
  public static final MailExtraDataType RANK
  public static final MailExtraDataType RANK_DELTA
  public static final MailExtraDataType REASON
  public static final MailExtraDataType REASON_SUB_1
  public static final MailExtraDataType REASON_SUB_2
  public static final MailExtraDataType SKIP_NEW_USERS
  public static final MailExtraDataType TEAM_LEVEL
  public static final MailExtraDataType UNIT_TYPE
  public static final MailExtraDataType VIP_LEVEL
  private static MailExtraDataType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.MailExtraDataType(String, int)

  // Methods (3)
  public static MailExtraDataType[] valuesCached()
  public static MailExtraDataType[] values()
  public static MailExtraDataType valueOf(String)
```

## com.perblue.rpg.network.messages.MailMessage
```
public class MailMessage extends com.perblue.a.a.i

  // Fields (11)
  private static final String FULL_NAME = MailMessage1
  public Long expiration
  public MailExtra extra
  public String fromSender
  public Long iD
  public String message
  public Boolean opened
  public Boolean persistent
  public Long sentDate
  public String subject
  public MailType type

  // Constructors (2)
  com.perblue.rpg.network.messages.MailMessage()
  com.perblue.rpg.network.messages.MailMessage(a)

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  protected boolean innerReadFieldExtra(a)
  public String toString()
```

## com.perblue.rpg.network.messages.MailMessageUpdate
```
public class MailMessageUpdate extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = MailMessageUpdate1
  public List mailMessages

  // Constructors (2)
  com.perblue.rpg.network.messages.MailMessageUpdate(a)
  com.perblue.rpg.network.messages.MailMessageUpdate()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldMailMessages(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.MailType
```
public final enum MailType extends java.lang.Enum

  // Fields (34)
  private static final MailType[] $VALUES
  public static final MailType CHAT_SILENCE
  public static final MailType COLISEUM_DEFEAT
  public static final MailType COLISEUM_DEFENSE
  public static final MailType COLISEUM_MERGE
  public static final MailType COLISEUM_REWARDS
  public static final MailType COLISEUM_SPLIT
  public static final MailType CONTEST_PROGRESS_REWARD
  public static final MailType CONTEST_RANK_REWARD
  public static final MailType CRYPT_RAID_REWARDS
  public static final MailType DEFAULT
  public static final MailType FIGHT_PIT_DEFEAT
  public static final MailType FIGHT_PIT_DEFENSE
  public static final MailType FIGHT_PIT_MERGE
  public static final MailType FIGHT_PIT_NEW_BEST
  public static final MailType FIGHT_PIT_REWARDS
  public static final MailType FIGHT_PIT_SPLIT
  public static final MailType GLOBAL
  public static final MailType GUILD_GIFT_REWARD
  public static final MailType GUILD_WAR_BATTLE_REWARDS
  public static final MailType MERCENARY_HIRED
  public static final MailType MERCENARY_NOT_HIRED
  public static final MailType NEW_USER_REWARDS
  public static final MailType NEW_USER_TIPS
  public static final MailType NEW_USER_WELCOME
  public static final MailType PROMO_CODE_MONEY
  public static final MailType PROMO_CODE_REWARD
  public static final MailType SPECIAL_EVENT_FIRST_DAILY_PURCHASE
  public static final MailType SPECIAL_EVENT_TEAM_LEVEL_CHALLENGE
  public static final MailType SYSTEM_MESSAGE
  public static final MailType VIP_BONUS_DIAMONDS
  public static final MailType VIP_FREE_ITEM
  public static final MailType VIP_TRIAL
  private static MailType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.MailType(String, int)

  // Methods (3)
  public static MailType[] valuesCached()
  public static MailType[] values()
  public static MailType valueOf(String)
```

## com.perblue.rpg.network.messages.MercenaryHeroData
```
public class MercenaryHeroData extends com.perblue.a.a.i

  // Fields (9)
  private static final String FULL_NAME = MercenaryHeroData1
  public Integer cost
  public Map costs
  public HeroData heroData
  public Long hireTime
  public Map hireTimes
  public Long ownerID
  public String ownerName
  public Long postTime

  // Constructors (2)
  com.perblue.rpg.network.messages.MercenaryHeroData(a)
  com.perblue.rpg.network.messages.MercenaryHeroData()

  // Methods (9)
  protected boolean innerReadFieldHireTimes(a)
  protected boolean innerReadFieldCosts(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldHeroData(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.MerchantData
```
public class MerchantData extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = MerchantData1
  public Long cooldownEnd
  public Long expiration
  public List inventory
  public Long nextAutoRefresh
  public Boolean permUnlocked
  public Integer staminaMemory

  // Constructors (2)
  com.perblue.rpg.network.messages.MerchantData(a)
  com.perblue.rpg.network.messages.MerchantData()

  // Methods (7)
  protected boolean innerReadFieldInventory(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.MerchantItemData
```
public class MerchantItemData extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = MerchantItemData1
  public Integer cost
  public ResourceType currency
  public RewardDrop item
  public ItemType oldItem
  public Integer oldQuantity
  public Boolean purchased

  // Constructors (2)
  com.perblue.rpg.network.messages.MerchantItemData(a)
  com.perblue.rpg.network.messages.MerchantItemData()

  // Methods (7)
  protected boolean innerReadFieldItem(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.MerchantType
```
public final enum MerchantType extends java.lang.Enum

  // Fields (13)
  private static final MerchantType[] $VALUES
  public static final MerchantType BAZAAR
  public static final MerchantType BLACK_MARKET
  public static final MerchantType COLISEUM
  public static final MerchantType DEFAULT
  public static final MerchantType EXPEDITIONS
  public static final MerchantType FIGHT_PIT
  public static final MerchantType GUILD
  public static final MerchantType GUILD_WAR
  public static final MerchantType NORMAL
  public static final MerchantType PEDDLER
  public static final MerchantType SOULMART
  private static MerchantType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.MerchantType(String, int)

  // Methods (3)
  public static MerchantType[] valuesCached()
  public static MerchantType[] values()
  public static MerchantType valueOf(String)
```

## com.perblue.rpg.network.messages.MerchantUpdate
```
public class MerchantUpdate extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = MerchantUpdate1
  public MerchantData data
  public MerchantType type

  // Constructors (2)
  com.perblue.rpg.network.messages.MerchantUpdate(a)
  com.perblue.rpg.network.messages.MerchantUpdate()

  // Methods (7)
  protected boolean innerReadFieldData(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.MessageFactory
```
public class MessageFactory implements com.perblue.a.a.j

  // Fields (2)
  private static final MessageFactory instance
  private static final Map messageIndex

  // Constructors (1)
  com.perblue.rpg.network.messages.MessageFactory()

  // Methods (2)
  public i readMessage(a)
  public static MessageFactory getInstance()
```

## com.perblue.rpg.network.messages.MultipleHeroLineupType
```
public final enum MultipleHeroLineupType extends java.lang.Enum

  // Fields (4)
  private static final MultipleHeroLineupType[] $VALUES
  public static final MultipleHeroLineupType COLISEUM_ATTACK
  public static final MultipleHeroLineupType COLISEUM_DEFENSE
  private static MultipleHeroLineupType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.MultipleHeroLineupType(String, int)

  // Methods (3)
  public static MultipleHeroLineupType[] valuesCached()
  public static MultipleHeroLineupType[] values()
  public static MultipleHeroLineupType valueOf(String)
```

## com.perblue.rpg.network.messages.MultipleHeroLineupUpdate
```
public class MultipleHeroLineupUpdate extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = MultipleHeroLineupUpdate1
  public Map heroLineups
  public MultipleHeroLineupType multipleHeroLineupType

  // Constructors (2)
  com.perblue.rpg.network.messages.MultipleHeroLineupUpdate(a)
  com.perblue.rpg.network.messages.MultipleHeroLineupUpdate()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldHeroLineups(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.NodeReward
```
public class NodeReward extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = NodeReward1
  public List rewardDrops

  // Constructors (2)
  com.perblue.rpg.network.messages.NodeReward(a)
  com.perblue.rpg.network.messages.NodeReward()

  // Methods (7)
  protected boolean innerReadFieldRewardDrops(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.Notification
```
public class Notification extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = Notification1
  public String displayString

  // Constructors (2)
  com.perblue.rpg.network.messages.Notification(a)
  com.perblue.rpg.network.messages.Notification()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.OfferingPackageType
```
public final enum OfferingPackageType extends java.lang.Enum

  // Fields (6)
  private static final OfferingPackageType[] $VALUES
  public static final OfferingPackageType DEFAULT
  public static final OfferingPackageType SET_FOUR_PACK
  public static final OfferingPackageType SET_TWO_PACK
  public static final OfferingPackageType SLOT_SIX_PACK
  private static OfferingPackageType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.OfferingPackageType(String, int)

  // Methods (3)
  public static OfferingPackageType[] valuesCached()
  public static OfferingPackageType[] values()
  public static OfferingPackageType valueOf(String)
```

## com.perblue.rpg.network.messages.OpenExpeditionChest
```
public class OpenExpeditionChest extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = OpenExpeditionChest1
  public List rewardDrops

  // Constructors (2)
  com.perblue.rpg.network.messages.OpenExpeditionChest(a)
  com.perblue.rpg.network.messages.OpenExpeditionChest()

  // Methods (7)
  protected boolean innerReadFieldRewardDrops(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.OpenGLExtensions
```
public class OpenGLExtensions extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = OpenGLExtensions1
  public String phoneModel
  public List types

  // Constructors (2)
  com.perblue.rpg.network.messages.OpenGLExtensions(a)
  com.perblue.rpg.network.messages.OpenGLExtensions()

  // Methods (7)
  protected boolean innerReadFieldTypes(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.PMRoomSummary
```
public class PMRoomSummary extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = PMRoomSummary1
  public Long newestMessageTime
  public Integer unreadCount
  public BasicUserInfo userInfo

  // Constructors (2)
  com.perblue.rpg.network.messages.PMRoomSummary()
  com.perblue.rpg.network.messages.PMRoomSummary(a)

  // Methods (8)
  protected boolean innerReadFieldUserInfo_Avatar(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldUserInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.PMThread
```
public class PMThread extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = PMThread1
  public List chats
  public BasicGuildInfo otherUserGuildInfo
  public BasicUserInfo otherUserInfo

  // Constructors (2)
  com.perblue.rpg.network.messages.PMThread()
  com.perblue.rpg.network.messages.PMThread(a)

  // Methods (10)
  protected boolean innerReadFieldOtherUserGuildInfo(a)
  protected boolean innerReadFieldChats(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldOtherUserInfo(a)
  protected boolean innerReadFieldOtherUserInfo_Avatar(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.PMThreadHideChannel
```
public class PMThreadHideChannel extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = PMThreadHideChannel1
  public Long otherUser

  // Constructors (2)
  com.perblue.rpg.network.messages.PMThreadHideChannel(a)
  com.perblue.rpg.network.messages.PMThreadHideChannel()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.PPEEvent
```
public final enum PPEEvent extends java.lang.Enum

  // Fields (8)
  private static final PPEEvent[] $VALUES
  public static final PPEEvent DEFAULT
  public static final PPEEvent DEFEAT_1_1
  public static final PPEEvent TL10
  public static final PPEEvent TL15
  public static final PPEEvent TL5
  public static final PPEEvent TL7
  private static PPEEvent[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.PPEEvent(String, int)

  // Methods (3)
  public static PPEEvent[] valuesCached()
  public static PPEEvent[] values()
  public static PPEEvent valueOf(String)
```

## com.perblue.rpg.network.messages.PerfReport
```
public class PerfReport extends com.perblue.a.a.i

  // Fields (10)
  private static final String FULL_NAME = PerfReport1
  public Integer avgFPS
  public Integer avgISODrawCalls
  public Integer avgUIDrawCalls
  public String lowPerfMode
  public String measurementName
  public String phoneModel
  public Integer reportNumber
  public Integer shortClientVersion
  public Float slowFrameRatio

  // Constructors (2)
  com.perblue.rpg.network.messages.PerfReport(a)
  com.perblue.rpg.network.messages.PerfReport()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.PersonalMessageExtra
```
public class PersonalMessageExtra extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = PersonalMessageExtra1
  public ChatExtra chatData
  public Long friendReceiverID
  public ChatType type

  // Constructors (2)
  com.perblue.rpg.network.messages.PersonalMessageExtra(a)
  com.perblue.rpg.network.messages.PersonalMessageExtra()

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldChatData(a)
  protected boolean innerReadFieldChatData_Heroes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.Ping
```
public class Ping extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = Ping1
  public Long serverDelay
  public Long serverReceive
  public Long serverTime
  public Long timestamp

  // Constructors (2)
  com.perblue.rpg.network.messages.Ping(a)
  com.perblue.rpg.network.messages.Ping()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.Platform
```
public final enum Platform extends java.lang.Enum

  // Fields (7)
  private static final Platform[] $VALUES
  public static final Platform ANDROID
  public static final Platform DEFAULT
  public static final Platform IPAD
  public static final Platform IPHONE
  public static final Platform WEB
  private static Platform[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.Platform(String, int)

  // Methods (3)
  public static Platform[] valuesCached()
  public static Platform[] values()
  public static Platform valueOf(String)
```

## com.perblue.rpg.network.messages.PlayerArenaRankings
```
public class PlayerArenaRankings extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = PlayerArenaRankings1
  public RankType rankType
  public List topPlayers
  public ArenaRankingRow yourInfo

  // Constructors (2)
  com.perblue.rpg.network.messages.PlayerArenaRankings(a)
  com.perblue.rpg.network.messages.PlayerArenaRankings()

  // Methods (9)
  protected boolean innerReadFieldYourInfo(a)
  protected boolean innerReadFieldYourInfo_PlayerRow(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldTopPlayers(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.PlayerGuildRow
```
public class PlayerGuildRow extends com.perblue.a.a.i

  // Fields (16)
  private static final String FULL_NAME = PlayerGuildRow1
  public Integer coliseumDivision
  public List coliseumLineups
  public Integer coliseumRank
  public ArenaTier coliseumTier
  public Integer coliseumVictories
  public Integer fightPitDivision
  public List fightPitLineup
  public Integer fightPitRank
  public ArenaTier fightPitTier
  public Integer fightPitVictories
  public Integer forHireGoldEarned
  public List forHireHeroes
  public Long joinGuildTime
  public PlayerRow playerRow
  public List topHeroes

  // Constructors (2)
  com.perblue.rpg.network.messages.PlayerGuildRow(a)
  com.perblue.rpg.network.messages.PlayerGuildRow()

  // Methods (13)
  protected boolean innerReadFieldPlayerRow(a)
  protected boolean innerReadFieldPlayerRow_Info(a)
  protected boolean innerReadFieldPlayerRow_GuildInfo(a)
  protected boolean innerReadFieldTopHeroes(a)
  protected boolean innerReadFieldForHireHeroes(a)
  protected boolean innerReadFieldFightPitLineup(a)
  protected boolean innerReadFieldColiseumLineups(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.PlayerRankings
```
public class PlayerRankings extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = PlayerRankings1
  public RankType rankType
  public List topPlayers
  public Integer yourRank

  // Constructors (2)
  com.perblue.rpg.network.messages.PlayerRankings(a)
  com.perblue.rpg.network.messages.PlayerRankings()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldTopPlayers(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.PlayerRow
```
public class PlayerRow extends com.perblue.a.a.i

  // Fields (9)
  private static final String FULL_NAME = PlayerRow1
  public BasicGuildInfo guildInfo
  public BasicUserInfo info
  public Integer teamPower
  public Integer teamPowerRank
  public Integer totalPower
  public Integer totalPowerRank
  public Integer totalStars
  public Integer totalStarsRank

  // Constructors (2)
  com.perblue.rpg.network.messages.PlayerRow(a)
  com.perblue.rpg.network.messages.PlayerRow()

  // Methods (9)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldGuildInfo(a)
  protected boolean innerReadFieldInfo_Avatar(a)
  protected boolean innerReadFieldInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.PlayerTempleRow
```
public class PlayerTempleRow extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = PlayerTempleRow1
  public List attempts
  public Boolean invited
  public PlayerRow playerRow
  public Integer templeInvites
  public Integer titansKilled

  // Constructors (2)
  com.perblue.rpg.network.messages.PlayerTempleRow(a)
  com.perblue.rpg.network.messages.PlayerTempleRow()

  // Methods (10)
  protected boolean innerReadFieldPlayerRow(a)
  protected boolean innerReadFieldPlayerRow_Info(a)
  protected boolean innerReadFieldPlayerRow_GuildInfo(a)
  protected boolean innerReadFieldAttempts(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.PossibleChestDrops
```
public class PossibleChestDrops extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = PossibleChestDrops1
  public List bronzeDrops
  public Long endTime
  public String gold10xGuarantee
  public List goldDailyDrops
  public RewardDrop goldMonthlyDrop

  // Constructors (2)
  com.perblue.rpg.network.messages.PossibleChestDrops(a)
  com.perblue.rpg.network.messages.PossibleChestDrops()

  // Methods (9)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldBronzeDrops(a)
  protected boolean innerReadFieldGoldMonthlyDrop(a)
  protected boolean innerReadFieldGoldDailyDrops(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.PrivateUserInfo
```
public class PrivateUserInfo extends com.perblue.a.a.i

  // Fields (11)
  private static final String FULL_NAME = PrivateUserInfo1
  public String email
  public Long facebookID
  public String facebookName
  public String gameCenterID
  public String gameCenterName
  public String gameCircleID
  public String gameCircleName
  public String googlePlusID
  public String googlePlusName
  public String zendeskUserToken

  // Constructors (2)
  com.perblue.rpg.network.messages.PrivateUserInfo(a)
  com.perblue.rpg.network.messages.PrivateUserInfo()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.PromoteToOfficer
```
public class PromoteToOfficer extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = PromoteToOfficer1
  public GuildRole currentClientRole
  public Long userToPromote

  // Constructors (2)
  com.perblue.rpg.network.messages.PromoteToOfficer(a)
  com.perblue.rpg.network.messages.PromoteToOfficer()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.PurchaseMerchantItem
```
public class PurchaseMerchantItem extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = PurchaseMerchantItem1
  public Integer expectedCost
  public Integer expectedQuantity
  public RewardDrop itemToPurchase
  public MerchantType merchantType
  public Integer typeIndex

  // Constructors (2)
  com.perblue.rpg.network.messages.PurchaseMerchantItem(a)
  com.perblue.rpg.network.messages.PurchaseMerchantItem()

  // Methods (7)
  protected boolean innerReadFieldItemToPurchase(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RaidAllTicketResults
```
public class RaidAllTicketResults extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = RaidAllTicketResults1
  public List results

  // Constructors (2)
  com.perblue.rpg.network.messages.RaidAllTicketResults(a)
  com.perblue.rpg.network.messages.RaidAllTicketResults()

  // Methods (7)
  protected boolean innerReadFieldResults(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RaidOutcome
```
public class RaidOutcome extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = RaidOutcome1
  public Integer expEarned
  public Integer goldEarned
  public List loot
  public List memoryChanges

  // Constructors (2)
  com.perblue.rpg.network.messages.RaidOutcome(a)
  com.perblue.rpg.network.messages.RaidOutcome()

  // Methods (8)
  protected boolean innerReadFieldMemoryChanges(a)
  protected boolean innerReadFieldLoot(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RaidTicketResults
```
public class RaidTicketResults extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = RaidTicketResults1
  public List bonusItems
  public CampaignType campaignType
  public Integer chapter
  public Integer level
  public List outcomes

  // Constructors (2)
  com.perblue.rpg.network.messages.RaidTicketResults(a)
  com.perblue.rpg.network.messages.RaidTicketResults()

  // Methods (8)
  protected boolean innerReadFieldBonusItems(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldOutcomes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RandomSeedType
```
public final enum RandomSeedType extends java.lang.Enum

  // Fields (49)
  private static final RandomSeedType[] $VALUES
  public static final RandomSeedType ALCHEMY
  public static final RandomSeedType BOSS_PIT_LOOT
  public static final RandomSeedType CHEST
  public static final RandomSeedType CHEST_EVENT_1
  public static final RandomSeedType CHEST_EVENT_10
  public static final RandomSeedType CHEST_GOLD_1
  public static final RandomSeedType CHEST_GOLD_10
  public static final RandomSeedType CHEST_ORANGE_1
  public static final RandomSeedType CHEST_ORANGE_10
  public static final RandomSeedType CHEST_PURPLE_1
  public static final RandomSeedType CHEST_PURPLE_10
  public static final RandomSeedType CHEST_SILVER_1
  public static final RandomSeedType CHEST_SILVER_10
  public static final RandomSeedType CHEST_SOUL
  public static final RandomSeedType COLISEUM
  public static final RandomSeedType COMBAT
  public static final RandomSeedType CRYPT_RAID
  public static final RandomSeedType DEFAULT
  public static final RandomSeedType DIFFICULTY_MODE_LOOT
  public static final RandomSeedType EXPEDITION_CHEST
  public static final RandomSeedType FIGHT_PIT
  public static final RandomSeedType GUILD_WAR
  public static final RandomSeedType GUILD_WAR_REWARDS
  public static final RandomSeedType LOOT
  public static final RandomSeedType MERCHANT
  public static final RandomSeedType RUNES
  public static final RandomSeedType SHRINE_CRYSTAL_KEYSTONE
  public static final RandomSeedType SHRINE_CRYSTAL_MAJOR_1
  public static final RandomSeedType SHRINE_CRYSTAL_MAJOR_2
  public static final RandomSeedType SHRINE_CRYSTAL_MINOR_1
  public static final RandomSeedType SHRINE_CRYSTAL_MINOR_2
  public static final RandomSeedType SHRINE_CRYSTAL_MINOR_3
  public static final RandomSeedType SHRINE_STONE_DEFAULT
  public static final RandomSeedType SHRINE_STONE_KEYSTONE
  public static final RandomSeedType SHRINE_STONE_MAJOR_1
  public static final RandomSeedType SHRINE_STONE_MAJOR_2
  public static final RandomSeedType SHRINE_STONE_MINOR_1
  public static final RandomSeedType SHRINE_STONE_MINOR_2
  public static final RandomSeedType SHRINE_STONE_MINOR_3
  public static final RandomSeedType SHRINE_WOODEN_DEFAULT
  public static final RandomSeedType SHRINE_WOODEN_KEYSTONE
  public static final RandomSeedType SHRINE_WOODEN_MAJOR_1
  public static final RandomSeedType SHRINE_WOODEN_MAJOR_2
  public static final RandomSeedType SHRINE_WOODEN_MINOR_1
  public static final RandomSeedType SHRINE_WOODEN_MINOR_2
  public static final RandomSeedType SHRINE_WOODEN_MINOR_3
  public static final RandomSeedType TITAN_TEMPLE
  private static RandomSeedType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.RandomSeedType(String, int)

  // Methods (3)
  public static RandomSeedType[] valuesCached()
  public static RandomSeedType[] values()
  public static RandomSeedType valueOf(String)
```

## com.perblue.rpg.network.messages.RankType
```
public final enum RankType extends java.lang.Enum

  // Fields (9)
  private static final RankType[] $VALUES
  public static final RankType BIRTHDAY
  public static final RankType COLISEUM
  public static final RankType DEFAULT
  public static final RankType FIGHT_PIT
  public static final RankType TEAM_POWER
  public static final RankType TOTAL_POWER
  public static final RankType TOTAL_STARS
  private static RankType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.RankType(String, int)

  // Methods (3)
  public static RankType[] valuesCached()
  public static RankType[] values()
  public static RankType valueOf(String)
```

## com.perblue.rpg.network.messages.Rarity
```
public final enum Rarity extends java.lang.Enum

  // Fields (29)
  private static final Rarity[] $VALUES
  public static final Rarity BLUE
  public static final Rarity BLUE_1
  public static final Rarity BLUE_2
  public static final Rarity CYAN
  public static final Rarity CYAN_1
  public static final Rarity CYAN_2
  public static final Rarity CYAN_3
  public static final Rarity CYAN_4
  public static final Rarity DEFAULT
  public static final Rarity GREEN
  public static final Rarity GREEN_1
  public static final Rarity ORANGE
  public static final Rarity ORANGE_1
  public static final Rarity ORANGE_2
  public static final Rarity ORANGE_3
  public static final Rarity ORANGE_4
  public static final Rarity ORANGE_5
  public static final Rarity ORANGE_6
  public static final Rarity ORANGE_7
  public static final Rarity ORANGE_8
  public static final Rarity PURPLE
  public static final Rarity PURPLE_1
  public static final Rarity PURPLE_2
  public static final Rarity PURPLE_3
  public static final Rarity PURPLE_4
  public static final Rarity RED
  public static final Rarity WHITE
  private static Rarity[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.Rarity(String, int)

  // Methods (3)
  public static Rarity[] valuesCached()
  public static Rarity[] values()
  public static Rarity valueOf(String)
```

## com.perblue.rpg.network.messages.ReconnectionComplete
```
public class ReconnectionComplete extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = ReconnectionComplete1

  // Constructors (2)
  com.perblue.rpg.network.messages.ReconnectionComplete(a)
  com.perblue.rpg.network.messages.ReconnectionComplete()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RedeemCodeResponse
```
public class RedeemCodeResponse extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = RedeemCodeResponse1
  public String actualCode
  public Integer minPurchaseInCents
  public RedeemCodeStatus status

  // Constructors (2)
  com.perblue.rpg.network.messages.RedeemCodeResponse(a)
  com.perblue.rpg.network.messages.RedeemCodeResponse()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RedeemCodeStatus
```
public final enum RedeemCodeStatus extends java.lang.Enum

  // Fields (7)
  private static final RedeemCodeStatus[] $VALUES
  public static final RedeemCodeStatus ALREADY_REDEEMED
  public static final RedeemCodeStatus EXPIRED
  public static final RedeemCodeStatus INVALID
  public static final RedeemCodeStatus SUCCESS_IMMEDIATE
  public static final RedeemCodeStatus SUCCESS_MONEY
  private static RedeemCodeStatus[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.RedeemCodeStatus(String, int)

  // Methods (3)
  public static RedeemCodeStatus[] valuesCached()
  public static RedeemCodeStatus[] values()
  public static RedeemCodeStatus valueOf(String)
```

## com.perblue.rpg.network.messages.ReferralTracking
```
public class ReferralTracking extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ReferralTracking1
  public String deviceID
  public String referalData

  // Constructors (2)
  com.perblue.rpg.network.messages.ReferralTracking(a)
  com.perblue.rpg.network.messages.ReferralTracking()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RemoveChat
```
public class RemoveChat extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = RemoveChat1
  public Long chatID
  public ChatRoomType room

  // Constructors (2)
  com.perblue.rpg.network.messages.RemoveChat(a)
  com.perblue.rpg.network.messages.RemoveChat()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RemoveInProgressCryptAttack
```
public class RemoveInProgressCryptAttack extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = RemoveInProgressCryptAttack1
  public Integer rank

  // Constructors (2)
  com.perblue.rpg.network.messages.RemoveInProgressCryptAttack(a)
  com.perblue.rpg.network.messages.RemoveInProgressCryptAttack()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RemoveInProgressTempleAttack
```
public class RemoveInProgressTempleAttack extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = RemoveInProgressTempleAttack1
  public Boolean killed
  public BasicUserInfo killedByUser
  public Long templeID
  public UnitType titan

  // Constructors (2)
  com.perblue.rpg.network.messages.RemoveInProgressTempleAttack(a)
  com.perblue.rpg.network.messages.RemoveInProgressTempleAttack()

  // Methods (8)
  protected boolean innerReadFieldKilledByUser_Avatar(a)
  protected boolean innerReadFieldKilledByUser(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.Replay
```
public class Replay extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = Replay1
  public Integer combatEndTick
  public Integer combatStartTick

  // Constructors (2)
  com.perblue.rpg.network.messages.Replay(a)
  com.perblue.rpg.network.messages.Replay()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ReplayKitEnded
```
public class ReplayKitEnded extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ReplayKitEnded1
  public Long recordingDuration
  public String screen

  // Constructors (2)
  com.perblue.rpg.network.messages.ReplayKitEnded(a)
  com.perblue.rpg.network.messages.ReplayKitEnded()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ReplayKitStarted
```
public class ReplayKitStarted extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = ReplayKitStarted1
  public String screen

  // Constructors (2)
  com.perblue.rpg.network.messages.ReplayKitStarted(a)
  com.perblue.rpg.network.messages.ReplayKitStarted()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RequestChestAcknowledgement
```
public class RequestChestAcknowledgement extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = RequestChestAcknowledgement1
  public Map seeds

  // Constructors (2)
  com.perblue.rpg.network.messages.RequestChestAcknowledgement(a)
  com.perblue.rpg.network.messages.RequestChestAcknowledgement()

  // Methods (7)
  protected boolean innerReadFieldSeeds(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RequestExtendedGuildInfo
```
public class RequestExtendedGuildInfo extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = RequestExtendedGuildInfo1
  public Long guildID

  // Constructors (2)
  com.perblue.rpg.network.messages.RequestExtendedGuildInfo(a)
  com.perblue.rpg.network.messages.RequestExtendedGuildInfo()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RequestInAppPurchaseForVerify
```
public class RequestInAppPurchaseForVerify extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = RequestInAppPurchaseForVerify1
  public String productId
  public String receiptData
  public String transactionId

  // Constructors (2)
  com.perblue.rpg.network.messages.RequestInAppPurchaseForVerify(a)
  com.perblue.rpg.network.messages.RequestInAppPurchaseForVerify()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RequestResync
```
public class RequestResync extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = RequestResync1
  public Integer requestNum

  // Constructors (2)
  com.perblue.rpg.network.messages.RequestResync(a)
  com.perblue.rpg.network.messages.RequestResync()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ResetBossBattleResponse
```
public class ResetBossBattleResponse extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = ResetBossBattleResponse1
  public BossBattleResponse bossBattle

  // Constructors (2)
  com.perblue.rpg.network.messages.ResetBossBattleResponse(a)
  com.perblue.rpg.network.messages.ResetBossBattleResponse()

  // Methods (8)
  protected boolean innerReadFieldBossBattle(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldBossBattle_BossBattleData(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ResetExpedition
```
public class ResetExpedition extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ResetExpedition1
  public Integer difficulty
  public Boolean firstEverReset

  // Constructors (2)
  com.perblue.rpg.network.messages.ResetExpedition(a)
  com.perblue.rpg.network.messages.ResetExpedition()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ResetExpeditionResponse
```
public class ResetExpeditionResponse extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = ResetExpeditionResponse1
  public ExpeditionRunData currentExpedition
  public Long expeditionID
  public Long expeditionWarWeek
  public Long expeditionWarWeekEnd
  public Integer resetsDone

  // Constructors (2)
  com.perblue.rpg.network.messages.ResetExpeditionResponse(a)
  com.perblue.rpg.network.messages.ResetExpeditionResponse()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldCurrentExpedition(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ResourceType
```
public final enum ResourceType extends java.lang.Enum

  // Fields (26)
  private static final ResourceType[] $VALUES
  public static final ResourceType BAZAAR_TOKENS
  public static final ResourceType COLISEUM_TOKENS
  public static final ResourceType CRYSTAL_SHRINE_ROLLS
  public static final ResourceType DEFAULT
  public static final ResourceType DIAMONDS
  public static final ResourceType EXPEDITION_TOKENS
  public static final ResourceType FIGHT_TOKENS
  public static final ResourceType FREE_DIAMONDS
  public static final ResourceType GOLD
  public static final ResourceType GOLD_CHEST
  public static final ResourceType GUILD_TOKENS
  public static final ResourceType ORANGE_CHEST
  public static final ResourceType PAID_DIAMONDS
  public static final ResourceType POWER_POINTS
  public static final ResourceType PURPLE_CHEST
  public static final ResourceType RUNICITE
  public static final ResourceType SILVER_CHEST
  public static final ResourceType SOULMART_TOKENS
  public static final ResourceType SOUL_CHEST
  public static final ResourceType STAMINA
  public static final ResourceType STONE_SHRINE_ROLLS
  public static final ResourceType TEAM_XP
  public static final ResourceType VIP_TICKETS
  public static final ResourceType WAR_TOKENS
  private static ResourceType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.ResourceType(String, int)

  // Methods (3)
  public static ResourceType[] valuesCached()
  public static ResourceType[] values()
  public static ResourceType valueOf(String)
```

## com.perblue.rpg.network.messages.ResourceUpdate
```
public class ResourceUpdate extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = ResourceUpdate1
  public Integer delta
  public ResourceType type

  // Constructors (2)
  com.perblue.rpg.network.messages.ResourceUpdate(a)
  com.perblue.rpg.network.messages.ResourceUpdate()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.ResyncData
```
public class ResyncData extends com.perblue.a.a.i

  // Fields (11)
  private static final String FULL_NAME = ResyncData1
  public AllContestData allContests
  public BasicGuildInfo basicGuildInfo
  public List mailMessages
  public PrivateUserInfo privateUserInfo
  public Integer requestNum
  public Boolean showDialog
  public SpecialEventsRaw specialEvents
  public TitanTempleSummaries titanTemples
  public UserExtra userExtra
  public UserInfo userInfo

  // Constructors (2)
  com.perblue.rpg.network.messages.ResyncData()
  com.perblue.rpg.network.messages.ResyncData(a)

  // Methods (20)
  protected boolean innerReadFieldBasicGuildInfo(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldUserInfo(a)
  protected boolean innerReadFieldPrivateUserInfo(a)
  protected boolean innerReadFieldUserExtra(a)
  protected boolean innerReadFieldMailMessages(a)
  protected boolean innerReadFieldSpecialEvents(a)
  protected boolean innerReadFieldTitanTemples(a)
  protected boolean innerReadFieldAllContests(a)
  protected boolean innerReadFieldUserExtra_Avatar(a)
  protected boolean innerReadFieldUserInfo_BasicInfo(a)
  protected boolean innerReadFieldSpecialEvents_SigninRewards(a)
  protected boolean innerReadFieldTitanTemples_YourTemple(a)
  protected boolean innerReadFieldUserExtra_OldExpeditionData(a)
  protected boolean innerReadFieldUserExtra_BossPitData(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RewardDrop
```
public class RewardDrop extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = RewardDrop1
  public ItemType itemType
  public Integer quantity
  public ResourceType resourceType
  public List rune
  public Integer tier
  public Boolean wasHeroDrop

  // Constructors (2)
  com.perblue.rpg.network.messages.RewardDrop(a)
  com.perblue.rpg.network.messages.RewardDrop()

  // Methods (7)
  protected boolean innerReadFieldRune(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RuneBonusData
```
public class RuneBonusData extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = RuneBonusData1
  public RuneBonusType bonusType
  public String statType
  public Integer subLevel

  // Constructors (2)
  com.perblue.rpg.network.messages.RuneBonusData(a)
  com.perblue.rpg.network.messages.RuneBonusData()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RuneBonusType
```
public final enum RuneBonusType extends java.lang.Enum

  // Fields (6)
  private static final RuneBonusType[] $VALUES
  public static final RuneBonusType DEFAULT
  public static final RuneBonusType PRIMARY
  public static final RuneBonusType SECONDARY
  public static final RuneBonusType TERTIARY
  private static RuneBonusType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.RuneBonusType(String, int)

  // Methods (3)
  public static RuneBonusType[] valuesCached()
  public static RuneBonusType[] values()
  public static RuneBonusType valueOf(String)
```

## com.perblue.rpg.network.messages.RuneData
```
public class RuneData extends com.perblue.a.a.i

  // Fields (10)
  private static final String FULL_NAME = RuneData1
  public Map bonuses
  public Integer fusionPoints
  public UnitType heroRestriction
  public Long iD
  public Integer level
  public Rarity rarity
  public RuneEquipSlot slot
  public Integer stars
  public RuneSetType type

  // Constructors (2)
  com.perblue.rpg.network.messages.RuneData(a)
  com.perblue.rpg.network.messages.RuneData()

  // Methods (7)
  protected boolean innerReadFieldBonuses(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RuneEmpowerResults
```
public class RuneEmpowerResults extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = RuneEmpowerResults1
  public UnitType heroType
  public RuneData newData
  public Integer times
  public Integer totalCost

  // Constructors (2)
  com.perblue.rpg.network.messages.RuneEmpowerResults(a)
  com.perblue.rpg.network.messages.RuneEmpowerResults()

  // Methods (7)
  protected boolean innerReadFieldNewData(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RuneEquipSlot
```
public final enum RuneEquipSlot extends java.lang.Enum

  // Fields (9)
  private static final RuneEquipSlot[] $VALUES
  public static final RuneEquipSlot DEFAULT
  public static final RuneEquipSlot KEYSTONE
  public static final RuneEquipSlot MAJOR_1
  public static final RuneEquipSlot MAJOR_2
  public static final RuneEquipSlot MINOR_1
  public static final RuneEquipSlot MINOR_2
  public static final RuneEquipSlot MINOR_3
  private static RuneEquipSlot[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.RuneEquipSlot(String, int)

  // Methods (3)
  public static RuneEquipSlot[] valuesCached()
  public static RuneEquipSlot[] values()
  public static RuneEquipSlot valueOf(String)
```

## com.perblue.rpg.network.messages.RuneImbueResults
```
public class RuneImbueResults extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = RuneImbueResults1
  public RuneData newData

  // Constructors (2)
  com.perblue.rpg.network.messages.RuneImbueResults(a)
  com.perblue.rpg.network.messages.RuneImbueResults()

  // Methods (7)
  protected boolean innerReadFieldNewData(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RuneSetType
```
public final enum RuneSetType extends java.lang.Enum

  // Fields (13)
  private static final RuneSetType[] $VALUES
  public static final RuneSetType BLOOD
  public static final RuneSetType DEFAULT
  public static final RuneSetType DEFAULT4
  public static final RuneSetType FIRE
  public static final RuneSetType HAIL
  public static final RuneSetType LIGHTNING
  public static final RuneSetType MIST
  public static final RuneSetType OCEAN
  public static final RuneSetType RIVER
  public static final RuneSetType ROCK
  public static final RuneSetType TREE
  private static RuneSetType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.RuneSetType(String, int)

  // Methods (3)
  public static RuneSetType[] valuesCached()
  public static RuneSetType[] values()
  public static RuneSetType valueOf(String)
```

## com.perblue.rpg.network.messages.RuneShrineActivationResults
```
public class RuneShrineActivationResults extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = RuneShrineActivationResults1
  public RuneShrineActivationType activationType
  public Integer diamondsUsed
  public ItemType freeItem
  public List offerings
  public List runes
  public RuneShrineType shrineType

  // Constructors (2)
  com.perblue.rpg.network.messages.RuneShrineActivationResults(a)
  com.perblue.rpg.network.messages.RuneShrineActivationResults()

  // Methods (8)
  protected boolean innerReadFieldOfferings(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldRunes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.RuneShrineActivationType
```
public final enum RuneShrineActivationType extends java.lang.Enum

  // Fields (5)
  private static final RuneShrineActivationType[] $VALUES
  public static final RuneShrineActivationType DIAMONDS
  public static final RuneShrineActivationType ITEM
  public static final RuneShrineActivationType RESOURCE
  private static RuneShrineActivationType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.RuneShrineActivationType(String, int)

  // Methods (3)
  public static RuneShrineActivationType[] valuesCached()
  public static RuneShrineActivationType[] values()
  public static RuneShrineActivationType valueOf(String)
```

## com.perblue.rpg.network.messages.RuneShrineType
```
public final enum RuneShrineType extends java.lang.Enum

  // Fields (6)
  private static final RuneShrineType[] $VALUES
  public static final RuneShrineType CRYSTAL
  public static final RuneShrineType DEFAULT
  public static final RuneShrineType STONE
  public static final RuneShrineType WOODEN
  private static RuneShrineType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.RuneShrineType(String, int)

  // Methods (3)
  public static RuneShrineType[] valuesCached()
  public static RuneShrineType[] values()
  public static RuneShrineType valueOf(String)
```

## com.perblue.rpg.network.messages.SaleBadgeType
```
public final enum SaleBadgeType extends java.lang.Enum

  // Fields (7)
  private static final SaleBadgeType[] $VALUES
  public static final SaleBadgeType BEST_VALUE
  public static final SaleBadgeType MOST_POPULAR
  public static final SaleBadgeType NONE
  public static final SaleBadgeType ONE_TIME_OFFER
  public static final SaleBadgeType SALE
  private static SaleBadgeType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.SaleBadgeType(String, int)

  // Methods (3)
  public static SaleBadgeType[] valuesCached()
  public static SaleBadgeType[] values()
  public static SaleBadgeType valueOf(String)
```

## com.perblue.rpg.network.messages.SearchGuilds
```
public class SearchGuilds extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = SearchGuilds1
  public String nameSearch

  // Constructors (2)
  com.perblue.rpg.network.messages.SearchGuilds(a)
  com.perblue.rpg.network.messages.SearchGuilds()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.SearchGuildsResponse
```
public class SearchGuildsResponse extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = SearchGuildsResponse1
  public List guilds

  // Constructors (2)
  com.perblue.rpg.network.messages.SearchGuildsResponse(a)
  com.perblue.rpg.network.messages.SearchGuildsResponse()

  // Methods (7)
  protected boolean innerReadFieldGuilds(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.SectionType
```
public final enum SectionType extends java.lang.Enum

  // Fields (5)
  private static final SectionType[] $VALUES
  public static final SectionType BACK
  public static final SectionType CENTRAL
  public static final SectionType FRONT
  private static SectionType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.SectionType(String, int)

  // Methods (3)
  public static SectionType[] valuesCached()
  public static SectionType[] values()
  public static SectionType valueOf(String)
```

## com.perblue.rpg.network.messages.SendChat
```
public class SendChat extends com.perblue.a.a.i

  // Fields (10)
  private static final String FULL_NAME = SendChat1
  public UnitType heroType
  public HeroLineup heroes
  public String message
  public ChatRoomType room
  public List runes
  public BasicUserInfo sender
  public Date time
  public Long toUserID
  public ChatType type

  // Constructors (2)
  com.perblue.rpg.network.messages.SendChat(a)
  com.perblue.rpg.network.messages.SendChat()

  // Methods (10)
  protected boolean innerReadFieldHeroes(a)
  protected boolean innerReadFieldSender(a)
  protected boolean innerReadFieldSender_Avatar(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldRunes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.Server
```
public class Server extends com.perblue.a.a.i

  // Fields (9)
  private static final String FULL_NAME = Server1
  public Boolean full
  public Boolean haveAccount
  public ItemType icon
  public Rarity maxRarity
  public Integer maxTeamLevel
  public Integer numChaptersAvailable
  public Long openTime
  public Integer shardID

  // Constructors (2)
  com.perblue.rpg.network.messages.Server(a)
  com.perblue.rpg.network.messages.Server()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.Servers
```
public class Servers extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = Servers1
  public List servers

  // Constructors (2)
  com.perblue.rpg.network.messages.Servers(a)
  com.perblue.rpg.network.messages.Servers()

  // Methods (7)
  protected boolean innerReadFieldServers(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.SetLanguage
```
public class SetLanguage extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = SetLanguage1
  public String language

  // Constructors (2)
  com.perblue.rpg.network.messages.SetLanguage(a)
  com.perblue.rpg.network.messages.SetLanguage()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.SetPlayerAvatar
```
public class SetPlayerAvatar extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = SetPlayerAvatar1
  public Avatar avatar

  // Constructors (2)
  com.perblue.rpg.network.messages.SetPlayerAvatar(a)
  com.perblue.rpg.network.messages.SetPlayerAvatar()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldAvatar(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.SetPlayerName
```
public class SetPlayerName extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = SetPlayerName1
  public String name

  // Constructors (2)
  com.perblue.rpg.network.messages.SetPlayerName(a)
  com.perblue.rpg.network.messages.SetPlayerName()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.SettingsSync
```
public class SettingsSync extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = SettingsSync1
  public Map settings

  // Constructors (2)
  com.perblue.rpg.network.messages.SettingsSync(a)
  com.perblue.rpg.network.messages.SettingsSync()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldSettings(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.SigninReward
```
public class SigninReward extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = SigninReward1
  public Long endTime
  public List rewards
  public UnitType signinHero
  public Long startTime

  // Constructors (2)
  com.perblue.rpg.network.messages.SigninReward(a)
  com.perblue.rpg.network.messages.SigninReward()

  // Methods (7)
  protected boolean innerReadFieldRewards(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.SigninRewards
```
public class SigninRewards extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = SigninRewards1
  public SigninReward lastMonth
  public SigninReward nextMonth
  public Map siginHeroes
  public SigninReward thisMonth

  // Constructors (2)
  com.perblue.rpg.network.messages.SigninRewards(a)
  com.perblue.rpg.network.messages.SigninRewards()

  // Methods (10)
  protected boolean innerReadFieldLastMonth(a)
  protected boolean innerReadFieldThisMonth(a)
  protected boolean innerReadFieldNextMonth(a)
  protected boolean innerReadFieldSiginHeroes(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.SkillType
```
public final enum SkillType extends java.lang.Enum

  // Fields (678)
  private static final SkillType[] $VALUES
  public static final SkillType ABYSS_DRAGON_0
  public static final SkillType ABYSS_DRAGON_1
  public static final SkillType ABYSS_DRAGON_2
  public static final SkillType ABYSS_DRAGON_3
  public static final SkillType ABYSS_DRAGON_4
  public static final SkillType ANCIENT_DWARF_0
  public static final SkillType ANCIENT_DWARF_1
  public static final SkillType ANCIENT_DWARF_2
  public static final SkillType ANCIENT_DWARF_3
  public static final SkillType ANCIENT_DWARF_4
  public static final SkillType ANGELIC_HERALD_0
  public static final SkillType ANGELIC_HERALD_1
  public static final SkillType ANGELIC_HERALD_2
  public static final SkillType ANGELIC_HERALD_3
  public static final SkillType ANGELIC_HERALD_4
  public static final SkillType ANGELIC_HERALD_5
  public static final SkillType ANGEL_DRAGON_0
  public static final SkillType ANGEL_DRAGON_1
  public static final SkillType ANGEL_DRAGON_2
  public static final SkillType ANGEL_DRAGON_3
  public static final SkillType ANGEL_DRAGON_4
  public static final SkillType AQUATIC_MAN_0
  public static final SkillType AQUATIC_MAN_1
  public static final SkillType AQUATIC_MAN_2
  public static final SkillType AQUATIC_MAN_3
  public static final SkillType AQUATIC_MAN_4
  public static final SkillType AQUATIC_MAN_5
  public static final SkillType AQUATIC_MAN_TITAN
  public static final SkillType BANSHEE_0
  public static final SkillType BANSHEE_1
  public static final SkillType BANSHEE_2
  public static final SkillType BANSHEE_3
  public static final SkillType BANSHEE_4
  public static final SkillType BARDBARIAN_0
  public static final SkillType BARDBARIAN_1
  public static final SkillType BARDBARIAN_2
  public static final SkillType BARDBARIAN_3
  public static final SkillType BARDBARIAN_4
  public static final SkillType BARDBARIAN_5
  public static final SkillType BARDBARIAN_TITAN
  public static final SkillType BLACK_WING_0
  public static final SkillType BLACK_WING_1
  public static final SkillType BLACK_WING_2
  public static final SkillType BLACK_WING_3
  public static final SkillType BLACK_WING_4
  public static final SkillType BONE_DRAGON_0
  public static final SkillType BONE_DRAGON_1
  public static final SkillType BONE_DRAGON_2
  public static final SkillType BONE_DRAGON_3
  public static final SkillType BONE_DRAGON_4
  public static final SkillType BONE_DRAGON_5
  public static final SkillType BONE_DRAGON_TITAN
  public static final SkillType BOSS_BATTLE_FIELD_BUFF
  public static final SkillType BOSS_CANT_BE_DISABLED
  public static final SkillType BROZERKER_0
  public static final SkillType BROZERKER_1
  public static final SkillType BROZERKER_2
  public static final SkillType BROZERKER_3
  public static final SkillType BROZERKER_4
  public static final SkillType BROZERKER_5
  public static final SkillType BROZERKER_6
  public static final SkillType BROZERKER_TITAN
  public static final SkillType BULWARK_ANGEL_0
  public static final SkillType BULWARK_ANGEL_1
  public static final SkillType BULWARK_ANGEL_2
  public static final SkillType BULWARK_ANGEL_3
  public static final SkillType BULWARK_ANGEL_4
  public static final SkillType BURNT_ONE_0
  public static final SkillType BURNT_ONE_1
  public static final SkillType BURNT_ONE_2
  public static final SkillType BURNT_ONE_3
  public static final SkillType BURNT_ONE_4
  public static final SkillType CATAPULT_KNIGHT_0
  public static final SkillType CATAPULT_KNIGHT_1
  public static final SkillType CATAPULT_KNIGHT_2
  public static final SkillType CATAPULT_KNIGHT_3
  public static final SkillType CATAPULT_KNIGHT_4
  public static final SkillType CATAPULT_KNIGHT_5
  public static final SkillType CENTAUR_OF_ATTENTION_0
  public static final SkillType CENTAUR_OF_ATTENTION_1
  public static final SkillType CENTAUR_OF_ATTENTION_2
  public static final SkillType CENTAUR_OF_ATTENTION_3
  public static final SkillType CENTAUR_OF_ATTENTION_4
  public static final SkillType CENTAUR_OF_ATTENTION_5
  public static final SkillType CENTAUR_OF_ATTENTION_6
  public static final SkillType CENTAUR_OF_ATTENTION_TITAN
  public static final SkillType CLAW_MAN_0
  public static final SkillType CLAW_MAN_1
  public static final SkillType CLAW_MAN_2
  public static final SkillType CLAW_MAN_3
  public static final SkillType CLAW_MAN_4
  public static final SkillType COSMIC_ELF_0
  public static final SkillType COSMIC_ELF_1
  public static final SkillType COSMIC_ELF_2
  public static final SkillType COSMIC_ELF_3
  public static final SkillType COSMIC_ELF_4
  public static final SkillType COSMIC_ELF_5
  public static final SkillType COSMIC_ELF_6
  public static final SkillType CRIMSON_WITCH_0
  public static final SkillType CRIMSON_WITCH_1
  public static final SkillType CRIMSON_WITCH_2
  public static final SkillType CRIMSON_WITCH_3
  public static final SkillType CRIMSON_WITCH_4
  public static final SkillType CRIMSON_WITCH_5
  public static final SkillType CURSED_STATUE_0
  public static final SkillType CURSED_STATUE_1
  public static final SkillType CURSED_STATUE_2
  public static final SkillType CURSED_STATUE_3
  public static final SkillType CURSED_STATUE_4
  public static final SkillType CYCLOPS_WIZARD_0
  public static final SkillType CYCLOPS_WIZARD_1
  public static final SkillType CYCLOPS_WIZARD_2
  public static final SkillType CYCLOPS_WIZARD_3
  public static final SkillType CYCLOPS_WIZARD_4
  public static final SkillType DARK_DRACUL_0
  public static final SkillType DARK_DRACUL_1
  public static final SkillType DARK_DRACUL_2
  public static final SkillType DARK_DRACUL_3
  public static final SkillType DARK_DRACUL_4
  public static final SkillType DARK_DRACUL_5
  public static final SkillType DARK_HERO_0
  public static final SkillType DARK_HERO_1
  public static final SkillType DARK_HERO_2
  public static final SkillType DARK_HERO_3
  public static final SkillType DARK_HERO_4
  public static final SkillType DARK_HORSE_0
  public static final SkillType DARK_HORSE_1
  public static final SkillType DARK_HORSE_2
  public static final SkillType DARK_HORSE_3
  public static final SkillType DARK_HORSE_4
  public static final SkillType DARK_HORSE_5
  public static final SkillType DEEP_DRAGON_0
  public static final SkillType DEEP_DRAGON_1
  public static final SkillType DEEP_DRAGON_2
  public static final SkillType DEEP_DRAGON_3
  public static final SkillType DEEP_DRAGON_4
  public static final SkillType DEEP_DRAGON_5
  public static final SkillType DEEP_DRAGON_6
  public static final SkillType DEFAULT
  public static final SkillType DEMON_TOTEM_0
  public static final SkillType DEMON_TOTEM_1
  public static final SkillType DEMON_TOTEM_2
  public static final SkillType DEMON_TOTEM_3
  public static final SkillType DEMON_TOTEM_4
  public static final SkillType DEMON_TOTEM_5
  public static final SkillType DEMON_TOTEM_6
  public static final SkillType DIGGER_MOLE_0
  public static final SkillType DIGGER_MOLE_1
  public static final SkillType DIGGER_MOLE_2
  public static final SkillType DIGGER_MOLE_3
  public static final SkillType DIGGER_MOLE_4
  public static final SkillType DOPPELGANGER_0
  public static final SkillType DOPPELGANGER_1
  public static final SkillType DOPPELGANGER_2
  public static final SkillType DOPPELGANGER_3
  public static final SkillType DOPPELGANGER_4
  public static final SkillType DRAGON_LADY_0
  public static final SkillType DRAGON_LADY_1
  public static final SkillType DRAGON_LADY_2
  public static final SkillType DRAGON_LADY_3
  public static final SkillType DRAGON_LADY_4
  public static final SkillType DRAGON_LADY_5
  public static final SkillType DRAGON_LADY_6
  public static final SkillType DRAGON_LADY_TITAN
  public static final SkillType DRAGON_SLAYER_0
  public static final SkillType DRAGON_SLAYER_1
  public static final SkillType DRAGON_SLAYER_2
  public static final SkillType DRAGON_SLAYER_3
  public static final SkillType DRAGON_SLAYER_4
  public static final SkillType DRAGZILLA_0
  public static final SkillType DRAGZILLA_1
  public static final SkillType DRAGZILLA_2
  public static final SkillType DRAGZILLA_3
  public static final SkillType DRAGZILLA_4
  public static final SkillType DRAGZILLA_5
  public static final SkillType DRUIDINATRIX_0
  public static final SkillType DRUIDINATRIX_1
  public static final SkillType DRUIDINATRIX_2
  public static final SkillType DRUIDINATRIX_3
  public static final SkillType DRUIDINATRIX_4
  public static final SkillType DRUIDINATRIX_5
  public static final SkillType DUNGEON_MAN_0
  public static final SkillType DUNGEON_MAN_1
  public static final SkillType DUNGEON_MAN_2
  public static final SkillType DUNGEON_MAN_3
  public static final SkillType DUNGEON_MAN_4
  public static final SkillType DUST_DEVIL_0
  public static final SkillType DUST_DEVIL_1
  public static final SkillType DUST_DEVIL_2
  public static final SkillType DUST_DEVIL_3
  public static final SkillType DUST_DEVIL_4
  public static final SkillType DUST_DEVIL_5
  public static final SkillType DWARVEN_ARCHER_0
  public static final SkillType DWARVEN_ARCHER_1
  public static final SkillType DWARVEN_ARCHER_2
  public static final SkillType DWARVEN_ARCHER_3
  public static final SkillType DWARVEN_ARCHER_4
  public static final SkillType DWARVEN_ARCHER_5
  public static final SkillType ELECTROYETI_0
  public static final SkillType ELECTROYETI_1
  public static final SkillType ELECTROYETI_2
  public static final SkillType ELECTROYETI_3
  public static final SkillType ELECTROYETI_4
  public static final SkillType ELECTROYETI_5
  public static final SkillType ETERNAL_ENCHANTER_0
  public static final SkillType ETERNAL_ENCHANTER_1
  public static final SkillType ETERNAL_ENCHANTER_2
  public static final SkillType ETERNAL_ENCHANTER_3
  public static final SkillType ETERNAL_ENCHANTER_4
  public static final SkillType ETERNAL_ENCHANTER_5
  public static final SkillType FAITH_HEALER_0
  public static final SkillType FAITH_HEALER_1
  public static final SkillType FAITH_HEALER_2
  public static final SkillType FAITH_HEALER_3
  public static final SkillType FAITH_HEALER_4
  public static final SkillType FAITH_HEALER_5
  public static final SkillType FAITH_HEALER_TITAN
  public static final SkillType FORGOTTEN_DRAGON_0
  public static final SkillType FORGOTTEN_DRAGON_1
  public static final SkillType FORGOTTEN_DRAGON_2
  public static final SkillType FORGOTTEN_DRAGON_3
  public static final SkillType FORGOTTEN_DRAGON_4
  public static final SkillType FROST_GIANT_0
  public static final SkillType FROST_GIANT_1
  public static final SkillType FROST_GIANT_2
  public static final SkillType FROST_GIANT_3
  public static final SkillType FROST_GIANT_4
  public static final SkillType FROST_GIANT_5
  public static final SkillType FROST_GIANT_TITAN
  public static final SkillType GENIE_0
  public static final SkillType GENIE_1
  public static final SkillType GENIE_2
  public static final SkillType GENIE_3
  public static final SkillType GENIE_4
  public static final SkillType GENIE_5
  public static final SkillType GENIE_6
  public static final SkillType GENIE_TITAN
  public static final SkillType GRAND_HUNTRESS_0
  public static final SkillType GRAND_HUNTRESS_1
  public static final SkillType GRAND_HUNTRESS_2
  public static final SkillType GRAND_HUNTRESS_3
  public static final SkillType GRAND_HUNTRESS_4
  public static final SkillType GREED_DRAGON_0
  public static final SkillType GREED_DRAGON_1
  public static final SkillType GREED_DRAGON_2
  public static final SkillType GREED_DRAGON_3
  public static final SkillType GREED_DRAGON_4
  public static final SkillType GROOVY_DRUID_0
  public static final SkillType GROOVY_DRUID_1
  public static final SkillType GROOVY_DRUID_2
  public static final SkillType GROOVY_DRUID_3
  public static final SkillType GROOVY_DRUID_4
  public static final SkillType GROOVY_DRUID_5
  public static final SkillType HYDRA_0
  public static final SkillType HYDRA_1
  public static final SkillType HYDRA_2
  public static final SkillType HYDRA_3
  public static final SkillType HYDRA_4
  public static final SkillType HYDRA_5
  public static final SkillType KARAOKE_KING_0
  public static final SkillType KARAOKE_KING_1
  public static final SkillType KARAOKE_KING_2
  public static final SkillType KARAOKE_KING_3
  public static final SkillType KARAOKE_KING_4
  public static final SkillType KRAKEN_KING_0
  public static final SkillType KRAKEN_KING_1
  public static final SkillType KRAKEN_KING_2
  public static final SkillType KRAKEN_KING_3
  public static final SkillType KRAKEN_KING_4
  public static final SkillType LAST_DEFENDER_0
  public static final SkillType LAST_DEFENDER_1
  public static final SkillType LAST_DEFENDER_2
  public static final SkillType LAST_DEFENDER_3
  public static final SkillType LAST_DEFENDER_4
  public static final SkillType MAGIC_DRAGON_0
  public static final SkillType MAGIC_DRAGON_1
  public static final SkillType MAGIC_DRAGON_2
  public static final SkillType MAGIC_DRAGON_3
  public static final SkillType MAGIC_DRAGON_4
  public static final SkillType MAGIC_DRAGON_5
  public static final SkillType MEDUSA_0
  public static final SkillType MEDUSA_1
  public static final SkillType MEDUSA_2
  public static final SkillType MEDUSA_3
  public static final SkillType MEDUSA_4
  public static final SkillType MEDUSA_5
  public static final SkillType MEDUSA_6
  public static final SkillType MEDUSA_TITAN
  public static final SkillType MINOTAUR_0
  public static final SkillType MINOTAUR_1
  public static final SkillType MINOTAUR_2
  public static final SkillType MINOTAUR_3
  public static final SkillType MINOTAUR_4
  public static final SkillType MINOTAUR_5
  public static final SkillType MISTRESS_MANICURE_0
  public static final SkillType MISTRESS_MANICURE_1
  public static final SkillType MISTRESS_MANICURE_2
  public static final SkillType MISTRESS_MANICURE_3
  public static final SkillType MISTRESS_MANICURE_4
  public static final SkillType MOON_DRAKE_0
  public static final SkillType MOON_DRAKE_1
  public static final SkillType MOON_DRAKE_2
  public static final SkillType MOON_DRAKE_3
  public static final SkillType MOON_DRAKE_4
  public static final SkillType MOON_DRAKE_5
  public static final SkillType NINJA_DWARF_0
  public static final SkillType NINJA_DWARF_1
  public static final SkillType NINJA_DWARF_2
  public static final SkillType NINJA_DWARF_3
  public static final SkillType NINJA_DWARF_4
  public static final SkillType NINJA_DWARF_5
  public static final SkillType NINJA_DWARF_6
  public static final SkillType NPC_ABYSS_DRAGON_0
  public static final SkillType NPC_ABYSS_DRAGON_1
  public static final SkillType NPC_ABYSS_DRAGON_2
  public static final SkillType NPC_ANGELIC_AVENGER_0
  public static final SkillType NPC_ANT_0
  public static final SkillType NPC_ANT_1
  public static final SkillType NPC_ANUBIS_DRAGON_0
  public static final SkillType NPC_ANUBIS_DRAGON_1
  public static final SkillType NPC_ANUBIS_DRAGON_2
  public static final SkillType NPC_BOSS_ABYSS_DRAGON_0
  public static final SkillType NPC_BOSS_ABYSS_DRAGON_1
  public static final SkillType NPC_BOSS_ABYSS_DRAGON_2
  public static final SkillType NPC_BOSS_ANDRAGONUS_THE_FIRST_0
  public static final SkillType NPC_BOSS_ANDRAGONUS_THE_FIRST_1
  public static final SkillType NPC_BOSS_ANDRAGONUS_THE_FIRST_2
  public static final SkillType NPC_BOSS_ANUBIS_DRAGON_0
  public static final SkillType NPC_BOSS_ANUBIS_DRAGON_1
  public static final SkillType NPC_BOSS_ANUBIS_DRAGON_2
  public static final SkillType NPC_BOSS_UMLAUT_THE_FIFTH_FIRST_0
  public static final SkillType NPC_BOSS_UMLAUT_THE_FIFTH_FIRST_1
  public static final SkillType NPC_BOSS_UMLAUT_THE_FIFTH_FIRST_2
  public static final SkillType NPC_BOSS_UMLAUT_THE_FIFTH_FIRST_3
  public static final SkillType NPC_BREAKER_MKII_0
  public static final SkillType NPC_BREAKER_MKII_1
  public static final SkillType NPC_BUFF_SPRITE_0
  public static final SkillType NPC_CAULDRON_MONSTER_0
  public static final SkillType NPC_CLOUD_MONSTER_0
  public static final SkillType NPC_CLOUD_MONSTER_1
  public static final SkillType NPC_CRYSTAL_GOLEM_0
  public static final SkillType NPC_CRYSTAL_LIZARD_0
  public static final SkillType NPC_CRYSTAL_LIZARD_1
  public static final SkillType NPC_EVIL_WIZARD_BOMB_0
  public static final SkillType NPC_EVIL_WIZARD_BOMB_1
  public static final SkillType NPC_EVIL_WIZARD_BOMB_2
  public static final SkillType NPC_EVIL_WIZARD_SUMMON_0
  public static final SkillType NPC_EVIL_WIZARD_SUMMON_1
  public static final SkillType NPC_EVIL_WIZARD_SUMMON_2
  public static final SkillType NPC_EVIL_WIZARD_UNTARGETABLE
  public static final SkillType NPC_EYEBALL_0
  public static final SkillType NPC_FIRE_IMP_0
  public static final SkillType NPC_FIRE_IMP_1
  public static final SkillType NPC_FLEA_DEMON_0
  public static final SkillType NPC_GIANT_PLANT_BITE
  public static final SkillType NPC_GIANT_PLANT_HOP_FORWARD
  public static final SkillType NPC_GIANT_PLANT_ROOT_0
  public static final SkillType NPC_GIANT_PLANT_SPAWNER
  public static final SkillType NPC_GIANT_PLANT_SPEW_POISON_0
  public static final SkillType NPC_GIANT_PLANT_SPEW_POISON_1
  public static final SkillType NPC_GIANT_PLANT_SPEW_POISON_2
  public static final SkillType NPC_GOBLIN_0
  public static final SkillType NPC_GOLD_COLOSSUS_EAT_GOLD_2
  public static final SkillType NPC_GOLD_COLOSSUS_JUMP_0
  public static final SkillType NPC_GOLD_COLOSSUS_JUMP_1
  public static final SkillType NPC_GOLD_COLOSSUS_JUMP_2
  public static final SkillType NPC_GOLD_COLOSSUS_MELEE_0
  public static final SkillType NPC_GOLD_COLOSSUS_MELEE_1
  public static final SkillType NPC_GOLD_COLOSSUS_MELEE_2
  public static final SkillType NPC_GOLD_COLOSSUS_SPEW_GOLD_0
  public static final SkillType NPC_GOLD_COLOSSUS_SPEW_GOLD_1
  public static final SkillType NPC_GOLD_COLOSSUS_SPEW_GOLD_2
  public static final SkillType NPC_GOLD_COLOSSUS_SPIKES
  public static final SkillType NPC_GOLD_COLOSSUS_WIND
  public static final SkillType NPC_HEAD_CRAB_0
  public static final SkillType NPC_HEALER_SPRITE_0
  public static final SkillType NPC_ICE_GOLEM_0
  public static final SkillType NPC_INFERNO_SPIDER_0
  public static final SkillType NPC_KAMIKAZE_GNOME_0
  public static final SkillType NPC_KING_IMP_0
  public static final SkillType NPC_KING_IMP_1
  public static final SkillType NPC_LYING_LANTERN_0
  public static final SkillType NPC_LYING_LANTERN_1
  public static final SkillType NPC_LYING_LANTERN_2
  public static final SkillType NPC_MR_SMASHY_0
  public static final SkillType NPC_MUSHROOM_0
  public static final SkillType NPC_MYSTIC_WILDLING_0
  public static final SkillType NPC_PLAGUE_SKULKER_0
  public static final SkillType NPC_PLAGUE_SKULKER_1
  public static final SkillType NPC_POTTED_PLANT_0
  public static final SkillType NPC_POTTED_PLANT_1
  public static final SkillType NPC_RED_TIGER_0
  public static final SkillType NPC_RED_TIGER_1
  public static final SkillType NPC_SCARECROW_0
  public static final SkillType NPC_SHARK_0
  public static final SkillType NPC_SHARK_1
  public static final SkillType NPC_SINISTER_ASSAILANT_0
  public static final SkillType NPC_SINISTER_ASSAILANT_1
  public static final SkillType NPC_SKELETON_DEER_0
  public static final SkillType NPC_SKELETON_DEER_1
  public static final SkillType NPC_SKELETON_DEER_2
  public static final SkillType NPC_SQUID_0
  public static final SkillType NPC_SQUIRREL_0
  public static final SkillType NPC_STONE_IMP_0
  public static final SkillType NPC_STONE_IMP_1
  public static final SkillType NPC_TROLL_BLOB_0
  public static final SkillType NPC_UMLAUT_THE_FIFTH_FIRST_0
  public static final SkillType NPC_UMLAUT_THE_FIFTH_FIRST_1
  public static final SkillType NPC_UMLAUT_THE_FIFTH_FIRST_2
  public static final SkillType NPC_WILDLING_ARCHER_0
  public static final SkillType NPC_WILDLING_SNIPER_0
  public static final SkillType NUMBER_493
  public static final SkillType NUMBER_505
  public static final SkillType NUMBER_511
  public static final SkillType NUMBER_517
  public static final SkillType NUMBER_523
  public static final SkillType NUMBER_529
  public static final SkillType NUMBER_538
  public static final SkillType NUMBER_544
  public static final SkillType NUMBER_550
  public static final SkillType NUMBER_559
  public static final SkillType NUMBER_565
  public static final SkillType NUMBER_571
  public static final SkillType NUMBER_583
  public static final SkillType NUMBER_589
  public static final SkillType NUMBER_590
  public static final SkillType NUMBER_591
  public static final SkillType NUMBER_592
  public static final SkillType NUMBER_593
  public static final SkillType NUMBER_594
  public static final SkillType NUMBER_595
  public static final SkillType NUMBER_596
  public static final SkillType NUMBER_597
  public static final SkillType NUMBER_598
  public static final SkillType NUMBER_609
  public static final SkillType NUMBER_623
  public static final SkillType NUMBER_629
  public static final SkillType NUMBER_635
  public static final SkillType NUMBER_670
  public static final SkillType ORC_MONK_0
  public static final SkillType ORC_MONK_1
  public static final SkillType ORC_MONK_2
  public static final SkillType ORC_MONK_3
  public static final SkillType ORC_MONK_4
  public static final SkillType ORC_MONK_5
  public static final SkillType ORC_MONK_6
  public static final SkillType ORC_MONK_TITAN
  public static final SkillType PCH_ANUBIS_DRAGON_0
  public static final SkillType PCH_ANUBIS_DRAGON_1
  public static final SkillType PCH_ANUBIS_DRAGON_2
  public static final SkillType PCH_ANUBIS_DRAGON_3
  public static final SkillType PCH_ANUBIS_DRAGON_4
  public static final SkillType PIRATE_0
  public static final SkillType PIRATE_1
  public static final SkillType PIRATE_2
  public static final SkillType PIRATE_3
  public static final SkillType PIRATE_4
  public static final SkillType PIRATE_5
  public static final SkillType PLAGUE_ENTREPRENEUR_0
  public static final SkillType PLAGUE_ENTREPRENEUR_1
  public static final SkillType PLAGUE_ENTREPRENEUR_2
  public static final SkillType PLAGUE_ENTREPRENEUR_3
  public static final SkillType PLAGUE_ENTREPRENEUR_4
  public static final SkillType PLANT_SOUL_0
  public static final SkillType PLANT_SOUL_1
  public static final SkillType PLANT_SOUL_2
  public static final SkillType PLANT_SOUL_3
  public static final SkillType PLANT_SOUL_4
  public static final SkillType POLEMASTER_0
  public static final SkillType POLEMASTER_1
  public static final SkillType POLEMASTER_2
  public static final SkillType POLEMASTER_3
  public static final SkillType POLEMASTER_4
  public static final SkillType POLEMASTER_5
  public static final SkillType RABID_DRAGON_0
  public static final SkillType RABID_DRAGON_1
  public static final SkillType RABID_DRAGON_2
  public static final SkillType RABID_DRAGON_3
  public static final SkillType RABID_DRAGON_4
  public static final SkillType RABID_DRAGON_5
  public static final SkillType RABID_DRAGON_TITAN
  public static final SkillType RAGING_REVENANT_0
  public static final SkillType RAGING_REVENANT_1
  public static final SkillType RAGING_REVENANT_2
  public static final SkillType RAGING_REVENANT_3
  public static final SkillType RAGING_REVENANT_4
  public static final SkillType RAGING_REVENANT_5
  public static final SkillType ROLLER_WARRIOR_0
  public static final SkillType ROLLER_WARRIOR_1
  public static final SkillType ROLLER_WARRIOR_2
  public static final SkillType ROLLER_WARRIOR_3
  public static final SkillType ROLLER_WARRIOR_4
  public static final SkillType ROLLER_WARRIOR_5
  public static final SkillType ROLLER_WARRIOR_6
  public static final SkillType SADISTIC_DANCER_0
  public static final SkillType SADISTIC_DANCER_1
  public static final SkillType SADISTIC_DANCER_2
  public static final SkillType SADISTIC_DANCER_3
  public static final SkillType SADISTIC_DANCER_4
  public static final SkillType SATYR_0
  public static final SkillType SATYR_1
  public static final SkillType SATYR_2
  public static final SkillType SATYR_3
  public static final SkillType SATYR_4
  public static final SkillType SATYR_5
  public static final SkillType SATYR_6
  public static final SkillType SAVAGE_CUTIE_0
  public static final SkillType SAVAGE_CUTIE_1
  public static final SkillType SAVAGE_CUTIE_2
  public static final SkillType SAVAGE_CUTIE_3
  public static final SkillType SAVAGE_CUTIE_4
  public static final SkillType SAVAGE_CUTIE_5
  public static final SkillType SHADOW_ASSASSIN_0
  public static final SkillType SHADOW_ASSASSIN_1
  public static final SkillType SHADOW_ASSASSIN_2
  public static final SkillType SHADOW_ASSASSIN_3
  public static final SkillType SHADOW_ASSASSIN_4
  public static final SkillType SHADOW_ASSASSIN_5
  public static final SkillType SHADOW_ASSASSIN_6
  public static final SkillType SHADOW_OF_SVEN_0
  public static final SkillType SHADOW_OF_SVEN_1
  public static final SkillType SHADOW_OF_SVEN_2
  public static final SkillType SHADOW_OF_SVEN_3
  public static final SkillType SHADOW_OF_SVEN_4
  public static final SkillType SILENT_SPIRIT_0
  public static final SkillType SILENT_SPIRIT_1
  public static final SkillType SILENT_SPIRIT_2
  public static final SkillType SILENT_SPIRIT_3
  public static final SkillType SILENT_SPIRIT_4
  public static final SkillType SKELETON_KING_0
  public static final SkillType SKELETON_KING_1
  public static final SkillType SKELETON_KING_2
  public static final SkillType SKELETON_KING_3
  public static final SkillType SKELETON_KING_4
  public static final SkillType SKELETON_KING_5
  public static final SkillType SKELETON_KING_TITAN
  public static final SkillType SNAPPER_BONE_0
  public static final SkillType SNAPPER_BONE_1
  public static final SkillType SNAPPER_BONE_2
  public static final SkillType SNAPPER_BONE_3
  public static final SkillType SNAPPER_BONE_4
  public static final SkillType SNAP_DRAGON_0
  public static final SkillType SNAP_DRAGON_1
  public static final SkillType SNAP_DRAGON_2
  public static final SkillType SNAP_DRAGON_3
  public static final SkillType SNAP_DRAGON_4
  public static final SkillType SNAP_DRAGON_5
  public static final SkillType SNAP_DRAGON_6
  public static final SkillType SNAP_DRAGON_TITAN
  public static final SkillType SNIPER_WOLF_0
  public static final SkillType SNIPER_WOLF_1
  public static final SkillType SNIPER_WOLF_2
  public static final SkillType SNIPER_WOLF_3
  public static final SkillType SNIPER_WOLF_4
  public static final SkillType SNIPER_WOLF_5
  public static final SkillType SOJOURNER_SORCERESS_0
  public static final SkillType SOJOURNER_SORCERESS_1
  public static final SkillType SOJOURNER_SORCERESS_2
  public static final SkillType SOJOURNER_SORCERESS_3
  public static final SkillType SOJOURNER_SORCERESS_4
  public static final SkillType SOJOURNER_SORCERESS_5
  public static final SkillType SPECTRAL_DRAGON_0
  public static final SkillType SPECTRAL_DRAGON_1
  public static final SkillType SPECTRAL_DRAGON_2
  public static final SkillType SPECTRAL_DRAGON_3
  public static final SkillType SPECTRAL_DRAGON_4
  public static final SkillType SPIDER_QUEEN_0
  public static final SkillType SPIDER_QUEEN_1
  public static final SkillType SPIDER_QUEEN_2
  public static final SkillType SPIDER_QUEEN_3
  public static final SkillType SPIDER_QUEEN_4
  public static final SkillType SPIKEY_DRAGON_0
  public static final SkillType SPIKEY_DRAGON_1
  public static final SkillType SPIKEY_DRAGON_2
  public static final SkillType SPIKEY_DRAGON_3
  public static final SkillType SPIKEY_DRAGON_4
  public static final SkillType SPIKEY_DRAGON_5
  public static final SkillType SPIKEY_DRAGON_TITAN
  public static final SkillType STEPLADDER_BROTHERS_0
  public static final SkillType STEPLADDER_BROTHERS_1
  public static final SkillType STEPLADDER_BROTHERS_2
  public static final SkillType STEPLADDER_BROTHERS_3
  public static final SkillType STEPLADDER_BROTHERS_4
  public static final SkillType STORM_DRAGON_0
  public static final SkillType STORM_DRAGON_1
  public static final SkillType STORM_DRAGON_2
  public static final SkillType STORM_DRAGON_3
  public static final SkillType STORM_DRAGON_4
  public static final SkillType STORM_DRAGON_5
  public static final SkillType STOWAWAY_0
  public static final SkillType STOWAWAY_1
  public static final SkillType STOWAWAY_2
  public static final SkillType STOWAWAY_3
  public static final SkillType STOWAWAY_4
  public static final SkillType SUN_SEEKER_0
  public static final SkillType SUN_SEEKER_1
  public static final SkillType SUN_SEEKER_2
  public static final SkillType SUN_SEEKER_3
  public static final SkillType SUN_SEEKER_4
  public static final SkillType TOMB_ANGEL_0
  public static final SkillType TOMB_ANGEL_1
  public static final SkillType TOMB_ANGEL_2
  public static final SkillType TOMB_ANGEL_3
  public static final SkillType TOMB_ANGEL_4
  public static final SkillType TRIPLE_THREAT_0
  public static final SkillType TRIPLE_THREAT_1
  public static final SkillType TRIPLE_THREAT_2
  public static final SkillType TRIPLE_THREAT_3
  public static final SkillType TRIPLE_THREAT_4
  public static final SkillType UMLAUT_THE_FIRST_0
  public static final SkillType UMLAUT_THE_FIRST_1
  public static final SkillType UMLAUT_THE_FIRST_2
  public static final SkillType UMLAUT_THE_FIRST_3
  public static final SkillType UMLAUT_THE_FIRST_4
  public static final SkillType UNICORGI_0
  public static final SkillType UNICORGI_1
  public static final SkillType UNICORGI_2
  public static final SkillType UNICORGI_3
  public static final SkillType UNICORGI_4
  public static final SkillType UNICORGI_5
  public static final SkillType UNRIPE_MYTHOLOGY_0
  public static final SkillType UNRIPE_MYTHOLOGY_1
  public static final SkillType UNRIPE_MYTHOLOGY_2
  public static final SkillType UNRIPE_MYTHOLOGY_3
  public static final SkillType UNRIPE_MYTHOLOGY_4
  public static final SkillType UNSTABLE_UNDERSTUDY_0
  public static final SkillType UNSTABLE_UNDERSTUDY_1
  public static final SkillType UNSTABLE_UNDERSTUDY_2
  public static final SkillType UNSTABLE_UNDERSTUDY_3
  public static final SkillType UNSTABLE_UNDERSTUDY_4
  public static final SkillType UNSTABLE_UNDERSTUDY_5
  public static final SkillType UNSTABLE_UNDERSTUDY_6
  public static final SkillType UNSTABLE_UNDERSTUDY_TITAN
  public static final SkillType VERMILION_PRIESTESS_0
  public static final SkillType VERMILION_PRIESTESS_1
  public static final SkillType VERMILION_PRIESTESS_2
  public static final SkillType VERMILION_PRIESTESS_3
  public static final SkillType VERMILION_PRIESTESS_4
  public static final SkillType VILE_BILE_0
  public static final SkillType VILE_BILE_1
  public static final SkillType VILE_BILE_2
  public static final SkillType VILE_BILE_3
  public static final SkillType VILE_BILE_4
  public static final SkillType VOID_WYVERN_0
  public static final SkillType VOID_WYVERN_1
  public static final SkillType VOID_WYVERN_2
  public static final SkillType VOID_WYVERN_3
  public static final SkillType VOID_WYVERN_4
  public static final SkillType VULTURE_DRAGON_0
  public static final SkillType VULTURE_DRAGON_1
  public static final SkillType VULTURE_DRAGON_2
  public static final SkillType VULTURE_DRAGON_3
  public static final SkillType VULTURE_DRAGON_4
  public static final SkillType VULTURE_DRAGON_5
  public static final SkillType WEE_WITCH_0
  public static final SkillType WEE_WITCH_1
  public static final SkillType WEE_WITCH_2
  public static final SkillType WEE_WITCH_3
  public static final SkillType WEE_WITCH_4
  public static final SkillType WEREDRAGON_0
  public static final SkillType WEREDRAGON_1
  public static final SkillType WEREDRAGON_2
  public static final SkillType WEREDRAGON_3
  public static final SkillType WEREDRAGON_4
  public static final SkillType WEREDRAGON_5
  public static final SkillType WHITE_TIGRESS_0
  public static final SkillType WHITE_TIGRESS_1
  public static final SkillType WHITE_TIGRESS_2
  public static final SkillType WHITE_TIGRESS_3
  public static final SkillType WHITE_TIGRESS_4
  public static final SkillType ZOMBIE_SQUIRE_0
  public static final SkillType ZOMBIE_SQUIRE_1
  public static final SkillType ZOMBIE_SQUIRE_2
  public static final SkillType ZOMBIE_SQUIRE_3
  public static final SkillType ZOMBIE_SQUIRE_4
  public static final SkillType ZOMBIE_SQUIRE_5
  private static SkillType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.SkillType(String, int)

  // Methods (3)
  public static SkillType[] valuesCached()
  public static SkillType[] values()
  public static SkillType valueOf(String)
```

## com.perblue.rpg.network.messages.SocialHistory
```
public class SocialHistory extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = SocialHistory1
  public Map chatLists
  public List friends
  public Boolean guildOnly
  public List pMRooms

  // Constructors (2)
  com.perblue.rpg.network.messages.SocialHistory(a)
  com.perblue.rpg.network.messages.SocialHistory()

  // Methods (9)
  protected boolean innerReadFieldChatLists(a)
  protected boolean innerReadFieldPMRooms(a)
  protected boolean innerReadFieldFriends(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.SpecialEventRaw
```
public class SpecialEventRaw extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = SpecialEventRaw1
  public Long eventID
  public String jsonString

  // Constructors (2)
  com.perblue.rpg.network.messages.SpecialEventRaw(a)
  com.perblue.rpg.network.messages.SpecialEventRaw()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.SpecialEventsRaw
```
public class SpecialEventsRaw extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = SpecialEventsRaw1
  public Boolean changed
  public List contests
  public List events
  public SigninRewards signinRewards

  // Constructors (2)
  com.perblue.rpg.network.messages.SpecialEventsRaw()
  com.perblue.rpg.network.messages.SpecialEventsRaw(a)

  // Methods (12)
  protected boolean innerReadFieldSigninRewards_LastMonth(a)
  protected boolean innerReadFieldContests(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldSigninRewards(a)
  protected boolean innerReadFieldEvents(a)
  protected boolean innerReadFieldSigninRewards_ThisMonth(a)
  protected boolean innerReadFieldSigninRewards_NextMonth(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.SpecialEventsUpdate
```
public class SpecialEventsUpdate extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = SpecialEventsUpdate1
  public SpecialEventsRaw events
  public List snapshotEvents
  public Map teamLevelEventStarts
  public Map times
  public Map useItemEventTime

  // Constructors (2)
  com.perblue.rpg.network.messages.SpecialEventsUpdate(a)
  com.perblue.rpg.network.messages.SpecialEventsUpdate()

  // Methods (12)
  protected boolean innerReadFieldUseItemEventTime(a)
  protected boolean innerReadFieldEvents_SigninRewards(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldEvents(a)
  protected boolean innerReadFieldTimes(a)
  protected boolean innerReadFieldSnapshotEvents(a)
  protected boolean innerReadFieldTeamLevelEventStarts(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.StartArenaAttackResponse
```
public class StartArenaAttackResponse extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = StartArenaAttackResponse1
  public Long defendingUserID
  public List heroes
  public ArenaTier tier

  // Constructors (2)
  com.perblue.rpg.network.messages.StartArenaAttackResponse(a)
  com.perblue.rpg.network.messages.StartArenaAttackResponse()

  // Methods (7)
  protected boolean innerReadFieldHeroes(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.StartColiseumAttackResponse
```
public class StartColiseumAttackResponse extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = StartColiseumAttackResponse1
  public List defendingLineups
  public Long defendingUserID
  public ArenaTier tier

  // Constructors (2)
  com.perblue.rpg.network.messages.StartColiseumAttackResponse(a)
  com.perblue.rpg.network.messages.StartColiseumAttackResponse()

  // Methods (7)
  protected boolean innerReadFieldDefendingLineups(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.StartCryptRaidAttack
```
public class StartCryptRaidAttack extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = StartCryptRaidAttack1
  public HeroLineup attackingHeroes
  public Integer rankToAttack
  public Integer stageToAttack

  // Constructors (2)
  com.perblue.rpg.network.messages.StartCryptRaidAttack(a)
  com.perblue.rpg.network.messages.StartCryptRaidAttack()

  // Methods (7)
  protected boolean innerReadFieldAttackingHeroes(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.StartCryptRaidAttackResponse
```
public class StartCryptRaidAttackResponse extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = StartCryptRaidAttackResponse1
  public List heroes
  public Integer rank
  public Integer stage

  // Constructors (2)
  com.perblue.rpg.network.messages.StartCryptRaidAttackResponse(a)
  com.perblue.rpg.network.messages.StartCryptRaidAttackResponse()

  // Methods (7)
  protected boolean innerReadFieldHeroes(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.StartGuildWarAttack
```
public class StartGuildWarAttack extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = StartGuildWarAttack1
  public HeroLineup attackingHeroes
  public Integer lineupNumToAttack
  public Long userIDToAttack

  // Constructors (2)
  com.perblue.rpg.network.messages.StartGuildWarAttack(a)
  com.perblue.rpg.network.messages.StartGuildWarAttack()

  // Methods (7)
  protected boolean innerReadFieldAttackingHeroes(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.StartGuildWarAttackResponse
```
public class StartGuildWarAttackResponse extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = StartGuildWarAttackResponse1
  public Long defenderID
  public List defendingLineups
  public Integer lineupNum

  // Constructors (2)
  com.perblue.rpg.network.messages.StartGuildWarAttackResponse(a)
  com.perblue.rpg.network.messages.StartGuildWarAttackResponse()

  // Methods (7)
  protected boolean innerReadFieldDefendingLineups(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.StartTempleAttackResponse
```
public class StartTempleAttackResponse extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = StartTempleAttackResponse1
  public List activeBuffs
  public Integer guildTokenReward
  public TitanTempleRoundData titanData

  // Constructors (2)
  com.perblue.rpg.network.messages.StartTempleAttackResponse(a)
  com.perblue.rpg.network.messages.StartTempleAttackResponse()

  // Methods (11)
  protected boolean innerReadFieldTitanData_KilledByUser(a)
  protected boolean innerReadFieldTitanData(a)
  protected boolean innerReadFieldActiveBuffs(a)
  protected boolean innerReadFieldTitanData_Titan(a)
  protected boolean innerReadFieldTitanData_Reward(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.SuccessResponse
```
public class SuccessResponse extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = SuccessResponse1

  // Constructors (2)
  com.perblue.rpg.network.messages.SuccessResponse(a)
  com.perblue.rpg.network.messages.SuccessResponse()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TempleWinCountUpdatedMessage
```
public class TempleWinCountUpdatedMessage extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = TempleWinCountUpdatedMessage1
  public Integer newCount

  // Constructors (2)
  com.perblue.rpg.network.messages.TempleWinCountUpdatedMessage(a)
  com.perblue.rpg.network.messages.TempleWinCountUpdatedMessage()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TestPerfReport
```
public class TestPerfReport extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = TestPerfReport1
  public PerfReport base
  public Float batteryLevel
  public List frameLengths
  public Integer textureMemory

  // Constructors (2)
  com.perblue.rpg.network.messages.TestPerfReport(a)
  com.perblue.rpg.network.messages.TestPerfReport()

  // Methods (8)
  protected boolean innerReadFieldBase(a)
  protected boolean innerReadFieldFrameLengths(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TimeType
```
public final enum TimeType extends java.lang.Enum

  // Fields (43)
  private static final TimeType[] $VALUES
  public static final TimeType CHAT_APP_AUTH_TOKEN_IAT
  public static final TimeType CHAT_APP_LAST_LOGIN
  public static final TimeType CHAT_SILENCE_END
  public static final TimeType CRAFT_SUCCESS_END
  public static final TimeType CRAFT_SUCCESS_START
  public static final TimeType DEFAULT
  public static final TimeType DOUBLE_ELITE_DROP_ITEM_END
  public static final TimeType DOUBLE_ELITE_DROP_ITEM_START
  public static final TimeType DOUBLE_EXPERT_DROP_ITEM_END
  public static final TimeType DOUBLE_EXPERT_DROP_ITEM_START
  public static final TimeType DOUBLE_NORMAL_DROP_ITEM_END
  public static final TimeType DOUBLE_NORMAL_DROP_ITEM_START
  public static final TimeType GUILD_LEAVE_TIME
  public static final TimeType LAPSED_CATCH_UP_LAST_LOGOUT
  public static final TimeType LAST_CHESTS_VIEW_TIME
  public static final TimeType LAST_DAILY_RESET
  public static final TimeType LAST_DOUBLE_ELITE_PAUSE
  public static final TimeType LAST_DOUBLE_EXPERT_PAUSE
  public static final TimeType LAST_DOUBLE_NORMAL_PAUSE
  public static final TimeType LAST_EVENT_CHEST_RESET
  public static final TimeType LAST_EVENT_VIEW_TIME
  public static final TimeType LAST_GUILD_WALL_VIEW
  public static final TimeType LAST_MERCENARY_EARN_RESET
  public static final TimeType LAST_MERCHANT_VIEW_TIME
  public static final TimeType LAST_MONTHLY_SERVER_SIGNIN
  public static final TimeType LAST_MONTHLY_SIGNIN
  public static final TimeType LAST_NON_FREE_TIME_ZONE_CHANGE
  public static final TimeType LAST_PURCHASE
  public static final TimeType LAST_SOUL_CHEST_RESET
  public static final TimeType LAST_SPECIAL_EVENT_CHECK
  public static final TimeType LAST_SUSPENSION_TIME
  public static final TimeType LAST_TIME_ZONE_CHANGE
  public static final TimeType LAST_USER_DAILY_RESET
  public static final TimeType MONTHLY_CARD_EXPIRE_TIME
  public static final TimeType MONTHLY_DIAMOND_END
  public static final TimeType SUSPENSION_END
  public static final TimeType TEMPLE_EXPIRATION
  public static final TimeType TEMPORARY_VIP_END
  public static final TimeType XP_BONUS_TEAM_END
  public static final TimeType XP_BONUS_TEAM_PAUSE
  public static final TimeType XP_BONUS_TEAM_START
  private static TimeType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.TimeType(String, int)

  // Methods (3)
  public static TimeType[] valuesCached()
  public static TimeType[] values()
  public static TimeType valueOf(String)
```

## com.perblue.rpg.network.messages.TitanTempleAttack
```
public class TitanTempleAttack extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = TitanTempleAttack1
  public HeroLineup attackerHeroes
  public AttackBase base
  public Integer stagesCleared
  public Long templeID
  public UnitType titanType

  // Constructors (2)
  com.perblue.rpg.network.messages.TitanTempleAttack()
  com.perblue.rpg.network.messages.TitanTempleAttack(a)

  // Methods (8)
  protected boolean innerReadFieldBase(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldAttackerHeroes(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TitanTempleAttackOutcome
```
public class TitanTempleAttackOutcome extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = TitanTempleAttackOutcome1
  public UnitType titanAttacked
  public Boolean won

  // Constructors (2)
  com.perblue.rpg.network.messages.TitanTempleAttackOutcome(a)
  com.perblue.rpg.network.messages.TitanTempleAttackOutcome()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TitanTempleAttackOutcomes
```
public class TitanTempleAttackOutcomes extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = TitanTempleAttackOutcomes1
  public List attacks

  // Constructors (2)
  com.perblue.rpg.network.messages.TitanTempleAttackOutcomes(a)
  com.perblue.rpg.network.messages.TitanTempleAttackOutcomes()

  // Methods (7)
  protected boolean innerReadFieldAttacks(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TitanTempleData
```
public class TitanTempleData extends com.perblue.a.a.i

  // Fields (10)
  private static final String FULL_NAME = TitanTempleData1
  public Boolean attackInProgress
  public Integer attemptsRemaining
  public Long expireTime
  public Integer guildTokenReward
  public Integer level
  public BasicUserInfo owner
  public List possibleRewards
  public List titans
  public Integer winStreak

  // Constructors (2)
  com.perblue.rpg.network.messages.TitanTempleData(a)
  com.perblue.rpg.network.messages.TitanTempleData()

  // Methods (10)
  protected boolean innerReadFieldPossibleRewards(a)
  protected boolean innerReadFieldTitans(a)
  protected boolean innerReadFieldOwner(a)
  protected boolean innerReadFieldOwner_Avatar(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TitanTempleExtra
```
public class TitanTempleExtra extends com.perblue.a.a.i

  // Fields (10)
  private static final String FULL_NAME = TitanTempleExtra1
  public Map attemptsPerUser
  public Long expireTime
  public Long guildID
  public List invitedUsers
  public Integer level
  public List possibleRewards
  public List titans
  public Integer userLevel
  public Integer winStreak

  // Constructors (2)
  com.perblue.rpg.network.messages.TitanTempleExtra(a)
  com.perblue.rpg.network.messages.TitanTempleExtra()

  // Methods (10)
  protected boolean innerReadFieldPossibleRewards(a)
  protected boolean innerReadFieldTitans(a)
  protected boolean innerReadFieldInvitedUsers(a)
  protected boolean innerReadFieldAttemptsPerUser(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TitanTempleInviteData
```
public class TitanTempleInviteData extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = TitanTempleInviteData1
  public Integer freeInvitesRemaining
  public List members
  public Integer sendInviteCost

  // Constructors (2)
  com.perblue.rpg.network.messages.TitanTempleInviteData(a)
  com.perblue.rpg.network.messages.TitanTempleInviteData()

  // Methods (7)
  protected boolean innerReadFieldMembers(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TitanTempleRoundData
```
public class TitanTempleRoundData extends com.perblue.a.a.i

  // Fields (8)
  private static final String FULL_NAME = TitanTempleRoundData1
  public Boolean killed
  public BasicUserInfo killedByUser
  public RewardDrop reward
  public Boolean rewardCollected
  public List stage1Minions
  public List stage2Minions
  public HeroData titan

  // Constructors (2)
  com.perblue.rpg.network.messages.TitanTempleRoundData(a)
  com.perblue.rpg.network.messages.TitanTempleRoundData()

  // Methods (12)
  protected boolean innerReadFieldKilledByUser_Avatar(a)
  protected boolean innerReadFieldTitan(a)
  protected boolean innerReadFieldReward(a)
  protected boolean innerReadFieldStage1Minions(a)
  protected boolean innerReadFieldStage2Minions(a)
  protected boolean innerReadFieldKilledByUser(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TitanTempleSummaries
```
public class TitanTempleSummaries extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = TitanTempleSummaries1
  public List invitedTemples
  public TitanTempleSummary yourTemple

  // Constructors (2)
  com.perblue.rpg.network.messages.TitanTempleSummaries()
  com.perblue.rpg.network.messages.TitanTempleSummaries(a)

  // Methods (9)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldYourTemple(a)
  protected boolean innerReadFieldInvitedTemples(a)
  protected boolean innerReadFieldYourTemple_Owner(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TitanTempleSummary
```
public class TitanTempleSummary extends com.perblue.a.a.i

  // Fields (12)
  private static final String FULL_NAME = TitanTempleSummary1
  public Boolean attackInProgress
  public Integer attemptsRemaining
  public Long expireTime
  public Integer freeInvitesRemaining
  public Long guildID
  public Integer level
  public BasicUserInfo owner
  public Long templeID
  public Integer titansRemaining
  public Integer totalTitans
  public Boolean unclaimedRewards

  // Constructors (2)
  com.perblue.rpg.network.messages.TitanTempleSummary(a)
  com.perblue.rpg.network.messages.TitanTempleSummary()

  // Methods (8)
  protected boolean innerReadFieldOwner(a)
  protected boolean innerReadFieldOwner_Avatar(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TitanTempleTitanData
```
public class TitanTempleTitanData extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = TitanTempleTitanData1
  public Boolean killed
  public RewardDrop reward
  public Boolean rewardCollected
  public List stage1Minions
  public List stage2Minions
  public UnitType titanType

  // Constructors (2)
  com.perblue.rpg.network.messages.TitanTempleTitanData(a)
  com.perblue.rpg.network.messages.TitanTempleTitanData()

  // Methods (9)
  protected boolean innerReadFieldReward(a)
  protected boolean innerReadFieldStage1Minions(a)
  protected boolean innerReadFieldStage2Minions(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TutorialAct
```
public class TutorialAct extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = TutorialAct1
  public Integer maxStep
  public Integer step
  public TutorialActType type
  public Integer version

  // Constructors (2)
  com.perblue.rpg.network.messages.TutorialAct(a)
  com.perblue.rpg.network.messages.TutorialAct()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.TutorialActType
```
public final enum TutorialActType extends java.lang.Enum

  // Fields (81)
  private static final TutorialActType[] $VALUES
  public static final TutorialActType ACHIEVEMENTS
  public static final TutorialActType AUTO_FIGHT
  public static final TutorialActType BOSS_PIT
  public static final TutorialActType CRAFTING
  public static final TutorialActType CRYPT
  public static final TutorialActType DAILY_QUEST
  public static final TutorialActType DEFAULT
  public static final TutorialActType ENCHANTING
  public static final TutorialActType EQUIPPING_HERO
  public static final TutorialActType EVIL_WIZARD_STORY
  public static final TutorialActType EVOLVING_HERO
  public static final TutorialActType FIGHT_PIT
  public static final TutorialActType GIANT_PLANT_STORY
  public static final TutorialActType GOLD_COLOSSUS_STORY
  public static final TutorialActType GUILD_WAR
  public static final TutorialActType INTRO
  public static final TutorialActType LEGENDARY_QUEST_INFO
  public static final TutorialActType LQ_ANGELIC_HERALD
  public static final TutorialActType LQ_AQUATIC_MAN
  public static final TutorialActType LQ_BARDBARIAN
  public static final TutorialActType LQ_BONE_DRAGON
  public static final TutorialActType LQ_BROZERKER
  public static final TutorialActType LQ_CATAPULT_KNIGHT
  public static final TutorialActType LQ_CENTAUR_OF_ATTENTION
  public static final TutorialActType LQ_COSMIC_ELF
  public static final TutorialActType LQ_CRIMSON_WITCH
  public static final TutorialActType LQ_DARK_DRAKUL
  public static final TutorialActType LQ_DARK_HORSE
  public static final TutorialActType LQ_DEEP_DRAGON
  public static final TutorialActType LQ_DEMON_TOTEM
  public static final TutorialActType LQ_DRAGON_LADY
  public static final TutorialActType LQ_DRAGZILLA
  public static final TutorialActType LQ_DRUIDINATRIX
  public static final TutorialActType LQ_DUST_DEVIL
  public static final TutorialActType LQ_DWARVEN_ARCHER
  public static final TutorialActType LQ_ELECTROYETI
  public static final TutorialActType LQ_ETERNAL_ENCHANTER
  public static final TutorialActType LQ_FAITH_HEALER
  public static final TutorialActType LQ_FROST_GIANT
  public static final TutorialActType LQ_GENIE
  public static final TutorialActType LQ_GROOVY_DRUID
  public static final TutorialActType LQ_HYDRA
  public static final TutorialActType LQ_MAGIC_DRAGON
  public static final TutorialActType LQ_MEDUSA
  public static final TutorialActType LQ_MINOTAUR
  public static final TutorialActType LQ_MOON_DRAKE
  public static final TutorialActType LQ_NINJA_DWARF
  public static final TutorialActType LQ_ORC_MONK
  public static final TutorialActType LQ_PIRATE
  public static final TutorialActType LQ_POLEMASTER
  public static final TutorialActType LQ_RABID_DRAGON
  public static final TutorialActType LQ_RAGING_REVENANT
  public static final TutorialActType LQ_ROLLER_WARRIOR
  public static final TutorialActType LQ_SATYR
  public static final TutorialActType LQ_SAVAGE_CUTIE
  public static final TutorialActType LQ_SHADOW_ASSASSIN
  public static final TutorialActType LQ_SKELETON_KING
  public static final TutorialActType LQ_SNAP_DRAGON
  public static final TutorialActType LQ_SOJOURNER_SORCERESS
  public static final TutorialActType LQ_SPIKEY_DRAGON
  public static final TutorialActType LQ_SPIRIT_WOLF
  public static final TutorialActType LQ_STORM_DRAGON
  public static final TutorialActType LQ_UNICORGI
  public static final TutorialActType LQ_UNSTABLE_UNDERSTUDY
  public static final TutorialActType LQ_VULTURE_DRAGON
  public static final TutorialActType LQ_WEREDRAGON
  public static final TutorialActType LQ_ZOMBIE_SQUIRE
  public static final TutorialActType MYSTIC_CLOSET
  public static final TutorialActType MYSTIC_CLOSET_EQUIP
  public static final TutorialActType POWER_POINTS
  public static final TutorialActType POWER_USE
  public static final TutorialActType PROMOTE_HERO
  public static final TutorialActType RUNES
  public static final TutorialActType RUNE_FUSION
  public static final TutorialActType RUNE_SHRINE
  public static final TutorialActType STORY
  public static final TutorialActType TEMPLE_INVITE
  public static final TutorialActType TEMPLE_YOURS
  public static final TutorialActType UNLOCK_HERO
  private static TutorialActType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.TutorialActType(String, int)

  // Methods (3)
  public static TutorialActType[] valuesCached()
  public static TutorialActType[] values()
  public static TutorialActType valueOf(String)
```

## com.perblue.rpg.network.messages.UnblockUser
```
public class UnblockUser extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = UnblockUser1
  public Long userID

  // Constructors (2)
  com.perblue.rpg.network.messages.UnblockUser(a)
  com.perblue.rpg.network.messages.UnblockUser()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.UnitType
```
public final enum UnitType extends java.lang.Enum

  // Fields (147)
  private static final UnitType[] $VALUES
  public static final UnitType ABYSS_DRAGON
  public static final UnitType ANCIENT_DWARF
  public static final UnitType ANGELIC_HERALD
  public static final UnitType ANGEL_DRAGON
  public static final UnitType AQUATIC_MAN
  public static final UnitType BANSHEE
  public static final UnitType BARDBARIAN
  public static final UnitType BLACK_WING
  public static final UnitType BONE_DRAGON
  public static final UnitType BROZERKER
  public static final UnitType BULWARK_ANGEL
  public static final UnitType BURNT_ONE
  public static final UnitType CATAPULT_KNIGHT
  public static final UnitType CENTAUR_OF_ATTENTION
  public static final UnitType CLAW_MAN
  public static final UnitType COSMIC_ELF
  public static final UnitType CRIMSON_WITCH
  public static final UnitType CURSED_STATUE
  public static final UnitType CYCLOPS_WIZARD
  public static final UnitType DARK_DRACUL
  public static final UnitType DARK_HERO
  public static final UnitType DARK_HORSE
  public static final UnitType DEEP_DRAGON
  public static final UnitType DEFAULT
  public static final UnitType DEMON_TOTEM
  public static final UnitType DIGGER_MOLE
  public static final UnitType DOPPELGANGER
  public static final UnitType DRAGON_LADY
  public static final UnitType DRAGON_SLAYER
  public static final UnitType DRAGZILLA
  public static final UnitType DRUIDINATRIX
  public static final UnitType DUNGEON_MAN
  public static final UnitType DUST_DEVIL
  public static final UnitType DWARVEN_ARCHER
  public static final UnitType ELECTROYETI
  public static final UnitType ETERNAL_ENCHANTER
  public static final UnitType FAITH_HEALER
  public static final UnitType FORGOTTEN_DRAGON
  public static final UnitType FROST_GIANT
  public static final UnitType GENIE
  public static final UnitType GRAND_HUNTRESS
  public static final UnitType GREED_DRAGON
  public static final UnitType GROOVY_DRUID
  public static final UnitType HYDRA
  public static final UnitType KARAOKE_KING
  public static final UnitType KRAKEN_KING
  public static final UnitType LAST_DEFENDER
  public static final UnitType MAGIC_DRAGON
  public static final UnitType MEDUSA
  public static final UnitType MINOTAUR
  public static final UnitType MISTRESS_MANICURE
  public static final UnitType MOON_DRAKE
  public static final UnitType NINJA_DWARF
  public static final UnitType NPC_ABYSS_DRAGON
  public static final UnitType NPC_ANGELIC_AVENGER
  public static final UnitType NPC_ANT
  public static final UnitType NPC_ANUBIS_DRAGON
  public static final UnitType NPC_BOSS_ABYSS_DRAGON
  public static final UnitType NPC_BOSS_ANDRAGONUS_THE_FIRST
  public static final UnitType NPC_BOSS_ANUBIS_DRAGON
  public static final UnitType NPC_BOSS_UMLAUT_THE_FIFTH_FIRST
  public static final UnitType NPC_BREAKER_MKII
  public static final UnitType NPC_BUFF_SPRITE
  public static final UnitType NPC_CAULDRON_MONSTER
  public static final UnitType NPC_CLOUD_MONSTER
  public static final UnitType NPC_CRYSTAL_GOLEM
  public static final UnitType NPC_CRYSTAL_LIZARD
  public static final UnitType NPC_EVIL_WIZARD
  public static final UnitType NPC_EYEBALL
  public static final UnitType NPC_FIRE_IMP
  public static final UnitType NPC_FLEA_DEMON
  public static final UnitType NPC_GENIE_CHICKEN
  public static final UnitType NPC_GENIE_COW
  public static final UnitType NPC_GENIE_GOAT
  public static final UnitType NPC_GIANT_PLANT
  public static final UnitType NPC_GIANT_PLANT_ROOT
  public static final UnitType NPC_GOBLIN
  public static final UnitType NPC_GOLD_COLOSSUS
  public static final UnitType NPC_HEAD_CRAB
  public static final UnitType NPC_HEALER_SPRITE
  public static final UnitType NPC_ICE_GOLEM
  public static final UnitType NPC_INFERNO_SPIDER
  public static final UnitType NPC_KAMIKAZE_GNOME
  public static final UnitType NPC_KING_IMP
  public static final UnitType NPC_LYING_LANTERN
  public static final UnitType NPC_MR_SMASHY
  public static final UnitType NPC_MUSHROOM
  public static final UnitType NPC_MYSTIC_WILDLING
  public static final UnitType NPC_PLAGUE_SKULKER
  public static final UnitType NPC_POTTED_PLANT
  public static final UnitType NPC_RED_TIGER
  public static final UnitType NPC_SCARECROW
  public static final UnitType NPC_SHARK
  public static final UnitType NPC_SINISTER_ASSAILANT
  public static final UnitType NPC_SKELETON_DEER
  public static final UnitType NPC_SQUID
  public static final UnitType NPC_SQUIRREL
  public static final UnitType NPC_STONE_IMP
  public static final UnitType NPC_TEST_DUMMY
  public static final UnitType NPC_TROLL_BLOB
  public static final UnitType NPC_UMLAUT_THE_FIFTH_FIRST
  public static final UnitType NPC_WILDLING_ARCHER
  public static final UnitType NPC_WILDLING_SNIPER
  public static final UnitType ORC_MONK
  public static final UnitType PCH_ANUBIS_DRAGON
  public static final UnitType PIRATE
  public static final UnitType PLAGUE_ENTREPRENEUR
  public static final UnitType PLANT_SOUL
  public static final UnitType POLEMASTER
  public static final UnitType RABID_DRAGON
  public static final UnitType RAGING_REVENANT
  public static final UnitType ROLLER_WARRIOR
  public static final UnitType SADISTIC_DANCER
  public static final UnitType SATYR
  public static final UnitType SAVAGE_CUTIE
  public static final UnitType SHADOW_ASSASSIN
  public static final UnitType SHADOW_OF_SVEN
  public static final UnitType SILENT_SPIRIT
  public static final UnitType SKELETON_KING
  public static final UnitType SNAPPER_BONE
  public static final UnitType SNAP_DRAGON
  public static final UnitType SNIPER_WOLF
  public static final UnitType SOJOURNER_SORCERESS
  public static final UnitType SPECTRAL_DRAGON
  public static final UnitType SPIDER_QUEEN
  public static final UnitType SPIKEY_DRAGON
  public static final UnitType STEPLADDER_BROTHERS
  public static final UnitType STORM_DRAGON
  public static final UnitType STOWAWAY
  public static final UnitType SUN_SEEKER
  public static final UnitType TITAN_BUFF
  public static final UnitType TOMB_ANGEL
  public static final UnitType TRIPLE_THREAT
  public static final UnitType UMLAUT_THE_FIRST
  public static final UnitType UNICORGI
  public static final UnitType UNRIPE_MYTHOLOGY
  public static final UnitType UNSTABLE_UNDERSTUDY
  public static final UnitType VERMILION_PRIESTESS
  public static final UnitType VILE_BILE
  public static final UnitType VOID_WYVERN
  public static final UnitType VULTURE_DRAGON
  public static final UnitType WEE_WITCH
  public static final UnitType WEREDRAGON
  public static final UnitType WHITE_TIGRESS
  public static final UnitType ZOMBIE_SQUIRE
  private static UnitType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.UnitType(String, int)

  // Methods (3)
  public static UnitType[] valuesCached()
  public static UnitType[] values()
  public static UnitType valueOf(String)
```

## com.perblue.rpg.network.messages.UpdateChat
```
public class UpdateChat extends com.perblue.a.a.i

  // Fields (2)
  private static final String FULL_NAME = UpdateChat1
  public Chat chat

  // Constructors (2)
  com.perblue.rpg.network.messages.UpdateChat(a)
  com.perblue.rpg.network.messages.UpdateChat()

  // Methods (10)
  protected boolean innerReadFieldChat_Sender(a)
  protected boolean innerReadFieldChat_GuildInfo(a)
  protected boolean innerReadFieldChat_Heroes(a)
  protected boolean innerReadFieldChat(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.UpdateClient
```
public class UpdateClient extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = UpdateClient1
  public String message
  public Integer minVersion
  public String updatePackage
  public String updateURL

  // Constructors (2)
  com.perblue.rpg.network.messages.UpdateClient(a)
  com.perblue.rpg.network.messages.UpdateClient()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.UpdateUserTime
```
public class UpdateUserTime extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = UpdateUserTime1
  public Long time
  public TimeType type

  // Constructors (2)
  com.perblue.rpg.network.messages.UpdateUserTime(a)
  com.perblue.rpg.network.messages.UpdateUserTime()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.UseItemEventType
```
public final enum UseItemEventType extends java.lang.Enum

  // Fields (7)
  private static final UseItemEventType[] $VALUES
  public static final UseItemEventType DEFAULT
  public static final UseItemEventType DROP_BONUS_ELITE_2X
  public static final UseItemEventType DROP_BONUS_EXPERT_2X
  public static final UseItemEventType DROP_BONUS_NORMAL_2X
  public static final UseItemEventType TEAM_XP_BONUS_2X
  private static UseItemEventType[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.UseItemEventType(String, int)

  // Methods (3)
  public static UseItemEventType[] valuesCached()
  public static UseItemEventType[] values()
  public static UseItemEventType valueOf(String)
```

## com.perblue.rpg.network.messages.UserExtra
```
public class UserExtra extends com.perblue.a.a.i

  // Fields (98)
  private static final String FULL_NAME = UserExtra1
  public Map aBGroups
  public Map activeDropMultipliers
  public Map activeUseItemEventMultipliers
  public Boolean admin
  public AppReviewStatus appReviewStatus
  public Avatar avatar
  public Map battleOptOutsPerGuild
  public List battlesMissed
  public Map blockedUsers
  public BossPitData bossPitData
  public Map bossPitStars
  public Map claimedArenaRewards
  public Map claimedColiseumRewards
  public Map combatAutoSettings
  public Map completedEvents
  public Map completedQuests
  public List consumableItemsViewed
  public Map cooldowns
  public String country
  public Map counts
  public Long currentTitanTemple
  public String customBanMessage
  public Map dailyChances
  public Map dailyUses
  public Map eventSigninBonusLastSigninTime
  public Map eventSigninBonusMonthlySignins
  public Integer expLootPool
  public Long expeditionID
  public String facebookName
  public Map flags
  public String gameCenterName
  public String gameCircleName
  public Map gameModeProgressionTracker
  public Map globalMailMessageData
  public String googlePlusName
  public Long guildJoinTime
  public List guildTitanTemples
  public Map heroLineups
  public Map heroStoneCounts
  public Map heroes
  public Map hiredHeroes
  public Map howToPlayFlags
  public Map iAPProductPurchases
  public Map items
  public Long joinedWarID
  public String language
  public Date lastLogout
  public Map lastResourceGenerationTimes
  public ItemType lastVIPItem
  public Long lastViewedWarBattle
  public List levelStatuses
  public List likedHeroWallPosts
  public List loginDays
  public Map lootMemory
  public Long mercenariesPostedAtGuildID
  public Map merchantData
  public List modeAutoUnlocks
  public Boolean moderator
  public Integer monthlySignins
  public Map newSkins
  public Long nextRuneID
  public UnitType oldAvatar
  public ExpeditionRunData oldExpeditionData
  public Integer oldExpeditionID
  public Map oldLootMemory
  public String optedOutOfWarBy
  public Map personalMessageHideTime
  public Map previousEventSigninStatus
  public String previousName
  public Map previousSigninStatus
  public List promoCodes
  public Map questCompletionTimes
  public Map questCounters
  public Map resources
  public Map runeEmpowerMemory
  public List runes
  public Map settings
  public List snapshotEvents
  public Map storedSeeds
  public Integer suspensionOffenceCount
  public String suspensionReason
  public Map teamLevelEventStarts
  public Map thirdPartyQuestStatuses
  public String timeZone
  public Integer timeZoneOffset
  public Map times
  public List tutorialActs
  public Integer unclaimedArenaDemotionDivision
  public ArenaTier unclaimedArenaDemotionTier
  public Integer unclaimedArenaPromotionDivision
  public ArenaTier unclaimedArenaPromotionTier
  public Integer unclaimedColiseumDemotionDivision
  public ArenaTier unclaimedColiseumDemotionTier
  public Integer unclaimedColiseumPromotionDivision
  public ArenaTier unclaimedColiseumPromotionTier
  public List userEventsRecorded
  public List viewedDailyQuests

  // Constructors (2)
  com.perblue.rpg.network.messages.UserExtra(a)
  com.perblue.rpg.network.messages.UserExtra()

  // Methods (66)
  protected boolean innerReadFieldHeroes(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldCombatAutoSettings(a)
  protected boolean innerReadFieldQuestCounters(a)
  protected boolean innerReadFieldRuneEmpowerMemory(a)
  protected boolean innerReadFieldNewSkins(a)
  protected boolean innerReadFieldBossPitStars(a)
  protected boolean innerReadFieldBattlesMissed(a)
  protected boolean innerReadFieldItems(a)
  protected boolean innerReadFieldRunes(a)
  protected boolean innerReadFieldAvatar(a)
  protected boolean innerReadFieldSettings(a)
  protected boolean innerReadFieldBlockedUsers(a)
  protected boolean innerReadFieldFlags(a)
  protected boolean innerReadFieldTutorialActs(a)
  protected boolean innerReadFieldCounts(a)
  protected boolean innerReadFieldLoginDays(a)
  protected boolean innerReadFieldHeroLineups(a)
  protected boolean innerReadFieldResources(a)
  protected boolean innerReadFieldIAPProductPurchases(a)
  protected boolean innerReadFieldDailyUses(a)
  protected boolean innerReadFieldDailyChances(a)
  protected boolean innerReadFieldCooldowns(a)
  protected boolean innerReadFieldMerchantData(a)
  protected boolean innerReadFieldOldLootMemory(a)
  protected boolean innerReadFieldLevelStatuses(a)
  protected boolean innerReadFieldCompletedQuests(a)
  protected boolean innerReadFieldQuestCompletionTimes(a)
  protected boolean innerReadFieldClaimedArenaRewards(a)
  protected boolean innerReadFieldHeroStoneCounts(a)
  protected boolean innerReadFieldTimes(a)
  protected boolean innerReadFieldUserEventsRecorded(a)
  protected boolean innerReadFieldABGroups(a)
  protected boolean innerReadFieldPreviousSigninStatus(a)
  protected boolean innerReadFieldViewedDailyQuests(a)
  protected boolean innerReadFieldOldExpeditionData(a)
  protected boolean innerReadFieldHiredHeroes(a)
  protected boolean innerReadFieldModeAutoUnlocks(a)
  protected boolean innerReadFieldLikedHeroWallPosts(a)
  protected boolean innerReadFieldLootMemory(a)
  protected boolean innerReadFieldHowToPlayFlags(a)
  protected boolean innerReadFieldGuildTitanTemples(a)
  protected boolean innerReadFieldSnapshotEvents(a)
  protected boolean innerReadFieldBossPitData(a)
  protected boolean innerReadFieldPromoCodes(a)
  protected boolean innerReadFieldCompletedEvents(a)
  protected boolean innerReadFieldStoredSeeds(a)
  protected boolean innerReadFieldTeamLevelEventStarts(a)
  protected boolean innerReadFieldGameModeProgressionTracker(a)
  protected boolean innerReadFieldBattleOptOutsPerGuild(a)
  protected boolean innerReadFieldActiveUseItemEventMultipliers(a)
  protected boolean innerReadFieldEventSigninBonusLastSigninTime(a)
  protected boolean innerReadFieldEventSigninBonusMonthlySignins(a)
  protected boolean innerReadFieldPreviousEventSigninStatus(a)
  protected boolean innerReadFieldPersonalMessageHideTime(a)
  protected boolean innerReadFieldLastResourceGenerationTimes(a)
  protected boolean innerReadFieldGlobalMailMessageData(a)
  protected boolean innerReadFieldThirdPartyQuestStatuses(a)
  protected boolean innerReadFieldClaimedColiseumRewards(a)
  protected boolean innerReadFieldConsumableItemsViewed(a)
  protected boolean innerReadFieldActiveDropMultipliers(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.UserGuildUpdate
```
public class UserGuildUpdate extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = UserGuildUpdate1
  public Long guildID
  public GuildInfo guildInfo
  public GuildRole guildRole

  // Constructors (2)
  com.perblue.rpg.network.messages.UserGuildUpdate(a)
  com.perblue.rpg.network.messages.UserGuildUpdate()

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldGuildInfo(a)
  protected boolean innerReadFieldGuildInfo_BasicInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.UserInfo
```
public class UserInfo extends com.perblue.a.a.i

  // Fields (14)
  private static final String FULL_NAME = UserInfo1
  public BasicUserInfo basicInfo
  public Long creationTime
  public String creationTimeServerTxt
  public Integer diamonds
  public Long lastLoginTime
  public Integer shardID
  public Integer teamPower
  public Integer teamPowerRank
  public Integer totalPower
  public Integer totalPowerRank
  public Integer totalStars
  public Integer totalStarsRank
  public Integer vIPLevel

  // Constructors (2)
  com.perblue.rpg.network.messages.UserInfo()
  com.perblue.rpg.network.messages.UserInfo(a)

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldBasicInfo_Avatar(a)
  protected boolean innerReadFieldBasicInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.UserInfoResponse
```
public class UserInfoResponse extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = UserInfoResponse1
  public AuthType authType
  public BasicGuildInfo guildInfo
  public BasicUserInfo info
  public Integer level
  public PrivateUserInfo privateLoginInfo
  public Integer shardID

  // Constructors (2)
  com.perblue.rpg.network.messages.UserInfoResponse(a)
  com.perblue.rpg.network.messages.UserInfoResponse()

  // Methods (10)
  protected boolean innerReadFieldPrivateLoginInfo(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldGuildInfo(a)
  protected boolean innerReadFieldInfo_Avatar(a)
  protected boolean innerReadFieldInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.UserLootMemoryChange
```
public class UserLootMemoryChange extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = UserLootMemoryChange1
  public Float endingMemory
  public ItemType itemType
  public Float startingMemory

  // Constructors (2)
  com.perblue.rpg.network.messages.UserLootMemoryChange(a)
  com.perblue.rpg.network.messages.UserLootMemoryChange()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.UserSaveData
```
public class UserSaveData extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = UserSaveData1
  public UserExtra extra
  public UserInfo info

  // Constructors (2)
  com.perblue.rpg.network.messages.UserSaveData(a)
  com.perblue.rpg.network.messages.UserSaveData()

  // Methods (12)
  protected boolean innerReadFieldExtra_BossPitData(a)
  protected boolean innerReadFieldExtra_Avatar(a)
  protected boolean innerReadFieldInfo_BasicInfo(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldInfo(a)
  protected boolean innerReadFieldExtra_OldExpeditionData(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  protected boolean innerReadFieldExtra(a)
  public String toString()
```

## com.perblue.rpg.network.messages.VIPPromoCard
```
public class VIPPromoCard extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = VIPPromoCard1
  public List bulletPoints
  public String header
  public String subHeader

  // Constructors (2)
  com.perblue.rpg.network.messages.VIPPromoCard(a)
  com.perblue.rpg.network.messages.VIPPromoCard()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldBulletPoints(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarBattle
```
public class WarBattle extends com.perblue.a.a.i

  // Fields (17)
  private static final String FULL_NAME = WarBattle1
  public Integer attackerMMRChange
  public WarGuildProgress attackerProgress
  public Boolean attackerReceivedStreakBonus
  public BasicGuildInfo attackingGuildInfo
  public Long battleEndTime
  public Long battleStartTime
  public Integer consecutiveWins
  public Map contribution
  public Integer defenderMMRChange
  public WarGuildProgress defenderProgress
  public BasicGuildInfo defendingGuildInfo
  public Long iD
  public Integer shardID
  public Map tokensEarned
  public Long warID
  public Long winningGuildID

  // Constructors (2)
  com.perblue.rpg.network.messages.WarBattle(a)
  com.perblue.rpg.network.messages.WarBattle()

  // Methods (12)
  protected boolean innerReadFieldAttackingGuildInfo(a)
  protected boolean innerReadFieldDefendingGuildInfo(a)
  protected boolean innerReadFieldContribution(a)
  protected boolean innerReadFieldTokensEarned(a)
  protected boolean innerReadFieldAttackerProgress(a)
  protected boolean innerReadFieldDefenderProgress(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarBattleLog
```
public class WarBattleLog extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = WarBattleLog1
  public List battles
  public Boolean hasNew

  // Constructors (2)
  com.perblue.rpg.network.messages.WarBattleLog(a)
  com.perblue.rpg.network.messages.WarBattleLog()

  // Methods (7)
  protected boolean innerReadFieldBattles(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarBattleResult
```
public class WarBattleResult extends com.perblue.a.a.i

  // Fields (9)
  private static final String FULL_NAME = WarBattleResult1
  public Long battleID
  public Integer consecutiveWins
  public Integer contribution
  public Integer mMRChange
  public BasicGuildInfo opponentInfo
  public Boolean receivedWinStreakBonus
  public Boolean unviewed
  public Boolean won

  // Constructors (2)
  com.perblue.rpg.network.messages.WarBattleResult(a)
  com.perblue.rpg.network.messages.WarBattleResult()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldOpponentInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarFight
```
public class WarFight extends com.perblue.a.a.i

  // Fields (10)
  private static final String FULL_NAME = WarFight1
  public WarFightUserInfo attackerInfo
  public Long battleID
  public Long battleTime
  public WarFightUserInfo defenderInfo
  public Long iD
  public Integer lineupNum
  public Integer shardID
  public Long warID
  public Long winnerID

  // Constructors (2)
  com.perblue.rpg.network.messages.WarFight(a)
  com.perblue.rpg.network.messages.WarFight()

  // Methods (14)
  protected boolean innerReadFieldAttackerInfo(a)
  protected boolean innerReadFieldDefenderInfo(a)
  protected boolean innerReadFieldAttackerInfo_Info(a)
  protected boolean innerReadFieldAttackerInfo_Lineup(a)
  protected boolean innerReadFieldDefenderInfo_Info(a)
  protected boolean innerReadFieldDefenderInfo_Lineup(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldAttackerInfo_GuildInfo(a)
  protected boolean innerReadFieldDefenderInfo_GuildInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarFightLog
```
public class WarFightLog extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = WarFightLog1
  public List fights
  public Boolean hasNew

  // Constructors (2)
  com.perblue.rpg.network.messages.WarFightLog(a)
  com.perblue.rpg.network.messages.WarFightLog()

  // Methods (7)
  protected boolean innerReadFieldFights(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarFightUserInfo
```
public class WarFightUserInfo extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = WarFightUserInfo1
  public Integer contribution
  public BasicGuildInfo guildInfo
  public Integer guildMMR
  public BasicUserInfo info
  public WarLineupData lineup
  public Integer pointsEarned

  // Constructors (2)
  com.perblue.rpg.network.messages.WarFightUserInfo()
  com.perblue.rpg.network.messages.WarFightUserInfo(a)

  // Methods (12)
  protected boolean innerReadFieldLineup(a)
  protected boolean innerReadFieldLineup_Stage1(a)
  protected boolean innerReadFieldLineup_Stage2(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldGuildInfo(a)
  protected boolean innerReadFieldInfo_Avatar(a)
  protected boolean innerReadFieldInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarGuildInfo
```
public class WarGuildInfo extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = WarGuildInfo1
  public BasicGuildInfo info
  public Integer mMR
  public List opponents
  public WarGuildProgress progress

  // Constructors (2)
  com.perblue.rpg.network.messages.WarGuildInfo(a)
  com.perblue.rpg.network.messages.WarGuildInfo()

  // Methods (9)
  protected boolean innerReadFieldOpponents(a)
  protected boolean innerReadFieldProgress(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarGuildProgress
```
public class WarGuildProgress extends com.perblue.a.a.i

  // Fields (8)
  private static final String FULL_NAME = WarGuildProgress1
  public Integer defensiveLosses
  public Integer defensiveWins
  public Integer mmrChange
  public Integer offensiveLosses
  public Integer offensiveWins
  public Integer startingMmr
  public Integer startingRank

  // Constructors (2)
  com.perblue.rpg.network.messages.WarGuildProgress(a)
  com.perblue.rpg.network.messages.WarGuildProgress()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarInfo
```
public class WarInfo extends com.perblue.a.a.i

  // Fields (25)
  private static final String FULL_NAME = WarInfo1
  public Integer eligibleMembers
  public Long endTime
  public Long nextWarTicketGenerationTime
  public WarGuildInfo opponentInfo
  public Integer pointsEarned
  public Integer pointsToWin
  public WarRedDotInfo redDotInfo
  public Long registartionStartTime
  public Long registrationEndTime
  public Long startTime
  public WarState state
  public Integer totalPoints
  public Boolean unviewedBattleLog
  public WarBattleResult unviewedBattleResult
  public List unviewedWarResults
  public Long warID
  public Long warTicketGenInterval
  public Integer warTickets
  public Boolean winnable
  public Integer yourGuildMMR
  public WarGuildProgress yourGuildProgress
  public Integer yourGuildSize
  public Integer yourPositionInGuild
  public GuildWarStatus yourStatus

  // Constructors (2)
  com.perblue.rpg.network.messages.WarInfo(a)
  com.perblue.rpg.network.messages.WarInfo()

  // Methods (14)
  protected boolean innerReadFieldOpponentInfo_Progress(a)
  protected boolean innerReadFieldUnviewedBattleResult_OpponentInfo(a)
  protected boolean innerReadFieldRedDotInfo(a)
  protected boolean innerReadFieldUnviewedBattleResult(a)
  protected boolean innerReadFieldUnviewedWarResults(a)
  protected boolean innerReadFieldYourGuildProgress(a)
  protected boolean innerReadFieldOpponentInfo_Info(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldOpponentInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarLineupData
```
public class WarLineupData extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = WarLineupData1
  public Boolean defeated
  public String defeatedBy
  public Integer points
  public LineupSummary stage1
  public LineupSummary stage2

  // Constructors (2)
  com.perblue.rpg.network.messages.WarLineupData(a)
  com.perblue.rpg.network.messages.WarLineupData()

  // Methods (8)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldStage2(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  protected boolean innerReadFieldStage1(a)
  public String toString()
```

## com.perblue.rpg.network.messages.WarLog
```
public class WarLog extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = WarLog1
  public Boolean hasNew
  public List wars

  // Constructors (2)
  com.perblue.rpg.network.messages.WarLog(a)
  com.perblue.rpg.network.messages.WarLog()

  // Methods (7)
  protected boolean innerReadFieldWars(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarLogs
```
public class WarLogs extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = WarLogs1
  public WarLog allTimeLog
  public WarFightLog attackLog
  public WarFightLog battleLog
  public WarFightLog defenseLog
  public WarBattleLog warLog

  // Constructors (2)
  com.perblue.rpg.network.messages.WarLogs(a)
  com.perblue.rpg.network.messages.WarLogs()

  // Methods (11)
  protected boolean innerReadFieldAttackLog(a)
  protected boolean innerReadFieldDefenseLog(a)
  protected boolean innerReadFieldBattleLog(a)
  protected boolean innerReadFieldWarLog(a)
  protected boolean innerReadFieldAllTimeLog(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarMemberBattleData
```
public class WarMemberBattleData extends com.perblue.a.a.i

  // Fields (5)
  private static final String FULL_NAME = WarMemberBattleData1
  public List attacks
  public Integer attacksDone
  public Integer contribution
  public GuildWarStatus status

  // Constructors (2)
  com.perblue.rpg.network.messages.WarMemberBattleData(a)
  com.perblue.rpg.network.messages.WarMemberBattleData()

  // Methods (7)
  protected boolean innerReadFieldAttacks(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarMemberData
```
public class WarMemberData extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = WarMemberData1
  public Integer contribution
  public Integer defensiveLoses
  public Integer defensiveWins
  public Integer offensiveLoses
  public Integer offensiveWins

  // Constructors (2)
  com.perblue.rpg.network.messages.WarMemberData(a)
  com.perblue.rpg.network.messages.WarMemberData()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarMemberInfo
```
public class WarMemberInfo extends com.perblue.a.a.i

  // Fields (14)
  private static final String FULL_NAME = WarMemberInfo1
  public List battleAttacks
  public Integer battleContribution
  public Integer contribution
  public Integer defensiveLoses
  public Integer defensiveWins
  public BasicUserInfo info
  public List lineups
  public Integer offensiveLoses
  public Integer offensiveWins
  public Long optOutCooldownEnd
  public Boolean optedOutOfWar
  public Integer rank
  public GuildWarStatus status

  // Constructors (2)
  com.perblue.rpg.network.messages.WarMemberInfo(a)
  com.perblue.rpg.network.messages.WarMemberInfo()

  // Methods (10)
  protected boolean innerReadFieldLineups(a)
  protected boolean innerReadFieldBattleAttacks(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldInfo_Avatar(a)
  protected boolean innerReadFieldInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarMembers
```
public class WarMembers extends com.perblue.a.a.i

  // Fields (4)
  private static final String FULL_NAME = WarMembers1
  public Integer guildRank
  public List members
  public Integer totalGuilds

  // Constructors (2)
  com.perblue.rpg.network.messages.WarMembers(a)
  com.perblue.rpg.network.messages.WarMembers()

  // Methods (7)
  protected boolean innerReadFieldMembers(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarOpponentData
```
public class WarOpponentData extends com.perblue.a.a.i

  // Fields (3)
  private static final String FULL_NAME = WarOpponentData1
  public List lineups
  public Integer totalPower

  // Constructors (2)
  com.perblue.rpg.network.messages.WarOpponentData(a)
  com.perblue.rpg.network.messages.WarOpponentData()

  // Methods (7)
  protected boolean innerReadFieldLineups(a)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarOpponentInfo
```
public class WarOpponentInfo extends com.perblue.a.a.i

  // Fields (6)
  private static final String FULL_NAME = WarOpponentInfo1
  public Boolean attackInProgress
  public BasicUserInfo info
  public List lineups
  public Boolean recommended
  public Boolean topPlayer

  // Constructors (2)
  com.perblue.rpg.network.messages.WarOpponentInfo(a)
  com.perblue.rpg.network.messages.WarOpponentInfo()

  // Methods (9)
  protected boolean innerReadFieldLineups(a)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldInfo_Avatar(a)
  protected boolean innerReadFieldInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarPrepComplete
```
public class WarPrepComplete extends com.perblue.a.a.i

  // Fields (1)
  private static final String FULL_NAME = WarPrepComplete1

  // Constructors (2)
  com.perblue.rpg.network.messages.WarPrepComplete(a)
  com.perblue.rpg.network.messages.WarPrepComplete()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarRedDotInfo
```
public class WarRedDotInfo extends com.perblue.a.a.i

  // Fields (7)
  private static final String FULL_NAME = WarRedDotInfo1
  public Integer attacksAvailable
  public Boolean canRegister
  public Boolean canStartBattle
  public Long registrationStartTime
  public Boolean unviewedBattleResults
  public Boolean unviewedWarResults

  // Constructors (2)
  com.perblue.rpg.network.messages.WarRedDotInfo(a)
  com.perblue.rpg.network.messages.WarRedDotInfo()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarResult
```
public class WarResult extends com.perblue.a.a.i

  // Fields (12)
  private static final String FULL_NAME = WarResult1
  public GuildWarRewardClaimStatus claimStatus
  public Integer contribution
  public Integer contributionRank
  public BasicGuildInfo guildInfo
  public Integer guildMMR
  public Integer guildRank
  public Long iD
  public Integer offensiveWins
  public Integer totalGuilds
  public Long userID
  public Long warID

  // Constructors (2)
  com.perblue.rpg.network.messages.WarResult(a)
  com.perblue.rpg.network.messages.WarResult()

  // Methods (7)
  public void writeData(b)
  public void writeDataV1(b)
  protected boolean innerReadFieldGuildInfo(a)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```

## com.perblue.rpg.network.messages.WarState
```
public final enum WarState extends java.lang.Enum

  // Fields (10)
  private static final WarState[] $VALUES
  public static final WarState ALL_BATTLES_COMPLETE
  public static final WarState BATTLE_ACTIVE
  public static final WarState COUNTDOWN_UNTIL_REGISTRATION
  public static final WarState COUNTDOWN_UNTIL_WAR_START
  public static final WarState COUNTDOWN_UNTIL_WAR_START_NOT_READY
  public static final WarState UNKNOWN
  public static final WarState UNREGISTERED
  public static final WarState WATING_TO_START_BATTLE
  private static WarState[] values

  // Constructors (1)
  com.perblue.rpg.network.messages.WarState(String, int)

  // Methods (3)
  public static WarState[] valuesCached()
  public static WarState[] values()
  public static WarState valueOf(String)
```

## com.perblue.rpg.network.messages.WarSummary
```
public class WarSummary extends com.perblue.a.a.i

  // Fields (9)
  private static final String FULL_NAME = WarSummary1
  public Integer defensiveLoses
  public Integer defensiveWins
  public Integer mMR
  public Integer offensiveLoses
  public Integer offensiveWins
  public Integer rank
  public Integer rewardTier
  public Long warStartTime

  // Constructors (2)
  com.perblue.rpg.network.messages.WarSummary(a)
  com.perblue.rpg.network.messages.WarSummary()

  // Methods (6)
  public void writeData(b)
  public void writeDataV1(b)
  public void innerReadV1(a, boolean)
  protected boolean innerRead(a)
  public static String getFullName_Static()
  public String toString()
```


---
# Inner Classes (298)

## com.perblue.rpg.network.EmptyNetworkProvider$1
```
static final class  implements java.lang.Runnable

  // Constructors (1)
  com.perblue.rpg.network.EmptyNetworkProvider$1()

  // Methods (1)
  public final void run()
```

## com.perblue.rpg.network.NetworkProvider$1
```
 class  implements java.util.concurrent.ThreadFactory

  // Fields (1)
  final NetworkProvider this$0

  // Constructors (1)
  com.perblue.rpg.network.NetworkProvider$1(NetworkProvider)

  // Methods (1)
  public Thread newThread(Runnable)
```

## com.perblue.rpg.network.NetworkProvider$1$1
```
 class  implements java.lang.Runnable

  // Fields (2)
  final  this$1
  final Runnable val$r

  // Constructors (1)
  com.perblue.rpg.network.NetworkProvider$1$1(, Runnable)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.network.NetworkProvider$2
```
 class  implements java.util.concurrent.ThreadFactory

  // Fields (1)
  final NetworkProvider this$0

  // Constructors (1)
  com.perblue.rpg.network.NetworkProvider$2(NetworkProvider)

  // Methods (1)
  public Thread newThread(Runnable)
```

## com.perblue.rpg.network.NetworkProvider$2$1
```
 class  implements java.lang.Runnable

  // Fields (2)
  final  this$1
  final Runnable val$r

  // Constructors (1)
  com.perblue.rpg.network.NetworkProvider$2$1(, Runnable)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.network.NetworkProvider$3
```
 class  implements java.lang.Runnable

  // Fields (3)
  final NetworkProvider this$0
  final Runnable val$failure
  final Runnable val$success

  // Constructors (1)
  com.perblue.rpg.network.NetworkProvider$3(NetworkProvider, Runnable, Runnable)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.network.NetworkProvider$3$1
```
 class  implements com.perblue.a.a.f

  // Fields (1)
  final  this$1

  // Constructors (1)
  com.perblue.rpg.network.NetworkProvider$3$1()

  // Methods (2)
  public void onOpen(e)
  public void onClose(e)
```

## com.perblue.rpg.network.NetworkProvider$4
```
 class  implements java.lang.Runnable

  // Fields (2)
  final NetworkProvider this$0
  final i val$message

  // Constructors (1)
  com.perblue.rpg.network.NetworkProvider$4(NetworkProvider, i)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.network.NetworkProvider$5
```
 class  implements java.lang.Runnable

  // Fields (1)
  final NetworkProvider this$0

  // Constructors (1)
  com.perblue.rpg.network.NetworkProvider$5(NetworkProvider)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.network.NetworkProvider$6
```
 class  implements java.lang.Runnable

  // Fields (1)
  final NetworkProvider this$0

  // Constructors (1)
  com.perblue.rpg.network.NetworkProvider$6(NetworkProvider)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.network.NetworkProvider$RetryConnectionRunnable
```
 class RetryConnectionRunnable implements java.lang.Runnable

  // Fields (2)
  private int reconnectAttempts
  final NetworkProvider this$0

  // Constructors (2)
  com.perblue.rpg.network.NetworkProvider$RetryConnectionRunnable(NetworkProvider)

  // Methods (3)
  public void run()
```

## com.perblue.rpg.network.NetworkProvider$RetryConnectionRunnable$1
```
 class  implements java.lang.Runnable

  // Fields (1)
  final RetryConnectionRunnable this$1

  // Constructors (1)
  com.perblue.rpg.network.NetworkProvider$RetryConnectionRunnable$1(RetryConnectionRunnable)

  // Methods (1)
  public void run()
```

## com.perblue.rpg.network.messages.ABTestGroups$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.AcceptGuildMember$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.Action$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ActionGroup$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ActivateRuneShrine$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.AddInProgressCryptAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.AddInProgressGuildWarAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.AddInProgressTempleAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.AdvanceBossBattleResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.AllContestData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.AmazonVerificationRequest$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.AmazonVerificationResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ArenaAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ArenaDemotion$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ArenaInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ArenaLeagueExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ArenaPromotion$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ArenaRankingRow$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ArenaRow$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ArenaShortInfoExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ArenaUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.AttackBase$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.Avatar$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BasicGuildInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BasicUserInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.Battle$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BetaPurchase$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BlockUser$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BlockedList$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BootData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BossBattleAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BossBattleData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BossBattleExtraData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BossBattleResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BossBattlesResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BossPitAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BossPitData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BossPitRaidResults$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.BuyChests$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CampaignAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CampaignLevelStatus$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ChangeServer$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ChangeTutorialStep$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.Chat$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ChatExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ChatList$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ClaimGuildWarRewards$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ClaimInactiveGuild$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ClaimedPickRewards$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ClearAuthType$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ClientInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ClockChange$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ColiseumAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ColiseumBattle$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ContestData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ContestExtraData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ContestProgressRewardInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ContestProgressRewards$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ContestRankRewardInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ContestRankRewards$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ContestRankingRow$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ContestRankings$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ContestRaw$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ContestTaskInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ContestTasks$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ContestsUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CraftItem$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CreateGuild$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CryptLogData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CryptLogExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CryptRaidAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CryptRaidData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CryptRaidExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CryptRaidHeroesUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CryptRaidMemberData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CryptRaidMemberSummary$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CryptRaidOpponentData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CryptRaidOpponentSummary$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CryptRaidScoringInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CryptRaidStartTimeUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.CryptRaidUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.DamageInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.DebugEditHeroes$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.DebugGiveRune$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.DefenderData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.DemoteFromOfficer$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.DifficultyModeAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.DifficultyModeRaidResults$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.DiscourseAuthToken$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.DownloadTime$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.EditGuild$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.EditGuildCryptSettings$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.EnchantItem$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.EndInProgressGuildWarAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.EquippedItemData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ErrorReport$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ErrorResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ExistingUserInfos$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ExpeditionAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ExpeditionRunData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ExtendedGuildInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ExtendedHeroSummary$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.FacebookUserInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.Friend$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.FriendUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.FullWarLineupData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.FuseRunes$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GameCenterUserInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GameCircleUserInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GenerateDiscourseAuthToken$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GetArenaInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GetExistingUsers$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GetExpeditionResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GetHeroWall$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GetServers$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GetTitanTempleData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GetUserSaveData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GlobalMailMessagePerUserData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GooglePlusUserInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildBattleEnded$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildChatExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildEligibleMemberChange$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildRankings$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildRow$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildWarAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildWarBattleExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildWarEnded$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildWarFightComplete$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildWarLogExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildWarMMRUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildWarOpponentUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildWarOptedOut$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildWarRankingRow$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.GuildWarRankings$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.HeroBattleData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.HeroBattleDatas$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.HeroData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.HeroHired$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.HeroLineup$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.HeroLineupUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.HeroPersistentData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.HeroSummary$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.HeroWall$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.HeroWallPostExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.HeroesForHire$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.IAPCompletePurchase$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.IAPProduct$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.IAPProducts$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.IAPVerificationRequest$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.IAPVerificationResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.IOSPurchaseLog$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.InAppPurchaseError$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.InAppPurchaseVerified$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.InAppPurchaseVerifiedAndGiven$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.InGameNotification$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ItemUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.JoinGuild$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.KickFromGuild$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.Lineup$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.LineupSummary$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ListRecGuildsResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.LoadTime$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.Logout$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.MachinimaAction$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.MailExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.MailMessage$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.MailMessageUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.MercenaryHeroData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.MerchantData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.MerchantItemData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.MerchantUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.MultipleHeroLineupUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.NodeReward$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.Notification$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.OpenExpeditionChest$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.OpenGLExtensions$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PMRoomSummary$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PMThread$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PMThreadHideChannel$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PerfReport$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PersonalMessageExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.Ping$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PlayerArenaRankings$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PlayerGuildRow$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PlayerRankings$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PlayerRow$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PlayerTempleRow$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PossibleChestDrops$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PrivateUserInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PromoteToOfficer$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.PurchaseMerchantItem$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RaidAllTicketResults$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RaidOutcome$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RaidTicketResults$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RedeemCodeResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ReferralTracking$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RemoveChat$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RemoveInProgressCryptAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RemoveInProgressTempleAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.Replay$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ReplayKitEnded$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ReplayKitStarted$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RequestChestAcknowledgement$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RequestExtendedGuildInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RequestInAppPurchaseForVerify$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RequestResync$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ResetBossBattleResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ResetExpedition$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ResetExpeditionResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ResourceUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.ResyncData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RewardDrop$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RuneBonusData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RuneData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RuneEmpowerResults$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RuneImbueResults$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.RuneShrineActivationResults$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.SearchGuilds$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.SearchGuildsResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.SendChat$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.Server$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.Servers$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.SetLanguage$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.SetPlayerAvatar$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.SetPlayerName$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.SettingsSync$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.SigninReward$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.SigninRewards$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.SocialHistory$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.SpecialEventRaw$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.SpecialEventsRaw$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.SpecialEventsUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.StartArenaAttackResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.StartColiseumAttackResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.StartCryptRaidAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.StartCryptRaidAttackResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.StartGuildWarAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.StartGuildWarAttackResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.StartTempleAttackResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.TempleWinCountUpdatedMessage$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.TestPerfReport$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.TitanTempleAttack$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.TitanTempleAttackOutcome$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.TitanTempleAttackOutcomes$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.TitanTempleData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.TitanTempleExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.TitanTempleInviteData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.TitanTempleRoundData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.TitanTempleSummaries$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.TitanTempleSummary$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.TitanTempleTitanData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.TutorialAct$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.UnblockUser$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.UpdateChat$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.UpdateClient$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.UpdateUserTime$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.UserExtra$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.UserGuildUpdate$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.UserInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.UserInfoResponse$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.UserLootMemoryChange$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.UserSaveData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.VIPPromoCard$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarBattle$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarBattleLog$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarBattleResult$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarFight$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarFightLog$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarFightUserInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarGuildInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarGuildProgress$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarLineupData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarLog$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarLogs$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarMemberBattleData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarMemberData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarMemberInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarMembers$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarOpponentData$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarOpponentInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarRedDotInfo$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarResult$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

## com.perblue.rpg.network.messages.WarSummary$1
```
static class 

  // Fields (1)
  static final int[] $SwitchMap$com$perblue$grunt$translate$ReadAction
```

