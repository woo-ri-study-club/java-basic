package mission2.middle;

public class PrimitiveParameter {
    public static void main(String[] args) {
        int number = 10;

        System.out.println("함수 호출 전 number: " + number);

        changeParamter(number);
        System.out.println("함수 호출 후 number: " + number);
    }

    private static void changeParamter(int number) {
        number++;
    }
}
