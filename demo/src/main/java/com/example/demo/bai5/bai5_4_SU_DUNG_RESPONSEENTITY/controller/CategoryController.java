package com.example.demo.bai5.bai5_4_SU_DUNG_RESPONSEENTITY.controller;

import com.example.demo.bai5.bai5_3_CHUAN_BI_CSDL_MAU.entity.Category;
import com.example.demo.bai5.bai5_4_SU_DUNG_RESPONSEENTITY.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/category/")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("hien-thi")
    public ResponseEntity<List<Category>> getAllCategory(Model model) { //  ResponseEntity là đại diện cho một phản hồi HTTP, bao gồm tiêu đề, nội dung và trạng thái.
        List<Category> categoryList = categoryService.getAllCategory();
        System.out.println(categoryList);
        return ResponseEntity.ok(categoryList);
    }

    @GetMapping("detail/{id}")
    public ResponseEntity<Category> getOne(@PathVariable("id") String id){
        Category detailCategory = categoryService.getOne(id);
        return ResponseEntity.ok(detailCategory);
    }

    @PostMapping("add")
    public ResponseEntity<Category> post(@RequestBody Category category){
        Category addCategory1 = categoryService.add(category);
        return ResponseEntity.ok(addCategory1);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Category> put(@PathVariable("id") String id,
                                        @RequestBody Category updateCategory1){
        Category indexCategory1 = categoryService.getOne(id);
        updateCategory1 = categoryService.update(indexCategory1);
        return ResponseEntity.ok(updateCategory1);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id){
        categoryService.delete(id);
        return ResponseEntity.ok().build();
    }
}
