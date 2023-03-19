package CHAP_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 : 정보교환을 위한 미국 표준 코드
        // 대문자(A)는 65부터, 소문자(a)는 97부터, 숫자(0)은 48부터
        char c = 'A'; // char -> ' '
        System.out.println(c); // A
        System.out.println((int)c); // 65

        c = 'B';
        System.out.println(c); // B
        System.out.println((int)c); //66

        c++;
        System.out.println(c); // C
        System.out.println((int)c); // 67

        c = 'a';
        System.out.println(c); // a
        System.out.println((int)c); // 97

        c = 'b';
        System.out.println(c); // b
        System.out.println((int)c); // 98

        c = '0';
        System.out.println(c); // 0
        System.out.println((int)c); // 48

        c++;
        System.out.println(c); // 1
        System.out.println((int)c); // 49


        ////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////
        // 10 X 15 극장의 자리를 선언해보자!
        // String 10 X 15 배열 선언
        String [][] seats3 = new String[10][15];
        // String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++)
                // 문자열 배열이므로 ch를 문자열로 변환
                // 문자열 + 숫자 = 문자열
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            ch++;
        }

        // H9, H10을 구매한다.
        seats3[7][8] = "  ";
        seats3[7][9] = "   ";

        // 출력
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++)
                System.out.print(seats3[i][j] + " ");
            System.out.println();
        }
    }
}
