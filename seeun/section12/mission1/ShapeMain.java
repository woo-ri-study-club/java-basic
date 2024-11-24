package section12.mission1;

public class ShapeMain {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 20);

        System.out.println("circle.getArea() = " + circle.getArea());
        System.out.println("rectangle.getArea() = " + rectangle.getArea());

    }
}
