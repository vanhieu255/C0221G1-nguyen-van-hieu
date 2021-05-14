create database quan_li_ban_hang;
use quan_li_ban_hang;
create table customer(
cid int not null auto_increment primary key,
cname varchar(45) not null,
cage int
);
select *from customer;

insert into customer(cname,cage)
values ("Minh Quan",10),
("Ngoc Oanh",20),
("MHong Ha",50);



create table `order`(
oid int not null auto_increment primary key,
cid int not null,
odate date not null,
ototal_price float ,
foreign key(cid) references customer(cid)
);
select*from `order`;
insert `order`(cid,odate)
values (1,"2006-3-21"),
(2,"2006-3-23"),
(1,"2006-3-16");


create table product(
pid int not null auto_increment primary key,
pname varchar(45) not null,
pprice float
);
select *from product;
insert into product(pname,pprice)
values ("May Giat",3),
("Tu Lanh",5),
("Dieu Hoa",7),
("Quat",1),
("Bep Dien",2);

create table order_detail(
oid int not null,
pid int not null,
od_qty float,
primary key(oid,pid),
foreign key(oid) references `order`(oid),
foreign key(pid) references product(pid)
);
select *
from order_detail;
insert into order_detail(oid,pid,od_qty)
values (1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select customer.cname,product.pname
from customer
inner join `order` on customer.cid=`order`.cid
 join order_detail on `order`.oid=order_detail.oid 
 join product on order_detail.pid=product.pid;
 
 
--  Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select customer.cname
from customer
left join `order` on customer.cid=`order`.cid
where odate is null;


-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn
select `order`.oid,`order`.odate ,sum(order_detail.od_qty*product.pprice) as total 
from `order`
inner join order_detail on `order`.oid=order_detail.oid 
join product on order_detail.pid=product.pid
group by `order`.oid;










