<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/17/2023
  Time: 2:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

</head>
<body>
    <div class="row">
        <div class="col-3"></div>
        <div class="col-6">
            <br>
            <br>
            <form action="/danh-sach-yeu-thich/add" method="post" onsubmit=" return add()">
                <label>Ghi Chu :</label>
                <input class="form-control" name="ghichu">
                <span style="color: red">${erro}</span>
                <br>
                <label>Ma Khach Hang :</label>
                <select name="khachhang">
                    <c:forEach items="${khachhang}" var="kh">
                        <option value="${kh.makhachhang}">${kh.makhachhang}</option>
                    </c:forEach>
                </select>
                <br>
                <br>
                Trang Thai :<input type="radio" name="trangthai" value="1" checked>Hoạt Động
                            <input type="radio" name="trangthai" value="0">Ngừng Hoạt Động

                <br>
                <hr>
                <button class="btn btn-primary">Add</button>
            </form>


        </div>
        <div class="col-3"></div>
    </div>

</body>
    <script>
        function add(){
            if (window.confirm("Bạn Có muồn thêm không trang add Không ?")){

            }else {
                return false;
            }
        }
    </script>
</html>
