package com.ust.GymService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "gym")
public class Gym {
    public Gym(int id, String name, int noTrainers, String location) {
        this.id = id;
        this.name = name;
        this.noTrainers = noTrainers;
        this.location = location;
    }

    @Id
    public int id;
    public String name;
    public int noTrainers;
    public String location;

    public Gym() {
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


    @Override
    public String toString() {
        return "Gym{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", noTrainers=" + noTrainers +
                ", location='" + location + '\'' +
                '}';
    }
}
