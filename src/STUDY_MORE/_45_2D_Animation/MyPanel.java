package STUDY_MORE._45_2D_Animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PENAL_HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel() {
        // 크기 설정
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PENAL_HEIGHT));
        this.setBackground(Color.black);

        backgroundImage = new ImageIcon("C:\\Java_workspace\\JavaWorkspace\\src\\STUDY_MORE\\STUDY_MORE._45_2D_Animation\\space.png").getImage();
        enemy = new ImageIcon("C:\\Java_workspace\\JavaWorkspace\\src\\STUDY_MORE\\STUDY_MORE._45_2D_Animation\\enemy.png").getImage();
        timer = new Timer(10, this); // 프레임 -> 1초에 100번 실행
        timer.start(); // 타이머 시작



    }

    public void paint(Graphics g) {

        super.paint(g); // 배경

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        // enemy가 오른쪽에 닿을 때 || 왼쪽에 닿을때
        if (x >= PANEL_WIDTH-enemy.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        x += xVelocity;

        // enemy가 바닥에 닿을 때 || 천장에 닿을때
        if (y >= PENAL_HEIGHT-enemy.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        y += yVelocity;

        repaint(); // 다시 그림으로써 변화를 반영함.

    }

}
