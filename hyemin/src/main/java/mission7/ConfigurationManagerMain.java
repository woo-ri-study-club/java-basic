package mission7;

public class ConfigurationManagerMain {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.setConfig("url", "http://woo-ri-study-club.com");
        config.setConfig("timeout", "5000");

        System.out.println("URL: " + config.getConfig("url"));
        System.out.println("Timeout: " + config.getConfig("timeout"));

        try {
            System.out.println("Timeout2: " + config.getConfig("timeout2"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
