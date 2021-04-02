package main.java.com.company.JavaSourceLearn.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 队列测试
 * @date : 2021-02-22 20:44:54
 */
public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.addElement(9);
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.poll());
        myQueue.addElement(8);
        myQueue.addElement(7);
        myQueue.addElement(6);
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.poll()); // queue is empty
    }
}
