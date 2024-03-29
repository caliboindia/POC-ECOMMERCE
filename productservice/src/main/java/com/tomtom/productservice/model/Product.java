package com.tomtom.productservice.model;

import lombok.Data;

import java.util.List;

@Data
public class Product extends BaseEntity {

    public String sellerName;
    public Integer sellerId;
    public List<String> color;
    public List<Integer> size;
    public List<Integer> discountPercentage;
    public String productDetails;
    public String imageUrl;


}
