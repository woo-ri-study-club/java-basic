package mission11.basic;

public class BasicMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(10,10);
        System.out.println(rectangle.getArea());
    }
}
