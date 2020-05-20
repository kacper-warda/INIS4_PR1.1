package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable, Comparable<Device> {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public Double value = 1000.0;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return producer + " " + model;
    }

    public abstract void turnOn();

    @Override
    public int compareTo(Device o) {
        if (this == null) {
            return 1;
        } else if (o == null) {
            return -1;
        }
        return Integer.compare(this.yearOfProduction, o.yearOfProduction);
    }
}
