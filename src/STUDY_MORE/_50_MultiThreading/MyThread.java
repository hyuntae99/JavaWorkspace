package STUDY_MORE._50_MultiThreading;

public class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 10; i > 0; i--){
            System.out.println("Thread #1 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 오류 발생코드
            // System.out.println(1/0);
            // thread1에서 오류가 발생해도 thread2는 그대로 실행 가능!
        }
        System.out.println("Thread #1 is finished! :)");
    }

}
