package mission10.advanced;

import java.text.DecimalFormat;

public class AdvancedMain {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");

        Shape circle = new Circle(2.5);
        double circleArea = circle.calculateArea();
        System.out.println(decimalFormat.format(circleArea));

        Shape rectangle = new Rectangle(12, 12);
        double rectangleArea = rectangle.calculateArea();
        System.out.println(decimalFormat.format(rectangleArea));
    }
}
