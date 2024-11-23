package mission3;

public class Circle extends Shape {
    private final double PI = 3.14;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return PI * radius * radius;
    }
}
