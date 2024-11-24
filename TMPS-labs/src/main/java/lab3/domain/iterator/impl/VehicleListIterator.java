package lab3.domain.iterator.impl;

import lab3.domain.iterator.intf.VehicleIterator;
import lab3.domain.models.intf.Vehicle;

import java.util.List;

public class VehicleListIterator implements VehicleIterator {
    private final List<Vehicle> vehicles;
    private int currentPosition = 0;

    public VehicleListIterator(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public Vehicle getNext() {
        if (hasMore()) {
            return vehicles.get(++currentPosition);
        }
        return null;
    }

    @Override
    public Vehicle getPrevious() {
        if (currentPosition > 0) {
            return vehicles.get(--currentPosition);
        }
        return null;
    }

    @Override
    public int getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public Vehicle getCurrent() {
        if (currentPosition >= 0 && currentPosition < vehicles.size()) {
            return vehicles.get(currentPosition);
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        return currentPosition < vehicles.size();
    }

    @Override
    public void reset() {
    currentPosition = 0;
    }
}
