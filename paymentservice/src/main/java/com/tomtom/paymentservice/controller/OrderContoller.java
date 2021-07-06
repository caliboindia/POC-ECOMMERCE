package com.tomtom.paymentservice.controller;

import com.tomtom.paymentservice.model.OrderDetails;
import com.tomtom.paymentservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/v1")
public class OrderContoller {
    @Autowired
    OrderService orderService;

    @PostMapping(path = "/checkout")
    public ResponseEntity<Boolean> checkout(@RequestBody OrderDetails orderDetails){
        return new ResponseEntity<Boolean>(orderService.checkout(orderDetails), HttpStatus.OK);
    }
}
