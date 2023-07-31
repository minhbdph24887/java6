package com.example.demo.service.impl;

import com.example.demo.model.ChucVu;
import com.example.demo.repository.ChucVuRepository;
import com.example.demo.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ChucVuServiceImpl implements ChucVuService {
    Random random = new Random();
    @Autowired
    ChucVuRepository chucVuRepository;

    @Override
    public List<ChucVu> getAllCV() {
        return chucVuRepository.findAll();
    }

    @Override
    public ChucVu addChucVu(ChucVu chucVu) {
        ChucVu newChucVu1 = ChucVu.builder()
                .maChucVu("CV" + random.nextInt())
                .tenChucVu(chucVu.getTenChucVu())
                .build();
        return chucVuRepository.save(newChucVu1);
    }
}
