package com.tomtom.paymentservice.service.impl;

import com.tomtom.paymentservice.dao.OrderRepository;
import com.tomtom.paymentservice.dao.PaymentRepository;
import com.tomtom.paymentservice.model.OrderDetails;
import com.tomtom.paymentservice.model.PaymentInfo;
import com.tomtom.paymentservice.service.OrderService;
import com.tomtom.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    PaymentService paymentService;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public boolean checkout(OrderDetails orderDetails) {
        PaymentInfo paymentInfo = paymentService.makePayment(orderDetails);
        OrderDetails orderDetails1 = orderRepository.save(orderDetails);
        PaymentInfo paymentInfo1 = null;
        if(orderDetails1.getId() !=null){
            paymentInfo.setOrderId(orderDetails1.getId());
            paymentInfo1 = paymentRepository.save(paymentInfo);
        }
        return paymentInfo.getId() !=null;
    }
}
