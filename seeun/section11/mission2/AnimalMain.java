package section11.mission2;

public class AnimalMain {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();

        for (Animal animal : animals) {
            if(animal instanceof Dog){
                System.out.println("개입니다.");
            } else if (animal instanceof Cat) {
                System.out.println("고양이입니다.");
            } else {
                System.out.println("동물입니다.");
            }
        }
    }
}
