package com.codegym.dto;

import com.codegym.model.entity.rent_type.RentType;
import com.codegym.model.entity.service_type.ServiceType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ServiceDto {
    private Integer id;
    @NotBlank(message = "serviceName not null")
    @Size(min = 1,max = 50,message = "size from 0 to 50")
    @Pattern(regexp = "[a-zA-Z]{1,50}",message = "false serviceName")
    private String serviceName;
    @Min(1)
    private int serviceArea;
    @Min(1)
    private double serviceCost;
    @Min(1)
    private int serviceMaxPeople;
    @NotBlank(message = "standardRoom not null")
    private String standardRoom;
    @NotBlank(message = "descriptionOtherConvenience not null")
    private String descriptionOtherConvenience;
    @Min(1)
    private double poolArea;
    @Min(1)
    private int numberOfFloors;
    private Boolean flag=true;
    private ServiceType serviceType;
    private RentType rentType;

    public ServiceDto() {
    }

    public ServiceDto(Integer id, @NotBlank(message = "serviceName not null") @Size(min = 1, max = 50, message = "size from 0 to 50") @Pattern(regexp = "[a-zA-Z]{1,50}", message = "false serviceName") String serviceName, @Min(1) int serviceArea, @Min(1) double serviceCost, @Min(1) int serviceMaxPeople, @NotBlank(message = "standardRoom not null") String standardRoom, @NotBlank(message = "descriptionOtherConvenience not null") String descriptionOtherConvenience, @Min(1) double poolArea, @Min(1) int numberOfFloors, Boolean flag, ServiceType serviceType, RentType rentType) {
        this.id = id;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.flag = flag;
        this.serviceType = serviceType;
        this.rentType = rentType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(int serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }
}
