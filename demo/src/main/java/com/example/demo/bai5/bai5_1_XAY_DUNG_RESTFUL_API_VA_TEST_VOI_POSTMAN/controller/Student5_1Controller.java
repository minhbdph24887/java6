package com.example.demo.bai5.bai5_1_XAY_DUNG_RESTFUL_API_VA_TEST_VOI_POSTMAN.controller;

import com.example.demo.bai5.bai5_1_XAY_DUNG_RESTFUL_API_VA_TEST_VOI_POSTMAN.entity.Student;
import com.example.demo.bai5.bai5_1_XAY_DUNG_RESTFUL_API_VA_TEST_VOI_POSTMAN.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/student5_1/")
public class Student5_1Controller {
    @Autowired
    private StudentService studentService;

    @GetMapping("hien-thi")
    public List<Student> viewStudent(Model model) {
        List<Student> studentList = studentService.getAllStudents();
        return studentList;
    }

    @GetMapping("detail/{email}")
    public Student detail(Model model,
                         @PathVariable("email") String email) {
        Student studentDetail = studentService.findOne(email);
        return studentDetail;
    }

    @PostMapping("add")
    public Student post(@RequestBody Student student){
        Student addStudent1 = studentService.save(student);
        return addStudent1;
    }

    @PutMapping("update/{email}")
    public Student edit(@PathVariable("email") String email,
                        @RequestBody Student student){
        Student updateStudent1 = studentService.update(student);
        return updateStudent1;
    }

    @DeleteMapping("delete/{email}")
    public void delete(@PathVariable("email") String email){
        studentService.delete(email);
    }
}
