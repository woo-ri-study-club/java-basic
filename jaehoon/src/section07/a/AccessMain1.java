package section07.a;

public class AccessMain1 {

  public static void main(String[] args) {
    System.out.println("### 같은 패키지내에서 접근 ###");
    AccessControl accessControl = new AccessControl();
    System.out.println(accessControl.publicField); // public 접근 가능
    System.out.println(accessControl.protectedField); // 같은 패키지라서 접근 가능
    System.out.println(accessControl.defaultField); // 같은 패키지라서 접근 가능
    // System.out.println(access.privateField); // 같은 클래스가 아니라서 접근 불가능

    accessControl.publicMethod(); // pubic 접근 가능
    accessControl.protectedMethod(); // 같은 패키지라서 접근 가능
    accessControl.defaultMethod(); // 같은 패키지라서 접근 가능
    // access.privateMethod(); // 같은 클래스가 아니라서 접근 불가능
  }
}
