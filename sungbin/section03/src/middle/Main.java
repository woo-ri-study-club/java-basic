package middle;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        int[] arr = {1, 2, 3};

        System.out.println("변경 전 number = " + number);
        System.out.println("변경 전 arr[0] = " + arr[0]);

        number = modifyNumber(number);
        modifyArray(arr);

        System.out.println("변경 후 number = " + number);
        System.out.println("변경 후 arr[0] = " + arr[0]);
    }

    static int modifyNumber(int number) {
        return number + 10;
    }

    static void modifyArray(int[] array) {
        array[0] += 10;
    }
}
