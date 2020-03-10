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
        me.pet = new Animal("lion");


        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

        me.pet = dog;
        me.pet.feed();


        System.out.println(me.pet.name);

    }
}
