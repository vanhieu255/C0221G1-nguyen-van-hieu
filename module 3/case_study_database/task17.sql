-- task 17 Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.-- 

use case_study;
SET FOREIGN_KEY_CHECKS=0;
update khach_hang
set khach_hang.id_loai_khach=1
where khach_hang.id_khach_hang in(
select khach_hang1.id_khach_hang from (select khach_hang.id_khach_hang,khach_hang.ho_ten,loai_khach.ten_loai_khach ,hop_dong.id_hop_dong,sum(hop_dong.tong_tien)
from khach_hang
inner join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
inner join loai_khach on loai_khach.id_loai_khach=khach_hang.id_loai_khach
where year(hop_dong.ngay_lam_hop_dong) ="2019"
group by id_khach_hang
having sum(hop_dong.tong_tien) >10000000 and loai_khach.ten_loai_khach <>"Diamond") as khach_hang1);



