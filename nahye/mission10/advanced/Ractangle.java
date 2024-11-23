package mission10.advanced;

public class Ractangle extends Shape {
    private int width;
    private int height;

    public Ractangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(calculateArea() +" 입니다.");
    }
}
