package mission10;

public abstract class Shape {
    public abstract double calculateArea();

    public void displayArea() {
        System.out.println("면적은 : " + calculateArea());
    }
}
