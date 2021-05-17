use quan_li_sinh_vien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * ,max(credit)
from `subject`;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất. 
select `subject`.sub_name
from `subject` join mark on mark.sub_id=`subject`.sub_id
where mark.mark=(select max(mark) from mark);
-- cách 2 : where mark.mark >= all(select mark.mark from mark); 



-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select *,avg(mark) 
from student join mark on student.student_id=mark.student_id
group by student.student_name
order by avg(mark) desc;










