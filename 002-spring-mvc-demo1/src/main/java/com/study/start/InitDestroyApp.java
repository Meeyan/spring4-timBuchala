package com.study.start;

import com.study.bo.Organization;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 演示bean的初始化和销毁方法
 *
 * @author zhaojy
 * @createTime 2017-12-10
 */
public class InitDestroyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springMvcDemo-servlet.xml");
        Organization org1 = (Organization) context.getBean("organization");
        Organization org2 = (Organization) context.getBean("organization2");
        System.out.println(org1);
        System.out.println(org2);
        context.close();
    }

}
