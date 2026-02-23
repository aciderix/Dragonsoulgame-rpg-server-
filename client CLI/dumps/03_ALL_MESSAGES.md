# DragonSoul - All Network Message Types

These are all classes extending com.perblue.a.a.i (Message base)

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


Total message types: 302
