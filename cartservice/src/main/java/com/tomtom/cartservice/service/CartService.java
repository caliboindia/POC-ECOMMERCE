package com.tomtom.cartservice.service;

import com.tomtom.cartservice.model.CartDetails;
import com.tomtom.cartservice.model.CartItemsDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface CartService {
    void addProductTocart(CartItemsDetails cartItemsDetails);
    Optional<CartDetails> getCartDetails(String userId);
   void deleteProduct(String id);


}
