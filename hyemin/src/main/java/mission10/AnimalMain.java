package mission10;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal(),
                new Cat(),
                new Dog()
        };

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                System.out.println(Cat.INTRODUCTION);
            } else if (animal instanceof Dog) {
                System.out.println(Dog.INTRODUCTION);
            } else {
                System.out.println(Animal.INTRODUCTION);
            }
        }
    }
}
