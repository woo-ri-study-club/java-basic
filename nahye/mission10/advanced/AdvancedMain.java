package mission10.advanced;

public class AdvancedMain {
    public static void main(String[] args) {

        Shape shape1 = new Circle(10);
        Shape shape2 = new Circle(5);
        shape1.display();
        shape2.display();

        Shape shape3 = new Ractangle(10, 10);
        Shape shape4 = new Ractangle(5, 5);
        shape3.display();
        shape4.display();
    }
}
