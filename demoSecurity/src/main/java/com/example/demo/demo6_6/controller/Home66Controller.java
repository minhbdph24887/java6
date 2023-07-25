package com.example.demo.demo6_6.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home66Controller {
    public String index(Model model) {
        model.addAttribute("message", "This is home page");
        return "home/index";
    }

    public String about(Model model) {
        model.addAttribute("message", "This is introduction page");
        return "home/index";
    }

//    @PreAuthorize("hasRole('ADMIN')")
//    @RequestMapping("/home/admin")
    public String admins(Model model){
        model.addAttribute("message", "Hello Administrator");
        return "home/index";
    }

//    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
//    @RequestMapping("/home/user")
    public String users(Model model){
        model.addAttribute("message", "Hello User");
        return "home/index";
    }

//    @PreAuthorize("authenticated()")
//    @RequestMapping("/home/authentication")
    public String authenticationed(Model model){
        model.addAttribute("message", "Hello Authentication User");
        return "home/index";
    }
}
