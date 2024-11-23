package mission10;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(2),
                new Rectangle(3, 4)
        };

        for (Shape shape : shapes) {
            shape.displayArea();
        }
    }
}
