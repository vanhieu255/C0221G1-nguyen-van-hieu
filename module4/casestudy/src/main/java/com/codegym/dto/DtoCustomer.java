package com.codegym.dto;

import com.codegym.model.entity.customer_type.CustomerType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class DtoCustomer {

    private String customerName;
    private String customerBirthDay;
    private String customerGender;
    private String customerIdCard;
    private String customerPhone;
    private String customerEmail;
    private String customerAddress;
    private String customerCode;
    private boolean flag=true;
    private CustomerType customerType;

    public DtoCustomer() {
    }


}
