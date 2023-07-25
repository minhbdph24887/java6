package com.example.demo.bai5.bai5_4_SU_DUNG_RESPONSEENTITY.service;

import com.example.demo.bai5.bai5_3_CHUAN_BI_CSDL_MAU.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();

    Category getOne(String id);

    Category add(Category category);

    Category update(Category category);

    void delete(String id);
}
