package model.repository;

import model.bean.Customer;
import model.bean.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    BaseRepository baseRepository=new BaseRepository();
    private static final String SELECT_ALL_EMPLOYEE = "select id_nhan_vien,ho_ten,ten_vi_tri,trinhdo,ten_bo_phan,ngay_sinh,so_cmnd,luong,sdt,email,dia_chi\n" +
            "from nhan_vien\n" +
            "join vi_tri on nhan_vien.id_vi_tri=vi_tri.id_vi_tri\n" +
            "join trinh_do on nhan_vien.id_trinh_do=trinh_do.id_trinh_do\n" +
            "join bo_phan on nhan_vien.id_bo_phan=bo_phan.id_bo_phan;";
    private static final String INSERT_EMPLOYEE = "INSERT INTO nhan_vien" +
            "  (id_nhan_vien,ho_ten,id_vi_tri,id_trinh_do,id_bo_phan,ngay_sinh,so_cmnd,luong,sdt,email,dia_chi) VALUES " +
            " (?, ?, ?,?,?,?,?,?,?,?,?);";

    private static final String SELECT_EMPLOYEE_BY_NAME="select * from nhan_vien where ho_ten like?";
    private static final String UPDATE_EMPLOYEE = "update nhan_vien set ho_ten= ?,id_vi_tri=?,id_trinh_do=?,id_bo_phan=?, ngay_sinh=?,so_cmnd= ?,luong=?,sdt=?,email=?,dia_chi=? where id_nhan_vien = ?;";
    private static final String SELECT_EMPLOYEE_BY_ID = "select * from nhan_vien where id_nhan_vien =?";
    private static final String DELETE_EMPLOYEE = "delete from nhan_vien where id_nhan_vien = ?;";




    public List<Employee> findAll() {
        List<Employee> employee = new ArrayList<>();
        try  {
            Connection connection = baseRepository.connectDataBase();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idNhanVien = rs.getInt("id_nhan_vien");
                String hoTen = rs.getString("ho_ten");
                String tenViTri = rs.getString("ten_vi_tri");
                String tenTrinhDo = rs.getString("trinhdo");
                String tenBoPhan = rs.getString("ten_bo_phan");
                String ngaySinh=rs.getString("ngay_sinh");
                String soCmnd= rs.getString("so_cmnd");
                String luong= rs.getString("luong");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                String diaChi = rs.getString("dia_chi");
                employee.add(new Employee(idNhanVien,hoTen,tenViTri,tenTrinhDo,tenBoPhan,ngaySinh,soCmnd,luong,sdt,email,diaChi));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;

    }

    public void save(Employee employee) throws SQLException {
        System.out.println(INSERT_EMPLOYEE);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = baseRepository.connectDataBase(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE)) {
            preparedStatement.setInt(1,  employee.getIdNhanVien());
            preparedStatement.setString(2,  employee.getHoTen());
            preparedStatement.setInt(3,  employee.getIdViTri());
            preparedStatement.setInt(4,  employee.getIdTrinhDo());
            preparedStatement.setInt(5,  employee.getIdBoPhan());
            preparedStatement.setString(6,  employee.getNgaySinh());
            preparedStatement.setString(7,  employee.getSoCmnd());
            preparedStatement.setString(8,  employee.getLuong());
            preparedStatement.setString(9,  employee.getSdt());
            preparedStatement.setString(10,  employee.getEmail());
            preparedStatement.setString(11,  employee.getDiaChi());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> selectEmployeeByName(String name){
        List<Employee> employees = new ArrayList<>();
       Employee employee = null;
        // Step 1: Establishing a Connection
        try  {
            Connection connection = baseRepository.connectDataBase();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_NAME);
            preparedStatement.setString(1,"%"+ name +"%");
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idNhanVien = rs.getInt("id_nhan_vien");
                String hoTen = rs.getString("ho_ten");
                int idViTri = rs.getInt("id_vi_tri");
                int idTrinhDo = rs.getInt("id_trinh_do");
                int idBoPhan = rs.getInt("id_bo_phan");
                String ngaySinh=rs.getString("ngay_sinh");
                String soCmnd= rs.getString("so_cmnd");
                String luong= rs.getString("luong");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                String diaChi = rs.getString("dia_chi");
                employee = new Employee(idNhanVien,hoTen,idViTri,idTrinhDo,idBoPhan,ngaySinh,soCmnd,luong,sdt,email,diaChi);
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;

    }

    public boolean updateEmployee(Employee employee) throws SQLException {
        boolean rowUpdated =false;
        try {
            Connection connection = baseRepository.connectDataBase();
            PreparedStatement statement = connection.prepareStatement(UPDATE_EMPLOYEE);

            statement.setString(1, employee.getHoTen());
            statement.setInt(2, employee.getIdViTri());
            statement.setInt(3, employee.getIdTrinhDo());
            statement.setInt(4, employee.getIdBoPhan());
            statement.setString(5, employee.getNgaySinh());
            statement.setString(6, employee.getSoCmnd());
            statement.setString(7, employee.getLuong());
            statement.setString(8, employee.getSdt());
            statement.setString(9, employee.getEmail());
            statement.setString(10, employee.getDiaChi());
            statement.setInt(11, employee.getIdNhanVien());
//            System.out.println(statement.toString());
            rowUpdated = statement.executeUpdate() > 0;
            return rowUpdated;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rowUpdated;
    }

    public Employee selectEmployee(int id) {
        Employee employee = null;
        // Step 1: Establishing a Connection
        try  {
            Connection connection = baseRepository.connectDataBase();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idNhanVien= rs.getInt("id_nhan_vien");
                String hoTen=rs.getString("ho_ten");
                int idViTri = rs.getInt("id_vi_tri");
                int idTrinhDo = rs.getInt("id_trinh_do");
                int idBoPhan = rs.getInt("id_bo_phan");
                String ngaySinh= rs.getString("ngay_sinh");
                String soCmnd = rs.getString("so_cmnd");
                String luong= rs.getString("luong");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                String diaChi = rs.getString("dia_chi");

                 employee=new Employee(idNhanVien,hoTen,idViTri,idTrinhDo,idBoPhan,ngaySinh,soCmnd,luong,sdt,email,diaChi);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public boolean deleteCustomer(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = baseRepository.connectDataBase(); PreparedStatement statement = connection.prepareStatement(DELETE_EMPLOYEE);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }



}
