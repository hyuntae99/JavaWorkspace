package STUDY_MORE._42_Drag_and_Drop;

import javax.swing.*;

public class MyFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();
    MyFrame() {

        // dragPanel 추가
        this.add(dragPanel);

        // frame 초기설정
        this.setTitle("Drag & Drop demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
