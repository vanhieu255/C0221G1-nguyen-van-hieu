use quan_li_sinh_vien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * ,max(credit)
from `subject`;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất. 
select `subject`.sub_name,max(mark)
from `subject` join mark on mark.sub_id=`subject`.sub_id; -- tại sao lại chỉ hiện ra đc 1 môn học , có cách nào lấy ra 2 môn học ko vì có 2 môn đều =12


-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select *,avg(mark) 
from student join mark on student.student_id=mark.student_id
group by student.student_name
order by avg(mark) desc;










