import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TypeParameterTest {
    @DisplayName("기본형 매개변수 전달을 하면 값이 변경되지 않는다.")
    @Test
    void primitiveType() {
    	// given
        int a = 10;
    	// when
        changeInteger(a);
    	// then
        Assertions.assertEquals(10, a);
    }

    private void changeInteger(int a) {
        a = 20;
    }

    @DisplayName("참조형 매개변수 전달을 하면 값이 변경된다.")
    @Test
    void referenceType() {
    	// given
        int[] arr = {1, 2, 3, 4, 5};
    	// when
        changeArray(arr);
    	// then
        Assertions.assertEquals(100, arr[0]);
    }

    private void changeArray(int[] arr) {
        arr[0] = 100;
    }
}
