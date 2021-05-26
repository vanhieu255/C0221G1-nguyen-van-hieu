-- task24 Tạo Store procedure Sp_2 Dùng để thêm mới vào bảng HopDong với yêu cầu Sp_2 phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung,
--  với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan

use case_study;
delimiter //
create procedure Sp_2 (in p_id int,p_id_nv int,p_id_kh int,p_id_dich_vu int ,p_ngay_lam_hop_dong date,p_ngay_ket_thuc date,p_tien_dat_coc int, p_tong_tien int)
begin
	if(p_id in (select hop_dong.id_hop_dong from hop_dong)) then SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT = 'nhap sai';
	elseif (p_id not in (select hop_dong.id_hop_dong from hop_dong)) then 
			insert into hop_dong
			values (p_id,p_id_nv,p_id_kh,p_id_dich_vu,p_ngay_lam_hop_dong,p_ngay_ket_thuc,p_tien_dat_coc,p_tong_tien);
    end if;
end; //
delimiter ;
select* from hop_dong;
-- chú ý khi dung dung if thì phải có end if , elseif chứ ko tách ra else if-- 



