package another;

import example.SampleClass;

public class AnotherPackageSampleClass {
    public void testAccess() {
        SampleClass sampleClass = new SampleClass();
        System.out.println(sampleClass.publicField);    // 접근 가능
        // System.out.println(sampleClass.protectedField); // 접근 불가능
        // System.out.println(sampleClass.defaultField);   // 접근 불가능
        // System.out.println(sampleClass.privateField);   // 접근 불가능

        sampleClass.publicMethod();    // 호출 가능
        // sampleClass.protectedMethod(); // 호출 불가능
        // sampleClass.defaultMethod();   // 호출 불가능
        // sampleClass.privateMethod();   // 호출 불가능
    }
}
