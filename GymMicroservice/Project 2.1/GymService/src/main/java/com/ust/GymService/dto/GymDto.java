package com.ust.GymService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class GymDto {
    @Override
    public String toString() {
        return "GymDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", noTrainers=" + noTrainers +
                ", location='" + location + '\'' +
                '}';
    }

    public GymDto(int id, String name, int noTrainers, String location) {
        this.id = id;
        this.name = name;
        this.noTrainers = noTrainers;
        this.location = location;
    }

    public GymDto() {
    }

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

    public int getNoTrainers() {
        return noTrainers;
    }

    public void setNoTrainers(int noTrainers) {
        this.noTrainers = noTrainers;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int id;
    public String name;
    public int noTrainers;
    public String location;
}
