package com.study.service;

import java.util.List;

/**
 * @author zhaojy
 * @createTime 2017-10-19
 */
public class GenericWelcomeSVImpl implements GenericWelcomeService {

    public List<String> getWelcomeMsg(String name) {
        return null;
    }

    /**
     * 全局初始化方法
     */
    public void initializeMethod() {
        System.out.println("--global:GenericWelcomeSVImpl: init method called...");
    }

    /**
     * 全局销毁方法
     */
    public void destroyMethod() {
        System.out.println("--global:GenericWelcomeSVImpl: destroy method called...");
    }
}
