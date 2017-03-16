package gui;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by RENT on 2017-03-01.
 */
public class MyPanel extends JPanel {
    public int y=0;
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(10,y,50,y);
    }
    public void animate(){
        final Timer timer=new Timer(10,null);
        timer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                y++;
                repaint();

                if(y>=getHeight()){
                    timer.stop();
                }
            }
        });timer.start();
    }
}
