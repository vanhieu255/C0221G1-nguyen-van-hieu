-- task11 Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng 
-- có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
use case_study;
select *
from dich_vu_di_kem
inner join hop_dong_chi_tiet on dich_vu_di_kem.id_dich_vu_di_kem=hop_dong_chi_tiet.id_dich_vu_di_kem
inner join hop_dong on hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong
inner join khach_hang on hop_dong.id_khach_hang=khach_hang.id_khach_hang
inner join loai_khach on loai_khach.id_loai_khach=khach_hang.id_loai_khach
where loai_khach.ten_loai_khach="Diamond" and (khach_hang.dia_chi in ("quang tri","da nang")); 
