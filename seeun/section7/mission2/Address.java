package section7.mission2;

public class Address {
    public String country;
    protected String city;
    String street;
    private String detailAddress;

    public Address(String country, String city, String street, String detailAddress) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.detailAddress = detailAddress;
    }
}
