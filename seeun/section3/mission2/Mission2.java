/*
중급
기본형과 참조형을 메서드의 매개변수로 전달할 때 동작 방식이 어떻게 다른지 보여주는 자바 프로그램을 작성하세요.

정수형(int)과 배열(array)을 매개변수로 받아 각각을 수정하려고 시도하는 메서드를 정의하세요.
실행 결과를 관찰하고, 기본형과 참조형이 메서드 호출 시 어떻게 다르게 동작하는지 설명하세요.
 */

/*
코드 설명

결국 파라미터도 일반 변수처럼 작동한다. 값이 복사되어 매개변수로 대입되는 것이다.

정수형인 기본형의 경우 파라미터 x에 단순히 a의 값이 복사되어 대입된다.
따라서 메서드 안에서 값을 받은 변수로 어떠한 조작을 해도 a 변수에 영향을 미치지 않는다.

참조형인 배열의 경우 주소값(참조값)을 복사해서 대입한다. 같은 주소를 가리키는 인스턴스가 하나 더 생기는 것과 같다.
따라서 해당 메모리의 값을 바꾼다면 그 주소값을 가리키는 모든 변수들에게 적용된다.
 */
package section3.mission2;

public class Mission2 {

    public static void main(String[] args) {

        int a = 10;
        int[] array = {1, 2, 3, 4, 5};

        changeInt(a);
        changeArr(array);

        System.out.println(a); // 10, 값만 복사되어 파라미터로!
        System.out.println(array[0]); // 0, 주소값이 복사되어 파라미터로!
    }

    static void changeInt(int x) {
        x = 50; //단순히 복사된 값을 가지는 변수의 값을 변경한다.
    }

    static void changeArr(int[] arr) {
        arr[0] = 0; //주소값의 값을 변경한다.

    }
}
