package com.tomtom.paymentservice.service.impl;

import com.tomtom.paymentservice.model.OrderDetails;
import com.tomtom.paymentservice.model.PaymentInfo;
import com.tomtom.paymentservice.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {


    @Override
    public PaymentInfo makePayment(OrderDetails orderDetails) {
        // Here we need to make third party call I am mocking for now
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(orderDetails.getTotal());
        paymentInfo.setProvider("ICICI");
        paymentInfo.setStatus("success");
        paymentInfo.setId(UUID.randomUUID().toString());
        // setter for remaaining props.
        return paymentInfo;

    }
}
