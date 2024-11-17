/*
초급
Person 클래스의 이름과 나이를 필드로 가지며, 기본 생성자를 포함하도록 하세요. 생성자에서 이름과 나이를 각각 초기화할 수 있는 필드를 작성하세요.
기본 생성자를 통해 이름은 "Unknown", 나이는 0으로 설정되도록 하세요.
 */
package section5.mission1;

public class PersonMain {

    public static void main(String[] args) {

        Person person1 = new Person();
        System.out.println(person1);

        Person person2 = new Person("사람", 23);
        System.out.println(person2);

    }
}
