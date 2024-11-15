package section03;

import java.util.Arrays;

/**
 * 기본형과 참조형을 메서드의 매개변수로 전달할 때 동작 방식이 어떻게 다른지 보여주는 자바 프로그램을 작성하세요.<p>
 * - 정수형(int)과 배열(array)을 매개변수로 받아 각각을 수정하려고 시도하는 메서드를 정의하세요.<p>
 * - 실행 결과를 관찰하고, 기본형과 참조형이 메서드 호출 시 어떻게 다르게 동작하는지 설명하세요.<p>
 */
public class MethodChangeTest {

  public static void main(String[] args) {
    int number = 11;
    System.out.println("기본형 타입 number 변수 메소드 호출전: " + number);
    changePrimitiveType(number);
    System.out.println("기본형 타입 number 변수 메소드 호출후: " + number);
    System.out.println();

    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("참조형 타입 numbers 변수 메소드 호출전: " + Arrays.toString(numbers));
    changeReferenceType(numbers);
    System.out.println("참조형 타입 numbers 변수 메소드 호출후: " + Arrays.toString(numbers));

  }

  static void changePrimitiveType(int number) {
    // 넘겨받은 number 변수를 7로 변경
    number = 7;
    System.out.println("메서드 안의 number 변수 = " + number);
  }

  static void changeReferenceType(int[] numbers) {
    // 넘겨받은 numbers 배열을 6~10으로 변경
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 6;
    }
    System.out.println("메서드 안의 numbers 변수 = " + Arrays.toString(numbers));
  }
}
