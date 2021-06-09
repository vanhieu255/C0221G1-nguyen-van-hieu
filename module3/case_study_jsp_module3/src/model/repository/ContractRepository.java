package model.repository;

import model.bean.Contract;
import model.bean.Customer;
import model.bean.Employee;
import model.bean.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractRepository {
    BaseRepository baseRepository=new BaseRepository();
    private static final String SELECT_ALL_CONTRACT = "select * from hop_dong";
    private static final String SELECT_ALL_EMPLOYEE = "select id_nhan_vien,ho_ten from nhan_vien";
    private static final String SELECT_ALL_CUSTOMER = "select id_khach_hang,ho_ten from khach_hang";
    private static final String SELECT_ALL_SERVICE = "select id_dich_vu,ten_dich_vu from dich_vu";
    private static final String INSERT_CONTRACT = "INSERT INTO hop_dong" +
            "  (id_hop_dong,id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,tong_tien) VALUES " +
            " (?, ?, ?,?,?,?,?,?);";

    public List<Contract> findAll() {
        List<Contract> contracts = new ArrayList<>();
        try  {
            Connection connection = baseRepository.connectDataBase();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CONTRACT);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idHopDong= rs.getInt("id_hop_dong");
                int idNhanVien= rs.getInt("id_nhan_vien");
                int idKhachHang= rs.getInt("id_khach_hang");
                int idDichVu= rs.getInt("id_dich_vu");
                String ngayLamHopDong=rs.getString("ngay_lam_hop_dong");
                String ngayKetThuc=rs.getString("ngay_ket_thuc");
                int tienDatCoc= rs.getInt("tien_dat_coc");
                int tongTien= rs.getInt("tong_tien");
                contracts.add(new Contract(idHopDong,idNhanVien,idKhachHang,idDichVu,ngayLamHopDong,ngayKetThuc,tienDatCoc,tongTien));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contracts;
    }
    public List<Customer> findAllCustomer() {
        List<Customer> customers=new ArrayList<>();
        try  {
            Connection connection = baseRepository.connectDataBase();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {

                int idKhachHang= rs.getInt("id_khach_hang");
                String hoTen=rs.getString("ho_ten");
                customers.add(new Customer(idKhachHang,hoTen));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public List<Employee> findAllEmployee() {
        List<Employee> employees=new ArrayList<>();
        try  {
            Connection connection = baseRepository.connectDataBase();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {

                int idNhanVien= rs.getInt("id_nhan_vien");
                String hoTen=rs.getString("ho_ten");
                employees.add(new Employee(idNhanVien,hoTen));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;

    }
    public List<Service> findAllService() {
        List<Service> services=new ArrayList<>();
        try  {
            Connection connection = baseRepository.connectDataBase();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SERVICE);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {

                int idDichVu= rs.getInt("id_dich_vu");
                String tenDichVu=rs.getString("ten_dich_vu");
                services.add(new Service(idDichVu,tenDichVu));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return services;


    }
    public void save(Contract contract) throws SQLException {
        System.out.println(INSERT_CONTRACT);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = baseRepository.connectDataBase(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CONTRACT)) {
            preparedStatement.setInt(1, contract.getIdHopDong());
            preparedStatement.setInt(2, contract.getIdNhanVien());
            preparedStatement.setInt(3, contract.getIdKhachHang());
            preparedStatement.setInt(4, contract.getIdDichVu());
            preparedStatement.setString(5,contract.getNgayLamHopDong());
            preparedStatement.setString(6,contract.getNgayKetThuc());
            preparedStatement.setInt(7, contract.getTienDatCoc());
            preparedStatement.setInt(8, contract.getTongTien());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
