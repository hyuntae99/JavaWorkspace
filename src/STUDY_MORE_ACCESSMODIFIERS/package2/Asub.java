package STUDY_MORE_ACCESSMODIFIERS.package2;
import STUDY_MORE_ACCESSMODIFIERS.package1.*; // package1의 모든 것을 사용한다.

public class Asub extends A {
    public static void main(String[] args) {

        C c = new C();
        System.out.println(C.defaultMessage); // 같은 폴더라 OK
        System.out.println(C.publicMessage);
    }
}
