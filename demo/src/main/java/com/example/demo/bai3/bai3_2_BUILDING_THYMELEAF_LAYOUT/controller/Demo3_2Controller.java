package com.example.demo.bai3.bai3_2_BUILDING_THYMELEAF_LAYOUT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo3_2/")
public class Demo3_2Controller {
    @GetMapping("index")
    public String index(Model model) {
        return "bai3/bai3_2/home/index";
    }

    @GetMapping("about")
    public String about(Model model) {
        return "bai3/bai3_2/home/about";
    }
}
