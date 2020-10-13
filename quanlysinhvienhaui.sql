create database quanlysinhvienhaui
go
use quanlysinhvienhaui
go
create table khoa
(
	makhoa char(10),
	tenkhoa nvarchar(20),
	truongkhoa nvarchar(20),
	diachikhoa nvarchar(20),
	sdtkhoa varchar(20),
	email varchar(50),
	primary key(makhoa)
)

create table lop
(
	malop char(10),
	tenlop nvarchar(20),
	makhoa char(10),
	primary key(malop),
	foreign key(makhoa) references khoa(makhoa)
)
create table monhoc
(
	mamon char(10),
	tenmon nvarchar(50),
	sotc int,
	primary key(mamon)
)
create table sinhvien
(
	masinhvien char(10),
	hoten nvarchar(50),
	ngaysinh date,
	gioitinh nvarchar(20),
	diachi nvarchar(50),
	sdtsv varchar(20),
	dantoc nvarchar(50),
	tongiao nvarchar(50),
	socmnd varchar(20),
	malop char(10),
	primary key(masinhvien),
	foreign key(malop) references lop(malop)
)
create table ketqua
(
	masinhvien char(10),
	mamon char(10),
	hocki int,
	diemtrenlop float,
	diemthi float,
	diemtongket float,
	primary key(masinhvien,mamon),
	foreign key(masinhvien) references sinhvien(masinhvien),
	foreign key(mamon) references monhoc(mamon)
)
create table taikhoan
(
	tentaikhoan varchar(20),
	matkhau varchar(20),
	masinhvien char(10),
	primary key(tentaikhoan),
	foreign key(masinhvien) references sinhvien(masinhvien)
)

insert into khoa values
('MK01',N'Khoa CNTT',N'Nguyễn An Minh',N'Tầng 4 nhà A1',0971586857,'khoacntt@gmail.com'),
('MK02',N'Khoa co khi','Nguyen Tu Minh','tang 5 nha A1',0971581257,'khoacokhi@gmail.com'),
('MK03',N'Khoa o to','Nguyen An Bai','tang 4 nha A1',0971587857,'khoaoto@gmail.com'),
('MK04',N'Khoa dien','Nguyen Van Anh','tang 8 nha A1',0971586857,'khoadien@gmail.com'),
('MK05',N'Khoa du lich','Nguyen Thi Tu','tang 6 nha A1',0984586857,'khoadilich@gmail.com')

insert into lop values
('L01',N'Lớp CNTT1','MK01'),
('L02','Lop CNTT2','MK01'),
('L03','Lop CNTT3','MK01'),
('L04','Lop CK1','MK02'),
('L06','Lop DIEN1','MK04'),
('L07','Lop DL1','MK05')
insert into monhoc values
('M01',N'Toán tin',4),
('M02','HTMML',3),
('M03','Java',4),
('M04','Phap luat',4),
('M05','Tin VP',4),
('M06','Vat Ly',5)
insert into sinhvien values
('SV01',N'Nguyễn Công Đông','1999-08-07',N'Nam',N'Thái Bình','0971586857',N'Kinh',N'Không','34125621','L01')

insert into ketqua values
('SV01','M01',2,8,8,8)
insert into taikhoan values
('Admin','123','SV01')

select * from khoa
select * from lop
select * from monhoc
select * from sinhvien
select * from ketqua
select * from taikhoan