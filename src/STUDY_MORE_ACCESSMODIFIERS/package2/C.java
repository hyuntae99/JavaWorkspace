package STUDY_MORE_ACCESSMODIFIERS.package2;

// public class C 일때는 A,B에서도 가능하지만
// class C 일때는 불가능
public class C {
    // 어느 폴더의 파일에서 사용 가능!
    public static String publicMessage = "This is public";

    // 같은 폴더만 사용가능!
    static String defaultMessage = "This is the default";

    // 자세히는 이해가 안되지만 일반적인 상황과 비슷한듯????
    protected static String protectedMessage = "This is protected";

    // 공유 불가능!
    private static String privateMessage = "This is private";
}
