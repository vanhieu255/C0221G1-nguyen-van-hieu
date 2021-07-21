package com.codegym.dto;

import com.codegym.model.entity.customer_type.CustomerType;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerDto {
    private Integer id;
    @NotBlank(message = "customerName not null")
    @Size(min = 1,max = 50,message = "size from 0 to 50")
    @Pattern(regexp = "[a-zA-Z]{1,50}",message = "false customerName")
    private String customerName;
    @NotBlank(message = "customerBirthDay not null")
    private String customerBirthDay;
    @NotBlank(message = "customerGender not null")
    private String customerGender;
    @NotBlank(message = "customerIdCard not null")
    @Pattern(regexp = "\\d{9}|\\d{12}",message = "false customerIdCard ")
    private String customerIdCard;
    @NotBlank(message = "customerPhone not null")
    @Pattern(regexp = "(090|091)\\d{7}||(84)+(90|91)\\d{7}" ,message = "false customerPhone")
    private String customerPhone;
    @NotBlank(message = "customerEmail not null")
    @Email(message = "false Email")
    private String customerEmail;
    @NotBlank(message = "customerAddress not null")
    private String customerAddress;
    @NotBlank(message = "customerCode not null")
    @Pattern(regexp = "(KH-)\\d{4}")
    private String customerCode;
    private boolean flag=true;
    private CustomerType customerType;
    public CustomerDto() {
    }

    public CustomerDto(Integer id, @NotBlank(message = "customerName not null") @Size(min = 1, max = 50, message = "size from 0 to 50") @Pattern(regexp = "[a-zA-Z]{1,50}", message = "false customerName") String customerName, String customerBirthDay, String customerGender, String customerIdCard, String customerPhone, String customerEmail, String customerAddress, String customerCode, boolean flag, CustomerType customerType) {
        this.id = id;
        this.customerName = customerName;
        this.customerBirthDay = customerBirthDay;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerCode = customerCode;
        this.flag = flag;
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthDay() {
        return customerBirthDay;
    }

    public void setCustomerBirthDay(String customerBirthDay) {
        this.customerBirthDay = customerBirthDay;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
