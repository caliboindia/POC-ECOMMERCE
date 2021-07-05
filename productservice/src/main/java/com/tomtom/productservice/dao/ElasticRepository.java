package com.tomtom.productservice.dao;

import com.tomtom.productservice.model.BaseEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticRepository extends ElasticsearchRepository<BaseEntity, String> {
}
