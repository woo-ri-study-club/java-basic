package mission06.medium;

public class Person {
    int phoneNumber;
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address.getFullAddress();
    }
}
