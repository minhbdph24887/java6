package com.example.demo.bai1.bai1_4_docjson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JackJson1 {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        demo1();
//        demo2();
    }

    private static void demo2() throws IOException {
        // TODO Auto-generated method stub
        String json = "C:\\Users\\Lenovo\\Desktop\\IT\\Lap_Trinh_Java_6\\bai-tap\\demo\\src\\main\\resources\\static\\bai1\\danhSach.json"; // Gán đường đẫn tới file json vào đây
        ObjectMapper mapper = new ObjectMapper();
        JsonNode sinhViens = mapper.readTree(new File(json)); // Chuyển đổi ObjectMapper sang JsonNode

        sinhViens.iterator().forEachRemaining(hoTen -> {
            System.out.println(">> Họ Tên Là: " + hoTen.get("hoVaTen").asText());
        });
    }

    private static void demo1() throws IOException {
        // TODO Auto-generated method stub
        String json = "C:\\Users\\Lenovo\\Desktop\\IT\\Lap_Trinh_Java_6\\bai-tap\\demo\\src\\main\\resources\\static\\bai1\\student.json"; // Gán đường đẫn tới file json vào đây
        ObjectMapper mapper = new ObjectMapper(); // tạo một ObjectMapper
        JsonNode sinhVien = mapper.readTree(new File(json)); // Chuyển đổi ObjectMapper sang JsonNode

        System.out.println(">> Họ Và Tên Là: " + sinhVien.get("hoVaTen").asText());
        System.out.println(">> Điểm Là: " + sinhVien.get("diem").asDouble());
        System.out.println(">> Giới Tính Là: " + sinhVien.get("gioiTinh").asBoolean());
        System.out.println(">> Email Là: " + sinhVien.get("lienHe").get("email").asText());
        System.out.println(">> Số Điện Thoại Là: " + sinhVien.findValue("dienThoai").asText());
        sinhVien.get("monHoc").iterator().forEachRemaining(monHoc -> {
            System.out.println(">> Mon Hoc Là: " + monHoc.asText());
        });
    }
}
