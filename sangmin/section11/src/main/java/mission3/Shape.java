package mission3;

abstract class Shape {
    abstract double calculateArea();
    void displayArea() {
        System.out.println("면적: " + calculateArea());
    }
}
