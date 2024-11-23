package section11.mission3;

public class ShapeMain {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(6, 8);
        shapes[2] = new Circle(10);

        for (Shape shape : shapes) {
            shape.displayArea();
        }
    }
}
