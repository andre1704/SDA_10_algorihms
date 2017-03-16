package guitrain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Arc2D;

/**
 * Created by RENT on 2017-03-02.
 */
public class MyApp extends JFrame {
    private JLabel labelPln;
    private JLabel labelEuro;
    private JTextField pln;
    private JTextField euro;
    private JButton przelicz;
    private JComboBox jComboBox;

    public MyApp() throws HeadlessException {
        setVisible(true);
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String[] combo = new String[]{"funt", "frank", "euro"};
        jComboBox = new JComboBox(combo);
        jComboBox.setSize(150, 150);
        jComboBox.setLocation(300, 300);
        labelEuro = new JLabel("Kwota w ");
        labelPln = new JLabel("Kwota w PLN");
        labelPln.setSize(170, 20);
        labelEuro.setSize(170, 20);
        pln = new JTextField();
        euro = new JTextField();
        przelicz = new JButton();
        labelPln.setLocation(12, 12);
        pln.setLocation(12, 60);
        pln.setSize(140, 40);
        labelEuro.setLocation(12, 120);
        euro.setLocation(12, 180);
        euro.setSize(140, 40);
        przelicz.setLocation(300, 150);
        przelicz.setSize(30, 30);
        add(pln);
        add(jComboBox);
        add(euro);
        add(przelicz);
        add(labelEuro);
        add(labelPln);
        listenner();
    }

    public void listenner() {

        przelicz.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                currentCurrency();
            }

            public void mousePressed(MouseEvent e) {

            }


            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {

            }

            private void currentCurrency() {
                String string = pln.getText();
                labelEuro.setText("Kwota w " + jComboBox.getSelectedItem());
                try {
                    double s = Double.parseDouble(string);
                    if (jComboBox.getSelectedItem().equals("euro"))
                        s = s / 4.5;
                    else if (jComboBox.getSelectedItem().equals("funt"))
                        s = s / 5;
                    else
                        s = s / 6;
                    euro.setText(String.valueOf(s));

                } catch (NumberFormatException e1) {
                    System.out.println("niepoprawne");
                    JOptionPane.showMessageDialog(getParent(), "wrong number", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        new MyApp();
    }
}
