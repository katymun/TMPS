package lab3.client;

import lab3.domain.factory.EngineType;
import lab3.domain.iterator.impl.VehicleList;
import lab3.domain.iterator.intf.VehicleCollection;
import lab3.domain.iterator.intf.VehicleIterator;
import lab3.domain.models.impl.Car;
import lab3.domain.models.impl.ElectricEngine;
import lab3.domain.models.impl.PetrolEngine;
import lab3.domain.models.impl.Truck;
import lab3.domain.models.intf.Engine;
import lab3.domain.models.intf.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VehicleCollection vehicleCollection = new VehicleList();

        vehicleCollection.addVehicle(new Car("red", 4, 5, new ElectricEngine()));
        vehicleCollection.addVehicle(new Car("black", 4, 5, new PetrolEngine()));
        vehicleCollection.addVehicle(new Car("grey", 4, 2, new ElectricEngine()));
        vehicleCollection.addVehicle(new Truck("red", 6, 3, 3200, new PetrolEngine()));

        VehicleIterator vehicleIterator = vehicleCollection.createIterator();

        Vehicle firstVehicle = vehicleIterator.getCurrent();
        System.out.println("First vehicle in the iterator: ");
        firstVehicle.displayInfo();

        Vehicle secondVehicle = vehicleIterator.getNext();
        System.out.println("Second vehicle in the iterator: ");
        secondVehicle.displayInfo();

        Vehicle previousVehicle = vehicleIterator.getPrevious();
        System.out.println("Previous vehicle in the iterator: ");
        previousVehicle.displayInfo();

        boolean hasMore = vehicleIterator.hasMore();
        if (hasMore) {
            System.out.println("There are more vehicles in this iterator.");
        } else {
            System.out.println("There are no more vehicles in this iterator.");
        }

    }
}
