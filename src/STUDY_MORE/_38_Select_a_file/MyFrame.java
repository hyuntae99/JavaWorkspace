package STUDY_MORE._38_Select_a_file;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    MyFrame() {
        // 초기 세팅
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            JFileChooser fileChooser = new JFileChooser();

            // 바탕화면을 초기 설정으로 함.
            fileChooser.setCurrentDirectory(new File("C:\\Users\\조현태\\OneDrive\\바탕 화면"));

            // 파일 선택
            // 파일 선택 = 0, 취소 = 1, x = 1
            // int response = fileChooser.showOpenDialog(null);

            // 파일 저장
            int response = fileChooser.showSaveDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                // file의 절대경로를 확인할 수 있다.
                File file = new File(String.valueOf(fileChooser.getSelectedFile().getAbsoluteFile()));
                System.out.println(file);
            }

        }
    }
}
