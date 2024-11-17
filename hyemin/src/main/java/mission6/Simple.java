package mission6;

public class Simple {
    public int publicValue;
    int defaultValue;
    protected int protectedValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("publicMethod: " + publicValue);
    }
    void defaultMethod(){
        System.out.println("defaultMethod: " + defaultValue);
    }

    protected void protectedMethod(){
        System.out.println("protectedMethod: " + protectedValue);
    }

    private void privateMethod(){
        System.out.println("privateMethod: " + privateValue);
    }
}
