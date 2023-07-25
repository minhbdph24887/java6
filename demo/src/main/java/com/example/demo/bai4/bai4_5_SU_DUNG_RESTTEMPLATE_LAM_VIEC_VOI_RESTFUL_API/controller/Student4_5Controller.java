package com.example.demo.bai4.bai4_5_SU_DUNG_RESTTEMPLATE_LAM_VIEC_VOI_RESTFUL_API.controller;

import com.example.demo.bai4.bai4_5_SU_DUNG_RESTTEMPLATE_LAM_VIEC_VOI_RESTFUL_API.bean.Student;
import com.example.demo.bai4.bai4_5_SU_DUNG_RESTTEMPLATE_LAM_VIEC_VOI_RESTFUL_API.bean.StudentMap;
import com.example.demo.bai4.bai4_5_SU_DUNG_RESTTEMPLATE_LAM_VIEC_VOI_RESTFUL_API.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Student4_5Controller {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/student4_5/index")
    public String index(Model model) {
        Student student = new Student("", "", 0.0, true, "VN");
        model.addAttribute("form", student);
        StudentMap studentMap = studentService.getAll();
        model.addAttribute("items", studentMap);
        return "bai4/bai4_5/student/index";
    }

    @RequestMapping("/student4_5/edit/{key}")
    public String edit(Model model,
                       @PathVariable("key") String key) {
        model.addAttribute("key", key);
        Student student = studentService.findByKey(key);
        model.addAttribute("form", student);
        StudentMap studentMap = studentService.getAll();
        model.addAttribute("items", studentMap);
        return "bai4/bai4_5/student/index";
    }

    @RequestMapping("/student4_5/create")
    public String create(Student student) {
        studentService.create(student);
        return "redirect:/student4_5/index";
    }

    @RequestMapping("/student4_5/update/{key}")
    public String update(@PathVariable("key") String key,
                         Student student) {
        studentService.update(key, student);
        return "redirect:/student4_5/edit/" + key;
    }

    @RequestMapping("/student4_5/delete/{key}")
    public String delete(@PathVariable("key") String key) {
        studentService.delete(key);
        return "redirect:/student4_5/index";
    }
}
