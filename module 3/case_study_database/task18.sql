-- task 18 Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).--
use case_study;
delete from khach_hang
where khach_hang.id_khach_hang in(
select khach_hang1.id_khach_hang from (select khach_hang.id_khach_hang
from khach_hang
inner join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
where year(hop_dong.ngay_lam_hop_dong)<"2016"
group by khach_hang.id_khach_hang) as khach_hang1);



