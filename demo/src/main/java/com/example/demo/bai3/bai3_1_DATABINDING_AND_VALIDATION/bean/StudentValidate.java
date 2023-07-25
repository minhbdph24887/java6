package com.example.demo.bai3.bai3_1_DATABINDING_AND_VALIDATION.bean;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
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
public class StudentValidate {
    @NotBlank(message = "Ho Va Ten Trong")
    private String hoVaTen;

    @NotNull(message = "Chon Gioi Tinh")
    private Boolean gioiTinh;

    @NotNull(message = "Diem Trong")
    @PositiveOrZero(message = "Diem Phai Lon Hoac Bang 0")
    @Max(value = 10, message = "Diem Phai Nho Hon Hoac Bang 10")
    private Double diem;

    @NotBlank(message = "Email Trong")
    @Email(message = "Khong Dung Dinh Dang Email")
    private String email;

    @NotBlank(message = "Chon Que Quan")
    private String queQuan;
}
