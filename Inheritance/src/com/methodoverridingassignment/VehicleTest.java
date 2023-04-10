package com.methodoverridingassignment;

class Vehicle {
    public String accelerate(long mph) {
        return "Vehicle is accelerating to " + mph + " mph.";
    }

    public String stop() {
        return "Vehicle is stopping.";
    }

    public String run() {
        return "Vehicle is running.";
    }
}

class Car extends Vehicle {
    public String accelerate(long mph) {
        return "Car is accelerating to " + mph + " mph.";
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        System.out.println(vehicle.accelerate(10));  
        System.out.println(vehicle.stop());          
        System.out.println(vehicle.run());           

        System.out.println(car.accelerate(20));     
        System.out.println(car.stop());              
        System.out.println(car.run());               
    }
}

