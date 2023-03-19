package STUDY_MORE._36_ProgressBar;

import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);
    ProgressBarDemo() {

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true); // %로 표시해줌.
        bar.setFont(new Font("MV Boil", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);


        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);


        fill();
    }

    public void fill() {
        int counter = 0;

        while (counter <= 100) {
            bar.setValue(counter);
            try {
                // 1초의 딜레이 = 1000
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter += 1;
        }
        bar.setString("YOU WIN! :)");
    }

}
