package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    private Integer maHang;

    @Column(name = "TenHang")
    private String tenHang;

    @JsonIgnore
    @OneToMany(mappedBy = "hangKhachHang")
    List<KhachHang> khachHangs;
}
