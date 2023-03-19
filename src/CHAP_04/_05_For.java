package CHAP_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문

        /* System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");*/

        for (int i = 0; i < 4; i++)
            System.out.println("안녕 " + i);


        // 짝수만 출력
        for (int i = 0; i < 10; i+=2)
            System.out.print(i);
        System.out.println();
       for (int i = 0; i < 10; i++)
            if (i % 2 == 0)
                System.out.print(i);
        System.out.println();

        // 홀수만 출력
        for (int i = 1; i < 10; i+=2)
            System.out.print(i);
        System.out.println();
        for (int i = 0; i < 10; i++)
            if (i % 2 == 1)
                System.out.print(i);
        System.out.println();

        // 거꾸로
        for (int i = 5; i > 0; i--)
            System.out.print(i);
        System.out.println();

        // 1 ~ 10까지의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += i;
        System.out.println(sum); // 55
    }
}
