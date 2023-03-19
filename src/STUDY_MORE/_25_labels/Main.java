package STUDY_MORE._25_labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // image 설정
        ImageIcon image = new ImageIcon("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._25_labels/Logo.png");

        // 경계 설정 (색깔, 크기)
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); // 레이블 생성
        label.setText("This is the label!!!"); // 레이블의 텍스트
        label.setIcon(image);

        // 텍스트의 위치를 정할 수 있음 -> 레이블 기준으로
        label.setHorizontalTextPosition(JLabel.CENTER); // LEFT, CENTER, RIGHT
        label.setVerticalTextPosition(JLabel.BOTTOM); // TOP, BOTTOM

        // 폰트 디자인
        label.setForeground(Color.green); // 색깔
        label.setFont(new Font("MV Boil", Font.PLAIN,30)); // 글꼴
        label.setIconTextGap(-35); // 이미지와 폰트의 거리

        // 배경 색깔 설정
        label.setBackground(new Color(123,50,250,70));
        label.setOpaque(true);
        label.setBorder(border); // 경계색 실행

        // 레이블 자체의 위치 설정 (이미지 + 폰트)
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        // 0,0 좌표에 420, 420 크기의 레이블을 생성한다.
        // 프레임의 변경에 영향을 받지 않는다!!!!!
        // label.setBounds(0,0,420,420);
        // frame.setLayout(null); 을 같이 써줘야한다!!

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Test Page");
        frame.setSize(500,500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

        // 레이블을 더한 후 실행해야함!!!
        // 레이블의 크기에 최적화되어서 프레임 크기를 조정함.
        // 글씨의 크기, 사진의 크기를 바꾸면 이해할 수 있다.
        //frame.pack();

    }
}
