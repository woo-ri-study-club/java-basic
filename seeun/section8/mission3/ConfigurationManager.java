package section8.mission3;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class ConfigurationManager {

    private static ConfigurationManager instance;
    private static final Map<String, String> config = new HashMap<>();

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void setConfig(String key, String value) {
        validateSetConfigInfo(key, value);
        config.put(key, value);
    }

    public String getConfig(String key) {
        validateGetConfigInfo(key);
        return config.get(key);
    }

    private void validateSetConfigInfo(String key, String value) {
        validateKey(key);
        if (isNull(value)) {
            throw new IllegalArgumentException("설정값은 빈 값이 될 수 없습니다.");
        }
    }

    private void validateGetConfigInfo(String key) {
        validateKey(key);
        String value = config.get(key);
        if (isNull(value)) {
            throw new IllegalStateException(key + "에 해당하는 값을 찾을 수 없습니다.");
        }
    }

    private void validateKey(String key) {
        if (isNull(key)) {
            throw new IllegalArgumentException("설정키는 빈 값이 될 수 없습니다.");
        }
    }
}
