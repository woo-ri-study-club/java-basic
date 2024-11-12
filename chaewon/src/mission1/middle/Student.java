package mission1.middle;

public class Student {
    private final String name;
    private final int age;
    private final int grade;

    private Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static Student of(String name, int age, int grade){
        return new Student(name, age, grade);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }
}
