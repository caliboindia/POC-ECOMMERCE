package com.tomtom.productservice.service.impl;

import com.tomtom.productservice.dao.ElasticRepository;
import com.tomtom.productservice.dao.MoongoRepository;
import com.tomtom.productservice.model.Product;
import com.tomtom.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    MoongoRepository moongoRepository;

    @Autowired
    ElasticRepository elasticRepository;

    @Override
    public Optional<Product> save(Product product){
       Product productInserted= moongoRepository.save(product);
       if(productInserted.getId()!= null){
           Product productES = elasticRepository.save(productInserted);
       }
       return Optional.of(productInserted);
    }

    @Override
    public Optional<Product> getById(String id){
        return moongoRepository.findById(id);
    }
}
