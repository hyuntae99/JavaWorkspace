package CHAP_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름 사용
        // 2. 밑줄(_), 문자(a,b,c), 숫자(1,2,3) 사용 가능
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작은 대문자로!
        // 6. 예약어 사용 불가 (이미 정의 되어있는 것)


        // 입국 신고서
        String nationality = "대한민국"; // 국적
        String firstName = "현태"; // 이름
        String lastName = "조"; // 성
        String dataOfBrith = "1999-12-02"; // 생년월일
        String flightNum = "KO9912";
        String _flightNum = "KO9912";
        String flightNum_02 = "KO9912";
        // 2_String flightNum = "KO9912"; -> 숫자로 시작 불가

        // 절대상수는 대문자로 표현!
        final String CODE = "KR";
        // CODE = "EN"; -> 변경 불가능!
    }
}
