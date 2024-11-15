package mission2;

import java.util.Arrays;

public class TypeMain {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("메서드 호출 전 number: " + number);
        modifyPrimitive(number);
        System.out.println("메서드 호출 후 number: " + number);

        int[] array = {1, 2, 3};
        System.out.println("메서드 호출 전 array: " + Arrays.toString(array));
        modifyReference(array);
        System.out.println("메서드 호출 후 array: " + Arrays.toString(array));
    }

    private static void modifyPrimitive(int number) {
        number = 20;
        System.out.println("modifyPrimitive 내의 number: " + number);
    }

    private static void modifyReference(int[] array) {
        array[0] = 10;
        System.out.println("modifyReference 내의 array: " + Arrays.toString(array));
    }
}
