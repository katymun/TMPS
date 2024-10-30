package lab1.client;

import lab1.domain.ConfigManager;
import lab1.domain.Vehicle;
import lab1.domain.factory.VehicleType;
import lab1.domain.models.Car;
import lab1.domain.models.Motorcycle;
import lab1.domain.models.Truck;
import lab1.domain.factory.VehicleBuilder;

public class VehicleManufacturing {
    public static void main(String[] args) {
        ConfigManager configManager = ConfigManager.getInstance();
        System.out.println("Configuration: " + configManager.getConfiguration());

        Vehicle basicCarPrototype = new Car("White", 4, 5);
        Vehicle basicMotorcyclePrototype = new Motorcycle("Black");
        Vehicle basicTruckPrototype = new Truck("Blue", 6, 3, 10.0);

        Vehicle basicCar = basicCarPrototype.clone();
        basicCar.displayInfo();
        Vehicle basicMotorcycle = basicMotorcyclePrototype.clone();
        basicMotorcycle.displayInfo();
        Vehicle basicTruck = basicTruckPrototype.clone();
        basicTruck.displayInfo();

        Vehicle customTruck = new VehicleBuilder()
                .setVehicleType(VehicleType.TRUCK)
                .setColor("Green")
                .setWheels(8)
                .setSeats(2)
                .setWeight(20.0)
                .build();
        customTruck.displayInfo();

        Vehicle customMotorcycle = new VehicleBuilder()
                .setVehicleType(VehicleType.MOTORCYCLE)
                .setColor("Red")
                .build();
        customMotorcycle.displayInfo();
    }
}
