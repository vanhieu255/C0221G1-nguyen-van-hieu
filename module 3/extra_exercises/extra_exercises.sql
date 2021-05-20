create database internship;
use internship;
create table student(
student_id int not null,
student_name varchar(40),
faculty_id int,
date_of_birth date ,
place_of_birth varchar(30),
primary key(student_id),
foreign key (faculty_id) references faculty(faculty_id)
);

create table faculty(
faculty_id int not null,
faculty_name varchar(30),
phone varchar(10),
primary key (faculty_id));

create table instructor(
 instructor_id int not null,
 instructor_name varchar(30),
 salary int,
 faculty_id int,
 primary key(instructor_id),
 foreign key ( faculty_id ) references faculty(faculty_id));
 
 create table instructor_student(
 
 student_id int not null ,
 project_id int not null,
 instructor_id int not null,
 grade int,
 primary key ( student_id,project_id, instructor_id),
 foreign key(student_id) references student(student_id),
 foreign key(project_id) references project(project_id),
 foreign key (instructor_id)references instructor(instructor_id)
);

create table project(
 project_id int not null,
 project_name varchar(30),
 expense int ,
 place_of_intern varchar(30),
 primary key (project_id));
 
 
 insert into student
 values (1,"hieu",1,"1995-10-9","hue"),
 (2,"hung",2,"1998-12-15","da nang"),
 (3,"huy",3,"1996-7-8","hue"),
 (4,"mai",4,"2000-11-9","da nang"),
 (5,"thuy",1,"1995-7-6","da nang"),
 (6,"trang",2,"1994-10-3","quang nam"),
 (7,"Le van son",3,"1993-10-3","quang nam");
  
 
 insert into faculty
 values (1,"dia ly","1534698247"),
 (2,"qltn","1534698247"),
 (3,"cong nghe sinh hoc","0984598247"),
 (4,"toan","0335986475");
 
 insert into instructor
 values (1,"chanh",5000,1),
 (2,"tien",6000,2),
 (3,"hai",7000,3),
 (4,"chien",5000,4),
 (5,"trung",8000,1),
 (6,"tam",10000,3);


 insert into instructor_student
 values (1,1,1,1),
 (1,2,2,2),
 (2,1,3,3),
 (3,3,6,1),
 (2,1,5,2);
 
 insert into project
 values (1,"du an 1",5000000,"hue"),
 (2,"du an 2",10000000,"da nang"),
 (3,"du an 3",15000000,"da nang");
 
 
--  1.	Đưa ra thông tin gồm mã số, họ tên và tên khoa của tất cả các giảng viên
select * from instructor
inner join faculty on instructor.faculty_id =faculty.faculty_id;


-- 2.	Đưa ra thông tin gồm mã số, họ tên và tên khoa của các giảng viên của khoa ‘DIA LY va QLTN’
select * from instructor
inner join faculty on instructor.faculty_id =faculty.faculty_id
where faculty.faculty_id in(1,2);
 
 
--  3.	Cho biết số sinh viên của khoa ‘CONG NGHE SINH HOC’

select count(student.student_id) from student
inner join faculty on student.faculty_id =faculty.faculty_id
where faculty.faculty_name ="cong nghe sinh hoc";

-- 4.	Đưa ra danh sách gồm mã số, họ tên và tuổi của các sinh viên khoa ‘TOAN’

select * from student
inner join faculty on student.faculty_id =faculty.faculty_id
where faculty.faculty_name ="toan";

-- 5.	Cho biết số giảng viên của khoa ‘CONG NGHE SINH HOC’

select count(instructor.instructor_id) from instructor
inner join faculty on instructor.faculty_id =faculty.faculty_id
where faculty.faculty_name="cong nghe sinh hoc";

-- 6.	Cho biết thông tin về sinh viên không tham gia thực tập
select *from student
left join instructor_student on instructor_student.student_id=student.student_id
left join project on instructor_student.project_id = project.project_id
where instructor_student.instructor_student_id is null;

-- 7.	Đưa ra mã khoa, tên khoa và số giảng viên của mỗi khoa
select faculty.faculty_id ,faculty.faculty_name, count(instructor.instructor_id) from instructor
inner join faculty on instructor.faculty_id =faculty.faculty_id
group by faculty.faculty_id;

-- 8.	Cho biết số điện thoại của khoa mà sinh viên có tên ‘Le van son’ đang theo học
select faculty.phone,faculty.faculty_name from student
inner join faculty on student.faculty_id =faculty.faculty_id
where student.student_name ="Le van son";


-- part 2 -- 

-- 1.	Cho biết mã số và tên của các đề tài do giảng viên ‘Tran son’ hướng dẫn

select project.project_id ,project.project_name from instructor
left join instructor_student on instructor_student.instructor_id=instructor.instructor_id
left join project on instructor_student.project_id = project.project_id;


drop database internship;

 
 


 
 
 



