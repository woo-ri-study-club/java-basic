## 초급

---
자바에서 기본형과 참조형의 차이를 설명하세요. 각각의 예를 들어보고, 새로운 변수에 할당할 때 어떻게 다르게 동작하는지 설명해보세요.

> 
> 자바에서 타입은 기본형과 참조형으로 나눌 수 있다.  
> 기본형은 실제 값을 저장하는 데이터 타입이고, 참조형은 메모리 참조주소를 저장하는 데이터 타입이다.  
>   
> 기본형 타입에는 byte, short, int, long, float, double, char, boolean 형이있다.   
> 그 외에 클래스, 배열 기본형이 아닌 타입은 모두 참조형이다.  
> 기본형의 기본값은 타입에 따른 기본값이다, 예를 들어 int형은 0, boolean은 false이다. 참조형의 기본값은 null이다.  
>  
> 기본형을 새로운 변수에 할당할 때는 그 값을 복사해서 넣는다.  
> ``int a = 10;  ``  
> ``int b = a; ``  
> b의 값은 10이다.  
> 
> 참조형을 새로운 변수에 할당할 때는 그 주소값을 복사해서 넣는다.  
> `` Data data1 = new Data();  ``  
> `` Data data2 = data1;  ``  
> data1의 참조주소값이 x001이라면 data2의 참조주소값도 x001이 된다.

## 중급

---
기본형과 참조형을 메서드의 매개변수로 전달할 때 동작 방식이 어떻게 다른지 보여주는 자바 프로그램을 작성하세요.

- 정수형(int)과 배열(array)을 매개변수로 받아 각각을 수정하려고 시도하는 메서드를 정의하세요.
````java
static void changeInt(int value){
  value =10;
}

static void changeArray(int[] array){
  array[0] = 10;
}
````

- 실행 결과를 관찰하고, 기본형과 참조형이 메서드 호출 시 어떻게 다르게 동작하는지 설명하세요.
````java
public static void main(String[] args) {

        int intValue =5;
        System.out.println("changeInt()함수 호출 전 intValue 값: "+intValue);
        changeInt(intValue);
        System.out.println("changeInt()함수 호출 후 intValue 값: "+intValue);

        int[] array ={1,2,3};
        System.out.println("changeArray()함수 호출 전 array[0] 값: "+array[0]);
        changeArray(array);
        System.out.println("changeArray()함수 호출 후 array[0] 값: "+array[0]);

    }
````
>실행결과  
>changeInt()함수 호출 전 intValue 값: 5  
>changeInt()함수 호출 후 intValue 값: 5  
>changeArray()함수 호출 전 array[0] 값: 1  
>changeArray()함수 호출 후 array[0] 값: 10  
> 
>changeInt 메서드에 기본형 변수가 전달될때, 값의 복사가 일어난다. 메서드에서 값을 변경해도 원래 변수에는 영향을 미치지 않는다.  
>changeArray메서드에 배열이 전달될때는, 배열의 참조주소가 전달된다.  
> 매서드 내에서 배열의 내용을 변경하면 원래 배열의 주소값을 참조하기 때문에 원래 배열의 값이 변하게 된다.



## 고급

---
참조형의 null 값과 NullPointerException 문제를 다루는 미니 프로젝트를 만들어 보세요.

- 여러 Book 객체를 포함하는 간단한 Library 클래스를 설계하세요.
- 책을 추가하고, 제목으로 책을 검색하고, 책의 세부 정보를 표시하는 메서드를 구현하세요.
- Book 객체 중 하나를 null로 남겨두고, 메서드를 통해 접근해 보세요.
- 참조형을 다룰 때 NullPointerException이 발생하는 이유를 설명하고, 이를 방지하는 방법을 제안해 보세요.

📎 [Library.java](./Library.java)

> serchBook() 메소드를 통해 배열 books에 접근해서 book.getTitle()을 통해 제목 값에 접근하는데   
> book객체가 null이라 NullPointerException이 터졌다.  
> 그래서 book이 null인지 아닌치 체크하는 구문(book!=null)을 if문에 넣어줬다. 