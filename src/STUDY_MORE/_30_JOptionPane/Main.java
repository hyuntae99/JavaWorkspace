package STUDY_MORE._30_JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // showMessageDialog (폰트, 메세지, 제목, 설정)
        JOptionPane.showMessageDialog(null, "This is PLAIN_MESSAGE", "This is title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is INFORMATION_MESSAGE", "This is title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is QUESTION_MESSAGE", "This is title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is WARNING_MESSAGE", "This is title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is ERROR_MESSAGE", "This is title", JOptionPane.ERROR_MESSAGE);

        // showConfirmDialog
        //JOptionPane.showConfirmDialog(null, "YES_NO_CANCEL_OPTION", "This is title", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(JOptionPane.showConfirmDialog(null, "YES_NO_CANCEL_OPTION", "This is title", JOptionPane.YES_NO_CANCEL_OPTION));
        // yes = 0, no = 1, cancel = 2, x = -1

        // showInputDialog
        String name = JOptionPane.showInputDialog("What is your name? : ");
        System.out.println("Your name is " + name);

        // showOptionDialog
        String[] respronse = {"One", "Two", "Three"};
        ImageIcon icon = new ImageIcon("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._30_JOptionPane/Logo.png");
        JOptionPane.showOptionDialog(null,
                "You are awesome!",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                respronse,
                0);
    }
}
