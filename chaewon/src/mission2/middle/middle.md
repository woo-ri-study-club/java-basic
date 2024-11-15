# 중급
> 기본형과 참조형을 메서드의 매개변수로 전달할 때 동작 방식이 어떻게 다른지 보여주는 자바 프로그램을 작성하세요.

- 정수형(int)과 배열(array)을 매개변수로 받아 각각을 수정하려고 시도하는 메서드를 정의하세요.
- 실행 결과를 관찰하고, 기본형과 참조형이 메서드 호출 시 어떻게 다르게 동작하는지 설명하세요.


### 기본형
```java
package mission2.middle;

public class PrimitiveParameter {
    public static void main(String[] args) {
        int number = 10;

        System.out.println("함수 호출 전 number: " + number);

        changeParamter(number);
        System.out.println("함수 호출 후 number: " + number);
    }

    private static void changeParamter(int number) {
        number++;
    }
}

```

두 출력문에 대한 결과는 동일하다.
1. `changeParameter()`의 매개변수에 `number`의 복사 값이 들어온다.
2. 복사된 값 자체만 변동되었기 때문에, 원래의 `number` 변수는 변하지 않는다.


### 참조형
```java
public class RefParameter {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4, 5};

        for (int number : numberArray) {
            System.out.println(number);
        }

        System.out.println("===========================");

        changeParamter(numberArray);
        for (int number : numberArray) {
            System.out.println(number);
        }
    }

    private static void changeParamter(int[] numberArray) {
        numberArray[0]++;
    }
}
```
이번에는 두 개의 출력문의 결과가 다르다.
1. `changeParameter()`의 매개변수에 `numberArray`의 복사 값(= `numberArray`의 주소)이 들어온다.
2. **동일**한 주소지에 대한 배열의 일부가 변경되었으므로, `numberArray`의 데이터 값 역시 변경된다.