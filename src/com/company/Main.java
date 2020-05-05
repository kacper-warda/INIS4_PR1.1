package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Pet("dog");
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

        Human brotherInLaw = new Human();
        brotherInLaw.phone = new Phone("Nokia", "3310", 1999);

        try {
            me.getCar().sell(me, brotherInLaw, 199.0);
            brotherInLaw.phone.sell(brotherInLaw, me, 5.0);
            me.pet.sell(me, brotherInLaw, 2.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("me.car " + me.getCar());
        System.out.println("szfagierrrr.car " + brotherInLaw.getCar());
        System.out.println("me.cash " + me.getCash());
        System.out.println("nierodzina.cash " + brotherInLaw.getCash());
        System.out.println("me.phone " + me.phone);
        System.out.println("****.phone " + brotherInLaw.phone);
        System.out.println("me.pet " + me.pet);
        System.out.println("****.pet " + brotherInLaw.pet);


    }
}
