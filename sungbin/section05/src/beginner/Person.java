package beginner;

public class Person {

    private String name;

    private int age;

    public Person() {
        this("unknown", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
