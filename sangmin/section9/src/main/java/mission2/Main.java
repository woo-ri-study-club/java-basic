package mission2;

public class Main {
    public static void main(String[] args) {
        final Person person = new Person("sangmin");
        person.setName("minsu");

        // name값을 호출하면 minsu가 출력된다.
        System.out.println(person.getName());

        // final로 선언된 person는 재할당이 불가능하다.
        person = new Person("name");
    }
}
