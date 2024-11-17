package lab2.domain.factory;

import lab2.domain.models.intf.Vehicle;
import lab2.domain.models.impl.Car;
import lab2.domain.models.impl.ElectricEngine;
import lab2.domain.models.impl.Motorcycle;
import lab2.domain.models.impl.Truck;

public class VehicleBuilder {
    private VehicleType vehicleType;
    private String color;
    private int wheels;
    private int seats;
    private double weight;

    public VehicleBuilder setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public VehicleBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public VehicleBuilder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public VehicleBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public VehicleBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

//    public Vehicle build() {
//        switch (vehicleType) {
//            case CAR:
//                return new Car(color, wheels, seats, new ElectricEngine());
//            case MOTORCYCLE:
//                return new Motorcycle(color);
//            case TRUCK:
//                return new Truck(color, wheels, seats, weight);
//            default:
//                throw new IllegalArgumentException("Unknown vehicle type");
//        }
//    }
}
