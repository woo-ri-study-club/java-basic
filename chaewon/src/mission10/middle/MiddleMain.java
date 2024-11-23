package mission10.middle;

public class MiddleMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("치와와"),
                new Cat("스핑크스"),
                new Cat("아메리칸 숏헤어")
        };

        for (Animal animal : animals){
            if (animal instanceof Dog){
                System.out.println("개입니다.");
            }else if (animal instanceof Cat){
                System.out.println("고양이입니다.");
            } else{
                System.out.println("개 혹은 고양이가 아닙니다.");
            }
        }
    }
}
