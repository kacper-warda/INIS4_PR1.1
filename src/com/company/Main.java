package com.company;

import com.company.devices.Car;
import com.company.devices.Device;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Akita";

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";

        me.pet = dog;
        me.pet.feed();
        me.pet.takeForAWalk();

        Car dirtyOne = new Car("Fiat", "Bravo", 2015, 1.8);
        dirtyOne.plates = "GDA1234";

        me.setCar(dirtyOne);

        Human myWife = new Human();
        myWife.setCar(dirtyOne);

        System.out.println(me.getCar());
        System.out.println(myWife.getCar());

        System.out.println(new Car("Fiat", "Bravo", 2015, 1.8));

        System.out.println(me);
        System.out.println(myWife);
        System.out.println(dirtyOne);
        System.out.println(dog);

        try {
            me.getCar().sell();
            me.pet.sell();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
