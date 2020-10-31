
package program2;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class bill extends JFrame{
    JFrame f1;
    JButton bbb1;
    JTextPane tp1; 
bookstock bs;
    public bill(bookstock bs,String str,String copies){
        this.bs=bs;
        String s=str;
        String cpy=copies;
    f1=new JFrame("Billing");
    tp1=new JTextPane();
    tp1.setBounds(100, 80,300,153);
    tp1.setText("\n BILL \n\n TITLE\t\t"+bs.title+"\n AUTHOR\t\t"+bs.author+
          "\n PUBLISHER\t"+bs.publisher+"\n PRICE\t\t"+String.valueOf(bs.price)+
          "\n NO:COPIES\t\t"+cpy+"\n AMOUNT TO BE PAID\t"+str);
    bbb1=new JButton("Pay : $ "+str);
    bbb1.setBounds(200, 280, 110, 30);
    
    f1.add(tp1);
    f1.add(bbb1);
    
    f1.setSize(500,400);
    f1.setLayout(null);
    f1.setVisible(true);
    f1.getContentPane().setBackground(Color.green);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
