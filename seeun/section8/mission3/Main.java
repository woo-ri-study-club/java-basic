package section8.mission3;

public class Main {

    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.setConfig("url", "http://woo-ri-study-club.com");
        config.setConfig("timeout", "5000");

        System.out.println("URL: " + config.getConfig("url"));
        System.out.println("Timeout: " + config.getConfig("timeout"));

        config.setConfig("a", null);
        config.setConfig("b", "");

        System.out.println("URL: " + config.getConfig("a"));
        System.out.println("Timeout: " + config.getConfig("b"));
    }
}
