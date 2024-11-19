> 간단한 Java 클래스를 작성하여 public, protected, default, private 접근 제어자를 각각 필드와 메서드에 적용해보세요.

```java
package mission6.easy.somePack;

public class StudyAccess {
    public int publicCount;
    protected int protectedCount;
    int defaultCount;
    private int privateCount;

    public int addPublicCount() {
        return publicCount++;
    }

    protected int addProtectedCount() {
        return protectedCount++;
    }

    int addDefaultCount() {
        return defaultCount++;
    }

    private int addPrivateCount() {
        return privateCount++;
    }

    public void printAllCount(){
        System.out.println("publicCount = " + publicCount);
        System.out.println("protectedCount = " + protectedCount);
        System.out.println("defaultCount = " + defaultCount);
        System.out.println("privateCount = " + privateCount);
    }
}
```

각각의 다른 접근 제어자 필드를 갖는 클래스를 작성하였다. 

### 1. 동일 패키지 내에서 필드와 메서드 접근

```java
package mission6.easy.somePack;

public class StudyAccessMain {
    public static void main(String[] args) {
        StudyAccess studyAccess = new StudyAccess();

        studyAccess.publicCount++;
        studyAccess.addPublicCount();

        studyAccess.protectedCount++;
        studyAccess.addProtectedCount();

        studyAccess.defaultCount++;
        studyAccess.addDefaultCount();

        studyAccess.privateCount++;
        studyAccess.addPrivateCount();

        studyAccess.printAllCount();
    }
}
```

동일 패키지 내의 접근이기에 public, default, protected는 접근이 가능하지만, private는 컴파일 에러가 발생한다.

### 2. 다른 패키지에서 필드와 메서드 접근
```java
package mission6.easy.otherPack;

import mission6.easy.somePack.StudyAccess;

public class StudyAccessOtherMain {
    public static void main(String[] args) {
        StudyAccess studyAccess = new StudyAccess();

        studyAccess.publicCount++;
        studyAccess.addPublicCount();

        studyAccess.protectedCount++;
        studyAccess.addProtectedCount();

        studyAccess.defaultCount++;
        studyAccess.addDefaultCount();

        studyAccess.privateCount++;
        studyAccess.addPrivateCount();

        studyAccess.printAllCount();
    }
}
```

위와 동일한 코드임에도 public 외의 모든 접근에서 에러가 발생한다!

### 3. 상속을 통한 protected 접근 확인
```java
public class StudyAccessInheritance extends StudyAccess {
    public StudyAccessInheritance() {
        super();

        this.publicCount++;
        this.addPublicCount();

        this.protectedCount++;
        this.addProtectedCount();

        this.defaultCount++;
        this.addDefaultCount();

        this.privateCount++;
        this.addPrivateCount();
    }
}
```

`StudyAccess` 클래스를 상속하는 별도의 클래스를 생성했다. 이전의 코드와 동일한 로직을 작성하면, default와 private의 접근만 에러가 발생한다.

<br/>

---


> 각 접근 제어자가 다른 클래스 또는 동일 패키지에서 어떻게 접근 가능한지 설명하세요.
- public
  - 모든 외부 접근 허용
- protected
  - 동일 패키지 혹은 상속 관계 허용
- default
  - 동일 패키지만 허용
- private
  - 모든 외부 접근 불가