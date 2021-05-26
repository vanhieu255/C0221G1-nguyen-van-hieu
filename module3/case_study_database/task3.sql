-- task3 :Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”. --
use case_study;
select*
from khach_hang
where dia_chi in("da nang","quang tri") and (year(CURDATE())-year(ngay_sinh))>=18 and (year(CURDATE())-year(ngay_sinh))<=50;