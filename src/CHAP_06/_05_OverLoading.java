package CHAP_06;

public class _05_OverLoading {
    // 같은 함수 이름, 다른 함수 내용 -> 통합됨.
    // 인수가 int일때
    public static int getPower (int number){
        return number*number;
    }

    // 반환 타입은 상관이 없음!
//    public static double getPower (int number){
//        return 0.0;
//    }

    // 인수가 String일때
    public static int getPower (String strNumber){
        // String을 int로 변환
        int number = Integer.parseInt(strNumber);
        return number*number;
    }
    // 인수가 2개일때
    public static int getPower (int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++)
            result *= num;
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러번 선언
        // 1. 전달 값의 타입이 다르거나
        // 2. 전달 값의 개수가 다르거나
        // 반환 타입은 상관이 없음!
        System.out.println(getPower(10)); // 10 * 10 = 100
        System.out.println(getPower("30")); // 30 * 30 = 900
        System.out.println(getPower(3,3)); // 3^3 = 27
    }
}
