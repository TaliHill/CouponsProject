package com.tali.couponManagerPhaseTwo.dtos;

import com.tali.couponManagerPhaseTwo.entites.PurchaseEntity;

import java.sql.Timestamp;

public class Purchase {
    private long purchaseId;
    private String username;
    private String couponTitle;
    private int amount;
    private Timestamp timestamp;

    public Purchase() {
    }

    public Purchase(PurchaseEntity purchaseEntity) {
        this.purchaseId = purchaseEntity.getPurchaseId();
        this.username = purchaseEntity.getUsername();
        this.couponTitle = purchaseEntity.getCouponTitle();
        this.amount = purchaseEntity.getAmount();
        this.timestamp = purchaseEntity.getTimestamp();
    }

    public Purchase(long purchaseId, String username, String couponTitle, int amount, Timestamp timestamp) {
        this.purchaseId = purchaseId;
        this.username = username;
        this.couponTitle = couponTitle;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public Purchase(String username, String couponTitle, int amount, Timestamp timestamp) {
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

    @Override
    public String toString() {
        return "Purchase{" +
                "purchaseId=" + purchaseId +
                ", username='" + username + '\'' +
                ", couponTitle='" + couponTitle + '\'' +
                ", amount=" + amount +
                ", timestamp=" + timestamp +
                '}';
    }
}
