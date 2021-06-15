package model.service;


import model.bean.Product;
import model.bean.ProductCategory;
import model.repository.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    ProductRepository productRepository= new ProductRepository();


    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<ProductCategory> findAllProductCategory() {
        return productRepository.findAllProductCategory();
    }


    @Override
    public void save(Product product) throws SQLException {
        productRepository.save(product);
    }

    @Override
    public boolean updateProduct(Product product) throws SQLException {
        return productRepository.updateProduct(product);
    }

    @Override
    public Product selectProduct(int id) {
        return productRepository.selectProduct(id);
    }

    @Override
    public boolean deleteProduct(int id) throws SQLException {
        return productRepository.deleteProduct(id);
    }


}
