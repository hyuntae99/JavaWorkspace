package CHAP_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산자
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        // 정수 나누기이므로
        System.out.println(5 / 2); // 2
        System.out.println(2 / 4); // 0
        // 나머지 연산자
        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1


        // 우선 순위 연산 (사칙연산 규칙)
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8


        // 증감 연산 (++, --)
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 (실행 후 ++)
        System.out.println(val); // 11
        System.out.println(++val); // 12 (++ 후 실행)
        System.out.println(val); // 12


        // 은행 대기번호 표
        int waitting = 0;
        System.out.println("현재 대기 인원 : " + waitting++); // 0
        System.out.println("현재 대기 인원 : " + waitting++); // 1
        System.out.println("현재 대기 인원 : " + waitting++); // 2
        System.out.println(waitting); // 3
    }
}
