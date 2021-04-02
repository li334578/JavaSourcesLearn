package main.java.com.company.JavaSourceLearn.sources.JavaLang.otherClass.Thread_test;


/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Thread
 * @date : 2021-01-02 13:31:24
 */
public class ThreadExample1 {
    // 线程是比进程更轻量级的调度执行单位
    public static void main(String[] args) {
        // 内部类
        // WeakClassKey 弱引用相关类
        // 引用者的hash值
        // private final int hash;
        // 为给定对象创建一个新的WeakClassKey，并在队列中注册。
        /*
         * WeakClassKey(Class<?> cl, ReferenceQueue<Class<?>> refQueue) {
         *             super(cl, refQueue);
         *             hash = System.identityHashCode(cl);
         *         }
         */
        // 获取HashCode方法
        /*
         * public int hashCode() {
         *             return hash;
         *         }
         */
        // 如果给定对象是相同的WeakClassKey实例，则返回true，
        // 或者如果尚未清除该对象的引用，则如果给定对象是另一个WeakClassKey实例，
        // 且具有与此对象相同的非null引用，则返回true
        /*
         * public boolean equals(Object obj) {
         *             if (obj == this)
         *                 return true;
         *
         *             if (obj instanceof WeakClassKey) {
         *                 Object referent = get();
         *                 return (referent != null) &&
         *                        (referent == ((WeakClassKey) obj).get());
         *             } else {
         *                 return false;
         *             }
         *         }
         */
        // Caches类
        // 子类安全审核结果的缓存
        // static final ConcurrentMap<WeakClassKey,Boolean> subclassAudits = new ConcurrentHashMap<>();
        // 排队等待对已审计子类的弱引用
        // static final ReferenceQueue<Class<?>> subclassAuditsQueue = new ReferenceQueue<>();
        // State 内部枚举类 枚举Thread的状态值
        // 初始态 线程创建完毕还未启动未调用start方法
        System.out.println(Thread.State.NEW);
        // 包含两种状态 就绪、运行
        System.out.println(Thread.State.RUNNABLE);
        // 阻塞态 synchronized会导致线程进入阻塞态
        System.out.println(Thread.State.BLOCKED);
        // 等待 3种情况调用后会导致线程处于这个状态
        /*
         * 1、Object.wait
         * 2、Thread.join
         * 3、LockSupport.park
         * 等待态的线程会等待其他线程执行特定的操作
         * 例如一个线程调用了Object.wait之后进入等待态，
         * 另一个线程调用Object.notify或Object.notifyAll可以将其唤醒，被唤醒的线程需要获取对象的锁才能恢复执行
         * 调用Thread.join会等待指定的线程终止
         * */
        System.out.println(Thread.State.WAITING);
        // 超时等待态 线程等待指定的时间再执行 5种情况调用后会导致线程处于这个状态
        /*
         * 1.Thread.sleep
         * 2.Object.wait 传入等待时长
         * 3.Thread.join 传入等待时长
         * 4.LockSupport.parkNanos
         * 5.LockSupport.parkUntil
         * */
        System.out.println(Thread.State.TIMED_WAITING);
        // 终止态 线程执行完毕的状态
        System.out.println(Thread.State.TERMINATED);
        // UncaughtExceptionHandler 接口
        // 当有未捕捉的异常而即将结束时，JVM会通过getUncaughtExceptionHandler 获取该线程的未捕捉异常处理器，
        // 并调用uncaughtException 方法。它会将线程和错误信息作为参数传入。
        // 如果没有设置处理器，那就会使用当前线程组的处理器处理。
        // void uncaughtException(Thread t, Throwable e);
        // Thread内容
        // private static native void registerNatives();
        // 注册到本地
        /*
         * static {
         *         registerNatives();
         *     }
         */
        // 初始化方法
        // 使用当前的AccessControlContext初始化线程。
        /*
         * private void init(ThreadGroup g, Runnable target, String name,
         *                       long stackSize) {
         *         init(g, target, name, stackSize, null);
         *     }
         */
        // 初始化一个线程
        // 参数： 线程组g 调用run方法的目标对象target 新线程的名字name
        //       新线程所需的堆栈大小stackSize 访问要继承的AccessControlContext
        /*
         * private void init(ThreadGroup g, Runnable target, String name,
         *                       long stackSize, AccessControlContext acc) {
         *         if (name == null) {
         *             throw new NullPointerException("name cannot be null");
         *         }
         *
         *         this.name = name;
         *         当前正在执行的线程为父线程
         *         Thread parent = currentThread();
         *         系统性安全管理器
         *         SecurityManager security = System.getSecurityManager();
         *         if (g == null) {
         *          确定它是否是applet
         *          若存在安全管理器 询问安全管理器
         *         if (security != null) {
         *          返回被调用时实例化正在创建的任何新线程的线程组。 默认情况下，它返回当前线程的线程组
         *             g = security.getThreadGroup();
         *         }
         *          如果安全性对这个问题没有很强的意见，可以使用父线程组。
         *         if (g == null) {
         *             g = parent.getThreadGroup();
         *         }
         *     }
         *          检查访问，不管是否显式地传入threadgroup
         *         g.checkAccess();
         *          有所需的权限吗?
         *         if (security != null) {
         *          验证是否可以在不违反安全约束的情况下构造此（可能是子类）实例：
         *          子类不得覆盖对安全性敏感的非最终方法，否则将检查
         *         if (isCCLOverridden(getClass())) {
         *           如果基于当前有效的安全策略不允许给定权限指定的请求访问，则引发SecurityException 。
         *           此方法使用给定的权限调用AccessController.checkPermission
         *             security.checkPermission(SUBCLASS_IMPLEMENTATION_PERMISSION);
         *         }
         *     }
         *          增加线程组中未启动线程的数量。
         *          未启动的线程不会添加到线程组中，这样即使从未启动过的线程也不会被收集，
         *          但是必须对它们进行计数，以便不会破坏其中未启动的线程的守护程序线程组
         *         g.addUnstarted();
         *          设置线程组
         *         this.group = g;
         *          根据父线程设置为是否为守护线程
         *         this.daemon = parent.isDaemon();
         *          根据父线程设置优先级
         *         this.priority = parent.getPriority();
         *          安全管理器为null或者当前有效的安全策略允许访问
         *         if (security == null || isCCLOverridden(parent.getClass()))
         *              设置通过方法获取的父线程的上下文ClassLoader
         *             this.contextClassLoader = parent.getContextClassLoader();
         *         else
         *              设置通过属性获取的父线程的上下文ClassLoader
         *                 this.contextClassLoader = parent.contextClassLoader;
         *          该线程的继承的AccessControlContext
         *         this.inheritedAccessControlContext =
         *     acc != null ? acc : AccessController.getContext();
         *      AccessController.getContext() 此方法获取当前调用上下文的“快照”，
         *      其中包括当前线程的继承的AccessControlContext和任何有限的特权范围，
         *      并将其放置在AccessControlContext对象中
         *          设置目标对象
         *         this.target = target;
         *      设置线程优先级
         *     setPriority(priority);
         *          与此线程有关的InheritableThreadLocal值。该映射由InheritableThreadLocal类维护
         *         if (parent.inheritableThreadLocals != null)
         *             this.inheritableThreadLocals =
         *             ThreadLocal.createInheritedMap(parent.inheritableThreadLocals);
         *          设置堆栈大小
         *         this.stackSize = stackSize;
         *      设置线程id
         *     tid = nextThreadID();
         * }
         */
        // 构造方法
        // 无参构造
        /*
         * public Thread() {
         *         init(null, null, "Thread-" + nextThreadNum(), 0);
         *     }
         */
        // 指定调用run方法的目标对象target 实现Runnable接口的类型
        /*
         * public Thread(Runnable target) {
         *         init(null, target, "Thread-" + nextThreadNum(), 0);
         *     }
         */
        // 指定调用run方法的目标对象target、当前调用上下文
        /*
         * Thread(Runnable target, AccessControlContext acc) {
         *         init(null, target, "Thread-" + nextThreadNum(), 0, acc);
         *     }
         */
        // 指定线程组和调用run方法的目标对象target
        /*
         * public Thread(ThreadGroup group, Runnable target) {
         *         init(group, target, "Thread-" + nextThreadNum(), 0);
         *     }
         */
        // 指定线程名
        /*
         * public Thread(String name) {
         *         init(null, null, name, 0);
         *     }
         */
        // 指定线程组和线程名
        /*
         * public Thread(ThreadGroup group, String name) {
         *         init(group, null, name, 0);
         *     }
         */
        // 指定调用run方法的目标对象target和线程名
        /*
         * public Thread(Runnable target, String name) {
         *         init(null, target, name, 0);
         *     }
         */
        // 指定线程组、调用run方法的目标对象target和线程名
        /*
         * public Thread(ThreadGroup group, Runnable target, String name) {
         *         init(group, target, name, 0);
         *     }
         */
        // 指定线程组、调用run方法的目标对象target、线程名和线程所需的堆栈大小
        /*
         * public Thread(ThreadGroup group, Runnable target, String name,
         *                   long stackSize) {
         *         init(group, target, name, stackSize);
         *     }
         */
        // 同步获取下一个线程num
        /*
         * private static synchronized int nextThreadNum() {
         *         return threadInitNumber++;
         *     }
         */
        // 同步获取下一个线程ID
        /*
         * private static synchronized long nextThreadID() {
         *         return ++threadSeqNumber;
         *     }
         */
        // 设置阻止字段；通过java.nio代码中的sun.misc.SharedSecrets调用
        /*
         * void blockedOn(Interruptible b) {
         *         synchronized (blockerLock) {
         *             blocker = b;
         *         }
         *     }
         */
        // 获取当前运行线程实例
        // public static native Thread currentThread();
        // 向调度程序提示当前线程是否愿意产生其当前使用的处理器。
        // public static native void yield();
        // 当前正在执行的线程休眠（暂时停止执行）指定的毫秒数
        // public static native void sleep(long millis) throws InterruptedException;
        // 当前正在执行的线程休眠（暂时停止执行）指定的毫秒数加上指定的纳秒数
        /*
         * public static void sleep(long millis, int nanos)
         *     throws InterruptedException {
         *         if (millis < 0) {
         *             throw new IllegalArgumentException("timeout value is negative");
         *         }
         *
         *         if (nanos < 0 || nanos > 999999) {
         *             throw new IllegalArgumentException(
         *                                 "nanosecond timeout value out of range");
         *         }
         *
         *         if (nanos >= 500000 || (nanos != 0 && millis == 0)) {
         *             millis++;
         *         }
         *
         *         sleep(millis);
         *     }
         */
        // 抛出CloneNotSupportedException，因为无法有意义地克隆线程。 构造一个新的线程
        /*
         * protected Object clone() throws CloneNotSupportedException {
         *         throw new CloneNotSupportedException();
         *     }
         */
        // start方法
        // 使该线程开始执行； Java虚拟机将调用此线程的run方法。
        // 结果是两个线程正在同时运行：当前线程（从调用返回到start方法）和另一个线程（执行其run方法）。
        // 一次启动一个线程永远是不合法的。 特别是，线程一旦完成执行就可能不会重新启动。
        /*
         * public synchronized void start() {
         *             必须状态为NEW的线程才能调用对应值是0
         *             if (threadStatus != 0)
         *                 throw new IllegalThreadStateException();
         *           通知组该线程即将开始，以便可以将其添加到组的线程列表中，并且该组的未启动计数可以减少
         *             group.add(this);
         *             boolean started = false;
         *             try {
         *                 start0();
         *                 started = true;
         *             } finally {
         *                 try {
         *                     if (!started) {
         *                         group.threadStartFailed(this);
         *                     }
         *                 } catch (Throwable ignore) {
         *
         *                 }
         *             }
         *         }
         */
        // private native void start0();
        // 执行方法 调用target的run方法
        /*
         * public void run() {
         *         if (target != null) {
         *             target.run();
         *         }
         *     }
         */
        // 线程退出方法 并且安全管理器已允许执行退出操作。
        // 修改线程状态 释放线程资源
        /*
         * private void exit() {
         *      if (group != null) {
         *          group.threadTerminated(this);
         *          group = null;
         *      }
         *      target = null;
         *      threadLocals = null;
         *      inheritableThreadLocals = null;
         *      inheritedAccessControlContext = null;
         *      blocker = null;
         *      uncaughtExceptionHandler = null;
         *  }
         */
        // 强制线程停止执行。
        // public final void stop() 已弃用 这种方法本质上是不安全的。
        // 迫使线程停止并抛出给定的Throwable作为异常
        /*
         * public final synchronized void stop(Throwable obj) {
         *         throw new UnsupportedOperationException();
         *     }
         */
        // 中断此线程
        /*
         * public void interrupt() {
         *         if (this != Thread.currentThread())
         *             checkAccess();
         *
         *         synchronized (blockerLock) {
         *             Interruptible b = blocker;
         *             if (b != null) {
         *                 interrupt0();           // Just to set the interrupt flag
         *                 b.interrupt(this);
         *                 return;
         *             }
         *         }
         *         interrupt0();
         *     }
         */
        // 测试当前线程是否已被中断
        /*
         * public static boolean interrupted() {
         *         return currentThread().isInterrupted(true);
         *     }
         */
        // 测试此线程是否已被中断。
        /*
         * public boolean isInterrupted() {
         *         return isInterrupted(false);
         *     }
         */
        // 不进行任何清理的情况下破坏此线程 已弃用
        /*
         * public void destroy() {
         *         throw new NoSuchMethodError();
         *     }
         */
        // 判断线程是否存活
        // public final native boolean isAlive();
        // 挂起该线程。 可能会导致死锁 已弃用
        /*
         * public final void suspend() {
         *         checkAccess();
         *         suspend0();
         *     }
         */
        // 恢复挂起的线程 可能会导致死锁 已弃用
        /*
         * public final void resume() {
         *         checkAccess();
         *         resume0();
         *     }
         */
        // 设置线程优先级
        /*
         * public final void setPriority(int newPriority) {
         *         ThreadGroup g;
         *         checkAccess();
         *         if (newPriority > MAX_PRIORITY || newPriority < MIN_PRIORITY) {
         *             throw new IllegalArgumentException();
         *         }
         *         if((g = getThreadGroup()) != null) {
         *             if (newPriority > g.getMaxPriority()) {
         *                 newPriority = g.getMaxPriority();
         *             }
         *             setPriority0(priority = newPriority);
         *         }
         *     }
         */
        // 获取线程优先级
        /*
         * public final int getPriority() {
         *         return priority;
         *     }
         */
        // 设置线程名
        /*
         * public final synchronized void setName(String name) {
         *         checkAccess();
         *         if (name == null) {
         *             throw new NullPointerException("name cannot be null");
         *         }
         *
         *         this.name = name;
         *         if (threadStatus != 0) {
         *             setNativeName(name);
         *         }
         *     }
         */
        // 获取线程名
        /*
         * public final String getName() {
         *         return name;
         *     }
         */
        // 获取当前线程所属线程组
        /*
         * public final ThreadGroup getThreadGroup() {
         *         return group;
         *     }
         */
        // 获取当前线程组存活线程
        /*
         * public static int activeCount() {
         *         return currentThread().getThreadGroup().activeCount();
         *     }
         */
        // 将当前线程的线程组及其子组中的每个活动线程复制到指定的数组中
        /*
         * public static int enumerate(Thread tarray[]) {
         *         return currentThread().getThreadGroup().enumerate(tarray);
         *     }
         */
        // 计算此线程中的堆栈帧数。 线程必须被挂起。 已弃用
        /*
         * public native int countStackFrames();
         */
        // join 等待这个线程死亡
        /*
         * public final void join() throws InterruptedException {
         *         join(0);
         *     }
         */
        // 此线程最多等待millis毫秒。 超时0意味着永远等待。
        /*
         * public final synchronized void join(long millis)
         *     throws InterruptedException {
         *         long base = System.currentTimeMillis();
         *         long now = 0;
         *
         *         if (millis < 0) {
         *             throw new IllegalArgumentException("timeout value is negative");
         *         }
         *
         *         if (millis == 0) {
         *             while (isAlive()) {
         *                 wait(0);
         *             }
         *         } else {
         *             while (isAlive()) {
         *                 long delay = millis - now;
         *                 if (delay <= 0) {
         *                     break;
         *                 }
         *                 wait(delay);
         *                 now = System.currentTimeMillis() - base;
         *             }
         *         }
         *     }
         */
        // 此线程最多等待millis毫秒加nanos纳秒。
        /*
         * public final synchronized void join(long millis, int nanos)
         *     throws InterruptedException {
         *
         *         if (millis < 0) {
         *             throw new IllegalArgumentException("timeout value is negative");
         *         }
         *
         *         if (nanos < 0 || nanos > 999999) {
         *             throw new IllegalArgumentException(
         *                                 "nanosecond timeout value out of range");
         *         }
         *
         *         if (nanos >= 500000 || (nanos != 0 && millis == 0)) {
         *             millis++;
         *         }
         *
         *         join(millis);
         *     }
         */
        // 将当前线程的堆栈跟踪记录打印到标准错误流。 此方法仅用于调试
        /*
         * public static void dumpStack() {
         *         new Exception("Stack trace").printStackTrace();
         *     }
         */
        // 设置守护线程
        /*
         * public final void setDaemon(boolean on) {
         *         checkAccess();
         *         if (isAlive()) {
         *             throw new IllegalThreadStateException();
         *         }
         *         daemon = on;
         *     }
         */
        // 判断是否为守护线程
        /*
         * public final boolean isDaemon() {
         *         return daemon;
         *     }
         */
        // 确定当前正在运行的线程是否有权修改此线程。
        /*
         * public final void checkAccess() {
         *         SecurityManager security = System.getSecurityManager();
         *         if (security != null) {
         *             security.checkAccess(this);
         *         }
         *     }
         */
        // 返回此线程的字符串表示形式，包括线程的名称，优先级和线程组。
        /*
         * public String toString() {
         *         ThreadGroup group = getThreadGroup();
         *         if (group != null) {
         *             return "Thread[" + getName() + "," + getPriority() + "," +
         *                            group.getName() + "]";
         *         } else {
         *             return "Thread[" + getName() + "," + getPriority() + "," +
         *                             "" + "]";
         *         }
         *     }
         */
        // 返回此线程的上下文ClassLoader
        /*
         * public ClassLoader getContextClassLoader() {
         *         if (contextClassLoader == null)
         *             return null;
         *         SecurityManager sm = System.getSecurityManager();
         *         if (sm != null) {
         *             ClassLoader.checkClassLoaderPermission(contextClassLoader,
         *                                                    Reflection.getCallerClass());
         *         }
         *         return contextClassLoader;
         *     }
         */
        // 设置此线程的上下文ClassLoader
        /*
         * public void setContextClassLoader(ClassLoader cl) {
         *         SecurityManager sm = System.getSecurityManager();
         *         if (sm != null) {
         *             sm.checkPermission(new RuntimePermission("setContextClassLoader"));
         *         }
         *         contextClassLoader = cl;
         *     }
         */
        // 当且仅当当前线程在指定对象上持有监视器锁时，才返回true 。
        // 此方法旨在允许程序断言当前线程已持有指定的锁：
        // public static native boolean holdsLock(Object obj);
        // 返回表示该线程的堆栈转储的堆栈跟踪元素的数组。
        // 如果此线程尚未启动，尚未启动但尚未计划由系统运行或已终止，则此方法将返回零长度数组。
        /*
         * public StackTraceElement[] getStackTrace() {
         *         if (this != Thread.currentThread()) {
         *             // check for getStackTrace permission
         *             SecurityManager security = System.getSecurityManager();
         *             if (security != null) {
         *                 security.checkPermission(
         *                     SecurityConstants.GET_STACK_TRACE_PERMISSION);
         *             }
         *             // optimization so we do not call into the vm for threads that
         *             // have not yet started or have terminated
         *             if (!isAlive()) {
         *                 return EMPTY_STACK_TRACE;
         *             }
         *             StackTraceElement[][] stackTraceArray = dumpThreads(new Thread[] {this});
         *             StackTraceElement[] stackTrace = stackTraceArray[0];
         *             // a thread that was alive during the previous isAlive call may have
         *             // since terminated, therefore not having a stacktrace.
         *             if (stackTrace == null) {
         *                 stackTrace = EMPTY_STACK_TRACE;
         *             }
         *             return stackTrace;
         *         } else {
         *             // Don't need JVM help for current thread
         *             return (new Exception()).getStackTrace();
         *         }
         *     }
         */
        // 返回所有活动线程的堆栈跟踪的映射。
        // 映射键是线程，每个映射值是一个StackTraceElement数组，该数组代表相应Thread的堆栈转储
        /*
         * public static Map<Thread, StackTraceElement[]> getAllStackTraces() {
         *         // check for getStackTrace permission
         *         SecurityManager security = System.getSecurityManager();
         *         if (security != null) {
         *             security.checkPermission(
         *                 SecurityConstants.GET_STACK_TRACE_PERMISSION);
         *             security.checkPermission(
         *                 SecurityConstants.MODIFY_THREADGROUP_PERMISSION);
         *         }
         *
         *         // Get a snapshot of the list of all threads
         *         Thread[] threads = getThreads();
         *         StackTraceElement[][] traces = dumpThreads(threads);
         *         Map<Thread, StackTraceElement[]> m = new HashMap<>(threads.length);
         *         for (int i = 0; i < threads.length; i++) {
         *             StackTraceElement[] stackTrace = traces[i];
         *             if (stackTrace != null) {
         *                 m.put(threads[i], stackTrace);
         *             }
         *             // else terminated so we don't put it in the map
         *         }
         *         return m;
         *     }
         */
        // 验证是否可以在不违反安全约束的情况下构造此（可能是子类）实例：子类不得覆盖对安全性敏感的非最终方法，否则将检查
        /*
         * private static boolean isCCLOverridden(Class<?> cl) {
         *         if (cl == Thread.class)
         *             return false;
         *
         *         processQueue(Caches.subclassAuditsQueue, Caches.subclassAudits);
         *         WeakClassKey key = new WeakClassKey(cl, Caches.subclassAuditsQueue);
         *         Boolean result = Caches.subclassAudits.get(key);
         *         if (result == null) {
         *             result = Boolean.valueOf(auditSubclass(cl));
         *             Caches.subclassAudits.putIfAbsent(key, result);
         *         }
         *
         *         return result.booleanValue();
         *     }
         */
        // 对给定的子类执行反射检查，以验证它不会覆盖对安全性敏感的非最终方法。
        // 如果子类覆盖任何方法，则返回true，否则返回false
        /*
         * private static boolean auditSubclass(final Class<?> subcl) {
         *         Boolean result = AccessController.doPrivileged(
         *             new PrivilegedAction<Boolean>() {
         *                 public Boolean run() {
         *                     for (Class<?> cl = subcl;
         *                          cl != Thread.class;
         *                          cl = cl.getSuperclass())
         *                     {
         *                         try {
         *                             cl.getDeclaredMethod("getContextClassLoader", new Class<?>[0]);
         *                             return Boolean.TRUE;
         *                         } catch (NoSuchMethodException ex) {
         *                         }
         *                         try {
         *                             Class<?>[] params = {ClassLoader.class};
         *                             cl.getDeclaredMethod("setContextClassLoader", params);
         *                             return Boolean.TRUE;
         *                         } catch (NoSuchMethodException ex) {
         *                         }
         *                     }
         *                     return Boolean.FALSE;
         *                 }
         *             }
         *         );
         *         return result.booleanValue();
         *     }
         */
        // 堆栈跟踪元素 private native static StackTraceElement[][] dumpThreads(Thread[] threads);
        // 获取线程数组 private native static Thread[] getThreads();
        // 获取线程id
        /*
         * public long getId() {
         *         return tid;
         *     }
         */
        // 获取线程状态
        /*
         * public State getState() {
         *         // get current thread state
         *         return sun.misc.VM.toThreadState(threadStatus);
         *     }
         */
        // 设置当线程由于未捕获的异常而突然终止并且没有为该线程定义其他处理程序时调用的默认处理程序
        /*
         * public static void setDefaultUncaughtExceptionHandler(UncaughtExceptionHandler eh) {
         *         SecurityManager sm = System.getSecurityManager();
         *         if (sm != null) {
         *             sm.checkPermission(
         *                 new RuntimePermission("setDefaultUncaughtExceptionHandler")
         *                     );
         *         }
         *
         *          defaultUncaughtExceptionHandler = eh;
         *      }
         */
        // 返回由于未捕获的异常而导致线程突然终止时调用的默认处理程序。
        /*
         * public static UncaughtExceptionHandler getDefaultUncaughtExceptionHandler(){
         *         return defaultUncaughtExceptionHandler;
         *     }
         */
        // 返回由于未捕获的异常而导致该线程突然终止时调用的处理程序。
        // 如果此线程没有显式设置未捕获的异常处理程序，则将返回此线程的ThreadGroup对象，
        // 除非该线程已终止，在这种情况下将返回null 。
        /*
         * public UncaughtExceptionHandler getUncaughtExceptionHandler() {
         *         return uncaughtExceptionHandler != null ?
         *             uncaughtExceptionHandler : group;
         *     }
         */
        // 设置当此线程由于未捕获的异常突然终止时调用的处理程序。
        // 通过显式设置其未捕获的异常处理程序，线程可以完全控制其对未捕获的异常的响应方式。
        // 如果未设置此类处理程序，则线程的ThreadGroup对象将充当其处理程序
        /*
         * public void setUncaughtExceptionHandler(UncaughtExceptionHandler eh) {
         *         checkAccess();
         *         uncaughtExceptionHandler = eh;
         *     }
         */
        // 向处理程序调度一个未捕获的异常。 此方法仅应由JVM调用。
        /*
         * private void dispatchUncaughtException(Throwable e) {
         *         getUncaughtExceptionHandler().uncaughtException(this, e);
         *     }
         */
        // 从指定映射中删除已排队在指定参考队列上的所有键。
        /*
         * static void processQueue(ReferenceQueue<Class<?>> queue,
         *                              ConcurrentMap<? extends
         *                              WeakReference<Class<?>>, ?> map)
         *     {
         *         Reference<? extends Class<?>> ref;
         *         while((ref = queue.poll()) != null) {
         *             map.remove(ref);
         *         }
         *     }
         */
        /* Some private helper methods */
        // private native void setPriority0(int newPriority);
        // private native void stop0(Object o);
        // private native void suspend0();
        // private native void resume0();
        // private native void interrupt0();
        // private native void setNativeName(String name);
        // 线程名
        // private volatile String name;
        // 线程优先级
        // private int            priority;
        // private Thread         threadQ;
        // private long           eetop;
        // 是否单例执行该线程
        // private boolean     single_step;
        // 是否是守护线程
        // private boolean     daemon = false;
        // jvm 状态
        // private boolean     stillborn = false;
        // 线程执行目标
        // private Runnable target;
        // 线程组
        // private ThreadGroup group;
        // 线程上下文
        // private ClassLoader contextClassLoader;
        // 该线程的继承的AccessControlContext
        // private AccessControlContext inheritedAccessControlContext;
        // 用于自动编号匿名线程
        // private static int threadInitNumber;
        // 与此线程有关的ThreadLocal值。该映射由ThreadLocal类维护
        // ThreadLocal.ThreadLocalMap threadLocals = null;
        // 与此线程有关的InheritableThreadLocal值。该映射由InheritableThreadLocal类维护。
        // ThreadLocal.ThreadLocalMap inheritableThreadLocals = null;
        // 此线程请求的堆栈大小
        // private long stackSize;
        // 本地线程终止后，JVM专用状态仍然存在。
        // private long nativeParkEventPointer;
        // 线程id
        // private long tid;
        // 用于生成线程id
        // private static long threadSeqNumber;
        // 线程状态
        // private volatile int threadStatus = 0;
        // volatile Object parkBlocker;
        // 用于阻塞线程的对象
        // private volatile Interruptible blocker;
        // private final Object blockerLock = new Object();
        // 线程优先级
        //    public final static int MIN_PRIORITY = 1;
        //    public final static int NORM_PRIORITY = 5;
        //    public final static int MAX_PRIORITY = 10;
        // 堆栈跟踪元素
        // private static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
        //private static final RuntimePermission SUBCLASS_IMPLEMENTATION_PERMISSION =
        //                    new RuntimePermission("enableContextClassLoaderOverride");
        // private volatile UncaughtExceptionHandler uncaughtExceptionHandler;
        // private static volatile UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        /* The current seed for a ThreadLocalRandom */
        // @sun.misc.Contended("tlr")
        // long threadLocalRandomSeed;

        /* Probe hash value; nonzero if threadLocalRandomSeed initialized */
        // @sun.misc.Contended("tlr")
        // int threadLocalRandomProbe;

        /* Secondary seed isolated from public ThreadLocalRandom sequence */
        // @sun.misc.Contended("tlr")
        // int threadLocalRandomSecondarySeed;
    }
}
