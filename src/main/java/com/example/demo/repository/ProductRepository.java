package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<Product> findAll() {
        return products;
    }

    public Optional<Product> findById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public Product save(Product product) {
        if (product.getId() == null) {
            product.setId(nextId++);
            products.add(product);
        } else {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId().equals(product.getId())) {
                    products.set(i, product);
                    break;
                }
            }
        }
        return product;
    }

    public boolean deleteById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    public boolean existsById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public List<Product> findByNameContaining(String keyword) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }

    public List<Product> findByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().toLowerCase().equals(category.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }
}
