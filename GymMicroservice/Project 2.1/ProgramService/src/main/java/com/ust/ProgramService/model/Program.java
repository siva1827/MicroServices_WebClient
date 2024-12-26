package com.ust.ProgramService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "program")
public class Program {

    @Id
    public int id;
    public String name;
    public int oprHrs;
    public int gymId;

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

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



}
