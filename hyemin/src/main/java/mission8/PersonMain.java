package mission8;

public class PersonMain {
    public static void main(String[] args) {
        final Person person = new Person("홍길동");
        System.out.println(person); // @5f184fc6
        person.setName("김길동");
//        person = new Person("김길동"); // 컴파일 에러
        System.out.println(person); // @5f184fc6
    }
}
