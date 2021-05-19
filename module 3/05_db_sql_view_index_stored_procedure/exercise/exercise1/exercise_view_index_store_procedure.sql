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

truncate table products;

-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
ALTER TABLE  products ADD INDEX uid_product(product_Code);
SELECT * FROM products WHERE product_Code ="A00";


-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
ALTER TABLE products ADD INDEX cid_full_product( product_Name , product_Price);
select * from products where product_Name="xe máy" or product_Price =6000000;


-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
 explain  SELECT * FROM products WHERE product_Code ="A00";
 explain  select * from products where product_Name="xe máy" or product_Price =6000000;
 
 -- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
 create view info_product 
 as
 select product_Code,product_Name,product_Price,product_Status from products;


-- hiển thị view --
 select * from info_product ;
 
 --  sửa đổi view --
 update info_product
 set product_Code ="F00"
 where product_Name ="xe máy";
 
 select * from info_product ;
 select *from products;
 -- sửa đổi view làm thay đổi luôn bảng chính --
 
 
-- xoá view --
drop view info_product;


--  Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product

delimiter //
create procedure sp_info_product()
begin 
select * from products;
end ; //
delimiter ;

call  sp_info_product();

-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure add_product(p_id int,p_code varchar(45),p_name varchar(45),p_price int,p_amount int,p_descri varchar(45),p_bit bit)
begin 
insert into products
values (p_id,p_code,p_name,p_price,p_amount,p_descri,p_bit);
end ; //
delimiter ;
call add_product(5,"FF00"," xe khach",1000000,3,"xanh va vang",1);
select * from products;


-- Tạo store procedure sửa thông tin sản phẩm theo id -- 
delimiter //
create procedure update_info_product(p_id int,p_code varchar(45),p_name varchar(45),p_price int,p_amount int,p_descri varchar(45),p_bit bit)
begin
update products
set 
	id=p_id,
    product_Code=p_code,
	product_Name=p_name,
    product_Price=p_price,
    product_Amount=p_amount,
    product_Description=p_descri,
    product_Status=p_bit
where id=p_id;
end ; //
delimiter ;
call update_info_product(5,"K00","BMW 300",8000000,3,"den",1);
select * from products;

-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure delete_product(in p_id int)
begin
delete from products
where id=p_id;
end;//
delimiter ;
call delete_product(5);
select * from products;


-- xóa stored procedure --
drop procedure if exists `delete_product`;





 
 
 
 
 
 
 
 
 
 








