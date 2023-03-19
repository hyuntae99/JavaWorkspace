package CHAP_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 10;
        boolean morningCoffee = false;

        // 12시 이전 + 모닝커피를 마시지 않았을때
        if (hour < 12 && morningCoffee == false)
            System.out.println("커피 마시자!");
        System.out.println("결정 완료 #1");
        /*if (hour < 12 && !morningCoffee)
            System.out.println("커피 마시자!");*/

        // 2시 이후이거나 모닝커피를 마신 경우
        hour = 15;
        if (hour >= 14 || morningCoffee)
            System.out.println("디카페인 커피 마시자!");
        System.out.println("결정 완료 #2");
    }
}
