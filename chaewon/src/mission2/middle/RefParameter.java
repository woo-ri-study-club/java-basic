package mission2.middle;

public class RefParameter {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4, 5};

        for (int number : numberArray) {
            System.out.println(number);
        }

        System.out.println("===========================");

        changeParamter(numberArray);
        for (int number : numberArray) {
            System.out.println(number);
        }
    }

    private static void changeParamter(int[] numberArray) {
        numberArray[0]++;
    }
}
