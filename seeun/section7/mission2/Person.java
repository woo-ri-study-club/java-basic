package section7.mission2;

public class Person {

    public String name;
    protected int age;
    int grade;
    private Address address;

    public Person(String name, int age, int grade, Address address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.address = address;
    }
}
