package io.getarrays.securecapita.service;

import io.getarrays.securecapita.domain.Product;
import io.getarrays.securecapita.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class ProductService {


    @Autowired

    ProductRepository productRepository;
    /* to create user */
    public Product createProduct(Product product) {

        Product createdProduct = (Product) productRepository.save(product);

        return createdProduct;
    }
    public Product findProductByCode(@RequestBody String productCode){
        return productRepository.findByProductCode(productCode);
    }


    public int getTotalQuantityByProductCode(String productCode) {
        Product product = productRepository.findByProductCode(productCode);
        if (product == null) {
            throw new EntityNotFoundException("Product not found with product code: " + productCode);
        }
        return product.getQuantity();
    }





//
//
//
//    public boolean isProductInStock(Long productId) {
//        Optional<Product> optionalProduct = productRepository.findById(productId);
//        if (optionalProduct.isPresent()) {
//            Product product = optionalProduct.get();
//            if (product.getQuantity() > 0) {
//                return true;
//            }
//        }
//        return false;
//    }



//
//    public Product getProductBasedOnId(  Long productId) {
//        return productRepository.findById(productId).get();
//    }
//
//
////    public Product updateProduct(Long productId, Product updatedProduct) {
////        Product existingProduct = productRepository.findById(updatedProduct.getId())
////                .orElseThrow(() -> new RuntimeException("Product not found"));
////
////    }
//
//
//    public Product updateProduct(Product productObject)
//    {
//        return productRepository.save(productObject);
//    }
//
//
//
//
//    public void deleteProduct(Long productId) {
//        productRepository.deleteById(productId);
//    }
//
//    public List<Product> getAllProducts() {
//        return productRepository.findAll();
//    }
}
