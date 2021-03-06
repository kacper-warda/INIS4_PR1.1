package com.company.creatures;

import com.company.Saleable;

import java.io.File;

abstract public class Animal implements Saleable, Feedable, Comparable<Animal> {
    public final String species;
    public String name;
    protected Double weight;
    File pic;

    static final Double DEFAULT_DOG_WEIGHT = 8.0;
    static final Double DEFAULT_LION_WEIGHT = 190.0;
    static final Double DEFAULT_MOUSE_WEIGHT = 0.05;

    static final Double DEFAULT_FOOD_WEIGHT = 0.5;

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

    public void feed(Double foodWeight) {
        if (weight > 0) {
            weight += foodWeight;
            System.out.println("thx for food bro, my weight is now " + weight);
        } else {
            System.out.println("too late, sorry");
        }
    }

    public void feed() {
        feed(DEFAULT_FOOD_WEIGHT);
    }

    public void takeForAWalk() {
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
        return "Animal: " + this.species + " " + this.name;
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("slavery not work anymore!");
        } else {
            if (buyer.getCash() >= price) {
                if (seller.pet == this) {
                    buyer.pet = this;
                    seller.pet = null;
                    buyer.setCash(buyer.getCash() - price);
                    seller.setCash(seller.getCash() + price);
                } else {
                    throw new Exception("not your dog ");
                }
            } else {
                throw new Exception("not enough money man");
            }
        }
    }

    @Override
    public int compareTo(Animal o) {
        return (int) (this.weight - o.weight);
    }
}
