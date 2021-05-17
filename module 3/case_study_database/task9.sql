-- task9 Thực hiện thống kê doanh thu theo tháng, 
-- nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
use case_study;
select khach_hang.ho_ten,dich_vu.id_dich_vu,dich_vu.ten_dich_vu,dich_vu.dien_tich,dich_vu.so_nguoi_toi_da,dich_vu.chi_phi_thue,loai_dich_vu.ten_loai_dich_vu,hop_dong.ngay_lam_hop_dong, count(dich_vu.id_dich_vu) as 'so luong khach dat phong tung thang'
from dich_vu
inner join hop_dong on dich_vu.id_dich_vu =hop_dong.id_dich_vu
inner join khach_hang on khach_hang.id_khach_hang= hop_dong.id_khach_hang
inner join loai_dich_vu on loai_dich_vu.id_loai_dich_vu = dich_vu.id_loai_dich_vu
where   year(hop_dong.ngay_lam_hop_dong)="2019" 
group by hop_dong.ngay_lam_hop_dong;