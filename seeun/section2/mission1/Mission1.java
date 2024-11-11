/*
초급
클래스가 필요한 이유를 간단히 설명하고, 자동차(Car) 클래스를 정의하여 String brand, int year 속성을 가지도록 하세요.
이 클래스를 사용하여 Car 객체를 하나 생성하고, brand와 year 값을 할당하는 코드를 작성하세요.
 */
package section2.mission1;

public class Mission1 {

    public static void main(String[] args) {

        Car car = new Car("BMW", 2023);

        System.out.println("car의 brand: " + car.getBrand());
        System.out.println("car의 year: " + car.getYear());

    }
}
