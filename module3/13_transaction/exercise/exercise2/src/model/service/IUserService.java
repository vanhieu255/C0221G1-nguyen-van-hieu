package model.service;

import model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public List<User> selectUserCountry(String country);
    public List<User> selectAllUsersByName();
    void addUserTransaction(User user, int[] permision);
}
