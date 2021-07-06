package com.tomtom.searchservice.dao;

import com.tomtom.searchservice.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SearchRepository extends ElasticsearchRepository<Product, String> {
    @Query("{\"query\":{\"multi_match\":{\"query\":\"?0\",\"fields\":[\"name\",\"category\",\"subCategory\",\"desc\"],\"fuzziness\":\"AUTO\"}}}")
    Optional<List<Product>> findProductByfreeText(String text);
}
