create database demo8_java6
use demo8_java6
go

create table Products(
	Id bigint identity(1, 1) primary key,
	Name nvarchar(100) not null,
	Image nvarchar(50) not null,
	Price decimal(20, 0) not null,
	CreateDate date not null,
	Available bit not null,
	CategoryId bigint not null
)
go

create table Categories(
	Id bigint identity(1, 1) primary key,
	Name nvarchar(100) not null
)
go

create table OrderDetails(
	Id bigint identity(1, 1) primary key,
	OrderId bigint not null,
	ProductId bigint not null,
	Price decimal(20, 0) not null,
	Quantity int not null
)
go

create table Orders(
	Id bigint identity(1, 1) primary key,
	Username varchar(50) not null,
	CreateDate date not null,
	Address nvarchar(100) not null
)
go

create table Accounts(
	Username varchar(50) primary key,
	Password nvarchar(100) not null,
	Fullname nvarchar(100) not null,
	Email nvarchar(50) not null,
	Photo nvarchar(50) not null
)
go

create table Authorities(
	Id bigint identity(1, 1) primary key,
	Username varchar(50) not null,
	RoleId bigint not null
)
go

create table Roles(
	Id bigint identity(1, 1) primary key,
	Name nvarchar(100) not null
)
go

alter table Products add foreign key (CategoryId) references Categories(Id)
go
alter table OrderDetails add foreign key (OrderId) references Orders(Id)
go
alter table OrderDetails add foreign key (ProductId) references Products(Id)
go
alter table Orders add foreign key (Username) references Accounts(Username)
go
alter table Authorities add foreign key (Username) references Accounts(Username)
go
alter table Authorities add foreign key (RoleId) references Roles(Id)
go