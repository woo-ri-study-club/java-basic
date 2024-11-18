package section07.b;

import section07.a.AccessControl;

public class AccessMain2 {

  public static void main(String[] args) {
    System.out.println("### 다른 패키지내에서 접근 ###");
    AccessControl accessControl = new AccessControl();
    System.out.println(accessControl.publicField); // public 접근 가능
    // System.out.println(access.protectedField); // 같은 패키지 or 상속이 아니어서 접근 불가
    // System.out.println(access.defaultField); // 같은 패키지가 아니라서 접근 불가
    // System.out.println(access.privateField); // 같은 클래스가 아니라서 접근 불가

    accessControl.publicMethod(); // public 접근 가능
    // access.protectedMethod(); // 같은 패키지라서 접근 가능
    // access.defaultMethod(); // 같은 패키지라서 접근 가능
    // access.privateMethod(); // 컴파일 에러: private 메서드는 접근 불가
  }
}
