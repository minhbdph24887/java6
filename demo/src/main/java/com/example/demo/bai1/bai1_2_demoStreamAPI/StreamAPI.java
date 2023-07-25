package com.example.demo.bai1.bai1_2_demoStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    static List<Student> listSinhVien = Arrays.asList(
            new Student("Bùi Đức Minh", true, 8.5),
            new Student("Nguyễn Thị Thúy Hiền", false, 8.5),
            new Student("Nguyễn Văn A", true, 8.0),
            new Student("Trịnh Thị B", false, 8.1),
            new Student("Hồng Thị C", false, 8.2)
    );

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        demo1();
//        demo2();
//        demo3();
//        demo4();
    }

    private static void demo4() {
        // TODO Auto-generated method stub
        double diemTB = listSinhVien.stream()
                // Đổi điểm sang Double rồi tính điểm trung bình
                .mapToDouble(sinhVien -> sinhVien.getMarks())
                .average().getAsDouble();
        System.out.println("Điểm Trung Bình Là: " + diemTB);

        double tongDiem = listSinhVien.stream()
                // Đổi điểm sang Double rồi tính tổng điểm
                .mapToDouble(sinhVien -> sinhVien.getMarks())
                .sum();
        System.out.println("Tổng Điểm Là: " + tongDiem);

        double diemThapNhat = listSinhVien.stream()
                // Đổi điểm sang Double rồi tìm điểm thấp nhất
                .mapToDouble(sinhVien -> sinhVien.getMarks())
                .min().getAsDouble();
        System.out.println("Điểm Số Thấp Nhất Là: " + diemThapNhat);

        boolean checkDiem = listSinhVien.stream()
                // Kiểm tra điểm có lớn hơn 5 không ?
                .allMatch(sinhVien -> sinhVien.getMarks() >= 5);
        System.out.println("Danh Sach Điểm Lớn Hơn 5 Là: " + checkDiem);

        Student sinhVienThap = listSinhVien.stream()
                // Kiểm tra danh sách tìm sinh viên có điểm thấp nhất
                .reduce(listSinhVien.get(0), (min, sinhVien) -> sinhVien.getMarks() < min.getMarks() ? sinhVien : min);
        System.out.println("Sinh Viên Có Điểm Thấp Nhất Là: " + sinhVienThap.getName());
    }

    private static void demo3() {
        // TODO Auto-generated method stub
        List<Student> sinhVienList = listSinhVien.stream()
                .filter(sinhVien -> sinhVien.getMarks() >= 8.2) // tìm danh sách những sinh viên có điểm >= 8.2
                .peek(sinhVien -> sinhVien.setName(sinhVien.getName().toUpperCase())) // Đổi tên trong danh sách thành chữ in hoa
                .collect(Collectors.toList()); // Thu thập lại toàn bộ kết quả qua bộ lọc
        sinhVienList.forEach(sv -> {
            System.out.println(">> Tên Là: " + sv.getName());
            System.out.println(">> Điểm Là: " + sv.getMarks());
            System.out.println();
        });
    }

    private static void demo2() {
        // TODO Auto-generated method stub
        List<Integer> listInteger = Arrays.asList(1, 9, 4, 7, 5, 2);
        List<Double> listDouble = listInteger.stream() // Stream<Integer>
                .filter(x -> x % 2 == 0) // Stream<Integer>
                .map(x -> Math.sqrt(x)) // Stream<Double>
                .peek(y -> System.out.println(y)) // Stream<Double>
                .collect(Collectors.toList()); // List<Double>
    }

    private static void demo1() {
        // TODO Auto-generated method stub
        // Cách 1:
        Stream<Integer> stream1 = Stream.of(1, 9, 4, 7, 5, 2);
        System.out.println("Cách 1");
        stream1.forEach(x -> {
            System.out.println(x);
        });
        System.out.println();

        // Cách 2:
        List<Integer> listInteger = Arrays.asList(1, 9, 4, 7, 5, 2);
        //Stream<Integer> stream2 = listInteger.stream();
        System.out.println("Cách 2");
        listInteger.stream().forEach(x -> {
            System.out.println(x);
        });
    }
}
