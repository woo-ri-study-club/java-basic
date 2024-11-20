package seuem.mission8.intermediate;

public class PersonMain {
    public static void main(String[] args) {
        final Person person = new Person("Sam");
        System.out.println("person = " + person.toString());
        System.out.println("person's name = " + person.name);

        //final 인스턴스의 이름은 바꿀수있다. 이름이 바뀐다고 객체의 참조위치가 바뀌지 않는다.
        person.name = "Sammy";
        System.out.println("person = " + person.toString());
        System.out.println("person's name = " + person.name);

        //하지만 객체의 참조는 바꿀수없다. final을 인스턴스 클래스에 두면 인스턴스의 참조주소는 한번 선언된후 바꿀수 없다 (그 안에 속성들만 변경 가능)
        //person = new Person("Meep"); <--- 컴파일 에러
        //Cannot assign a value to final variable 'person'
    }
}
