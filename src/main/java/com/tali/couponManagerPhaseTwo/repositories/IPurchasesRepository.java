package com.tali.couponManagerPhaseTwo.repositories;

import com.tali.couponManagerPhaseTwo.entites.PurchaseEntity;
import org.springframework.data.repository.CrudRepository;

public interface IPurchasesRepository extends CrudRepository<PurchaseEntity, Long> {
    public PurchaseEntity findByCouponTitle(String couponTitle);
}
