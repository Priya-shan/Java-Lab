
package program1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class counter extends JFrame implements Runnable {
int counter;
    Thread t;
    JFrame f;
    applett ap;
    counter(applett ap){
     f=new JFrame();
     f.setSize(500, 500);
     f.setVisible(true);
     f.setResizable(false);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.add(ap);
    }
    public void init(){
 
 counter = 0;
 t = new Thread(this);
 t.start();
 }

    @Override
    public void run() {
        try{
           while(true){
           repaint();
           Thread.sleep(1000);
           ++counter;
           System.out.println(counter);
           }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String[] args) {
        applett ap=new applett();
        new counter(ap);
    }
}
class applett extends JPanel  {
    
    public void paint(Graphics g,int counter){
    
        g.setColor(Color.green);
        g.fillRect(1, 1, 500, 500);
        
        g.setColor(Color.red);
        g.fillOval(130, 150, 200, 170);
        
        g.setFont(new Font("Serif",Font.BOLD,30));
        //FontMetrics fm = g.getFontMetrics();
        String s = "" + counter;
        //Dimension d = getSize();
        //int x = d.width/2 - fm.stringWidth(s)/2;
        //int y = d.height/2;
        g.drawString(s,150,170);
        
        g.dispose();
    }
}
