package section07.b;

import section07.a.Address;
import section07.a.Person;

public class PersonMain2 {

  public static void main(String[] args) {
    Address address = new Address("Korea", "Seoul", "Gangnam", "12345");
    Person person = new Person("noah", 25, "010-1234-5678", address);

    System.out.println(person.name); // public 필드: 접근 가능
    // System.out.println(person.age); // protected 필드: 다른 패키지 접근 불가
    // System.out.println(person.phoneNumber); // default 필드: 다른 패키지 접근 불가
    // System.out.println(person.address); // private 필드: 접근 불가

    System.out.println(address.country); // public 필드: 접근 가능
    // System.out.println(address.city); // protected 필드: 다른 패키지 접근 불가
    // System.out.println(address.street); // default 필드: 다른 패키지 접근 불가
    // System.out.println(address.zipCode); // private 필드: 접근 불가

    // public 메서드를 활용해서 private 필드 조회 가능
    System.out.println(person.getAddress());
    System.out.println(address.getZipCode());
  }
}
