package com.tali.couponManagerPhaseTwo.entites;

import com.tali.couponManagerPhaseTwo.dtos.Customer;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @GeneratedValue
    private long customerId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId", insertable = false, updatable = false)
    private UserEntity user;

    @Column(name = "address")
    private String address;

    @Column(name = "amountOfChildren")
    private Integer amountOfChildren;

    @Column(name = "birthDate")
    private Date birthDate;

    public CustomerEntity() {
    }

    public CustomerEntity(Customer customer) {
        this.customerId = customer.getCustomerId();
        this.address = customer.getAddress();
        this.amountOfChildren = customer.getAmountOfChildren();
        this.birthDate = customer.getBirthDate();
    }

    public CustomerEntity(long customerId, String address, Integer amountOfChildren, Date birthDate) {
        this.customerId = customerId;
        this.address = address;
        this.amountOfChildren = amountOfChildren;
        this.birthDate = birthDate;
    }

    public CustomerEntity(String address, Integer amountOfChildren, Date birthDate) {
        this.address = address;
        this.amountOfChildren = amountOfChildren;
        this.birthDate = birthDate;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(Integer amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
