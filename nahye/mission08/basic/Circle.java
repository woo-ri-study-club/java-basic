package mission08.basic;

public class Circle {
    private static final double PI = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}


