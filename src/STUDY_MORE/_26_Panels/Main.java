package STUDY_MORE._26_Panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._26_Panels/Logo.png");

        JLabel label = new JLabel();
        label.setText("Hi"); // 텍스트 추가
        label.setIcon(icon); // 아이콘 추가
//        label.setVerticalAlignment(JLabel.BOTTOM); // 레이블의 위치 (위아래)
//        label.setHorizontalAlignment(JLabel.RIGHT);
       // 위의 코드를 대신할 수 있음.
        label.setBounds(100,0,130,130);
        // 해당 Panel의 x,y좌표에 130x130의 크기로 레이블을 위치시킴.

        // 패널 생성
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red); // 색깔 지정
        redPanel.setBounds(0, 0, 250, 250); // x좌표, y좌표, 가로, 세로
        redPanel.setLayout(null); // null -> 사용X

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        // 레이블을 왼쪽으로 정렬 시킴 -> 레이블을 직접적으로 움직이는 것이 더 강함.
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);

        // 패널에 레이블 추가 -> greenPanel에만 레이블이 추가됨.
        bluePanel.add(label);
        greenPanel.add(label); // 중앙에 위치함

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
