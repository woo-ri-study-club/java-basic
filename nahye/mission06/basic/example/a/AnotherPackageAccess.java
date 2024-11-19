package mission06.basic.example.a;

import mission06.basic.example.AccessEx;

public class AnotherPackageAccess {
    public static void main(String[] args) {
        AccessEx ex = new AccessEx();
        System.out.println(ex.publicField);
        // System.out.println(ex.protectedField); // protected 필드는 동일 패키지나 하위 클래스에서만 접근가능
        // System.out.println(ex.defaultField);   // default 필드는 동일 패키지에서만 접근가능
        // System.out.println(ex.privateField); // private 필드 접근 불가

        ex.publicMethod();
        // ex.protectedMethod();
        // ex.defaultMethod();
        // ex.privateMethod();
    }
}
