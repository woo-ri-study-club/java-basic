package mission8.easy;

public class Circle {
    public static final double PI = 3.141592;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.pow(radius, 2) * PI;
    }
}
