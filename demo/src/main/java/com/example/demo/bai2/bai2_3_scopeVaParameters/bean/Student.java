package com.example.demo.bai2.bai2_3_scopeVaParameters.bean;

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
    private String hoTen;
    private Boolean gioiTinh;
    private String email;
    private Double diem;
}
