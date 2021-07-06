package com.tomtom.cartservice.service.impl;

import com.tomtom.cartservice.dao.CardDetailsRepository;
import com.tomtom.cartservice.dao.CardItemsDetailsRepository;
import com.tomtom.cartservice.model.CartDetails;
import com.tomtom.cartservice.model.CartItemsDetails;
import com.tomtom.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CardDetailsRepository cardDetailsRepository;

    @Autowired
    CardItemsDetailsRepository cardItemsDetailsRepository;

    @Override
    public void addProductTocart(CartItemsDetails cartItemsDetails) {
        if(cartItemsDetails.getCardId()!=null){
            cardItemsDetailsRepository.save(cartItemsDetails);
        }else {
            CartDetails cartDetails= new CartDetails();
            cartDetails.setTotalAmount(cartItemsDetails.getPrice());
            CartDetails cartDetails1= cardDetailsRepository.save(cartDetails);
            List<CartItemsDetails> cartItemsDetailsList = new ArrayList<>();
            cartItemsDetails.setCardId(cartDetails1.getCardId());
            cartItemsDetailsList.add(cartItemsDetails);
            cardItemsDetailsRepository.saveAll(cartItemsDetailsList);

        }
    }

    @Override
    public Optional<CartDetails> getCartDetails(String userId) {
        return cardDetailsRepository.findByUserId(userId);
    }

    @Override
    public void deleteProduct(String id) {
        cardItemsDetailsRepository.deleteById(id);
    }
}
