package lab3.domain.iterator.intf;

import lab3.domain.iterator.intf.VehicleIterator;
import lab3.domain.models.intf.Vehicle;

public interface VehicleCollection {
    void addVehicle(Vehicle vehicle);
    void removeVehicle(Vehicle vehicle);
    VehicleIterator createIterator();
}
