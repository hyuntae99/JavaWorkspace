package STUDY_MORE._34_ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyFrame() {
        // 초기 세팅
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // ComboBox
        String[] animals = {"dog", "cat", "bird"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        // comboBox.setEditable(true); // ComboBox 직접 편집가능
        // System.out.println(comboBox.getItemCount());
        // comboBox.addItem("horse"); // 추가
        // comboBox.insertItemAt("pig", 0); // 삽입
        // comboBox.setSelectedIndex(2); // 처음 보이는 요소 설정 (인덱스로)
        // comboBox.removeItem("cat"); // 제거
        // comboBox.removeItemAt(0); // 제거 (인덱스로)
        // comboBox.removeAllItems(); // 모든 요소 제거

        this.add(comboBox);
        // 초기 세팅
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox) {
            // ComboBox에서 선택한 요소가 출력됨.
            System.out.println(comboBox.getSelectedItem());
            // ComboBox에서 선택한 요소의 인데스가 출력됨.
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
