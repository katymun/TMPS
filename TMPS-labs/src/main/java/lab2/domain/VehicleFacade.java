package lab2.domain;

import lab2.domain.factory.EngineType;
import lab2.domain.factory.VehicleType;
import lab2.domain.models.impl.*;
import lab2.domain.models.impl.Motorcycle;
import lab2.domain.models.intf.Vehicle;
import lab2.domain.models.intf.Engine;
import lab2.domain.models.impl.Truck;
import lab2.domain.models.impl.PetrolEngine;
import lab2.domain.models.impl.ElectricEngine;

import static lab2.domain.factory.VehicleType.CAR;

public class VehicleFacade {
    private Vehicle vehicle;

    public void configureVehicle(VehicleType type, String color, int wheels, int seats, double weight, EngineType engineType) {
        Engine engine = createEngine(engineType);

        switch (type) {
            case CAR:
                vehicle = new Car(color, wheels, seats, engine);
                break;
            case MOTORCYCLE:
                vehicle = new Motorcycle(color, engine);
                break;
            case TRUCK:
                vehicle = new Truck(color, wheels, seats, weight, engine);
                break;
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
        System.out.println("Configured a " + type + " with " + engineType + " engine.");
    }

    public void startVehicle() {
        if (vehicle == null) {
            System.out.println("Vehicle not configured yet. Please configure it first.");
            return;
        }
        vehicle.startVehicle();
    }

    public void stopVehicle() {
        if (vehicle == null) {
            System.out.println("Vehicle not configured yet. Please configure it first.");
            return;
        }
        vehicle.stopVehicle();
    }

    public void displayVehicleInfo() {
        if (vehicle == null) {
            System.out.println("Vehicle not configured yet. Please configure it first.");
            return;
        }
        vehicle.displayInfo();
    }

    private Engine createEngine(EngineType type) {
        switch (type) {
            case PETROL:
                return new PetrolEngine();
            case ELECTRIC:
                return new ElectricEngine();
            default:
                throw new IllegalArgumentException("Unknown engine type: " + type);
        }
    }
}
