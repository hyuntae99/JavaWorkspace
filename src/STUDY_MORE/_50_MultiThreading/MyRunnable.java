package STUDY_MORE._50_MultiThreading;

// extends(상속)을 사용하지 않았으므로 큰 프로젝트에서 관리하는데 편하다.
public class MyRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++){
            System.out.println("Thread #2 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is finished! :)");
    }
}
