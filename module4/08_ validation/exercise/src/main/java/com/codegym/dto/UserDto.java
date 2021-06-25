package com.codegym.dto;

import javax.validation.constraints.*;

public class UserDto {
    @NotBlank(message = "firstName not null")
    @Size(min=5,max=45,message = "size form 5 to 45")
    @Pattern(regexp = "[a-zA-Z]{5,45}" ,message = "flase FirstName")
    private String firstName;
    @NotBlank(message = "lastName not null")
    @Size(min=5,max=45,message = "size form 5 to 45")
    @Pattern(regexp = "[a-zA-Z]{5,45}" ,message = "flase LastName")
    private String lastName;
    @NotBlank(message = "phoneNumber not null")
    @Pattern(regexp = "\\d{10}" ,message = "false NumberPhone")
    private String phoneNumber;
    //    @NotBlank(message = "age not null")
    @Min(18)
    private int age;
    @NotBlank(message = "Email not null")
    @Email(message = "false Email")
    private String email;

    public UserDto() {
    }

    public UserDto(@NotBlank(message = "firstName not null") @Size(min = 5, max = 45, message = "size form 5 to 45") @Pattern(regexp = "[a-zA-Z]{5,45}", message = "flase FirstName") String firstName, @NotBlank(message = "lastName not null") @Size(min = 5, max = 45, message = "size form 5 to 45") @Pattern(regexp = "[a-zA-Z]{5,45}", message = "flase LastName") String lastName, @NotBlank(message = "phoneNumber not null") @Pattern(regexp = "\\d{10}", message = "false NumberPhone") String phoneNumber, @Min(18) int age, @NotBlank(message = "Email not null") @Email(message = "false Email") String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
