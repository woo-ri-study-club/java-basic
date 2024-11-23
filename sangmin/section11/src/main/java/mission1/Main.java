package mission1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        //"Dog barks" 호출
        // 런타임 시점에 Animal 객체가 Dog 객체로 변환되어 sound 메소드가 호출된다.
    }
}
