package seuem.mission11.advanced;

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 10);
        System.out.println("rectangle.calculate 메서드 = " + rectangle.calculateArea());
        rectangle.displayArea();

        System.out.println();

        Circle circle = new Circle(200);
        System.out.println("circle.calculateArea 메서드 = " + circle.calculateArea());
        circle.displayArea();
    }
}
