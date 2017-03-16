package guitrain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by RENT on 2017-03-02.
 */
public class KoloKrzyz extends JFrame {
    private JButton[][] buttons;
    private boolean znak = true;
    private boolean koniecGry = false;
    private int warunekZwycięstwa = 1;
    public static final String[] sings = {"X", "O"};

    public KoloKrzyz() throws HeadlessException {
        setVisible(true);
        setLayout(null);
        setSize(600, 600);
        buttons = new JButton[3][3];
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[0].length; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setSize(200, 200);
                buttons[i][j].setLocation(j * 200, i * 200);
                add(buttons[i][j]);
                final int finalI = i;
                final int finalJ = j;
                buttons[i][j].addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent e) {

                    }

                    public void mousePressed(MouseEvent e) {
                        if (znak) {
                            if (buttons[finalI][finalJ].getText() != "X" && buttons[finalI][finalJ].getText() != "O") {
                                buttons[finalI][finalJ].setText("X");
                                znak = false;
                            }
                        } else {
                            {
                                if (buttons[finalI][finalJ].getText() != "X" && buttons[finalI][finalJ].getText() != "O") {
                                    buttons[finalI][finalJ].setText("O");
                                    znak = true;
                                }
                            }
                        }
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
    }

    public boolean isKoniecGry() {
        return koniecGry;
    }

    public void setKoniecGry(boolean koniecGry) {
        this.koniecGry = koniecGry;
    }

    public boolean graWarunek(JButton[][] jButtons) {
        warunekZwycięstwa = 1;
        for (int i = 0; i < jButtons.length; i++) {
            if (warunekZwycięstwa != 3) {
                for (int j = 0; j < jButtons.length; j++) {
                    if (jButtons[i][j].getText() == "X") {
                        warunekZwycięstwa++;
                    }
                    setKoniecGry(false);
                }
            } else {
                setKoniecGry(true);
            }
        }

        return koniecGry;
    }
    public void gra(){
        if(!koniecGry){

        }
    }


    public static void main(String[] args) {
        new KoloKrzyz();
    }
}
