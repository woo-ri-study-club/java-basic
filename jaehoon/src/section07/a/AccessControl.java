package section07.a;

public class AccessControl {

  public String publicField = "Public Field";
  protected String protectedField = "Protected Field";
  String defaultField = "Default Field";
  private String privateField = "Private Field";

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

}
