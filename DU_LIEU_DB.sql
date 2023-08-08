select * from HangKhachHang
-- HangKhachHang O DB Dang Chay Gen Nhieu Qua Nen Khi Co Bang Nao Co Insert Bang HangKhachHang 
--thi phai mo Bang Nay Va Sua Lai Du Lieu
insert into HangKhachHang(TenHang, MoTa, DiemToiThieu, TrangThai) values
('Tiem Nang', 'Hang Moi Bat Dau', 0, 1),
('Bac', 'Thang Bac Cap 2', 100, 1),
('Vang', 'Thang Bac Cap 3', 500, 1),
('Bach Kim', 'Thang Bac Cap 4', 1000, 1),
('Than Thiet', 'Thang Bac Cap 5', 2000, 1)
go

select * from KhachHang
select * from HangKhachHang -- Bang Nay Co Hang Khach Hang Chay Bang Nay Truoc
-- DB Insert into KhachHang Khong Gen Duoc Tu 1 Ma Bat Dau Tu 11 Nen Bang Nao Noi Voi KhachHang Thi Xem That Ki
insert into KhachHang values
('Bui Duc Minh', '2003-03-09', 'Ha Noi', '2345678901', 'minhbdph24887@fpt.edu.vn', 1, '234567890', '234567890', null, 1, 34, 3, null),
('Ngyen Van A', '2003-05-29', 'Ha Noi', '1345678902', 'anguyenvan12@fpt.edu.vn', 1, '134567890', '134567890', null, 1, 143, 4, null),
('Trinh Thi B', '2003-04-10', 'Ha Noi', '1245678903', 'btrinhthi23@fpt.edu.vn', 0, '124567890', '124567890', null, 1, 534, 5, null),
('Hoang Duc C', '2003-08-15', 'Ha Noi', '1235678904', 'choangduc34@fpt.edu.vn', 1, '123567890', '123567890', null, 0, 1034, 6, null),
('Nong Thi B', '2003-07-15', 'Ha Noi', '1234678905', 'bnongthi45@fpt.edu.vn', 0, '123467890', '123467890', null, 1, 3034, 7, null)
go

select * from TheThanhVien
select * from KhachHang -- TheThanhVien Noi Voi Bang KhachHang
insert into TheThanhVien values
('MaThe01', 'The Bac', 'The Cung', '2019-06-15', '2020-01-01', 0, 3),
('MaThe02', 'The Vang', 'The Cung', '2015-03-25', '2017-11-01', 0, 4),
('MaThe03', 'The BKim', 'The Cung', '2018-09-11', null, 1, 5),
('MaThe04', 'The TThiet', 'The Cung', '2020-04-20', null, 1, 6),
('MaThe05', 'The Bac', 'The Cung', '2016-07-15', '2019-01-01', 0, 7)
go

select * from PhieuGiamGia
select * from KhachHang -- PhieuGiamGia Noi Voi Bang KhachHang
insert into PhieuGiamGia values
('MaPhieu01', 'Phieu Giam Noen', '2022-12-25', '2022-12-30', 30.000, 100.000, 1, 0, 3),
('MaPhieu02', 'Phieu Giam Tet Duong', '2022-12-30', '2023-01-10', 130.000, 200.000, 1, 0, 4),
('MaPhieu03', 'Phieu Giam Tet Am', '2023-01-25', '2023-02-15', 140.000, 200.000, 1, 0, 5),
('MaPhieu04', 'Phieu Giam Tinh Nhan', '2023-02-13', '2023-02-18', 230.000, 300.000, 1, 0, 6),
('MaPhieu05', 'Phieu Giam QKhach', '2023-09-01', '2023-09-05', 100.000, 200.000, 1, 0, 7)
go

select * from DiaChi
select * from KhachHang -- DB Noi Voi KhachHang
insert into DiaChi values
('BAC3BF3B-EDBD-48CA-9D14-1BAE0431B842', 'Hung Tien Ha Noi', 'Hung Tien My Duc Ha Noi', 'Ha Noi', 'My Duc', 'Hung Tien', 'ThonAB', 3),
('71868DC5-18DF-458C-B966-45B044B55115', 'An Tien Ha Noi', 'An Tien My Duc Ha Noi', 'Ha Noi', 'My Duc', 'An Tien', 'ThonBC', 4),
('D7B27118-995E-4F92-846C-7C1C0DB28669', 'Hop Tien Ha Noi', 'Hop Tien My Duc Ha Noi', 'Ha Noi', 'My Duc', 'Hop Tien', 'ThonCD', 5),
('CA1C840F-6A88-46EF-A8F6-8518AD15EDFE', 'Dai Hung Ha Noi', 'Dai Hung My Duc Ha Noi', 'Ha Noi', 'My Duc', 'Dai Hung', 'ThonCA', 6),
('C1C2A996-0E96-46D8-9529-A43682EC4870', 'Ung Hoa Ha Noi', 'Thai Binh Ung Hoa Ha Noi', 'Ha Noi', 'Ung Hoa', 'Thai Binh', 'Thon Thai Binh', 7)
go

select * from SanPham
insert into SanPham values
('Ao Thun', 'Vai', 169.000, 459, 'Hang Moi Ve', 'Hang Ao', 'Mau Vang', 'Adidas', 1),
('Dien Thoai 10', 'Thiet Bi', 1169.000, 109, 'Hang Moi Ve', 'Hang Thiet Bi', 'Mau Den', 'SamSung', 1),
('May Tinh 13', 'Thiet Bi', 2169.000, 379, 'Hang Moi Ve', 'Hang Thiet Bi', 'Mau Xanh', 'LG', 1),
('Tivi 14', 'Thiet Bi', 13269.000, 499, 'Hang Moi Ve', 'Hang Thiet Bi', 'Mau Den', 'SamSung', 1),
('Table 18', 'Thiet Bi', 15669.000, 859, 'Hang Moi Ve', 'Hang Thiet Bi', 'Mau Trang', 'Xiaomi', 1)
go

select * from HoaDon
select * from KhachHang -- Xem Lai DB KhachHang
insert into HoaDon values
(getDate(), 'Bui Duc Minh', 'Khong Co', getDate() + 3, 1, 3),
(getDate(), 'Nguyen Van A', 'Khong Co', getDate() + 3, 1, 4),
(getDate(), 'Trinh Thi B', 'Khong Co', getDate() + 3, 1, 5),
(getDate(), 'Hoang Duc C', 'Khong Co', getDate() + 3, 1, 6),
(getDate(), 'Nong Thi B', 'Khong Co', getDate() + 3, 1, 7)
go

select * from HoaDonChiTiet
select * from HoaDon
select * from SanPham
insert into HoaDonChiTiet values
('1', '1', 14, 169.000, 'Hang Moi Ve', 1),
('2', '2', 25, 1169.000, 'Hang Moi Ve', 1),
('3', '3', 20, 2169.000, 'Hang Moi Ve', 1),
('4', '4', 29, 13269.000, 'Hang Moi Ve', 1),
('5', '5', 27, 15669.000, 'Hang Moi Ve', 1)
go

select * from PhieuGiaoHang
select * from HoaDon
select * from DiaChi
insert into PhieuGiaoHang values
('7EAA8698-FBAB-40CE-B140-0DC8BFD37236', 'Bui Duc Minh', '0123456789', 'Nguyen Van X', '0123456789', getDate() + 4, getDate() + 7, 'Bui Duc Minh', 13.000, 1, 'BAC3BF3B-EDBD-48CA-9D14-1BAE0431B842', 'Khong Co', 1),
('0400A992-7A95-47D7-B1AF-2C99159EDFCD', 'Nguyen Van A', '0123456789', 'Nong Thi Y', '0123456789', getDate() + 4, getDate() + 7, 'Nguyen Van A', 13.000, 2, '71868DC5-18DF-458C-B966-45B044B55115', 'Khong Co', 1),
('8CD4635C-1EDB-4BCB-ACAC-5F4379B3F91A', 'Trinh Thi B', '0123456789', 'Nguyen Van X', '0123456789', getDate() + 4, getDate() + 7, 'Trinh Thi B', 26.000, 3, 'D7B27118-995E-4F92-846C-7C1C0DB28669', 'Khong Co', 1),
('092D20FA-9497-4CB3-82EA-93E739DE7DEF', 'Hoang Duc C', '0123456789', 'Nong Thi Y', '0123456789', getDate() + 4, getDate() + 7, 'Hoang Duc C', 13.000, 4, 'CA1C840F-6A88-46EF-A8F6-8518AD15EDFE', 'Khong Co', 1),
('964D38DD-DB8E-42A2-A7C4-E25574119DAE', 'Nong Thi B', '0123456789', 'Nguyen Van X', '0123456789', getDate() + 4, getDate() + 7, 'Nong Thi B', 36.000, 5, 'C1C2A996-0E96-46D8-9529-A43682EC4870', 'Khong Co', 1)
go

select * from GioHang
select * from KhachHang -- Nhin Lai DB KhachHang
insert into GioHang(NgayTao, NgayCapNhap, NguoiSoHuu, GhiChu, TrangThai) values
(getDate(), getDate() + 1, 3, 'Khong Co', 1),
(getDate(), getDate() + 1, 4, 'Khong Co', 1),
(getDate(), getDate() + 1, 5, 'Khong Co', 1),
(getDate(), getDate() + 1, 6, 'Khong Co', 1),
(getDate(), getDate() + 1, 7, 'Khong Co', 1)
go

select * from GioHangChiTiet
select * from GioHang
select * from SanPham
insert into GioHangChiTiet values
('429656B6-038D-478D-82B6-31A43C309785', 1, 12, 'Khong Co', 1),
('761E2687-BDA4-4A24-A307-6A2FC9C87B29', 2, 23, 'Khong Co', 1),
('3AB7E2D2-CB9A-4241-AE40-71FE4F435867', 3, 34, 'Khong Co', 1),
('051C68B1-3149-47D7-9F42-7C5427D9DA62', 4, 45, 'Khong Co', 1),
('BA564EE3-ADEA-4EA6-B4A0-DFD1EBCDB5D7', 5, 56, 'Khong Co', 1)
go

select * from DanhSachYeuThich
select * from KhachHang --Nhin Lai DB KhachHang
insert into DanhSachYeuThich(NgayTao, NgayCapNhap, NguoiSoHuu, GhiChu, TrangThai) values
(getDate(), getDate() + 1, 3, 'Khong Co', 1),
(getDate(), getDate() + 1, 4, 'Khong Co', 1),
(getDate(), getDate() + 1, 5, 'Khong Co', 1),
(getDate(), getDate() + 1, 6, 'Khong Co', 1),
(getDate(), getDate() + 1, 7, 'Khong Co', 1)
go

select * from YeuThichChiTiet
select * from DanhSachYeuThich
select * from SanPham
insert into YeuThichChiTiet values
('2FEC233B-F318-4DAE-BED8-12B72BC2EF2E', 1, 'Khong Co', 1),
('474A243E-A78E-446B-98E3-D0D85FECB373', 2, 'Khong Co', 1),
('BEDBEDA0-3351-4A2E-B2EC-E327A0B81CC8', 3, 'Khong Co', 1),
('C20C4C8E-E54F-4E46-AEF7-EB7EC05ACA15', 4, 'Khong Co', 1),
('4F2E1930-59D3-4478-B15C-F82CB05829A8', 5, 'Khong Co', 1)
go
