package CHAP_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s: args) {
            System.out.print(s + " ");
        }
        System.out.println();


        // Edit Configuration -> application -> 파일 선택 -> argument = args
        // 공백으로 구분함.

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if (args.length == 1) // 메인 함수 args에 1개만 있을때
            switch (args[0]){
                case "1":
                    System.out.println("도서 조회");
                    break;
                case "2":
                    System.out.println("도서 대출");
                    break;
                case "3":
                    System.out.println("도서 반납");
                    break;
                default:
                    System.out.println("다시 입력!");
            }
        else { // args에 2개 이상 있을때
            System.out.println("사용법) 1 ~ 3 중에서 선택하세요!");
        }

    }
}
