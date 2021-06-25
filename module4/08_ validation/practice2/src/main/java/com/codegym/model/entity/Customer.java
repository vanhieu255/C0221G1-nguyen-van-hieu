package com.codegym.model.entity;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
@Component
public class Customer implements Validator {
//    @NotEmpty(message = "Phone not null")
//    @Length(min=10,max=11, message = "length form 10 to 11")
//    @Pattern(regexp = "(0)[0-9]{9,10}", message = "Phone start with 0")
    private String phone;

    public Customer() {
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer=(Customer) target;
        if(customer.getPhone().isEmpty()){
            errors.rejectValue("phone","phone.empty");
        }
        if(customer.getPhone().length()>11||customer.getPhone().length()<10){
            errors.rejectValue("phone","phone.length");
        }
        if (!customer.getPhone().startsWith("0")){
            errors.rejectValue("phone", "phone.startsWith");
        }
        if (!customer.getPhone().matches("(^$|[0-9]*$)")){
            errors.rejectValue("phone", "phone.matches");
        }


    }
}
