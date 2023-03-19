package STUDY_MORE._32_CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        xIcon = new ImageIcon("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._32_CheckBox/No.png");
        checkIcon = new ImageIcon("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._32_CheckBox/Check.png");

        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false); // 텍스트 테두리 제거
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.setIcon(xIcon); // 체크박스를 아이콘을 대체
        checkBox.setSelectedIcon(checkIcon); // 클릭된 체크박스

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            // checkBox의 선택 유무 출력
            System.out.println(checkBox.isSelected());
        }
    }
}
