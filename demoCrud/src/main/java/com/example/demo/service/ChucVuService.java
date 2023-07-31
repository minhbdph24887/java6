package com.example.demo.service;

import com.example.demo.model.ChucVu;

import java.util.List;

public interface ChucVuService {
    List<ChucVu> getAllCV();

    ChucVu addChucVu(ChucVu chucVu);

}
