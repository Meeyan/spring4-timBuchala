package com.study.start;

import com.study.bo.OrganizationCN;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用C-namespace定义bean演示
 *
 * @author zhaojy
 * @createTime 2017-12-17
 */
public class CNamespaceApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springMvcDemo-servlet.xml");
        OrganizationCN ocn = context.getBean(OrganizationCN.class);
        System.out.println(ocn);
        context.close();
    }
}
