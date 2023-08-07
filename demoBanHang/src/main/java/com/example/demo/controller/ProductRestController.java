package com.example.demo.controller;

import com.example.demo.bean.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/products/")
public class ProductRestController {
    @Autowired
    ProductService productService;

    @GetMapping("{idProduct}")
    public Product getOneCart(@PathVariable("idProduct") Long idProduct){
        return productService.getOne(idProduct);
    }
}
