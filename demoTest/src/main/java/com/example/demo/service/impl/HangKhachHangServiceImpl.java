package com.example.demo.service.impl;

import com.example.demo.model.HangKhachHang;
import com.example.demo.repository.HangKhachHangRepository;
import com.example.demo.service.HangKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangKhachHangServiceImpl implements HangKhachHangService {
    @Autowired
    HangKhachHangRepository khachHangRepository;

    @Override
    public List<HangKhachHang> getAllHKH() {
        return khachHangRepository.findAll();
    }
}
