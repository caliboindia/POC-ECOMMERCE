package com.tomtom.productservice.service;

import com.tomtom.productservice.model.Product;

import java.util.Optional;

public interface ProductService {
    public Optional<Product> getById(String id);
    public Optional<Product> save(Product product);

}
