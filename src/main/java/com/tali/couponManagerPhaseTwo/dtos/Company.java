package com.tali.couponManagerPhaseTwo.dtos;

import com.tali.couponManagerPhaseTwo.entites.CompanyEntity;

public class Company {
    private long companyId;
    private String name;
    private String phoneNumber;
    private String address;

    public Company() {
    }

    public Company(CompanyEntity companyEntity) {
        this.companyId = companyEntity.getCompanyId();
        this.name = companyEntity.getName();
        this.phoneNumber = companyEntity.getPhoneNumber();
        this.address = companyEntity.getAddress();
    }

    public Company(long companyId, String name, String phoneNumber, String address) {
        this.companyId = companyId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Company(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
