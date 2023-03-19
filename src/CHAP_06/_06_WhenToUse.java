package CHAP_06;

public class _06_WhenToUse {
    public static int getPowerByExp(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++)
            result *= num;
        return result;
    }

    // 함수 내 함수 호출
    public static int getPower(int num) {
        return getPowerByExp(num, 2);
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승
        int result = 1;
        for (int i = 0; i < 2; i++)
            result *= 2;
        System.out.println(result);

        // 3의 3승
        result = 1;
        for (int i = 0; i < 3; i++)
            result *= 3;
        System.out.println(result);

        // 4의 4승
        result = 1;
        for (int i = 0; i < 4; i++)
            result *= 4;
        System.out.println(result);
        System.out.println();

        ////////////////////////////////////////////////////////////////
        // 함수 이용 -> 코드의 중복을 줄일 수 있다.
        // 즉, 수정이 편하다.
        for (int i = 2 ; i <= 4; i++)
            System.out.println(getPowerByExp(i,i));

    }
}
