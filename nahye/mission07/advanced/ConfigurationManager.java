package mission07.advanced;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager config;
    private Map<String, String> configurations;

   private ConfigurationManager() {
       configurations = new HashMap<>();
   }

    public static ConfigurationManager getInstance(){
       if(config == null){
        config = new ConfigurationManager();
       }
       return config;
    }

    public void setConfig(String key, String value) {
        checkKeyNotNull(key);
        configurations.put(key,value);
    }

    public String getConfig(String key) {
        checkKeyNotNull(key);
        validateKeyContained(key);
        return configurations.get(key);
    }

    private void checkKeyNotNull(String key) {
        if (key == null) {
            throw new IllegalArgumentException("Key는 null일 수 없습니다.");
        }
    }

    private void validateKeyContained(String key) {
        if (!configurations.containsKey(key)) {
            throw new IllegalArgumentException(key+"를 찾을 수 없습니다.");
        }
    }
}
