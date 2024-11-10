package lab2.domain;

import lab2.domain.models.Engine;

public abstract class Vehicle {
    protected Engine engine;

    public Vehicle() {
    }

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public abstract void displayInfo();

    public void startVehicle() {
        engine.startEngine();
    }

    public void stopVehicle() {
        engine.stopEngine();
    }
}
