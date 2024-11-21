package mission09.medium;

public class Car extends Vehicle {
    private String brand;

    public Car(String brand, int maxSpeed) {
        super(maxSpeed);
        this.brand = brand;
    }

    public void showDetails() {
        System.out.println("Brand: " + brand + ",Max Speed: " + super.getMaxSpeed());
    }
}
