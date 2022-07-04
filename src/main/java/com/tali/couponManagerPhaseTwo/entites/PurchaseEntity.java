package com.tali.couponManagerPhaseTwo.entites;

import com.tali.couponManagerPhaseTwo.dtos.Purchase;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "purchases")
public class PurchaseEntity {

    @Id
    @GeneratedValue
    private long purchaseId;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "couponTitle", unique = true, nullable = false)
    private String couponTitle;

    @Column(name = "amount", nullable = false)
    private int amount;

    @Column(name = "timestamp", nullable = false)
    private Timestamp timestamp;

    @ManyToOne
    private CouponEntity coupon;

    public PurchaseEntity() {
    }

    public PurchaseEntity(Purchase purchase) {
        this.purchaseId = purchase.getPurchaseId();
        this.username = purchase.getUsername();
        this.couponTitle = purchase.getCouponTitle();
        this.amount = purchase.getAmount();
        this.timestamp = purchase.getTimestamp();
    }

    public PurchaseEntity(long purchaseId, String username, String couponTitle, int amount, Timestamp timestamp) {
        this.purchaseId = purchaseId;
        this.username = username;
        this.couponTitle = couponTitle;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public PurchaseEntity(String username, String couponTitle, int amount, Timestamp timestamp) {
        this.username = username;
        this.couponTitle = couponTitle;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCouponTitle() {
        return couponTitle;
    }

    public void setCouponTitle(String couponTitle) {
        this.couponTitle = couponTitle;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
