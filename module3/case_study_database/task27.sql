-- task27.	Tạo user function thực hiện yêu cầu sau:
-- a.	Tạo user function func_1: Đếm các dịch vụ đã được sử dụng với Tổng tiền là > 2.000.000 VNĐ.

use case_study;
delimiter //
create function func_1()
returns int
deterministic
begin
return 
(select nv.so from (select count(hop_dong.id_hop_dong) as so,hop_dong.tong_tien, dich_vu.id_dich_vu,dich_vu.ten_dich_vu ,(dich_vu.chi_phi_thue +dich_vu_di_kem.gia*dich_vu_di_kem.don_vi) as tongtien
from khach_hang 
join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
join dich_vu on dich_vu.id_dich_vu=hop_dong.id_dich_vu
join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong=hop_dong.id_hop_dong
join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem=hop_dong_chi_tiet.id_dich_vu_di_kem
having tongtien > 2000000) as nv);
end ;//
delimiter ;
drop function func_1;
select func_1();


-- b.	Tạo user function Func_2: Tính khoảng thời gian dài nhất tính từ lúc bắt đầu làm hợp đồng đến lúc kết thúc hợp đồng 
-- mà Khách hàng đã thực hiện thuê dịch vụ (lưu ý chỉ xét các khoảng thời gian dựa vào từng lần làm hợp đồng thuê dịch vụ, 
-- không xét trên toàn bộ các lần làm hợp đồng).
-- Mã của Khách hàng được truyền vào như là 1 tham số của function này.

delimiter //
create function func_2(id_khach int)
returns int
deterministic
begin 
return 
(select max(datediff(hop_dong.ngay_ket_thuc,hop_dong.ngay_lam_hop_dong))
from khach_hang
inner join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
inner join dich_vu on hop_dong.id_dich_vu=dich_vu.id_dich_vu
where khach_hang.id_khach_hang = id_khach);
end ;//
delimiter ;

select func_2(1);



