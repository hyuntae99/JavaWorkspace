package CHAP_04;

public class _06_While {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;

        while (move < distance) {
            System.out.println("현재 거리 : " + move);
            move += 3;
        }
        System.out.println("도착!");
    }
}
