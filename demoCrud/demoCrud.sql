create database DemoCrud
use DemoCrud

create table ChucVu(
	Id int identity(1, 1) primary key,
	Ma varchar(20) not null,
	Ten nvarchar(50) not null
)
go

create table NhanVien(
	Id int identity(1, 1) primary key,
	Ma varchar(20) not null,
	Ten varchar(50) not null,
	GioiTinh bit not null,
	NgaySinh date not null,
	IdChucVu int not null,
	DiaChi nvarchar(100) not null
)
go

alter table NhanVien add foreign key (IdChucVu) references ChucVu(Id)
go