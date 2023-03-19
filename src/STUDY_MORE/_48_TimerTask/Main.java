package STUDY_MORE._48_TimerTask;

import STUDY_MORE_ACCESSMODIFIERS.package2.C;
import sun.util.resources.cldr.af.CalendarData_af_ZA;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import static java.util.Calendar.*;

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int counter = 10;
            @Override
            public void run() {
                if (counter > 0) {
                    System.out.println(counter + " seconds");
                    counter--;
            } else {
                    System.out.println("COMPLETE!!");
                    timer.cancel();
                }
            }
        };
        // 1초 후, task를 실행!
        // timer.schedule(task,1000);

        // 달력
        Calendar date = getInstance();
        date.set(Calendar.YEAR,2023); // 년
        date.set(Calendar.MONTH,Calendar.MARCH); // 월
        date.set(Calendar.DAY_OF_MONTH,18); // 일
        date.set(Calendar.HOUR_OF_DAY,11); // 시간
        date.set(Calendar.MINUTE, 24); // 분
        date.set(Calendar.SECOND, 50); // 초
        date.set(Calendar.MILLISECOND, 0); // 밀리초
        // timer.schedule(task, date.getTime());

        // 1초의 딜레이를 가지고 task를 실행
        // timer.scheduleAtFixedRate(task, 0, 1000);

        // 정각을 알려주기 10초전에 실행!
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);


    }
}
