package section11.mission3;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void displayArea() {
        System.out.println("원의 면적: " + calculateArea());
    }


}
