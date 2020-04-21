package com.company.devices;

public class Car extends Device{

    public final Double engineVolume;

    public String plates;


    public Car(String producer, String model, Integer yearOfProduction, Double engineVolume) {
        super(producer, model, yearOfProduction);
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "Car " + super.toString() + " " + this.plates;
    }

    @Override
    public void turnOn() {
        System.out.println("turn the engine on");
    }

}
