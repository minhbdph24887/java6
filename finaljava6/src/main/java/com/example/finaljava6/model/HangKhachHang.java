package com.example.finaljava6.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "HangKhachHang")
public class HangKhachHang implements Serializable {
    @Id
    @Column(name = "MaHang")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maHangKhachHang;

    @Column(name = "TenHang")
    private String tenHangKhachHang;

    @JsonIgnore()
    @OneToMany(mappedBy = "hangKhachHang")
    List<KhachHang> khachHangs;
}
