package CHAP_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        int max = 20; // 치킨 수량
        int sold = 0; // 판매 수량
        int noShow = 17;
        int i = 0;

        while(true){
            i++;
            System.out.println(i + "번 손님, 치킨 나왔습니다.");
            if (i == noShow) { // 노쇼로 인해서 sold를 ++하지않음!
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }
            sold++;
            if (sold == max){ // sold == max일때, 종료!
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("금일 영업 종료했습니다.");
    }
}
