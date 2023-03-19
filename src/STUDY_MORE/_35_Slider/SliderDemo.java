package STUDY_MORE._35_Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider  slider;

    SliderDemo() {

        frame = new JFrame("Slider  Demo");
        panel = new JPanel();
        label = new JLabel();
        // 0 ~ 100까지 중에서 선택할 수 있음.
        slider = new JSlider(0, 100);

        slider.setPreferredSize(new Dimension(400,200));

        // 10의 간격으로 작게 표시됨.
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        // 25의 간격으로 크게 표시됨.
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        // MajorTick을 숫자로 표시해줌
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));

        // 수직으로 변경
        slider.setOrientation(SwingConstants.VERTICAL);
        // 수평으로 변경
        // slider.setOrientation(SwingConstants.HORIZONTAL);

        label.setFont(new Font("MV Boli", Font.PLAIN, 15));
        label.setText("Temp = " + slider.getValue() + "°C");

        slider.addChangeListener(this);


        // panel에 기능 추가
        panel.add(slider);
        panel.add(label);
        // frame에 panel 추가
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);


    }

    @Override
    public void stateChanged(ChangeEvent e) {

        // 값이 변경될 때마다 실행됨.
        label.setText("Temp = " + slider.getValue() + "°C");

    }
}
