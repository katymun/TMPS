package lab2.domain;

import lab2.domain.models.intf.Vehicle;

public class VehicleProxy extends Vehicle {
    private final Vehicle realVehicle;
    private final String userRole;

    public VehicleProxy(Vehicle realVehicle, String userRole) {
        super(realVehicle.getEngine());
        this.realVehicle = realVehicle;
        this.userRole = userRole;
    }

    @Override
    public void displayInfo() {
        realVehicle.displayInfo();
    }

    @Override
    public void startVehicle() {
        if (isAdmin()) {
            realVehicle.startVehicle();
        } else {
            System.out.println("Access Denied: Only admin users can start the vehicle.");
        }
    }

    @Override
    public void stopVehicle() {
        if (isAdmin()) {
            realVehicle.stopVehicle();
        } else {
            System.out.println("Access Denied: Only admin users can stop the vehicle.");
        }
    }

    private boolean isAdmin() {
        return "Admin".equalsIgnoreCase(userRole);
    }
}
