package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Pet("dog");
        dog.name = "Akita";

        Human me = new Human(3, 4);
        me.firstName = "Kacper";
        me.lastName = "Warda";

        me.pet = dog;
        me.pet.feed();
        me.pet.takeForAWalk();

        Car dirtyOne = new Car("Fiat", "Bravo", 2015, 1.8);
        dirtyOne.plates = "GDA1234";
        dirtyOne.value = 12000.0;

        me.setCar(dirtyOne, 0);

        me.setCar(new Car("Alfa Romeo", "Julia", 2020, 2.4), 1);
        me.getCar(1).value = 150000.0;
        me.setCar(new Car("Ferrari", "FF", 2018, 5.0), 2);
        me.getCar(2).value = 1300000.0;

        Human myWife = new Human();
        myWife.setCar(dirtyOne, 0);

        System.out.println(me.getCar(0));
        System.out.println(myWife.getCar(0));

        System.out.println(new Car("Fiat", "Bravo", 2015, 1.8));

        System.out.println(me);
        System.out.println(myWife);
        System.out.println(dirtyOne);
        System.out.println(dog);

        Human brotherInLaw = new Human();
        brotherInLaw.phone = new Phone("Nokia", "3310", 1999);

        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(Arrays.toString(brotherInLaw.getGarage()));

        try {
            dirtyOne.sell(me, brotherInLaw, 199.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(Arrays.toString(brotherInLaw.getGarage()));
    }
}
