package mission7.advanced;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager configurationManager;
    private Map<String, String> configurations = new HashMap<>();

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }

        return configurationManager;
    }

    public void setConfig(String key, String value) {
        configurations.put(key, value);
    }

    public String getConfig(String key) {
        if (!configurations.containsKey(key)){
            throw new IllegalArgumentException("해당 key 값이 존재하지 않습니다.");
        }

        return configurations.get(key);
    }
}
