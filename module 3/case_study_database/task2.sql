-- task2 :2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” 
-- và có tối đa 15 ký tự.--
use case_study;
select * from nhan_vien
where (ho_ten like "h%" or "k%" or "t%") and length(ho_ten)<=15;