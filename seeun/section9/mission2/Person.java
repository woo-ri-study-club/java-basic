package section9.mission2;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void changeName(String newName) {
        name = newName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
