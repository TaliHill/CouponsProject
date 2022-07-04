package com.tali.couponManagerPhaseTwo.entites;

import com.tali.couponManagerPhaseTwo.dtos.Company;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "companies")
public class CompanyEntity {

    @Id
    @GeneratedValue
    private long companyId;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "company", cascade = CascadeType.REMOVE)
    private List<UserEntity> users;

    @OneToMany(mappedBy = "companyId", cascade = CascadeType.REMOVE)
    private List<CouponEntity> coupons;

    public CompanyEntity() {
    }

    public CompanyEntity(Company company) {
        this.companyId = company.getCompanyId();
        this.name = company.getName();
        this.phoneNumber = company.getPhoneNumber();
        this.address = company.getAddress();
    }

    public CompanyEntity(long companyId, String name, String phoneNumber, String address) {
        this.companyId = companyId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public CompanyEntity(String name, String phoneNumber, String address) {
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
}
