package com.codegym.dto;

import com.codegym.model.entity.division.Division;
import com.codegym.model.entity.education.Education;
import com.codegym.model.entity.position.Position;

import javax.validation.constraints.*;

public class EmployeeDto {
    private Integer id;
    @NotBlank(message = "employeeName not null")
    @Size(min = 1,max = 50,message = "size from 0 to 50")
    @Pattern(regexp = "[a-zA-Z]{1,50}",message = "false employeeName")
    private String employeeName;
    @NotBlank(message = "employeeBirthDay not null")
    private String employeeBirthDay;
    @NotBlank(message = "customerIdCard not null")
    @Pattern(regexp = "\\d{9}|\\d{12}",message = "false customerIdCard ")
    private String employeeIdCard;
    @NotNull(message = "employeeSalary not null")
    @Min(0)
    private Double employeeSalary;
    @NotBlank(message = "employeePhone not null")
    @Pattern(regexp = "(090|091)\\d{7}||(84)+(90|91)\\d{7}" ,message = "false employeePhone")
    private String employeePhone;
    @NotBlank(message = "employeeEmail not null")
    @Email(message = "false Email")
    private String employeeEmail;
    @NotBlank(message = "customerAddress not null")
    private String employeeAddress;
    private Boolean flag = true;
//    @NotBlank(message = "position not null")
    private Position position;
//    @NotBlank(message = "education not null")
    private Education education;
//    @NotBlank(message = "division not null")
    private Division division;
//    @NotBlank(message = "user not null")
//    private User user;

    public EmployeeDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthDay() {
        return employeeBirthDay;
    }

    public void setEmployeeBirthDay(String employeeBirthDay) {
        this.employeeBirthDay = employeeBirthDay;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }


}
