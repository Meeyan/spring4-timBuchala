package com.study.bo;

import com.study.service.GenericWelcomeService;

/**
 * 使用C-namespace定义bean对象
 *
 * @author zhaojy
 * @createTime 2017-12-17
 */
public class OrganizationCN {
    private String companyName;
    private int yearOfIncorporation;
    private String postCode;
    private int employeeCount;
    private String slogan;
    private Address address;

    public OrganizationCN(String companyName, String postCode, Address address) {
        this.companyName = companyName;
        this.postCode = postCode;
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrganizationCN{" +
                "companyName='" + companyName + '\'' +
                ", postCode='" + postCode + '\'' +
                ", address=" + address +
                '}';
    }
}
