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
        if (key == null) {
            throw new IllegalArgumentException("Key가 없습니다.");
        }
        configurations.put(key,value);
    }

    public String getConfig(String key) {
        if (key == null) {
            throw new IllegalArgumentException("Key가 없습니다.");
        }
       return configurations.get(key);
    }
}
