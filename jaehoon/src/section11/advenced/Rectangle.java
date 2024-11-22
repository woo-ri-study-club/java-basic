package section11.advenced;

public class Rectangle extends Shape {

  private final double width;

  private final double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  protected double calculateAreas() {
    return width * height;
  }
}
