package com.example.demo.demo6_4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

    @RequestMapping("/auth/login/form")
    public String form() {
        return "auth/login";
    }

    @RequestMapping("/auth/login/success")
    public String success(Model model) {
        model.addAttribute("message", "Dang Nhap Thanh Cong");
        return "forward:/auth/login/form";
    }

    @RequestMapping("/auth/login/error")
    public String error(Model model) {
        model.addAttribute("message", "Sai Thong Tin Dang Nhap!");
        return "forward:/auth/login/form";
    }

    @RequestMapping("/auth/logout/success")
    public String logout(Model model) {
        model.addAttribute("message", "Dang Xuat Thanh Cong");
        return "forward:/auth/login/form";
    }
}
