package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;

    private Double salary = 100.0;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary < 0){
            System.out.println("Sorry, I'm not an idiot I will not pay for my own job");
        } else{
            System.out.println("Your salary is now: " + salary);
            this.salary = salary;
        }
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(car.value <= this.salary){
            System.out.println("Great, you bought car by cash");
            this.car = car;
        } else if (car.value <= this.salary * 12){
            System.out.println("Not so great, you bought car on credit");
            this.car = car;
        }else {
            System.out.println("Sorry, find cheaper car");
        }
    }
}
