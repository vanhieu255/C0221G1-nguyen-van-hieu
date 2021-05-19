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

