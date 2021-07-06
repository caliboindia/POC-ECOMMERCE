package com.tomtom.paymentservice.dao;

import com.tomtom.paymentservice.model.OrderDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<OrderDetails, String> {

}
