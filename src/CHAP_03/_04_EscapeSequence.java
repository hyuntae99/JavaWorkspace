package CHAP_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요.");

        // \t : 탭
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t7000원");
        System.out.println("부추전\t7000원");

        // \\ : \
        System.out.println("C:\\Program File\\Java");

        // \" : "
        System.out.println("고양이가 \"냐옹\"이라고 했습니다.");

        // \' : '
        System.out.println("고양이가 \'뭐야\'라고 생각했습니다.");
        System.out.println("고양이가 '뭐야'라고 생각했습니다."); // ''는 사용가능

        char c = 'C';
        // c = '''; (X)
        c = '\'';
        System.out.println(c);

    }
}
