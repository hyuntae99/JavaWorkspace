package CHAP_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance = 25; // 전체 거리
        int move = 0; // 이동 거리
        int tall = 2; // 키

        while (move + tall < distance) {
            System.out.println("현재 거리 : " + move);
            move += 3;
        }
        System.out.println("도착!");


        ///////////////////////////////////////////////////

        // 거인이라면?
        move = 0;
        tall = 25;
        while (move + tall < distance) {
            System.out.println("현재 거리 : " + move);
            move += 3;
        }
        System.out.println("도착!");


        // Do While문
        move = 0;
        do { // 무조건 한번은 실행된다!
            System.out.println("현재 거리 : " + move);
        } while (move + tall < distance);
        System.out.println("도착!");

    }
}
