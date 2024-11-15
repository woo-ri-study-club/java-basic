package mission02;

public class MediumEx {

    public static void main(String[] args) {

        int intValue =5;
        System.out.println("changeInt()함수 호출 전 intValue 값: "+intValue);
        changeInt(intValue);
        System.out.println("changeInt()함수 호출 후 intValue 값: "+intValue);

        int[] array ={1,2,3};
        System.out.println("changeArray()함수 호출 전 array[0] 값: "+array[0]);
        changeArray(array);
        System.out.println("changeArray()함수 호출 후 array[0] 값: "+array[0]);

    }
    static void changeInt(int value){
        value =10;
    }

    static void changeArray(int[] array){
        array[0] = 10;
    }
}
