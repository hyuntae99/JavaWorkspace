package STUDY_MORE_ACCESSMODIFIERS.package1;
import STUDY_MORE_ACCESSMODIFIERS.package2.*;

public class A {
    public static void main(String[] args) {

        C c = new C();
        // System.out.println(C.defaultMessage); -> 같은 폴더가 아니라 X

        // public은 폴더 상관 X
        System.out.println(C.publicMessage);

        System.out.println();

        B b = new B();
        // System.out.println(b.privateMessage); -> private는 공유X


    }
}
