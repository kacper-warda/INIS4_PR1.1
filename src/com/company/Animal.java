package com.company;

import java.io.File;

public class Animal implements Edible, Saleable {
    String name;
    final String species;
    private Double weight;
    File pic;

    static final Double DEFAULT_DOG_WEIGHT = 8.0;
    static final Double DEFAULT_LION_WEIGHT = 190.0;
    static final Double DEFAULT_MOUSE_WEIGHT = 0.05;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
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

    public String toString() {
        return this.species + " " + this.name;
    }

    @Override
    public void beEaten() {
        System.out.println("adioooooos");
        this.weight = 0.0;
    }

    @Override
    public void sell() throws Exception {
        if (this instanceof Human) {
            throw new Exception("slavery not work anymore!");
        } else {
            System.out.println("you sold " + this.toString());
        }
    }
}
