package CHAP_05;

public class _01_Array {
    public static void main(String[] args) {
        String coffee1 = "아메리카노";
        String coffee2 = "카페모카";
        String coffee3 = "라떼";
        String coffee4 = "카푸치노";

        System.out.println(coffee1);
        System.out.println(coffee2);
        System.out.println(coffee3);
        System.out.println(coffee4);

        System.out.println();

        /////////////////////////////////////////////////////////
        // 첫번째 방법
        String[] coffees = new String[4]; // 문자열로 4개 배열 만들기
        // 두번째 방법
        String coffees1[] = new String[4];
        // 세번째 방법
        String [] coffees2 = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};
        // 네번째 방법
        String [] coffees3 = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";

        for (int i = 0; i < coffees.length; i++) {
            if (i == 2)
                coffees[i] = "에스프레소";
            System.out.println(coffees[i]);
        }

        // 다른 자료형
        int [] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double [] d = new double[] {10.0, 10.1, 10.2, 10.3};
        boolean [] b = {true, true, false};

    }
}
