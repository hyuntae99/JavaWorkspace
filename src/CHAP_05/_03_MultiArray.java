package CHAP_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 2차원 배열 선언
        String [][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        System.out.println(seats[1][2]); // B3

       for (int i = 0; i < seats.length; i++) {
           for (int j = 0; j < seats[i].length; j++)
               System.out.print(seats[i][j] + " ");
           System.out.println();
       }

        ///////////////////////////////////////////////////////////////

        String [][] seats2 = new String[][] {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // A5에 접근 가능...? -> 오류 발생
        // System.out.println(seats2[0][4]);

        ////////////////////////////////////////////////////////////////
        // 3차원 배열
        int [][][] array = new int[][][] {
                { {}, {}, {} },
                { {}, {}, {} },
                { {}, {}, {} }
        };
       int [][][] array1 = new int [3][3][3];

    }
}
