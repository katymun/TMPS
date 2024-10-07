package lab0;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonUserExporter implements UserExporter {

    @Override
    public void export(List<User> users) {
        String fileName = "users.json";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("[\n");
            for (int i = 0; i < users.size(); i++) {
                User user = users.get(i);
                writer.write("  {\"username\": \"" + user.getUsername() + "\", \"email\": \"" + user.getEmail() + "\"}");
                if (i < users.size() - 1) {
                    writer.write(",\n");
                }
            }
            writer.write("\n]");
            writer.close();
            System.out.println("Users exported to JSON file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to JSON file: " + e.getMessage());
        }
    }
}
