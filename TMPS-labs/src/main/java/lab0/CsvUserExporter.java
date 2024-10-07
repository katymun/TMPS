package lab0;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvUserExporter implements UserExporter {

    @Override
    public void export(List<User> users) {
        String fileName = "users.csv";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Username,Email\n");
            for (User user : users) {
                writer.write(user.getUsername() + "," + user.getEmail() + "\n");
            }
            writer.close();
            System.out.println("Users exported to CSV file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}
