package section12.easy;

public class Circle extends Shape{

  private final int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  private double calculateAreas() {
    return Math.PI * radius * radius;
  }

  @Override
  public double getArea() {
    return calculateAreas();
  }
}
