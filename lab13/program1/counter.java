
package program1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class counter extends Frame implements Runnable{
     int c = 0;
    Thread t;

    public static void main(String[] args) {
        new counter();
    }

    counter() {
        setSize(500, 500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
        t = new Thread(this);

        t.start();

    }

    public void run() {
        while (true) {
            c++;
            repaint();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(1, 1, 500, 500);
        
        g.setColor(Color.red);
        g.fillOval(140, 180, 200, 170);
        
        g.setColor(Color.black);
        String counter = c + "";
        Font f=new Font("Arial",Font.BOLD,50);
        g.setFont(f);
        g.drawString(counter,220,285);
        
    }

}

   