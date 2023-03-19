package CHAP_01;

public class _03_Variables {
    // main -> public static void main(String[] args) 명령어
    public static void main(String[] args) {
        String name = "조현태"; // 문자열
        int time = 15; // 정수형
        System.out.println(name + "님, 배송이 시작합니다. " + time + "시 예정입니다.");
        System.out.println("조현태님, 15시 30분에 배송이 완료되었습니다.");

        double score = 90.5; // 실수형
        double score1 = 90; // 정수로 입력해도 90.0으로 출력됨
        char grade = 'A'; // 문자변수 -> ''사용!!!!
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println(name + "님의 평균 점수는 " + score1 + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험 통과했나요? " + pass);


        double d = 3.14;
        // float은 실수를 그대로 받을 수 없으므로 F를 써야함
        float f = 3.14F;
        System.out.println(d); //3.14
        System.out.println(f); //3.14

        d = 3.123456789;
        f = 3.123456789F; // 큰 자료형은 표현이 불가능함!
        System.out.println(d); // 3.123456789
        System.out.println(f); // 3.1234567

        // -21억 <= int <= 21억
        // int i = 10000000000; -> 오류
        // L을 사용해서 long형으로 변환
        long i = 10000000000L;
        System.out.println(i);
        i = 10_000_000_000L; // 가독성을 위해 _을 사용가능!
        System.out.println(i);


        // 시간복잡도, 용량을 위해 적절한 자료형 사용!!
        // 실수 : float (F) < double
        // 정수 : int < long (L)
    }
}
