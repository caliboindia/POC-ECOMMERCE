package com.tomtom.cartservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "cart_item_details")
public class CartItemsDetails extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String id;

    @Column(name = "card_id")
    public String cardId;

    @Column(name = "quantity")
    public int quantity;

    @Column(name = "product_id")
    public String productId;

    @Column(name="price")
    public double price;


}
