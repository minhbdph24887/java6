package com.example.demo.bai1.bai1_5_demoTaoJson;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ListStudent {
    private String hoVaTen;
    private Boolean gioiTinh = false;
    private Double diem = 0.0;
    Contact lienHe;
    List<String> monHoc;
}
