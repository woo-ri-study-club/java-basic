package middle;

public class Main {
    public static void main(String[] args) {
        final Person person = new Person("양성빈");
        System.out.println("변경 전 => " + person.getName());

        person.updateName("신짱구");
        System.out.println("변경 후 => " + person.getName());
    }
}
