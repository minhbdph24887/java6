package com.example.du_an_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author thangdt
 */
@Controller
@RequestMapping
public class helloController {

    @GetMapping()
    public String hello(){
        return "Hi";
    }
}
