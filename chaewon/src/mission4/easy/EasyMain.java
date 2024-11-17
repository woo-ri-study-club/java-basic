package mission4.easy;

public class EasyMain {
    public static void main(String[] args) {
        Person defaultPerson = new Person();
        Person newPerson = new Person("new", 20);

        System.out.println(defaultPerson);
        System.out.println(newPerson);
    }
}
