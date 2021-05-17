-- task7 :Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 
-- nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
use case_study;
select dich_vu.id_dich_vu,dich_vu.ten_dich_vu,dich_vu.dien_tich,dich_vu.so_nguoi_toi_da,dich_vu.chi_phi_thue,loai_dich_vu.ten_loai_dich_vu,hop_dong.ngay_lam_hop_dong
from dich_vu
inner join hop_dong on dich_vu.id_dich_vu =hop_dong.id_dich_vu
inner join khach_hang on khach_hang.id_khach_hang= hop_dong.id_khach_hang
inner join loai_dich_vu on loai_dich_vu.id_loai_dich_vu = dich_vu.id_loai_dich_vu
where   year(hop_dong.ngay_lam_hop_dong)="2019" 
and  dich_vu.ten_dich_vu not in (select dich_vu.ten_dich_vu
from dich_vu
inner join hop_dong on dich_vu.id_dich_vu =hop_dong.id_dich_vu
inner join khach_hang on khach_hang.id_khach_hang= hop_dong.id_khach_hang
inner join loai_dich_vu on loai_dich_vu.id_loai_dich_vu = dich_vu.id_loai_dich_vu
where   year(hop_dong.ngay_lam_hop_dong)="2018");

