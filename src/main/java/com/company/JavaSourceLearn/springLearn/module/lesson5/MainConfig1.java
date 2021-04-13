package com.company.JavaSourceLearn.springLearn.module.lesson5;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-11 13:15:22
 */

import org.springframework.context.annotation.Import;
/* @Import中导入了2个普通的类：Service1、Service2，这两个类会被自动注册到容器中 */
@Import({Service1.class, Service2.class})
public class MainConfig1 {
}
