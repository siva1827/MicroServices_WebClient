package com.ust.ProgramService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class CustomerDto {

    public  int custId;
    public String name;

    @Override
    public String toString() {
        return "CustomerDto{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", gender='" + gender + '\'' +
                ", membershipId=" + membershipId +
                '}';
    }

    public int phone;
    public  String gender;

    public CustomerDto() {
    }

    public int membershipId;

    public CustomerDto(int custId, String name, int phone, String gender, int membershipId) {
        this.custId = custId;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.membershipId = membershipId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }


}
