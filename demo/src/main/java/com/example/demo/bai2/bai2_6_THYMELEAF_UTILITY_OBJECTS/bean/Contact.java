package com.example.demo.bai2.bai2_6_THYMELEAF_UTILITY_OBJECTS.bean;

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
public class Contact {
    private String email;
    private String dienThoai;
    private String diaChi;
}
