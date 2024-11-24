package lab3.domain.models.intf;

import lab3.domain.models.intf.Engine;

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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
