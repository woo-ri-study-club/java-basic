package section01;

public class StudentTest {

  public static void main(String[] args) {
    Student[] students = {
        new Student("윤정년", 19, "B+"),
        new Student("허영서", 19, "A"),
        new Student("서혜랑", 34, "S"),
        new Student("서혜랑", 34, "S"),
        new Student("강소복", 43, "S")
    };

    System.out.println("### 학생 정보 ###");
    for (Student student : students) {
      System.out.println("이름: " + student.getName() + ", 나이: " + student.getAge() + ", 등급: " + student.getGrade());
    }

  }
}
