-- task12 Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết),TienDatCoc của tất cả các dịch vụ đã từng được khách hàng
-- đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.--
use case_study;
select hop_dong.id_hop_dong,khach_hang.ho_ten,khach_hang.sdt,dich_vu.ten_dich_vu,hop_dong.tien_dat_coc,hop_dong.ngay_lam_hop_dong, count(hop_dong_chi_tiet.id_hop_dong_chi_tiet)
from khach_hang 
join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
join dich_vu on dich_vu.id_dich_vu=hop_dong.id_dich_vu
join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong=hop_dong.id_hop_dong
where (year(hop_dong.ngay_lam_hop_dong) ="2019" and (month(hop_dong.ngay_lam_hop_dong) in (10,11,12)))
and  dich_vu.ten_dich_vu  not in(select dich_vu.ten_dich_vu 
from khach_hang 
join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
join dich_vu on dich_vu.id_dich_vu=hop_dong.id_dich_vu
join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong=hop_dong.id_hop_dong
where (year(hop_dong.ngay_lam_hop_dong) ="2019" and (month(hop_dong.ngay_lam_hop_dong) in (1,2,3,4,5,6))));