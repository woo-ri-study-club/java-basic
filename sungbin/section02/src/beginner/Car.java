package beginner;

public class Car {

    private String brand;

    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Year: " + year;
    }
}
