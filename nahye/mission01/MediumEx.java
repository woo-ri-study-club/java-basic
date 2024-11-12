package mission01;

public class MediumEx {
    public static void main(String[] args) {
        Student[] students = {
                new Student("학생1", 10, "A"),
                new Student("학생2", 15, "B"),
                new Student("학생3", 14, "B"),
                new Student("학생4", 13, "C"),
                new Student("학생5", 17, "A")
        };

        for (Student student : students) {
            System.out.println("이름: " + student.getName() + ", 나이: " + student.getAge() + ", 등급: " + student.getGrade());
        }

    }
}
