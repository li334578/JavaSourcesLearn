package com.company.JavaSourceLearn.designPatterns2.creatorMode.design10;

/**
 * @Author: liwenbo
 * @Date: 2021年06月01日
 * @Description:
 */
public class Module {
    private final ModuleA moduleA = new ModuleA();
    private final ModuleB moduleB = new ModuleB();
    private final ModuleC moduleC = new ModuleC();

    public void a1() {
        moduleA.a1();
    }

    public void b1() {
        moduleB.b1();
    }

    public void c1() {
        moduleC.c1();
    }
}
