package section07.a;

public class Person {

  public String name;
  protected int age;
  String phoneNumber;
  private Address address;

  public Person(String name, int age, String phoneNumber, Address address) {
    this.name = name;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.address = address;
  }

  public Address getAddress() {
    return address;
  }
}
