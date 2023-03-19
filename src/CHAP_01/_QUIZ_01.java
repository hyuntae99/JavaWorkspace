package CHAP_01;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class _QUIZ_01 {
    public static void main(String[] args) {
        // 버스번호 (5615, 관악08)
        String busNum = "관악08";
        // 남은 시간 (3분, 5분)
        int minute = 3;
        // 남은 거리 (1.5km, 0.8km)
        double distance = 1.2;

        System.out.println(busNum + "번 버스가 약 " + minute + "분 후에 도착합니다.");
        System.out.println("남은 거리는 " + distance + "km입니다.");

    }
}
