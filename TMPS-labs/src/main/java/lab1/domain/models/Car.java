package lab1.domain.models;

import lab1.domain.Vehicle;

public class Car implements Vehicle {
    private String color;
    private int wheels;
    private int seats;

    public Car(String color, int wheels, int seats) {
        this.color = color;
        this.wheels = wheels;
        this.seats = seats;
    }

    public Car() {}

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
        return new Car(color, wheels, seats);
    }
}
