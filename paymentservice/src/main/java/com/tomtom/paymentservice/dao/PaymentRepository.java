package com.tomtom.paymentservice.dao;

import com.tomtom.paymentservice.model.PaymentInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<PaymentInfo, String> {
}
