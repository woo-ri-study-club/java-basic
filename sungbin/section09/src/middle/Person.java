package middle;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void updateName(String name) {
        this.name = name;
    }
}
