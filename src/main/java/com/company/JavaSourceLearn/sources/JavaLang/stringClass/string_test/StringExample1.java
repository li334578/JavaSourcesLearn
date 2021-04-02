package main.java.com.company.JavaSourceLearn.sources.JavaLang.stringClass.string_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : String
 * @date : 2020-12-30 21:39:00
 */
public class StringExample1 {
    public static void main(String[] args) {
        // 构造方法
        // 空参构造
        /*
         * public String() {
         *         this.value = "".value;
         *     }
         */
        // String参数构造
        /*
         * public String(String original) {
         *         this.value = original.value;
         *         this.hash = original.hash;
         *     }
         */
        // char value[]数组构造
        /*
         * public String(char value[]) {
         *         this.value = Arrays.copyOf(value, value.length);
         *     }
         */
        // 分配一个新的String ，其中包含字符数组参数的子数组中的字符。
        // offset参数是子count的第一个字符的索引， count参数指定子count的长度。 复制子阵列的内容; 后续修改字符数组不会影响新创建的字符串。
        // String(char value[], int offset, int count)
        // 如果 offset为负数，则 count为负数，或 offset为大于 value.length - count 抛出IndexOutOfBoundsException
        // String(int[] codePoints, int offset, int count)
        // 分配一个新的String ，其中包含Unicode code point数组参数的子数组中的字符。 offset参数是子count的第一个代码点的索引， count参数指定子count的长度。 子阵列的内容转换为char s; 后续修改int数组不会影响新创建的字符串。
        // 如果在 codePoints找到任何无效的Unicode代码点 抛出IllegalArgumentException
        // 如果 offset为负数，则 count为负数，或 offset为大于 codePoints.length - count 抛出IndexOutOfBoundsException
        // 通过使用指定的字符集解码指定的字节 String构造新的 String 。
        // String(byte bytes[], int offset, int length, String charsetName)
        // 通过使用指定的charset解码指定的字节子String构造新的String 。
        // String(byte bytes[], int offset, int length, Charset charset)
        // 通过使用指定的字符集解码指定的字节 String构造新的 String 。
        // String(byte bytes[], String charsetName)
        // 构造一个新的String由指定用指定的字节的数组解码charset 。
        // String(byte bytes[], Charset charset)
        // 通过使用平台的默认字符集解码指定的字节子阵列来构造新的 String 。
        // String(byte bytes[], int offset, int length)
        // 通过使用平台的默认字符集解码指定的字节数组构造新的 String 。
        // String(byte bytes[])
        // 分配一个新字符串，其中包含当前包含在字符串缓冲区参数中的字符序列。
        // String(StringBuffer buffer)
        // 分配一个新字符串，其中包含当前包含在字符串构建器参数中的字符序列。
        // String(StringBuilder builder)
        // 私有构造函数 非共享
        // String(char[] value, boolean share)
        // 检查字符偏移量是否符合规则
        // static void checkBounds(byte[] bytes, int offset, int length)
        // 获取字符串长度方法
        // int length()
        // 判断字符串是否为""方法
        // boolean isEmpty()
        // 获取字符串指定索引位置的字符
        // char charAt(int index)
        // 获取字符串指定索引的字符的Unicode码
        // int codePointAt(int index)
        // 获取字符串指定索引前一位的字符的Unicode码
        // int codePointBefore(int index)
        // 获取指定索引范围的Unicode码的和
        // int codePointCount(int beginIndex, int endIndex)
        String str ="123";
        System.out.println(str.length()); // 3
        System.out.println(str.codePointCount(0, str.length())); // 3
        // 获取指定索引加偏移量的Unicode码的和
        // int offsetByCodePoints(int index, int codePointOffset)
        // 将String内容copy到数组dst中 dstBegin为起始索引位置 调用System.arraycopy方法
        // getChars(char dst[], int dstBegin)
        // 指定起始索引和终止索引的copy方法
        // getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)
        // 按charsetName获取byte数组
        // getBytes(String charsetName)
        // 按charset获取byte数组
        // getBytes(Charset charset)
        // 按默认解析为byte数组
        // getBytes()
        // 比较方法 转换为char数组遍历比较
        // boolean equals(Object anObject)
        // 将此字符串与指定的StringBuffer 。 当且仅当此String表示与指定的StringBuffer相同的字符序列时，结果为true
        // contentEquals(StringBuffer sb)
        // 比较方法
        // boolean nonSyncContentEquals(AbstractStringBuilder sb)
        // 比较方法 参数是char序列 如 StringBuffer StringBuilder
        // boolean contentEquals(CharSequence cs)
        // 忽略大小写比较
        // boolean equalsIgnoreCase(String anotherString)
        // 按字典顺序比较两个字符串。
        // 比较基于字符串中每个字符的Unicode值。
        // 此String对象表示的字符序列按字典顺序与参数字符串表示的字符序列进行比较。
        // 如果此String对象按字典顺序排在参数字符串之前，则结果为负整数。
        // 如果此String对象按字典顺序跟随参数字符串，则结果为正整数。
        // 如果字符串相等，结果为零; compareTo在equals(Object)方法返回0完全返回true 。
        // int compareTo(String anotherString)
        // 忽略大小写比较 Comparator的比较方法
        // int compareToIgnoreCase(String str)
        // 字符串区域比较
        // boolean regionMatches(int toffset, String other, int ooffset, int len)
        // 字符串区域比较 ignoreCase是否忽略大小写
        // boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        // 测试从指定索引开始的此字符串的子字符串是否以指定的前缀开头。
        // boolean startsWith(String prefix, int toffset)
        // 测试从起始索引开始的此字符串的子字符串是否以指定的前缀开头。
        // boolean startsWith(String prefix)
        // 测试字符串是否以suffix结尾
        // boolean endsWith(String suffix)
        // 获取hashCode
        // int hashCode()
        // 返回指定字符第一次出现的字符串中的索引
        // int indexOf(int ch)
        // 从指定索引开始 返回指定字符第一次出现的字符串中的索引
        // int indexOf(int ch, int fromIndex)
        // 处理（罕见）带有补充字符的indexOf调用
        // int indexOfSupplementary(int ch, int fromIndex)
        // 返回指定字符最后一次出现的字符串中的索引
        // int lastIndexOf(int ch)
        // 从指定索引开始 返回指定字符最后一次出现的字符串中的索引
        // int lastIndexOf(int ch, int fromIndex)
        // 处理（罕见）带有补充字符的indexOf调用
        // int lastIndexOfSupplementary(int ch, int fromIndex)
        // 返回指定字符串第一次出现的字符串中的索引
        // int indexOf(String str)
        // 从指定索引开始 返回指定字符串第一次出现的字符串中的索引
        // int indexOf(String str, int fromIndex)
        // 从char[] 数组的起始索引sourceOffset偏移量sourceCount寻找target 从索引fromIndex开始 返回字符串第一次出现的位置
        // int indexOf(char[] source, int sourceOffset, int sourceCount, String target, int fromIndex)
        // 从char[] 数组的起始索引sourceOffset偏移量sourceCount
        // 寻找target[]起始索引targetOffset偏移量targetCount从索引fromIndex开始 返回字符串第一次出现位置
        // int indexOf(char[] source, int sourceOffset, int sourceCount,
        // char[] target, int targetOffset, int targetCount, int fromIndex)
        // 最后一次出现str的位置
        // int lastIndexOf(String str)
        // 从指定索引开始最后一次出现str的位置
        // int lastIndexOf(String str, int fromIndex)
        // 从char[] 数组的起始索引sourceOffset偏移量sourceCount寻找target 从索引fromIndex开始 返回字符串最后一次出现的位置
        // int lastIndexOf(char[] source, int sourceOffset, int sourceCount, String target, int fromIndex)
        // 从char[] 数组的起始索引sourceOffset偏移量sourceCount
        // 寻找target[]起始索引targetOffset偏移量targetCount从索引fromIndex开始 返回字符串最后一次出现位置
        // int lastIndexOf(char[] source, int sourceOffset, int sourceCount,
        //  char[] target, int targetOffset, int targetCount, int fromIndex)
        // 从beginIndex位置截取到最后
        // String substring(int beginIndex)
        // 从beginIndex位置截取到endIndex
        // String substring(int beginIndex, int endIndex)
        // 从beginIndex位置截取到endIndex返回序列CharSequence
        // CharSequence subSequence(int beginIndex, int endIndex)
        // 将str连接到该字符串末尾
        // String concat(String str)
        // 将字符串中的oldChar替换为newChar
        // String replace(char oldChar, char newChar)
        // 判断字符串是否符合正则表达式
        // boolean matches(String regex)
        // 判断字符串是否包含字符序列
        // boolean contains(CharSequence s)
        // 按照正则替换第一次符合的字符串为replacement
        // String replaceFirst(String regex, String replacement)
        // 按照正则替换所有符合的字符串为replacement
        // String replaceAll(String regex, String replacement)
        // 将字符串中的字符序列target替换为replacement
        // String replace(CharSequence target, CharSequence replacement)
        // 按照regex对字符串进行切割
        // limit正 则模式将应用最多限制 - 1次，数组的长度不会超过限制 ，并且数组的最后一个条目将包含超出最后一个匹配分隔符的所有输入。
        // limit零 则模式将尽可能多地应用，数组可以具有任何长度，并且将丢弃尾随空字符串。
        // limit负 则模式将尽可能多地应用，并且数组可以具有任何长度。
        // String[] split(String regex, int limit)
        // 按照regex对字符串进行切割 limit为0
        // String[] split(String regex)
        // 返回由CharSequence elements的副本组成的新String，该副本与指定的delimiter的副本连接在一起。
        // static String join(CharSequence delimiter, CharSequence... elements)
        // 返回由String的副本组成的新String ，其中CharSequence elements指定的delimiter的副本。
        // static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
        // 使用给定Locale的规则将此String所有字符转换为Locale
        // String toLowerCase(Locale locale)
        // 字符串转小写 依照Locale.getDefault()
        // String toLowerCase()
        // 使用给定Locale的规则将此String所有字符转换为Locale
        // String toUpperCase(Locale locale)
        // 字符串转大写 依照Locale.getDefault()
        // String toUpperCase()
        // 取出字符串两端的空格
        // String trim()
        // 字符串转字符串
        // String toString()
        // 字符串转char[]数组
        // char[] toCharArray()
        // 使用指定的格式字符串和参数返回格式化字符串。
        // static String format(String format, Object... args)
        // 使用指定的语言环境，格式字符串和参数返回格式化的字符串
        // l - 格式化时应用的locale 。 如果l是null则不应用本地化。
        // static String format(Locale l, String format, Object... args)
        // Object转字符串
        // static String valueOf(Object obj)
        // char data[]转字符串
        // static String valueOf(char data[])
        // char data[]转字符串 从索引offset开始到offset+count结束
        // static String valueOf(char data[], int offset, int count)
        // 复制char data[]为字符串 从索引offset开始到offset+count结束
        // static String copyValueOf(char data[], int offset, int count)
        // 复制 char data[]转字符串
        // static String copyValueOf(char data[])
        // boolean转字符串
        // static String valueOf(boolean b)
        // char转字符串
        // static String valueOf(char c)
        // int转字符串
        // static String valueOf(int i)
        // long转字符串
        // static String valueOf(long l)
        // float转字符串
        // static String valueOf(float f)
        // double转字符串
        // static String valueOf(double d)
        // 返回字符串对象的规范表示。
        // 如果常量池中存在当前字符串, 就会直接返回当前字符串. 如果常量池中没有此字符串, 会将此字符串放入常量池中后, 再返回
        // public native String intern();
        // 存储字符串值的数组
        // private final char value[]
        // 字符串的hash值缓存
        // private int hash;
        // 序列化ID
        // private static final long serialVersionUID = -6849794470754667710L;
        // serialPersistentFields 用于指定哪些字段需要被默认序列化
        // private static final ObjectStreamField[] serialPersistentFields = new ObjectStreamField[0];
        // CaseInsensitiveComparator是排序方法的实现类，
        // 在compare中先按照字符串长度取短的那个字符串的长度作为条件，
        // 然后循环判断两个字符串的第一个字符的ASCII码大小，做出递增排序，
        // 如果两个字符串第一个字符的ASCII码一致，则判断第二个字符，以此类推，
        // 通过这种方式将字符串通过首字母的ASCII码进行排序
        // public static final Comparator<String> CASE_INSENSITIVE_ORDER = new CaseInsensitiveComparator();
    }
}
