package com.company.creatures;

public class Pet extends Animal {
    static final Double DEFAULT_FOOD_WEIGHT = 0.1;

    public Pet(String species) {
        super(species);
    }

    public void feed() {
        feed(DEFAULT_FOOD_WEIGHT);
    }
}
