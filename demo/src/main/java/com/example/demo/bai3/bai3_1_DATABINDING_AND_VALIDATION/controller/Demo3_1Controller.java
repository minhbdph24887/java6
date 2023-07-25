package com.example.demo.bai3.bai3_1_DATABINDING_AND_VALIDATION.controller;

import com.example.demo.bai3.bai3_1_DATABINDING_AND_VALIDATION.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student/")
public class Demo3_1Controller {
    @GetMapping("form")
    public String form(Model model) {
        Student student = new Student();
        model.addAttribute("sv", student);
        return "bai3/bai3_1/student/form";
    }

    @PostMapping("save")
    public String save(@ModelAttribute("sv") Student form) {
        return "bai3/bai3_1/student/success";
    }
}
