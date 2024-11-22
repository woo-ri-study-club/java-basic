package advance;

public abstract class Shape {

    public abstract double calculateArea();

    void displayArea() {
        System.out.println("해당 면적은 " + calculateArea() + "입니다.");
    }
}
