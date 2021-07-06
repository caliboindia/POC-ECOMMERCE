package com.tomtom.searchservice.service.impl;

import com.tomtom.searchservice.dao.SearchRepository;
import com.tomtom.searchservice.model.Product;
import com.tomtom.searchservice.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    SearchRepository searchRepository;

    @Override
    public Optional<List<Product>> searchProdByfreetext(String str) {
        return searchRepository.findProductByfreeText(str);
    }
}
