package com.example.demo.service.impl;

import com.example.demo.model.KhachHang;
import com.example.demo.repository.KhachHangRepository;
import com.example.demo.service.KhachHangService;
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
    KhachHangRepository khachHangRepository;

    @Override
    public PageImpl<KhachHang> getAllPage(int page) {
        Pageable pageable = PageRequest.of(page, 5);
        Page<KhachHang> khachHangPage = khachHangRepository.findAll(pageable);
        List<KhachHang> getAllHangs = new ArrayList<>();
        khachHangPage.forEach(khachHang -> {
            getAllHangs.add(new KhachHang(khachHang));
        });
        return new PageImpl<>(getAllHangs, pageable, khachHangPage.getTotalElements());
    }

    @Override
    public KhachHang getOne(Long maKhachHang) {
        Optional<KhachHang> indexOne = khachHangRepository.findById(maKhachHang);
        if(indexOne.isEmpty()){
            throw new RuntimeException("Ma Khach hang Not Exit");
        }
        return indexOne.get();
    }

    @Override
    public KhachHang createKH(KhachHang newKhachHang) {
        KhachHang khachHang = new KhachHang(newKhachHang);
        return khachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang updateKH(Long maKhachHang, KhachHang updateKhachHang) {
        Optional<KhachHang> indexUpdate = khachHangRepository.findById(maKhachHang);
        if(indexUpdate.isPresent()){
            throw new RuntimeException("Ma Khach Hang Not Exit");
        }
        KhachHang khachHang = new KhachHang(updateKhachHang);
        khachHang.setMaKhachHang(maKhachHang);
        return khachHangRepository.save(khachHang);
    }

    @Override
    public boolean delete(Long maKhachHang) {
        Optional<KhachHang> indexDelete = khachHangRepository.findById(maKhachHang);
        if(indexDelete.isEmpty()){
            throw new RuntimeException("Ma Khach Hang Not Exit");
        }
        khachHangRepository.deleteById(maKhachHang);
        return true;
    }
}
