create database casestudy1;
create table `casestudy1`.`nhan_vien`(
id_nhan_vien int not null,
ho_ten int ,
id_vi_tri int ,
id_trinh_do int,
id_bo_phan int,
ngay_sinh date,
so_cmnd varchar(45),
luong varchar(45),
sdt  varchar(45),
email  varchar(45),
dia_chi  varchar(45),
primary key (`id_nhan_vien`));
drop table nhanvien;

create table `casestudy1`.`vi_tri`(
id_vi_tri int not null,
ten_vi_tri varchar(45),
primary key(`id_vi_tri`));
drop table vitri;


create table `casestudy1`.`trinh_do`(
id_trinh_do int not null,
trinhdo varchar(45),
primary key(`id_trinh_do`));
drop table trinhdo;

create table `casestudy1`.`bo_phan`(
id_bo_phan int not null,
ten_bo_phan varchar(45),
primary key(`id_bo_phan`));
drop table bophan;

create table `casestudy1`.`hop_dong`(
id_hop_dong int not null,
id_nhan_vien int ,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc int ,
tong_tien int,
primary key (`id_hop_dong`));
drop table hopdong;

create table `casestudy1`.`hop_dong_chi_tiet`(
id_hop_dong_chi_tiet int not null,
id_hop_dong int,
id_dich_vu_di_kem int,
so_luong int ,
primary key(`id_hop_dong_chi_tiet`));
drop table hopdongchitiet;

create table `casestudy1`.`dich_vu_di_kem`(
id_dich_vu_di_kem int not null,
ten_dich_vu_di_kem varchar(45),
gia int,
don_vi int,
trang_thai_kha_dung varchar(45),
primary key (`id_dich_vu_di_kem`));
drop table dichvudikem;
create table `casestudy1`.`dich_vu`(
id_dich_vu int not null,
ten_dich_vu varchar(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da varchar(45),
chi_phi_thue varchar(45),
id_kieu_thue int,
id_loai_dich_vu int,
trang_thai varchar(45),
primary key (`id_dich_vu`));
drop table dich_vu;

create table `casestudy1`.`khach_hang`(
id_khach_hang int not null,
id_loai_khach int,
ho_ten varchar(45),
ngay_sinh date,
so_cmnd varchar(45),
sdt varchar(45),
email varchar(45),
dia_chi varchar(45),
primary key (`id_khach_hang`));

create table `casestudy1`.`loai_khach`(
id_loai_khach int not null,
ten_loai_khach varchar(45),
primary key(`id_loai_khach`));

create table `casestudy1`.`kieu_thue`(
id_kieu_thue int not null,
ten_kieu_thue varchar(45),
gia int,
primary key (`id_kieu_thue`));

create table `casestudy1`.`loai_dich_vu`(
id_loai_dich_vu int not null,
ten_loai_dich_vu varchar(45),
primary key (`id_loai_dich_vu`));

















