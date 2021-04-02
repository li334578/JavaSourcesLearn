package main.java.com.company.JavaSourceLearn.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 测试栈实现
 * @date : 2021-02-22 20:29:12
 */
public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        // myStack.peek(); // stack is empty
        myStack.push(9);
        myStack.push(8);
        myStack.push(7);
        System.out.println(myStack.isEmpty()); // false
        System.out.println(myStack.peek()); // 7
        System.out.println(myStack.pop()); // 7
        System.out.println(myStack.peek()); // 8
        System.out.println(myStack.pop()); // 8
        System.out.println(myStack.pop()); // 9
        System.out.println(myStack.isEmpty()); // true
    }
}
