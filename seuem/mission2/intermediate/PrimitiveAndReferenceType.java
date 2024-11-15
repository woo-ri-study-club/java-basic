package seuem.mission2.intermediate;

public class PrimitiveAndReferenceType {
    public static void main(String[] args) {
        int primitive=100;
        int[] reference= {100,20};
        System.out.println("primitive = " + primitive);
        System.out.println("reference = " + reference); //값이 들어있는 메모리 위치에 들어있다.
        for (int i : reference) {
            System.out.println("reference = " + i);
        }


        primitiveType(primitive); // 변수의 값만 전달.
        referenceType(reference); // 변수의 주소값만 전달.


        System.out.println("changed primitive = " + primitive);
        // 값이 바뀌지 않은건 새롭게 생긴 변수에 값만 전달한거라, 메서드 안에 새롭게 만든 변수값이 20으로 변경된거고 메서드가 끝나고 메모리에서 primitive=20;은 사라진다.
        System.out.println("changed reference = " + reference); // 주소가 같다.
        for (int i : reference) {
            System.out.println("changed reference = " + i); //주소값을 메서드에 넘겨줘서 값들이 변경되어있다.
        }

    }

    public static void primitiveType(int primitive) {
        primitive=20; //인테리제이에서 보면 메서드 안에 primitive 라는 변수색이 회색이다 (사용되지 않는변수는 회색으로 뜬다)
    }

    public static void referenceType(int[] reference) {
        for (int i = 0; i < reference.length; i++) {
            reference[i]*=2;
        }
    }
}
