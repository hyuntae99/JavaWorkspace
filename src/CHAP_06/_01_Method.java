package CHAP_06;

public class _01_Method {
    public static void sayHello(){
        System.out.println("Hello");
    }
    public static void sayHelloLoop(int i){
        for (int j = 1; j < i+1; j++)
            System.out.println("Hello " + j);

    }
    public static void main(String[] args) {
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");
        sayHelloLoop(3);
    }
}
