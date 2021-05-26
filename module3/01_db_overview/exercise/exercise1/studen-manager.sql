create database `studen-management`;
create table student(
id int NOT NULL primary key auto_increment,
`name` varchar(45) ,
`age` int null
check(age>18),
`country` varchar(45) null);
select *
from student;
insert into student(name,age,country)
values ("hieu1",19,"hue"),
("hieu2",19,"hue"),
("hieu3",19,"hue"),
("hieu4",19,"hue");
drop table student;

update `studen-management`.student
set `name`="hieu";
SET SQL_SAFE_UPDATES = 0;
update student 
set `name`="pro";
delete from student 
where id=2;

insert into student(id,name,age,country)
values (2,"hieupro",19,"hue");

CREATE TABLE `studen-management`.`class` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
  create table `studen-management`.`teacher`(
  `id` int not null,
  `name` varchar(45) null,
  `age` int null,
  `country` varchar(45) null,
  primary key(`id`));