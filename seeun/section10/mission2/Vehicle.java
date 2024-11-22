package section10.mission2;

public class Vehicle {
    private int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected int getMaxSpeed() {
        return maxSpeed;
    }
}
