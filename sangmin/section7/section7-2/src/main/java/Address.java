public class Address {
    private final String city;
    private final String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    protected String getCity() {
        return city;
    }
}
