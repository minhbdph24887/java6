package com.example.demo.bai2.bai2_3_scopeVaParameters.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScopeController {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private ServletContext servletContext;

    @RequestMapping("/scope")
    public String indexHome(Model model) {
        model.addAttribute("a", "Toi La Mot Model");
        request.setAttribute("b", "Toi La Request Scope");
        httpSession.setAttribute("c", "Toi La Session Scope");
        servletContext.setAttribute("d", "Toi La Application Scope");
        return "bai2/bai2_3/scope/index";
    }
}
