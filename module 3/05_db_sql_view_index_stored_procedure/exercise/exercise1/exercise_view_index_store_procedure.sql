create database product_manager;
use product_manager;
create table products(
id int not null,
product_Code varchar(45),
product_Name varchar(45),
product_Price int,
product_Amount int,
product_Description varchar(45),
product_Status bit,
unique(id),
primary key (id));

insert into products
values (1,"A00","xe may",5000000,2,"xanh",1),
(2,"B01","xe ô tô",6000000,2,"đỏ",1),
(3,"C01","xe khách",7000000,2,"cam",1),
(4,"D02","thuyền",8000000,2,"luc",1);

ALTER TABLE  products ADD INDEX uid_product(product_Code);
SELECT * FROM products WHERE product_Code ="A00";

ALTER TABLE products ADD INDEX cid_full_product( product_Name , product_Price);
select * from products where product_Name="xe máy" or product_Price =6000000;

 explain  SELECT * FROM products WHERE product_Code ="A00";
 explain  select * from products where product_Name="xe máy" or product_Price =6000000;
 
 
 








