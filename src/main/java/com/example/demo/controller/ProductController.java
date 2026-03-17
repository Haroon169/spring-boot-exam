package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    // TODO: Declare a private final ProductService field


    // TODO: Constructor that takes ProductService as parameter


    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        // TODO: Implement
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        // TODO: Implement
        return null;
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        // TODO: Implement
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        // TODO: Implement
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        // TODO: Implement
        return null;
    }
}
