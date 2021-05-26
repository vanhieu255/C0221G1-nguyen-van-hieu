-- task14 Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
use case_study;
select hop_dong.id_hop_dong,khach_hang.ho_ten,khach_hang.sdt,dich_vu.ten_dich_vu,hop_dong.tien_dat_coc,
hop_dong.ngay_lam_hop_dong, hop_dong_chi_tiet.id_hop_dong_chi_tiet,dich_vu_di_kem.ten_dich_vu_di_kem,count(dich_vu_di_kem.ten_dich_vu_di_kem)
from khach_hang 
join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
join dich_vu on dich_vu.id_dich_vu=hop_dong.id_dich_vu
join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong=hop_dong.id_hop_dong
join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem=hop_dong_chi_tiet.id_dich_vu_di_kem
group by dich_vu_di_kem.ten_dich_vu_di_kem
having count(dich_vu_di_kem.ten_dich_vu_di_kem)=1;