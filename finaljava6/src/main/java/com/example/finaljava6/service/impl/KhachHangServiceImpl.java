package com.example.finaljava6.service.impl;

import com.example.finaljava6.model.KhachHang;
import com.example.finaljava6.repository.KhachHangRepository;
import com.example.finaljava6.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    KhachHangRepository repository;

    @Override
    public List<KhachHang> getAllKH() {
        return repository.findAll();
    }

    @Override
    public KhachHang detail(Long maKhachHang) {
        return repository.findById(maKhachHang).orElse(null);
    }

    @Override
    public Page<KhachHang> getAllPage(int page) {
        Pageable pageable = PageRequest.of(page, 3);
        Page<KhachHang> khachHangPage = repository.findAll(pageable);
        return khachHangPage;
    }

    @Override
    public KhachHang create(KhachHang khachHang) {
        KhachHang khachHang1 = new KhachHang().builder()
                .tenKhachHang(khachHang.getTenKhachHang())
                .sdt(khachHang.getSdt())
                .gioiTinh(khachHang.getGioiTinh())
                .hangKhachHang(khachHang.getHangKhachHang())
                .build();
        return repository.save(khachHang1);
    }

    @Override
    public KhachHang update(KhachHang khachHang) {
        KhachHang upKhachHang1 = repository.findById(khachHang.getMaKhachHang()).orElse(null).builder()
                .maKhachHang(khachHang.getMaKhachHang())
                .tenKhachHang(khachHang.getTenKhachHang())
                .sdt(khachHang.getSdt())
                .gioiTinh(khachHang.getGioiTinh())
                .hangKhachHang(khachHang.getHangKhachHang())
                .build();
        return repository.save(upKhachHang1);
    }

    @Override
    public void delete(Long maKhachHang) {
        Optional<KhachHang> indexDelete = repository.findById(maKhachHang);
        if (indexDelete.isPresent()) {
            repository.deleteById(maKhachHang);
        } else {
        }
    }
}
