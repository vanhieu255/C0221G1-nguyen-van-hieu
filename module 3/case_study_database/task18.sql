-- task 18 Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).--
use case_study;
select khach_hang.ho_ten,hop_dong.ngay_lam_hop_dong
from khach_hang
inner join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
where year(hop_dong.ngay_lam_hop_dong)<"2016"

-- chưa xóa đc -- 