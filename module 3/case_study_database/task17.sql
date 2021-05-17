-- task 17 Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.-- 

use case_study;
select khach_hang.id_khach_hang,khach_hang.ho_ten ,hop_dong.id_hop_dong,sum(hop_dong.tong_tien)
from khach_hang
inner join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
where year(hop_dong.ngay_lam_hop_dong) ="2019"
group by id_khach_hang
having sum(hop_dong.tong_tien) >10000000;

-- mới hiển thị đc các khách hàng và tổng tiền  đặt phòng trong năm 2019 > 10trieu , còn cú pháp update chưa biết --
