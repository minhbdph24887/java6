package com.example.demo.service.impl;

import com.example.demo.bean.Product;
import com.example.demo.repositoty.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getAllByCategoryId(String cid) {
        return productRepository.getAllByCategoryId(cid);
    }

    @Override
    public Product getOne(Long idProduct) {
        return productRepository.findById(idProduct).orElse(null);
    }
}
