-- task 6:Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu
-- của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).--
use case_study;
select dich_vu.id_dich_vu,dich_vu.ten_dich_vu,dich_vu.dien_tich,dich_vu.chi_phi_thue,hop_dong.ngay_lam_hop_dong
from dich_vu
inner join hop_dong on dich_vu.id_dich_vu =hop_dong.id_dich_vu
inner join khach_hang on khach_hang.id_khach_hang= hop_dong.id_khach_hang
inner join loai_dich_vu on loai_dich_vu.id_loai_dich_vu = dich_vu.id_loai_dich_vu
where dich_vu.id_dich_vu not in (select hop_dong.id_hop_dong 
								 from hop_dong
                                 where (year(hop_dong.ngay_lam_hop_dong)=2019) 
                                and (month(hop_dong.ngay_lam_hop_dong) in (1,2,3))) and year(ngay_lam_hop_dong)=2019 ;
                                 
-- where not(year(hop_dong.ngay_lam_hop_dong)="2019" and  (month(hop_dong.ngay_lam_hop_dong) in (1,2,3))) 
-- and not dich_vu.ten_dich_vu in (select dich_vu.ten_dich_vu
-- from dich_vu
-- inner join hop_dong on dich_vu.id_dich_vu =hop_dong.id_dich_vu
-- inner join khach_hang on khach_hang.id_khach_hang= hop_dong.id_khach_hang
-- inner join loai_dich_vu on loai_dich_vu.id_loai_dich_vu = dich_vu.id_loai_dich_vu
-- where (year(hop_dong.ngay_lam_hop_dong)="2019" and  (month(hop_dong.ngay_lam_hop_dong) in (1,2,3))))
-- and year(hop_dong.ngay_lam_hop_dong)="2019";



