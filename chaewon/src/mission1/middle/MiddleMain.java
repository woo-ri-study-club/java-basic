package mission1.middle;

public class MiddleMain {
    public static void main(String[] args) {
        Student[] students = {
                Student.of("학생1", 18, 90),
                Student.of("학생2", 19, 80),
                Student.of("학생3", 17, 75),
                Student.of("학생4", 20, 95),
                Student.of("학생5", 22, 60)
        };

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
