create database bai7_java6
use bai7_java6

create table Accounts(
	Username varchar(20) primary key,
	Password nvarchar(100) not null,
	Fullname nvarchar(50) not null,
	Email nvarchar(50) not null,
	Photo nvarchar(50)
)
go

create table Roles(
	Id varchar(10) primary key,
	Name nvarchar(50) not null
)
go


create table Authorities(
	Id int primary key,
	UserName varchar(20)not null,
	RoleId varchar(10) not null
)
go

Alter table Authorities add foreign key (UserName) references Accounts(UserName)
go

Alter table Authorities add foreign key (RoleId) references Roles(Id)
go