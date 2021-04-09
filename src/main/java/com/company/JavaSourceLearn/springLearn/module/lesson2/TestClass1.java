package com.company.JavaSourceLearn.springLearn.module.lesson2;

import com.company.JavaSourceLearn.springLearn.module.lesson2.bean2.*;
import org.junit.Test;
import org.springframework.cglib.proxy.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-05 12:23:02
 */
public class TestClass1 {

    private ClassPathXmlApplicationContext context;

    private static final String classPath = "classpath:/com/JavaSourceLearn/lesson2/";

    @Test
    public void testMethod1() {
        context = new ClassPathXmlApplicationContext(classPath + "LookupMethod1.xml");
        ServiceA serviceA1 = context.getBean(ServiceA.class);
        ServiceA serviceA2 = context.getBean(ServiceA.class);
        System.out.println(serviceA1);
        System.out.println(serviceA2);
        ServiceB serviceB1 = context.getBean(ServiceB.class);
        ServiceB serviceB2 = context.getBean(ServiceB.class);
        System.out.println(serviceB1);
        System.out.println(serviceB2);
        // serviceC可以获取到同一个serviceA
        ServiceC serviceC1 = context.getBean(ServiceC.class);
        ServiceC serviceC2 = context.getBean(ServiceC.class);
        System.out.println(serviceC1);
        System.out.println(serviceC2);
    }

    @Test
    public void testMethod2() {
        context = new ClassPathXmlApplicationContext(classPath + "LookupMethod1.xml");
        ServiceD serviceD1 = context.getBean(ServiceD.class);
        ServiceD serviceD2 = context.getBean(ServiceD.class);
        System.out.println(serviceD1.getServiceA());
        System.out.println(serviceD2.getServiceA());
        System.out.println("==============");
        serviceD1.say();
        serviceD2.say();
    }

    @Test
    public void testMethod3() {
        // replaceMethod
        context = new ClassPathXmlApplicationContext(classPath + "LookupMethod1.xml");
        ServiceE serviceE1 = context.getBean(ServiceE.class);
        ServiceE serviceE2 = context.getBean(ServiceE.class);
        System.out.println(serviceE1.getServiceA());
        System.out.println(serviceE2.getServiceA());
        System.out.println("==============");
        serviceE1.say();
        serviceE2.say();
    }

    @Test
    public void testMethod4() {
        ServiceImplA serviceImplA = new ServiceImplA();
        serviceImplA.method1();
        serviceImplA.method2();
        serviceImplA.method3();
        ServiceImplB serviceImplB = new ServiceImplB();
        serviceImplB.method1();
        serviceImplB.method2();
        serviceImplB.method3();
    }

    @Test
    public void testMethod5() {
        IService serviceImplA = new ServiceProxy(new ServiceImplA());
        serviceImplA.method1();
        serviceImplA.method2();
        serviceImplA.method3();
        IService serviceImplB = new ServiceProxy(new ServiceImplB());
        serviceImplB.method1();
        serviceImplB.method2();
        serviceImplB.method3();
    }

    @Test
    public void testMethod6() throws Exception {
        Class<IService> proxyClass = (Class<IService>) Proxy.getProxyClass(IService.class.getClassLoader(), IService.class);
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("我是InvocationHandler，被调用的方法是：" + method.getName());
                return null;
            }
        };
        IService iService = proxyClass.getConstructor(InvocationHandler.class).newInstance(invocationHandler);
        iService.method1();
        iService.method2();
        iService.method3();
    }

    @Test
    public void testMethod7() {
        InvocationHandler invocationHandler = (proxy, method, args) -> {
            System.out.println("我是InvocationHandler，被调用的方法是：" + method.getName());
            return null;
        };
        IService iService = (IService) Proxy.newProxyInstance(IService.class.getClassLoader(), new Class[]{IService.class}, invocationHandler);
        iService.method1();
        iService.method2();
        iService.method3();
    }

    @Test
    public void testMethod8() {
        IService serviceA = CostTimeInvocationHandler.createProxy(new ServiceImplA(), IService.class);
        IService serviceB = CostTimeInvocationHandler.createProxy(new ServiceImplB(), IService.class);
        serviceA.method1();
        serviceA.method2();
        serviceA.method3();
        serviceB.method1();
        serviceB.method2();
        serviceB.method3();
    }

    @Test
    public void testMethod9() {
        IUserService userService = CostTimeInvocationHandler.createProxy(new UserService(), IUserService.class);
        userService.insert("法外狂徒张三");
    }

    @Test
    public void testMethod10() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Service1.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("调用方法:" + method);
                //可以调用MethodProxy的invokeSuper调用被代理类的方法
                return methodProxy.invokeSuper(o, objects);
            }
        });

        Service1 service1 = (Service1) enhancer.create();
        service1.method1();
        service1.method2();
    }

    @Test
    public void testMethod11() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Service2.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("调用方法:" + method);
                //可以调用MethodProxy的invokeSuper调用被代理类的方法
                return methodProxy.invokeSuper(o, objects);
            }
        });
        Service2 service2 = (Service2) enhancer.create();
        // method2也会被拦截
        service2.method1();
    }

    @Test
    public void testMethod12() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Service3.class);
        enhancer.setCallback(new FixedValue() {
            @Override
            public Object loadObject() throws Exception {
                return "loadMethod:FixValue";
            }
        });
        Service3 service3 = (Service3) enhancer.create();
        System.out.println(service3.method1());
        System.out.println(service3.method2());
        System.out.println(service3.toString());
    }

    @Test
    public void testMethod13() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Service3.class);
        enhancer.setCallback(new NoOp() {
        });
        Service3 service3 = (Service3) enhancer.create();
        System.out.println(service3.method1());
        System.out.println(service3.method2());
        System.out.println(service3.toString());
    }

    @Test
    public void testMethod14() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Service4.class);
        Callback[] callbacks = {
                //这个用来拦截所有insert开头的方法
                new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        long starTime = System.nanoTime();
                        Object result = methodProxy.invokeSuper(o, objects);
                        long endTime = System.nanoTime();
                        System.out.println(method + "，耗时(纳秒):" + (endTime - starTime));
                        return result;
                    }
                },
                //下面这个用来拦截所有get开头的方法，返回固定值的
                new FixedValue() {
                    @Override
                    public Object loadObject() throws Exception {
                        return "loadObject:FixValue";
                    }
                }
        };
        enhancer.setCallbacks(callbacks);
        /**
         * 设置过滤器CallbackFilter
         * CallbackFilter用来判断调用方法的时候使用callbacks数组中的哪个Callback来处理当前方法
         * 返回的是callbacks数组的下标
         */
        enhancer.setCallbackFilter(new CallbackFilter() {
            @Override
            public int accept(Method method) {
                //获取当前调用的方法的名称
                String methodName = method.getName();
                /**
                 * 方法名称以insert开头，
                 * 返回callbacks中的第1个Callback对象来处理当前方法，
                 * 否则使用第二个Callback处理被调用的方法
                 */
                return methodName.startsWith("insert") ? 0 : 1;
            }
        });
        /*
         *
         * 由于需求中要对不同的方法做不同的处理，所以需要有2个Callback对象，当调用代理对象的方法的时候，
         * 具体会走哪个Callback呢，此时会通过CallbackFilter中的accept来判断，这个方法返回callbacks数组的索引。
         * */
        Service4 service4 = (Service4) enhancer.create();
        service4.insert1();
        service4.insert2();
        System.out.println(service4.get1());
        System.out.println(service4.get2());
    }

    @Test
    public void testMethod15() {
        // method14的优化
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Service4.class);
        //创建2个Callback
        Callback costTimeCallback = (MethodInterceptor) (Object o, Method method, Object[] objects, MethodProxy methodProxy) -> {
            long starTime = System.nanoTime();
            Object result = methodProxy.invokeSuper(o, objects);
            long endTime = System.nanoTime();
            System.out.println(method + "，耗时(纳秒):" + (endTime - starTime));
            return result;
        };
        //下面这个用来拦截所有get开头的方法，返回固定值的
        Callback fixedValueCallback = (FixedValue) () -> "FixValue";
        CallbackHelper callbackHelper = new CallbackHelper(Service4.class, null) {
            @Override
            protected Object getCallback(Method method) {
                return method.getName().startsWith("insert") ? costTimeCallback : fixedValueCallback;
            }
        };
        enhancer.setCallbacks(callbackHelper.getCallbacks());
        enhancer.setCallbackFilter(callbackHelper);
        Service4 service4 = (Service4) enhancer.create();
        service4.insert1();
        service4.insert2();
        System.out.println(service4.get1());
        System.out.println(service4.get2());
    }

    @Test
    public void testMethod16() {
        //创建Service1代理
        Service1 service1 = CostTimeProxy.createProxy(new Service1());
        service1.method1();
        service1.method2();

        //创建Service3代理
        Service3 service3 = CostTimeProxy.createProxy(new Service3());
        System.out.println(service3.method1());
        System.out.println(service3.method2());

    }
}
