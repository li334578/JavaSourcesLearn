package com.company.sources.wrapperClass.character_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Character类
 * @date : 2020-12-25 22:41:00
 */
public class CharacterExample1 {

    public static final byte FINAL_QUOTE_PUNCTUATION = 30;

    public static void main(String[] args) {
        // Unicode符号分类代号
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
        // Unicode符号分类代号
        // Unicode双向字符类型
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
        // Unicode双向字符类型
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
        // true：该字符是字母[Alphabetic]字符
        // static boolean isAlphabetic(int codePoint)


    }
}
