package section9.mission2;

public class PersonTest {

    public static void main(String[] args) {

        final Person person = new Person("이세은");

        person.changeName("이이이");
        System.out.println(person); // 참조하는 주소에 저장되어있는 값은 변경 가능

//        person = new Person("박박박"); // 새로운 객체로 재할당 불가

    }

}
