create database `studen-management`;
create table student(
id int NOT NULL primary key auto_increment,
`name` varchar(45) ,
`age` int null,
`country` varchar(45) null);
select *
from student;
insert into student(name,age,country)
values ("hieu1",18,"hue"),
("hieu2",18,"hue"),
("hieu3",18,"hue"),
("hieu4",18,"hue");

update `studen-management`.student
set `name`="hieu";
SET SQL_SAFE_UPDATES = 0;