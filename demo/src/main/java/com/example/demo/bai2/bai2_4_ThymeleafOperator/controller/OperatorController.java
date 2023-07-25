package com.example.demo.bai2.bai2_4_ThymeleafOperator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OperatorController {
    @RequestMapping("/demo/operator")
    public String demo(Model model){
        model.addAttribute("x", 5);
        model.addAttribute("y", 7);
        return "bai2/bai2_4/operator";
    }
}
