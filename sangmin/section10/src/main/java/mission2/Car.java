package mission2;

public class Car extends Vehicle {
    private String brand;

    public Car(final String brand) {
        super("200");
        this.brand = brand;
    }

    public void showDetails() {
        System.out.println("Brand: " + brand + ", Max Speed: " + super.getMaxSpeed());
    }
}
