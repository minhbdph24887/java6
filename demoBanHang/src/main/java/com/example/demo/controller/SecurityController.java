package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
    @RequestMapping("/security/login/form")
    public String loginFrom(Model model) {
        model.addAttribute("message", "Vui Lòng Đăng Nhập");
        return "security/login";
    }

    @RequestMapping("/security/login/success")
    public String loginSuccess(Model model) {
        model.addAttribute("message", "Đăng Nhập Thành Công");
        return "security/login";
    }

    @RequestMapping("/security/login/error")
    public String loginError(Model model){
        model.addAttribute("message", "Sai Thông Tin Đăng Nhập");
        return "security/login";
    }

    @RequestMapping("/security/unauthoried")
    public String unauthoried(Model model){
        model.addAttribute("message", "Bạn Không Có Quyền Truy Xuất");
        return "security/login";
    }

    @RequestMapping("/security/logoff/success")
    public String logoffSuccess(Model model){
        model.addAttribute("message", "Bạn Đã Đăng Xuất Thành Công");
        return "security/login";
    }
}
