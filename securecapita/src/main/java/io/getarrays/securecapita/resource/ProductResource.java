package io.getarrays.securecapita.resource;

import io.getarrays.securecapita.domain.Product;
import io.getarrays.securecapita.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductResource {

    // Assume ProductService class handles product inventory
    @Autowired
    private ProductService productService;



    @PostMapping("/add")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){

        Product createProduct =  productService.createProduct(product);
        return new ResponseEntity<>(createProduct, HttpStatus.OK);
    }

    @GetMapping("/totalQuantity")
    public int getTotalQuantityByProductCode(@RequestParam String productCode) {
        return productService.getTotalQuantityByProductCode(productCode);
    }
}
