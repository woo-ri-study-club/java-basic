package section10.mission2;

public class Car extends Vehicle{
    private String brand;

    public Car(int maxSpeed, String brand) {
        super(maxSpeed);
        this.brand = brand;
    }

    public void showDetails() {
        System.out.println("Brand: " + brand + ", Max Speed: " + getMaxSpeed());
    }
}
