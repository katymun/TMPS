package lab2;

import lab2.domain.ConfigManager;

public class VehicleManufacturing {
    public static void main(String[] args) {
        ConfigManager configManager = ConfigManager.getInstance();
        System.out.println("Configuration: " + configManager.getConfiguration());

//        Vehicle basicCarPrototype = new Car("White", 4, 5, new ElectricEngine());
//        Vehicle basicMotorcyclePrototype = new Motorcycle("Black");
//        Vehicle basicTruckPrototype = new Truck("Blue", 6, 3, 10.0);



//        Vehicle customTruck = new VehicleBuilder()
//                .setVehicleType(VehicleType.TRUCK)
//                .setColor("Green")
//                .setWheels(8)
//                .setSeats(2)
//                .setWeight(20.0)
//                .build();
//        customTruck.displayInfo();
//
//        Vehicle customMotorcycle = new VehicleBuilder()
//                .setVehicleType(VehicleType.MOTORCYCLE)
//                .setColor("Red")
//                .build();
//        customMotorcycle.displayInfo();
    }
}
