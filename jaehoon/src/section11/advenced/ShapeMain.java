package section11.advenced;

public class ShapeMain {

  public static void main(String[] args) {
    Shape shape1 = new Circle(3);
    System.out.print("Circle의 ");
    shape1.displayArea();


    Shape shape2 = new Rectangle(2, 5);
    System.out.print("Rectangle의 ");
    shape2.displayArea();
  }
}
