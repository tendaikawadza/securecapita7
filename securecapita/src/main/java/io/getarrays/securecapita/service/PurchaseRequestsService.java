package io.getarrays.securecapita.service;

import io.getarrays.securecapita.domain.PurchaseRequests;

import java.util.List;

public interface PurchaseRequestsService {


    PurchaseRequests createPurchaseRequest(PurchaseRequests purchaseRequests);

    List<PurchaseRequests> getAllPurchaseRequests();

    PurchaseRequests getPurchaseRequestById(Long id);

    boolean deletePurchaseRequests(Long id);
}