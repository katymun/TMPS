package lab0;

import lab2.domain.VehicleFacade;
import lab2.domain.VehicleProxy;
import lab2.domain.factory.EngineType;
import lab2.domain.factory.VehicleType;
import lab2.domain.models.impl.Car;
import lab2.domain.models.impl.PetrolEngine;
import lab2.domain.models.intf.Vehicle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VehicleFacade facade = new VehicleFacade();

        System.out.println("\n--- Configuring a Car ---");
        facade.configureVehicle(VehicleType.CAR, "red", 4, 5, 0, EngineType.PETROL);
        facade.displayVehicleInfo();
        facade.startVehicle();
        facade.stopVehicle();

        System.out.println("\n--- Configuring a Truck ---");
        facade.configureVehicle(VehicleType.TRUCK, "blue", 6, 2, 12000.5, EngineType.ELECTRIC);
        facade.displayVehicleInfo();
        facade.startVehicle();
        facade.stopVehicle();

        System.out.println("\n--- Using Proxy for restricted access ---");
        Vehicle car = new Car("green", 4, 5, new PetrolEngine());
        VehicleProxy adminProxy = new VehicleProxy(car, "Admin");
        VehicleProxy userProxy = new VehicleProxy(car, "User");

        System.out.println("\nAdmin tries to operate:");
        adminProxy.displayInfo();
        adminProxy.startVehicle();
        adminProxy.stopVehicle();

        System.out.println("\nUser tries to operate:");
        userProxy.displayInfo();
        userProxy.startVehicle();
        userProxy.stopVehicle();
    }
}
