package middle;

public class StudentManager {
    public static void main(String[] args) {
        Student[] students = {
                new Student("양성빈", 29, "A"),
                new Student("신짱구", 15, "B"),
                new Student("김철수", 16, "C"),
                new Student("이영희", 17, "D"),
                new Student("이훈이", 15, "F")
        };

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
