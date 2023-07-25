package com.example.demo.demo6_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/")
public class HomeController {
    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("message", "This is home page");
        return "home/index";
    }

    @GetMapping("about")
    public String about(Model model) {
        model.addAttribute("message", "This is introduction page");
        return "home/index";
    }
}
