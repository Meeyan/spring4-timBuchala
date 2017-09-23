package com.study.springdemo1.beans;

/**
 * bean，没有默认的构造方法，只有非空构造方法
 */
public class Person {

    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void sayPersonInfo() {
        System.out.println("my name is: " + this.name + ", and I am " + age + " years old, and I am a " + sex);
    }

}
