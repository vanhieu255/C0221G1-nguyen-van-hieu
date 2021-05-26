-- task 16 Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
use case_study;
SET FOREIGN_KEY_CHECKS=0;
delete from nhan_vien
where  nhan_vien.id_nhan_vien not in (
select nv.id_nhan_vien from (select distinct nhan_vien.id_nhan_vien
from nhan_vien
inner join hop_dong on nhan_vien.id_nhan_vien=hop_dong.id_nhan_vien
inner join trinh_do on trinh_do.id_trinh_do=nhan_vien.id_trinh_do
inner join bo_phan on bo_phan.id_bo_phan=nhan_vien.id_bo_phan
where year(hop_dong.ngay_lam_hop_dong) between 2017 and 2019)
as nv
);

