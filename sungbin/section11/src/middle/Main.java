package middle;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Animal()};

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("개입니다.");
            } else if (animal instanceof Cat) {
                System.out.println("고양이입니다.");
            } else {
                System.out.println("동물입니다.");
            }
        }
    }
}
