package lab3.domain;

public class ConfigManager {
    private static ConfigManager instance;
    private String configuration;

    private ConfigManager() {
        configuration = "Default configurations";
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}
