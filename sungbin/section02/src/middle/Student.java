package middle;

public class Student {

    private String name;

    private int age;

    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age + ", 성적: " + grade;
    }
}
