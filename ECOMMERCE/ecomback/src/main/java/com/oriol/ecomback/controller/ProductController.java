package com.oriol.ecomback.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public String getProducts() {
        return "All products";
    }
    

}
