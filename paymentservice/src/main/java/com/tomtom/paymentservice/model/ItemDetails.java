package com.tomtom.paymentservice.model;


import lombok.Data;


import javax.persistence.*;


@Data
@Entity
@Table(name = "Item_details")
public class ItemDetails extends BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String id;

    @Column(name="order_id")
    public String orderId;

    @Column(name="product_id")
    public String productId;

    @Column(name="quantity")
    public int quantity;
}
