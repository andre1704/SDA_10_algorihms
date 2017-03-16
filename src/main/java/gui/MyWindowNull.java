package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by RENT on 2017-03-01.
 */
public class MyWindowNull extends JFrame {
    private JButton jButton;
    private JTextField jTextField;
    private JTextArea jTextArea;

    public MyWindowNull() throws HeadlessException {
        setVisible(true);
        setSize(600, 400);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        jButton = new JButton("Click me");
        jButton.setSize(123, 455);
        jButton.setLocation(12, 4);
        add(jButton);
        jTextField = new JTextField();
        jTextField.setSize(new Dimension(200, 50));
        jTextField.setLocation(44, 60);
        add(jTextField);
        jTextArea = new JTextArea();
        jTextArea.setSize(new Dimension(100, 50));
        jTextArea.setLocation(200, 300);
        add(jTextArea);


        setListeners();
    }

    private void setListeners() {
        jButton.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                jTextArea.setText(jTextField.getText());
                System.out.println(jTextArea.getText());
            }

            public void mousePressed(MouseEvent e) {

            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
