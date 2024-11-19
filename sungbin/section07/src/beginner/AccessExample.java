package beginner;

public class AccessExample {

    public String publicField = "publicField";

    protected String protectedField = "protectedField";

    String defaultField = "defaultField";

    private String privateField = "privateField";

    public void publicMethod() {
        System.out.println("publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    private void privateMethod() {
        System.out.println("privateMethod");
    }
}
