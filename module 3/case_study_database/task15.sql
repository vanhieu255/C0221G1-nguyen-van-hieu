-- task15 Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
use case_study;
select nhan_vien.id_nhan_vien,nhan_vien.ho_ten,trinh_do.trinhdo,bo_phan.ten_bo_phan,nhan_vien.sdt,nhan_vien.dia_chi,hop_dong.id_hop_dong,count(nhan_vien.id_nhan_vien) as'so luong hop dong kiem duoc'
from nhan_vien
inner join hop_dong on nhan_vien.id_nhan_vien=hop_dong.id_nhan_vien
inner join trinh_do on trinh_do.id_trinh_do=nhan_vien.id_trinh_do
inner join bo_phan on bo_phan.id_bo_phan=nhan_vien.id_bo_phan
group by nhan_vien.ho_ten
having count(nhan_vien.id_nhan_vien) between 1 and 3;