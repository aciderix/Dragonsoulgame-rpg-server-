# DragonSoul - Tools & Utilities

## Package: com.perblue.rpg.tools (16 classes)

### AddRuneWindow (class)
`com.perblue.rpg.tools.AddRuneWindow`
extends `com.perblue.rpg.ui.widgets.BorderedWindow`

**Fields (7):**
- ` b level`
- ` a rarity`
- ` ClientRune rune`
- ` j runeBonus`
- ` a set`
- ` a slot`
- ` b stars`

**Methods (11):**
- `void onSelectSet()`
- `void onSelectSlot()`
- `void onModifyBonus(IRuneBonus, boolean)`
- `void onSelectRarity()`
- `b createTextField(String)`
- `void updateBonuses()`
- `ClientRune generateRune(Random, UnitType)`
- `a createLabel(String)`
- `ClientRune getRune()`

### com.perblue.rpg.tools.AnimationToolScreen [LOAD ERROR: null]

### CharacterParams (class)
`com.perblue.rpg.tools.CharacterParams`

**Fields (6):**
- `static final String MOUTH_CLOSE = mouth_close`
- `static final String MOUTH_OPEN = mouth_open`
- `public static final Map PARAMS`
- `public final String headBone`
- `public final float maxHeadAngle`
- `public final float minHeadAngle`

**Methods (3):**
- `float getMinHeadAngle(UnitType)`
- `float getMaxHeadAngle(UnitType)`
- `String getHeadBone(UnitType)`

### CombatDebugCooldownDisplay (class)
`com.perblue.rpg.tools.CombatDebugCooldownDisplay`

**Fields (6):**
- `private AttackScreen attackScreen`
- `private EventListener battleOverListener`
- `private q skillTypes`
- `private Unit targetUnit`
- ` CharSequence text`
- `private DebugScreenTextInfo textInfo`

**Methods (9):**
- `void appendTextLine(int, String, String)`
- `void drawCooldownInformation()`
- `String getSkillPriorityString(SkillType)`
- `String getSkillStatsCooldownString(SkillType, Unit)`
- `String getSkillCurrentCooldownString(SkillType, Unit)`
- `String getSkillCategoryString(SkillType)`
- `void update(float)`

### CombatDebugLogger (class)
`com.perblue.rpg.tools.CombatDebugLogger`

**Fields (4):**
- `private static SimpleDateFormat dateFormat`
- `private static File logFile`
- `private static boolean toConsole`
- `private static boolean toFile`

**Methods (2):**
- `void logMessage(String, String, long)`
- `void logMessage(String, long)`

### CombatDebugOptions (class)
`com.perblue.rpg.tools.CombatDebugOptions`

**Fields (2):**
- `public static final HashMap DEBUG_OPTIONS`
- `public static boolean enabled`

**Methods (1):**
- `boolean checkDebugOption(DebugType)`

### CombatSimHelper (class)
`com.perblue.rpg.tools.CombatSimHelper`

**Methods (4):**
- `BaseScreen getCurrScreen(RPGMain)`
- `UnitDataExtended createUnitData(UnitType, Rarity, int, int, boolean)`
- `UnitDataExtended createUnitData(UnitType, Rarity, int, int, z)`
- `UnitDataExtended createUnitData(UnitType, Rarity, int, int)`

### com.perblue.rpg.tools.CombatSimulatorScreen [LOAD ERROR: Could not initialize class com.perblue.rpg.ui.screens.BaseScreen]

### DebugScreenTextInfo (class)
`com.perblue.rpg.tools.DebugScreenTextInfo`

**Fields (3):**
- `private BaseScreen baseScreen`
- `private f infoTextLabel`
- `private j infoTextTable`

**Methods (6):**
- `void removeFromScreen()`
- `f createInfoTextLabel(CharSequence, int, int)`
- `j createInfoTextTable(f, int)`
- `void hideScreenUpperSideHudDisplays(AttackScreen)`
- `CharSequence getText()`
- `void setText(CharSequence)`

### HeroGrouping (class)
`com.perblue.rpg.tools.HeroGrouping`
extends `com.badlogic.gdx.scenes.scene2d.ui.j`

**Fields (5):**
- `public static final int MAX_HEROES = 6`
- `private static final a staticFavoriteUnitTypes`
- `private a heroRows`
- `private RPGSkin skin`
- `private ArrayList unitInfos`

**Methods (14):**
- `void setUnitInfos(ArrayList)`
- `void setFavorites(a)`
- `void clearGrouping()`
- `void setUnitInfo(SimUnitData, int)`
- `a getUnitInfos()`
- `a getSimUnitInfos()`
- `void showAddButton(int)`
- `void showUnitInfo(int)`
- `void showAddHeroPopup(int)`
- `void emulateButtonPressing(DFTextButton)`
- `int getFavoriteUnitCount()`

### HeroGroupingRender (class)
`com.perblue.rpg.tools.HeroGroupingRender`
extends `com.badlogic.gdx.scenes.scene2d.ui.j`

**Fields (4):**
- `public static final int MAX_HEROES = 5`
- `private a heroRows`
- `private RPGSkin skin`
- `private a unitInfos`

**Methods (9):**
- `void setUnitInfos(a)`
- `void setUnitInfo(UnitData, int)`
- `a getUnitInfos()`
- `void showAddButton(int)`
- `void showUnitInfo(int)`
- `void showAddHeroPopup(int)`
- `boolean isHero(String)`

### com.perblue.rpg.tools.RandomCombatScreen [LOAD ERROR: Could not initialize class com.perblue.rpg.ui.screens.BaseScreen]

### SelectPopup (class)
`com.perblue.rpg.tools.SelectPopup`
extends `com.perblue.rpg.ui.widgets.BorderedWindow`

**Fields (3):**
- `private g keyListener`
- `private SelectPopupListener selectionListener`
- `private a values`

**Methods (3):**
- `void hide()`

### SimSaveData (class)
`com.perblue.rpg.tools.combatsim.SimSaveData`

**Fields (4):**
- `public ArrayList attackers`
- `public ArrayList defenders`
- `public HashMap options`
- `public long seed`

**Methods (3):**
- `a getAttackersAsUnitData()`
- `a getDefendersAsUnitData(int)`
- `a convertToUnitData(ArrayList)`

### SimSkillData (class)
`com.perblue.rpg.tools.combatsim.SimSkillData`

**Fields (2):**
- `public int level`
- `public SkillType type`

### SimUnitData (class)
`com.perblue.rpg.tools.combatsim.SimUnitData`

**Fields (10):**
- `public int enchantLevel`
- `public z gear`
- `public int level`
- `public Rarity rarity`
- `public ArrayList runeData`
- `public ArrayList skillData`
- `public ItemType skinType`
- `public int stars`
- `public z stats`
- `public UnitType type`

**Methods (6):**
- `void initBaseUnitSkills(SimUnitData)`
- `SimUnitData createBaseUnit(UnitType, Rarity, int, int, int)`
- `SimUnitData createBaseUnit(UnitType, Rarity, int, int)`
- `void setRarityAndUpdate(Rarity)`
- `void setTypeAndUpdate(UnitType)`
- `UnitDataExtended toUnitData()`

## Package: com.perblue.rpg.util (32 classes)

### Agreement (class)
`com.perblue.rpg.util.Agreement`

**Fields (5):**
- `public static final String BODY = To continue playing this game, you must agree

the TERMS OF SERVICE and PRIVACY POLICY.
`
- `public static final String BUTTON1 = I AGREE`
- `public static final String BUTTON2 = TERMS OF SERVICE`
- `public static final String BUTTON3 = PRIVACY POLICY`
- `public static final String TITLE = Agreement`

### CheckBonesTestWindow (class)
`com.perblue.rpg.util.CheckBonesTestWindow`
extends `com.perblue.rpg.ui.widgets.BorderedWindow`

**Fields (1):**
- `private static Map EXCLUDED_UNITS`

### ClassFinder (class)
`com.perblue.rpg.util.ClassFinder`

**Fields (1):**
- `static final boolean $assertionsDisabled = true`

**Methods (2):**
- `List findClasses(File, String)`
- `Class[] getClasses(String)`

### DelayedPromptData (class)
`com.perblue.rpg.util.DelayedPromptData`

**Fields (2):**
- `public Map data`
- `public DelayedPromptType type`

### DeviceInfo (interface)
`com.perblue.rpg.util.DeviceInfo`

**Methods (31):**
- `String getDisplayVersion()`
- `String getImei()`
- `String getaPMacAddress()`
- `String getEmail()`
- `Platform getPlatform()`
- `int getFullVersion()`
- `String getUniqueIdentifier()`
- `String getAdvertisingIdentifier()`
- `String getPhoneModel()`
- `String getSystemDescription()`
- `int getsDKVersion()`
- `String getPhoneName()`
- `String getaPSSID()`
- `boolean isConnectedToWiFi()`
- `boolean isConnectedToCell()`
- `String getCarrierName()`
- `String getNetworkType()`
- `boolean limitAdTracking()`
- `String getSystemVersion()`
- `String getReferalData()`
- `String getRegistrationID()`
- `int getScreenSize()`
- `String getDeviceID()`
- `int getSystemVolume()`
- `String getBuildTime()`
- `String getReferralCode()`
- `long getSystemTime()`
- `boolean isInitialized()`
- `void setInitialized(boolean)`
- `String getPackageName()`
- `String getSignature()`

### DisplayStringUtil (class)
`com.perblue.rpg.util.DisplayStringUtil`

**Fields (36):**
- `public static final String BOSS_PIT_BUNDLE = com.perblue.rpg.util.localization.boss_pit`
- `public static final String BUNDLE_BASE = com.perblue.rpg.util.localization`
- `public static final String CAMPAIGN_BUNDLE = com.perblue.rpg.util.localization.campaign`
- `public static final String CONTESTS_BUNDLE = com.perblue.rpg.util.localization.contests`
- `private static final DecimalFormat DECIMAL_FORMATTER`
- `public static final String EXPEDITION_REPEAT_BUNDLE = com.perblue.rpg.util.localization.expedition_repeat`
- `public static final int EXPEDITION_REPEAT_COUNT = 17`
- `public static final String GENERIC_BUNDLE = com.perblue.rpg.util.localization.generic`
- `public static final String HERO_TAGS_BUNDLE = com.perblue.rpg.util.localization.hero_tags`
- `public static final String ITEM_BUNDLE = com.perblue.rpg.util.localization.items`
- `public static final String LANGUAGES_BUNDLE = com.perblue.rpg.util.localization.languages`
- `private static final Logger LOG`
- `public static final String NAMES_BUNDLE = com.perblue.rpg.util.localization.names`
- `private static final int NAME_COUNT = 165`
- `private static final DecimalFormat NUMBER_SHORTENER_FORMATTER`
- `private static final float ONE_MILLION = 1000000.0`
- `private static final float ONE_THOUSAND = 1000.0`
- `private static final int PREFIX_NAME_COUNT = 100`
- `public static final String PRIVACY_POLICY_BUNDLE = com.perblue.rpg.util.localization.privacy_policy`
- `public static final String PRODUCTS_BUNDLE = com.perblue.rpg.util.localization.products`
- `public static final String QUEST_BUNDLE = com.perblue.rpg.util.localization.quests`
- `private static final TreeMap ROMAN_NUMERALS`
- `public static final String RUNES_BUNDLE = com.perblue.rpg.util.localization.rune_info`
- `public static final String SHARDS_BUNDLE = com.perblue.rpg.util.localization.shards`
- `private static final DecimalFormat SIGNED_DECIMAL_FORMATTER`
- `private static final DecimalFormat SIGNED_NUMBER_SHORTENER_FORMATTER`
- `public static final String SKILLS_BUNDLE = com.perblue.rpg.util.localization.skills`
- `public static final String TEMPLE_BUNDLE = com.perblue.rpg.util.localization.temple_buffs`
- `public static final String TIME_BUNDLE = com.perblue.rpg.util.localization.time`
- `public static final String TIPS_BUNDLE = com.perblue.rpg.util.localization.tips`
- `public static final String TUTORIAL_BUNDLE_BASE = com.perblue.rpg.util.localization.tutorial.`
- `public static final String UNIT_BUNDLE = com.perblue.rpg.util.localization.units`
- `public static final String VIP_DAILY_PREFIX = VIP_DAILY_`
- `public static final String VIP_FEATURE_PREFIX = VIP_FEATURE_`
- `public static final String WAR_MODIFIERS_BUNDLE = com.perblue.rpg.util.localization.war_modifiers`
- `private static Locale userLocale`

**Methods (140):**
- `String shortenSignedNumber(int)`
- `void checkRandomNames()`
- `String convertTime(long, int, CharSequence)`
- `String convertTime(long, int)`
- `String convertTime(long)`
- `String timeFormat(TimeType, Locale, Object[])`
- `String timeFormat(TimeType, Object[])`
- `String convertYear(long, int, CharSequence)`
- `String formatNumber(int)`
- `String formatNumber(float)`
- `String formatSignedNumber(int)`
- `String formatSignedNumber(float)`
- `String getBossPitTagline(UnitType)`
- `String getBossPitTip(UnitType, int, HeroTag)`
- `String getChapterString(int, Locale)`
- `String getChapterString(int)`
- `String getChatRoomTitle(ChatRoomType)`
- `String getContestTask(ContestTaskInfo)`
- `String getNamePrefixString(int, Locale)`
- `String getBossPitStageCompleteDescription(UnitType, int)`
- `String getBossPitStageDescription(UnitType, int)`
- `String getCampaignChapterPlusString(CampaignType, int)`
- `String getCampaignChapterString(CampaignType, int)`
- `String getCampaignLevelDesc(CampaignType, int, int)`
- `String getCampaignLevelDesc(CampaignType, int, int, Locale)`
- `String getCampaignLevelString(CampaignType, int, int)`
- `String getCampaignLevelString(CampaignType, int, int, Locale)`
- `String getExpeditionRepeatString(int, Locale)`
- `String getExpeditionRepeatString(int)`
- `String getExpeditionString(int, ExpeditionStringType)`
- `String getExpeditionStringFormatted(int, ExpeditionStringType, Object[])`
- `String getGameModeDescription(GameMode)`
- `String getGameModeDescriptionLong(GameMode)`
- `String getGuildPermissionInfo(GuildPermission, GuildRole)`
- `String getGuildRoleCanString(GuildRole)`
- `String getHeroTagDescription(HeroTag)`
- `String getItemDescriptionString(ItemType)`
- `String getItemDescriptionString(ItemType, Locale)`
- `String getItemUseNotifString(ItemType)`
- `String getModeDifficultyString(ModeDifficulty)`
- `String getPrivacyPolicyBody(BuildSource)`
- `int getPrivacyPolicyVersion(BuildSource)`
- `String getResourceString(ResourceType)`
- `String getRarityName(Rarity)`
- `String getItemString(ItemType, Locale)`
- `String getItemString(ItemType)`
- `String getGameModeDisplay(GameMode)`
- `String getHeroSortString(HeroSort)`
- `String getHeroTagName(HeroTag)`
- `String getHeroTagPrefix(HeroTagPrefix)`
- `String getLanguageName(Language)`
- `Locale getLocale(Language)`
- `Locale getLocale(Language, Platform)`
- `String getMerchantString(MerchantType)`
- `String getProductString(String)`
- `String getQuestButtonString(String)`
- `String getQuestButtonString(String, Locale)`
- `String getQuestTitleString(String, Locale)`
- `String getQuestTitleString(String)`
- `String getRarityOffsetString(Rarity)`
- `String getRawDataForTutorialNarratorText(TutorialActType, int, String)`
- `String getRawTutorialNarratorText(TutorialActType, int, String)`
- `String getRelativeTimeSince(long, String, int)`
- `String getRelativeTimeSince(long)`
- `String getRelativeTimeSince(long, long)`
- `String getRuneBonusFullString(IRune, IRuneBonus)`
- `String getStatGrowthString(StatType, Locale)`
- `String getStatGrowthString(StatType)`
- `String getRuneSetStatThreeLine(RuneSetType)`
- `String getRuneSetStatTwoLineA(RuneSetType, int)`
- `String getRuneSetStatTwoLineB(RuneSetType, int)`
- `String getShardNameWithNumber(int)`
- `String getQuestDescString(String)`
- `String getQuestDescString(String, Locale)`
- `String getRandomName(boolean, Locale)`
- `String getRandomName(boolean)`
- `String getRankString(int, Locale)`
- `String getRankString(int)`
- `int getRarityOffset(Rarity)`
- `String getRewardString(RewardDrop)`
- `String getRuneBonusValue(IRune, IRuneBonus)`
- `String runeFormat(String, Object[])`
- `String removeWhitespace(String)`
- `String getStatString(StatType, Locale)`
- `String getStatString(ItemType, StatType)`
- `String getStatString(StatType)`
- `String getRuneName(IRune)`
- `String getUnitShortString(UnitType)`
- `String getUnitShortString(UnitType, Locale)`
- `String getRuneSetName(RuneSetType)`
- `String getRuneSetStat(String, RuneSetType, int)`
- `String getRuneSetStat(RuneSetType)`
- `String getShardNameLong(int)`
- `String getShortShardName(int)`
- `String getSkillString(SkillType, Locale)`
- `String getSkillString(SkillType)`
- `String getTimeString(TimeType, Locale)`
- `String getTipString(int)`
- `String getTipString(int, Locale)`
- `String getSkillDeltaString(SkillType)`
- `String getSkillDeltaString(SkillType, Locale)`
- `String getSkillDescriptionString(SkillType)`
- `String getSkillDescriptionString(SkillType, Locale)`
- `String[] getSkillExtraString(SkillType)`
- `String getSkillExtraString(SkillType, Locale)`
- `String getTempleBuffString(UnitType)`
- `String getTempleFlavorString(UnitType, long)`
- `a getTextAssetsLocation(e)`
- `a getTextAssetsLocation()`
- `String getTimezoneDisplayString(long)`
- `String getTutorialNarratorText(TutorialActType, int, String)`
- `String getUnitDescriptionString(UnitType, Locale)`
- `String getUnitDescriptionString(UnitType)`
- `String getUnitShortDescriptionString(UnitType, Locale)`
- `String getUnitShortDescriptionString(UnitType)`
- `String getUnlockableString(Unlockable)`
- `String getVIPFeatureString(VIPFeature, int)`
- `String getWarModifierDescription(WarModifierType)`
- `String replaceWarModTokens(String, WarModifierType)`
- `String getWarModifierSetDescription(WarModifierSetType)`
- `String getWarModifierSetName(WarModifierSetType)`
- `Language getUserLanguage()`
- `String getVIPDailyString(VIPFeature, int)`
- `String getWarModifierName(WarModifierType)`
- `String parseWarModParam(String, WarModifierType)`
- `void setUserLocale(Locale)`
- `String shortenNumber(int)`
- `String toRomanNumeral(int)`
- `Locale getuserLocale()`
- `String getGenericString(String, Locale)`
- `String genericFormat(String, Locale, Object[])`
- `String getRawTutorialNarratorTextWithUserLocale(TutorialActType, String)`
- `String getTutorialNarratorTextWithUserLocale(TutorialActType, String)`
- `String getGuildRole(GuildRole)`
- `String getUnitString(UnitType, Locale)`
- `String getUnitString(UnitType)`
- `String getNameString(int, Locale)`
- `String getString(String, String, Locale, String)`
- `String format(String, Object[])`
- `void init(e)`

### ErrorReportCategory (enum)
`com.perblue.rpg.util.ErrorReportCategory`
extends `java.lang.Enum`

**Fields (7):**
- `private static final ErrorReportCategory[] $VALUES`
- `public static final ErrorReportCategory BOOT_DATA_NOT_RECEIVED`
- `public static final ErrorReportCategory CONTENT_DOWNLOAD`
- `public static final ErrorReportCategory LOGIN_REQUEST`
- `public static final ErrorReportCategory MEMORY_CRITICAL`
- `public static final ErrorReportCategory OUT_OF_MEMORY`
- `private String searchString`

**Methods (3):**
- `String getSearchString()`
- `ErrorReportCategory[] values()`
- `ErrorReportCategory valueOf(String)`

**Constants (5):**
- CONTENT_DOWNLOAD
- OUT_OF_MEMORY
- MEMORY_CRITICAL
- LOGIN_REQUEST
- BOOT_DATA_NOT_RECEIVED

### FadeDirection (enum)
`com.perblue.rpg.util.FadeDirection`
extends `java.lang.Enum`

**Fields (5):**
- `private static final FadeDirection[] $VALUES`
- `public static final FadeDirection DOWN`
- `public static final FadeDirection LEFT`
- `public static final FadeDirection RIGHT`
- `public static final FadeDirection UP`

**Methods (2):**
- `FadeDirection[] values()`
- `FadeDirection valueOf(String)`

**Constants (4):**
- LEFT
- RIGHT
- UP
- DOWN

### FileChecker (class)
`com.perblue.rpg.util.FileChecker`

**Fields (1):**
- `private static final String STAT_LOCATION_PACKAGE = com.perblue.rpg.game.data`

**Methods (3):**
- `Map getTextCheckSums(RPGMain)`
- `void updateText(Map)`
- `Map getStatCheckSums(RPGMain)`

### GraphicsWrap (class)
`com.perblue.rpg.util.GraphicsWrap`

**Fields (1):**
- `protected f old`

**Methods (43):**
- `float getDeltaTime()`
- `boolean isContinuousRendering()`
- `g getGL30()`
- `g getGLVersion()`
- `d getMonitor()`
- `float getPpcX()`
- `float getPpcY()`
- `d getPrimaryMonitor()`
- `float getTargetDensity()`
- `int getType$4df6916e()`
- `boolean isFullscreen()`
- `boolean isGL30Available()`
- `a newCursor$56fd1508(k, int, int)`
- `void setCursor$6c4d0c86(a)`
- `boolean setFullscreenMode(b)`
- `void setResizable(boolean)`
- `void setUndecorated(boolean)`
- `void setVSync(boolean)`
- `boolean setWindowedMode(int, int)`
- `boolean supportsExtension(String)`
- `void setContinuousRendering(boolean)`
- `void setSystemCursor$48a93f7f(int)`
- `boolean supportsDisplayModeChange()`
- `a getBufferFormat()`
- `b[] getDisplayModes()`
- `b[] getDisplayModes(d)`
- `long getFrameId()`
- `int getFramesPerSecond()`
- `f getGL20()`
- `int getReportedHeight()`
- `b getDisplayMode(d)`
- `b getDisplayMode()`
- `float getPpiX()`
- `float getPpiY()`
- `float getDensity()`
- `float getRawDeltaTime()`
- `void setTitle(String)`
- `int getBackBufferHeight()`
- `int getBackBufferWidth()`
- `int getWidth()`
- `int getHeight()`
- `void requestRendering()`
- `d[] getMonitors()`

### LanguageHelper (class)
`com.perblue.rpg.util.LanguageHelper`

**Fields (4):**
- `private static final String LANGUAGE_KEY = preferredLanguage`
- `private static Collator collator`
- `private static FontType fontType`
- `private static Method isIdeographicMethod`

**Methods (12):**
- `Collator getCollator()`
- `void updateStringLocale(Language)`
- `boolean isCJK(int)`
- `Fonts modifyFontForLanguage(CharSequence, Fonts)`
- `Fonts modifyFontForLanguage(CharSequence, Fonts, Language)`
- `void setPreferredLanguage(Language)`
- `Language getDeviceLanguage()`
- `Language getPreferredLanguage()`
- `void updateServerLanguage()`
- `String getDeviceLanguageCode()`
- `void initDisplayLanguage()`
- `boolean isIdeographic(int)`

### NoAllocationSet (class)
`com.perblue.rpg.util.NoAllocationSet`

**Fields (1):**
- `private al backingArray`

**Methods (15):**
- `boolean add(Object)`
- `boolean remove(Object)`
- `void clear()`
- `boolean isEmpty()`
- `boolean contains(Object)`
- `Object[] begin()`
- `void end()`
- `int size()`
- `Object[] toArray()`
- `Object[] toArray(Object[])`
- `Iterator iterator()`
- `boolean addAll(Collection)`
- `boolean containsAll(Collection)`
- `boolean retainAll(Collection)`
- `boolean removeAll(Collection)`

### NotificationHelper (class)
`com.perblue.rpg.util.NotificationHelper`

**Fields (12):**
- `public static final String DELIMITER = :`
- `public static final String NOTIF_TYPE_TAG = type`
- `private static final long ONE_DAY = 86400000`
- `public static final String SERVER_ID_KEY = messageID`
- `public static final String SERVER_MESSAGE_KEY = message`
- `public static final String SERVER_TITLE_KEY = customTitle`
- `public static final String SERVER_TYPE_KEY = messageType`
- `public static final String SERVER_USER_ID_KEY = userID`
- `private static final long THREE_HOURS = 10800000`
- `private static final long TWO_HOURS = 7200000`
- `public static final String USER_ID = userID`
- `private static final long WAR_REG_WARNING_OFFSET = 61200000`

**Methods (20):**
- `void scheduleLocalNotifications(User)`
- `long getUserId(NotificationType, String)`
- `long calculateStaminaFull(User)`
- `long calculateStoreRestock(User)`
- `String getNotificationDestination(String)`
- `long getNotificationDuration(NotificationType)`
- `CharSequence getNotificationText(NotificationType, String)`
- `CharSequence getNotificationTitle(NotificationType)`
- `Set getNotificationTypes()`
- `long calculateArenaRewardTime(User)`
- `long calculateNextFreeStamina(User)`
- `long calculatePowerPointsFull(User)`
- `long calculateResourceFull(User, ResourceType)`
- `long calculateRegistrationStartTime(User)`
- `long calculateRegistrationWarningTime(User)`
- `String getArenaRewardsKey(User)`
- `String getFreeStaminaKey(User)`
- `String getStaminaFullKey(User)`
- `String getStoreRestockKey(User)`
- `String getPowerPointsFullKey(User)`

### PlayingSound (class)
`com.perblue.rpg.util.PlayingSound`

**Fields (4):**
- `public boolean fading`
- `public c sound`
- `public long soundID`
- `public float volume`

**Methods (1):**
- `void reset()`

### PreAllocatedPool (class)
`com.perblue.rpg.util.PreAllocatedPool`
extends `com.badlogic.gdx.utils.ac`

### PreferenceKey (enum)
`com.perblue.rpg.util.PreferenceKey`
extends `java.lang.Enum`

**Fields (13):**
- `private static final PreferenceKey[] $VALUES`
- `public static final PreferenceKey CREATION_TIME`
- `public static final String DELIMITER = :`
- `public static final PreferenceKey EVENT_ID`
- `public static final PreferenceKey GL_EXTENSIONS_SENT`
- `public static final PreferenceKey HAS_ACCOUNT`
- `public static final PreferenceKey INSTALL_REFERRER`
- `public static final PreferenceKey LAST_BETA_PAYMENT_AWARD`
- `public static final PreferenceKey LAST_LOGOUT`
- `public static final PreferenceKey NUM_ATTACKS`
- `public static final PreferenceKey REFERRAL_CODE`
- `public static final PreferenceKey REGISTRATION`
- `public static final PreferenceKey TROOP_REQUEST_MSG`

**Methods (3):**
- `String getCreationTimeKey(long)`
- `PreferenceKey[] values()`
- `PreferenceKey valueOf(String)`

**Constants (11):**
- INSTALL_REFERRER
- REGISTRATION
- REFERRAL_CODE
- NUM_ATTACKS
- TROOP_REQUEST_MSG
- EVENT_ID
- HAS_ACCOUNT
- GL_EXTENSIONS_SENT
- LAST_BETA_PAYMENT_AWARD
- LAST_LOGOUT
- CREATION_TIME

### PrivacyPolicy (class)
`com.perblue.rpg.util.PrivacyPolicy`

**Fields (8):**
- `public static final String AMAZON_BODY = Basic Policy regarding the Protection of Personal Information

1. Basic Policy

i. Protection of personal information

The Company recognizes the importance of personal information, views the complete protection of personal information as its social responsibility, and promises to comply with the Act on the Protection of Personal Information, other relevant laws and regulations, guidelines, and the like, and to properly handle the personal information collected from the customers who use the Company's services and the Company App in accordance with this Policy.

ii. Scope

This Policy will apply to all of the Company's services provided by the Company. The personal information that will be collected and the purpose of use of such information will be specifically provided for each of the Company's services in the individual privacy policy for the Company's service.

2. Handling of Personal Information

i. Collection

The Company will clearly state the purpose of use in the privacy policy and collect the personal information required for providing the Company's services through lawful and fair means.

ii. Purpose of use

The Company will only use the collected personal information for improving the quality of the Company's services, delivering ads, or for any other purpose of use set forth in the privacy policy, and the Company will not use such information for any other purpose without the customer's consent or in the absence of any law or regulation to the contrary.

3. Administration System

i. Appointment of administrator and creation of internal rules

The Company has appointed a personal information protection administrator as the person responsible for the administration of the personal information. The Company has also created internal rules regarding the protection of personal information and is ensuring the proper handling of personal information.

ii. Information security measures

The Company restricts access to personal information for the purpose of preventing personal information from being leaked, destroyed, or damaged or for any other safety management purpose. The Company also provides training regarding the handling of personal information for its officers and employees who handle personal information.

iii. Destruction of information

When the Company reasonably determines that the collected personal information is unnecessary for the business operation of the Company's services or upon the expiration of the individually specified retention period, the Company will dispose the personal information in its possession.

4. Provision to Third Parties

i. Disclosure to third parties

In the following cases, the Company may disclose personal information to third parties:

・The Company outsources work to a third party to the extent necessary to achieve the purpose of use
・The Company performs a merger, corporate spin-off, transfer of business, or disposes all or some of the Company's business, assets, or stock (including cases where it is performed in connection with bankruptcy or similar proceedings)
・The Company requests the customer's consent for the disclosure and the customer gives such consent

However, with regard to any information that has been statistically processed so that individual customers cannot be identified, the Company may use such information for purposes other than those listed above.

ii. Disclosure at the request of a government body, local government, public agency, or the like

In the following cases, the Company may disclose personal information to a public agency or the like:

・Pursuant to laws and regulations (including any laws and regulations outside of the country of residence of the party that will be providing the information)
・Disclosure is necessary to protect a person's life, body, or property, and it is difficult to obtain the consent of the customer
・It is particularly necessary to improve public health or to promote the healthy development of children, and it is difficult to obtain the consent of the customer
・There is a need to cooperate with the performance of administrative work provided for by law or regulation by a national government body, local government, or a contractor for such body, and obtaining the customer's consent may interfere with the performance of such administrative work



Privacy Policy

This "DragonSoul" Application Privacy Policy (this "Policy") sets forth the handling of personal information on the "DragonSoul" game application for mobile devices (including any updated versions of the app and ancillary services thereof; the "Company App") provided by Fantasy Legend Studios, Inc. (the "Company").With regard to matters that are not provided for in this Policy, please also review the "Basic Policy regarding the Protection of Personal Information."


1. Collection of Personal Information; Purpose of Use

i List of information that will be collected

The Company may collect the following information from you in connection with the provision of the App:

・UID of mobile device
・Country
・Name of mobile device
・MAC address
・SSID
・Time zone
・IMEI
・Email address
・Installation source of the App
・Advertising-related information
・advertising ID
・UID of the App
・IP address
・Facebook ID


ii Purpose of use

The Company will use the collected information for the following purposes:

・Providing the services of the App
・Transferring the usage of the App
・Communication between users of the App
・Communication between you and the Company
・Achieving a secure and safe communication environment
・Measuring, studying, and analyzing the usage of the App and the results of implementing various measures
・Conducting marketing research and surveys
・Improving the App and fixing bugs
・Introducing various services, promotions, campaigns, events, etc. operated by the Company or a third party
・Displaying advertisements and optimizing the content of such advertisements
・Rectifying any violations of the Terms of Use
・Handling inquiries (including identity verification)
・Providing information to the third parties (including joint users) set forth in "3. Provision to Third Parties; Information Collection Modules"

iii Legal basis

The legal basis for the processing of your Personal Data is your consent.
2. Provision to Third Parties; Information Collection Modules and International Transfer of Information

i Provision to third parties

In the cases set forth in "4. Provision to Third Parties" of the "Basic Policy regarding the Protection of Personal Information," the Company may disclose personal information to third parties.

ii Information collection modules

The App contains the following information collection modules provided by the following third parties for purposes such as providing the features included in the App, displaying advertisements, and analyzing usage. With regard to the purpose of use of the information that will be collected or has been collected through such information collection modules, please review the privacy policy that is provided by each company providing an information collection module:

・Google Inc. "Google Analytics" http://www.google.com/analytics/
(To analyze traffic for improving the services of the App and marketing research purposes)
・New Relic "New Relic" https://newrelic.com/
(To study the crash reports for the App)
・adjust K.K. "adjust" https://www.adjust.com
(To identify and analyze the promotional effect for the App)
・Zendesk "Zendesk" https://www.zendesk.com/
(To provide customer support for the App)
・Facebook "Facebook" https://www.facebook.com
(To identify and analyze the promotional effect for the App)
・Snowflake "Snowflake" https://www.snowflake.net/
(To analyze traffic for improving the services of the App)

iii International Transfer of Information

Company may transfer information that Company collect about you to our affiliates or to other third parties that may be outside of your country. If you are located in the European Union origin, another country or jurisdiction, such locations may have laws governing data collection and use that differ from U.S. law.Please note that you are transferring such information and allowing Company or others to transfer such information, including personal information, to a country and jurisdiction that does not have the same data protection laws as your jurisdiction, and you consent to: (i) the transfer of such information to Goodbay Technologies, Inc., based in U.S and India, GREE, Inc., based in Japan, Funplex, Inc., based on Japan, and AltPlus, Inc., based in Japan; and (ii) their use and disclosure of such information.

3. Method of Notices, Announcements, or Obtaining Consent; Method of User Involvement

i Notices and announcements

This Policy is posted and announced on the initial startup screen and the help page on the App as well as on the privacy policy link that is found on the download page for the App. The Company may amend this Policy, and any important changes will be announced on the App or each posting location. The amended Policy will apply starting from the time when it is posted on the App or each posting location.

ii Method for obtaining consent

Please use the App after you have reviewed and agreed to the Terms of Use and this Policy. By using the App (in the case of an amended Policy, by continuing to use the App after the amendment), you will be deemed to have agreed to this Policy. You can withdraw consent at any time. If you wish to make such request, please inform us by following the process described on our support page as follows. We will not collect personal information from anyone we have actual knowledge is under the age of sixteen (16).

iii Suspension of collection and transmission of information

You may stop the collection and transmission of information by deleting (uninstalling) the App from your mobile device.

4. Request for Disclosure, Etc.; Inquiries

i. Request for disclosure, correction, addition, deletion, suspension of use, etc.

If you or your agent: (i) makes a request (a) to access, disclose, correct, or delete your personal information, (b) to restrict or suspend the use of your personal information, or (c) data portability; or (ii) exercise the right to object the use of your personal information, the Company will comply with such request without delay to the extent possible in accordance with laws and regulations.  If you wish to make such request, please inform us by following the process described on our support page as follows. Please note your account may be deactivated if you delete certain of your personal data. You have the right to complain to the supervisory authority.

Support Page
https://games.gree-support.net/hc/en-us

ii. Inquiries

If you wish to make an inquiry, to discuss, or to file a complaint with regard to the handling of personal information in connection with the App, please contact the Company after reviewing the Company's support page:https://games.gree-support.net/hc/en-us

iii. Data Protection Officers(DPO) 
Company elected the data protection officer is involved, properly and in a timely manner, in all issues which relate to the protection of personal data.

Post: Data Protection Officer
GREE, Inc.
Roppongi Hills Mori Tower, 6-10-1 Roppongi, Minato-ku, 
Tokyo, Japan
dpo@gree.net


iv. EU Representative

Company appointed the EU Representative as below;

Post: GREE Inc. EU Representative
PLANET // LEGAL
Neuer Wall 54, 20354 Hamburg, Germany
eu_representative@planit.legal


v. Controller of your personal information and its contacts

Funzio, Inc.
Roppongi Hills Tower, 6-10-1 Roppongi Minato-ku,
Tokyo, Japan
https://games.gree-support.net/hc/en-us


5. Administration Policy

i Amendment of this Privacy Policy

The terms of this Privacy Policy may be revised or amended. Unless otherwise specified by the Company, the revised or amended Privacy Policy will come into effect when it is posted on this website

ii Retention Policy

Except as the case being necessary for the compliance of applicable law, regulation or order by the government, court or other applicable authority, the personal data will be deleted within three years after this App has closed.
`
- `public static final int AMAZON_VERSION = 5`
- `public static final String BUTTON = Login`
- `public static final String GOOGLE_BODY = Basic Policy regarding the Protection of Personal Information

1. Basic Policy

i. Protection of personal information

The Company recognizes the importance of personal information, views the complete protection of personal information as its social responsibility, and promises to comply with the Act on the Protection of Personal Information, other relevant laws and regulations, guidelines, and the like, and to properly handle the personal information collected from the customers who use the Company's services and the Company App in accordance with this Policy.

ii. Scope

This Policy will apply to all of the Company's services provided by the Company. The personal information that will be collected and the purpose of use of such information will be specifically provided for each of the Company's services in the individual privacy policy for the Company's service.

2. Handling of Personal Information

i. Collection

The Company will clearly state the purpose of use in the privacy policy and collect the personal information required for providing the Company's services through lawful and fair means.

ii. Purpose of use

The Company will only use the collected personal information for improving the quality of the Company's services, delivering ads, or for any other purpose of use set forth in the privacy policy, and the Company will not use such information for any other purpose without the customer's consent or in the absence of any law or regulation to the contrary.

3. Administration System

i. Appointment of administrator and creation of internal rules

The Company has appointed a personal information protection administrator as the person responsible for the administration of the personal information. The Company has also created internal rules regarding the protection of personal information and is ensuring the proper handling of personal information.

ii. Information security measures

The Company restricts access to personal information for the purpose of preventing personal information from being leaked, destroyed, or damaged or for any other safety management purpose. The Company also provides training regarding the handling of personal information for its officers and employees who handle personal information.

iii. Destruction of information

When the Company reasonably determines that the collected personal information is unnecessary for the business operation of the Company's services or upon the expiration of the individually specified retention period, the Company will dispose the personal information in its possession.

4. Provision to Third Parties

i. Disclosure to third parties

In the following cases, the Company may disclose personal information to third parties:

・The Company outsources work to a third party to the extent necessary to achieve the purpose of use
・The Company performs a merger, corporate spin-off, transfer of business, or disposes all or some of the Company's business, assets, or stock (including cases where it is performed in connection with bankruptcy or similar proceedings)
・The Company requests the customer's consent for the disclosure and the customer gives such consent

However, with regard to any information that has been statistically processed so that individual customers cannot be identified, the Company may use such information for purposes other than those listed above.

ii. Disclosure at the request of a government body, local government, public agency, or the like

In the following cases, the Company may disclose personal information to a public agency or the like:

・Pursuant to laws and regulations (including any laws and regulations outside of the country of residence of the party that will be providing the information)
・Disclosure is necessary to protect a person's life, body, or property, and it is difficult to obtain the consent of the customer
・It is particularly necessary to improve public health or to promote the healthy development of children, and it is difficult to obtain the consent of the customer
・There is a need to cooperate with the performance of administrative work provided for by law or regulation by a national government body, local government, or a contractor for such body, and obtaining the customer's consent may interfere with the performance of such administrative work



Privacy Policy

This "DragonSoul" Application Privacy Policy (this "Policy") sets forth the handling of personal information on the "DragonSoul" game application for mobile devices (including any updated versions of the app and ancillary services thereof; the "Company App") provided by Fantasy Legend Studios, Inc. (the "Company"). With regard to matters that are not provided for in this Policy, please also review the "Basic Policy regarding the Protection of Personal Information."


1. Collection of Personal Information; Purpose of Use

i List of information that will be collected

The Company may collect the following information from you in connection with the provision of the App:

・UID of mobile device
・Country
・Name of mobile device
・MAC address
・SSID
・Time zone
・IMEI
・Email address
・Installation source of the App
・Advertising-related information
・advertising ID
・UID of the App
・IP address
・Facebook ID


ii Purpose of use

The Company will use the collected information for the following purposes:

・Providing the services of the App
・Transferring the usage of the App
・Communication between users of the App
・Communication between you and the Company
・Achieving a secure and safe communication environment
・Measuring, studying, and analyzing the usage of the App and the results of implementing various measures
・Conducting marketing research and surveys
・Improving the App and fixing bugs
・Introducing various services, promotions, campaigns, events, etc. operated by the Company or a third party
・Displaying advertisements and optimizing the content of such advertisements
・Rectifying any violations of the Terms of Use
・Handling inquiries (including identity verification)
・Providing information to the third parties (including joint users) set forth in "3. Provision to Third Parties; Information Collection Modules"

iii Legal basis

The legal basis for the processing of your Personal Data is your consent.
2. Provision to Third Parties; Information Collection Modules and International Transfer of Information

i Provision to third parties

In the cases set forth in "4. Provision to Third Parties" of the "Basic Policy regarding the Protection of Personal Information," the Company may disclose personal information to third parties.

ii Information collection modules

The App contains the following information collection modules provided by the following third parties for purposes such as providing the features included in the App, displaying advertisements, and analyzing usage. With regard to the purpose of use of the information that will be collected or has been collected through such information collection modules, please review the privacy policy that is provided by each company providing an information collection module:

・Google Inc. "Google Analytics" http://www.google.com/analytics/
(To analyze traffic for improving the services of the App and marketing research purposes)
・New Relic "New Relic" https://newrelic.com/
(To study the crash reports for the App)
・adjust K.K. "adjust" https://www.adjust.com
(To identify and analyze the promotional effect for the App)
・Zendesk "Zendesk" https://www.zendesk.com/
(To provide customer support for the App)
・Facebook "Facebook" https://www.facebook.com
(To identify and analyze the promotional effect for the App)
・Snowflake "Snowflake" https://www.snowflake.net/
(To analyze traffic for improving the services of the App)

iii International Transfer of Information

Company may transfer information that Company collect about you to our affiliates or to other third parties that may be outside of your country. If you are located in the European Union origin, another country or jurisdiction, such locations may have laws governing data collection and use that differ from U.S. law. Please note that you are transferring such information and allowing Company or others to transfer such information, including personal information, to a country and jurisdiction that does not have the same data protection laws as your jurisdiction, and you consent to: (i) the transfer of such information to Goodbay Technologies, Inc., based in U.S and India, GREE, Inc., based in Japan, Funplex, Inc., based on Japan, and AltPlus, Inc., based in Japan; and (ii) their use and disclosure of such information.

3. Method of Notices, Announcements, or Obtaining Consent; Method of User Involvement

i Notices and announcements

This Policy is posted and announced on the initial startup screen and the help page on the App as well as on the privacy policy link that is found on the download page for the App. The Company may amend this Policy, and any important changes will be announced on the App or each posting location. The amended Policy will apply starting from the time when it is posted on the App or each posting location.

ii Method for obtaining consent

Please use the App after you have reviewed and agreed to the Terms of Use and this Policy. By using the App (in the case of an amended Policy, by continuing to use the App after the amendment), you will be deemed to have agreed to this Policy. You can withdraw consent at any time. If you wish to make such request, please inform us by following the process described on our support page as follows. We will not collect personal information from anyone we have actual knowledge is under the age of sixteen (16).

iii Suspension of collection and transmission of information

You may stop the collection and transmission of information by deleting (uninstalling) the App from your mobile device.

4. Request for Disclosure, Etc.; Inquiries

i. Request for disclosure, correction, addition, deletion, suspension of use, etc.

If you or your agent: (i) makes a request (a) to access, disclose, correct, or delete your personal information, (b) to restrict or suspend the use of your personal information, or (c) data portability; or (ii) exercise the right to object the use of your personal information, the Company will comply with such request without delay to the extent possible in accordance with laws and regulations.  If you wish to make such request, please inform us by following the process described on our support page as follows. Please note your account may be deactivated if you delete certain of your personal data. You have the right to complain to the supervisory authority.

Support Page
https://games.gree-support.net/hc/en-us

ii. Inquiries

If you wish to make an inquiry, to discuss, or to file a complaint with regard to the handling of personal information in connection with the App, please contact the Company after reviewing the Company's support page:https://games.gree-support.net/hc/en-us

iii. Data Protection Officers(DPO) 
Company elected the data protection officer is involved, properly and in a timely manner, in all issues which relate to the protection of personal data.

Post: Data Protection Officer
GREE, Inc.
Roppongi Hills Mori Tower, 6-10-1 Roppongi, Minato-ku, 
Tokyo, Japan
dpo@gree.net


iv. EU Representative

Company appointed the EU Representative as below;

Post: GREE Inc. EU Representative
PLANET // LEGAL
Neuer Wall 54, 20354 Hamburg, Germany
eu_representative@planit.legal


v. Controller of your personal information and its contacts

Funzio, Inc.
Roppongi Hills Tower, 6-10-1 Roppongi Minato-ku,
Tokyo, Japan
https://games.gree-support.net/hc/en-us


5. Administration Policy

i Amendment of this Privacy Policy

The terms of this Privacy Policy may be revised or amended. Unless otherwise specified by the Company, the revised or amended Privacy Policy will come into effect when it is posted on this website

ii Retention Policy

Except as the case being necessary for the compliance of applicable law, regulation or order by the government, court or other applicable authority, the personal data will be deleted within three years after this App has closed.
`
- `public static final int GOOGLE_VERSION = 5`
- `public static final String IOS_BODY = Basic Policy regarding the Protection of Personal Information

1. Basic Policy

i. Protection of personal information

The Company recognizes the importance of personal information, views the complete protection of personal information as its social responsibility, and promises to comply with the Act on the Protection of Personal Information, other relevant laws and regulations, guidelines, and the like, and to properly handle the personal information collected from the customers who use the Company's services and the Company App in accordance with this Policy.

ii. Scope

This Policy will apply to all of the Company's services provided by the Company. The personal information that will be collected and the purpose of use of such information will be specifically provided for each of the Company's services in the individual privacy policy for the Company's service.

2. Handling of Personal Information

i. Collection

The Company will clearly state the purpose of use in the privacy policy and collect the personal information required for providing the Company's services through lawful and fair means.

ii. Purpose of use

The Company will only use the collected personal information for improving the quality of the Company's services, delivering ads, or for any other purpose of use set forth in the privacy policy, and the Company will not use such information for any other purpose without the customer's consent or in the absence of any law or regulation to the contrary.

3. Administration System

i. Appointment of administrator and creation of internal rules

The Company has appointed a personal information protection administrator as the person responsible for the administration of the personal information. The Company has also created internal rules regarding the protection of personal information and is ensuring the proper handling of personal information.

ii. Information security measures

The Company restricts access to personal information for the purpose of preventing personal information from being leaked, destroyed, or damaged or for any other safety management purpose. The Company also provides training regarding the handling of personal information for its officers and employees who handle personal information.

iii. Destruction of information

When the Company reasonably determines that the collected personal information is unnecessary for the business operation of the Company's services or upon the expiration of the individually specified retention period, the Company will dispose the personal information in its possession.

4. Provision to Third Parties

i. Disclosure to third parties

In the following cases, the Company may disclose personal information to third parties:

・The Company outsources work to a third party to the extent necessary to achieve the purpose of use
・The Company performs a merger, corporate spin-off, transfer of business, or disposes all or some of the Company's business, assets, or stock (including cases where it is performed in connection with bankruptcy or similar proceedings)
・The Company requests the customer's consent for the disclosure and the customer gives such consent

However, with regard to any information that has been statistically processed so that individual customers cannot be identified, the Company may use such information for purposes other than those listed above.

ii. Disclosure at the request of a government body, local government, public agency, or the like

In the following cases, the Company may disclose personal information to a public agency or the like:

・Pursuant to laws and regulations (including any laws and regulations outside of the country of residence of the party that will be providing the information)
・Disclosure is necessary to protect a person's life, body, or property, and it is difficult to obtain the consent of the customer
・It is particularly necessary to improve public health or to promote the healthy development of children, and it is difficult to obtain the consent of the customer
・There is a need to cooperate with the performance of administrative work provided for by law or regulation by a national government body, local government, or a contractor for such body, and obtaining the customer's consent may interfere with the performance of such administrative work



Privacy Policy

This "DragonSoul" Application Privacy Policy (this "Policy") sets forth the handling of personal information on the "DragonSoul" game application for mobile devices (including any updated versions of the app and ancillary services thereof; the "Company App") provided by Fantasy Legend Studios, Inc. (the "Company"). With regard to matters that are not provided for in this Policy, please also review the "Basic Policy regarding the Protection of Personal Information."


1. Collection of Personal Information; Purpose of Use

i List of information that will be collected

The Company may collect the following information from you in connection with the provision of the App:

・UID of mobile device
・Country
・Name of mobile device
・MAC address
・SSID
・Time zone
・IMEI
・Email address
・Installation source of the App
・Advertising-related information
・advertising ID
・UID of the App
・IP address
・Facebook ID


ii Purpose of use

The Company will use the collected information for the following purposes:

・Providing the services of the App
・Transferring the usage of the App
・Communication between users of the App
・Communication between you and the Company
・Achieving a secure and safe communication environment
・Measuring, studying, and analyzing the usage of the App and the results of implementing various measures
・Conducting marketing research and surveys
・Improving the App and fixing bugs
・Introducing various services, promotions, campaigns, events, etc. operated by the Company or a third party
・Displaying advertisements and optimizing the content of such advertisements
・Rectifying any violations of the Terms of Use
・Handling inquiries (including identity verification)
・Providing information to the third parties (including joint users) set forth in "3. Provision to Third Parties; Information Collection Modules"

iii Legal basis

The legal basis for the processing of your Personal Data is your consent.
2. Provision to Third Parties; Information Collection Modules and International Transfer of Information

i Provision to third parties

In the cases set forth in "4. Provision to Third Parties" of the "Basic Policy regarding the Protection of Personal Information," the Company may disclose personal information to third parties.

ii Information collection modules

The App contains the following information collection modules provided by the following third parties for purposes such as providing the features included in the App, displaying advertisements, and analyzing usage. With regard to the purpose of use of the information that will be collected or has been collected through such information collection modules, please review the privacy policy that is provided by each company providing an information collection module:

・New Relic "New Relic" https://newrelic.com/
(To study the crash reports for the App)
・adjust K.K. "adjust" https://www.adjust.com
(To identify and analyze the promotional effect for the App)
・Zendesk "Zendesk" https://www.zendesk.com/
(To provide customer support for the App)
・Facebook "Facebook" https://www.facebook.com
(To identify and analyze the promotional effect for the App)
・Snowflake "Snowflake" https://www.snowflake.net/
(To analyze traffic for improving the services of the App)

iii International Transfer of Information

Company may transfer information that Company collect about you to our affiliates or to other third parties that may be outside of your country. If you are located in the European Union origin, another country or jurisdiction, such locations may have laws governing data collection and use that differ from U.S. law. Please note that you are transferring such information and allowing Company or others to transfer such information, including personal information, to a country and jurisdiction that does not have the same data protection laws as your jurisdiction, and you consent to: (i) the transfer of such information to Goodbay Technologies, Inc., based in U.S and India, GREE, Inc., based in Japan, Funplex, Inc., based on Japan, and AltPlus, Inc., based in Japan; and (ii) their use and disclosure of such information.

3. Method of Notices, Announcements, or Obtaining Consent; Method of User Involvement

i Notices and announcements

This Policy is posted and announced on the initial startup screen and the help page on the App as well as on the privacy policy link that is found on the download page for the App. The Company may amend this Policy, and any important changes will be announced on the App or each posting location. The amended Policy will apply starting from the time when it is posted on the App or each posting location.

ii Method for obtaining consent

Please use the App after you have reviewed and agreed to the Terms of Use and this Policy. By using the App (in the case of an amended Policy, by continuing to use the App after the amendment), you will be deemed to have agreed to this Policy. You can withdraw consent at any time. If you wish to make such request, please inform us by following the process described on our support page as follows. We will not collect personal information from anyone we have actual knowledge is under the age of sixteen (16).

iii Suspension of collection and transmission of information

You may stop the collection and transmission of information by deleting (uninstalling) the App from your mobile device.

4. Request for Disclosure, Etc.; Inquiries

i. Request for disclosure, correction, addition, deletion, suspension of use, etc.

If you or your agent: (i) makes a request (a) to access, disclose, correct, or delete your personal information, (b) to restrict or suspend the use of your personal information, or (c) data portability; or (ii) exercise the right to object the use of your personal information, the Company will comply with such request without delay to the extent possible in accordance with laws and regulations.  If you wish to make such request, please inform us by following the process described on our support page as follows. Please note your account may be deactivated if you delete certain of your personal data. You have the right to complain to the supervisory authority.

Support Page
https://games.gree-support.net/hc/en-us

ii. Inquiries

If you wish to make an inquiry, to discuss, or to file a complaint with regard to the handling of personal information in connection with the App, please contact the Company after reviewing the Company's support page:https://games.gree-support.net/hc/en-us

iii. Data Protection Officers(DPO) 
Company elected the data protection officer is involved, properly and in a timely manner, in all issues which relate to the protection of personal data.

Post: Data Protection Officer
GREE, Inc.
Roppongi Hills Mori Tower, 6-10-1 Roppongi, Minato-ku, 
Tokyo, Japan
dpo@gree.net


iv. EU Representative

Company appointed the EU Representative as below;

Post: GREE Inc. EU Representative
PLANET // LEGAL
Neuer Wall 54, 20354 Hamburg, Germany
eu_representative@planit.legal


v. Controller of your personal information and its contacts

Funzio, Inc.
Roppongi Hills Tower, 6-10-1 Roppongi Minato-ku,
Tokyo, Japan
https://games.gree-support.net/hc/en-us


5. Administration Policy

i Amendment of this Privacy Policy

The terms of this Privacy Policy may be revised or amended. Unless otherwise specified by the Company, the revised or amended Privacy Policy will come into effect when it is posted on this website

ii Retention Policy

Except as the case being necessary for the compliance of applicable law, regulation or order by the government, court or other applicable authority, the personal data will be deleted within three years after this App has closed.
`
- `public static final int IOS_VERSION = 5`
- `public static final String TITLE = Privacy policy`

### SkillTextHelper (class)
`com.perblue.rpg.util.SkillTextHelper`

**Fields (14):**
- `private static final ThreadLocal INSTANCE`
- `private static final Log LOG`
- `private static final EnumMap SCALES_OFF_LEVEL_CACHE`
- `private static ac snapshotPool`
- `private final Stack accumulators`
- `private SkillTextSnapshot deltaSnapshot`
- `private final Stack isFirstParamStack`
- `private boolean isPercent`
- `private final Stack operations`
- `private Param param`
- `private SkillType skill`
- `private SkillType tempSkill`
- `private UnitData unit`
- `private boolean useColor`

**Methods (14):**
- `String addValuesToDescription(String, UnitData, SkillType)`
- `String addValuesToPromoteDescription(String, SkillType, UnitData)`
- `void compressAccumulators(Float)`
- `int getDecimalPrecision(g, float)`
- `int getDecimalPrecision(Param, SkillType, float)`
- `String addValuesToDelta(String, SkillType, UnitData, SkillTextSnapshot)`
- `String replaceTokens(String)`
- `String formatParam(float)`
- `ScalesOffOf isDynamic(Param, SkillType)`
- `float getCurParamVal(Param, SkillType, UnitData)`
- `ScalesOffOf isDynmaicUncached(Param, SkillType)`
- `ScalesOffOf isParserDynamic(g)`
- `void parseParam(String)`
- `SkillTextSnapshot snapShopParamters(SkillType, UnitData)`

### SoundManager (class)
`com.perblue.rpg.util.SoundManager`

**Fields (15):**
- `private static final float SOUND_FADE_OUT_DURATION = 0.1`
- `private final AtomicReference ambientMusic`
- `private final AtomicReference ambientMusicName`
- `private RPGAssetManager assetManager`
- `private final AtomicReference attackMusic`
- `private DeviceInfo deviceInfo`
- `private float effectsVolume`
- `private final Map entitySounds`
- `private RPGMain game`
- `private float mimeVolume`
- `private boolean musicEnabled`
- `private float musicVolume`
- `private final ac playingSoundPool`
- `private boolean soundEnabled`
- `private h tweenManager`

**Methods (42):**
- `void updateTweenManager(float)`
- `boolean shouldPlaySound()`
- `void pauseEntitySounds()`
- `void resumeEntitySounds()`
- `void clearEntity(IEntity, boolean)`
- `void stopEntitySounds(IEntity, boolean)`
- `void stopEntitySounds(IEntity)`
- `float getEffectsVolume()`
- `float getMusicVolume()`
- `void mimeHushSounds(float, float)`
- `void mimeResumeSounds()`
- `void playEntitySound(IEntity, String, float)`
- `void playEntitySound(IEntity, String)`
- `void setMusicEnabled(boolean)`
- `void stopAmbientMusic()`
- `boolean shouldPlayMusic()`
- `void setDeviceInfo(DeviceInfo)`
- `void setMusicVolume(float)`
- `void setEffectsVolume(float)`
- `int getSystemVolume()`
- `void entityDestroyed(IEntity)`
- `void entityMoved(IEntity)`
- `void startAmbientMusic(String)`
- `void startAttackMusic(String)`
- `void stopAttackMusic()`
- `void setSoundEnabled(boolean)`
- `boolean isSoundEnabled()`
- `boolean isMusicEnabled()`
- `void playSound(String, float)`
- `void playSound(String)`
- `void entityAdded(IEntity)`
- `void entityRemoved(IEntity)`
- `void unitCostumeRefresh(IEntity)`
- `void unitRemoveRendering(IEntity)`
- `void clear()`
- `void init()`

### com.perblue.rpg.util.StringCleaner [LOAD ERROR: null]

### TeamHelper (class)
`com.perblue.rpg.util.TeamHelper`

**Fields (3):**
- `public static final int ALL_TEAM = 3`
- `public static final int ATTACKING_TEAM = 1`
- `public static final int DEFENDING_TEAM = 2`

**Methods (2):**
- `boolean isAttackingTeam(Entity)`
- `boolean isDefendingTeam(Entity)`

### TempVars (class)
`com.perblue.rpg.util.TempVars`

**Fields (11):**
- `private static ac objectFloatMap`
- `private static ac objectMap`
- `private static ac poolArray`
- `private static ac poolBbx`
- `private static ac poolFloatArray`
- `private static ac poolIntArray`
- `private static ac poolIsoPos`
- `private static ac poolMat4`
- `private static ac poolRect`
- `private static ac poolVec2`
- `private static ac poolVec3`

**Methods (22):**
- `j obtainFloatArray()`
- `n obtainIntArray()`
- `IsoPosition obtainIsoPos()`
- `a obtainBbx()`
- `x obtainObjectFloatMap()`
- `Matrix4 obtainMat4()`
- `z obtainObjectMap()`
- `a obtainArray()`
- `p obtainVec2()`
- `n obtainRect()`
- `q obtainVec3()`
- `void free(IsoPosition)`
- `void free(q)`
- `void free(p)`
- `void free(n)`
- `void free(a)`
- `void free(Matrix4)`
- `void free(z)`
- `void free(x)`
- `void free(n)`
- `void free(j)`
- `void free(a)`

### TermsOfService (class)
`com.perblue.rpg.util.TermsOfService`

**Fields (8):**
- `public static final String AMAZON_BODY = Effective Date: November 18, 2016
Revised Date: May 25th, 2018

These Terms of Service ("Terms of Service") are an agreement between you and Fantasy Legend Studios, Inc. ("FLS"). FLS's Privacy Policy, which is currently located at http://dragonsoulgame.com/privacy_policy (the "Privacy Policy"), and FLS's Copyright Policy, which is currently located at http://dragonsoulgame.com/copyright_policy (the "Copyright Policy"), are hereby incorporated into these Terms of Service.

Please carefully read these Terms of Service.

By registering for an Account or otherwise using the Service (as defined below), you represent that:

you are age 16 or older; and
you understand and agree to these Terms of Service, and, if you are between the ages of 16 and 18, your legal guardian has reviewed and understands and agrees to these Terms of Service.
BY INSTALLING, USING OR OTHERWISE ACCESSING THE SERVICE, YOU AGREE TO THESE TERMS OF SERVICE. IF YOU DO NOT AGREE TO THESE TERMS OF SERVICE, PLEASE DO NOT INSTALL, USE OR OTHERWISE ACCESS THE SERVICE. USE OF THE SERVICE IS VOID WHERE PROHIBITED.

1. Certain Definitions
A "Device" means any mobile or wireless computing device, for example a smartphone, that may be used to access the Service.
The "Service" means (i) the websites located at gree.net, gree-support.net and gree-corp.com (the "Site"), including any services, features and content accessible or downloadable from the Site, and (ii) any other FLS application, service or product licensed, downloaded or otherwise accessed by you through third party websites or sources.
"Service Materials" means all information and materials that are part of the Service, including without limitation the following: any and all copyrightable material, including but not limited to software; the "look and feel" of the Service or any portion of the Service; the compilation and arrangement of the components of the Service or any portion of the Service; pictures or other graphics or images; text; audio or video; advertising copy; data; logos; domain names; trademarks, service marks or trade names; and User Content (as defined below).
"User Content" means content and materials (including without limitation text, writings, photographs, graphics, images, comments, personally identifiable information, etc.), which the Service may invite or enable you and other users to create, submit, post, display, transmit, perform, publish or distribute communications, including by making the foregoing available to FLS and to other users of the Service, whether via e-mail or through online forums, message boards, messaging services, blogs or other functionality of the Service or portions of the Service.
"Virtual Currency" means virtual coins, points or similar items that may be earned or obtained through the Service or otherwise purchased by you for legal tender or actual currency, subject to applicable law.
"Virtual Goods" means virtual digital items, such as commodities, abilities or other goods that may be earned or obtained through the Service or otherwise purchased by you for legal tender or actual currency, or for Virtual Currency, subject to applicable law.
"Your Content" means User Content that you make available in connection with the Service.
2. License Grant and Restrictions
FLS grants to you a limited, revocable, non-exclusive, non-sublicensable, non-transferable license to use and display the following: (a) the portions of the Service that are accessible from the Site without payment or made accessible from third party websites or sources via FLS's authorization without payment, and (b) such other portions of the Service accessible on a "for-payment" basis, provided that you have paid the applicable fees and met the applicable conditions. The foregoing license is (i) solely for your personal, non- commercial use; (ii) solely for a single computer to access the Site and solely on a Device to access applications; and (iii) subject to your compliance with these Terms of Service.

You agree not to do or attempt to do any of the following:

copy, adapt, modify, prepare derivative works based upon, distribute, license, sell, transfer, publicly display, publicly perform, transmit, broadcast, stream or otherwise exploit the Service or any portion of the Service, except as expressly permitted in these Terms of Service; or
use the Service for any use or purpose other than as expressly permitted by these Terms of Service.
Neither FLS nor any of the FLS Parties (as defined below) grant to you any licenses or rights except for the licenses and rights expressly granted in these Terms of Service. FLS and its licensors hereby reserve all rights not expressly granted by these Terms of Service. No license is granted hereunder by estoppel, implication or otherwise.

3. Account Registration and Confidentiality
By registering through the Service to play FLS games and access FLS services, we will establish an internal account specific to you as a user ("Account"). As part of this registration process, you may be requested to provide information about yourself in order to use the Service. You agree to provide and maintain true, accurate, complete and current information as requested by the Service. If you provide any information that is untrue, inaccurate, incomplete or not current, FLS has the right to suspend or terminate your Account and may prohibit you from using the Service at any time.

You are responsible for maintaining the confidentiality of your Account. You agree to notify FLS immediately of any unauthorized use of your Account or any other breach of security related to your Account. You are responsible for all activities that occur under your Account whether or not you have knowledge of those activities.

4. Service Materials
The Service Materials are protected by applicable laws in both the United States and other jurisdictions, including but not limited to intellectual property laws. Any use, copying and/or dissemination of the Service Materials may be restricted by such laws. You agree not to (nor attempt to) license, modify, copy, publish, sell, transfer, transmit or exploit in any way, any portion of the Service or Service Materials other than (a) Your Content (as defined below), (b) the specific Service Materials set forth in the following paragraph of this Section or (c) as expressly permitted in writing by FLS and, if applicable, the third party owner(s) of such Service Materials. You are solely responsible for obtaining permission from such owner(s).

You may use the following specific Service Materials only as expressly permitted in these Terms of Service:

Share Image. A "Share Image" is a specific in-application image identified by FLS and enabled for sharing as expressly permitted as follows. You may make a Share Image available only to other FLS users and only via FLS's social networking service.
Friend Code. A "Friend Code" is a specific code provided by FLS. Users may share a Friend Code only on Facebook and Twitter, and only as an invitation to join the Service to contacts on those third party services.
Screen Capture. A "Screen Capture" is a screenshot saved by a user via an in-application function. Users may send Screen Captures solely to their contacts on Facebook and Twitter, and only in unmodified form.

5. Ownership
FLS and its licensors own all right, title and interest in and to the Service and the Service Materials, except for Your Content (as defined below) and except as otherwise expressly set forth in these Terms of Service. You shall not acquire any ownership rights whatsoever by downloading Service Materials or by purchasing any Virtual Currency or Virtual Goods (each as defined below).

6. User Content/Your Content
All User Content is the sole responsibility of the person from whom such User Content originated. FLS has no obligation to review, evaluate or otherwise monitor any User Content for any quality, including but not limited to accuracy or legality. FLS makes no warranties or other guarantees with respect to User Content and hereby disclaims any and all such warranties or guarantees.

Your use of the Service is at your own risk. By using the Service, you may be exposed to User Content that is offensive, indecent or otherwise not in line with your expectations. You bear all risks associated with, the use of any User Content available in connection with the Service. FLS shall not be liable in any way for any User Content made available via the Service, including but not limited to any errors or omissions in any such User Content or any loss or damage of any kind resulting from any use of such User Content. You may notify FLS of User Content that you believe violates these Terms of Service, or other inappropriate user behavior, by following the process described on our support page located at https://dragonsoul.zendesk.com/hc/en-us. Notwithstanding the foregoing, FLS reserves the right in its sole discretion to review, monitor, prohibit, edit, delete, disable access to or otherwise make unavailable any User Content (including without limitation Your Content) without notice for any reason or for no reason at any time.

You agree that Your Content is not confidential and will not be returned to you. You warrant that Your Content is original to you and that you own all rights to Your Content, including the right to grant all of the rights and licenses in these Terms of Service without FLS incurring any obligations to any third party or liability arising out of its exercise of such rights and licenses.

You hereby grant to FLS an irrevocable, perpetual, transferable, fully paid-up, royalty-free, worldwide license (including the right to sublicense and assign to third party) and right to copy, reproduce, fix, adapt, modify, create derivative works from, manufacture, commercialize, publish, distribute, sell, license, sublicense, transfer, lease, transmit, publicly display, publicly perform, or provide access to electronically, broadcast, communicate to the public by telecommunication, display, perform, enter into computer memory, and use and practice, in any way, your User Content as well as all modified and derivative works thereof in connection with our provision of the Service, including marketing and promotions of the Service. You also hereby grant to FLS the right to authorize others to exercise any of the rights granted to FLS under these Terms of Service. You further hereby grant to FLS the unconditional, irrevocable right to use and exploit your name, likeness and any other information or material included in any User Content and in connection with any User Content, without any obligation to you. Except as prohibited by law, you waive any rights of attribution and/or any moral rights you may have in Your Content, regardless of whether Your Content is altered or changed in any manner.

FLS does not claim any ownership rights in Your Content and nothing in these Terms of Service is intended to restrict any rights that you may have to use and exploit Your Content. FLS has no obligation to monitor or enforce your intellectual property rights in or to Your Content. FLS has no obligation to accept, display, review, maintain or otherwise exploit any User Content.

7. Virtual Currency and Virtual Goods
The Service may include Virtual Currency and/or Virtual Goods. You have no right, title or interest in or to any such Virtual Goods or Virtual Currency appearing or originating in the Service except for the following: You will have a limited, personal, non-transferable, non-sublicensable, revocable license to use, solely within the Service, Virtual Goods and Virtual Currency that you have earned, purchased or otherwise obtained in a manner authorized by FLS. FLS may manage, regulate, control, modify or eliminate Virtual Currency and/or Virtual Goods at any time, with or without notice. FLS shall have no liability to you or any third party in the event that FLS exercises any such rights.

The transfer of Virtual Currency and Virtual Goods is prohibited except where expressly authorized in the Service. Other than as expressly authorized in the Service, you shall not sell, redeem or otherwise transfer Virtual Currency or Virtual Goods to any person or entity, including but not limited to FLS, another User or any third party.

You understand and agree that all sales of Virtual Currency and Virtual Goods are final and non-refundable, unless FLS (or the applicable third party platform provider) decides in its sole discretion to provide a refund. You agree that in the event that these Terms of Service, your Account, the Service as a whole or the applicable portion of the Service is terminated or discontinued for any reason, you will forfeit all Virtual Currency and Virtual Goods. FLS will have no liability to you in connection with that forfeiture.

8. Restrictions and Rules
As a condition of your use of the Service, and without limiting your other obligations under these Terms of Service, you agree to comply with the restrictions and rules set forth in this Section as well as any additional restrictions or rules (such as application-specific rules) set forth in the Service itself.

You shall not create an Account or access the Service if you are under the age of 16
You shall monitor your Account to restrict use by minors, and you will deny access to children under the age of 16. You accept full responsibility for any unauthorized use of your Account by minors. You are responsible for any use of your credit card or other payment instrument by minors
You shall not rent, lease, sell, trade or otherwise transfer to anyone your Account or any virtual items or virtual currency associated with your Account
You shall not use your Account for any commercial purpose, including but not limited to:
any attempt to raise money for any party or any purpose
advertising of any kind, including chain letters, junk e-mail or repetitive messages (e.g., spam)
You shall not submit false refund requests to FLS or to any third party platform provider
You shall not use your Account to engage in any illegal conduct
You further agree not to:
interfere with or disrupt the Service or servers or networks connected to the Service
interfere with, disrupt or circumvent any feature of the Service that creates security or restricts or enforces limitations on use of or access to the Service
be out of compliance with any requirements or policies of networks connected to the Service
use the Service to violate any applicable law, whether intentionally or unintentionally
use the Service to harm minors (or any other individual) in any way or to reveal any personal information about another individual
defraud FLS or any other person or entity or engage in any "pyramid scheme" or similar activity
impersonate any person or entity or misrepresent your relationship to or affiliation with a person or entity
use the Service to post or otherwise distribute any information that is abusive, threatening, obscene, defamatory, libelous, or racially, sexually, religiously, or otherwise objectionable or offensive
create any Account by automated means or false pretenses or use any other user's Account for any purpose, including to circumvent a suspension or ban, and/or
use or distribute cheats, exploits, automation software, bots, hacks, mods or any unauthorized third party software designed to modify any user's experience with the Service.
You also agree to comply with all applicable laws or other rules regarding online conduct and acceptable User Content, and you agree to comply with all applicable laws or other rules regarding the transmission of technical data exported from the United States or the country in which you reside.

In addition, you agree not to use the Service or any portion of the Service to commit actions that FLS considers, in its sole discretion, to be detrimental in any way to the Service or to any user's enjoyment of the Service.

FLS reserves the right to determine what conduct it considers to be in violation of the rules of use or otherwise outside the intent or spirit of these Terms of Service or the Service itself. FLS reserves the right to take action as a result, which may include terminating your Account and prohibiting you from using the Service.

9. Feedback
"Feedback" means any comments, suggestions or other feedback about, related to or in connection with, the Service that you provide to FLS. You agree that any Feedback shall be the exclusive property of FLS, and you hereby assign to FLS all rights, title and interest in and to all Feedback. You agree that, unless otherwise prohibited by applicable law, FLS may, without any compensation to you, use, sell and otherwise disclose or exploit the Feedback in any way and for any purpose.

10. Changes to the Terms of Service and the Service
FLS may, in its discretion and at any time, modify these Terms of Service and its Privacy Policy by posting the amended terms on the Site. You will be deemed to have accepted such changes by continuing to use the Service. Except as otherwise expressly stated, all amended terms shall automatically be effective immediately when posted.

These Terms of Service may not be otherwise amended except in a writing (not an email) signed by you and FLS. To the extent the Terms of Service or Privacy Policy conflict with any other terms, policy or rules of FLS, the terms contained in these Terms of Service and in the Privacy Policy shall govern.

Except as may be expressly specified otherwise by FLS with respect to paid portions of the Service, FLS reserves the right to add, change, suspend or discontinue the Service, or any aspect or feature of the Service, without notice or liability.

11. Trademarks
"FLS," the FLS logo and other logos and product and service names are trademarks and service marks of, and are owned by, FLS or the FLS Parties. You may not use or display such trademarks in any manner, except as expressly set forth in these Terms of Service. All third party trademarks and service marks appearing on the Service are the property of their respective owners and all rights therein are reserved.

12. Links to Third Party Websites
The Service may contain links to third party websites or resources. FLS may remove any such links at any time for any reason or for no reason. You acknowledge and agree that FLS is not responsible or liable for the availability or accuracy of such websites or resources, or the content, products, or services on or available from such websites or resources. Such links do not imply any endorsement by FLS of, or relationship of FLS with, such websites or resources or the content, products, or services available from such websites or resources. You shall have sole responsibility for and you assume all risk arising from your use of any such websites or resources.

13. Termination
You may terminate your Account at any time and for any reason by following the process described on our support page located at https://dragonsoul.zendesk.com/hc/en-us informing FLS that you wish to terminate your Account. FLS may terminate these Terms of Service, your Account, your access to the Service, the Service itself or any portion of the Service at any time and for any reason. FLS may also notify authorities or take any actions it deems appropriate (including without limitation suspending your Account and your access to the Service), without notice to you if FLS suspects or determines that you may have failed to comply with any provision of these Terms of Service or any other FLS policy or rule, or engaged in actions relating to or in the course of using the Service that may be illegal or cause liability, harm or other disruption for you, FLS, any third party or the Service itself.

As the result of any termination, you will lose your Account and all associated information and data, which may include without limitation your game history, avatars, characters, achievements and Virtual Currency and Virtual Goods. You will not be entitled to and FLS will not be liable to you or any third party for any refund, reimbursement or other liability as a result of any termination (by you or by FLS) permitted under these Terms of Service for any reason. FLS reserves the right in its discretion to refuse to maintain an Account for, or provide the Service to, any individual.

These Terms of Service will remain effective until terminated. You agree that the following sections of these Terms of Service will survive any termination of these Terms of Service, your Account or the Service:

Section 4 (Service Materials); Section 5 (Ownership); Section 6 (User Content/Your Content); Section 7 (Virtual Currency and Virtual Goods); Section 9 (Feedback), Section 11 (Trademarks); Section 12 (Links to Third Party Websites); Section 13 (Termination); Section 14 (Disputes Between You and Other Users), Section 15 (Indemnification); Section 16 (Disclaimers of Warranties); Section 17 (Limitation of Liability); Section 18 (Governing Law and Equitable Remedies); Section 19 (Copyright Issues) and Section 20 (General Provisions).

14. Disputes between You and Other Users
You are solely responsible for your interaction with other users of the Service and other parties that you come in contact with through your use of the Service. FLS reserves the right, but has no obligation, to monitor and manage disputes between you and other users of the Service. You will fully cooperate with FLS to investigate any suspected unlawful, fraudulent or improper activity, including, without limitation, granting FLS access to any password-protected portions of your Account. FLS hereby disclaims any and all liability to you or any third party relating to any dispute between you and other users of the Service.

15. Indemnification
You agree to indemnify, defend and hold the FLS Parties harmless from and against any and all claims, liabilities, damages, losses, costs, expenses, fees (including reasonable attorneys' fees and court costs) due to or arising from information in your Account, any information you (or anyone accessing the Service using your Account) submit, post or transmit through the Service, as well as your (or anyone accessing the Service using your Account):

use of the Service
violation of these Terms of Service, and
violation of any rights of any other person or entity.
FLS may assume the exclusive defense and control of any matter within the scope of this section. You agree to cooperate with FLS and pay all expenses, with respect to any such matter.

16. Disclaimer of Warranties
YOU AGREE THAT THE SERVICE PROVIDED ON AN "AS IS" BASIS WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, WARRANTIES OF TITLE OR IMPLIED WARRANTIES OF NON-INFRINGEMENT, MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. ALL USE OF THE SERVICE IS AT YOUR OWN RISK.

WITHOUT LIMITING THE FOREGOING, NEITHER FLS NOR ITS AFFILIATES (DEFINED BELOW) OR SUBSIDIARIES, NOR ANY OF THEIR EMPLOYEES, DIRECTORS, AGENTS, ATTORNEYS, THIRD-PARTY CONTENT PROVIDERS, DISTRIBUTORS, LICENSEES OR LICENSORS (COLLECTIVELY, THE "FLS PARTIES") WARRANT THAT (A) THE SERVICE WILL MEET YOUR REQUIREMENTS OR (B) THE SERVICE MATERIALS OR USER CONTENT WILL BE VIEWABLE OR ACCESSIBLE OR (C) THE SERVICE WILL BE UNINTERRUPTED, TIMELY, SECURE OR ERROR-FREE. "AFFILIATE" MEANS ANY ENTITY THAT DIRECTLY OR INDIRECTLY CONTROLS, IS UNDER COMMON CONTROL, OR IS CONTROLLED BY FLS, INCLUDING BUT NOT LIMITED TO GREE, INC. AND GREE INTERNATIONAL ENTERTAINMENT, INC.

17. Limitation of Liability
THE FLS PARTIES SHALL NOT BE LIABLE TO YOU FOR ANY INDIRECT, INCIDENTAL, CONSEQUENTIAL, SPECIAL, PUNITIVE OR OTHER SIMILAR DAMAGES, INCLUDING BUT NOT LIMITED TO LOSS OF REVENUES, LOST PROFITS, LOST DATA OR BUSINESS INTERRUPTION OR OTHER INTANGIBLE LOSSES (HOWEVER SUCH LOSSES ARE QUALIFIED), ARISING OUT OF OR RELATING IN ANY WAY TO THESE TERMS OF SERVICE OR THE SERVICE ITSELF, WHETHER BASED ON CONTRACT, TORT OR ANY OTHER LEGAL THEORY, AND WHETHER OR NOT ANY FLS PARTY HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.

THE FLS PARTIES SHALL NOT BE LIABLE TO YOU FOR MORE THAN THE AMOUNT YOU HAVE PAID TO FLS IN ACCORDANCE WITH THESE TERMS OF SERVICE IN THE SIX (6) MONTHS IMMEDIATELY PRECEDING THE DATE ON WHICH YOU FIRST ASSERT A CLAIM. YOU ACKNOWLEDGE AND AGREE THAT IF YOU HAVE NOT PAID ANY AMOUNT TO FLS DURING SUCH TIME PERIOD, YOUR SOLE REMEDY (AND THE FLS PARTIES' EXCLUSIVE LIABILITY) FOR ANY DISPUTE WITH FLS OR THE FLS PARTIES IS TO STOP USING THE SERVICE AND TO CANCEL YOUR ACCOUNT.

Some jurisdictions do not allow the exclusion of certain warranties or the limitation or exclusion of liability for certain types of damages. Accordingly, some of the above disclaimers and limitations may not apply to you. To the extent that FLS or any other FLS Party may not, as a matter of applicable law, disclaim any warranty or limit its liability as set forth herein, the scope of such warranty and the extent of FLS's and any FLS Party's liability shall be the minimum permitted under such applicable law.

18. Governing Law and Equitable Remedies
These Terms of Service and any claim related to these Terms of Service or to the Service itself will be governed by the laws of the State of California without reference to its conflict of laws provisions. The exclusive jurisdiction and venue of any action with respect to the subject matter of these Terms of Service will be the state and federal courts located in San Francisco, California, and each of the parties hereto waives any objection to jurisdiction and venue in such courts. The parties specifically disclaim application of the United Nations Convention on Contracts for the International Sale of Goods.

You acknowledge that your breach of these Terms of Service may result in immediate and irreparable harm to FLS for which remedies at law are inadequate. Accordingly, FLS shall be entitled to seek injunctive or other equitable relief (without the obligation to post any bond) in the event of any breach or anticipatory breach by you of these Terms of Service. You hereby irrevocably waive all rights to seek injunctive or other equitable relief.

19. Copyright Issues
FLS respects the intellectual property of others and asks that users of FLS's games and services do the same. Accordingly, without limiting any other provision of these Terms of Service, you may not upload, post, send or transmit to or through the Service any materials that violate third party intellectual property rights.

If you believe that any copyrighted work owned by you has been copied or used in such a manner so as to constitute copyright infringement in connection with material or data provided through the Service, you may notify FLS's designated copyright agent for receiving claims of copyright infringement as follows:

Fantasy Legend Studios, Inc.  
185 Berry Street, Suite 590  
San Francisco, CA 94107 
Attention: Copyright Agent 

Email: copyright@fantasylegendstudios.com

Please note, however, that as referred to in more detail in FLS's Copyright Policy, certain legal requirements and restrictions apply with respect to such notices. You are encouraged to familiarize yourself with such requirements and restrictions before providing to us any notices of alleged copyright infringement.

20. General Provisions
a. You agree to be responsible for obtaining and maintaining all mobile devices and any other equipment needed for access to and use of the Service, and all charges related thereto.

b. Upon FLS's request, you will provide to FLS any documentation, releases or other materials necessary to verify your compliance with these Terms of Service.

c. FLS currently operates and controls the Service from the United States. The information and materials provided on the Service are not intended for distribution to or use by any person or entity in any jurisdiction where such distribution or use would be contrary to law or regulation or which would subject FLS to any registration requirement within such jurisdiction or country.

d. FLS's failure to exercise or enforce any right or provision of these Terms of Service shall not constitute a waiver of such right or provision. No waiver by either party of any breach or default hereunder shall be deemed to be a waiver of any preceding or subsequent breach or default.

e. The parties agree that if any provision of these Terms of Service is found by a court of competent jurisdiction to be invalid, the court should give effect to the parties' intentions as reflected in the provision and the other provisions of these Terms of Service shall remain in full force and effect.

f. You shall not assign these Terms of Service to another person or entity without FLS's prior written consent.

g. FLS shall not be liable for any delay or failure to perform resulting from causes outside its reasonable control, including without limitation any failure to perform hereunder due to acts of God, war, acts of civil or military authorities, terrorism, riots, embargoes, strikes, or energy shortages.

h. You agree that these Terms of Service will not be construed against FLS by virtue of having drafted them. You hereby waive any and all defenses you may have based on the electronic form of these Terms of Service and the lack of a requirement that these Terms of Service must be signed.

i. These Terms of Service, Privacy Policy, Copyright Policy and any additional policies and rules published by FLS, constitute the entire agreement between you and FLS with respect to your use of the Service and any other subject matter of these Terms of Service. Such terms supersede all prior understandings or agreements between you and FLS, whether electronic, oral or written, or whether established by custom or precedent.

Contacting FLS
To contact FLS, please follow the process described on our support page, located at https://dragonsoul.zendesk.com/hc/en-us.
`
- `public static final int AMAZON_VERSION = 2`
- `public static final String BUTTON = Login`
- `public static final String GOOGLE_BODY = Effective Date: November 18, 2016
Revised Date: May 25th, 2018

These Terms of Service ("Terms of Service") are an agreement between you and Fantasy Legend Studios, Inc. ("FLS"). FLS's Privacy Policy, which is currently located at http://dragonsoulgame.com/privacy_policy (the "Privacy Policy"), and FLS's Copyright Policy, which is currently located at http://dragonsoulgame.com/copyright_policy (the "Copyright Policy"), are hereby incorporated into these Terms of Service.

Please carefully read these Terms of Service.

By registering for an Account or otherwise using the Service (as defined below), you represent that:

you are age 16 or older; and
you understand and agree to these Terms of Service, and, if you are between the ages of 16 and 18, your legal guardian has reviewed and understands and agrees to these Terms of Service.
BY INSTALLING, USING OR OTHERWISE ACCESSING THE SERVICE, YOU AGREE TO THESE TERMS OF SERVICE. IF YOU DO NOT AGREE TO THESE TERMS OF SERVICE, PLEASE DO NOT INSTALL, USE OR OTHERWISE ACCESS THE SERVICE. USE OF THE SERVICE IS VOID WHERE PROHIBITED.

1. Certain Definitions
A "Device" means any mobile or wireless computing device, for example a smartphone, that may be used to access the Service.
The "Service" means (i) the websites located at gree.net, gree-support.net and gree-corp.com (the "Site"), including any services, features and content accessible or downloadable from the Site, and (ii) any other FLS application, service or product licensed, downloaded or otherwise accessed by you through third party websites or sources.
"Service Materials" means all information and materials that are part of the Service, including without limitation the following: any and all copyrightable material, including but not limited to software; the "look and feel" of the Service or any portion of the Service; the compilation and arrangement of the components of the Service or any portion of the Service; pictures or other graphics or images; text; audio or video; advertising copy; data; logos; domain names; trademarks, service marks or trade names; and User Content (as defined below).
"User Content" means content and materials (including without limitation text, writings, photographs, graphics, images, comments, personally identifiable information, etc.), which the Service may invite or enable you and other users to create, submit, post, display, transmit, perform, publish or distribute communications, including by making the foregoing available to FLS and to other users of the Service, whether via e-mail or through online forums, message boards, messaging services, blogs or other functionality of the Service or portions of the Service.
"Virtual Currency" means virtual coins, points or similar items that may be earned or obtained through the Service or otherwise purchased by you for legal tender or actual currency, subject to applicable law.
"Virtual Goods" means virtual digital items, such as commodities, abilities or other goods that may be earned or obtained through the Service or otherwise purchased by you for legal tender or actual currency, or for Virtual Currency, subject to applicable law.
"Your Content" means User Content that you make available in connection with the Service.
2. License Grant and Restrictions
FLS grants to you a limited, revocable, non-exclusive, non-sublicensable, non-transferable license to use and display the following: (a) the portions of the Service that are accessible from the Site without payment or made accessible from third party websites or sources via FLS's authorization without payment, and (b) such other portions of the Service accessible on a "for-payment" basis, provided that you have paid the applicable fees and met the applicable conditions. The foregoing license is (i) solely for your personal, non- commercial use; (ii) solely for a single computer to access the Site and solely on a Device to access applications; and (iii) subject to your compliance with these Terms of Service.

You agree not to do or attempt to do any of the following:

copy, adapt, modify, prepare derivative works based upon, distribute, license, sell, transfer, publicly display, publicly perform, transmit, broadcast, stream or otherwise exploit the Service or any portion of the Service, except as expressly permitted in these Terms of Service; or
use the Service for any use or purpose other than as expressly permitted by these Terms of Service.
Neither FLS nor any of the FLS Parties (as defined below) grant to you any licenses or rights except for the licenses and rights expressly granted in these Terms of Service. FLS and its licensors hereby reserve all rights not expressly granted by these Terms of Service. No license is granted hereunder by estoppel, implication or otherwise.

3. Account Registration and Confidentiality
By registering through the Service to play FLS games and access FLS services, we will establish an internal account specific to you as a user ("Account"). As part of this registration process, you may be requested to provide information about yourself in order to use the Service. You agree to provide and maintain true, accurate, complete and current information as requested by the Service. If you provide any information that is untrue, inaccurate, incomplete or not current, FLS has the right to suspend or terminate your Account and may prohibit you from using the Service at any time.

You are responsible for maintaining the confidentiality of your Account. You agree to notify FLS immediately of any unauthorized use of your Account or any other breach of security related to your Account. You are responsible for all activities that occur under your Account whether or not you have knowledge of those activities.

4. Service Materials
The Service Materials are protected by applicable laws in both the United States and other jurisdictions, including but not limited to intellectual property laws. Any use, copying and/or dissemination of the Service Materials may be restricted by such laws. You agree not to (nor attempt to) license, modify, copy, publish, sell, transfer, transmit or exploit in any way, any portion of the Service or Service Materials other than (a) Your Content (as defined below), (b) the specific Service Materials set forth in the following paragraph of this Section or (c) as expressly permitted in writing by FLS and, if applicable, the third party owner(s) of such Service Materials. You are solely responsible for obtaining permission from such owner(s).

You may use the following specific Service Materials only as expressly permitted in these Terms of Service:

Share Image. A "Share Image" is a specific in-application image identified by FLS and enabled for sharing as expressly permitted as follows. You may make a Share Image available only to other FLS users and only via FLS's social networking service.
Friend Code. A "Friend Code" is a specific code provided by FLS. Users may share a Friend Code only on Facebook and Twitter, and only as an invitation to join the Service to contacts on those third party services.
Screen Capture. A "Screen Capture" is a screenshot saved by a user via an in-application function. Users may send Screen Captures solely to their contacts on Facebook and Twitter, and only in unmodified form.

5. Ownership
FLS and its licensors own all right, title and interest in and to the Service and the Service Materials, except for Your Content (as defined below) and except as otherwise expressly set forth in these Terms of Service. You shall not acquire any ownership rights whatsoever by downloading Service Materials or by purchasing any Virtual Currency or Virtual Goods (each as defined below).

6. User Content/Your Content
All User Content is the sole responsibility of the person from whom such User Content originated. FLS has no obligation to review, evaluate or otherwise monitor any User Content for any quality, including but not limited to accuracy or legality. FLS makes no warranties or other guarantees with respect to User Content and hereby disclaims any and all such warranties or guarantees.

Your use of the Service is at your own risk. By using the Service, you may be exposed to User Content that is offensive, indecent or otherwise not in line with your expectations. You bear all risks associated with, the use of any User Content available in connection with the Service. FLS shall not be liable in any way for any User Content made available via the Service, including but not limited to any errors or omissions in any such User Content or any loss or damage of any kind resulting from any use of such User Content. You may notify FLS of User Content that you believe violates these Terms of Service, or other inappropriate user behavior, by following the process described on our support page located at https://dragonsoul.zendesk.com/hc/en-us. Notwithstanding the foregoing, FLS reserves the right in its sole discretion to review, monitor, prohibit, edit, delete, disable access to or otherwise make unavailable any User Content (including without limitation Your Content) without notice for any reason or for no reason at any time.

You agree that Your Content is not confidential and will not be returned to you. You warrant that Your Content is original to you and that you own all rights to Your Content, including the right to grant all of the rights and licenses in these Terms of Service without FLS incurring any obligations to any third party or liability arising out of its exercise of such rights and licenses.

You hereby grant to FLS an irrevocable, perpetual, transferable, fully paid-up, royalty-free, worldwide license (including the right to sublicense and assign to third party) and right to copy, reproduce, fix, adapt, modify, create derivative works from, manufacture, commercialize, publish, distribute, sell, license, sublicense, transfer, lease, transmit, publicly display, publicly perform, or provide access to electronically, broadcast, communicate to the public by telecommunication, display, perform, enter into computer memory, and use and practice, in any way, your User Content as well as all modified and derivative works thereof in connection with our provision of the Service, including marketing and promotions of the Service. You also hereby grant to FLS the right to authorize others to exercise any of the rights granted to FLS under these Terms of Service. You further hereby grant to FLS the unconditional, irrevocable right to use and exploit your name, likeness and any other information or material included in any User Content and in connection with any User Content, without any obligation to you. Except as prohibited by law, you waive any rights of attribution and/or any moral rights you may have in Your Content, regardless of whether Your Content is altered or changed in any manner.

FLS does not claim any ownership rights in Your Content and nothing in these Terms of Service is intended to restrict any rights that you may have to use and exploit Your Content. FLS has no obligation to monitor or enforce your intellectual property rights in or to Your Content. FLS has no obligation to accept, display, review, maintain or otherwise exploit any User Content.

7. Virtual Currency and Virtual Goods
The Service may include Virtual Currency and/or Virtual Goods. You have no right, title or interest in or to any such Virtual Goods or Virtual Currency appearing or originating in the Service except for the following: You will have a limited, personal, non-transferable, non-sublicensable, revocable license to use, solely within the Service, Virtual Goods and Virtual Currency that you have earned, purchased or otherwise obtained in a manner authorized by FLS. FLS may manage, regulate, control, modify or eliminate Virtual Currency and/or Virtual Goods at any time, with or without notice. FLS shall have no liability to you or any third party in the event that FLS exercises any such rights.

The transfer of Virtual Currency and Virtual Goods is prohibited except where expressly authorized in the Service. Other than as expressly authorized in the Service, you shall not sell, redeem or otherwise transfer Virtual Currency or Virtual Goods to any person or entity, including but not limited to FLS, another User or any third party.

You understand and agree that all sales of Virtual Currency and Virtual Goods are final and non-refundable, unless FLS (or the applicable third party platform provider) decides in its sole discretion to provide a refund. You agree that in the event that these Terms of Service, your Account, the Service as a whole or the applicable portion of the Service is terminated or discontinued for any reason, you will forfeit all Virtual Currency and Virtual Goods. FLS will have no liability to you in connection with that forfeiture.

8. Restrictions and Rules
As a condition of your use of the Service, and without limiting your other obligations under these Terms of Service, you agree to comply with the restrictions and rules set forth in this Section as well as any additional restrictions or rules (such as application-specific rules) set forth in the Service itself.

You shall not create an Account or access the Service if you are under the age of 16
You shall monitor your Account to restrict use by minors, and you will deny access to children under the age of 16. You accept full responsibility for any unauthorized use of your Account by minors. You are responsible for any use of your credit card or other payment instrument by minors
You shall not rent, lease, sell, trade or otherwise transfer to anyone your Account or any virtual items or virtual currency associated with your Account
You shall not use your Account for any commercial purpose, including but not limited to:
any attempt to raise money for any party or any purpose
advertising of any kind, including chain letters, junk e-mail or repetitive messages (e.g., spam)
You shall not submit false refund requests to FLS or to any third party platform provider
You shall not use your Account to engage in any illegal conduct
You further agree not to:
interfere with or disrupt the Service or servers or networks connected to the Service
interfere with, disrupt or circumvent any feature of the Service that creates security or restricts or enforces limitations on use of or access to the Service
be out of compliance with any requirements or policies of networks connected to the Service
use the Service to violate any applicable law, whether intentionally or unintentionally
use the Service to harm minors (or any other individual) in any way or to reveal any personal information about another individual
defraud FLS or any other person or entity or engage in any "pyramid scheme" or similar activity
impersonate any person or entity or misrepresent your relationship to or affiliation with a person or entity
use the Service to post or otherwise distribute any information that is abusive, threatening, obscene, defamatory, libelous, or racially, sexually, religiously, or otherwise objectionable or offensive
create any Account by automated means or false pretenses or use any other user's Account for any purpose, including to circumvent a suspension or ban, and/or
use or distribute cheats, exploits, automation software, bots, hacks, mods or any unauthorized third party software designed to modify any user's experience with the Service.
You also agree to comply with all applicable laws or other rules regarding online conduct and acceptable User Content, and you agree to comply with all applicable laws or other rules regarding the transmission of technical data exported from the United States or the country in which you reside.

In addition, you agree not to use the Service or any portion of the Service to commit actions that FLS considers, in its sole discretion, to be detrimental in any way to the Service or to any user's enjoyment of the Service.

FLS reserves the right to determine what conduct it considers to be in violation of the rules of use or otherwise outside the intent or spirit of these Terms of Service or the Service itself. FLS reserves the right to take action as a result, which may include terminating your Account and prohibiting you from using the Service.

9. Feedback
"Feedback" means any comments, suggestions or other feedback about, related to or in connection with, the Service that you provide to FLS. You agree that any Feedback shall be the exclusive property of FLS, and you hereby assign to FLS all rights, title and interest in and to all Feedback. You agree that, unless otherwise prohibited by applicable law, FLS may, without any compensation to you, use, sell and otherwise disclose or exploit the Feedback in any way and for any purpose.

10. Changes to the Terms of Service and the Service
FLS may, in its discretion and at any time, modify these Terms of Service and its Privacy Policy by posting the amended terms on the Site. You will be deemed to have accepted such changes by continuing to use the Service. Except as otherwise expressly stated, all amended terms shall automatically be effective immediately when posted.

These Terms of Service may not be otherwise amended except in a writing (not an email) signed by you and FLS. To the extent the Terms of Service or Privacy Policy conflict with any other terms, policy or rules of FLS, the terms contained in these Terms of Service and in the Privacy Policy shall govern.

Except as may be expressly specified otherwise by FLS with respect to paid portions of the Service, FLS reserves the right to add, change, suspend or discontinue the Service, or any aspect or feature of the Service, without notice or liability.

11. Trademarks
"FLS," the FLS logo and other logos and product and service names are trademarks and service marks of, and are owned by, FLS or the FLS Parties. You may not use or display such trademarks in any manner, except as expressly set forth in these Terms of Service. All third party trademarks and service marks appearing on the Service are the property of their respective owners and all rights therein are reserved.

12. Links to Third Party Websites
The Service may contain links to third party websites or resources. FLS may remove any such links at any time for any reason or for no reason. You acknowledge and agree that FLS is not responsible or liable for the availability or accuracy of such websites or resources, or the content, products, or services on or available from such websites or resources. Such links do not imply any endorsement by FLS of, or relationship of FLS with, such websites or resources or the content, products, or services available from such websites or resources. You shall have sole responsibility for and you assume all risk arising from your use of any such websites or resources.

13. Termination
You may terminate your Account at any time and for any reason by following the process described on our support page located at https://dragonsoul.zendesk.com/hc/en-us informing FLS that you wish to terminate your Account. FLS may terminate these Terms of Service, your Account, your access to the Service, the Service itself or any portion of the Service at any time and for any reason. FLS may also notify authorities or take any actions it deems appropriate (including without limitation suspending your Account and your access to the Service), without notice to you if FLS suspects or determines that you may have failed to comply with any provision of these Terms of Service or any other FLS policy or rule, or engaged in actions relating to or in the course of using the Service that may be illegal or cause liability, harm or other disruption for you, FLS, any third party or the Service itself.

As the result of any termination, you will lose your Account and all associated information and data, which may include without limitation your game history, avatars, characters, achievements and Virtual Currency and Virtual Goods. You will not be entitled to and FLS will not be liable to you or any third party for any refund, reimbursement or other liability as a result of any termination (by you or by FLS) permitted under these Terms of Service for any reason. FLS reserves the right in its discretion to refuse to maintain an Account for, or provide the Service to, any individual.

These Terms of Service will remain effective until terminated. You agree that the following sections of these Terms of Service will survive any termination of these Terms of Service, your Account or the Service:

Section 4 (Service Materials); Section 5 (Ownership); Section 6 (User Content/Your Content); Section 7 (Virtual Currency and Virtual Goods); Section 9 (Feedback), Section 11 (Trademarks); Section 12 (Links to Third Party Websites); Section 13 (Termination); Section 14 (Disputes Between You and Other Users), Section 15 (Indemnification); Section 16 (Disclaimers of Warranties); Section 17 (Limitation of Liability); Section 18 (Governing Law and Equitable Remedies); Section 19 (Copyright Issues) and Section 20 (General Provisions).

14. Disputes between You and Other Users
You are solely responsible for your interaction with other users of the Service and other parties that you come in contact with through your use of the Service. FLS reserves the right, but has no obligation, to monitor and manage disputes between you and other users of the Service. You will fully cooperate with FLS to investigate any suspected unlawful, fraudulent or improper activity, including, without limitation, granting FLS access to any password-protected portions of your Account. FLS hereby disclaims any and all liability to you or any third party relating to any dispute between you and other users of the Service.

15. Indemnification
You agree to indemnify, defend and hold the FLS Parties harmless from and against any and all claims, liabilities, damages, losses, costs, expenses, fees (including reasonable attorneys' fees and court costs) due to or arising from information in your Account, any information you (or anyone accessing the Service using your Account) submit, post or transmit through the Service, as well as your (or anyone accessing the Service using your Account):

use of the Service
violation of these Terms of Service, and
violation of any rights of any other person or entity.
FLS may assume the exclusive defense and control of any matter within the scope of this section. You agree to cooperate with FLS and pay all expenses, with respect to any such matter.

16. Disclaimer of Warranties
YOU AGREE THAT THE SERVICE PROVIDED ON AN "AS IS" BASIS WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, WARRANTIES OF TITLE OR IMPLIED WARRANTIES OF NON-INFRINGEMENT, MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. ALL USE OF THE SERVICE IS AT YOUR OWN RISK.

WITHOUT LIMITING THE FOREGOING, NEITHER FLS NOR ITS AFFILIATES (DEFINED BELOW) OR SUBSIDIARIES, NOR ANY OF THEIR EMPLOYEES, DIRECTORS, AGENTS, ATTORNEYS, THIRD-PARTY CONTENT PROVIDERS, DISTRIBUTORS, LICENSEES OR LICENSORS (COLLECTIVELY, THE "FLS PARTIES") WARRANT THAT (A) THE SERVICE WILL MEET YOUR REQUIREMENTS OR (B) THE SERVICE MATERIALS OR USER CONTENT WILL BE VIEWABLE OR ACCESSIBLE OR (C) THE SERVICE WILL BE UNINTERRUPTED, TIMELY, SECURE OR ERROR-FREE. "AFFILIATE" MEANS ANY ENTITY THAT DIRECTLY OR INDIRECTLY CONTROLS, IS UNDER COMMON CONTROL, OR IS CONTROLLED BY FLS, INCLUDING BUT NOT LIMITED TO GREE, INC. AND GREE INTERNATIONAL ENTERTAINMENT, INC.

17. Limitation of Liability
THE FLS PARTIES SHALL NOT BE LIABLE TO YOU FOR ANY INDIRECT, INCIDENTAL, CONSEQUENTIAL, SPECIAL, PUNITIVE OR OTHER SIMILAR DAMAGES, INCLUDING BUT NOT LIMITED TO LOSS OF REVENUES, LOST PROFITS, LOST DATA OR BUSINESS INTERRUPTION OR OTHER INTANGIBLE LOSSES (HOWEVER SUCH LOSSES ARE QUALIFIED), ARISING OUT OF OR RELATING IN ANY WAY TO THESE TERMS OF SERVICE OR THE SERVICE ITSELF, WHETHER BASED ON CONTRACT, TORT OR ANY OTHER LEGAL THEORY, AND WHETHER OR NOT ANY FLS PARTY HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.

THE FLS PARTIES SHALL NOT BE LIABLE TO YOU FOR MORE THAN THE AMOUNT YOU HAVE PAID TO FLS IN ACCORDANCE WITH THESE TERMS OF SERVICE IN THE SIX (6) MONTHS IMMEDIATELY PRECEDING THE DATE ON WHICH YOU FIRST ASSERT A CLAIM. YOU ACKNOWLEDGE AND AGREE THAT IF YOU HAVE NOT PAID ANY AMOUNT TO FLS DURING SUCH TIME PERIOD, YOUR SOLE REMEDY (AND THE FLS PARTIES' EXCLUSIVE LIABILITY) FOR ANY DISPUTE WITH FLS OR THE FLS PARTIES IS TO STOP USING THE SERVICE AND TO CANCEL YOUR ACCOUNT.

Some jurisdictions do not allow the exclusion of certain warranties or the limitation or exclusion of liability for certain types of damages. Accordingly, some of the above disclaimers and limitations may not apply to you. To the extent that FLS or any other FLS Party may not, as a matter of applicable law, disclaim any warranty or limit its liability as set forth herein, the scope of such warranty and the extent of FLS's and any FLS Party's liability shall be the minimum permitted under such applicable law.

18. Governing Law and Equitable Remedies
These Terms of Service and any claim related to these Terms of Service or to the Service itself will be governed by the laws of the State of California without reference to its conflict of laws provisions. The exclusive jurisdiction and venue of any action with respect to the subject matter of these Terms of Service will be the state and federal courts located in San Francisco, California, and each of the parties hereto waives any objection to jurisdiction and venue in such courts. The parties specifically disclaim application of the United Nations Convention on Contracts for the International Sale of Goods.

You acknowledge that your breach of these Terms of Service may result in immediate and irreparable harm to FLS for which remedies at law are inadequate. Accordingly, FLS shall be entitled to seek injunctive or other equitable relief (without the obligation to post any bond) in the event of any breach or anticipatory breach by you of these Terms of Service. You hereby irrevocably waive all rights to seek injunctive or other equitable relief.

19. Copyright Issues
FLS respects the intellectual property of others and asks that users of FLS's games and services do the same. Accordingly, without limiting any other provision of these Terms of Service, you may not upload, post, send or transmit to or through the Service any materials that violate third party intellectual property rights.

If you believe that any copyrighted work owned by you has been copied or used in such a manner so as to constitute copyright infringement in connection with material or data provided through the Service, you may notify FLS's designated copyright agent for receiving claims of copyright infringement as follows:

Fantasy Legend Studios, Inc.  
185 Berry Street, Suite 590  
San Francisco, CA 94107 
Attention: Copyright Agent 

Email: copyright@fantasylegendstudios.com

Please note, however, that as referred to in more detail in FLS's Copyright Policy, certain legal requirements and restrictions apply with respect to such notices. You are encouraged to familiarize yourself with such requirements and restrictions before providing to us any notices of alleged copyright infringement.

20. General Provisions
a. You agree to be responsible for obtaining and maintaining all mobile devices and any other equipment needed for access to and use of the Service, and all charges related thereto.

b. Upon FLS's request, you will provide to FLS any documentation, releases or other materials necessary to verify your compliance with these Terms of Service.

c. FLS currently operates and controls the Service from the United States. The information and materials provided on the Service are not intended for distribution to or use by any person or entity in any jurisdiction where such distribution or use would be contrary to law or regulation or which would subject FLS to any registration requirement within such jurisdiction or country.

d. FLS's failure to exercise or enforce any right or provision of these Terms of Service shall not constitute a waiver of such right or provision. No waiver by either party of any breach or default hereunder shall be deemed to be a waiver of any preceding or subsequent breach or default.

e. The parties agree that if any provision of these Terms of Service is found by a court of competent jurisdiction to be invalid, the court should give effect to the parties' intentions as reflected in the provision and the other provisions of these Terms of Service shall remain in full force and effect.

f. You shall not assign these Terms of Service to another person or entity without FLS's prior written consent.

g. FLS shall not be liable for any delay or failure to perform resulting from causes outside its reasonable control, including without limitation any failure to perform hereunder due to acts of God, war, acts of civil or military authorities, terrorism, riots, embargoes, strikes, or energy shortages.

h. You agree that these Terms of Service will not be construed against FLS by virtue of having drafted them. You hereby waive any and all defenses you may have based on the electronic form of these Terms of Service and the lack of a requirement that these Terms of Service must be signed.

i. These Terms of Service, Privacy Policy, Copyright Policy and any additional policies and rules published by FLS, constitute the entire agreement between you and FLS with respect to your use of the Service and any other subject matter of these Terms of Service. Such terms supersede all prior understandings or agreements between you and FLS, whether electronic, oral or written, or whether established by custom or precedent.

Contacting FLS
To contact FLS, please follow the process described on our support page, located at https://dragonsoul.zendesk.com/hc/en-us.
`
- `public static final int GOOGLE_VERSION = 2`
- `public static final String IOS_BODY = Effective Date: November 18, 2016
Revised Date: May 25th, 2018

These Terms of Service ("Terms of Service") are an agreement between you and Fantasy Legend Studios, Inc. ("FLS"). FLS's Privacy Policy, which is currently located at http://dragonsoulgame.com/privacy_policy (the "Privacy Policy"), and FLS's Copyright Policy, which is currently located at http://dragonsoulgame.com/copyright_policy (the "Copyright Policy"), are hereby incorporated into these Terms of Service.

Please carefully read these Terms of Service.

By registering for an Account or otherwise using the Service (as defined below), you represent that:

you are age 16 or older; and
you understand and agree to these Terms of Service, and, if you are between the ages of 16 and 18, your legal guardian has reviewed and understands and agrees to these Terms of Service.
BY INSTALLING, USING OR OTHERWISE ACCESSING THE SERVICE, YOU AGREE TO THESE TERMS OF SERVICE. IF YOU DO NOT AGREE TO THESE TERMS OF SERVICE, PLEASE DO NOT INSTALL, USE OR OTHERWISE ACCESS THE SERVICE. USE OF THE SERVICE IS VOID WHERE PROHIBITED.

1. Certain Definitions
A "Device" means any mobile or wireless computing device, for example a smartphone, that may be used to access the Service.
The "Service" means (i) the websites located at gree.net, gree-support.net and gree-corp.com (the "Site"), including any services, features and content accessible or downloadable from the Site, and (ii) any other FLS application, service or product licensed, downloaded or otherwise accessed by you through third party websites or sources.
"Service Materials" means all information and materials that are part of the Service, including without limitation the following: any and all copyrightable material, including but not limited to software; the "look and feel" of the Service or any portion of the Service; the compilation and arrangement of the components of the Service or any portion of the Service; pictures or other graphics or images; text; audio or video; advertising copy; data; logos; domain names; trademarks, service marks or trade names; and User Content (as defined below).
"User Content" means content and materials (including without limitation text, writings, photographs, graphics, images, comments, personally identifiable information, etc.), which the Service may invite or enable you and other users to create, submit, post, display, transmit, perform, publish or distribute communications, including by making the foregoing available to FLS and to other users of the Service, whether via e-mail or through online forums, message boards, messaging services, blogs or other functionality of the Service or portions of the Service.
"Virtual Currency" means virtual coins, points or similar items that may be earned or obtained through the Service or otherwise purchased by you for legal tender or actual currency, subject to applicable law.
"Virtual Goods" means virtual digital items, such as commodities, abilities or other goods that may be earned or obtained through the Service or otherwise purchased by you for legal tender or actual currency, or for Virtual Currency, subject to applicable law.
"Your Content" means User Content that you make available in connection with the Service.
2. License Grant and Restrictions
FLS grants to you a limited, revocable, non-exclusive, non-sublicensable, non-transferable license to use and display the following: (a) the portions of the Service that are accessible from the Site without payment or made accessible from third party websites or sources via FLS's authorization without payment, and (b) such other portions of the Service accessible on a "for-payment" basis, provided that you have paid the applicable fees and met the applicable conditions. The foregoing license is (i) solely for your personal, non- commercial use; (ii) solely for a single computer to access the Site and solely on a Device to access applications; and (iii) subject to your compliance with these Terms of Service.

You agree not to do or attempt to do any of the following:

copy, adapt, modify, prepare derivative works based upon, distribute, license, sell, transfer, publicly display, publicly perform, transmit, broadcast, stream or otherwise exploit the Service or any portion of the Service, except as expressly permitted in these Terms of Service; or
use the Service for any use or purpose other than as expressly permitted by these Terms of Service.
Neither FLS nor any of the FLS Parties (as defined below) grant to you any licenses or rights except for the licenses and rights expressly granted in these Terms of Service. FLS and its licensors hereby reserve all rights not expressly granted by these Terms of Service. No license is granted hereunder by estoppel, implication or otherwise.

3. Account Registration and Confidentiality
By registering through the Service to play FLS games and access FLS services, we will establish an internal account specific to you as a user ("Account"). As part of this registration process, you may be requested to provide information about yourself in order to use the Service. You agree to provide and maintain true, accurate, complete and current information as requested by the Service. If you provide any information that is untrue, inaccurate, incomplete or not current, FLS has the right to suspend or terminate your Account and may prohibit you from using the Service at any time.

You are responsible for maintaining the confidentiality of your Account. You agree to notify FLS immediately of any unauthorized use of your Account or any other breach of security related to your Account. You are responsible for all activities that occur under your Account whether or not you have knowledge of those activities.

4. Service Materials
The Service Materials are protected by applicable laws in both the United States and other jurisdictions, including but not limited to intellectual property laws. Any use, copying and/or dissemination of the Service Materials may be restricted by such laws. You agree not to (nor attempt to) license, modify, copy, publish, sell, transfer, transmit or exploit in any way, any portion of the Service or Service Materials other than (a) Your Content (as defined below), (b) the specific Service Materials set forth in the following paragraph of this Section or (c) as expressly permitted in writing by FLS and, if applicable, the third party owner(s) of such Service Materials. You are solely responsible for obtaining permission from such owner(s).

You may use the following specific Service Materials only as expressly permitted in these Terms of Service:

Share Image. A "Share Image" is a specific in-application image identified by FLS and enabled for sharing as expressly permitted as follows. You may make a Share Image available only to other FLS users and only via FLS's social networking service.
Friend Code. A "Friend Code" is a specific code provided by FLS. Users may share a Friend Code only on Facebook and Twitter, and only as an invitation to join the Service to contacts on those third party services.
Screen Capture. A "Screen Capture" is a screenshot saved by a user via an in-application function. Users may send Screen Captures solely to their contacts on Facebook and Twitter, and only in unmodified form.

5. Ownership
FLS and its licensors own all right, title and interest in and to the Service and the Service Materials, except for Your Content (as defined below) and except as otherwise expressly set forth in these Terms of Service. You shall not acquire any ownership rights whatsoever by downloading Service Materials or by purchasing any Virtual Currency or Virtual Goods (each as defined below).

6. User Content/Your Content
All User Content is the sole responsibility of the person from whom such User Content originated. FLS has no obligation to review, evaluate or otherwise monitor any User Content for any quality, including but not limited to accuracy or legality. FLS makes no warranties or other guarantees with respect to User Content and hereby disclaims any and all such warranties or guarantees.

Your use of the Service is at your own risk. By using the Service, you may be exposed to User Content that is offensive, indecent or otherwise not in line with your expectations. You bear all risks associated with, the use of any User Content available in connection with the Service. FLS shall not be liable in any way for any User Content made available via the Service, including but not limited to any errors or omissions in any such User Content or any loss or damage of any kind resulting from any use of such User Content. You may notify FLS of User Content that you believe violates these Terms of Service, or other inappropriate user behavior, by following the process described on our support page located at https://dragonsoul.zendesk.com/hc/en-us. Notwithstanding the foregoing, FLS reserves the right in its sole discretion to review, monitor, prohibit, edit, delete, disable access to or otherwise make unavailable any User Content (including without limitation Your Content) without notice for any reason or for no reason at any time.

You agree that Your Content is not confidential and will not be returned to you. You warrant that Your Content is original to you and that you own all rights to Your Content, including the right to grant all of the rights and licenses in these Terms of Service without FLS incurring any obligations to any third party or liability arising out of its exercise of such rights and licenses.

You hereby grant to FLS an irrevocable, perpetual, transferable, fully paid-up, royalty-free, worldwide license (including the right to sublicense and assign to third party) and right to copy, reproduce, fix, adapt, modify, create derivative works from, manufacture, commercialize, publish, distribute, sell, license, sublicense, transfer, lease, transmit, publicly display, publicly perform, or provide access to electronically, broadcast, communicate to the public by telecommunication, display, perform, enter into computer memory, and use and practice, in any way, your User Content as well as all modified and derivative works thereof in connection with our provision of the Service, including marketing and promotions of the Service. You also hereby grant to FLS the right to authorize others to exercise any of the rights granted to FLS under these Terms of Service. You further hereby grant to FLS the unconditional, irrevocable right to use and exploit your name, likeness and any other information or material included in any User Content and in connection with any User Content, without any obligation to you. Except as prohibited by law, you waive any rights of attribution and/or any moral rights you may have in Your Content, regardless of whether Your Content is altered or changed in any manner.

FLS does not claim any ownership rights in Your Content and nothing in these Terms of Service is intended to restrict any rights that you may have to use and exploit Your Content. FLS has no obligation to monitor or enforce your intellectual property rights in or to Your Content. FLS has no obligation to accept, display, review, maintain or otherwise exploit any User Content.

7. Virtual Currency and Virtual Goods
The Service may include Virtual Currency and/or Virtual Goods. You have no right, title or interest in or to any such Virtual Goods or Virtual Currency appearing or originating in the Service except for the following: You will have a limited, personal, non-transferable, non-sublicensable, revocable license to use, solely within the Service, Virtual Goods and Virtual Currency that you have earned, purchased or otherwise obtained in a manner authorized by FLS. FLS may manage, regulate, control, modify or eliminate Virtual Currency and/or Virtual Goods at any time, with or without notice. FLS shall have no liability to you or any third party in the event that FLS exercises any such rights.

The transfer of Virtual Currency and Virtual Goods is prohibited except where expressly authorized in the Service. Other than as expressly authorized in the Service, you shall not sell, redeem or otherwise transfer Virtual Currency or Virtual Goods to any person or entity, including but not limited to FLS, another User or any third party.

You understand and agree that all sales of Virtual Currency and Virtual Goods are final and non-refundable, unless FLS (or the applicable third party platform provider) decides in its sole discretion to provide a refund. You agree that in the event that these Terms of Service, your Account, the Service as a whole or the applicable portion of the Service is terminated or discontinued for any reason, you will forfeit all Virtual Currency and Virtual Goods. FLS will have no liability to you in connection with that forfeiture.

8. Restrictions and Rules
As a condition of your use of the Service, and without limiting your other obligations under these Terms of Service, you agree to comply with the restrictions and rules set forth in this Section as well as any additional restrictions or rules (such as application-specific rules) set forth in the Service itself.

You shall not create an Account or access the Service if you are under the age of 16
You shall monitor your Account to restrict use by minors, and you will deny access to children under the age of 16. You accept full responsibility for any unauthorized use of your Account by minors. You are responsible for any use of your credit card or other payment instrument by minors
You shall not rent, lease, sell, trade or otherwise transfer to anyone your Account or any virtual items or virtual currency associated with your Account
You shall not use your Account for any commercial purpose, including but not limited to:
any attempt to raise money for any party or any purpose
advertising of any kind, including chain letters, junk e-mail or repetitive messages (e.g., spam)
You shall not submit false refund requests to FLS or to any third party platform provider
You shall not use your Account to engage in any illegal conduct
You further agree not to:
interfere with or disrupt the Service or servers or networks connected to the Service
interfere with, disrupt or circumvent any feature of the Service that creates security or restricts or enforces limitations on use of or access to the Service
be out of compliance with any requirements or policies of networks connected to the Service
use the Service to violate any applicable law, whether intentionally or unintentionally
use the Service to harm minors (or any other individual) in any way or to reveal any personal information about another individual
defraud FLS or any other person or entity or engage in any "pyramid scheme" or similar activity
impersonate any person or entity or misrepresent your relationship to or affiliation with a person or entity
use the Service to post or otherwise distribute any information that is abusive, threatening, obscene, defamatory, libelous, or racially, sexually, religiously, or otherwise objectionable or offensive
create any Account by automated means or false pretenses or use any other user's Account for any purpose, including to circumvent a suspension or ban, and/or
use or distribute cheats, exploits, automation software, bots, hacks, mods or any unauthorized third party software designed to modify any user's experience with the Service.
You also agree to comply with all applicable laws or other rules regarding online conduct and acceptable User Content, and you agree to comply with all applicable laws or other rules regarding the transmission of technical data exported from the United States or the country in which you reside.

In addition, you agree not to use the Service or any portion of the Service to commit actions that FLS considers, in its sole discretion, to be detrimental in any way to the Service or to any user's enjoyment of the Service.

FLS reserves the right to determine what conduct it considers to be in violation of the rules of use or otherwise outside the intent or spirit of these Terms of Service or the Service itself. FLS reserves the right to take action as a result, which may include terminating your Account and prohibiting you from using the Service.

9. Feedback
"Feedback" means any comments, suggestions or other feedback about, related to or in connection with, the Service that you provide to FLS. You agree that any Feedback shall be the exclusive property of FLS, and you hereby assign to FLS all rights, title and interest in and to all Feedback. You agree that, unless otherwise prohibited by applicable law, FLS may, without any compensation to you, use, sell and otherwise disclose or exploit the Feedback in any way and for any purpose.

10. Changes to the Terms of Service and the Service
FLS may, in its discretion and at any time, modify these Terms of Service and its Privacy Policy by posting the amended terms on the Site. You will be deemed to have accepted such changes by continuing to use the Service. Except as otherwise expressly stated, all amended terms shall automatically be effective immediately when posted.

These Terms of Service may not be otherwise amended except in a writing (not an email) signed by you and FLS. To the extent the Terms of Service or Privacy Policy conflict with any other terms, policy or rules of FLS, the terms contained in these Terms of Service and in the Privacy Policy shall govern.

Except as may be expressly specified otherwise by FLS with respect to paid portions of the Service, FLS reserves the right to add, change, suspend or discontinue the Service, or any aspect or feature of the Service, without notice or liability.

11. Trademarks
"FLS," the FLS logo and other logos and product and service names are trademarks and service marks of, and are owned by, FLS or the FLS Parties. You may not use or display such trademarks in any manner, except as expressly set forth in these Terms of Service. All third party trademarks and service marks appearing on the Service are the property of their respective owners and all rights therein are reserved.

12. Links to Third Party Websites
The Service may contain links to third party websites or resources. FLS may remove any such links at any time for any reason or for no reason. You acknowledge and agree that FLS is not responsible or liable for the availability or accuracy of such websites or resources, or the content, products, or services on or available from such websites or resources. Such links do not imply any endorsement by FLS of, or relationship of FLS with, such websites or resources or the content, products, or services available from such websites or resources. You shall have sole responsibility for and you assume all risk arising from your use of any such websites or resources.

13. Termination
You may terminate your Account at any time and for any reason by following the process described on our support page located at https://dragonsoul.zendesk.com/hc/en-us informing FLS that you wish to terminate your Account. FLS may terminate these Terms of Service, your Account, your access to the Service, the Service itself or any portion of the Service at any time and for any reason. FLS may also notify authorities or take any actions it deems appropriate (including without limitation suspending your Account and your access to the Service), without notice to you if FLS suspects or determines that you may have failed to comply with any provision of these Terms of Service or any other FLS policy or rule, or engaged in actions relating to or in the course of using the Service that may be illegal or cause liability, harm or other disruption for you, FLS, any third party or the Service itself.

As the result of any termination, you will lose your Account and all associated information and data, which may include without limitation your game history, avatars, characters, achievements and Virtual Currency and Virtual Goods. You will not be entitled to and FLS will not be liable to you or any third party for any refund, reimbursement or other liability as a result of any termination (by you or by FLS) permitted under these Terms of Service for any reason. FLS reserves the right in its discretion to refuse to maintain an Account for, or provide the Service to, any individual.

These Terms of Service will remain effective until terminated. You agree that the following sections of these Terms of Service will survive any termination of these Terms of Service, your Account or the Service:

Section 4 (Service Materials); Section 5 (Ownership); Section 6 (User Content/Your Content); Section 7 (Virtual Currency and Virtual Goods); Section 9 (Feedback), Section 11 (Trademarks); Section 12 (Links to Third Party Websites); Section 13 (Termination); Section 14 (Disputes Between You and Other Users), Section 15 (Indemnification); Section 16 (Disclaimers of Warranties); Section 17 (Limitation of Liability); Section 18 (Governing Law and Equitable Remedies); Section 19 (Copyright Issues) and Section 20 (General Provisions).

14. Disputes between You and Other Users
You are solely responsible for your interaction with other users of the Service and other parties that you come in contact with through your use of the Service. FLS reserves the right, but has no obligation, to monitor and manage disputes between you and other users of the Service. You will fully cooperate with FLS to investigate any suspected unlawful, fraudulent or improper activity, including, without limitation, granting FLS access to any password-protected portions of your Account. FLS hereby disclaims any and all liability to you or any third party relating to any dispute between you and other users of the Service.

15. Indemnification
You agree to indemnify, defend and hold the FLS Parties harmless from and against any and all claims, liabilities, damages, losses, costs, expenses, fees (including reasonable attorneys' fees and court costs) due to or arising from information in your Account, any information you (or anyone accessing the Service using your Account) submit, post or transmit through the Service, as well as your (or anyone accessing the Service using your Account):

use of the Service
violation of these Terms of Service, and
violation of any rights of any other person or entity.
FLS may assume the exclusive defense and control of any matter within the scope of this section. You agree to cooperate with FLS and pay all expenses, with respect to any such matter.

16. Disclaimer of Warranties
YOU AGREE THAT THE SERVICE PROVIDED ON AN "AS IS" BASIS WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, WARRANTIES OF TITLE OR IMPLIED WARRANTIES OF NON-INFRINGEMENT, MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. ALL USE OF THE SERVICE IS AT YOUR OWN RISK.

WITHOUT LIMITING THE FOREGOING, NEITHER FLS NOR ITS AFFILIATES (DEFINED BELOW) OR SUBSIDIARIES, NOR ANY OF THEIR EMPLOYEES, DIRECTORS, AGENTS, ATTORNEYS, THIRD-PARTY CONTENT PROVIDERS, DISTRIBUTORS, LICENSEES OR LICENSORS (COLLECTIVELY, THE "FLS PARTIES") WARRANT THAT (A) THE SERVICE WILL MEET YOUR REQUIREMENTS OR (B) THE SERVICE MATERIALS OR USER CONTENT WILL BE VIEWABLE OR ACCESSIBLE OR (C) THE SERVICE WILL BE UNINTERRUPTED, TIMELY, SECURE OR ERROR-FREE. "AFFILIATE" MEANS ANY ENTITY THAT DIRECTLY OR INDIRECTLY CONTROLS, IS UNDER COMMON CONTROL, OR IS CONTROLLED BY FLS, INCLUDING BUT NOT LIMITED TO GREE, INC. AND GREE INTERNATIONAL ENTERTAINMENT, INC.

17. Limitation of Liability
THE FLS PARTIES SHALL NOT BE LIABLE TO YOU FOR ANY INDIRECT, INCIDENTAL, CONSEQUENTIAL, SPECIAL, PUNITIVE OR OTHER SIMILAR DAMAGES, INCLUDING BUT NOT LIMITED TO LOSS OF REVENUES, LOST PROFITS, LOST DATA OR BUSINESS INTERRUPTION OR OTHER INTANGIBLE LOSSES (HOWEVER SUCH LOSSES ARE QUALIFIED), ARISING OUT OF OR RELATING IN ANY WAY TO THESE TERMS OF SERVICE OR THE SERVICE ITSELF, WHETHER BASED ON CONTRACT, TORT OR ANY OTHER LEGAL THEORY, AND WHETHER OR NOT ANY FLS PARTY HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.

THE FLS PARTIES SHALL NOT BE LIABLE TO YOU FOR MORE THAN THE AMOUNT YOU HAVE PAID TO FLS IN ACCORDANCE WITH THESE TERMS OF SERVICE IN THE SIX (6) MONTHS IMMEDIATELY PRECEDING THE DATE ON WHICH YOU FIRST ASSERT A CLAIM. YOU ACKNOWLEDGE AND AGREE THAT IF YOU HAVE NOT PAID ANY AMOUNT TO FLS DURING SUCH TIME PERIOD, YOUR SOLE REMEDY (AND THE FLS PARTIES' EXCLUSIVE LIABILITY) FOR ANY DISPUTE WITH FLS OR THE FLS PARTIES IS TO STOP USING THE SERVICE AND TO CANCEL YOUR ACCOUNT.

Some jurisdictions do not allow the exclusion of certain warranties or the limitation or exclusion of liability for certain types of damages. Accordingly, some of the above disclaimers and limitations may not apply to you. To the extent that FLS or any other FLS Party may not, as a matter of applicable law, disclaim any warranty or limit its liability as set forth herein, the scope of such warranty and the extent of FLS's and any FLS Party's liability shall be the minimum permitted under such applicable law.

18. Governing Law and Equitable Remedies
These Terms of Service and any claim related to these Terms of Service or to the Service itself will be governed by the laws of the State of California without reference to its conflict of laws provisions. The exclusive jurisdiction and venue of any action with respect to the subject matter of these Terms of Service will be the state and federal courts located in San Francisco, California, and each of the parties hereto waives any objection to jurisdiction and venue in such courts. The parties specifically disclaim application of the United Nations Convention on Contracts for the International Sale of Goods.

You acknowledge that your breach of these Terms of Service may result in immediate and irreparable harm to FLS for which remedies at law are inadequate. Accordingly, FLS shall be entitled to seek injunctive or other equitable relief (without the obligation to post any bond) in the event of any breach or anticipatory breach by you of these Terms of Service. You hereby irrevocably waive all rights to seek injunctive or other equitable relief.

19. Copyright Issues
FLS respects the intellectual property of others and asks that users of FLS's games and services do the same. Accordingly, without limiting any other provision of these Terms of Service, you may not upload, post, send or transmit to or through the Service any materials that violate third party intellectual property rights.

If you believe that any copyrighted work owned by you has been copied or used in such a manner so as to constitute copyright infringement in connection with material or data provided through the Service, you may notify FLS's designated copyright agent for receiving claims of copyright infringement as follows:

Fantasy Legend Studios, Inc.  
185 Berry Street, Suite 590  
San Francisco, CA 94107 
Attention: Copyright Agent 

Email: copyright@fantasylegendstudios.com

Please note, however, that as referred to in more detail in FLS's Copyright Policy, certain legal requirements and restrictions apply with respect to such notices. You are encouraged to familiarize yourself with such requirements and restrictions before providing to us any notices of alleged copyright infringement.

20. General Provisions
a. You agree to be responsible for obtaining and maintaining all mobile devices and any other equipment needed for access to and use of the Service, and all charges related thereto.

b. Upon FLS's request, you will provide to FLS any documentation, releases or other materials necessary to verify your compliance with these Terms of Service.

c. FLS currently operates and controls the Service from the United States. The information and materials provided on the Service are not intended for distribution to or use by any person or entity in any jurisdiction where such distribution or use would be contrary to law or regulation or which would subject FLS to any registration requirement within such jurisdiction or country.

d. FLS's failure to exercise or enforce any right or provision of these Terms of Service shall not constitute a waiver of such right or provision. No waiver by either party of any breach or default hereunder shall be deemed to be a waiver of any preceding or subsequent breach or default.

e. The parties agree that if any provision of these Terms of Service is found by a court of competent jurisdiction to be invalid, the court should give effect to the parties' intentions as reflected in the provision and the other provisions of these Terms of Service shall remain in full force and effect.

f. You shall not assign these Terms of Service to another person or entity without FLS's prior written consent.

g. FLS shall not be liable for any delay or failure to perform resulting from causes outside its reasonable control, including without limitation any failure to perform hereunder due to acts of God, war, acts of civil or military authorities, terrorism, riots, embargoes, strikes, or energy shortages.

h. You agree that these Terms of Service will not be construed against FLS by virtue of having drafted them. You hereby waive any and all defenses you may have based on the electronic form of these Terms of Service and the lack of a requirement that these Terms of Service must be signed.

i. These Terms of Service, Privacy Policy, Copyright Policy and any additional policies and rules published by FLS, constitute the entire agreement between you and FLS with respect to your use of the Service and any other subject matter of these Terms of Service. Such terms supersede all prior understandings or agreements between you and FLS, whether electronic, oral or written, or whether established by custom or precedent.

Contacting FLS
To contact FLS, please follow the process described on our support page, located at https://dragonsoul.zendesk.com/hc/en-us.
`
- `public static final int IOS_VERSION = 2`
- `public static final String TITLE = Terms of service`

### TestDevices (class)
`com.perblue.rpg.util.TestDevices`

**Fields (36):**
- `public static final Map CAPTURE_1280x720`
- `public static final Map CAPTURE_1920x1080`
- `public static final Map CAPTURE_2560x1440`
- `public static final String DENSITY = density`
- `public static final Map DESKTOP`
- `public static final Map DROID3`
- `public static final Map DROID_RAZR`
- `public static final Map GALAXY_NEXUS`
- `public static final Map GALAXY_NOTE_10`
- `public static final String HEIGHT = height`
- `public static final Map HTC_ONE_X`
- `public static final Map IPAD_2`
- `public static final Map IPAD_3`
- `public static final Map IPAD_MINI`
- `public static final Map IPHONE_4`
- `public static final Map IPHONE_5`
- `public static final Map IPHONE_6`
- `public static final String IS_IOS = iOSClient`
- `public static final Map KINDLE_FIRE`
- `public static final Map MOTO_X`
- `public static final Map NEXUS_10`
- `public static final Map NEXUS_7`
- `public static final Map NEXUS_7_V2`
- `public static final String PPIX = ppix`
- `public static final String PPIY = ppiy`
- `public static final Map Q8H_TABLET`
- `public static final Map RCA_7_TABLET`
- `public static final Map S2`
- `public static final Map S3`
- `public static final Map S4`
- `public static final Map S5`
- `public static final String TARGET_DENSITY = targetDensity`
- `public static final Map TEMP_DEVICE`
- `public static final String UNITS_PER_PIXEL = units_per_pixel`
- `public static final String WIDTH = width`
- `public static final Map devices`

### TimeType (enum)
`com.perblue.rpg.util.TimeType`
extends `java.lang.Enum`

**Fields (5):**
- `private static final TimeType[] $VALUES`
- `public static final TimeType DAYS`
- `public static final TimeType HOURS`
- `public static final TimeType MINUTES`
- `public static final TimeType SECONDS`

**Methods (2):**
- `TimeType[] values()`
- `TimeType valueOf(String)`

**Constants (4):**
- DAYS
- HOURS
- MINUTES
- SECONDS

### TimeUtil (class)
`com.perblue.rpg.util.TimeUtil`

**Fields (20):**
- `static final boolean $assertionsDisabled = true`
- `private static long CLOCK_OFFSET`
- `private static final String DATE_FORMAT_STRING = MM/dd/yyyy`
- `private static final DateFormat DATE_TIME_FORMAT`
- `private static final String DATE_TIME_FORMAT_STRING = MM/dd/yyyy HH:mm:ss`
- `private static long ELAPSED_DIFF`
- `private static final DateFormat GUILD_TIME_FORMAT`
- `private static final Log LOG`
- `public static final long MILLIS_PER_DAY = 86400000`
- `public static final long MILLIS_PER_HOUR = 3600000`
- `public static final long MILLIS_PER_MINUTE = 60000`
- `public static final long MILLIS_PER_MONTH = 2592000000`
- `public static final long MILLIS_PER_WEEK = 604800000`
- `private static final String RESET_TIME_EXTENSION =  05:00:00`
- `private static final TimeZone SERVER_TIME_ZONE`
- `private static final long SERVER_TIME_ZONE_OFFSET = -21600000`
- `private static final DateFormat SHORT_12H_TIME_FORMAT`
- `private static final DateFormat SHORT_24H_TIME_FORMAT`
- `private static int cachedDay`
- `private static long cachedDayTime`

**Methods (37):**
- `int getUserDailyActivityDayOfWeek(IUser)`
- `long calculateNextServerTime(Iterable)`
- `long getServerTimeZoneOffset()`
- `long computeUserServerTimeForDay(IUser, long)`
- `long calculateNextClientTime(Iterable, IUser)`
- `long getUserTimeZoneOffset(IUser)`
- `long calculateNextTime(Iterable, long, long)`
- `boolean languageUses24H(Language)`
- `String getDisplayDay(int)`
- `String getDisplayDays(int[])`
- `String getGuildTime(String)`
- `int getServerWeek(long)`
- `Calendar getUserDayCalendar(IUser)`
- `long convertToClientTime(long)`
- `String getClientTimeString(IUser, long)`
- `long getDefaultTimeZoneOffset()`
- `String getShortClientServerDate(IUser, long)`
- `String getShortClientTimeString(IUser, long)`
- `void setShortDateFormatTimeZone(TimeZone)`
- `long initClock(long, long)`
- `boolean isSameDay(long, long)`
- `long parseDateTime(String)`
- `long timeSinceMidnight(long)`
- `long timeUntilMidnight()`
- `void updateClock(long)`
- `long convertToServerTime(long)`
- `void convertToServerTime(Date)`
- `long computeTimeForDay(long, long, long)`
- `long computeTimeForDay(long)`
- `long getUserServerTime(IUser)`
- `long getUserServerTime(IUser, long)`
- `TimeZone getServerTimeZone()`
- `long reverseUserServerTime(IUser, long)`
- `boolean isSameUserDay(IUser, long, long)`
- `boolean isSameUserDay(IUser, long, long, long)`
- `long serverTimeNow()`
- `long getTimeZoneOffset(TimeZone)`

### com.perblue.rpg.util.UIHelper [LOAD ERROR: Could not initialize class com.perblue.rpg.util.UIHelper]

### UserPref (enum)
`com.perblue.rpg.util.UserPref`
extends `java.lang.Enum`

**Fields (45):**
- `private static final UserPref[] $VALUES`
- `public static final UserPref ALL_PUSH_NOTIFICATIONS`
- `public static final UserPref BOSS_PIT_COLOSSUS_DIFFICULTY`
- `public static final UserPref BOSS_PIT_PLANT_DIFFICULTY`
- `public static final UserPref BOSS_PIT_WIZARD_DIFFICULTY`
- `public static final UserPref CHALLENGES_DRAGONS_DIFFICULTY`
- `public static final UserPref CHALLENGES_MAGIC_DIFFICULTY`
- `public static final UserPref CHALLENGES_PHYSICAL_DIFFICULTY`
- `public static final UserPref CHAT_DROPDOWN_OPEN`
- `public static final UserPref GLOBAL_CHAT_PREVIEW_ON`
- `public static final UserPref GLOBAL_PRIVATE_CHAT`
- `public static final UserPref GUILD_CHAT_PREVIEW_ON`
- `public static final UserPref GUILD_PRIVATE_CHAT`
- `public static final UserPref GUILD_WALL_CHAT_PREVIEW_ON`
- `public static final UserPref HERO_SORT`
- `public static final UserPref MOUNTAIN_CAVES_DIFFICULTY`
- `public static final UserPref MOUNTAIN_SUMMIT_DIFFICULTY`
- `public static final UserPref MUSIC_ENABLED`
- `public static final UserPref MUSIC_LEVEL`
- `public static final UserPref NOTIF_CRYPT_RAID_ENDING`
- `public static final UserPref NOTIF_FIGHT_PIT_DEMOTION_WARNING`
- `public static final UserPref NOTIF_FIGHT_PIT_PROMOTION`
- `public static final UserPref NOTIF_FIGHT_PIT_REWARDS_WARNING`
- `public static final UserPref NOTIF_FREE_STAMINA`
- `public static final UserPref NOTIF_GUILD_CHAT`
- `public static final UserPref NOTIF_GUILD_WALL_CHAT`
- `public static final UserPref NOTIF_GUILD_WAR`
- `public static final UserPref NOTIF_POWER_POINTS_FULL`
- `public static final UserPref NOTIF_PRIVATE_CHAT`
- `public static final UserPref NOTIF_SERVER_UPDATES`
- `public static final UserPref NOTIF_STAMINA_FULL`
- `public static final UserPref NOTIF_STORE_RESTOCK`
- `public static final UserPref NOTIF_TITAN_TEMPLE_INVITE`
- `public static final UserPref PERSONAL_MESSAGE_PREVIEW_ON`
- `public static final UserPref RUNE_OFFERING_TRAY_SHOW_SETS`
- `public static final UserPref SOUND_ENABLED`
- `public static final UserPref SOUND_LEVEL`
- `public static final String USER_PREFS_KEY = UserPrefs`
- `public static final UserPref VIP_CHAT_PREVIEW_ON`
- `private static m prefs`
- `private static Map userPrefs`
- `private int defaultInt`
- `private boolean defaultVal`
- `private boolean isBoolean`
- `private boolean userSpecific`

**Methods (19):**
- `ModeDifficulty getDifficulty(GameMode, UnitType)`
- `UserPref getPrefForChatRoom(ChatRoomType)`
- `UserPref getPrefForNotif(NotificationType)`
- `void setDifficulty(GameMode, ModeDifficulty, UnitType)`
- `int getDefaultInt()`
- `UserPref getPrefForModeDifficulty(GameMode, UnitType)`
- `HeroSort getPreferredHeroSort()`
- `void setPreferredHeroSort(HeroSort)`
- `void initializeUser(long, m, Map)`
- `boolean get()`
- `UserPref[] values()`
- `int getInt()`
- `UserPref valueOf(String)`
- `boolean getDefault()`
- `void initialize(m)`
- `void set(int)`
- `void set(boolean)`
- `void set(boolean, boolean)`
- `void set(int, boolean)`

**Constants (37):**
- MUSIC_ENABLED
- SOUND_ENABLED
- NOTIF_FREE_STAMINA
- NOTIF_STORE_RESTOCK
- NOTIF_STAMINA_FULL
- NOTIF_POWER_POINTS_FULL
- NOTIF_FIGHT_PIT_REWARDS_WARNING
- NOTIF_FIGHT_PIT_PROMOTION
- NOTIF_FIGHT_PIT_DEMOTION_WARNING
- NOTIF_CRYPT_RAID_ENDING
- GLOBAL_CHAT_PREVIEW_ON
- GUILD_CHAT_PREVIEW_ON
- ALL_PUSH_NOTIFICATIONS
- MUSIC_LEVEL
- SOUND_LEVEL
- VIP_CHAT_PREVIEW_ON
- NOTIF_TITAN_TEMPLE_INVITE
- NOTIF_SERVER_UPDATES
- NOTIF_GUILD_WAR
- NOTIF_GUILD_CHAT
- GUILD_WALL_CHAT_PREVIEW_ON
- PERSONAL_MESSAGE_PREVIEW_ON
- GUILD_PRIVATE_CHAT
- GLOBAL_PRIVATE_CHAT
- NOTIF_GUILD_WALL_CHAT
- NOTIF_PRIVATE_CHAT
- CHALLENGES_MAGIC_DIFFICULTY
- CHALLENGES_DRAGONS_DIFFICULTY
- CHALLENGES_PHYSICAL_DIFFICULTY
- MOUNTAIN_CAVES_DIFFICULTY
- MOUNTAIN_SUMMIT_DIFFICULTY
- BOSS_PIT_WIZARD_DIFFICULTY
- BOSS_PIT_PLANT_DIFFICULTY
- BOSS_PIT_COLOSSUS_DIFFICULTY
- RUNE_OFFERING_TRAY_SHOW_SETS
- HERO_SORT
- CHAT_DROPDOWN_OPEN

### ClientErrorCode (enum)
`com.perblue.rpg.util.localization.ClientErrorCode`
extends `java.lang.Enum`

**Fields (246):**
- `private static final ClientErrorCode[] $VALUES`
- `public static final ClientErrorCode ABOVE_SHARD_CONTENT`
- `public static final ClientErrorCode ABOVE_SHARD_RARITY`
- `public static final ClientErrorCode ABOVE_SHARD_TEAM_LEVEL`
- `public static final ClientErrorCode ALREADY_HAVE_HERO`
- `public static final ClientErrorCode ALREADY_HAVE_SKIN`
- `public static final ClientErrorCode ALREADY_REGISTERED_FOR_WAR`
- `public static final ClientErrorCode AT_MAX_RARITY`
- `public static final ClientErrorCode AT_MAX_STARS`
- `public static final ClientErrorCode AVATAR_NOT_UNLOCKED`
- `public static final ClientErrorCode BAD_TIME`
- `public static final ClientErrorCode BOSS_BATTLE_NOT_AVAILABLE`
- `public static final ClientErrorCode BOSS_PIT_BOSS_COMPLETE`
- `public static final ClientErrorCode BOSS_PIT_TOO_DIFFICULT`
- `public static final ClientErrorCode BOSS_PIT_WRONG_BOSS`
- `public static final ClientErrorCode BOSS_PIT_WRONG_PHASE`
- `public static final ClientErrorCode BUY_CHEST_VERIFICATION_ERROR`
- `public static final ClientErrorCode CAMPAIGN_LEVEL_LOCKED`
- `public static final ClientErrorCode CAMPAIGN_LEVEL_RAID_LOCKED`
- `public static final ClientErrorCode CAMPAIGN_RUNE_LIMIT`
- `public static final ClientErrorCode CANT_ADD_FRIEND_BLOCKED`
- `public static final ClientErrorCode CANT_ADD_FRIEND_BLOCKED_BY_YOU`
- `public static final ClientErrorCode CANT_ADD_FRIEND_OTHER_SERVER`
- `public static final ClientErrorCode CANT_ATTACH_RUNE_NO_HERO`
- `public static final ClientErrorCode CANT_ATTACH_RUNE_WRONG_HERO`
- `public static final ClientErrorCode CANT_BUY_SKIN`
- `public static final ClientErrorCode CANT_CLAIM_REWARD`
- `public static final ClientErrorCode CANT_CLAIM_THIS_GUILD`
- `public static final ClientErrorCode CANT_CONNECT`
- `public static final ClientErrorCode CANT_CREATE_GUILD_WHILE_IN_GUILD`
- `public static final ClientErrorCode CANT_DELETE_GUILD_WALL`
- `public static final ClientErrorCode CANT_DEMOTE_THAT_RANK`
- `public static final ClientErrorCode CANT_DO_CRYPT_RAID`
- `public static final ClientErrorCode CANT_DROP_NORMAL_EXPEDITION`
- `public static final ClientErrorCode CANT_EDIT_GUILD_WALL`
- `public static final ClientErrorCode CANT_EDIT_OTHER_GUILD_WALL`
- `public static final ClientErrorCode CANT_FIND_HOST`
- `public static final ClientErrorCode CANT_FUSE_DIFFERENT_RUNE_TYPES`
- `public static final ClientErrorCode CANT_GO_DOWN_IN_RARITY`
- `public static final ClientErrorCode CANT_HIRE_OWN_HERO`
- `public static final ClientErrorCode CANT_JOIN_GUILD_WHILE_IN_GUILD`
- `public static final ClientErrorCode CANT_KICK_HIGHER_MEMBERS`
- `public static final ClientErrorCode CANT_KICK_LEADERS`
- `public static final ClientErrorCode CANT_PM_BLOCKED`
- `public static final ClientErrorCode CANT_PM_BLOCKED_BY_YOU`
- `public static final ClientErrorCode CANT_PM_NOT_FRIENDS`
- `public static final ClientErrorCode CANT_PM_OTHER_SERVER`
- `public static final ClientErrorCode CANT_PROMOTE_THAT_RANK`
- `public static final ClientErrorCode CANT_RAISE_EXPEDITION_LEVEL`
- `public static final ClientErrorCode CANT_REFRESH_THAT_MERCHANT`
- `public static final ClientErrorCode CANT_SELL_ATTACHED_RUNE`
- `public static final ClientErrorCode CANT_SELL_ITEM`
- `public static final ClientErrorCode CANT_USE_ALREADY_MINIMUM_COST`
- `public static final ClientErrorCode CANT_USE_ELITE_LOCKED`
- `public static final ClientErrorCode CANT_USE_EXPERT_LOCKED`
- `public static final ClientErrorCode CANT_USE_NO_EVENT_CHEST`
- `public static final ClientErrorCode CANT_USE_WHILE_BONUS_EVENT_DIFF_RATE`
- `public static final ClientErrorCode CANT_USE_WHILE_DOUBLE_DROP_EVENT_ACTIVE`
- `public static final ClientErrorCode CANT_USE_WHILE_XP_BONUS_EVENT_ACTIVE`
- `public static final ClientErrorCode CAN_ONLY_USE_ONE_OF_EACH_HERO`
- `public static final ClientErrorCode CHEST_EVENT_ENDED`
- `public static final ClientErrorCode CLAIM_REWARD_EVENT_EXPIRED`
- `public static final ClientErrorCode CLIENT_OUT_OF_SYNC`
- `public static final ClientErrorCode COLISEUM_CANT_ATTACK_CROSS`
- `public static final ClientErrorCode COLISEUM_CANT_ATTACK_LOWER`
- `public static final ClientErrorCode COLISEUM_CHANCES_USED`
- `public static final ClientErrorCode COLISEUM_ON_COOLDOWN`
- `public static final ClientErrorCode COLISEUM_PROMOTION_REWARD_ALREADY_CLAIMED`
- `public static final ClientErrorCode COLISEUM_RESETS_USED`
- `public static final ClientErrorCode COMPLETE_PREVIOUS_EXPEDITION_FIRST`
- `public static final ClientErrorCode CRAFTING_INVALID_DATA`
- `public static final ClientErrorCode CRAFTING_MISSING_PARTS`
- `public static final ClientErrorCode CRYPT_DIFFICULTY_TOO_HIGH`
- `public static final ClientErrorCode CRYPT_HERO_USED`
- `public static final ClientErrorCode CRYPT_RAID_ATTACK_IN_PROGRESS`
- `public static final ClientErrorCode CRYPT_RAID_ATTACK_NOT_IN_PROGRESS`
- `public static final ClientErrorCode CRYPT_RAID_NOT_IN_GUILD`
- `public static final ClientErrorCode CRYPT_RAID_NO_ATTACKS_LEFT`
- `public static final ClientErrorCode CRYPT_RAID_OPPONENT_DEFEATED`
- `public static final ClientErrorCode CRYPT_RAID_OPPONENT_PROGRESSED`
- `public static final ClientErrorCode CRYPT_RAID_OVER`
- `public static final ClientErrorCode DEFEAT_PREVIOUS_GUILD_WAR_LINEUP`
- `public static final ClientErrorCode DONT_HAVE_GEAR_TICKET`
- `public static final ClientErrorCode DONT_HAVE_ITEM`
- `public static final ClientErrorCode DONT_HAVE_SKILL`
- `public static final ClientErrorCode DRAGONS_ONLY`
- `public static final ClientErrorCode ERROR`
- `public static final ClientErrorCode EXPEDITION_HERO_DEAD`
- `public static final ClientErrorCode EXPEDITION_HERO_TOO_LOW`
- `public static final ClientErrorCode FEATURE_NOT_UNLOCKED`
- `public static final ClientErrorCode FEATURE_SHARD_LOCKED`
- `public static final ClientErrorCode FEATURE_TEAM_LEVEL_LOCKED`
- `public static final ClientErrorCode FIGHT_PIT_CANT_ATTACK_CROSS`
- `public static final ClientErrorCode FIGHT_PIT_CANT_ATTACK_LOWER`
- `public static final ClientErrorCode FIGHT_PIT_CHANCES_USED`
- `public static final ClientErrorCode FIGHT_PIT_ON_COOLDOWN`
- `public static final ClientErrorCode FIGHT_PIT_PROMOTION_REWARD_ALREADY_CLAIMED`
- `public static final ClientErrorCode FIGHT_PIT_RESETS_USED`
- `public static final ClientErrorCode FREE_TEMPLE_INVITES_USED`
- `public static final ClientErrorCode GAME_MODE_CHANCES_GONE`
- `public static final ClientErrorCode GAME_MODE_COOLDOWN`
- `public static final ClientErrorCode GAME_MODE_LOCKED`
- `public static final ClientErrorCode GAME_MODE_NOT_OPEN`
- `public static final ClientErrorCode GENERIC_CONNECTION_ERROR`
- `public static final ClientErrorCode GOLD_PURCHASES_USED`
- `public static final ClientErrorCode GUILD_ALREADY_IN_BATTLE`
- `public static final ClientErrorCode GUILD_CANT_SURRENDER_VICTORIOUS_BATTLE`
- `public static final ClientErrorCode GUILD_DOES_NOT_EXIST`
- `public static final ClientErrorCode GUILD_IS_FULL`
- `public static final ClientErrorCode GUILD_MEMBERSHIP_CLOSED`
- `public static final ClientErrorCode GUILD_MISSING_WAR_MEMBER_PERMISSION`
- `public static final ClientErrorCode GUILD_MISSING_WAR_PERMISSION`
- `public static final ClientErrorCode GUILD_NOT_AT_WAR`
- `public static final ClientErrorCode GUILD_NOT_IN_BATTLE`
- `public static final ClientErrorCode GUILD_NOT_REGISTERED_FOR_WAR`
- `public static final ClientErrorCode GUILD_RANK_OUT_OF_SYNC`
- `public static final ClientErrorCode GUILD_SETTINGS_PERMISSION_ERROR`
- `public static final ClientErrorCode GUILD_WAR_ATTACK_IN_PROGRESS`
- `public static final ClientErrorCode GUILD_WAR_ATTACK_NOT_IN_PROGRESS`
- `public static final ClientErrorCode GUILD_WAR_CANT_SURRENDER_YET`
- `public static final ClientErrorCode GUILD_WAR_HERO_USED`
- `public static final ClientErrorCode GUILD_WAR_NOT_IN_BATTLE`
- `public static final ClientErrorCode GUILD_WAR_NO_ATTACKS`
- `public static final ClientErrorCode GUILD_WAR_OPPONENT_DEFEATED`
- `public static final ClientErrorCode HERO_ABOVE_TEAM_LEVEL`
- `public static final ClientErrorCode HERO_LEVEL_TOO_HIGH_FOR_HIRE`
- `public static final ClientErrorCode HERO_LEVEL_TOO_LOW`
- `public static final ClientErrorCode HERO_REQUIRED`
- `public static final ClientErrorCode INTERNAL_SERVER_CONNECTION_DOWN`
- `public static final ClientErrorCode INVALID_LINEUP`
- `public static final ClientErrorCode INVALID_LOOT`
- `public static final ClientErrorCode INVALID_NAME`
- `public static final ClientErrorCode INVALID_RECEIPT`
- `public static final ClientErrorCode ITEM_CANT_BE_USED`
- `public static final ClientErrorCode ITEM_SLOT_FULL`
- `public static final ClientErrorCode KEYSTONE_RUNE_ALREADY_IMBUED`
- `public static final ClientErrorCode LOGIN_WRONG_SHARD`
- `public static final ClientErrorCode MAIL_MESSAGE_NOT_FOUND`
- `public static final ClientErrorCode MAX_ENCHANT`
- `public static final ClientErrorCode MAX_HERO_FOR_TEAM_LEVEL`
- `public static final ClientErrorCode MAX_LEVEL_HERO`
- `public static final ClientErrorCode MERCENARIES_AT_DIFFERENT_GUILD`
- `public static final ClientErrorCode MERCENARY_ALREADY_HIRED`
- `public static final ClientErrorCode MERCENARY_ALREADY_POSTED`
- `public static final ClientErrorCode MERCENARY_NO_LONGER_EXISTS`
- `public static final ClientErrorCode MERCHANT_RUNE_LIMIT`
- `public static final ClientErrorCode MISSING_GEAR`
- `public static final ClientErrorCode MISSING_HERO`
- `public static final ClientErrorCode NEEDS_THREE_STARS`
- `public static final ClientErrorCode NEED_TO_USE_YOUR_HERO_IN_CRYPT`
- `public static final ClientErrorCode NEW_USER_WRONG_SHARD`
- `public static final ClientErrorCode NOT_ELIGIBLE_FOR_WAR_REWARDS`
- `public static final ClientErrorCode NOT_ENOUGH_BAZAAR_TOKENS`
- `public static final ClientErrorCode NOT_ENOUGH_CHESTS`
- `public static final ClientErrorCode NOT_ENOUGH_COLISEUM_TOKENS`
- `public static final ClientErrorCode NOT_ENOUGH_DAILY_CHANCES`
- `public static final ClientErrorCode NOT_ENOUGH_DIAMONDS`
- `public static final ClientErrorCode NOT_ENOUGH_EXPEDITION_TOKENS`
- `public static final ClientErrorCode NOT_ENOUGH_FIGHT_TOKENS`
- `public static final ClientErrorCode NOT_ENOUGH_GOLD`
- `public static final ClientErrorCode NOT_ENOUGH_GOLD_NO_ALCHEMY`
- `public static final ClientErrorCode NOT_ENOUGH_GUILD_TOKENS`
- `public static final ClientErrorCode NOT_ENOUGH_POWER_POINTS`
- `public static final ClientErrorCode NOT_ENOUGH_RAID_TICKETS`
- `public static final ClientErrorCode NOT_ENOUGH_RUNICITE`
- `public static final ClientErrorCode NOT_ENOUGH_SHRINE_ROLLS`
- `public static final ClientErrorCode NOT_ENOUGH_SOULMART_TOKENS`
- `public static final ClientErrorCode NOT_ENOUGH_SOULSTONES`
- `public static final ClientErrorCode NOT_ENOUGH_STAMINA`
- `public static final ClientErrorCode NOT_ENOUGH_STONES`
- `public static final ClientErrorCode NOT_ENOUGH_WAR_MEMBERS`
- `public static final ClientErrorCode NOT_ENOUGH_WAR_MEMBERS_BATTLE`
- `public static final ClientErrorCode NOT_ENOUGH_WAR_TICKETS`
- `public static final ClientErrorCode NOT_ENOUGH_WAR_TOKENS`
- `public static final ClientErrorCode NOT_INVITED_TO_TITAN_TEMPLE`
- `public static final ClientErrorCode NOT_IN_GUILD`
- `public static final ClientErrorCode NOT_IN_REGISTRATION_PERIOD`
- `public static final ClientErrorCode NOT_MODERATOR`
- `public static final ClientErrorCode NO_ATTACK_SERVER_RESTART`
- `public static final ClientErrorCode NO_AVAILABLE_EXPEDTION_CHEST`
- `public static final ClientErrorCode NO_COLISEUM_DEFENSE`
- `public static final ClientErrorCode NO_ELITE_CAMPAIGN_RESETS_LEFT`
- `public static final ClientErrorCode NO_EXPEDITION_IN_PROGRESS`
- `public static final ClientErrorCode NO_FIGHT_PIT_DEFENSE`
- `public static final ClientErrorCode NO_MORE_FREE_BOSS_BATTLE_ADVANCES`
- `public static final ClientErrorCode NO_MORE_FREE_BOSS_BATTLE_RESETS`
- `public static final ClientErrorCode NO_MORE_RESETS`
- `public static final ClientErrorCode NO_MORE_VIP_MERCHANT_REFRESHES`
- `public static final ClientErrorCode NO_OPPONENTS_FOUND`
- `public static final ClientErrorCode NO_WAR_MATCH_FOUND`
- `public static final ClientErrorCode ONLY_LEADERS_CAN_ACCEPT_NEW_MEMBERS`
- `public static final ClientErrorCode ONLY_LEADERS_CAN_EDIT_GUILD`
- `public static final ClientErrorCode ONLY_LEADERS_CAN_KICK_FROM_GUILD`
- `public static final ClientErrorCode ONLY_RULER_CAN_CROWN_LEADER`
- `public static final ClientErrorCode ONLY_RULER_CAN_DEMOTE_OFFICERS`
- `public static final ClientErrorCode ONLY_RULER_CAN_DISBAND`
- `public static final ClientErrorCode ONLY_RULER_CAN_EDIT_GUILD_EMBLEM`
- `public static final ClientErrorCode ONLY_RULER_CAN_PROMOTE_OFFICERS`
- `public static final ClientErrorCode PICK_WAR_REWARDS_ERROR`
- `public static final ClientErrorCode POWER_POINTS_FULL`
- `public static final ClientErrorCode PURCHASE_ERROR`
- `public static final ClientErrorCode QUEST_LOCKED`
- `public static final ClientErrorCode QUEST_REQUIREMENTS_NOT_SATISFIED`
- `public static final ClientErrorCode RAID_TICKET_PURCHASES_USED`
- `public static final ClientErrorCode RARITY_CANT_BE_LEGENDARY`
- `public static final ClientErrorCode RARITY_CAN_NOT_BE_DEFAULT`
- `public static final ClientErrorCode REMOVE_RUNE_RUNE_LIMIT`
- `public static final ClientErrorCode REQUEST_LIMIT`
- `public static final ClientErrorCode RUNE_ALREADY_ATTACHED`
- `public static final ClientErrorCode RUNE_ALREADY_REMOVED`
- `public static final ClientErrorCode RUNE_AT_MAX_LEVEL`
- `public static final ClientErrorCode RUNE_AT_MAX_LEVEL_AND_STARS`
- `public static final ClientErrorCode RUNE_AT_MAX_STARS`
- `public static final ClientErrorCode RUNICITE_PURCHASES_USED`
- `public static final ClientErrorCode SERVER_CONNECTION_LOST`
- `public static final ClientErrorCode SERVER_TIMEOUT`
- `public static final ClientErrorCode SHARD_DOESNT_EXIST`
- `public static final ClientErrorCode SHRINE_RUNE_LIMIT`
- `public static final ClientErrorCode SKILL_ABOVE_HERO_LEVEL`
- `public static final ClientErrorCode SKILL_AT_MAX_LEVEL`
- `public static final ClientErrorCode STAMINA_FULL`
- `public static final ClientErrorCode STAMINA_FULL_ITEM`
- `public static final ClientErrorCode STAMINA_PURCHASES_USED`
- `public static final ClientErrorCode STARS_TOO_LOW`
- `public static final ClientErrorCode TEAM_LEVEL_LOCK`
- `public static final ClientErrorCode TEAM_LEVEL_TOO_LOW_FOR_GUILD`
- `public static final ClientErrorCode TEMPLE_USER_ALREADY_INVITED`
- `public static final ClientErrorCode THEY_HAVE_TOO_MANY_FRIENDS`
- `public static final ClientErrorCode TITAN_ALREADY_KILLED`
- `public static final ClientErrorCode TITAN_REWARD_ALREADY_CLAIMED`
- `public static final ClientErrorCode TITAN_TEMPLE_ATTACK_IN_PROGRESS`
- `public static final ClientErrorCode TITAN_TEMPLE_ATTACK_NOT_IN_PROGRESS`
- `public static final ClientErrorCode TITAN_TEMPLE_EXPIRED`
- `public static final ClientErrorCode TOO_MANY_BLOCKED_USERS`
- `public static final ClientErrorCode TOO_MANY_HEROES`
- `public static final ClientErrorCode TOO_MANY_REQUESTS`
- `public static final ClientErrorCode TRADER_ALREADY_UNLOCKED`
- `public static final ClientErrorCode TRADER_ITEM_NOT_FOUND`
- `public static final ClientErrorCode TRADER_NOT_AVAILABLE`
- `public static final ClientErrorCode TRANSACTION_ALREADY_COMPLETE`
- `public static final ClientErrorCode USER_REQUIRED`
- `public static final ClientErrorCode WAR_NOT_ACTIVE`
- `public static final ClientErrorCode WAR_REGISTRATION_CLOSED`
- `public static final ClientErrorCode WAR_REWARD_ALREADY_CLAIMED`
- `public static final ClientErrorCode WRONG_ITEM`
- `public static final ClientErrorCode YOU_HAVE_TOO_MANY_FRIENDS`

**Methods (4):**
- `boolean supportsFormatting(ClientErrorCode)`
- `boolean supportsFormattingForString(ClientErrorCode)`
- `ClientErrorCode[] values()`
- `ClientErrorCode valueOf(String)`

**Constants (245):**
- ERROR
- INTERNAL_SERVER_CONNECTION_DOWN
- TOO_MANY_REQUESTS
- USER_REQUIRED
- NOT_ENOUGH_GOLD
- NOT_ENOUGH_DIAMONDS
- PURCHASE_ERROR
- TRANSACTION_ALREADY_COMPLETE
- CANT_FIND_HOST
- CANT_CONNECT
- SERVER_TIMEOUT
- GENERIC_CONNECTION_ERROR
- SERVER_CONNECTION_LOST
- BAD_TIME
- CLIENT_OUT_OF_SYNC
- INVALID_RECEIPT
- ITEM_SLOT_FULL
- DONT_HAVE_ITEM
- WRONG_ITEM
- AT_MAX_STARS
- NOT_ENOUGH_STONES
- AT_MAX_RARITY
- MISSING_GEAR
- DONT_HAVE_SKILL
- SKILL_ABOVE_HERO_LEVEL
- SKILL_AT_MAX_LEVEL
- NOT_ENOUGH_POWER_POINTS
- ALREADY_HAVE_HERO
- HERO_ABOVE_TEAM_LEVEL
- NOT_ENOUGH_STAMINA
- MAX_LEVEL_HERO
- MAX_HERO_FOR_TEAM_LEVEL
- STAMINA_FULL
- STAMINA_PURCHASES_USED
- GOLD_PURCHASES_USED
- POWER_POINTS_FULL
- NOT_ENOUGH_CHESTS
- BUY_CHEST_VERIFICATION_ERROR
- MAIL_MESSAGE_NOT_FOUND
- CRAFTING_MISSING_PARTS
- TRADER_ITEM_NOT_FOUND
- CANT_SELL_ITEM
- NOT_ENOUGH_RAID_TICKETS
- CANT_CLAIM_REWARD
- AVATAR_NOT_UNLOCKED
- TOO_MANY_HEROES
- MISSING_HERO
- INVALID_LOOT
- NO_ELITE_CAMPAIGN_RESETS_LEFT
- HERO_LEVEL_TOO_LOW
- FEATURE_NOT_UNLOCKED
- NOT_ENOUGH_DAILY_CHANCES
- CAMPAIGN_LEVEL_LOCKED
- CAMPAIGN_LEVEL_RAID_LOCKED
- QUEST_REQUIREMENTS_NOT_SATISFIED
- HERO_REQUIRED
- FIGHT_PIT_RESETS_USED
- FIGHT_PIT_ON_COOLDOWN
- FIGHT_PIT_CANT_ATTACK_LOWER
- FIGHT_PIT_CANT_ATTACK_CROSS
- NO_ATTACK_SERVER_RESTART
- NOT_ENOUGH_FIGHT_TOKENS
- FIGHT_PIT_PROMOTION_REWARD_ALREADY_CLAIMED
- FIGHT_PIT_CHANCES_USED
- NO_FIGHT_PIT_DEFENSE
- TEAM_LEVEL_LOCK
- GAME_MODE_LOCKED
- GAME_MODE_CHANCES_GONE
- GAME_MODE_COOLDOWN
- GAME_MODE_NOT_OPEN
- DRAGONS_ONLY
- EXPEDITION_HERO_TOO_LOW
- EXPEDITION_HERO_DEAD
- NO_AVAILABLE_EXPEDTION_CHEST
- CANT_CREATE_GUILD_WHILE_IN_GUILD
- ONLY_LEADERS_CAN_ACCEPT_NEW_MEMBERS
- GUILD_IS_FULL
- CANT_JOIN_GUILD_WHILE_IN_GUILD
- CANT_CLAIM_THIS_GUILD
- ONLY_RULER_CAN_CROWN_LEADER
- ONLY_RULER_CAN_DEMOTE_OFFICERS
- ONLY_RULER_CAN_PROMOTE_OFFICERS
- ONLY_LEADERS_CAN_EDIT_GUILD
- ONLY_RULER_CAN_EDIT_GUILD_EMBLEM
- TEAM_LEVEL_TOO_LOW_FOR_GUILD
- REQUEST_LIMIT
- GUILD_MEMBERSHIP_CLOSED
- GUILD_DOES_NOT_EXIST
- CANT_KICK_LEADERS
- ONLY_LEADERS_CAN_KICK_FROM_GUILD
- NOT_IN_GUILD
- MERCENARY_NO_LONGER_EXISTS
- MERCENARY_ALREADY_HIRED
- CANT_HIRE_OWN_HERO
- HERO_LEVEL_TOO_HIGH_FOR_HIRE
- CAN_ONLY_USE_ONE_OF_EACH_HERO
- MERCENARIES_AT_DIFFERENT_GUILD
- NO_OPPONENTS_FOUND
- ONLY_RULER_CAN_DISBAND
- NOT_ENOUGH_GOLD_NO_ALCHEMY
- MAX_ENCHANT
- CRYPT_RAID_OVER
- CRYPT_RAID_NOT_IN_GUILD
- CRYPT_RAID_OPPONENT_DEFEATED
- CRYPT_HERO_USED
- CRYPT_RAID_ATTACK_IN_PROGRESS
- CRYPT_RAID_ATTACK_NOT_IN_PROGRESS
- NOT_ENOUGH_GUILD_TOKENS
- NOT_ENOUGH_EXPEDITION_TOKENS
- CRYPT_RAID_OPPONENT_PROGRESSED
- NEED_TO_USE_YOUR_HERO_IN_CRYPT
- TRADER_NOT_AVAILABLE
- TRADER_ALREADY_UNLOCKED
- CANT_PROMOTE_THAT_RANK
- CANT_DEMOTE_THAT_RANK
- TOO_MANY_BLOCKED_USERS
- CHEST_EVENT_ENDED
- GUILD_SETTINGS_PERMISSION_ERROR
- CANT_KICK_HIGHER_MEMBERS
- COLISEUM_RESETS_USED
- COLISEUM_ON_COOLDOWN
- COLISEUM_CANT_ATTACK_LOWER
- COLISEUM_CANT_ATTACK_CROSS
- NOT_ENOUGH_COLISEUM_TOKENS
- COLISEUM_PROMOTION_REWARD_ALREADY_CLAIMED
- COLISEUM_CHANCES_USED
- NO_COLISEUM_DEFENSE
- NO_EXPEDITION_IN_PROGRESS
- CANT_DROP_NORMAL_EXPEDITION
- COMPLETE_PREVIOUS_EXPEDITION_FIRST
- GUILD_RANK_OUT_OF_SYNC
- NOT_MODERATOR
- INVALID_NAME
- TEMPLE_USER_ALREADY_INVITED
- FREE_TEMPLE_INVITES_USED
- CANT_EDIT_GUILD_WALL
- TITAN_TEMPLE_EXPIRED
- NOT_INVITED_TO_TITAN_TEMPLE
- TITAN_ALREADY_KILLED
- TITAN_TEMPLE_ATTACK_IN_PROGRESS
- TITAN_TEMPLE_ATTACK_NOT_IN_PROGRESS
- TITAN_REWARD_ALREADY_CLAIMED
- CRYPT_DIFFICULTY_TOO_HIGH
- SHARD_DOESNT_EXIST
- ABOVE_SHARD_TEAM_LEVEL
- ABOVE_SHARD_RARITY
- ABOVE_SHARD_CONTENT
- BOSS_PIT_WRONG_PHASE
- BOSS_PIT_WRONG_BOSS
- BOSS_PIT_BOSS_COMPLETE
- BOSS_PIT_TOO_DIFFICULT
- NOT_ENOUGH_SOULMART_TOKENS
- ITEM_CANT_BE_USED
- STAMINA_FULL_ITEM
- CANT_USE_WHILE_DOUBLE_DROP_EVENT_ACTIVE
- CANT_USE_ALREADY_MINIMUM_COST
- CANT_USE_ELITE_LOCKED
- CANT_REFRESH_THAT_MERCHANT
- CANT_DO_CRYPT_RAID
- QUEST_LOCKED
- GUILD_MISSING_WAR_PERMISSION
- NOT_IN_REGISTRATION_PERIOD
- NOT_ENOUGH_WAR_MEMBERS
- ALREADY_REGISTERED_FOR_WAR
- WAR_NOT_ACTIVE
- GUILD_NOT_AT_WAR
- GUILD_ALREADY_IN_BATTLE
- NOT_ENOUGH_WAR_TICKETS
- NO_WAR_MATCH_FOUND
- GUILD_NOT_IN_BATTLE
- GUILD_WAR_HERO_USED
- GUILD_WAR_NOT_IN_BATTLE
- GUILD_WAR_OPPONENT_DEFEATED
- GUILD_WAR_ATTACK_IN_PROGRESS
- GUILD_WAR_ATTACK_NOT_IN_PROGRESS
- DEFEAT_PREVIOUS_GUILD_WAR_LINEUP
- GUILD_WAR_NO_ATTACKS
- MERCENARY_ALREADY_POSTED
- GUILD_WAR_CANT_SURRENDER_YET
- NOT_ELIGIBLE_FOR_WAR_REWARDS
- WAR_REWARD_ALREADY_CLAIMED
- PICK_WAR_REWARDS_ERROR
- GUILD_CANT_SURRENDER_VICTORIOUS_BATTLE
- NOT_ENOUGH_WAR_TOKENS
- WAR_REGISTRATION_CLOSED
- INVALID_LINEUP
- CANT_ATTACH_RUNE_NO_HERO
- CANT_ATTACH_RUNE_WRONG_HERO
- RUNE_ALREADY_ATTACHED
- RUNE_ALREADY_REMOVED
- NOT_ENOUGH_RUNICITE
- CANT_SELL_ATTACHED_RUNE
- RUNE_AT_MAX_LEVEL
- KEYSTONE_RUNE_ALREADY_IMBUED
- NOT_ENOUGH_SOULSTONES
- REMOVE_RUNE_RUNE_LIMIT
- CAMPAIGN_RUNE_LIMIT
- MERCHANT_RUNE_LIMIT
- SHRINE_RUNE_LIMIT
- NOT_ENOUGH_WAR_MEMBERS_BATTLE
- CANT_USE_NO_EVENT_CHEST
- RARITY_CANT_BE_LEGENDARY
- RARITY_CAN_NOT_BE_DEFAULT
- STARS_TOO_LOW
- CANT_GO_DOWN_IN_RARITY
- CANT_ADD_FRIEND_BLOCKED
- CANT_PM_NOT_FRIENDS
- CANT_DELETE_GUILD_WALL
- CANT_EDIT_OTHER_GUILD_WALL
- YOU_HAVE_TOO_MANY_FRIENDS
- THEY_HAVE_TOO_MANY_FRIENDS
- CANT_PM_BLOCKED
- GUILD_MISSING_WAR_MEMBER_PERMISSION
- CANT_ADD_FRIEND_BLOCKED_BY_YOU
- RUNE_AT_MAX_STARS
- CANT_FUSE_DIFFERENT_RUNE_TYPES
- NEW_USER_WRONG_SHARD
- LOGIN_WRONG_SHARD
- CANT_ADD_FRIEND_OTHER_SERVER
- CANT_PM_OTHER_SERVER
- FEATURE_SHARD_LOCKED
- FEATURE_TEAM_LEVEL_LOCKED
- RUNICITE_PURCHASES_USED
- CANT_PM_BLOCKED_BY_YOU
- RUNE_AT_MAX_LEVEL_AND_STARS
- CRYPT_RAID_NO_ATTACKS_LEFT
- ALREADY_HAVE_SKIN
- CANT_BUY_SKIN
- NO_MORE_VIP_MERCHANT_REFRESHES
- NO_MORE_RESETS
- NEEDS_THREE_STARS
- NOT_ENOUGH_SHRINE_ROLLS
- NOT_ENOUGH_BAZAAR_TOKENS
- CANT_RAISE_EXPEDITION_LEVEL
- RAID_TICKET_PURCHASES_USED
- GUILD_NOT_REGISTERED_FOR_WAR
- CANT_USE_WHILE_XP_BONUS_EVENT_ACTIVE
- CANT_USE_WHILE_BONUS_EVENT_DIFF_RATE
- CRAFTING_INVALID_DATA
- BOSS_BATTLE_NOT_AVAILABLE
- NO_MORE_FREE_BOSS_BATTLE_RESETS
- NO_MORE_FREE_BOSS_BATTLE_ADVANCES
- CLAIM_REWARD_EVENT_EXPIRED
- CANT_USE_EXPERT_LOCKED
- DONT_HAVE_GEAR_TICKET

### ErrorMessageConverter (class)
`com.perblue.rpg.util.localization.ErrorMessageConverter`

**Fields (1):**
- `static final String BUNDLE_NAME = com.perblue.rpg.util.localization.errors`

**Methods (4):**
- `String getErrorString(Locale, ClientErrorCodeException)`
- `String getErrorString(Locale, ClientErrorCode)`
- `String getErrorString(Language, ClientErrorCodeException)`
- `String getErrorString(Language, ClientErrorCode)`

### ExternalTextHelper (class)
`com.perblue.rpg.util.localization.ExternalTextHelper`

**Methods (1):**
- `ResourceBundle getBundle(String, Locale)`

### Language (enum)
`com.perblue.rpg.util.localization.Language`
extends `java.lang.Enum`

**Fields (21):**
- `private static final Language[] $VALUES`
- `public static final Language BRAZILIAN`
- `public static final Language DANISH`
- `public static final Language DUTCH`
- `public static final Language ENGLISH`
- `public static final Language FRENCH`
- `public static final Language GERMAN`
- `public static final Language INDONESIAN`
- `public static final Language ITALIAN`
- `public static final Language JAPANESE`
- `public static final Language KOREAN`
- `public static final Language NORWEGIAN`
- `public static final Language RUSSIAN`
- `public static final Language SIMPCHINESE`
- `public static final Language SPANISH`
- `public static final Language SWEDISH`
- `public static final Language TRADCHINESE`
- `public static final Language TURKISH`
- `private static Language[] values`
- `private String code`
- `private boolean inBeta`

**Methods (8):**
- `boolean isCJKRFont(Language)`
- `boolean isInBeta()`
- `String getNormalizedLanguage(String)`
- `String getCode()`
- `Language[] valuesCached()`
- `Language[] values()`
- `Language valueOf(String)`
- `Language getLanguage(String)`

**Constants (17):**
- ENGLISH
- GERMAN
- FRENCH
- SPANISH
- RUSSIAN
- KOREAN
- JAPANESE
- SIMPCHINESE
- TRADCHINESE
- INDONESIAN
- ITALIAN
- TURKISH
- DANISH
- SWEDISH
- NORWEGIAN
- DUTCH
- BRAZILIAN

## Package: com.perblue.common (92 classes)

### a (interface)
`com.perblue.common.a`

**Methods (1):**
- `boolean matches(Object)`

### a (class)
`com.perblue.common.a.a`

**Fields (2):**
- `private Object a`
- `private Object b`

**Methods (4):**
- `String toString()`
- `Object b()`
- `Object a()`

### b (class)
`com.perblue.common.a.b`

**Fields (2):**
- `private static int codeLocation$76606ca0`
- `private d resolver`

**Methods (33):**
- `boolean isOnAndroid()`
- `boolean isOnIOS()`
- `Enum tryValueOf(Class, String, Enum)`
- `Enum tryValueOf(Class, String)`
- `long computeCheckSum(File)`
- `EnumSet enumSet(Class, Object[])`
- `int eofcheck(int)`
- `Enum fromOrdinal(Class, int, Enum)`
- `void getCheckSums(File, Map, String, String)`
- `Map getCheckSums(File, boolean, String)`
- `Map getCheckSums(ZipFile, String, boolean, String)`
- `boolean isOnClient()`
- `boolean isOnServer()`
- `void packBoolean(OutputStream, boolean)`
- `void packDouble(OutputStream, double)`
- `void packLong(OutputStream, long)`
- `void packFloat(OutputStream, float)`
- `void packInt(OutputStream, int)`
- `void packString(OutputStream, String)`
- `boolean unpackBoolean(InputStream)`
- `double unpackDouble(InputStream)`
- `long unpackLong(InputStream)`
- `float unpackFloat(InputStream)`
- `int getCodeLocation$5b3ee141()`
- `List getEntriesSortedByValue(Map, boolean)`
- `void setCodeLocation$508f90c5(int)`
- `int unpackInt(InputStream)`
- `int unpackSize(a)`
- `String unpackString(InputStream, int)`
- `String unpackString(a)`
- `a getDependencies(String, a, c)`
- `a resolve(String)`
- `void checkSize(a, int)`

### c (class)
`com.perblue.common.a.c`

**Fields (1):**
- `private b a`

**Methods (13):**
- `String toString()`
- `void b(b, Comparable, int)`
- `b b(b)`
- `b c(b)`
- `b d(b)`
- `Iterator iterator()`
- `int a()`
- `Comparable a(Random)`
- `void a(Comparable, int)`
- `void a(b)`
- `b a(b, Comparable, int)`
- `int e(b)`

### b (class)
`com.perblue.common.b`

**Fields (2):**
- `private static final int[] a`
- `private static final String[] b`

**Methods (2):**
- `int a(Calendar)`
- `String a(int)`

### a (class)
`com.perblue.common.b.a`
extends `java.lang.Exception`

**Fields (1):**
- `private static final long serialVersionUID = 1`

### aa (class)
`com.perblue.common.b.aa`
extends `com.perblue.common.b.d`

**Fields (2):**
- ` String b`
- ` String[] c`

**Methods (4):**
- `String toString()`
- `int a(p)`
- `void a(r)`
- `int a(p, List)`

### ab (class)
`com.perblue.common.b.ab`
extends `com.perblue.common.b.b`

**Methods (2):**
- `int doPostCheck$7d55ca98(n, l, List)`
- `void validateParamters(String[], r)`

### ac (class)
`com.perblue.common.b.ac`
extends `com.perblue.common.b.at`

**Fields (2):**
- `private int b`
- `private int c`

**Methods (2):**
- `String toString()`
- `float a(p)`

### ad (class)
`com.perblue.common.b.ad`
extends `com.perblue.common.b.au`

**Fields (1):**
- `private final List a`

**Methods (6):**
- `boolean equals(Object)`
- `String toString()`
- `int hashCode()`
- `void a(r, q)`
- `void a(r)`
- `void a(p, List)`

### ae (class)
`com.perblue.common.b.ae`
extends `com.perblue.common.b.az`

**Fields (1):**
- `private final String a`

**Methods (6):**
- `boolean equals(Object)`
- `String toString()`
- `int hashCode()`
- `void a(r, Set)`
- `String a(p)`
- `String a()`

### af (class)
`com.perblue.common.b.af`
extends `com.perblue.common.b.au`

**Fields (1):**
- `private final az a`

**Methods (6):**
- `boolean equals(Object)`
- `String toString()`
- `int hashCode()`
- `void a(r, q)`
- `void a(r)`
- `void a(p, List)`

### ag (class)
`com.perblue.common.b.ag`
extends `com.perblue.common.b.s`

**Methods (1):**

### ah (class)
`com.perblue.common.b.ah`
extends `com.perblue.common.b.s`

**Methods (1):**

### ai (class)
`com.perblue.common.b.ai`

**Fields (2):**
- `private m a`
- `private m b`

**Methods (7):**
- `List getRootNames()`
- `void validateParamter(String, String, r)`
- `void validateType(String, r)`
- `k getBehavior(String)`
- `o getCustomNode(String)`
- `u getExternalTable(String)`
- `s getVariable(String)`

### aj (class)
`com.perblue.common.b.aj`
extends `com.perblue.common.b.b`

**Methods (1):**
- `int doPostCheck$7d55ca98(n, l, List)`

### ak (class)
`com.perblue.common.b.ak`
extends `com.perblue.common.b.b`

**Methods (2):**
- `int doPostCheck$7d55ca98(n, l, List)`
- `void validateParamters(String[], r)`

### al (class)
`com.perblue.common.b.al`

**Fields (2):**
- `private static final ThreadLocal b`
- ` c a`

**Methods (3):**
- `void a(r)`
- `void a(r, q)`
- `List a(p)`

### am (class)
`com.perblue.common.b.am`

**Fields (6):**
- ` int a`
- ` boolean b`
- ` int c`
- ` at d`
- ` au e`
- ` d f`

**Methods (2):**
- `String toString()`

### an (class)
`com.perblue.common.b.an`
extends `com.perblue.common.b.d`

**Fields (1):**
- `private d b`

**Methods (4):**
- `String toString()`
- `int a(p)`
- `void a(r)`
- `int a(p, List)`

### ao (class)
`com.perblue.common.b.ao`
extends `com.perblue.common.b.b`

**Methods (3):**
- `int postCheck$7d55ca98(n, l, List)`
- `int preCheck$175133f7(n, l)`
- `void validateParamters(String[], r)`

### ap (class)
`com.perblue.common.b.ap`
extends `com.perblue.common.b.au`

**Fields (2):**
- ` au a`
- ` List b`

**Methods (7):**
- `boolean equals(Object)`
- `String toString()`
- `int hashCode()`
- `void a(r, q)`
- `int a(w)`
- `void a(p, List)`
- `void a(r)`

### aq (class)
`com.perblue.common.b.aq`

**Fields (3):**
- `static final aq a`
- ` String b`
- ` au c`

### ar (class)
`com.perblue.common.b.ar`
extends `java.lang.RuntimeException`

**Fields (1):**
- `private static final long serialVersionUID = 1`

### as (class)
`com.perblue.common.b.as`
extends `com.perblue.common.b.aw`

**Fields (1):**
- `private static final as a`

**Methods (1):**
- `c a()`

### at (class)
`com.perblue.common.b.at`

**Fields (1):**
- `static final at a`

**Methods (1):**
- `float a(p)`

### au (class)
`com.perblue.common.b.au`

**Fields (1):**
- `public static final au c`

**Methods (4):**
- `void a(r)`
- `void a(r, q)`
- `void a(p, List)`
- `int a(w)`

### av (class)
`com.perblue.common.b.av`

**Methods (3):**
- `int postCheck$7d55ca98(n, l, List)`
- `int preCheck$175133f7(n, l)`
- `void validateParamters(String[], r)`

### aw (class)
`com.perblue.common.b.aw`
extends `com.perblue.common.b.c`

**Fields (2):**
- `private final List roots`
- `private final Class typeEnum`

**Methods (3):**
- `List getRootNames()`
- `void validateParamter(String, String, r)`
- `void validateType(String, r)`

### ax (enum)
`com.perblue.common.b.ax`
extends `java.lang.Enum`

**Fields (4):**
- `public static final ax a`
- `public static final ax b`
- `private static ax c`
- `private static final ax[] d`

**Methods (3):**
- `ax[] values()`
- `ax valueOf(String)`
- `boolean a(String)`

**Constants (3):**
- INTEGER
- FLOAT
- BOOLEAN

### ay (class)
`com.perblue.common.b.ay`
extends `com.perblue.common.b.at`

**Fields (1):**
- `private float b`

**Methods (2):**
- `String toString()`
- `float a(p)`

### az (class)
`com.perblue.common.b.az`

**Methods (3):**
- `void a(r, Set)`
- `String a(p)`
- `String a()`

### b (class)
`com.perblue.common.b.b`

**Fields (2):**
- `private static final int RUNAWAY_BACKTRACK_LIMIT = 10000`
- `private int limitParamIndex`

**Methods (5):**
- `int doPostCheck$7d55ca98(n, l, List)`
- `int doPreCheck$175133f7(n, l)`
- `int postCheck$7d55ca98(n, l, List)`
- `int preCheck$175133f7(n, l)`
- `void validateParamters(String[], r)`

### ba (class)
`com.perblue.common.b.ba`
extends `com.perblue.common.b.au`

**Fields (1):**
- `private final az a`

**Methods (7):**
- `boolean equals(Object)`
- `String toString()`
- `int hashCode()`
- `void a(r, q)`
- `int a(w)`
- `void a(p, List)`
- `void a(r)`

### bb (class)
`com.perblue.common.b.bb`
extends `com.perblue.common.b.az`

**Fields (1):**
- `private final String a`

**Methods (6):**
- `boolean equals(Object)`
- `String toString()`
- `int hashCode()`
- `void a(r, Set)`
- `String a(p)`
- `String a()`

### bc (class)
`com.perblue.common.b.bc`
extends `com.perblue.common.b.d`

**Fields (2):**
- ` String b`
- ` String c`

**Methods (4):**
- `String toString()`
- `int a(p)`
- `void a(r)`
- `int a(p, List)`

### c (class)
`com.perblue.common.b.c`

**Fields (4):**
- `private Map behaviors`
- `private Map customNodes`
- `private Map externalTables`
- `private Map variables`

**Methods (8):**
- `void addBehavior(String, k)`
- `void addCustomNode(String, o)`
- `void addExternalTable(String, u)`
- `void addVariable(String, s)`
- `k getBehavior(String)`
- `o getCustomNode(String)`
- `u getExternalTable(String)`
- `s getVariable(String)`

### d (class)
`com.perblue.common.b.d`

**Fields (1):**
- `public static final d a`

**Methods (3):**
- `int a(p, List)`
- `void a(r)`
- `int a(p)`

### e (class)
`com.perblue.common.b.e`
extends `com.perblue.common.b.d`

**Fields (1):**
- `private List b`

**Methods (4):**
- `String toString()`
- `int a(p)`
- `void a(r)`
- `int a(p, List)`

### f (class)
`com.perblue.common.b.f`
extends `java.lang.Enum`

**Fields (4):**
- `public static final int a = 1`
- `public static final int b = 2`
- `public static final int c = 3`
- `private static final int[] d`

**Methods (1):**
- `int[] a()`

### g (class)
`com.perblue.common.b.g`
extends `com.perblue.common.b.au`

**Fields (3):**
- `private d a`
- `private au b`
- `private au d`

**Methods (6):**
- `boolean equals(Object)`
- `String toString()`
- `int hashCode()`
- `void a(r, q)`
- `void a(r)`
- `void a(p, List)`

### h (class)
`com.perblue.common.b.h`
extends `com.perblue.common.b.au`

**Fields (3):**
- `private final List a`
- `private final au b`
- `private final List d`

**Methods (7):**
- `boolean equals(Object)`
- `String toString()`
- `int hashCode()`
- `void a(r, q)`
- `int a(w)`
- `void a(p, List)`
- `void a(r)`

### i (class)
`com.perblue.common.b.i`
extends `com.perblue.common.b.az`

**Fields (1):**
- `private final List a`

**Methods (6):**
- `boolean equals(Object)`
- `String toString()`
- `int hashCode()`
- `void a(r, Set)`
- `String a(p)`
- `String a()`

### j (class)
`com.perblue.common.b.j`
extends `com.perblue.common.b.au`

**Fields (1):**
- `private final az a`

**Methods (6):**
- `boolean equals(Object)`
- `String toString()`
- `int hashCode()`
- `void a(r, q)`
- `void a(r)`
- `void a(p, List)`

### k (interface)
`com.perblue.common.b.k`

**Methods (3):**
- `int postCheck$7d55ca98(n, l, List)`
- `int preCheck$175133f7(n, l)`
- `void validateParamters(String[], r)`

### l (class)
`com.perblue.common.b.l`

**Fields (3):**
- `private final int a`
- `private final String[] b`
- `private final Random c`

**Methods (3):**
- `String[] b()`
- `Random c()`
- `int a()`

### m (interface)
`com.perblue.common.b.m`

**Methods (7):**
- `List getRootNames()`
- `void validateParamter(String, String, r)`
- `void validateType(String, r)`
- `k getBehavior(String)`
- `o getCustomNode(String)`
- `u getExternalTable(String)`
- `s getVariable(String)`

### n (class)
`com.perblue.common.b.n`

### o (interface)
`com.perblue.common.b.o`

**Methods (2):**
- `void getSummrayOfAll(r, q)`
- `List execute(p)`

### p (class)
`com.perblue.common.b.p`

**Fields (5):**
- `final n a`
- `final Random b`
- `final Map c`
- `final m d`
- ` int e`

**Methods (2):**
- `Random b()`
- `n a()`

### q (class)
`com.perblue.common.b.q`

**Fields (5):**
- ` boolean a`
- `private Set b`
- `private Map c`
- `private Map d`
- `private Map e`

**Methods (7):**
- `Set b()`
- `void b(String)`
- `void c()`
- `void a(Collection)`
- `Set a()`
- `Set a(String)`
- `void a(au, r)`

### r (interface)
`com.perblue.common.b.r`

**Methods (8):**
- `void b(String)`
- `Set c(String)`
- `u f(String)`
- `al d(String)`
- `void a(String)`
- `void a(String, String[])`
- `void a(String, String)`
- `o e(String)`

### s (class)
`com.perblue.common.b.s`

**Fields (2):**
- `private Set allValues`
- `private ax type`

**Methods (4):**
- `boolean validateValue(String, r)`
- `Set getAllValues(r)`
- `Set generateAllPossibleValues()`
- `String evaluate(Object)`

### t (class)
`com.perblue.common.b.t`

**Fields (3):**
- `private String a`
- `private float b`
- `private Map c`

**Methods (8):**
- `String toString()`
- `String b(String)`
- `float b()`
- `Map c()`
- `void a(String, String)`
- `void a(float)`
- `String a()`
- `void a(String)`

### u (class)
`com.perblue.common.b.u`

**Fields (5):**
- `public static final u a`
- ` Map b`
- ` m c`
- ` Set d`
- ` Set e`

**Methods (3):**
- `List a(n, Random)`
- `List a(String, n, Random)`
- `al a(String)`

### v (class)
`com.perblue.common.b.v`

**Fields (1):**
- `private List a`

**Methods (2):**
- `List a()`
- `boolean a(a)`

### w (class)
`com.perblue.common.b.w`

**Fields (10):**
- ` m a`
- ` Map b`
- ` Set c`
- ` Set d`
- `private PrintWriter e`
- `private boolean f`
- `private boolean g`
- `private int h`
- `private StringBuilder i`
- `private final Set j`

**Methods (27):**
- `d i(String)`
- `d h(String)`
- `at j(String)`
- `int b(String)`
- `void b(u)`
- `void b()`
- `int c(String)`
- `boolean c()`
- `au f(String)`
- `boolean d()`
- `au d(String)`
- `void a(v)`
- `void a(u)`
- `void a(m)`
- `u a()`
- `void a(PrintWriter)`
- `void a(String)`
- `void a(u, List, IdentityHashMap)`
- `void a(List)`
- `au e(String)`
- `al k(String)`
- `az g(String)`

### x (class)
`com.perblue.common.b.x`
extends `com.perblue.common.b.au`

**Fields (2):**
- `private final az a`
- `private final az b`

**Methods (7):**
- `boolean equals(Object)`
- `String toString()`
- `int hashCode()`
- `void a(r, q)`
- `int a(w)`
- `void a(p, List)`
- `void a(r)`

### y (class)
`com.perblue.common.b.y`
extends `com.perblue.common.b.b`

**Methods (2):**
- `int doPostCheck$7d55ca98(n, l, List)`
- `int doPreCheck$175133f7(n, l)`

### z (class)
`com.perblue.common.b.z`
extends `com.perblue.common.b.at`

**Fields (2):**
- `private float b`
- `private float c`

**Methods (2):**
- `String toString()`
- `float a(p)`

### c (class)
`com.perblue.common.c`

**Fields (2):**
- `private static boolean a`
- `private static final Log b`

**Methods (3):**
- `void a(boolean)`
- `void a(Throwable, String)`
- `void a(Throwable)`

### a (class)
`com.perblue.common.c.a`
extends `java.net.URLClassLoader`

**Methods (1):**
- `URL getResource(String)`

### b (class)
`com.perblue.common.c.b`

**Fields (1):**
- `private static ClassLoader a`

**Methods (5):**
- `void a(File)`
- `void a(File, ClassLoader)`
- `float a(float)`
- `void a()`
- `ResourceBundle a(String, Locale)`

### a (interface)
`com.perblue.common.d.a`

**Fields (2):**
- `public static final a a`
- `public static final a b`

**Methods (2):**
- `Class a()`
- `Object a(String)`

### b (class)
`com.perblue.common.d.b`

**Fields (1):**
- `private Class c`

**Methods (2):**
- `Class a()`

### c (class)
`com.perblue.common.d.c`
extends `java.lang.RuntimeException`

**Fields (1):**
- `private static final long serialVersionUID = 1`

### d (class)
`com.perblue.common.d.d`

**Fields (2):**
- `private static final d a`
- `private static final Log b`

**Methods (3):**
- `Map a(String, a, a, a)`
- `Map a(String, BufferedReader, a, a, a)`
- `String a(Object)`

### a (interface)
`com.perblue.common.e.a`

**Methods (5):**
- `c getShader$52b09d9d(int)`
- `b getScaledFont(String, int)`
- `String formatNumber(float)`
- `String formatSignedNumber(float)`
- `h getTweenManager()`

### a (class)
`com.perblue.common.e.a.a`
extends `com.badlogic.gdx.scenes.scene2d.ui.f`

**Fields (8):**
- `private static final b tempColor`
- `private a common`
- `private int currentValue`
- `protected boolean customShaderSet`
- `private boolean isChecked`
- `protected c shader`
- `protected float spread`
- `private int targetValue`

**Methods (18):**
- `void setAlignment(int, int)`
- `float getSpread()`
- `void setShader(c)`
- `void setSignedIntValue(int, boolean, float, boolean)`
- `void setSignedIntValue(int, boolean, float)`
- `void setSpread(float)`
- `void setShader$1153af74(int)`
- `int getIntTargetValue()`
- `void setStyle(a)`
- `void setChecked(boolean)`
- `boolean isChecked()`
- `int getIntValue()`
- `float getPrefHeight()`
- `void setIntValue(int, boolean, float)`
- `void setIntValue(int)`
- `c getShader()`
- `void draw$1d738a70(a, float)`
- `b getFont()`

### b (class)
`com.perblue.common.e.a.b`
extends `com.perblue.common.e.a.e`

**Fields (4):**
- `private static boolean C`
- `private float A`
- `private Map B`
- `private c z`

**Methods (20):**
- `void draw$1d738a70(a, float)`
- `char b(int)`
- `void b(a, CharSequence, b, float, float)`
- `void b()`
- `int b(Object)`
- `void b(String)`
- `int c(Object)`
- `int c()`
- `int d(Object)`
- `void d()`
- `void a(a, CharSequence, b, float, float)`
- `void a(int, int, CharSequence, int, int)`
- `void a(int)`
- `void a()`
- `CharSequence a(int, int)`
- `Object[] a(int, int, Class)`
- `void a(String)`
- `void a(Object, int, int, int)`
- `void a(Object)`
- `void e()`

### c (class)
`com.perblue.common.e.a.c`
extends `com.badlogic.gdx.graphics.glutils.t`

**Methods (1):**
- `void setCustomizedUniforms(float, b)`

### d (interface)
`com.perblue.common.e.a.d`

**Methods (14):**
- `char b(int)`
- `int b(Object)`
- `int c()`
- `int c(Object)`
- `int f()`
- `int d(Object)`
- `void d()`
- `void a(int)`
- `CharSequence a(int, int)`
- `Object[] a(int, int, Class)`
- `void a(Object, int, int, int)`
- `void a(Object)`
- `void a(int, int, CharSequence, int, int)`
- `void e()`

### e (class)
`com.perblue.common.e.a.e`
extends `com.badlogic.gdx.scenes.scene2d.ui.n`

**Fields (44):**
- `private static final p A`
- `private static final p B`
- `public static float a`
- `public static float b`
- `private static final p z`
- `private d C`
- `private j D`
- `private String E`
- `private CharSequence F`
- `private e G`
- `private int H`
- `private float I`
- `private float J`
- `private boolean K`
- `private char L`
- `private float M`
- `private float N`
- `private float O`
- `private int P`
- `private float Q`
- `private h R`
- `private boolean S`
- `private float T`
- `protected String c`
- `protected int d`
- `protected int e`
- `protected boolean f`
- `protected boolean g`
- ` b h`
- ` g i`
- ` c j`
- ` a k`
- ` b l`
- ` boolean m`
- ` boolean n`
- ` boolean o`
- ` boolean p`
- ` float q`
- `protected int r`
- `protected int s`
- ` boolean t`
- ` long u`
- `protected Object v`
- ` a w`

**Methods (35):**
- `float getPrefWidth()`
- `float getPrefHeight()`
- `void setDisabled(boolean)`
- `void draw$1d738a70(a, float)`
- `void i()`
- `void n()`
- `void h()`
- `void j()`
- `String l()`
- `int[] b(float)`
- `void b(boolean)`
- `void b(a, CharSequence, b, float, float)`
- `void b(String)`
- `boolean c(int)`
- `void c(float)`
- `int f()`
- `void d(int)`
- `void a(boolean, boolean)`
- `int a(float)`
- `int a(boolean)`
- `e a(a, e, p, p, boolean)`
- `void a(String)`
- `void a(CharSequence)`
- `void a(c)`
- `boolean a(char)`
- `void a(int)`
- `void a(a, CharSequence, b, float, float)`
- `void a()`
- `String a(int, CharSequence, String)`
- `void m()`
- `int k()`
- `b g()`

### a (class)
`com.perblue.common.f.a`

**Fields (2):**
- `private static final byte[] a`
- `private static final long b = -3750763034362895579`

**Methods (1):**
- `long a(byte[])`

### a (class)
`com.perblue.common.g.a.a`

**Fields (1):**
- `private ac widgetPool`

**Methods (5):**
- `o getWidget()`
- `void doneValidatingData()`
- `void freeWidget(o)`
- `o newWidget()`
- `void updateWidget(int, int, o, Object)`

### b (class)
`com.perblue.common.g.a.b`
extends `com.badlogic.gdx.scenes.scene2d.ui.j`

**Fields (12):**
- `private a a`
- `private o b`
- `private j c`
- `private int d`
- `private a e`
- `private a f`
- `private boolean g`
- `private boolean h`
- `private boolean i`
- `private a j`
- `private Comparator k`
- `private float l`

**Methods (12):**
- `void layout()`
- `void draw$1d738a70(a, float)`
- `void b()`
- `void a(Object[])`
- `void a(Comparator)`
- `void a(Iterable)`
- `j a()`
- `b a(o)`
- `void a(float)`
- `void a(a)`
- `void a(a)`
- `void validate()`

### c (interface)
`com.perblue.common.g.a.c`

**Methods (1):**
- `boolean a()`

### com.perblue.common.g.a.d [LOAD ERROR: Could not initialize class com.perblue.rpg.util.UIHelper]

### e (class)
`com.perblue.common.g.a.e`
extends `com.badlogic.gdx.scenes.scene2d.ui.g`

**Fields (11):**
- `private d a`
- `private e b`
- `private o c`
- `private List d`
- `private Map e`
- `private List f`
- `private List g`
- `private int h`
- `private float i`
- `private boolean j`
- `private String k`

**Methods (9):**
- `void invalidateHierarchy()`
- `float getPrefWidth()`
- `float getPrefHeight()`
- `void draw$1d738a70(a, float)`
- `void sizeChanged()`
- `boolean b()`
- `void a(o)`
- `void a()`
- `void a(int)`

### a (class)
`com.perblue.common.h.a`

**Fields (3):**
- `private static LogFactory a`
- `private static Log b`
- `private static Log c`

**Methods (1):**
- `Log a()`

### a (class)
`com.perblue.common.i.a`

**Fields (11):**
- `private static final Log LOG`
- `private Exception closingStackTraceIn`
- `private Exception closingStackTraceOut`
- `private final Deflater def`
- `private final byte[] inHolding`
- `private final Inflater inf`
- `private final byte[] keyIn`
- `private final byte[] keyOut`
- `private final byte[] outHolding`
- `private int posIn`
- `private int posOut`

**Methods (7):**
- `byte xorWithKey(boolean, byte[], byte)`
- `void closeIn()`
- `void closeOut()`
- `byte[] wrapIn(byte[])`
- `byte[] wrapOut(byte[])`
- `byte out(byte)`
- `byte in(byte)`

### a (class)
`com.perblue.common.j.a`
extends `java.util.Random`

**Fields (1):**
- `private static final a a`

**Methods (5):**
- `Object b(List)`
- `List a(int, int)`
- `Object a(List)`
- `Object a(Collection)`
- `a a()`

### b (class)
`com.perblue.common.j.b`

**Fields (1):**
- `private static final a a`

**Methods (1):**
- `a a()`

### a (class)
`com.perblue.common.k.a`
extends `java.lang.Enum`

**Fields (5):**
- `public static final int a = 1`
- `public static final int b = 2`
- `public static final int c = 3`
- `public static final int d = 4`
- `private static final int[] e`

### b (class)
`com.perblue.common.k.b`

**Fields (1):**
- `private static final ConcurrentMap a`

**Methods (2):**
- `List a(Class, boolean)`
- `void a(Object, Object)`

### c (class)
`com.perblue.common.k.c`

**Methods (12):**
- `float b(String)`
- `float b(String, float)`
- `int b(String, int)`
- `long b(String, long)`
- `List c(String)`
- `Set d(String)`
- `int a(String, int)`
- `float a(String, float)`
- `Set a(Class, String)`
- `long a(String, long)`
- `long a(String)`
- `long e(String)`

### DropTableStats (class)
`com.perblue.common.stats.DropTableStats`
extends `com.perblue.common.stats.GeneralStats`

**Fields (8):**
- `private static final Log LOG`
- `private m code`
- `private a curRow`
- `private v data`
- `private u dropTable`
- `private String filename`
- `private boolean hasErrors`
- `private StringWriter log`

**Methods (9):**
- `boolean shouldValidate()`
- `boolean hasErrors()`
- `void finishStats()`
- `boolean updateStats(Map)`
- `void initStats(int, int)`
- `void saveStat(Integer, a, String)`
- `StringWriter getLog()`
- `u getTable()`

### GeneralStats (class)
`com.perblue.common.stats.GeneralStats`

**Fields (5):**
- `private static final Log LOG`
- `private static Map fileToStatClassMapping`
- `private final a colConverter`
- `protected final Set parsedFiles`
- `private final a rowConverter`

**Methods (15):**
- `void coreParseStats(String, Object, Map)`
- `void onStatError(Exception, String, Object, Object, String)`
- `GeneralStats getStatClass(String)`
- `void parseEnumStats(Map, Class, String)`
- `void onMissingRow(String, Object)`
- `void finishStats()`
- `void parseUnknownStats(Map, String)`
- `String getPackageString()`
- `void updateStats(String, String)`
- `boolean updateStats(Map)`
- `void parseStats(String)`
- `void parseStats(Map, Class, String)`
- `void parseStats(String, String)`
- `void initStats(int, int)`
- `void saveStat(Object, Object, String)`

### RowGeneralStats (class)
`com.perblue.common.stats.RowGeneralStats`
extends `com.perblue.common.stats.GeneralStats`

**Fields (2):**
- `private Map rowData`
- `private Object rowHead`

**Methods (4):**
- `void saveRow(Object, Map)`
- `void finishStats()`
- `void initStats(int, int)`
- `void saveStat(Object, Object, String)`

### ServerShardStats (class)
`com.perblue.common.stats.ServerShardStats`
extends `com.perblue.common.stats.ShardStats`

**Fields (2):**
- `private static final Log a`
- `private static boolean b`

**Methods (1):**
- `void a(int, Map)`

### ShardStats (class)
`com.perblue.common.stats.ShardStats`

**Fields (3):**
- `private String a`
- `private final GeneralStats b`
- `private int c`

**Methods (2):**
- `void a(int, Map)`
- `GeneralStats a()`

### a (class)
`com.perblue.common.stats.a`
extends `com.perblue.common.stats.GeneralStats`

**Fields (4):**
- `private static final Log LOG`
- `private List columns`
- `private Map columnsScratch`
- `private int rowCount`

**Methods (6):**
- `a getCurrentColumn(long)`
- `void finishStats()`
- `void initStats(int, int)`
- `void saveStat(Object, a, String)`
- `List getColumns()`

