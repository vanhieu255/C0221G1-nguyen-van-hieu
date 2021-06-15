package model.repository;

import model.bean.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    BaseRepository baseRepository=new BaseRepository();
    private static final String SELECT_ALL_EMPLOYEE = "select *from nhan_vien1";
    private static final String INSERT_EMPLOYEE = "INSERT INTO nhan_vien1" +
            "  (ten_nhan_vien,ngay_sinh) VALUES " +
            " (?, ?);";

    private static final String DELETE_EMPLOYEE = "delete from nhan_vien1 where id_nhan_vien = ?;";
    private static final String SELECT_EMPLOYEE_BY_ID = "select * from nhan_vien1 where id_nhan_vien =?";
    private static final String UPDATE_EMPLOYEE = "update nhan_vien1 set ten_nhan_vien =?,ngay_sinh=? where id_nhan_vien = ?;";


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
                int idEmployee = rs.getInt("id_nhan_vien");
                String nameEmployee = rs.getString("ten_nhan_vien");
                String date = rs.getString("ngay_sinh");

                employee.add(new Employee(idEmployee,nameEmployee,date));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;

    }
    public void save(Employee employee) throws SQLException {
        System.out.println(INSERT_EMPLOYEE);
        // try-with-resource statement will auto close the connection.
        try  {
            Connection connection = baseRepository.connectDataBase(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE);
            preparedStatement.setString(1, employee.getNameEmployee());
            preparedStatement.setString(2,  employee.getDate());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public boolean deleteEmployee(int id) throws SQLException {
        boolean rowDeleted = false;
        try  {
            Connection connection = baseRepository.connectDataBase(); PreparedStatement statement = connection.prepareStatement(DELETE_EMPLOYEE);
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
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
                int idEmployee= rs.getInt("id_nhan_vien");
                String nameEmployee=rs.getString("ten_nhan_vien");
                String date=rs.getString("ngay_sinh");
                employee=new Employee(idEmployee,nameEmployee,date);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
    public boolean updateEmployee(Employee employee) throws SQLException {
        boolean rowUpdated =false;
        try {
            Connection connection = baseRepository.connectDataBase();
            PreparedStatement statement = connection.prepareStatement(UPDATE_EMPLOYEE);

            statement.setString(1, employee.getNameEmployee());
            statement.setString(2, employee.getDate());
            statement.setInt(3, employee.getIdEmployee());
//            System.out.println(statement.toString());
            rowUpdated = statement.executeUpdate() > 0;
            return rowUpdated;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rowUpdated;

    }
}
