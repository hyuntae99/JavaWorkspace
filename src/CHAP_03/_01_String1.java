package CHAP_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29 -> 공백 포함

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 전체 대문자
        System.out.println(s.toLowerCase()); // 전체 소문자

        // 포함 관계
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("java")); // false
        System.out.println(s.contains("C++")); // false

        // 포함되는 문자열의 위치 파악 (0부터 시작)
        System.out.println(s.indexOf("Java")); // 7
        // 포함되지 않는다면 -1
        System.out.println(s.indexOf("C++")); // -1

        // 처음 만나는 위치 반환
        System.out.println(s.indexOf("a")); // 8
        // 마지막으로 만나는 위치 반환
        System.out.println(s.lastIndexOf("a")); //23

        // 시작하는 문자열 확인
        System.out.println(s.startsWith("I")); // true
        // 끝나는 문자열 확인
        System.out.println(s.endsWith(".")); // true
    }
}
