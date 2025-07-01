package com.mertalptekin.springcontextsample.controller;

import com.mertalptekin.springcontextsample.Product;
import com.mertalptekin.springcontextsample.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private final IProductService productService;

    // contructor based DI
    public ProductController(IProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {

        return ResponseEntity.ok(this.productService.getProducts());
    }

}
