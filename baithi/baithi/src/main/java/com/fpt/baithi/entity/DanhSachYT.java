package com.fpt.baithi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "danhsachyeuthich")
public class DanhSachYT {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID madanhsach;
    private String ghichu;
    private Long trangthai;

    @ManyToOne
    @JoinColumn(name = "nguoisohuu")
    KhachHang khachHang;

}
