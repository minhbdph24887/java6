package com.example.demo.bai3.bai3_1_DATABINDING_AND_VALIDATION.controller;

import com.example.demo.bai3.bai3_1_DATABINDING_AND_VALIDATION.bean.StudentValidate;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student/validate/")
public class Demo3_1ValidateController {
    @GetMapping("form")
    public String form(Model model){
        StudentValidate studentValidate = new StudentValidate();
        model.addAttribute("sv", studentValidate);
        return "bai3/bai3_1/student/formvalidatetion";
    }

    @PostMapping("check")
    public String check(Model model,
                        @Valid @ModelAttribute("sv") StudentValidate studentValidate,
                        Errors errors){
        if(errors.hasErrors()){
            model.addAttribute("message", "Vui Long Sua Cac Loi Sau");
            return "bai3/bai3_1/student/formvalidatetion";
        }else{
            return "bai3/bai3_1/student/success";
        }
    }
}
