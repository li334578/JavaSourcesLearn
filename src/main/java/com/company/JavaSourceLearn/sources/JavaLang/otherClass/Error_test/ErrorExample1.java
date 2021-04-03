package com.company.JavaSourceLearn.sources.JavaLang.otherClass.Error_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Error
 * @date : 2021-01-20 20:34:17
 */
public class ErrorExample1 {
    public static void main(String[] args) {
        // 构造一个新错误，其详细信息为null 。 原因未初始化，并且随后可以通过调用initCause来初始化。
        /*
         * public Error() {
         *         super();
         *     }
         */
        // 构造一个指定msg的错误
        /*
         * public Error(String message) {
         *         super(message);
         *     }
         */
        // 使用指定的详细消息和原因构造一个新错误。
        // 请注意，与cause关联的详细消息不会自动合并到此错误的详细消息中。
        /*
         * public Error(String message, Throwable cause) {
         *         super(message, cause);
         *     }
         */
        // 使用指定的cause和(cause==null ? null : cause.toString())的详细信息构造一个新错误
        // （通常包含cause的类和详细信息）。 此构造函数对仅比其他throwable的包装器有用的错误很有用。
        /*
         * public Error(Throwable cause) {
         *         super(cause);
         *     }
         */
        // 使用指定的详细消息构造新错误，启用或禁用原因，抑制，以及启用或禁用可写堆栈跟踪。
        /*
         * protected Error(String message, Throwable cause,
         *                     boolean enableSuppression,
         *                     boolean writableStackTrace) {
         *         super(message, cause, enableSuppression, writableStackTrace);
         *     }
         */
        // 序列化id
        // static final long serialVersionUID = 4980196508277280342L;
    }
}
