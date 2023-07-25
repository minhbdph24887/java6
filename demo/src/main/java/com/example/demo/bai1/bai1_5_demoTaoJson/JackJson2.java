package com.example.demo.bai1.bai1_5_demoTaoJson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JackJson2 {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
//        demo1();
//        demo2();
//        demo3();
//        demo4();
//        demo5();
//        demo6();
//        demo7();
    }

    private static void demo7() throws IOException {
        // TODO Auto-generated method stub
        Contact lienHe = new Contact("minhbdph24887@gmail.com", "0388598451", null);
        List<String> monHoc = Arrays.asList("WEB205", "COM108");
        ListStudent dsSinhVien = new ListStudent("Bùi Đức Minh", true, 8.9, lienHe, monHoc);
        ObjectMapper mapper = new ObjectMapper();
        // Ghi dữ liệu mới vào chuỗi
        String json = mapper.writeValueAsString(dsSinhVien);

        // Gửi đến một nơi nào đó
        mapper.writerWithDefaultPrettyPrinter().writeValue(System.out, dsSinhVien);

        // Ghi vào tập tin
        mapper.writeValue(new File("C:\\Users\\Lenovo\\Desktop\\IT\\Lap_Trinh_Java_6\\bai-tap\\demo\\src\\main\\resources\\static\\bai1\\dsSinhVienThem.json"), dsSinhVien);

    }

    private static void demo6() throws IOException {
        // TODO Auto-generated method stub
        Map<String, Object> lienHe = new HashMap<String, Object>();
        lienHe.put("email", "minhbdph24887@gmail.com");
        lienHe.put("dienThoai", "0388598451");
        List<String> monHoc = Arrays.asList("WEB205", "COM108");
        Map<String, Object> sinhVien = new HashMap<String, Object>();
        sinhVien.put("hoVaTen", "Bùi Đức Minh");
        sinhVien.put("diem", 8.7);
        sinhVien.put("gioiTinh", true);
        sinhVien.put("lienHe", lienHe);
        sinhVien.put("monHoc", monHoc);
        ObjectMapper mapper = new ObjectMapper();
        // Ghi dữ liệu mới vào chuỗi
        String json = mapper.writeValueAsString(sinhVien);
        System.out.println(json);

        // Gửi đến một nơi nào đó
        mapper.writeValue(System.out, sinhVien);

        // Ghi vào tập tin
        mapper.writeValue(new File("C:\\Users\\Lenovo\\Desktop\\IT\\Lap_Trinh_Java_6\\bai-tap\\demo\\src\\main\\resources\\static\\bai1\\dsSinhVienThem.json"), sinhVien);
    }

    private static void demo5() throws IOException {
        // TODO Auto-generated method stub
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode sinhVien = mapper.createObjectNode();
        sinhVien.put("hoVaTen", "Bùi Đức Minh");
        sinhVien.put("diem", 8.6);
        sinhVien.put("gioiTinh", true);
        ObjectNode lienHe = sinhVien.putObject("lienHe");
        lienHe.put("email", "minhbdph24887@gmail.com");
        lienHe.put("dienThoai", "0388598451");
        ArrayNode monHoc = sinhVien.putArray("monHoc");
        monHoc.add("WEB207");
        monHoc.add("MOB1023");

        // Ghi Dữ Liệu Mới Vào Chuỗi
        String json = mapper.writeValueAsString(sinhVien);

        // Gửi đến một nơi nào đó
        mapper.writeValue(System.out, sinhVien);

        // Ghi Vào Tập Tin
        mapper.writeValue(new File("C:\\Users\\Lenovo\\Desktop\\IT\\Lap_Trinh_Java_6\\bai-tap\\demo\\src\\main\\resources\\static\\bai1\\dsSinhVienThem.json"), sinhVien);
    }

    private static void demo4() throws IOException {
        // TODO Auto-generated method stub
        String json = "C:\\Users\\Lenovo\\Desktop\\IT\\Lap_Trinh_Java_6\\bai-tap\\demo\\src\\main\\resources\\static\\bai1\\danhSach.json"; // Gán đường đẫn tới file json vào đây
        TypeReference<List<ListStudent>> reference = new TypeReference<>() {
        };
        ObjectMapper mapper = new ObjectMapper();
        List<ListStudent> dsSinhViens = mapper.readValue(new File(json), reference);
        dsSinhViens.forEach(sv -> {
            System.out.println(">> Họ Và Tên Là: " + sv.getHoVaTen());
        });
    }

    private static void demo3() throws IOException {
        // TODO Auto-generated method stub
        String json = "C:\\Users\\Lenovo\\Desktop\\IT\\Lap_Trinh_Java_6\\bai-tap\\demo\\src\\main\\resources\\static\\bai1\\student.json"; // Gán đường đẫn tới file json vào đây
        ObjectMapper mapper = new ObjectMapper();
        ListStudent dsSinhVien = mapper.readValue(new File(json), ListStudent.class);

        System.out.println(">> Họ Và Tên Là:" + dsSinhVien.getHoVaTen());
        System.out.println(">> Điểm Là: " + dsSinhVien.getDiem());
        System.out.println(">> Giới Tính Là: " + dsSinhVien.getGioiTinh());
        Contact lienHe = dsSinhVien.getLienHe();
        System.out.println(">> Email Là: " + lienHe.getEmail());
        System.out.println(">> Số Điện Thoại Là: " + lienHe.getDienThoai());
        List<String> monHoc = dsSinhVien.getMonHoc();
        monHoc.forEach(sv -> {
            System.out.println(">> Môn Học Là: " + monHoc);
        });
    }

    private static void demo2() throws IOException {
        // TODO Auto-generated method stub
        String json = "C:\\Users\\Lenovo\\Desktop\\IT\\Lap_Trinh_Java_6\\bai-tap\\demo\\src\\main\\resources\\static\\bai1\\danhSach.json"; // Gán đường đẫn tới file json vào đây
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> sinhVien = mapper.readValue(new File(json), List.class);
        sinhVien.forEach(sv -> {
            System.out.println(">> Họ Và Tên Là: " + sv.get("hoVaTen"));
        });
    }

    private static void demo1() throws IOException {
        // TODO Auto-generated method stub
        String json = "C:\\Users\\Lenovo\\Desktop\\IT\\Lap_Trinh_Java_6\\bai-tap\\demo\\src\\main\\resources\\static\\bai1\\student.json"; // Gán đường đẫn tới file json vào đây
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> sinhVien = mapper.readValue(new File(json), Map.class);

        System.out.println(">> Tên Là: " + sinhVien.get("hoVaTen"));
        System.out.println(">> Điểm Là: " + sinhVien.get("diem"));
        System.out.println(">> Giới Tính Là: " + sinhVien.get("gioiTinh"));
        Map<String, Object> lienHe = (Map<String, Object>) sinhVien.get("lienHe");
        System.out.println(">> Email Là: " + lienHe.get("email"));
        System.out.println(">> Số Điện Thoại Là: " + lienHe.get("DienThoai"));
        List<String> monHoc = (List<String>) sinhVien.get("monHoc");
        monHoc.forEach(sv -> {
            System.out.println(">> Môn Học Là: " + monHoc);
        });
    }
}
