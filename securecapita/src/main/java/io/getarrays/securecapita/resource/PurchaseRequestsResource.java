package io.getarrays.securecapita.resource;

import io.getarrays.securecapita.domain.PurchaseRequests;
import io.getarrays.securecapita.service.PurchaseRequestsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/purcharserequetsts")
@RequiredArgsConstructor
public class PurchaseRequestsResource {

    private final PurchaseRequestsService purchaseRequestsService;

    @PostMapping("/create")
    public ResponseEntity<PurchaseRequests> createPurchase(@RequestBody PurchaseRequests purchaseRequests) {
        return ResponseEntity.ok(
                purchaseRequestsService.createPurchaseRequest(purchaseRequests)
        );
    }


    @GetMapping(path = "/{id}")
    public ResponseEntity<PurchaseRequests> findById(@PathVariable Long id) {
        return ResponseEntity.ok(purchaseRequestsService.getPurchaseRequestById(id));
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<PurchaseRequests>> findAll() {
        return ResponseEntity.ok(purchaseRequestsService.getAllPurchaseRequests());
    }

//    @PostMapping(path = "/")
//    public ResponseEntity<PurchaseRequests> save(@RequestBody PurchaseRequests purchaseRequests) {
//        return ResponseEntity.ok(purchaseRequestsService.(purchaseRequests));
//    }
}
