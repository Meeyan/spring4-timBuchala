package com.study.service;

/**
 * @author zhaojy
 * @createTime 2017-10-20
 */
public class RandomRequestScopeService {
    int randomNumber = 5;

    public int getRandomNumber() {
        return randomNumber;
    }

    public void generateRandomNumber() {
        this.randomNumber = (int) (Math.random() * 999);
    }
}
