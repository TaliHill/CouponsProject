package com.tali.couponManagerPhaseTwo.logic;

import com.tali.couponManagerPhaseTwo.dtos.Purchase;
import com.tali.couponManagerPhaseTwo.entites.PurchaseEntity;
import com.tali.couponManagerPhaseTwo.repositories.IPurchasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PurchasesLogic {

    @Autowired
    private IPurchasesRepository purchasesRepository;

    public long createPurchase(Purchase purchase) {
        PurchaseEntity purchaseEntity = new PurchaseEntity(purchase);
        purchasesRepository.save(purchaseEntity);
        return purchaseEntity.getPurchaseId();
    }

    public void updatePurchase(Purchase purchase) {
        PurchaseEntity purchaseEntity = new PurchaseEntity(purchase);
        purchasesRepository.save(purchaseEntity);
    }

    public void deletePurchase(long purchaseId) {
        purchasesRepository.deleteById(purchaseId);
    }

    public Purchase getPurchaseById(long purchaseId) {
        PurchaseEntity purchaseEntity = purchasesRepository.findById(purchaseId).get();
        Purchase purchase = new Purchase(purchaseEntity);
        return purchase;
    }

    public List<Purchase> getAllPurchases() {
        List<Purchase> purchasesList = new ArrayList<>();
        Iterable<PurchaseEntity> purchasesIterable = purchasesRepository.findAll();
        for (PurchaseEntity purchaseEntity : purchasesIterable) {
            Purchase purchase = new Purchase(purchaseEntity);
            purchasesList.add(purchase);
        }
        return purchasesList;
    }

    public Purchase getPurchaseByTitle(String couponTitle) {
        PurchaseEntity purchaseEntity = purchasesRepository.findByCouponTitle(couponTitle);
        Purchase purchase = new Purchase(purchaseEntity);
        return purchase;
    }
}
