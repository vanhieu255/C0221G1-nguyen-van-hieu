package model.repository;

import model.bean.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepository {
    BaseRepository baseRepository = new BaseRepository();
    private static final String SELECT_ALL_SERVICE = "select * from dich_vu";
    private static final String SELECT_ALL_SERVICE_TYPE = "select * from loai_dich_vu";
    private static final String SELECT_ALL_SERVICE_TYPE_RENT = "select * from kieu_thue";
    private static final String INSERT_SERVICE = "INSERT INTO dich_vu" +
            "  (id_dich_vu,ten_dich_vu,dien_tich,so_tang,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,tieu_chuan_phong,tien_nghi_khac,dien_tich_ho_boi) VALUES " +
            " (?, ?, ?,?,?,?,?,?,?,?,?);";

    public List<Service> findAll() {
        List<Service> services = new ArrayList<>();
        try {
            Connection connection = baseRepository.connectDataBase();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SERVICE);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idDichVu = rs.getInt("id_dich_vu");
                String tenDichVu = rs.getString("ten_dich_vu");
                int dienTich = rs.getInt("dien_tich");
                int soTang = rs.getInt("so_tang");
                String soNguoiToiDa = rs.getString("so_nguoi_toi_da");
                String chiPhiThue = rs.getString("chi_phi_thue");
                int idKieuThue = rs.getInt("id_kieu_thue");
                int idLoaiDichVu = rs.getInt("id_loai_dich_vu");
                String tieuChuanPhong = rs.getString("tieu_chuan_phong");
                String tienNghiKhac = rs.getString("tien_nghi_khac");
                double dienTichHoBoi = rs.getDouble("dien_tich_ho_boi");
                services.add(new Service(idDichVu, tenDichVu, dienTich, soTang, soNguoiToiDa, chiPhiThue, idKieuThue, idLoaiDichVu, tieuChuanPhong, tienNghiKhac, dienTichHoBoi));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return services;
    }

    public List<ServiceType> findAllServiceType() {
        List<ServiceType> serviceTypes = new ArrayList<>();
        try {
            Connection connection = baseRepository.connectDataBase();
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_SERVICE_TYPE);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int idLoaiDichVu = resultSet.getInt("id_loai_dich_vu");
                String tenLoaiDichVu = resultSet.getString("ten_loai_dich_vu");
                serviceTypes.add(new ServiceType(idLoaiDichVu, tenLoaiDichVu));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceTypes;
    }

    public List<ServiceTypeRent> findAllServiceTypeRent() {
        List<ServiceTypeRent> serviceTypeRents = new ArrayList<>();
        try {
            Connection connection = baseRepository.connectDataBase();
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_SERVICE_TYPE_RENT);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int idKieuThue = resultSet.getInt("id_kieu_thue");
                String tenKieuThue = resultSet.getString("ten_kieu_thue");
                serviceTypeRents.add(new ServiceTypeRent(idKieuThue, tenKieuThue));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceTypeRents;
    }


    public void save(Service service) throws SQLException {
        System.out.println(INSERT_SERVICE);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = baseRepository.connectDataBase(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SERVICE)) {
            preparedStatement.setInt(1, service.getIdDichVu());
            preparedStatement.setString(2, service.getTenDichVu());
            preparedStatement.setInt(3, service.getDienTich());
            preparedStatement.setInt(4, service.getSoTang());
            preparedStatement.setString(5, service.getSoNguoiToiDa());
            preparedStatement.setString(6, service.getChiPhiThue());
            preparedStatement.setInt(7, service.getIdKieuThue());
            preparedStatement.setInt(8, service.getIdLoaiDichVu());
            preparedStatement.setString(9, service.getTieuChuanPhong());
            preparedStatement.setString(10, service.getTienNghiKhac());
            preparedStatement.setDouble(11, service.getDienTichHoBoi());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


