package middle;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        int[] arr = {1, 2, 3};

        System.out.println("변경 전 number = " + number);
        System.out.println("변경 전 arr[0] = " + arr[0]);

        modifyValues(number, arr);

        System.out.println("변경 후 number = " + number);
        System.out.println("변경 후 arr[0] = " + arr[0]);
    }

    static void modifyValues(int number, int[] array) {
        number += 10;
        array[0] += 10;
    }
}
