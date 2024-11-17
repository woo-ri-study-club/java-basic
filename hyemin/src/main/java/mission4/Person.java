package mission4;

public class Person {
    private String name;
    private int age;

    Person(){
        name = "Unknown";
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("이름: %s, 나이: %d", name, age);
    }
}
