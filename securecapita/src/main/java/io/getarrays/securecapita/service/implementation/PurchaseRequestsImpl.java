package io.getarrays.securecapita.service.implementation;

import io.getarrays.securecapita.domain.PurchaseRequests;
import io.getarrays.securecapita.repository.PurchaseRequestsRepository;
import io.getarrays.securecapita.service.PurchaseRequestsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseRequestsImpl implements PurchaseRequestsService {
    private final PurchaseRequestsRepository purchaseRequestsRepository;

    //delete requests
    public boolean deletePurchaseRequest(Long id ){

        return purchaseRequestsRepository.delete(id);

    }


    @Override
    public PurchaseRequests createPurchaseRequest(PurchaseRequests purchaseRequests) {

        return purchaseRequestsRepository.create(purchaseRequests);


    }

    @Override
    public List<PurchaseRequests> getAllPurchaseRequests() {
        return purchaseRequestsRepository.list();
    }

    @Override
    public PurchaseRequests getPurchaseRequestById(Long id) {
        return (PurchaseRequests) purchaseRequestsRepository.get(id);
    }

    @Override
    public boolean deletePurchaseRequests(Long id) {
        return purchaseRequestsRepository.delete(id);
    }
}
