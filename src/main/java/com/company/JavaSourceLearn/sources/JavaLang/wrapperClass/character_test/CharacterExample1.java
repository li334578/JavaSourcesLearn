package com.company.JavaSourceLearn.sources.JavaLang.wrapperClass.character_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Character类
 * @date : 2020-12-25 22:41:00
 */
public class CharacterExample1 {

    public static final byte FINAL_QUOTE_PUNCTUATION = 30;

    public static void main(String[] args) {
        // ==========Unicode符号分类代号==========START
        System.out.println(Character.UNASSIGNED); // Cn - Other, not assigned
        System.out.println(Character.UPPERCASE_LETTER); // Lu - Letter, uppercase
        System.out.println(Character.LOWERCASE_LETTER); // Ll - Letter, lowercase
        System.out.println(Character.TITLECASE_LETTER); // Lt - Letter, titlecase
        System.out.println(Character.MODIFIER_LETTER); // Lm - Letter, modifier
        System.out.println(Character.OTHER_LETTER); // Lo - Letter, other
        System.out.println(Character.NON_SPACING_MARK); // Mn - Mark, nonspacing
        System.out.println(Character.ENCLOSING_MARK); // Me - Mark, enclosing
        System.out.println(Character.COMBINING_SPACING_MARK); // Mc - Mark, spacing combining
        System.out.println(Character.DECIMAL_DIGIT_NUMBER); // Nd - Number, decimal digit
        System.out.println(Character.LETTER_NUMBER); // Nl - Number, letter
        System.out.println(Character.OTHER_NUMBER); // No - Number, other
        System.out.println(Character.SPACE_SEPARATOR); // Zs - Separator, space
        System.out.println(Character.LINE_SEPARATOR); // Zl - Separator, line
        System.out.println(Character.PARAGRAPH_SEPARATOR); // Zp - Separator, paragraph
        System.out.println(Character.CONTROL); // Cc - Other, control
        System.out.println(Character.FORMAT); // Cf - Other, format
        System.out.println(Character.PRIVATE_USE); // Co - Other, private use
        System.out.println(Character.SURROGATE); // Cs - Other, surrogate
        System.out.println(Character.DASH_PUNCTUATION); // Pd - Punctuation, dash
        System.out.println(Character.START_PUNCTUATION); // Ps - Punctuation, open
        System.out.println(Character.END_PUNCTUATION); // Pe - Punctuation, close
        System.out.println(Character.CONNECTOR_PUNCTUATION); // Pc - Punctuation, connector
        System.out.println(Character.OTHER_PUNCTUATION); // Po - Punctuation, other
        System.out.println(Character.MATH_SYMBOL); // Sm - Symbol, math
        System.out.println(Character.CURRENCY_SYMBOL); // Sc - Symbol, currency
        System.out.println(Character.MODIFIER_SYMBOL); // Sk - Symbol, modifier
        System.out.println(Character.OTHER_SYMBOL); // So - Symbol, other
        System.out.println(Character.INITIAL_QUOTE_PUNCTUATION); // Pi - Punctuation, initial quote
        System.out.println(Character.FINAL_QUOTE_PUNCTUATION); // Pf - Punctuation, final quote
        // ==========Unicode符号分类代号==========END
        // ==========Unicode双向字符类型==========START
        System.out.println(Character.DIRECTIONALITY_UNDEFINED); // 未定义
        System.out.println(Character.DIRECTIONALITY_LEFT_TO_RIGHT);// Left-to-Right
        System.out.println(Character.DIRECTIONALITY_RIGHT_TO_LEFT);// Right-to-Left
        System.out.println(Character.DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC);// Arabic Letter
        System.out.println(Character.DIRECTIONALITY_EUROPEAN_NUMBER);// European Number
        System.out.println(Character.DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR);// European Separator
        System.out.println(Character.DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR);// European Number Terminator
        System.out.println(Character.DIRECTIONALITY_ARABIC_NUMBER);// Arabic Number
        System.out.println(Character.DIRECTIONALITY_COMMON_NUMBER_SEPARATOR);// Common Number Separator
        System.out.println(Character.DIRECTIONALITY_NONSPACING_MARK);// Nonspacing Mark
        System.out.println(Character.DIRECTIONALITY_BOUNDARY_NEUTRAL);// Boundary Neutral
        System.out.println(Character.DIRECTIONALITY_PARAGRAPH_SEPARATOR);// Paragraph Separator
        System.out.println(Character.DIRECTIONALITY_SEGMENT_SEPARATOR);// Segment Separator
        System.out.println(Character.DIRECTIONALITY_WHITESPACE);// Whitespace
        System.out.println(Character.DIRECTIONALITY_OTHER_NEUTRALS);// Other Neutrals
        System.out.println(Character.DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING);// Left-to-Right Embedding
        System.out.println(Character.DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE);// Left-to-Right Override
        System.out.println(Character.DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE);// Left-to-Right Override
        System.out.println(Character.DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING);// Right-to-Left Embedding
        System.out.println(Character.DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE);// Right-to-Left Override
        System.out.println(Character.DIRECTIONALITY_POP_DIRECTIONAL_FORMAT);//  Pop Directional Format
//        System.out.println(Character.DIRECTIONALITY_LEFT_TO_RIGHT_ISOLATE);// Left-to-Right Isolate
//        System.out.println(Character.DIRECTIONALITY_RIGHT_TO_LEFT_ISOLATE);// Right-to-Left Isolate
//        System.out.println(Character.DIRECTIONALITY_FIRST_STRONG_ISOLATE);// First Strong Isolate
//        System.out.println(Character.DIRECTIONALITY_POP_DIRECTIONAL_ISOLATE);// Pop Directional Isolate
        // ==========Unicode双向字符类型==========END
        // 进制转换约束下限，最小2进制
        System.out.println(Character.MIN_RADIX);
        // 进制转换约束上限，最大36进制，因为10个数字+26个字母的限制
        System.out.println(Character.MAX_RADIX);
        // char的最小值，Unicode基本平面区码点最小值
        System.out.println(Character.MIN_VALUE);
        // char的最大值，Unicode基本平面区码点最大值
        System.out.println(Character.MAX_VALUE);
        // 基本类型char的包装类实例
        System.out.println(Character.TYPE);
        // Unicode码点最小值
        System.out.println(Character.MIN_CODE_POINT);
        // Unicode码点最大值
        System.out.println(Character.MAX_CODE_POINT);
        // Unicode非基本平面区码点最小值
        System.out.println(Character.MIN_SUPPLEMENTARY_CODE_POINT);
        // 高代理区[U+D800~U+DBFF]的左边界
        System.out.println(Character.MIN_HIGH_SURROGATE);
        // 高代理区[U+D800~U+DBFF]的右边界
        System.out.println(Character.MAX_HIGH_SURROGATE);
        // 低代理区[U+DC00~U+DFFF]的左边界
        System.out.println(Character.MIN_LOW_SURROGATE);
        // 低代理区[U+DC00~U+DFFF]的右边界
        System.out.println(Character.MAX_LOW_SURROGATE);
        // Unicode高代理区下限
        System.out.println(Character.MIN_SURROGATE);
        // Unicode低代理区上限
        //
        // （无符号）char所占的位数
        System.out.println(Character.SIZE);
        // （无符号）char所占的字节数
        System.out.println(Character.BYTES);
        // 错误标记
//        System.out.println(Character.ERROR);
        //  装箱，返回char的包装类实例。如果char范围在[0, 127]内，则使用缓存
        // static Character valueOf(char c)
        // 拆箱，将Character对象转为char值
        // char charValue()
        // ==========判断字符属性==========START
        // true：该字符是字母[Alphabetic]字符
        // static boolean isAlphabetic(int codePoint)
        // true：该字符是表意字符
        // static boolean isIdeographic(int codePoint)
        // true：该字符可位于Java标识符起始位置
        // static boolean isJavaIdentifierStart(char ch)
        // true：该字符可位于Java标识符起始位置
        // static boolean isJavaIdentifierStart(int codePoint)
        // true：该字符可位于Java标识符的非起始部分
        // static boolean isJavaIdentifierPart(char ch)
        // true：该字符可位于Java标识符的非起始部分
        // static boolean isJavaIdentifierPart(int codePoint)
        // true：该字符可位于Unicode标识符的起始部分
        // static boolean isUnicodeIdentifierStart(char ch)
        // true：该字符可位于Unicode标识符的起始部分
        // static boolean isUnicodeIdentifierStart(int codePoint)
        // true：该字符可位于Unicode标识符的非起始部分
        // static boolean isUnicodeIdentifierPart(char ch)
        // true：该字符可位于Unicode标识符的非起始部分
        // static boolean isUnicodeIdentifierPart(int codePoint)
        // true：该字符在标识符内是可忽略的
        // static boolean isIdentifierIgnorable(char ch)
        // true：该字符在标识符内是可忽略的
        // static boolean isIdentifierIgnorable(int codePoint)
        // true：该字符是小写字符
        // static boolean isLowerCase(char ch)
        // true：该字符是小写字符
        // static boolean isLowerCase(int codePoint)
        // true：该字符是大写字符
        // static boolean isUpperCase(char ch)
        // true：该字符是大写字符
        // static boolean isUpperCase(int codePoint)
        // true：该字符是TitleCase
        // static boolean isTitleCase(char ch)
        // true：该字符是TitleCase
        // static boolean isTitleCase(int codePoint)
        // true：该字符是数字字符
        // static boolean isDigit(char ch)
        // true：该字符是数字字符
        // static boolean isDigit(int codePoint)
        // true：该字符在Unicode定义
        // static boolean isDefined(char ch)
        // true：该字符在Unicode定义
        // static boolean isDefined(int codePoint)
        // true：该字符属于字母
        // static boolean isLetter(char ch)
        // true：该字符属于字母
        // static boolean isLetter(int codePoint)
        // 确定指定的字符是否允许作为Java标识符中的第一个字符。
        // static boolean isJavaLetter(char ch)
        // true：该字符属于字母或数字
        // static boolean isLetterOrDigit(char ch)
        // true：该字符属于字母或数字
        // static boolean isLetterOrDigit(int codePoint)
        // 确定指定字符是否可以是Java标识符的一部分，而不是第一个字符。
        // static boolean isJavaLetterOrDigit(char ch)
        // true：该字符是Unicode空格
        // static boolean isSpaceChar(char ch)
        // true：该字符是Unicode空格
        // static boolean isSpaceChar(int codePoint)
        // true：该字符是Java空白符
        // static boolean isWhitespace(char ch)
        // true：该字符是Java空白符
        // static boolean isWhitespace(int codePoint)
        // true：该字符是空格
        // static boolean isSpace(char ch)
        // true：该字符是ISO控制字符
        // static boolean isISOControl(char ch)
        // true：该字符是ISO控制字符
        // static boolean isISOControl(int codePoint)
        // true：该字符是镜像字符，如<>[]()
        // static boolean isMirrored(char ch)
        // true：该字符是镜像字符，如<>[]()
        // static boolean isMirrored(int codePoint)
        // 判断字符属性
        // 字符属性转换
        // 转为小写形式
        // static char toLowerCase(char ch)
        // 转为小写形式
        // static int toLowerCase(int codePoint)
        // 转为大写形式
        // static char toUpperCase(char ch)
        // 转为大写形式
        // static int toUpperCase(int codePoint)
        // 转为TitleCase形式
        // static char toTitleCase(char ch)
        // 转为TitleCase形式
        // static int toTitleCase(int codePoint)
        // 转为大写形式（考虑可能出现的扩展字符）
        // int toUpperCaseEx(int codePoint)
        // 将字符ch存入字符数组，如果是索引223处的字符ß，需要特殊处理
        // static char[] toUpperCaseCharArray(int codePoint)
        // ==========字符属性转换==========END
        // ==========比较==========START
        // 比较字符x和字符y，返回x-y的结果
        // static int compare(char x, char y)
        // 拿当前字符与参数中的字符做比较，返回值<0代表当前字符小于参数中的字符，以此类推
        // int compareTo(Character anotherCharacter)
        // ==========比较==========END
        // ==========码点/码元==========START
        // true：codePoint是合法的Unicode编码，其范围是：[0x000000, 0x10FFFF]
        // static boolean isValidCodePoint(int codePoint)
        // true：codePoint是基本平面区的码点值[0x0000, 0xFFFF]
        // static boolean isBmpCodePoint(int codePoint)
        // true：codePoint是非基本平面区码点值[0x010000, 0x10FFFF]
        // static boolean isSupplementaryCodePoint(int codePoint)
        // true：字符ch位于高代理区[U+D800 ~ U+DBFF]
        // static boolean isHighSurrogate(char ch)
        // true：字符ch位于低代理区[U+DC00 ~ U+DFFF]
        // static boolean isLowSurrogate(char ch)
        // true：字符ch位于Unicode代理区['\uD800', '\uDFFF']
        // static boolean isSurrogate(char ch)
        // true：字符high和字符low分别是高低代理区的字符
        // static boolean isSurrogatePair(char high, char low)
        // 返回该Unicode符号所占的char的个数
        // static int charCount(int codePoint)
        // 高、低代理区的码点值 ---> Unicode符号编码值
        // static int toCodePoint(char high, char low)
        // 返回索引index处码元的码点值，如果该码元位于Unicode编码的高代理区，则需返回完整的Unicode编码
        // static int codePointAt(CharSequence seq, int index)
        // 返回索引index处码元的码点值，如果该码元位于Unicode编码的高代理区，则需返回完整的Unicode编码
        // int codePointAtImpl(char[] a, int index, int limit)
        // 返回索引index处码元的码点值，如果该码元位于Unicode编码的高代理区，则需返回完整的Unicode编码
        // static int codePointAt(char[] a, int index)
        // 返回索引index处码元的码点值，如果该码元位于Unicode编码的高代理区，则需返回完整的Unicode编码
        // static int codePointAt(char[] a, int index, int limit)
        // 返回索引index-1处码元的码点值，如果该码元位于Unicode编码的低代理区，则需返回完整的Unicode编码
        // static int codePointBefore(CharSequence seq, int index)
        // 返回索引index-1处码元的码点值，如果该码元位于Unicode编码的低代理区，则需返回完整的Unicode编码
        // int codePointBeforeImpl(char[] a, int index, int start)
        // 返回索引index-1处码元的码点值，如果该码元位于Unicode编码的低代理区，则需返回完整的Unicode编码
        // static int codePointBefore(char[] a, int index)
        // 返回索引index-1处码元的码点值，如果该码元位于Unicode编码的低代理区，则需返回完整的Unicode编码
        // static int codePointBefore(char[] a, int index, int start)
        // 非基本平面的字符X的码点值 ---> 基本平面高代理区的码点值
        // static char highSurrogate(int codePoint)
        // 非基本平面的字符的码点值 ---> 基本平面低代理区的码点值
        // static char lowSurrogate(int codePoint)
        // 将非基本平面区的Unicode码点值codePoint拆分为高、低代理区码点值存入dst数组（按大端法存储）
        // void toSurrogates(int codePoint, char[] dst, int index)
        // 返回[beginIndex, endIndex)范围内的Unicode符号数量
        // static int codePointCount(CharSequence seq, int beginIndex, int endIndex)
        // 返回[offset, offset+count)范围内的Unicode符号数量
        // static int codePointCount(char[] a, int offset, int count)
        // 返回[offset, offset+count)范围内的Unicode符号数量
        // static int codePointCountImpl(char[] a, int offset, int count)
        // Unicode码点值 ---> char，对于增补平面区码点值，需要拆分成高、低代理单元再存储
        // static int toChars(int codePoint, char[] dst, int dstIndex)
        // Unicode码点值 ---> char，对于增补平面区码点值，需要拆分成高、低代理单元再存储
        // static char[] toChars(int codePoint)
        // 由Unicode字符区域名称获取对应的码点值，如Character.codePointOf("CJK UNIFIED IDEOGRAPHS 54C8")==0x54c8
        // static int codePointOf(String name)
        // 由码点值获取对应的Unicode字符区域名称，如Character.getName(0x54c8)=="CJK UNIFIED IDEOGRAPHS 54C8"
        // static String getName(int codePoint)
        // ==========码点/码元==========END
        // 返回从index偏移codePointOffset个Unicode符号后新的索引值，codePointOffset的正负决定了偏移方向
        // static int offsetByCodePoints(CharSequence seq, int index, int codePointOffset)
        // 返回index偏移codePointOffset个Unicode符号后新的索引值 codePointOffset的正负决定了偏移方向
        // 此方法中索引x的活动范围由[index, start+count)给出，而不是传统的[0, length)。
        // static int offsetByCodePointsImpl(char[] a, int start, int count, int index, int codePointOffset)
        // 返回index偏移codePointOffset个Unicode符号后新的索引值，具体信息参见#offsetByCodePointsImpl方法
        // static int offsetByCodePoints(char[] a, int start, int count, int index, int codePointOffset)
        // 返回字符ch在radix进制中代表的数值
        // static int digit(char ch, int radix)
        // 返回码点值为codePoint的Unicode字符在radix进制中代表的数值
        // static int digit(int codePoint, int radix)
        // 返回数字digit在radix进制下的字母表示，如forDigit(10, 16)=='a'
        // static char forDigit(int digit, int radix)
        // 返回字符ch在进制运算中表示的数值，如输入'3'返回3，输入'A'或'a'返回10
        // static int getNumericValue(char ch)
        // 返回码点值为codePoint的Unicode字符在进制运算中表示的数值，如输入'3'返回3，输入'A'或'a'返回10
        // static int getNumericValue(int codePoint)
        // ==========字符串化==========START
        // 转换char ---> String
        // static String toString(char c)
        // 转换Unicode符号的codePoint为字节表示，再包装到String返回
        // static String toString(int codePoint)
        // ==========字符串化==========END
        // 获取字符类型
        // static int getType(char ch)
        // 获取字符类型，该类型由Unicode国际规范指定，可参见Character类中的"Unicode符号分类代号"
        // static int getType(int codePoint)
        // 获取Unicode字符ch的方向属性（文本有不同的书写方向，参见Character类中的"Unicode双向字符类型")
        // static byte getDirectionality(char ch)
        // 获取码点值为codePoint的Unicode字符的方向属性（文本有不同的书写方向，参见Character类中的"Unicode双向字符类型")
        // static byte getDirectionality(int codePoint)
        // 以字节为单位逆置字节顺序
        // static char reverseBytes(char ch)
        // ==========Object==========START
        // 返回字符value的hash值
        // static int hashCode(char value)
        // 返回当前字符的hash值
        // int hashCode()
        // 判等
        // boolean equals(Object obj)
        // 字符串化
        // String toString()
        // ==========Object==========END
        // 字符缓存，缓存了[0, 127]范围内的char，避免每次包装char都new对象
        // private static class CharacterCache
        // Unicode字符区域合辑，不包括Unicode私有保留区域
        // enum UnicodeScript
        // private static final int[] scriptStarts
        // private static final UnicodeScript[] scripts
        // private static HashMap<String, UnicodeScript> aliases;
        // 为每种字符集映射一个简写名称
        // 返回Unicode脚本名称或脚本名称别名的UnicodeScript常量。脚本名称及其别名由Unicode标准确定。
        // static final UnicodeScript forName(String scriptName)
        // 返回Unicode代码点codePoint所对应的Unicode脚本枚举常量。
        // static UnicodeScript of(int codePoint)
        /*
         * 此类的实例表示Unicode字符区域的特定子集。
         * Character类中定义的唯一子集族是Character.UnicodeBlock。
         * Java API的其他部分可以为其自身目的而定义其他子集。
         */
        // static class Subset
        // Unicode字符区域，包括Unicode私有保留区域。不同类别的符号会划分到不同的Unicode字符区域
        // static final class UnicodeBlock extends Subset
        // 别名系统的存在是因为历史原因，有些Unicode字符区域名称不唯一
        // Unicode字符区域别名系统
        // Unicode字符集的Unicode编码范围的起始值
        // private static final int blockStarts[]
        // 构造方法中，会将字符区域的名称/别名与自身对象关联映射到一起
        /*
         * private UnicodeBlock(String idName) {
         *            super(idName);
         *            map.put(idName, this);
         *        }
         */
        /*
         * private UnicodeBlock(String idName, String alias) {
         *             this(idName);
         *             map.put(alias, this);
         *         }
         */
        /*
         * private UnicodeBlock(String idName, String... aliases) {
         *             this(idName);
         *             for(String alias : aliases)
         *                 map.put(alias, this);
         *         }
         */
        // 638  - 预期的元素个数 0.75 - HashMap默认的装填因子
        // private static Map<String, UnicodeBlock> map = new HashMap<>((int) (638 / 0.75f + 1.0f));
        // 返回当前Unicode代码点所在的字符区域
        // static UnicodeBlock of(int codePoint)
        // 返回该字符区域名称/别名对应的字符区域对象
        // static final UnicodeBlock forName(String blockName)

    }
}
