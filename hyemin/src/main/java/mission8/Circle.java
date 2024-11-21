package mission8;

public class Circle {
    public static final double PI = 3.14;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return PI * radius * radius;
    }
}
