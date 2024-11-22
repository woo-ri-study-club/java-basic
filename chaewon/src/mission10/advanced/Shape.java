package mission10.advanced;

public abstract class Shape {
    public abstract double calculateArea();

    public void displayArea(){
        System.out.println("도형의 면적: " + calculateArea());
    }
}
