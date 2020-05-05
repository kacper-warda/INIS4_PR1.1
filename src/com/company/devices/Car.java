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
        if (buyer.getCash() >= price) {
            if (seller.getCar() == this) {
                buyer.setCar(this);
                seller.setCar(null);
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                System.out.println("Transaction closed, car " + this + " sold to " + buyer.firstName);
            } else {
                throw new Exception("cannot sell stolen cars :| ");
            }
        } else {
            throw new Exception("not enough money man");
        }
    }

}
