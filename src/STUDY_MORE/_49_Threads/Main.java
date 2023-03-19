package STUDY_MORE._49_Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException{


        System.out.println(Thread.activeCount()); // 2
        Thread.currentThread().setName("MAINNNNNN"); // 이름 변경
        System.out.println(Thread.currentThread().getName()); // main -> MAINNNNN

        Thread.currentThread().setPriority(10); // 1 ~ 10
        System.out.println(Thread.currentThread().getPriority()); // 5 -> 10

        System.out.println(Thread.currentThread().isAlive()); // true

//        for (int i = 3; i > 0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000); // 1초의 딜레이
//        }
//        System.out.println("You are done!");

        MyThread thread2 = new MyThread();

        thread2.setDaemon(true); // thread2.isDaemon() : true
        System.out.println(thread2.isDaemon());
        thread2.start();

//        thread2.run(); // thread의 함수 실행
//        System.out.println(thread2.isAlive()); // false
//        thread2.start(); // thread 실행 -> main의 모든 함수를 실행 후 실행
//        System.out.println(thread2.isAlive()); // true

        thread2.setName("2nd thread");
        System.out.println(thread2.getName());

        thread2.setPriority(1);
        System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount());
    }
}
