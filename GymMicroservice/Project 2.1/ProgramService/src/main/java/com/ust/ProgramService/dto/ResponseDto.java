package com.ust.ProgramService.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ResponseDto {

    public ProgramDto programDto;
    public List<CustomerDto> customerDtos;

    @Override
    public String toString() {
        return "ResponseDto{" +
                "programDto=" + programDto +
                ", customerDtos=" + customerDtos +
                '}';
    }

    public ProgramDto getProgramDto() {
        return programDto;
    }

    public void setProgramDto(ProgramDto programDto) {
        this.programDto = programDto;
    }

    public ResponseDto(ProgramDto programDto, List<CustomerDto> customerDtos) {
        this.programDto = programDto;
        this.customerDtos = customerDtos;
    }

    public ResponseDto() {
    }

    public List<CustomerDto> getCustomerDtos() {
        return customerDtos;
    }

    public void setCustomerDtos(List<CustomerDto> customerDtos) {
        this.customerDtos = customerDtos;
    }


}
