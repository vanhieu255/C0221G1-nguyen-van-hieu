package model.repository;

import model.bean.Customer;
import model.bean.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepository {
    BaseRepository baseRepository=new BaseRepository();
        private static final String SELECT_ALL_CUSTOMER = "select * from dich_vu";

    public List<Service> findAll() {
        List<Service> services = new ArrayList<>();
        try  {
            Connection connection = baseRepository.connectDataBase();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idDichVu= rs.getInt("id_dich_vu");
                String tenDichVu = rs.getString("ten_dich_vu");
                int dienTich= rs.getInt("dien_tich");
                int soTang= rs.getInt("so_tang");
                int soNguoiToiDa= rs.getInt("so_nguoi_toi_da");
                String chiPhiThue= rs.getString("chi_phi_thue");
                int idKieuThue= rs.getInt("id_kieu_thue");
                int idLoaiDichVu= rs.getInt("id_loai_dich_vu");
                String trangThai= rs.getString("trang_thai");
                services.add(new Service(idDichVu,tenDichVu,dienTich,soTang,soNguoiToiDa,chiPhiThue,idKieuThue,idLoaiDichVu,trangThai));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return services;
    }

}
