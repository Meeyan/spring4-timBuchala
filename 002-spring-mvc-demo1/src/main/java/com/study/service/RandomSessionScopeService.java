package com.study.service;

/**
 * @author zhaojy
 * @createTime 2017-10-20
 */
public class RandomSessionScopeService {
    private int randomNumber = 10;

    private int getRandomNumber() {
        return randomNumber;
    }

    private void generateRandomNumber() {
        this.randomNumber = (int) Math.random() * 999;
    }
}
