package section07.a;

public class Address {

  public String country;
  protected String city;
  String street;
  private String zipCode;

  public Address(String country, String city, String street, String zipCode) {
    this.country = country;
    this.city = city;
    this.street = street;
    this.zipCode = zipCode;
  }

  public String getZipCode() {
    return zipCode;
  }
}
