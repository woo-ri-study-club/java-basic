package mission06.basic.example.a;

import mission06.basic.example.AccessEx;

public class SubClassAnotherPackage extends AccessEx {
    public static void main(String[] args) {
        SubClassAnotherPackage ex = new SubClassAnotherPackage();

        System.out.println(ex.publicField);
        System.out.println(ex.protectedField);
        // System.out.println(ex.defaultField); // defalut는 동일 패키지에서만 접근 가능
        // System.out.println(ex.privateField); // private 필드 접근 불가

        ex.publicMethod();
        ex.protectedMethod();
        // ex.defaultMethod();
        // ex.privateMethod();
    }
}
