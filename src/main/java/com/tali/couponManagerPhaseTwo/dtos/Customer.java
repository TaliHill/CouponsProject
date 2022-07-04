package com.tali.couponManagerPhaseTwo.dtos;

import com.tali.couponManagerPhaseTwo.entites.CustomerEntity;

import java.sql.Date;

public class Customer {
    private long customerId;
    private User user;
    private String address;
    private Integer amountOfChildren;
    private Date birthDate;

    public Customer() {
    }

    public Customer(CustomerEntity customerEntity) {
        this.customerId = customerEntity.getCustomerId();
        this.user = new User(customerEntity.getUser());
        this.address = customerEntity.getAddress();
        this.amountOfChildren = customerEntity.getAmountOfChildren();
        this.birthDate = customerEntity.getBirthDate();
    }

    public Customer(long customerId, User user, String address, Integer amountOfChildren, Date birthDate) {
        this.customerId = customerId;
        this.user = user;
        this.address = address;
        this.amountOfChildren = amountOfChildren;
        this.birthDate = birthDate;
    }

    public Customer(User user, String address, Integer amountOfChildren, Date birthDate) {
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
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

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", user=" + user +
                ", address='" + address + '\'' +
                ", amountOfChildren=" + amountOfChildren +
                ", birthDate=" + birthDate +
                '}';
    }
}



