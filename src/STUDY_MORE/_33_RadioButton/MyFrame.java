package STUDY_MORE._33_RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotDogButton;
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotDogIcon;

    MyFrame() {
        // 초기 세팅
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // 이미지 불러오기
        pizzaIcon = new ImageIcon("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._33_RadioButton/Pizza.png");
        hamburgerIcon = new ImageIcon("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._33_RadioButton/Hamburger.png");
        hotDogIcon = new ImageIcon("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._33_RadioButton/Hotdog.png");

        // 버튼 만들기
        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotDogButton = new JRadioButton("hotDog");

        // 그룹으로 묶을 경우, 그룹 중 하나만 가능!
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotDogButton);

        // Action을 위한 함수
        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);

        // 버튼에 아이콘 이식
        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotDogButton.setIcon(hotDogIcon);


        // 초기세팅 + 구성요소 추가
        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotDogButton);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaButton){
            System.out.println("You order pizza!");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("You order a hamburger!");
        } else if (e.getSource() == hotDogButton) {
            System.out.println("You order a hot-dog!");
        }
    }
}
