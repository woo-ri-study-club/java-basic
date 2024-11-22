package advance;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(4, 6)};

        for (Shape shape : shapes) {
            shape.displayArea();
        }
    }
}
