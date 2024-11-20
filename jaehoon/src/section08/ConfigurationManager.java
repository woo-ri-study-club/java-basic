package section08;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class ConfigurationManager {

  // volatile 키워드 사용
  private static volatile ConfigurationManager instance;

  private Map<String, String> configMap = new HashMap<>();

  // private 기본 생성자
  private ConfigurationManager() {
  }

  // Double-Checked Locking 방식
  public static ConfigurationManager getInstance() {
    if (isNull(instance)) {
      synchronized (ConfigurationManager.class) {
        if (isNull(instance)) {
          instance = new ConfigurationManager();
        }
      }
    }
    return instance;
  }

  public void setConfig(String key, String value) {
    this.configMap.put(key, value);
  }

  public String getConfig(String key) {
    return configMap.get(key);
  }

}
