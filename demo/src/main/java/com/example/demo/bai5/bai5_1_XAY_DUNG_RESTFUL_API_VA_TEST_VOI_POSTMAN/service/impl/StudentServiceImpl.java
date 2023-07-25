package com.example.demo.bai5.bai5_1_XAY_DUNG_RESTFUL_API_VA_TEST_VOI_POSTMAN.service.impl;

import com.example.demo.bai5.bai5_1_XAY_DUNG_RESTFUL_API_VA_TEST_VOI_POSTMAN.entity.Student;
import com.example.demo.bai5.bai5_1_XAY_DUNG_RESTFUL_API_VA_TEST_VOI_POSTMAN.repository.StudentRepository;
import com.example.demo.bai5.bai5_1_XAY_DUNG_RESTFUL_API_VA_TEST_VOI_POSTMAN.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findOne(String email) {
        return studentRepository.findById(email).orElse(null);
    }

    @Override
    public Student save(Student student) {
        Student newStudent = new Student().builder()
                .email(student.getEmail())
                .fullname(student.getFullname())
                .marks(student.getMarks())
                .gender(student.getGender())
                .country(student.getCountry())
                .build();
        return studentRepository.save(newStudent);
    }

    @Override
    public Student update(Student student) {
        Student updateStudent = studentRepository.findById(student.getEmail()).orElse(null).builder()
                .email(student.getEmail())
                .fullname(student.getFullname())
                .marks(student.getMarks())
                .gender(student.getGender())
                .country(student.getCountry())
                .build();
        return studentRepository.save(updateStudent);
    }

    @Override
    public void delete(String email) {
        Optional<Student> indexRemove = studentRepository.findById(email);
        if (indexRemove.isPresent()) {
            studentRepository.deleteById(email);
        } else {
        }
    }
}
