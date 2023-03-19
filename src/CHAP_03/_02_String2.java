package CHAP_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // " and" -> ","로 변환
        // 원래 s가 바뀌는 것은 아님
        System.out.println(s);

        // 인덱스 기준 시작지점부터 끝까지 출력
        System.out.println(s.substring(7));
        // "J"부터 출력
        System.out.println(s.substring(s.indexOf("J")));
        // "J"부터 "."전까지!!
        System.out.println(s.substring(s.indexOf("J"), s.indexOf(".")));


        // 공백 제거
        s = "          I love Java.      ";
        System.out.println(s);
        System.out.println(s.replace(" ", "")); // 공백 모두 제거
        System.out.println(s.trim()); // 앞뒤 공백 제거

        String s1 = "   I love Java.        nice!   ";
        // 문자의 시작과 끝을 구분 후, 앞뒤 공백을 제거하는 매커니즘
        System.out.println(s1);
        System.out.println(s1.trim());


        // 문자열 결합
        String a1 = "Java";
        String a2 = "Python";
        System.out.println(a1 + a2); // JavaPython
        System.out.println(a1 + " " + a2); // Java Python
        System.out.println(a1.concat(" ").concat(a2)); // Java Python
        System.out.println(a1.concat(",").concat(a2)); // Java,SPython
    }
}
