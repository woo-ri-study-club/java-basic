package mission8.easy;

public class EasyMain {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        double areaOfCircle = circle.calculateArea();

        System.out.println("PI = " + Circle.PI);
        System.out.println("원의 넓이 = " + areaOfCircle);
    }
}
