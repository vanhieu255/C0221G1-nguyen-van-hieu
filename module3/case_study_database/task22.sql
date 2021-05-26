-- task 22.	Thông qua khung nhìn V_NHANVIEN thực hiện cập nhật địa chỉ thành “Liên Chiểu” 
-- đối với tất cả các Nhân viên được nhìn thấy bởi khung nhìn này.
use case_study;
update v_nhan_vien
set nhan_vien.dia_chi="lien chieu";