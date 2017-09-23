package com.study.springdemo1;

import com.study.springdemo1.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟ioc容器 ,使用ClassPathXmlApplicationContext
 * ioc理解：bean的管理交给spring的ioc-container管理，而不是由开发人员处理。
 * <p/>
 * 本实例主要讲解bean的创建需要传入构造函数所以依赖的参数
 *
 * @author zhaojy
 * @createTime 2017-09-23
 */
public class IOCApplication3 {

    public static void main(String[] args) {

        // 获取ioc容器，初始化bean 使用 ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");

        // 从容器中生成bean
        Person person = ctx.getBean(Person.class);
        person.sayPersonInfo();
        // 关闭容器
        ctx.close();
    }
}
