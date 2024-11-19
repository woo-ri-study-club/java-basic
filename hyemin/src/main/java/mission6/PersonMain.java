package mission6;

public class PersonMain {
    public static void main(String[] args) {
        Address address = new Address("강남대로 1길", "서울시", "000111");
        Person person = new Person("홍길동", "abc@abc.com", address);
        System.out.println(person.getName());
        System.out.println(person.getAddress());
    }
}
