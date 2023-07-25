package com.example.demo.demo6_7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Home67Controller {
    @Autowired
    private HttpServletRequest request;
    public String index(Model model) {
        model.addAttribute("message", "This is home page");
        return "home/index";
    }

    public String about(Model model) {
        model.addAttribute("message", "This is introduction page");
        return "home/index";
    }

    @RequestMapping("/home/admin")
    public String admins(Model model){
        if(!request.isUserInRole("ADMIN")){
            return "redirect:/auth/access/denied";
        }
        model.addAttribute("message", "Hello Administrator");
        return "home/index";
    }

    @RequestMapping("/home/user")
    public String users(Model model){
        if(!(request.isUserInRole("ADMIN") || request.isUserInRole("USER"))){
            return "redirect:/auth/access/denied";
        }
        model.addAttribute("message", "Hello User");
        return "home/index";
    }

    @RequestMapping("/home/authentication")
    public String authenticationed(Model model){
        if(request.getRemoteUser() == null){
            return "redirect:/auth/login/form";
        }
        model.addAttribute("message", "Hello Authentication User");
        return "home/index";
    }
}
