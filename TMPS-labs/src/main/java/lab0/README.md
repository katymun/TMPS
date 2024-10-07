# Implementation of 2 SOLID letters in a simple project


## Author: Ecaterina Munteanu

----

## Objectives:

* Understand the SOLID principles;
* Implement 2 of these principles;


## Implementation

For this laboratory task, I created a small project that simulates exporting user data in different formats (CSV, JSON). The project includes two classes, CsvUserExporter and JsonUserExporter, that handle exporting the user data while applying the Single Responsibility Principle and Open/Closed Principle.
* The UserService class handles user management (adding, retrieving users), while separate classes (CsvUserExporter, JsonUserExporter) are responsible for exporting users in different formats. This ensures each class has a distinct responsibility.
```
public class UserService {
    // methods
}

public interface UserExporter {
    // methods
}
```
* The UserExporter interface allows extending the project by creating new export formats (e.g., XML or Excel) without modifying the existing code. New export formats can be added by implementing the UserExporter interface.
```
public interface UserExporter {
    void export(List<User> users);
}

public class CsvUserExporter implements UserExporter { 
    // implementation
}

public class JsonUserExporter implements UserExporter {
    // implementation
}
```


## Conclusions / Screenshots / Results

I managed to apply the Single Responsibility Principle by separating concerns between user management and data exporting.
I applied the Open/Closed Principle by using an interface for exporting functionality, making it easy to extend the project for other export formats. Thus, I could implement the first 2 SOLID principles.
