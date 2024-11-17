# Topic: *Structural Design Patterns*
Author: *Munteanu Ecaterina*
------
## Objectives:
1. Study and understand the Structural Design Patterns.__

2. As a continuation of the previous laboratory work, think about the functionalities that your system will need to provide to the user.__

3. Implement some additional functionalities using structural design patterns.__

## Used Design Patterns
1. **Facade**:
   - Provides a unified interface to configure and operate vehicles.
   - Simplifies client interaction by abstracting vehicle creation and management.

2. **Proxy**:
   - Restricts access to vehicle operations based on user roles.
   - Ensures only authorized users (e.g., admins) can start or stop vehicles.

3. **Bridge**:
   - Decouples vehicle implementation from engine specifics, allowing independent extensions.

## Implementation

### 1. Facade Pattern
The `VehicleFacade` simplifies vehicle creation and operations. It allows clients to:
- Configure vehicles of various types (Car, Truck, Motorcycle).
- Start, stop, and display vehicle details without directly interacting with the subsystems.

#### Code Snippet
```java
public class VehicleFacade {
    public void configureVehicle(String type, String color, int wheels, int seats, double weight, EngineType engineType) {
        Engine engine = createEngine(engineType);

        switch (type.toLowerCase()) {
            case "car":
                vehicle = new Car(color, wheels, seats, engine);
                break;
            case "motorcycle":
                vehicle = new Motorcycle(color, engine);
                break;
            case "truck":
                vehicle = new Truck(color, wheels, seats, weight, engine);
                break;
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
        System.out.println("Configured a " + type + " with " + engineType + " engine.");
    }

    private Engine createEngine(EngineType type) {
        // Factory logic
    }
}
```

### 2. Proxy Pattern
The VehicleProxy enforces role-based access control, ensuring only admins can operate vehicles.

#### Code Snippet
```java
public class VehicleProxy extends Vehicle {
    private final Vehicle realVehicle;
    private final String userRole;

    public VehicleProxy(Vehicle realVehicle, String userRole) {
        super(realVehicle.getEngine());
        this.realVehicle = realVehicle;
        this.userRole = userRole;
    }

    @Override
    public void startVehicle() {
        if (isAdmin()) {
            realVehicle.startVehicle();
        } else {
            System.out.println("Access Denied: Only admin users can start the vehicle.");
        }
    }
}
```

### 3. Bridge Pattern
The Vehicle interface and its concrete implementations (Car, Truck, Motorcycle) are decoupled from Engine, allowing independent extension.

#### Code Snippet
```java
public abstract class Vehicle {
    private final Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public void startVehicle() {
        engine.startEngine();
    }

    public void stopVehicle() {
        engine.stopEngine();
    }

    // Some other code here
}
```

## Results


## Conclusion

  The implementation of structural design patterns improved the system by making it more flexible, easy to maintain, and user-friendly. The Facade pattern helped to simplify how vehicles are created and operated, giving the client a simple way to use the system. The Proxy pattern added security by allowing only authorized users, such as admins, to perform important actions like starting or stopping vehicles. The Bridge pattern separated vehicle types from their engine implementations, which made the system easier to expand and reduced dependencies. Overall, using these patterns showed how important they are for creating clear and well-organized code in complex systems.
