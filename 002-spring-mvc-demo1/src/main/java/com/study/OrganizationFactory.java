package com.study;

import com.study.bo.Organization;

/**
 * 工厂类
 */
public class OrganizationFactory {

    /**
     * @param companyName   String
     * @param postCode      String
     * @param employeeCount int
     * @return Organization
     */
    public Organization getInstanceNoneStatic(String companyName, String postCode, int employeeCount) {
        System.out.println("----factory class , factory method called..");
        return new Organization(companyName, postCode, employeeCount);
    }
}
