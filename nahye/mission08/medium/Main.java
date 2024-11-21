package mission08.medium;

public class Main {
    public static void main(String[] args) {

        // 1. final로 객체 person 생성
        final Person person = new Person("KIM");
        System.out.println("person의 초기이름: " + person.getName());

        // 2. final로 선언된 person객체지만 내부에 선언된 필드는 변경가능하다.
        person.setName("LEE");
        System.out.println("변경후 person의 이름: " + person.getName());

        // 3. person에 새로운 객체를 할당할 수 없다. 참조값 변경 불가능
        // -> 컴파일 에러
        // person = new Person("PARK");


    }
}
