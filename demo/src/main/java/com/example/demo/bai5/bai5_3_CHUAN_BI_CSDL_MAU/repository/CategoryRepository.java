package com.example.demo.bai5.bai5_3_CHUAN_BI_CSDL_MAU.repository;

import com.example.demo.bai5.bai5_3_CHUAN_BI_CSDL_MAU.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
}
