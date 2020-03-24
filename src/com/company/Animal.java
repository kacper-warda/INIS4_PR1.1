package com.company;

import java.io.File;

public class Animal {
    String name;
    final String species;
    private Double weight;
    File pic;

    static final Double DEFAULT_DOG_WEIGHT = 8.0;
    static final Double DEFAULT_LION_WEIGHT = 190.0;
    static final Double DEFAULT_MOUSE_WEIGHT = 0.05;

    public Animal(String species) {
        this.species = species;
        if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species == "lion") {
            this.weight = DEFAULT_LION_WEIGHT;
        } else if (species == "mouse") {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        }
    }

    void feed() {
        if (weight > 0) {
            weight++;
            System.out.println("thx for food bro, my weight is now " + weight);
        } else {
            System.out.println("too late, sorry");
        }
    }

    void takeForAWalk() {
        weight--;
        if (weight <= 0) {
            System.out.println("you can not walk the town with dead animal");
        } else if (weight < 3) {
            System.out.println("thx for a walk but im hungry");
        } else {
            System.out.println("thx for a walk");
        }


    }
}
