package STUDY_MORE._42_Drag_and_Drop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("C:\\Java_workspace\\JavaWorkspace\\src\\STUDY_MORE\\STUDY_MORE._42_Drag_and_Drop\\smile.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPt;

    DragPanel() {

        imageCorner = new Point(0,0);
        ClickListenr clickListenr = new ClickListenr();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListenr);
        this.addMouseMotionListener(dragListener);

    }

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }

    private class  ClickListenr extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
            System.out.println("prevPT : " + prevPt);
        }
    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();
            System.out.println("currentPt : " + currentPt);

            imageCorner.translate(
                    (int)currentPt.getX() - (int)prevPt.getX(),
                    (int)currentPt.getY() - (int)prevPt.getY()
            );

            prevPt = currentPt;
            repaint();
        }
    }
}
