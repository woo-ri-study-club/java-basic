package section11.mission3;

public class ShapeMain {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(6, 8), new Circle(10)};

        for (Shape shape : shapes) {
            shape.displayArea();
        }
    }
}
