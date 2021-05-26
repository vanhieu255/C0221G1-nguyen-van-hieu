create database quan_li_sinh_vien;
use quan_li_sinh_vien;
create table class(
class_id int not null auto_increment primary key,
class_name varchar(60) not null ,
start_date datetime not null,
`status` bit
);

insert into class(class_name,start_date,`status`)
values ("A1","2008-12-20",1),
("A2","2008-12-22",1),
("B3",current_date,0);

select *
from class;

create table student(
student_id int not null auto_increment primary key,
student_name varchar(30) not null,
address varchar(50),
phone varchar(20),
`status` bit,
class_id int not null,
foreign key(class_id) references class(class_id)
);
insert into student(student_name,address,phone,`status`,class_id)
values ("hung","ha noi","0912113113",1,1),
("hoa","hai phong","",1,1),
("manh","hcm","0123123123",0,2);
select *from student;

create table `subject`(
sub_id int not null auto_increment primary key,
sub_name varchar(30) not null,
credit tinyint not null default 1 check(credit>=1),
`status` bit default 1
);
insert into `subject`(sub_name,credit,`status`)
values ("cf",5,1),
("c",6,1),
("hdj",5,1),
("rdbms",10,1);
select * from `subject`;

create table mark(
mark_id int not null auto_increment primary key,
sub_id int not null ,
student_id int not null,
mark float default 0 check(mark between 0 and 100),
exame_times tinyint default 1,
unique(sub_id,student_id),
foreign key(sub_id) references `subject`(sub_id),
foreign key(student_id) references student(student_id)
);
insert into mark(sub_id,student_id,mark,exame_times)
values (1,1,8,1),
(1,2,10,2),
(2,1,12,1);
select *from mark;


 
	


