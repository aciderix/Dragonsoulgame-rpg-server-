# OBFUSCATED-A - Core Framework
Package prefix: `com.perblue.a`
Classes: 17

## com.perblue.a.a.a
```
public abstract interface interface a

  // Methods (4)
  public abstract byte[] wrapOut(byte[])
  public abstract void closeIn()
  public abstract void closeOut()
  public abstract byte[] wrapIn(byte[])
```

## com.perblue.a.a.a.a
```
public final class a extends java.io.ByteArrayInputStream

  // Fields (1)
  private List a

  // Constructors (1)
  com.perblue.a.a.a.a(byte[])

  // Methods (3)
  public final void b()
  public final void a()
  public final int available()
```

## com.perblue.a.a.a.b
```
public final class b extends java.io.ByteArrayOutputStream

  // Fields (2)
  private static final byte[] a
  private List b

  // Constructors (1)
  com.perblue.a.a.a.b()

  // Methods (2)
  public final void b()
  public final void a()
```

## com.perblue.a.a.b
```
 class b implements com.perblue.a.a.a

  // Constructors (1)
  com.perblue.a.a.b()

  // Methods (4)
  public byte[] wrapOut(byte[])
  public void closeIn()
  public void closeOut()
  public byte[] wrapIn(byte[])
```

## com.perblue.a.a.c
```
final class c implements com.perblue.a.a.f

  // Fields (1)
  private static final c a

  // Constructors (1)
  com.perblue.a.a.c()

  // Methods (3)
  public final void onOpen(e)
  public final void onClose(e)
  public static c a()
```

## com.perblue.a.a.d
```
public final class d

  // Fields (10)
  private final j a
  private String b
  private int c
  private Executor d
  private f e
  private int f
  private Class g
  private int h
  private boolean i
  private boolean j

  // Constructors (1)
  com.perblue.a.a.d(j)

  // Methods (10)
  public final d b(int)
  public final d b(boolean)
  public final d c(int)
  public final e a()
  public final d a(f)
  public final d a(int)
  public final d a(Executor)
  public final d a(boolean)
  public final d a(Class)
  public final d a(String)
```

## com.perblue.a.a.e
```
public abstract interface interface e

  // Methods (4)
  public abstract void b()
  public abstract void a()
  public abstract void a(Class, h)
  public abstract void a(i)
```

## com.perblue.a.a.f
```
public abstract interface interface f

  // Methods (2)
  public abstract void onOpen(e)
  public abstract void onClose(e)
```

## com.perblue.a.a.g
```
public final class g extends java.lang.Exception

  // Fields (1)
  private static final long serialVersionUID = 1

  // Constructors (2)
  com.perblue.a.a.g(String)
  com.perblue.a.a.g(String, Throwable)
```

## com.perblue.a.a.h
```
public abstract interface interface h

  // Methods (1)
  public abstract void onReceive(e, i)
```

## com.perblue.a.a.i
```
public abstract class i

  // Fields (6)
  private final String fullName
  private int messageNumber
  private int responseMessageNumber
  private m router$739a3767
  private int storedMetaTag
  private l version

  // Constructors (2)
  com.perblue.a.a.i(String)
  com.perblue.a.a.i(String, a)

  // Methods (18)
  public abstract void writeData(b)
  public int getMessageNumber()
  protected int readNextMetaTag(InputStream)
  public abstract void writeDataV1(b)
  protected m getCallbackRouter$2325d668()
  public int getResponseMessageNumber()
  public void setResponseMessageNumber(int)
  protected int shouldReadNext$3f1f0bd2(int, InputStream)
  public void removeListener(Class)
  protected void rollBackMetaTag(int)
  public void setAsReplyTo(i)
  public void setMessageNumber(int)
  public void setVersion(l)
  public void writeAll(b)
  public void writeAll(b, l)
  public void setListener(Class, h)
  public String getFullName()
  public l getVersion()
```

## com.perblue.a.a.j
```
public abstract interface interface j

  // Methods (1)
  public abstract i readMessage(a)
```

## com.perblue.a.a.k
```
 class k implements com.perblue.a.a.e

  // Fields (16)
  private static final Log a
  private final AtomicBoolean b
  private final Socket c
  private final Thread d
  private final AtomicBoolean e
  private final j f
  private final m g
  private final m h
  private final Map i
  private final Executor j
  private BufferedInputStream k
  private b l
  private OutputStream m
  private int n
  private final f o
  private final a p

  // Constructors (1)
  com.perblue.a.a.k(String, int, j, Executor, f, int, Class, int, boolean, boolean)

  // Methods (15)
  public final void b()
  public final void a()
  public final void a(i)
  public final void a(Class, h)
```

## com.perblue.a.a.l
```
public final enum l extends java.lang.Enum

  // Fields (4)
  public static final l a
  public static final l b
  private static final l[] d
  private final int c

  // Constructors (1)
  com.perblue.a.a.l(String, int, int)

  // Methods (3)
  public static l[] values()
  public static l valueOf(String)
  public final int a()
```

## com.perblue.a.a.m
```
 class m

  // Fields (1)
  private final Map a

  // Constructors (1)
  com.perblue.a.a.m()

  // Methods (3)
  public boolean a(e, i)
  public void a(Class, h)
  public void a(Class)
```

## com.perblue.a.a.n
```
final class n implements java.util.concurrent.ThreadFactory

  // Fields (4)
  private AtomicInteger a
  private ThreadGroup b
  private AtomicInteger c
  private String d

  // Constructors (1)
  com.perblue.a.a.n(String)

  // Methods (1)
  public final Thread newThread(Runnable)
```

## com.perblue.a.a.o
```
public final class o extends java.lang.Enum

  // Fields (4)
  public static final int a = 1
  public static final int b = 2
  public static final int c = 3
  private static final int[] d

  // Methods (1)
  public static int[] a()
```


---
# Inner Classes (5)

## com.perblue.a.a.k$1
```
final class  implements java.lang.Runnable

  // Fields (1)
  private k a

  // Constructors (1)
  com.perblue.a.a.k$1(k)

  // Methods (1)
  public final void run()
```

## com.perblue.a.a.k$a
```
final class a extends java.lang.Thread

  // Fields (1)
  final k a

  // Constructors (2)
  com.perblue.a.a.k$a(k)

  // Methods (1)
  public final void run()
```

## com.perblue.a.a.k$a$1
```
final class  implements java.lang.Runnable

  // Fields (2)
  private i a
  private a b

  // Constructors (1)
  com.perblue.a.a.k$a$1(a, i)

  // Methods (1)
  public final void run()
```

## com.perblue.a.a.k$a$2
```
final class  implements java.lang.Runnable

  // Fields (3)
  private m a
  private i b
  private a c

  // Constructors (1)
  com.perblue.a.a.k$a$2(a, m, i)

  // Methods (1)
  public final void run()
```

## com.perblue.a.a.k$a$3
```
final class  implements java.lang.Runnable

  // Fields (1)
  private a a

  // Constructors (1)
  com.perblue.a.a.k$a$3(a)

  // Methods (1)
  public final void run()
```

