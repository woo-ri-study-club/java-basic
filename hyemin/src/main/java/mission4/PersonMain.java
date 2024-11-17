package mission4;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1);

        Person person2 = new Person("홍길동", 2);
        System.out.println(person2);
    }
}
