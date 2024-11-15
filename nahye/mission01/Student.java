package mission01;

public class Student {
    String name;
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }
}
