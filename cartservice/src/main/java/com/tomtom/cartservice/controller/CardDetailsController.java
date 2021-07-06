package com.tomtom.cartservice.controller;

import com.tomtom.cartservice.model.CartDetails;
import com.tomtom.cartservice.model.CartItemsDetails;
import com.tomtom.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/v1")
public class CardDetailsController {

    @Autowired
    CartService cartService;

    @PostMapping(path = "/cart/product")
    public ResponseEntity addProductTocart(CartItemsDetails itemDetails){
      cartService.addProductTocart(itemDetails);
      return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @DeleteMapping(path = "/cart/product/{id}")
    public ResponseEntity deleteProductFromCart(@PathVariable String id){
        cartService.deleteProduct(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(path = "/cart/{userId}")
    public ResponseEntity<Optional<CartDetails>> getCardDetails(@PathVariable String userId){
        return new ResponseEntity<Optional<CartDetails>>(cartService.getCartDetails(userId), HttpStatus.OK);
    }

}
