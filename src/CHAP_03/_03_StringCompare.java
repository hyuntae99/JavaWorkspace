package CHAP_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals("Java")); // true
        System.out.println(s1.equals("java")); // false -> 소문자라서
        // 대소문자 구분 없이 문자열 값이 같다면 OK
        System.out.println(s1.equalsIgnoreCase("java"));

        // "1234"를 s1, s2가 참조하는 것
        s1 = "1234"; // 참조
        s2 = "1234"; // 참조
        System.out.println(s1.equals(s2)); // true(내용)
        System.out.println(s1 == s2); // true(참조)

        // s1과 s2는 다른 것을 참조하고 있음!!!!
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true(내용)
        System.out.println(s1 == s2); // false(참조)
    }
}
