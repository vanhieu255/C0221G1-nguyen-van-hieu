package model.service;

import model.bean.Product;
import model.bean.ProductCategory;

import java.sql.SQLException;
import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product) throws SQLException;



    public boolean updateProduct(Product product) throws SQLException;
    public Product selectProduct(int id);

    public boolean deleteProduct(int id) throws SQLException;

    public  List<ProductCategory> findAllProductCategory();
}
