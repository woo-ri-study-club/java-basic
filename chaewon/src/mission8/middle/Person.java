package mission8.middle;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void updateName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
