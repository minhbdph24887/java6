package com.example.demo.bai2.bai2_6_THYMELEAF_UTILITY_OBJECTS.controller;

import com.example.demo.bai2.bai2_6_THYMELEAF_UTILITY_OBJECTS.bean.Student;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
public class UtillytyController {
    @RequestMapping("/demo/utilities")
    public String utilities(Model model) throws IOException {
        File file = ResourceUtils.getFile("C:\\Users\\Lenovo\\Desktop\\IT\\Lap_Trinh_Java_6\\bai-tap\\demo\\src\\main\\java\\com\\example\\demo\\bai2\\bai2_6_THYMELEAF_UTILITY_OBJECTS\\bean\\students.json");
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Student>> typeReference = new TypeReference<List<Student>>() {
        };
        List<Student> studentList = mapper.readValue(file, typeReference);
        model.addAttribute("dssv", studentList);
        model.addAttribute("now", new Date());
        return "bai2/bai2_6/utilities";
    }
}
