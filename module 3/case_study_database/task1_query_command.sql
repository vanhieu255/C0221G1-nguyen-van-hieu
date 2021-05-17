-- task1 Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thõa mãn các yêu cầu bên dưới.-
use case_study;
select * from nhan_vien;
insert into nhan_vien
values (1,"nguyen van hung",1,1,1,"2000-1-18",123456789,6000000,"0984257141","nguyenvanhung@gmai.com","da nang"),
(2,"nguyen van khiem",1,2,1,"2000-9-19",123457689,7000000,"0894257141","nguyenvankhiem@gmai.com","da nang"),
(3,"nguyen thi thanh huyen",2,1,1,"2000-7-8",123546789,6000000,"0984357141","nguyenhuyen@gmai.com","hue"),
(4,"nguyen van tung",2,2,2,"2000-1-18",124356789,6000000,"0984257141","nguyenvanhung@gmai.com","da nang"),
(5,"nguyen van ngan",3,3,3,"2000-1-19",213456789,8000000,"0948257141","nguyenvanngan@gmai.com","quang tri "),
(6,"nguyen thi trang",1,2,2,"2000-7-18",125436789,6000000,"9084257141","nguyenvanhung@gmai.com","da nang");

select *
from vi_tri; 
insert into vi_tri
values (1,"le tan"),
(2,"phuc vu"),
(3,"chuyen vien"),
(4,"giam sat"),
(5,"quan li"),
(6,"giam doc");

select * from trinh_do;
insert into trinh_do
values (1,"dai hoc"),
(2,"cao dang"),
(3,"trung cap"),
(4,"sau dai hoc");

select * from bo_phan; 
insert into bo_phan
values (1,"quan li"),
(2,"hanh chinh"),
(3,"phuc vu"),
(4,"sale-marketing");


select *
from hop_dong;
insert into hop_dong
values (1,1,1,1,"2000-12-1","2001-12-1",1000000,15000000),
(2,1,2,2,"2001-12-1","2002-12-1",1000000,15000000),
(3,1,3,3,"2002-12-1","2003-12-1",1000000,15000000),
(4,2,1,1,"2003-12-1","2004-12-1",1000000,15000000),
(5,2,1,2,"2004-12-1","2005-12-1",1000000,15000000),
(6,2,1,1,"2019-1-1","2020-1-1",1000000,15000000),
(7,1,1,6,"2019-2-1","2020-1-1",8000000,15000000),
(8,1,1,7,"2019-3-1","2020-1-1",8000000,15000000),
(9,1,2,7,"2019-4-1","2020-1-1",8000000,15000000),
(10,1,1,8,"2019-3-1","2020-1-1",8000000,15000000),
(11,1,1,9,"2019-4-1","2020-1-1",8000000,15000000),
(12,1,1,2,"2019-4-1","2020-1-1",8000000,15000000),
(13,5,6,2,"2018-3-1","2019-12-1",1000000,15000000),
(14,6,2,2,"2018-4-1","2019-12-1",1000000,15000000),
(15,3,4,3,"2000-12-1","2001-12-1",1000000,15000000);




select *
from hop_dong_chi_tiet;
insert into hop_dong_chi_tiet
values (1,1,1,1),
(2,1,2,1),
(3,2,2,2),
(4,3,2,1),
(5,4,2,1),
(6,5,2,1),
(7,6,3,1),
(8,7,2,1),
(9,8,2,1),
(10,9,5,1),
(11,10,2,1),
(12,11,2,1),
(13,12,2,1),
(14,13,2,1),
(15,14,2,1),
(16,15,2,1);




select *
from dich_vu_di_kem;
insert into dich_vu_di_kem
values(1,"massage",200000,1,"open"),
(2,"karaoke",150000,2,"open"),
(3,"thuc an",200000,3,"open"),
(4,"nuoc uong",200000,1,"open"),
(5,"thue xe",200000,2,"open");


select *
from dich_vu;
insert into dich_vu
values (1,"thue villa",300,2,2,7000000,1,1,"open"),
(2,"thue house",300,2,2,6000000,1,3,"open"),
(3,"thue room",100,2,2,5000000,2,2,"open"),
(4,"thue villa",400,2,2,7500000,1,2,"close"),
(5,"thue house",150,2,2,5500000,1,1,"open"),
(6,"thue villa",600,3,2,10000000,2,3,"open"),
(7,"thue room",200,2,2,8000000,3,3,"open"),
(8,"thue room",200,2,2,8000000,3,4,"open"),
 (9,"thue villa",200,2,2,10000000,3,4,"open");
 
 
 select *from khach_hang;
insert into khach_hang
values (1,1,"nguyen van ba","2000-9-18","159874526","0901472583","nguyenvana@gmail.com","da nang"),
(2,2,"nguyen van hung","2000-7-18","159874256","0910472583","nguyenvanhung@gmail.com","da nang"),
(3,1,"nguyen van dien","2000-9-18","195874526","0901888583","nguyenvandien@gmail.com","quang tri"),
(4,1,"nguyen thi thanh huyen","1999-4-26","846274526","0157482583","nguyenthithanhhuyen@gmail.com","hue"),
(5,1,"huynh ba huy","1995-4-29","159887461","0245272583","huynhbahuy@gmail.com","quang tri"),
(6,3,"nguyen van cuong","1994-9-18","478154526","0082172583","nguyenvancuong@gmail.com","da nang"),
(7,1,"tran thi mai","2000-9-18","159874526","0901472583","tranthimai@gmail.com","da nang"),
(8,4,"nguyen van ti","2000-2-18","159871426","0901472583","nguyenvana@gmail.com","quang tri"),
(0,"nguyen van ky");


select *
from loai_khach;
insert into loai_khach
values (1,"Diamond"),
(2,"Platinium"),
(3,"Gold"),
(4,"Silver"),
(5,"Member");

select*
from kieu_thue;
insert into kieu_thue
values (1,"ngay",50000000),
(2,"thang",60000000),
(3,"nam",70000000);

 
 select * 
from loai_dich_vu;
insert into loai_dich_vu
values (1,"normal"),
(2,"vip"),
(3,"vvip"),
(4,"pro");