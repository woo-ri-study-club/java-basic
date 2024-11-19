package mission6.middle;

import mission6.middle.domain.Address;
import mission6.middle.domain.Person;

public class MiddleMain {
    public static void main(String[] args) {
        Person person = new Person(
                "홍길동"
                , 20
                , new Address("a city", "b street", "00000")
                , "some_email@email.com"
        );

        System.out.println(person);

        //public 필드 접근 가능
        person.name = "이름 변경";

        //protected, default, private 접근 불가능
//        person.age = 10;
//        person.address = new Address("c city", "d street", "10000");
//        person.email = "new_email@email.com";

        System.out.println(person);

        //person 정보 변경 시 public 메서드로 접근해 변경
        person.updatePerson(
                "새 사람"
                , 10
                , new Address("c city", "d street", "10000")
                , "new_email@email.com"
        );

        System.out.println(person);
    }
}
