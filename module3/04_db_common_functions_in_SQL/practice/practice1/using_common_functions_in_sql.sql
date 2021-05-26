
-- Sử dụng hàm count để hiển thị số lượng sinh viên ở từng nơi
use quan_li_sinh_vien;
select address ,count(student_id) as 'so luong hoc vien'
from student
group by address;

-- Tính điểm trung bình các môn học của mỗi học viên bằng cách sử dụng hàm AVG
select s.student_id,s.student_name,avg(mark)
from student s join mark m on s.student_id= m.student_id
group by student_id,s.student_name;

-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15

select s.student_id,s.student_name ,avg(mark)
from student s join mark m on s.student_id=m.student_id
group by s.student_id,s.student_name
having avg(mark)>10;

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
select s.student_id,s.student_name ,avg(mark)
from student s join mark m on s.student_id=m.student_id
group by s.student_id,s.student_name
having avg(mark) >= all (select avg(mark) from mark group by mark.student_id);



