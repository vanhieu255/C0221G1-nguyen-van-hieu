package model.bean;

public class Product {
    private int id;
    private String productName;
    private int price;
    private String describe;
    private String producer;

    public Product() {
    }

    public Product(int id, String productName, int price, String describe, String producer) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.describe = describe;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
