package mission08.basic;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        System.out.println("circle1의 넓이: " + circle1.calculateArea());

        Circle circle2 = new Circle(10);
        System.out.println("circle2의 넓이: " + circle2.calculateArea());
    }
}
