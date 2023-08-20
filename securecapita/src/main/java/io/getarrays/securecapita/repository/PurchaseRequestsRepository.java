package io.getarrays.securecapita.repository;

import io.getarrays.securecapita.domain.PurchaseRequests;

import java.util.List;
import java.util.Optional;

public interface PurchaseRequestsRepository <T extends PurchaseRequests>{
     List<T> list();
    T create(T data);

    T get(Long id);

//
//    void update(T t,Long id);
    boolean delete(Long id);


}
