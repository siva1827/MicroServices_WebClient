package com.ust.GymService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ProgramDto {

    public int id;
    public String name;
    public int oprHrs;
    public int gymId;
    private List<CustomerDto> customerDtoList;

    public ProgramDto() {
    }

    public int getId() {
        return id;
    }

    public ProgramDto(int id, String name, int oprHrs, int gymId, List<CustomerDto> customerDtoList) {
        this.id = id;
        this.name = name;
        this.oprHrs = oprHrs;
        this.gymId = gymId;
        this.customerDtoList = customerDtoList;
    }

    @Override
    public String toString() {
        return "ProgramDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", oprHrs=" + oprHrs +
                ", gymId=" + gymId +
                ", customerDtoList=" + customerDtoList +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOprHrs() {
        return oprHrs;
    }

    public void setOprHrs(int oprHrs) {
        this.oprHrs = oprHrs;
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public List<CustomerDto> getCustomerDtoList() {
        return customerDtoList;
    }

    public void setCustomerDtoList(List<CustomerDto> customerDtoList) {
        this.customerDtoList = customerDtoList;
    }


}
