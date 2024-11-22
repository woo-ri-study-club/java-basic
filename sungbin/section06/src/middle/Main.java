package middle;

import com.example.utility.MathHelper;

public class Main {
    public static void main(String[] args) {
        MathHelper mathHelper = new MathHelper();
        int result = mathHelper.add(5, 3);

        System.out.println("결과: " + result);
    }
}
