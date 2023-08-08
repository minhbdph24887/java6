package com.example.finaljava6.service;

import com.example.finaljava6.model.KhachHang;
import org.springframework.data.domain.Page;

import java.util.List;

public interface KhachHangService {
    List<KhachHang> getAllKH();

    KhachHang detail(Long maKhachHang);

    Page<KhachHang> getAllPage(int page);

    KhachHang create(KhachHang khachHang);

    KhachHang update(KhachHang khachHang);

    void delete(Long maKhachHang);
}
