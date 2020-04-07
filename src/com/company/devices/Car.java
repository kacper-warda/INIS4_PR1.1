package com.company.devices;

public class Car {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public final Double engineVolume;

    public String plates;
    public Double value = 1000.0;


    public Car(String producer, String model, Integer yearOfProduction, Double engineVolume) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "Car " + this.producer + " " + this.model + " " + this.plates;
    }
}
