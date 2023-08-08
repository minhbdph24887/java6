package com.fpt.baithi.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "khachhang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long makhachhang;
    private String tenkhachhang;
    private String sodienthoai;

    @OneToMany(mappedBy = "khachHang")
    List<DanhSachYT> danhSachYTS;
}
