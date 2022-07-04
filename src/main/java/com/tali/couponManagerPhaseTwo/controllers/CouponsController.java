package com.tali.couponManagerPhaseTwo.controllers;

import com.tali.couponManagerPhaseTwo.dtos.Coupon;
import com.tali.couponManagerPhaseTwo.logic.CouponsLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/coupons")
public class CouponsController {

    @Autowired
    private CouponsLogic couponsLogic;

    @PostMapping
    public long createCoupon(@RequestBody Coupon coupon) {
        long couponId = couponsLogic.createCoupon(coupon);
        return couponId;
    }

    @PutMapping
    public void updateCoupon(@RequestBody Coupon coupon) {
        couponsLogic.updateCoupon(coupon);
    }

    @DeleteMapping("/{couponId}")
    public void deleteCoupon(@PathVariable("couponId") long couponId) {
        couponsLogic.deleteCoupon(couponId);
    }

    @GetMapping("/{couponId}")
    public Coupon getCouponById(@PathVariable("couponId") long couponId) {
        return couponsLogic.getCouponById(couponId);
    }

    @GetMapping
    public List<Coupon> getAllCoupons() {
        return couponsLogic.getAllCoupons();
    }
}
