## 고급

간단한 회원 관리 시스템을 설계하세요. User와 Account 클래스를 만들고, 각각의 클래스에 public, protected, private, default 접근 제어자를 사용하여 필드와 메서드를 설정하세요. Account 클래스에서는 User의 비밀번호를 외부에서 직접 수정할 수 없도록 하며, User 클래스의 비공개 필드에 접근하기 위해 필요한 메서드를 설계하세요. 이 설계가 어떻게 캡슐화를 달성하고 보안을 강화하는지 설명하세요.

>- User 클래스:  
>  - `userId`와 `password` 필드는 private로 설정되어 외부에서 직접 접근 불가  
>     사용자 ID와 비밀번호에 직접 접근할 수 없고 임의로 수정 불가
>  - 비밀번호 변경은 changePassword() 메서드를 통해서 가능,  
>    내부적으로 validatePassword()를 호출하여 기존 비밀번호 확인
>  - validatePassword는 private로 설정되어 외부에서 직접 호출 불가
>- Account 클래스:
>  - user, ACCOUNT_NUMBER, balance 필드가 private으로 설정되어 외부 접근 불가  
>    계좌 정보와 잔액을 보호하고 임의로 수정할 수 없음 
>
>  - getAccountInfo() 를 통해 계좌 정보 확인  
>    user.getUserId()를 호출하여 요청한 사용자와 계좌 사용자가 일치하는지 확인
>  - changePassword() 메서드를 통해 User 객체의 비밀번호 변경  
>    User 클래스의 메서드 호출 
> 
> 
