package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    // TODO: Declare a private final ProductRepository field


    // TODO: Constructor that takes ProductRepository as parameter (constructor injection)


    public List<Product> getAllProducts() {
        // TODO: Delegate to repository
        return null;
    }

    public Optional<Product> getProductById(Long id) {
        // TODO: Delegate to repository
        return Optional.empty();
    }

    public Product createProduct(Product product) {
        // TODO: Delegate to repository
        return null;
    }

    public Optional<Product> updateProduct(Long id, Product updated) {
        // TODO: Find existing product by ID
        // TODO: If found, update its name, category, price, and quantity
        // TODO: Save and return the updated product
        // TODO: If not found, return Optional.empty()
        return Optional.empty();
    }

    public boolean deleteProduct(Long id) {
        // TODO: Delegate to repository
        return false;
    }
}
