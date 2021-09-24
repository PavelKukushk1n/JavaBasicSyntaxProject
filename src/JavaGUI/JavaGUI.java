package JavaGUI;

import javax.swing.*;
import java.awt.*;

public class JavaGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame title template");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(1280,720);

        ImageIcon imageIcon = new ImageIcon("logo.png");

        frame.setIconImage(imageIcon.getImage());
        frame.getContentPane().setBackground(Color.black);

        frame.setVisible(true);


    }
}
