package seuem.mission11.advanced;

public abstract class Shape {
    abstract double calculateArea();

    public void displayArea() {
        System.out.println("이 모형의 면적은 " + calculateArea() + "cm² 입니다.");
    }
}
