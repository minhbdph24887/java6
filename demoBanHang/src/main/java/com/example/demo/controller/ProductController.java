package com.example.demo.controller;

import com.example.demo.bean.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/product/list")
    public String listProduct(Model model, @RequestParam("cid") Optional<String> cid) {
        if(cid.isPresent()){
            List<Product> listProductByCategory = productService.getAllByCategoryId(cid.get());
            model.addAttribute("listProduct", listProductByCategory);
        }else{
            List<Product> listProduct = productService.getAll();
            model.addAttribute("listProduct", listProduct);
        }
        return "product/list";
    }

    @RequestMapping("/product/detail/{idProduct}")
    public String detailProduct(Model model, @PathVariable("idProduct") Long idProduct) {
        Product detailProduct = productService.getOne(idProduct);
        model.addAttribute("detailProduct", detailProduct);
        List<Product> listProduct = productService.getAll();
        model.addAttribute("listProduct", listProduct);
        return "product/detail";
    }
}
