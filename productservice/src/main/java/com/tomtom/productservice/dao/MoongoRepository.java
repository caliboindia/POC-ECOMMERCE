package com.tomtom.productservice.dao;

import com.tomtom.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoongoRepository extends MongoRepository<Product,String> {


}
