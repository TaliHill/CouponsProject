package com.tali.couponManagerPhaseTwo.repositories;

import com.tali.couponManagerPhaseTwo.entites.CouponEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICouponsRepository extends CrudRepository<CouponEntity, Long> {
    public CouponEntity findByTitle(String title);
}
