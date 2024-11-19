package section09;

public class CircleMain {

  public static void main(String[] args) {
    Circle circle = new Circle(3);
    double area = circle.calculateArea();
    System.out.printf("원의 넓이(소수점 3째 자리까지): %.3f\n", area);
  }
}
