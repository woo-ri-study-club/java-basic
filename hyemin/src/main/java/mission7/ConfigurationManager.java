package mission7;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

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
        validateString(key);
        validateString(value);
        config.put(key, value);
    }

    public String getConfig(String key) {
        validateString(key);
        return getValueOrThrow(key);
    }

    private void validateString(String string) {
        if (string == null || string.isBlank()) {
            throw new IllegalArgumentException("유효하지 않은 값입니다");
        }
    }

    private String getValueOrThrow(String key) {
        String value = config.get(key);
        if (value == null) {
            throw new NoSuchElementException("key에 해당하는 value가 없습니다: " + key);
        }
        return value;
    }
}
