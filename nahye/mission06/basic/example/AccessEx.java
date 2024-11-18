package mission06.basic.example;

public class AccessEx {

    public String publicField = "Public Field";
    protected String protectedField = "Protected Field";
    String defaultField = "Default Field";
    private String privateField = "Private Field";

    public void publicMethod(){
        System.out.println("publicMethod()");
    }

    protected void protectedMethod(){
        System.out.println("protectedMethod()");
    }

    void defaultMethod(){
        System.out.println("defaultMethod()");

    }

    private void privateMethod(){
        System.out.println("privateMethod()");
    }

    public void innerAccess(){
        System.out.println(publicField);
        System.out.println(protectedField);
        System.out.println(defaultField);
        System.out.println(privateField);

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
