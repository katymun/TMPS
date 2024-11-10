package lab2.domain.models;

import lab2.domain.Vehicle;

public class Car extends Vehicle {
    private String color;
    private int wheels;
    private int seats;

    public Car(String color, int wheels, int seats, Engine engine) {
        this.color = color;
        this.wheels = wheels;
        this.seats = seats;
        this.engine = engine;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car with color: " + color + ", wheels: " + wheels + ", seats: " + seats);
    }

    @Override
    public Vehicle clone() {
        return new Car(color, wheels, seats, engine);
    }
}
