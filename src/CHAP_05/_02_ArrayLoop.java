package CHAP_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String [] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // for문 -> 인덱스 값을 이용가능!
        for (int i = 0; i < coffees.length; i++)
            System.out.println((i+1) + "번째 커피 : " + coffees[i]);
        System.out.println();

        // for-each 반복문 -> 간단하게 출력가능!
        // foreach -> 자동완성
        int i = 0;
        for (String coffee : coffees) {
            i++;
            System.out.println(i + "번째 커피 : " + coffee);
        }
        System.out.println();
    }
}
