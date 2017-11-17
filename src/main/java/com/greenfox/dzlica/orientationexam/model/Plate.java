package com.greenfox.dzlica.orientationexam.model;

import javax.persistence.*;

@Entity
@Table(name = "licence_plates")
public class Plate {

    @Id
    @Column(name = "PLATE", nullable = false, unique = true)
    String plate;
    @Column(name = "car_brand")
    String carBrand;
    String car_model;
    String color;
    int year;

    public Plate(String plate, String carBrand, String car_model, String color, int year) {
        this.plate = plate;
        this.carBrand = carBrand;
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

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
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
