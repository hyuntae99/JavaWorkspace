package STUDY_MORE._22_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to divide : ");
            int x = sc.nextInt();
            System.out.println("Enter a whole number to divide by : ");
            int y = sc.nextInt();
            // y = 0이면 오류가 발생하여 프로그램이 종료됨. -> ArithmeticException
            System.out.println("result : " + x / y);
        }
        // 오류로 종료하지 않고 아래의 메세지를 출력함.
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Pleas enter a number!");
        } catch (Exception e) { // 모든 오류를 초함
            System.out.println("Something went wrong");
        }
        finally { // 마지막에 무조건 실행됨.
            sc.close(); // 보통 Scanner를 종료하는데 사용함.
        }
    }

}
