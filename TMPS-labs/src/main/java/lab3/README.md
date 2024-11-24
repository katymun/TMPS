# Topic: *Design Patterns*
Author: *Munteanu Ecaterina*
------
## Objectives:
1. Study and understand the Behavioral Design Patterns.

2. As a continuation of the previous laboratory work, think about what communication between software entities might be involed in your system.

3. Implement some additional functionalities using behavioral design patterns.

## Used Design Pattern
**Iterator**:
   - Lets you traverse elements of a collection without exposing its underlying representation.
   - Encapsulates all of the traversal details, such as the current position and how many elements are left till the end.
     
## Implementation

### Iterator Pattern
The Iterator pattern was used to traverse the VehicleList collection. This pattern ensures clean and reusable traversal logic.
```java
public interface VehicleIterator {
    Vehicle getNext();
    Vehicle getPrevious();
    int getCurrentPosition();
    Vehicle getCurrent();
    boolean hasMore();
}
```
This interface has the main methods that an iterator needs to work properly.
Now, the next step is to implement it:
```
public class VehicleListIterator implements VehicleIterator {
    private final List<Vehicle> vehicles;
    private int currentPosition = 0;

    @Override
    public Vehicle getNext() {
        if (hasMore()) {
            return vehicles.get(currentPosition++);
        }
        return null;
    }

    // Other methods and constructors
}
```
Now, let's create an interface for our vehicle collection, which will have a method for returning the iterator:
```
public interface VehicleCollection {
    void addVehicle(Vehicle vehicle);
    void removeVehicle(Vehicle vehicle);
    VehicleIterator createIterator();
}
```
It also has the key methods, like addVehicle() and removeVehicle(), for manipulating the internal list, and the most important part - createIterator().
Its implementation will hold the list:
```
public class VehicleList implements VehicleCollection {
    private final List<Vehicle> vehicles;

    // Constructors, implementations
}
```
And finally, in the client class, we will test this iterator:
```
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
```

## Results
```
First vehicle in the iterator: 
Car with color: red, wheels: 4, seats: 5
Second vehicle in the iterator: 
Car with color: black, wheels: 4, seats: 5
Previous vehicle in the iterator: 
Car with color: red, wheels: 4, seats: 5
There are more vehicles in this iterator.
```

## Conclusion

The Iterator Pattern made it easier to work with collections in the system by separating the traversal logic from the collection itself. 
This improves flexibility, as the client code doesn’t need to know how the collection is implemented. Overall, it simplifies the code 
and makes the system easier to maintain and extend.
