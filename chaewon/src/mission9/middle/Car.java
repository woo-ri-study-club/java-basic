package mission9.middle;

public class Car extends Vehicle {
    private String brand;

    public Car(int maxSpeed, String brand) {
        super(maxSpeed);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Max Speed: " + maxSpeed;
    }
}
