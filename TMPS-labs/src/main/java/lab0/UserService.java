package lab0;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    public void deleteUser(User user) {
        users.remove(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}
