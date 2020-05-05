package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device {

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("hello, your battery is 2%");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() >= price) {
            if (seller.phone == this) {
                buyer.phone = this;
                seller.phone = null;
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                System.out.println("Transaction closed, phone " + this + " sold to " + buyer.firstName);
            } else {
                throw new Exception("cannot sell stolen phones :| ");
            }
        } else {
            throw new Exception("not enough money man");
        }
    }
}
