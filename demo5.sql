create database demo5_1
use demo5_1
go

create table student(
	email nvarchar(50) primary key,
	fullname nvarchar(50) not null,
	marks float not null,
	gender bit not null,
	country nvarchar(2) not null
)
go

insert into student values
('minhbdph24887@fpt.edu.vn', 'Bui Duc Minh', 8.5, 0, 'VN'),
('hienntph25063@fpt.edu.vn', 'Nguyen Thi Thuy Hien', 8.5, 1, 'VN')
go

select * from student

create table Catgoties(
	Id nvarchar(50) primary key,
	Name nvarchar(50) not null
)
go

create table Products(
	Id bigint identity(1, 1) primary key,
	Name nvarchar(50) not null,
	Image nvarchar(50) not null,
	Price money not null,
	CreateDate date not null,
	Available bit not null,
	CategoryId nvarchar(50) foreign key references Catgoties(id)
)
go

create table Accounts(
	Username nvarchar(50) primary key,
	Password nvarchar(50) not null,
	Fullname nvarchar(50) not null,
	Email nvarchar(100) not null,
	Photo nvarchar(50) not null
)
go

create table Orders(
	Id bigint identity(1, 1) primary key,
	UserName nvarchar(50) foreign key references Accounts(Username),
	CreateDate date not null,
	Address nvarchar(100) not null
)
go

create table OrderDetails(
	Id bigint identity(1, 1) primary key,
	OrderId bigint foreign key references Orders(Id),
	ProductId bigint foreign key references Products(Id),
	Price money not null,
	Quantity int not null,
)
go

select * from Catgoties
insert into Catgoties values
('1', 'SmartPhone'),
('2', 'Tablet')
go

create table students(
	Email nvarchar(50) primary key,
	FullName nvarchar(50) not null,
	Marks float not null,
	Gender bit not null,
	Country nvarchar(2) not null
)
go