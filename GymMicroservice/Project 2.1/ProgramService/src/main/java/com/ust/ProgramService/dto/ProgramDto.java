package com.ust.ProgramService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ProgramDto {

    public int id;
    public String name;
    public int oprHrs;
    public int gymId;

    public int getId() {
        return id;
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

    public ProgramDto() {
    }

    public ProgramDto(int id, String name, int oprHrs, int gymId) {
        this.id = id;
        this.name = name;
        this.oprHrs = oprHrs;
        this.gymId = gymId;
    }

    public void setOprHrs(int oprHrs) {
        this.oprHrs = oprHrs;
    }

    @Override
    public String toString() {
        return "ProgramDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", oprHrs=" + oprHrs +
                ", gymId=" + gymId +
                '}';
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }


}
