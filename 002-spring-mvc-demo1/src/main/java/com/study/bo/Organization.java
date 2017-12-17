package com.study.bo;

import com.study.service.GenericWelcomeService;

/**
 *
 */
public class Organization {
    private String companyName;
    private int yearOfIncorporation;
    private String postCode;
    private int employeeCount;
    private String slogan;
    private GenericWelcomeService genericWelcomeService;

    public Organization() {
        System.out.println("----default constructor called..");
    }

    /**
     * bean自己制定的初始化方法
     */
    public void initialize() {
        System.out.println("----self-ready to initialize bean....");
    }

    public static Organization getOrgInstanceStatic(String companyName, String postCode, int employeeCount) {
        System.out.println("----factory method called..");
        return new Organization(companyName, postCode, employeeCount);
    }

    public Organization(String companyName, String postCode, int employeeCount) {
        System.out.println("----constructor method called..");
        this.companyName = companyName;
        this.postCode = postCode;
        this.employeeCount = employeeCount;
    }

    /**
     * bean自己指定的销毁方法
     */
    public void destroy() {
        System.out.println("----self-ready to destroy bean....");
    }

    /**
     * 全局初始化方法
     */
    public void initializeMethod() {
        System.out.println("----global-Organization:init method called....");
    }

    public void destroyMethod() {
        System.out.println("--global-Organization:global destroy method called....");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        System.out.println("----method setCompanyName be called..");
        this.companyName = companyName;
    }

    public int getYearOfIncorporation() {
        return yearOfIncorporation;
    }

    public void setYearOfIncorporation(int yearOfIncorporation) {
        System.out.println("----method setYearOfIncorporation be called..");
        this.yearOfIncorporation = yearOfIncorporation;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        System.out.println("----method setPostCode be called..");
        this.postCode = postCode;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        System.out.println("----method setEmployeeCount be called..");
        this.employeeCount = employeeCount;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        System.out.println("----method setSlogan be called..");
        this.slogan = slogan;
    }

    public GenericWelcomeService getGenericWelcomeService() {
        return genericWelcomeService;
    }

    public void setGenericWelcomeService(GenericWelcomeService genericWelcomeService) {
        this.genericWelcomeService = genericWelcomeService;
    }
}
