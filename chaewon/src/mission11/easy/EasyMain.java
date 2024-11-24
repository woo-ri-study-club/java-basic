package mission11.easy;

import java.text.DecimalFormat;

public class EasyMain {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");

        Shape circle = new Circle(1.5);
        System.out.println("원의 넓이 = " + decimalFormat.format(circle.getArea()));

        Shape rectangle = new Rectangle(15, 20);
        System.out.println("직사각형의 넓이 = " + decimalFormat.format(rectangle.getArea()));
    }
}
