-- task 19 Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.-- 
use case_study; 
select hop_dong.id_hop_dong,khach_hang.ho_ten,khach_hang.sdt,dich_vu.ten_dich_vu,hop_dong.tien_dat_coc,
hop_dong.ngay_lam_hop_dong, hop_dong_chi_tiet.id_hop_dong_chi_tiet,dich_vu_di_kem.ten_dich_vu_di_kem,count(dich_vu_di_kem.ten_dich_vu_di_kem)
from khach_hang 
join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
join dich_vu on dich_vu.id_dich_vu=hop_dong.id_dich_vu
join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong=hop_dong.id_hop_dong
join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem=hop_dong_chi_tiet.id_dich_vu_di_kem
where year(hop_dong.ngay_lam_hop_dong)="2019"
group by dich_vu_di_kem.ten_dich_vu_di_kem
having count(dich_vu_di_kem.ten_dich_vu_di_kem)>=5;
-- chỉ mới hiện thị đc số  lần đc sử dụng dich vu đi kèm trong năm 2019 >5 , chưa update dc gia dich vụ--