package CHAP_04;

public class _04_SwitchCase {
    public static void main(String[] args) {

        // 1등 : 전액 장학금
        // 2,3등 : 반액 장학금
        // 그 외 : 대상 아님.
        int ranking = 1;
        if (ranking == 1)
            System.out.println("전액 장학금");
        else if (ranking == 2)
            System.out.println("반액 장학금");
        else if (ranking == 3)
            System.out.println("반액 장학금");
        else
            System.out.println("대상 아님");
        System.out.println("조회 완료 #1");


        //////////////////////////////////////////////////////////

        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("대상 아님");
        }
        System.out.println("조회 완료 #2");

        // case 통합
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("대상 아님");
        }
        System.out.println("조회 완료 #3");


        /////////////////////////////////////////////////////////////////////

        // 등급에 따라 가격을 책정
        int grade = 1;
        int price = 7000;

        // break를 활용해서 연산이 가능!
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급의 가격은 " + price + "입니다.");
    }
}
