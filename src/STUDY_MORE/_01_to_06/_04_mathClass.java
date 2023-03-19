package STUDY_MORE._01_to_06;

import java.util.Scanner;

public class _04_mathClass {
    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        System.out.println(Math.abs(y)); // 절댓값

        System.out.println(Math.max(x,y)); // 최대값
        System.out.println(Math.min(x,y)); // 최솟값

        System.out.println(Math.sqrt(9)); // 루트

        System.out.println(Math.round(3.124)); // 반올림
        System.out.println(Math.round(3.61)); // 반올림

        System.out.println(Math.ceil(3.2)); // 올림
        System.out.println(Math.floor(3.6)); // 내림

        // 피타고라스 정리 이용하기
        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side x : ");
        a = sc.nextDouble();
        System.out.println("Enter side y : ");
        b = sc.nextDouble();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println(c);
        sc.close();;


    }
}
