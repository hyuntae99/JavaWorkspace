package STUDY_MORE._41_MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrame extends JFrame implements MouseListener {


    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;


    MyFrame() {
        // 초기 세팅
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        smile = new ImageIcon("C:\\Java_workspace\\JavaWorkspace\\src\\STUDY_MORE\\STUDY_MORE._41_MouseListener\\smile.png");
        nervous = new ImageIcon("C:\\Java_workspace\\JavaWorkspace\\src\\STUDY_MORE\\STUDY_MORE._41_MouseListener\\nervous.png");
        pain = new ImageIcon("C:\\Java_workspace\\JavaWorkspace\\src\\STUDY_MORE\\STUDY_MORE._41_MouseListener\\pain.png");
        dizzy = new ImageIcon("C:\\Java_workspace\\JavaWorkspace\\src\\STUDY_MORE\\STUDY_MORE._41_MouseListener\\dizzy.png");

        label.setIcon(smile);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }



    @Override
    // 클릭(누르고 떼기)을 해야 반응
    public void mouseClicked(MouseEvent e) {
        System.out.println("You click the mouse");
    }

    @Override
    // 누르기만 해도 반응
    public void mousePressed(MouseEvent e) {
        System.out.println("You press the mouse");
        label.setIcon(pain);
    }

    @Override
    // 마우스를 땠을 때 반응 -> 클릭보다 빠름.
    public void mouseReleased(MouseEvent e) {
        System.out.println("You released the mouse");
        label.setIcon(dizzy);
    }

    @Override
    // 마우스와 만났을 때 반응 (클릭 X)
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered the component");
        label.setIcon(nervous);
    }

    @Override
    // 마우스가 떠났을 때 반응
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited the component");
        label.setIcon(smile);
    }
}
