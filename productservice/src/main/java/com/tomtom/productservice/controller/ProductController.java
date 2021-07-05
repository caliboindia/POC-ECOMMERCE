package com.tomtom.productservice.controller;

import com.tomtom.productservice.model.Product;
import com.tomtom.productservice.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @PostMapping(path= "/product")
    public ResponseEntity<Optional<Product>> save(@RequestBody Product product){
        Optional<Product> result = productService.save(product);
       return new ResponseEntity<Optional<Product>>(result,HttpStatus.OK);
    }

    @GetMapping(path = "/product/{id}")
    public ResponseEntity<Optional<Product>> getById(@PathVariable String id){
        return new ResponseEntity<Optional<Product>>(productService.getById(id),HttpStatus.OK);
    }
}
