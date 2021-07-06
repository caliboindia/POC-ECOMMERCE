package com.tomtom.paymentservice.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "payment_info")
public class PaymentInfo extends BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String id;

    @Column(name = "order_id")
    String orderId;

    @Column(name = "amount")
    double amount;

    @Column(name="provider")
    String provider;

    @Column(name="status")
    String status;
}
