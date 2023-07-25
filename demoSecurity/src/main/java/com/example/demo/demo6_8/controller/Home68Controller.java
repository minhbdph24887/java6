package com.example.demo.demo6_8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home68Controller {
    @RequestMapping("/home/thymeleaf1")
    public String thymeleaf1(Model model){
        model.addAttribute("message", "Thymeleaf - Without Extras");
        return "home/thymeleaf1";
    }

    @RequestMapping("home/thymeleaf2")
    public String thymeleaf2(Model model){
        model.addAttribute("message", "Thymeleaf - With Extras");
        return "home/thymeleaf2";
    }
}
