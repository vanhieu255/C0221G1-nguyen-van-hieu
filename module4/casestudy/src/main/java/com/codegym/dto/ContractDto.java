package com.codegym.dto;

import com.codegym.model.entity.contract_detail.ContractDetail;
import com.codegym.model.entity.customer.Customer;
import com.codegym.model.entity.employee.Employee;
import com.codegym.model.entity.service.Service;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class ContractDto implements Validator {
    private Integer id;
    private String contractStartDate;
    private String contractEndDate;
    @Min(1)
    private double contractDeposit;
//    @Min(1)
//    private double contractTotalMoney;
    private boolean flag = true;
    private Employee employee;
    private Customer customer;
    private Service service;
    private List<ContractDetail> contractDetails;

    public ContractDto() {
    }

    public ContractDto(Integer id, String contractStartDate, String contractEndDate, @Min(1) double contractDeposit, @Min(1) boolean flag, Employee employee, Customer customer, Service service, List<ContractDetail> contractDetails) {
        this.id = id;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractDeposit = contractDeposit;
        this.flag = flag;
        this.employee = employee;
        this.customer = customer;
        this.service = service;
        this.contractDetails = contractDetails;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(double contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

//    public double getContractTotalMoney() {
//        return contractTotalMoney;
//    }
//
//    public void setContractTotalMoney(double contractTotalMoney) {
//        this.contractTotalMoney = contractTotalMoney;
//    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(List<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Date date1 = null;
        Date date2 = null;

        ContractDto contractDto = (ContractDto) target;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date2 = simpleDateFormat.parse(contractDto.getContractEndDate());
            date1 = simpleDateFormat.parse(contractDto.getContractStartDate());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date1.after(date2)) {
            errors.rejectValue("contractEndDate", "checkCode");
        }

    }

//    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
//        Date date1 =simpleDateFormat.parse("2021-12-8");
//        Date date2 =simpleDateFormat.parse("2021-12-7");
//
//        System.out.println((date1.after(date2)));
//
//    }


}
