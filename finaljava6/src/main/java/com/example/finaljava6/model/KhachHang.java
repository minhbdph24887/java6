package com.example.finaljava6.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @Column(name = "MaKhachHang")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maKhachHang;

    @NotBlank(message = "Ten Khach Hang Trong")
    @Column(name = "TenKhachHang")
    private String tenKhachHang;

    @NotBlank(message = "So Dien Thoai Trong")
    @Column(name = "SoDienThoai")
    private String sdt;

    @Column(name = "GioiTinh")
    private Boolean gioiTinh;

    @ManyToOne()
    @JoinColumn(name = "HangKhachHang", referencedColumnName = "MaHang")
    private HangKhachHang hangKhachHang;
}
