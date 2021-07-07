package com.codegym.model.entity.customer_type;

import com.codegym.model.entity.customer.Customer;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String customerTypeName;

    @OneToMany(mappedBy ="customerType" )
    private List<Customer> customers;


    public CustomerType() {
    }

    public CustomerType(Integer id, String customerTypeName) {
        this.id = id;
        this.customerTypeName = customerTypeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }
}
