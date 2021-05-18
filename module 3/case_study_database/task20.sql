-- task 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống,
-- thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
use case_study;
select nhan_vien.id_nhan_vien,nhan_vien.ho_ten,nhan_vien.email,nhan_vien.sdt,nhan_vien.ngay_sinh,nhan_vien.dia_chi
from nhan_vien
union all
select khach_hang.id_khach_hang,khach_hang.ho_ten,khach_hang.email,khach_hang.sdt,khach_hang.ngay_sinh,khach_hang.dia_chi
from khach_hang;

