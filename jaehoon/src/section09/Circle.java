package section09;

public class Circle {

  public static final double PI = 3.14149;

  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public double calculateArea() {
    return Math.pow(radius, 2) * PI;
  }
}
