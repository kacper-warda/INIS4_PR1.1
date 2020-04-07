package com.company.devices;

public class Device {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public Double value = 1000.0;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return producer + " " + model;
    }
}
