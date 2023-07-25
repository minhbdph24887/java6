package com.example.demo.bai1.bai1_1_demoLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {
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
        // Sử dụng FunctionalInterface

        // Cách 1:
//        Demo4Inter demo = new Demo4Inter() {
//            @Override
//            public void m1(int x) {
//                // TODO Auto-generated method stub
//                System.out.println(x);
//            }
//        };

        // Cách 2:
        Demo4Inter demo = x -> {
            // TODO Auto-generated method stub
            System.out.println(x);
        };
        demo.m1(2021);
    }

    private static void demo3() {
        // TODO Auto-generated method stub
        Collections.sort(listSinhVien, (sv1, sv2) -> -sv1.getMarks().compareTo(sv2.getMarks()));
        // Thêm dấu "-" đằng trước là giảm dần còn không thêm dấu "-" thì sẽ là tăng dần
        listSinhVien.forEach(x -> {
            System.out.println(">> Tên Là: " + x.getName());
            System.out.println(">> Điểm Là: " + x.getMarks());
            System.out.println();
        });
    }

    private static void demo2() {
        // TODO Auto-generated method stub
        List<Student> listSinhVien = Arrays.asList(
                new Student("Bùi Đức Minh", true, 8.5),
                new Student("Nguyễn Thị Thúy Hiền", false, 8.5),
                new Student("Nguyễn Văn A", true, 8.0),
                new Student("Trịnh Thị B", false, 8.1),
                new Student("Hồng Thị C", false, 8.2)
        );
        listSinhVien.forEach(x -> {
            System.out.println(">> Tên Là: " + x.getName());
            System.out.println(">> Điểm Là: " + x.getMarks());
            System.out.println();
        });
    }

    private static void demo1() {
        // TODO Auto-generated method stub
        List<Integer> list = Arrays.asList(1, 9, 4, 7, 5, 2);
        list.forEach(x -> System.out.println(x));
    }
}

@FunctionalInterface
interface Demo4Inter {
    void m1(int x);

    default void m2() {
    }

    public static void m3() {
    }
}
