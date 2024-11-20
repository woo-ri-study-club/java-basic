## 초급

final 키워드를 사용하여 상수 PI와 반지름을 가지는 간단한 Circle 클래스를 작성하세요. 반지름이 주어졌을 때 원의 넓이를 계산하는 calculateArea 메서드를 추가하세요. PI 값은 변경되지 않아야 합니다.

### 요구사항
- PI는 상수로 정의되어야 합니다.
- 반지름은 생성자를 통해 초기화되어야 합니다.
- calculateArea 메서드는 원의 넓이를 반환해야 합니다.

## 중급

final 변수를 활용하여 객체 참조의 불변성을 확인하는 코드를 작성하세요.
다음 요구사항을 만족하는 코드를 작성하세요.
- Person 클래스는 name 필드를 가지며, name은 변경 가능한 변수입니다.
- final로 선언된 Person 객체를 생성하고, name을 변경해도 객체 자체의 참조를 변경할 수 없음을 보여주는 코드를 작성하세요.
- 실행 결과와 설명을 코드 주석에 적으세요.

## 고급

도서 관리 시스템을 구현하세요. 이 시스템은 final 키워드를 활용하여 중요한 값을 보호해야 합니다.

### 요구사항
- Library 클래스는 최대 도서 수를 MAX_BOOKS라는 상수로 가지고, 한 번 설정되면 변경되지 않습니다.
- Book 클래스는 title과 author를 포함하며, 도서 정보를 변경할 수 없습니다. 이를 final 필드로 구현하세요.
- Library 클래스는 도서를 추가하는 addBook 메서드와 전체 도서를 출력하는 showBooks 메서드를 가져야 합니다.
- addBook 메서드는 최대 도서 수를 초과하지 않도록 검증해야 합니다.
e
### 출력 예시
``` java
Library library = new Library();
library.addBook(new Book("소년이 온다", "한강"));
library.addBook(new Book("1984", "George Orwell"));
library.showBooks();
```

### 출력 결과
``` shell
소년이 온다 by 한강
1984 by George Orwell
```