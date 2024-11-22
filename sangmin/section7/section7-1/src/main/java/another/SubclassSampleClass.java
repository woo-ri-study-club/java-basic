package another;

import example.SampleClass;

public class SubclassSampleClass extends SampleClass {
    public void testAccess() {
        System.out.println(publicField);    // 접근 가능
        System.out.println(protectedField); // 접근 가능
        // System.out.println(defaultField);   // 접근 불가능
        // System.out.println(privateField);   // 접근 불가능

        publicMethod();    // 호출 가능
        protectedMethod(); // 호출 가능
        // defaultMethod();   // 호출 불가능
        // privateMethod();   // 호출 불가능
    }
}
