package com.example.demo.bai5.bai5_4_SU_DUNG_RESPONSEENTITY.service.impl;

import com.example.demo.bai5.bai5_3_CHUAN_BI_CSDL_MAU.entity.Category;
import com.example.demo.bai5.bai5_3_CHUAN_BI_CSDL_MAU.repository.CategoryRepository;
import com.example.demo.bai5.bai5_4_SU_DUNG_RESPONSEENTITY.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getOne(String id) {
        if (!categoryRepository.existsById(id)) {
            return null;
        } else {
            return categoryRepository.findById(id).get();
        }
    }

    @Override
    public Category add(Category category) {
        Category newCategory1 = new Category().builder()
                .id(category.getId())
                .name(category.getName())
                .build();
        return categoryRepository.save(newCategory1);
    }

    @Override
    public Category update(Category category) {
            Category updateCategory1 = categoryRepository.findById(category.getId()).orElse(null).builder()
                    .id(category.getId())
                    .name(category.getName())
                    .build();
            return categoryRepository.save(updateCategory1);
    }

    @Override
    public void delete(String id) {
        Optional<Category> indexRemove = categoryRepository.findById(id);
        if (indexRemove.isPresent()) {
            categoryRepository.deleteById(id);
        } else {
        }
    }

}
