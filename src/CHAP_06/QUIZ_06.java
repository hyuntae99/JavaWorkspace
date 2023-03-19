package CHAP_06;

public class QUIZ_06 {
    public static String getHiddenData (String info, int num) {
        String hiddenInfo = info.substring(0, num);
        for (int i = num; i < info.length(); i++)
            hiddenInfo += "*";
        return hiddenInfo;
    }


    public static void main(String[] args) {
        System.out.println("이름 : " + getHiddenData("조현태", 1));
        System.out.println("주민등록번호 : " + getHiddenData("991202-1009510", 8));
        System.out.println("전화번호 : " + getHiddenData("010-9311-9836", 9));
    }
}
