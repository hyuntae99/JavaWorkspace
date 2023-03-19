package CHAP_04;

public class _QUIZ_04 {
    public static void main(String[] args) {
        int total_pay = 0;
        int pay = 4000;
        int hour = 5;
        boolean smallCar = false;
        boolean disableCar = false;

        total_pay = pay * hour;
        if (total_pay >= 30000)
            total_pay = 30000;
        if (smallCar || disableCar)
            System.out.println("경차, 장애인 차량으로 50% 할인을 적용하여 " + (total_pay / 2) + "원 결제합니다.");
        else
            System.out.println(total_pay + "원 결제합니다.");



        hour = 10;
        smallCar = false;
        disableCar = false;
        total_pay = 0;

        total_pay = pay * hour;
        if (total_pay >= 30000)
            total_pay = 30000;
        if (smallCar || disableCar)
            System.out.println("경차, 장애인 차량으로 50% 할인을 적용하여 " + (total_pay / 2) + "원 결제합니다.");
        else
            System.out.println(total_pay + "원 결제합니다.");


        hour = 10;
        smallCar = true;
        disableCar = false;
        total_pay = 0;

        total_pay = pay * hour;
        if (total_pay >= 30000)
            total_pay = 30000;
        if (smallCar || disableCar)
            System.out.println("경차, 장애인 차량으로 50% 할인을 적용하여 " + (total_pay / 2) + "원 결제합니다.");
        else
            System.out.println(total_pay + "원 결제합니다.");
    }
}
