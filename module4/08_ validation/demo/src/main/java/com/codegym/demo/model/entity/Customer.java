package com.codegym.demo.model.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Customer {
@NotBlank(message = "Name not null")
    private String name;
@NotEmpty(message = "CMND not null")
    private String cmnd;
@NotEmpty(message = "Phone not null")
    @Pattern(regexp = "\\d{10}",message = "Phone không đúng định dạng")
    private String phone;
@NotEmpty(message = "Email not null")
    @Email(message = "Email sai định dạng")
    private String email;

    public Customer() {
    }

    public Customer(@NotBlank(message = "Name not null") String name, @NotEmpty(message = "CMND not null") String cmnd, @NotEmpty(message = "Phone not null") @Pattern(regexp = "\\d{10}", message = "Phone không đúng định dạng") String phone, @NotEmpty(message = "Email not null") @Email(message = "Email sai định dạng") String email) {
        this.name = name;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
