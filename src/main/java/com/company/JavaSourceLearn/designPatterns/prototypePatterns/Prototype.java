package main.java.com.company.JavaSourceLearn.designPatterns.prototypePatterns;

/**
 * @Author: liwenbo
 * @Date: 25/3/2021
 * @Description: 原型模式
 */
// 需要实现Cloneable接口
public class Prototype implements Cloneable {

    // 类构造器
    public Prototype() {
        System.out.println("具体原型创建成功");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        // 原型测试类
        Prototype prototype1 = new Prototype();

        Prototype prototype2 = prototype1.clone();
        System.out.println(prototype1 == prototype2); // false
    }

    public Prototype clone() throws CloneNotSupportedException {
        System.out.println("具体原型已经克隆成功");
        return (Prototype) super.clone();
    }
}
