package com.example.demo.bai2.bai2_3_scopeVaParameters.controller;

import com.example.demo.bai2.bai2_3_scopeVaParameters.bean.Student;
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
public class StudentController {
    @RequestMapping("/student")
    public String index(Model model,
                        @RequestParam("index") Optional<Integer> index) throws IOException {
        /*
         * Đọc danh sách sinh viên từ file
         */
        ObjectMapper mapper = new ObjectMapper();
        File path = ResourceUtils.getFile("C:\\Users\\Lenovo\\Desktop\\IT\\Lap_Trinh_Java_6\\bai-tap\\demo\\src\\main\\java\\com\\example\\demo\\bai2\\bai2_3_scopeVaParameters\\bean\\students.json");
        TypeReference<List<Student>> typeReference = new TypeReference<>() {
        };
        List<Student> students = mapper.readValue(path, typeReference);

        int i = index.orElse(0);
        model.addAttribute("n", i);
        model.addAttribute("sv", students.get(i));
        return "bai2/bai2_3/scope/student";
    }
}
