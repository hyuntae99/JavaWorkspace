package CHAP_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // N X N 배열
        String [][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(seats[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        ///////////////////////////////////////////////////////////////
        // 배열이 정사면체가 아닐경우
        String [][] seats2 = new String[][] {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++)
                System.out.print(seats2[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        //////////////////////////////////////////////////////////////
        // 10 X 15 극장의 자리를 선언해보자!
        // String 10 X 15 배열 선언
        String [][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seats3.length; i++)
            for (int j = 0; j < seats3[i].length; j++)
                seats3[i][j] = eng[i] + (j+1);

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
