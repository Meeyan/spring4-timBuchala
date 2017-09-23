package com.study.springdemo1;

import com.study.springdemo1.beans.Organization;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟ioc容器 ,使用ClassPathXmlApplicationContext
 * ioc理解：bean的管理交给spring的ioc-container管理，而不是由开发人员处理。
 *
 * @author zhaojy
 * @createTime 2017-09-23
 */
public class IOCApplication2 {

    public static void main(String[] args) {

        // 获取ioc容器，初始化bean 使用 ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");

        // 从容器中生成bean
        Organization org = ctx.getBean(Organization.class);
        org.corporateSlogan(IOCApplication2.class.getName());

        // 关闭容器
        ctx.close();
    }
}
