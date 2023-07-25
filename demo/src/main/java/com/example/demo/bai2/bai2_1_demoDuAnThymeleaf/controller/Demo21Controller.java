package com.example.demo.bai2.bai2_1_demoDuAnThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo21Controller {
    @RequestMapping("/hello.th")
    public String hello(Model model) {
        model.addAttribute("message", "FPT <b>Polytechnic </b>");
        return "bai2/bai2_1/hello";
    }
}
