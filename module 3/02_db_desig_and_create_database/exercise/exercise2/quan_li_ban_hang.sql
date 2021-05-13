create database quan_li_ban_hang;
use quan_li_ban_hang;
create table customer(
cid int not null auto_increment primary key,
cname varchar(45) not null,
cage int
);
create table `order`(
oid int not null auto_increment primary key,
cid int not null,
odate date not null,
ototal_price float ,
foreign key(cid) references customer(cid)
);

create table product(
pid int not null auto_increment primary key,
pname varchar(45) not null,
pprice float
);

create table order_detail(
oid int not null,
pid int not null,
od_qty float,
primary key(oid,pid),
foreign key(oid) references `order`(oid),
foreign key(pid) references product(pid)
);
