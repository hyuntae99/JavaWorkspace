package CHAP_06;

public class _02_Parameter {
    // 거듭제곱 메소드
    public static void power_method (int i){
        int result = i * i;
        System.out.println(i + "의 거듭제곱은 " + result + "입니다.");
    }

    // 여러 인수가 있는 함수
    public static void powerByExp (int num, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++)
            result *= num;
        System.out.println(num + "의 " + exp + "승은 " + result + "입니다.");
    }

    // 메인 함수
    public static void main(String[] args) {
        // 인수
        power_method(10);
        System.out.println();

        // for문 활용
        for(int i = 5; i < 10; i++)
            power_method(i);
        System.out.println();

        // 여러 인수가 있는 함수
        powerByExp(2,3);
        powerByExp(3,4);
        powerByExp(10,0);
    }
}
