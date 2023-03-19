package STUDY_MORE._28_Layout;

import javax.swing.*;
import java.awt.*;

public class _01_BorderLayout {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new java.awt.BorderLayout(10,10));
        // panel 간의 가로, 세로 마진공간
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        // --------------------- sud Panels -------------------------------

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.LIGHT_GRAY);
        panel10.setBackground(Color.white);

        // panel5에 대한 서브 패널로 등록.
        panel5.setLayout(new java.awt.BorderLayout(5,5));
        // panel5 위에 panel들을 추가했기에 공백은 panel5의 색깔은 파란색이다!

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel5.add(panel6, java.awt.BorderLayout.NORTH);
        panel5.add(panel7, java.awt.BorderLayout.WEST);
        panel5.add(panel8, java.awt.BorderLayout.EAST);
        panel5.add(panel9, java.awt.BorderLayout.SOUTH);
        panel5.add(panel10, java.awt.BorderLayout.CENTER);

        // --------------------- sud Panels -------------------------------

        frame.add(panel1, java.awt.BorderLayout.NORTH);
        frame.add(panel2, java.awt.BorderLayout.WEST);
        frame.add(panel3, java.awt.BorderLayout.EAST);
        frame.add(panel4, java.awt.BorderLayout.SOUTH);
        frame.add(panel5, java.awt.BorderLayout.CENTER);


    }
}
