package com.tali.couponManagerPhaseTwo.entites;

import com.tali.couponManagerPhaseTwo.dtos.Coupon;
import com.tali.couponManagerPhaseTwo.enums.CouponCategory;
import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "coupons")
public class CouponEntity {

    @Id
    @GeneratedValue
    private long couponId;

    @Column(name = "title", unique = true, nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "startDate", nullable = false)
    private Date startDate;

    @Column(name = "endDate", nullable = false)
    private Date endDate;

    @Column(name = "category", nullable = false)
    @Enumerated(EnumType.STRING)
    private CouponCategory category;

    @Column(name = "amount", nullable = false)
    private int amount;

    @Column(name = "price", nullable = false)
    private float price;

    @Column(name = "companyId")
    private long companyId;

    @Column(name = "image")
    private String image;

    @OneToMany(mappedBy = "coupon", cascade = CascadeType.REMOVE)
    private List<PurchaseEntity> purchases;

    public CouponEntity() {
    }

    public CouponEntity(Coupon coupon) {
        this.couponId = coupon.getCouponId();
        this.title = coupon.getTitle();
        this.description = coupon.getDescription();
        this.startDate = coupon.getStartDate();
        this.endDate = coupon.getEndDate();
        this.category = coupon.getCategory();
        this.amount = coupon.getAmount();
        this.price = coupon.getPrice();
        this.companyId = coupon.getCompanyId();
        this.image = coupon.getImage();
    }

    public CouponEntity(long couponId, String title, String description, Date startDate, Date endDate, CouponCategory category, int amount, float price, long companyId, String image) {
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

    public CouponEntity(String title, String description, Date startDate, Date endDate, CouponCategory category, int amount, float price, long companyId, String image) {
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
}




