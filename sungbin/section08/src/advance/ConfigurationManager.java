package advance;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {

    private static ConfigurationManager instance;

    private Map<String, String> config = new HashMap<>();

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }

        return instance;
    }

    public String getConfig(String key) {
        return config.get(key);
    }

    public void setConfig(String key, String value) {
        config.put(key, value);
    }
}
