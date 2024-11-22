package mission2;

public class Vehicle {
    private String maxSpeed;

    public Vehicle(final String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected String getMaxSpeed() {
        return maxSpeed;
    }
}
