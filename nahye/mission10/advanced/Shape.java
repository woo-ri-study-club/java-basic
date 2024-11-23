package mission10.advanced;

public abstract class Shape {
    public abstract double calculateArea();

    public void display() {
        System.out.println("도형의 면적은 "+calculateArea()+"입니다.");
    }
}
