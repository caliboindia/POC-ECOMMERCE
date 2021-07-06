package com.tomtom.cartservice.dao;

import com.tomtom.cartservice.model.CartDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardDetailsRepository extends CrudRepository<CartDetails,String> {
    Optional<CartDetails> findByUserId(String id);
}
