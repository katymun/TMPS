package lab1.domain.models;

import lab1.domain.Vehicle;

public class Motorcycle implements Vehicle {
    private String color;

    public Motorcycle(String color) {
        this.color = color;
    }

    public Motorcycle() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle with color: " + color);
    }

    @Override
    public Vehicle clone() {
        return new Motorcycle(color);
    }
}
