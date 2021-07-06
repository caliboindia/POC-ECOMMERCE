package com.tomtom.searchservice.service;

import com.tomtom.searchservice.model.Product;

import java.util.List;
import java.util.Optional;

public interface SearchService {
    public Optional<List<Product>> searchProdByfreetext(String str);
}
