-- task 16 Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
select nhan_vien.id_nhan_vien,nhan_vien.ho_ten,trinh_do.trinhdo,bo_phan.ten_bo_phan,nhan_vien.sdt,nhan_vien.dia_chi,hop_dong.id_hop_dong,hop_dong.ngay_lam_hop_dong
from nhan_vien
inner join hop_dong on nhan_vien.id_nhan_vien=hop_dong.id_nhan_vien
inner join trinh_do on trinh_do.id_trinh_do=nhan_vien.id_trinh_do
inner join bo_phan on bo_phan.id_bo_phan=nhan_vien.id_bo_phan
where not(year(hop_dong.ngay_lam_hop_dong) between 2017 and 2019);