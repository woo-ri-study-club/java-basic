package mission2.easy;

public class EasyEx {
    public static void main(String[] args) {
        TypeEx typeEx = new TypeEx();

        System.out.println(typeEx); //mission2.easy.TypeEx@4eec7777
        System.out.println(typeEx.forPrint()); //integerType=0, booleanType=false
    }
}

class TypeEx {
    int integerType;
    boolean booleanType;

    public String forPrint() {
        return "integerType=" + integerType + ", booleanType=" + booleanType;
    }
}
