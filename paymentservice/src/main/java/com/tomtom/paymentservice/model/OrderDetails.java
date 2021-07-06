package com.tomtom.paymentservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "Order_details")
public class OrderDetails extends BaseEntity{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String id;

    @Column(name="total")
    public float total;

    @Column(name = "user_id")
    public String userId;

    @Column(name="ship_addr_id")
    public String shippingAddressId;

    @Column(name="billing_addr_id")
    public String  billingAddressId;

    @Column(name="payment_id")
    public String payment_id;

    @OneToMany
    public List<ItemDetails> itemDetails;

}
