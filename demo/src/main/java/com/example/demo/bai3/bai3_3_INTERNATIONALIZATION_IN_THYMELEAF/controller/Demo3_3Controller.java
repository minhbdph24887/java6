package com.example.demo.bai3.bai3_3_INTERNATIONALIZATION_IN_THYMELEAF.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo3_3/")
public class Demo3_3Controller {
    @GetMapping("index")
    public String index(Model model) {
        return "bai3/bai3_3/home/index";
    }

    @GetMapping("about")
    public String about(Model model) {
        return "bai3/bai3_3/home/about";
    }
}
