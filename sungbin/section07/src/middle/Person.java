package middle;

public class Person {

    private String name;

    String age;

    protected Address address;

    public Person(String name, String age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    protected void updateAddress(Address address) {
        this.address = address;
    }
}
