package com.example.demo.bai2.bai2_5_FlowControllerAttributes.controller;

import com.example.demo.bai2.bai2_5_FlowControllerAttributes.bean.Student;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
public class Student25Controller {
    @RequestMapping("/student/list")
    public String list(Model model,
                       @RequestParam("index") Optional<Integer> index) throws IOException {
        File file = ResourceUtils.getFile("C:\\Users\\Lenovo\\Desktop\\IT\\Lap_Trinh_Java_6\\bai-tap\\demo\\src\\main\\java\\com\\example\\demo\\bai2\\bai2_5_FlowControllerAttributes\\bean\\students.json");
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Student>> typeReference = new TypeReference<>() {
        };
        List<Student> studentList = mapper.readValue(file, typeReference);

        model.addAttribute("sv", studentList.get(index.orElse(0)));
        model.addAttribute("dssv", studentList);
        return "bai2/bai2_5/student/list";
    }
}
