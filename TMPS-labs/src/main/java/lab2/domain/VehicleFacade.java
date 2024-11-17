package lab2.domain;

import lab2.domain.factory.EngineType;
import lab2.domain.models.impl.*;
import lab2.domain.models.impl.Motorcycle;
import lab2.domain.models.intf.Vehicle;
import lab2.domain.models.intf.Engine;
import lab2.domain.models.impl.Truck;
import lab2.domain.models.impl.PetrolEngine;
import lab2.domain.models.impl.ElectricEngine;

public class VehicleFacade {
    public Vehicle createCar(String color, int wheels, int seats, EngineType engineType) {
        Engine engine = createEngine(engineType);
        return new Car(color, wheels, seats, engine);
    }

    public Vehicle createMotorcycle(String color, EngineType engineType) {
        Engine engine = createEngine(engineType);
        return new Motorcycle(color, engine);
    }

    public Vehicle createTruck(String color, int wheels, int seats, double weight, EngineType engineType) {
        Engine engine = createEngine(engineType);
        return new Truck(color, wheels, seats, weight, engine);
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
