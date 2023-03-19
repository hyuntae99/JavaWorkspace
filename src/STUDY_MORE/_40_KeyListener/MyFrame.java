package STUDY_MORE._40_KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    int speed = 10;
    JLabel label;
    ImageIcon rocket;

    MyFrame() {
        // 초기 세팅
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        rocket = new ImageIcon("C:\\Java_workspace\\JavaWorkspace\\src\\STUDY_MORE\\STUDY_MORE._40_KeyListener\\Rocket.png");

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(rocket);
        //label.setBackground(Color.red); // 배경색 설정
        //label.setOpaque(true); // 배경색 적용

        // 배경색 설정
        this.getContentPane().setBackground(Color.WHITE);
        this.add(label);
        this.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a' :
                label.setLocation(label.getX()-speed, label.getY());
                break;
            case 'w' :
                label.setLocation(label.getX(), label.getY()-speed);
                break;
            case 's' :
                label.setLocation(label.getX(), label.getY()+speed);
                break;
            case 'd' :
                label.setLocation(label.getX()+speed, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37 :
                label.setLocation(label.getX()-speed, label.getY());
                break;
            case 38 :
                label.setLocation(label.getX(), label.getY()-speed);
                break;
            case 39 :
                label.setLocation(label.getX()+speed, label.getY());
                break;
            case 40 :
                label.setLocation(label.getX(), label.getY()+speed);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        // Char 자료형
        System.out.println("You released Key char " + e.getKeyChar());
        // 아스키코드
        System.out.println("You released Key code " + e.getKeyCode());

    }
}
