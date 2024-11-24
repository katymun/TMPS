package lab2;

import lab2.domain.ConfigManager;

public class VehicleManufacturing {
    public static void main(String[] args) {
        ConfigManager configManager = ConfigManager.getInstance();
        System.out.println("Configuration: " + configManager.getConfiguration());
    }
}
