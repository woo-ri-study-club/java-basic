기본형(Primitive type)과 참조형(Reference type)의 가장 큰 차이점은 메모리 할당 방식과 데이터 저장 방식입니다.

- 기본형은 실제 값을 직접 저장하며, `int`, `double`, `boolean` 등이 해당됩니다. 예를 들어, `int a = 5;`라고 선언하면 a는 5라는 값을 직접 저장합니다.
- 참조형은 객체의 메모리 주소(참조)를 저장합니다. `String`, 배열 등 객체 타입이 참조형에 해당됩니다. 예를 들어, `String s = "hello";`라고 선언하면 s는 "hello"가 저장된 메모리 위치를 참조합니다.

기본형을 새로운 변수에 할당할 경우 값이 복사됩니다. 반면, 참조형을 다른 변수에 할당하면 메모리 주소(참조)가 복사되므로 두 변수가 같은 객체를 가리키게 됩니다.