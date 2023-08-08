package com.example.demo.service;

import com.example.demo.model.KhachHang;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;

import java.util.List;

public interface KhachHangService {

    List<KhachHang> getAll();
    Page<KhachHang> getAllPage(int page);

    KhachHang getOne(Long maKhachHang);

    KhachHang createKH(@Valid final KhachHang newKhachHang);

    KhachHang updateKH(Long maKhachHang, @Valid final KhachHang updateKhachHang);

    boolean delete(Long maKhachHang);
}
