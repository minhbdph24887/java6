package com.example.demo.bai2.bai2_2_demoBieuThucThymeleaf.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Student {
    private String hoTen;
    private Boolean gioiTinh = false;
    private Double diem = 0.0;
    Contact lienHe;
    List<String> monHoc;
}
