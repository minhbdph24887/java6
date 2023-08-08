package com.example.finaljava6.service.impl;

import com.example.finaljava6.model.HangKhachHang;
import com.example.finaljava6.repository.HangKhachHangRepository;
import com.example.finaljava6.service.HangKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangKhachHangServiceImpl implements HangKhachHangService {
    @Autowired
    HangKhachHangRepository repository;

    @Override
    public List<HangKhachHang> getAll() {
        return repository.findAll();
    }
}
