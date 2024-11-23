package mission10.medium;

public class MediumMain {
    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Cat(), new Animal()};

        for(Animal a : animals) {
            if(a instanceof Dog) {
                System.out.println("개입니다.");
            }
            else if(a instanceof Cat) {
                System.out.println("고양이입니다.");
            }else {
                System.out.println("동물입니다.");
            }
        }
    }
}
