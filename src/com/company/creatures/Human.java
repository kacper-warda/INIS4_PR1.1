package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;
import java.util.Comparator;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private static final Integer DEFAULT_FARM_SIZE = 4;
    private Double cash = 200.0;
    private static final Integer DEFAULT_GARAGE_SIZE = 2;
    public FarmAnimal[] farm;
    private Car[] garage;

    private Double salary = 100.0;

    public Human() {

        super("homo sapiens");
        this.weight = 80.0;
        this.farm = new FarmAnimal[DEFAULT_FARM_SIZE];
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer farmSize, Integer garageSize) {

        super("homo sapiens");
        this.weight = 80.0;
        this.farm = new FarmAnimal[farmSize];
        this.garage = new Car[garageSize];
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Sorry, I'm not an idiot I will not pay for my own job");
        } else {
            System.out.println("Your salary is now: " + salary);
            this.salary = salary;
        }
    }

    public Car getCar(Integer index) {
        return garage[index];
    }

    public void setCar(Car car, Integer index) {
        this.garage[index] = car;
    }

    public Car[] getGarage() {
        return this.garage;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) throws Exception {
        if (cash >= 0) {
            this.cash = cash;
        } else {
            throw new Exception("are you kidding me?");
        }
    }

    public double valueOfCars() {
        Double sum = 0.0;
        for (Car car : garage) {
            if (car != null) {
                sum += car.value;
            }
        }
        return sum;
    }

    public void sortGarage(Comparator comparator) {
        Arrays.sort(this.garage, comparator);
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car newCar) throws Exception {
        if (this.hasFreeSpace()) {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    this.garage[i] = newCar;
                    break;
                }
            }
        } else {
            throw new Exception("not enough place");
        }
    }


}
