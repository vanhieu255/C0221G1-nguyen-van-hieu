-- task23 Tạo Store procedure Sp_1 Dùng để xóa thông tin của một Khách hàng nào đó 
-- với Id Khách hàng được truyền vào như là 1 tham số của Sp_1
use case_study;
delimiter //
create procedure Sp_1(p_id int)
begin
 delete from khach_hang
 where khach_hang.id_khach_hang = p_id;
 end ;//
delimiter ;
call Sp_1(6);
select * from khach_hang;