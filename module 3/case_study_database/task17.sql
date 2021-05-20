-- task 17 Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.-- 

use case_study;
SET FOREIGN_KEY_CHECKS=0;
update khach_hang
set khach_hang.id_loai_khach=1
where khach_hang.id_khach_hang in(
select khach_hang1.id_khach_hang from (select khach_hang.id_khach_hang,khach_hang.ho_ten,loai_khach.ten_loai_khach ,hop_dong.id_hop_dong,sum(dich_vu.chi_phi_thue +dich_vu_di_kem.gia*dich_vu_di_kem.don_vi) as tongtien
from khach_hang
join loai_khach on khach_hang.id_loai_khach=loai_khach.id_loai_khach
join hop_dong on hop_dong.id_khach_hang=khach_hang.id_khach_hang
join dich_vu on dich_vu.id_dich_vu=hop_dong.id_dich_vu
join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong=hop_dong.id_hop_dong
join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem=hop_dong_chi_tiet.id_dich_vu_di_kem
where year(hop_dong.ngay_lam_hop_dong) ="2019"
group by id_khach_hang
having tongtien >10000000 and loai_khach.ten_loai_khach ="Platinium") as khach_hang1);


