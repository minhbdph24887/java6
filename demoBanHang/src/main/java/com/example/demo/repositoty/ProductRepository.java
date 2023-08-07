package com.example.demo.repositoty;

import com.example.demo.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select p from Product p where p.category.idCategory=?1")
    List<Product> getAllByCategoryId(String cid);
}
