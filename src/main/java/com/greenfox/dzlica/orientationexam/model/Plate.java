package com.greenfox.dzlica.orientationexam.model;

import javax.persistence.*;

@Entity
@Table(name = "licence_plates")
public class Plate {

    @Id
    @Column(name = "PLATE", nullable = false, unique = true)
    String plate;
    String car_brand;
    String car_model;
    String color;
    int year;

    public Plate(String plate, String car_brand, String car_model, String color, int year) {
        this.plate = plate;
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.color = color;
        this.year = year;
    }

    public Plate() {
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}