package com.example.demo.bai5.bai5_1_XAY_DUNG_RESTFUL_API_VA_TEST_VOI_POSTMAN.repository;

import com.example.demo.bai5.bai5_1_XAY_DUNG_RESTFUL_API_VA_TEST_VOI_POSTMAN.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
