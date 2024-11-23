package mission2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Dog) {
                System.out.println("개 입니다.");
                continue;
            }
            if (animals[i] instanceof Cat) {
                System.out.println("고양이 입니다.");
            }
        }
    }
}
