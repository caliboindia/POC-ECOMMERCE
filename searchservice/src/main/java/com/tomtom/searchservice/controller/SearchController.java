package com.tomtom.searchservice.controller;

import com.tomtom.searchservice.model.Product;
import com.tomtom.searchservice.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/v1")
public class SearchController {

    @Autowired
    SearchService searchService;

    @GetMapping(path = "/search")
    public ResponseEntity<Optional<List<Product>>> search(@RequestParam String str){
        return new ResponseEntity<Optional<List<Product>>>(searchService.searchProdByfreetext(str), HttpStatus.OK);
    }
}
