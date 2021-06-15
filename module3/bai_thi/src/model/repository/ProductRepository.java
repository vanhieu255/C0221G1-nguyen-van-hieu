package model.repository;

import model.bean.Product;
import model.bean.ProductCategory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    BaseRepository baseRepository=new BaseRepository();
    private static final String SELECT_ALL_PRODUCT = "select * from san_pham1";

    private final String SELECT_ALL_PRODUCT_CATEGORY = "select * from danh_muc";

    private static final String INSERT_PRODUCT = "INSERT INTO san_pham1" +
            "  (ten_san_pham,gia,so_luong,mau_sac,mo_ta,id_danh_muc) VALUES " +
            " ( ?, ?,?,?,?,?);";

    private static final String UPDATE_PRODUCT= "update san_pham1 set ten_san_pham =?,gia= ?,so_luong=?,mau_sac=?,mo_ta= ?,id_danh_muc=? where id_san_pham = ?;";
    private static final String SELECT_PRODUCT_BY_ID = "select * from san_pham1  where id_san_pham =?";
    private static final String DELETE_PRODUCT = "delete from san_pham1 where id_san_pham = ?;";

    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try  {
            Connection connection = baseRepository.connectDataBase();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idProduct = rs.getInt("id_san_pham");
                String nameProduct = rs.getString("ten_san_pham");
                int price = rs.getInt("gia");
                int quantity = rs.getInt("so_luong");
                String color=rs.getString("mau_sac");
                String describe=rs.getString("mo_ta");
                int idCategory=rs.getInt("id_danh_muc");
                products.add(new Product(idProduct,nameProduct,price,quantity,color,describe,idCategory));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;

    }
    public void save(Product product) throws SQLException {
        System.out.println(INSERT_PRODUCT);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = baseRepository.connectDataBase(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT)) {
            preparedStatement.setString(1, product.getNameProduct());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getDescribe());
            preparedStatement.setInt(6, product.getIdCategory());

            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public boolean updateProduct(Product product) throws SQLException {
        boolean rowUpdated =false;
        try {
            Connection connection = baseRepository.connectDataBase();
            PreparedStatement statement = connection.prepareStatement(UPDATE_PRODUCT);
            statement.setString(1, product.getNameProduct());
            statement.setInt(2, product.getPrice());
            statement.setInt(3, product.getQuantity());
            statement.setString(4,product.getColor());
            statement.setString(5, product.getDescribe());
            statement.setInt(6,product.getIdCategory());
            statement.setInt(7, product.getIdProduct());
//            System.out.println(statement.toString());
            rowUpdated = statement.executeUpdate() > 0;
            return rowUpdated;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rowUpdated;
    }

    public Product selectProduct(int id) {
        Product product = null;
//         Step 1: Establishing a Connection
        try  {
            Connection connection = baseRepository.connectDataBase();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idProduct = rs.getInt("id_san_pham");
                String nameProduct = rs.getString("ten_san_pham");
                int price = rs.getInt("gia");
                int quantity = rs.getInt("so_luong");
                String color=rs.getString("mau_sac");
                String describe=rs.getString("mo_ta");
                int idCategory=rs.getInt("id_danh_muc");

                product =new Product(idProduct,nameProduct,price,quantity,color,describe,idCategory);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    public boolean deleteProduct(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = baseRepository.connectDataBase(); PreparedStatement statement = connection.prepareStatement(DELETE_PRODUCT);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    public List<ProductCategory>  findAllProductCategory() {
        List<ProductCategory> productCategories = new ArrayList<>();
        try {
            Connection connection = baseRepository.connectDataBase();
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_PRODUCT_CATEGORY);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int idCategory = resultSet.getInt("id_danh_muc");
                String nameCategory = resultSet.getString("ten_danh_muc");
                productCategories.add(new ProductCategory(idCategory,nameCategory));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productCategories;
    }

}
