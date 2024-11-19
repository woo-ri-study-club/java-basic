package section7.mission2;

public class PersonAccessTest {

    public static void main(String[] args) {
        Address address = new Address("Korea", "Seoul", "Jongno", "123");
        Person person = new Person("윤", 13, 90, address);

        System.out.println("person.name = " + person.name); // public : 모든 외부에서 접근 가능
        System.out.println("person.age = " + person.age); // protected : 같은 패키지와 상속 관계일 경우 접근 가능
        System.out.println("person.grade = " + person.grade); // default : 같은 패키지에서 접근 가능
//        System.out.println("person.address = " + person.address); // private : 외부에서 접근 불가

        System.out.println("address.country = " + address.country); // public : 모든 외부에서 접근 가능
        System.out.println("address.city = " + address.city); // protected : 같은 패키지와 상속 관계일 경우 접근 가능
        System.out.println("address.street = " + address.street); // default : 같은 패키지에서 접근 가능
//        System.out.println("address.detailAddress = " + address.detailAddress); // private : 외부에서 접근 불가
    }
}
