package com.tomtom.paymentservice.service;

import com.tomtom.paymentservice.model.OrderDetails;
import com.tomtom.paymentservice.model.PaymentInfo;

public interface PaymentService {
    PaymentInfo makePayment(OrderDetails orderDetails);
}
