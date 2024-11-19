package example;

public class SampleClass {
    // 필드
    public String publicField = "Public Field";
    protected String protectedField = "Protected Field";
    String defaultField = "Default Field"; // 접근 제어자를 명시하지 않으면 default
    private String privateField = "Private Field";

    // 메서드
    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    // 클래스 내부에서 모든 필드와 메서드 접근 가능
    public void accessAll() {
        System.out.println(publicField);    // 접근 가능
        System.out.println(protectedField); // 접근 가능
        System.out.println(defaultField);  // 접근 가능
        System.out.println(privateField);  // 접근 가능

        publicMethod();    // 호출 가능
        protectedMethod(); // 호출 가능
        defaultMethod();   // 호출 가능
        privateMethod();   // 호출 가능
    }
}
