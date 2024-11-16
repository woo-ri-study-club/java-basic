package mission4.easy;

public class Person {
    private String name;
    private int age;

    public Person() {
        name = "unknown";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age='" + age;
    }
}
