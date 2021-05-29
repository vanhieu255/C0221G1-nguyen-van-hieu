package model.repository;

import model.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "iphoneX", 500,"blue", "iphone"));
        products.put(2, new Product(2, "samsungA5", 600,"green", "samsung"));
        products.put(3, new Product(3, "xaome", 700,"white", "xaome"));
        products.put(4, new Product(4, "oppo", 800,"black", "oppo"));
        products.put(5, new Product(5, "nokia", 300,"yellow", "nokia"));
    }
    public List<Product> findByAll() {

        return new ArrayList<>(products.values());
    }
    public void save(Product product) {
        products.put(product.getId(), product);
    }


    public Product findById(int id) {
        return products.get(id);
    }


    public void update(int id, Product product) {
        products.put(id, product);
    }


    public void remove(int id) {
        products.remove(id);
    }

}
