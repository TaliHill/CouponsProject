package com.tali.couponManagerPhaseTwo.dtos;

import com.tali.couponManagerPhaseTwo.entites.CouponEntity;
import com.tali.couponManagerPhaseTwo.enums.CouponCategory;

import java.sql.Date;

public class Coupon {
    private long couponId;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    private CouponCategory category;
    private int amount;
    private float price;
    private long companyId;
    private String image;

    public Coupon() {
    }

    public Coupon(CouponEntity couponEntity) {
        this.couponId = couponEntity.getCouponId();
        this.title = couponEntity.getTitle();
        this.description = couponEntity.getDescription();
        this.startDate = couponEntity.getStartDate();
        this.endDate = couponEntity.getEndDate();
        this.category = couponEntity.getCategory();
        this.amount = couponEntity.getAmount();
        this.price = couponEntity.getPrice();
        this.companyId = couponEntity.getCompanyId();
        this.image = couponEntity.getImage();
    }

    public Coupon(long couponId, String title, String description, Date startDate, Date endDate, CouponCategory category, int amount, float price, long companyId, String image) {
        this.couponId = couponId;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.category = category;
        this.amount = amount;
        this.price = price;
        this.companyId = companyId;
        this.image = image;
    }

    public Coupon(String title, String description, Date startDate, Date endDate, CouponCategory category, int amount, float price, long companyId, String image) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.category = category;
        this.amount = amount;
        this.price = price;
        this.companyId = companyId;
        this.image = image;
    }

    public long getCouponId() {
        return couponId;
    }

    public void setCouponId(long couponId) {
        this.couponId = couponId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public CouponCategory getCategory() {
        return category;
    }

    public void setCategory(CouponCategory category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "couponId=" + couponId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", category=" + category +
                ", amount=" + amount +
                ", price=" + price +
                ", companyId=" + companyId +
                ", image='" + image + '\'' +
                '}';
    }
}
