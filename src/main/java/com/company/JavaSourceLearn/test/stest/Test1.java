package com.company.JavaSourceLearn.test.stest;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.japi.Pair;
import javassist.*;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-10-06 21:05:53
 */
public class Test1 {
    private static String MAN = "man";
    private static String WOMAN = "woman";
    private static Map<String, Consumer<String>> FUNC_MAP = new ConcurrentHashMap<>();
    private static String WC_EVENT = "想上厕所";
    private static String WC_OVER_EVENT = "上完厕所了";
    private static ActorSystem actorSystem1 = ActorSystem.create();

    static {
        FUNC_MAP.put(MAN, name -> System.out.println(name + "应该使用男厕所"));
        FUNC_MAP.put(WOMAN, name -> System.out.println(name + "应该使用女厕所"));
    }

    @Data
    static class Person {
        private String gender;
        private String name;

        public void goToWc() {
            FUNC_MAP.get(gender).accept(name);
        }
    }


    @Test
    public void testMethod1() {
        Person p1 = new Person();
        p1.setGender(MAN);
        p1.setName("张三");
        if (Objects.equals(p1.getGender(), MAN)) {
            System.out.println(p1.getName() + "应该使用男厕所");
        }
        if (Objects.equals(p1.getGender(), WOMAN)) {
            System.out.println(p1.getName() + "应该使用女厕所");
        }
    }

    @Test
    public void testMethod2() {
        Person p1 = new Person();
        p1.setGender(WOMAN);
        p1.setName("李四");
        FUNC_MAP.get(p1.getGender()).accept(p1.getName());
    }

    @Test
    public void testMethod3() {
        Person p1 = PersonFactory.initPerson("王五", MAN);
        Person p2 = PersonFactory.initPerson("赵六", WOMAN);
        p1.goToWc();
        p2.goToWc();
    }

    @Test
    public void testMethod4() {
        ActorSystem actorSystem = ActorSystem.create();
        ActorRef person = actorSystem.actorOf(Person1.props("张三", MAN), "ZhangSan");
        ActorRef toilet = actorSystem.actorOf(Toilet.props(), "Toilet");
        Pair<String, ActorRef> message = Pair.apply(WC_EVENT, toilet);
        person.tell(message, ActorRef.noSender());
    }

    @Test
    public void testMethod5() throws Exception {
        // class什么的根本不需要，直接动态创建类，对于复杂场景可以搞分布式remoteActor
        // 创建一个Car类(领域对象），并实例化，定义他的消息处理方法(或者你乐意叫领域驱动事件也可以)
        ActorRef car = createDynamicClassImpl("Car", (self, message) -> {
            System.out.println(message);
            System.out.println("开车走咯~");
        });

        // 创建一个Toilet类，并实例化，定义他的消息处理方法(或者你乐意叫领域驱动事件也可以)
        ActorRef toilet = createDynamicClassImpl("Toilet", (self, message) -> {
            try {
                Map<String, Consumer<String>> FUNC_MAP = new HashMap<>();
                FUNC_MAP.put(MAN, person -> System.out.println(person + "应该去男厕所"));
                FUNC_MAP.put(WOMAN, person -> System.out.println(person + "应该去女厕所"));
                // 因为是无类型取值使用反射
                String gender = message.getClass().getField("gender").get(message).toString();
                String name = message.getClass().getField("name").get(message).toString();
                FUNC_MAP.get(gender).accept(name);
                car.tell(name + WC_OVER_EVENT, ActorRef.noSender());
            } catch (Exception e) {
                System.out.println("厕所不太欢迎这位");
            }

        });

        // 创建一个Person类，具有两个属性name和gender，并实例化，定义他的消息处理方法(或者你乐意叫领域驱动事件也可以)
        ActorRef person = createDynamicClassImpl("Person1", (self, message) -> {
            Pair<String, ActorRef> pair = (Pair<String, ActorRef>) message;
            System.out.println(pair.first());
            pair.second().tell(self, ActorRef.noSender());
        }, Pair.apply("name", "张三"), Pair.apply("gender", MAN));
        // 告诉张三想上厕所了 让他找厕所去
        person.tell(Pair.apply(WC_EVENT, toilet), ActorRef.noSender());
    }

    static class PersonFactory {
        public static Person initPerson(String name, String gender) {
            Person p1 = new Person();
            p1.setGender(gender);
            p1.setName(name);
            return p1;
        }
    }

    @Data
    static class Person1 extends UntypedActor {
        private String gender;
        private String name;

        public static Props props(final String name, final String gender) {
            return Props.create(Person1.class, () -> {
                Person1 p = new Person1();
                p.setGender(gender);
                p.setName(name);
                return p;
            });
        }

        @Override
        public void onReceive(Object message) throws Throwable {
            Pair<String, ActorRef> m = (Pair<String, ActorRef>) message;
            System.out.println(name + m.first());
            m.second().tell(this, ActorRef.noSender());
        }
    }

    @Data
    static class Toilet extends UntypedActor {
        private static Map<String, Consumer<String>> FUNC_MAP = new ConcurrentHashMap<>();

        static {
            FUNC_MAP.put(MAN, person -> System.out.println(person + "应该去男厕所"));
            FUNC_MAP.put(WOMAN, person -> System.out.println(person + "应该去女厕所"));
        }

        public void wc(Person1 p) {
            FUNC_MAP.get(p.getGender()).accept(p.getName());
        }

        public static Props props() {
            return Props.create(Toilet.class);
        }

        @Override
        public void onReceive(Object message) {
            Person1 p = (Person1) message;
            wc(p);
        }
    }


    /**
     * 创建一个动态类，并实例化为对象，该方法会根据参数动态构建Class
     *
     * @param name          动态类名
     * @param function      actor模型消息处理方法 两个参数 一个是自身，一个是消息
     * @param attrAndValues 动态类的 属性 和 属性值
     * @return actor引用
     * @throws Exception
     */
    public static ActorRef createDynamicClassImpl(String name, BiConsumer function, Pair<String, String>... attrAndValues) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        // 动态定义包名 瞎几把写就行
        String className = "com.company.JavaSourceLearn.test.stest" + name;
        // 创建一个空类
        CtClass cc = pool.makeClass(className);
        // 动态继承抽象类UntypedActor
        cc.setSuperclass(pool.get(UntypedActor.class.getName()));
        // 动态根据参数创建类的属性
        for (Pair<String, String> attrValue : attrAndValues) {
            CtField param = new CtField(pool.get(String.class.getName()), attrValue.first(), cc);
            // 访问级别是 PUBLIC
            param.setModifiers(Modifier.PUBLIC);
            cc.addField(param, CtField.Initializer.constant(attrValue.second()));
        }

        //创建类一个属性叫function 类型是BiConsumer
        CtField param = new CtField(pool.get(BiConsumer.class.getName()), "function", cc);
        //访问级别是 PRIVATE
        param.setModifiers(Modifier.PRIVATE);
        cc.addField(param);
        //创建模板方法 方法是执行BiConsumer对应的lambda表达式
        CtMethod m = CtNewMethod.make(
                "public void onReceive(Object message) { function.accept($0 ,message);}",
                cc);
        cc.addMethod(m);
        // 动态添加构造函数
        CtConstructor cons = new CtConstructor(new CtClass[]{pool.get(BiConsumer.class.getName())}, cc);
        // 构造函数内容就是给function参数赋值
        cons.setBody("{ $0.function = $1 ;}");
        cc.addConstructor(cons);
        //-----------动态Actor类构建完毕------------
        // 实例化Actor
        Props p = Props.create(UntypedActor.class,
                () -> (UntypedActor) cc.toClass().getConstructor(BiConsumer.class).newInstance(function));
        return actorSystem1.actorOf(p);
    }
}
