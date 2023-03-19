package CHAP_04;

public class _03_ElseIf {
    public static void main(String[] args) {

        boolean Ade = true;
        boolean Juice = true;

        if (Ade)
            System.out.println("에이드 +1");
        else if (Juice)
            System.out.println("주스 +1");
        else
            System.out.println("아메리카노 +1");
        System.out.println("주문 완료 #1"); // 에이드


        Ade = false;
        Juice = true;

        if (Ade)
            System.out.println("에이드 +1");
        else if (Juice)
            System.out.println("주스 +1");
        else
            System.out.println("아메리카노 +1");
        System.out.println("주문 완료 #2"); // 주스


        Ade = false;
        Juice = false;

        if (Ade)
            System.out.println("에이드 +1");
        else if (Juice)
            System.out.println("주스 +1");
        else
            System.out.println("아메리카노 +1");
        System.out.println("주문 완료 #3"); // 아메리카노

    }
}
