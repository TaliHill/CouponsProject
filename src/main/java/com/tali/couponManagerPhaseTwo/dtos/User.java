package com.tali.couponManagerPhaseTwo.dtos;

import com.tali.couponManagerPhaseTwo.entites.UserEntity;
import com.tali.couponManagerPhaseTwo.enums.UserType;

public class User {
    private long userId;
    private String username;
    private String password;
    private UserType userType;
    private Integer companyId;
    private String firstName;
    private String lastName;

    public User() {
    }

    public User(UserEntity userEntity) {
        this.userId = userEntity.getUserId();
        this.username = userEntity.getUsername();
        this.password = userEntity.getPassword();
        this.userType = userEntity.getUserType();
        this.companyId = userEntity.getCompanyId();
        this.firstName = userEntity.getFirstName();
        this.lastName = userEntity.getLastName();
    }

    public User(long userId, String username, String password, UserType userType, Integer companyId, String firstName, String lastName) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.companyId = companyId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String username, String password, UserType userType, Integer companyId, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.companyId = companyId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                ", companyId=" + companyId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
