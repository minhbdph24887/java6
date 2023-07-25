package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    // demo6.2
    @RequestMapping("/home/index")
    public String index(Model model) {
        model.addAttribute("message", "This is home page");
        return "home/index";
    }

    @RequestMapping("/home/about")
    public String about(Model model) {
        model.addAttribute("message", "This is introduction page");
        return "home/index";
    }

    // demo6.4

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

    // demo6.5

    @RequestMapping("/auth/access/denied")
    public String denied(Model model){
        model.addAttribute("message", "Ban Khong Co Quyen Try Xuat Chuc Nang Nay");
        return "auth/login";
    }

    @RequestMapping("/home/admin")
    public String admins(Model model){
        model.addAttribute("message", "Hello Administrator");
        return "home/index";
    }

    @RequestMapping("/home/user")
    public String users(Model model){
        model.addAttribute("message", "Hello User");
        return "home/index";
    }

    @RequestMapping("/home/authentication")
    public String authenticationed(Model model){
        model.addAttribute("message", "Hello Authentication User");
        return "home/index";
    }

    // demo 6.8

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
