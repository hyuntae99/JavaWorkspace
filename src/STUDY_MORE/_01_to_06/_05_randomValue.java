package STUDY_MORE._01_to_06;

import java.util.Random;

public class _05_randomValue {
    public static void main(String[] args) {

        Random random = new Random();

        // 임의의 정수 (0 ~ 설정값)
        for (int i = 0; i < 3; i++) {
            // 1 ~ 6까지의 임의의 정수
            int x = random.nextInt(6)+1;
            System.out.println(x);
        }
        System.out.println();

        // 임의의 실수 (0 ~ 1)
        for (int i = 0; i < 3; i++) {
            double y = random.nextDouble();
            System.out.println(y);
        }
        System.out.println();

        // 임의의 boolean값
        for (int i = 0; i < 3; i++) {
            boolean z = random.nextBoolean();
            System.out.println(z);
        }
    }
}
