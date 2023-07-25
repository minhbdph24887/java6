package com.example.demo.bai3.bai3_1_DATABINDING_AND_VALIDATION.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Student {
    private String hoVaTen;
    private Boolean gioiTinh;
    private Double diem;
    private String email;
    private String queQuan;
}
