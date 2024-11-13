package section02;

public class StudentTest {

  public static void main(String[] args) {
    Student[] students = {
        new Student("윤정년", 19, "B+"),
        new Student("허영서", 19, "A"),
        new Student("서혜랑", 34, "S"),
        new Student("문옥경", 34, "S+"),
        new Student("강소복", 43, "S")
    };

    System.out.println("### 학생 정보 ###");
    for (Student student : students) {
      System.out.println(String.format("이름: %s, 나이: %d, 등급: %s",
                                       student.getName(),
                                       student.getAge(),
                                       student.getGrade()));
    }

  }
}
