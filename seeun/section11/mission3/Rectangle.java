package section11.mission3;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    void displayArea() {
        System.out.println("사각형의 면적: " + calculateArea());
    }
}
