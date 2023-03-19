package CHAP_02;

public class _QUIZ_02 {
    public static void main(String[] args) {
        // 데이터
        int tall_1 = 115;
        int tall_2 = 121;

        // 키가 120cm 이상일때만 탑승 가능.
        String result_1 = (tall_1 >= 120) ? "가능" : "불가능";
        String result_2 = (tall_2 >= 120) ? "가능" : "불가능";

        // 결과
        System.out.println("키가 " + tall_1 + "cm 이므로 탑승 " + result_1 + "합니다");
        System.out.println("키가 " + tall_2 + "cm 이므로 탑승 " + result_2 + "합니다");
    }
}
