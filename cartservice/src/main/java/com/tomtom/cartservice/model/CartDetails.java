package com.tomtom.cartservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cart_details")
@Data
public class CartDetails extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String cardId;

    @Column(name="total_amount")
    public double totalAmount;

    @Column(name="user_id")
    public String userId;

    @OneToMany
    public List<CartItemsDetails> cartItemsDetailsList;


}
