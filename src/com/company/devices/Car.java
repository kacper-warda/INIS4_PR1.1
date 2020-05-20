package com.company.devices;

import com.company.creatures.Human;

public class Car extends Device {

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


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("don't have this car");
        }
        if (!buyer.hasFreeSpace()) {
            throw new Exception("to small garage");
        }
        if (buyer.getCash() < price) {
            throw new Exception("not enough money");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("transakcja się udała");
    }


}
