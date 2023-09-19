package io.getarrays.securecapita.repository;

import io.getarrays.securecapita.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;



    public interface ProductRepository extends JpaRepository<Product, Long> {


        Product findByProductCode(String productCode);
    }


