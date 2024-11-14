/*
중급
"클래스, 객체, 인스턴스"의 차이점을 설명한 후, 학생(Student) 정보를 관리하는 간단한 프로그램을 작성하세요.

Student 클래스는 name, age, grade 속성을 가지고, 이를 초기화하는 생성자와 각 속성을 반환하는 메서드를 포함해야 합니다.
다섯 명의 Student 객체를 배열로 생성하고, 각 학생의 정보를 출력하는 코드를 작성하세요.
 */
package section2.mission2;

public class Mission2 {

    public static void main(String[] args) {
        Student[] students = {
                new Student("이학생", 20, 90),
                new Student("박학생", 30, 80),
                new Student("김학생", 40, 70),
                new Student("윤학생", 50, 60),
                new Student("최학생", 60, 50)
        };

        for (Student student : students) {
            System.out.println(student);
        }
    }

}
