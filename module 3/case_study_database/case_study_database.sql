create database case_study;
create table `case_study`.`nhan_vien`(
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
primary key (`id_nhan_vien`),
foreign key(id_vi_tri) references vi_tri(id_vi_tri),
foreign key(id_trinh_do) references trinh_do(id_trinh_do),
foreign key(id_bo_phan) references bo_phan(id_bo_phan)
);
alter table nhan_vien modify ho_ten varchar(45);
drop table nhan_vien;
select * from nhan_vien;
insert into nhan_vien
values (1,"nguyen van hung",1,1,1,"2000-1-18",123456789,6000000,"0984257141","nguyenvanhung@gmai.com","da nang"),
(2,"nguyen van khiem",1,2,1,"2000-9-19",123457689,7000000,"0894257141","nguyenvankhiem@gmai.com","da nang"),
(3,"nguyen thi thanh huyen",2,1,1,"2000-7-8",123546789,6000000,"0984357141","nguyenhuyen@gmai.com","hue"),
(4,"nguyen van tung",2,2,2,"2000-1-18",124356789,6000000,"0984257141","nguyenvanhung@gmai.com","da nang"),
(5,"nguyen van ngan",3,3,3,"2000-1-19",213456789,8000000,"0948257141","nguyenvanngan@gmai.com","quang tri "),
(6,"nguyen thi trang",1,2,2,"2000-7-18",125436789,6000000,"9084257141","nguyenvanhung@gmai.com","da nang");

select * from nhan_vien
where (ho_ten like "n%") and length(ho_ten)>15;




create table `case_study`.`vi_tri`(
id_vi_tri int not null,
ten_vi_tri varchar(45),
primary key(`id_vi_tri`));
select *
from vi_tri; 
insert into vi_tri
values (1,"le tan"),
(2,"phuc vu"),
(3,"chuyen vien");

insert into vi_tri
values (4,"giam sat"),
(5,"quan li"),
(6,"giam doc");





create table `case_study`.`trinh_do`(
id_trinh_do int not null,
trinhdo varchar(45),
primary key(`id_trinh_do`));
select * from trinh_do;
insert into trinh_do
values (1,"dai hoc"),
(2,"cao dang"),
(3,"trung cap"),
(4,"sau dai hoc");

create table `case_study`.`bo_phan`(
id_bo_phan int not null,
ten_bo_phan varchar(45),
primary key(`id_bo_phan`));
select * from bo_phan; 
insert into bo_phan
values (1,"quan li"),
(2,"hanh chinh"),
(3,"phuc vu"),
(4,"sale-marketing");




create table `case_study`.`hop_dong`(
id_hop_dong int not null,
id_nhan_vien int ,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc int ,
tong_tien int,
primary key (`id_hop_dong`),
foreign key(id_nhan_vien) references nhan_vien(id_nhan_vien),
foreign key(id_khach_hang) references khach_hang(id_khach_hang),
foreign key(id_dich_vu) references dich_vu(id_dich_vu)
);
drop table hop_dong;


create table `case_study`.`hop_dong_chi_tiet`(
id_hop_dong_chi_tiet int not null,
id_hop_dong int,
id_dich_vu_di_kem int,
so_luong int ,
primary key(`id_hop_dong_chi_tiet`),
foreign key(id_hop_dong) references hop_dong(id_hop_dong),
foreign key(id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem)
);
drop table hop_dong_chi_tiet;


create table `case_study`.`dich_vu_di_kem`(
id_dich_vu_di_kem int not null,
ten_dich_vu_di_kem varchar(45),
gia int,
don_vi int,
trang_thai_kha_dung varchar(45),
primary key (`id_dich_vu_di_kem`));

create table `case_study`.`dich_vu`(
id_dich_vu int not null,
ten_dich_vu varchar(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da varchar(45),
chi_phi_thue varchar(45),
id_kieu_thue int,
id_loai_dich_vu int,
trang_thai varchar(45),
primary key (`id_dich_vu`)
);
alter table dich_vu add foreign key(id_kieu_thue) references kieu_thue(id_kieu_thue);
alter table dich_vu add foreign key(id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu);
drop table dich_vu;


create table `case_study`.`khach_hang`(
id_khach_hang int not null,
id_loai_khach int,
ho_ten varchar(45),
ngay_sinh date,
so_cmnd varchar(45),
sdt varchar(45),
email varchar(45),
dia_chi varchar(45),
primary key (`id_khach_hang`)
);
alter table khach_hang add foreign key(id_loai_khach) references loai_khach(id_loai_khach);
select *from khach_hang;
insert into khach_hang
values (1,1,"nguyen van ba","2000-9-18","159874526","0901472583","nguyenvana@gmail.com","da nang"),
(2,2,"nguyen van hung","2000-7-18","159874256","0910472583","nguyenvanhung@gmail.com","da nang"),
(3,1,"nguyen van dien","2000-9-18","195874526","0901888583","nguyenvandien@gmail.com","quang tri"),
(4,1,"nguyen thi thanh huyen","1999-4-26","846274526","0157482583","nguyenthithanhhuyen@gmail.com","hue"),
(5,1,"huynh ba huy","1995-4-29","159887461","0245272583","huynhbahuy@gmail.com","quang tri"),
(6,3,"nguyen van cuong","1994-9-18","478154526","0082172583","nguyenvancuong@gmail.com","da nang"),
(7,1,"tran thi mai","2000-9-18","159874526","0901472583","tranthimai@gmail.com","da nang"),
(8,4,"nguyen van ti","2000-2-18","159871426","0901472583","nguyenvana@gmail.com","quang tri");

select*
from khach_hang
where dia_chi in("da nang","quang tri") and (year(CURDATE())-year(ngay_sinh))>=18 and (year(CURDATE())-year(ngay_sinh))<=50;


create table `case_study`.`loai_khach`(
id_loai_khach int not null,
ten_loai_khach varchar(45),
primary key(`id_loai_khach`));

insert into loai_khach
values (1,"Diamond"),
(2,"Platinium"),
(3,"Gold"),
(4,"Silver"),
(5,"Member");
select *
from loai_khach;


create table `case_study`.`kieu_thue`(
id_kieu_thue int not null,
ten_kieu_thue varchar(45),
gia int,
primary key (`id_kieu_thue`));

create table `case_study`.`loai_dich_vu`(
id_loai_dich_vu int not null,
ten_loai_dich_vu varchar(45),
primary key (`id_loai_dich_vu`));


















