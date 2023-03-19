package STUDY_MORE._01_to_06;// Scanner를 사용하기 위한 라이브러리
import java.util.Scanner;

public class _01_InputAndOutput {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner scanner = new Scanner(System.in);
        // int형으로 받아 i에 저장
        // int i = sc.nextInt();

        while (scanner.hasNextInt()) // 사용자 입력값이 정수일때 true.
            System.out.println(scanner.nextInt() * 1000);
        //키보드 입력은 상관이 없지만 파일 입력을 할떄는 마지막에 꼭 해줘야함!
        // scanner.close();

        ////////////////////////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine(); // \n을 탈출문자로
        System.out.println("How old are you?");
        int age = sc.nextInt(); // int만 받고 탈출

        sc.nextLine(); // 사용하면 \n을 처리할 수 있음.

        System.out.println("What do you like?");
        String food = sc.nextLine(); // \n이 남아있으므로 바로 종료됨.

        System.out.println("Hello " + name);
        System.out.println("You are " + age + "years old");
        System.out.println("You like " + food);

    }
}
