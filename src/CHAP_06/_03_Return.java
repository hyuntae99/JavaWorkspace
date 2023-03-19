package CHAP_06;

public class _03_Return {
    // String 값을 반환하는 함수
    public static String getPN() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAdderss() {
        return "서울시 관악구 난곡동";
    }


    //메인 함수
    public static void main(String[] args) {
        String phoneNum = getPN();
        System.out.println("전화번호는 " + phoneNum + " 입니다.");

        System.out.println("주소는 " + getAdderss() + " 입니다.");

    }
}
