package com.ecommerce.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/api/products/{id}")
    public String getProductById(@PathVariable Long id) {
        // Here, just return "Hello World" for any product ID.
        return "Hello World";
    }
}