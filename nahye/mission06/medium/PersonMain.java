package mission06.medium;

public class PersonMain {
    public static void main(String[] args) {
        Address address = new Address("K", "Seoul", "1111");
        Person person = new Person("KIM", 20, address, 01033334444);

        System.out.println(person.phoneNumber);
        System.out.println(person.getAddress());
        // 컴파일 오류
        // System.out.println(person.name);
        // System.out.println(person.age);

    }
}
