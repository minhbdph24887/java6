package com.example.finaljava6.repository;

import com.example.finaljava6.model.HangKhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangKhachHangRepository extends JpaRepository<HangKhachHang, Long> {
}
