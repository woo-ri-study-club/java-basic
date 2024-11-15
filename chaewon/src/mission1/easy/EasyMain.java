package mission1.easy;

public class EasyMain {
    public static void main(String[] args) {
        Car hyundai = new Car();
        hyundai.brand = "현대";
        hyundai.year = 2021;

        Car tesla = new Car();
        tesla.brand = "테슬라";
        tesla.year = 2003;

        Car[] garage = {hyundai, tesla};

        for (Car car : garage) {
            System.out.println("브랜드: " + car.brand + ", 출시연도: " + car.year);
        }
    }
}
