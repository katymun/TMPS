package lab3.domain.models.impl;

import lab3.domain.models.intf.Engine;
import lab3.domain.models.intf.Vehicle;

public class Motorcycle extends Vehicle {
    private String color;

    public Motorcycle(String color, Engine engine) {
        this.color = color;
        this.engine = engine;
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
        return new Motorcycle(color, engine);
    }
}
