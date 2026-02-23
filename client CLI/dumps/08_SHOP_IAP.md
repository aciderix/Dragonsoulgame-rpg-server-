# DragonSoul - Shop & In-App Purchase System

## Package: com.perblue.rpg.purchasing (3 classes)

### AbstractPurchasing (class)
`com.perblue.rpg.purchasing.AbstractPurchasing`

**Fields (3):**
- `protected RPGMain game`
- `protected Set inProcessPurchases`
- `protected volatile boolean isPurchasingSetup`

**Methods (8):**
- `void initializePreNetwork()`
- `String getDefaultProductCost(String)`
- `Set getInProcessPurchases()`
- `Collection getProductIds()`
- `void initializePurchasing(NetworkProvider)`
- `void initializePurchasing()`
- `void setupGruntListeners()`
- `boolean isSetup()`

### DesktopPurchasing (class)
`com.perblue.rpg.purchasing.DesktopPurchasing`
extends `com.perblue.rpg.purchasing.AbstractPurchasing`

**Methods (4):**
- `String getProductCost(String)`
- `PurchaseErrorState startPurchase(String, String, String)`
- `void initializePurchasing()`
- `void setupGruntListeners()`

### IPurchasing (interface)
`com.perblue.rpg.purchasing.IPurchasing`

**Methods (7):**
- `void initializePreNetwork()`
- `Set getInProcessPurchases()`
- `String getProductCost(String)`
- `PurchaseErrorState startPurchase(String, String, String)`
- `void initializePurchasing(NetworkProvider)`
- `void setupGruntListeners()`
- `boolean isSetup()`

### PurchaseResponseBuilder (class)
`com.amazon.device.iap.internal.model.PurchaseResponseBuilder`

**Fields (4):**
- `private Receipt receipt`
- `private RequestId requestId`
- `private RequestStatus requestStatus`
- `private UserData userData`

**Methods (9):**
- `Receipt getReceipt()`
- `RequestId getRequestId()`
- `RequestStatus getRequestStatus()`
- `UserData getUserData()`
- `PurchaseResponseBuilder setReceipt(Receipt)`
- `PurchaseResponseBuilder setRequestId(RequestId)`
- `PurchaseResponseBuilder setRequestStatus(RequestStatus)`
- `PurchaseResponseBuilder setUserData(UserData)`
- `PurchaseResponse build()`

### PurchaseUpdatesResponseBuilder (class)
`com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder`

**Fields (5):**
- `private boolean hasMore`
- `private List receipts`
- `private RequestId requestId`
- `private RequestStatus requestStatus`
- `private UserData userData`

**Methods (11):**
- `RequestId getRequestId()`
- `RequestStatus getRequestStatus()`
- `UserData getUserData()`
- `PurchaseUpdatesResponseBuilder setRequestId(RequestId)`
- `PurchaseUpdatesResponseBuilder setRequestStatus(RequestStatus)`
- `PurchaseUpdatesResponseBuilder setUserData(UserData)`
- `boolean hasMore()`
- `List getReceipts()`
- `PurchaseUpdatesResponseBuilder setHasMore(boolean)`
- `PurchaseUpdatesResponseBuilder setReceipts(List)`
- `PurchaseUpdatesResponse build()`

### PurchaseResponse (class)
`com.amazon.device.iap.model.PurchaseResponse`

**Fields (9):**
- `private static final String RECEIPT = receipt`
- `private static final String REQUEST_ID = requestId`
- `private static final String REQUEST_STATUS = requestStatus`
- `private static final String TO_STRING_FORMAT = (%s, requestId: "%s", purchaseRequestStatus: "%s", userId: "%s", receipt: %s)`
- `private static final String USER_DATA = userData`
- `private final Receipt receipt`
- `private final RequestId requestId`
- `private final RequestStatus requestStatus`
- `private final UserData userData`

**Methods (6):**
- `JSONObject toJSON()`
- `Receipt getReceipt()`
- `RequestId getRequestId()`
- `RequestStatus getRequestStatus()`
- `UserData getUserData()`
- `String toString()`

### PurchaseUpdatesResponse (class)
`com.amazon.device.iap.model.PurchaseUpdatesResponse`

**Fields (11):**
- `private static final String HAS_MORE = HAS_MORE`
- `private static final String RECEIPTS = RECEIPTS`
- `private static final String REQUEST_ID = REQUEST_ID`
- `private static final String REQUEST_STATUS = REQUEST_STATUS`
- `private static final String TO_STRING_FORMAT = (%s, requestId: "%s", requestStatus: "%s", userData: "%s", receipts: %s, hasMore: "%b")`
- `private static final String USER_DATA = USER_DATA`
- `private final boolean hasMore`
- `private final List receipts`
- `private final RequestId requestId`
- `private final RequestStatus requestStatus`
- `private final UserData userData`

**Methods (7):**
- `JSONObject toJSON()`
- `RequestId getRequestId()`
- `RequestStatus getRequestStatus()`
- `UserData getUserData()`
- `boolean hasMore()`
- `List getReceipts()`
- `String toString()`

### AmazonInAppPurchase (class)
`com.perblue.rpg.android.purchasing.AmazonInAppPurchase`
extends `com.perblue.rpg.purchasing.AbstractPurchasing`

**Fields (5):**
- `private static boolean REQUEST_ALL_PURCHASES`
- `private Activity activity`
- `private IAnalytics analytics`
- `private Map availableProducts`
- `private Map requestEntryPointMap`

**Methods (21):**
- `String getProductCost(String)`
- `PurchaseErrorState startPurchase(String, String, String)`
- `void onPurchaseResponse(PurchaseResponse)`
- `void onUserDataResponse(UserDataResponse)`
- `void processReceipts(List, String)`
- `void handleVerificationResponse(AmazonVerificationResponse)`
- `void onProductDataResponse(ProductDataResponse)`
- `void onPurchaseUpdatesResponse(PurchaseUpdatesResponse)`
- `void initializePurchasing()`
- `void setupGruntListeners()`

### GoogleInAppPurchase (class)
`com.perblue.rpg.android.purchasing.GoogleInAppPurchase`
extends `com.perblue.rpg.purchasing.AbstractPurchasing`

**Fields (13):**
- `private static final String TAG = com.perblue.rpg.android.purchasing.GoogleInAppPurchase`
- `private Activity activity`
- `private IAnalytics analytics`
- `private String entryPoint`
- `private int inProgressPurchases`
- `private a mConsumeFinishedListener`
- `private b mConsumeMultiFinishedListener`
- `private e mGotInventoryListener`
- `private c mPurchaseFinishedListener`
- `private b purchaseHelper`
- `private String purchaseID`
- `private List skuDetails`
- `private List verificationReponses`

**Methods (30):**
- `String getProductCost(String)`
- `PurchaseErrorState startPurchase(String, String, String)`
- `void handleVerificationResponse(IAPVerificationResponse)`
- `String getItemType(String)`
- `boolean handleActivityResult(int, int, Intent)`
- `void initializePurchasing()`
- `void setupGruntListeners()`
- `void destroy()`

### com.perblue.rpg.game.data.misc.RaidTicketPurchaseStats [LOAD ERROR: Could not initialize class com.perblue.rpg.game.data.misc.RaidTicketPurchaseStats]

### FirstDailyPurchaseEvent (class)
`com.perblue.rpg.game.specialevent.FirstDailyPurchaseEvent`
extends `com.perblue.rpg.game.specialevent.PurchaseEvent`

**Methods (1):**
- `boolean isUserEligibleInternal(IUser, long, boolean, boolean, boolean)`

### FirstPurchaseEvent (class)
`com.perblue.rpg.game.specialevent.FirstPurchaseEvent`
extends `com.perblue.rpg.game.specialevent.PurchaseEvent`

**Methods (1):**
- `boolean isUserEligibleInternal(IUser, long, boolean, boolean, boolean)`

### GuildGiftPurchaseEvent (class)
`com.perblue.rpg.game.specialevent.GuildGiftPurchaseEvent`
extends `com.perblue.rpg.game.specialevent.PurchaseEvent`

**Fields (2):**
- `private RewardMessage guildMessage`
- `private List guildRewards`

**Methods (3):**
- `void addRewards(IUser, List, List, int)`
- `EventReward getGuildRewards(int)`
- `boolean load(SpecialEventType, t, int)`

### PurchaseEvent (class)
`com.perblue.rpg.game.specialevent.PurchaseEvent`
extends `com.perblue.rpg.game.specialevent.RewardSpecialEvent`

**Fields (4):**
- `protected boolean ladderRewards`
- `protected int maxRewardTimes`
- `protected int maxStackTimes`
- `protected int requiredPurchaseAmount`

**Methods (6):**
- `void addRewards(IUser, List, List, int)`
- `void modifyExtra(MailExtra)`
- `boolean isUserEligibleInternal(IUser, long, boolean, boolean, boolean)`
- `boolean isLadderRewards()`
- `void onStorePurchase(IUser, int, List, List)`
- `boolean load(SpecialEventType, t, int)`

### ShopBonus (class)
`com.perblue.rpg.game.specialevent.ShopBonus`
extends `com.perblue.rpg.game.specialevent.SpecialEventInfo`

**Fields (2):**
- `private List affectedMerchants`
- `private int multiplier`

**Methods (2):**
- `void refreshInternal(long, SpecialEventsHelperState)`
- `boolean load(SpecialEventType, t, int)`

### BetaPurchase (class)
`com.perblue.rpg.network.messages.BetaPurchase`
extends `com.perblue.a.a.i`

**Fields (4):**
- `private static final String FULL_NAME = BetaPurchase1`
- `public String entryPoint`
- `public String productId`
- `public String purchaseID`

**Methods (6):**
- `void innerReadV1(a, boolean)`
- `boolean innerRead(a)`
- `String getFullName_Static()`
- `void writeData(b)`
- `void writeDataV1(b)`
- `String toString()`

### IAPCompletePurchase (class)
`com.perblue.rpg.network.messages.IAPCompletePurchase`
extends `com.perblue.a.a.i`

**Fields (2):**
- `private static final String FULL_NAME = IAPCompletePurchase1`
- `public String purchaseData`

**Methods (6):**
- `void innerReadV1(a, boolean)`
- `boolean innerRead(a)`
- `String getFullName_Static()`
- `void writeData(b)`
- `void writeDataV1(b)`
- `String toString()`

### IAPProduct (class)
`com.perblue.rpg.network.messages.IAPProduct`
extends `com.perblue.a.a.i`

**Fields (7):**
- `private static final String FULL_NAME = IAPProduct1`
- `public Integer baseDiamonds`
- `public Integer baseVIPTickets`
- `public Integer bonusDiamonds`
- `public Integer bonusVIPTickets`
- `public String productID`
- `public SaleBadgeType saleBadgeType`

**Methods (6):**
- `void innerReadV1(a, boolean)`
- `boolean innerRead(a)`
- `String getFullName_Static()`
- `void writeData(b)`
- `void writeDataV1(b)`
- `String toString()`

### IAPProducts (class)
`com.perblue.rpg.network.messages.IAPProducts`
extends `com.perblue.a.a.i`

**Fields (2):**
- `private static final String FULL_NAME = IAPProducts1`
- `public List products`

**Methods (7):**
- `boolean innerReadFieldProducts(a)`
- `void innerReadV1(a, boolean)`
- `boolean innerRead(a)`
- `String getFullName_Static()`
- `void writeData(b)`
- `void writeDataV1(b)`
- `String toString()`

### IAPVerificationRequest (class)
`com.perblue.rpg.network.messages.IAPVerificationRequest`
extends `com.perblue.a.a.i`

**Fields (8):**
- `private static final String FULL_NAME = IAPVerificationRequest1`
- `public String entryPoint`
- `public String failureMessage`
- `public String productID`
- `public String purchaseID`
- `public String signature`
- `public String signedData`
- `public Boolean success`

**Methods (6):**
- `void innerReadV1(a, boolean)`
- `boolean innerRead(a)`
- `String getFullName_Static()`
- `void writeData(b)`
- `void writeDataV1(b)`
- `String toString()`

### IAPVerificationResponse (class)
`com.perblue.rpg.network.messages.IAPVerificationResponse`
extends `com.perblue.a.a.i`

**Fields (3):**
- `private static final String FULL_NAME = IAPVerificationResponse1`
- `public String purchaseData`
- `public Boolean valid`

**Methods (6):**
- `void innerReadV1(a, boolean)`
- `boolean innerRead(a)`
- `String getFullName_Static()`
- `void writeData(b)`
- `void writeDataV1(b)`
- `String toString()`

### IOSPurchaseLog (class)
`com.perblue.rpg.network.messages.IOSPurchaseLog`
extends `com.perblue.a.a.i`

**Fields (6):**
- `private static final String FULL_NAME = IOSPurchaseLog1`
- `public String note`
- `public String productID`
- `public Long transactionDate`
- `public String transactionID`
- `public String transactionState`

**Methods (6):**
- `void innerReadV1(a, boolean)`
- `boolean innerRead(a)`
- `String getFullName_Static()`
- `void writeData(b)`
- `void writeDataV1(b)`
- `String toString()`

### InAppPurchaseError (class)
`com.perblue.rpg.network.messages.InAppPurchaseError`
extends `com.perblue.a.a.i`

**Fields (5):**
- `private static final String FULL_NAME = InAppPurchaseError1`
- `public String errorMessage`
- `public String productId`
- `public String transactionId`
- `public Boolean validationFailed`

**Methods (6):**
- `void innerReadV1(a, boolean)`
- `boolean innerRead(a)`
- `String getFullName_Static()`
- `void writeData(b)`
- `void writeDataV1(b)`
- `String toString()`

### InAppPurchaseVerified (class)
`com.perblue.rpg.network.messages.InAppPurchaseVerified`
extends `com.perblue.a.a.i`

**Fields (3):**
- `private static final String FULL_NAME = InAppPurchaseVerified1`
- `public String productId`
- `public String transactionId`

**Methods (6):**
- `void innerReadV1(a, boolean)`
- `boolean innerRead(a)`
- `String getFullName_Static()`
- `void writeData(b)`
- `void writeDataV1(b)`
- `String toString()`

### InAppPurchaseVerifiedAndGiven (class)
`com.perblue.rpg.network.messages.InAppPurchaseVerifiedAndGiven`
extends `com.perblue.a.a.i`

**Fields (3):**
- `private static final String FULL_NAME = InAppPurchaseVerifiedAndGiven1`
- `public String productId`
- `public String transactionId`

**Methods (6):**
- `void innerReadV1(a, boolean)`
- `boolean innerRead(a)`
- `String getFullName_Static()`
- `void writeData(b)`
- `void writeDataV1(b)`
- `String toString()`

### PurchaseMerchantItem (class)
`com.perblue.rpg.network.messages.PurchaseMerchantItem`
extends `com.perblue.a.a.i`

**Fields (6):**
- `private static final String FULL_NAME = PurchaseMerchantItem1`
- `public Integer expectedCost`
- `public Integer expectedQuantity`
- `public RewardDrop itemToPurchase`
- `public MerchantType merchantType`
- `public Integer typeIndex`

**Methods (7):**
- `boolean innerReadFieldItemToPurchase(a)`
- `void innerReadV1(a, boolean)`
- `boolean innerRead(a)`
- `String getFullName_Static()`
- `void writeData(b)`
- `void writeDataV1(b)`
- `String toString()`

### RequestInAppPurchaseForVerify (class)
`com.perblue.rpg.network.messages.RequestInAppPurchaseForVerify`
extends `com.perblue.a.a.i`

**Fields (4):**
- `private static final String FULL_NAME = RequestInAppPurchaseForVerify1`
- `public String productId`
- `public String receiptData`
- `public String transactionId`

**Methods (6):**
- `void innerReadV1(a, boolean)`
- `boolean innerRead(a)`
- `String getFullName_Static()`
- `void writeData(b)`
- `void writeDataV1(b)`
- `String toString()`

### GenericPurchasePrompt (class)
`com.perblue.rpg.ui.widgets.GenericPurchasePrompt`
extends `com.perblue.rpg.ui.widgets.BorderedWindow`

### MerchantPurchaseWindow (class)
`com.perblue.rpg.ui.widgets.custom.MerchantPurchaseWindow`
extends `com.perblue.rpg.ui.widgets.BorderedWindow`

**Fields (4):**
- `private List heroesThatNeedItem`
- `private IMerchantItem item`
- `private ItemPurchaseListener listener`
- `private MerchantType merchantType`

**Methods (5):**
- `void layoutItem()`
- `void layoutRune()`
- `String getTitle(IMerchantItem)`

