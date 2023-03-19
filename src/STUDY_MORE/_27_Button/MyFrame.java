package STUDY_MORE._27_Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button; // 전역변수로 설정 -> 오버라이딩에서 사용하려교
    JLabel label;
    MyFrame () {

        ImageIcon icon = new ImageIcon("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._27_Button/PointButton.png");

        ImageIcon icon2 = new ImageIcon("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._27_Button/Logo.png");
        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false); // 감춰두기


        button = new JButton();
        button.setBounds(100,100,250,100);
        // 오버라이딩함수의 실행을 하기 위해서 필요함
        button.addActionListener(this);
        // 숏코딩 (함수가 간단할 때 사용)
        // button.addActionListener(e -> System.out.println("POP"));

        button.setText("I'm a button"); // 버튼 안의 텍스트
        button.setFocusable(false); // 텍스트의 박스 제거
        button.setIcon(icon); // 아이콘 추가
        // 버튼 내 텍스트 위치 조정
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-15); // 거리 조정
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder()); // 3D 효과
        // button.setEnabled(false); -> 버튼 비활성화



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button); // 버튼 추가
        this.add(label); // 레이블 추가


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 버튼이 눌리면
        if (e.getSource() == button) {
            System.out.println("POP");
            // button.setEnabled(false); -> 한번 누르면 비활성화
            label.setVisible(true);
        }
    }
}
