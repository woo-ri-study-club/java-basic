package section12.easy;

public class Rectangle extends Shape{

  private final double width;

  private final double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  private double calculateAreas() {
    return width * height;
  }

  @Override
  public double getArea() {
    return calculateAreas();
  }
}
