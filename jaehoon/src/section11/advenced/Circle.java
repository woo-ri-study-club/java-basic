package section11.advenced;

public class Circle extends Shape {

  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  protected double calculateAreas() {
    return Math.PI * radius * radius;
  }
}
