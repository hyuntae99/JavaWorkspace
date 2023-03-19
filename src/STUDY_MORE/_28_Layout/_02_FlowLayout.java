package STUDY_MORE._28_Layout;

import javax.swing.*;
import java.awt.*;

public class _02_FlowLayout {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        // FlowLayout.LEADING -> 왼쪽 정렬
        // FlowLayout.TRAILING -> 오른쪽 정렬
        // 가운데 정렬, 버튼 간격, 위쪽 간격
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10 ,10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        // panel의 크기에 맞춰 버튼의 위치가 조정됨.
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));


        frame.add(panel);
        frame.setVisible(true);
    }
}
