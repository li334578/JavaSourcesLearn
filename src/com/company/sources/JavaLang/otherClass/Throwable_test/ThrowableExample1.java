package com.company.sources.JavaLang.otherClass.Throwable_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Throwable
 * @date : 2021-01-20 20:38:19
 */
public class ThrowableExample1 {
    public static void main(String[] args) {
        // 内部类
        // Holder类用于推迟仅用于序列化的哨兵对象的初始化。
        // SentinelHolder
        // 将堆栈跟踪设置为包含此前哨值的一个元素的数组表示将来设置堆栈跟踪的尝试将被忽略。
        // 标记等于调用的结果： new StackTraceElement("", "", null, Integer.MIN_VALUE)
        /*
         * public static final StackTraceElement STACK_TRACE_ELEMENT_SENTINEL =
         *     new StackTraceElement("", "", null, Integer.MIN_VALUE);
         */
        // 以串行形式使用的前哨值，表示不可变的堆栈跟踪。
        /*
         * public static final StackTraceElement[] STACK_TRACE_SENTINEL =
         *     new StackTraceElement[] {STACK_TRACE_ELEMENT_SENTINEL};
         */
        // 用于PrintStream和PrintWriter的包装器类，以启用printStackTrace的单个实现
        // PrintStreamOrWriter
        // 返回使用此StreamOrWriter时要锁定的对象
        // abstract Object lock();
        // 在此StreamOrWriter上将指定的字符串打印为一行
        // abstract void println(Object o);
        // WrappedPrintStream
        // 打印流
        // private final PrintStream printStream;
        // 包装流
        /*
         * WrappedPrintStream(PrintStream printStream) {
         *             this.printStream = printStream;
         *         }
         */
        // 锁定
        /*
         * Object lock() {
         *             return printStream;
         *         }
         */
        // 打印对象
        /*
         * void println(Object o) {
         *             printStream.println(o);
         *         }
         */
        // WrappedPrintWriter
        // 构建一个写入对象
        /*
         * WrappedPrintWriter(PrintWriter printWriter) {
         *             this.printWriter = printWriter;
         *         }
         */
        // 锁定
        /*
         * Object lock() {
         *             return printWriter;
         *         }
         */
        // 打印写入对象
        /*
         * void println(Object o) {
         *             printWriter.println(o);
         *         }
         */
        // private final PrintWriter printWriter;
        // 构造一个新的throwable，并将其null作为其详细信息。 原因未初始化，并且随后可以通过调用initCause来初始化。
        // 调用fillInStackTrace()方法以初始化新创建的throwable中的堆栈跟踪数据。
        /*
         * public Throwable() {
         *         fillInStackTrace();
         *     }
         */
        // 使用指定的详细消息构造一个新的throwable。 原因未初始化，并且随后可以通过调用initCause来初始化。
        // 调用fillInStackTrace()方法以初始化新创建的throwable中的堆栈跟踪数据。
        /*
         * public Throwable(String message) {
         *         fillInStackTrace();
         *         detailMessage = message;
         *     }
         */
        // 使用指定的详细消息和原因构造一个新的throwable。
        // 请注意，与cause关联的详细消息不会自动包含在此throwable的详细消息中。
        // 调用fillInStackTrace()方法以初始化新创建的throwable中的堆栈跟踪数据
        /*
         * public Throwable(String message, Throwable cause) {
         *         fillInStackTrace();
         *         detailMessage = message;
         *         this.cause = cause;
         *     }
         */
        // 构造一个具有指定的cause和详细信息(cause==null ? null : cause.toString())的新throwable（通常包含cause的类和详细信息）
        /*
         * public Throwable(Throwable cause) {
         *         fillInStackTrace();
         *         detailMessage = (cause==null ? null : cause.toString());
         *         this.cause = cause;
         *     }
         */
        // 使用指定的详细消息构造新的throwable，启用或禁用原因，抑制，
        // 以及启用或禁用可写堆栈跟踪。 如果禁用了抑制，
        // getSuppressed此对象的getSuppressed将返回零长度的数组，
        // 并且对addSuppressed调用（否则将异常添加到抑制列表中）将无效。
        // 如果可写堆栈跟踪为false，则此构造方法将不会调用fillInStackTrace() ，
        // 将null写入stackTrace字段，并且随后对fillInStackTrace和setStackTrace(StackTraceElement[])的调用不会设置堆栈跟踪。
        // 如果可写堆栈跟踪为false，则getStackTrace将返回长度为零的数组。
        /*
         * protected Throwable(String message, Throwable cause,
         *                         boolean enableSuppression,
         *                         boolean writableStackTrace) {
         *         if (writableStackTrace) {
         *             fillInStackTrace();
         *         } else {
         *             stackTrace = null;
         *         }
         *         detailMessage = message;
         *         this.cause = cause;
         *         if (!enableSuppression)
         *             suppressedExceptions = null;
         *     }
         */
        // 返回此throwable的详细消息字符串。
        /*
         * public String getMessage() {
         *         return detailMessage;
         *     }
         */
        // 创建此throwable的本地化描述。
        // 子类可以重写此方法，以生成特定于语言环境的消息。
        // 对于不覆盖此方法的子类，默认实现返回与getMessage()相同的结果。
        /*
         * public String getLocalizedMessage() {
         *         return getMessage();
         *     }
         */
        // 返回此throwable的原因，如果原因不存在或未知，则返回null 。 （原因是导致该throwable被抛出的throwable。）
        // 此实现返回原因，该原因由需要Throwable ，
        // 或者由initCause(Throwable)方法创建后设置。
        // 虽然通常不必重写此方法，但是子类可以重写它以通过其他方式返回原因集。
        // 这适用于在“ Throwable ”之前添加链式例外之前的“传统链式可抛出”。
        // 请注意，这是没有必要重写任何PrintStackTrace方法，
        // 所有这些都调用了getCause方法来确定throwable的原因
        /*
         * public synchronized Throwable getCause() {
         *         return (cause==this ? null : cause);
         *     }
         */
        // 将此throwable的原因初始化为指定的值。
        // （原因是导致该throwable被抛出的throwable。）
        /*
         * public synchronized Throwable initCause(Throwable cause) {
         *         if (this.cause != this)
         *             throw new IllegalStateException("Can't overwrite cause with " +
         *                                             Objects.toString(cause, "a null"), this);
         *         if (cause == this)
         *             throw new IllegalArgumentException("Self-causation not permitted", this);
         *         this.cause = cause;
         *         return this;
         *     }
         */
        // 打印错误的堆栈信息
        /*
         * public String toString() {
         *         String s = getClass().getName();
         *         String message = getLocalizedMessage();
         *         return (message != null) ? (s + ": " + message) : s;
         *     }
         */
        // 打印错误的详细信息
        /*
         * public void printStackTrace() {
         *         printStackTrace(System.err);
         *     }
         */
        // 将这个throwable及其回溯打印到指定的打印流。
        /*
         * public void printStackTrace(PrintStream s) {
         *         printStackTrace(new WrappedPrintStream(s));
         *     }
         */
        // 打印堆栈信息
        /*
         * private void printStackTrace(PrintStreamOrWriter s) {
         *         // Guard against malicious overrides of Throwable.equals by
         *         // using a Set with identity equality semantics.
         *         Set<Throwable> dejaVu =
         *             Collections.newSetFromMap(new IdentityHashMap<Throwable, Boolean>());
         *         dejaVu.add(this);
         *
         *         synchronized (s.lock()) {
         *             // Print our stack trace
         *             s.println(this);
         *             StackTraceElement[] trace = getOurStackTrace();
         *             for (StackTraceElement traceElement : trace)
         *                 s.println("\tat " + traceElement);
         *
         *             // Print suppressed exceptions, if any
         *             for (Throwable se : getSuppressed())
         *                 se.printEnclosedStackTrace(s, trace, SUPPRESSED_CAPTION, "\t", dejaVu);
         *
         *             // Print cause, if any
         *             Throwable ourCause = getCause();
         *             if (ourCause != null)
         *                 ourCause.printEnclosedStackTrace(s, trace, CAUSE_CAPTION, "", dejaVu);
         *         }
         *     }
         */
        // 将我们的堆栈跟踪打印为指定堆栈跟踪的封闭异常。
        /*
         * private void printEnclosedStackTrace(PrintStreamOrWriter s,
         *                                          StackTraceElement[] enclosingTrace,
         *                                          String caption,
         *                                          String prefix,
         *                                          Set<Throwable> dejaVu) {
         *         assert Thread.holdsLock(s.lock());
         *         if (dejaVu.contains(this)) {
         *             s.println("\t[CIRCULAR REFERENCE:" + this + "]");
         *         } else {
         *             dejaVu.add(this);
         *             // Compute number of frames in common between this and enclosing trace
         *             StackTraceElement[] trace = getOurStackTrace();
         *             int m = trace.length - 1;
         *             int n = enclosingTrace.length - 1;
         *             while (m >= 0 && n >=0 && trace[m].equals(enclosingTrace[n])) {
         *                 m--; n--;
         *             }
         *             int framesInCommon = trace.length - 1 - m;
         *
         *             // Print our stack trace
         *             s.println(prefix + caption + this);
         *             for (int i = 0; i <= m; i++)
         *                 s.println(prefix + "\tat " + trace[i]);
         *             if (framesInCommon != 0)
         *                 s.println(prefix + "\t... " + framesInCommon + " more");
         *
         *             // Print suppressed exceptions, if any
         *             for (Throwable se : getSuppressed())
         *                 se.printEnclosedStackTrace(s, trace, SUPPRESSED_CAPTION,
         *                                            prefix +"\t", dejaVu);
         *
         *             // Print cause, if any
         *             Throwable ourCause = getCause();
         *             if (ourCause != null)
         *                 ourCause.printEnclosedStackTrace(s, trace, CAUSE_CAPTION, prefix, dejaVu);
         *         }
         *     }
         */
        // 将这个throwable及其回溯打印到指定的打印作者。
        /*
         * public void printStackTrace(PrintWriter s) {
         *         printStackTrace(new WrappedPrintWriter(s));
         *     }
         */
        // 填写执行堆栈跟踪。 此方法在Throwable对象中记录有关当前线程的堆栈帧的当前状态的信息。
        /*
         * public synchronized Throwable fillInStackTrace() {
         *         if (stackTrace != null ||
         *             backtrace != null ){
         *             fillInStackTrace(0);
         *             stackTrace = UNASSIGNED_STACK;
         *         }
         *         return this;
         * }
         */
        // private native Throwable fillInStackTrace(int dummy);
        // 提供对由printStackTrace()打印的堆栈跟踪信息的编程访问。 返回一个堆栈跟踪元素数组，每个元素代表一个堆栈帧。
        // 数组的第零个元素（假设数组的长度为非零）表示堆栈的顶部，这是序列中的最后一个方法调用。
        // 通常，这是创建和抛出该throwable的地方。
        // 数组的最后一个元素（假设数组的长度为非零）表示堆栈的底部，这是序列中的第一个方法调用。
        /*
         * public StackTraceElement[] getStackTrace() {
         *         return getOurStackTrace().clone();
         *     }
         */

        /*
         * private synchronized StackTraceElement[] getOurStackTrace() {
         *         // Initialize stack trace field with information from
         *         // backtrace if this is the first call to this method
         *         if (stackTrace == UNASSIGNED_STACK ||
         *             (stackTrace == null && backtrace != null) ) {
         *             int depth = getStackTraceDepth();
         *             stackTrace = new StackTraceElement[depth];
         *             for (int i=0; i < depth; i++)
         *                 stackTrace[i] = getStackTraceElement(i);
         *         } else if (stackTrace == null) {
         *             return UNASSIGNED_STACK;
         *         }
         *         return stackTrace;
         *     }
         */
        // 设置将由getStackTrace()返回并由printStackTrace()和相关方法打印的堆栈跟踪元素。
        // 此方法旨在供RPC框架和其他高级系统使用，它允许客户端覆盖在构建throwable时
        // 由fillInStackTrace()生成或在从序列化流中读取throwable时反序列化的默认堆栈跟踪。
        // 如果此Throwable的堆栈跟踪是不可写的，则调用此方法除了验证其参数外没有其他作用。
        /*
         * public void setStackTrace(StackTraceElement[] stackTrace) {
         *         // Validate argument
         *         StackTraceElement[] defensiveCopy = stackTrace.clone();
         *         for (int i = 0; i < defensiveCopy.length; i++) {
         *             if (defensiveCopy[i] == null)
         *                 throw new NullPointerException("stackTrace[" + i + "]");
         *         }
         *
         *         synchronized (this) {
         *             if (this.stackTrace == null && // Immutable stack
         *                 backtrace == null) // Test for out of protocol state
         *                 return;
         *             this.stackTrace = defensiveCopy;
         *         }
         *     }
         */
        // 返回堆栈跟踪中的元素数（如果堆栈跟踪不可用，则返回0）。 由SharedSecrets使用的软件包保护。
        // native int getStackTraceDepth();
        // 返回堆栈跟踪的指定元素。 由SharedSecrets使用的软件包保护。
        // native StackTraceElement getStackTraceElement(int index);
        // 从流中读取Throwable ，对字段实施格式正确的约束。
        // 空的条目和自指针不允许出现在被suppressedExceptions列表中。
        // 堆栈跟踪元素不允许使用空条目。 串行形式的空堆栈跟踪会导致长度为零的堆栈元素数组。
        /*
         * private void readObject(ObjectInputStream s)
         *         throws IOException, ClassNotFoundException {
         *         s.defaultReadObject();     // read in all fields
         *         if (suppressedExceptions != null) {
         *             List<Throwable> suppressed = null;
         *             if (suppressedExceptions.isEmpty()) {
         *                 // Use the sentinel for a zero-length list
         *                 suppressed = SUPPRESSED_SENTINEL;
         *             } else { // Copy Throwables to new list
         *                 suppressed = new ArrayList<>(1);
         *                 for (Throwable t : suppressedExceptions) {
         *                     // Enforce constraints on suppressed exceptions in
         *                     // case of corrupt or malicious stream.
         *                     if (t == null)
         *                         throw new NullPointerException(NULL_CAUSE_MESSAGE);
         *                     if (t == this)
         *                         throw new IllegalArgumentException(SELF_SUPPRESSION_MESSAGE);
         *                     suppressed.add(t);
         *                 }
         *             }
         *             suppressedExceptions = suppressed;
         *         } // else a null suppressedExceptions field remains null
         *
         *         if (stackTrace != null) {
         *             if (stackTrace.length == 0) {
         *                 stackTrace = UNASSIGNED_STACK.clone();
         *             }  else if (stackTrace.length == 1 &&
         *                         // Check for the marker of an immutable stack trace
         *                         SentinelHolder.STACK_TRACE_ELEMENT_SENTINEL.equals(stackTrace[0])) {
         *                 stackTrace = null;
         *             } else { // Verify stack trace elements are non-null.
         *                 for(StackTraceElement ste : stackTrace) {
         *                     if (ste == null)
         *                         throw new NullPointerException("null StackTraceElement in serial stream. ");
         *                 }
         *             }
         *         } else {
         *             // A null stackTrace field in the serial form can result
         *             // from an exception serialized without that field in
         *             // older JDK releases; treat such exceptions as having
         *             // empty stack traces.
         *             stackTrace = UNASSIGNED_STACK.clone();
         *         }
         *     }
         */
        // 将Throwable对象写入流中。 null堆栈跟踪字段以串行形式表示为一个单元素数组，
        // 其元素等于new StackTraceElement("", "", null, Integer.MIN_VALUE) 。
        /*
         * private synchronized void writeObject(ObjectOutputStream s)
         *         throws IOException {
         *         // Ensure that the stackTrace field is initialized to a
         *         // non-null value, if appropriate.  As of JDK 7, a null stack
         *         // trace field is a valid value indicating the stack trace
         *         // should not be set.
         *         getOurStackTrace();
         *
         *         StackTraceElement[] oldStackTrace = stackTrace;
         *         try {
         *             if (stackTrace == null)
         *                 stackTrace = SentinelHolder.STACK_TRACE_SENTINEL;
         *             s.defaultWriteObject();
         *         } finally {
         *             stackTrace = oldStackTrace;
         *         }
         *     }
         */
        // 将指定的异常附加到为了传递此异常而被抑制的异常。
        /*
         * public final synchronized void addSuppressed(Throwable exception) {
         *         if (exception == this)
         *             throw new IllegalArgumentException(SELF_SUPPRESSION_MESSAGE, exception);
         *
         *         if (exception == null)
         *             throw new NullPointerException(NULL_CAUSE_MESSAGE);
         *
         *         if (suppressedExceptions == null) // Suppressed exceptions not recorded
         *             return;
         *
         *         if (suppressedExceptions == SUPPRESSED_SENTINEL)
         *             suppressedExceptions = new ArrayList<>(1);
         *
         *         suppressedExceptions.add(exception);
         *     }
         */
        // 返回一个数组，该数组包含通常被try -with-resources语句抑制的所有异常，以便传递此异常。
        // 如果没有抑制异常或禁用抑制，则返回一个空数组。 此方法是线程安全的。 写入返回的数组不会影响以后对该方法的调用。
        /*
         * public final synchronized Throwable[] getSuppressed() {
         *         if (suppressedExceptions == SUPPRESSED_SENTINEL ||
         *             suppressedExceptions == null)
         *             return EMPTY_THROWABLE_ARRAY;
         *         else
         *             return suppressedExceptions.toArray(EMPTY_THROWABLE_ARRAY);
         *     }
         */
        // 序列化id
        // private static final long serialVersionUID = -3042686055658047285L;
        // 本机代码在该插槽中保存了一些有关堆栈回溯的指示。
        // private transient Object backtrace;
        // 有关Throwable的特定详细信息。 例如，对于FileNotFoundException ，它包含找不到的文件的名称。
        // private String detailMessage;
        // 空堆栈的共享值
        // private static final StackTraceElement[] UNASSIGNED_STACK = new StackTraceElement[0];
        // 导致引发此throwable的throwable；
        // private Throwable cause = this;
        // 堆栈跟踪，由getStackTrace()返回
        // private StackTraceElement[] stackTrace = UNASSIGNED_STACK;
        // 由getSuppressed()返回的抑制异常列表。 该列表被初始化为零元素不可修改的前哨列表。
        // 读入序列化Throwable时，如果suppressedExceptions字段指向零元素列表，则该字段将重置为前哨值。
        // private List<Throwable> suppressedExceptions = SUPPRESSED_SENTINEL;
        // 尝试抑制空异常的消息。
        // private static final String NULL_CAUSE_MESSAGE = "Cannot suppress a null exception.";
        // 试图压抑自己的讯息。
        // private static final String SELF_SUPPRESSION_MESSAGE = "Self-suppression not permitted";
        // 标记原因异常堆栈跟踪的标题
        // private static final String CAUSE_CAPTION = "Caused by: ";
        // 用于标记抑制的异常堆栈跟踪的标题
        // private static final String SUPPRESSED_CAPTION = "Suppressed: ";
        // private static final Throwable[] EMPTY_THROWABLE_ARRAY = new Throwable[0];
    }
}
