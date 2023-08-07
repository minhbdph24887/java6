package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
    @RequestMapping("/order/checkout")
    public String viewOrderCheckOut(){
        return "order/checkout";
    }

    @RequestMapping("/order/list")
    public String listOrder(){
        return "order/list";
    }

    @RequestMapping("/order/detail/{idOrder}")
    public String detailOrder(){
        return "order/detail";
    }
}
