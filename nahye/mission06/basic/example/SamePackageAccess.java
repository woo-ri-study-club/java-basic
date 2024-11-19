package mission06.basic.example;

public class SamePackageAccess {
    public static void main(String[] args) {
        AccessEx ex = new AccessEx();
        System.out.println(ex.publicField);
        System.out.println(ex.protectedField);
        System.out.println(ex.defaultField);
        // System.out.println(ex.privateField); // private 필드 접근 불가

        ex.publicMethod();
        ex.protectedMethod();
        ex.defaultMethod();
        // ex.privateMethod();
    }
}
