public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Hyundai");
        car.setYear(2021);

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
    }
}
