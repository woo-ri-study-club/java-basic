/*
private 접근 제어자를 가지는 level은 클래스 외부에서 접근할 수 없다.
그 와 관련된 validLevel 메서드도 private으로 외부에서 접근을 못하면서 내부의 유효성 검사 책임을 가지도록 캡슐화 되어있다.

public 접근 제어자를 가지는 count는 모든 외부에서의 접근이 가능하다.
default 접근 제어자를 가지는 name은 같은 패키지 내에서의 접근이 가능하다.
결국 이 두 필드는 클래스 외부에서 직접적인 값 변경이 가능하므로 주의가 필요하며 시스템적으로 좋지 못한 설계이다.

protected 접근 제어자를 가지는 errorLog 메서드는 패키지 내 혹은 상속 관계의 경우 접근이 가능하다.
자식 클래스에서 오버라이드해서 사용할 수 있다. 하지만 남용한다면 캡슐화가 깨질 수 있다.
 */
package section7.mission1;

public class AccessTest {
    private int level;
    public int count = 0;
    String name;

    protected void errorLog() {

    }

    public void checkName() {
        if(validLevel()){
            System.out.println(name);
        }
    }

    private boolean validLevel() {
        return level >= 2;
    }

}
