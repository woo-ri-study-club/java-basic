package section5.mission1;

public class Person {
    private String name;
    private int age;

    public Person() {
        this("Unknown", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introducePerson() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}
