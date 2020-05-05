package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private Car car;
    private Double cash = 200.0;

    private Double salary = 100.0;

    public Human() {
        super("homo sapiens");
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
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
}
