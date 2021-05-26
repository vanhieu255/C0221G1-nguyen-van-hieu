create database quan_li_vat_tu;
use quan_li_vat_tu;
create table phieu_xuat(
so_px int not null auto_increment primary key,
ngay_xuat date
);
drop table phieu_xuat;
create table vat_tu(
ma_vat_tu int not null auto_increment primary key,
ten_vat_tu varchar(45)
);
drop table vat_tu;
create table phieu_xuat_vat_tu(
so_px int not null,
ma_vat_tu int not null,
dg_xuat float,
sl_xuat int,
primary key (so_px,ma_vat_tu),
foreign key(so_px) references phieu_xuat(so_px),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table phieu_nhap(
so_pn int not null auto_increment primary key ,
ngay_nhap date
);
drop table phieu_nhap;

create table vat_tu_phieu_nhap(
ma_vat_tu int not null,
so_pn int not null,
dg_nhap float,
sl_nhap int,
primary key (ma_vat_tu,so_pn),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key (so_pn) references phieu_nhap(so_pn)
);
create table nhacc(
ma_ncc int not null auto_increment primary key,
ten_ncc varchar(45),
dia_chi varchar(45),
sdt varchar(10)
);
drop table nhacc;

create table don_dh(
so_dh int not null auto_increment primary key ,
ngay_dh date,
ma_ncc int not null,
foreign key (ma_ncc) references nhacc(ma_ncc)
);
create table vat_tu_don_hang(
ma_vat_tu int not null,
so_dh int not null,
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key (so_dh) references don_dh(so_dh)
);


