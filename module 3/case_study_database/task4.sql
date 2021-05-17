-- task4 :Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.--
use case_study;
select khach_hang.id_khach_hang,khach_hang.ho_ten,hop_dong.ngay_lam_hop_dong, count(hop_dong.id_hop_dong)
from khach_hang
inner join hop_dong on khach_hang.id_khach_hang= hop_dong.id_khach_hang
inner join dich_vu on dich_vu.id_dich_vu=hop_dong.id_dich_vu
inner join loai_khach on khach_hang.id_loai_khach= loai_khach.id_loai_khach
where loai_khach.ten_loai_khach="Diamond"
group by khach_hang.id_khach_hang;