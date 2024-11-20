package seuem.mission8.beginner;

/**
 final 키워드를 사용하여 상수 PI와 반지름을 가지는 간단한 Circle 클래스를 작성하세요.
 반지름이 주어졌을 때 원의 넓이를 계산하는 calculateArea 메서드를 추가하세요.
 PI 값은 변경되지 않아야 합니다.
 */
public class Circle {
    static final double PI= 3.14159;
    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }
}
