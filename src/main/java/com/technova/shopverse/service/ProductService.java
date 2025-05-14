package com.technova.shopverse.service;

import com.technova.shopverse.model.Product;

import org.springframework.stereotype.Service;



import java.util.List;

import java.util.Optional;



@Service

public interface ProductService {



    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
