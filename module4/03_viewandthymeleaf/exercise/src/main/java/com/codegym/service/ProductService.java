package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer,Product>products;
    static {
        products=new HashMap<>();
        products.put(1,new Product(1,"Iphone1",100,"blue","Iphone"));
        products.put(2,new Product(2,"Iphone2",200,"blue","Iphone"));
        products.put(3,new Product(3,"Iphone3",300,"blue","Iphone"));
        products.put(4,new Product(4,"Iphone4",400,"blue","Iphone"));
        products.put(5,new Product(5,"Iphone5",500,"blue","Iphone"));
        products.put(6,new Product(6,"Iphone6",600,"blue","Iphone"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }
    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public List<Product> findByName(String name) {

        List<Product>productList=new ArrayList<>(products.values());
        List<Product>productSearch=new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct().toLowerCase().contains(name.toLowerCase())) {
                productSearch.add(productList.get(i));

            }
        }
            return productSearch;

    }



    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);

    }
}
