package mission10.advanced;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(calculateArea() +" 입니다.");
    }
}
