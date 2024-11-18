package mission6.middle.domain;

import mission6.middle.domain.Address;

public class Person {
    public String name;
    int age;
    private Address address;
    String email;

    public Person(String name, int age, Address address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public void updatePerson(String name, int age, Address address, String email){
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", email='" + email + '\'' +
                '}';
    }
}
