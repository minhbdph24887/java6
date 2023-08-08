package com.example.finaljava6.controller;

import com.example.finaljava6.model.KhachHang;
import com.example.finaljava6.service.KhachHangService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/khach-hang/")
public class KhachHangController {
    @Autowired
    KhachHangService service;

    @GetMapping("hien-thi")
    public List<KhachHang> getAll() {
        return service.getAllKH();
    }

    @GetMapping("detail/{maKhachHang}")
    public KhachHang detail(@PathVariable("maKhachHang") Long maKhachHang) {
        return service.detail(maKhachHang);
    }

    @GetMapping("trang")
    public Page<KhachHang> khachHangPage(@RequestParam(value = "page", defaultValue = "0") Integer page) {
        return service.getAllPage(page);
    }

    @PostMapping("add")
    public KhachHang create(@Valid @RequestBody KhachHang khachHang, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println(result);
        } else {
            return service.create(khachHang);
        }
        return null;
    }

    @PutMapping("update")
    public KhachHang update(@Valid @RequestBody KhachHang khachHang, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println(result);
        } else {
            return service.update(khachHang);
        }
        return null;
    }

    @DeleteMapping("delete/{maKhachHang}")
    public void delete(@PathVariable("maKhachHang") Long maKhachHang) {
        service.delete(maKhachHang);
    }
}
