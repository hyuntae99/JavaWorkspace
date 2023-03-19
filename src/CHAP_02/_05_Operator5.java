package CHAP_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참일떄) : (거짓일때)
        int x = 5;
        int y = 3;

        // x > y이면 max = x, x <= y이면 max = y
        int max = (x > y) ? x : y; // 5
        System.out.println(max);

        // x > y이면 max = y, x <= x이면 max = y
        int min = (x > y) ? y : x; // 3
        System.out.println(min);


        // bool 연산자도 가능
        boolean b_1 = (x == y) ? true : false;
        System.out.println(b_1); // false
        boolean b_2 = (x == y) ? false : true;
        System.out.println(b_2); // true


        // 문자열도 가능
        String s = (x == y) ? "same" : "different";
        System.out.println(s); // different

    }
}
