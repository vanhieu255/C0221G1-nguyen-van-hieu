-- task26. Tạo triggers có tên Tr_2 Khi cập nhật Ngày kết thúc hợp đồng, 
-- cần kiểm tra xem thời gian cập nhật có phù hợp hay không, với quy tắc sau:
--  Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày.
--  Nếu dữ liệu hợp lệ thì cho phép cập nhật, nếu dữ liệu không hợp lệ thì 
-- in ra thông báo “Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày” trên console của database
use case_study;
delimiter //
create trigger Tr_2 
after update 
on hop_dong for each row
begin
if(datediff(hop_dong.ngay_ket_thuc,hop_dong.ngay_lam_hop_dong) <2) then select "Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày" as log1 into outfile "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/log1.txt";
end if ;
end ;//
delimiter ;

