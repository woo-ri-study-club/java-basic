package mission1;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car("테슬라", 2024);

        System.out.println("[내 차 정보] 브랜드: " + myCar.getBrand() + ", 년도: " + myCar.getYear());
    }
}
