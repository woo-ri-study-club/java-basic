package mission1;

public class StudentMain {
    public static void main(String[] args) {
        Student[] students = {
                new Student("가나다", 14, 90),
                new Student("라마바", 15, 70),
                new Student("사아자", 16, 80),
                new Student("차카타", 14, 95),
                new Student("파하가", 15, 60),
        };

        for (Student student : students) {
            System.out.println("이름: "+ student.getName() + ", 나이 : " + student.getAge() + ", 성적: " + student.getGrade());
        }
    }
}
