package STUDY_MORE._24_GUI;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("JFrame title goes here"); // 프레임의 이름

        // 프레임 종료 -> 아래 코드가 없으면 x를 눌러도 프로그램이 종료되지 않음
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        this.setResizable(false); // 프레임 사이즈 조정 불가!
        // this.setResizable(true); // 프레임 사이즈 조정 가능
        this.setSize(420, 420); // 프레임의 크기
        this.setVisible(true); // 프레임 나타내기

        // 아이콘 이미지 설정
        ImageIcon image = new ImageIcon("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._24_GUI/Logo.png");
        this.setIconImage(image.getImage()); // 아이콘 변경

        // 배경화면 색깔 변경
        // this.getContentPane().setBackground(Color.green); // 라이브러리 활용
        // this.getContentPane().setBackground(new Color(0x123456); // 색상코드 활용
        this.getContentPane().setBackground(new Color(123,50,250,70)); // RGB+투명도


    }

}
