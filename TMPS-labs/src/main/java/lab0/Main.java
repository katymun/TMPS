package lab0;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.addUser(new User("john_doe1", "john1@example.com"));
        userService.addUser(new User("jane_doe2", "jane2@example.com"));

        List<User> users = userService.getAllUsers();
        System.out.println(users);

        // CSV
        UserExporter csvExporter = new CsvUserExporter();
        csvExporter.export(users);

        // JSON
        UserExporter jsonExporter = new JsonUserExporter();
        jsonExporter.export(users);
    }
}
