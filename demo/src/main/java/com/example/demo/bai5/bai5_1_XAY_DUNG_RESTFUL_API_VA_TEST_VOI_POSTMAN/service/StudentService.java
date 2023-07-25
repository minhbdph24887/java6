package com.example.demo.bai5.bai5_1_XAY_DUNG_RESTFUL_API_VA_TEST_VOI_POSTMAN.service;

import com.example.demo.bai5.bai5_1_XAY_DUNG_RESTFUL_API_VA_TEST_VOI_POSTMAN.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student findOne(String email);
    Student save(Student student);
    Student update(Student student);
    void delete(String email);
}
