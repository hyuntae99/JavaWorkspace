package CHAP_06;

public class _04_ParameterAndReturn {
    // 거듭제곱 함수
    public static int getPower(int num) {
        int result = num * num;
        return result;
        // return num * num;
    }

    public static int getPowerByExp(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++)
            result *= num;
        return result;
    }

    // 메인 함수
    public static void main(String[] args) {
        int retVal = getPower(2); // 2 * 2 = 4
        System.out.println(retVal);

        System.out.println(getPowerByExp(2,3)); // 2^3 = 8
    }
}
