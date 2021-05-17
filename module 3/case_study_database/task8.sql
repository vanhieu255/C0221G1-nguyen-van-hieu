-- task8Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
use case_study;
select *
from khach_hang
group by khach_hang.ho_ten;

select DISTINCT *
from khach_hang;

select khach_hang.ho_ten
from khach_hang
union
select khach_hang.ho_ten
from khach_hang;