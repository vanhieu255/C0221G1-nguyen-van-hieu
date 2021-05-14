-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
use quan_li_sinh_vien;
select *
from student
where student_name like "h%";

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select *
from class
where start_date like "%12%";

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select *
from `subject`
where credit>=3 and credit<=5;


-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
select*from student ;
update student
set class_id=2
where student_name="hung";
SET SQL_SAFE_UPDATES = 0;



-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select s.student_name,sub.sub_name,m.mark
from student s join mark m on s.student_id = m.student_id
 join `subject` sub  on m.sub_id=sub.sub_id
 order by m.mark desc;





