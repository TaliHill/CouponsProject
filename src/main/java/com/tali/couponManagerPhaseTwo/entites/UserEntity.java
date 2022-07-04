package com.tali.couponManagerPhaseTwo.entites;

import com.tali.couponManagerPhaseTwo.dtos.User;
import com.tali.couponManagerPhaseTwo.enums.UserType;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue
    public long userId;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "userType", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserType userType;

    @Column(name = "companyId")
    private Integer companyId;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @ManyToOne
    private CompanyEntity company;

    public UserEntity() {
    }

    public UserEntity(User user) {
        this.userId = user.getUserId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.userType = user.getUserType();
        this.companyId = user.getCompanyId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
    }

    public UserEntity(long userId, String username, String password, UserType userType, Integer companyId, String firstName, String lastName) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.companyId = companyId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserEntity(String username, String password, UserType userType, Integer companyId, String firstName, String lastName) {
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
}

