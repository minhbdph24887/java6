package com.example.demo.bai6.bai6_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home61/")
public class Home61Controller {
    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("message", "This is home page");
        return "bai6/bai6_1/index";
    }

    @GetMapping("about")
    public String about(Model model) {
        model.addAttribute("message", "This is introduction page");
        return "bai6/bai6_1/index";
    }
}
