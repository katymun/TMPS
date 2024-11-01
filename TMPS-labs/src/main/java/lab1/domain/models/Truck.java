package lab1.domain.models;

import lab1.domain.Vehicle;

public class Truck implements Vehicle {
    private String color;
    private int wheels;
    private int seats;
    private double weight;

    public Truck(String color, int wheels, int seats, double weight) {
        this.color = color;
        this.wheels = wheels;
        this.seats = seats;
        this.weight = weight;
    }

    public Truck() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck with color: " + color + ", wheels: " + wheels + ", seats: " + seats + ", weight: " + weight);
    }

    @Override
    public Vehicle clone() {
        return new Truck(color, wheels, seats, weight);
    }
}
