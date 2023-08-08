package com.example.demo.controller;

import com.example.demo.model.KhachHang;
import com.example.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/khach-hang/")
public class KhachHangRestController {
    @Autowired
    KhachHangService khachHangService;

    @GetMapping("/hien-thi")
    public List<KhachHang> getAll(){
        return khachHangService.getAll();
    }

    @GetMapping()
    public ResponseEntity<?> getAll(@RequestParam(value = "page", defaultValue = "0") int page){
        return ResponseEntity.status(200).body(khachHangService.getAllPage(page));
    }

    @GetMapping("{maKhachHang}")
    public ResponseEntity<?> detail(@PathVariable("maKhachHang") Long maKhachHang) {
        return ResponseEntity.status(200).body(khachHangService.getOne(maKhachHang));
    }

    @PostMapping("add")
    public ResponseEntity<?> create(@RequestBody KhachHang khachHang) {
        return ResponseEntity.status(200).body(khachHangService.createKH(khachHang));
    }

    @PutMapping("{maKhachHang}")
    public ResponseEntity<?> update(@PathVariable("maKhachHang") Long maKhachHang, @RequestBody KhachHang khachHang) {
        return ResponseEntity.status(200).body(khachHangService.updateKH(maKhachHang, khachHang));
    }

    @DeleteMapping("{maKhachHang}")
    public ResponseEntity<?> delete(@PathVariable("maKhachHang") Long maKhachHang) {
        return ResponseEntity.status(200).body(khachHangService.delete(maKhachHang));
    }
}
