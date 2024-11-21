package beginner;

public class Circle {

    private static final double PI = 3.14159265358979323846;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}
