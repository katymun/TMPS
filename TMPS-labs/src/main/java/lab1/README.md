# Creational Design Patterns

## Author: Ecaterina Munteanu

----

## Objectives:

* Gain familiarity with Creational Design Patterns.
* Select a specific domain for practical implementation.
* Implement at least 3 Creational Design Patterns within the chosen domain.

## Chosen Domain: Vehicle Manufacturing
For this project, the chosen domain is vehicle manufacturing. The system models different types of vehicles, including cars, motorcycles, and trucks. Each vehicle type has specific attributes:
- **Car**: Color, wheels, seats.
- **Motorcycle**: Color.
- **Truck**: Color, wheels, seats, weight.

## Used Design Patterns
1. **Singleton** - Used to manage a single instance of a configuration manager, ensuring that the same configuration is used globally within the system.
2. **Prototype** - Allows cloning of standard vehicle configurations (basic car, motorcycle, and truck) to avoid repeated instantiation of similar objects.
3. **Builder** - Provides a flexible approach to create custom vehicles with specific configurations based on the user’s requirements.

## Implementation

To implement the project:
- **Singleton**: The `ConfigurationManager` class was implemented as a Singleton to store a single configuration setting, ensuring only one instance is accessible throughout the system.
- **Prototype**: Basic vehicle prototypes (`Car`, `Motorcycle`, and `Truck`) were defined in the main method. These prototypes can be cloned when new vehicles with similar configurations are required.
- **Builder**: The `VehicleBuilder` class was used to enable the creation of custom vehicle instances, allowing specific configurations for attributes like color, seats, wheels, and weight.

### Code Snippets

#### Singleton Example - ConfigManager
This class is pretty simple. Only one instance is created, and it is returned each time it is needed. If initially, the instance is still null, the instance will be created.
```
private static ConfigurationManager instance;
private String configuration = "Default Configuration";

private ConfigurationManager() {}

public static ConfigurationManager getInstance() {
    if (instance == null) {
        instance = new ConfigurationManager();
    }
    return instance;
}
```

#### Prototype Example - Cloneable interface
For that, I added that my Vehicle interface extends the Cloneable one so that each implementation of Vehicle will have to override the clone() method:

```
public interface Vehicle extends Cloneable {
    void displayInfo();
    Vehicle clone();
}

public class Car implements Vehicle {
    // Fields and methods

    @Override
    public Vehicle clone() {
        return new Car(color, wheels, seats);
    }
}
```

#### Builder Example - VehicleBuilder
The main method in this class is the build() method, which takes everything we have set and builds the type of vehicle according to the provided enum type:
```
public Vehicle build() {
    switch (vehicleType) {
        case CAR:
            return new Car(color, wheels, seats);
        case MOTORCYCLE:
            return new Motorcycle(color);
        case TRUCK:
            return new Truck(color, wheels, seats, weight);
        default:
            throw new IllegalArgumentException("Unknown vehicle type");
    }
}

```

## Conclusions

Through this lab, I learned and understood better 3 creational patterns:

- Singleton controls access to a single instance, which is especially useful for central configuration management.
- Prototype is efficient for creating clones of pre-defined objects, allowing us to avoid repetitive instantiation of similar objects.
- Builder is useful for creating complex objects with varying configurations.

By implementing these patterns in the context of a simple vehicle manufacturing domain, I understood better how these patterns work, and how I could use them in my future projects.
