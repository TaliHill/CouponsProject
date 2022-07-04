package com.tali.couponManagerPhaseTwo.logic;

import com.tali.couponManagerPhaseTwo.dtos.Coupon;
import com.tali.couponManagerPhaseTwo.entites.CouponEntity;
import com.tali.couponManagerPhaseTwo.repositories.ICouponsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CouponsLogic {

    @Autowired
    private ICouponsRepository couponsRepository;

    public long createCoupon(Coupon coupon) {
        CouponEntity couponEntity = new CouponEntity(coupon);
        couponsRepository.save(couponEntity);
        return couponEntity.getCouponId();
    }

    public void updateCoupon(Coupon coupon) {
        CouponEntity couponEntity = new CouponEntity(coupon);
        couponsRepository.save(couponEntity);
    }

    public void deleteCoupon(long couponId) {
        couponsRepository.deleteById(couponId);
    }

    public Coupon getCouponById(long couponId) {
        CouponEntity couponEntity = couponsRepository.findById(couponId).get();
        Coupon coupon = new Coupon(couponEntity);
        return coupon;
    }

    public List<Coupon> getAllCoupons() {
        List<Coupon> couponsList = new ArrayList<>();
        Iterable<CouponEntity> couponsIterable = couponsRepository.findAll();
        for (CouponEntity couponEntity : couponsIterable) {
            Coupon coupon = new Coupon(couponEntity);
            couponsList.add(coupon);
        }
        return couponsList;
    }

    public Coupon getCouponByTitle(String title) {
        CouponEntity couponEntity = couponsRepository.findByTitle(title);
        Coupon coupon = new Coupon(couponEntity);
        return coupon;
    }
}
