-- task 21 Tạo khung nhìn có tên là V_NHANVIEN để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” 
-- và đã từng lập hợp đồng cho 1 hoặc nhiều Khách hàng bất kỳ  với ngày lập hợp đồng là “12/12/2019”
use case_study;
create view v_nhan_vien
as
(select nhan_vien.id_nhan_vien,nhan_vien.ho_ten,nhan_vien.ngay_sinh,nhan_vien.sdt,nhan_vien.email,nhan_vien.dia_chi,hop_dong.ngay_lam_hop_dong,count(hop_dong.ngay_lam_hop_dong) as "so luong hop dong"
from nhan_vien
inner join hop_dong on nhan_vien.id_nhan_vien=hop_dong.id_nhan_vien
group by nhan_vien.id_nhan_vien
having  hop_dong.ngay_lam_hop_dong="2000-12-1" and count(hop_dong.ngay_lam_hop_dong)>=1 and nhan_vien.dia_chi="da nang");

