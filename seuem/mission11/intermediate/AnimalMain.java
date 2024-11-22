package seuem.mission11.intermediate;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Dog dog2 = new Dog();
        Cat cat3 = new Cat();
        Dog dog3 = new Dog();

        Animal[] animals = {dog, cat, cat2, dog2, dog3, cat3};
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                System.out.println("고양이입니다.");
                continue;
            }
            System.out.println("개입니다.");
        }
    }
}
