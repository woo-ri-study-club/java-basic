package mission6;

public class Address {
    private String street; // 외부에서 접근할 수 없음
    private String city; // 외부에서 접근할 수 없음
    private String zipCode; // 외부에서 접근할 수 없음

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
