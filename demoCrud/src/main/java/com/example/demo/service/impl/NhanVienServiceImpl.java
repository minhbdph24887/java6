package com.example.demo.service.impl;

import com.example.demo.model.NhanVien;
import com.example.demo.repository.NhanVienRepository;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class NhanVienServiceImpl implements NhanVienService {
    Random random = new Random();

    @Autowired
    NhanVienRepository nhanVienRepository;

    @Override
    public List<NhanVien> getAllNV() {
        return nhanVienRepository.findAll();
    }

    @Override
    public NhanVien getOneNv(Long idNhanVien) {
        return nhanVienRepository.findById(idNhanVien).orElse(null);
    }

    @Override
    public NhanVien createNV(NhanVien nhanVien) {
        NhanVien newNhanVien1 = NhanVien.builder()
                .maNhanVien("NV" + random.nextInt())
                .tenNhanVien(nhanVien.getTenNhanVien())
                .gioiTinh(nhanVien.getGioiTinh())
                .ngaySinh(nhanVien.getNgaySinh())
                .chucVu(nhanVien.getChucVu())
                .diaChi(nhanVien.getDiaChi())
                .build();
        return nhanVienRepository.save(newNhanVien1);
    }

    @Override
    public NhanVien updateNv(NhanVien nhanVien) {
        NhanVien index = nhanVienRepository.findById(nhanVien.getIdNhanVien()).orElse(null);
        NhanVien updateNhanVien1 = index.builder()
                .idNhanVien(nhanVien.getIdNhanVien())
                .maNhanVien(nhanVien.getMaNhanVien())
                .tenNhanVien(nhanVien.getTenNhanVien())
                .gioiTinh(nhanVien.getGioiTinh())
                .ngaySinh(nhanVien.getNgaySinh())
                .chucVu(nhanVien.getChucVu())
                .diaChi(nhanVien.getDiaChi())
                .build();
        return nhanVienRepository.save(updateNhanVien1);
    }

    @Override
    public NhanVien deleteNv(Long idNhanVien) {
        Optional<NhanVien> deleteNV = nhanVienRepository.findById(idNhanVien);
        if (deleteNV.isPresent()) {
            nhanVienRepository.deleteById(idNhanVien);
        } else {

        }
        return null;
    }
}
