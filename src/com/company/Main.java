package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

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


        me.car = new Car("Fiat", "Bravo", 2015, 1.8);
        me.car.plates = "GDA1234";

        System.out.println(me.car.producer + " " + me.car.plates);

        System.out.println("I earn " + me.getSalary());

        me.setSalary(200.0);

    }
}
