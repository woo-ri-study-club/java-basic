package mission8.middle;

public class MiddleName {
    public static void main(String[] args) {
        final Person person = new Person("홍길동");
        System.out.println(person); //name = 홍길동

        //《 person이 참조하는 객체의 name 필드 값 변경 》
        person.updateName("새이름");
        System.out.println(person); //name = 새이름

        //《 person이 참조하는 값 자체(객체의 주소값) 변경 시도 》
//        person = new Person("새사람");
        //'java: cannot assign a value to final variable person' 컴파일 에러 발생
    }
}
