package com.methodoverridingassignment;

class Bike {
    String color;
    int speed;

    public Bike(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void bikeInfo() {
        System.out.println("Bike color: " + color);
        System.out.println("Bike speed: " + speed );
    }
}

class Pulsar extends Bike {
    int mileage;

    public Pulsar(String color, int speed, int mileage) {
        super(color, speed);
        this.mileage = mileage;
    }

    public void bikeInfo() {
        super.bikeInfo();
        System.out.println("Pulsar mileage: " + mileage );
    }
}

public class BikeTest {
    public static void main(String[] args) {
        Bike bike = new Bike("Red", 50);
        Pulsar pulsar = new Pulsar("Blue", 30, 40);

        bike.bikeInfo();     
        pulsar.bikeInfo();   
    }
}

