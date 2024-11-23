package mission10.medium;

public class MediumMain {
    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Cat()};

        for(Animal a : animals) {
            if(a instanceof Dog) {
                System.out.println("개입니다.");
            }
            if(a instanceof Cat) {
                System.out.println("고양이입니다.");
            }
        }
    }
}
