package com.example.demo.bai2.bai2_2_demoBieuThucThymeleaf.controller;

import com.example.demo.bai2.bai2_2_demoBieuThucThymeleaf.bean.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;

@Controller
public class Demo22Controller {
    @RequestMapping("/home/index")
    public String index(Model model) throws IOException {
        model.addAttribute("message", "Welcome to Thymeleaf");

        ObjectMapper mapper = new ObjectMapper();
        String path = "C:\\Users\\Lenovo\\Desktop\\IT\\Lap_Trinh_Java_6\\bai-tap\\demo\\src\\main\\resources\\templates\\bai2\\bai2_2\\student.json";
        Student student = mapper.readValue(new File(path), Student.class);
        model.addAttribute("sv", student);

        return "bai2/bai2_2/home/index";
    }
}
