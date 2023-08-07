package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "KhachHang")
public class KhachHang implements Serializable {
    @Id
    @Column(name = "MaKhachHang")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maKhachHang;

    @Column(name = "TenKhachHang")
    private String tenKhachHang;

    @Column(name = "SoDienThoai")
    private String sdt;

    @Column(name = "GioiTinh")
    private Boolean gioiTinh;

    @ManyToOne()
    @JoinColumn(name = "HangKhachHang", referencedColumnName = "MaHang")
    private HangKhachHang hangKhachHang;

    public KhachHang(KhachHang khachHang) {
    }
}
