package STUDY_MORE._01_to_06;

public class _06_Use_printf {
    public static void main(String[] args) {
        // printf 사용법
        System.out.printf("This is a format string\n", 123);
        System.out.printf("This is a format string %d\n", 123); // int
        System.out.printf("This is a %d format string\n", 123);

        System.out.printf("This is a format string %c\n", 'A'); // char
        System.out.printf("This is a format string %s\n", "ABC"); // String
        System.out.printf("This is a format string %b\n", true); // boolean
        System.out.printf("This is a format string %f\n", 3.14); // double

        /////////////////////////////////////////////////////////////////////////

        // 10칸을 배정함. -> 빈칸 3 + HYUNTAE
        System.out.printf("Hello %s\n", "HYUNTAE");
        System.out.printf("Hello %10s\n", "HYUNTAE");

        // 소수점 자리 제한 -> 1000.00
        System.out.printf("You have this much money %f\n",1000.0);
        System.out.printf("You have this much money %.2f\n",1000.0);

        // 1,000 표시
        System.out.printf("You have this much money %,f\n",1000.0);

        // 10칸 배정 + 1,000 표시 + 소수점 2번째까지
        System.out.printf("You have this much money %,10.2f\n",1000.0);
    }
}
