package com.example.demo.service;

import com.example.demo.model.NhanVien;

import java.util.List;

public interface NhanVienService {
    List<NhanVien> getAllNV();

    NhanVien getOneNv(Long idNhanVien);

    NhanVien createNV(NhanVien nhanVien);

    NhanVien updateNv(NhanVien nhanVien);

    NhanVien deleteNv(Long idNhanVien);
}
