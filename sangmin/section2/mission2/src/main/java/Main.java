public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("홍길동", 13, "6학년");
        students[1] = new Student("김철수", 11, "4학년");
        students[2] = new Student("이영희", 12, "5학년");
        students[3] = new Student("박영수", 10, "3학년");
        students[4] = new Student("정수진", 9, "2학년");

        for (Student student : students) {
            System.out.println("이름: " + student.getName() + ", 나이: " + student.getAge() + ", 학년: " + student.getGrade());
        }
    }
}
