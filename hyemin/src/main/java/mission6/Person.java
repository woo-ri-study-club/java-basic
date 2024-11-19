package mission6;

public class Person {
    private String name; // 외부에서 접근할 수 없음
    String email; // 같은 패키지 내에서만 접근 가능
    private Address address; // 외부에서 접근할 수 없음

    // 전체 접근 가능
    public Person(String name, String email, Address address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // 전체 접근 가능
    public String getName(){
        return name;
    }

    // 전체 접근 가능
    public Address getAddress(){
        return address;
    }
}
