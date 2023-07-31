package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNhanVien;

    @Column(name = "Ma")
    private String maNhanVien;

    @Column(name = "Ten")
    @NotBlank(message = "Ten Nhan Vien Khong Duoc De Trong")
    @Max(value = 50, message = "Ten Nhan Vien Toi Da 50 Ki Tu")
    private String tenNhanVien;

    @Column(name = "GioiTinh")
    private Boolean gioiTinh;

    @Column(name = "NgaySinh")
    private LocalDate ngaySinh;

    @ManyToOne
    @JoinColumn(name = "IdChucVu")
    private ChucVu chucVu;

    @NotBlank(message = "Dia Chi Khong Duoc De Trong")
    @Max(value = 100, message = "Dia Chi Nhan Vien Khong Duoc Vuot Qua 100 Ki Tu")
    private String diaChi;
}
