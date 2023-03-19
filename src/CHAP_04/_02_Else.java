package CHAP_04;

public class _02_Else {
    public static void main(String[] args) {

        int hour = 10;
        if (hour < 12)
            System.out.println("아이스 아메리카노");
        else
            System.out.println("디카페인 아이스 아메리카노");
        System.out.println("주문 완료 #1");

        hour = 15;
        if (hour < 12)
            System.out.println("아이스 아메리카노");
        else
            System.out.println("디카페인 아이스 아메리카노");
        System.out.println("주문 완료 #2");

        //////////////////////////////////////////////////////////////

        hour = 15;
        boolean Coffee = true;

        // 2시 이후이거나 커피를 마셨으면 디카페인
        if (hour >= 14 || Coffee)
            System.out.println("디카페인");
        else
            System.out.println("아메리카노");
        System.out.println("주문 완료 #3");

    }
}
