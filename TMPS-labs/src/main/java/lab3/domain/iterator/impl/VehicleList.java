package lab3.domain.iterator.impl;

import lab3.domain.iterator.intf.VehicleCollection;
import lab3.domain.iterator.intf.VehicleIterator;
import lab3.domain.models.intf.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleList implements VehicleCollection {
    private final List<Vehicle> vehicles;

    public VehicleList(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public VehicleList() {
        this.vehicles = new ArrayList<>();
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
    @Override
    public VehicleIterator createIterator() {
        return new VehicleListIterator(vehicles);
    }
}
