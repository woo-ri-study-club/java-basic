package advance;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {

    private static ConfigurationManager INSTANCE;

    private Map<String, String> config = new HashMap<>();

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConfigurationManager();
        }

        return INSTANCE;
    }

    public String getConfig(String key) {
        return config.get(key);
    }

    public void setConfig(String key, String value) {
        config.put(key, value);
    }
}
