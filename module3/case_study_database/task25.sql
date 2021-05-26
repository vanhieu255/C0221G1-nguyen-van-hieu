-- task25 Tạo triggers có tên Tr_1 Xóa bản ghi trong bảng HopDong thì hiển thị
-- tổng số lượng bản ghi còn lại có trong bảng HopDong ra giao diện console của database
use case_study;
delimiter //
create trigger Tr_1
after delete
on hop_dong for each row
begin 
select(select count(*) from hop_dong) as log into outfile "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/log.txt";
end; //
delimiter ;






