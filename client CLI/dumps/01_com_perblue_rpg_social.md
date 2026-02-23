# SOCIAL - Social Features
Package prefix: `com.perblue.rpg.social`
Classes: 2

## com.perblue.rpg.social.ISocialNetwork
```
public abstract interface interface ISocialNetwork

  // Methods (16)
  public abstract void showAchievements()
  public abstract void showFriends()
  public abstract void showHomePage()
  public abstract void signOut(SignOutCallback)
  public abstract void signIn(SignInCallback)
  public abstract String getFriendDisplayName(String)
  public abstract AuthType getAuthType()
  public abstract String getCachedID()
  public abstract List getFriendIDs()
  public abstract void getProfileDrawable(String, ProfileDrawableCallback)
  public abstract void inviteFriends(String)
  public abstract void achievementUpdate(int, String)
  public abstract void requestUserInfo(UserInfoCallback)
  public abstract boolean isSignedIn()
  public abstract void clearListeners()
  public abstract void init()
```

## com.perblue.rpg.social.SocialNetworkManager
```
public abstract interface interface SocialNetworkManager

  // Methods (4)
  public abstract ISocialNetwork getGooglePlus()
  public abstract ISocialNetwork getGameCenter()
  public abstract ISocialNetwork getGameCircle()
  public abstract ISocialNetwork getFacebook()
```


---
# Inner Classes (5)

## com.perblue.rpg.social.ISocialNetwork$ProfileDrawableCallback
```
public abstract static interface interface ProfileDrawableCallback

  // Methods (1)
  public abstract void onProfileDrawable(String, i)
```

## com.perblue.rpg.social.ISocialNetwork$SignInCallback
```
public abstract static interface interface SignInCallback

  // Methods (1)
  public abstract void onSignIn(boolean)
```

## com.perblue.rpg.social.ISocialNetwork$SignOutCallback
```
public abstract static interface interface SignOutCallback

  // Methods (1)
  public abstract void onSignOut(boolean)
```

## com.perblue.rpg.social.ISocialNetwork$UserDataType
```
public static final enum UserDataType extends java.lang.Enum

  // Fields (14)
  private static final UserDataType[] $VALUES
  public static final UserDataType BIRTHDAY
  public static final UserDataType DISPLAY_NAME
  public static final UserDataType FIRSTNAME
  public static final UserDataType GENDER
  public static final UserDataType HOMETOWN
  public static final UserDataType ID
  public static final UserDataType LASTNAME
  public static final UserDataType LOCALE
  public static final UserDataType LOCATION
  public static final UserDataType MAXAGE
  public static final UserDataType MINAGE
  public static final UserDataType NICKNAME
  public static final UserDataType TIMEZONE

  // Constructors (1)
  com.perblue.rpg.social.ISocialNetwork$UserDataType(String, int)

  // Methods (2)
  public static UserDataType[] values()
  public static UserDataType valueOf(String)
```

## com.perblue.rpg.social.ISocialNetwork$UserInfoCallback
```
public abstract static interface interface UserInfoCallback

  // Methods (1)
  public abstract void onUserInfo(Map)
```

