package com.tali.couponManagerPhaseTwo.controllers;

import com.tali.couponManagerPhaseTwo.dtos.Purchase;
import com.tali.couponManagerPhaseTwo.logic.PurchasesLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchasesController {

    @Autowired
    private PurchasesLogic purchasesLogic;

    @PostMapping
    public long createPurchase(@RequestBody Purchase purchase) {
        long purchaseId = purchasesLogic.createPurchase(purchase);
        return purchaseId;
    }

    @PutMapping
    public void updatePurchase(@RequestBody Purchase purchase) {
        purchasesLogic.updatePurchase(purchase);
    }

    @DeleteMapping("/{purchaseId}")
    public void deletePurchase(@PathVariable("purchaseId") long purchaseId) {
        purchasesLogic.deletePurchase(purchaseId);
    }

    @GetMapping("/{purchaseId}")
    public Purchase getPurchaseById(@PathVariable("purchaseId") long purchaseId) {
        return purchasesLogic.getPurchaseById(purchaseId);
    }

    @GetMapping
    public List<Purchase> getAllPurchases() {
        return purchasesLogic.getAllPurchases();
    }

    @GetMapping("/byCouponTitle")
    public Purchase getPurchaseByTitle(@RequestParam("couponTitle") String couponTitle) {
        return purchasesLogic.getPurchaseByTitle(couponTitle);
    }
}
