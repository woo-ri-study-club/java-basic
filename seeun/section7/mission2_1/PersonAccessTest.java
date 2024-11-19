package section7.mission2_1;

import section7.mission2.Address;
import section7.mission2.Person;

public class PersonAccessTest {

    public static void main(String[] args) {

        Address address = new Address("Korea", "seoul", "Jongno", "456");
        Person person = new Person("이", 20, 80, address);

        System.out.println("person.name = " + person.name); // public : 모든 외부에서 접근 가능
//        System.out.println("person.age = " + person.age); // protected : 다른 패키지에서 age 접근 불가
//        System.out.println("person.grade = " + person.grade); // default : 다른 패키지에서 접근 불가
//        System.out.println("person.address = " + person.address); // private : 외부에서 접근 불가
    }
}
