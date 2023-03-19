package CHAP_03;

import java.util.SplittableRandom;

public class _QUIZ_03 {
    public static void main(String[] args) {
        String Personal_Id = "991202-1009510";

        // 인덱스 0 ~ 7까지 출력!
        System.out.println("주민등록번호는 " + Personal_Id.substring(0,8) + "XXXXXX입니다.");

        // "-"의 위치 : 6
        // 7까지 출력해야하므로 +2를 해준다.
        System.out.println("주민등록번호는 " + Personal_Id.substring(0,Personal_Id.indexOf("-")+2) + "XXXXXX입니다.");
    }
}
