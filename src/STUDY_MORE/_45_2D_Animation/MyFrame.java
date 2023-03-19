package STUDY_MORE._45_2D_Animation;

import javax.swing.*;

public class MyFrame extends JFrame {

    MyPanel panel;

    MyFrame() {

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack(); // 패널의 크기를 프레임에 맞게 조절해줌
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
