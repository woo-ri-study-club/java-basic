package mission6;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("홍길동", "abc@abc.com", new Address("강남대로 1길", "서울시", "000111"));
        System.out.println(person.getName());
        System.out.println(person.getAddress());
    }
}
