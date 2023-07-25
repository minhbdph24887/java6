package com.example.demo.bai2;

public class ly_thuyet_bai_2 {
    /*
     * Bai2_1:
     *  Trong thymeleaf có
     * text hiển thị như text bình thường
     * utext hiển thị như một file html nếu như trong message có thẻ thì nó sẽ tuân thủ như trong thẻ
     *
     * một cách khác hiển thị:
     * nếu là text thì sử dụng [[]]
     * vd: <li>[[${message}]]</li>
     *
     * nếu là utext thì sử dụng [()]
     * vd: <li>[(${message})]</li>
     *
     * Bai 2_3
     * scope và parameters => truy xuất các attribuile trong các scope
     * model là đọc dữ liệu ra trình duyệt
     * request là nơi chia sẻ dữ liệu giữa các thành phần (jsp <=> servlet)
     * session là lưu những dữ liệu cho từng phiên làm việc và dùng chung cho nhiều các request khác nhau của phiên đó
     * application là nơi chia sẻ dữ liệu cho nhiều người cho toàn bộ ứng dụng
     * parameter là tham số có thể nằm trong query,...
     *
     *  DÙNG THYMELEAF LÀM CHO CÁC BIẾN
     *  <li th:text="${x + y}"></li>                                     => thực hiện phép cộng
     *  <li th:text="${x % y}"></li>                                     => thực hiện phép tính lấy phần dư
     *  <li th:text="not ${x > y}"></li>                                 => thực hiện việc so sánh
     *  <li th:text="${x gt y} and ${x == y}"></li>                      => cx là so sánh
     *  <li th:text="${x > y} ? 'OK' : 'Cancel'"></li>                   => biểu thức điều kiện
     *  <li th:text="@{|/a/b/${x}/${y}|}"></li>                          => tạo ra các đường dẫn, chèn các biến
     *  <li th:text="'/a/b' + ${x} + '/' + ${y}"></li>                   => tạo ra các biến thymeleaf 2
     *  <li th:text="@{/a/b/{p1}/{p2}(p1=${x}, p2=${y})}"></li>          => tạo ra các biến thymeleaf 1
     *
     */

}
