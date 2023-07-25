package com.example.demo.demo6_5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Auth65Controller {
    public String form() {
        return "auth/login";
    }

    public String success(Model model) {
        model.addAttribute("message", "Dang Nhap Thanh Cong");
        return "forward:/auth/login/form";
    }

    public String error(Model model) {
        model.addAttribute("message", "Sai Thong Tin Dang Nhap!");
        return "forward:/auth/login/form";
    }

    public String logout(Model model) {
        model.addAttribute("message", "Dang Xuat Thanh Cong");
        return "forward:/auth/login/form";
    }

    @RequestMapping("/auth/access/denied")
    public String denied(Model model){
        model.addAttribute("message", "Ban Khong Co Quyen Try Xuat Chuc Nang Nay");
        return "auth/login";
    }
}
