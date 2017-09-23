package com.study.springdemo1;

import com.study.springdemo1.beans.Organization;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 模拟ioc容器
 * ioc理解：bean的管理交给spring的ioc-container管理，而不是由开发人员处理。
 *
 * @author zhaojy
 * @createTime 2017-09-23
 */
public class IOCApplication {

    public static void main(String[] args) {

        // 获取ioc容器，初始化bean 或者使用 ClassPathXmlApplicationContext
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:spring-beans.xml");

        // 从容器中生成bean
        Organization org = ctx.getBean(Organization.class);
        org.corporateSlogan();

        // 关闭容器
        ctx.close();
    }
}
