package CHAP_06;

public class _07_VariableScope {
    public static void methodA() {
        //System.out.println(number);
    }

    public static void methodB() {
        // 지역변수 (methodB에서만 사용가능)
        int number1 = 2;
    }
    // 메인 함수
    public static void main(String[] args) {
        // 지역변수 (main에서만 사용가능)
        int number = 3;

        //System.out.println(number1);

        for (int i = 0; i < 5; i++)
            // i는 for의 지역변수
            System.out.println(i);
        //System.out.println(i);

        {
            int j = 0; // 해당 {}의 지역변수
            System.out.println(j);
            System.out.println(number); // number는 main의 지역변수로 가능!
        }
        //System.out.println(j);
    }
}
