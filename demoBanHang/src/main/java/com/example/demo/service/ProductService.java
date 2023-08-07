package com.example.demo.service;

import com.example.demo.bean.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    List<Product> getAllByCategoryId(String cid);

    Product getOne(Long idProduct);
}
