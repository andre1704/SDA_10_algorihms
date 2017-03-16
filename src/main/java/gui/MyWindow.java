package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by RENT on 2017-03-01.
 */
public class MyWindow extends JFrame {

    private final JComboBox jComboBox;

    public static void main(String[] args) {
        new MyWindow();
    }
    private JButton jButton;
    private JTextField jTextField;
    private JTextArea jTextArea;
    private MyPanel myPanel;
    public MyWindow() throws HeadlessException {
        setVisible(true);
        setSize(600, 400);

//        getContentPane().setBackground(Color.blue);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        jButton = new JButton("Click me");
        add(jButton);
        jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(200, 50));
        add(jTextField);
        jTextArea=new JTextArea();
        jTextArea.setPreferredSize(new Dimension(100,50));
        add(jTextArea);
        jComboBox = new JComboBox();
        jComboBox.setPreferredSize(new Dimension(300,200));
        add(jComboBox);

        DefaultComboBoxModel aModel=new DefaultComboBoxModel();
        jComboBox.setModel(aModel);
        aModel.addElement("");
        aModel.addElement("nowa");
        aModel.addElement("stare");


        JScrollBar jScrollBar=new JScrollBar();
        JCheckBox jCheckBox=new JCheckBox();
        JColorChooser jColorChooser=new JColorChooser();
        add(jScrollBar);
        add(jColorChooser);
        add(jCheckBox);

        JPanel jPanel=new JPanel();
        jPanel.setPreferredSize(new Dimension(300,400));
        jPanel.setBackground(Color.red);
        jPanel.add(jCheckBox);
        add(jPanel);

        myPanel=new MyPanel();
        myPanel.setPreferredSize(new Dimension(200,200));
        myPanel.setBackground(Color.pink);
        add(myPanel);
        setListeners();
    }

    private void setListeners() {
        addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {

            }

            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_SPACE)
                    System.out.println("super");


            }
        });
        jComboBox.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText("Item "+ jComboBox.getSelectedItem());

            }
        });


        jButton.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {

                jTextArea.setText(jTextField.getText());
                System.out.println(jTextArea.getText());
                jTextArea.setText("Item "+ jComboBox.getSelectedItem());
                myPanel.animate();
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
