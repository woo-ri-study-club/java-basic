package mission7;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

public class ConfigurationManager {

    private static ConfigurationManager instance;

    private Map<String, String> config;

    private ConfigurationManager(){
        config = new HashMap<>();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void setConfig(String key, String value) {
        validateStrings(key, value);
        config.put(key, value);
    }

    public String getConfig(String key) {
        validateStrings(key);
        return getValueOrThrow(key);
    }

    private void validateStrings(String... strings) {
        for (String str : strings) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("Strings cannot be null or empty");
            }
        }
    }

    private String getValueOrThrow(String key) {
        return Optional.ofNullable(config.get(key))
                .orElseThrow(() -> new NoSuchElementException("key에 해당하는 value가 없습니다: " + key));
    }
}
