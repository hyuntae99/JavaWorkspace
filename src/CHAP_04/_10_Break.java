package CHAP_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        int i = 0;
        while(true){
            if (i == 20) {
                System.out.println("끝!");
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("루프 종료");
    }
}
