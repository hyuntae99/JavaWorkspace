package STUDY_MORE._50_MultiThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // 1번 방법
        MyThread thread1 = new MyThread();

        // 2번 방법
        // 복잡해보이지만 MyRunnable은 상속을 사용하지 않았기 때문에 프로젝트 관리에 유리하다.
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        // Daemon Thread로 변경하면 일반 Thread가 종료되는 순간 강제 종료딤.
        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start(); // thread1에서 오류가 발생해도 thread2는 그대로 실행 가능!
        // thread1.join(); // thread1이 끝난 후 다음 코드 실행.
        thread1.join(3000); // 3초 dealy 후 다음 코드 실행.
        thread2.start();

        // 오류 발생코드
        System.out.println(1/0);
        // main 클래스에서 오류가 발생해도 thread는 실행됨!
    }
}
