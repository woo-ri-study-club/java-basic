package section10.middle;

public class Vehicle {

  private int maxSpeed;

  public Vehicle(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  protected int getMaxSpeed() {
    return maxSpeed;
  }
}
