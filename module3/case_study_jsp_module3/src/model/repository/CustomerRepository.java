package model.repository;

import model.bean.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository {
    BaseRepository baseRepository=new BaseRepository();
    private static final String SELECT_ALL_CUSTOMER = "select * from khach_hang";
    private static final String INSERT_CUSTOMER = "INSERT INTO khach_hang" +
            "  (id_khach_hang,id_loai_khach, ho_ten,ngay_sinh,so_cmnd,sdt,email,dia_chi) VALUES " +
            " (?, ?, ?,?,?,?,?,?);";
    private static final String SELECT_CUSTOMER_BY_NAME="select * from khach_hang where ho_ten like?";
    private static final String UPDATE_CUSTOMER = "update khach_hang set id_loai_khach = ?,ho_ten= ?, ngay_sinh=?,so_cmnd= ?,sdt=?,email=?,dia_chi=? where id_khach_hang = ?;";
    private static final String SELECT_CUSTOMER_BY_ID = "select * from khach_hang where id_khach_hang =?";
    private static final String DELETE_CUSTOMER = "delete from khach_hang where id_khach_hang = ?;";

    public List<Customer> findAll() {
        List<Customer> customer = new ArrayList<>();
        try  {
            Connection connection = baseRepository.connectDataBase();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idKhachHang = rs.getInt("id_khach_hang");
                int idLoaiKhach = rs.getInt("id_loai_khach");
                String hoTen=rs.getString("ho_ten");
                String ngaySinh= rs.getString("ngay_sinh");
                String soCmnd = rs.getString("so_cmnd");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                String diaChi = rs.getString("dia_chi");
                customer.add(new Customer(idKhachHang,idLoaiKhach,hoTen,ngaySinh,soCmnd,sdt,email,diaChi));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;

    }
    public void save(Customer customer) throws SQLException {
        System.out.println(INSERT_CUSTOMER);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = baseRepository.connectDataBase(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER)) {
            preparedStatement.setInt(1, customer.getIdKhachHang());
            preparedStatement.setInt(2, customer.getIdLoaiKhach());
            preparedStatement.setString(3, customer.getHoTen());
            preparedStatement.setString(4, customer.getNgaySinh());
            preparedStatement.setString(5, customer.getSoCmnd());
            preparedStatement.setString(6, customer.getSdt());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getDiaChi());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Customer> selectCustomerByName(String name){
        List<Customer> customers = new ArrayList<>();
        Customer customer = null;
        // Step 1: Establishing a Connection
        try  {
            Connection connection = baseRepository.connectDataBase();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_NAME);
            preparedStatement.setString(1,"%"+ name +"%");
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idKhachHang=rs.getInt("id_khach_hang");
                int idLoaiKhach=rs.getInt("id_loai_khach");
                String hoTen = rs.getString("ho_ten");
                String ngaySinh = rs.getString("ngay_sinh");
                String soCmnd = rs.getString("so_cmnd");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                String diaChi = rs.getString("dia_chi");
                customer = new Customer(idKhachHang,idLoaiKhach,hoTen,ngaySinh,soCmnd,sdt,email,diaChi);
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;

    }

    public boolean updateCustomer(Customer customer) throws SQLException {
        boolean rowUpdated =false;
        try {
            Connection connection = baseRepository.connectDataBase();
            PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER);
            statement.setInt(1, customer.getIdLoaiKhach());
            statement.setString(2, customer.getHoTen());
            statement.setString(3, customer.getNgaySinh());
            statement.setString(4, customer.getSoCmnd());
            statement.setString(5, customer.getSdt());
            statement.setString(6, customer.getEmail());
            statement.setString(7, customer.getDiaChi());
            statement.setInt(8, customer.getIdKhachHang());
//            System.out.println(statement.toString());
            rowUpdated = statement.executeUpdate() > 0;
            return rowUpdated;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rowUpdated;
    }

    public Customer selectCustomer(int id) {
        Customer customer = null;
        // Step 1: Establishing a Connection
        try  {
            Connection connection = baseRepository.connectDataBase();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idKhachHang = rs.getInt("id_khach_hang");
                int idLoaiKhach = rs.getInt("id_loai_khach");
                String hoTen=rs.getString("ho_ten");
                String ngaySinh= rs.getString("ngay_sinh");
                String soCmnd = rs.getString("so_cmnd");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                String diaChi = rs.getString("dia_chi");

                customer =new Customer(idKhachHang,idLoaiKhach,hoTen,ngaySinh,soCmnd,sdt,email,diaChi);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    public boolean deleteCustomer(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = baseRepository.connectDataBase(); PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }


}
