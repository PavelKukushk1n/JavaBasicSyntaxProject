import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

            JButton button = new JButton();
            button.setBounds(200, 100, 100, 50);

            JFrame frame = new JFrame();

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setSize(500, 500);
            frame.setVisible(true);
            frame.add(button);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button) {
                    System.out.println("Fuck you 1");
                }
                else  {
                    System.out.println("Fuck you 2");
                }
            }
        };
        button.addActionListener(listener);

        }
    }
