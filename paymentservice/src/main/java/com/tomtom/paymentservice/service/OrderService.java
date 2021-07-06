package com.tomtom.paymentservice.service;

import com.tomtom.paymentservice.model.OrderDetails;

public interface OrderService {
    boolean checkout(OrderDetails orderDetails);
}
