package section12.easy;

public class ShapeMain {

  public static void main(String[] args) {
    Shape shape1 = new Circle(3);
    System.out.println("Circle의 면적: " + shape1.getArea());


    Shape shape2 = new Rectangle(2, 5);
    System.out.println("Rectangle의 면적: " + shape2.getArea());
  }
}
